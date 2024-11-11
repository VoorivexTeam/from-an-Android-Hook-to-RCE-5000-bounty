package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$bool;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$styleable;

/* renamed from: g */
/* loaded from: classes.dex */
public class C2492g {

    /* renamed from: a */
    private Context f10173a;

    private C2492g(Context context) {
        this.f10173a = context;
    }

    /* renamed from: a */
    public static C2492g m11848a(Context context) {
        return new C2492g(context);
    }

    /* renamed from: a */
    public boolean m11849a() {
        return this.f10173a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: b */
    public int m11850b() {
        return this.f10173a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: c */
    public int m11851c() {
        Configuration configuration = this.f10173a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: d */
    public int m11852d() {
        return this.f10173a.getResources().getDimensionPixelSize(R$dimen.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: e */
    public int m11853e() {
        TypedArray obtainStyledAttributes = this.f10173a.obtainStyledAttributes(null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(R$styleable.ActionBar_height, 0);
        Resources resources = this.f10173a.getResources();
        if (!m11854f()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R$dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean m11854f() {
        return this.f10173a.getResources().getBoolean(R$bool.abc_action_bar_embed_tabs);
    }

    /* renamed from: g */
    public boolean m11855g() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f10173a).hasPermanentMenuKey();
    }
}
