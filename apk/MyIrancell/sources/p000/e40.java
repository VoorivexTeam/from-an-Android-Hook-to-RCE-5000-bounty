package p000;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class e40 implements Serializable {

    /* renamed from: b */
    @SerializedName("name")
    @Expose
    private String f9924b;

    /* renamed from: c */
    @SerializedName("value")
    @Expose
    private String f9925c;

    public final String toString() {
        return "Param{name='" + this.f9924b + "', value='" + this.f9925c + "'}";
    }
}
