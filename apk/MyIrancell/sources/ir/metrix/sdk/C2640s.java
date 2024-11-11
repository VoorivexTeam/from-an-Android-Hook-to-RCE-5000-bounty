package ir.metrix.sdk;

import com.google.gson.annotations.SerializedName;

/* renamed from: ir.metrix.sdk.s */
/* loaded from: classes.dex */
class C2640s {

    /* renamed from: a */
    @SerializedName("provider")
    private String f10815a;

    /* renamed from: b */
    @SerializedName("recordTime ")
    private Long f10816b = null;

    /* renamed from: c */
    @SerializedName("elapsedRealtimeNanos ")
    private Long f10817c = null;

    /* renamed from: d */
    @SerializedName("latitude ")
    private Double f10818d = null;

    /* renamed from: e */
    @SerializedName("longitude ")
    private Double f10819e = null;

    /* renamed from: f */
    @SerializedName("altitude ")
    private Double f10820f = null;

    /* renamed from: g */
    @SerializedName("speed ")
    private Float f10821g = null;

    /* renamed from: h */
    @SerializedName("bearing ")
    private Float f10822h = null;

    /* renamed from: i */
    @SerializedName("accuracy ")
    private Float f10823i = null;

    /* renamed from: j */
    @SerializedName("address")
    private C2631n f10824j;

    /* renamed from: a */
    public void m12675a(C2631n c2631n) {
        this.f10824j = c2631n;
    }

    /* renamed from: a */
    public void m12676a(Double d) {
        this.f10818d = d;
    }

    /* renamed from: a */
    public void m12677a(Float f) {
        this.f10821g = f;
    }

    /* renamed from: a */
    public void m12678a(Long l) {
        this.f10816b = l;
    }

    /* renamed from: a */
    public void m12679a(String str) {
        this.f10815a = C2617ai.m12554c(str);
    }

    /* renamed from: b */
    public void m12680b(Double d) {
        this.f10819e = d;
    }

    /* renamed from: b */
    public void m12681b(Float f) {
        this.f10822h = f;
    }

    /* renamed from: b */
    public void m12682b(Long l) {
        this.f10817c = l;
    }

    /* renamed from: c */
    public void m12683c(Double d) {
        this.f10820f = d;
    }

    /* renamed from: c */
    public void m12684c(Float f) {
        this.f10823i = f;
    }
}
