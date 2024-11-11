package ir.metrix.sdk;

import android.content.Context;
import com.google.gson.annotations.SerializedName;

/* renamed from: ir.metrix.sdk.ah */
/* loaded from: classes.dex */
class C2616ah {

    /* renamed from: a */
    @SerializedName("userId")
    private String f10695a;

    /* renamed from: b */
    @SerializedName("deviceInfo")
    private C2628k f10696b;

    /* renamed from: c */
    @SerializedName("simInfo")
    private C2615ag f10697c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2616ah(Context context, String str) {
        this.f10695a = str;
        this.f10696b = new C2628k(context);
        this.f10697c = new C2615ag(context);
    }
}
