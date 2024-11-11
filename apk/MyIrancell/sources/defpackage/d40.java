package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class d40 implements Serializable {

    @SerializedName("faultSystemId")
    @Expose
    private int b;

    @SerializedName("faultMsg")
    @Expose
    private String c;

    @SerializedName("faultSystemErrorCode")
    @Expose
    private String d;

    public final String toString() {
        return "FaultTrace{faultSystemId=" + this.b + ", faultMsg='" + this.c + "', faultSystemErrorCode='" + this.d + "'}";
    }
}
