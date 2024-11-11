package com.comviva.webaxn.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import defpackage.wj;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d0 {
    private static d0 d;
    private Context a;
    private wj b;
    private HashMap<String, String> c = null;

    private d0(Context context) {
        this.a = context;
    }

    public static d0 a(Context context) {
        if (d == null) {
            d = new d0(context);
        }
        return d;
    }

    public void a(String str, wj wjVar) {
        this.b = wjVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = this.c;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> f = x1.f(str);
        this.c = f;
        if (f.size() > 0) {
            String str2 = this.c.get("url");
            if (!TextUtils.isEmpty(str2)) {
                str2 = Uri.decode(str2);
            }
            String str3 = this.c.get("type");
            if (TextUtils.isEmpty(str3)) {
                str3.equals("audio");
                return;
            }
            if (str3.equals("video")) {
                if (TextUtils.isEmpty(str2)) {
                    Toast.makeText(this.a, "There is no url for Video streaming.", 0).show();
                } else {
                    p1.e(this.a, str2);
                    x1.q = this.b;
                }
            }
        }
    }
}
