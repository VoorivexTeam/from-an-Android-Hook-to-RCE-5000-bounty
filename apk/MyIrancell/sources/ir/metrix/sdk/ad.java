package ir.metrix.sdk;

import android.content.Context;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ad {

    @SerializedName("sessionId")
    private String a;

    @SerializedName("sessionNum")
    private Integer b;

    @SerializedName("geoInfo")
    private m c;

    @SerializedName("connectionInfo")
    private f d;

    @SerializedName("locationListening")
    private transient boolean e = true;

    @SerializedName("firstUsage")
    private boolean f = false;

    public ad(Context context, String str, Integer num, boolean z) {
        a(num);
        a(str);
        b(z);
        this.c = new m(context, this.e);
        this.d = new f(context);
    }

    private void b(boolean z) {
        this.f = z;
    }

    public void a(Integer num) {
        this.b = num;
    }

    public void a(String str) {
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.e = z;
    }

    public boolean a() {
        return this.f;
    }
}
