package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.j;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public class ng extends Fragment {
    private final dg b;
    private final pg c;
    private final Set<ng> d;
    private j e;
    private ng f;
    private Fragment g;

    /* loaded from: classes.dex */
    private class a implements pg {
        a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + ng.this + "}";
        }
    }

    public ng() {
        this(new dg());
    }

    @SuppressLint({"ValidFragment"})
    ng(dg dgVar) {
        this.c = new a();
        this.d = new HashSet();
        this.b = dgVar;
    }

    private void a(Activity activity) {
        e();
        ng b = c.b(activity).h().b(activity);
        this.f = b;
        if (equals(b)) {
            return;
        }
        this.f.a(this);
    }

    private void a(ng ngVar) {
        this.d.add(ngVar);
    }

    private void b(ng ngVar) {
        this.d.remove(ngVar);
    }

    @TargetApi(17)
    private Fragment d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.g;
    }

    private void e() {
        ng ngVar = this.f;
        if (ngVar != null) {
            ngVar.b(this);
            this.f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dg a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        this.g = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        a(fragment.getActivity());
    }

    public void a(j jVar) {
        this.e = jVar;
    }

    public j b() {
        return this.e;
    }

    public pg c() {
        return this.c;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException unused) {
            Log.isLoggable("RMFragment", 5);
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.b.a();
        e();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        e();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.b.b();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.b.c();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + d() + "}";
    }
}
