package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p000.C0448b3;
import p000.C3508z1;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
public class C0368i extends C3508z1 {

    /* renamed from: c */
    final RecyclerView f2357c;

    /* renamed from: d */
    final C3508z1 f2358d = new a(this);

    /* renamed from: androidx.recyclerview.widget.i$a */
    /* loaded from: classes.dex */
    public static class a extends C3508z1 {

        /* renamed from: c */
        final C0368i f2359c;

        public a(C0368i c0368i) {
            this.f2359c = c0368i;
        }

        @Override // p000.C3508z1
        /* renamed from: a */
        public void mo1538a(View view, C0448b3 c0448b3) {
            super.mo1538a(view, c0448b3);
            if (this.f2359c.m2866c() || this.f2359c.f2357c.getLayoutManager() == null) {
                return;
            }
            this.f2359c.f2357c.getLayoutManager().m2471a(view, c0448b3);
        }

        @Override // p000.C3508z1
        /* renamed from: a */
        public boolean mo1539a(View view, int i, Bundle bundle) {
            if (super.mo1539a(view, i, bundle)) {
                return true;
            }
            if (this.f2359c.m2866c() || this.f2359c.f2357c.getLayoutManager() == null) {
                return false;
            }
            return this.f2359c.f2357c.getLayoutManager().m2483a(view, i, bundle);
        }
    }

    public C0368i(RecyclerView recyclerView) {
        this.f2357c = recyclerView;
    }

    @Override // p000.C3508z1
    /* renamed from: a */
    public void mo1538a(View view, C0448b3 c0448b3) {
        super.mo1538a(view, c0448b3);
        c0448b3.m3281a((CharSequence) RecyclerView.class.getName());
        if (m2866c() || this.f2357c.getLayoutManager() == null) {
            return;
        }
        this.f2357c.getLayoutManager().m2480a(c0448b3);
    }

    @Override // p000.C3508z1
    /* renamed from: a */
    public boolean mo1539a(View view, int i, Bundle bundle) {
        if (super.mo1539a(view, i, bundle)) {
            return true;
        }
        if (m2866c() || this.f2357c.getLayoutManager() == null) {
            return false;
        }
        return this.f2357c.getLayoutManager().m2481a(i, bundle);
    }

    /* renamed from: b */
    public C3508z1 m2865b() {
        return this.f2358d;
    }

    @Override // p000.C3508z1
    /* renamed from: b */
    public void mo1540b(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1540b(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || m2866c()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo2173a(accessibilityEvent);
        }
    }

    /* renamed from: c */
    boolean m2866c() {
        return this.f2357c.m2309j();
    }
}
