package com.comviva.webaxn.p002ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0691c0;
import com.comviva.webaxn.utils.C0706h0;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0747v;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import java.io.IOException;
import p000.C2434ej;
import p000.C3400wj;

/* loaded from: classes.dex */
public class CropActivity extends Activity {

    /* renamed from: b */
    private TouchImageView f3311b;

    /* renamed from: c */
    private ImageView f3312c;

    /* renamed from: d */
    private LinearLayout f3313d;

    /* renamed from: e */
    private LinearLayout f3314e;

    /* renamed from: f */
    private TextView f3315f;

    /* renamed from: g */
    private TextView f3316g;

    /* renamed from: h */
    private int f3317h;

    /* renamed from: i */
    private int f3318i;

    /* renamed from: j */
    private ProgressDialog f3319j;

    /* renamed from: k */
    private Button f3320k;

    /* renamed from: l */
    private Button f3321l;

    /* renamed from: n */
    private int f3323n;

    /* renamed from: o */
    private int f3324o;

    /* renamed from: q */
    private boolean f3326q;

    /* renamed from: r */
    private DisplayMetrics f3327r;

    /* renamed from: s */
    private int f3328s;

    /* renamed from: t */
    private static final String f3304t = CropActivity.class.getCanonicalName();

    /* renamed from: u */
    private static final int f3305u = Color.argb(241, 0, 0, 0);

    /* renamed from: v */
    private static final int f3306v = Color.rgb(255, 204, 0);

    /* renamed from: w */
    private static final int f3307w = Color.rgb(255, 190, 0);

    /* renamed from: x */
    private static final int f3308x = Color.rgb(13, 14, 12);

    /* renamed from: y */
    private static final int f3309y = Color.rgb(255, 190, 0);

    /* renamed from: z */
    private static final int f3310z = Color.rgb(255, 190, 0);

    /* renamed from: A */
    private static final int f3301A = Color.rgb(255, 190, 0);

    /* renamed from: B */
    private static final int f3302B = Color.rgb(255, 190, 0);

    /* renamed from: C */
    private static final int[] f3303C = {2, 127, 163};

    /* renamed from: m */
    private boolean f3322m = false;

    /* renamed from: p */
    private boolean f3325p = false;

    /* renamed from: com.comviva.webaxn.ui.CropActivity$a */
    /* loaded from: classes.dex */
    class ViewOnClickListenerC0580a implements View.OnClickListener {
        ViewOnClickListenerC0580a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CropActivity.this.f3311b.buildDrawingCache(true);
            CropActivity.this.f3311b.setDrawingCacheEnabled(true);
            CropActivity.this.f3312c.buildDrawingCache(true);
            CropActivity.this.f3312c.setDrawingCacheEnabled(true);
            CropActivity.this.m4012a();
            new AsyncTaskC0582c().execute("crop");
        }
    }

    /* renamed from: com.comviva.webaxn.ui.CropActivity$b */
    /* loaded from: classes.dex */
    class ViewOnClickListenerC0581b implements View.OnClickListener {
        ViewOnClickListenerC0581b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CropActivity.this.f3326q = true;
            CropActivity.this.finish();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.CropActivity$c */
    /* loaded from: classes.dex */
    class AsyncTaskC0582c extends AsyncTask<String, Void, Bitmap> {
        AsyncTaskC0582c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(String... strArr) {
            String str = strArr[0];
            Bitmap bitmap = null;
            try {
                bitmap = C0621d0.m4208a(Bitmap.createBitmap(CropActivity.this.f3311b.getDrawingCache(true)), CropActivity.this.f3312c.getDrawingCache(true), CropActivity.this.f3323n, CropActivity.this.f3324o, CropActivity.f3303C[0], CropActivity.f3303C[1], CropActivity.f3303C[2]);
                CropActivity.this.f3311b.setDrawingCacheEnabled(false);
                CropActivity.this.f3312c.setDrawingCacheEnabled(false);
                return bitmap;
            } catch (Exception unused) {
                return bitmap;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            CropActivity cropActivity;
            int i;
            if (bitmap != null) {
                if (CropActivity.this.f3325p) {
                    C0691c0.m5383a(CropActivity.this).m5388a(bitmap);
                } else {
                    C0706h0.m5482a(CropActivity.this).m5487a(bitmap);
                }
                cropActivity = CropActivity.this;
                i = -1;
            } else {
                cropActivity = CropActivity.this;
                i = 0;
            }
            cropActivity.setResult(i);
            CropActivity.this.f3326q = true;
            CropActivity.this.m4013b();
            CropActivity.this.finish();
        }
    }

    /* renamed from: a */
    private Bitmap m4004a(String str) {
        ExifInterface exifInterface;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i = this.f3317h / 2;
            int i2 = 1;
            while ((options.outWidth / i2) / 2 >= i && (options.outHeight / i2) / 2 >= i) {
                i2 *= 2;
            }
            options.inSampleSize = i2;
            options.inScaled = false;
            options.inJustDecodeBounds = false;
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            try {
                exifInterface = new ExifInterface(str);
            } catch (IOException unused) {
                exifInterface = null;
            }
            String attribute = exifInterface.getAttribute("Orientation");
            int parseInt = attribute != null ? Integer.parseInt(attribute) : 1;
            int i3 = parseInt == 6 ? 90 : 0;
            if (parseInt == 3) {
                i3 = 180;
            }
            if (parseInt == 8) {
                i3 = 270;
            }
            Matrix matrix = new Matrix();
            matrix.setRotate(i3, decodeFile.getWidth() / 2.0f, decodeFile.getHeight() / 2.0f);
            return Bitmap.createBitmap(decodeFile, 0, 0, options.outWidth, options.outHeight, matrix, true);
        } catch (Exception unused2) {
            Toast.makeText(this, "Error", 0).show();
            return null;
        }
    }

    /* renamed from: a */
    public void m4012a() {
        ProgressDialog progressDialog = this.f3319j;
        if (progressDialog == null || !progressDialog.isShowing()) {
            String m5639b0 = C0713j1.m5563a(this).m5639b0();
            int m5631a0 = C0713j1.m5563a(this).m5631a0();
            if (-1 >= m5631a0) {
                m5631a0 = 0;
            }
            String m5641c = C0713j1.m5563a(this).m5641c("lbl.Crop");
            if (TextUtils.isEmpty(m5641c)) {
                m5641c = getString(R.string.cropping);
            }
            ProgressDialog show = ProgressDialog.show(this, "", m5641c, true);
            this.f3319j = show;
            try {
                TextView textView = (TextView) show.findViewById(android.R.id.message);
                if (!TextUtils.isEmpty(m5639b0)) {
                    textView.setTypeface(C0747v.m6081a(m5639b0), AbstractC0652n1.m4702e(m5631a0));
                }
            } catch (Exception unused) {
            }
            this.f3319j.setCancelable(false);
            this.f3319j.setCanceledOnTouchOutside(false);
        }
    }

    /* renamed from: b */
    public void m4013b() {
        ProgressDialog progressDialog = this.f3319j;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f3319j = null;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_crop);
        C0755x1.j.f5281a = f3304t;
        C0755x1.j.f5283c = this;
        C0755x1.f5266x = true;
        this.f3327r = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(this.f3327r);
        DisplayMetrics displayMetrics = this.f3327r;
        this.f3318i = displayMetrics.heightPixels;
        this.f3317h = displayMetrics.widthPixels;
        float f = displayMetrics.density;
        ((FrameLayout) findViewById(R.id.cropframe)).setBackgroundColor(f3305u);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.crop_layout);
        this.f3313d = (LinearLayout) relativeLayout.findViewById(R.id.header);
        this.f3314e = (LinearLayout) relativeLayout.findViewById(R.id.footer);
        this.f3315f = (TextView) relativeLayout.findViewById(R.id.header_text);
        this.f3316g = (TextView) relativeLayout.findViewById(R.id.footer_text);
        this.f3315f.setTextSize(16.0f);
        this.f3316g.setTextSize(16.0f);
        this.f3315f.setTextColor(-1);
        this.f3315f.setTypeface(C0747v.m6081a("Poppins-Bold.ttf"));
        this.f3316g.setTextColor(-1);
        this.f3316g.setTypeface(C0747v.m6081a("Poppins-Bold.ttf"));
        int i = this.f3318i;
        double d = i;
        Double.isNaN(d);
        int i2 = (int) (d * 0.1d);
        double d2 = i;
        Double.isNaN(d2);
        int i3 = (int) (d2 * 0.08d);
        if (this.f3313d.getLayoutParams() != null) {
            this.f3313d.getLayoutParams().width = -1;
            this.f3313d.getLayoutParams().height = i2;
        }
        if (this.f3314e.getLayoutParams() != null) {
            this.f3314e.getLayoutParams().width = -1;
            this.f3314e.getLayoutParams().height = i3;
        }
        this.f3313d.setBackgroundColor(f3307w);
        this.f3314e.setBackgroundColor(f3308x);
        C2434ej c2434ej = new C2434ej(f);
        c2434ej.m11618b("3px");
        c2434ej.m11622d("3px");
        c2434ej.m11620c("3px");
        c2434ej.m11616a("3px");
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(R.id.button_layout);
        LinearLayout linearLayout2 = (LinearLayout) relativeLayout.findViewById(R.id.cancel_layout);
        LinearLayout linearLayout3 = (LinearLayout) relativeLayout.findViewById(R.id.yes_layout);
        linearLayout2.setBackgroundDrawable(C0755x1.m6122a(c2434ej, f3302B));
        linearLayout3.setBackgroundDrawable(C0755x1.m6122a(c2434ej, f3310z));
        Button button = (Button) relativeLayout.findViewById(R.id.crop);
        this.f3321l = button;
        button.setBackgroundDrawable(C0755x1.m6122a(c2434ej, f3309y));
        this.f3321l.setTextSize(14.0f);
        this.f3321l.setTextColor(-1);
        this.f3321l.setTypeface(C0747v.m6081a("Poppins-Bold.ttf"));
        this.f3321l.setOnClickListener(new ViewOnClickListenerC0580a());
        Button button2 = (Button) relativeLayout.findViewById(R.id.crop_cancel);
        this.f3320k = button2;
        button2.setBackgroundDrawable(C0755x1.m6122a(c2434ej, f3301A));
        this.f3320k.setTextSize(14.0f);
        this.f3320k.setTextColor(-1);
        this.f3320k.setTypeface(C0747v.m6081a("Poppins-Bold.ttf"));
        this.f3320k.setOnClickListener(new ViewOnClickListenerC0581b());
        if (C0687b.m5342a(this).m5343a().m5556h()) {
            this.f3315f.setTextSize(26.0f);
            this.f3316g.setTextSize(26.0f);
            this.f3321l.setTextSize(22.0f);
            this.f3320k.setTextSize(22.0f);
            this.f3321l.setHeight(75);
            this.f3320k.setHeight(75);
        }
        String m5641c = C0713j1.m5563a(this).m5641c("lbl.Cropheader");
        if (TextUtils.isEmpty(m5641c)) {
            m5641c = getString(R.string.crop_header);
        }
        String m5641c2 = C0713j1.m5563a(this).m5641c("lbl.Cropfooter");
        if (TextUtils.isEmpty(m5641c2)) {
            m5641c2 = getString(R.string.crop_footer);
        }
        String m5641c3 = C0713j1.m5563a(this).m5641c("lbl.CropByes");
        if (TextUtils.isEmpty(m5641c3)) {
            m5641c3 = getString(R.string.crop_yes);
        }
        String m5641c4 = C0713j1.m5563a(this).m5641c("lbl.CropBcan");
        if (TextUtils.isEmpty(m5641c4)) {
            m5641c4 = getString(R.string.crop_cancel);
        }
        this.f3315f.setText(m5641c);
        this.f3316g.setText(m5641c2);
        this.f3321l.setText(m5641c3);
        this.f3320k.setText(m5641c4);
        this.f3311b = (TouchImageView) findViewById(R.id.cp_img);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec);
        linearLayout.getMeasuredHeight();
        int i4 = this.f3317h;
        this.f3328s = i4;
        if (f < 1.0f) {
            double d3 = i4;
            Double.isNaN(d3);
            this.f3328s = (int) (d3 * 0.87d);
        }
        Bitmap m4004a = getIntent().getStringExtra("imagepath") != null ? m4004a(getIntent().getStringExtra("imagepath")) : null;
        if (getIntent() != null) {
            boolean booleanExtra = getIntent().getBooleanExtra("fromCamera", false);
            this.f3325p = booleanExtra;
            if (booleanExtra) {
                m4004a = C0691c0.m5383a(this).m5390b();
            }
        }
        if (m4004a != null) {
            this.f3311b.setImageBitmap(m4004a);
            this.f3311b.setMaxZoom(4.0f);
        }
        int i5 = this.f3328s;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i5);
        layoutParams.gravity = 17;
        this.f3311b.setLayoutParams(layoutParams);
        this.f3312c = (ImageView) relativeLayout.findViewById(R.id.cp_face_template);
        int i6 = this.f3328s;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i6, i6);
        layoutParams2.addRule(13);
        this.f3312c.setLayoutParams(layoutParams2);
        int i7 = this.f3328s;
        this.f3323n = i7;
        this.f3324o = i7;
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(f3306v);
            if (!C0755x1.m6178c(f3306v) || Build.VERSION.SDK_INT < 23) {
                return;
            }
            getWindow().getDecorView().setSystemUiVisibility(8192);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        m4013b();
        C0755x1.f5266x = false;
        C0755x1.j.f5282b = false;
        C0755x1.j.f5283c = null;
        C0755x1.j.f5281a = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            finish();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        Bundle extras;
        String str;
        if (intent.getAction() != null) {
            if ((intent.getAction().equals("com.notify.action") || intent.getAction().equals("com.notify.lskaction") || intent.getAction().equals("com.notify.rskaction")) && intent.getExtras() != null) {
                if (intent.getExtras().getInt("id", -1) != -1) {
                    C0755x1.m6140a((Context) this, intent.getExtras().getInt("id"), true);
                }
                if (intent.getAction().equals("com.notify.lskaction")) {
                    extras = intent.getExtras();
                    str = "push_lskaction";
                } else {
                    boolean equals = intent.getAction().equals("com.notify.rskaction");
                    extras = intent.getExtras();
                    str = equals ? "push_rskaction" : "push_action";
                }
                String string = extras.getString(str);
                if (C0755x1.f5259q == null || TextUtils.isEmpty(string)) {
                    return;
                }
                C3400wj c3400wj = C0755x1.f5259q;
                if (!c3400wj.m16298a(string, false, null, null, c3400wj.m16334k(), null)) {
                    C3400wj c3400wj2 = C0755x1.f5259q;
                    if (c3400wj2.m16263a(string, false, false, null, false, false, null, c3400wj2.m16343t().m4811e()) > 0) {
                        C0755x1.f5259q.m16258E();
                    }
                }
                C0755x1.f5259q = null;
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f3322m = true;
        C0755x1.j.f5282b = true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        C0755x1.j.f5282b = false;
        if (getPackageName().equals("com.comviva.cpw") || getPackageName().equals("com.comviva.cpwdev") || getPackageName().equals("com.comviva.cpwuat") || getPackageName().equals("com.comviva.cpwselfcare") || getPackageName().equals("com.cpw") || getPackageName().equals("com.comviva.cpwcit") || getPackageName().equals("com.comviva.cpwcit1") || getPackageName().equals("com.cpwdev2") || getPackageName().equals("com.agcpwdev") || getPackageName().equals("com.cloudcpw")) {
            if (C0755x1.f5263u || (C0713j1.m5563a(this).m5733u0() && this.f3322m)) {
                this.f3322m = false;
                C0755x1.f5263u = false;
                C0713j1.m5563a(this).m5638b(false);
            } else if (C0755x1.f5264v && this.f3322m) {
                this.f3322m = false;
                C0755x1.f5264v = false;
                C0755x1.f5266x = false;
                C0755x1.j.f5282b = false;
                C0755x1.j.f5281a = null;
                C0755x1.j.f5283c = null;
                C0755x1.m6140a((Context) this, 0, true);
                finish();
            }
        }
    }
}
