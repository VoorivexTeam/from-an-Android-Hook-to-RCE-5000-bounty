package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class y80 extends RuntimeException {
    private IOException b;
    private IOException c;

    public y80(IOException iOException) {
        super(iOException);
        this.b = iOException;
        this.c = iOException;
    }

    public IOException a() {
        return this.b;
    }

    public void a(IOException iOException) {
        o80.a((Throwable) this.b, (Throwable) iOException);
        this.c = iOException;
    }

    public IOException b() {
        return this.c;
    }
}
