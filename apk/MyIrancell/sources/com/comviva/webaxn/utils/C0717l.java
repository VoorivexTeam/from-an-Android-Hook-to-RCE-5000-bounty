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

/* renamed from: com.comviva.webaxn.utils.l */
/* loaded from: classes.dex */
public final class C0717l implements Closeable {

    /* renamed from: b */
    private final File f4906b;

    /* renamed from: c */
    private final File f4907c;

    /* renamed from: d */
    private final File f4908d;

    /* renamed from: e */
    private final int f4909e;

    /* renamed from: f */
    private final long f4910f;

    /* renamed from: g */
    private final int f4911g;

    /* renamed from: i */
    private Writer f4913i;

    /* renamed from: k */
    private int f4915k;

    /* renamed from: h */
    private long f4912h = 0;

    /* renamed from: j */
    private final LinkedHashMap<String, c> f4914j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l */
    private long f4916l = 0;

    /* renamed from: m */
    private final ExecutorService f4917m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: n */
    private final Callable<Void> f4918n = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.l$a */
    /* loaded from: classes.dex */
    public class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            synchronized (C0717l.this) {
                if (C0717l.this.f4913i == null) {
                    return null;
                }
                C0717l.this.m5822j();
                if (C0717l.this.m5817e()) {
                    C0717l.this.m5821i();
                    C0717l.this.f4915k = 0;
                }
                return null;
            }
        }
    }

    /* renamed from: com.comviva.webaxn.utils.l$b */
    /* loaded from: classes.dex */
    public final class b {

        /* renamed from: a */
        private final c f4920a;

        /* renamed from: b */
        private boolean f4921b;

        /* renamed from: com.comviva.webaxn.utils.l$b$a */
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
                    b.this.f4921b = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    b.this.f4921b = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    b.this.f4921b = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    b.this.f4921b = true;
                }
            }
        }

        private b(c cVar) {
            this.f4920a = cVar;
        }

        /* synthetic */ b(C0717l c0717l, c cVar, a aVar) {
            this(cVar);
        }

        /* renamed from: a */
        public OutputStream m5830a(int i) {
            a aVar;
            synchronized (C0717l.this) {
                if (this.f4920a.f4927d != this) {
                    throw new IllegalStateException();
                }
                aVar = new a(this, new FileOutputStream(this.f4920a.m5846b(i)), null);
            }
            return aVar;
        }

        /* renamed from: a */
        public void m5831a() {
            C0717l.this.m5804a(this, false);
        }

        /* renamed from: b */
        public void m5832b() {
            if (!this.f4921b) {
                C0717l.this.m5804a(this, true);
            } else {
                C0717l.this.m5804a(this, false);
                C0717l.this.m5827c(this.f4920a.f4924a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.comviva.webaxn.utils.l$c */
    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a */
        private final String f4924a;

        /* renamed from: b */
        private final long[] f4925b;

        /* renamed from: c */
        private boolean f4926c;

        /* renamed from: d */
        private b f4927d;

        /* renamed from: e */
        private long f4928e;

        private c(String str) {
            this.f4924a = str;
            this.f4925b = new long[C0717l.this.f4911g];
        }

        /* synthetic */ c(C0717l c0717l, String str, a aVar) {
            this(str);
        }

        /* renamed from: a */
        private IOException m5835a(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m5840b(String[] strArr) {
            if (strArr.length != C0717l.this.f4911g) {
                m5835a(strArr);
                throw null;
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f4925b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    m5835a(strArr);
                    throw null;
                }
            }
        }

        /* renamed from: a */
        public File m5844a(int i) {
            return new File(C0717l.this.f4906b, this.f4924a + "." + i);
        }

        /* renamed from: a */
        public String m5845a() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f4925b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public File m5846b(int i) {
            return new File(C0717l.this.f4906b, this.f4924a + "." + i + ".tmp");
        }
    }

    /* renamed from: com.comviva.webaxn.utils.l$d */
    /* loaded from: classes.dex */
    public final class d implements Closeable {

        /* renamed from: b */
        private final InputStream[] f4930b;

        private d(String str, long j, InputStream[] inputStreamArr) {
            this.f4930b = inputStreamArr;
        }

        /* synthetic */ d(C0717l c0717l, String str, long j, InputStream[] inputStreamArr, a aVar) {
            this(str, j, inputStreamArr);
        }

        /* renamed from: a */
        public InputStream m5847a(int i) {
            return this.f4930b[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f4930b) {
                C0717l.m5806a((Closeable) inputStream);
            }
        }
    }

    static {
        Charset.forName("UTF-8");
    }

    private C0717l(File file, int i, int i2, long j) {
        this.f4906b = file;
        this.f4909e = i;
        this.f4907c = new File(file, "journal");
        this.f4908d = new File(file, "journal.tmp");
        this.f4911g = i2;
        this.f4910f = j;
    }

    /* renamed from: a */
    private synchronized b m5800a(String str, long j) {
        m5813d();
        m5816e(str);
        c cVar = this.f4914j.get(str);
        a aVar = null;
        if (j != -1 && (cVar == null || cVar.f4928e != j)) {
            return null;
        }
        if (cVar == null) {
            cVar = new c(this, str, aVar);
            this.f4914j.put(str, cVar);
        } else if (cVar.f4927d != null) {
            return null;
        }
        b bVar = new b(this, cVar, aVar);
        cVar.f4927d = bVar;
        this.f4913i.write("DIRTY " + str + '\n');
        this.f4913i.flush();
        return bVar;
    }

    /* renamed from: a */
    public static C0717l m5801a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        C0717l c0717l = new C0717l(file, i, i2, j);
        if (c0717l.f4907c.exists()) {
            try {
                c0717l.m5820h();
                c0717l.m5818f();
                c0717l.f4913i = new BufferedWriter(new FileWriter(c0717l.f4907c, true), 8192);
                return c0717l;
            } catch (IOException unused) {
                c0717l.m5824a();
            }
        }
        file.mkdirs();
        C0717l c0717l2 = new C0717l(file, i, i2, j);
        c0717l2.m5821i();
        return c0717l2;
    }

    /* renamed from: a */
    public static String m5803a(InputStream inputStream) {
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
    /* renamed from: a */
    public synchronized void m5804a(b bVar, boolean z) {
        c cVar = bVar.f4920a;
        if (cVar.f4927d != bVar) {
            throw new IllegalStateException();
        }
        if (z && !cVar.f4926c) {
            for (int i = 0; i < this.f4911g; i++) {
                if (!cVar.m5846b(i).exists()) {
                    bVar.m5831a();
                    throw new IllegalStateException("edit didn't create file " + i);
                }
            }
        }
        for (int i2 = 0; i2 < this.f4911g; i2++) {
            File m5846b = cVar.m5846b(i2);
            if (!z) {
                m5810b(m5846b);
            } else if (m5846b.exists()) {
                File m5844a = cVar.m5844a(i2);
                m5846b.renameTo(m5844a);
                long j = cVar.f4925b[i2];
                long length = m5844a.length();
                cVar.f4925b[i2] = length;
                this.f4912h = (this.f4912h - j) + length;
            }
        }
        this.f4915k++;
        cVar.f4927d = null;
        if (cVar.f4926c || z) {
            cVar.f4926c = true;
            this.f4913i.write("CLEAN " + cVar.f4924a + cVar.m5845a() + '\n');
            if (z) {
                long j2 = this.f4916l;
                this.f4916l = 1 + j2;
                cVar.f4928e = j2;
            }
        } else {
            this.f4914j.remove(cVar.f4924a);
            this.f4913i.write("REMOVE " + cVar.f4924a + '\n');
        }
        if (this.f4912h > this.f4910f || m5817e()) {
            this.f4917m.submit(this.f4918n);
        }
    }

    /* renamed from: a */
    public static void m5806a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m5807a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IllegalArgumentException("not a directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                m5807a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }

    /* renamed from: a */
    private static <T> T[] m5808a(T[] tArr, int i, int i2) {
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

    /* renamed from: b */
    private static void m5810b(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: d */
    private void m5813d() {
        if (this.f4913i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: d */
    private void m5814d(String str) {
        String[] split = str.split(" ");
        if (split.length < 2) {
            throw new IOException("unexpected journal line: " + str);
        }
        String str2 = split[1];
        if (split[0].equals("REMOVE") && split.length == 2) {
            this.f4914j.remove(str2);
            return;
        }
        c cVar = this.f4914j.get(str2);
        a aVar = null;
        if (cVar == null) {
            cVar = new c(this, str2, aVar);
            this.f4914j.put(str2, cVar);
        }
        if (split[0].equals("CLEAN") && split.length == this.f4911g + 2) {
            cVar.f4926c = true;
            cVar.f4927d = null;
            cVar.m5840b((String[]) m5808a(split, 2, split.length));
        } else if (split[0].equals("DIRTY") && split.length == 2) {
            cVar.f4927d = new b(this, cVar, aVar);
        } else {
            if (split[0].equals("READ") && split.length == 2) {
                return;
            }
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: e */
    private void m5816e(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException("keys must not contain spaces or newlines: \"" + str + "\"");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public boolean m5817e() {
        int i = this.f4915k;
        return i >= 2000 && i >= this.f4914j.size();
    }

    /* renamed from: f */
    private void m5818f() {
        m5810b(this.f4908d);
        Iterator<c> it = this.f4914j.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            int i = 0;
            if (next.f4927d == null) {
                while (i < this.f4911g) {
                    this.f4912h += next.f4925b[i];
                    i++;
                }
            } else {
                next.f4927d = null;
                while (i < this.f4911g) {
                    m5810b(next.m5844a(i));
                    m5810b(next.m5846b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: h */
    private void m5820h() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f4907c), 8192);
        try {
            String m5803a = m5803a((InputStream) bufferedInputStream);
            String m5803a2 = m5803a((InputStream) bufferedInputStream);
            String m5803a3 = m5803a((InputStream) bufferedInputStream);
            String m5803a4 = m5803a((InputStream) bufferedInputStream);
            String m5803a5 = m5803a((InputStream) bufferedInputStream);
            if (!"libcore.io.DiskLruCache".equals(m5803a) || !"1".equals(m5803a2) || !Integer.toString(this.f4909e).equals(m5803a3) || !Integer.toString(this.f4911g).equals(m5803a4) || !"".equals(m5803a5)) {
                throw new IOException("unexpected journal header: [" + m5803a + ", " + m5803a2 + ", " + m5803a4 + ", " + m5803a5 + "]");
            }
            while (true) {
                try {
                    m5814d(m5803a((InputStream) bufferedInputStream));
                } catch (EOFException unused) {
                    return;
                }
            }
        } finally {
            m5806a((Closeable) bufferedInputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public synchronized void m5821i() {
        if (this.f4913i != null) {
            this.f4913i.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f4908d), 8192);
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f4909e));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f4911g));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (c cVar : this.f4914j.values()) {
            bufferedWriter.write(cVar.f4927d != null ? "DIRTY " + cVar.f4924a + '\n' : "CLEAN " + cVar.f4924a + cVar.m5845a() + '\n');
        }
        bufferedWriter.close();
        this.f4908d.renameTo(this.f4907c);
        this.f4913i = new BufferedWriter(new FileWriter(this.f4907c, true), 8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m5822j() {
        while (this.f4912h > this.f4910f) {
            m5827c(this.f4914j.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: a */
    public b m5823a(String str) {
        return m5800a(str, -1L);
    }

    /* renamed from: a */
    public void m5824a() {
        close();
        m5807a(this.f4906b);
    }

    /* renamed from: b */
    public synchronized d m5825b(String str) {
        m5813d();
        m5816e(str);
        c cVar = this.f4914j.get(str);
        if (cVar == null) {
            return null;
        }
        if (!cVar.f4926c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f4911g];
        for (int i = 0; i < this.f4911g; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(cVar.m5844a(i));
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        this.f4915k++;
        this.f4913i.append((CharSequence) ("READ " + str + '\n'));
        if (m5817e()) {
            this.f4917m.submit(this.f4918n);
        }
        return new d(this, str, cVar.f4928e, inputStreamArr, null);
    }

    /* renamed from: c */
    public boolean m5826c() {
        return this.f4913i == null;
    }

    /* renamed from: c */
    public synchronized boolean m5827c(String str) {
        m5813d();
        m5816e(str);
        c cVar = this.f4914j.get(str);
        if (cVar != null && cVar.f4927d == null) {
            for (int i = 0; i < this.f4911g; i++) {
                File m5844a = cVar.m5844a(i);
                if (!m5844a.delete()) {
                    throw new IOException("failed to delete " + m5844a);
                }
                this.f4912h -= cVar.f4925b[i];
                cVar.f4925b[i] = 0;
            }
            this.f4915k++;
            this.f4913i.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f4914j.remove(str);
            if (m5817e()) {
                this.f4917m.submit(this.f4918n);
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f4913i == null) {
            return;
        }
        Iterator it = new ArrayList(this.f4914j.values()).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f4927d != null) {
                cVar.f4927d.m5831a();
            }
        }
        m5822j();
        this.f4913i.close();
        this.f4913i = null;
    }
}
