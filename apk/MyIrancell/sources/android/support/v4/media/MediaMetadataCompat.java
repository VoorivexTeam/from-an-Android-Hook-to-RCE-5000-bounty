package android.support.v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import p000.C0500c0;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: d */
    static final C0500c0<String, Integer> f150d;

    /* renamed from: b */
    final Bundle f151b;

    /* renamed from: c */
    private Object f152c;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    /* loaded from: classes.dex */
    static class C0031a implements Parcelable.Creator<MediaMetadataCompat> {
        C0031a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C0500c0<String, Integer> c0500c0 = new C0500c0<>();
        f150d = c0500c0;
        c0500c0.put("android.media.metadata.TITLE", 1);
        f150d.put("android.media.metadata.ARTIST", 1);
        f150d.put("android.media.metadata.DURATION", 0);
        f150d.put("android.media.metadata.ALBUM", 1);
        f150d.put("android.media.metadata.AUTHOR", 1);
        f150d.put("android.media.metadata.WRITER", 1);
        f150d.put("android.media.metadata.COMPOSER", 1);
        f150d.put("android.media.metadata.COMPILATION", 1);
        f150d.put("android.media.metadata.DATE", 1);
        f150d.put("android.media.metadata.YEAR", 0);
        f150d.put("android.media.metadata.GENRE", 1);
        f150d.put("android.media.metadata.TRACK_NUMBER", 0);
        f150d.put("android.media.metadata.NUM_TRACKS", 0);
        f150d.put("android.media.metadata.DISC_NUMBER", 0);
        f150d.put("android.media.metadata.ALBUM_ARTIST", 1);
        f150d.put("android.media.metadata.ART", 2);
        f150d.put("android.media.metadata.ART_URI", 1);
        f150d.put("android.media.metadata.ALBUM_ART", 2);
        f150d.put("android.media.metadata.ALBUM_ART_URI", 1);
        f150d.put("android.media.metadata.USER_RATING", 3);
        f150d.put("android.media.metadata.RATING", 3);
        f150d.put("android.media.metadata.DISPLAY_TITLE", 1);
        f150d.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        f150d.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        f150d.put("android.media.metadata.DISPLAY_ICON", 2);
        f150d.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        f150d.put("android.media.metadata.MEDIA_ID", 1);
        f150d.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        f150d.put("android.media.metadata.MEDIA_URI", 1);
        f150d.put("android.media.metadata.ADVERTISEMENT", 0);
        f150d.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C0031a();
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f151b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: a */
    public static MediaMetadataCompat m232a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        C0038f.m260a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f152c = obj;
        return createFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f151b);
    }
}
