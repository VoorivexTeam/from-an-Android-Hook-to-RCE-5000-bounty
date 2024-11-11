package com.comviva.webaxn.utils;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l implements Closeable {
    private final File b;
    private final File c;
    private final File d;
    private final int e;
    private final long f;
    private final int g;
    private Writer i;
    private int k;
    private long h = 0;
    private final LinkedHashMap<String, c> j = new LinkedHashMap<>(0, 0.75f, true);
    private long l = 0;
    private final ExecutorService m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable<Void> n = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            synchronized (l.this) {
                if (l.this.i == null) {
                    return null;
                }
                l.this.j();
                if (l.this.e()) {
                    l.this.i();
                    l.this.k = 0;
                }
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class b {
        private final c a;
        private boolean b;

        /* loaded from: classes.dex */
        private class a extends FilterOutputStream {
            private a(OutputStream outputStream) {
                super(outputStream);
            }

            /* synthetic */ a(b bVar, OutputStream outputStream, a aVar) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    b.this.b = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    b.this.b = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    b.this.b = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    b.this.b = true;
                }
            }
        }

        private b(c cVar) {
            this.a = cVar;
        }

        /* synthetic */ b(l lVar, c cVar, a aVar) {
            this(cVar);
        }

        public OutputStream a(int i) {
            a aVar;
            synchronized (l.this) {
                if (this.a.d != this) {
                    throw new IllegalStateException();
                }
                aVar = new a(this, new FileOutputStream(this.a.b(i)), null);
            }
            return aVar;
        }

        public void a() {
            l.this.a(this, false);
        }

        public void b() {
            if (!this.b) {
                l.this.a(this, true);
            } else {
                l.this.a(this, false);
                l.this.c(this.a.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c {
        private final String a;
        private final long[] b;
        private boolean c;
        private b d;
        private long e;

        private c(String str) {
            this.a = str;
            this.b = new long[l.this.g];
        }

        /* synthetic */ c(l lVar, String str, a aVar) {
            this(str);
        }

        private IOException a(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String[] strArr) {
            if (strArr.length != l.this.g) {
                a(strArr);
                throw null;
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    a(strArr);
                    throw null;
                }
            }
        }

        public File a(int i) {
            return new File(l.this.b, this.a + "." + i);
        }

        public String a() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public File b(int i) {
            return new File(l.this.b, this.a + "." + i + ".tmp");
        }
    }

    /* loaded from: classes.dex */
    public final class d implements Closeable {
        private final InputStream[] b;

        private d(String str, long j, InputStream[] inputStreamArr) {
            this.b = inputStreamArr;
        }

        /* synthetic */ d(l lVar, String str, long j, InputStream[] inputStreamArr, a aVar) {
            this(str, j, inputStreamArr);
        }

        public InputStream a(int i) {
            return this.b[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.b) {
                l.a((Closeable) inputStream);
            }
        }
    }

    static {
        Charset.forName("UTF-8");
    }

    private l(File file, int i, int i2, long j) {
        this.b = file;
        this.e = i;
        this.c = new File(file, "journal");
        this.d = new File(file, "journal.tmp");
        this.g = i2;
        this.f = j;
    }

    private synchronized b a(String str, long j) {
        d();
        e(str);
        c cVar = this.j.get(str);
        a aVar = null;
        if (j != -1 && (cVar == null || cVar.e != j)) {
            return null;
        }
        if (cVar == null) {
            cVar = new c(this, str, aVar);
            this.j.put(str, cVar);
        } else if (cVar.d != null) {
            return null;
        }
        b bVar = new b(this, cVar, aVar);
        cVar.d = bVar;
        this.i.write("DIRTY " + str + '\n');
        this.i.flush();
        return bVar;
    }

    public static l a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        l lVar = new l(file, i, i2, j);
        if (lVar.c.exists()) {
            try {
                lVar.h();
                lVar.f();
                lVar.i = new BufferedWriter(new FileWriter(lVar.c, true), 8192);
                return lVar;
            } catch (IOException unused) {
                lVar.a();
            }
        }
        file.mkdirs();
        l lVar2 = new l(file, i, i2, j);
        lVar2.i();
        return lVar2;
    }

    public static String a(InputStream inputStream) {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            }
            if (read == 10) {
                int length = sb.length();
                if (length > 0) {
                    int i = length - 1;
                    if (sb.charAt(i) == '\r') {
                        sb.setLength(i);
                    }
                }
                return sb.toString();
            }
            sb.append((char) read);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(b bVar, boolean z) {
        c cVar = bVar.a;
        if (cVar.d != bVar) {
            throw new IllegalStateException();
        }
        if (z && !cVar.c) {
            for (int i = 0; i < this.g; i++) {
                if (!cVar.b(i).exists()) {
                    bVar.a();
                    throw new IllegalStateException("edit didn't create file " + i);
                }
            }
        }
        for (int i2 = 0; i2 < this.g; i2++) {
            File b2 = cVar.b(i2);
            if (!z) {
                b(b2);
            } else if (b2.exists()) {
                File a2 = cVar.a(i2);
                b2.renameTo(a2);
                long j = cVar.b[i2];
                long length = a2.length();
                cVar.b[i2] = length;
                this.h = (this.h - j) + length;
            }
        }
        this.k++;
        cVar.d = null;
        if (cVar.c || z) {
            cVar.c = true;
            this.i.write("CLEAN " + cVar.a + cVar.a() + '\n');
            if (z) {
                long j2 = this.l;
                this.l = 1 + j2;
                cVar.e = j2;
            }
        } else {
            this.j.remove(cVar.a);
            this.i.write("REMOVE " + cVar.a + '\n');
        }
        if (this.h > this.f || e()) {
            this.m.submit(this.n);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IllegalArgumentException("not a directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }

    private static <T> T[] a(T[] tArr, int i, int i2) {
        int length = tArr.length;
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int min = Math.min(i3, length - i);
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i3));
        System.arraycopy(tArr, i, tArr2, 0, min);
        return tArr2;
    }

    private static void b(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private void d() {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void d(String str) {
        String[] split = str.split(" ");
        if (split.length < 2) {
            throw new IOException("unexpected journal line: " + str);
        }
        String str2 = split[1];
        if (split[0].equals("REMOVE") && split.length == 2) {
            this.j.remove(str2);
            return;
        }
        c cVar = this.j.get(str2);
        a aVar = null;
        if (cVar == null) {
            cVar = new c(this, str2, aVar);
            this.j.put(str2, cVar);
        }
        if (split[0].equals("CLEAN") && split.length == this.g + 2) {
            cVar.c = true;
            cVar.d = null;
            cVar.b((String[]) a(split, 2, split.length));
        } else if (split[0].equals("DIRTY") && split.length == 2) {
            cVar.d = new b(this, cVar, aVar);
        } else {
            if (split[0].equals("READ") && split.length == 2) {
                return;
            }
            throw new IOException("unexpected journal line: " + str);
        }
    }

    private void e(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException("keys must not contain spaces or newlines: \"" + str + "\"");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    private void f() {
        b(this.d);
        Iterator<c> it = this.j.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            int i = 0;
            if (next.d == null) {
                while (i < this.g) {
                    this.h += next.b[i];
                    i++;
                }
            } else {
                next.d = null;
                while (i < this.g) {
                    b(next.a(i));
                    b(next.b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private void h() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.c), 8192);
        try {
            String a2 = a((InputStream) bufferedInputStream);
            String a3 = a((InputStream) bufferedInputStream);
            String a4 = a((InputStream) bufferedInputStream);
            String a5 = a((InputStream) bufferedInputStream);
            String a6 = a((InputStream) bufferedInputStream);
            if (!"libcore.io.DiskLruCache".equals(a2) || !"1".equals(a3) || !Integer.toString(this.e).equals(a4) || !Integer.toString(this.g).equals(a5) || !"".equals(a6)) {
                throw new IOException("unexpected journal header: [" + a2 + ", " + a3 + ", " + a5 + ", " + a6 + "]");
            }
            while (true) {
                try {
                    d(a((InputStream) bufferedInputStream));
                } catch (EOFException unused) {
                    return;
                }
            }
        } finally {
            a((Closeable) bufferedInputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        if (this.i != null) {
            this.i.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.d), 8192);
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.e));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.g));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (c cVar : this.j.values()) {
            bufferedWriter.write(cVar.d != null ? "DIRTY " + cVar.a + '\n' : "CLEAN " + cVar.a + cVar.a() + '\n');
        }
        bufferedWriter.close();
        this.d.renameTo(this.c);
        this.i = new BufferedWriter(new FileWriter(this.c, true), 8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        while (this.h > this.f) {
            c(this.j.entrySet().iterator().next().getKey());
        }
    }

    public b a(String str) {
        return a(str, -1L);
    }

    public void a() {
        close();
        a(this.b);
    }

    public synchronized d b(String str) {
        d();
        e(str);
        c cVar = this.j.get(str);
        if (cVar == null) {
            return null;
        }
        if (!cVar.c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.g];
        for (int i = 0; i < this.g; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(cVar.a(i));
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        this.k++;
        this.i.append((CharSequence) ("READ " + str + '\n'));
        if (e()) {
            this.m.submit(this.n);
        }
        return new d(this, str, cVar.e, inputStreamArr, null);
    }

    public boolean c() {
        return this.i == null;
    }

    public synchronized boolean c(String str) {
        d();
        e(str);
        c cVar = this.j.get(str);
        if (cVar != null && cVar.d == null) {
            for (int i = 0; i < this.g; i++) {
                File a2 = cVar.a(i);
                if (!a2.delete()) {
                    throw new IOException("failed to delete " + a2);
                }
                this.h -= cVar.b[i];
                cVar.b[i] = 0;
            }
            this.k++;
            this.i.append((CharSequence) ("REMOVE " + str + '\n'));
            this.j.remove(str);
            if (e()) {
                this.m.submit(this.n);
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.i == null) {
            return;
        }
        Iterator it = new ArrayList(this.j.values()).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.d != null) {
                cVar.d.a();
            }
        }
        j();
        this.i.close();
        this.i = null;
    }
}
