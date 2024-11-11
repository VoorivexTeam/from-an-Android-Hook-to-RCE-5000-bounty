package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C0565j;
import com.bumptech.glide.ComponentCallbacks2C0558c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: rg */
/* loaded from: classes.dex */
public class C3165rg extends Fragment {

    /* renamed from: Z */
    private final C2388dg f12960Z;

    /* renamed from: a0 */
    private final InterfaceC3084pg f12961a0;

    /* renamed from: b0 */
    private final Set<C3165rg> f12962b0;

    /* renamed from: c0 */
    private C3165rg f12963c0;

    /* renamed from: d0 */
    private C0565j f12964d0;

    /* renamed from: e0 */
    private Fragment f12965e0;

    /* renamed from: rg$a */
    /* loaded from: classes.dex */
    private class a implements InterfaceC3084pg {
        a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + C3165rg.this + "}";
        }
    }

    public C3165rg() {
        this(new C2388dg());
    }

    @SuppressLint({"ValidFragment"})
    public C3165rg(C2388dg c2388dg) {
        this.f12961a0 = new a();
        this.f12962b0 = new HashSet();
        this.f12960Z = c2388dg;
    }

    /* renamed from: a */
    private void m15262a(FragmentActivity fragmentActivity) {
        m15266j0();
        C3165rg m14526b = ComponentCallbacks2C0558c.m3866b(fragmentActivity).m3882h().m14526b(fragmentActivity);
        this.f12963c0 = m14526b;
        if (equals(m14526b)) {
            return;
        }
        this.f12963c0.m15263a(this);
    }

    /* renamed from: a */
    private void m15263a(C3165rg c3165rg) {
        this.f12962b0.add(c3165rg);
    }

    /* renamed from: b */
    private void m15264b(C3165rg c3165rg) {
        this.f12962b0.remove(c3165rg);
    }

    /* renamed from: i0 */
    private Fragment m15265i0() {
        Fragment m1719u = m1719u();
        return m1719u != null ? m1719u : this.f12965e0;
    }

    /* renamed from: j0 */
    private void m15266j0() {
        C3165rg c3165rg = this.f12963c0;
        if (c3165rg != null) {
            c3165rg.m15264b(this);
            this.f12963c0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: M */
    public void mo1629M() {
        super.mo1629M();
        this.f12960Z.m11365a();
        m15266j0();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P */
    public void mo1632P() {
        super.mo1632P();
        this.f12965e0 = null;
        m15266j0();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: S */
    public void mo1635S() {
        super.mo1635S();
        this.f12960Z.m11367b();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: T */
    public void mo1636T() {
        super.mo1636T();
        this.f12960Z.m11369c();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a */
    public void mo1655a(Context context) {
        super.mo1655a(context);
        try {
            m15262a(m1690e());
        } catch (IllegalStateException unused) {
            Log.isLoggable("SupportRMFragment", 5);
        }
    }

    /* renamed from: a */
    public void m15267a(C0565j c0565j) {
        this.f12964d0 = c0565j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m15268b(Fragment fragment) {
        this.f12965e0 = fragment;
        if (fragment == null || fragment.m1690e() == null) {
            return;
        }
        m15262a(fragment.m1690e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public C2388dg m15269f0() {
        return this.f12960Z;
    }

    /* renamed from: g0 */
    public C0565j m15270g0() {
        return this.f12964d0;
    }

    /* renamed from: h0 */
    public InterfaceC3084pg m15271h0() {
        return this.f12961a0;
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m15265i0() + "}";
    }
}
