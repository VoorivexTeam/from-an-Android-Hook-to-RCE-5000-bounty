package ir.metrix.sdk;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ir.metrix.sdk.l */
/* loaded from: classes.dex */
public abstract class AbstractC2629l {

    /* renamed from: a */
    @SerializedName("eventType")
    private String f10760a;

    /* renamed from: b */
    @SerializedName("timestamp")
    private String f10761b;

    /* renamed from: c */
    @SerializedName("userInfo")
    private C2616ah f10762c;

    /* renamed from: d */
    @SerializedName("appInfo")
    private C2621d f10763d;

    /* renamed from: e */
    @SerializedName("sessionInfo")
    private C2612ad f10764e;

    /* renamed from: f */
    @SerializedName("customAttributes")
    private Map<String, String> f10765f;

    /* renamed from: g */
    @SerializedName("customMetrics")
    private Map<String, Double> f10766g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2629l(Context context, String str, long j) {
        this(context, str, j, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2629l(Context context, String str, long j, Map<String, String> map, Map<String, Double> map2) {
        m12646b(str);
        m12641a(String.valueOf(j));
        this.f10763d = new C2621d(context, "android", C2644w.m12685a().m12687b());
        this.f10764e = null;
        this.f10765f = map == null ? new HashMap<>() : map;
        this.f10766g = map2 == null ? new HashMap<>() : map2;
        this.f10762c = new C2616ah(context, null);
    }

    /* renamed from: a */
    private void m12641a(String str) {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        Long valueOf2 = Long.valueOf(valueOf.longValue() - Long.parseLong(str));
        if (valueOf2.longValue() >= 172800000 || valueOf2.longValue() < 0) {
            str = valueOf.toString();
        }
        this.f10761b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m12642a() {
        return this.f10760a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12643a(C2612ad c2612ad) {
        this.f10764e = c2612ad;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12644a(Map<String, String> map) {
        if (this.f10765f == null) {
            this.f10765f = new HashMap();
        }
        if (map != null) {
            this.f10765f.putAll(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C2612ad m12645b() {
        return this.f10764e;
    }

    /* renamed from: b */
    void m12646b(String str) {
        this.f10760a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m12647b(Map<String, Double> map) {
        if (this.f10766g == null) {
            this.f10766g = new HashMap();
        }
        if (map != null) {
            this.f10766g.putAll(map);
        }
    }
}
