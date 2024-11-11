package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0052g;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0045a();

    /* renamed from: b */
    final int f172b;

    /* renamed from: c */
    final long f173c;

    /* renamed from: d */
    final long f174d;

    /* renamed from: e */
    final float f175e;

    /* renamed from: f */
    final long f176f;

    /* renamed from: g */
    final int f177g;

    /* renamed from: h */
    final CharSequence f178h;

    /* renamed from: i */
    final long f179i;

    /* renamed from: j */
    List<CustomAction> f180j;

    /* renamed from: k */
    final long f181k;

    /* renamed from: l */
    final Bundle f182l;

    /* renamed from: m */
    private Object f183m;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0044a();

        /* renamed from: b */
        private final String f184b;

        /* renamed from: c */
        private final CharSequence f185c;

        /* renamed from: d */
        private final int f186d;

        /* renamed from: e */
        private final Bundle f187e;

        /* renamed from: f */
        private Object f188f;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        /* loaded from: classes.dex */
        static class C0044a implements Parcelable.Creator<CustomAction> {
            C0044a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(Parcel parcel) {
            this.f184b = parcel.readString();
            this.f185c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f186d = parcel.readInt();
            this.f187e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f184b = str;
            this.f185c = charSequence;
            this.f186d = i;
            this.f187e = bundle;
        }

        /* renamed from: a */
        public static CustomAction m275a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0052g.a.m317a(obj), C0052g.a.m320d(obj), C0052g.a.m319c(obj), C0052g.a.m318b(obj));
            customAction.f188f = obj;
            return customAction;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f185c) + ", mIcon=" + this.f186d + ", mExtras=" + this.f187e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f184b);
            TextUtils.writeToParcel(this.f185c, parcel, i);
            parcel.writeInt(this.f186d);
            parcel.writeBundle(this.f187e);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    /* loaded from: classes.dex */
    static class C0045a implements Parcelable.Creator<PlaybackStateCompat> {
        C0045a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f172b = i;
        this.f173c = j;
        this.f174d = j2;
        this.f175e = f;
        this.f176f = j3;
        this.f177g = i2;
        this.f178h = charSequence;
        this.f179i = j4;
        this.f180j = new ArrayList(list);
        this.f181k = j5;
        this.f182l = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f172b = parcel.readInt();
        this.f173c = parcel.readLong();
        this.f175e = parcel.readFloat();
        this.f179i = parcel.readLong();
        this.f174d = parcel.readLong();
        this.f176f = parcel.readLong();
        this.f178h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f180j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f181k = parcel.readLong();
        this.f182l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f177g = parcel.readInt();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m274a(Object obj) {
        ArrayList arrayList;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> m311d = C0052g.m311d(obj);
        if (m311d != null) {
            ArrayList arrayList2 = new ArrayList(m311d.size());
            Iterator<Object> it = m311d.iterator();
            while (it.hasNext()) {
                arrayList2.add(CustomAction.m275a(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0052g.m316i(obj), C0052g.m315h(obj), C0052g.m310c(obj), C0052g.m314g(obj), C0052g.m308a(obj), 0, C0052g.m312e(obj), C0052g.m313f(obj), arrayList, C0052g.m309b(obj), Build.VERSION.SDK_INT >= 22 ? C0053h.m321a(obj) : null);
        playbackStateCompat.f183m = obj;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f172b + ", position=" + this.f173c + ", buffered position=" + this.f174d + ", speed=" + this.f175e + ", updated=" + this.f179i + ", actions=" + this.f176f + ", error code=" + this.f177g + ", error message=" + this.f178h + ", custom actions=" + this.f180j + ", active item id=" + this.f181k + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f172b);
        parcel.writeLong(this.f173c);
        parcel.writeFloat(this.f175e);
        parcel.writeLong(this.f179i);
        parcel.writeLong(this.f174d);
        parcel.writeLong(this.f176f);
        TextUtils.writeToParcel(this.f178h, parcel, i);
        parcel.writeTypedList(this.f180j);
        parcel.writeLong(this.f181k);
        parcel.writeBundle(this.f182l);
        parcel.writeInt(this.f177g);
    }
}
