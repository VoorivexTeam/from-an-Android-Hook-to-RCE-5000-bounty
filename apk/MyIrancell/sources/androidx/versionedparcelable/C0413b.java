package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* renamed from: androidx.versionedparcelable.b */
/* loaded from: classes.dex */
class C0413b extends AbstractC0412a {

    /* renamed from: a */
    private final SparseIntArray f2545a;

    /* renamed from: b */
    private final Parcel f2546b;

    /* renamed from: c */
    private final int f2547c;

    /* renamed from: d */
    private final int f2548d;

    /* renamed from: e */
    private final String f2549e;

    /* renamed from: f */
    private int f2550f;

    /* renamed from: g */
    private int f2551g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0413b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    C0413b(Parcel parcel, int i, int i2, String str) {
        this.f2545a = new SparseIntArray();
        this.f2550f = -1;
        this.f2551g = 0;
        this.f2546b = parcel;
        this.f2547c = i;
        this.f2548d = i2;
        this.f2551g = i;
        this.f2549e = str;
    }

    /* renamed from: d */
    private int m3103d(int i) {
        int readInt;
        do {
            int i2 = this.f2551g;
            if (i2 >= this.f2548d) {
                return -1;
            }
            this.f2546b.setDataPosition(i2);
            int readInt2 = this.f2546b.readInt();
            readInt = this.f2546b.readInt();
            this.f2551g += readInt2;
        } while (readInt != i);
        return this.f2546b.dataPosition();
    }

    @Override // androidx.versionedparcelable.AbstractC0412a
    /* renamed from: a */
    public void mo3081a() {
        int i = this.f2550f;
        if (i >= 0) {
            int i2 = this.f2545a.get(i);
            int dataPosition = this.f2546b.dataPosition();
            this.f2546b.setDataPosition(i2);
            this.f2546b.writeInt(dataPosition - i2);
            this.f2546b.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC0412a
    /* renamed from: a */
    public void mo3082a(Parcelable parcelable) {
        this.f2546b.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC0412a
    /* renamed from: a */
    public void mo3084a(String str) {
        this.f2546b.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC0412a
    /* renamed from: a */
    public void mo3086a(byte[] bArr) {
        if (bArr == null) {
            this.f2546b.writeInt(-1);
        } else {
            this.f2546b.writeInt(bArr.length);
            this.f2546b.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC0412a
    /* renamed from: a */
    public boolean mo3087a(int i) {
        int m3103d = m3103d(i);
        if (m3103d == -1) {
            return false;
        }
        this.f2546b.setDataPosition(m3103d);
        return true;
    }

    @Override // androidx.versionedparcelable.AbstractC0412a
    /* renamed from: b */
    protected AbstractC0412a mo3089b() {
        Parcel parcel = this.f2546b;
        int dataPosition = parcel.dataPosition();
        int i = this.f2551g;
        if (i == this.f2547c) {
            i = this.f2548d;
        }
        return new C0413b(parcel, dataPosition, i, this.f2549e + "  ");
    }

    @Override // androidx.versionedparcelable.AbstractC0412a
    /* renamed from: b */
    public void mo3090b(int i) {
        mo3081a();
        this.f2550f = i;
        this.f2545a.put(i, this.f2546b.dataPosition());
        mo3096c(0);
        mo3096c(i);
    }

    @Override // androidx.versionedparcelable.AbstractC0412a
    /* renamed from: c */
    public void mo3096c(int i) {
        this.f2546b.writeInt(i);
    }

    @Override // androidx.versionedparcelable.AbstractC0412a
    /* renamed from: d */
    public byte[] mo3098d() {
        int readInt = this.f2546b.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f2546b.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC0412a
    /* renamed from: e */
    public int mo3099e() {
        return this.f2546b.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC0412a
    /* renamed from: f */
    public <T extends Parcelable> T mo3100f() {
        return (T) this.f2546b.readParcelable(C0413b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC0412a
    /* renamed from: g */
    public String mo3101g() {
        return this.f2546b.readString();
    }
}
