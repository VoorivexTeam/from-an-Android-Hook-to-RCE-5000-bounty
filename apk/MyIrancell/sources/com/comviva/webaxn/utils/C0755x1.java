package com.comviva.webaxn.utils;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.appcompat.widget.C0186n0;
import androidx.core.app.C0228f;
import androidx.core.content.FileProvider;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0630g0;
import com.comviva.webaxn.p002ui.C0632h;
import com.comviva.webaxn.p002ui.C0633h0;
import com.comviva.webaxn.p002ui.C0635i;
import com.comviva.webaxn.p002ui.C0636i0;
import com.comviva.webaxn.p002ui.C0641k;
import com.comviva.webaxn.p002ui.C0644l;
import com.comviva.webaxn.p002ui.C0655o1;
import com.comviva.webaxn.p002ui.C0661r0;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import com.comviva.webaxn.p002ui.ExitActivity;
import com.comviva.webaxn.p002ui.WebAxnActivity;
import com.comviva.webaxn.transport.NotificationReceiver;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import p000.C0023aj;
import p000.C2434ej;
import p000.C2475fj;
import p000.C2555hj;
import p000.C2862kj;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;
import p000.C3530zi;
import p000.C3531zj;

/* renamed from: com.comviva.webaxn.utils.x1 */
/* loaded from: classes.dex */
public class C0755x1 {

    /* renamed from: A */
    public static int f5237A = 0;

    /* renamed from: B */
    public static String f5238B = null;

    /* renamed from: C */
    public static boolean f5239C = false;

    /* renamed from: D */
    public static String f5240D = null;

    /* renamed from: E */
    public static boolean f5241E = false;

    /* renamed from: F */
    public static TapsellSDKAdv f5242F = null;

    /* renamed from: a */
    public static double f5243a = 100.0d;

    /* renamed from: b */
    public static boolean f5244b = false;

    /* renamed from: c */
    public static boolean f5245c = false;

    /* renamed from: d */
    public static boolean f5246d = false;

    /* renamed from: e */
    public static boolean f5247e = true;

    /* renamed from: f */
    public static boolean f5248f = true;

    /* renamed from: g */
    public static AlertDialog f5249g;

    /* renamed from: h */
    static File f5250h = Environment.getExternalStorageDirectory();

    /* renamed from: i */
    public static boolean f5251i;

    /* renamed from: j */
    public static boolean f5252j;

    /* renamed from: k */
    public static boolean f5253k;

    /* renamed from: l */
    public static boolean f5254l;

    /* renamed from: m */
    public static String f5255m;

    /* renamed from: n */
    public static String f5256n;

    /* renamed from: o */
    public static boolean f5257o;

    /* renamed from: p */
    public static AlertDialog f5258p;

    /* renamed from: q */
    public static C3400wj f5259q;

    /* renamed from: r */
    public static C3489yj f5260r;

    /* renamed from: s */
    public static String f5261s;

    /* renamed from: t */
    public static HashMap<String, String> f5262t;

    /* renamed from: u */
    public static boolean f5263u;

    /* renamed from: v */
    public static boolean f5264v;

    /* renamed from: w */
    public static Activity f5265w;

    /* renamed from: x */
    public static boolean f5266x;

    /* renamed from: y */
    public static boolean f5267y;

    /* renamed from: z */
    public static boolean f5268z;

    /* renamed from: com.comviva.webaxn.utils.x1$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5269a;

        static {
            int[] iArr = new int[C3489yj.a.values().length];
            f5269a = iArr;
            try {
                iArr[C3489yj.a.FOCUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5269a[C3489yj.a.FILLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5269a[C3489yj.a.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.comviva.webaxn.utils.x1$b */
    /* loaded from: classes.dex */
    static class b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ WebAxnActivity f5270b;

        b(WebAxnActivity webAxnActivity) {
            this.f5270b = webAxnActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (C0755x1.f5251i) {
                C0755x1.f5251i = false;
            } else {
                String str = C0755x1.f5255m;
                if (str == null || !(str.equals("USER_ACTIVATION") || C0755x1.f5255m.equals("DONGLE_ACTIVATION") || C0755x1.f5255m.equals("MAKE_PAYMENT"))) {
                    C0755x1.m6138a((Activity) this.f5270b);
                    return;
                } else {
                    C0755x1.f5255m = null;
                    this.f5270b.setResult(0);
                }
            }
            this.f5270b.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.x1$c */
    /* loaded from: classes.dex */
    public class c extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        PushData f5271a;

        /* renamed from: b */
        Context f5272b;

        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Boolean doInBackground(java.lang.String... r10) {
            /*
                r9 = this;
                r0 = 0
                r10 = r10[r0]
                r1 = 0
                java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
                r2.<init>(r10)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
                java.net.URLConnection r10 = r2.openConnection()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
                java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
                java.lang.String r1 = "GET"
                r10.setRequestMethod(r1)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                java.lang.String r1 = "User-Agent"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                r2.<init>()     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                java.lang.String r3 = "2.3.0.11583/"
                r2.append(r3)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                android.content.Context r3 = r9.f5272b     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                com.comviva.webaxn.utils.j1 r3 = com.comviva.webaxn.utils.C0713j1.m5563a(r3)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                java.lang.String r3 = r3.m5617V()     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                r2.append(r3)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                r10.addRequestProperty(r1, r2)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                java.lang.String r1 = "Content-Length"
                java.lang.String r1 = r10.getHeaderField(r1)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                if (r1 > 0) goto L42
                r2 = 0
                goto L43
            L42:
                r2 = 1
            L43:
                if (r2 == 0) goto L71
                byte[] r3 = new byte[r1]     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                java.io.InputStream r5 = r10.getInputStream()     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                r4.<init>(r5)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                r5.<init>()     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
            L55:
                int r6 = r4.read(r3, r0, r1)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                r7 = -1
                if (r6 == r7) goto L60
                r5.write(r3, r0, r6)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                goto L55
            L60:
                byte[] r1 = r5.toByteArray()     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                com.comviva.webaxn.utils.PushData r3 = r9.f5271a     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                int r5 = r1.length     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r0, r5)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                r3.m5224a(r1)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                r4.close()     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
            L71:
                if (r10 == 0) goto L76
                r10.disconnect()
            L76:
                r0 = r2
                goto L88
            L78:
                r1 = move-exception
                goto L80
            L7a:
                r0 = move-exception
                goto L8f
            L7c:
                r10 = move-exception
                r8 = r1
                r1 = r10
                r10 = r8
            L80:
                r1.printStackTrace()     // Catch: java.lang.Throwable -> L8d
                if (r10 == 0) goto L88
                r10.disconnect()
            L88:
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
                return r10
            L8d:
                r0 = move-exception
                r1 = r10
            L8f:
                if (r1 == 0) goto L94
                r1.disconnect()
            L94:
                goto L96
            L95:
                throw r0
            L96:
                goto L95
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0755x1.c.doInBackground(java.lang.String[]):java.lang.Boolean");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            C0755x1.m6169b(this.f5272b, this.f5271a);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.x1$d */
    /* loaded from: classes.dex */
    static class d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ C3400wj f5273b;

        d(C3400wj c3400wj) {
            this.f5273b = c3400wj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f5273b.m16262a((String) null, false, false);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.x1$e */
    /* loaded from: classes.dex */
    static class e implements DialogInterface.OnCancelListener {

        /* renamed from: b */
        final /* synthetic */ Context f5274b;

        e(Context context) {
            this.f5274b = context;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            ((Activity) this.f5274b).finish();
        }
    }

    /* renamed from: com.comviva.webaxn.utils.x1$f */
    /* loaded from: classes.dex */
    static class f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Context f5275b;

        f(Context context) {
            this.f5275b = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ((Activity) this.f5275b).finish();
        }
    }

    /* renamed from: com.comviva.webaxn.utils.x1$g */
    /* loaded from: classes.dex */
    static class g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ WebAxnActivity f5276b;

        /* renamed from: c */
        final /* synthetic */ String f5277c;

        g(WebAxnActivity webAxnActivity, String str) {
            this.f5276b = webAxnActivity;
            this.f5277c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C0731p1.m5953a(this.f5276b, this.f5277c, -1);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.x1$h */
    /* loaded from: classes.dex */
    static class h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ WebAxnActivity f5278b;

        /* renamed from: c */
        final /* synthetic */ String f5279c;

        h(WebAxnActivity webAxnActivity, String str) {
            this.f5278b = webAxnActivity;
            this.f5279c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C0731p1.m5953a(this.f5278b, this.f5279c, -1);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.x1$i */
    /* loaded from: classes.dex */
    static class i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ WebAxnActivity f5280b;

        i(WebAxnActivity webAxnActivity) {
            this.f5280b = webAxnActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.f5280b.getPackageName(), null));
            this.f5280b.startActivity(intent);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.x1$j */
    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a */
        public static String f5281a = null;

        /* renamed from: b */
        public static boolean f5282b = false;

        /* renamed from: c */
        public static Activity f5283c;
    }

    /* renamed from: com.comviva.webaxn.utils.x1$k */
    /* loaded from: classes.dex */
    public interface k {
        /* renamed from: a */
        void mo6196a(C0719l1 c0719l1);

        /* renamed from: a */
        void mo6197a(C2899lj c2899lj);

        /* renamed from: b */
        void mo6198b(C0719l1 c0719l1);
    }

    /* renamed from: com.comviva.webaxn.utils.x1$l */
    /* loaded from: classes.dex */
    public interface l {
        /* renamed from: a */
        void mo5452a(boolean z);
    }

    /* renamed from: com.comviva.webaxn.utils.x1$m */
    /* loaded from: classes.dex */
    public interface m {
        /* renamed from: a */
        void mo5914a();

        /* renamed from: a */
        void mo5915a(String str);
    }

    /* renamed from: com.comviva.webaxn.utils.x1$n */
    /* loaded from: classes.dex */
    public interface n {
        /* renamed from: a */
        void mo4083a(o oVar);
    }

    /* renamed from: com.comviva.webaxn.utils.x1$o */
    /* loaded from: classes.dex */
    public interface o {
        /* renamed from: a */
        void mo4309a(boolean z);
    }

    /* renamed from: com.comviva.webaxn.utils.x1$p */
    /* loaded from: classes.dex */
    public interface p {
        /* renamed from: a */
        void mo4834a(long j, String str);

        /* renamed from: a */
        void mo4835a(AbstractC0652n1 abstractC0652n1);

        /* renamed from: a */
        void mo4836a(AbstractC0652n1 abstractC0652n1, String str, C3489yj c3489yj);

        /* renamed from: a */
        void mo4837a(C0661r0 c0661r0, String str);

        /* renamed from: a */
        void mo4838a(C0696e c0696e, C2945mj c2945mj, C3531zj c3531zj, boolean z);

        /* renamed from: a */
        void mo4839a(String str, int i, C3489yj c3489yj);

        /* renamed from: a */
        void mo4840a(String str, String str2, C3489yj c3489yj);

        /* renamed from: a */
        void mo4841a(String str, String str2, C3489yj c3489yj, boolean z, boolean z2, boolean[] zArr);

        /* renamed from: a */
        void mo4842a(String str, C3489yj c3489yj);

        /* renamed from: a */
        void mo4843a(C3489yj c3489yj);

        /* renamed from: a */
        void mo4844a(C3489yj c3489yj, C2555hj c2555hj);

        /* renamed from: a */
        void mo4845a(C3489yj c3489yj, String str, r rVar);

        /* renamed from: a */
        void mo4846a(C3531zj c3531zj, C2555hj c2555hj, C2945mj c2945mj);

        /* renamed from: a */
        void mo4847a(boolean z, C3489yj c3489yj);

        /* renamed from: a */
        boolean mo4848a(C3489yj c3489yj, String str, String str2);

        /* renamed from: b */
        void mo4849b(AbstractC0652n1 abstractC0652n1);

        /* renamed from: b */
        void mo4850b(C3489yj c3489yj);
    }

    /* renamed from: com.comviva.webaxn.utils.x1$q */
    /* loaded from: classes.dex */
    public interface q {
        /* renamed from: a */
        void mo4853a(C3489yj c3489yj, boolean z);
    }

    /* renamed from: com.comviva.webaxn.utils.x1$r */
    /* loaded from: classes.dex */
    public interface r {
        /* renamed from: a */
        void mo4128a(String str);
    }

    static {
        new File(f5250h, "WebAxnLog.txt");
        f5251i = false;
        f5252j = false;
        f5253k = false;
        f5254l = true;
        f5255m = null;
        f5256n = null;
        f5257o = false;
        f5258p = null;
        f5259q = null;
        f5260r = null;
        f5261s = null;
        f5263u = false;
        f5264v = false;
        f5266x = false;
        f5267y = false;
        f5268z = false;
        f5237A = 0;
        f5238B = null;
        f5239C = false;
        f5241E = false;
    }

    /* renamed from: a */
    public static double m6111a(double d2) {
        double round = Math.round(d2 * f5243a);
        double d3 = f5243a;
        Double.isNaN(round);
        return round / d3;
    }

    /* renamed from: a */
    public static float m6112a(float f2) {
        return f2 * 0.05f;
    }

    /* renamed from: a */
    public static int m6113a(int i2) {
        StringBuilder sb;
        if (i2 == 0) {
            return i2;
        }
        try {
            String hexString = Integer.toHexString(i2);
            if (TextUtils.isEmpty(hexString) || hexString.length() > 6) {
                return i2;
            }
            switch (hexString.length()) {
                case 1:
                    sb = new StringBuilder();
                    sb.append("#ff00000");
                    sb.append(hexString);
                    hexString = sb.toString();
                    break;
                case 2:
                    sb = new StringBuilder();
                    sb.append("#ff0000");
                    sb.append(hexString);
                    hexString = sb.toString();
                    break;
                case 3:
                    sb = new StringBuilder();
                    sb.append("#ff000");
                    sb.append(hexString);
                    hexString = sb.toString();
                    break;
                case 4:
                    sb = new StringBuilder();
                    sb.append("#ff00");
                    sb.append(hexString);
                    hexString = sb.toString();
                    break;
                case 5:
                    sb = new StringBuilder();
                    sb.append("#ff0");
                    sb.append(hexString);
                    hexString = sb.toString();
                    break;
                case 6:
                    sb = new StringBuilder();
                    sb.append("#ff");
                    sb.append(hexString);
                    hexString = sb.toString();
                    break;
            }
            return Color.parseColor(hexString);
        } catch (Exception unused) {
            return i2;
        }
    }

    /* renamed from: a */
    public static int m6114a(Context context, float f2) {
        try {
            float m6161b = m6161b(context) / 1.2f;
            if (m6161b > 1.0f && f2 > 0.0f) {
                f2 = Math.round(m6161b * f2 * 1.0f);
            }
        } catch (Exception unused) {
        }
        return (int) f2;
    }

    /* renamed from: a */
    public static int m6115a(String str, int i2, float f2) {
        double parseDouble;
        double d2;
        int i3 = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            if (str.contains("%")) {
                double parseDouble2 = Double.parseDouble(str.substring(0, str.indexOf("%")).trim());
                if (parseDouble2 == -3.0d) {
                    return -3;
                }
                double d3 = i2;
                Double.isNaN(d3);
                d2 = (parseDouble2 * d3) / 100.0d;
            } else {
                if (!str.contains("px") && !str.contains("PX")) {
                    parseDouble = Double.parseDouble(str.trim());
                    if (parseDouble == -3.0d) {
                        return -3;
                    }
                    double d4 = f2;
                    Double.isNaN(d4);
                    d2 = parseDouble * d4;
                }
                int indexOf = str.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = str.indexOf("PX");
                }
                parseDouble = Double.parseDouble(str.substring(0, indexOf).trim());
                if (parseDouble == -3.0d) {
                    return -3;
                }
                double d42 = f2;
                Double.isNaN(d42);
                d2 = parseDouble * d42;
            }
            i3 = (int) d2;
        } catch (NumberFormatException unused) {
        }
        return i3 > i2 ? i2 : i3;
    }

    /* renamed from: a */
    public static int m6116a(String str, String str2, boolean z) {
        int i2;
        int i3 = 5;
        if (!TextUtils.isEmpty(str)) {
            if (str.equalsIgnoreCase("C") || str.equalsIgnoreCase("Center")) {
                i3 = 1;
            } else if (!str.equalsIgnoreCase("L")) {
            }
            i2 = 16;
            if (!TextUtils.isEmpty(str2) && !str2.equalsIgnoreCase("M") && !str2.equalsIgnoreCase("Middle")) {
                if (!str2.equalsIgnoreCase("B") || str2.equalsIgnoreCase("Base")) {
                    i2 = 80;
                } else if (str2.equalsIgnoreCase("T") || str2.equalsIgnoreCase("Top")) {
                    i2 = 48;
                }
            }
            return i3 | i2;
        }
        i3 = 3;
        i2 = 16;
        if (!TextUtils.isEmpty(str2)) {
            if (str2.equalsIgnoreCase("B")) {
            }
            i2 = 80;
        }
        return i3 | i2;
    }

    /* renamed from: a */
    public static ColorStateList m6117a(int i2, int i3, int i4, int i5) {
        int[][] iArr = new int[2];
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[1];
        iArr3[0] = i2;
        iArr[0] = iArr3;
        iArr2[0] = i3;
        if (i4 == -1) {
            iArr[1] = new int[0];
        } else {
            int[] iArr4 = new int[1];
            iArr4[0] = i4;
            iArr[1] = iArr4;
        }
        iArr2[1] = i5;
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: a */
    public static Bitmap m6118a(Context context, String str, byte[] bArr) {
        Bitmap m5429a = C0698e1.m5426b(context).m5429a(str);
        if (m5429a == null && (m5429a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
            C0698e1.m5426b(context).m5432a(str, m5429a);
        }
        return m5429a;
    }

    /* renamed from: a */
    public static Drawable m6119a(Context context, String str) {
        int identifier;
        Drawable m5434b = C0698e1.m5426b(context).m5434b(str);
        if (m5434b == null && (identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName())) > 0) {
            m5434b = Build.VERSION.SDK_INT >= 21 ? context.getResources().getDrawable(identifier, null) : context.getResources().getDrawable(identifier);
            C0698e1.m5426b(context).m5433a(str, m5434b);
        }
        return m5434b;
    }

    /* renamed from: a */
    public static Drawable m6120a(Context context, String str, String str2, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                int parseColor = Color.parseColor(str2);
                return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{parseColor}), drawable, new ColorDrawable(parseColor));
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Drawable m6121a(Context context, C3489yj c3489yj, C3489yj.a aVar) {
        C2475fj c2475fj;
        int i2 = a.f5269a[aVar.ordinal()];
        Drawable drawable = null;
        if (i2 == 1) {
            if (!TextUtils.isEmpty(c3489yj.f14228k1.m12474f())) {
                drawable = m6163b(context, c3489yj.f14228k1.m12474f());
            } else if (c3489yj.f14228k1.m12463a() != null) {
                drawable = m6164b(context, c3489yj.f14228k1.m12475g(), c3489yj.f14228k1.m12463a());
            } else if (c3489yj.f14228k1.m12476h()) {
                drawable = m6123a(c3489yj.f14173O0, c3489yj.f14228k1.m12470d(), c3489yj.f14228k1.m12468c(), c3489yj.f14228k1.m12464b());
            }
            if (drawable == null || (c2475fj = c3489yj.f14231l1) == null) {
                return drawable;
            }
            c2475fj.m11780c(false);
            return drawable;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            if (!TextUtils.isEmpty(c3489yj.f14234m1.m12025f())) {
                return m6163b(context, c3489yj.f14234m1.m12025f());
            }
            if (c3489yj.f14234m1.m12013a() != null) {
                return m6164b(context, c3489yj.f14234m1.m12026g(), c3489yj.f14234m1.m12013a());
            }
            if (c3489yj.f14234m1.m12027h()) {
                return m6123a(c3489yj.f14173O0, c3489yj.f14234m1.m12021d(), c3489yj.f14234m1.m12018c(), c3489yj.f14234m1.m12014b());
            }
            return null;
        }
        if (!TextUtils.isEmpty(c3489yj.f14231l1.m11783e())) {
            drawable = m6163b(context, c3489yj.f14231l1.m11783e());
        } else if (c3489yj.f14231l1.m11773a() != null) {
            drawable = m6164b(context, c3489yj.f14231l1.m11785f(), c3489yj.f14231l1.m11773a());
        } else if (c3489yj.f14231l1.m11786g()) {
            drawable = m6123a(c3489yj.f14173O0, c3489yj.f14231l1.m11781d(), c3489yj.f14231l1.m11778c(), c3489yj.f14231l1.m11774b());
        }
        if (drawable == null) {
            return drawable;
        }
        c3489yj.f14231l1.m11780c(true);
        return drawable;
    }

    /* renamed from: a */
    public static Drawable m6122a(C2434ej c2434ej, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{c2434ej.m11617b(), c2434ej.m11617b(), c2434ej.m11621d(), c2434ej.m11621d(), c2434ej.m11619c(), c2434ej.m11619c(), c2434ej.m11614a(), c2434ej.m11614a()}, null, null));
        shapeDrawable.getPaint().setColor(AbstractC0652n1.m4701d(i2));
        return shapeDrawable;
    }

    /* renamed from: a */
    public static GradientDrawable m6123a(C2434ej c2434ej, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (c2434ej != null) {
            gradientDrawable.setCornerRadii(new float[]{c2434ej.m11617b(), c2434ej.m11617b(), c2434ej.m11621d(), c2434ej.m11621d(), c2434ej.m11619c(), c2434ej.m11619c(), c2434ej.m11614a(), c2434ej.m11614a()});
        }
        gradientDrawable.setStroke(i2, i3);
        gradientDrawable.setColor(i4);
        return gradientDrawable;
    }

    /* renamed from: a */
    public static StateListDrawable m6124a(Context context, Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_focused}, drawable);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable2);
        stateListDrawable.addState(new int[0], drawable);
        return stateListDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Spanned m6125a(int r6, int r7, int r8, int r9, java.lang.String r10) {
        /*
            r0 = 3
            r1 = 2
            r2 = 1
            if (r6 == r2) goto L56
            r3 = 21
            if (r6 == r3) goto L56
            r4 = 31
            if (r6 != r4) goto Le
            goto L56
        Le:
            if (r6 == r1) goto L47
            r5 = 22
            if (r6 != r5) goto L15
            goto L47
        L15:
            if (r6 == r0) goto L38
            r5 = 23
            if (r6 != r5) goto L1c
            goto L38
        L1c:
            r5 = 4
            if (r6 < r5) goto L21
            if (r6 < r3) goto L27
        L21:
            r3 = 24
            if (r6 < r3) goto L36
            if (r6 >= r4) goto L36
        L27:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r3.append(r6)
            java.lang.String r6 = "<sup>th</sup>"
            goto L64
        L36:
            r6 = 0
            goto L6b
        L38:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r3.append(r6)
            java.lang.String r6 = "<sup>rd</sup>"
            goto L64
        L47:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r3.append(r6)
            java.lang.String r6 = "<sup>nd</sup>"
            goto L64
        L56:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r3.append(r6)
            java.lang.String r6 = "<sup>st</sup>"
        L64:
            r3.append(r6)
            java.lang.String r6 = r3.toString()
        L6b:
            java.lang.String r3 = "%02d"
            r4 = 0
            if (r9 != r1) goto L99
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r10)
            java.lang.String r6 = m6126a(r7, r4)
            r9.append(r6)
            r9.append(r10)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r6[r4] = r7
            java.lang.String r6 = java.lang.String.format(r3, r6)
        L91:
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto Lbd
        L99:
            if (r9 != r0) goto Lbd
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r10)
            java.lang.String r6 = m6126a(r7, r2)
            r9.append(r6)
            r9.append(r10)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r6[r4] = r7
            java.lang.String r6 = java.lang.String.format(r3, r6)
            goto L91
        Lbd:
            android.text.Spanned r6 = android.text.Html.fromHtml(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0755x1.m6125a(int, int, int, int, java.lang.String):android.text.Spanned");
    }

    /* renamed from: a */
    public static String m6126a(int i2, int i3) {
        switch (i2) {
            case 1:
                return i3 == 0 ? "Jan" : "January";
            case 2:
                return i3 == 0 ? "Feb" : "Febuary";
            case 3:
                return i3 == 0 ? "Mar" : "March";
            case 4:
                return i3 == 0 ? "Apr" : "April";
            case 5:
                return "May";
            case 6:
                return i3 == 0 ? "Jun" : "June";
            case 7:
                return i3 == 0 ? "Jul" : "July";
            case 8:
                return i3 == 0 ? "Aug" : "August";
            case 9:
                return i3 == 0 ? "Sep" : "September";
            case 10:
                return i3 == 0 ? "Oct" : "October";
            case 11:
                return i3 == 0 ? "Nov" : "November";
            case 12:
                return i3 == 0 ? "Dec" : "December";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static String m6127a(Context context, int i2, String str) {
        StringBuilder sb;
        File dir;
        String sb2;
        if (TextUtils.isEmpty(str)) {
            str = "temp";
        }
        if (i2 == 1) {
            sb = new StringBuilder();
            dir = context.getDir(str, 0);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    sb2 = Environment.getExternalStoragePublicDirectory(str) + "/";
                    f5240D = sb2;
                }
                return f5240D;
            }
            sb = new StringBuilder();
            dir = context.getExternalFilesDir(str);
        }
        sb.append(dir.getPath());
        sb.append("/");
        sb2 = sb.toString();
        f5240D = sb2;
        return f5240D;
    }

    /* renamed from: a */
    public static String m6128a(Context context, C3489yj c3489yj, C0655o1 c0655o1) {
        String str;
        C0644l c0644l = (C0644l) c3489yj.f14197a0;
        String str2 = "0";
        if (c3489yj.f14174P != null && c0644l.m4631m() < c3489yj.f14174P.size()) {
            if (c3489yj.f14203c0) {
                str = Integer.valueOf(c0644l.m4631m()).toString();
            } else {
                C2862kj elementAt = c3489yj.f14174P.elementAt(c0644l.m4631m());
                String str3 = elementAt.f11757b;
                if (str3 != null) {
                    str2 = "1";
                    str = str3;
                } else {
                    str = elementAt.f11756a;
                    if (str != null) {
                        str2 = "2";
                    }
                }
            }
            C0023aj.m160a(context).m196f(c3489yj.f14186V, str2);
            return str;
        }
        str = null;
        C0023aj.m160a(context).m196f(c3489yj.f14186V, str2);
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0124  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m6129a(android.content.Context r16, p000.C3531zj r17, java.lang.String r18, boolean r19, boolean r20, com.comviva.webaxn.p002ui.C0655o1 r21) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0755x1.m6129a(android.content.Context, zj, java.lang.String, boolean, boolean, com.comviva.webaxn.ui.o1):java.lang.String");
    }

    /* renamed from: a */
    public static String m6130a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String str = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                inputStream.close();
                return str;
            }
            str = str + readLine;
        }
    }

    /* renamed from: a */
    public static String m6131a(C3489yj c3489yj, C0655o1 c0655o1) {
        StringBuffer stringBuffer = new StringBuffer();
        Vector<C2862kj> vector = c0655o1.f4136d.f11887g.get(c3489yj.f14186V);
        if (vector != null) {
            int i2 = 0;
            while (i2 < vector.size()) {
                C3489yj c3489yj2 = vector.elementAt(i2).f11759d;
                AbstractC0652n1 abstractC0652n1 = c3489yj2.f14197a0;
                if (abstractC0652n1 != null) {
                    if (abstractC0652n1 instanceof C0632h) {
                        ArrayList<CheckBox> m4428m = ((C0632h) abstractC0652n1).m4428m();
                        for (int i3 = 0; i3 < m4428m.size(); i3++) {
                            CheckBox checkBox = m4428m.get(i3);
                            if ((checkBox.getTag() == null || !((String) checkBox.getTag()).equals("SELECTALL")) && checkBox.isChecked()) {
                                if (stringBuffer.length() != 0) {
                                    stringBuffer.append("&#x3b;");
                                }
                                if (c3489yj2.f14203c0) {
                                    stringBuffer.append(i2 + i3);
                                } else {
                                    C2862kj elementAt = c3489yj2.f14174P.elementAt(i3);
                                    String str = elementAt.f11757b;
                                    if (str != null) {
                                        stringBuffer.append(str);
                                    } else {
                                        String str2 = elementAt.f11756a;
                                        if (str2 != null) {
                                            stringBuffer.append(str2);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (abstractC0652n1 instanceof C0635i) {
                        C0635i c0635i = (C0635i) abstractC0652n1;
                        if (c0635i.m4475q()) {
                            ArrayList<C0186n0> m4473o = c0635i.m4473o();
                            for (int i4 = 0; i4 < m4473o.size(); i4++) {
                                C0186n0 c0186n0 = m4473o.get(i4);
                                if ((c0186n0.getTag() == null || !((String) c0186n0.getTag()).equals("SELECTALL")) && c0186n0.isChecked()) {
                                    if (stringBuffer.length() != 0) {
                                        stringBuffer.append("&#x3b;");
                                    }
                                    if (c3489yj2.f14203c0) {
                                        stringBuffer.append(i2 + i4);
                                    } else {
                                        C2862kj elementAt2 = c3489yj2.f14174P.elementAt(i4);
                                        String str3 = elementAt2.f11757b;
                                        if (str3 != null) {
                                            stringBuffer.append(str3);
                                        } else {
                                            String str4 = elementAt2.f11756a;
                                            if (str4 != null) {
                                                stringBuffer.append(str4);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            ArrayList<CheckBox> m4471m = c0635i.m4471m();
                            for (int i5 = 0; i5 < m4471m.size(); i5++) {
                                CheckBox checkBox2 = m4471m.get(i5);
                                if ((checkBox2.getTag() == null || !((String) checkBox2.getTag()).equals("SELECTALL")) && checkBox2.isChecked()) {
                                    if (stringBuffer.length() != 0) {
                                        stringBuffer.append("&#x3b;");
                                    }
                                    if (c3489yj2.f14203c0) {
                                        stringBuffer.append(i2 + i5);
                                    } else {
                                        C2862kj elementAt3 = c3489yj2.f14174P.elementAt(i5);
                                        String str5 = elementAt3.f11757b;
                                        if (str5 != null) {
                                            stringBuffer.append(str5);
                                        } else {
                                            String str6 = elementAt3.f11756a;
                                            if (str6 != null) {
                                                stringBuffer.append(str6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = i2 + (c3489yj2.f14174P.size() - 1) + 1;
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0078, code lost:
    
        if (r4.f14182T != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007a, code lost:
    
        r4.f14197a0.mo4290l();
        com.comviva.webaxn.utils.C0755x1.f5254l = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0099, code lost:
    
        if (r4.f14182T != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00bd, code lost:
    
        if (r4.f14182T != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ce, code lost:
    
        if (r4.f14182T != false) goto L45;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m6132a(p000.C3531zj r6, java.lang.String r7, com.comviva.webaxn.p002ui.C0655o1 r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0755x1.m6132a(zj, java.lang.String, com.comviva.webaxn.ui.o1, boolean):java.lang.String");
    }

    /* renamed from: a */
    public static HashMap<String, String> m6133a(String str, String str2, String str3, String str4) {
        HashMap<String, String> hashMap = new HashMap<>();
        String[] split = str.split(str2);
        String str5 = null;
        String str6 = null;
        for (int i2 = 0; i2 < split.length; i2++) {
            String str7 = split[i2];
            if (!TextUtils.isEmpty(str7)) {
                if (str7.indexOf(str3) != -1) {
                    str5 = str7.substring(0, str7.indexOf(str3)).trim();
                    str6 = str7.substring(str7.indexOf(str3) + 1, str7.length());
                } else if (i2 == 0 && str4 != null) {
                    str5 = str4;
                    str6 = str7;
                }
                if (!TextUtils.isEmpty(str5) && str6 != null) {
                    hashMap.put(str5, str6);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static C3440xj m6134a(String str, Vector<C3440xj> vector) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            if (vector != null) {
                for (int i2 = 0; i2 < vector.size(); i2++) {
                    C3440xj c3440xj = vector.get(i2);
                    if (!TextUtils.isEmpty(c3440xj.f14055a) && str.equals(c3440xj.f14055a)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                C3440xj c3440xj2 = new C3440xj();
                c3440xj2.f14055a = str;
                while (str.indexOf("$") > -1) {
                    C0716k1 c0716k1 = new C0716k1();
                    str = str.substring(str.indexOf("$") + 1);
                    if (str.indexOf(",") > -1) {
                        c0716k1.f4902a = str.substring(0, str.indexOf(","));
                        str = str.substring(str.indexOf(",") + 1, str.length());
                    } else if (str.indexOf(")") > -1) {
                        c0716k1.f4902a = str.substring(0, str.indexOf(")"));
                    }
                    c3440xj2.m16499a(c0716k1);
                }
                return c3440xj2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C3489yj m6135a(C3489yj c3489yj) {
        do {
            c3489yj = c3489yj.f14145A0;
            if (c3489yj == null) {
                break;
            }
        } while (c3489yj.f14208e != 8);
        return c3489yj;
    }

    /* renamed from: a */
    public static C3489yj m6136a(C3489yj c3489yj, String str) {
        C3489yj c3489yj2 = null;
        if (c3489yj != null && str != null) {
            String str2 = c3489yj.f14186V;
            if (str2 != null && str.equals(str2)) {
                c3489yj2 = c3489yj;
            }
            if (c3489yj2 == null && c3489yj.f14268z0 != null) {
                for (int i2 = 0; i2 < c3489yj.f14268z0.size() && (c3489yj2 = m6136a(c3489yj.f14268z0.elementAt(i2), str)) == null; i2++) {
                }
            }
        }
        return c3489yj2;
    }

    /* renamed from: a */
    public static void m6137a() {
        AlertDialog alertDialog = f5249g;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        f5249g.dismiss();
    }

    /* renamed from: a */
    public static void m6138a(Activity activity) {
        Intent intent = new Intent();
        intent.setClass(activity, ExitActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }

    /* renamed from: a */
    public static void m6139a(Context context) {
        C0713j1.m5563a(context).m5710p();
        C0713j1.m5563a(context).m5691l();
        C0713j1.m5563a(context).m5696m();
        C0713j1.m5563a(context).m5701n();
        C0713j1.m5563a(context).m5706o();
    }

    /* renamed from: a */
    public static void m6140a(Context context, int i2, boolean z) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (z) {
                notificationManager.cancelAll();
                f5237A = 0;
            } else {
                notificationManager.cancel(i2);
                f5237A--;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m6141a(Context context, C0655o1 c0655o1, String str, String str2, C3400wj c3400wj, boolean z) {
        HashMap<String, String> hashMap;
        C3531zj c3531zj = c0655o1.f4134b;
        if (c3531zj != null) {
            if (str.equals("schema")) {
                c3400wj.m16298a(str2, false, null, null, c0655o1.m4812f(), c0655o1.f4136d);
                return;
            }
            C3489yj m16930a = c3531zj.m16930a(str, (Vector<C3489yj>) null);
            if (m16930a == null) {
                if (z || (hashMap = c3531zj.f14519r) == null || !hashMap.containsKey(str)) {
                    return;
                }
                c3531zj.m16931a(str, str2);
                return;
            }
            AbstractC0652n1 abstractC0652n1 = m16930a.f14197a0;
            if (abstractC0652n1 instanceof C0668v) {
                C0668v c0668v = (C0668v) abstractC0652n1;
                if (!TextUtils.isEmpty(str2) && str2.equals("-1")) {
                    str2 = "";
                }
                c0668v.m5029f(str2);
                c0668v.m5030g(str2.length());
                return;
            }
            if (abstractC0652n1 instanceof C0670w) {
                C0670w c0670w = (C0670w) abstractC0652n1;
                if (!TextUtils.isEmpty(str2) && str2.equals("-1")) {
                    str2 = "";
                }
                c0670w.m5093h(str2);
                c0670w.m5090g(str2.length());
                return;
            }
            if (abstractC0652n1 instanceof C0633h0) {
                C0633h0 c0633h0 = (C0633h0) abstractC0652n1;
                if (!TextUtils.isEmpty(str2) && str2.equals("-1")) {
                    str2 = " ";
                }
                c0633h0.m4438d(str2);
                return;
            }
            if (abstractC0652n1 instanceof C0636i0) {
                C0636i0 c0636i0 = (C0636i0) abstractC0652n1;
                if (!TextUtils.isEmpty(str2) && str2.equals("-1")) {
                    str2 = " ";
                }
                c0636i0.m4487b(str2);
                return;
            }
            if (!(abstractC0652n1 instanceof C0630g0)) {
                if (m16930a.f14208e == 4) {
                    m6182d(c0655o1.f4136d, context, str, str2);
                }
            } else {
                C0630g0 c0630g0 = (C0630g0) abstractC0652n1;
                if (!TextUtils.isEmpty(str2) && str2.equals("-1")) {
                    str2 = " ";
                }
                c0630g0.m4368b(str2);
            }
        }
    }

    /* renamed from: a */
    public static void m6142a(Context context, PushData pushData) {
        c cVar = new c();
        cVar.f5271a = pushData;
        cVar.f5272b = context;
        try {
            String decode = Uri.decode(pushData.m5232e());
            if (!TextUtils.isEmpty(decode)) {
                if (Build.VERSION.SDK_INT >= 11) {
                    cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, decode);
                } else {
                    cVar.execute(decode);
                }
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m6143a(Context context, PushData pushData, Intent intent) {
        try {
            intent.addFlags(805306368);
            intent.setClassName(context.getPackageName(), "com.comviva.webaxn.ui.NotiDlgActivity");
            intent.putExtra("Title", Uri.decode(pushData.m5246l()));
            intent.putExtra("Description", Uri.decode(pushData.m5228c()));
            intent.putExtra("Ok", Uri.decode(pushData.m5234f()));
            intent.putExtra("Cancel", Uri.decode(pushData.m5242j()));
            intent.putExtra("Action", pushData.m5236g());
            intent.putExtra("CancelAction", pushData.m5244k());
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m6144a(Context context, String str, PushData pushData) {
        try {
            String m5571A = C0713j1.m5563a(context).m5571A();
            Integer.parseInt(m5571A);
            if (!TextUtils.isEmpty(str)) {
                int indexOf = str.indexOf("|");
                if (indexOf != -1) {
                    int i2 = 0;
                    pushData.m5237g(str.substring(0, indexOf).trim());
                    if (!TextUtils.isEmpty(pushData.m5240i()) && pushData.m5240i().equals(m5571A)) {
                        String substring = str.substring(indexOf + 1);
                        TextUtils.SimpleStringSplitter<String> simpleStringSplitter = new TextUtils.SimpleStringSplitter('|');
                        simpleStringSplitter.setString(substring);
                        for (String str2 : simpleStringSplitter) {
                            if (i2 == 0) {
                                pushData.m5245k(str2);
                            } else if (1 == i2) {
                                pushData.m5243j(str2);
                            } else if (2 == i2) {
                                pushData.m5229c(str2);
                            } else if (3 == i2) {
                                pushData.m5233e(str2);
                            } else if (4 == i2) {
                                pushData.m5239h(str2);
                            } else if (5 == i2) {
                                pushData.m5235f(str2);
                            } else if (6 == i2) {
                                pushData.m5241i(str2);
                            } else if (7 == i2) {
                                pushData.m5225a(str2);
                            } else if (8 == i2) {
                                pushData.m5227b(str2);
                            } else if (9 == i2) {
                                pushData.m5231d(str2);
                            }
                            i2++;
                        }
                    }
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(pushData.m5240i())) {
                return;
            }
            if (!pushData.m5240i().equals(m5571A)) {
                return;
            }
            if (!TextUtils.isEmpty(pushData.m5226b())) {
                C0023aj.m160a(context).m202h("badgecnt", pushData.m5226b());
            }
            if ((pushData.m5247m().equals("not") || pushData.m5247m().equals("actnot")) && !TextUtils.isEmpty(pushData.m5232e())) {
                m6142a(context, pushData);
            } else {
                m6169b(context, pushData);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m6145a(Context context, String str, String str2, int i2) {
        Intent intent;
        Uri parse;
        try {
            if (Build.VERSION.SDK_INT < 24) {
                intent = new Intent("android.intent.action.VIEW");
                if (TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        parse = Uri.parse(str2);
                    }
                    ((Activity) context).startActivityForResult(intent, i2);
                }
                parse = Uri.fromFile(new File(str));
                intent.setDataAndType(parse, "application/vnd.android.package-archive");
                ((Activity) context).startActivityForResult(intent, i2);
            }
            intent = new Intent("android.intent.action.INSTALL_PACKAGE");
            if (!TextUtils.isEmpty(str)) {
                parse = FileProvider.m1448a(context, context.getString(com.mtni.myirancell.R.string.authority), new File(str));
                intent.setDataAndType(parse, "application/vnd.android.package-archive");
                ((Activity) context).startActivityForResult(intent, i2);
            } else {
                if (!TextUtils.isEmpty(str2)) {
                    intent.setDataAndType(FileProvider.m1448a(context, context.getString(com.mtni.myirancell.R.string.authority), new File(Uri.parse(str2).getPath())), "application/vnd.android.package-archive");
                    intent.setFlags(1);
                }
                ((Activity) context).startActivityForResult(intent, i2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m6146a(Context context, String str, String str2, String str3, boolean z, C2945mj c2945mj, C2899lj c2899lj, boolean z2) {
        if (z) {
            C0731p1.m5966b(context, str, str2);
        }
    }

    /* renamed from: a */
    public static void m6147a(Context context, String str, String str2, boolean z) {
        WebAxnActivity webAxnActivity = (WebAxnActivity) context;
        AlertDialog alertDialog = f5249g;
        if (alertDialog != null && alertDialog.isShowing()) {
            f5249g.dismiss();
        }
        if (webAxnActivity.isFinishing()) {
            return;
        }
        String m5641c = C0713j1.m5563a(context).m5641c(z ? "msg.titleConf" : "msg.titleInf");
        if (m5641c == null) {
            m5641c = context.getString(com.mtni.myirancell.R.string.dialog_title);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
        builder.setTitle(m5641c);
        builder.setMessage(str);
        if (z) {
            builder.setCancelable(false);
        } else {
            builder.setCancelable(true);
            builder.setOnCancelListener(new e(context));
        }
        builder.setPositiveButton(str2, new f(context));
        AlertDialog create = builder.create();
        f5249g = create;
        create.setCanceledOnTouchOutside(false);
        f5249g.show();
    }

    /* renamed from: a */
    public static void m6148a(Context context, String str, String str2, boolean z, boolean z2) {
        try {
            if (f5249g != null && f5249g.isShowing()) {
                f5249g.dismiss();
            }
            WebAxnActivity webAxnActivity = (WebAxnActivity) context;
            if (webAxnActivity.isFinishing()) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
            if (TextUtils.isEmpty(str)) {
                str = context.getString(com.mtni.myirancell.R.string.dialog_title_information);
            }
            builder.setTitle(str);
            builder.setMessage(str2);
            if (z) {
                if (z2) {
                    builder.setIcon(R.drawable.ic_dialog_info);
                }
                String m5641c = C0713j1.m5563a(webAxnActivity).m5641c("cmd.Exit");
                if (m5641c == null) {
                    m5641c = context.getString(com.mtni.myirancell.R.string.dialog_button_exit);
                }
                String m5641c2 = C0713j1.m5563a(webAxnActivity).m5641c("cmd.Cancel");
                if (m5641c2 == null) {
                    m5641c2 = context.getString(com.mtni.myirancell.R.string.dialog_button_cancel);
                }
                builder.setPositiveButton(m5641c, new b(webAxnActivity));
                builder.setNegativeButton(m5641c2, (DialogInterface.OnClickListener) null);
                builder.setCancelable(false);
            } else {
                if (z2) {
                    builder.setIcon(R.drawable.ic_dialog_info);
                }
                String m5641c3 = C0713j1.m5563a(webAxnActivity).m5641c("cmd.Ok");
                if (m5641c3 == null) {
                    m5641c3 = context.getString(com.mtni.myirancell.R.string.dialog_button_ok);
                }
                builder.setPositiveButton(m5641c3, (DialogInterface.OnClickListener) null);
            }
            AlertDialog create = builder.create();
            f5249g = create;
            create.setCanceledOnTouchOutside(false);
            f5249g.show();
        } catch (ClassCastException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m6149a(Context context, String str, String str2, boolean z, boolean z2, String str3) {
        try {
            WebAxnActivity webAxnActivity = (WebAxnActivity) context;
            if (webAxnActivity.m4078b().m16297a(str2, false)) {
                return;
            }
            String m5641c = C0713j1.m5563a(webAxnActivity).m5641c(str2);
            if (f5249g != null && f5249g.isShowing()) {
                f5249g.dismiss();
            }
            if (webAxnActivity.isFinishing()) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
            if (TextUtils.isEmpty(str)) {
                str = context.getString(com.mtni.myirancell.R.string.dialog_title);
            }
            builder.setTitle(str);
            if (TextUtils.isEmpty(m5641c)) {
                m5641c = context.getString(com.mtni.myirancell.R.string.force_download);
            }
            builder.setMessage(m5641c);
            if (z) {
                if (z2) {
                    builder.setIcon(R.drawable.ic_dialog_info);
                }
                String m5641c2 = C0713j1.m5563a(webAxnActivity).m5641c("cmd.Download");
                if (m5641c2 == null) {
                    m5641c2 = context.getString(com.mtni.myirancell.R.string.dialog_button_download);
                }
                String m5641c3 = C0713j1.m5563a(webAxnActivity).m5641c("cmd.Cancel");
                if (m5641c3 == null) {
                    m5641c3 = context.getString(com.mtni.myirancell.R.string.dialog_button_cancel);
                }
                builder.setPositiveButton(m5641c2, new g(webAxnActivity, str3));
                builder.setNegativeButton(m5641c3, (DialogInterface.OnClickListener) null);
                builder.setCancelable(false);
            } else {
                if (z2) {
                    builder.setIcon(R.drawable.ic_dialog_alert);
                }
                String m5641c4 = C0713j1.m5563a(webAxnActivity).m5641c("cmd.Download");
                if (m5641c4 == null) {
                    m5641c4 = context.getString(com.mtni.myirancell.R.string.dialog_button_download);
                }
                builder.setPositiveButton(m5641c4, new h(webAxnActivity, str3));
            }
            AlertDialog create = builder.create();
            f5249g = create;
            create.setCanceledOnTouchOutside(false);
            f5249g.show();
        } catch (ClassCastException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m6150a(Context context, C3400wj c3400wj) {
        try {
            if (f5249g != null && f5249g.isShowing()) {
                f5249g.dismiss();
            }
            WebAxnActivity webAxnActivity = (WebAxnActivity) context;
            if (webAxnActivity.isFinishing()) {
                return;
            }
            String m5641c = C0713j1.m5563a(context).m5641c("msg.ErrTimeOut");
            if (TextUtils.isEmpty(m5641c)) {
                m5641c = context.getString(com.mtni.myirancell.R.string.session_timeout);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
            builder.setMessage(m5641c);
            String m5641c2 = C0713j1.m5563a(webAxnActivity).m5641c("ttl.Alert");
            if (TextUtils.isEmpty(m5641c2)) {
                m5641c2 = context.getResources().getString(com.mtni.myirancell.R.string.dialog_title);
            }
            builder.setTitle(m5641c2);
            String m5641c3 = C0713j1.m5563a(webAxnActivity).m5641c("cmd.Ok");
            if (m5641c3 == null) {
                m5641c3 = context.getString(com.mtni.myirancell.R.string.dialog_button_ok);
            }
            builder.setPositiveButton(m5641c3, new d(c3400wj));
            AlertDialog create = builder.create();
            f5249g = create;
            create.setCanceledOnTouchOutside(false);
            f5249g.setCancelable(false);
            f5249g.show();
        } catch (ClassCastException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m6151a(Context context, C3489yj c3489yj, IBinder iBinder) {
        if (c3489yj == null || c3489yj.f14208e != 3) {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (iBinder != null) {
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            }
        }
    }

    /* renamed from: a */
    public static void m6152a(Context context, C3489yj c3489yj, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(view, 1);
    }

    /* renamed from: a */
    public static void m6153a(String str) {
        try {
            File file = new File(str);
            if (!file.isDirectory()) {
                file.delete();
                return;
            }
            String[] list = file.list();
            if (list != null) {
                for (String str2 : list) {
                    new File(file, str2).delete();
                }
            }
        } catch (SecurityException unused) {
        }
    }

    /* renamed from: a */
    public static void m6154a(String str, String str2, C3531zj c3531zj) {
        AbstractC0652n1 abstractC0652n1;
        if (TextUtils.isEmpty(str2) || c3531zj == null) {
            return;
        }
        C3489yj m16930a = c3531zj.m16930a(str2, (Vector<C3489yj>) null);
        if (m16930a == null || (abstractC0652n1 = m16930a.f14197a0) == null) {
            HashMap<String, String> hashMap = c3531zj.f14519r;
            if (hashMap == null || !hashMap.containsKey(str2)) {
                return;
            }
            c3531zj.m16931a(str2, str);
            return;
        }
        if (abstractC0652n1 instanceof C0670w) {
            C0670w c0670w = (C0670w) abstractC0652n1;
            c0670w.m5093h(str);
            c0670w.m5090g(str.length());
        } else if (abstractC0652n1 instanceof C0668v) {
            C0668v c0668v = (C0668v) abstractC0652n1;
            c0668v.m5029f(str);
            c0668v.m5030g(str.length());
        } else if (abstractC0652n1 instanceof C0636i0) {
            ((C0636i0) abstractC0652n1).m4487b(str);
        } else if (abstractC0652n1 instanceof C0633h0) {
            ((C0633h0) abstractC0652n1).m4438d(str);
        } else if (abstractC0652n1 instanceof C0630g0) {
            ((C0630g0) abstractC0652n1).m4368b(str);
        }
    }

    /* renamed from: a */
    public static void m6155a(C2899lj c2899lj, Context context, String str, String str2) {
        m6189f(c2899lj, context, str, str2);
        m6172b(c2899lj, context, str, str2);
        m6186e(c2899lj, context, str, str2);
    }

    /* renamed from: a */
    public static void m6156a(boolean z) {
        f5244b = z;
    }

    /* renamed from: a */
    public static boolean m6157a(C0719l1 c0719l1) {
        Vector<C0716k1> vector = c0719l1.f4938F;
        if (vector != null && vector != null) {
            Iterator<C0716k1> it = vector.iterator();
            while (it.hasNext()) {
                if (it.next().f4904c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m6158a(Date date, Date date2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return calendar != null && calendar2 != null && calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    /* renamed from: a */
    public static boolean m6159a(byte[] bArr, String str) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
            bufferedOutputStream.write(bArr);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            return true;
        } catch (FileNotFoundException | IOException | SecurityException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static byte[] m6160a(Bitmap bitmap, byte[] bArr, int i2, float f2) {
        if (bitmap == null) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean compress = bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return (!compress || ((long) byteArray.length) <= C3530zi.f14473p) ? byteArray : m6160a(bitmap, byteArray, (int) (i2 / f2), f2 + 0.01f);
    }

    /* renamed from: b */
    public static float m6161b(Context context) {
        try {
            float m5552d = C0687b.m5342a(context).m5343a().m5552d();
            float m5547b = C0687b.m5342a(context).m5343a().m5547b();
            float m5544a = C0687b.m5342a(context).m5343a().m5544a();
            if (m5552d >= m5547b) {
                m5552d = m5547b;
            }
            return (m5552d / m5544a) / 320.0f;
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    /* renamed from: b */
    public static AnimationDrawable m6162b() {
        GradientDrawable[] gradientDrawableArr = {new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-65536, -65281, -16776961, -16711681, -16711936, -256}), new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-256, -65536, -65281, -16776961, -16711681, -16711936}), new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-16711936, -256, -65536, -65281, -16776961, -16711681}), new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-16711681, -16711936, -256, -65536, -65281, -16776961}), new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-16776961, -16711681, -16711936, -256, -65536, -65281}), new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-65281, -16776961, -16711681, -16711936, -256, -65536})};
        AnimationDrawable animationDrawable = new AnimationDrawable();
        for (int i2 = 0; i2 < 6; i2++) {
            animationDrawable.addFrame(gradientDrawableArr[i2], 100);
        }
        animationDrawable.setOneShot(false);
        return animationDrawable;
    }

    /* renamed from: b */
    public static Drawable m6163b(Context context, String str) {
        if (str.indexOf(".") != -1) {
            str = str.substring(0, str.indexOf("."));
        }
        Bitmap m5429a = C0698e1.m5426b(context).m5429a(str);
        if (m5429a == null) {
            int m6175c = m6175c(context, str);
            int m5554f = C0687b.m5342a(context).m5343a().m5554f();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDensity = m5554f;
            options.inJustDecodeBounds = false;
            if (m6175c > 0 && (m5429a = BitmapFactory.decodeResource(context.getResources(), m6175c, options)) != null) {
                C0698e1.m5426b(context).m5432a(str, m5429a);
            }
        }
        Bitmap bitmap = m5429a;
        if (bitmap != null) {
            return NinePatch.isNinePatchChunk(bitmap.getNinePatchChunk()) ? new NinePatchDrawable(context.getResources(), bitmap, bitmap.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(context.getResources(), bitmap);
        }
        return null;
    }

    /* renamed from: b */
    public static Drawable m6164b(Context context, String str, byte[] bArr) {
        Bitmap m6118a = m6118a(context, str, bArr);
        if (m6118a != null) {
            return NinePatch.isNinePatchChunk(m6118a.getNinePatchChunk()) ? new NinePatchDrawable(context.getResources(), m6118a, m6118a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(context.getResources(), m6118a);
        }
        return null;
    }

    /* renamed from: b */
    public static ImageView.ScaleType m6165b(int i2) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? scaleType : ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_CROP : scaleType : ImageView.ScaleType.FIT_XY;
    }

    /* renamed from: b */
    public static String m6166b(Context context, C3489yj c3489yj, C0655o1 c0655o1) {
        String str;
        C0641k c0641k = (C0641k) c3489yj.f14197a0;
        String str2 = "0";
        if (c3489yj.f14203c0) {
            str = Integer.valueOf(c0641k.m4534m()).toString();
        } else {
            C2862kj elementAt = c3489yj.f14174P.elementAt(c0641k.m4534m());
            String str3 = elementAt.f11757b;
            if (str3 != null) {
                str2 = "1";
                str = str3;
            } else {
                str = elementAt.f11756a;
                if (str != null) {
                    str2 = "2";
                } else {
                    str = null;
                }
            }
        }
        C0023aj.m160a(context).m196f(c3489yj.f14186V, str2);
        return str;
    }

    /* renamed from: b */
    public static String m6167b(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine + "\n");
                    } catch (Throwable th) {
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                    inputStream.close();
                }
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
        inputStream.close();
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r2 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        if (r2 != null) goto L41;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m6168b(p000.C3489yj r8, com.comviva.webaxn.p002ui.C0655o1 r9) {
        /*
            lj r9 = r9.f4136d
            java.util.HashMap<java.lang.String, java.util.Vector<kj>> r9 = r9.f11889i
            java.lang.String r8 = r8.f14186V
            java.lang.Object r8 = r9.get(r8)
            java.util.Vector r8 = (java.util.Vector) r8
            r9 = 0
            if (r8 == 0) goto La5
            r0 = 0
            r1 = 0
            r2 = 0
        L12:
            int r3 = r8.size()
            if (r1 >= r3) goto La5
            java.lang.Object r3 = r8.elementAt(r1)
            kj r3 = (p000.C2862kj) r3
            yj r3 = r3.f11759d
            com.comviva.webaxn.ui.n1 r4 = r3.f14197a0
            r5 = 1
            if (r4 == 0) goto L97
            boolean r6 = r4 instanceof com.comviva.webaxn.p002ui.C0663s0
            if (r6 == 0) goto L58
            com.comviva.webaxn.ui.s0 r4 = (com.comviva.webaxn.p002ui.C0663s0) r4
            r6 = 0
        L2c:
            int r7 = r4.m4961n()
            if (r6 >= r7) goto L97
            android.view.View r7 = r4.m4958g(r6)
            android.widget.RadioButton r7 = (android.widget.RadioButton) r7
            boolean r7 = r7.isChecked()
            if (r7 == 0) goto L55
            boolean r2 = r3.f14203c0
            if (r2 == 0) goto L43
            goto L75
        L43:
            java.util.Vector<kj> r2 = r3.f14174P
            java.lang.Object r2 = r2.elementAt(r6)
            kj r2 = (p000.C2862kj) r2
            java.lang.String r4 = r2.f11757b
            if (r4 == 0) goto L50
            goto L8b
        L50:
            java.lang.String r2 = r2.f11756a
            if (r2 == 0) goto L92
            goto L91
        L55:
            int r6 = r6 + 1
            goto L2c
        L58:
            boolean r6 = r4 instanceof com.comviva.webaxn.p002ui.C0665t0
            if (r6 == 0) goto L97
            com.comviva.webaxn.ui.t0 r4 = (com.comviva.webaxn.p002ui.C0665t0) r4
            r6 = 0
        L5f:
            int r7 = r4.m4981n()
            if (r6 >= r7) goto L97
            android.view.View r7 = r4.m4978g(r6)
            android.widget.RadioButton r7 = (android.widget.RadioButton) r7
            boolean r7 = r7.isChecked()
            if (r7 == 0) goto L94
            boolean r2 = r3.f14203c0
            if (r2 == 0) goto L7f
        L75:
            int r6 = r6 + r1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            java.lang.String r9 = r9.toString()
            goto L92
        L7f:
            java.util.Vector<kj> r2 = r3.f14174P
            java.lang.Object r2 = r2.elementAt(r6)
            kj r2 = (p000.C2862kj) r2
            java.lang.String r4 = r2.f11757b
            if (r4 == 0) goto L8d
        L8b:
            r9 = r4
            goto L92
        L8d:
            java.lang.String r2 = r2.f11756a
            if (r2 == 0) goto L92
        L91:
            r9 = r2
        L92:
            r2 = 1
            goto L97
        L94:
            int r6 = r6 + 1
            goto L5f
        L97:
            java.util.Vector<kj> r3 = r3.f14174P
            int r3 = r3.size()
            int r3 = r3 - r5
            int r1 = r1 + r3
            if (r2 == 0) goto La2
            goto La5
        La2:
            int r1 = r1 + r5
            goto L12
        La5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0755x1.m6168b(yj, com.comviva.webaxn.ui.o1):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (com.comviva.webaxn.utils.C0755x1.f5267y != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (com.comviva.webaxn.utils.C0755x1.f5266x == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (com.comviva.webaxn.utils.C0755x1.j.f5282b != false) goto L24;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6169b(android.content.Context r3, com.comviva.webaxn.utils.PushData r4) {
        /*
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.notify.action"
            r0.setAction(r1)
            java.lang.String r1 = r4.m5247m()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L71
            java.lang.String r1 = r4.m5247m()
            java.lang.String r2 = "not"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L48
            android.app.Activity r1 = com.comviva.webaxn.utils.C0755x1.f5265w
            if (r1 == 0) goto L54
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L33
            android.app.Activity r1 = com.comviva.webaxn.utils.C0755x1.f5265w
            boolean r1 = r1.isDestroyed()
            if (r1 == 0) goto L3b
            goto L54
        L33:
            android.app.Activity r1 = com.comviva.webaxn.utils.C0755x1.f5265w
            boolean r1 = r1.isFinishing()
            if (r1 != 0) goto L54
        L3b:
            boolean r1 = com.comviva.webaxn.utils.C0755x1.f5267y
            if (r1 == 0) goto L43
            boolean r1 = com.comviva.webaxn.utils.C0755x1.f5266x
            if (r1 == 0) goto L54
        L43:
            boolean r1 = com.comviva.webaxn.utils.C0755x1.j.f5282b
            if (r1 == 0) goto L6e
            goto L54
        L48:
            java.lang.String r1 = r4.m5247m()
            java.lang.String r2 = "actnot"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L58
        L54:
            m6170b(r3, r4, r0)
            goto L71
        L58:
            java.lang.String r1 = r4.m5247m()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L71
            java.lang.String r1 = r4.m5247m()
            java.lang.String r2 = "dlg"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L71
        L6e:
            m6143a(r3, r4, r0)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0755x1.m6169b(android.content.Context, com.comviva.webaxn.utils.PushData):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static void m6170b(Context context, PushData pushData, Intent intent) {
        String packageName;
        String str;
        C0228f.c cVar;
        try {
            int i2 = f5237A;
            f5237A = i2 + 1;
            pushData.m5223a(i2);
            intent.addFlags(805306368);
            String str2 = null;
            if (!TextUtils.isEmpty(pushData.m5222a())) {
                str2 = pushData.m5222a();
            } else if (!TextUtils.isEmpty(pushData.m5236g())) {
                str2 = pushData.m5236g();
            } else if (!TextUtils.isEmpty(pushData.m5244k())) {
                str2 = pushData.m5244k();
            }
            intent.putExtra("push_action", str2);
            intent.putExtra("id", pushData.m5238h());
            if (!j.f5282b || TextUtils.isEmpty(j.f5281a)) {
                packageName = context.getPackageName();
                str = "com.comviva.webaxn.ui.WebAxnActivity";
            } else {
                packageName = context.getPackageName();
                str = j.f5281a;
            }
            intent.setClassName(packageName, str);
            String packageName2 = context.getPackageName();
            PendingIntent activity = PendingIntent.getActivity(context, pushData.m5238h(), intent, 134217728);
            Intent intent2 = new Intent(context, (Class<?>) NotificationReceiver.class);
            intent2.setAction("com.notification.DELETE");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, pushData.m5238h(), intent2, 0);
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), com.mtni.myirancell.R.drawable.webaxn);
            C0228f.d dVar = new C0228f.d(context);
            dVar.m1418e(com.mtni.myirancell.R.drawable.ic_message);
            dVar.m1402a(decodeResource);
            dVar.m1415c(pushData.m5228c());
            dVar.m1400a(System.currentTimeMillis());
            dVar.m1412b(m6184e(Uri.decode(pushData.m5246l())));
            dVar.m1405a(m6184e(Uri.decode(pushData.m5228c())));
            if (pushData.m5230d() != null) {
                C0228f.b bVar = new C0228f.b();
                bVar.m1390b(pushData.m5230d());
                cVar = bVar;
            } else {
                C0228f.c cVar2 = new C0228f.c();
                cVar2.m1391a(pushData.m5228c());
                cVar = cVar2;
            }
            dVar.m1404a(cVar);
            dVar.m1401a(activity);
            dVar.m1411b(broadcast);
            if (Build.VERSION.SDK_INT >= 26) {
                dVar.m1406a(packageName2);
            }
            if (pushData.m5247m().equals("actnot")) {
                dVar.m1410b(-1);
                dVar.m1417d(1);
                if (!TextUtils.isEmpty(pushData.m5234f())) {
                    intent.setAction("com.notify.lskaction");
                    if (!TextUtils.isEmpty(pushData.m5236g())) {
                        intent.putExtra("push_lskaction", pushData.m5236g());
                    }
                    dVar.m1399a(0, m6184e(Uri.decode(pushData.m5234f())), PendingIntent.getActivity(context, pushData.m5238h(), intent, 134217728));
                }
                if (!TextUtils.isEmpty(pushData.m5242j())) {
                    intent.setAction("com.notify.rskaction");
                    if (!TextUtils.isEmpty(pushData.m5244k())) {
                        intent.putExtra("push_rskaction", pushData.m5244k());
                    }
                    dVar.m1399a(0, m6184e(Uri.decode(pushData.m5242j())), PendingIntent.getActivity(context, pushData.m5238h(), intent, 134217728));
                }
            }
            Notification m1395a = dVar.m1395a();
            int i3 = m1395a.defaults | 1;
            m1395a.defaults = i3;
            m1395a.flags |= 1;
            m1395a.defaults = i3 | 4;
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel(packageName2, context.getString(com.mtni.myirancell.R.string.channel_name), 3));
            }
            notificationManager.notify(pushData.m5238h(), m1395a);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m6171b(String str) {
        File file = new File(str);
        if (file.isDirectory()) {
            return;
        }
        file.mkdirs();
    }

    /* renamed from: b */
    public static void m6172b(C2899lj c2899lj, Context context, String str, String str2) {
        HashMap<String, Vector<C2862kj>> hashMap;
        int parseInt;
        if (c2899lj == null || (hashMap = c2899lj.f11887g) == null || !hashMap.containsKey(str)) {
            return;
        }
        Vector<C2862kj> vector = c2899lj.f11887g.get(str);
        if (TextUtils.isEmpty(str2) || !TextUtils.isDigitsOnly(str2) || (parseInt = Integer.parseInt(str2)) >= vector.size()) {
            return;
        }
        C2862kj elementAt = vector.elementAt(parseInt);
        AbstractC0652n1 abstractC0652n1 = elementAt.f11759d.f14197a0;
        if (abstractC0652n1 == null || !(abstractC0652n1 instanceof C0635i)) {
            return;
        }
        ((C0635i) abstractC0652n1).m4465a(elementAt);
    }

    /* renamed from: b */
    public static boolean m6173b(double d2) {
        return d2 % 1.0d == 0.0d;
    }

    /* renamed from: b */
    public static boolean m6174b(C3489yj c3489yj) {
        int i2;
        do {
            c3489yj = c3489yj.f14145A0;
            if (c3489yj == null) {
                return false;
            }
            i2 = c3489yj.f14221i0;
            if (i2 == 2) {
                break;
            }
        } while (i2 != 3);
        return true;
    }

    /* renamed from: c */
    public static int m6175c(Context context, String str) {
        if (str.indexOf(".") != -1) {
            str = str.substring(0, str.indexOf("."));
        }
        return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
    }

    /* renamed from: c */
    public static void m6176c(C2899lj c2899lj, Context context, String str, String str2) {
        HashMap<String, Vector<C2862kj>> hashMap;
        boolean z;
        boolean z2;
        int parseInt;
        boolean z3;
        int parseInt2;
        if (c2899lj == null || (hashMap = c2899lj.f11887g) == null || !hashMap.containsKey(str)) {
            return;
        }
        Vector<C2862kj> vector = c2899lj.f11887g.get(str);
        String[] split = !TextUtils.isEmpty(str2) ? str2.split(";") : null;
        int i2 = 0;
        while (i2 < vector.size()) {
            C3489yj c3489yj = vector.elementAt(i2).f11759d;
            AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
            if (abstractC0652n1 != null) {
                if (abstractC0652n1 instanceof C0632h) {
                    C0632h c0632h = (C0632h) abstractC0652n1;
                    c0632h.m4433r();
                    ArrayList<CheckBox> m4428m = c0632h.m4428m();
                    if (str2 == null) {
                        int[] iArr = c3489yj.f14184U;
                        if (iArr != null) {
                            for (int i3 : iArr) {
                                if (i3 < m4428m.size()) {
                                    m4428m.get(i3).setChecked(true);
                                }
                            }
                        }
                    } else if (split != null) {
                        for (int i4 = 0; i4 < split.length; i4++) {
                            if (split[i4] != null) {
                                if (!TextUtils.isDigitsOnly(split[i4]) || (parseInt2 = Integer.parseInt(split[i4])) >= vector.size() || !vector.elementAt(parseInt2).f11759d.equals(c3489yj) || parseInt2 < i2) {
                                    z3 = false;
                                } else {
                                    split[i4] = String.valueOf(parseInt2 - i2);
                                    z3 = true;
                                }
                                if (true == z3 ? c0632h.m4425a(split[i4], "0") : false) {
                                    split[i4] = null;
                                }
                            }
                        }
                    }
                } else if (abstractC0652n1 instanceof C0635i) {
                    C0635i c0635i = (C0635i) abstractC0652n1;
                    c0635i.m4477s();
                    if (str2 != null) {
                        if (split != null) {
                            for (int i5 = 0; i5 < split.length; i5++) {
                                if (split[i5] != null) {
                                    if (!TextUtils.isDigitsOnly(split[i5]) || (parseInt = Integer.parseInt(split[i5])) >= vector.size() || !vector.elementAt(parseInt).f11759d.equals(c3489yj) || parseInt < i2) {
                                        z = false;
                                    } else {
                                        split[i5] = String.valueOf(parseInt - i2);
                                        z = true;
                                    }
                                    if (true == z) {
                                        c0635i.f3810E[i5] = 1;
                                        z2 = c0635i.m4467a(split[i5], "0");
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        split[i5] = null;
                                    }
                                }
                            }
                        }
                    } else if (c3489yj.f14184U != null) {
                        if (c0635i.m4475q()) {
                            ArrayList<C0186n0> m4473o = c0635i.m4473o();
                            for (int i6 : c3489yj.f14184U) {
                                if (i6 < m4473o.size()) {
                                    c0635i.f3810E[i6] = 1;
                                    m4473o.get(i6).setChecked(true);
                                }
                            }
                        } else {
                            ArrayList<CheckBox> m4471m = c0635i.m4471m();
                            for (int i7 : c3489yj.f14184U) {
                                if (i7 < m4471m.size()) {
                                    m4471m.get(i7).setChecked(true);
                                }
                            }
                        }
                    }
                }
            }
            i2 = i2 + (c3489yj.f14174P.size() - 1) + 1;
        }
    }

    /* renamed from: c */
    public static boolean m6177c() {
        return f5244b;
    }

    /* renamed from: c */
    public static boolean m6178c(int i2) {
        return Color.alpha(i2) != 0 && Color.red(i2) == 255 && Color.green(i2) == 255 && Color.blue(i2) == 255;
    }

    /* renamed from: c */
    public static byte[] m6179c(String str) {
        File file = new File(str);
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            bufferedInputStream.read(bArr, 0, length);
            bufferedInputStream.close();
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r3.contains("th") != false) goto L4;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m6180d(java.lang.String r3) {
        /*
            java.lang.String r0 = "st"
            boolean r1 = r3.contains(r0)
            r2 = 0
            if (r1 == 0) goto L12
        L9:
            int r0 = r3.indexOf(r0)
            java.lang.String r3 = r3.substring(r2, r0)
            goto L2d
        L12:
            java.lang.String r0 = "nd"
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L1b
            goto L9
        L1b:
            java.lang.String r0 = "rd"
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L24
            goto L9
        L24:
            java.lang.String r0 = "th"
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L2d
            goto L9
        L2d:
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L32
            goto L33
        L32:
            r3 = -1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0755x1.m6180d(java.lang.String):int");
    }

    /* renamed from: d */
    public static void m6181d(Context context, String str) {
        Resources resources;
        int i2;
        WebAxnActivity webAxnActivity = (WebAxnActivity) context;
        if (webAxnActivity.m4078b().m16297a(str, false)) {
            return;
        }
        String m5641c = C0713j1.m5563a(webAxnActivity).m5641c(str);
        AlertDialog alertDialog = f5258p;
        if (alertDialog != null && alertDialog.isShowing()) {
            f5258p.dismiss();
        }
        if (webAxnActivity.isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
        builder.setIcon(R.drawable.ic_dialog_alert);
        String m5641c2 = C0713j1.m5563a(webAxnActivity).m5641c("ttl.Alert");
        if (TextUtils.isEmpty(m5641c2)) {
            m5641c2 = context.getResources().getString(com.mtni.myirancell.R.string.dialog_title);
        }
        builder.setTitle(m5641c2);
        if (TextUtils.isEmpty(m5641c)) {
            if (str.equals("msg.rpCal")) {
                resources = context.getResources();
                i2 = com.mtni.myirancell.R.string.message_rpcal;
            } else if (str.equals("msg.rpCam")) {
                resources = context.getResources();
                i2 = com.mtni.myirancell.R.string.message_rpcam;
            } else if (str.equals("msg.rpCon")) {
                resources = context.getResources();
                i2 = com.mtni.myirancell.R.string.message_rpcon;
            } else if (str.equals("msg.rpLoc")) {
                resources = context.getResources();
                i2 = com.mtni.myirancell.R.string.message_rploc;
            } else if (str.equals("msg.rpMic")) {
                resources = context.getResources();
                i2 = com.mtni.myirancell.R.string.message_rpmic;
            } else if (str.equals("msg.rpPhone")) {
                resources = context.getResources();
                i2 = com.mtni.myirancell.R.string.message_rp_phone;
            } else if (str.equals("msg.rpSen")) {
                resources = context.getResources();
                i2 = com.mtni.myirancell.R.string.message_rpsensor;
            } else if (str.equals("msg.rpSms")) {
                resources = context.getResources();
                i2 = com.mtni.myirancell.R.string.message_rpsms;
            } else if (str.equals("msg.rpStorage")) {
                resources = context.getResources();
                i2 = com.mtni.myirancell.R.string.message_rpstorage;
            } else if (str.equals("msg.rpVR")) {
                resources = context.getResources();
                i2 = com.mtni.myirancell.R.string.message_rpvr;
            } else if (str.equals("msg.rpVRWES")) {
                resources = context.getResources();
                i2 = com.mtni.myirancell.R.string.message_rpvrwes;
            } else if (str.equals("msg.rpAR")) {
                resources = context.getResources();
                i2 = com.mtni.myirancell.R.string.message_rpar;
            } else if (str.equals("msg.rpARWES")) {
                resources = context.getResources();
                i2 = com.mtni.myirancell.R.string.message_rparwes;
            }
            m5641c = resources.getString(i2);
        }
        builder.setMessage(m5641c);
        builder.setCancelable(true);
        String m5641c3 = C0713j1.m5563a(webAxnActivity).m5641c("msg.setting");
        if (TextUtils.isEmpty(m5641c3)) {
            m5641c3 = context.getResources().getString(com.mtni.myirancell.R.string.settings);
        }
        String m5641c4 = C0713j1.m5563a(webAxnActivity).m5641c("cmd.NN");
        if (TextUtils.isEmpty(m5641c4)) {
            m5641c4 = context.getResources().getString(com.mtni.myirancell.R.string.not_now);
        }
        builder.setPositiveButton(m5641c3, new i(webAxnActivity));
        builder.setNegativeButton(m5641c4, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        f5258p = create;
        create.setCanceledOnTouchOutside(false);
        f5258p.show();
    }

    /* renamed from: d */
    public static void m6182d(C2899lj c2899lj, Context context, String str, String str2) {
        m6189f(c2899lj, context, str, str2);
        m6176c(c2899lj, context, str, str2);
        m6186e(c2899lj, context, str, str2);
    }

    /* renamed from: d */
    public static boolean m6183d() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        try {
            Process exec = Runtime.getRuntime().exec("su");
            if (exec != null) {
                exec.destroy();
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static Spanned m6184e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : Html.fromHtml(str);
    }

    /* renamed from: e */
    public static void m6185e(Context context, String str) {
        Resources resources;
        int i2;
        WebAxnActivity webAxnActivity = (WebAxnActivity) context;
        if (!webAxnActivity.m4078b().m16297a(str, false)) {
            String m5641c = C0713j1.m5563a(webAxnActivity).m5641c(str);
            AlertDialog alertDialog = f5258p;
            if (alertDialog != null && alertDialog.isShowing()) {
                f5258p.dismiss();
            }
            if (!webAxnActivity.isFinishing()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
                builder.setIcon(R.drawable.ic_dialog_alert);
                String m5641c2 = C0713j1.m5563a(webAxnActivity).m5641c("ttl.Alert");
                if (TextUtils.isEmpty(m5641c2)) {
                    m5641c2 = context.getResources().getString(com.mtni.myirancell.R.string.dialog_title);
                }
                builder.setTitle(m5641c2);
                if (TextUtils.isEmpty(m5641c)) {
                    if (str.equals("msg.empty")) {
                        resources = context.getResources();
                        i2 = com.mtni.myirancell.R.string.error_message_empty_fields;
                    } else if (str.equals("msg.ImgEmpty")) {
                        resources = context.getResources();
                        i2 = com.mtni.myirancell.R.string.error_message_empty_image;
                    } else if (str.equals("msg.DrawEmpty")) {
                        resources = context.getResources();
                        i2 = com.mtni.myirancell.R.string.error_message_empty_draw;
                    } else if (str.equals("msg.errDate")) {
                        resources = context.getResources();
                        i2 = com.mtni.myirancell.R.string.error_message_error_date;
                    }
                    m5641c = resources.getString(i2);
                }
                builder.setMessage(m5641c);
                builder.setCancelable(true);
                String m5641c3 = C0713j1.m5563a(webAxnActivity).m5641c("cmd.Ok");
                if (TextUtils.isEmpty(m5641c3)) {
                    m5641c3 = context.getResources().getString(com.mtni.myirancell.R.string.dialog_button_ok);
                }
                builder.setPositiveButton(m5641c3, (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                f5258p = create;
                create.setCanceledOnTouchOutside(false);
                f5258p.show();
            }
        }
        f5254l = true;
    }

    /* renamed from: e */
    public static void m6186e(C2899lj c2899lj, Context context, String str, String str2) {
        HashMap<String, Vector<C2862kj>> hashMap;
        C3489yj m16930a;
        AbstractC0652n1 abstractC0652n1;
        if (c2899lj == null || (hashMap = c2899lj.f11890j) == null || !hashMap.containsKey(str) || (abstractC0652n1 = (m16930a = c2899lj.m13901f().m16930a(str, (Vector<C3489yj>) null)).f14197a0) == null) {
            return;
        }
        if (abstractC0652n1 instanceof C0641k) {
            C0641k c0641k = (C0641k) abstractC0652n1;
            if (str2 != null) {
                if (str2.length() == 0) {
                    str2 = "0";
                }
                c0641k.m4530c(str2);
                return;
            } else {
                int[] iArr = m16930a.f14184U;
                if (iArr == null || iArr.length <= 0) {
                    return;
                }
                c0641k.m4533i(iArr[0]);
                return;
            }
        }
        if (abstractC0652n1 instanceof C0644l) {
            C0644l c0644l = (C0644l) abstractC0652n1;
            if (str2 != null) {
                if (str2.length() == 0) {
                    str2 = "0";
                }
                c0644l.m4626c(str2);
            } else {
                int[] iArr2 = m16930a.f14184U;
                if (iArr2 == null || iArr2.length <= 0) {
                    return;
                }
                c0644l.m4630i(iArr2[0]);
            }
        }
    }

    /* renamed from: e */
    public static boolean m6187e() {
        return f5241E;
    }

    /* renamed from: f */
    public static HashMap<String, String> m6188f(String str) {
        String str2;
        String str3;
        f5262t = new HashMap<>();
        if (!TextUtils.isEmpty(str)) {
            String str4 = null;
            if (str.startsWith("action")) {
                str3 = str.substring(7, str.length());
                str2 = null;
            } else {
                int indexOf = str.indexOf("&action=");
                if (indexOf != -1) {
                    String substring = str.substring(indexOf + 8, str.length());
                    str2 = str.substring(0, indexOf).trim();
                    str3 = substring;
                } else {
                    str2 = str;
                    str3 = null;
                }
            }
            if (!TextUtils.isEmpty(str3)) {
                f5262t.put("action", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                String[] split = str2.split("&");
                for (String str5 : split) {
                    if (str5 != null && str5.indexOf("=") != -1) {
                        str4 = str5.substring(0, str5.indexOf("=")).trim();
                        str3 = str5.substring(str5.indexOf("=") + 1, str5.length());
                    }
                    if (str4 != null && str3 != null) {
                        f5262t.put(str4, str3);
                    }
                }
            }
        }
        return f5262t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0114, code lost:
    
        if (r1.isChecked() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x009f, code lost:
    
        if (r1.isChecked() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0119, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0116, code lost:
    
        r1.setChecked(true);
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6189f(p000.C2899lj r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0755x1.m6189f(lj, android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* renamed from: g */
    public static String m6190g(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    /* renamed from: h */
    public static int m6191h(String str) {
        if (str.equalsIgnoreCase("jan") || str.equalsIgnoreCase("january")) {
            return 0;
        }
        if (str.equalsIgnoreCase("feb") || str.equalsIgnoreCase("febuary")) {
            return 1;
        }
        if (str.equalsIgnoreCase("mar") || str.equalsIgnoreCase("march")) {
            return 2;
        }
        if (str.equalsIgnoreCase("apr") || str.equalsIgnoreCase("april")) {
            return 3;
        }
        if (str.equalsIgnoreCase("may")) {
            return 4;
        }
        if (str.equalsIgnoreCase("jun") || str.equalsIgnoreCase("june")) {
            return 5;
        }
        if (str.equalsIgnoreCase("jul") || str.equalsIgnoreCase("july")) {
            return 6;
        }
        if (str.equalsIgnoreCase("aug") || str.equalsIgnoreCase("august")) {
            return 7;
        }
        if (str.equalsIgnoreCase("sep") || str.equalsIgnoreCase("september")) {
            return 8;
        }
        if (str.equalsIgnoreCase("oct") || str.equalsIgnoreCase("october")) {
            return 9;
        }
        if (str.equalsIgnoreCase("nov") || str.equalsIgnoreCase("november")) {
            return 10;
        }
        return (str.equalsIgnoreCase("dec") || str.equalsIgnoreCase("december")) ? 11 : -1;
    }

    /* renamed from: i */
    public static String m6192i(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        long j2 = 0;
        for (int i2 = 0; i2 < length; i2++) {
            long j3 = (j2 << 4) + charArray[i2];
            long j4 = (-268435456) & j3;
            if (j4 != 0) {
                j3 ^= j4 >> 24;
            }
            j2 = j3 & (j4 ^ (-1));
        }
        return String.valueOf(j2);
    }

    /* renamed from: j */
    public static boolean m6193j(String str) {
        return new File(str).exists();
    }
}
