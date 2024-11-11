package ir.tapsell.sdk.nativeads;

import defpackage.e70;
import ir.tapsell.sdk.models.responseModels.TapsellNativeAdModel;
import java.io.Serializable;

/* loaded from: classes.dex */
public class g extends TapsellNativeAdModel<e70> implements Serializable {
    private String b;
    private e70 c;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = true;
    private boolean h = true;
    private boolean i = false;
    private Integer j = null;
    private int k = 0;

    public String a() {
        String str = this.b;
        return (str == null || str.isEmpty()) ? "NATIVE_VIDEO" : this.b;
    }

    public void a(int i) {
        this.k = i;
    }

    public void a(e70 e70Var) {
        this.c = e70Var;
    }

    public void a(Integer num) {
        this.j = num;
    }

    public void a(String str) {
        this.b = str;
    }

    public void a(boolean z) {
        this.g = z;
    }

    @Override // ir.tapsell.sdk.models.responseModels.TapsellNativeAdModel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e70 getAdSuggestion() {
        return this.c;
    }

    public void b(boolean z) {
        this.d = z;
    }

    public void c(boolean z) {
        this.e = z;
    }

    public boolean c() {
        return this.g;
    }

    public void d(boolean z) {
        this.f = z;
    }

    public boolean d() {
        return this.d;
    }

    public void e(boolean z) {
        this.h = z;
    }

    public boolean e() {
        return this.e;
    }

    public void f(boolean z) {
    }

    public boolean f() {
        return this.f;
    }

    public void g(boolean z) {
        this.i = z;
    }

    public boolean g() {
        return this.h;
    }

    public Integer h() {
        return this.j;
    }

    public int i() {
        return this.k;
    }

    public boolean j() {
        return this.i;
    }
}
