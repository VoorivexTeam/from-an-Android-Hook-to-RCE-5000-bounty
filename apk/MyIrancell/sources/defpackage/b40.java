package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class b40 {

    @SerializedName("hostResponse")
    @Expose
    public String a;

    @SerializedName("hostSigninResponse")
    @Expose
    public String b;

    @SerializedName("sdkRespCode")
    @Expose
    public String c;

    @SerializedName("hostResponseStatus")
    @Expose
    public int d;

    public final String toString() {
        return "CommonSignedResponse{hostResponse='" + this.a + "', hostSigninResponse='" + this.b + "', sdkRespCode='" + this.c + "', hostResponseStatus=" + this.d + '}';
    }
}
