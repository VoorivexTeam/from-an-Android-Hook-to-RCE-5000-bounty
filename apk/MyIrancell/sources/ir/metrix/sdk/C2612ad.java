package ir.metrix.sdk;

import android.content.Context;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ir.metrix.sdk.ad */
/* loaded from: classes.dex */
public class C2612ad {

    /* renamed from: a */
    @SerializedName("sessionId")
    private String f10681a;

    /* renamed from: b */
    @SerializedName("sessionNum")
    private Integer f10682b;

    /* renamed from: c */
    @SerializedName("geoInfo")
    private C2630m f10683c;

    /* renamed from: d */
    @SerializedName("connectionInfo")
    private C2623f f10684d;

    /* renamed from: e */
    @SerializedName("locationListening")
    private transient boolean f10685e = true;

    /* renamed from: f */
    @SerializedName("firstUsage")
    private boolean f10686f = false;

    public C2612ad(Context context, String str, Integer num, boolean z) {
        m12537a(num);
        m12538a(str);
        m12536b(z);
        this.f10683c = new C2630m(context, this.f10685e);
        this.f10684d = new C2623f(context);
    }

    /* renamed from: b */
    private void m12536b(boolean z) {
        this.f10686f = z;
    }

    /* renamed from: a */
    public void m12537a(Integer num) {
        this.f10682b = num;
    }

    /* renamed from: a */
    public void m12538a(String str) {
        this.f10681a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12539a(boolean z) {
        this.f10685e = z;
    }

    /* renamed from: a */
    public boolean m12540a() {
        return this.f10686f;
    }
}
