package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class e40 implements Serializable {

    @SerializedName("name")
    @Expose
    private String b;

    @SerializedName("value")
    @Expose
    private String c;

    public final String toString() {
        return "Param{name='" + this.b + "', value='" + this.c + "'}";
    }
}
