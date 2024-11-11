package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c40 implements Serializable {

    @SerializedName("param")
    @Expose
    private e40[] b;

    @SerializedName("faultTrace")
    @Expose
    private d40 c;

    public final String toString() {
        return "Detail{param=" + Arrays.toString(this.b) + ", faultTrace=" + this.c + '}';
    }
}
