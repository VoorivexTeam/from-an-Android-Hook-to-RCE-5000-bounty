package p000;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class q30 {

    /* renamed from: a */
    @SerializedName("channel")
    @Expose
    private String f12673a;

    /* renamed from: b */
    @SerializedName("requestTime")
    @Expose
    private String f12674b;

    /* renamed from: c */
    @SerializedName("orderId")
    @Expose
    private String f12675c;

    /* renamed from: d */
    @SerializedName("mid")
    @Expose
    private String f12676d;

    /* renamed from: e */
    @SerializedName("service")
    @Expose
    private String f12677e;

    /* renamed from: f */
    @SerializedName("referenceId")
    @Expose
    private String f12678f;

    /* renamed from: g */
    @SerializedName("paymentModeId")
    @Expose
    private String f12679g;

    /* renamed from: h */
    @SerializedName("boltonType")
    @Expose
    private String f12680h;

    /* renamed from: i */
    @SerializedName("offerCode")
    @Expose
    private String f12681i;

    /* renamed from: j */
    @SerializedName("mobileNumber")
    @Expose
    private String f12682j;

    /* renamed from: k */
    @SerializedName("emailId")
    @Expose
    private String f12683k;

    /* renamed from: l */
    @SerializedName("amount")
    @Expose
    private double f12684l;

    /* renamed from: m */
    @SerializedName("parameters")
    @Expose
    private t30 f12685m;

    /* renamed from: n */
    @SerializedName("productCode")
    @Expose
    private String f12686n;

    /* renamed from: o */
    @SerializedName("productCategory")
    @Expose
    private String f12687o;

    /* renamed from: p */
    @SerializedName("orderDetails")
    @Expose
    private String f12688p;

    /* renamed from: q */
    @SerializedName("callBackUrl")
    @Expose
    private String f12689q;

    /* renamed from: r */
    @SerializedName("checkSumHash")
    @Expose
    private String f12690r;

    /* renamed from: s */
    @SerializedName("requestType")
    @Expose
    private String f12691s;

    /* renamed from: t */
    @SerializedName("languageId")
    @Expose
    private String f12692t;

    /* renamed from: a */
    public String m14948a() {
        return this.f12673a;
    }

    /* renamed from: b */
    public String m14949b() {
        return this.f12676d;
    }

    /* renamed from: c */
    public String m14950c() {
        return this.f12678f;
    }

    /* renamed from: d */
    public String m14951d() {
        return this.f12677e;
    }

    public String toString() {
        return "CapturePaymentRequest{channel='" + this.f12673a + "', requestTime='" + this.f12674b + "', orderId='" + this.f12675c + "', mid='" + this.f12676d + "', service='" + this.f12677e + "', referenceId='" + this.f12678f + "', paymentModeId='" + this.f12679g + "', boltonType='" + this.f12680h + "', offerCode='" + this.f12681i + "', mobileNumber='" + this.f12682j + "', emailId='" + this.f12683k + "', amount=" + this.f12684l + ", parameters=" + this.f12685m + ", productCode='" + this.f12686n + "', productCategory='" + this.f12687o + "', orderDetails='" + this.f12688p + "', callBackUrl='" + this.f12689q + "', checkSumHash='" + this.f12690r + "', requestType='" + this.f12691s + "', languageId='" + this.f12692t + "'}";
    }
}
