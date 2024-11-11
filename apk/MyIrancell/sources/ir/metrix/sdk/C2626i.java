package ir.metrix.sdk;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* renamed from: ir.metrix.sdk.i */
/* loaded from: classes.dex */
class C2626i extends AbstractC2629l {

    /* renamed from: a */
    @SerializedName("customName")
    private String f10728a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2626i(Context context, long j, String str) {
        super(context, "custom", j);
        m12570a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2626i(Context context, long j, Map<String, String> map, Map<String, Double> map2, String str) {
        super(context, "custom", j, map, map2);
        this.f10728a = str;
    }

    /* renamed from: a */
    void m12570a(String str) {
        this.f10728a = str;
    }
}
