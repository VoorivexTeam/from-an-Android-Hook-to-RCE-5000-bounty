package p000;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public class t30 implements Serializable {

    /* renamed from: b */
    @SerializedName("parameter")
    @Expose
    protected List<s30> f13184b;

    /* renamed from: a */
    public List<s30> m15510a() {
        return this.f13184b;
    }

    /* renamed from: a */
    public void m15511a(List<s30> list) {
        this.f13184b = list;
    }

    public String toString() {
        return "ParametersType{parameter=" + this.f13184b + '}';
    }
}
