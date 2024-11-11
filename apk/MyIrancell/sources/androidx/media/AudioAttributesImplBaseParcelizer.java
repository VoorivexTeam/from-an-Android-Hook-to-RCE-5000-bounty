package androidx.media;

import androidx.versionedparcelable.AbstractC0412a;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static C0316c read(AbstractC0412a abstractC0412a) {
        C0316c c0316c = new C0316c();
        c0316c.f1928a = abstractC0412a.m3077a(c0316c.f1928a, 1);
        c0316c.f1929b = abstractC0412a.m3077a(c0316c.f1929b, 2);
        c0316c.f1930c = abstractC0412a.m3077a(c0316c.f1930c, 3);
        c0316c.f1931d = abstractC0412a.m3077a(c0316c.f1931d, 4);
        return c0316c;
    }

    public static void write(C0316c c0316c, AbstractC0412a abstractC0412a) {
        abstractC0412a.m3085a(false, false);
        abstractC0412a.m3091b(c0316c.f1928a, 1);
        abstractC0412a.m3091b(c0316c.f1929b, 2);
        abstractC0412a.m3091b(c0316c.f1930c, 3);
        abstractC0412a.m3091b(c0316c.f1931d, 4);
    }
}
