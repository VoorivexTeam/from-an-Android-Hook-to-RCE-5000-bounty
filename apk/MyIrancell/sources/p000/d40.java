package p000;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class d40 implements Serializable {

    /* renamed from: b */
    @SerializedName("faultSystemId")
    @Expose
    private int f9698b;

    /* renamed from: c */
    @SerializedName("faultMsg")
    @Expose
    private String f9699c;

    /* renamed from: d */
    @SerializedName("faultSystemErrorCode")
    @Expose
    private String f9700d;

    public final String toString() {
        return "FaultTrace{faultSystemId=" + this.f9698b + ", faultMsg='" + this.f9699c + "', faultSystemErrorCode='" + this.f9700d + "'}";
    }
}
