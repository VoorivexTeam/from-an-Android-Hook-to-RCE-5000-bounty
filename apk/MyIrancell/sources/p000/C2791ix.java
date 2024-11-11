package p000;

import com.google.zxing.client.android.CaptureActivity;

/* renamed from: ix */
/* loaded from: classes.dex */
public final class C2791ix {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ix$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11370a;

        static {
            int[] iArr = new int[EnumC2960my.values().length];
            f11370a = iArr;
            try {
                iArr[EnumC2960my.ADDRESSBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11370a[EnumC2960my.EMAIL_ADDRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11370a[EnumC2960my.PRODUCT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11370a[EnumC2960my.URI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11370a[EnumC2960my.WIFI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11370a[EnumC2960my.GEO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11370a[EnumC2960my.TEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11370a[EnumC2960my.SMS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11370a[EnumC2960my.CALENDAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11370a[EnumC2960my.ISBN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: a */
    public static AbstractC2569hx m13266a(CaptureActivity captureActivity, C2488fw c2488fw) {
        AbstractC2914ly m13267a = m13267a(c2488fw);
        switch (a.f11370a[m13267a.m13944b().ordinal()]) {
            case 1:
                return new C0439ax(captureActivity, m13267a);
            case 2:
                return new C2362cx(captureActivity, m13267a);
            case 3:
                return new C2489fx(captureActivity, m13267a, c2488fw);
            case 4:
                return new C2959mx(captureActivity, m13267a);
            case 5:
                return new C3005nx(captureActivity, m13267a);
            case 6:
                return new C2405dx(captureActivity, m13267a);
            case 7:
                return new C2876kx(captureActivity, m13267a);
            case 8:
                return new C2831jx(captureActivity, m13267a);
            case 9:
                return new C0496bx(captureActivity, m13267a);
            case 10:
                return new C2448ex(captureActivity, m13267a, c2488fw);
            default:
                return new C2913lx(captureActivity, m13267a, c2488fw);
        }
    }

    /* renamed from: a */
    private static AbstractC2914ly m13267a(C2488fw c2488fw) {
        return AbstractC3102py.m14853c(c2488fw);
    }
}
