package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class f40 {

    @SerializedName("service")
    @Expose
    public String a;

    @SerializedName("amount")
    @Expose
    public double b;

    @SerializedName("referenceId")
    @Expose
    public String c;

    @SerializedName("mobileNumber")
    @Expose
    public String d;

    @SerializedName("bankId")
    @Expose
    public String e;

    @SerializedName("signInData")
    @Expose
    public String f;

    @SerializedName("rawData")
    @Expose
    public String g;

    @SerializedName("requestTime")
    @Expose
    public String h;

    @SerializedName("channel")
    @Expose
    public String i;

    @SerializedName("mid")
    @Expose
    public String j;

    @SerializedName("orderId")
    @Expose
    public String k;

    @SerializedName("unqTxnId")
    @Expose
    public Long l;

    @SerializedName("statusCode")
    @Expose
    public int m;

    @SerializedName("parameters")
    @Expose
    public t30 n;

    public final String toString() {
        return "PaymentStatusRequest{service='" + this.a + "', amount=" + this.b + ", referenceId='" + this.c + "', mobileNumber='" + this.d + "', bankId='" + this.e + "', signInData='" + this.f + "', rawData='" + this.g + "', requestTime='" + this.h + "', channel='" + this.i + "', mid='" + this.j + "', orderId='" + this.k + "', unqTxnId=" + this.l + ", statusCode=" + this.m + ", parameters=" + this.n + '}';
    }
}
