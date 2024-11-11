package p000;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.gms.common.C0993c;
import com.google.android.gms.common.C1006h;

/* renamed from: sr */
/* loaded from: classes.dex */
public class C3220sr {

    /* renamed from: a */
    protected final Intent f13142a;

    public C3220sr(String str) {
        Intent intent = new Intent(str);
        this.f13142a = intent;
        intent.setPackage("com.google.android.gms");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Intent mo15131a(Activity activity) {
        Resources.Theme theme = activity.getTheme();
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        if (theme.resolveAttribute(R.attr.colorPrimary, typedValue, true) && !this.f13142a.hasExtra("primary_color")) {
            this.f13142a.putExtra("primary_color", typedValue.data);
        }
        if (theme.resolveAttribute(R.attr.colorPrimaryDark, typedValue2, true) && !this.f13142a.hasExtra("primary_color_dark")) {
            this.f13142a.putExtra("primary_color_dark", typedValue2.data);
        }
        C0993c.m6949a().m6976c(activity, C1006h.f6075a);
        return this.f13142a;
    }
}
