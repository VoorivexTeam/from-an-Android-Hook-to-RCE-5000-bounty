package p000;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: z9 */
/* loaded from: classes.dex */
public final class C3518z9 implements Closeable {

    /* renamed from: b */
    private final File f14383b;

    /* renamed from: c */
    private final File f14384c;

    /* renamed from: d */
    private final File f14385d;

    /* renamed from: e */
    private final File f14386e;

    /* renamed from: f */
    private final int f14387f;

    /* renamed from: g */
    private long f14388g;

    /* renamed from: h */
    private final int f14389h;

    /* renamed from: j */
    private Writer f14391j;

    /* renamed from: l */
    private int f14393l;

    /* renamed from: i */
    private long f14390i = 0;

    /* renamed from: k */
    private final LinkedHashMap<String, d> f14392k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m */
    private long f14394m = 0;

    /* renamed from: n */
    final ThreadPoolExecutor f14395n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: o */
    private final Callable<Void> f14396o = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z9$a */
    /* loaded from: classes.dex */
    public class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            synchronized (C3518z9.this) {
                if (C3518z9.this.f14391j == null) {
                    return null;
                }
                C3518z9.this.m16874i();
                if (C3518z9.this.m16868d()) {
                    C3518z9.this.m16873h();
                    C3518z9.this.f14393l = 0;
                }
                return null;
            }
        }
    }

    /* renamed from: z9$b */
    /* loaded from: classes.dex */
    private static final class b implements ThreadFactory {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: z9$c */
    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a */
        private final d f14398a;

        /* renamed from: b */
        private final boolean[] f14399b;

        /* renamed from: c */
        private boolean f14400c;

        private c(d dVar) {
            this.f14398a = dVar;
            this.f14399b = dVar.f14406e ? null : new boolean[C3518z9.this.f14389h];
        }

        /* synthetic */ c(C3518z9 c3518z9, d dVar, a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public File m16881a(int i) {
            File m16898b;
            synchronized (C3518z9.this) {
                if (this.f14398a.f14407f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f14398a.f14406e) {
                    this.f14399b[i] = true;
                }
                m16898b = this.f14398a.m16898b(i);
                if (!C3518z9.this.f14383b.exists()) {
                    C3518z9.this.f14383b.mkdirs();
                }
            }
            return m16898b;
        }

        /* renamed from: a */
        public void m16882a() {
            C3518z9.this.m16861a(this, false);
        }

        /* renamed from: b */
        public void m16883b() {
            if (this.f14400c) {
                return;
            }
            try {
                m16882a();
            } catch (IOException unused) {
            }
        }

        /* renamed from: c */
        public void m16884c() {
            C3518z9.this.m16861a(this, true);
            this.f14400c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z9$d */
    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a */
        private final String f14402a;

        /* renamed from: b */
        private final long[] f14403b;

        /* renamed from: c */
        File[] f14404c;

        /* renamed from: d */
        File[] f14405d;

        /* renamed from: e */
        private boolean f14406e;

        /* renamed from: f */
        private c f14407f;

        /* renamed from: g */
        private long f14408g;

        private d(String str) {
            this.f14402a = str;
            this.f14403b = new long[C3518z9.this.f14389h];
            this.f14404c = new File[C3518z9.this.f14389h];
            this.f14405d = new File[C3518z9.this.f14389h];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C3518z9.this.f14389h; i++) {
                sb.append(i);
                this.f14404c[i] = new File(C3518z9.this.f14383b, sb.toString());
                sb.append(".tmp");
                this.f14405d[i] = new File(C3518z9.this.f14383b, sb.toString());
                sb.setLength(length);
            }
        }

        /* synthetic */ d(C3518z9 c3518z9, String str, a aVar) {
            this(str);
        }

        /* renamed from: a */
        private IOException m16886a(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m16892b(String[] strArr) {
            if (strArr.length != C3518z9.this.f14389h) {
                m16886a(strArr);
                throw null;
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f14403b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    m16886a(strArr);
                    throw null;
                }
            }
        }

        /* renamed from: a */
        public File m16896a(int i) {
            return this.f14404c[i];
        }

        /* renamed from: a */
        public String m16897a() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f14403b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public File m16898b(int i) {
            return this.f14405d[i];
        }
    }

    /* renamed from: z9$e */
    /* loaded from: classes.dex */
    public final class e {

        /* renamed from: a */
        private final File[] f14410a;

        private e(String str, long j, File[] fileArr, long[] jArr) {
            this.f14410a = fileArr;
        }

        /* synthetic */ e(C3518z9 c3518z9, String str, long j, File[] fileArr, long[] jArr, a aVar) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File m16899a(int i) {
            return this.f14410a[i];
        }
    }

    private C3518z9(File file, int i, int i2, long j) {
        this.f14383b = file;
        this.f14387f = i;
        this.f14384c = new File(file, "journal");
        this.f14385d = new File(file, "journal.tmp");
        this.f14386e = new File(file, "journal.bkp");
        this.f14389h = i2;
        this.f14388g = j;
    }

    /* renamed from: a */
    private synchronized c m16857a(String str, long j) {
        m16864c();
        d dVar = this.f14392k.get(str);
        a aVar = null;
        if (j != -1 && (dVar == null || dVar.f14408g != j)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f14392k.put(str, dVar);
        } else if (dVar.f14407f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f14407f = cVar;
        this.f14391j.append((CharSequence) "DIRTY");
        this.f14391j.append(' ');
        this.f14391j.append((CharSequence) str);
        this.f14391j.append('\n');
        this.f14391j.flush();
        return cVar;
    }

    /* renamed from: a */
    public static C3518z9 m16858a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m16860a(file2, file3, false);
            }
        }
        C3518z9 c3518z9 = new C3518z9(file, i, i2, j);
        if (c3518z9.f14384c.exists()) {
            try {
                c3518z9.m16871f();
                c3518z9.m16869e();
                return c3518z9;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                c3518z9.m16876a();
            }
        }
        file.mkdirs();
        C3518z9 c3518z92 = new C3518z9(file, i, i2, j);
        c3518z92.m16873h();
        return c3518z92;
    }

    /* renamed from: a */
    private static void m16859a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m16860a(File file, File file2, boolean z) {
        if (z) {
            m16859a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m16861a(c cVar, boolean z) {
        d dVar = cVar.f14398a;
        if (dVar.f14407f != cVar) {
            throw new IllegalStateException();
        }
        if (z && !dVar.f14406e) {
            for (int i = 0; i < this.f14389h; i++) {
                if (!cVar.f14399b[i]) {
                    cVar.m16882a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!dVar.m16898b(i).exists()) {
                    cVar.m16882a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f14389h; i2++) {
            File m16898b = dVar.m16898b(i2);
            if (!z) {
                m16859a(m16898b);
            } else if (m16898b.exists()) {
                File m16896a = dVar.m16896a(i2);
                m16898b.renameTo(m16896a);
                long j = dVar.f14403b[i2];
                long length = m16896a.length();
                dVar.f14403b[i2] = length;
                this.f14390i = (this.f14390i - j) + length;
            }
        }
        this.f14393l++;
        dVar.f14407f = null;
        if (dVar.f14406e || z) {
            dVar.f14406e = true;
            this.f14391j.append((CharSequence) "CLEAN");
            this.f14391j.append(' ');
            this.f14391j.append((CharSequence) dVar.f14402a);
            this.f14391j.append((CharSequence) dVar.m16897a());
            this.f14391j.append('\n');
            if (z) {
                long j2 = this.f14394m;
                this.f14394m = 1 + j2;
                dVar.f14408g = j2;
            }
        } else {
            this.f14392k.remove(dVar.f14402a);
            this.f14391j.append((CharSequence) "REMOVE");
            this.f14391j.append(' ');
            this.f14391j.append((CharSequence) dVar.f14402a);
            this.f14391j.append('\n');
        }
        this.f14391j.flush();
        if (this.f14390i > this.f14388g || m16868d()) {
            this.f14395n.submit(this.f14396o);
        }
    }

    /* renamed from: c */
    private void m16864c() {
        if (this.f14391j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: d */
    private void m16867d(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.f14392k.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        d dVar = this.f14392k.get(substring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, substring, aVar);
            this.f14392k.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar.f14406e = true;
            dVar.f14407f = null;
            dVar.m16892b(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f14407f = new c(this, dVar, aVar);
            return;
        }
        if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public boolean m16868d() {
        int i = this.f14393l;
        return i >= 2000 && i >= this.f14392k.size();
    }

    /* renamed from: e */
    private void m16869e() {
        m16859a(this.f14385d);
        Iterator<d> it = this.f14392k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.f14407f == null) {
                while (i < this.f14389h) {
                    this.f14390i += next.f14403b[i];
                    i++;
                }
            } else {
                next.f14407f = null;
                while (i < this.f14389h) {
                    m16859a(next.m16896a(i));
                    m16859a(next.m16898b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: f */
    private void m16871f() {
        C0013aa c0013aa = new C0013aa(new FileInputStream(this.f14384c), C0455ba.f2752a);
        try {
            String m123c = c0013aa.m123c();
            String m123c2 = c0013aa.m123c();
            String m123c3 = c0013aa.m123c();
            String m123c4 = c0013aa.m123c();
            String m123c5 = c0013aa.m123c();
            if (!"libcore.io.DiskLruCache".equals(m123c) || !"1".equals(m123c2) || !Integer.toString(this.f14387f).equals(m123c3) || !Integer.toString(this.f14389h).equals(m123c4) || !"".equals(m123c5)) {
                throw new IOException("unexpected journal header: [" + m123c + ", " + m123c2 + ", " + m123c4 + ", " + m123c5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m16867d(c0013aa.m123c());
                    i++;
                } catch (EOFException unused) {
                    this.f14393l = i - this.f14392k.size();
                    if (c0013aa.m122a()) {
                        m16873h();
                    } else {
                        this.f14391j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14384c, true), C0455ba.f2752a));
                    }
                    C0455ba.m3346a(c0013aa);
                    return;
                }
            }
        } catch (Throwable th) {
            C0455ba.m3346a(c0013aa);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public synchronized void m16873h() {
        if (this.f14391j != null) {
            this.f14391j.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14385d), C0455ba.f2752a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f14387f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f14389h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f14392k.values()) {
                bufferedWriter.write(dVar.f14407f != null ? "DIRTY " + dVar.f14402a + '\n' : "CLEAN " + dVar.f14402a + dVar.m16897a() + '\n');
            }
            bufferedWriter.close();
            if (this.f14384c.exists()) {
                m16860a(this.f14384c, this.f14386e, true);
            }
            m16860a(this.f14385d, this.f14384c, false);
            this.f14386e.delete();
            this.f14391j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14384c, true), C0455ba.f2752a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m16874i() {
        while (this.f14390i > this.f14388g) {
            m16878c(this.f14392k.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: a */
    public c m16875a(String str) {
        return m16857a(str, -1L);
    }

    /* renamed from: a */
    public void m16876a() {
        close();
        C0455ba.m3347a(this.f14383b);
    }

    /* renamed from: b */
    public synchronized e m16877b(String str) {
        m16864c();
        d dVar = this.f14392k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f14406e) {
            return null;
        }
        for (File file : dVar.f14404c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f14393l++;
        this.f14391j.append((CharSequence) "READ");
        this.f14391j.append(' ');
        this.f14391j.append((CharSequence) str);
        this.f14391j.append('\n');
        if (m16868d()) {
            this.f14395n.submit(this.f14396o);
        }
        return new e(this, str, dVar.f14408g, dVar.f14404c, dVar.f14403b, null);
    }

    /* renamed from: c */
    public synchronized boolean m16878c(String str) {
        m16864c();
        d dVar = this.f14392k.get(str);
        if (dVar != null && dVar.f14407f == null) {
            for (int i = 0; i < this.f14389h; i++) {
                File m16896a = dVar.m16896a(i);
                if (m16896a.exists() && !m16896a.delete()) {
                    throw new IOException("failed to delete " + m16896a);
                }
                this.f14390i -= dVar.f14403b[i];
                dVar.f14403b[i] = 0;
            }
            this.f14393l++;
            this.f14391j.append((CharSequence) "REMOVE");
            this.f14391j.append(' ');
            this.f14391j.append((CharSequence) str);
            this.f14391j.append('\n');
            this.f14392k.remove(str);
            if (m16868d()) {
                this.f14395n.submit(this.f14396o);
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f14391j == null) {
            return;
        }
        Iterator it = new ArrayList(this.f14392k.values()).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f14407f != null) {
                dVar.f14407f.m16882a();
            }
        }
        m16874i();
        this.f14391j.close();
        this.f14391j = null;
    }
}
