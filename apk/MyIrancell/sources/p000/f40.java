package p000;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class f40 {

    /* renamed from: a */
    @SerializedName("service")
    @Expose
    public String f10068a;

    /* renamed from: b */
    @SerializedName("amount")
    @Expose
    public double f10069b;

    /* renamed from: c */
    @SerializedName("referenceId")
    @Expose
    public String f10070c;

    /* renamed from: d */
    @SerializedName("mobileNumber")
    @Expose
    public String f10071d;

    /* renamed from: e */
    @SerializedName("bankId")
    @Expose
    public String f10072e;

    /* renamed from: f */
    @SerializedName("signInData")
    @Expose
    public String f10073f;

    /* renamed from: g */
    @SerializedName("rawData")
    @Expose
    public String f10074g;

    /* renamed from: h */
    @SerializedName("requestTime")
    @Expose
    public String f10075h;

    /* renamed from: i */
    @SerializedName("channel")
    @Expose
    public String f10076i;

    /* renamed from: j */
    @SerializedName("mid")
    @Expose
    public String f10077j;

    /* renamed from: k */
    @SerializedName("orderId")
    @Expose
    public String f10078k;

    /* renamed from: l */
    @SerializedName("unqTxnId")
    @Expose
    public Long f10079l;

    /* renamed from: m */
    @SerializedName("statusCode")
    @Expose
    public int f10080m;

    /* renamed from: n */
    @SerializedName("parameters")
    @Expose
    public t30 f10081n;

    public final String toString() {
        return "PaymentStatusRequest{service='" + this.f10068a + "', amount=" + this.f10069b + ", referenceId='" + this.f10070c + "', mobileNumber='" + this.f10071d + "', bankId='" + this.f10072e + "', signInData='" + this.f10073f + "', rawData='" + this.f10074g + "', requestTime='" + this.f10075h + "', channel='" + this.f10076i + "', mid='" + this.f10077j + "', orderId='" + this.f10078k + "', unqTxnId=" + this.f10079l + ", statusCode=" + this.f10080m + ", parameters=" + this.f10081n + '}';
    }
}
