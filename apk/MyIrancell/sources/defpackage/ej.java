package defpackage;

/* loaded from: classes.dex */
public class ej {
    private String a;
    private String b;
    private String c;
    private String d;
    private float e;
    private int f = 0;

    public ej(float f) {
        this.e = f;
    }

    public float a() {
        float parseFloat;
        float f;
        try {
            if (this.d == null) {
                return 0.0f;
            }
            String trim = this.d.trim();
            this.d = trim;
            if (!trim.contains("%")) {
                if (!this.d.contains("px") && !this.d.contains("PX")) {
                    parseFloat = Float.parseFloat(this.d);
                    f = (int) (parseFloat * this.e);
                }
                int indexOf = this.d.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.d.indexOf("PX");
                }
                parseFloat = Float.parseFloat(this.d.substring(0, indexOf).trim());
                f = (int) (parseFloat * this.e);
            } else {
                if (this.f <= 0) {
                    return 0.0f;
                }
                f = (Float.parseFloat(this.d.substring(0, this.d.indexOf("%")).trim()) * this.f) / 100.0f;
            }
            return f;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(String str) {
        this.d = str;
    }

    public float b() {
        float parseFloat;
        float f;
        try {
            if (this.a == null) {
                return 0.0f;
            }
            String trim = this.a.trim();
            this.a = trim;
            if (!trim.contains("%")) {
                if (!this.a.contains("px") && !this.a.contains("PX")) {
                    parseFloat = Float.parseFloat(this.a);
                    f = (int) (parseFloat * this.e);
                }
                int indexOf = this.a.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.a.indexOf("PX");
                }
                parseFloat = Float.parseFloat(this.a.substring(0, indexOf).trim());
                f = (int) (parseFloat * this.e);
            } else {
                if (this.f <= 0) {
                    return 0.0f;
                }
                f = (Float.parseFloat(this.a.substring(0, this.a.indexOf("%")).trim()) * this.f) / 100.0f;
            }
            return f;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public void b(String str) {
        this.a = str;
    }

    public float c() {
        float parseFloat;
        float f;
        try {
            if (this.c == null) {
                return 0.0f;
            }
            String trim = this.c.trim();
            this.c = trim;
            if (!trim.contains("%")) {
                if (!this.c.contains("px") && !this.c.contains("PX")) {
                    parseFloat = Float.parseFloat(this.c);
                    f = (int) (parseFloat * this.e);
                }
                int indexOf = this.c.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.c.indexOf("PX");
                }
                parseFloat = Float.parseFloat(this.c.substring(0, indexOf).trim());
                f = (int) (parseFloat * this.e);
            } else {
                if (this.f <= 0) {
                    return 0.0f;
                }
                f = (Float.parseFloat(this.c.substring(0, this.c.indexOf("%")).trim()) * this.f) / 100.0f;
            }
            return f;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public void c(String str) {
        this.c = str;
    }

    public float d() {
        float parseFloat;
        float f;
        try {
            if (this.b == null) {
                return 0.0f;
            }
            String trim = this.b.trim();
            this.b = trim;
            if (!trim.contains("%")) {
                if (!this.b.contains("px") && !this.b.contains("PX")) {
                    parseFloat = Float.parseFloat(this.b);
                    f = (int) (parseFloat * this.e);
                }
                int indexOf = this.b.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.b.indexOf("PX");
                }
                parseFloat = Float.parseFloat(this.b.substring(0, indexOf).trim());
                f = (int) (parseFloat * this.e);
            } else {
                if (this.f <= 0) {
                    return 0.0f;
                }
                f = (Float.parseFloat(this.b.substring(0, this.b.indexOf("%")).trim()) * this.f) / 100.0f;
            }
            return f;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public void d(String str) {
        this.b = str;
    }
}
