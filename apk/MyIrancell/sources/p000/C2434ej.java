package p000;

/* renamed from: ej */
/* loaded from: classes.dex */
public class C2434ej {

    /* renamed from: a */
    private String f10018a;

    /* renamed from: b */
    private String f10019b;

    /* renamed from: c */
    private String f10020c;

    /* renamed from: d */
    private String f10021d;

    /* renamed from: e */
    private float f10022e;

    /* renamed from: f */
    private int f10023f = 0;

    public C2434ej(float f) {
        this.f10022e = f;
    }

    /* renamed from: a */
    public float m11614a() {
        float parseFloat;
        float f;
        try {
            if (this.f10021d == null) {
                return 0.0f;
            }
            String trim = this.f10021d.trim();
            this.f10021d = trim;
            if (!trim.contains("%")) {
                if (!this.f10021d.contains("px") && !this.f10021d.contains("PX")) {
                    parseFloat = Float.parseFloat(this.f10021d);
                    f = (int) (parseFloat * this.f10022e);
                }
                int indexOf = this.f10021d.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f10021d.indexOf("PX");
                }
                parseFloat = Float.parseFloat(this.f10021d.substring(0, indexOf).trim());
                f = (int) (parseFloat * this.f10022e);
            } else {
                if (this.f10023f <= 0) {
                    return 0.0f;
                }
                f = (Float.parseFloat(this.f10021d.substring(0, this.f10021d.indexOf("%")).trim()) * this.f10023f) / 100.0f;
            }
            return f;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    /* renamed from: a */
    public void m11615a(int i) {
        this.f10023f = i;
    }

    /* renamed from: a */
    public void m11616a(String str) {
        this.f10021d = str;
    }

    /* renamed from: b */
    public float m11617b() {
        float parseFloat;
        float f;
        try {
            if (this.f10018a == null) {
                return 0.0f;
            }
            String trim = this.f10018a.trim();
            this.f10018a = trim;
            if (!trim.contains("%")) {
                if (!this.f10018a.contains("px") && !this.f10018a.contains("PX")) {
                    parseFloat = Float.parseFloat(this.f10018a);
                    f = (int) (parseFloat * this.f10022e);
                }
                int indexOf = this.f10018a.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f10018a.indexOf("PX");
                }
                parseFloat = Float.parseFloat(this.f10018a.substring(0, indexOf).trim());
                f = (int) (parseFloat * this.f10022e);
            } else {
                if (this.f10023f <= 0) {
                    return 0.0f;
                }
                f = (Float.parseFloat(this.f10018a.substring(0, this.f10018a.indexOf("%")).trim()) * this.f10023f) / 100.0f;
            }
            return f;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    /* renamed from: b */
    public void m11618b(String str) {
        this.f10018a = str;
    }

    /* renamed from: c */
    public float m11619c() {
        float parseFloat;
        float f;
        try {
            if (this.f10020c == null) {
                return 0.0f;
            }
            String trim = this.f10020c.trim();
            this.f10020c = trim;
            if (!trim.contains("%")) {
                if (!this.f10020c.contains("px") && !this.f10020c.contains("PX")) {
                    parseFloat = Float.parseFloat(this.f10020c);
                    f = (int) (parseFloat * this.f10022e);
                }
                int indexOf = this.f10020c.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f10020c.indexOf("PX");
                }
                parseFloat = Float.parseFloat(this.f10020c.substring(0, indexOf).trim());
                f = (int) (parseFloat * this.f10022e);
            } else {
                if (this.f10023f <= 0) {
                    return 0.0f;
                }
                f = (Float.parseFloat(this.f10020c.substring(0, this.f10020c.indexOf("%")).trim()) * this.f10023f) / 100.0f;
            }
            return f;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    /* renamed from: c */
    public void m11620c(String str) {
        this.f10020c = str;
    }

    /* renamed from: d */
    public float m11621d() {
        float parseFloat;
        float f;
        try {
            if (this.f10019b == null) {
                return 0.0f;
            }
            String trim = this.f10019b.trim();
            this.f10019b = trim;
            if (!trim.contains("%")) {
                if (!this.f10019b.contains("px") && !this.f10019b.contains("PX")) {
                    parseFloat = Float.parseFloat(this.f10019b);
                    f = (int) (parseFloat * this.f10022e);
                }
                int indexOf = this.f10019b.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f10019b.indexOf("PX");
                }
                parseFloat = Float.parseFloat(this.f10019b.substring(0, indexOf).trim());
                f = (int) (parseFloat * this.f10022e);
            } else {
                if (this.f10023f <= 0) {
                    return 0.0f;
                }
                f = (Float.parseFloat(this.f10019b.substring(0, this.f10019b.indexOf("%")).trim()) * this.f10023f) / 100.0f;
            }
            return f;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    /* renamed from: d */
    public void m11622d(String str) {
        this.f10019b = str;
    }
}
