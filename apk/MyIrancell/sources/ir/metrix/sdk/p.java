package ir.metrix.sdk;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
class p {

    @SerializedName("mcc")
    private int a;

    @SerializedName("mnc")
    private int b;

    @SerializedName("lac")
    private int c;

    @SerializedName("cid")
    private int d;

    @SerializedName("arfcn")
    private Integer e;

    @SerializedName("bsic")
    private Integer f;

    public p() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(int i, int i2, int i3, int i4, Integer num, Integer num2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = num;
        this.f = num2;
    }
}
