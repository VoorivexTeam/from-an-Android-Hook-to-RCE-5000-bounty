package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class a40 implements Serializable {

    @SerializedName("hostRequest")
    @Expose
    public String b;

    @SerializedName("hostSigninRequest")
    @Expose
    public String c;

    @SerializedName("featureId")
    @Expose
    public int d;

    @SerializedName("addtionalInfo")
    @Expose
    public t30 e;

    public final String toString() {
        return "CommonSignedRequest{hostRequest='" + this.b + "', hostSigninRequest='" + this.c + "', featureId=" + this.d + ", parametersType=" + this.e + '}';
    }
}
