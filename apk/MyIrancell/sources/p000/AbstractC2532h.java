package p000;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: h */
/* loaded from: classes.dex */
public abstract class AbstractC2532h {

    /* renamed from: b */
    private Object f10347b;

    /* renamed from: c */
    private boolean f10348c;

    /* renamed from: h$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo452a(AbstractC2532h abstractC2532h);

        /* renamed from: a */
        boolean mo453a(AbstractC2532h abstractC2532h, Menu menu);

        /* renamed from: a */
        boolean mo454a(AbstractC2532h abstractC2532h, MenuItem menuItem);

        /* renamed from: b */
        boolean mo455b(AbstractC2532h abstractC2532h, Menu menu);
    }

    /* renamed from: a */
    public abstract void mo540a();

    /* renamed from: a */
    public abstract void mo541a(int i);

    /* renamed from: a */
    public abstract void mo542a(View view);

    /* renamed from: a */
    public abstract void mo543a(CharSequence charSequence);

    /* renamed from: a */
    public void m12056a(Object obj) {
        this.f10347b = obj;
    }

    /* renamed from: a */
    public void mo544a(boolean z) {
        this.f10348c = z;
    }

    /* renamed from: b */
    public abstract View mo545b();

    /* renamed from: b */
    public abstract void mo546b(int i);

    /* renamed from: b */
    public abstract void mo547b(CharSequence charSequence);

    /* renamed from: c */
    public abstract Menu mo548c();

    /* renamed from: d */
    public abstract MenuInflater mo549d();

    /* renamed from: e */
    public abstract CharSequence mo550e();

    /* renamed from: f */
    public Object m12057f() {
        return this.f10347b;
    }

    /* renamed from: g */
    public abstract CharSequence mo551g();

    /* renamed from: h */
    public boolean m12058h() {
        return this.f10348c;
    }

    /* renamed from: i */
    public abstract void mo552i();

    /* renamed from: j */
    public abstract boolean mo553j();
}
