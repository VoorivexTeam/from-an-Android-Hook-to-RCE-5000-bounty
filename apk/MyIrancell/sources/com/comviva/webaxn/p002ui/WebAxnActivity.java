package com.comviva.webaxn.p002ui;

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
import androidx.core.app.C0223a;
import com.airbnb.lottie.LottieAnimationView;
import com.comviva.webaxn.transport.C0579a;
import com.comviva.webaxn.utils.C0685a0;
import com.comviva.webaxn.utils.C0686a1;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0688b0;
import com.comviva.webaxn.utils.C0689b1;
import com.comviva.webaxn.utils.C0691c0;
import com.comviva.webaxn.utils.C0697e0;
import com.comviva.webaxn.utils.C0699f;
import com.comviva.webaxn.utils.C0700f0;
import com.comviva.webaxn.utils.C0702g;
import com.comviva.webaxn.utils.C0703g0;
import com.comviva.webaxn.utils.C0706h0;
import com.comviva.webaxn.utils.C0712j0;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0714k;
import com.comviva.webaxn.utils.C0715k0;
import com.comviva.webaxn.utils.C0721m0;
import com.comviva.webaxn.utils.C0722m1;
import com.comviva.webaxn.utils.C0724n0;
import com.comviva.webaxn.utils.C0727o0;
import com.comviva.webaxn.utils.C0728o1;
import com.comviva.webaxn.utils.C0730p0;
import com.comviva.webaxn.utils.C0731p1;
import com.comviva.webaxn.utils.C0732q;
import com.comviva.webaxn.utils.C0736r0;
import com.comviva.webaxn.utils.C0737r1;
import com.comviva.webaxn.utils.C0739s0;
import com.comviva.webaxn.utils.C0741t;
import com.comviva.webaxn.utils.C0742t0;
import com.comviva.webaxn.utils.C0743t1;
import com.comviva.webaxn.utils.C0745u0;
import com.comviva.webaxn.utils.C0746u1;
import com.comviva.webaxn.utils.C0748v0;
import com.comviva.webaxn.utils.C0749v1;
import com.comviva.webaxn.utils.C0754x0;
import com.comviva.webaxn.utils.C0755x1;
import com.comviva.webaxn.utils.C0757y0;
import com.comviva.webaxn.utils.C0759z;
import com.comviva.webaxn.utils.C0760z0;
import com.google.android.gms.common.C0993c;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;
import p000.C0023aj;
import p000.C2392dk;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;
import p000.C3530zi;

/* loaded from: classes.dex */
public class WebAxnActivity extends Activity implements C0223a.b {

    /* renamed from: q */
    public static AssetManager f3409q;

    /* renamed from: r */
    public static ProgressBar f3410r;

    /* renamed from: s */
    public static ProgressBar f3411s;

    /* renamed from: t */
    public static ImageView f3412t;

    /* renamed from: u */
    public static ImageView f3413u;

    /* renamed from: v */
    public static LottieAnimationView f3414v;

    /* renamed from: w */
    public static int f3415w;

    /* renamed from: b */
    private C0579a f3416b;

    /* renamed from: c */
    private C3400wj f3417c;

    /* renamed from: d */
    private C0687b f3418d;

    /* renamed from: f */
    private C0614b f3420f;

    /* renamed from: g */
    private Menu f3421g;

    /* renamed from: i */
    private String f3423i;

    /* renamed from: k */
    private C0746u1 f3425k;

    /* renamed from: l */
    private C0749v1 f3426l;

    /* renamed from: m */
    private C0755x1.o f3427m;

    /* renamed from: n */
    private C0737r1 f3428n;

    /* renamed from: o */
    private Uri f3429o;

    /* renamed from: e */
    private ArrayList<C3400wj> f3419e = new ArrayList<>();

    /* renamed from: h */
    private Vector<Handler> f3422h = new Vector<>();

    /* renamed from: j */
    private boolean f3424j = false;

    /* renamed from: p */
    private final C0755x1.n f3430p = new C0600d();

    /* renamed from: com.comviva.webaxn.ui.WebAxnActivity$a */
    /* loaded from: classes.dex */
    class ViewOnAttachStateChangeListenerC0597a implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0597a(WebAxnActivity webAxnActivity) {
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
    /* renamed from: com.comviva.webaxn.ui.WebAxnActivity$b */
    /* loaded from: classes.dex */
    public class RunnableC0598b implements Runnable {

        /* renamed from: com.comviva.webaxn.ui.WebAxnActivity$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                WebAxnActivity.this.m4074l();
            }
        }

        RunnableC0598b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Window window = WebAxnActivity.this.getWindow();
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            int i = rect.top;
            TypedValue typedValue = new TypedValue();
            int complexToDimensionPixelSize = (Build.VERSION.SDK_INT < 11 || !WebAxnActivity.this.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) ? 0 : TypedValue.complexToDimensionPixelSize(typedValue.data, WebAxnActivity.this.getResources().getDisplayMetrics());
            C0687b.m5342a(WebAxnActivity.this).m5343a().m5548b(i);
            C0687b.m5342a(WebAxnActivity.this).m5343a().m5545a(complexToDimensionPixelSize);
            if (Build.VERSION.SDK_INT >= 21) {
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(C3530zi.f14481x);
                if (C0755x1.m6178c(C3530zi.f14481x) && Build.VERSION.SDK_INT >= 23) {
                    window.getDecorView().setSystemUiVisibility(8192);
                }
            }
            WebAxnActivity.this.m4075m();
            WebAxnActivity.this.m4070h();
            if (!C3530zi.f14482y) {
                WebAxnActivity.this.m4074l();
                return;
            }
            long m5695l0 = C0713j1.m5563a(WebAxnActivity.this).m5695l0();
            if (m5695l0 == -1) {
                C0713j1.m5563a(WebAxnActivity.this).m5636b(C3530zi.f14483z);
            }
            new Handler().postDelayed(new a(), m5695l0);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.WebAxnActivity$c */
    /* loaded from: classes.dex */
    class DialogInterfaceOnClickListenerC0599c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ CharSequence[] f3433b;

        /* renamed from: c */
        final /* synthetic */ int f3434c;

        /* renamed from: d */
        final /* synthetic */ String f3435d;

        DialogInterfaceOnClickListenerC0599c(CharSequence[] charSequenceArr, int i, String str) {
            this.f3433b = charSequenceArr;
            this.f3434c = i;
            this.f3435d = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String charSequence = this.f3433b[i].toString();
            WebAxnActivity.this.m4061a(this.f3434c, charSequence.substring(charSequence.indexOf("\n"), charSequence.length()), this.f3435d);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.WebAxnActivity$d */
    /* loaded from: classes.dex */
    class C0600d implements C0755x1.n {
        C0600d() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.n
        /* renamed from: a */
        public void mo4083a(C0755x1.o oVar) {
            WebAxnActivity.this.f3427m = oVar;
        }
    }

    /* renamed from: a */
    private Bitmap m4059a(Uri uri) {
        String str;
        Bitmap bitmap = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            InputStream openInputStream = getContentResolver().openInputStream(uri);
            BitmapFactory.decodeStream(openInputStream, new Rect(), options);
            openInputStream.close();
            int m5552d = this.f3418d.m5343a().m5552d() / 2;
            int i = 1;
            while ((options.outWidth / i) / 2 >= m5552d && (options.outHeight / i) / 2 >= m5552d) {
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
    /* renamed from: a */
    public void m4061a(int i, String str, String str2) {
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
                this.f3417c.m16280a(str, str2);
                return;
            } else {
                if (i != 2002 || C0699f.m5439a(this).m5443a().size() <= 0) {
                    return;
                }
                C0699f.m5439a(this).m5444a(str, str2);
                return;
            }
        }
        if (findViewById.getTag() instanceof C0670w) {
            ((C0670w) findViewById.getTag()).m5093h(str);
            if (str != null) {
                return;
            }
            ((C0670w) findViewById.getTag()).m5088e("Please enter the number");
            return;
        }
        if (findViewById.getTag() instanceof C0668v) {
            ((C0668v) findViewById.getTag()).m5029f(str);
            if (str != null) {
                return;
            }
            ((C0668v) findViewById.getTag()).m5027d("Please enter the number");
        }
    }

    /* renamed from: a */
    private void m4064a(C3489yj c3489yj, Bitmap bitmap, boolean z, boolean z2) {
        if (bitmap != null) {
            if (c3489yj.f14208e == 28) {
                c3489yj.f14262w0 = C0755x1.m6160a(bitmap, c3489yj.f14262w0, C3530zi.f14476s, C3530zi.f14477t);
            } else if (c3489yj.f14197a0 != null) {
                if (z) {
                    c3489yj.f14264x0 = bitmap;
                } else {
                    c3489yj.f14266y0 = bitmap;
                }
                C0731p1.f5074c = true;
                AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
                if ((abstractC0652n1 instanceof C0629g) || (abstractC0652n1 instanceof C0626f) ? c3489yj.f14197a0.mo4289e() != null : !((!(abstractC0652n1 instanceof C0624e0) && !(abstractC0652n1 instanceof C0627f0)) || c3489yj.f14197a0.mo4289e() == null)) {
                    c3489yj.f14197a0.mo4289e().setImageBitmap(bitmap);
                }
            }
        }
        String str = null;
        if (z) {
            C0691c0 m5383a = C0691c0.m5383a(this);
            if (m5383a.m5395g() == null || TextUtils.isEmpty(m5383a.m5395g().get("action")) || this.f3417c.m16298a(m5383a.m5395g().get("action"), false, m5383a.m5396h(), m5383a.m5394f(), m5383a.m5393e(), m5383a.m5392d())) {
                return;
            }
            C3440xj m6134a = C0755x1.m6134a(m5383a.m5395g().get("action"), m5383a.m5393e().m14145i());
            if (m6134a != null) {
                m5383a.m5393e().m14121a(m6134a);
            }
            if (m5383a.m5396h() != null) {
                str = m5383a.m5396h().f14223j;
            } else if (m5383a.m5394f() != null) {
                str = m5383a.m5394f().f4718j;
            }
            if (this.f3417c.m16263a(m5383a.m5395g().get("action"), false, false, null, false, false, str, m5383a.m5392d()) <= 0 || z2) {
                return;
            }
        } else {
            C0706h0 m5482a = C0706h0.m5482a(this);
            if (m5482a.m5493f() == null || TextUtils.isEmpty(m5482a.m5493f().get("action")) || this.f3417c.m16298a(m5482a.m5493f().get("action"), false, m5482a.m5494g(), m5482a.m5492e(), m5482a.m5491d(), m5482a.m5490c())) {
                return;
            }
            C3440xj m6134a2 = C0755x1.m6134a(m5482a.m5493f().get("action"), m5482a.m5491d().m14145i());
            if (m6134a2 != null) {
                m5482a.m5491d().m14121a(m6134a2);
            }
            if (m5482a.m5494g() != null) {
                str = m5482a.m5494g().f14223j;
            } else if (m5482a.m5492e() != null) {
                str = m5482a.m5492e().f4718j;
            }
            if (this.f3417c.m16263a(m5482a.m5493f().get("action"), false, false, null, false, false, str, m5482a.m5490c()) <= 0 || z2) {
                return;
            }
        }
        this.f3417c.m16258E();
    }

    /* renamed from: b */
    private Bitmap m4065b(String str) {
        String str2;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int m5552d = this.f3418d.m5343a().m5552d() / 2;
            int i = 1;
            while ((options.outWidth / i) / 2 >= m5552d && (options.outHeight / i) / 2 >= m5552d) {
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

    /* renamed from: c */
    private int m4067c(String str) {
        return this.f3419e.get(0).m16262a(str, false, false);
    }

    /* renamed from: g */
    private boolean m4069g() {
        C0993c m6949a = C0993c.m6949a();
        int mo6964c = m6949a.mo6964c(this);
        if (mo6964c != 3 && mo6964c != 2) {
            return true;
        }
        if (!m6949a.mo6965c(mo6964c)) {
            return false;
        }
        m6949a.m6954a((Activity) this, mo6964c, 1506).show();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m4070h() {
        String[] strArr = C3530zi.f14478u;
        if (strArr != null) {
            if (strArr.length != 2) {
                String str = strArr[0];
                if (!str.equals("android.permission.READ_PHONE_STATE") || C0722m1.m5887a(this, new String[]{str})) {
                    if (!str.equals("android.permission.ACCESS_FINE_LOCATION") || C0722m1.m5887a(this, new String[]{str})) {
                        return;
                    }
                    if (C0713j1.m5563a(this).m5647d(str) != -1) {
                        if (C0722m1.m5886a(this, str)) {
                            C0722m1.m5885a(this, new String[]{str}, 4);
                        }
                        C0755x1.m6181d(this, "msg.rpLoc");
                        return;
                    }
                    C0722m1.m5885a(this, new String[]{str}, 4);
                } else {
                    if (C0713j1.m5563a(this).m5647d(str) != -1) {
                        if (C0722m1.m5886a(this, str)) {
                            C0722m1.m5885a(this, new String[]{str}, 6);
                        }
                        C0755x1.m6181d(this, "msg.rpPhone");
                        return;
                    }
                    C0722m1.m5885a(this, new String[]{str}, 6);
                }
                C0755x1.f5264v = true;
            }
            if (C0722m1.m5887a(this, strArr)) {
                return;
            }
            if (C0713j1.m5563a(this).m5647d(C3530zi.f14478u[0]) == -1) {
                C0722m1.m5885a(this, C3530zi.f14478u, 6);
            } else {
                boolean m5886a = C0722m1.m5886a(this, C3530zi.f14478u[0]);
                boolean m5886a2 = C0722m1.m5886a(this, C3530zi.f14478u[1]);
                if (!m5886a || !m5886a2) {
                    if (!C0722m1.m5887a(this, new String[]{C3530zi.f14478u[0]})) {
                        if (m5886a) {
                            C0722m1.m5885a(this, new String[]{C3530zi.f14478u[0]}, 6);
                        }
                        C0755x1.m6181d(this, "msg.rpPhone");
                        return;
                    } else {
                        if (C0722m1.m5887a(this, new String[]{C3530zi.f14478u[1]})) {
                            return;
                        }
                        if (m5886a2) {
                            C0722m1.m5885a(this, new String[]{C3530zi.f14478u[1]}, 4);
                        }
                        C0755x1.m6181d(this, "msg.rpLoc");
                        return;
                    }
                }
                C0722m1.m5885a(this, C3530zi.f14478u, 6);
            }
            C0755x1.f5264v = true;
        }
    }

    /* renamed from: i */
    private void m4071i() {
        this.f3424j = true;
        Intent intent = new Intent(this, (Class<?>) CropActivity.class);
        C0755x1.f5259q = this.f3417c;
        intent.putExtra("fromCamera", true);
        startActivityForResult(intent, 100);
    }

    /* renamed from: j */
    private void m4072j() {
        m4080d();
        C0579a c0579a = new C0579a(this);
        this.f3416b = c0579a;
        this.f3417c.m16271a(c0579a);
        ArrayList<C3400wj> arrayList = this.f3419e;
        if (arrayList != null) {
            arrayList.add(this.f3417c);
        }
        this.f3420f.post(new RunnableC0598b());
    }

    /* renamed from: k */
    private void m4073k() {
        if (3 == C0714k.m5781r(this) || !getPackageName().equalsIgnoreCase("com.comviva.airtelht")) {
            if (m4079c()) {
                return;
            }
            if (TextUtils.isEmpty(this.f3423i)) {
                this.f3423i = "StartAppln_Req";
            }
            m4067c(this.f3423i);
            return;
        }
        String networkOperatorName = ((TelephonyManager) getSystemService("phone")).getNetworkOperatorName();
        if (networkOperatorName == null || !networkOperatorName.toLowerCase(Locale.getDefault()).contains("airtel")) {
            C0755x1.m6147a((Context) this, getString(com.mtni.myirancell.R.string.error_airtelht), getString(com.mtni.myirancell.R.string.dialog_button_ok), false);
        } else {
            m4067c(this.f3423i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m4074l() {
        try {
            if (m4069g() && C3530zi.f14480w == 1) {
                C0741t.m6035a(this).m6039a(FirebaseAnalytics.getInstance(this));
            }
            m4073k();
        } catch (Exception unused) {
            m4073k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x033f A[ADDED_TO_REGION] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4075m() {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.WebAxnActivity.m4075m():void");
    }

    /* renamed from: a */
    public Menu m4076a() {
        return this.f3421g;
    }

    /* renamed from: a */
    public void m4077a(String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            try {
                int parseColor = Color.parseColor(str);
                window.setStatusBarColor(parseColor);
                if (!C0755x1.m6178c(parseColor) || Build.VERSION.SDK_INT < 23) {
                    return;
                }
                window.getDecorView().setSystemUiVisibility(8192);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: b */
    public C3400wj m4078b() {
        return this.f3417c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x031b, code lost:
    
        if (r6.m16263a(r15.f3423i, false, false, null, false, false, null, r6.m16343t().f4136d) > 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (r6.m16263a(r15.f3423i, false, false, null, false, false, null, r6.m16343t().f4136d) > 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0139, code lost:
    
        r15.f3417c.m16258E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0137, code lost:
    
        if (r6.m16263a(r15.f3423i, false, false, null, false, false, null, r6.m16343t().f4136d) > 0) goto L50;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m4079c() {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.WebAxnActivity.m4079c():boolean");
    }

    /* renamed from: d */
    public void m4080d() {
        C0713j1.m5563a(this).m5724s("false");
        C0713j1.m5563a(this).m5720r("false");
    }

    /* renamed from: e */
    public void m4081e() {
        if (C3530zi.f14454A != 0) {
            C0737r1 c0737r1 = new C0737r1();
            this.f3428n = c0737r1;
            c0737r1.m6011a(C3530zi.f14454A);
            this.f3428n.m6013a("App Usage Transaction", C3530zi.f14455B);
        }
    }

    /* renamed from: f */
    public void m4082f() {
        C0737r1 c0737r1 = this.f3428n;
        if (c0737r1 != null) {
            c0737r1.m6022i();
            this.f3428n = null;
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
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.WebAxnActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3420f.setPageOrientation(configuration.orientation);
        this.f3418d.m5344b();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m4081e();
        C0713j1.m5563a(getApplicationContext()).m5746y(0);
        C0023aj.m160a(this).m170a("cached");
        C0023aj.m160a(this).m198g();
        C0713j1.m5563a(this).m5718r();
        this.f3426l = new C0749v1();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DOWNLOAD_COMPLETE");
        registerReceiver(this.f3426l, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.PHONE_STATE");
        C0746u1 c0746u1 = new C0746u1();
        this.f3425k = c0746u1;
        registerReceiver(c0746u1, intentFilter2);
        C0755x1.f5265w = this;
        this.f3423i = null;
        f3409q = getAssets();
        if (Build.VERSION.SDK_INT < 14 || ViewConfiguration.get(this).hasPermanentMenuKey()) {
            requestWindowFeature(1);
        }
        C0614b c0614b = new C0614b(this);
        this.f3420f = c0614b;
        if (Build.VERSION.SDK_INT > 11) {
            c0614b.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0597a(this));
        }
        this.f3420f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setContentView(this.f3420f);
        new C0714k(this);
        this.f3417c = new C3400wj(this, getLayoutInflater(), this.f3420f, this.f3430p);
        C0687b m5342a = C0687b.m5342a(this);
        this.f3418d = m5342a;
        if (m5342a.m5343a().m5556h()) {
            setRequestedOrientation(0);
        }
        this.f3417c.m16274a(this.f3418d);
        if (this.f3417c.m16349z()) {
            m4072j();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        m4082f();
        unregisterReceiver(this.f3425k);
        unregisterReceiver(this.f3426l);
        int i = 0;
        C0755x1.f5267y = false;
        if (this.f3417c.m16343t() != null && this.f3417c.m16343t().m4820n() != null) {
            this.f3417c.m16343t().m4820n().m5934a();
            this.f3417c.m16343t().m4780a((C0728o1) null);
        }
        try {
            C0023aj.m160a(this).close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (true) {
            Vector<Handler> vector = this.f3422h;
            if (vector == null || i >= vector.size()) {
                try {
                    this.f3417c.m16268a();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.f3423i = null;
                C0755x1.f5247e = true;
                this.f3417c.m16259F();
                C0731p1.m5947a();
                C0755x1.m6139a((Context) this);
                C0755x1.f5242F = null;
                AlertDialog alertDialog = C0755x1.f5258p;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                    C0755x1.f5258p = null;
                }
                AlertDialog alertDialog2 = C0755x1.f5249g;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                    C0755x1.f5249g = null;
                }
                C0714k.m5787x(this);
                C0732q.m5973a(this).m5977a();
                C0691c0.m5383a(this).m5387a();
                C0706h0.m5482a(this).m5486a();
                C0748v0.m6082a(this).m6083a();
                C0685a0.m5322a(this).m5330a();
                C0697e0.m5413a(this).m5415a();
                C0742t0.m6045a(this).m6046a();
                C0702g.m5457a(this).m5461b();
                C0653o.m4711a(this).m4716a();
                C0715k0.m5791a(this).m5796b();
                C0712j0.m5559a(this).m5560a();
                C0745u0.m6075a(this).m6077a();
                C0743t1.m6048a(this).m6050a();
                C0724n0.m5893a(this).m5904a();
                C0739s0.m6024a(this).m6025a();
                C0736r0.m6004a(this).m6005a();
                C0759z.m6223a(this).m6224a();
                C0721m0.m5880a(this).m5881a();
                C0757y0.m6204a(this).m6216a();
                C0688b0.m5346a(this).m5350a();
                C0754x0.m6103a(this).m6106a();
                C0727o0.m5926a(this).m5928a();
                C0730p0.m5939a(this).m5941a();
                C2392dk.m11444a(this).m11449a();
                C0640j1.m4520a(this).m4522a();
                C0760z0.m6227a(this).m6229a();
                C0689b1.m5363a(this).m5368a();
                C0686a1.m5334a(this).m5338a();
                C0755x1.f5265w = null;
                if (C0714k.m5783t(this)) {
                    C0703g0.m5463a(this).m5465a();
                }
                if (C0700f0.m5446a(this).m5450b()) {
                    C0700f0.m5446a(this).m5447a();
                }
                super.onDestroy();
                return;
            }
            this.f3422h.elementAt(i);
            i++;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C3400wj c3400wj;
        if (i != 4 || (c3400wj = this.f3417c) == null || c3400wj.m16343t() == null || !this.f3417c.m16343t().m4826t()) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        if (TextUtils.isEmpty(intent.getAction()) || intent.getAction().equals("android.intent.action.MAIN") || m4079c()) {
            return;
        }
        m4067c(this.f3423i);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C3400wj c3400wj = this.f3417c;
        if (c3400wj == null || c3400wj.m16343t() == null) {
            return true;
        }
        this.f3417c.m16343t().m4776a(menuItem);
        return true;
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (this.f3417c.m16343t() != null) {
            if (this.f3417c.m16343t().m4820n() != null) {
                this.f3417c.m16343t().m4820n().m5936b();
            }
            if (this.f3417c.m16343t().m4814h() != null) {
                if (this.f3417c.m16343t().m4814h() instanceof C0611a) {
                    ((C0611a) this.f3417c.m16343t().m4814h()).m4153m();
                } else if (this.f3417c.m16343t().m4814h() instanceof SurfaceHolderCallbackC0634h1) {
                    ((SurfaceHolderCallbackC0634h1) this.f3417c.m16343t().m4814h()).m4452m();
                }
            }
        }
        super.onPause();
        if (this.f3417c.m16343t() != null && this.f3417c.m16343t().m4815i() != null && this.f3417c.m16343t().m4815i().m16929a("sessiontimeout") != null) {
            C0713j1.m5563a(this).m5626a(System.currentTimeMillis());
        }
        C0755x1.f5267y = true;
        if (!C0755x1.f5266x && this.f3417c.m16343t() != null) {
            C3400wj c3400wj = this.f3417c;
            c3400wj.m16317c(c3400wj.m16334k(), this.f3417c.m16343t().f4136d);
        }
        C0714k.m5788y(this);
        C0714k.m5786w(this);
        if (C0714k.m5767g() != null) {
            C0714k.m5767g().m5921e();
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        this.f3421g = menu;
        C3400wj c3400wj = this.f3417c;
        if (c3400wj == null || c3400wj.m16343t() == null) {
            return true;
        }
        this.f3417c.m16343t().m4794a(this.f3421g);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d8, code lost:
    
        r10.f3427m = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d1, code lost:
    
        r11.mo4309a(true);
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
    
        r11.mo4309a(false);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    @Override // android.app.Activity, androidx.core.app.C0223a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRequestPermissionsResult(int r11, java.lang.String[] r12, int[] r13) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.WebAxnActivity.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f3429o = (Uri) bundle.getParcelable("file_uri");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a2, code lost:
    
        if (r11.f3424j == false) goto L71;
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
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.WebAxnActivity.onResume():void");
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("file_uri", this.f3429o);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
    }
}
