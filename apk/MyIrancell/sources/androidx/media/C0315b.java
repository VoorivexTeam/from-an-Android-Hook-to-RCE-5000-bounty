package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* renamed from: androidx.media.b */
/* loaded from: classes.dex */
class C0315b implements InterfaceC0314a {

    /* renamed from: a */
    AudioAttributes f1926a;

    /* renamed from: b */
    int f1927b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof C0315b) {
            return this.f1926a.equals(((C0315b) obj).f1926a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1926a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1926a;
    }
}
