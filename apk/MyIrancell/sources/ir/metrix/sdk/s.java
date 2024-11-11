package ir.metrix.sdk;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
class s {

    @SerializedName("provider")
    private String a;

    @SerializedName("recordTime ")
    private Long b = null;

    @SerializedName("elapsedRealtimeNanos ")
    private Long c = null;

    @SerializedName("latitude ")
    private Double d = null;

    @SerializedName("longitude ")
    private Double e = null;

    @SerializedName("altitude ")
    private Double f = null;

    @SerializedName("speed ")
    private Float g = null;

    @SerializedName("bearing ")
    private Float h = null;

    @SerializedName("accuracy ")
    private Float i = null;

    @SerializedName("address")
    private n j;

    public void a(n nVar) {
        this.j = nVar;
    }

    public void a(Double d) {
        this.d = d;
    }

    public void a(Float f) {
        this.g = f;
    }

    public void a(Long l) {
        this.b = l;
    }

    public void a(String str) {
        this.a = ai.c(str);
    }

    public void b(Double d) {
        this.e = d;
    }

    public void b(Float f) {
        this.h = f;
    }

    public void b(Long l) {
        this.c = l;
    }

    public void c(Double d) {
        this.f = d;
    }

    public void c(Float f) {
        this.i = f;
    }
}
