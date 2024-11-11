package p000;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import com.comviva.webaxn.utils.C0696e;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0722m1;
import com.comviva.webaxn.utils.C0755x1;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* renamed from: dk */
/* loaded from: classes.dex */
public class C2392dk {

    /* renamed from: x */
    private static C2392dk f9848x;

    /* renamed from: a */
    private String f9849a;

    /* renamed from: b */
    private String f9850b;

    /* renamed from: c */
    private String f9851c;

    /* renamed from: d */
    private String f9852d;

    /* renamed from: e */
    private String f9853e;

    /* renamed from: f */
    public String f9854f;

    /* renamed from: g */
    public String f9855g;

    /* renamed from: h */
    public String f9856h;

    /* renamed from: i */
    public String f9857i;

    /* renamed from: j */
    public String f9858j;

    /* renamed from: k */
    private Context f9859k;

    /* renamed from: l */
    private C3400wj f9860l;

    /* renamed from: m */
    private String f9861m;

    /* renamed from: n */
    private String[] f9862n;

    /* renamed from: p */
    private C3489yj f9864p;

    /* renamed from: q */
    private C0696e f9865q;

    /* renamed from: r */
    private String f9866r;

    /* renamed from: s */
    private C2945mj f9867s;

    /* renamed from: t */
    private C2899lj f9868t;

    /* renamed from: u */
    private String f9869u;

    /* renamed from: o */
    private ConcurrentHashMap<String, String> f9863o = new ConcurrentHashMap<>();

    /* renamed from: v */
    private boolean f9870v = false;

    /* renamed from: w */
    private final C0755x1.o f9871w = new a();

    /* renamed from: dk$a */
    /* loaded from: classes.dex */
    class a implements C0755x1.o {
        a() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.o
        /* renamed from: a */
        public void mo4309a(boolean z) {
            if (z) {
                C2392dk.this.m11447e();
            }
        }
    }

    private C2392dk(Context context) {
        this.f9859k = context;
    }

    /* renamed from: a */
    public static C2392dk m11444a(Context context) {
        if (f9848x == null) {
            f9848x = new C2392dk(context);
        }
        return f9848x;
    }

    /* renamed from: d */
    private void m11446d() {
        if (C0722m1.m5887a(this.f9859k, new String[]{"android.permission.CAMERA"})) {
            m11447e();
            return;
        }
        if (C0713j1.m5563a(this.f9859k).m5647d("android.permission.CAMERA") == -1) {
            C0722m1.m5885a((Activity) this.f9859k, new String[]{"android.permission.CAMERA"}, 2);
        } else {
            if (!C0722m1.m5886a(this.f9859k, "android.permission.CAMERA")) {
                C0755x1.m6181d(this.f9859k, "msg.rpCam");
                return;
            }
            C0722m1.m5885a((Activity) this.f9859k, new String[]{"android.permission.CAMERA"}, 2);
        }
        this.f9860l.m16337n().mo4083a(this.f9871w);
        C0755x1.f5264v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0221 A[Catch: Exception -> 0x02a2, TryCatch #4 {Exception -> 0x02a2, blocks: (B:40:0x00eb, B:41:0x00f7, B:48:0x011f, B:53:0x0140, B:55:0x015a, B:58:0x0173, B:114:0x0184, B:61:0x018e, B:110:0x01bd, B:63:0x01cc, B:106:0x01d6, B:65:0x01e5, B:102:0x01ef, B:67:0x01fe, B:98:0x0208, B:69:0x0217, B:71:0x0221, B:73:0x022b, B:76:0x025c, B:90:0x028e, B:95:0x029c, B:117:0x0168), top: B:2:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m11447e() {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2392dk.m11447e():void");
    }

    /* renamed from: a */
    public String m11448a(String str) {
        return this.f9863o.get(str);
    }

    /* renamed from: a */
    public void m11449a() {
        if (f9848x != null) {
            f9848x = null;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = this.f9863o;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
            this.f9863o = null;
        }
        if (this.f9862n != null) {
            this.f9862n = null;
        }
        this.f9859k = null;
        this.f9860l = null;
        this.f9864p = null;
        this.f9865q = null;
        this.f9868t = null;
        this.f9867s = null;
        this.f9870v = false;
    }

    /* renamed from: a */
    public void m11450a(Context context, String str, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, C3489yj c3489yj, C0696e c0696e) {
        this.f9859k = context;
        this.f9860l = c3400wj;
        this.f9867s = c2945mj;
        this.f9868t = c2899lj;
        this.f9864p = c3489yj;
        this.f9865q = c0696e;
        this.f9869u = str;
        m11446d();
    }

    /* renamed from: a */
    public void m11451a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f9849a = str;
        this.f9850b = str2;
        this.f9851c = str3;
        this.f9852d = str4;
        this.f9853e = str5;
        this.f9858j = str6;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m11452a(java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2392dk.m11452a(java.lang.String, boolean):void");
    }

    /* renamed from: b */
    public void m11453b(String str) {
        String str2 = this.f9863o.get("param");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String decode = Uri.decode(this.f9863o.get("loadurl"));
        if (!TextUtils.isEmpty(str)) {
            decode = decode.replace(str2, str);
        }
        this.f9860l.m16342s().mo4128a(decode);
    }

    /* renamed from: b */
    public boolean m11454b() {
        return this.f9870v;
    }

    /* renamed from: c */
    public void m11455c(String str) {
        if (str == null || this.f9863o.size() <= 0) {
            return;
        }
        String trim = str.trim();
        String str2 = this.f9861m;
        if (str2 == null) {
            this.f9858j = this.f9863o.get("action");
            String str3 = this.f9863o.get("text");
            if (!TextUtils.isEmpty(str3)) {
                if (str3.startsWith("$")) {
                    str3 = str3.substring(1, str3.endsWith("$") ? str3.length() - 1 : str3.length());
                }
                this.f9863o.put(str3, trim);
            }
        } else {
            try {
                this.f9862n = trim.split(Pattern.quote(str2));
                for (Map.Entry<String, String> entry : this.f9863o.entrySet()) {
                    int parseInt = Integer.parseInt(entry.getKey());
                    if (parseInt <= this.f9862n.length) {
                        this.f9863o.put(entry.getValue(), this.f9862n[parseInt - 1]);
                    } else {
                        this.f9863o.put(entry.getValue(), null);
                    }
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        for (Map.Entry<String, String> entry2 : this.f9863o.entrySet()) {
            String key = entry2.getKey();
            String value = entry2.getValue();
            if (value != null) {
                C3489yj m16930a = this.f9868t.m13901f().m16930a(key, (Vector<C3489yj>) null);
                if (m16930a != null) {
                    AbstractC0652n1 abstractC0652n1 = m16930a.f14197a0;
                    if (abstractC0652n1 != null) {
                        if (abstractC0652n1 instanceof C0670w) {
                            ((C0670w) abstractC0652n1).m5093h(value);
                        } else if (abstractC0652n1 instanceof C0668v) {
                            ((C0668v) abstractC0652n1).m5029f(value);
                        }
                    }
                } else if (this.f9868t.m13901f().f14519r != null && this.f9868t.m13901f().f14519r.containsKey(key)) {
                    this.f9868t.m13901f().m16931a(key, value);
                }
            }
        }
        String str4 = this.f9858j;
        if (str4 == null || this.f9860l.m16298a(str4, false, this.f9864p, this.f9865q, this.f9867s, this.f9868t)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(this.f9858j, this.f9867s.m14145i());
        if (m6134a != null) {
            this.f9867s.m14121a(m6134a);
        }
        if (this.f9860l.m16263a(this.f9858j, false, false, this.f9867s, false, false, this.f9866r, this.f9868t) > 0) {
            this.f9860l.m16258E();
        }
    }

    /* renamed from: c */
    public boolean m11456c() {
        return !TextUtils.isEmpty(this.f9863o.get("loadurl"));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b9  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m11457d(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2392dk.m11457d(java.lang.String):void");
    }
}
