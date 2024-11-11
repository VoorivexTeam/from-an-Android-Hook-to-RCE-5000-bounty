package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0043a();

    /* renamed from: b */
    public int f167b;

    /* renamed from: c */
    public int f168c;

    /* renamed from: d */
    public int f169d;

    /* renamed from: e */
    public int f170e;

    /* renamed from: f */
    public int f171f;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    /* loaded from: classes.dex */
    static class C0043a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0043a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f167b = parcel.readInt();
        this.f169d = parcel.readInt();
        this.f170e = parcel.readInt();
        this.f171f = parcel.readInt();
        this.f168c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f167b);
        parcel.writeInt(this.f169d);
        parcel.writeInt(this.f170e);
        parcel.writeInt(this.f171f);
        parcel.writeInt(this.f168c);
    }
}
