package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.comviva.webaxn.utils.v;
import com.comviva.webaxn.utils.x1;

/* loaded from: classes.dex */
public class qj {
    Context a;
    private String d;
    private Typeface k = null;
    private String b = null;
    private String c = null;
    private float g = -1.0f;
    private float h = 0.0f;
    private int i = 0;
    private int l = 0;
    private int j = 0;
    private boolean e = false;
    private boolean m = false;
    private boolean f = false;

    public qj(Context context, float f) {
        this.a = context;
    }

    public String a() {
        return this.d;
    }

    public void a(float f) {
        this.h = f;
    }

    public void a(int i) {
        this.m = true;
        this.l = i;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.d = "B";
        } else {
            this.d = new String(str);
        }
    }

    public int b() {
        return this.l;
    }

    public void b(float f) {
    }

    public void b(int i) {
        this.e = true;
        this.i = i;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.k = v.a(str);
        } catch (Exception unused) {
        }
    }

    public int c() {
        return this.i;
    }

    public void c(int i) {
        this.f = true;
        this.g = i;
    }

    public void c(String str) {
        this.b = str;
    }

    public float d() {
        return this.h;
    }

    public void d(int i) {
        this.j = i;
    }

    public void d(String str) {
        this.c = str;
    }

    public float e() {
        return x1.a(this.a, this.g);
    }

    public int f() {
        return this.j;
    }

    public Typeface g() {
        return this.k;
    }

    public boolean h() {
        return this.m;
    }

    public boolean i() {
        return this.e;
    }

    public boolean j() {
        return this.f;
    }

    public String k() {
        return this.b;
    }

    public String l() {
        return this.c;
    }
}
