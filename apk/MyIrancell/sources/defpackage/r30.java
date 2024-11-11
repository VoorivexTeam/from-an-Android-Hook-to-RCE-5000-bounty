package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class r30 implements Serializable {

    @SerializedName("channelId")
    @Expose
    private int A;

    @SerializedName("clientTransactionId")
    @Expose
    private String B;

    @SerializedName("responseTransactionId")
    @Expose
    private String C;

    @SerializedName("requestTimeStamp")
    @Expose
    private String D;

    @SerializedName("responseTimeStamp")
    @Expose
    private String E;

    @SerializedName("originSystemUniqueId")
    @Expose
    private int F;

    @SerializedName("bankDetails")
    @Expose
    private v30[] G;

    @SerializedName("responseDesc")
    @Expose
    private String H;

    @SerializedName("transactionId")
    @Expose
    protected String b;

    @SerializedName("responseTime")
    @Expose
    protected String c;

    @SerializedName("resultCode")
    @Expose
    protected String d;

    @SerializedName("commandStatus")
    @Expose
    protected z30 e;

    @SerializedName("responseMsg")
    @Expose
    protected String f;

    @SerializedName("orderId")
    @Expose
    protected String g;

    @SerializedName("referenceId")
    @Expose
    protected String h;

    @SerializedName("amount")
    @Expose
    protected double i;

    @SerializedName("availableBalance")
    @Expose
    protected double j;

    @SerializedName("service")
    @Expose
    protected String k;

    @SerializedName("offerCode")
    @Expose
    protected String l;

    @SerializedName("redirectionURL")
    @Expose
    private String m;

    @SerializedName("callBackURL")
    @Expose
    private String n;

    @SerializedName("paymentModeList")
    @Expose
    private u30 o;

    @SerializedName("parameter")
    @Expose
    private t30 p;

    @SerializedName("parameterList")
    @Expose
    private t30 q;

    @SerializedName("failureMessage")
    @Expose
    private String r;

    @SerializedName("version")
    @Expose
    private String s;

    @SerializedName("bankId")
    @Expose
    private int t;

    @SerializedName("statusCode")
    @Expose
    private int u;

    @SerializedName("status")
    @Expose
    private String v;

    @SerializedName("detail")
    @Expose
    private c40 w;

    @SerializedName("corelationId")
    @Expose
    private long x;

    @SerializedName("ipsReferenceId")
    @Expose
    private String y;

    @SerializedName("authcode")
    @Expose
    private String z;

    public t30 a() {
        return this.p;
    }

    public void a(String str) {
        this.f = str;
    }

    public t30 b() {
        return this.q;
    }

    public String c() {
        return this.m;
    }

    public String d() {
        return this.h;
    }

    public String e() {
        return this.H;
    }

    public String f() {
        return this.f;
    }

    public String g() {
        return this.d;
    }

    public String toString() {
        return "MainResponse{transactionId='" + this.b + "', responseTime='" + this.c + "', resultCode='" + this.d + "', commandStatus=" + this.e + ", responseMsg='" + this.f + "', orderId='" + this.g + "', referenceId='" + this.h + "', amount=" + this.i + ", availableBalance=" + this.j + ", service='" + this.k + "', offerCode='" + this.l + "', redirectionURL='" + this.m + "', callBackURL='" + this.n + "', paymentModeList=" + this.o + ", parameter=" + this.p + ", parameterList=" + this.q + ", failureMessage='" + this.r + "', version='" + this.s + "', bankId=" + this.t + ", statusCode=" + this.u + ", status='" + this.v + "', detail=" + this.w + ", corelationId=" + this.x + ", ipsReferenceId='" + this.y + "', authcode='" + this.z + "', channelId=" + this.A + ", clientTransactionId='" + this.B + "', responseTransactionId='" + this.C + "', requestTimeStamp='" + this.D + "', responseTimeStamp='" + this.E + "', originSystemUniqueId=" + this.F + ", bankDetails=" + Arrays.toString(this.G) + ", responseDesc='" + this.H + "'}";
    }
}
