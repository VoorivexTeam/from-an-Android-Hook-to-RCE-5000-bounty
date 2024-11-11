package defpackage;

import android.app.Application;
import android.content.Context;

/* loaded from: classes.dex */
public class y3 extends Application {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        x3.c(this);
    }
}
