package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import com.mtni.myirancell.R;
import p000.C3530zi;

/* renamed from: com.comviva.webaxn.utils.j */
/* loaded from: classes.dex */
public class C0711j {

    /* renamed from: a */
    private int f4861a;

    /* renamed from: b */
    private int f4862b;

    /* renamed from: c */
    private float f4863c;

    /* renamed from: d */
    private int f4864d;

    /* renamed from: e */
    private int f4865e;

    /* renamed from: f */
    private String f4866f;

    /* renamed from: g */
    private String f4867g;

    /* renamed from: h */
    private int f4868h;

    /* renamed from: i */
    private boolean f4869i;

    /* renamed from: j */
    private Context f4870j;

    public C0711j(Context context) {
        this.f4869i = false;
        this.f4870j = context;
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        defaultDisplay.getOrientation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        this.f4861a = displayMetrics.widthPixels;
        this.f4862b = displayMetrics.heightPixels;
        this.f4863c = displayMetrics.density;
        this.f4864d = displayMetrics.densityDpi;
        this.f4868h = 2048;
        String str = Build.MODEL;
        m5546a(str == null ? "Android Device" : str);
        String str2 = Build.VERSION.RELEASE;
        m5549b(str2 == null ? "Android 1.x/2.x" : str2);
        String m5612Q = C0713j1.m5563a(this.f4870j).m5612Q();
        if (m5612Q == null) {
            String str3 = C3530zi.f14468k;
            m5551c(str3);
            C0713j1.m5563a(this.f4870j).m5740w(str3);
        } else {
            m5551c(m5612Q);
        }
        this.f4869i = this.f4870j.getResources().getBoolean(R.bool.isTablet);
    }

    /* renamed from: a */
    public float m5544a() {
        return this.f4863c;
    }

    /* renamed from: a */
    public void m5545a(int i) {
    }

    /* renamed from: a */
    public void m5546a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f4867g = null;
        } else {
            this.f4867g = new String(str);
        }
    }

    /* renamed from: b */
    public int m5547b() {
        return this.f4862b;
    }

    /* renamed from: b */
    public void m5548b(int i) {
        this.f4865e = i;
    }

    /* renamed from: b */
    public void m5549b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new String(str);
    }

    /* renamed from: c */
    public String m5550c() {
        return this.f4867g;
    }

    /* renamed from: c */
    public void m5551c(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f4866f = null;
        } else {
            this.f4866f = new String(str);
        }
    }

    /* renamed from: d */
    public int m5552d() {
        return this.f4861a;
    }

    /* renamed from: e */
    public int m5553e() {
        return this.f4862b - this.f4865e;
    }

    /* renamed from: f */
    public int m5554f() {
        return this.f4864d;
    }

    /* renamed from: g */
    public int m5555g() {
        return this.f4868h;
    }

    /* renamed from: h */
    public boolean m5556h() {
        return this.f4869i;
    }

    /* renamed from: i */
    public String m5557i() {
        return this.f4866f;
    }

    /* renamed from: j */
    public void m5558j() {
        Display defaultDisplay = ((Activity) this.f4870j).getWindowManager().getDefaultDisplay();
        defaultDisplay.getOrientation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        this.f4861a = displayMetrics.widthPixels;
        this.f4862b = displayMetrics.heightPixels;
        this.f4863c = displayMetrics.density;
        this.f4864d = displayMetrics.densityDpi;
        this.f4868h = 2048;
        this.f4869i = this.f4870j.getResources().getBoolean(R.bool.isTablet);
    }
}
