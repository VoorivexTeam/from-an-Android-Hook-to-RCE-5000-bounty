package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.k;
import defpackage.a2;
import defpackage.b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l extends k {

    /* loaded from: classes.dex */
    class a extends k.a implements ActionProvider.VisibilityListener {
        a2.b d;

        public a(l lVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // defpackage.a2
        public View a(MenuItem menuItem) {
            return this.b.onCreateActionView(menuItem);
        }

        @Override // defpackage.a2
        public void a(a2.b bVar) {
            this.d = bVar;
            this.b.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // defpackage.a2
        public boolean b() {
            return this.b.isVisible();
        }

        @Override // defpackage.a2
        public boolean e() {
            return this.b.overridesItemVisibility();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            a2.b bVar = this.d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Context context, b1 b1Var) {
        super(context, b1Var);
    }

    @Override // androidx.appcompat.view.menu.k
    k.a a(ActionProvider actionProvider) {
        return new a(this, this.b, actionProvider);
    }
}
