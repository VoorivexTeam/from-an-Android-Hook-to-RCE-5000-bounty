package androidx.transition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class t extends z implements v {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t a(ViewGroup viewGroup) {
        return (t) z.c(viewGroup);
    }

    @Override // androidx.transition.v
    public void a(View view) {
        this.a.a(view);
    }

    @Override // androidx.transition.v
    public void b(View view) {
        this.a.b(view);
    }
}
