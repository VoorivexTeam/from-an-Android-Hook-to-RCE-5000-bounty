package ir.metrix.sdk;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* loaded from: classes.dex */
class i extends l {

    @SerializedName("customName")
    private String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Context context, long j, String str) {
        super(context, "custom", j);
        a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Context context, long j, Map<String, String> map, Map<String, Double> map2, String str) {
        super(context, "custom", j, map, map2);
        this.a = str;
    }

    void a(String str) {
        this.a = str;
    }
}
