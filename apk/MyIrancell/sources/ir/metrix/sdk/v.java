package ir.metrix.sdk;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
class v {

    @SerializedName("mcc")
    private int a;

    @SerializedName("mnc")
    private int b;

    @SerializedName("lac")
    private int c;

    @SerializedName("cid")
    private int d;

    @SerializedName("psc")
    private int e;

    @SerializedName("uarfcn")
    private Integer f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(int i, int i2, int i3, int i4, int i5, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = num;
    }
}
