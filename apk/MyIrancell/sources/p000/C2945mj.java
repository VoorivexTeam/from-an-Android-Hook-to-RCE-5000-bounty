package p000;

import android.content.Context;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.utils.C0696e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: mj */
/* loaded from: classes.dex */
public class C2945mj {

    /* renamed from: b */
    private C2899lj f12149b;

    /* renamed from: c */
    private Vector<C3440xj> f12150c;

    /* renamed from: e */
    private String f12152e;

    /* renamed from: j */
    private Context f12157j;

    /* renamed from: l */
    private C0524cj f12159l;

    /* renamed from: m */
    Vector<C0696e> f12160m;

    /* renamed from: r */
    private String f12165r;

    /* renamed from: s */
    private int f12166s;

    /* renamed from: t */
    private int f12167t;

    /* renamed from: u */
    private int f12168u;

    /* renamed from: v */
    private float f12169v;

    /* renamed from: f */
    private boolean f12153f = false;

    /* renamed from: k */
    public boolean f12158k = false;

    /* renamed from: p */
    private boolean f12163p = false;

    /* renamed from: q */
    private String f12164q = null;

    /* renamed from: w */
    public String f12170w = null;

    /* renamed from: x */
    public String f12171x = null;

    /* renamed from: y */
    public boolean f12172y = false;

    /* renamed from: a */
    private ArrayList<C2899lj> f12148a = new ArrayList<>();

    /* renamed from: i */
    private byte[] f12156i = null;

    /* renamed from: d */
    private String f12151d = null;

    /* renamed from: g */
    private String f12154g = null;

    /* renamed from: h */
    private String f12155h = null;

    /* renamed from: n */
    public a f12161n = new a(this);

    /* renamed from: o */
    private boolean f12162o = false;

    /* renamed from: mj$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        int f12173a;

        /* renamed from: b */
        String f12174b;

        public a(C2945mj c2945mj) {
        }

        /* renamed from: a */
        public void m14158a(int i) {
            this.f12173a = i;
        }

        /* renamed from: a */
        public void m14159a(String str) {
            this.f12174b = str;
        }
    }

    public C2945mj(Context context) {
        this.f12157j = context;
    }

    /* renamed from: a */
    public C0524cj m14113a() {
        return this.f12159l;
    }

    /* renamed from: a */
    public C2899lj m14114a(int i) {
        if (this.f12148a.size() > 0) {
            return this.f12148a.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public C2899lj m14115a(String str) {
        C3531zj c3531zj;
        Iterator<C2899lj> it = this.f12148a.iterator();
        while (it.hasNext()) {
            C2899lj next = it.next();
            if (next != null && (c3531zj = next.f11881a) != null && !TextUtils.isEmpty(c3531zj.f14508g) && str.equals(next.f11881a.f14508g)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m14116a(float f) {
        this.f12169v = f;
    }

    /* renamed from: a */
    public void m14117a(C0524cj c0524cj) {
        this.f12159l = c0524cj;
    }

    /* renamed from: a */
    public void m14118a(C0696e c0696e) {
        if (this.f12160m == null) {
            this.f12160m = new Vector<>();
        }
        this.f12160m.addElement(c0696e);
    }

    /* renamed from: a */
    public void m14119a(Vector<C3440xj> vector) {
        if (this.f12150c == null) {
            this.f12150c = new Vector<>();
        }
        Vector<C3440xj> vector2 = this.f12150c;
        if (vector2 == null || vector == null) {
            return;
        }
        vector2.addAll(vector);
    }

    /* renamed from: a */
    public void m14120a(C2899lj c2899lj) {
        this.f12148a.add(c2899lj);
    }

    /* renamed from: a */
    public void m14121a(C3440xj c3440xj) {
        if (this.f12150c == null) {
            this.f12150c = new Vector<>();
        }
        this.f12150c.add(c3440xj);
    }

    /* renamed from: a */
    public void m14122a(boolean z) {
    }

    /* renamed from: a */
    public void m14123a(boolean z, String str) {
        this.f12163p = z;
        this.f12164q = str;
    }

    /* renamed from: a */
    public void m14124a(byte[] bArr) {
        this.f12156i = bArr;
    }

    /* renamed from: b */
    public void m14125b(float f) {
    }

    /* renamed from: b */
    public void m14126b(int i) {
        this.f12166s = i;
    }

    /* renamed from: b */
    public void m14127b(String str) {
        this.f12151d = str;
    }

    /* renamed from: b */
    public void m14128b(C2899lj c2899lj) {
        this.f12148a.remove(c2899lj);
    }

    /* renamed from: b */
    public void m14129b(boolean z) {
        this.f12162o = z;
    }

    /* renamed from: b */
    public void m14130b(byte[] bArr) {
        C0023aj.m160a(this.f12157j).m184b(this.f12154g, bArr, 3);
    }

    /* renamed from: b */
    public byte[] m14131b() {
        return this.f12156i;
    }

    /* renamed from: c */
    public String m14132c() {
        return this.f12151d;
    }

    /* renamed from: c */
    public void m14133c(int i) {
    }

    /* renamed from: c */
    public void m14134c(C2899lj c2899lj) {
        this.f12149b = c2899lj;
    }

    /* renamed from: c */
    public boolean m14135c(String str) {
        this.f12154g = str;
        return C0023aj.m160a(this.f12157j).m176a(str, "startup_images", 3);
    }

    /* renamed from: d */
    public Vector<C0696e> m14136d() {
        return this.f12160m;
    }

    /* renamed from: d */
    public void m14137d(int i) {
        this.f12167t = i;
    }

    /* renamed from: d */
    public void m14138d(String str) {
        this.f12155h = str;
    }

    /* renamed from: e */
    public C2899lj m14139e() {
        return this.f12149b;
    }

    /* renamed from: e */
    public void m14140e(int i) {
        this.f12168u = i;
    }

    /* renamed from: e */
    public void m14141e(String str) {
        this.f12165r = str;
    }

    /* renamed from: f */
    public byte[] m14142f() {
        return C0023aj.m160a(this.f12157j).m190d(this.f12154g, "startup_images");
    }

    /* renamed from: g */
    public int m14143g() {
        ArrayList<C2899lj> arrayList = this.f12148a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: h */
    public int m14144h() {
        ArrayList<C2899lj> arrayList = this.f12148a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: i */
    public Vector<C3440xj> m14145i() {
        return this.f12150c;
    }

    /* renamed from: j */
    public String m14146j() {
        return this.f12155h;
    }

    /* renamed from: k */
    public String m14147k() {
        return this.f12164q;
    }

    /* renamed from: l */
    public int m14148l() {
        return AbstractC0652n1.m4701d(this.f12166s);
    }

    /* renamed from: m */
    public String m14149m() {
        return this.f12165r;
    }

    /* renamed from: n */
    public int m14150n() {
        return AbstractC0652n1.m4701d(this.f12167t);
    }

    /* renamed from: o */
    public float m14151o() {
        return this.f12169v;
    }

    /* renamed from: p */
    public int m14152p() {
        return this.f12168u;
    }

    /* renamed from: q */
    public String m14153q() {
        return this.f12152e;
    }

    /* renamed from: r */
    public boolean m14154r() {
        return this.f12163p;
    }

    /* renamed from: s */
    public boolean m14155s() {
        return this.f12162o;
    }

    /* renamed from: t */
    public boolean m14156t() {
        return this.f12153f;
    }

    /* renamed from: u */
    public void m14157u() {
        this.f12148a.clear();
        Vector<C3440xj> vector = this.f12150c;
        if (vector != null) {
            vector.clear();
        }
        this.f12156i = null;
        this.f12151d = null;
    }
}
