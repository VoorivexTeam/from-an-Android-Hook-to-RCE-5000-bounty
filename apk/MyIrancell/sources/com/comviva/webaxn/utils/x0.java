package com.comviva.webaxn.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class x0 {
    private static x0 j;
    private Context a;
    private wj b;
    private mj c;
    private lj d;
    private com.comviva.webaxn.ui.o1 e;
    private yj f;
    private e g;
    private HashMap<String, String> h;
    private TextToSpeech i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements TextToSpeech.OnInitListener {
        a() {
        }

        @Override // android.speech.tts.TextToSpeech.OnInitListener
        public void onInit(int i) {
            String str;
            if (i == -1 || TextUtils.isEmpty((CharSequence) x0.this.h.get("lang"))) {
                return;
            }
            String str2 = (String) x0.this.h.get("lang");
            if (Build.VERSION.SDK_INT >= 21) {
                x0.this.i.setLanguage(Locale.forLanguageTag(str2));
            } else {
                if (str2.indexOf("-") != -1) {
                    String substring = str2.substring(0, str2.indexOf("-"));
                    str = str2.substring(str2.indexOf("-") + 1, str2.length());
                    str2 = substring;
                } else {
                    str = "";
                }
                x0.this.i.setLanguage(new Locale(str2, str));
            }
            x0.this.d();
        }
    }

    private x0(Context context) {
        this.a = context;
    }

    public static x0 a(Context context) {
        if (j == null) {
            j = new x0(context);
        }
        return j;
    }

    public void a() {
        if (j != null) {
            j = null;
        }
        HashMap<String, String> hashMap = this.h;
        if (hashMap != null) {
            hashMap.clear();
            this.h = null;
        }
        TextToSpeech textToSpeech = this.i;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
            this.i = null;
        }
        this.a = null;
        this.b = null;
        this.f = null;
        this.g = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public void a(String str, wj wjVar, mj mjVar, lj ljVar, yj yjVar, e eVar, com.comviva.webaxn.ui.o1 o1Var) {
        this.b = wjVar;
        this.c = mjVar;
        this.d = ljVar;
        this.e = o1Var;
        this.f = yjVar;
        this.g = eVar;
        HashMap<String, String> hashMap = this.h;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.h = x1.f(str);
        if (this.i == null) {
            b();
        } else {
            d();
        }
    }

    public void b() {
        this.i = new TextToSpeech(this.a, new a());
    }

    public void c() {
        if (TextUtils.isEmpty(this.h.get("action")) || this.b.a(this.h.get("action"), false, this.f, this.g, this.c, this.d)) {
            return;
        }
        xj a2 = x1.a(this.h.get("action"), this.c.i());
        if (a2 != null) {
            this.c.a(a2);
        }
        String str = null;
        yj yjVar = this.f;
        if (yjVar != null) {
            str = yjVar.j;
        } else {
            e eVar = this.g;
            if (eVar != null) {
                str = eVar.j;
            }
        }
        if (this.b.a(this.h.get("action"), false, false, this.c, false, false, str, this.d) > 0) {
            this.b.E();
        }
    }

    public void d() {
        String decode;
        String str = this.h.get("target");
        if (TextUtils.isEmpty(str) || !str.startsWith("$")) {
            decode = Uri.decode(str);
        } else {
            decode = x1.a(this.d.f(), str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length()), this.e, false);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.i.speak(decode, 0, null, decode);
        } else {
            this.i.speak(decode, 0, null);
        }
        c();
    }
}
