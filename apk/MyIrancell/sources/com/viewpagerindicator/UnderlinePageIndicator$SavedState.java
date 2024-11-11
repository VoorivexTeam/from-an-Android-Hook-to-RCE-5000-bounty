package com.viewpagerindicator;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class UnderlinePageIndicator$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<UnderlinePageIndicator$SavedState> CREATOR = new C2347a();

    /* renamed from: b */
    int f9590b;

    /* renamed from: com.viewpagerindicator.UnderlinePageIndicator$SavedState$a */
    /* loaded from: classes.dex */
    static class C2347a implements Parcelable.Creator<UnderlinePageIndicator$SavedState> {
        C2347a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UnderlinePageIndicator$SavedState createFromParcel(Parcel parcel) {
            return new UnderlinePageIndicator$SavedState(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UnderlinePageIndicator$SavedState[] newArray(int i) {
            return new UnderlinePageIndicator$SavedState[i];
        }
    }

    private UnderlinePageIndicator$SavedState(Parcel parcel) {
        super(parcel);
        this.f9590b = parcel.readInt();
    }

    /* synthetic */ UnderlinePageIndicator$SavedState(Parcel parcel, RunnableC2353f runnableC2353f) {
        this(parcel);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f9590b);
    }
}
