package ir.metrix.sdk;

import android.content.Context;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
class ah {

    @SerializedName("userId")
    private String a;

    @SerializedName("deviceInfo")
    private k b;

    @SerializedName("simInfo")
    private ag c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ah(Context context, String str) {
        this.a = str;
        this.b = new k(context);
        this.c = new ag(context);
    }
}
