package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.C0208y0;
import androidx.core.app.C0223a;
import androidx.core.app.C0226d;
import androidx.core.app.C0233k;
import androidx.fragment.app.FragmentActivity;
import p000.AbstractC2532h;

/* loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements InterfaceC0083c, C0233k.a {

    /* renamed from: n */
    private AbstractC0084d f316n;

    /* renamed from: o */
    private int f317o = 0;

    /* renamed from: p */
    private Resources f318p;

    /* renamed from: a */
    private boolean m354a(int i, KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.appcompat.app.InterfaceC0083c
    /* renamed from: a */
    public AbstractC2532h mo355a(AbstractC2532h.a aVar) {
        return null;
    }

    /* renamed from: a */
    public void m356a(Intent intent) {
        C0226d.m1373a(this, intent);
    }

    /* renamed from: a */
    public void m357a(C0233k c0233k) {
        c0233k.m1442a((Activity) this);
    }

    @Override // androidx.appcompat.app.InterfaceC0083c
    /* renamed from: a */
    public void mo358a(AbstractC2532h abstractC2532h) {
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m364j().mo398a(view, layoutParams);
    }

    /* renamed from: b */
    public void m359b(C0233k c0233k) {
    }

    @Override // androidx.appcompat.app.InterfaceC0083c
    /* renamed from: b */
    public void mo360b(AbstractC2532h abstractC2532h) {
    }

    /* renamed from: b */
    public boolean m361b(Intent intent) {
        return C0226d.m1376b(this, intent);
    }

    @Override // androidx.core.app.C0233k.a
    /* renamed from: c */
    public Intent mo362c() {
        return C0226d.m1371a(this);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0081a m365k = m365k();
        if (getWindow().hasFeature(0)) {
            if (m365k == null || !m365k.m473e()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0081a m365k = m365k();
        if (keyCode == 82 && m365k != null && m365k.m467a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) m364j().mo389a(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m364j().mo407b();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f318p == null && C0208y0.m1241b()) {
            this.f318p = new C0208y0(this, super.getResources());
        }
        Resources resources = this.f318p;
        return resources == null ? super.getResources() : resources;
    }

    @Override // androidx.fragment.app.FragmentActivity
    /* renamed from: i */
    public void mo363i() {
        m364j().mo420e();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m364j().mo420e();
    }

    /* renamed from: j */
    public AbstractC0084d m364j() {
        if (this.f316n == null) {
            this.f316n = AbstractC0084d.m495a(this, this);
        }
        return this.f316n;
    }

    /* renamed from: k */
    public AbstractC0081a m365k() {
        return m364j().mo414c();
    }

    @Deprecated
    /* renamed from: l */
    public void m366l() {
    }

    /* renamed from: m */
    public boolean m367m() {
        Intent mo362c = mo362c();
        if (mo362c == null) {
            return false;
        }
        if (!m361b(mo362c)) {
            m356a(mo362c);
            return true;
        }
        C0233k m1441a = C0233k.m1441a((Context) this);
        m357a(m1441a);
        m359b(m1441a);
        m1441a.m1446b();
        try {
            C0223a.m1360a((Activity) this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m364j().mo395a(configuration);
        if (this.f318p != null) {
            this.f318p.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m366l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        AbstractC0084d m364j = m364j();
        m364j.mo418d();
        m364j.mo396a(bundle);
        if (m364j.mo403a() && (i = this.f317o) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f317o, false);
            } else {
                setTheme(i);
            }
        }
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m364j().mo423f();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m354a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0081a m365k = m365k();
        if (menuItem.getItemId() != 16908332 || m365k == null || (m365k.mo475g() & 4) == 0) {
            return false;
        }
        return m367m();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m364j().mo409b(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m364j().mo424g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m364j().mo416c(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        m364j().mo426h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        m364j().mo429i();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m364j().mo402a(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0081a m365k = m365k();
        if (getWindow().hasFeature(0)) {
            if (m365k == null || !m365k.m480l()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m364j().mo415c(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m364j().mo397a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m364j().mo410b(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        this.f317o = i;
    }
}
