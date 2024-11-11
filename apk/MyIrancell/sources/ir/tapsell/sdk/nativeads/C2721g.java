package ir.tapsell.sdk.nativeads;

import ir.tapsell.sdk.models.responseModels.TapsellNativeAdModel;
import java.io.Serializable;
import p000.e70;

/* renamed from: ir.tapsell.sdk.nativeads.g */
/* loaded from: classes.dex */
public class C2721g extends TapsellNativeAdModel<e70> implements Serializable {

    /* renamed from: b */
    private String f11178b;

    /* renamed from: c */
    private e70 f11179c;

    /* renamed from: d */
    private boolean f11180d = false;

    /* renamed from: e */
    private boolean f11181e = false;

    /* renamed from: f */
    private boolean f11182f = false;

    /* renamed from: g */
    private boolean f11183g = true;

    /* renamed from: h */
    private boolean f11184h = true;

    /* renamed from: i */
    private boolean f11185i = false;

    /* renamed from: j */
    private Integer f11186j = null;

    /* renamed from: k */
    private int f11187k = 0;

    /* renamed from: a */
    public String m13062a() {
        String str = this.f11178b;
        return (str == null || str.isEmpty()) ? "NATIVE_VIDEO" : this.f11178b;
    }

    /* renamed from: a */
    public void m13063a(int i) {
        this.f11187k = i;
    }

    /* renamed from: a */
    public void m13064a(e70 e70Var) {
        this.f11179c = e70Var;
    }

    /* renamed from: a */
    public void m13065a(Integer num) {
        this.f11186j = num;
    }

    /* renamed from: a */
    public void m13066a(String str) {
        this.f11178b = str;
    }

    /* renamed from: a */
    public void m13067a(boolean z) {
        this.f11183g = z;
    }

    @Override // ir.tapsell.sdk.models.responseModels.TapsellNativeAdModel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e70 getAdSuggestion() {
        return this.f11179c;
    }

    /* renamed from: b */
    public void m13069b(boolean z) {
        this.f11180d = z;
    }

    /* renamed from: c */
    public void m13070c(boolean z) {
        this.f11181e = z;
    }

    /* renamed from: c */
    public boolean m13071c() {
        return this.f11183g;
    }

    /* renamed from: d */
    public void m13072d(boolean z) {
        this.f11182f = z;
    }

    /* renamed from: d */
    public boolean m13073d() {
        return this.f11180d;
    }

    /* renamed from: e */
    public void m13074e(boolean z) {
        this.f11184h = z;
    }

    /* renamed from: e */
    public boolean m13075e() {
        return this.f11181e;
    }

    /* renamed from: f */
    public void m13076f(boolean z) {
    }

    /* renamed from: f */
    public boolean m13077f() {
        return this.f11182f;
    }

    /* renamed from: g */
    public void m13078g(boolean z) {
        this.f11185i = z;
    }

    /* renamed from: g */
    public boolean m13079g() {
        return this.f11184h;
    }

    /* renamed from: h */
    public Integer m13080h() {
        return this.f11186j;
    }

    /* renamed from: i */
    public int m13081i() {
        return this.f11187k;
    }

    /* renamed from: j */
    public boolean m13082j() {
        return this.f11185i;
    }
}
