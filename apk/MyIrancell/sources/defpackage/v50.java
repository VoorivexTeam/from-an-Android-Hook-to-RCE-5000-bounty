package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public class v50 implements c60 {
    private final u50 a;
    public File b;
    private RandomAccessFile c;

    public v50(File file, u50 u50Var) {
        File file2;
        try {
            if (u50Var == null) {
                throw new NullPointerException();
            }
            this.a = u50Var;
            x50.a(file.getParentFile());
            boolean exists = file.exists();
            if (exists) {
                file2 = file;
            } else {
                file2 = new File(file.getParentFile(), file.getName() + ".download");
            }
            this.b = file2;
            this.c = new RandomAccessFile(this.b, exists ? "r" : "rw");
        } catch (IOException e) {
            throw new v60("Error using file " + file + " as disc cache", e);
        }
    }

    private boolean a(File file) {
        return file.getName().endsWith(".download");
    }

    @Override // defpackage.c60
    public synchronized int a(byte[] bArr, long j, int i) {
        try {
            this.c.seek(j);
        } catch (IOException e) {
            throw new v60(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(a()), Integer.valueOf(bArr.length)), e);
        }
        return this.c.read(bArr, 0, i);
    }

    @Override // defpackage.c60
    public synchronized long a() {
        try {
        } catch (IOException e) {
            throw new v60("Error reading length of file " + this.b, e);
        }
        return (int) this.c.length();
    }

    @Override // defpackage.c60
    public synchronized void a(byte[] bArr, int i) {
        try {
            if (d()) {
                throw new v60("Error append cache: cache file " + this.b + " is completed!");
            }
            this.c.seek(a());
            this.c.write(bArr, 0, i);
        } catch (IOException e) {
            throw new v60(String.format("Error writing %d bytes to %s from buffer with size %d", Integer.valueOf(i), this.c, Integer.valueOf(bArr.length)), e);
        }
    }

    @Override // defpackage.c60
    public synchronized void b() {
        try {
            this.c.close();
            this.a.a(this.b);
        } catch (IOException e) {
            throw new v60("Error closing file " + this.b, e);
        }
    }

    @Override // defpackage.c60
    public synchronized void c() {
        if (d()) {
            return;
        }
        b();
        File file = new File(this.b.getParentFile(), this.b.getName().substring(0, this.b.getName().length() - 9));
        if (!file.exists() && !this.b.renameTo(file)) {
            throw new v60("Error renaming file " + this.b + " to " + file + " for completion!");
        }
        this.b = file;
        try {
            this.c = new RandomAccessFile(this.b, "r");
            this.a.a(this.b);
        } catch (IOException e) {
            throw new v60("Error opening " + this.b + " as disc cache", e);
        }
    }

    @Override // defpackage.c60
    public synchronized boolean d() {
        return !a(this.b);
    }
}
