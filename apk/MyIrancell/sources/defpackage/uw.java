package defpackage;

import android.hardware.Camera;

/* loaded from: classes.dex */
public final class uw {
    private final int a;
    private final Camera b;
    private final tw c;
    private final int d;

    public uw(int i, Camera camera, tw twVar, int i2) {
        this.a = i;
        this.b = camera;
        this.c = twVar;
        this.d = i2;
    }

    public Camera a() {
        return this.b;
    }

    public tw b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public String toString() {
        return "Camera #" + this.a + " : " + this.c + ',' + this.d;
    }
}
