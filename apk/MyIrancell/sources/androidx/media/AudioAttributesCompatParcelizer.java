package androidx.media;

import androidx.versionedparcelable.AbstractC0412a;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC0412a abstractC0412a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f1925a = (InterfaceC0314a) abstractC0412a.m3079a((AbstractC0412a) audioAttributesCompat.f1925a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC0412a abstractC0412a) {
        abstractC0412a.m3085a(false, false);
        abstractC0412a.m3093b(audioAttributesCompat.f1925a, 1);
    }
}
