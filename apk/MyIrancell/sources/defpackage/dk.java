package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.comviva.webaxn.ui.n1;
import com.comviva.webaxn.ui.v;
import com.comviva.webaxn.ui.w;
import com.comviva.webaxn.utils.e;
import com.comviva.webaxn.utils.j1;
import com.comviva.webaxn.utils.m1;
import com.comviva.webaxn.utils.x1;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class dk {
    private static dk x;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    private Context k;
    private wj l;
    private String m;
    private String[] n;
    private yj p;
    private e q;
    private String r;
    private mj s;
    private lj t;
    private String u;
    private ConcurrentHashMap<String, String> o = new ConcurrentHashMap<>();
    private boolean v = false;
    private final x1.o w = new a();

    /* loaded from: classes.dex */
    class a implements x1.o {
        a() {
        }

        @Override // com.comviva.webaxn.utils.x1.o
        public void a(boolean z) {
            if (z) {
                dk.this.e();
            }
        }
    }

    private dk(Context context) {
        this.k = context;
    }

    public static dk a(Context context) {
        if (x == null) {
            x = new dk(context);
        }
        return x;
    }

    private void d() {
        if (m1.a(this.k, new String[]{"android.permission.CAMERA"})) {
            e();
            return;
        }
        if (j1.a(this.k).d("android.permission.CAMERA") == -1) {
            m1.a((Activity) this.k, new String[]{"android.permission.CAMERA"}, 2);
        } else {
            if (!m1.a(this.k, "android.permission.CAMERA")) {
                x1.d(this.k, "msg.rpCam");
                return;
            }
            m1.a((Activity) this.k, new String[]{"android.permission.CAMERA"}, 2);
        }
        this.l.n().a(this.w);
        x1.v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0221 A[Catch: Exception -> 0x02a2, TryCatch #4 {Exception -> 0x02a2, blocks: (B:40:0x00eb, B:41:0x00f7, B:48:0x011f, B:53:0x0140, B:55:0x015a, B:58:0x0173, B:114:0x0184, B:61:0x018e, B:110:0x01bd, B:63:0x01cc, B:106:0x01d6, B:65:0x01e5, B:102:0x01ef, B:67:0x01fe, B:98:0x0208, B:69:0x0217, B:71:0x0221, B:73:0x022b, B:76:0x025c, B:90:0x028e, B:95:0x029c, B:117:0x0168), top: B:2:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk.e():void");
    }

    public String a(String str) {
        return this.o.get(str);
    }

    public void a() {
        if (x != null) {
            x = null;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = this.o;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
            this.o = null;
        }
        if (this.n != null) {
            this.n = null;
        }
        this.k = null;
        this.l = null;
        this.p = null;
        this.q = null;
        this.t = null;
        this.s = null;
        this.v = false;
    }

    public void a(Context context, String str, wj wjVar, mj mjVar, lj ljVar, yj yjVar, e eVar) {
        this.k = context;
        this.l = wjVar;
        this.s = mjVar;
        this.t = ljVar;
        this.p = yjVar;
        this.q = eVar;
        this.u = str;
        d();
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.j = str6;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk.a(java.lang.String, boolean):void");
    }

    public void b(String str) {
        String str2 = this.o.get("param");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String decode = Uri.decode(this.o.get("loadurl"));
        if (!TextUtils.isEmpty(str)) {
            decode = decode.replace(str2, str);
        }
        this.l.s().a(decode);
    }

    public boolean b() {
        return this.v;
    }

    public void c(String str) {
        if (str == null || this.o.size() <= 0) {
            return;
        }
        String trim = str.trim();
        String str2 = this.m;
        if (str2 == null) {
            this.j = this.o.get("action");
            String str3 = this.o.get("text");
            if (!TextUtils.isEmpty(str3)) {
                if (str3.startsWith("$")) {
                    str3 = str3.substring(1, str3.endsWith("$") ? str3.length() - 1 : str3.length());
                }
                this.o.put(str3, trim);
            }
        } else {
            try {
                this.n = trim.split(Pattern.quote(str2));
                for (Map.Entry<String, String> entry : this.o.entrySet()) {
                    int parseInt = Integer.parseInt(entry.getKey());
                    if (parseInt <= this.n.length) {
                        this.o.put(entry.getValue(), this.n[parseInt - 1]);
                    } else {
                        this.o.put(entry.getValue(), null);
                    }
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        for (Map.Entry<String, String> entry2 : this.o.entrySet()) {
            String key = entry2.getKey();
            String value = entry2.getValue();
            if (value != null) {
                yj a2 = this.t.f().a(key, (Vector<yj>) null);
                if (a2 != null) {
                    n1 n1Var = a2.a0;
                    if (n1Var != null) {
                        if (n1Var instanceof w) {
                            ((w) n1Var).h(value);
                        } else if (n1Var instanceof v) {
                            ((v) n1Var).f(value);
                        }
                    }
                } else if (this.t.f().r != null && this.t.f().r.containsKey(key)) {
                    this.t.f().a(key, value);
                }
            }
        }
        String str4 = this.j;
        if (str4 == null || this.l.a(str4, false, this.p, this.q, this.s, this.t)) {
            return;
        }
        xj a3 = x1.a(this.j, this.s.i());
        if (a3 != null) {
            this.s.a(a3);
        }
        if (this.l.a(this.j, false, false, this.s, false, false, this.r, this.t) > 0) {
            this.l.E();
        }
    }

    public boolean c() {
        return !TextUtils.isEmpty(this.o.get("loadurl"));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk.d(java.lang.String):void");
    }
}
