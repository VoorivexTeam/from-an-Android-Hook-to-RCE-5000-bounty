package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public class t30 implements Serializable {

    @SerializedName("parameter")
    @Expose
    protected List<s30> b;

    public List<s30> a() {
        return this.b;
    }

    public void a(List<s30> list) {
        this.b = list;
    }

    public String toString() {
        return "ParametersType{parameter=" + this.b + '}';
    }
}
