package com.comviva.webaxn.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import java.util.HashMap;
import p000.C3400wj;

/* renamed from: com.comviva.webaxn.utils.d0 */
/* loaded from: classes.dex */
public class C0694d0 {

    /* renamed from: d */
    private static C0694d0 f4705d;

    /* renamed from: a */
    private Context f4706a;

    /* renamed from: b */
    private C3400wj f4707b;

    /* renamed from: c */
    private HashMap<String, String> f4708c = null;

    private C0694d0(Context context) {
        this.f4706a = context;
    }

    /* renamed from: a */
    public static C0694d0 m5407a(Context context) {
        if (f4705d == null) {
            f4705d = new C0694d0(context);
        }
        return f4705d;
    }

    /* renamed from: a */
    public void m5408a(String str, C3400wj c3400wj) {
        this.f4707b = c3400wj;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = this.f4708c;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> m6188f = C0755x1.m6188f(str);
        this.f4708c = m6188f;
        if (m6188f.size() > 0) {
            String str2 = this.f4708c.get("url");
            if (!TextUtils.isEmpty(str2)) {
                str2 = Uri.decode(str2);
            }
            String str3 = this.f4708c.get("type");
            if (TextUtils.isEmpty(str3)) {
                str3.equals("audio");
                return;
            }
            if (str3.equals("video")) {
                if (TextUtils.isEmpty(str2)) {
                    Toast.makeText(this.f4706a, "There is no url for Video streaming.", 0).show();
                } else {
                    C0731p1.m5971e(this.f4706a, str2);
                    C0755x1.f5259q = this.f4707b;
                }
            }
        }
    }
}
