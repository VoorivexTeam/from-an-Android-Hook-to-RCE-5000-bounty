package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.mtni.myirancell.R;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.yj;
import java.util.HashMap;

/* loaded from: classes.dex */
public class j0 {
    private static j0 c;
    private Context a;
    private HashMap<String, String> b = null;

    private j0(Context context) {
        this.a = context;
    }

    public static j0 a(Context context) {
        if (c == null) {
            c = new j0(context);
        }
        return c;
    }

    public void a() {
        if (c != null) {
            c = null;
        }
        HashMap<String, String> hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
            this.b = null;
        }
        this.a = null;
    }

    public void a(String str, wj wjVar, mj mjVar, lj ljVar, yj yjVar, e eVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = this.b;
        if (hashMap == null) {
            this.b = new HashMap<>();
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
                this.b.put(str2, str3);
            }
        }
        if (this.b.size() > 0) {
            String str5 = this.b.get("action");
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            try {
                ((Activity) this.a).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(Uri.decode(str5))));
            } catch (ActivityNotFoundException unused) {
                String str6 = this.b.get("altaction");
                if (!TextUtils.isEmpty(str6)) {
                    Uri.decode(str6);
                }
                String c2 = j1.a(this.a).c("msg.AppNotFound");
                if (c2 == null) {
                    c2 = this.a.getString(R.string.app_not_found_error);
                }
                Toast.makeText(this.a, c2, 0).show();
            }
        }
    }
}
