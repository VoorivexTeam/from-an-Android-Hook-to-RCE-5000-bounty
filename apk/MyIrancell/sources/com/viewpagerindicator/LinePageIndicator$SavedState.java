package com.viewpagerindicator;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class LinePageIndicator$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<LinePageIndicator$SavedState> CREATOR = new C2345a();

    /* renamed from: b */
    int f9588b;

    /* renamed from: com.viewpagerindicator.LinePageIndicator$SavedState$a */
    /* loaded from: classes.dex */
    static class C2345a implements Parcelable.Creator<LinePageIndicator$SavedState> {
        C2345a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LinePageIndicator$SavedState createFromParcel(Parcel parcel) {
            return new LinePageIndicator$SavedState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LinePageIndicator$SavedState[] newArray(int i) {
            return new LinePageIndicator$SavedState[i];
        }
    }

    private LinePageIndicator$SavedState(Parcel parcel) {
        super(parcel);
        this.f9588b = parcel.readInt();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f9588b);
    }
}
