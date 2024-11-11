package ir.metrix.sdk;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
class o {

    @SerializedName("networkId")
    private int a;

    @SerializedName("systemId")
    private int b;

    @SerializedName("basestationId")
    private int c;

    @SerializedName("longitude")
    private int d;

    @SerializedName("latitude")
    private int e;

    public o() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }
}
