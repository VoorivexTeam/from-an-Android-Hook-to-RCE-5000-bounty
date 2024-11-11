package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class v30 implements Serializable {

    @SerializedName("bankId")
    @Expose
    private int b;

    @SerializedName("bankName")
    @Expose
    private String c;

    @SerializedName("location")
    @Expose
    private String d;

    @SerializedName("url")
    @Expose
    private String e;

    @SerializedName("createdDate")
    @Expose
    private String f;

    @SerializedName("createdUser")
    @Expose
    private String g;

    @SerializedName("bankCode")
    @Expose
    private String h;

    @SerializedName("status")
    @Expose
    private int i;

    @SerializedName("classPath")
    @Expose
    private String j;

    @SerializedName("bankIcon")
    @Expose
    private String k;

    @SerializedName("bankRetryCount")
    @Expose
    private int l;

    public final String toString() {
        return "BankDetails{bankId=" + this.b + ", bankName='" + this.c + "', location='" + this.d + "', url='" + this.e + "', createdDate='" + this.f + "', createdUser='" + this.g + "', bankCode='" + this.h + "', status=" + this.i + ", classPath='" + this.j + "', bankIcon='" + this.k + "', bankRetryCount=" + this.l + '}';
    }
}
