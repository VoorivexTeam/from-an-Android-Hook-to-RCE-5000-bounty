package p000;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0099h;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p000.AbstractC2532h;

/* renamed from: k */
/* loaded from: classes.dex */
public class C2834k extends AbstractC2532h implements C0099h.a {

    /* renamed from: d */
    private Context f11554d;

    /* renamed from: e */
    private ActionBarContextView f11555e;

    /* renamed from: f */
    private AbstractC2532h.a f11556f;

    /* renamed from: g */
    private WeakReference<View> f11557g;

    /* renamed from: h */
    private boolean f11558h;

    /* renamed from: i */
    private C0099h f11559i;

    public C2834k(Context context, ActionBarContextView actionBarContextView, AbstractC2532h.a aVar, boolean z) {
        this.f11554d = context;
        this.f11555e = actionBarContextView;
        this.f11556f = aVar;
        C0099h c0099h = new C0099h(actionBarContextView.getContext());
        c0099h.m659c(1);
        this.f11559i = c0099h;
        c0099h.mo644a(this);
    }

    @Override // p000.AbstractC2532h
    /* renamed from: a */
    public void mo540a() {
        if (this.f11558h) {
            return;
        }
        this.f11558h = true;
        this.f11555e.sendAccessibilityEvent(32);
        this.f11556f.mo452a(this);
    }

    @Override // p000.AbstractC2532h
    /* renamed from: a */
    public void mo541a(int i) {
        mo543a((CharSequence) this.f11554d.getString(i));
    }

    @Override // p000.AbstractC2532h
    /* renamed from: a */
    public void mo542a(View view) {
        this.f11555e.setCustomView(view);
        this.f11557g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.menu.C0099h.a
    /* renamed from: a */
    public void mo401a(C0099h c0099h) {
        mo552i();
        this.f11555e.m744d();
    }

    @Override // p000.AbstractC2532h
    /* renamed from: a */
    public void mo543a(CharSequence charSequence) {
        this.f11555e.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC2532h
    /* renamed from: a */
    public void mo544a(boolean z) {
        super.mo544a(z);
        this.f11555e.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.menu.C0099h.a
    /* renamed from: a */
    public boolean mo406a(C0099h c0099h, MenuItem menuItem) {
        return this.f11556f.mo454a(this, menuItem);
    }

    @Override // p000.AbstractC2532h
    /* renamed from: b */
    public View mo545b() {
        WeakReference<View> weakReference = this.f11557g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC2532h
    /* renamed from: b */
    public void mo546b(int i) {
        mo547b(this.f11554d.getString(i));
    }

    @Override // p000.AbstractC2532h
    /* renamed from: b */
    public void mo547b(CharSequence charSequence) {
        this.f11555e.setTitle(charSequence);
    }

    @Override // p000.AbstractC2532h
    /* renamed from: c */
    public Menu mo548c() {
        return this.f11559i;
    }

    @Override // p000.AbstractC2532h
    /* renamed from: d */
    public MenuInflater mo549d() {
        return new C2916m(this.f11555e.getContext());
    }

    @Override // p000.AbstractC2532h
    /* renamed from: e */
    public CharSequence mo550e() {
        return this.f11555e.getSubtitle();
    }

    @Override // p000.AbstractC2532h
    /* renamed from: g */
    public CharSequence mo551g() {
        return this.f11555e.getTitle();
    }

    @Override // p000.AbstractC2532h
    /* renamed from: i */
    public void mo552i() {
        this.f11556f.mo453a(this, this.f11559i);
    }

    @Override // p000.AbstractC2532h
    /* renamed from: j */
    public boolean mo553j() {
        return this.f11555e.m742b();
    }
}
