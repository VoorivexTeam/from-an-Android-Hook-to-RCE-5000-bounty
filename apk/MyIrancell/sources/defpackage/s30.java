package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public class s30 implements Serializable {

    @SerializedName("key")
    @Expose
    protected String b;

    @SerializedName("value")
    @Expose
    protected String c;

    public String a() {
        return this.b;
    }

    public void a(String str) {
        this.b = str;
    }

    public String b() {
        return this.c;
    }

    public void b(String str) {
        this.c = str;
    }

    public String toString() {
        return "ParameterType{key='" + this.b + "', value='" + this.c + "'}";
    }
}
