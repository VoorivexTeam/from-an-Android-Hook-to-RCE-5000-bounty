package ir.metrix.sdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c {
    private String a;
    private Boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str, Boolean bool) {
        a(str);
        a(bool);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.a;
    }

    void a(Boolean bool) {
        this.b = bool;
    }

    void a(String str) {
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean b() {
        return this.b;
    }
}
