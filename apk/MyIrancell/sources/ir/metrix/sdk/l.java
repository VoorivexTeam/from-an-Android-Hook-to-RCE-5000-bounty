package ir.metrix.sdk;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class l {

    @SerializedName("eventType")
    private String a;

    @SerializedName("timestamp")
    private String b;

    @SerializedName("userInfo")
    private ah c;

    @SerializedName("appInfo")
    private d d;

    @SerializedName("sessionInfo")
    private ad e;

    @SerializedName("customAttributes")
    private Map<String, String> f;

    @SerializedName("customMetrics")
    private Map<String, Double> g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Context context, String str, long j) {
        this(context, str, j, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Context context, String str, long j, Map<String, String> map, Map<String, Double> map2) {
        b(str);
        a(String.valueOf(j));
        this.d = new d(context, "android", w.a().b());
        this.e = null;
        this.f = map == null ? new HashMap<>() : map;
        this.g = map2 == null ? new HashMap<>() : map2;
        this.c = new ah(context, null);
    }

    private void a(String str) {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        Long valueOf2 = Long.valueOf(valueOf.longValue() - Long.parseLong(str));
        if (valueOf2.longValue() >= 172800000 || valueOf2.longValue() < 0) {
            str = valueOf.toString();
        }
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ad adVar) {
        this.e = adVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Map<String, String> map) {
        if (this.f == null) {
            this.f = new HashMap();
        }
        if (map != null) {
            this.f.putAll(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ad b() {
        return this.e;
    }

    void b(String str) {
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Map<String, Double> map) {
        if (this.g == null) {
            this.g = new HashMap();
        }
        if (map != null) {
            this.g.putAll(map);
        }
    }
}
