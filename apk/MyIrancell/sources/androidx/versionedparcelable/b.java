package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
class b extends a {
    private final SparseIntArray a;
    private final Parcel b;
    private final int c;
    private final int d;
    private final String e;
    private int f;
    private int g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    b(Parcel parcel, int i, int i2, String str) {
        this.a = new SparseIntArray();
        this.f = -1;
        this.g = 0;
        this.b = parcel;
        this.c = i;
        this.d = i2;
        this.g = i;
        this.e = str;
    }

    private int d(int i) {
        int readInt;
        do {
            int i2 = this.g;
            if (i2 >= this.d) {
                return -1;
            }
            this.b.setDataPosition(i2);
            int readInt2 = this.b.readInt();
            readInt = this.b.readInt();
            this.g += readInt2;
        } while (readInt != i);
        return this.b.dataPosition();
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i = this.f;
        if (i >= 0) {
            int i2 = this.a.get(i);
            int dataPosition = this.b.dataPosition();
            this.b.setDataPosition(i2);
            this.b.writeInt(dataPosition - i2);
            this.b.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    public void a(Parcelable parcelable) {
        this.b.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void a(String str) {
        this.b.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a(byte[] bArr) {
        if (bArr == null) {
            this.b.writeInt(-1);
        } else {
            this.b.writeInt(bArr.length);
            this.b.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    public boolean a(int i) {
        int d = d(i);
        if (d == -1) {
            return false;
        }
        this.b.setDataPosition(d);
        return true;
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.b;
        int dataPosition = parcel.dataPosition();
        int i = this.g;
        if (i == this.c) {
            i = this.d;
        }
        return new b(parcel, dataPosition, i, this.e + "  ");
    }

    @Override // androidx.versionedparcelable.a
    public void b(int i) {
        a();
        this.f = i;
        this.a.put(i, this.b.dataPosition());
        c(0);
        c(i);
    }

    @Override // androidx.versionedparcelable.a
    public void c(int i) {
        this.b.writeInt(i);
    }

    @Override // androidx.versionedparcelable.a
    public byte[] d() {
        int readInt = this.b.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.b.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    public int e() {
        return this.b.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T f() {
        return (T) this.b.readParcelable(b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String g() {
        return this.b.readString();
    }
}
