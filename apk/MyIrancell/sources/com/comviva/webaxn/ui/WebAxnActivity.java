package com.comviva.webaxn.ui;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.core.app.a;
import com.airbnb.lottie.LottieAnimationView;
import com.comviva.webaxn.utils.p1;
import com.comviva.webaxn.utils.r1;
import com.comviva.webaxn.utils.t1;
import com.comviva.webaxn.utils.u1;
import com.comviva.webaxn.utils.v1;
import com.comviva.webaxn.utils.x1;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.aj;
import defpackage.dk;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import defpackage.zi;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;

/* loaded from: classes.dex */
public class WebAxnActivity extends Activity implements a.b {
    public static AssetManager q;
    public static ProgressBar r;
    public static ProgressBar s;
    public static ImageView t;
    public static ImageView u;
    public static LottieAnimationView v;
    public static int w;
    private com.comviva.webaxn.transport.a b;
    private wj c;
    private com.comviva.webaxn.utils.b d;
    private com.comviva.webaxn.ui.b f;
    private Menu g;
    private String i;
    private u1 k;
    private v1 l;
    private x1.o m;
    private r1 n;
    private Uri o;
    private ArrayList<wj> e = new ArrayList<>();
    private Vector<Handler> h = new Vector<>();
    private boolean j = false;
    private final x1.n p = new d();

    /* loaded from: classes.dex */
    class a implements View.OnAttachStateChangeListener {
        a(WebAxnActivity webAxnActivity) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.clearAnimation();
            view.clearFocus();
            view.setBackgroundDrawable(null);
            ((ViewGroup) view).removeAllViews();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                WebAxnActivity.this.l();
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Window window = WebAxnActivity.this.getWindow();
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            int i = rect.top;
            TypedValue typedValue = new TypedValue();
            int complexToDimensionPixelSize = (Build.VERSION.SDK_INT < 11 || !WebAxnActivity.this.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) ? 0 : TypedValue.complexToDimensionPixelSize(typedValue.data, WebAxnActivity.this.getResources().getDisplayMetrics());
            com.comviva.webaxn.utils.b.a(WebAxnActivity.this).a().b(i);
            com.comviva.webaxn.utils.b.a(WebAxnActivity.this).a().a(complexToDimensionPixelSize);
            if (Build.VERSION.SDK_INT >= 21) {
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(zi.x);
                if (x1.c(zi.x) && Build.VERSION.SDK_INT >= 23) {
                    window.getDecorView().setSystemUiVisibility(8192);
                }
            }
            WebAxnActivity.this.m();
            WebAxnActivity.this.h();
            if (!zi.y) {
                WebAxnActivity.this.l();
                return;
            }
            long l0 = com.comviva.webaxn.utils.j1.a(WebAxnActivity.this).l0();
            if (l0 == -1) {
                com.comviva.webaxn.utils.j1.a(WebAxnActivity.this).b(zi.z);
            }
            new Handler().postDelayed(new a(), l0);
        }
    }

    /* loaded from: classes.dex */
    class c implements DialogInterface.OnClickListener {
        final /* synthetic */ CharSequence[] b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;

        c(CharSequence[] charSequenceArr, int i, String str) {
            this.b = charSequenceArr;
            this.c = i;
            this.d = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String charSequence = this.b[i].toString();
            WebAxnActivity.this.a(this.c, charSequence.substring(charSequence.indexOf("\n"), charSequence.length()), this.d);
        }
    }

    /* loaded from: classes.dex */
    class d implements x1.n {
        d() {
        }

        @Override // com.comviva.webaxn.utils.x1.n
        public void a(x1.o oVar) {
            WebAxnActivity.this.m = oVar;
        }
    }

    private Bitmap a(Uri uri) {
        String str;
        Bitmap bitmap = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            InputStream openInputStream = getContentResolver().openInputStream(uri);
            BitmapFactory.decodeStream(openInputStream, new Rect(), options);
            openInputStream.close();
            int d2 = this.d.a().d() / 2;
            int i = 1;
            while ((options.outWidth / i) / 2 >= d2 && (options.outHeight / i) / 2 >= d2) {
                i *= 2;
            }
            options.inSampleSize = i;
            options.inScaled = false;
            options.inJustDecodeBounds = false;
            InputStream openInputStream2 = getContentResolver().openInputStream(uri);
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream2, new Rect(), options);
            openInputStream2.close();
            try {
                openInputStream2 = getContentResolver().openInputStream(uri);
                str = new ExifInterface(openInputStream2).getAttribute("Orientation");
                try {
                    openInputStream2.close();
                } catch (IOException unused) {
                }
            } catch (IOException unused2) {
                str = null;
            }
            int parseInt = str != null ? Integer.parseInt(str) : 1;
            int i2 = parseInt == 6 ? 90 : 0;
            if (parseInt == 3) {
                i2 = 180;
            }
            if (parseInt == 8) {
                i2 = 270;
            }
            if (decodeStream != null) {
                Matrix matrix = new Matrix();
                matrix.setRotate(i2, decodeStream.getWidth() / 2.0f, decodeStream.getHeight() / 2.0f);
                bitmap = Bitmap.createBitmap(decodeStream, 0, 0, options.outWidth, options.outHeight, matrix, true);
            }
            openInputStream2.close();
        } catch (Exception unused3) {
            Toast.makeText(this, getResources().getString(com.mtni.myirancell.R.string.image_fetch_failure), 0).show();
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, String str2) {
        if (str != null) {
            String replaceAll = str.replaceAll("[^0-9\\+]", "");
            if (replaceAll.startsWith("+")) {
                str = "+" + replaceAll.replaceAll("[\\+]", "");
            } else {
                str = replaceAll.replaceAll("[\\+]", "");
            }
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            if (i == 2001) {
                this.c.a(str, str2);
                return;
            } else {
                if (i != 2002 || com.comviva.webaxn.utils.f.a(this).a().size() <= 0) {
                    return;
                }
                com.comviva.webaxn.utils.f.a(this).a(str, str2);
                return;
            }
        }
        if (findViewById.getTag() instanceof w) {
            ((w) findViewById.getTag()).h(str);
            if (str != null) {
                return;
            }
            ((w) findViewById.getTag()).e("Please enter the number");
            return;
        }
        if (findViewById.getTag() instanceof v) {
            ((v) findViewById.getTag()).f(str);
            if (str != null) {
                return;
            }
            ((v) findViewById.getTag()).d("Please enter the number");
        }
    }

    private void a(yj yjVar, Bitmap bitmap, boolean z, boolean z2) {
        if (bitmap != null) {
            if (yjVar.e == 28) {
                yjVar.w0 = x1.a(bitmap, yjVar.w0, zi.s, zi.t);
            } else if (yjVar.a0 != null) {
                if (z) {
                    yjVar.x0 = bitmap;
                } else {
                    yjVar.y0 = bitmap;
                }
                p1.c = true;
                n1 n1Var = yjVar.a0;
                if ((n1Var instanceof g) || (n1Var instanceof f) ? yjVar.a0.e() != null : !((!(n1Var instanceof e0) && !(n1Var instanceof f0)) || yjVar.a0.e() == null)) {
                    yjVar.a0.e().setImageBitmap(bitmap);
                }
            }
        }
        String str = null;
        if (z) {
            com.comviva.webaxn.utils.c0 a2 = com.comviva.webaxn.utils.c0.a(this);
            if (a2.g() == null || TextUtils.isEmpty(a2.g().get("action")) || this.c.a(a2.g().get("action"), false, a2.h(), a2.f(), a2.e(), a2.d())) {
                return;
            }
            xj a3 = x1.a(a2.g().get("action"), a2.e().i());
            if (a3 != null) {
                a2.e().a(a3);
            }
            if (a2.h() != null) {
                str = a2.h().j;
            } else if (a2.f() != null) {
                str = a2.f().j;
            }
            if (this.c.a(a2.g().get("action"), false, false, null, false, false, str, a2.d()) <= 0 || z2) {
                return;
            }
        } else {
            com.comviva.webaxn.utils.h0 a4 = com.comviva.webaxn.utils.h0.a(this);
            if (a4.f() == null || TextUtils.isEmpty(a4.f().get("action")) || this.c.a(a4.f().get("action"), false, a4.g(), a4.e(), a4.d(), a4.c())) {
                return;
            }
            xj a5 = x1.a(a4.f().get("action"), a4.d().i());
            if (a5 != null) {
                a4.d().a(a5);
            }
            if (a4.g() != null) {
                str = a4.g().j;
            } else if (a4.e() != null) {
                str = a4.e().j;
            }
            if (this.c.a(a4.f().get("action"), false, false, null, false, false, str, a4.c()) <= 0 || z2) {
                return;
            }
        }
        this.c.E();
    }

    private Bitmap b(String str) {
        String str2;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int d2 = this.d.a().d() / 2;
            int i = 1;
            while ((options.outWidth / i) / 2 >= d2 && (options.outHeight / i) / 2 >= d2) {
                i *= 2;
            }
            options.inSampleSize = i;
            options.inScaled = false;
            options.inJustDecodeBounds = false;
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            try {
                str2 = new ExifInterface(str).getAttribute("Orientation");
            } catch (IOException unused) {
                str2 = null;
            }
            int parseInt = str2 != null ? Integer.parseInt(str2) : 1;
            int i2 = parseInt == 6 ? 90 : 0;
            if (parseInt == 3) {
                i2 = 180;
            }
            if (parseInt == 8) {
                i2 = 270;
            }
            if (decodeFile == null) {
                return null;
            }
            Matrix matrix = new Matrix();
            matrix.setRotate(i2, decodeFile.getWidth() / 2.0f, decodeFile.getHeight() / 2.0f);
            return Bitmap.createBitmap(decodeFile, 0, 0, options.outWidth, options.outHeight, matrix, true);
        } catch (Exception unused2) {
            Toast.makeText(this, getResources().getString(com.mtni.myirancell.R.string.image_fetch_failure), 0).show();
            return null;
        }
    }

    private int c(String str) {
        return this.e.get(0).a(str, false, false);
    }

    private boolean g() {
        com.google.android.gms.common.c a2 = com.google.android.gms.common.c.a();
        int c2 = a2.c(this);
        if (c2 != 3 && c2 != 2) {
            return true;
        }
        if (!a2.c(c2)) {
            return false;
        }
        a2.a((Activity) this, c2, 1506).show();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        String[] strArr = zi.u;
        if (strArr != null) {
            if (strArr.length != 2) {
                String str = strArr[0];
                if (!str.equals("android.permission.READ_PHONE_STATE") || com.comviva.webaxn.utils.m1.a(this, new String[]{str})) {
                    if (!str.equals("android.permission.ACCESS_FINE_LOCATION") || com.comviva.webaxn.utils.m1.a(this, new String[]{str})) {
                        return;
                    }
                    if (com.comviva.webaxn.utils.j1.a(this).d(str) != -1) {
                        if (com.comviva.webaxn.utils.m1.a(this, str)) {
                            com.comviva.webaxn.utils.m1.a(this, new String[]{str}, 4);
                        }
                        x1.d(this, "msg.rpLoc");
                        return;
                    }
                    com.comviva.webaxn.utils.m1.a(this, new String[]{str}, 4);
                } else {
                    if (com.comviva.webaxn.utils.j1.a(this).d(str) != -1) {
                        if (com.comviva.webaxn.utils.m1.a(this, str)) {
                            com.comviva.webaxn.utils.m1.a(this, new String[]{str}, 6);
                        }
                        x1.d(this, "msg.rpPhone");
                        return;
                    }
                    com.comviva.webaxn.utils.m1.a(this, new String[]{str}, 6);
                }
                x1.v = true;
            }
            if (com.comviva.webaxn.utils.m1.a(this, strArr)) {
                return;
            }
            if (com.comviva.webaxn.utils.j1.a(this).d(zi.u[0]) == -1) {
                com.comviva.webaxn.utils.m1.a(this, zi.u, 6);
            } else {
                boolean a2 = com.comviva.webaxn.utils.m1.a(this, zi.u[0]);
                boolean a3 = com.comviva.webaxn.utils.m1.a(this, zi.u[1]);
                if (!a2 || !a3) {
                    if (!com.comviva.webaxn.utils.m1.a(this, new String[]{zi.u[0]})) {
                        if (a2) {
                            com.comviva.webaxn.utils.m1.a(this, new String[]{zi.u[0]}, 6);
                        }
                        x1.d(this, "msg.rpPhone");
                        return;
                    } else {
                        if (com.comviva.webaxn.utils.m1.a(this, new String[]{zi.u[1]})) {
                            return;
                        }
                        if (a3) {
                            com.comviva.webaxn.utils.m1.a(this, new String[]{zi.u[1]}, 4);
                        }
                        x1.d(this, "msg.rpLoc");
                        return;
                    }
                }
                com.comviva.webaxn.utils.m1.a(this, zi.u, 6);
            }
            x1.v = true;
        }
    }

    private void i() {
        this.j = true;
        Intent intent = new Intent(this, (Class<?>) CropActivity.class);
        x1.q = this.c;
        intent.putExtra("fromCamera", true);
        startActivityForResult(intent, 100);
    }

    private void j() {
        d();
        com.comviva.webaxn.transport.a aVar = new com.comviva.webaxn.transport.a(this);
        this.b = aVar;
        this.c.a(aVar);
        ArrayList<wj> arrayList = this.e;
        if (arrayList != null) {
            arrayList.add(this.c);
        }
        this.f.post(new b());
    }

    private void k() {
        if (3 == com.comviva.webaxn.utils.k.r(this) || !getPackageName().equalsIgnoreCase("com.comviva.airtelht")) {
            if (c()) {
                return;
            }
            if (TextUtils.isEmpty(this.i)) {
                this.i = "StartAppln_Req";
            }
            c(this.i);
            return;
        }
        String networkOperatorName = ((TelephonyManager) getSystemService("phone")).getNetworkOperatorName();
        if (networkOperatorName == null || !networkOperatorName.toLowerCase(Locale.getDefault()).contains("airtel")) {
            x1.a((Context) this, getString(com.mtni.myirancell.R.string.error_airtelht), getString(com.mtni.myirancell.R.string.dialog_button_ok), false);
        } else {
            c(this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            if (g() && zi.w == 1) {
                com.comviva.webaxn.utils.t.a(this).a(FirebaseAnalytics.getInstance(this));
            }
            k();
        } catch (Exception unused) {
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x033f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m() {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.WebAxnActivity.m():void");
    }

    public Menu a() {
        return this.g;
    }

    public void a(String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            try {
                int parseColor = Color.parseColor(str);
                window.setStatusBarColor(parseColor);
                if (!x1.c(parseColor) || Build.VERSION.SDK_INT < 23) {
                    return;
                }
                window.getDecorView().setSystemUiVisibility(8192);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public wj b() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x031b, code lost:
    
        if (r6.a(r15.i, false, false, null, false, false, null, r6.t().d) > 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (r6.a(r15.i, false, false, null, false, false, null, r6.t().d) > 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0139, code lost:
    
        r15.c.E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0137, code lost:
    
        if (r6.a(r15.i, false, false, null, false, false, null, r6.t().d) > 0) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c() {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.WebAxnActivity.c():boolean");
    }

    public void d() {
        com.comviva.webaxn.utils.j1.a(this).s("false");
        com.comviva.webaxn.utils.j1.a(this).r("false");
    }

    public void e() {
        if (zi.A != 0) {
            r1 r1Var = new r1();
            this.n = r1Var;
            r1Var.a(zi.A);
            this.n.a("App Usage Transaction", zi.B);
        }
    }

    public void f() {
        r1 r1Var = this.n;
        if (r1Var != null) {
            r1Var.i();
            this.n = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onActivityResult(int r23, int r24, android.content.Intent r25) {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.WebAxnActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f.setPageOrientation(configuration.orientation);
        this.d.b();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e();
        com.comviva.webaxn.utils.j1.a(getApplicationContext()).y(0);
        aj.a(this).a("cached");
        aj.a(this).g();
        com.comviva.webaxn.utils.j1.a(this).r();
        this.l = new v1();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DOWNLOAD_COMPLETE");
        registerReceiver(this.l, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.PHONE_STATE");
        u1 u1Var = new u1();
        this.k = u1Var;
        registerReceiver(u1Var, intentFilter2);
        x1.w = this;
        this.i = null;
        q = getAssets();
        if (Build.VERSION.SDK_INT < 14 || ViewConfiguration.get(this).hasPermanentMenuKey()) {
            requestWindowFeature(1);
        }
        com.comviva.webaxn.ui.b bVar = new com.comviva.webaxn.ui.b(this);
        this.f = bVar;
        if (Build.VERSION.SDK_INT > 11) {
            bVar.addOnAttachStateChangeListener(new a(this));
        }
        this.f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setContentView(this.f);
        new com.comviva.webaxn.utils.k(this);
        this.c = new wj(this, getLayoutInflater(), this.f, this.p);
        com.comviva.webaxn.utils.b a2 = com.comviva.webaxn.utils.b.a(this);
        this.d = a2;
        if (a2.a().h()) {
            setRequestedOrientation(0);
        }
        this.c.a(this.d);
        if (this.c.z()) {
            j();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        f();
        unregisterReceiver(this.k);
        unregisterReceiver(this.l);
        int i = 0;
        x1.y = false;
        if (this.c.t() != null && this.c.t().n() != null) {
            this.c.t().n().a();
            this.c.t().a((com.comviva.webaxn.utils.o1) null);
        }
        try {
            aj.a(this).close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (true) {
            Vector<Handler> vector = this.h;
            if (vector == null || i >= vector.size()) {
                try {
                    this.c.a();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.i = null;
                x1.e = true;
                this.c.F();
                p1.a();
                x1.a((Context) this);
                x1.F = null;
                AlertDialog alertDialog = x1.p;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                    x1.p = null;
                }
                AlertDialog alertDialog2 = x1.g;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                    x1.g = null;
                }
                com.comviva.webaxn.utils.k.x(this);
                com.comviva.webaxn.utils.q.a(this).a();
                com.comviva.webaxn.utils.c0.a(this).a();
                com.comviva.webaxn.utils.h0.a(this).a();
                com.comviva.webaxn.utils.v0.a(this).a();
                com.comviva.webaxn.utils.a0.a(this).a();
                com.comviva.webaxn.utils.e0.a(this).a();
                com.comviva.webaxn.utils.t0.a(this).a();
                com.comviva.webaxn.utils.g.a(this).b();
                o.a(this).a();
                com.comviva.webaxn.utils.k0.a(this).b();
                com.comviva.webaxn.utils.j0.a(this).a();
                com.comviva.webaxn.utils.u0.a(this).a();
                t1.a(this).a();
                com.comviva.webaxn.utils.n0.a(this).a();
                com.comviva.webaxn.utils.s0.a(this).a();
                com.comviva.webaxn.utils.r0.a(this).a();
                com.comviva.webaxn.utils.z.a(this).a();
                com.comviva.webaxn.utils.m0.a(this).a();
                com.comviva.webaxn.utils.y0.a(this).a();
                com.comviva.webaxn.utils.b0.a(this).a();
                com.comviva.webaxn.utils.x0.a(this).a();
                com.comviva.webaxn.utils.o0.a(this).a();
                com.comviva.webaxn.utils.p0.a(this).a();
                dk.a(this).a();
                j1.a(this).a();
                com.comviva.webaxn.utils.z0.a(this).a();
                com.comviva.webaxn.utils.b1.a(this).a();
                com.comviva.webaxn.utils.a1.a(this).a();
                x1.w = null;
                if (com.comviva.webaxn.utils.k.t(this)) {
                    com.comviva.webaxn.utils.g0.a(this).a();
                }
                if (com.comviva.webaxn.utils.f0.a(this).b()) {
                    com.comviva.webaxn.utils.f0.a(this).a();
                }
                super.onDestroy();
                return;
            }
            this.h.elementAt(i);
            i++;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        wj wjVar;
        if (i != 4 || (wjVar = this.c) == null || wjVar.t() == null || !this.c.t().t()) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        if (TextUtils.isEmpty(intent.getAction()) || intent.getAction().equals("android.intent.action.MAIN") || c()) {
            return;
        }
        c(this.i);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        wj wjVar = this.c;
        if (wjVar == null || wjVar.t() == null) {
            return true;
        }
        this.c.t().a(menuItem);
        return true;
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (this.c.t() != null) {
            if (this.c.t().n() != null) {
                this.c.t().n().b();
            }
            if (this.c.t().h() != null) {
                if (this.c.t().h() instanceof com.comviva.webaxn.ui.a) {
                    ((com.comviva.webaxn.ui.a) this.c.t().h()).m();
                } else if (this.c.t().h() instanceof h1) {
                    ((h1) this.c.t().h()).m();
                }
            }
        }
        super.onPause();
        if (this.c.t() != null && this.c.t().i() != null && this.c.t().i().a("sessiontimeout") != null) {
            com.comviva.webaxn.utils.j1.a(this).a(System.currentTimeMillis());
        }
        x1.y = true;
        if (!x1.x && this.c.t() != null) {
            wj wjVar = this.c;
            wjVar.c(wjVar.k(), this.c.t().d);
        }
        com.comviva.webaxn.utils.k.y(this);
        com.comviva.webaxn.utils.k.w(this);
        if (com.comviva.webaxn.utils.k.g() != null) {
            com.comviva.webaxn.utils.k.g().e();
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        this.g = menu;
        wj wjVar = this.c;
        if (wjVar == null || wjVar.t() == null) {
            return true;
        }
        this.c.t().a(this.g);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d8, code lost:
    
        r10.m = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d1, code lost:
    
        r11.a(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r13[0] == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        if (r13[r11] == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008b, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
    
        if (r13[r11] == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00aa, code lost:
    
        if (r3 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bc, code lost:
    
        if (r13[0] == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cf, code lost:
    
        if (r13[0] == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f6, code lost:
    
        if (r13[r11] == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f8, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fa, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010f, code lost:
    
        if (r13[r11] == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0125, code lost:
    
        if (r13[r11] == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r13[0] == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x012f, code lost:
    
        if (r3 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00d5, code lost:
    
        r11.a(false);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    @Override // android.app.Activity, androidx.core.app.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRequestPermissionsResult(int r11, java.lang.String[] r12, int[] r13) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.WebAxnActivity.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.o = (Uri) bundle.getParcelable("file_uri");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a2, code lost:
    
        if (r11.j == false) goto L71;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onResume() {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.WebAxnActivity.onResume():void");
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("file_uri", this.o);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
    }
}
