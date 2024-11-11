package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.c;
import com.bumptech.glide.j;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class rg extends Fragment {
    private final dg Z;
    private final pg a0;
    private final Set<rg> b0;
    private rg c0;
    private j d0;
    private Fragment e0;

    /* loaded from: classes.dex */
    private class a implements pg {
        a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + rg.this + "}";
        }
    }

    public rg() {
        this(new dg());
    }

    @SuppressLint({"ValidFragment"})
    public rg(dg dgVar) {
        this.a0 = new a();
        this.b0 = new HashSet();
        this.Z = dgVar;
    }

    private void a(FragmentActivity fragmentActivity) {
        j0();
        rg b = c.b(fragmentActivity).h().b(fragmentActivity);
        this.c0 = b;
        if (equals(b)) {
            return;
        }
        this.c0.a(this);
    }

    private void a(rg rgVar) {
        this.b0.add(rgVar);
    }

    private void b(rg rgVar) {
        this.b0.remove(rgVar);
    }

    private Fragment i0() {
        Fragment u = u();
        return u != null ? u : this.e0;
    }

    private void j0() {
        rg rgVar = this.c0;
        if (rgVar != null) {
            rgVar.b(this);
            this.c0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void M() {
        super.M();
        this.Z.a();
        j0();
    }

    @Override // androidx.fragment.app.Fragment
    public void P() {
        super.P();
        this.e0 = null;
        j0();
    }

    @Override // androidx.fragment.app.Fragment
    public void S() {
        super.S();
        this.Z.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void T() {
        super.T();
        this.Z.c();
    }

    @Override // androidx.fragment.app.Fragment
    public void a(Context context) {
        super.a(context);
        try {
            a(e());
        } catch (IllegalStateException unused) {
            Log.isLoggable("SupportRMFragment", 5);
        }
    }

    public void a(j jVar) {
        this.d0 = jVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Fragment fragment) {
        this.e0 = fragment;
        if (fragment == null || fragment.e() == null) {
            return;
        }
        a(fragment.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dg f0() {
        return this.Z;
    }

    public j g0() {
        return this.d0;
    }

    public pg h0() {
        return this.a0;
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + i0() + "}";
    }
}
