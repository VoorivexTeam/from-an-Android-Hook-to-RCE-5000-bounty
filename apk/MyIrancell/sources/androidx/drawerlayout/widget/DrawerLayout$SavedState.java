package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes.dex */
public class DrawerLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<DrawerLayout$SavedState> CREATOR = new C0262a();

    /* renamed from: d */
    int f1570d;

    /* renamed from: e */
    int f1571e;

    /* renamed from: f */
    int f1572f;

    /* renamed from: g */
    int f1573g;

    /* renamed from: h */
    int f1574h;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
    /* loaded from: classes.dex */
    static class C0262a implements Parcelable.ClassLoaderCreator<DrawerLayout$SavedState> {
        C0262a() {
        }

        @Override // android.os.Parcelable.Creator
        public DrawerLayout$SavedState createFromParcel(Parcel parcel) {
            return new DrawerLayout$SavedState(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public DrawerLayout$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new DrawerLayout$SavedState(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public DrawerLayout$SavedState[] newArray(int i) {
            return new DrawerLayout$SavedState[i];
        }
    }

    public DrawerLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1570d = 0;
        this.f1570d = parcel.readInt();
        this.f1571e = parcel.readInt();
        this.f1572f = parcel.readInt();
        this.f1573g = parcel.readInt();
        this.f1574h = parcel.readInt();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1570d);
        parcel.writeInt(this.f1571e);
        parcel.writeInt(this.f1572f);
        parcel.writeInt(this.f1573g);
        parcel.writeInt(this.f1574h);
    }
}
