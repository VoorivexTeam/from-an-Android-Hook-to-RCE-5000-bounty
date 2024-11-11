package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextUtils;
import com.comviva.webaxn.utils.C0755x1;
import java.util.HashMap;

/* renamed from: com.comviva.webaxn.ui.j1 */
/* loaded from: classes.dex */
public class C0640j1 {

    /* renamed from: c */
    private static C0640j1 f3882c;

    /* renamed from: a */
    private HashMap<String, AnimationDrawable> f3883a;

    /* renamed from: b */
    private Context f3884b;

    private C0640j1(Context context) {
        this.f3884b = context;
    }

    /* renamed from: a */
    public static C0640j1 m4520a(Context context) {
        if (f3882c == null) {
            f3882c = new C0640j1(context);
        }
        return f3882c;
    }

    /* renamed from: a */
    public AnimationDrawable m4521a(String str) {
        HashMap<String, AnimationDrawable> hashMap = this.f3883a;
        if (hashMap == null || hashMap.size() <= 0) {
            return null;
        }
        return this.f3883a.get(str);
    }

    /* renamed from: a */
    public void m4522a() {
        HashMap<String, AnimationDrawable> hashMap = this.f3883a;
        if (hashMap != null && hashMap.size() > 0) {
            this.f3883a.clear();
            this.f3883a = null;
        }
        this.f3884b = null;
        if (f3882c != null) {
            f3882c = null;
        }
    }

    /* renamed from: a */
    public void m4523a(String str, String str2, String[] strArr) {
        String[] split = str.split(";");
        String str3 = null;
        String str4 = "false";
        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                str3 = split[i].trim();
            } else if (i == 1) {
                str4 = split[i].trim();
            }
        }
        try {
            int parseInt = !TextUtils.isEmpty(str3) ? Integer.parseInt(str3) : 0;
            if (parseInt == 0) {
                parseInt = 100;
            }
            if (this.f3883a == null) {
                this.f3883a = new HashMap<>();
            }
            AnimationDrawable animationDrawable = new AnimationDrawable();
            if (str4.equalsIgnoreCase("true")) {
                animationDrawable.setOneShot(false);
            } else {
                animationDrawable.setOneShot(true);
            }
            for (String str5 : strArr) {
                String trim = str5.trim();
                if (trim.indexOf(".") != -1) {
                    trim = trim.substring(0, trim.indexOf("."));
                }
                animationDrawable.addFrame(C0755x1.m6119a(this.f3884b, trim), parseInt);
            }
            this.f3883a.put(str2, animationDrawable);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public void m4524b(String str) {
        AnimationDrawable animationDrawable;
        HashMap<String, AnimationDrawable> hashMap = this.f3883a;
        if (hashMap == null || hashMap.size() <= 0 || (animationDrawable = this.f3883a.get(str)) == null || animationDrawable.isRunning()) {
            return;
        }
        animationDrawable.start();
    }

    /* renamed from: c */
    public void m4525c(String str) {
        AnimationDrawable animationDrawable;
        HashMap<String, AnimationDrawable> hashMap = this.f3883a;
        if (hashMap == null || hashMap.size() <= 0 || (animationDrawable = this.f3883a.get(str)) == null || !animationDrawable.isRunning()) {
            return;
        }
        animationDrawable.stop();
    }
}
