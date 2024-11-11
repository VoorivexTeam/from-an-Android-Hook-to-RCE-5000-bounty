package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class gx implements View.OnClickListener {
    private final hx b;
    private final int c;

    public gx(hx hxVar, int i) {
        this.b = hxVar;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.b.b(this.c);
    }
}
