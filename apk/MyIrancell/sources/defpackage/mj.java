package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.comviva.webaxn.ui.n1;
import com.comviva.webaxn.utils.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: classes.dex */
public class mj {
    private lj b;
    private Vector<xj> c;
    private String e;
    private Context j;
    private cj l;
    Vector<e> m;
    private String r;
    private int s;
    private int t;
    private int u;
    private float v;
    private boolean f = false;
    public boolean k = false;
    private boolean p = false;
    private String q = null;
    public String w = null;
    public String x = null;
    public boolean y = false;
    private ArrayList<lj> a = new ArrayList<>();
    private byte[] i = null;
    private String d = null;
    private String g = null;
    private String h = null;
    public a n = new a(this);
    private boolean o = false;

    /* loaded from: classes.dex */
    public class a {
        int a;
        String b;

        public a(mj mjVar) {
        }

        public void a(int i) {
            this.a = i;
        }

        public void a(String str) {
            this.b = str;
        }
    }

    public mj(Context context) {
        this.j = context;
    }

    public cj a() {
        return this.l;
    }

    public lj a(int i) {
        if (this.a.size() > 0) {
            return this.a.get(i);
        }
        return null;
    }

    public lj a(String str) {
        zj zjVar;
        Iterator<lj> it = this.a.iterator();
        while (it.hasNext()) {
            lj next = it.next();
            if (next != null && (zjVar = next.a) != null && !TextUtils.isEmpty(zjVar.g) && str.equals(next.a.g)) {
                return next;
            }
        }
        return null;
    }

    public void a(float f) {
        this.v = f;
    }

    public void a(cj cjVar) {
        this.l = cjVar;
    }

    public void a(e eVar) {
        if (this.m == null) {
            this.m = new Vector<>();
        }
        this.m.addElement(eVar);
    }

    public void a(Vector<xj> vector) {
        if (this.c == null) {
            this.c = new Vector<>();
        }
        Vector<xj> vector2 = this.c;
        if (vector2 == null || vector == null) {
            return;
        }
        vector2.addAll(vector);
    }

    public void a(lj ljVar) {
        this.a.add(ljVar);
    }

    public void a(xj xjVar) {
        if (this.c == null) {
            this.c = new Vector<>();
        }
        this.c.add(xjVar);
    }

    public void a(boolean z) {
    }

    public void a(boolean z, String str) {
        this.p = z;
        this.q = str;
    }

    public void a(byte[] bArr) {
        this.i = bArr;
    }

    public void b(float f) {
    }

    public void b(int i) {
        this.s = i;
    }

    public void b(String str) {
        this.d = str;
    }

    public void b(lj ljVar) {
        this.a.remove(ljVar);
    }

    public void b(boolean z) {
        this.o = z;
    }

    public void b(byte[] bArr) {
        aj.a(this.j).b(this.g, bArr, 3);
    }

    public byte[] b() {
        return this.i;
    }

    public String c() {
        return this.d;
    }

    public void c(int i) {
    }

    public void c(lj ljVar) {
        this.b = ljVar;
    }

    public boolean c(String str) {
        this.g = str;
        return aj.a(this.j).a(str, "startup_images", 3);
    }

    public Vector<e> d() {
        return this.m;
    }

    public void d(int i) {
        this.t = i;
    }

    public void d(String str) {
        this.h = str;
    }

    public lj e() {
        return this.b;
    }

    public void e(int i) {
        this.u = i;
    }

    public void e(String str) {
        this.r = str;
    }

    public byte[] f() {
        return aj.a(this.j).d(this.g, "startup_images");
    }

    public int g() {
        ArrayList<lj> arrayList = this.a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public int h() {
        ArrayList<lj> arrayList = this.a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public Vector<xj> i() {
        return this.c;
    }

    public String j() {
        return this.h;
    }

    public String k() {
        return this.q;
    }

    public int l() {
        return n1.d(this.s);
    }

    public String m() {
        return this.r;
    }

    public int n() {
        return n1.d(this.t);
    }

    public float o() {
        return this.v;
    }

    public int p() {
        return this.u;
    }

    public String q() {
        return this.e;
    }

    public boolean r() {
        return this.p;
    }

    public boolean s() {
        return this.o;
    }

    public boolean t() {
        return this.f;
    }

    public void u() {
        this.a.clear();
        Vector<xj> vector = this.c;
        if (vector != null) {
            vector.clear();
        }
        this.i = null;
        this.d = null;
    }
}
