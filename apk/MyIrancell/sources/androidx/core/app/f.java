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

/* loaded from: classes.dex */
public class f {

    /* loaded from: classes.dex */
    public static class a {
        final Bundle a;
        private final i[] b;
        private final i[] c;
        private boolean d;
        boolean e;
        private final int f;
        public int g;
        public CharSequence h;
        public PendingIntent i;

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
        }

        a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, i[] iVarArr, i[] iVarArr2, boolean z, int i2, boolean z2) {
            this.e = true;
            this.g = i;
            this.h = d.d(charSequence);
            this.i = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.b = iVarArr;
            this.c = iVarArr2;
            this.d = z;
            this.f = i2;
            this.e = z2;
        }

        public PendingIntent a() {
            return this.i;
        }

        public boolean b() {
            return this.d;
        }

        public i[] c() {
            return this.c;
        }

        public Bundle d() {
            return this.a;
        }

        public int e() {
            return this.g;
        }

        public i[] f() {
            return this.b;
        }

        public int g() {
            return this.f;
        }

        public boolean h() {
            return this.e;
        }

        public CharSequence i() {
            return this.h;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends e {
        private Bitmap e;
        private Bitmap f;
        private boolean g;

        public b a(Bitmap bitmap) {
            this.f = bitmap;
            this.g = true;
            return this;
        }

        @Override // androidx.core.app.f.e
        public void a(androidx.core.app.e eVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(eVar.a()).setBigContentTitle(this.b).bigPicture(this.e);
                if (this.g) {
                    bigPicture.bigLargeIcon(this.f);
                }
                if (this.d) {
                    bigPicture.setSummaryText(this.c);
                }
            }
        }

        public b b(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends e {
        private CharSequence e;

        public c a(CharSequence charSequence) {
            this.e = d.d(charSequence);
            return this;
        }

        @Override // androidx.core.app.f.e
        public void a(androidx.core.app.e eVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(eVar.a()).setBigContentTitle(this.b).bigText(this.e);
                if (this.d) {
                    bigText.setSummaryText(this.c);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        String A;
        Bundle B;
        int C;
        int D;
        Notification E;
        RemoteViews F;
        RemoteViews G;
        RemoteViews H;
        String I;
        int J;
        String K;
        long L;
        int M;
        Notification N;

        @Deprecated
        public ArrayList<String> O;
        public Context a;
        public ArrayList<a> b;
        ArrayList<a> c;
        CharSequence d;
        CharSequence e;
        PendingIntent f;
        PendingIntent g;
        RemoteViews h;
        Bitmap i;
        CharSequence j;
        int k;
        int l;
        boolean m;
        boolean n;
        e o;
        CharSequence p;
        CharSequence[] q;
        int r;
        int s;
        boolean t;
        String u;
        boolean v;
        String w;
        boolean x;
        boolean y;
        boolean z;

        @Deprecated
        public d(Context context) {
            this(context, null);
        }

        public d(Context context, String str) {
            this.b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.m = true;
            this.x = false;
            this.C = 0;
            this.D = 0;
            this.J = 0;
            this.M = 0;
            Notification notification = new Notification();
            this.N = notification;
            this.a = context;
            this.I = str;
            notification.when = System.currentTimeMillis();
            this.N.audioStreamType = -1;
            this.l = 0;
            this.O = new ArrayList<>();
        }

        private void a(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.N;
                i2 = i | notification.flags;
            } else {
                notification = this.N;
                i2 = (i ^ (-1)) & notification.flags;
            }
            notification.flags = i2;
        }

        private Bitmap b(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.a.getResources();
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

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public Notification a() {
            return new g(this).b();
        }

        public d a(int i) {
            this.C = i;
            return this;
        }

        public d a(int i, int i2, int i3) {
            Notification notification = this.N;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            int i4 = (i2 == 0 || i3 == 0) ? 0 : 1;
            Notification notification2 = this.N;
            notification2.flags = i4 | (notification2.flags & (-2));
            return this;
        }

        public d a(int i, int i2, boolean z) {
            this.r = i;
            this.s = i2;
            this.t = z;
            return this;
        }

        public d a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        public d a(long j) {
            this.N.when = j;
            return this;
        }

        public d a(PendingIntent pendingIntent) {
            this.f = pendingIntent;
            return this;
        }

        public d a(Bitmap bitmap) {
            this.i = b(bitmap);
            return this;
        }

        public d a(Uri uri) {
            Notification notification = this.N;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public d a(e eVar) {
            if (this.o != eVar) {
                this.o = eVar;
                if (eVar != null) {
                    eVar.a(this);
                }
            }
            return this;
        }

        public d a(CharSequence charSequence) {
            this.e = d(charSequence);
            return this;
        }

        public d a(String str) {
            this.I = str;
            return this;
        }

        public d a(boolean z) {
            a(16, z);
            return this;
        }

        public d a(long[] jArr) {
            this.N.vibrate = jArr;
            return this;
        }

        public Bundle b() {
            if (this.B == null) {
                this.B = new Bundle();
            }
            return this.B;
        }

        public d b(int i) {
            Notification notification = this.N;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public d b(PendingIntent pendingIntent) {
            this.N.deleteIntent = pendingIntent;
            return this;
        }

        public d b(CharSequence charSequence) {
            this.d = d(charSequence);
            return this;
        }

        public d b(boolean z) {
            this.x = z;
            return this;
        }

        public d c(int i) {
            this.k = i;
            return this;
        }

        public d c(CharSequence charSequence) {
            this.N.tickerText = d(charSequence);
            return this;
        }

        public d c(boolean z) {
            this.m = z;
            return this;
        }

        public d d(int i) {
            this.l = i;
            return this;
        }

        public d e(int i) {
            this.N.icon = i;
            return this;
        }

        public d f(int i) {
            this.D = i;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        protected d a;
        CharSequence b;
        CharSequence c;
        boolean d = false;

        public void a(Bundle bundle) {
        }

        public abstract void a(androidx.core.app.e eVar);

        public void a(d dVar) {
            if (this.a != dVar) {
                this.a = dVar;
                if (dVar != null) {
                    dVar.a(this);
                }
            }
        }

        public RemoteViews b(androidx.core.app.e eVar) {
            return null;
        }

        public RemoteViews c(androidx.core.app.e eVar) {
            return null;
        }

        public RemoteViews d(androidx.core.app.e eVar) {
            return null;
        }
    }

    public static Bundle a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return h.a(notification);
        }
        return null;
    }
}
