package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class q30 {

    @SerializedName("channel")
    @Expose
    private String a;

    @SerializedName("requestTime")
    @Expose
    private String b;

    @SerializedName("orderId")
    @Expose
    private String c;

    @SerializedName("mid")
    @Expose
    private String d;

    @SerializedName("service")
    @Expose
    private String e;

    @SerializedName("referenceId")
    @Expose
    private String f;

    @SerializedName("paymentModeId")
    @Expose
    private String g;

    @SerializedName("boltonType")
    @Expose
    private String h;

    @SerializedName("offerCode")
    @Expose
    private String i;

    @SerializedName("mobileNumber")
    @Expose
    private String j;

    @SerializedName("emailId")
    @Expose
    private String k;

    @SerializedName("amount")
    @Expose
    private double l;

    @SerializedName("parameters")
    @Expose
    private t30 m;

    @SerializedName("productCode")
    @Expose
    private String n;

    @SerializedName("productCategory")
    @Expose
    private String o;

    @SerializedName("orderDetails")
    @Expose
    private String p;

    @SerializedName("callBackUrl")
    @Expose
    private String q;

    @SerializedName("checkSumHash")
    @Expose
    private String r;

    @SerializedName("requestType")
    @Expose
    private String s;

    @SerializedName("languageId")
    @Expose
    private String t;

    public String a() {
        return this.a;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.e;
    }

    public String toString() {
        return "CapturePaymentRequest{channel='" + this.a + "', requestTime='" + this.b + "', orderId='" + this.c + "', mid='" + this.d + "', service='" + this.e + "', referenceId='" + this.f + "', paymentModeId='" + this.g + "', boltonType='" + this.h + "', offerCode='" + this.i + "', mobileNumber='" + this.j + "', emailId='" + this.k + "', amount=" + this.l + ", parameters=" + this.m + ", productCode='" + this.n + "', productCategory='" + this.o + "', orderDetails='" + this.p + "', callBackUrl='" + this.q + "', checkSumHash='" + this.r + "', requestType='" + this.s + "', languageId='" + this.t + "'}";
    }
}
