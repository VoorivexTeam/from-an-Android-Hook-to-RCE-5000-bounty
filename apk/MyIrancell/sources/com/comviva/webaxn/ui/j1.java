package com.comviva.webaxn.ui;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextUtils;
import com.comviva.webaxn.utils.x1;
import java.util.HashMap;

/* loaded from: classes.dex */
public class j1 {
    private static j1 c;
    private HashMap<String, AnimationDrawable> a;
    private Context b;

    private j1(Context context) {
        this.b = context;
    }

    public static j1 a(Context context) {
        if (c == null) {
            c = new j1(context);
        }
        return c;
    }

    public AnimationDrawable a(String str) {
        HashMap<String, AnimationDrawable> hashMap = this.a;
        if (hashMap == null || hashMap.size() <= 0) {
            return null;
        }
        return this.a.get(str);
    }

    public void a() {
        HashMap<String, AnimationDrawable> hashMap = this.a;
        if (hashMap != null && hashMap.size() > 0) {
            this.a.clear();
            this.a = null;
        }
        this.b = null;
        if (c != null) {
            c = null;
        }
    }

    public void a(String str, String str2, String[] strArr) {
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
            if (this.a == null) {
                this.a = new HashMap<>();
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
                animationDrawable.addFrame(x1.a(this.b, trim), parseInt);
            }
            this.a.put(str2, animationDrawable);
        } catch (Exception unused) {
        }
    }

    public void b(String str) {
        AnimationDrawable animationDrawable;
        HashMap<String, AnimationDrawable> hashMap = this.a;
        if (hashMap == null || hashMap.size() <= 0 || (animationDrawable = this.a.get(str)) == null || animationDrawable.isRunning()) {
            return;
        }
        animationDrawable.start();
    }

    public void c(String str) {
        AnimationDrawable animationDrawable;
        HashMap<String, AnimationDrawable> hashMap = this.a;
        if (hashMap == null || hashMap.size() <= 0 || (animationDrawable = this.a.get(str)) == null || !animationDrawable.isRunning()) {
            return;
        }
        animationDrawable.stop();
    }
}
