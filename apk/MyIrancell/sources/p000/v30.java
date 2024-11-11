package p000;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class v30 implements Serializable {

    /* renamed from: b */
    @SerializedName("bankId")
    @Expose
    private int f13553b;

    /* renamed from: c */
    @SerializedName("bankName")
    @Expose
    private String f13554c;

    /* renamed from: d */
    @SerializedName("location")
    @Expose
    private String f13555d;

    /* renamed from: e */
    @SerializedName("url")
    @Expose
    private String f13556e;

    /* renamed from: f */
    @SerializedName("createdDate")
    @Expose
    private String f13557f;

    /* renamed from: g */
    @SerializedName("createdUser")
    @Expose
    private String f13558g;

    /* renamed from: h */
    @SerializedName("bankCode")
    @Expose
    private String f13559h;

    /* renamed from: i */
    @SerializedName("status")
    @Expose
    private int f13560i;

    /* renamed from: j */
    @SerializedName("classPath")
    @Expose
    private String f13561j;

    /* renamed from: k */
    @SerializedName("bankIcon")
    @Expose
    private String f13562k;

    /* renamed from: l */
    @SerializedName("bankRetryCount")
    @Expose
    private int f13563l;

    public final String toString() {
        return "BankDetails{bankId=" + this.f13553b + ", bankName='" + this.f13554c + "', location='" + this.f13555d + "', url='" + this.f13556e + "', createdDate='" + this.f13557f + "', createdUser='" + this.f13558g + "', bankCode='" + this.f13559h + "', status=" + this.f13560i + ", classPath='" + this.f13561j + "', bankIcon='" + this.f13562k + "', bankRetryCount=" + this.f13563l + '}';
    }
}
