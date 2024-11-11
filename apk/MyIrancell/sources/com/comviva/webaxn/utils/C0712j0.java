package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.mtni.myirancell.R;
import java.util.HashMap;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.j0 */
/* loaded from: classes.dex */
public class C0712j0 {

    /* renamed from: c */
    private static C0712j0 f4871c;

    /* renamed from: a */
    private Context f4872a;

    /* renamed from: b */
    private HashMap<String, String> f4873b = null;

    private C0712j0(Context context) {
        this.f4872a = context;
    }

    /* renamed from: a */
    public static C0712j0 m5559a(Context context) {
        if (f4871c == null) {
            f4871c = new C0712j0(context);
        }
        return f4871c;
    }

    /* renamed from: a */
    public void m5560a() {
        if (f4871c != null) {
            f4871c = null;
        }
        HashMap<String, String> hashMap = this.f4873b;
        if (hashMap != null) {
            hashMap.clear();
            this.f4873b = null;
        }
        this.f4872a = null;
    }

    /* renamed from: a */
    public void m5561a(String str, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, C3489yj c3489yj, C0696e c0696e) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = this.f4873b;
        if (hashMap == null) {
            this.f4873b = new HashMap<>();
        } else {
            hashMap.clear();
        }
        String str2 = null;
        String str3 = null;
        for (String str4 : str.split("&")) {
            String[] split = str4.split("=");
            for (int i = 0; i < split.length; i++) {
                split[i] = split[i].trim();
                if (i == 0) {
                    str2 = split[i].trim();
                } else if (i == 1) {
                    str3 = split[i];
                }
            }
            if (str2 != null && str3 != null) {
                this.f4873b.put(str2, str3);
            }
        }
        if (this.f4873b.size() > 0) {
            String str5 = this.f4873b.get("action");
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            try {
                ((Activity) this.f4872a).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(Uri.decode(str5))));
            } catch (ActivityNotFoundException unused) {
                String str6 = this.f4873b.get("altaction");
                if (!TextUtils.isEmpty(str6)) {
                    Uri.decode(str6);
                }
                String m5641c = C0713j1.m5563a(this.f4872a).m5641c("msg.AppNotFound");
                if (m5641c == null) {
                    m5641c = this.f4872a.getString(R.string.app_not_found_error);
                }
                Toast.makeText(this.f4872a, m5641c, 0).show();
            }
        }
    }
}
