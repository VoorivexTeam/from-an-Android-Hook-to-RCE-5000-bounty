package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public abstract class h {
    private Object b;
    private boolean c;

    /* loaded from: classes.dex */
    public interface a {
        void a(h hVar);

        boolean a(h hVar, Menu menu);

        boolean a(h hVar, MenuItem menuItem);

        boolean b(h hVar, Menu menu);
    }

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(View view);

    public abstract void a(CharSequence charSequence);

    public void a(Object obj) {
        this.b = obj;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public abstract View b();

    public abstract void b(int i);

    public abstract void b(CharSequence charSequence);

    public abstract Menu c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public Object f() {
        return this.b;
    }

    public abstract CharSequence g();

    public boolean h() {
        return this.c;
    }

    public abstract void i();

    public abstract boolean j();
}
