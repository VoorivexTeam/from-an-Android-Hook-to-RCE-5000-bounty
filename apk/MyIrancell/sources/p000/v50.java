package p000;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public class v50 implements c60 {

    /* renamed from: a */
    private final u50 f13619a;

    /* renamed from: b */
    public File f13620b;

    /* renamed from: c */
    private RandomAccessFile f13621c;

    public v50(File file, u50 u50Var) {
        File file2;
        try {
            if (u50Var == null) {
                throw new NullPointerException();
            }
            this.f13619a = u50Var;
            x50.m16445a(file.getParentFile());
            boolean exists = file.exists();
            if (exists) {
                file2 = file;
            } else {
                file2 = new File(file.getParentFile(), file.getName() + ".download");
            }
            this.f13620b = file2;
            this.f13621c = new RandomAccessFile(this.f13620b, exists ? "r" : "rw");
        } catch (IOException e) {
            throw new v60("Error using file " + file + " as disc cache", e);
        }
    }

    /* renamed from: a */
    private boolean m15947a(File file) {
        return file.getName().endsWith(".download");
    }

    @Override // p000.c60
    /* renamed from: a */
    public synchronized int mo3598a(byte[] bArr, long j, int i) {
        try {
            this.f13621c.seek(j);
        } catch (IOException e) {
            throw new v60(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(mo3599a()), Integer.valueOf(bArr.length)), e);
        }
        return this.f13621c.read(bArr, 0, i);
    }

    @Override // p000.c60
    /* renamed from: a */
    public synchronized long mo3599a() {
        try {
        } catch (IOException e) {
            throw new v60("Error reading length of file " + this.f13620b, e);
        }
        return (int) this.f13621c.length();
    }

    @Override // p000.c60
    /* renamed from: a */
    public synchronized void mo3600a(byte[] bArr, int i) {
        try {
            if (mo3603d()) {
                throw new v60("Error append cache: cache file " + this.f13620b + " is completed!");
            }
            this.f13621c.seek(mo3599a());
            this.f13621c.write(bArr, 0, i);
        } catch (IOException e) {
            throw new v60(String.format("Error writing %d bytes to %s from buffer with size %d", Integer.valueOf(i), this.f13621c, Integer.valueOf(bArr.length)), e);
        }
    }

    @Override // p000.c60
    /* renamed from: b */
    public synchronized void mo3601b() {
        try {
            this.f13621c.close();
            this.f13619a.mo15722a(this.f13620b);
        } catch (IOException e) {
            throw new v60("Error closing file " + this.f13620b, e);
        }
    }

    @Override // p000.c60
    /* renamed from: c */
    public synchronized void mo3602c() {
        if (mo3603d()) {
            return;
        }
        mo3601b();
        File file = new File(this.f13620b.getParentFile(), this.f13620b.getName().substring(0, this.f13620b.getName().length() - 9));
        if (!file.exists() && !this.f13620b.renameTo(file)) {
            throw new v60("Error renaming file " + this.f13620b + " to " + file + " for completion!");
        }
        this.f13620b = file;
        try {
            this.f13621c = new RandomAccessFile(this.f13620b, "r");
            this.f13619a.mo15722a(this.f13620b);
        } catch (IOException e) {
            throw new v60("Error opening " + this.f13620b + " as disc cache", e);
        }
    }

    @Override // p000.c60
    /* renamed from: d */
    public synchronized boolean mo3603d() {
        return !m15947a(this.f13620b);
    }
}
