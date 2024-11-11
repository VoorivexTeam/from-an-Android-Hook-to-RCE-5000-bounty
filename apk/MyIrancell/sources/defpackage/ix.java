package defpackage;

import com.google.zxing.client.android.CaptureActivity;

/* loaded from: classes.dex */
public final class ix {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[my.values().length];
            a = iArr;
            try {
                iArr[my.ADDRESSBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[my.EMAIL_ADDRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[my.PRODUCT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[my.URI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[my.WIFI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[my.GEO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[my.TEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[my.SMS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[my.CALENDAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[my.ISBN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static hx a(CaptureActivity captureActivity, fw fwVar) {
        ly a2 = a(fwVar);
        switch (a.a[a2.b().ordinal()]) {
            case 1:
                return new ax(captureActivity, a2);
            case 2:
                return new cx(captureActivity, a2);
            case 3:
                return new fx(captureActivity, a2, fwVar);
            case 4:
                return new mx(captureActivity, a2);
            case 5:
                return new nx(captureActivity, a2);
            case 6:
                return new dx(captureActivity, a2);
            case 7:
                return new kx(captureActivity, a2);
            case 8:
                return new jx(captureActivity, a2);
            case 9:
                return new bx(captureActivity, a2);
            case 10:
                return new ex(captureActivity, a2, fwVar);
            default:
                return new lx(captureActivity, a2, fwVar);
        }
    }

    private static ly a(fw fwVar) {
        return py.c(fwVar);
    }
}
