package ir.metrix.sdk;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
class u {

    @SerializedName("mcc")
    private int a;

    @SerializedName("mnc")
    private int b;

    @SerializedName("ci")
    private int c;

    @SerializedName("pci")
    private int d;

    @SerializedName("tac")
    private int e;

    @SerializedName("earfcn")
    private Integer f;

    public u() {
    }

    public u(int i, int i2, int i3, int i4, int i5, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = num;
    }
}
