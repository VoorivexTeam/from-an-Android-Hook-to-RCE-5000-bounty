package p000;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class r30 implements Serializable {

    /* renamed from: A */
    @SerializedName("channelId")
    @Expose
    private int f12867A;

    /* renamed from: B */
    @SerializedName("clientTransactionId")
    @Expose
    private String f12868B;

    /* renamed from: C */
    @SerializedName("responseTransactionId")
    @Expose
    private String f12869C;

    /* renamed from: D */
    @SerializedName("requestTimeStamp")
    @Expose
    private String f12870D;

    /* renamed from: E */
    @SerializedName("responseTimeStamp")
    @Expose
    private String f12871E;

    /* renamed from: F */
    @SerializedName("originSystemUniqueId")
    @Expose
    private int f12872F;

    /* renamed from: G */
    @SerializedName("bankDetails")
    @Expose
    private v30[] f12873G;

    /* renamed from: H */
    @SerializedName("responseDesc")
    @Expose
    private String f12874H;

    /* renamed from: b */
    @SerializedName("transactionId")
    @Expose
    protected String f12875b;

    /* renamed from: c */
    @SerializedName("responseTime")
    @Expose
    protected String f12876c;

    /* renamed from: d */
    @SerializedName("resultCode")
    @Expose
    protected String f12877d;

    /* renamed from: e */
    @SerializedName("commandStatus")
    @Expose
    protected z30 f12878e;

    /* renamed from: f */
    @SerializedName("responseMsg")
    @Expose
    protected String f12879f;

    /* renamed from: g */
    @SerializedName("orderId")
    @Expose
    protected String f12880g;

    /* renamed from: h */
    @SerializedName("referenceId")
    @Expose
    protected String f12881h;

    /* renamed from: i */
    @SerializedName("amount")
    @Expose
    protected double f12882i;

    /* renamed from: j */
    @SerializedName("availableBalance")
    @Expose
    protected double f12883j;

    /* renamed from: k */
    @SerializedName("service")
    @Expose
    protected String f12884k;

    /* renamed from: l */
    @SerializedName("offerCode")
    @Expose
    protected String f12885l;

    /* renamed from: m */
    @SerializedName("redirectionURL")
    @Expose
    private String f12886m;

    /* renamed from: n */
    @SerializedName("callBackURL")
    @Expose
    private String f12887n;

    /* renamed from: o */
    @SerializedName("paymentModeList")
    @Expose
    private u30 f12888o;

    /* renamed from: p */
    @SerializedName("parameter")
    @Expose
    private t30 f12889p;

    /* renamed from: q */
    @SerializedName("parameterList")
    @Expose
    private t30 f12890q;

    /* renamed from: r */
    @SerializedName("failureMessage")
    @Expose
    private String f12891r;

    /* renamed from: s */
    @SerializedName("version")
    @Expose
    private String f12892s;

    /* renamed from: t */
    @SerializedName("bankId")
    @Expose
    private int f12893t;

    /* renamed from: u */
    @SerializedName("statusCode")
    @Expose
    private int f12894u;

    /* renamed from: v */
    @SerializedName("status")
    @Expose
    private String f12895v;

    /* renamed from: w */
    @SerializedName("detail")
    @Expose
    private c40 f12896w;

    /* renamed from: x */
    @SerializedName("corelationId")
    @Expose
    private long f12897x;

    /* renamed from: y */
    @SerializedName("ipsReferenceId")
    @Expose
    private String f12898y;

    /* renamed from: z */
    @SerializedName("authcode")
    @Expose
    private String f12899z;

    /* renamed from: a */
    public t30 m15189a() {
        return this.f12889p;
    }

    /* renamed from: a */
    public void m15190a(String str) {
        this.f12879f = str;
    }

    /* renamed from: b */
    public t30 m15191b() {
        return this.f12890q;
    }

    /* renamed from: c */
    public String m15192c() {
        return this.f12886m;
    }

    /* renamed from: d */
    public String m15193d() {
        return this.f12881h;
    }

    /* renamed from: e */
    public String m15194e() {
        return this.f12874H;
    }

    /* renamed from: f */
    public String m15195f() {
        return this.f12879f;
    }

    /* renamed from: g */
    public String m15196g() {
        return this.f12877d;
    }

    public String toString() {
        return "MainResponse{transactionId='" + this.f12875b + "', responseTime='" + this.f12876c + "', resultCode='" + this.f12877d + "', commandStatus=" + this.f12878e + ", responseMsg='" + this.f12879f + "', orderId='" + this.f12880g + "', referenceId='" + this.f12881h + "', amount=" + this.f12882i + ", availableBalance=" + this.f12883j + ", service='" + this.f12884k + "', offerCode='" + this.f12885l + "', redirectionURL='" + this.f12886m + "', callBackURL='" + this.f12887n + "', paymentModeList=" + this.f12888o + ", parameter=" + this.f12889p + ", parameterList=" + this.f12890q + ", failureMessage='" + this.f12891r + "', version='" + this.f12892s + "', bankId=" + this.f12893t + ", statusCode=" + this.f12894u + ", status='" + this.f12895v + "', detail=" + this.f12896w + ", corelationId=" + this.f12897x + ", ipsReferenceId='" + this.f12898y + "', authcode='" + this.f12899z + "', channelId=" + this.f12867A + ", clientTransactionId='" + this.f12868B + "', responseTransactionId='" + this.f12869C + "', requestTimeStamp='" + this.f12870D + "', responseTimeStamp='" + this.f12871E + "', originSystemUniqueId=" + this.f12872F + ", bankDetails=" + Arrays.toString(this.f12873G) + ", responseDesc='" + this.f12874H + "'}";
    }
}
