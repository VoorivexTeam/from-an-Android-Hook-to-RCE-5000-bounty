package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C0312r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0275a();

    /* renamed from: b */
    final String f1681b;

    /* renamed from: c */
    final int f1682c;

    /* renamed from: d */
    final boolean f1683d;

    /* renamed from: e */
    final int f1684e;

    /* renamed from: f */
    final int f1685f;

    /* renamed from: g */
    final String f1686g;

    /* renamed from: h */
    final boolean f1687h;

    /* renamed from: i */
    final boolean f1688i;

    /* renamed from: j */
    final Bundle f1689j;

    /* renamed from: k */
    final boolean f1690k;

    /* renamed from: l */
    Bundle f1691l;

    /* renamed from: m */
    Fragment f1692m;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    /* loaded from: classes.dex */
    static class C0275a implements Parcelable.Creator<FragmentState> {
        C0275a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    FragmentState(Parcel parcel) {
        this.f1681b = parcel.readString();
        this.f1682c = parcel.readInt();
        this.f1683d = parcel.readInt() != 0;
        this.f1684e = parcel.readInt();
        this.f1685f = parcel.readInt();
        this.f1686g = parcel.readString();
        this.f1687h = parcel.readInt() != 0;
        this.f1688i = parcel.readInt() != 0;
        this.f1689j = parcel.readBundle();
        this.f1690k = parcel.readInt() != 0;
        this.f1691l = parcel.readBundle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentState(Fragment fragment) {
        this.f1681b = fragment.getClass().getName();
        this.f1682c = fragment.f1616f;
        this.f1683d = fragment.f1624n;
        this.f1684e = fragment.f1635y;
        this.f1685f = fragment.f1636z;
        this.f1686g = fragment.f1589A;
        this.f1687h = fragment.f1592D;
        this.f1688i = fragment.f1591C;
        this.f1689j = fragment.f1618h;
        this.f1690k = fragment.f1590B;
    }

    /* renamed from: a */
    public Fragment m1750a(AbstractC0281e abstractC0281e, AbstractC0279c abstractC0279c, Fragment fragment, C0284h c0284h, C0312r c0312r) {
        if (this.f1692m == null) {
            Context m1805c = abstractC0281e.m1805c();
            Bundle bundle = this.f1689j;
            if (bundle != null) {
                bundle.setClassLoader(m1805c.getClassLoader());
            }
            this.f1692m = abstractC0279c != null ? abstractC0279c.mo1726a(m1805c, this.f1681b, this.f1689j) : Fragment.m1614a(m1805c, this.f1681b, this.f1689j);
            Bundle bundle2 = this.f1691l;
            if (bundle2 != null) {
                bundle2.setClassLoader(m1805c.getClassLoader());
                this.f1692m.f1613c = this.f1691l;
            }
            this.f1692m.m1650a(this.f1682c, fragment);
            Fragment fragment2 = this.f1692m;
            fragment2.f1624n = this.f1683d;
            fragment2.f1626p = true;
            fragment2.f1635y = this.f1684e;
            fragment2.f1636z = this.f1685f;
            fragment2.f1589A = this.f1686g;
            fragment2.f1592D = this.f1687h;
            fragment2.f1591C = this.f1688i;
            fragment2.f1590B = this.f1690k;
            fragment2.f1629s = abstractC0281e.f1733d;
            if (LayoutInflaterFactory2C0283g.f1734F) {
                String str = "Instantiated fragment " + this.f1692m;
            }
        }
        Fragment fragment3 = this.f1692m;
        fragment3.f1632v = c0284h;
        fragment3.f1633w = c0312r;
        return fragment3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1681b);
        parcel.writeInt(this.f1682c);
        parcel.writeInt(this.f1683d ? 1 : 0);
        parcel.writeInt(this.f1684e);
        parcel.writeInt(this.f1685f);
        parcel.writeString(this.f1686g);
        parcel.writeInt(this.f1687h ? 1 : 0);
        parcel.writeInt(this.f1688i ? 1 : 0);
        parcel.writeBundle(this.f1689j);
        parcel.writeInt(this.f1690k ? 1 : 0);
        parcel.writeBundle(this.f1691l);
    }
}
