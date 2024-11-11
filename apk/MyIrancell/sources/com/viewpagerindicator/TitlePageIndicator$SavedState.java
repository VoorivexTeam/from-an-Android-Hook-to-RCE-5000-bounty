package com.viewpagerindicator;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TitlePageIndicator$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<TitlePageIndicator$SavedState> CREATOR = new C2346a();

    /* renamed from: b */
    int f9589b;

    /* renamed from: com.viewpagerindicator.TitlePageIndicator$SavedState$a */
    /* loaded from: classes.dex */
    static class C2346a implements Parcelable.Creator<TitlePageIndicator$SavedState> {
        C2346a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TitlePageIndicator$SavedState createFromParcel(Parcel parcel) {
            return new TitlePageIndicator$SavedState(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TitlePageIndicator$SavedState[] newArray(int i) {
            return new TitlePageIndicator$SavedState[i];
        }
    }

    private TitlePageIndicator$SavedState(Parcel parcel) {
        super(parcel);
        this.f9589b = parcel.readInt();
    }

    /* synthetic */ TitlePageIndicator$SavedState(Parcel parcel, C2351d c2351d) {
        this(parcel);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f9589b);
    }
}
