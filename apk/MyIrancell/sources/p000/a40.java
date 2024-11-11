package p000;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class a40 implements Serializable {

    /* renamed from: b */
    @SerializedName("hostRequest")
    @Expose
    public String f30b;

    /* renamed from: c */
    @SerializedName("hostSigninRequest")
    @Expose
    public String f31c;

    /* renamed from: d */
    @SerializedName("featureId")
    @Expose
    public int f32d;

    /* renamed from: e */
    @SerializedName("addtionalInfo")
    @Expose
    public t30 f33e;

    public final String toString() {
        return "CommonSignedRequest{hostRequest='" + this.f30b + "', hostSigninRequest='" + this.f31c + "', featureId=" + this.f32d + ", parametersType=" + this.f33e + '}';
    }
}
