package p000;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public class s30 implements Serializable {

    /* renamed from: b */
    @SerializedName("key")
    @Expose
    protected String f13021b;

    /* renamed from: c */
    @SerializedName("value")
    @Expose
    protected String f13022c;

    /* renamed from: a */
    public String m15350a() {
        return this.f13021b;
    }

    /* renamed from: a */
    public void m15351a(String str) {
        this.f13021b = str;
    }

    /* renamed from: b */
    public String m15352b() {
        return this.f13022c;
    }

    /* renamed from: b */
    public void m15353b(String str) {
        this.f13022c = str;
    }

    public String toString() {
        return "ParameterType{key='" + this.f13021b + "', value='" + this.f13022c + "'}";
    }
}
