package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import androidx.appcompat.R$style;

/* renamed from: j */
/* loaded from: classes.dex */
public class C2794j extends ContextWrapper {

    /* renamed from: a */
    private int f11375a;

    /* renamed from: b */
    private Resources.Theme f11376b;

    /* renamed from: c */
    private LayoutInflater f11377c;

    /* renamed from: d */
    private Configuration f11378d;

    /* renamed from: e */
    private Resources f11379e;

    public C2794j() {
        super(null);
    }

    public C2794j(Context context, int i) {
        super(context);
        this.f11375a = i;
    }

    public C2794j(Context context, Resources.Theme theme) {
        super(context);
        this.f11376b = theme;
    }

    /* renamed from: b */
    private Resources m13272b() {
        Resources resources;
        if (this.f11379e == null) {
            Configuration configuration = this.f11378d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            }
            this.f11379e = resources;
        }
        return this.f11379e;
    }

    /* renamed from: c */
    private void m13273c() {
        boolean z = this.f11376b == null;
        if (z) {
            this.f11376b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f11376b.setTo(theme);
            }
        }
        m13275a(this.f11376b, this.f11375a, z);
    }

    /* renamed from: a */
    public int m13274a() {
        return this.f11375a;
    }

    /* renamed from: a */
    protected void m13275a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m13272b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f11377c == null) {
            this.f11377c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f11377c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f11376b;
        if (theme != null) {
            return theme;
        }
        if (this.f11375a == 0) {
            this.f11375a = R$style.Theme_AppCompat_Light;
        }
        m13273c();
        return this.f11376b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f11375a != i) {
            this.f11375a = i;
            m13273c();
        }
    }
}
