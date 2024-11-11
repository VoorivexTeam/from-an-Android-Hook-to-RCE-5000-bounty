package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0036d;
import android.support.v4.media.C0037e;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0029a();

    /* renamed from: b */
    private final String f133b;

    /* renamed from: c */
    private final CharSequence f134c;

    /* renamed from: d */
    private final CharSequence f135d;

    /* renamed from: e */
    private final CharSequence f136e;

    /* renamed from: f */
    private final Bitmap f137f;

    /* renamed from: g */
    private final Uri f138g;

    /* renamed from: h */
    private final Bundle f139h;

    /* renamed from: i */
    private final Uri f140i;

    /* renamed from: j */
    private Object f141j;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    /* loaded from: classes.dex */
    static class C0029a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0029a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m221a(C0036d.m241a(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    /* loaded from: classes.dex */
    public static final class C0030b {

        /* renamed from: a */
        private String f142a;

        /* renamed from: b */
        private CharSequence f143b;

        /* renamed from: c */
        private CharSequence f144c;

        /* renamed from: d */
        private CharSequence f145d;

        /* renamed from: e */
        private Bitmap f146e;

        /* renamed from: f */
        private Uri f147f;

        /* renamed from: g */
        private Bundle f148g;

        /* renamed from: h */
        private Uri f149h;

        /* renamed from: a */
        public C0030b m223a(Bitmap bitmap) {
            this.f146e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0030b m224a(Uri uri) {
            this.f147f = uri;
            return this;
        }

        /* renamed from: a */
        public C0030b m225a(Bundle bundle) {
            this.f148g = bundle;
            return this;
        }

        /* renamed from: a */
        public C0030b m226a(CharSequence charSequence) {
            this.f145d = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0030b m227a(String str) {
            this.f142a = str;
            return this;
        }

        /* renamed from: a */
        public MediaDescriptionCompat m228a() {
            return new MediaDescriptionCompat(this.f142a, this.f143b, this.f144c, this.f145d, this.f146e, this.f147f, this.f148g, this.f149h);
        }

        /* renamed from: b */
        public C0030b m229b(Uri uri) {
            this.f149h = uri;
            return this;
        }

        /* renamed from: b */
        public C0030b m230b(CharSequence charSequence) {
            this.f144c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0030b m231c(CharSequence charSequence) {
            this.f143b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f133b = parcel.readString();
        this.f134c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f135d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f136e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f137f = (Bitmap) parcel.readParcelable(classLoader);
        this.f138g = (Uri) parcel.readParcelable(classLoader);
        this.f139h = parcel.readBundle(classLoader);
        this.f140i = (Uri) parcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f133b = str;
        this.f134c = charSequence;
        this.f135d = charSequence2;
        this.f136e = charSequence3;
        this.f137f = bitmap;
        this.f138g = uri;
        this.f139h = bundle;
        this.f140i = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat m221a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L80
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L80
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            java.lang.String r2 = android.support.v4.media.C0036d.m246e(r8)
            r1.m227a(r2)
            java.lang.CharSequence r2 = android.support.v4.media.C0036d.m248g(r8)
            r1.m231c(r2)
            java.lang.CharSequence r2 = android.support.v4.media.C0036d.m247f(r8)
            r1.m230b(r2)
            java.lang.CharSequence r2 = android.support.v4.media.C0036d.m240a(r8)
            r1.m226a(r2)
            android.graphics.Bitmap r2 = android.support.v4.media.C0036d.m244c(r8)
            r1.m223a(r2)
            android.net.Uri r2 = android.support.v4.media.C0036d.m245d(r8)
            r1.m224a(r2)
            android.os.Bundle r2 = android.support.v4.media.C0036d.m243b(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L4a
            android.support.v4.media.session.MediaSessionCompat.m268a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L4b
        L4a:
            r4 = r0
        L4b:
            if (r4 == 0) goto L63
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L5d
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L5d
            goto L64
        L5d:
            r2.remove(r3)
            r2.remove(r5)
        L63:
            r0 = r2
        L64:
            r1.m225a(r0)
            if (r4 == 0) goto L6d
            r1.m229b(r4)
            goto L7a
        L6d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L7a
            android.net.Uri r0 = android.support.v4.media.C0037e.m258a(r8)
            r1.m229b(r0)
        L7a:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.m228a()
            r0.f141j = r8
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.m221a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: a */
    public Object m222a() {
        if (this.f141j != null || Build.VERSION.SDK_INT < 21) {
            return this.f141j;
        }
        Object m249a = C0036d.a.m249a();
        C0036d.a.m255a(m249a, this.f133b);
        C0036d.a.m257c(m249a, this.f134c);
        C0036d.a.m256b(m249a, this.f135d);
        C0036d.a.m254a(m249a, this.f136e);
        C0036d.a.m251a(m249a, this.f137f);
        C0036d.a.m252a(m249a, this.f138g);
        Bundle bundle = this.f139h;
        if (Build.VERSION.SDK_INT < 23 && this.f140i != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f140i);
        }
        C0036d.a.m253a(m249a, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            C0037e.a.m259a(m249a, this.f140i);
        }
        Object m250a = C0036d.a.m250a(m249a);
        this.f141j = m250a;
        return m250a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f134c) + ", " + ((Object) this.f135d) + ", " + ((Object) this.f136e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0036d.m242a(m222a(), parcel, i);
            return;
        }
        parcel.writeString(this.f133b);
        TextUtils.writeToParcel(this.f134c, parcel, i);
        TextUtils.writeToParcel(this.f135d, parcel, i);
        TextUtils.writeToParcel(this.f136e, parcel, i);
        parcel.writeParcelable(this.f137f, i);
        parcel.writeParcelable(this.f138g, i);
        parcel.writeBundle(this.f139h);
        parcel.writeParcelable(this.f140i, i);
    }
}
