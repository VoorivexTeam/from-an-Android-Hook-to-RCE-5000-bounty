package p000;

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

/* renamed from: z3 */
/* loaded from: classes.dex */
final class C3510z3 implements Closeable {

    /* renamed from: b */
    private final File f14319b;

    /* renamed from: c */
    private final long f14320c;

    /* renamed from: d */
    private final File f14321d;

    /* renamed from: e */
    private final RandomAccessFile f14322e;

    /* renamed from: f */
    private final FileChannel f14323f;

    /* renamed from: g */
    private final FileLock f14324g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z3$a */
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
    /* renamed from: z3$b */
    /* loaded from: classes.dex */
    public static class b extends File {

        /* renamed from: b */
        public long f14326b;

        public b(File file, String str) {
            super(file, str);
            this.f14326b = -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3510z3(File file, File file2) {
        String str = "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")";
        this.f14319b = file;
        this.f14321d = file2;
        this.f14320c = m16726b(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f14322e = randomAccessFile;
        try {
            this.f14323f = randomAccessFile.getChannel();
            try {
                String str2 = "Blocking on lock " + file3.getPath();
                this.f14324g = this.f14323f.lock();
                String str3 = file3.getPath() + " locked";
            } catch (IOException e) {
                e = e;
                m16723a(this.f14323f);
                throw e;
            } catch (Error e2) {
                e = e2;
                m16723a(this.f14323f);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                m16723a(this.f14323f);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            m16723a(this.f14322e);
            throw e4;
        }
    }

    /* renamed from: a */
    private static long m16718a(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: a */
    private static SharedPreferences m16719a(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    /* renamed from: a */
    private List<b> m16720a(Context context, String str) {
        String str2 = this.f14319b.getName() + ".classes";
        SharedPreferences m16719a = m16719a(context);
        int i = m16719a.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + (-1));
        int i2 = 2;
        while (i2 <= i) {
            b bVar = new b(this.f14321d, str2 + i2 + ".zip");
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.f14326b = m16726b(bVar);
            long j = m16719a.getLong(str + "dex.crc." + i2, -1L);
            long j2 = m16719a.getLong(str + "dex.time." + i2, -1L);
            long lastModified = bVar.lastModified();
            if (j2 == lastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = m16719a;
                if (j == bVar.f14326b) {
                    arrayList.add(bVar);
                    i2++;
                    m16719a = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + bVar.f14326b);
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m16721a() {
        StringBuilder sb;
        String str;
        File[] listFiles = this.f14321d.listFiles(new a());
        if (listFiles == null) {
            String str2 = "Failed to list secondary dex dir content (" + this.f14321d.getPath() + ").";
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

    /* renamed from: a */
    private static void m16722a(Context context, String str, long j, long j2, List<b> list) {
        SharedPreferences.Editor edit = m16719a(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (b bVar : list) {
            edit.putLong(str + "dex.crc." + i, bVar.f14326b);
            edit.putLong(str + "dex.time." + i, bVar.lastModified());
            i++;
        }
        edit.commit();
    }

    /* renamed from: a */
    private static void m16723a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    private static void m16724a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
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
            m16723a(inputStream);
            createTempFile.delete();
        }
    }

    /* renamed from: a */
    private static boolean m16725a(Context context, File file, long j, String str) {
        SharedPreferences m16719a = m16719a(context);
        if (m16719a.getLong(str + "timestamp", -1L) == m16718a(file)) {
            if (m16719a.getLong(str + "crc", -1L) == j) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static long m16726b(File file) {
        long m46a = C0005a4.m46a(file);
        return m46a == -1 ? m46a - 1 : m46a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0139, code lost:
    
        throw new java.io.IOException("Could not create zip file " + r8.getAbsolutePath() + " for secondary dex (" + r5 + ")");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<p000.C3510z3.b> m16727c() {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3510z3.m16727c():java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<? extends File> m16728a(Context context, String str, boolean z) {
        List<b> list;
        String str2 = "MultiDexExtractor.load(" + this.f14319b.getPath() + ", " + z + ", " + str + ")";
        if (!this.f14324g.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z && !m16725a(context, this.f14319b, this.f14320c, str)) {
            try {
                list = m16720a(context, str);
            } catch (IOException unused) {
            }
            String str3 = "load found " + list.size() + " secondary dex files";
            return list;
        }
        List<b> m16727c = m16727c();
        m16722a(context, str, m16718a(this.f14319b), this.f14320c, m16727c);
        list = m16727c;
        String str32 = "load found " + list.size() + " secondary dex files";
        return list;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14324g.release();
        this.f14323f.close();
        this.f14322e.close();
    }
}
