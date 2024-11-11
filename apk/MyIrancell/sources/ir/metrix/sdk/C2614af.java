package ir.metrix.sdk;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ir.metrix.sdk.af */
/* loaded from: classes.dex */
class C2614af extends AbstractC2629l {

    /* renamed from: a */
    @SerializedName("screenFlows")
    private List<String> f10687a;

    /* renamed from: b */
    @SerializedName("length")
    private Long f10688b;

    /* renamed from: c */
    @SerializedName("interval")
    private Long f10689c;

    /* renamed from: d */
    private transient long f10690d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2614af(Context context, long j, long j2, List<String> list, long j3) {
        super(context, "session_stop", j);
        this.f10687a = null;
        this.f10690d = 1000L;
        this.f10688b = Long.valueOf(j2);
        this.f10687a = list;
        this.f10689c = Long.valueOf(j3);
    }
}
