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
import androidx.core.app.f;
import androidx.core.content.FileProvider;
import com.comviva.webaxn.transport.NotificationReceiver;
import com.comviva.webaxn.ui.ExitActivity;
import com.comviva.webaxn.ui.WebAxnActivity;
import defpackage.aj;
import defpackage.ej;
import defpackage.fj;
import defpackage.hj;
import defpackage.kj;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import defpackage.zi;
import defpackage.zj;
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

/* loaded from: classes.dex */
public class x1 {
    public static int A = 0;
    public static String B = null;
    public static boolean C = false;
    public static String D = null;
    public static boolean E = false;
    public static TapsellSDKAdv F = null;
    public static double a = 100.0d;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = true;
    public static boolean f = true;
    public static AlertDialog g;
    static File h = Environment.getExternalStorageDirectory();
    public static boolean i;
    public static boolean j;
    public static boolean k;
    public static boolean l;
    public static String m;
    public static String n;
    public static boolean o;
    public static AlertDialog p;
    public static wj q;
    public static yj r;
    public static String s;
    public static HashMap<String, String> t;
    public static boolean u;
    public static boolean v;
    public static Activity w;
    public static boolean x;
    public static boolean y;
    public static boolean z;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[yj.a.values().length];
            a = iArr;
            try {
                iArr[yj.a.FOCUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[yj.a.FILLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[yj.a.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    static class b implements DialogInterface.OnClickListener {
        final /* synthetic */ WebAxnActivity b;

        b(WebAxnActivity webAxnActivity) {
            this.b = webAxnActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (x1.i) {
                x1.i = false;
            } else {
                String str = x1.m;
                if (str == null || !(str.equals("USER_ACTIVATION") || x1.m.equals("DONGLE_ACTIVATION") || x1.m.equals("MAKE_PAYMENT"))) {
                    x1.a((Activity) this.b);
                    return;
                } else {
                    x1.m = null;
                    this.b.setResult(0);
                }
            }
            this.b.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AsyncTask<String, Void, Boolean> {
        PushData a;
        Context b;

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
                android.content.Context r3 = r9.b     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                com.comviva.webaxn.utils.j1 r3 = com.comviva.webaxn.utils.j1.a(r3)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                java.lang.String r3 = r3.V()     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
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
                com.comviva.webaxn.utils.PushData r3 = r9.a     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                int r5 = r1.length     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r0, r5)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
                r3.a(r1)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L8d
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
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.x1.c.doInBackground(java.lang.String[]):java.lang.Boolean");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            x1.b(this.b, this.a);
        }
    }

    /* loaded from: classes.dex */
    static class d implements DialogInterface.OnClickListener {
        final /* synthetic */ wj b;

        d(wj wjVar) {
            this.b = wjVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.b.a((String) null, false, false);
        }
    }

    /* loaded from: classes.dex */
    static class e implements DialogInterface.OnCancelListener {
        final /* synthetic */ Context b;

        e(Context context) {
            this.b = context;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            ((Activity) this.b).finish();
        }
    }

    /* loaded from: classes.dex */
    static class f implements DialogInterface.OnClickListener {
        final /* synthetic */ Context b;

        f(Context context) {
            this.b = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ((Activity) this.b).finish();
        }
    }

    /* loaded from: classes.dex */
    static class g implements DialogInterface.OnClickListener {
        final /* synthetic */ WebAxnActivity b;
        final /* synthetic */ String c;

        g(WebAxnActivity webAxnActivity, String str) {
            this.b = webAxnActivity;
            this.c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            p1.a(this.b, this.c, -1);
        }
    }

    /* loaded from: classes.dex */
    static class h implements DialogInterface.OnClickListener {
        final /* synthetic */ WebAxnActivity b;
        final /* synthetic */ String c;

        h(WebAxnActivity webAxnActivity, String str) {
            this.b = webAxnActivity;
            this.c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            p1.a(this.b, this.c, -1);
        }
    }

    /* loaded from: classes.dex */
    static class i implements DialogInterface.OnClickListener {
        final /* synthetic */ WebAxnActivity b;

        i(WebAxnActivity webAxnActivity) {
            this.b = webAxnActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.b.getPackageName(), null));
            this.b.startActivity(intent);
        }
    }

    /* loaded from: classes.dex */
    public static class j {
        public static String a = null;
        public static boolean b = false;
        public static Activity c;
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(l1 l1Var);

        void a(lj ljVar);

        void b(l1 l1Var);
    }

    /* loaded from: classes.dex */
    public interface l {
        void a(boolean z);
    }

    /* loaded from: classes.dex */
    public interface m {
        void a();

        void a(String str);
    }

    /* loaded from: classes.dex */
    public interface n {
        void a(o oVar);
    }

    /* loaded from: classes.dex */
    public interface o {
        void a(boolean z);
    }

    /* loaded from: classes.dex */
    public interface p {
        void a(long j, String str);

        void a(com.comviva.webaxn.ui.n1 n1Var);

        void a(com.comviva.webaxn.ui.n1 n1Var, String str, yj yjVar);

        void a(com.comviva.webaxn.ui.r0 r0Var, String str);

        void a(com.comviva.webaxn.utils.e eVar, mj mjVar, zj zjVar, boolean z);

        void a(String str, int i, yj yjVar);

        void a(String str, String str2, yj yjVar);

        void a(String str, String str2, yj yjVar, boolean z, boolean z2, boolean[] zArr);

        void a(String str, yj yjVar);

        void a(yj yjVar);

        void a(yj yjVar, hj hjVar);

        void a(yj yjVar, String str, r rVar);

        void a(zj zjVar, hj hjVar, mj mjVar);

        void a(boolean z, yj yjVar);

        boolean a(yj yjVar, String str, String str2);

        void b(com.comviva.webaxn.ui.n1 n1Var);

        void b(yj yjVar);
    }

    /* loaded from: classes.dex */
    public interface q {
        void a(yj yjVar, boolean z);
    }

    /* loaded from: classes.dex */
    public interface r {
        void a(String str);
    }

    static {
        new File(h, "WebAxnLog.txt");
        i = false;
        j = false;
        k = false;
        l = true;
        m = null;
        n = null;
        o = false;
        p = null;
        q = null;
        r = null;
        s = null;
        u = false;
        v = false;
        x = false;
        y = false;
        z = false;
        A = 0;
        B = null;
        C = false;
        E = false;
    }

    public static double a(double d2) {
        double round = Math.round(d2 * a);
        double d3 = a;
        Double.isNaN(round);
        return round / d3;
    }

    public static float a(float f2) {
        return f2 * 0.05f;
    }

    public static int a(int i2) {
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

    public static int a(Context context, float f2) {
        try {
            float b2 = b(context) / 1.2f;
            if (b2 > 1.0f && f2 > 0.0f) {
                f2 = Math.round(b2 * f2 * 1.0f);
            }
        } catch (Exception unused) {
        }
        return (int) f2;
    }

    public static int a(String str, int i2, float f2) {
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

    public static int a(String str, String str2, boolean z2) {
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

    public static ColorStateList a(int i2, int i3, int i4, int i5) {
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

    public static Bitmap a(Context context, String str, byte[] bArr) {
        Bitmap a2 = e1.b(context).a(str);
        if (a2 == null && (a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
            e1.b(context).a(str, a2);
        }
        return a2;
    }

    public static Drawable a(Context context, String str) {
        int identifier;
        Drawable b2 = e1.b(context).b(str);
        if (b2 == null && (identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName())) > 0) {
            b2 = Build.VERSION.SDK_INT >= 21 ? context.getResources().getDrawable(identifier, null) : context.getResources().getDrawable(identifier);
            e1.b(context).a(str, b2);
        }
        return b2;
    }

    public static Drawable a(Context context, String str, String str2, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                int parseColor = Color.parseColor(str2);
                return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{parseColor}), drawable, new ColorDrawable(parseColor));
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static Drawable a(Context context, yj yjVar, yj.a aVar) {
        fj fjVar;
        int i2 = a.a[aVar.ordinal()];
        Drawable drawable = null;
        if (i2 == 1) {
            if (!TextUtils.isEmpty(yjVar.k1.f())) {
                drawable = b(context, yjVar.k1.f());
            } else if (yjVar.k1.a() != null) {
                drawable = b(context, yjVar.k1.g(), yjVar.k1.a());
            } else if (yjVar.k1.h()) {
                drawable = a(yjVar.O0, yjVar.k1.d(), yjVar.k1.c(), yjVar.k1.b());
            }
            if (drawable == null || (fjVar = yjVar.l1) == null) {
                return drawable;
            }
            fjVar.c(false);
            return drawable;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            if (!TextUtils.isEmpty(yjVar.m1.f())) {
                return b(context, yjVar.m1.f());
            }
            if (yjVar.m1.a() != null) {
                return b(context, yjVar.m1.g(), yjVar.m1.a());
            }
            if (yjVar.m1.h()) {
                return a(yjVar.O0, yjVar.m1.d(), yjVar.m1.c(), yjVar.m1.b());
            }
            return null;
        }
        if (!TextUtils.isEmpty(yjVar.l1.e())) {
            drawable = b(context, yjVar.l1.e());
        } else if (yjVar.l1.a() != null) {
            drawable = b(context, yjVar.l1.f(), yjVar.l1.a());
        } else if (yjVar.l1.g()) {
            drawable = a(yjVar.O0, yjVar.l1.d(), yjVar.l1.c(), yjVar.l1.b());
        }
        if (drawable == null) {
            return drawable;
        }
        yjVar.l1.c(true);
        return drawable;
    }

    public static Drawable a(ej ejVar, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{ejVar.b(), ejVar.b(), ejVar.d(), ejVar.d(), ejVar.c(), ejVar.c(), ejVar.a(), ejVar.a()}, null, null));
        shapeDrawable.getPaint().setColor(com.comviva.webaxn.ui.n1.d(i2));
        return shapeDrawable;
    }

    public static GradientDrawable a(ej ejVar, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (ejVar != null) {
            gradientDrawable.setCornerRadii(new float[]{ejVar.b(), ejVar.b(), ejVar.d(), ejVar.d(), ejVar.c(), ejVar.c(), ejVar.a(), ejVar.a()});
        }
        gradientDrawable.setStroke(i2, i3);
        gradientDrawable.setColor(i4);
        return gradientDrawable;
    }

    public static StateListDrawable a(Context context, Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_focused}, drawable);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable2);
        stateListDrawable.addState(new int[0], drawable);
        return stateListDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Spanned a(int r6, int r7, int r8, int r9, java.lang.String r10) {
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
            java.lang.String r6 = a(r7, r4)
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
            java.lang.String r6 = a(r7, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.x1.a(int, int, int, int, java.lang.String):android.text.Spanned");
    }

    public static String a(int i2, int i3) {
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

    public static String a(Context context, int i2, String str) {
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
                    D = sb2;
                }
                return D;
            }
            sb = new StringBuilder();
            dir = context.getExternalFilesDir(str);
        }
        sb.append(dir.getPath());
        sb.append("/");
        sb2 = sb.toString();
        D = sb2;
        return D;
    }

    public static String a(Context context, yj yjVar, com.comviva.webaxn.ui.o1 o1Var) {
        String str;
        com.comviva.webaxn.ui.l lVar = (com.comviva.webaxn.ui.l) yjVar.a0;
        String str2 = "0";
        if (yjVar.P != null && lVar.m() < yjVar.P.size()) {
            if (yjVar.c0) {
                str = Integer.valueOf(lVar.m()).toString();
            } else {
                kj elementAt = yjVar.P.elementAt(lVar.m());
                String str3 = elementAt.b;
                if (str3 != null) {
                    str2 = "1";
                    str = str3;
                } else {
                    str = elementAt.a;
                    if (str != null) {
                        str2 = "2";
                    }
                }
            }
            aj.a(context).f(yjVar.V, str2);
            return str;
        }
        str = null;
        aj.a(context).f(yjVar.V, str2);
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r16, defpackage.zj r17, java.lang.String r18, boolean r19, boolean r20, com.comviva.webaxn.ui.o1 r21) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.x1.a(android.content.Context, zj, java.lang.String, boolean, boolean, com.comviva.webaxn.ui.o1):java.lang.String");
    }

    public static String a(InputStream inputStream) {
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

    public static String a(yj yjVar, com.comviva.webaxn.ui.o1 o1Var) {
        StringBuffer stringBuffer = new StringBuffer();
        Vector<kj> vector = o1Var.d.g.get(yjVar.V);
        if (vector != null) {
            int i2 = 0;
            while (i2 < vector.size()) {
                yj yjVar2 = vector.elementAt(i2).d;
                com.comviva.webaxn.ui.n1 n1Var = yjVar2.a0;
                if (n1Var != null) {
                    if (n1Var instanceof com.comviva.webaxn.ui.h) {
                        ArrayList<CheckBox> m2 = ((com.comviva.webaxn.ui.h) n1Var).m();
                        for (int i3 = 0; i3 < m2.size(); i3++) {
                            CheckBox checkBox = m2.get(i3);
                            if ((checkBox.getTag() == null || !((String) checkBox.getTag()).equals("SELECTALL")) && checkBox.isChecked()) {
                                if (stringBuffer.length() != 0) {
                                    stringBuffer.append("&#x3b;");
                                }
                                if (yjVar2.c0) {
                                    stringBuffer.append(i2 + i3);
                                } else {
                                    kj elementAt = yjVar2.P.elementAt(i3);
                                    String str = elementAt.b;
                                    if (str != null) {
                                        stringBuffer.append(str);
                                    } else {
                                        String str2 = elementAt.a;
                                        if (str2 != null) {
                                            stringBuffer.append(str2);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (n1Var instanceof com.comviva.webaxn.ui.i) {
                        com.comviva.webaxn.ui.i iVar = (com.comviva.webaxn.ui.i) n1Var;
                        if (iVar.q()) {
                            ArrayList<androidx.appcompat.widget.n0> o2 = iVar.o();
                            for (int i4 = 0; i4 < o2.size(); i4++) {
                                androidx.appcompat.widget.n0 n0Var = o2.get(i4);
                                if ((n0Var.getTag() == null || !((String) n0Var.getTag()).equals("SELECTALL")) && n0Var.isChecked()) {
                                    if (stringBuffer.length() != 0) {
                                        stringBuffer.append("&#x3b;");
                                    }
                                    if (yjVar2.c0) {
                                        stringBuffer.append(i2 + i4);
                                    } else {
                                        kj elementAt2 = yjVar2.P.elementAt(i4);
                                        String str3 = elementAt2.b;
                                        if (str3 != null) {
                                            stringBuffer.append(str3);
                                        } else {
                                            String str4 = elementAt2.a;
                                            if (str4 != null) {
                                                stringBuffer.append(str4);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            ArrayList<CheckBox> m3 = iVar.m();
                            for (int i5 = 0; i5 < m3.size(); i5++) {
                                CheckBox checkBox2 = m3.get(i5);
                                if ((checkBox2.getTag() == null || !((String) checkBox2.getTag()).equals("SELECTALL")) && checkBox2.isChecked()) {
                                    if (stringBuffer.length() != 0) {
                                        stringBuffer.append("&#x3b;");
                                    }
                                    if (yjVar2.c0) {
                                        stringBuffer.append(i2 + i5);
                                    } else {
                                        kj elementAt3 = yjVar2.P.elementAt(i5);
                                        String str5 = elementAt3.b;
                                        if (str5 != null) {
                                            stringBuffer.append(str5);
                                        } else {
                                            String str6 = elementAt3.a;
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
                i2 = i2 + (yjVar2.P.size() - 1) + 1;
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0078, code lost:
    
        if (r4.T != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007a, code lost:
    
        r4.a0.l();
        com.comviva.webaxn.utils.x1.l = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0099, code lost:
    
        if (r4.T != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00bd, code lost:
    
        if (r4.T != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ce, code lost:
    
        if (r4.T != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(defpackage.zj r6, java.lang.String r7, com.comviva.webaxn.ui.o1 r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.x1.a(zj, java.lang.String, com.comviva.webaxn.ui.o1, boolean):java.lang.String");
    }

    public static HashMap<String, String> a(String str, String str2, String str3, String str4) {
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

    public static xj a(String str, Vector<xj> vector) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (vector != null) {
                for (int i2 = 0; i2 < vector.size(); i2++) {
                    xj xjVar = vector.get(i2);
                    if (!TextUtils.isEmpty(xjVar.a) && str.equals(xjVar.a)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                xj xjVar2 = new xj();
                xjVar2.a = str;
                while (str.indexOf("$") > -1) {
                    k1 k1Var = new k1();
                    str = str.substring(str.indexOf("$") + 1);
                    if (str.indexOf(",") > -1) {
                        k1Var.a = str.substring(0, str.indexOf(","));
                        str = str.substring(str.indexOf(",") + 1, str.length());
                    } else if (str.indexOf(")") > -1) {
                        k1Var.a = str.substring(0, str.indexOf(")"));
                    }
                    xjVar2.a(k1Var);
                }
                return xjVar2;
            }
        }
        return null;
    }

    public static yj a(yj yjVar) {
        do {
            yjVar = yjVar.A0;
            if (yjVar == null) {
                break;
            }
        } while (yjVar.e != 8);
        return yjVar;
    }

    public static yj a(yj yjVar, String str) {
        yj yjVar2 = null;
        if (yjVar != null && str != null) {
            String str2 = yjVar.V;
            if (str2 != null && str.equals(str2)) {
                yjVar2 = yjVar;
            }
            if (yjVar2 == null && yjVar.z0 != null) {
                for (int i2 = 0; i2 < yjVar.z0.size() && (yjVar2 = a(yjVar.z0.elementAt(i2), str)) == null; i2++) {
                }
            }
        }
        return yjVar2;
    }

    public static void a() {
        AlertDialog alertDialog = g;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        g.dismiss();
    }

    public static void a(Activity activity) {
        Intent intent = new Intent();
        intent.setClass(activity, ExitActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }

    public static void a(Context context) {
        j1.a(context).p();
        j1.a(context).l();
        j1.a(context).m();
        j1.a(context).n();
        j1.a(context).o();
    }

    public static void a(Context context, int i2, boolean z2) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (z2) {
                notificationManager.cancelAll();
                A = 0;
            } else {
                notificationManager.cancel(i2);
                A--;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(Context context, com.comviva.webaxn.ui.o1 o1Var, String str, String str2, wj wjVar, boolean z2) {
        HashMap<String, String> hashMap;
        zj zjVar = o1Var.b;
        if (zjVar != null) {
            if (str.equals("schema")) {
                wjVar.a(str2, false, null, null, o1Var.f(), o1Var.d);
                return;
            }
            yj a2 = zjVar.a(str, (Vector<yj>) null);
            if (a2 == null) {
                if (z2 || (hashMap = zjVar.r) == null || !hashMap.containsKey(str)) {
                    return;
                }
                zjVar.a(str, str2);
                return;
            }
            com.comviva.webaxn.ui.n1 n1Var = a2.a0;
            if (n1Var instanceof com.comviva.webaxn.ui.v) {
                com.comviva.webaxn.ui.v vVar = (com.comviva.webaxn.ui.v) n1Var;
                if (!TextUtils.isEmpty(str2) && str2.equals("-1")) {
                    str2 = "";
                }
                vVar.f(str2);
                vVar.g(str2.length());
                return;
            }
            if (n1Var instanceof com.comviva.webaxn.ui.w) {
                com.comviva.webaxn.ui.w wVar = (com.comviva.webaxn.ui.w) n1Var;
                if (!TextUtils.isEmpty(str2) && str2.equals("-1")) {
                    str2 = "";
                }
                wVar.h(str2);
                wVar.g(str2.length());
                return;
            }
            if (n1Var instanceof com.comviva.webaxn.ui.h0) {
                com.comviva.webaxn.ui.h0 h0Var = (com.comviva.webaxn.ui.h0) n1Var;
                if (!TextUtils.isEmpty(str2) && str2.equals("-1")) {
                    str2 = " ";
                }
                h0Var.d(str2);
                return;
            }
            if (n1Var instanceof com.comviva.webaxn.ui.i0) {
                com.comviva.webaxn.ui.i0 i0Var = (com.comviva.webaxn.ui.i0) n1Var;
                if (!TextUtils.isEmpty(str2) && str2.equals("-1")) {
                    str2 = " ";
                }
                i0Var.b(str2);
                return;
            }
            if (!(n1Var instanceof com.comviva.webaxn.ui.g0)) {
                if (a2.e == 4) {
                    d(o1Var.d, context, str, str2);
                }
            } else {
                com.comviva.webaxn.ui.g0 g0Var = (com.comviva.webaxn.ui.g0) n1Var;
                if (!TextUtils.isEmpty(str2) && str2.equals("-1")) {
                    str2 = " ";
                }
                g0Var.b(str2);
            }
        }
    }

    public static void a(Context context, PushData pushData) {
        c cVar = new c();
        cVar.a = pushData;
        cVar.b = context;
        try {
            String decode = Uri.decode(pushData.e());
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

    public static void a(Context context, PushData pushData, Intent intent) {
        try {
            intent.addFlags(805306368);
            intent.setClassName(context.getPackageName(), "com.comviva.webaxn.ui.NotiDlgActivity");
            intent.putExtra("Title", Uri.decode(pushData.l()));
            intent.putExtra("Description", Uri.decode(pushData.c()));
            intent.putExtra("Ok", Uri.decode(pushData.f()));
            intent.putExtra("Cancel", Uri.decode(pushData.j()));
            intent.putExtra("Action", pushData.g());
            intent.putExtra("CancelAction", pushData.k());
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(Context context, String str, PushData pushData) {
        try {
            String A2 = j1.a(context).A();
            Integer.parseInt(A2);
            if (!TextUtils.isEmpty(str)) {
                int indexOf = str.indexOf("|");
                if (indexOf != -1) {
                    int i2 = 0;
                    pushData.g(str.substring(0, indexOf).trim());
                    if (!TextUtils.isEmpty(pushData.i()) && pushData.i().equals(A2)) {
                        String substring = str.substring(indexOf + 1);
                        TextUtils.SimpleStringSplitter<String> simpleStringSplitter = new TextUtils.SimpleStringSplitter('|');
                        simpleStringSplitter.setString(substring);
                        for (String str2 : simpleStringSplitter) {
                            if (i2 == 0) {
                                pushData.k(str2);
                            } else if (1 == i2) {
                                pushData.j(str2);
                            } else if (2 == i2) {
                                pushData.c(str2);
                            } else if (3 == i2) {
                                pushData.e(str2);
                            } else if (4 == i2) {
                                pushData.h(str2);
                            } else if (5 == i2) {
                                pushData.f(str2);
                            } else if (6 == i2) {
                                pushData.i(str2);
                            } else if (7 == i2) {
                                pushData.a(str2);
                            } else if (8 == i2) {
                                pushData.b(str2);
                            } else if (9 == i2) {
                                pushData.d(str2);
                            }
                            i2++;
                        }
                    }
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(pushData.i())) {
                return;
            }
            if (!pushData.i().equals(A2)) {
                return;
            }
            if (!TextUtils.isEmpty(pushData.b())) {
                aj.a(context).h("badgecnt", pushData.b());
            }
            if ((pushData.m().equals("not") || pushData.m().equals("actnot")) && !TextUtils.isEmpty(pushData.e())) {
                a(context, pushData);
            } else {
                b(context, pushData);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(Context context, String str, String str2, int i2) {
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
                parse = FileProvider.a(context, context.getString(com.mtni.myirancell.R.string.authority), new File(str));
                intent.setDataAndType(parse, "application/vnd.android.package-archive");
                ((Activity) context).startActivityForResult(intent, i2);
            } else {
                if (!TextUtils.isEmpty(str2)) {
                    intent.setDataAndType(FileProvider.a(context, context.getString(com.mtni.myirancell.R.string.authority), new File(Uri.parse(str2).getPath())), "application/vnd.android.package-archive");
                    intent.setFlags(1);
                }
                ((Activity) context).startActivityForResult(intent, i2);
            }
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, String str, String str2, String str3, boolean z2, mj mjVar, lj ljVar, boolean z3) {
        if (z2) {
            p1.b(context, str, str2);
        }
    }

    public static void a(Context context, String str, String str2, boolean z2) {
        WebAxnActivity webAxnActivity = (WebAxnActivity) context;
        AlertDialog alertDialog = g;
        if (alertDialog != null && alertDialog.isShowing()) {
            g.dismiss();
        }
        if (webAxnActivity.isFinishing()) {
            return;
        }
        String c2 = j1.a(context).c(z2 ? "msg.titleConf" : "msg.titleInf");
        if (c2 == null) {
            c2 = context.getString(com.mtni.myirancell.R.string.dialog_title);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
        builder.setTitle(c2);
        builder.setMessage(str);
        if (z2) {
            builder.setCancelable(false);
        } else {
            builder.setCancelable(true);
            builder.setOnCancelListener(new e(context));
        }
        builder.setPositiveButton(str2, new f(context));
        AlertDialog create = builder.create();
        g = create;
        create.setCanceledOnTouchOutside(false);
        g.show();
    }

    public static void a(Context context, String str, String str2, boolean z2, boolean z3) {
        try {
            if (g != null && g.isShowing()) {
                g.dismiss();
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
            if (z2) {
                if (z3) {
                    builder.setIcon(R.drawable.ic_dialog_info);
                }
                String c2 = j1.a(webAxnActivity).c("cmd.Exit");
                if (c2 == null) {
                    c2 = context.getString(com.mtni.myirancell.R.string.dialog_button_exit);
                }
                String c3 = j1.a(webAxnActivity).c("cmd.Cancel");
                if (c3 == null) {
                    c3 = context.getString(com.mtni.myirancell.R.string.dialog_button_cancel);
                }
                builder.setPositiveButton(c2, new b(webAxnActivity));
                builder.setNegativeButton(c3, (DialogInterface.OnClickListener) null);
                builder.setCancelable(false);
            } else {
                if (z3) {
                    builder.setIcon(R.drawable.ic_dialog_info);
                }
                String c4 = j1.a(webAxnActivity).c("cmd.Ok");
                if (c4 == null) {
                    c4 = context.getString(com.mtni.myirancell.R.string.dialog_button_ok);
                }
                builder.setPositiveButton(c4, (DialogInterface.OnClickListener) null);
            }
            AlertDialog create = builder.create();
            g = create;
            create.setCanceledOnTouchOutside(false);
            g.show();
        } catch (ClassCastException e2) {
            e2.printStackTrace();
        }
    }

    public static void a(Context context, String str, String str2, boolean z2, boolean z3, String str3) {
        try {
            WebAxnActivity webAxnActivity = (WebAxnActivity) context;
            if (webAxnActivity.b().a(str2, false)) {
                return;
            }
            String c2 = j1.a(webAxnActivity).c(str2);
            if (g != null && g.isShowing()) {
                g.dismiss();
            }
            if (webAxnActivity.isFinishing()) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
            if (TextUtils.isEmpty(str)) {
                str = context.getString(com.mtni.myirancell.R.string.dialog_title);
            }
            builder.setTitle(str);
            if (TextUtils.isEmpty(c2)) {
                c2 = context.getString(com.mtni.myirancell.R.string.force_download);
            }
            builder.setMessage(c2);
            if (z2) {
                if (z3) {
                    builder.setIcon(R.drawable.ic_dialog_info);
                }
                String c3 = j1.a(webAxnActivity).c("cmd.Download");
                if (c3 == null) {
                    c3 = context.getString(com.mtni.myirancell.R.string.dialog_button_download);
                }
                String c4 = j1.a(webAxnActivity).c("cmd.Cancel");
                if (c4 == null) {
                    c4 = context.getString(com.mtni.myirancell.R.string.dialog_button_cancel);
                }
                builder.setPositiveButton(c3, new g(webAxnActivity, str3));
                builder.setNegativeButton(c4, (DialogInterface.OnClickListener) null);
                builder.setCancelable(false);
            } else {
                if (z3) {
                    builder.setIcon(R.drawable.ic_dialog_alert);
                }
                String c5 = j1.a(webAxnActivity).c("cmd.Download");
                if (c5 == null) {
                    c5 = context.getString(com.mtni.myirancell.R.string.dialog_button_download);
                }
                builder.setPositiveButton(c5, new h(webAxnActivity, str3));
            }
            AlertDialog create = builder.create();
            g = create;
            create.setCanceledOnTouchOutside(false);
            g.show();
        } catch (ClassCastException e2) {
            e2.printStackTrace();
        }
    }

    public static void a(Context context, wj wjVar) {
        try {
            if (g != null && g.isShowing()) {
                g.dismiss();
            }
            WebAxnActivity webAxnActivity = (WebAxnActivity) context;
            if (webAxnActivity.isFinishing()) {
                return;
            }
            String c2 = j1.a(context).c("msg.ErrTimeOut");
            if (TextUtils.isEmpty(c2)) {
                c2 = context.getString(com.mtni.myirancell.R.string.session_timeout);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
            builder.setMessage(c2);
            String c3 = j1.a(webAxnActivity).c("ttl.Alert");
            if (TextUtils.isEmpty(c3)) {
                c3 = context.getResources().getString(com.mtni.myirancell.R.string.dialog_title);
            }
            builder.setTitle(c3);
            String c4 = j1.a(webAxnActivity).c("cmd.Ok");
            if (c4 == null) {
                c4 = context.getString(com.mtni.myirancell.R.string.dialog_button_ok);
            }
            builder.setPositiveButton(c4, new d(wjVar));
            AlertDialog create = builder.create();
            g = create;
            create.setCanceledOnTouchOutside(false);
            g.setCancelable(false);
            g.show();
        } catch (ClassCastException e2) {
            e2.printStackTrace();
        }
    }

    public static void a(Context context, yj yjVar, IBinder iBinder) {
        if (yjVar == null || yjVar.e != 3) {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (iBinder != null) {
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            }
        }
    }

    public static void a(Context context, yj yjVar, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(view, 1);
    }

    public static void a(String str) {
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

    public static void a(String str, String str2, zj zjVar) {
        com.comviva.webaxn.ui.n1 n1Var;
        if (TextUtils.isEmpty(str2) || zjVar == null) {
            return;
        }
        yj a2 = zjVar.a(str2, (Vector<yj>) null);
        if (a2 == null || (n1Var = a2.a0) == null) {
            HashMap<String, String> hashMap = zjVar.r;
            if (hashMap == null || !hashMap.containsKey(str2)) {
                return;
            }
            zjVar.a(str2, str);
            return;
        }
        if (n1Var instanceof com.comviva.webaxn.ui.w) {
            com.comviva.webaxn.ui.w wVar = (com.comviva.webaxn.ui.w) n1Var;
            wVar.h(str);
            wVar.g(str.length());
        } else if (n1Var instanceof com.comviva.webaxn.ui.v) {
            com.comviva.webaxn.ui.v vVar = (com.comviva.webaxn.ui.v) n1Var;
            vVar.f(str);
            vVar.g(str.length());
        } else if (n1Var instanceof com.comviva.webaxn.ui.i0) {
            ((com.comviva.webaxn.ui.i0) n1Var).b(str);
        } else if (n1Var instanceof com.comviva.webaxn.ui.h0) {
            ((com.comviva.webaxn.ui.h0) n1Var).d(str);
        } else if (n1Var instanceof com.comviva.webaxn.ui.g0) {
            ((com.comviva.webaxn.ui.g0) n1Var).b(str);
        }
    }

    public static void a(lj ljVar, Context context, String str, String str2) {
        f(ljVar, context, str, str2);
        b(ljVar, context, str, str2);
        e(ljVar, context, str, str2);
    }

    public static void a(boolean z2) {
        b = z2;
    }

    public static boolean a(l1 l1Var) {
        Vector<k1> vector = l1Var.F;
        if (vector != null && vector != null) {
            Iterator<k1> it = vector.iterator();
            while (it.hasNext()) {
                if (it.next().c) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Date date, Date date2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return calendar != null && calendar2 != null && calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static boolean a(byte[] bArr, String str) {
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

    public static byte[] a(Bitmap bitmap, byte[] bArr, int i2, float f2) {
        if (bitmap == null) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean compress = bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return (!compress || ((long) byteArray.length) <= zi.p) ? byteArray : a(bitmap, byteArray, (int) (i2 / f2), f2 + 0.01f);
    }

    public static float b(Context context) {
        try {
            float d2 = com.comviva.webaxn.utils.b.a(context).a().d();
            float b2 = com.comviva.webaxn.utils.b.a(context).a().b();
            float a2 = com.comviva.webaxn.utils.b.a(context).a().a();
            if (d2 >= b2) {
                d2 = b2;
            }
            return (d2 / a2) / 320.0f;
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    public static AnimationDrawable b() {
        GradientDrawable[] gradientDrawableArr = {new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-65536, -65281, -16776961, -16711681, -16711936, -256}), new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-256, -65536, -65281, -16776961, -16711681, -16711936}), new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-16711936, -256, -65536, -65281, -16776961, -16711681}), new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-16711681, -16711936, -256, -65536, -65281, -16776961}), new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-16776961, -16711681, -16711936, -256, -65536, -65281}), new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-65281, -16776961, -16711681, -16711936, -256, -65536})};
        AnimationDrawable animationDrawable = new AnimationDrawable();
        for (int i2 = 0; i2 < 6; i2++) {
            animationDrawable.addFrame(gradientDrawableArr[i2], 100);
        }
        animationDrawable.setOneShot(false);
        return animationDrawable;
    }

    public static Drawable b(Context context, String str) {
        if (str.indexOf(".") != -1) {
            str = str.substring(0, str.indexOf("."));
        }
        Bitmap a2 = e1.b(context).a(str);
        if (a2 == null) {
            int c2 = c(context, str);
            int f2 = com.comviva.webaxn.utils.b.a(context).a().f();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDensity = f2;
            options.inJustDecodeBounds = false;
            if (c2 > 0 && (a2 = BitmapFactory.decodeResource(context.getResources(), c2, options)) != null) {
                e1.b(context).a(str, a2);
            }
        }
        Bitmap bitmap = a2;
        if (bitmap != null) {
            return NinePatch.isNinePatchChunk(bitmap.getNinePatchChunk()) ? new NinePatchDrawable(context.getResources(), bitmap, bitmap.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(context.getResources(), bitmap);
        }
        return null;
    }

    public static Drawable b(Context context, String str, byte[] bArr) {
        Bitmap a2 = a(context, str, bArr);
        if (a2 != null) {
            return NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(context.getResources(), a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(context.getResources(), a2);
        }
        return null;
    }

    public static ImageView.ScaleType b(int i2) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? scaleType : ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_CROP : scaleType : ImageView.ScaleType.FIT_XY;
    }

    public static String b(Context context, yj yjVar, com.comviva.webaxn.ui.o1 o1Var) {
        String str;
        com.comviva.webaxn.ui.k kVar = (com.comviva.webaxn.ui.k) yjVar.a0;
        String str2 = "0";
        if (yjVar.c0) {
            str = Integer.valueOf(kVar.m()).toString();
        } else {
            kj elementAt = yjVar.P.elementAt(kVar.m());
            String str3 = elementAt.b;
            if (str3 != null) {
                str2 = "1";
                str = str3;
            } else {
                str = elementAt.a;
                if (str != null) {
                    str2 = "2";
                } else {
                    str = null;
                }
            }
        }
        aj.a(context).f(yjVar.V, str2);
        return str;
    }

    public static String b(InputStream inputStream) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(defpackage.yj r8, com.comviva.webaxn.ui.o1 r9) {
        /*
            lj r9 = r9.d
            java.util.HashMap<java.lang.String, java.util.Vector<kj>> r9 = r9.i
            java.lang.String r8 = r8.V
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
            kj r3 = (defpackage.kj) r3
            yj r3 = r3.d
            com.comviva.webaxn.ui.n1 r4 = r3.a0
            r5 = 1
            if (r4 == 0) goto L97
            boolean r6 = r4 instanceof com.comviva.webaxn.ui.s0
            if (r6 == 0) goto L58
            com.comviva.webaxn.ui.s0 r4 = (com.comviva.webaxn.ui.s0) r4
            r6 = 0
        L2c:
            int r7 = r4.n()
            if (r6 >= r7) goto L97
            android.view.View r7 = r4.g(r6)
            android.widget.RadioButton r7 = (android.widget.RadioButton) r7
            boolean r7 = r7.isChecked()
            if (r7 == 0) goto L55
            boolean r2 = r3.c0
            if (r2 == 0) goto L43
            goto L75
        L43:
            java.util.Vector<kj> r2 = r3.P
            java.lang.Object r2 = r2.elementAt(r6)
            kj r2 = (defpackage.kj) r2
            java.lang.String r4 = r2.b
            if (r4 == 0) goto L50
            goto L8b
        L50:
            java.lang.String r2 = r2.a
            if (r2 == 0) goto L92
            goto L91
        L55:
            int r6 = r6 + 1
            goto L2c
        L58:
            boolean r6 = r4 instanceof com.comviva.webaxn.ui.t0
            if (r6 == 0) goto L97
            com.comviva.webaxn.ui.t0 r4 = (com.comviva.webaxn.ui.t0) r4
            r6 = 0
        L5f:
            int r7 = r4.n()
            if (r6 >= r7) goto L97
            android.view.View r7 = r4.g(r6)
            android.widget.RadioButton r7 = (android.widget.RadioButton) r7
            boolean r7 = r7.isChecked()
            if (r7 == 0) goto L94
            boolean r2 = r3.c0
            if (r2 == 0) goto L7f
        L75:
            int r6 = r6 + r1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            java.lang.String r9 = r9.toString()
            goto L92
        L7f:
            java.util.Vector<kj> r2 = r3.P
            java.lang.Object r2 = r2.elementAt(r6)
            kj r2 = (defpackage.kj) r2
            java.lang.String r4 = r2.b
            if (r4 == 0) goto L8d
        L8b:
            r9 = r4
            goto L92
        L8d:
            java.lang.String r2 = r2.a
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
            java.util.Vector<kj> r3 = r3.P
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
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.x1.b(yj, com.comviva.webaxn.ui.o1):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (com.comviva.webaxn.utils.x1.y != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (com.comviva.webaxn.utils.x1.x == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (com.comviva.webaxn.utils.x1.j.b != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r3, com.comviva.webaxn.utils.PushData r4) {
        /*
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.notify.action"
            r0.setAction(r1)
            java.lang.String r1 = r4.m()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L71
            java.lang.String r1 = r4.m()
            java.lang.String r2 = "not"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L48
            android.app.Activity r1 = com.comviva.webaxn.utils.x1.w
            if (r1 == 0) goto L54
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L33
            android.app.Activity r1 = com.comviva.webaxn.utils.x1.w
            boolean r1 = r1.isDestroyed()
            if (r1 == 0) goto L3b
            goto L54
        L33:
            android.app.Activity r1 = com.comviva.webaxn.utils.x1.w
            boolean r1 = r1.isFinishing()
            if (r1 != 0) goto L54
        L3b:
            boolean r1 = com.comviva.webaxn.utils.x1.y
            if (r1 == 0) goto L43
            boolean r1 = com.comviva.webaxn.utils.x1.x
            if (r1 == 0) goto L54
        L43:
            boolean r1 = com.comviva.webaxn.utils.x1.j.b
            if (r1 == 0) goto L6e
            goto L54
        L48:
            java.lang.String r1 = r4.m()
            java.lang.String r2 = "actnot"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L58
        L54:
            b(r3, r4, r0)
            goto L71
        L58:
            java.lang.String r1 = r4.m()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L71
            java.lang.String r1 = r4.m()
            java.lang.String r2 = "dlg"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L71
        L6e:
            a(r3, r4, r0)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.x1.b(android.content.Context, com.comviva.webaxn.utils.PushData):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Context context, PushData pushData, Intent intent) {
        String packageName;
        String str;
        f.c cVar;
        try {
            int i2 = A;
            A = i2 + 1;
            pushData.a(i2);
            intent.addFlags(805306368);
            String str2 = null;
            if (!TextUtils.isEmpty(pushData.a())) {
                str2 = pushData.a();
            } else if (!TextUtils.isEmpty(pushData.g())) {
                str2 = pushData.g();
            } else if (!TextUtils.isEmpty(pushData.k())) {
                str2 = pushData.k();
            }
            intent.putExtra("push_action", str2);
            intent.putExtra("id", pushData.h());
            if (!j.b || TextUtils.isEmpty(j.a)) {
                packageName = context.getPackageName();
                str = "com.comviva.webaxn.ui.WebAxnActivity";
            } else {
                packageName = context.getPackageName();
                str = j.a;
            }
            intent.setClassName(packageName, str);
            String packageName2 = context.getPackageName();
            PendingIntent activity = PendingIntent.getActivity(context, pushData.h(), intent, 134217728);
            Intent intent2 = new Intent(context, (Class<?>) NotificationReceiver.class);
            intent2.setAction("com.notification.DELETE");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, pushData.h(), intent2, 0);
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), com.mtni.myirancell.R.drawable.webaxn);
            f.d dVar = new f.d(context);
            dVar.e(com.mtni.myirancell.R.drawable.ic_message);
            dVar.a(decodeResource);
            dVar.c(pushData.c());
            dVar.a(System.currentTimeMillis());
            dVar.b(e(Uri.decode(pushData.l())));
            dVar.a(e(Uri.decode(pushData.c())));
            if (pushData.d() != null) {
                f.b bVar = new f.b();
                bVar.b(pushData.d());
                cVar = bVar;
            } else {
                f.c cVar2 = new f.c();
                cVar2.a(pushData.c());
                cVar = cVar2;
            }
            dVar.a(cVar);
            dVar.a(activity);
            dVar.b(broadcast);
            if (Build.VERSION.SDK_INT >= 26) {
                dVar.a(packageName2);
            }
            if (pushData.m().equals("actnot")) {
                dVar.b(-1);
                dVar.d(1);
                if (!TextUtils.isEmpty(pushData.f())) {
                    intent.setAction("com.notify.lskaction");
                    if (!TextUtils.isEmpty(pushData.g())) {
                        intent.putExtra("push_lskaction", pushData.g());
                    }
                    dVar.a(0, e(Uri.decode(pushData.f())), PendingIntent.getActivity(context, pushData.h(), intent, 134217728));
                }
                if (!TextUtils.isEmpty(pushData.j())) {
                    intent.setAction("com.notify.rskaction");
                    if (!TextUtils.isEmpty(pushData.k())) {
                        intent.putExtra("push_rskaction", pushData.k());
                    }
                    dVar.a(0, e(Uri.decode(pushData.j())), PendingIntent.getActivity(context, pushData.h(), intent, 134217728));
                }
            }
            Notification a2 = dVar.a();
            int i3 = a2.defaults | 1;
            a2.defaults = i3;
            a2.flags |= 1;
            a2.defaults = i3 | 4;
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel(packageName2, context.getString(com.mtni.myirancell.R.string.channel_name), 3));
            }
            notificationManager.notify(pushData.h(), a2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void b(String str) {
        File file = new File(str);
        if (file.isDirectory()) {
            return;
        }
        file.mkdirs();
    }

    public static void b(lj ljVar, Context context, String str, String str2) {
        HashMap<String, Vector<kj>> hashMap;
        int parseInt;
        if (ljVar == null || (hashMap = ljVar.g) == null || !hashMap.containsKey(str)) {
            return;
        }
        Vector<kj> vector = ljVar.g.get(str);
        if (TextUtils.isEmpty(str2) || !TextUtils.isDigitsOnly(str2) || (parseInt = Integer.parseInt(str2)) >= vector.size()) {
            return;
        }
        kj elementAt = vector.elementAt(parseInt);
        com.comviva.webaxn.ui.n1 n1Var = elementAt.d.a0;
        if (n1Var == null || !(n1Var instanceof com.comviva.webaxn.ui.i)) {
            return;
        }
        ((com.comviva.webaxn.ui.i) n1Var).a(elementAt);
    }

    public static boolean b(double d2) {
        return d2 % 1.0d == 0.0d;
    }

    public static boolean b(yj yjVar) {
        int i2;
        do {
            yjVar = yjVar.A0;
            if (yjVar == null) {
                return false;
            }
            i2 = yjVar.i0;
            if (i2 == 2) {
                break;
            }
        } while (i2 != 3);
        return true;
    }

    public static int c(Context context, String str) {
        if (str.indexOf(".") != -1) {
            str = str.substring(0, str.indexOf("."));
        }
        return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
    }

    public static void c(lj ljVar, Context context, String str, String str2) {
        HashMap<String, Vector<kj>> hashMap;
        boolean z2;
        boolean z3;
        int parseInt;
        boolean z4;
        int parseInt2;
        if (ljVar == null || (hashMap = ljVar.g) == null || !hashMap.containsKey(str)) {
            return;
        }
        Vector<kj> vector = ljVar.g.get(str);
        String[] split = !TextUtils.isEmpty(str2) ? str2.split(";") : null;
        int i2 = 0;
        while (i2 < vector.size()) {
            yj yjVar = vector.elementAt(i2).d;
            com.comviva.webaxn.ui.n1 n1Var = yjVar.a0;
            if (n1Var != null) {
                if (n1Var instanceof com.comviva.webaxn.ui.h) {
                    com.comviva.webaxn.ui.h hVar = (com.comviva.webaxn.ui.h) n1Var;
                    hVar.r();
                    ArrayList<CheckBox> m2 = hVar.m();
                    if (str2 == null) {
                        int[] iArr = yjVar.U;
                        if (iArr != null) {
                            for (int i3 : iArr) {
                                if (i3 < m2.size()) {
                                    m2.get(i3).setChecked(true);
                                }
                            }
                        }
                    } else if (split != null) {
                        for (int i4 = 0; i4 < split.length; i4++) {
                            if (split[i4] != null) {
                                if (!TextUtils.isDigitsOnly(split[i4]) || (parseInt2 = Integer.parseInt(split[i4])) >= vector.size() || !vector.elementAt(parseInt2).d.equals(yjVar) || parseInt2 < i2) {
                                    z4 = false;
                                } else {
                                    split[i4] = String.valueOf(parseInt2 - i2);
                                    z4 = true;
                                }
                                if (true == z4 ? hVar.a(split[i4], "0") : false) {
                                    split[i4] = null;
                                }
                            }
                        }
                    }
                } else if (n1Var instanceof com.comviva.webaxn.ui.i) {
                    com.comviva.webaxn.ui.i iVar = (com.comviva.webaxn.ui.i) n1Var;
                    iVar.s();
                    if (str2 != null) {
                        if (split != null) {
                            for (int i5 = 0; i5 < split.length; i5++) {
                                if (split[i5] != null) {
                                    if (!TextUtils.isDigitsOnly(split[i5]) || (parseInt = Integer.parseInt(split[i5])) >= vector.size() || !vector.elementAt(parseInt).d.equals(yjVar) || parseInt < i2) {
                                        z2 = false;
                                    } else {
                                        split[i5] = String.valueOf(parseInt - i2);
                                        z2 = true;
                                    }
                                    if (true == z2) {
                                        iVar.E[i5] = 1;
                                        z3 = iVar.a(split[i5], "0");
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        split[i5] = null;
                                    }
                                }
                            }
                        }
                    } else if (yjVar.U != null) {
                        if (iVar.q()) {
                            ArrayList<androidx.appcompat.widget.n0> o2 = iVar.o();
                            for (int i6 : yjVar.U) {
                                if (i6 < o2.size()) {
                                    iVar.E[i6] = 1;
                                    o2.get(i6).setChecked(true);
                                }
                            }
                        } else {
                            ArrayList<CheckBox> m3 = iVar.m();
                            for (int i7 : yjVar.U) {
                                if (i7 < m3.size()) {
                                    m3.get(i7).setChecked(true);
                                }
                            }
                        }
                    }
                }
            }
            i2 = i2 + (yjVar.P.size() - 1) + 1;
        }
    }

    public static boolean c() {
        return b;
    }

    public static boolean c(int i2) {
        return Color.alpha(i2) != 0 && Color.red(i2) == 255 && Color.green(i2) == 255 && Color.blue(i2) == 255;
    }

    public static byte[] c(String str) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(java.lang.String r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.x1.d(java.lang.String):int");
    }

    public static void d(Context context, String str) {
        Resources resources;
        int i2;
        WebAxnActivity webAxnActivity = (WebAxnActivity) context;
        if (webAxnActivity.b().a(str, false)) {
            return;
        }
        String c2 = j1.a(webAxnActivity).c(str);
        AlertDialog alertDialog = p;
        if (alertDialog != null && alertDialog.isShowing()) {
            p.dismiss();
        }
        if (webAxnActivity.isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
        builder.setIcon(R.drawable.ic_dialog_alert);
        String c3 = j1.a(webAxnActivity).c("ttl.Alert");
        if (TextUtils.isEmpty(c3)) {
            c3 = context.getResources().getString(com.mtni.myirancell.R.string.dialog_title);
        }
        builder.setTitle(c3);
        if (TextUtils.isEmpty(c2)) {
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
            c2 = resources.getString(i2);
        }
        builder.setMessage(c2);
        builder.setCancelable(true);
        String c4 = j1.a(webAxnActivity).c("msg.setting");
        if (TextUtils.isEmpty(c4)) {
            c4 = context.getResources().getString(com.mtni.myirancell.R.string.settings);
        }
        String c5 = j1.a(webAxnActivity).c("cmd.NN");
        if (TextUtils.isEmpty(c5)) {
            c5 = context.getResources().getString(com.mtni.myirancell.R.string.not_now);
        }
        builder.setPositiveButton(c4, new i(webAxnActivity));
        builder.setNegativeButton(c5, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        p = create;
        create.setCanceledOnTouchOutside(false);
        p.show();
    }

    public static void d(lj ljVar, Context context, String str, String str2) {
        f(ljVar, context, str, str2);
        c(ljVar, context, str, str2);
        e(ljVar, context, str, str2);
    }

    public static boolean d() {
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

    public static Spanned e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : Html.fromHtml(str);
    }

    public static void e(Context context, String str) {
        Resources resources;
        int i2;
        WebAxnActivity webAxnActivity = (WebAxnActivity) context;
        if (!webAxnActivity.b().a(str, false)) {
            String c2 = j1.a(webAxnActivity).c(str);
            AlertDialog alertDialog = p;
            if (alertDialog != null && alertDialog.isShowing()) {
                p.dismiss();
            }
            if (!webAxnActivity.isFinishing()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
                builder.setIcon(R.drawable.ic_dialog_alert);
                String c3 = j1.a(webAxnActivity).c("ttl.Alert");
                if (TextUtils.isEmpty(c3)) {
                    c3 = context.getResources().getString(com.mtni.myirancell.R.string.dialog_title);
                }
                builder.setTitle(c3);
                if (TextUtils.isEmpty(c2)) {
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
                    c2 = resources.getString(i2);
                }
                builder.setMessage(c2);
                builder.setCancelable(true);
                String c4 = j1.a(webAxnActivity).c("cmd.Ok");
                if (TextUtils.isEmpty(c4)) {
                    c4 = context.getResources().getString(com.mtni.myirancell.R.string.dialog_button_ok);
                }
                builder.setPositiveButton(c4, (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                p = create;
                create.setCanceledOnTouchOutside(false);
                p.show();
            }
        }
        l = true;
    }

    public static void e(lj ljVar, Context context, String str, String str2) {
        HashMap<String, Vector<kj>> hashMap;
        yj a2;
        com.comviva.webaxn.ui.n1 n1Var;
        if (ljVar == null || (hashMap = ljVar.j) == null || !hashMap.containsKey(str) || (n1Var = (a2 = ljVar.f().a(str, (Vector<yj>) null)).a0) == null) {
            return;
        }
        if (n1Var instanceof com.comviva.webaxn.ui.k) {
            com.comviva.webaxn.ui.k kVar = (com.comviva.webaxn.ui.k) n1Var;
            if (str2 != null) {
                if (str2.length() == 0) {
                    str2 = "0";
                }
                kVar.c(str2);
                return;
            } else {
                int[] iArr = a2.U;
                if (iArr == null || iArr.length <= 0) {
                    return;
                }
                kVar.i(iArr[0]);
                return;
            }
        }
        if (n1Var instanceof com.comviva.webaxn.ui.l) {
            com.comviva.webaxn.ui.l lVar = (com.comviva.webaxn.ui.l) n1Var;
            if (str2 != null) {
                if (str2.length() == 0) {
                    str2 = "0";
                }
                lVar.c(str2);
            } else {
                int[] iArr2 = a2.U;
                if (iArr2 == null || iArr2.length <= 0) {
                    return;
                }
                lVar.i(iArr2[0]);
            }
        }
    }

    public static boolean e() {
        return E;
    }

    public static HashMap<String, String> f(String str) {
        String str2;
        String str3;
        t = new HashMap<>();
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
                t.put("action", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                String[] split = str2.split("&");
                for (String str5 : split) {
                    if (str5 != null && str5.indexOf("=") != -1) {
                        str4 = str5.substring(0, str5.indexOf("=")).trim();
                        str3 = str5.substring(str5.indexOf("=") + 1, str5.length());
                    }
                    if (str4 != null && str3 != null) {
                        t.put(str4, str3);
                    }
                }
            }
        }
        return t;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(defpackage.lj r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.x1.f(lj, android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static String g(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    public static int h(String str) {
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

    public static String i(String str) {
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

    public static boolean j(String str) {
        return new File(str).exists();
    }
}
