package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.AbstractC0412a;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static C0315b read(AbstractC0412a abstractC0412a) {
        C0315b c0315b = new C0315b();
        c0315b.f1926a = (AudioAttributes) abstractC0412a.m3078a((AbstractC0412a) c0315b.f1926a, 1);
        c0315b.f1927b = abstractC0412a.m3077a(c0315b.f1927b, 2);
        return c0315b;
    }

    public static void write(C0315b c0315b, AbstractC0412a abstractC0412a) {
        abstractC0412a.m3085a(false, false);
        abstractC0412a.m3092b(c0315b.f1926a, 1);
        abstractC0412a.m3091b(c0315b.f1927b, 2);
    }
}
