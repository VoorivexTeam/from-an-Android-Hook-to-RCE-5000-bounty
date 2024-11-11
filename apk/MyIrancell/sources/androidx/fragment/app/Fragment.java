package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.AbstractC0232j;
import androidx.lifecycle.AbstractC0299e;
import androidx.lifecycle.C0302h;
import androidx.lifecycle.C0306l;
import androidx.lifecycle.C0312r;
import androidx.lifecycle.InterfaceC0301g;
import androidx.lifecycle.InterfaceC0313s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import p000.AbstractC3150r3;
import p000.C2371d2;
import p000.C2573i0;
import p000.C3106q1;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0301g, InterfaceC0313s {

    /* renamed from: X */
    private static final C2573i0<String, Class<?>> f1587X = new C2573i0<>();

    /* renamed from: Y */
    static final Object f1588Y = new Object();

    /* renamed from: A */
    String f1589A;

    /* renamed from: B */
    boolean f1590B;

    /* renamed from: C */
    boolean f1591C;

    /* renamed from: D */
    boolean f1592D;

    /* renamed from: E */
    boolean f1593E;

    /* renamed from: F */
    boolean f1594F;

    /* renamed from: H */
    boolean f1596H;

    /* renamed from: I */
    ViewGroup f1597I;

    /* renamed from: J */
    View f1598J;

    /* renamed from: K */
    View f1599K;

    /* renamed from: L */
    boolean f1600L;

    /* renamed from: N */
    C0268d f1602N;

    /* renamed from: O */
    boolean f1603O;

    /* renamed from: P */
    boolean f1604P;

    /* renamed from: Q */
    float f1605Q;

    /* renamed from: R */
    LayoutInflater f1606R;

    /* renamed from: S */
    boolean f1607S;

    /* renamed from: U */
    C0302h f1609U;

    /* renamed from: V */
    InterfaceC0301g f1610V;

    /* renamed from: c */
    Bundle f1613c;

    /* renamed from: d */
    SparseArray<Parcelable> f1614d;

    /* renamed from: e */
    Boolean f1615e;

    /* renamed from: g */
    String f1617g;

    /* renamed from: h */
    Bundle f1618h;

    /* renamed from: i */
    Fragment f1619i;

    /* renamed from: k */
    int f1621k;

    /* renamed from: l */
    boolean f1622l;

    /* renamed from: m */
    boolean f1623m;

    /* renamed from: n */
    boolean f1624n;

    /* renamed from: o */
    boolean f1625o;

    /* renamed from: p */
    boolean f1626p;

    /* renamed from: q */
    boolean f1627q;

    /* renamed from: r */
    int f1628r;

    /* renamed from: s */
    LayoutInflaterFactory2C0283g f1629s;

    /* renamed from: t */
    AbstractC0281e f1630t;

    /* renamed from: u */
    LayoutInflaterFactory2C0283g f1631u;

    /* renamed from: v */
    C0284h f1632v;

    /* renamed from: w */
    C0312r f1633w;

    /* renamed from: x */
    Fragment f1634x;

    /* renamed from: y */
    int f1635y;

    /* renamed from: z */
    int f1636z;

    /* renamed from: b */
    int f1612b = 0;

    /* renamed from: f */
    int f1616f = -1;

    /* renamed from: j */
    int f1620j = -1;

    /* renamed from: G */
    boolean f1595G = true;

    /* renamed from: M */
    boolean f1601M = true;

    /* renamed from: T */
    C0302h f1608T = new C0302h(this);

    /* renamed from: W */
    C0306l<InterfaceC0301g> f1611W = new C0306l<>();

    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0264a();

        /* renamed from: b */
        final Bundle f1637b;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        /* loaded from: classes.dex */
        static class C0264a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0264a() {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f1637b = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f1637b);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$a */
    /* loaded from: classes.dex */
    class RunnableC0265a implements Runnable {
        RunnableC0265a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.m1678c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$b */
    /* loaded from: classes.dex */
    public class C0266b extends AbstractC0279c {
        C0266b() {
        }

        @Override // androidx.fragment.app.AbstractC0279c
        /* renamed from: a */
        public View mo1725a(int i) {
            View view = Fragment.this.f1598J;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC0279c
        /* renamed from: a */
        public Fragment mo1726a(Context context, String str, Bundle bundle) {
            return Fragment.this.f1630t.mo1726a(context, str, bundle);
        }

        @Override // androidx.fragment.app.AbstractC0279c
        /* renamed from: a */
        public boolean mo1727a() {
            return Fragment.this.f1598J != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    /* loaded from: classes.dex */
    class C0267c implements InterfaceC0301g {
        C0267c() {
        }

        @Override // androidx.lifecycle.InterfaceC0301g
        /* renamed from: a */
        public AbstractC0299e mo1356a() {
            Fragment fragment = Fragment.this;
            if (fragment.f1609U == null) {
                fragment.f1609U = new C0302h(fragment.f1610V);
            }
            return Fragment.this.f1609U;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$d */
    /* loaded from: classes.dex */
    public static class C0268d {

        /* renamed from: a */
        View f1641a;

        /* renamed from: b */
        Animator f1642b;

        /* renamed from: c */
        int f1643c;

        /* renamed from: d */
        int f1644d;

        /* renamed from: e */
        int f1645e;

        /* renamed from: f */
        int f1646f;

        /* renamed from: g */
        Object f1647g = null;

        /* renamed from: h */
        Object f1648h;

        /* renamed from: i */
        Object f1649i;

        /* renamed from: j */
        Object f1650j;

        /* renamed from: k */
        Object f1651k;

        /* renamed from: l */
        Object f1652l;

        /* renamed from: m */
        Boolean f1653m;

        /* renamed from: n */
        Boolean f1654n;

        /* renamed from: o */
        AbstractC0232j f1655o;

        /* renamed from: p */
        AbstractC0232j f1656p;

        /* renamed from: q */
        boolean f1657q;

        /* renamed from: r */
        InterfaceC0270f f1658r;

        /* renamed from: s */
        boolean f1659s;

        C0268d() {
            Object obj = Fragment.f1588Y;
            this.f1648h = obj;
            this.f1649i = null;
            this.f1650j = obj;
            this.f1651k = null;
            this.f1652l = obj;
            this.f1655o = null;
            this.f1656p = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    /* loaded from: classes.dex */
    public static class C0269e extends RuntimeException {
        public C0269e(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0270f {
        /* renamed from: a */
        void mo1728a();

        /* renamed from: b */
        void mo1729b();
    }

    /* renamed from: a */
    public static Fragment m1614a(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = f1587X.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f1587X.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.m1711m(bundle);
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            throw new C0269e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0269e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new C0269e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new C0269e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new C0269e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m1615a(Context context, String str) {
        try {
            Class<?> cls = f1587X.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f1587X.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: f0 */
    private C0268d m1616f0() {
        if (this.f1602N == null) {
            this.f1602N = new C0268d();
        }
        return this.f1602N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public int m1617A() {
        C0268d c0268d = this.f1602N;
        if (c0268d == null) {
            return 0;
        }
        return c0268d.f1643c;
    }

    /* renamed from: B */
    public View m1618B() {
        return this.f1598J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m1619C() {
        this.f1616f = -1;
        this.f1617g = null;
        this.f1622l = false;
        this.f1623m = false;
        this.f1624n = false;
        this.f1625o = false;
        this.f1626p = false;
        this.f1628r = 0;
        this.f1629s = null;
        this.f1631u = null;
        this.f1630t = null;
        this.f1635y = 0;
        this.f1636z = 0;
        this.f1589A = null;
        this.f1590B = false;
        this.f1591C = false;
        this.f1593E = false;
    }

    /* renamed from: D */
    void m1620D() {
        if (this.f1630t == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = new LayoutInflaterFactory2C0283g();
        this.f1631u = layoutInflaterFactory2C0283g;
        layoutInflaterFactory2C0283g.m1876a(this.f1630t, new C0266b(), this);
    }

    /* renamed from: E */
    public final boolean m1621E() {
        return this.f1630t != null && this.f1622l;
    }

    /* renamed from: F */
    public final boolean m1622F() {
        return this.f1590B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean m1623G() {
        C0268d c0268d = this.f1602N;
        if (c0268d == null) {
            return false;
        }
        return c0268d.f1659s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public final boolean m1624H() {
        return this.f1628r > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean m1625I() {
        C0268d c0268d = this.f1602N;
        if (c0268d == null) {
            return false;
        }
        return c0268d.f1657q;
    }

    /* renamed from: J */
    public final boolean m1626J() {
        return this.f1623m;
    }

    /* renamed from: K */
    public final boolean m1627K() {
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1629s;
        if (layoutInflaterFactory2C0283g == null) {
            return false;
        }
        return layoutInflaterFactory2C0283g.mo1814c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m1628L() {
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            layoutInflaterFactory2C0283g.m1927r();
        }
    }

    /* renamed from: M */
    public void mo1629M() {
        this.f1596H = true;
        FragmentActivity m1690e = m1690e();
        boolean z = m1690e != null && m1690e.isChangingConfigurations();
        C0312r c0312r = this.f1633w;
        if (c0312r == null || z) {
            return;
        }
        c0312r.m2073a();
    }

    /* renamed from: N */
    public void m1630N() {
    }

    /* renamed from: O */
    public void mo1631O() {
        this.f1596H = true;
    }

    /* renamed from: P */
    public void mo1632P() {
        this.f1596H = true;
    }

    /* renamed from: Q */
    public void m1633Q() {
        this.f1596H = true;
    }

    /* renamed from: R */
    public void mo1634R() {
        this.f1596H = true;
    }

    /* renamed from: S */
    public void mo1635S() {
        this.f1596H = true;
    }

    /* renamed from: T */
    public void mo1636T() {
        this.f1596H = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public AbstractC0282f m1637U() {
        return this.f1631u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public void m1638V() {
        this.f1608T.m2050a(AbstractC0299e.a.ON_DESTROY);
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            layoutInflaterFactory2C0283g.m1905g();
        }
        this.f1612b = 0;
        this.f1596H = false;
        this.f1607S = false;
        mo1629M();
        if (this.f1596H) {
            this.f1631u = null;
            return;
        }
        throw new C0291o("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public void m1639W() {
        if (this.f1598J != null) {
            this.f1609U.m2050a(AbstractC0299e.a.ON_DESTROY);
        }
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            layoutInflaterFactory2C0283g.m1908h();
        }
        this.f1612b = 1;
        this.f1596H = false;
        mo1631O();
        if (this.f1596H) {
            AbstractC3150r3.m15184a(this).mo15186a();
            this.f1627q = false;
        } else {
            throw new C0291o("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public void m1640X() {
        this.f1596H = false;
        mo1632P();
        this.f1606R = null;
        if (!this.f1596H) {
            throw new C0291o("Fragment " + this + " did not call through to super.onDetach()");
        }
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            if (this.f1593E) {
                layoutInflaterFactory2C0283g.m1905g();
                this.f1631u = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not  destroyed and this fragment is not retaining instance");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m1641Y() {
        onLowMemory();
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            layoutInflaterFactory2C0283g.m1911i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public void m1642Z() {
        if (this.f1598J != null) {
            this.f1609U.m2050a(AbstractC0299e.a.ON_PAUSE);
        }
        this.f1608T.m2050a(AbstractC0299e.a.ON_PAUSE);
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            layoutInflaterFactory2C0283g.m1913j();
        }
        this.f1612b = 3;
        this.f1596H = false;
        m1633Q();
        if (this.f1596H) {
            return;
        }
        throw new C0291o("Fragment " + this + " did not call through to super.onPause()");
    }

    @Deprecated
    /* renamed from: a */
    public LayoutInflater m1643a(Bundle bundle) {
        AbstractC0281e abstractC0281e = this.f1630t;
        if (abstractC0281e == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater mo1746f = abstractC0281e.mo1746f();
        m1704j();
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        layoutInflaterFactory2C0283g.m1925p();
        C2371d2.m11249b(mo1746f, layoutInflaterFactory2C0283g);
        return mo1746f;
    }

    /* renamed from: a */
    public View mo1644a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: a */
    public Animation m1645a(int i, boolean z, int i2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment m1646a(String str) {
        if (str.equals(this.f1617g)) {
            return this;
        }
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            return layoutInflaterFactory2C0283g.m1883b(str);
        }
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC0301g
    /* renamed from: a */
    public AbstractC0299e mo1356a() {
        return this.f1608T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1647a(int i) {
        if (this.f1602N == null && i == 0) {
            return;
        }
        m1616f0().f1644d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1648a(int i, int i2) {
        if (this.f1602N == null && i == 0 && i2 == 0) {
            return;
        }
        m1616f0();
        C0268d c0268d = this.f1602N;
        c0268d.f1645e = i;
        c0268d.f1646f = i2;
    }

    /* renamed from: a */
    public void mo1649a(int i, int i2, Intent intent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1650a(int i, Fragment fragment) {
        StringBuilder sb;
        String str;
        this.f1616f = i;
        if (fragment != null) {
            sb = new StringBuilder();
            sb.append(fragment.f1617g);
            str = ":";
        } else {
            sb = new StringBuilder();
            str = "android:fragment:";
        }
        sb.append(str);
        sb.append(this.f1616f);
        this.f1617g = sb.toString();
    }

    /* renamed from: a */
    public void m1651a(int i, String[] strArr, int[] iArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1652a(Animator animator) {
        m1616f0().f1642b = animator;
    }

    @Deprecated
    /* renamed from: a */
    public void mo1653a(Activity activity) {
        this.f1596H = true;
    }

    @Deprecated
    /* renamed from: a */
    public void m1654a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f1596H = true;
    }

    /* renamed from: a */
    public void mo1655a(Context context) {
        this.f1596H = true;
        AbstractC0281e abstractC0281e = this.f1630t;
        Activity m1804b = abstractC0281e == null ? null : abstractC0281e.m1804b();
        if (m1804b != null) {
            this.f1596H = false;
            mo1653a(m1804b);
        }
    }

    /* renamed from: a */
    public void m1656a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f1596H = true;
        AbstractC0281e abstractC0281e = this.f1630t;
        Activity m1804b = abstractC0281e == null ? null : abstractC0281e.m1804b();
        if (m1804b != null) {
            this.f1596H = false;
            m1654a(m1804b, attributeSet, bundle);
        }
    }

    /* renamed from: a */
    public void m1657a(Intent intent, int i, Bundle bundle) {
        AbstractC0281e abstractC0281e = this.f1630t;
        if (abstractC0281e != null) {
            abstractC0281e.mo1743a(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1658a(Configuration configuration) {
        onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            layoutInflaterFactory2C0283g.m1864a(configuration);
        }
    }

    /* renamed from: a */
    public void m1659a(Menu menu) {
    }

    /* renamed from: a */
    public void mo1660a(Menu menu, MenuInflater menuInflater) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1661a(View view) {
        m1616f0().f1641a = view;
    }

    /* renamed from: a */
    public void mo1662a(View view, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1663a(InterfaceC0270f interfaceC0270f) {
        m1616f0();
        InterfaceC0270f interfaceC0270f2 = this.f1602N.f1658r;
        if (interfaceC0270f == interfaceC0270f2) {
            return;
        }
        if (interfaceC0270f != null && interfaceC0270f2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        C0268d c0268d = this.f1602N;
        if (c0268d.f1657q) {
            c0268d.f1658r = interfaceC0270f;
        }
        if (interfaceC0270f != null) {
            interfaceC0270f.mo1729b();
        }
    }

    /* renamed from: a */
    public void m1664a(Fragment fragment) {
    }

    /* renamed from: a */
    public void mo1665a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f1635y));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f1636z));
        printWriter.print(" mTag=");
        printWriter.println(this.f1589A);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1612b);
        printWriter.print(" mIndex=");
        printWriter.print(this.f1616f);
        printWriter.print(" mWho=");
        printWriter.print(this.f1617g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f1628r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1622l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f1623m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f1624n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f1625o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f1590B);
        printWriter.print(" mDetached=");
        printWriter.print(this.f1591C);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f1595G);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f1594F);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f1592D);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f1593E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f1601M);
        if (this.f1629s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f1629s);
        }
        if (this.f1630t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f1630t);
        }
        if (this.f1634x != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f1634x);
        }
        if (this.f1618h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1618h);
        }
        if (this.f1613c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1613c);
        }
        if (this.f1614d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1614d);
        }
        if (this.f1619i != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f1619i);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1621k);
        }
        if (m1716r() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(m1716r());
        }
        if (this.f1597I != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f1597I);
        }
        if (this.f1598J != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f1598J);
        }
        if (this.f1599K != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f1598J);
        }
        if (m1700h() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m1700h());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(m1617A());
        }
        if (m1706k() != null) {
            AbstractC3150r3.m15184a(this).mo15187a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.f1631u != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f1631u + ":");
            this.f1631u.mo1812a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public void m1666a(boolean z) {
    }

    /* renamed from: a */
    public boolean m1667a(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void m1668a0() {
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            layoutInflaterFactory2C0283g.m1927r();
            this.f1631u.m1924o();
        }
        this.f1612b = 4;
        this.f1596H = false;
        mo1634R();
        if (!this.f1596H) {
            throw new C0291o("Fragment " + this + " did not call through to super.onResume()");
        }
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g2 = this.f1631u;
        if (layoutInflaterFactory2C0283g2 != null) {
            layoutInflaterFactory2C0283g2.m1915k();
            this.f1631u.m1924o();
        }
        this.f1608T.m2050a(AbstractC0299e.a.ON_RESUME);
        if (this.f1598J != null) {
            this.f1609U.m2050a(AbstractC0299e.a.ON_RESUME);
        }
    }

    /* renamed from: b */
    public Animator m1669b(int i, boolean z, int i2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1670b(int i) {
        m1616f0().f1643c = i;
    }

    /* renamed from: b */
    public void mo1671b(Bundle bundle) {
        this.f1596H = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1672b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            layoutInflaterFactory2C0283g.m1927r();
        }
        this.f1627q = true;
        this.f1610V = new C0267c();
        this.f1609U = null;
        View mo1644a = mo1644a(layoutInflater, viewGroup, bundle);
        this.f1598J = mo1644a;
        if (mo1644a != null) {
            this.f1610V.mo1356a();
            this.f1611W.mo2012b((C0306l<InterfaceC0301g>) this.f1610V);
        } else {
            if (this.f1609U != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1610V = null;
        }
    }

    /* renamed from: b */
    public void m1673b(Menu menu) {
    }

    /* renamed from: b */
    public void m1674b(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m1675b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f1590B) {
            return false;
        }
        if (this.f1594F && this.f1595G) {
            mo1660a(menu, menuInflater);
            z = true;
        }
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        return layoutInflaterFactory2C0283g != null ? z | layoutInflaterFactory2C0283g.m1879a(menu, menuInflater) : z;
    }

    /* renamed from: b */
    public boolean mo1676b(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void m1677b0() {
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            layoutInflaterFactory2C0283g.m1927r();
            this.f1631u.m1924o();
        }
        this.f1612b = 3;
        this.f1596H = false;
        mo1635S();
        if (!this.f1596H) {
            throw new C0291o("Fragment " + this + " did not call through to super.onStart()");
        }
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g2 = this.f1631u;
        if (layoutInflaterFactory2C0283g2 != null) {
            layoutInflaterFactory2C0283g2.m1918l();
        }
        this.f1608T.m2050a(AbstractC0299e.a.ON_START);
        if (this.f1598J != null) {
            this.f1609U.m2050a(AbstractC0299e.a.ON_START);
        }
    }

    /* renamed from: c */
    void m1678c() {
        C0268d c0268d = this.f1602N;
        InterfaceC0270f interfaceC0270f = null;
        if (c0268d != null) {
            c0268d.f1657q = false;
            InterfaceC0270f interfaceC0270f2 = c0268d.f1658r;
            c0268d.f1658r = null;
            interfaceC0270f = interfaceC0270f2;
        }
        if (interfaceC0270f != null) {
            interfaceC0270f.mo1728a();
        }
    }

    /* renamed from: c */
    public void mo1679c(Bundle bundle) {
        this.f1596H = true;
        m1707k(bundle);
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g == null || layoutInflaterFactory2C0283g.m1895c(1)) {
            return;
        }
        this.f1631u.m1902f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1680c(Menu menu) {
        if (this.f1590B) {
            return;
        }
        if (this.f1594F && this.f1595G) {
            m1659a(menu);
        }
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            layoutInflaterFactory2C0283g.m1867a(menu);
        }
    }

    /* renamed from: c */
    public void m1681c(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m1682c(MenuItem menuItem) {
        if (this.f1590B) {
            return false;
        }
        if (m1667a(menuItem)) {
            return true;
        }
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        return layoutInflaterFactory2C0283g != null && layoutInflaterFactory2C0283g.m1880a(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void m1683c0() {
        if (this.f1598J != null) {
            this.f1609U.m2050a(AbstractC0299e.a.ON_STOP);
        }
        this.f1608T.m2050a(AbstractC0299e.a.ON_STOP);
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            layoutInflaterFactory2C0283g.m1919m();
        }
        this.f1612b = 2;
        this.f1596H = false;
        mo1636T();
        if (this.f1596H) {
            return;
        }
        throw new C0291o("Fragment " + this + " did not call through to super.onStop()");
    }

    /* renamed from: d */
    public LayoutInflater mo1684d(Bundle bundle) {
        return m1643a(bundle);
    }

    @Override // androidx.lifecycle.InterfaceC0313s
    /* renamed from: d */
    public C0312r mo1685d() {
        if (m1706k() == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f1633w == null) {
            this.f1633w = new C0312r();
        }
        return this.f1633w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m1686d(boolean z) {
        m1674b(z);
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            layoutInflaterFactory2C0283g.m1878a(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m1687d(Menu menu) {
        boolean z = false;
        if (this.f1590B) {
            return false;
        }
        if (this.f1594F && this.f1595G) {
            m1673b(menu);
            z = true;
        }
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        return layoutInflaterFactory2C0283g != null ? z | layoutInflaterFactory2C0283g.m1890b(menu) : z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m1688d(MenuItem menuItem) {
        if (this.f1590B) {
            return false;
        }
        if (this.f1594F && this.f1595G && mo1676b(menuItem)) {
            return true;
        }
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        return layoutInflaterFactory2C0283g != null && layoutInflaterFactory2C0283g.m1891b(menuItem);
    }

    /* renamed from: d0 */
    public final Context m1689d0() {
        Context m1706k = m1706k();
        if (m1706k != null) {
            return m1706k;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: e */
    public final FragmentActivity m1690e() {
        AbstractC0281e abstractC0281e = this.f1630t;
        if (abstractC0281e == null) {
            return null;
        }
        return (FragmentActivity) abstractC0281e.m1804b();
    }

    /* renamed from: e */
    public void mo1691e(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m1692e(boolean z) {
        m1681c(z);
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            layoutInflaterFactory2C0283g.m1889b(z);
        }
    }

    /* renamed from: e0 */
    public void m1693e0() {
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1629s;
        if (layoutInflaterFactory2C0283g == null || layoutInflaterFactory2C0283g.f1755n == null) {
            m1616f0().f1657q = false;
        } else if (Looper.myLooper() != this.f1629s.f1755n.m1807e().getLooper()) {
            this.f1629s.f1755n.m1807e().postAtFrontOfQueue(new RunnableC0265a());
        } else {
            m1678c();
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public void m1694f(Bundle bundle) {
        this.f1596H = true;
    }

    /* renamed from: f */
    public void m1695f(boolean z) {
        if (this.f1594F != z) {
            this.f1594F = z;
            if (!m1621E() || m1622F()) {
                return;
            }
            this.f1630t.mo1749i();
        }
    }

    /* renamed from: f */
    public boolean m1696f() {
        Boolean bool;
        C0268d c0268d = this.f1602N;
        if (c0268d == null || (bool = c0268d.f1654n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m1697g(Bundle bundle) {
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            layoutInflaterFactory2C0283g.m1927r();
        }
        this.f1612b = 2;
        this.f1596H = false;
        mo1671b(bundle);
        if (this.f1596H) {
            LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g2 = this.f1631u;
            if (layoutInflaterFactory2C0283g2 != null) {
                layoutInflaterFactory2C0283g2.m1899e();
                return;
            }
            return;
        }
        throw new C0291o("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m1698g(boolean z) {
        m1616f0().f1659s = z;
    }

    /* renamed from: g */
    public boolean m1699g() {
        Boolean bool;
        C0268d c0268d = this.f1602N;
        if (c0268d == null || (bool = c0268d.f1653m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public View m1700h() {
        C0268d c0268d = this.f1602N;
        if (c0268d == null) {
            return null;
        }
        return c0268d.f1641a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1701h(Bundle bundle) {
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g != null) {
            layoutInflaterFactory2C0283g.m1927r();
        }
        this.f1612b = 1;
        this.f1596H = false;
        mo1679c(bundle);
        this.f1607S = true;
        if (this.f1596H) {
            this.f1608T.m2050a(AbstractC0299e.a.ON_CREATE);
            return;
        }
        throw new C0291o("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Animator m1702i() {
        C0268d c0268d = this.f1602N;
        if (c0268d == null) {
            return null;
        }
        return c0268d.f1642b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public LayoutInflater m1703i(Bundle bundle) {
        LayoutInflater mo1684d = mo1684d(bundle);
        this.f1606R = mo1684d;
        return mo1684d;
    }

    /* renamed from: j */
    public final AbstractC0282f m1704j() {
        if (this.f1631u == null) {
            m1620D();
            int i = this.f1612b;
            if (i >= 4) {
                this.f1631u.m1915k();
            } else if (i >= 3) {
                this.f1631u.m1918l();
            } else if (i >= 2) {
                this.f1631u.m1899e();
            } else if (i >= 1) {
                this.f1631u.m1902f();
            }
        }
        return this.f1631u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m1705j(Bundle bundle) {
        Parcelable m1930u;
        mo1691e(bundle);
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1631u;
        if (layoutInflaterFactory2C0283g == null || (m1930u = layoutInflaterFactory2C0283g.m1930u()) == null) {
            return;
        }
        bundle.putParcelable("android:support:fragments", m1930u);
    }

    /* renamed from: k */
    public Context m1706k() {
        AbstractC0281e abstractC0281e = this.f1630t;
        if (abstractC0281e == null) {
            return null;
        }
        return abstractC0281e.m1805c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m1707k(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        if (this.f1631u == null) {
            m1620D();
        }
        this.f1631u.m1866a(parcelable, this.f1632v);
        this.f1632v = null;
        this.f1631u.m1902f();
    }

    /* renamed from: l */
    public Object m1708l() {
        C0268d c0268d = this.f1602N;
        if (c0268d == null) {
            return null;
        }
        return c0268d.f1647g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final void m1709l(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f1614d;
        if (sparseArray != null) {
            this.f1599K.restoreHierarchyState(sparseArray);
            this.f1614d = null;
        }
        this.f1596H = false;
        m1694f(bundle);
        if (this.f1596H) {
            if (this.f1598J != null) {
                this.f1609U.m2050a(AbstractC0299e.a.ON_CREATE);
            }
        } else {
            throw new C0291o("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public AbstractC0232j m1710m() {
        C0268d c0268d = this.f1602N;
        if (c0268d == null) {
            return null;
        }
        return c0268d.f1655o;
    }

    /* renamed from: m */
    public void m1711m(Bundle bundle) {
        if (this.f1616f >= 0 && m1627K()) {
            throw new IllegalStateException("Fragment already active and state has been saved");
        }
        this.f1618h = bundle;
    }

    /* renamed from: n */
    public Object m1712n() {
        C0268d c0268d = this.f1602N;
        if (c0268d == null) {
            return null;
        }
        return c0268d.f1649i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public AbstractC0232j m1713o() {
        C0268d c0268d = this.f1602N;
        if (c0268d == null) {
            return null;
        }
        return c0268d.f1656p;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f1596H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m1690e().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f1596H = true;
    }

    /* renamed from: p */
    public final AbstractC0282f m1714p() {
        return this.f1629s;
    }

    @Deprecated
    /* renamed from: q */
    public AbstractC3150r3 m1715q() {
        return AbstractC3150r3.m15184a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public int m1716r() {
        C0268d c0268d = this.f1602N;
        if (c0268d == null) {
            return 0;
        }
        return c0268d.f1644d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public int m1717s() {
        C0268d c0268d = this.f1602N;
        if (c0268d == null) {
            return 0;
        }
        return c0268d.f1645e;
    }

    public void startActivityForResult(Intent intent, int i) {
        m1657a(intent, i, (Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public int m1718t() {
        C0268d c0268d = this.f1602N;
        if (c0268d == null) {
            return 0;
        }
        return c0268d.f1646f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C3106q1.m14876a(this, sb);
        if (this.f1616f >= 0) {
            sb.append(" #");
            sb.append(this.f1616f);
        }
        if (this.f1635y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1635y));
        }
        if (this.f1589A != null) {
            sb.append(" ");
            sb.append(this.f1589A);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final Fragment m1719u() {
        return this.f1634x;
    }

    /* renamed from: v */
    public Object m1720v() {
        C0268d c0268d = this.f1602N;
        if (c0268d == null) {
            return null;
        }
        Object obj = c0268d.f1650j;
        return obj == f1588Y ? m1712n() : obj;
    }

    /* renamed from: w */
    public final Resources m1721w() {
        return m1689d0().getResources();
    }

    /* renamed from: x */
    public Object m1722x() {
        C0268d c0268d = this.f1602N;
        if (c0268d == null) {
            return null;
        }
        Object obj = c0268d.f1648h;
        return obj == f1588Y ? m1708l() : obj;
    }

    /* renamed from: y */
    public Object m1723y() {
        C0268d c0268d = this.f1602N;
        if (c0268d == null) {
            return null;
        }
        return c0268d.f1651k;
    }

    /* renamed from: z */
    public Object m1724z() {
        C0268d c0268d = this.f1602N;
        if (c0268d == null) {
            return null;
        }
        Object obj = c0268d.f1652l;
        return obj == f1588Y ? m1723y() : obj;
    }
}
