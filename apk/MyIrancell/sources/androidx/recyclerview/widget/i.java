package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import defpackage.b3;
import defpackage.z1;

/* loaded from: classes.dex */
public class i extends z1 {
    final RecyclerView c;
    final z1 d = new a(this);

    /* loaded from: classes.dex */
    public static class a extends z1 {
        final i c;

        public a(i iVar) {
            this.c = iVar;
        }

        @Override // defpackage.z1
        public void a(View view, b3 b3Var) {
            super.a(view, b3Var);
            if (this.c.c() || this.c.c.getLayoutManager() == null) {
                return;
            }
            this.c.c.getLayoutManager().a(view, b3Var);
        }

        @Override // defpackage.z1
        public boolean a(View view, int i, Bundle bundle) {
            if (super.a(view, i, bundle)) {
                return true;
            }
            if (this.c.c() || this.c.c.getLayoutManager() == null) {
                return false;
            }
            return this.c.c.getLayoutManager().a(view, i, bundle);
        }
    }

    public i(RecyclerView recyclerView) {
        this.c = recyclerView;
    }

    @Override // defpackage.z1
    public void a(View view, b3 b3Var) {
        super.a(view, b3Var);
        b3Var.a((CharSequence) RecyclerView.class.getName());
        if (c() || this.c.getLayoutManager() == null) {
            return;
        }
        this.c.getLayoutManager().a(b3Var);
    }

    @Override // defpackage.z1
    public boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (c() || this.c.getLayoutManager() == null) {
            return false;
        }
        return this.c.getLayoutManager().a(i, bundle);
    }

    public z1 b() {
        return this.d;
    }

    @Override // defpackage.z1
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || c()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().a(accessibilityEvent);
        }
    }

    boolean c() {
        return this.c.j();
    }
}
