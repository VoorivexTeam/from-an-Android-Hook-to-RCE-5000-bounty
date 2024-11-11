package defpackage;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.gms.common.c;
import com.google.android.gms.common.h;

/* loaded from: classes.dex */
public class sr {
    protected final Intent a;

    public sr(String str) {
        Intent intent = new Intent(str);
        this.a = intent;
        intent.setPackage("com.google.android.gms");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Intent a(Activity activity) {
        Resources.Theme theme = activity.getTheme();
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        if (theme.resolveAttribute(R.attr.colorPrimary, typedValue, true) && !this.a.hasExtra("primary_color")) {
            this.a.putExtra("primary_color", typedValue.data);
        }
        if (theme.resolveAttribute(R.attr.colorPrimaryDark, typedValue2, true) && !this.a.hasExtra("primary_color_dark")) {
            this.a.putExtra("primary_color_dark", typedValue2.data);
        }
        c.a().c(activity, h.a);
        return this.a;
    }
}
