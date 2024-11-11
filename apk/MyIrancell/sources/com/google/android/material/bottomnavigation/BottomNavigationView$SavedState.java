package com.google.android.material.bottomnavigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class BottomNavigationView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<BottomNavigationView$SavedState> CREATOR = new C1989a();

    /* renamed from: d */
    Bundle f8371d;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$SavedState$a */
    /* loaded from: classes.dex */
    static class C1989a implements Parcelable.ClassLoaderCreator<BottomNavigationView$SavedState> {
        C1989a() {
        }

        @Override // android.os.Parcelable.Creator
        public BottomNavigationView$SavedState createFromParcel(Parcel parcel) {
            return new BottomNavigationView$SavedState(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public BottomNavigationView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new BottomNavigationView$SavedState(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public BottomNavigationView$SavedState[] newArray(int i) {
            return new BottomNavigationView$SavedState[i];
        }
    }

    public BottomNavigationView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        m10115a(parcel, classLoader);
    }

    /* renamed from: a */
    private void m10115a(Parcel parcel, ClassLoader classLoader) {
        this.f8371d = parcel.readBundle(classLoader);
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f8371d);
    }
}
