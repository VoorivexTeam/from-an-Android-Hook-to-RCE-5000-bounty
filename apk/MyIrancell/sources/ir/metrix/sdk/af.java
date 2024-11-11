package ir.metrix.sdk;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes.dex */
class af extends l {

    @SerializedName("screenFlows")
    private List<String> a;

    @SerializedName("length")
    private Long b;

    @SerializedName("interval")
    private Long c;
    private transient long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public af(Context context, long j, long j2, List<String> list, long j3) {
        super(context, "session_stop", j);
        this.a = null;
        this.d = 1000L;
        this.b = Long.valueOf(j2);
        this.a = list;
        this.c = Long.valueOf(j3);
    }
}
