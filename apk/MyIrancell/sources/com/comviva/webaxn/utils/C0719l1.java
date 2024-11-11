package com.comviva.webaxn.utils;

import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0613a1;
import com.comviva.webaxn.utils.C0755x1;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import p000.C2899lj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.l1 */
/* loaded from: classes.dex */
public class C0719l1 {

    /* renamed from: A */
    public C0613a1 f4933A;

    /* renamed from: B */
    public boolean f4934B;

    /* renamed from: D */
    public String f4936D;

    /* renamed from: E */
    public String f4937E;

    /* renamed from: F */
    public Vector<C0716k1> f4938F;

    /* renamed from: G */
    public boolean f4939G;

    /* renamed from: H */
    public C0711j f4940H;

    /* renamed from: K */
    public int f4943K;

    /* renamed from: L */
    public C3489yj f4944L;

    /* renamed from: N */
    private String f4946N;

    /* renamed from: O */
    private C0737r1 f4947O;

    /* renamed from: a */
    public String f4948a;

    /* renamed from: b */
    public long f4949b;

    /* renamed from: c */
    public int f4950c;

    /* renamed from: d */
    public String f4951d;

    /* renamed from: e */
    public long f4952e;

    /* renamed from: f */
    public int f4953f;

    /* renamed from: g */
    public long f4954g;

    /* renamed from: h */
    public byte[] f4955h;

    /* renamed from: i */
    public int f4956i;

    /* renamed from: j */
    public String f4957j;

    /* renamed from: k */
    public byte[] f4958k;

    /* renamed from: l */
    private int f4959l;

    /* renamed from: m */
    private Map<String, List<String>> f4960m;

    /* renamed from: n */
    private int f4961n;

    /* renamed from: o */
    public boolean f4962o;

    /* renamed from: q */
    public C0755x1.k f4964q;

    /* renamed from: r */
    public AbstractC0652n1 f4965r;

    /* renamed from: x */
    public C2899lj f4971x;

    /* renamed from: p */
    public boolean f4963p = false;

    /* renamed from: s */
    public int f4966s = -1;

    /* renamed from: t */
    public String f4967t = null;

    /* renamed from: u */
    public String f4968u = null;

    /* renamed from: v */
    public String f4969v = null;

    /* renamed from: w */
    public boolean f4970w = false;

    /* renamed from: y */
    public boolean f4972y = false;

    /* renamed from: z */
    public boolean f4973z = false;

    /* renamed from: C */
    public boolean f4935C = false;

    /* renamed from: I */
    public int f4941I = -1;

    /* renamed from: J */
    public String f4942J = null;

    /* renamed from: M */
    private boolean f4945M = false;

    /* renamed from: a */
    public String m5852a() {
        return this.f4946N;
    }

    /* renamed from: a */
    public String m5853a(String str) {
        if (this.f4960m.get(str) != null) {
            return this.f4960m.get(str).get(0);
        }
        return null;
    }

    /* renamed from: a */
    public void m5854a(int i) {
        this.f4961n = i;
    }

    /* renamed from: a */
    public void m5855a(C0737r1 c0737r1) {
        this.f4947O = c0737r1;
    }

    /* renamed from: a */
    public void m5856a(Map<String, List<String>> map) {
        this.f4960m = map;
    }

    /* renamed from: a */
    public void m5857a(boolean z, String str) {
        this.f4945M = z;
        this.f4946N = str;
    }

    /* renamed from: a */
    public void m5858a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            this.f4958k = null;
            return;
        }
        byte[] bArr2 = new byte[bArr.length];
        this.f4958k = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    /* renamed from: b */
    public String m5859b() {
        return this.f4957j;
    }

    /* renamed from: b */
    public void m5860b(int i) {
        this.f4959l = i;
    }

    /* renamed from: c */
    public boolean m5861c() {
        return this.f4945M;
    }

    /* renamed from: d */
    public byte[] m5862d() {
        return this.f4955h;
    }

    /* renamed from: e */
    public int m5863e() {
        return this.f4956i;
    }

    /* renamed from: f */
    public byte[] m5864f() {
        return this.f4958k;
    }

    /* renamed from: g */
    public int m5865g() {
        return this.f4961n;
    }

    /* renamed from: h */
    public int m5866h() {
        return this.f4959l;
    }

    /* renamed from: i */
    public C0737r1 m5867i() {
        return this.f4947O;
    }

    /* renamed from: j */
    public boolean m5868j() {
        return this.f4962o;
    }
}
