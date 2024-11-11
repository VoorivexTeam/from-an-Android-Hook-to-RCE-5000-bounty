package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemC0102k;
import p000.AbstractC0003a2;
import p000.InterfaceMenuItemC0446b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public class C0103l extends MenuItemC0102k {

    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* loaded from: classes.dex */
    class a extends MenuItemC0102k.a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        AbstractC0003a2.b f665d;

        public a(C0103l c0103l, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // p000.AbstractC0003a2
        /* renamed from: a */
        public View mo30a(MenuItem menuItem) {
            return this.f660b.onCreateActionView(menuItem);
        }

        @Override // p000.AbstractC0003a2
        /* renamed from: a */
        public void mo32a(AbstractC0003a2.b bVar) {
            this.f665d = bVar;
            this.f660b.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // p000.AbstractC0003a2
        /* renamed from: b */
        public boolean mo35b() {
            return this.f660b.isVisible();
        }

        @Override // p000.AbstractC0003a2
        /* renamed from: e */
        public boolean mo38e() {
            return this.f660b.overridesItemVisibility();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC0003a2.b bVar = this.f665d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0103l(Context context, InterfaceMenuItemC0446b1 interfaceMenuItemC0446b1) {
        super(context, interfaceMenuItemC0446b1);
    }

    @Override // androidx.appcompat.view.menu.MenuItemC0102k
    /* renamed from: a */
    MenuItemC0102k.a mo707a(ActionProvider actionProvider) {
        return new a(this, this.f538b, actionProvider);
    }
}
