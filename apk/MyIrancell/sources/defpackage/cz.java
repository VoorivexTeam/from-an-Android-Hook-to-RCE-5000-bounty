package defpackage;

/* loaded from: classes.dex */
public final class cz extends ly {
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final char g;
    private final String h;

    public cz(String str, String str2, String str3, String str4, String str5, String str6, int i, char c, String str7) {
        super(my.VIN);
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = c;
        this.h = str7;
    }

    @Override // defpackage.ly
    public String a() {
        StringBuilder sb = new StringBuilder(50);
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        sb.append(' ');
        sb.append(this.d);
        sb.append('\n');
        String str = this.e;
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append(this.f);
        sb.append(' ');
        sb.append(this.g);
        sb.append(' ');
        sb.append(this.h);
        sb.append('\n');
        return sb.toString();
    }
}
