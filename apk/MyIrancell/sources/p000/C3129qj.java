package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.comviva.webaxn.utils.C0747v;
import com.comviva.webaxn.utils.C0755x1;

/* renamed from: qj */
/* loaded from: classes.dex */
public class C3129qj {

    /* renamed from: a */
    Context f12807a;

    /* renamed from: d */
    private String f12810d;

    /* renamed from: k */
    private Typeface f12817k = null;

    /* renamed from: b */
    private String f12808b = null;

    /* renamed from: c */
    private String f12809c = null;

    /* renamed from: g */
    private float f12813g = -1.0f;

    /* renamed from: h */
    private float f12814h = 0.0f;

    /* renamed from: i */
    private int f12815i = 0;

    /* renamed from: l */
    private int f12818l = 0;

    /* renamed from: j */
    private int f12816j = 0;

    /* renamed from: e */
    private boolean f12811e = false;

    /* renamed from: m */
    private boolean f12819m = false;

    /* renamed from: f */
    private boolean f12812f = false;

    public C3129qj(Context context, float f) {
        this.f12807a = context;
    }

    /* renamed from: a */
    public String m15104a() {
        return this.f12810d;
    }

    /* renamed from: a */
    public void m15105a(float f) {
        this.f12814h = f;
    }

    /* renamed from: a */
    public void m15106a(int i) {
        this.f12819m = true;
        this.f12818l = i;
    }

    /* renamed from: a */
    public void m15107a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f12810d = "B";
        } else {
            this.f12810d = new String(str);
        }
    }

    /* renamed from: b */
    public int m15108b() {
        return this.f12818l;
    }

    /* renamed from: b */
    public void m15109b(float f) {
    }

    /* renamed from: b */
    public void m15110b(int i) {
        this.f12811e = true;
        this.f12815i = i;
    }

    /* renamed from: b */
    public void m15111b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f12817k = C0747v.m6081a(str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public int m15112c() {
        return this.f12815i;
    }

    /* renamed from: c */
    public void m15113c(int i) {
        this.f12812f = true;
        this.f12813g = i;
    }

    /* renamed from: c */
    public void m15114c(String str) {
        this.f12808b = str;
    }

    /* renamed from: d */
    public float m15115d() {
        return this.f12814h;
    }

    /* renamed from: d */
    public void m15116d(int i) {
        this.f12816j = i;
    }

    /* renamed from: d */
    public void m15117d(String str) {
        this.f12809c = str;
    }

    /* renamed from: e */
    public float m15118e() {
        return C0755x1.m6114a(this.f12807a, this.f12813g);
    }

    /* renamed from: f */
    public int m15119f() {
        return this.f12816j;
    }

    /* renamed from: g */
    public Typeface m15120g() {
        return this.f12817k;
    }

    /* renamed from: h */
    public boolean m15121h() {
        return this.f12819m;
    }

    /* renamed from: i */
    public boolean m15122i() {
        return this.f12811e;
    }

    /* renamed from: j */
    public boolean m15123j() {
        return this.f12812f;
    }

    /* renamed from: k */
    public String m15124k() {
        return this.f12808b;
    }

    /* renamed from: l */
    public String m15125l() {
        return this.f12809c;
    }
}
