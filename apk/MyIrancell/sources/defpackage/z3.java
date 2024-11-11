package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* loaded from: classes.dex */
final class z3 implements Closeable {
    private final File b;
    private final long c;
    private final File d;
    private final RandomAccessFile e;
    private final FileChannel f;
    private final FileLock g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends File {
        public long b;

        public b(File file, String str) {
            super(file, str);
            this.b = -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z3(File file, File file2) {
        String str = "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")";
        this.b = file;
        this.d = file2;
        this.c = b(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.e = randomAccessFile;
        try {
            this.f = randomAccessFile.getChannel();
            try {
                String str2 = "Blocking on lock " + file3.getPath();
                this.g = this.f.lock();
                String str3 = file3.getPath() + " locked";
            } catch (IOException e) {
                e = e;
                a(this.f);
                throw e;
            } catch (Error e2) {
                e = e2;
                a(this.f);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                a(this.f);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            a(this.e);
            throw e4;
        }
    }

    private static long a(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private List<b> a(Context context, String str) {
        String str2 = this.b.getName() + ".classes";
        SharedPreferences a2 = a(context);
        int i = a2.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + (-1));
        int i2 = 2;
        while (i2 <= i) {
            b bVar = new b(this.d, str2 + i2 + ".zip");
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.b = b(bVar);
            long j = a2.getLong(str + "dex.crc." + i2, -1L);
            long j2 = a2.getLong(str + "dex.time." + i2, -1L);
            long lastModified = bVar.lastModified();
            if (j2 == lastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = a2;
                if (j == bVar.b) {
                    arrayList.add(bVar);
                    i2++;
                    a2 = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + bVar.b);
        }
        return arrayList;
    }

    private void a() {
        StringBuilder sb;
        String str;
        File[] listFiles = this.d.listFiles(new a());
        if (listFiles == null) {
            String str2 = "Failed to list secondary dex dir content (" + this.d.getPath() + ").";
            return;
        }
        for (File file : listFiles) {
            String str3 = "Trying to delete old file " + file.getPath() + " of size " + file.length();
            if (file.delete()) {
                sb = new StringBuilder();
                str = "Deleted old file ";
            } else {
                sb = new StringBuilder();
                str = "Failed to delete old file ";
            }
            sb.append(str);
            sb.append(file.getPath());
            sb.toString();
        }
    }

    private static void a(Context context, String str, long j, long j2, List<b> list) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (b bVar : list) {
            edit.putLong(str + "dex.crc." + i, bVar.b);
            edit.putLong(str + "dex.time." + i, bVar.lastModified());
            i++;
        }
        edit.commit();
    }

    private static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private static void a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        String str2 = "Extracting " + createTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        zipOutputStream.write(bArr, 0, read);
                    }
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!createTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                String str3 = "Renaming to " + file.getPath();
                if (createTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            a(inputStream);
            createTempFile.delete();
        }
    }

    private static boolean a(Context context, File file, long j, String str) {
        SharedPreferences a2 = a(context);
        if (a2.getLong(str + "timestamp", -1L) == a(file)) {
            if (a2.getLong(str + "crc", -1L) == j) {
                return false;
            }
        }
        return true;
    }

    private static long b(File file) {
        long a2 = a4.a(file);
        return a2 == -1 ? a2 - 1 : a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0139, code lost:
    
        throw new java.io.IOException("Could not create zip file " + r8.getAbsolutePath() + " for secondary dex (" + r5 + ")");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<z3.b> c() {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3.c():java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<? extends File> a(Context context, String str, boolean z) {
        List<b> list;
        String str2 = "MultiDexExtractor.load(" + this.b.getPath() + ", " + z + ", " + str + ")";
        if (!this.g.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z && !a(context, this.b, this.c, str)) {
            try {
                list = a(context, str);
            } catch (IOException unused) {
            }
            String str3 = "load found " + list.size() + " secondary dex files";
            return list;
        }
        List<b> c = c();
        a(context, str, a(this.b), this.c, c);
        list = c;
        String str32 = "load found " + list.size() + " secondary dex files";
        return list;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.g.release();
        this.f.close();
        this.e.close();
    }
}
