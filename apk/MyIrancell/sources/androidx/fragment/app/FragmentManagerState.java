package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0274a();

    /* renamed from: b */
    FragmentState[] f1676b;

    /* renamed from: c */
    int[] f1677c;

    /* renamed from: d */
    BackStackState[] f1678d;

    /* renamed from: e */
    int f1679e;

    /* renamed from: f */
    int f1680f;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    /* loaded from: classes.dex */
    static class C0274a implements Parcelable.Creator<FragmentManagerState> {
        C0274a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
        this.f1679e = -1;
    }

    public FragmentManagerState(Parcel parcel) {
        this.f1679e = -1;
        this.f1676b = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f1677c = parcel.createIntArray();
        this.f1678d = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f1679e = parcel.readInt();
        this.f1680f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f1676b, i);
        parcel.writeIntArray(this.f1677c);
        parcel.writeTypedArray(this.f1678d, i);
        parcel.writeInt(this.f1679e);
        parcel.writeInt(this.f1680f);
    }
}
