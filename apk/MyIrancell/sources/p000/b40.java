package p000;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class b40 {

    /* renamed from: a */
    @SerializedName("hostResponse")
    @Expose
    public String f2721a;

    /* renamed from: b */
    @SerializedName("hostSigninResponse")
    @Expose
    public String f2722b;

    /* renamed from: c */
    @SerializedName("sdkRespCode")
    @Expose
    public String f2723c;

    /* renamed from: d */
    @SerializedName("hostResponseStatus")
    @Expose
    public int f2724d;

    public final String toString() {
        return "CommonSignedResponse{hostResponse='" + this.f2721a + "', hostSigninResponse='" + this.f2722b + "', sdkRespCode='" + this.f2723c + "', hostResponseStatus=" + this.f2724d + '}';
    }
}
