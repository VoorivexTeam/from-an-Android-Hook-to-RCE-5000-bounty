package p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C0565j;
import com.bumptech.glide.ComponentCallbacks2C0558c;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: ng */
/* loaded from: classes.dex */
public class FragmentC2988ng extends Fragment {

    /* renamed from: b */
    private final C2388dg f12331b;

    /* renamed from: c */
    private final InterfaceC3084pg f12332c;

    /* renamed from: d */
    private final Set<FragmentC2988ng> f12333d;

    /* renamed from: e */
    private C0565j f12334e;

    /* renamed from: f */
    private FragmentC2988ng f12335f;

    /* renamed from: g */
    private Fragment f12336g;

    /* renamed from: ng$a */
    /* loaded from: classes.dex */
    private class a implements InterfaceC3084pg {
        a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + FragmentC2988ng.this + "}";
        }
    }

    public FragmentC2988ng() {
        this(new C2388dg());
    }

    @SuppressLint({"ValidFragment"})
    FragmentC2988ng(C2388dg c2388dg) {
        this.f12332c = new a();
        this.f12333d = new HashSet();
        this.f12331b = c2388dg;
    }

    /* renamed from: a */
    private void m14323a(Activity activity) {
        m14327e();
        FragmentC2988ng m14525b = ComponentCallbacks2C0558c.m3866b(activity).m3882h().m14525b(activity);
        this.f12335f = m14525b;
        if (equals(m14525b)) {
            return;
        }
        this.f12335f.m14324a(this);
    }

    /* renamed from: a */
    private void m14324a(FragmentC2988ng fragmentC2988ng) {
        this.f12333d.add(fragmentC2988ng);
    }

    /* renamed from: b */
    private void m14325b(FragmentC2988ng fragmentC2988ng) {
        this.f12333d.remove(fragmentC2988ng);
    }

    @TargetApi(17)
    /* renamed from: d */
    private Fragment m14326d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f12336g;
    }

    /* renamed from: e */
    private void m14327e() {
        FragmentC2988ng fragmentC2988ng = this.f12335f;
        if (fragmentC2988ng != null) {
            fragmentC2988ng.m14325b(this);
            this.f12335f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C2388dg m14328a() {
        return this.f12331b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m14329a(Fragment fragment) {
        this.f12336g = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        m14323a(fragment.getActivity());
    }

    /* renamed from: a */
    public void m14330a(C0565j c0565j) {
        this.f12334e = c0565j;
    }

    /* renamed from: b */
    public C0565j m14331b() {
        return this.f12334e;
    }

    /* renamed from: c */
    public InterfaceC3084pg m14332c() {
        return this.f12332c;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m14323a(activity);
        } catch (IllegalStateException unused) {
            Log.isLoggable("RMFragment", 5);
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f12331b.m11365a();
        m14327e();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        m14327e();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f12331b.m11367b();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f12331b.m11369c();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m14326d() + "}";
    }
}
