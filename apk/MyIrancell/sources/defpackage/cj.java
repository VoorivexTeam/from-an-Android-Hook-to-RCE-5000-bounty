package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public class cj {
    private String a;
    private String b;
    private String c;
    private int d = 0;
    private byte[] e;
    private bj f;

    public bj a() {
        return this.f;
    }

    public void a(int i) {
        this.d = i;
    }

    public void a(Context context, byte[] bArr) {
        aj a = aj.a(context);
        String str = this.a;
        if (bArr != null) {
            a.b(str, bArr, 6);
        } else {
            a.a(str, 6);
        }
        this.e = bArr;
    }

    public void a(bj bjVar) {
        this.f = bjVar;
    }

    public void a(String str) {
        this.c = str;
    }

    public boolean a(Context context, String str) {
        this.a = str;
        boolean a = aj.a(context).a(str, "startup_images", 6);
        if (!a) {
            return a;
        }
        byte[] d = aj.a(context).d(str, "startup_images");
        this.e = d;
        if (d == null) {
            return false;
        }
        return a;
    }

    public int b() {
        return this.d;
    }

    public void b(String str) {
        this.b = str;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public byte[] e() {
        return this.e;
    }

    public String f() {
        return this.a;
    }
}
