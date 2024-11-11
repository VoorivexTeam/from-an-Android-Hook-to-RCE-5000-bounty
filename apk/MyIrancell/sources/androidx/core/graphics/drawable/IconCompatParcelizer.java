package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import androidx.versionedparcelable.AbstractC0412a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC0412a abstractC0412a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1458a = abstractC0412a.m3077a(iconCompat.f1458a, 1);
        iconCompat.f1460c = abstractC0412a.m3088a(iconCompat.f1460c, 2);
        iconCompat.f1461d = abstractC0412a.m3078a((AbstractC0412a) iconCompat.f1461d, 3);
        iconCompat.f1462e = abstractC0412a.m3077a(iconCompat.f1462e, 4);
        iconCompat.f1463f = abstractC0412a.m3077a(iconCompat.f1463f, 5);
        iconCompat.f1464g = (ColorStateList) abstractC0412a.m3078a((AbstractC0412a) iconCompat.f1464g, 6);
        iconCompat.f1466i = abstractC0412a.m3080a(iconCompat.f1466i, 7);
        iconCompat.m1477c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC0412a abstractC0412a) {
        abstractC0412a.m3085a(true, true);
        iconCompat.m1475a(abstractC0412a.m3097c());
        abstractC0412a.m3091b(iconCompat.f1458a, 1);
        abstractC0412a.m3095b(iconCompat.f1460c, 2);
        abstractC0412a.m3092b(iconCompat.f1461d, 3);
        abstractC0412a.m3091b(iconCompat.f1462e, 4);
        abstractC0412a.m3091b(iconCompat.f1463f, 5);
        abstractC0412a.m3092b(iconCompat.f1464g, 6);
        abstractC0412a.m3094b(iconCompat.f1466i, 7);
    }
}
