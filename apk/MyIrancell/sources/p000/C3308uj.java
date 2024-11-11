package p000;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: uj */
/* loaded from: classes.dex */
public class C3308uj {

    /* renamed from: a */
    private Pattern f13487a;

    /* renamed from: b */
    private String f13488b;

    /* renamed from: c */
    private String f13489c;

    /* renamed from: d */
    private String f13490d;

    /* renamed from: e */
    private String f13491e;

    /* renamed from: f */
    private boolean f13492f = false;

    /* renamed from: g */
    private boolean f13493g = false;

    /* renamed from: h */
    private int f13494h = -1;

    /* renamed from: a */
    public String m15829a() {
        return this.f13491e;
    }

    /* renamed from: a */
    public void m15830a(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length());
        }
        this.f13491e = str;
        this.f13493g = true;
    }

    /* renamed from: a */
    public void m15831a(boolean z) {
        this.f13492f = z;
    }

    /* renamed from: a */
    public boolean m15832a(String str, String str2) {
        Pattern pattern = this.f13487a;
        return pattern != null ? pattern.matcher(str).find() : !TextUtils.isEmpty(str2) && str.equals(str2);
    }

    /* renamed from: b */
    public String m15833b() {
        return this.f13489c;
    }

    /* renamed from: b */
    public void m15834b(String str) {
        this.f13489c = str;
    }

    /* renamed from: c */
    public int m15835c() {
        return this.f13494h;
    }

    /* renamed from: c */
    public void m15836c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f13494h = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: d */
    public String m15837d() {
        return this.f13490d;
    }

    /* renamed from: d */
    public void m15838d(String str) {
        this.f13487a = Pattern.compile(str);
    }

    /* renamed from: e */
    public String m15839e() {
        return this.f13488b;
    }

    /* renamed from: e */
    public void m15840e(String str) {
        this.f13490d = str;
    }

    /* renamed from: f */
    public void m15841f(String str) {
        this.f13488b = str;
    }

    /* renamed from: f */
    public boolean m15842f() {
        return this.f13492f;
    }

    /* renamed from: g */
    public boolean m15843g() {
        return this.f13493g;
    }
}
