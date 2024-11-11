package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.R$dimen;
import java.util.ArrayList;

/* renamed from: androidx.core.app.f */
/* loaded from: classes.dex */
public class C0228f {

    /* renamed from: androidx.core.app.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Bundle f1378a;

        /* renamed from: b */
        private final C0231i[] f1379b;

        /* renamed from: c */
        private final C0231i[] f1380c;

        /* renamed from: d */
        private boolean f1381d;

        /* renamed from: e */
        boolean f1382e;

        /* renamed from: f */
        private final int f1383f;

        /* renamed from: g */
        public int f1384g;

        /* renamed from: h */
        public CharSequence f1385h;

        /* renamed from: i */
        public PendingIntent f1386i;

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
        }

        a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0231i[] c0231iArr, C0231i[] c0231iArr2, boolean z, int i2, boolean z2) {
            this.f1382e = true;
            this.f1384g = i;
            this.f1385h = d.m1394d(charSequence);
            this.f1386i = pendingIntent;
            this.f1378a = bundle == null ? new Bundle() : bundle;
            this.f1379b = c0231iArr;
            this.f1380c = c0231iArr2;
            this.f1381d = z;
            this.f1383f = i2;
            this.f1382e = z2;
        }

        /* renamed from: a */
        public PendingIntent m1379a() {
            return this.f1386i;
        }

        /* renamed from: b */
        public boolean m1380b() {
            return this.f1381d;
        }

        /* renamed from: c */
        public C0231i[] m1381c() {
            return this.f1380c;
        }

        /* renamed from: d */
        public Bundle m1382d() {
            return this.f1378a;
        }

        /* renamed from: e */
        public int m1383e() {
            return this.f1384g;
        }

        /* renamed from: f */
        public C0231i[] m1384f() {
            return this.f1379b;
        }

        /* renamed from: g */
        public int m1385g() {
            return this.f1383f;
        }

        /* renamed from: h */
        public boolean m1386h() {
            return this.f1382e;
        }

        /* renamed from: i */
        public CharSequence m1387i() {
            return this.f1385h;
        }
    }

    /* renamed from: androidx.core.app.f$b */
    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: e */
        private Bitmap f1387e;

        /* renamed from: f */
        private Bitmap f1388f;

        /* renamed from: g */
        private boolean f1389g;

        /* renamed from: a */
        public b m1388a(Bitmap bitmap) {
            this.f1388f = bitmap;
            this.f1389g = true;
            return this;
        }

        @Override // androidx.core.app.C0228f.e
        /* renamed from: a */
        public void mo1389a(InterfaceC0227e interfaceC0227e) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(interfaceC0227e.mo1377a()).setBigContentTitle(this.f1433b).bigPicture(this.f1387e);
                if (this.f1389g) {
                    bigPicture.bigLargeIcon(this.f1388f);
                }
                if (this.f1435d) {
                    bigPicture.setSummaryText(this.f1434c);
                }
            }
        }

        /* renamed from: b */
        public b m1390b(Bitmap bitmap) {
            this.f1387e = bitmap;
            return this;
        }
    }

    /* renamed from: androidx.core.app.f$c */
    /* loaded from: classes.dex */
    public static class c extends e {

        /* renamed from: e */
        private CharSequence f1390e;

        /* renamed from: a */
        public c m1391a(CharSequence charSequence) {
            this.f1390e = d.m1394d(charSequence);
            return this;
        }

        @Override // androidx.core.app.C0228f.e
        /* renamed from: a */
        public void mo1389a(InterfaceC0227e interfaceC0227e) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(interfaceC0227e.mo1377a()).setBigContentTitle(this.f1433b).bigText(this.f1390e);
                if (this.f1435d) {
                    bigText.setSummaryText(this.f1434c);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.f$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: A */
        String f1391A;

        /* renamed from: B */
        Bundle f1392B;

        /* renamed from: C */
        int f1393C;

        /* renamed from: D */
        int f1394D;

        /* renamed from: E */
        Notification f1395E;

        /* renamed from: F */
        RemoteViews f1396F;

        /* renamed from: G */
        RemoteViews f1397G;

        /* renamed from: H */
        RemoteViews f1398H;

        /* renamed from: I */
        String f1399I;

        /* renamed from: J */
        int f1400J;

        /* renamed from: K */
        String f1401K;

        /* renamed from: L */
        long f1402L;

        /* renamed from: M */
        int f1403M;

        /* renamed from: N */
        Notification f1404N;

        /* renamed from: O */
        @Deprecated
        public ArrayList<String> f1405O;

        /* renamed from: a */
        public Context f1406a;

        /* renamed from: b */
        public ArrayList<a> f1407b;

        /* renamed from: c */
        ArrayList<a> f1408c;

        /* renamed from: d */
        CharSequence f1409d;

        /* renamed from: e */
        CharSequence f1410e;

        /* renamed from: f */
        PendingIntent f1411f;

        /* renamed from: g */
        PendingIntent f1412g;

        /* renamed from: h */
        RemoteViews f1413h;

        /* renamed from: i */
        Bitmap f1414i;

        /* renamed from: j */
        CharSequence f1415j;

        /* renamed from: k */
        int f1416k;

        /* renamed from: l */
        int f1417l;

        /* renamed from: m */
        boolean f1418m;

        /* renamed from: n */
        boolean f1419n;

        /* renamed from: o */
        e f1420o;

        /* renamed from: p */
        CharSequence f1421p;

        /* renamed from: q */
        CharSequence[] f1422q;

        /* renamed from: r */
        int f1423r;

        /* renamed from: s */
        int f1424s;

        /* renamed from: t */
        boolean f1425t;

        /* renamed from: u */
        String f1426u;

        /* renamed from: v */
        boolean f1427v;

        /* renamed from: w */
        String f1428w;

        /* renamed from: x */
        boolean f1429x;

        /* renamed from: y */
        boolean f1430y;

        /* renamed from: z */
        boolean f1431z;

        @Deprecated
        public d(Context context) {
            this(context, null);
        }

        public d(Context context, String str) {
            this.f1407b = new ArrayList<>();
            this.f1408c = new ArrayList<>();
            this.f1418m = true;
            this.f1429x = false;
            this.f1393C = 0;
            this.f1394D = 0;
            this.f1400J = 0;
            this.f1403M = 0;
            Notification notification = new Notification();
            this.f1404N = notification;
            this.f1406a = context;
            this.f1399I = str;
            notification.when = System.currentTimeMillis();
            this.f1404N.audioStreamType = -1;
            this.f1417l = 0;
            this.f1405O = new ArrayList<>();
        }

        /* renamed from: a */
        private void m1392a(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.f1404N;
                i2 = i | notification.flags;
            } else {
                notification = this.f1404N;
                i2 = (i ^ (-1)) & notification.flags;
            }
            notification.flags = i2;
        }

        /* renamed from: b */
        private Bitmap m1393b(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f1406a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d = dimensionPixelSize;
            double max = Math.max(1, bitmap.getWidth());
            Double.isNaN(d);
            Double.isNaN(max);
            double d2 = d / max;
            double d3 = dimensionPixelSize2;
            double max2 = Math.max(1, bitmap.getHeight());
            Double.isNaN(d3);
            Double.isNaN(max2);
            double min = Math.min(d2, d3 / max2);
            double width = bitmap.getWidth();
            Double.isNaN(width);
            int ceil = (int) Math.ceil(width * min);
            double height = bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * min), true);
        }

        /* renamed from: d */
        protected static CharSequence m1394d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: a */
        public Notification m1395a() {
            return new C0229g(this).m1427b();
        }

        /* renamed from: a */
        public d m1396a(int i) {
            this.f1393C = i;
            return this;
        }

        /* renamed from: a */
        public d m1397a(int i, int i2, int i3) {
            Notification notification = this.f1404N;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            int i4 = (i2 == 0 || i3 == 0) ? 0 : 1;
            Notification notification2 = this.f1404N;
            notification2.flags = i4 | (notification2.flags & (-2));
            return this;
        }

        /* renamed from: a */
        public d m1398a(int i, int i2, boolean z) {
            this.f1423r = i;
            this.f1424s = i2;
            this.f1425t = z;
            return this;
        }

        /* renamed from: a */
        public d m1399a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1407b.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: a */
        public d m1400a(long j) {
            this.f1404N.when = j;
            return this;
        }

        /* renamed from: a */
        public d m1401a(PendingIntent pendingIntent) {
            this.f1411f = pendingIntent;
            return this;
        }

        /* renamed from: a */
        public d m1402a(Bitmap bitmap) {
            this.f1414i = m1393b(bitmap);
            return this;
        }

        /* renamed from: a */
        public d m1403a(Uri uri) {
            Notification notification = this.f1404N;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: a */
        public d m1404a(e eVar) {
            if (this.f1420o != eVar) {
                this.f1420o = eVar;
                if (eVar != null) {
                    eVar.m1421a(this);
                }
            }
            return this;
        }

        /* renamed from: a */
        public d m1405a(CharSequence charSequence) {
            this.f1410e = m1394d(charSequence);
            return this;
        }

        /* renamed from: a */
        public d m1406a(String str) {
            this.f1399I = str;
            return this;
        }

        /* renamed from: a */
        public d m1407a(boolean z) {
            m1392a(16, z);
            return this;
        }

        /* renamed from: a */
        public d m1408a(long[] jArr) {
            this.f1404N.vibrate = jArr;
            return this;
        }

        /* renamed from: b */
        public Bundle m1409b() {
            if (this.f1392B == null) {
                this.f1392B = new Bundle();
            }
            return this.f1392B;
        }

        /* renamed from: b */
        public d m1410b(int i) {
            Notification notification = this.f1404N;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: b */
        public d m1411b(PendingIntent pendingIntent) {
            this.f1404N.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: b */
        public d m1412b(CharSequence charSequence) {
            this.f1409d = m1394d(charSequence);
            return this;
        }

        /* renamed from: b */
        public d m1413b(boolean z) {
            this.f1429x = z;
            return this;
        }

        /* renamed from: c */
        public d m1414c(int i) {
            this.f1416k = i;
            return this;
        }

        /* renamed from: c */
        public d m1415c(CharSequence charSequence) {
            this.f1404N.tickerText = m1394d(charSequence);
            return this;
        }

        /* renamed from: c */
        public d m1416c(boolean z) {
            this.f1418m = z;
            return this;
        }

        /* renamed from: d */
        public d m1417d(int i) {
            this.f1417l = i;
            return this;
        }

        /* renamed from: e */
        public d m1418e(int i) {
            this.f1404N.icon = i;
            return this;
        }

        /* renamed from: f */
        public d m1419f(int i) {
            this.f1394D = i;
            return this;
        }
    }

    /* renamed from: androidx.core.app.f$e */
    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a */
        protected d f1432a;

        /* renamed from: b */
        CharSequence f1433b;

        /* renamed from: c */
        CharSequence f1434c;

        /* renamed from: d */
        boolean f1435d = false;

        /* renamed from: a */
        public void m1420a(Bundle bundle) {
        }

        /* renamed from: a */
        public abstract void mo1389a(InterfaceC0227e interfaceC0227e);

        /* renamed from: a */
        public void m1421a(d dVar) {
            if (this.f1432a != dVar) {
                this.f1432a = dVar;
                if (dVar != null) {
                    dVar.m1404a(this);
                }
            }
        }

        /* renamed from: b */
        public RemoteViews m1422b(InterfaceC0227e interfaceC0227e) {
            return null;
        }

        /* renamed from: c */
        public RemoteViews m1423c(InterfaceC0227e interfaceC0227e) {
            return null;
        }

        /* renamed from: d */
        public RemoteViews m1424d(InterfaceC0227e interfaceC0227e) {
            return null;
        }
    }

    /* renamed from: a */
    public static Bundle m1378a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C0230h.m1430a(notification);
        }
        return null;
    }
}
