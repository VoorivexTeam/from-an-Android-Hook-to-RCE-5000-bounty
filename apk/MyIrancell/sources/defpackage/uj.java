package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class uj {
    private Pattern a;
    private String b;
    private String c;
    private String d;
    private String e;
    private boolean f = false;
    private boolean g = false;
    private int h = -1;

    public String a() {
        return this.e;
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length());
        }
        this.e = str;
        this.g = true;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public boolean a(String str, String str2) {
        Pattern pattern = this.a;
        return pattern != null ? pattern.matcher(str).find() : !TextUtils.isEmpty(str2) && str.equals(str2);
    }

    public String b() {
        return this.c;
    }

    public void b(String str) {
        this.c = str;
    }

    public int c() {
        return this.h;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.h = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
    }

    public String d() {
        return this.d;
    }

    public void d(String str) {
        this.a = Pattern.compile(str);
    }

    public String e() {
        return this.b;
    }

    public void e(String str) {
        this.d = str;
    }

    public void f(String str) {
        this.b = str;
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }
}
