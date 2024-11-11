package p000;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c40 implements Serializable {

    /* renamed from: b */
    @SerializedName("param")
    @Expose
    private e40[] f2942b;

    /* renamed from: c */
    @SerializedName("faultTrace")
    @Expose
    private d40 f2943c;

    public final String toString() {
        return "Detail{param=" + Arrays.toString(this.f2942b) + ", faultTrace=" + this.f2943c + '}';
    }
}
