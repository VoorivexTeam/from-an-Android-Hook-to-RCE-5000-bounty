package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.C0277a;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0263a();

    /* renamed from: b */
    final int[] f1575b;

    /* renamed from: c */
    final int f1576c;

    /* renamed from: d */
    final int f1577d;

    /* renamed from: e */
    final String f1578e;

    /* renamed from: f */
    final int f1579f;

    /* renamed from: g */
    final int f1580g;

    /* renamed from: h */
    final CharSequence f1581h;

    /* renamed from: i */
    final int f1582i;

    /* renamed from: j */
    final CharSequence f1583j;

    /* renamed from: k */
    final ArrayList<String> f1584k;

    /* renamed from: l */
    final ArrayList<String> f1585l;

    /* renamed from: m */
    final boolean f1586m;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    /* loaded from: classes.dex */
    static class C0263a implements Parcelable.Creator<BackStackState> {
        C0263a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(Parcel parcel) {
        this.f1575b = parcel.createIntArray();
        this.f1576c = parcel.readInt();
        this.f1577d = parcel.readInt();
        this.f1578e = parcel.readString();
        this.f1579f = parcel.readInt();
        this.f1580g = parcel.readInt();
        this.f1581h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1582i = parcel.readInt();
        this.f1583j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1584k = parcel.createStringArrayList();
        this.f1585l = parcel.createStringArrayList();
        this.f1586m = parcel.readInt() != 0;
    }

    public BackStackState(C0277a c0277a) {
        int size = c0277a.f1695b.size();
        this.f1575b = new int[size * 6];
        if (!c0277a.f1702i) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0277a.a aVar = c0277a.f1695b.get(i2);
            int[] iArr = this.f1575b;
            int i3 = i + 1;
            iArr[i] = aVar.f1714a;
            int i4 = i3 + 1;
            Fragment fragment = aVar.f1715b;
            iArr[i3] = fragment != null ? fragment.f1616f : -1;
            int[] iArr2 = this.f1575b;
            int i5 = i4 + 1;
            iArr2[i4] = aVar.f1716c;
            int i6 = i5 + 1;
            iArr2[i5] = aVar.f1717d;
            int i7 = i6 + 1;
            iArr2[i6] = aVar.f1718e;
            i = i7 + 1;
            iArr2[i7] = aVar.f1719f;
        }
        this.f1576c = c0277a.f1700g;
        this.f1577d = c0277a.f1701h;
        this.f1578e = c0277a.f1703j;
        this.f1579f = c0277a.f1705l;
        this.f1580g = c0277a.f1706m;
        this.f1581h = c0277a.f1707n;
        this.f1582i = c0277a.f1708o;
        this.f1583j = c0277a.f1709p;
        this.f1584k = c0277a.f1710q;
        this.f1585l = c0277a.f1711r;
        this.f1586m = c0277a.f1712s;
    }

    /* renamed from: a */
    public C0277a m1613a(LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g) {
        C0277a c0277a = new C0277a(layoutInflaterFactory2C0283g);
        int i = 0;
        int i2 = 0;
        while (i < this.f1575b.length) {
            C0277a.a aVar = new C0277a.a();
            int i3 = i + 1;
            aVar.f1714a = this.f1575b[i];
            if (LayoutInflaterFactory2C0283g.f1734F) {
                String str = "Instantiate " + c0277a + " op #" + i2 + " base fragment #" + this.f1575b[i3];
            }
            int i4 = i3 + 1;
            int i5 = this.f1575b[i3];
            aVar.f1715b = i5 >= 0 ? layoutInflaterFactory2C0283g.f1747f.get(i5) : null;
            int[] iArr = this.f1575b;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar.f1716c = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar.f1717d = i9;
            int i10 = i8 + 1;
            int i11 = iArr[i8];
            aVar.f1718e = i11;
            int i12 = iArr[i10];
            aVar.f1719f = i12;
            c0277a.f1696c = i7;
            c0277a.f1697d = i9;
            c0277a.f1698e = i11;
            c0277a.f1699f = i12;
            c0277a.m1760a(aVar);
            i2++;
            i = i10 + 1;
        }
        c0277a.f1700g = this.f1576c;
        c0277a.f1701h = this.f1577d;
        c0277a.f1703j = this.f1578e;
        c0277a.f1705l = this.f1579f;
        c0277a.f1702i = true;
        c0277a.f1706m = this.f1580g;
        c0277a.f1707n = this.f1581h;
        c0277a.f1708o = this.f1582i;
        c0277a.f1709p = this.f1583j;
        c0277a.f1710q = this.f1584k;
        c0277a.f1711r = this.f1585l;
        c0277a.f1712s = this.f1586m;
        c0277a.m1758a(1);
        return c0277a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1575b);
        parcel.writeInt(this.f1576c);
        parcel.writeInt(this.f1577d);
        parcel.writeString(this.f1578e);
        parcel.writeInt(this.f1579f);
        parcel.writeInt(this.f1580g);
        TextUtils.writeToParcel(this.f1581h, parcel, 0);
        parcel.writeInt(this.f1582i);
        TextUtils.writeToParcel(this.f1583j, parcel, 0);
        parcel.writeStringList(this.f1584k);
        parcel.writeStringList(this.f1585l);
        parcel.writeInt(this.f1586m ? 1 : 0);
    }
}
