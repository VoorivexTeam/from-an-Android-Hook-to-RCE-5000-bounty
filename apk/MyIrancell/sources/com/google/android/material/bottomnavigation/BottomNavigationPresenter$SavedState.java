package com.google.android.material.bottomnavigation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class BottomNavigationPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator<BottomNavigationPresenter$SavedState> CREATOR = new C1988a();

    /* renamed from: b */
    int f8370b;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState$a */
    /* loaded from: classes.dex */
    static class C1988a implements Parcelable.Creator<BottomNavigationPresenter$SavedState> {
        C1988a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BottomNavigationPresenter$SavedState createFromParcel(Parcel parcel) {
            return new BottomNavigationPresenter$SavedState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BottomNavigationPresenter$SavedState[] newArray(int i) {
            return new BottomNavigationPresenter$SavedState[i];
        }
    }

    BottomNavigationPresenter$SavedState() {
    }

    BottomNavigationPresenter$SavedState(Parcel parcel) {
        this.f8370b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8370b);
    }
}
