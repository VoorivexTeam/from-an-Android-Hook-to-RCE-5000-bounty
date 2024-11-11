package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.LayoutInflaterFactory2C0283g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p000.C3148r1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C0277a extends AbstractC0285i implements LayoutInflaterFactory2C0283g.l {

    /* renamed from: a */
    final LayoutInflaterFactory2C0283g f1694a;

    /* renamed from: c */
    int f1696c;

    /* renamed from: d */
    int f1697d;

    /* renamed from: e */
    int f1698e;

    /* renamed from: f */
    int f1699f;

    /* renamed from: g */
    int f1700g;

    /* renamed from: h */
    int f1701h;

    /* renamed from: i */
    boolean f1702i;

    /* renamed from: j */
    String f1703j;

    /* renamed from: k */
    boolean f1704k;

    /* renamed from: m */
    int f1706m;

    /* renamed from: n */
    CharSequence f1707n;

    /* renamed from: o */
    int f1708o;

    /* renamed from: p */
    CharSequence f1709p;

    /* renamed from: q */
    ArrayList<String> f1710q;

    /* renamed from: r */
    ArrayList<String> f1711r;

    /* renamed from: t */
    ArrayList<Runnable> f1713t;

    /* renamed from: b */
    ArrayList<a> f1695b = new ArrayList<>();

    /* renamed from: l */
    int f1705l = -1;

    /* renamed from: s */
    boolean f1712s = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        int f1714a;

        /* renamed from: b */
        Fragment f1715b;

        /* renamed from: c */
        int f1716c;

        /* renamed from: d */
        int f1717d;

        /* renamed from: e */
        int f1718e;

        /* renamed from: f */
        int f1719f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        a(int i, Fragment fragment) {
            this.f1714a = i;
            this.f1715b = fragment;
        }
    }

    public C0277a(LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g) {
        this.f1694a = layoutInflaterFactory2C0283g;
    }

    /* renamed from: a */
    private void m1751a(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        fragment.f1629s = this.f1694a;
        if (str != null) {
            String str2 = fragment.f1589A;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f1589A + " now " + str);
            }
            fragment.f1589A = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.f1635y;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f1635y + " now " + i);
            }
            fragment.f1635y = i;
            fragment.f1636z = i;
        }
        m1760a(new a(i2, fragment));
    }

    /* renamed from: b */
    private static boolean m1752b(a aVar) {
        Fragment fragment = aVar.f1715b;
        return (fragment == null || !fragment.f1622l || fragment.f1598J == null || fragment.f1591C || fragment.f1590B || !fragment.m1625I()) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0285i
    /* renamed from: a */
    public int mo1753a() {
        return m1754a(false);
    }

    /* renamed from: a */
    int m1754a(boolean z) {
        if (this.f1704k) {
            throw new IllegalStateException("commit already called");
        }
        if (LayoutInflaterFactory2C0283g.f1734F) {
            String str = "Commit: " + this;
            PrintWriter printWriter = new PrintWriter(new C3148r1("FragmentManager"));
            m1761a("  ", (FileDescriptor) null, printWriter, (String[]) null);
            printWriter.close();
        }
        this.f1704k = true;
        this.f1705l = this.f1702i ? this.f1694a.m1882b(this) : -1;
        this.f1694a.m1877a(this, z);
        return this.f1705l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment m1755a(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f1695b.size()) {
            a aVar = this.f1695b.get(i);
            int i2 = aVar.f1714a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f1715b;
                    int i3 = fragment3.f1636z;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.f1636z == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f1695b.add(i, new a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                a aVar2 = new a(3, fragment4);
                                aVar2.f1716c = aVar.f1716c;
                                aVar2.f1718e = aVar.f1718e;
                                aVar2.f1717d = aVar.f1717d;
                                aVar2.f1719f = aVar.f1719f;
                                this.f1695b.add(i, aVar2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f1695b.remove(i);
                        i--;
                    } else {
                        aVar.f1714a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.f1715b);
                    Fragment fragment5 = aVar.f1715b;
                    if (fragment5 == fragment2) {
                        this.f1695b.add(i, new a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f1695b.add(i, new a(9, fragment2));
                        i++;
                        fragment2 = aVar.f1715b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.f1715b);
            i++;
        }
        return fragment2;
    }

    @Override // androidx.fragment.app.AbstractC0285i
    /* renamed from: a */
    public AbstractC0285i mo1756a(Fragment fragment) {
        m1760a(new a(3, fragment));
        return this;
    }

    @Override // androidx.fragment.app.AbstractC0285i
    /* renamed from: a */
    public AbstractC0285i mo1757a(Fragment fragment, String str) {
        m1751a(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1758a(int i) {
        if (this.f1702i) {
            if (LayoutInflaterFactory2C0283g.f1734F) {
                String str = "Bump nesting in " + this + " by " + i;
            }
            int size = this.f1695b.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = this.f1695b.get(i2);
                Fragment fragment = aVar.f1715b;
                if (fragment != null) {
                    fragment.f1628r += i;
                    if (LayoutInflaterFactory2C0283g.f1734F) {
                        String str2 = "Bump nesting of " + aVar.f1715b + " to " + aVar.f1715b.f1628r;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1759a(Fragment.InterfaceC0270f interfaceC0270f) {
        for (int i = 0; i < this.f1695b.size(); i++) {
            a aVar = this.f1695b.get(i);
            if (m1752b(aVar)) {
                aVar.f1715b.m1663a(interfaceC0270f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1760a(a aVar) {
        this.f1695b.add(aVar);
        aVar.f1716c = this.f1696c;
        aVar.f1717d = this.f1697d;
        aVar.f1718e = this.f1698e;
        aVar.f1719f = this.f1699f;
    }

    /* renamed from: a */
    public void m1761a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        m1762a(str, printWriter, true);
    }

    /* renamed from: a */
    public void m1762a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1703j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1705l);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1704k);
            if (this.f1700g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1700g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f1701h));
            }
            if (this.f1696c != 0 || this.f1697d != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1696c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1697d));
            }
            if (this.f1698e != 0 || this.f1699f != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1698e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1699f));
            }
            if (this.f1706m != 0 || this.f1707n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1706m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1707n);
            }
            if (this.f1708o != 0 || this.f1709p != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1708o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1709p);
            }
        }
        if (this.f1695b.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        String str3 = str + "    ";
        int size = this.f1695b.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.f1695b.get(i);
            switch (aVar.f1714a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                default:
                    str2 = "cmd=" + aVar.f1714a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f1715b);
            if (z) {
                if (aVar.f1716c != 0 || aVar.f1717d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1716c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1717d));
                }
                if (aVar.f1718e != 0 || aVar.f1719f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1718e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1719f));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m1763a(ArrayList<C0277a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f1695b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f1695b.get(i4).f1715b;
            int i5 = fragment != null ? fragment.f1636z : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0277a c0277a = arrayList.get(i6);
                    int size2 = c0277a.f1695b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = c0277a.f1695b.get(i7).f1715b;
                        if ((fragment2 != null ? fragment2.f1636z : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.LayoutInflaterFactory2C0283g.l
    /* renamed from: a */
    public boolean mo1764a(ArrayList<C0277a> arrayList, ArrayList<Boolean> arrayList2) {
        if (LayoutInflaterFactory2C0283g.f1734F) {
            String str = "Run: " + this;
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f1702i) {
            return true;
        }
        this.f1694a.m1874a(this);
        return true;
    }

    @Override // androidx.fragment.app.AbstractC0285i
    /* renamed from: b */
    public int mo1765b() {
        return m1754a(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Fragment m1766b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int i = 0; i < this.f1695b.size(); i++) {
            a aVar = this.f1695b.get(i);
            int i2 = aVar.f1714a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f1715b;
                            break;
                    }
                }
                arrayList.add(aVar.f1715b);
            }
            arrayList.remove(aVar.f1715b);
        }
        return fragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1767b(boolean z) {
        for (int size = this.f1695b.size() - 1; size >= 0; size--) {
            a aVar = this.f1695b.get(size);
            Fragment fragment = aVar.f1715b;
            if (fragment != null) {
                fragment.m1648a(LayoutInflaterFactory2C0283g.m1856e(this.f1700g), this.f1701h);
            }
            switch (aVar.f1714a) {
                case 1:
                    fragment.m1647a(aVar.f1719f);
                    this.f1694a.m1916k(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1714a);
                case 3:
                    fragment.m1647a(aVar.f1718e);
                    this.f1694a.m1873a(fragment, false);
                    break;
                case 4:
                    fragment.m1647a(aVar.f1718e);
                    this.f1694a.m1923o(fragment);
                    break;
                case 5:
                    fragment.m1647a(aVar.f1719f);
                    this.f1694a.m1900e(fragment);
                    break;
                case 6:
                    fragment.m1647a(aVar.f1718e);
                    this.f1694a.m1868a(fragment);
                    break;
                case 7:
                    fragment.m1647a(aVar.f1719f);
                    this.f1694a.m1892c(fragment);
                    break;
                case 8:
                    this.f1694a.m1922n(null);
                    break;
                case 9:
                    this.f1694a.m1922n(fragment);
                    break;
            }
            if (!this.f1712s && aVar.f1714a != 3 && fragment != null) {
                this.f1694a.m1909h(fragment);
            }
        }
        if (this.f1712s || !z) {
            return;
        }
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1694a;
        layoutInflaterFactory2C0283g.m1863a(layoutInflaterFactory2C0283g.f1754m, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m1768b(int i) {
        int size = this.f1695b.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f1695b.get(i2).f1715b;
            int i3 = fragment != null ? fragment.f1636z : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1769c() {
        int size = this.f1695b.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.f1695b.get(i);
            Fragment fragment = aVar.f1715b;
            if (fragment != null) {
                fragment.m1648a(this.f1700g, this.f1701h);
            }
            switch (aVar.f1714a) {
                case 1:
                    fragment.m1647a(aVar.f1716c);
                    this.f1694a.m1873a(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1714a);
                case 3:
                    fragment.m1647a(aVar.f1717d);
                    this.f1694a.m1916k(fragment);
                    break;
                case 4:
                    fragment.m1647a(aVar.f1717d);
                    this.f1694a.m1900e(fragment);
                    break;
                case 5:
                    fragment.m1647a(aVar.f1716c);
                    this.f1694a.m1923o(fragment);
                    break;
                case 6:
                    fragment.m1647a(aVar.f1717d);
                    this.f1694a.m1892c(fragment);
                    break;
                case 7:
                    fragment.m1647a(aVar.f1716c);
                    this.f1694a.m1868a(fragment);
                    break;
                case 8:
                    this.f1694a.m1922n(fragment);
                    break;
                case 9:
                    this.f1694a.m1922n(null);
                    break;
            }
            if (!this.f1712s && aVar.f1714a != 1 && fragment != null) {
                this.f1694a.m1909h(fragment);
            }
        }
        if (this.f1712s) {
            return;
        }
        LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1694a;
        layoutInflaterFactory2C0283g.m1863a(layoutInflaterFactory2C0283g.f1754m, true);
    }

    /* renamed from: d */
    public String m1770d() {
        return this.f1703j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m1771e() {
        for (int i = 0; i < this.f1695b.size(); i++) {
            if (m1752b(this.f1695b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void m1772f() {
        ArrayList<Runnable> arrayList = this.f1713t;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1713t.get(i).run();
            }
            this.f1713t = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1705l >= 0) {
            sb.append(" #");
            sb.append(this.f1705l);
        }
        if (this.f1703j != null) {
            sb.append(" ");
            sb.append(this.f1703j);
        }
        sb.append("}");
        return sb.toString();
    }
}
