package ir.metrix.sdk;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
class e {

    @SerializedName("cid")
    private Integer a;

    @SerializedName("lac")
    private Integer b;

    @SerializedName("psc")
    private Integer c;

    @SerializedName("rssi")
    private Integer d;

    @SerializedName("networkType")
    private Integer e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = num5;
    }
}
