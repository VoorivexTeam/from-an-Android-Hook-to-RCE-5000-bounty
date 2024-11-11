package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import defpackage.r1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends i implements g.l {
    final g a;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    String j;
    boolean k;
    int m;
    CharSequence n;
    int o;
    CharSequence p;
    ArrayList<String> q;
    ArrayList<String> r;
    ArrayList<Runnable> t;
    ArrayList<C0012a> b = new ArrayList<>();
    int l = -1;
    boolean s = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0012a {
        int a;
        Fragment b;
        int c;
        int d;
        int e;
        int f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0012a() {
        }

        C0012a(int i, Fragment fragment) {
            this.a = i;
            this.b = fragment;
        }
    }

    public a(g gVar) {
        this.a = gVar;
    }

    private void a(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        fragment.s = this.a;
        if (str != null) {
            String str2 = fragment.A;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.A + " now " + str);
            }
            fragment.A = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.y;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.y + " now " + i);
            }
            fragment.y = i;
            fragment.z = i;
        }
        a(new C0012a(i2, fragment));
    }

    private static boolean b(C0012a c0012a) {
        Fragment fragment = c0012a.b;
        return (fragment == null || !fragment.l || fragment.J == null || fragment.C || fragment.B || !fragment.I()) ? false : true;
    }

    @Override // androidx.fragment.app.i
    public int a() {
        return a(false);
    }

    int a(boolean z) {
        if (this.k) {
            throw new IllegalStateException("commit already called");
        }
        if (g.F) {
            String str = "Commit: " + this;
            PrintWriter printWriter = new PrintWriter(new r1("FragmentManager"));
            a("  ", (FileDescriptor) null, printWriter, (String[]) null);
            printWriter.close();
        }
        this.k = true;
        this.l = this.i ? this.a.b(this) : -1;
        this.a.a(this, z);
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment a(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.b.size()) {
            C0012a c0012a = this.b.get(i);
            int i2 = c0012a.a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = c0012a.b;
                    int i3 = fragment3.z;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.z == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.b.add(i, new C0012a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                C0012a c0012a2 = new C0012a(3, fragment4);
                                c0012a2.c = c0012a.c;
                                c0012a2.e = c0012a.e;
                                c0012a2.d = c0012a.d;
                                c0012a2.f = c0012a.f;
                                this.b.add(i, c0012a2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.b.remove(i);
                        i--;
                    } else {
                        c0012a.a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(c0012a.b);
                    Fragment fragment5 = c0012a.b;
                    if (fragment5 == fragment2) {
                        this.b.add(i, new C0012a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.b.add(i, new C0012a(9, fragment2));
                        i++;
                        fragment2 = c0012a.b;
                    }
                }
                i++;
            }
            arrayList.add(c0012a.b);
            i++;
        }
        return fragment2;
    }

    @Override // androidx.fragment.app.i
    public i a(Fragment fragment) {
        a(new C0012a(3, fragment));
        return this;
    }

    @Override // androidx.fragment.app.i
    public i a(Fragment fragment, String str) {
        a(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        if (this.i) {
            if (g.F) {
                String str = "Bump nesting in " + this + " by " + i;
            }
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0012a c0012a = this.b.get(i2);
                Fragment fragment = c0012a.b;
                if (fragment != null) {
                    fragment.r += i;
                    if (g.F) {
                        String str2 = "Bump nesting of " + c0012a.b + " to " + c0012a.b.r;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment.f fVar) {
        for (int i = 0; i < this.b.size(); i++) {
            C0012a c0012a = this.b.get(i);
            if (b(c0012a)) {
                c0012a.b.a(fVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(C0012a c0012a) {
        this.b.add(c0012a);
        c0012a.c = this.c;
        c0012a.d = this.d;
        c0012a.e = this.e;
        c0012a.f = this.f;
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        a(str, printWriter, true);
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.j);
            printWriter.print(" mIndex=");
            printWriter.print(this.l);
            printWriter.print(" mCommitted=");
            printWriter.println(this.k);
            if (this.g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.c != 0 || this.d != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.d));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        if (this.b.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        String str3 = str + "    ";
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            C0012a c0012a = this.b.get(i);
            switch (c0012a.a) {
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
                    str2 = "cmd=" + c0012a.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0012a.b);
            if (z) {
                if (c0012a.c != 0 || c0012a.d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0012a.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0012a.d));
                }
                if (c0012a.e != 0 || c0012a.f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0012a.e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0012a.f));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.b.get(i4).b;
            int i5 = fragment != null ? fragment.z : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.b.get(i7).b;
                        if ((fragment2 != null ? fragment2.z : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.g.l
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (g.F) {
            String str = "Run: " + this;
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.i) {
            return true;
        }
        this.a.a(this);
        return true;
    }

    @Override // androidx.fragment.app.i
    public int b() {
        return a(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int i = 0; i < this.b.size(); i++) {
            C0012a c0012a = this.b.get(i);
            int i2 = c0012a.a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = c0012a.b;
                            break;
                    }
                }
                arrayList.add(c0012a.b);
            }
            arrayList.remove(c0012a.b);
        }
        return fragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            C0012a c0012a = this.b.get(size);
            Fragment fragment = c0012a.b;
            if (fragment != null) {
                fragment.a(g.e(this.g), this.h);
            }
            switch (c0012a.a) {
                case 1:
                    fragment.a(c0012a.f);
                    this.a.k(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0012a.a);
                case 3:
                    fragment.a(c0012a.e);
                    this.a.a(fragment, false);
                    break;
                case 4:
                    fragment.a(c0012a.e);
                    this.a.o(fragment);
                    break;
                case 5:
                    fragment.a(c0012a.f);
                    this.a.e(fragment);
                    break;
                case 6:
                    fragment.a(c0012a.e);
                    this.a.a(fragment);
                    break;
                case 7:
                    fragment.a(c0012a.f);
                    this.a.c(fragment);
                    break;
                case 8:
                    this.a.n(null);
                    break;
                case 9:
                    this.a.n(fragment);
                    break;
            }
            if (!this.s && c0012a.a != 3 && fragment != null) {
                this.a.h(fragment);
            }
        }
        if (this.s || !z) {
            return;
        }
        g gVar = this.a;
        gVar.a(gVar.m, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.b.get(i2).b;
            int i3 = fragment != null ? fragment.z : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            C0012a c0012a = this.b.get(i);
            Fragment fragment = c0012a.b;
            if (fragment != null) {
                fragment.a(this.g, this.h);
            }
            switch (c0012a.a) {
                case 1:
                    fragment.a(c0012a.c);
                    this.a.a(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0012a.a);
                case 3:
                    fragment.a(c0012a.d);
                    this.a.k(fragment);
                    break;
                case 4:
                    fragment.a(c0012a.d);
                    this.a.e(fragment);
                    break;
                case 5:
                    fragment.a(c0012a.c);
                    this.a.o(fragment);
                    break;
                case 6:
                    fragment.a(c0012a.d);
                    this.a.c(fragment);
                    break;
                case 7:
                    fragment.a(c0012a.c);
                    this.a.a(fragment);
                    break;
                case 8:
                    this.a.n(fragment);
                    break;
                case 9:
                    this.a.n(null);
                    break;
            }
            if (!this.s && c0012a.a != 1 && fragment != null) {
                this.a.h(fragment);
            }
        }
        if (this.s) {
            return;
        }
        g gVar = this.a;
        gVar.a(gVar.m, true);
    }

    public String d() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        for (int i = 0; i < this.b.size(); i++) {
            if (b(this.b.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        ArrayList<Runnable> arrayList = this.t;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.t.get(i).run();
            }
            this.t = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.l >= 0) {
            sb.append(" #");
            sb.append(this.l);
        }
        if (this.j != null) {
            sb.append(" ");
            sb.append(this.j);
        }
        sb.append("}");
        return sb.toString();
    }
}
