package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionBarContextView;
import defpackage.h;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class k extends h implements h.a {
    private Context d;
    private ActionBarContextView e;
    private h.a f;
    private WeakReference<View> g;
    private boolean h;
    private androidx.appcompat.view.menu.h i;

    public k(Context context, ActionBarContextView actionBarContextView, h.a aVar, boolean z) {
        this.d = context;
        this.e = actionBarContextView;
        this.f = aVar;
        androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(actionBarContextView.getContext());
        hVar.c(1);
        this.i = hVar;
        hVar.a(this);
    }

    @Override // defpackage.h
    public void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.sendAccessibilityEvent(32);
        this.f.a(this);
    }

    @Override // defpackage.h
    public void a(int i) {
        a((CharSequence) this.d.getString(i));
    }

    @Override // defpackage.h
    public void a(View view) {
        this.e.setCustomView(view);
        this.g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public void a(androidx.appcompat.view.menu.h hVar) {
        i();
        this.e.d();
    }

    @Override // defpackage.h
    public void a(CharSequence charSequence) {
        this.e.setSubtitle(charSequence);
    }

    @Override // defpackage.h
    public void a(boolean z) {
        super.a(z);
        this.e.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
        return this.f.a(this, menuItem);
    }

    @Override // defpackage.h
    public View b() {
        WeakReference<View> weakReference = this.g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // defpackage.h
    public void b(int i) {
        b(this.d.getString(i));
    }

    @Override // defpackage.h
    public void b(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // defpackage.h
    public Menu c() {
        return this.i;
    }

    @Override // defpackage.h
    public MenuInflater d() {
        return new m(this.e.getContext());
    }

    @Override // defpackage.h
    public CharSequence e() {
        return this.e.getSubtitle();
    }

    @Override // defpackage.h
    public CharSequence g() {
        return this.e.getTitle();
    }

    @Override // defpackage.h
    public void i() {
        this.f.a(this, this.i);
    }

    @Override // defpackage.h
    public boolean j() {
        return this.e.b();
    }
}
