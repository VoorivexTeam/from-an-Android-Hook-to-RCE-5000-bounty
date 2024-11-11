package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0299e;
import androidx.lifecycle.C0302h;
import androidx.lifecycle.FragmentC0309o;
import androidx.lifecycle.InterfaceC0301g;
import p000.C0502c2;
import p000.C2573i0;

/* loaded from: classes.dex */
public class ComponentActivity extends Activity implements InterfaceC0301g, C0502c2.a {

    /* renamed from: b */
    private C0302h f1371b;

    public ComponentActivity() {
        new C2573i0();
        this.f1371b = new C0302h(this);
    }

    @Override // androidx.lifecycle.InterfaceC0301g
    /* renamed from: a */
    public AbstractC0299e mo1356a() {
        return this.f1371b;
    }

    @Override // p000.C0502c2.a
    /* renamed from: a */
    public boolean mo502a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0502c2.m3525a(decorView, keyEvent)) {
            return C0502c2.m3526a(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0502c2.m3525a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0309o.m2061a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f1371b.m2051a(AbstractC0299e.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
