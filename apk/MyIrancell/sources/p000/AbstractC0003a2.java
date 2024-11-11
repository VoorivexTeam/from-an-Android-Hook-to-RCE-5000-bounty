package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: a2 */
/* loaded from: classes.dex */
public abstract class AbstractC0003a2 {

    /* renamed from: a */
    private b f24a;

    /* renamed from: a2$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: a2$b */
    /* loaded from: classes.dex */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC0003a2(Context context) {
    }

    /* renamed from: a */
    public View mo30a(MenuItem menuItem) {
        return mo36c();
    }

    /* renamed from: a */
    public void m31a(a aVar) {
    }

    /* renamed from: a */
    public void mo32a(b bVar) {
        if (this.f24a != null && bVar != null) {
            String str = "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?";
        }
        this.f24a = bVar;
    }

    /* renamed from: a */
    public void mo33a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public boolean mo34a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo35b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo36c();

    /* renamed from: d */
    public boolean mo37d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo38e() {
        return false;
    }

    /* renamed from: f */
    public void m39f() {
        this.f24a = null;
    }
}
