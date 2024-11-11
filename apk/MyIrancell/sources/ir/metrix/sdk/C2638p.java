package ir.metrix.sdk;

import com.google.gson.annotations.SerializedName;

/* renamed from: ir.metrix.sdk.p */
/* loaded from: classes.dex */
class C2638p {

    /* renamed from: a */
    @SerializedName("mcc")
    private int f10806a;

    /* renamed from: b */
    @SerializedName("mnc")
    private int f10807b;

    /* renamed from: c */
    @SerializedName("lac")
    private int f10808c;

    /* renamed from: d */
    @SerializedName("cid")
    private int f10809d;

    /* renamed from: e */
    @SerializedName("arfcn")
    private Integer f10810e;

    /* renamed from: f */
    @SerializedName("bsic")
    private Integer f10811f;

    public C2638p() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2638p(int i, int i2, int i3, int i4, Integer num, Integer num2) {
        this.f10806a = i;
        this.f10807b = i2;
        this.f10808c = i3;
        this.f10809d = i4;
        this.f10810e = num;
        this.f10811f = num2;
    }
}
