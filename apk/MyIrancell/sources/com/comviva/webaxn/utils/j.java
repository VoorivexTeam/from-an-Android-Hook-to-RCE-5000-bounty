package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import com.mtni.myirancell.R;
import defpackage.zi;

/* loaded from: classes.dex */
public class j {
    private int a;
    private int b;
    private float c;
    private int d;
    private int e;
    private String f;
    private String g;
    private int h;
    private boolean i;
    private Context j;

    public j(Context context) {
        this.i = false;
        this.j = context;
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        defaultDisplay.getOrientation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        this.a = displayMetrics.widthPixels;
        this.b = displayMetrics.heightPixels;
        this.c = displayMetrics.density;
        this.d = displayMetrics.densityDpi;
        this.h = 2048;
        String str = Build.MODEL;
        a(str == null ? "Android Device" : str);
        String str2 = Build.VERSION.RELEASE;
        b(str2 == null ? "Android 1.x/2.x" : str2);
        String Q = j1.a(this.j).Q();
        if (Q == null) {
            String str3 = zi.k;
            c(str3);
            j1.a(this.j).w(str3);
        } else {
            c(Q);
        }
        this.i = this.j.getResources().getBoolean(R.bool.isTablet);
    }

    public float a() {
        return this.c;
    }

    public void a(int i) {
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.g = null;
        } else {
            this.g = new String(str);
        }
    }

    public int b() {
        return this.b;
    }

    public void b(int i) {
        this.e = i;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new String(str);
    }

    public String c() {
        return this.g;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f = null;
        } else {
            this.f = new String(str);
        }
    }

    public int d() {
        return this.a;
    }

    public int e() {
        return this.b - this.e;
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.h;
    }

    public boolean h() {
        return this.i;
    }

    public String i() {
        return this.f;
    }

    public void j() {
        Display defaultDisplay = ((Activity) this.j).getWindowManager().getDefaultDisplay();
        defaultDisplay.getOrientation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        this.a = displayMetrics.widthPixels;
        this.b = displayMetrics.heightPixels;
        this.c = displayMetrics.density;
        this.d = displayMetrics.densityDpi;
        this.h = 2048;
        this.i = this.j.getResources().getBoolean(R.bool.isTablet);
    }
}
