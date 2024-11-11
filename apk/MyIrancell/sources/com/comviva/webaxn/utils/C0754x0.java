package com.comviva.webaxn.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.C0655o1;
import java.util.HashMap;
import java.util.Locale;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.x0 */
/* loaded from: classes.dex */
public class C0754x0 {

    /* renamed from: j */
    private static C0754x0 f5226j;

    /* renamed from: a */
    private Context f5227a;

    /* renamed from: b */
    private C3400wj f5228b;

    /* renamed from: c */
    private C2945mj f5229c;

    /* renamed from: d */
    private C2899lj f5230d;

    /* renamed from: e */
    private C0655o1 f5231e;

    /* renamed from: f */
    private C3489yj f5232f;

    /* renamed from: g */
    private C0696e f5233g;

    /* renamed from: h */
    private HashMap<String, String> f5234h;

    /* renamed from: i */
    private TextToSpeech f5235i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.x0$a */
    /* loaded from: classes.dex */
    public class a implements TextToSpeech.OnInitListener {
        a() {
        }

        @Override // android.speech.tts.TextToSpeech.OnInitListener
        public void onInit(int i) {
            String str;
            if (i == -1 || TextUtils.isEmpty((CharSequence) C0754x0.this.f5234h.get("lang"))) {
                return;
            }
            String str2 = (String) C0754x0.this.f5234h.get("lang");
            if (Build.VERSION.SDK_INT >= 21) {
                C0754x0.this.f5235i.setLanguage(Locale.forLanguageTag(str2));
            } else {
                if (str2.indexOf("-") != -1) {
                    String substring = str2.substring(0, str2.indexOf("-"));
                    str = str2.substring(str2.indexOf("-") + 1, str2.length());
                    str2 = substring;
                } else {
                    str = "";
                }
                C0754x0.this.f5235i.setLanguage(new Locale(str2, str));
            }
            C0754x0.this.m6110d();
        }
    }

    private C0754x0(Context context) {
        this.f5227a = context;
    }

    /* renamed from: a */
    public static C0754x0 m6103a(Context context) {
        if (f5226j == null) {
            f5226j = new C0754x0(context);
        }
        return f5226j;
    }

    /* renamed from: a */
    public void m6106a() {
        if (f5226j != null) {
            f5226j = null;
        }
        HashMap<String, String> hashMap = this.f5234h;
        if (hashMap != null) {
            hashMap.clear();
            this.f5234h = null;
        }
        TextToSpeech textToSpeech = this.f5235i;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
            this.f5235i = null;
        }
        this.f5227a = null;
        this.f5228b = null;
        this.f5232f = null;
        this.f5233g = null;
        this.f5229c = null;
        this.f5230d = null;
        this.f5231e = null;
    }

    /* renamed from: a */
    public void m6107a(String str, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, C3489yj c3489yj, C0696e c0696e, C0655o1 c0655o1) {
        this.f5228b = c3400wj;
        this.f5229c = c2945mj;
        this.f5230d = c2899lj;
        this.f5231e = c0655o1;
        this.f5232f = c3489yj;
        this.f5233g = c0696e;
        HashMap<String, String> hashMap = this.f5234h;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f5234h = C0755x1.m6188f(str);
        if (this.f5235i == null) {
            m6108b();
        } else {
            m6110d();
        }
    }

    /* renamed from: b */
    public void m6108b() {
        this.f5235i = new TextToSpeech(this.f5227a, new a());
    }

    /* renamed from: c */
    public void m6109c() {
        if (TextUtils.isEmpty(this.f5234h.get("action")) || this.f5228b.m16298a(this.f5234h.get("action"), false, this.f5232f, this.f5233g, this.f5229c, this.f5230d)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(this.f5234h.get("action"), this.f5229c.m14145i());
        if (m6134a != null) {
            this.f5229c.m14121a(m6134a);
        }
        String str = null;
        C3489yj c3489yj = this.f5232f;
        if (c3489yj != null) {
            str = c3489yj.f14223j;
        } else {
            C0696e c0696e = this.f5233g;
            if (c0696e != null) {
                str = c0696e.f4718j;
            }
        }
        if (this.f5228b.m16263a(this.f5234h.get("action"), false, false, this.f5229c, false, false, str, this.f5230d) > 0) {
            this.f5228b.m16258E();
        }
    }

    /* renamed from: d */
    public void m6110d() {
        String decode;
        String str = this.f5234h.get("target");
        if (TextUtils.isEmpty(str) || !str.startsWith("$")) {
            decode = Uri.decode(str);
        } else {
            decode = C0755x1.m6132a(this.f5230d.m13901f(), str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length()), this.f5231e, false);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f5235i.speak(decode, 0, null, decode);
        } else {
            this.f5235i.speak(decode, 0, null);
        }
        m6109c();
    }
}
