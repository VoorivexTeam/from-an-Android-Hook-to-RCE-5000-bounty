package com.comviva.webaxn.ui;

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
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.ej;
import defpackage.wj;
import java.io.IOException;

/* loaded from: classes.dex */
public class CropActivity extends Activity {
    private TouchImageView b;
    private ImageView c;
    private LinearLayout d;
    private LinearLayout e;
    private TextView f;
    private TextView g;
    private int h;
    private int i;
    private ProgressDialog j;
    private Button k;
    private Button l;
    private int n;
    private int o;
    private boolean q;
    private DisplayMetrics r;
    private int s;
    private static final String t = CropActivity.class.getCanonicalName();
    private static final int u = Color.argb(241, 0, 0, 0);
    private static final int v = Color.rgb(255, 204, 0);
    private static final int w = Color.rgb(255, 190, 0);
    private static final int x = Color.rgb(13, 14, 12);
    private static final int y = Color.rgb(255, 190, 0);
    private static final int z = Color.rgb(255, 190, 0);
    private static final int A = Color.rgb(255, 190, 0);
    private static final int B = Color.rgb(255, 190, 0);
    private static final int[] C = {2, 127, 163};
    private boolean m = false;
    private boolean p = false;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CropActivity.this.b.buildDrawingCache(true);
            CropActivity.this.b.setDrawingCacheEnabled(true);
            CropActivity.this.c.buildDrawingCache(true);
            CropActivity.this.c.setDrawingCacheEnabled(true);
            CropActivity.this.a();
            new c().execute("crop");
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CropActivity.this.q = true;
            CropActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    class c extends AsyncTask<String, Void, Bitmap> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(String... strArr) {
            String str = strArr[0];
            Bitmap bitmap = null;
            try {
                bitmap = d0.a(Bitmap.createBitmap(CropActivity.this.b.getDrawingCache(true)), CropActivity.this.c.getDrawingCache(true), CropActivity.this.n, CropActivity.this.o, CropActivity.C[0], CropActivity.C[1], CropActivity.C[2]);
                CropActivity.this.b.setDrawingCacheEnabled(false);
                CropActivity.this.c.setDrawingCacheEnabled(false);
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
                if (CropActivity.this.p) {
                    com.comviva.webaxn.utils.c0.a(CropActivity.this).a(bitmap);
                } else {
                    com.comviva.webaxn.utils.h0.a(CropActivity.this).a(bitmap);
                }
                cropActivity = CropActivity.this;
                i = -1;
            } else {
                cropActivity = CropActivity.this;
                i = 0;
            }
            cropActivity.setResult(i);
            CropActivity.this.q = true;
            CropActivity.this.b();
            CropActivity.this.finish();
        }
    }

    private Bitmap a(String str) {
        ExifInterface exifInterface;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i = this.h / 2;
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

    public void a() {
        ProgressDialog progressDialog = this.j;
        if (progressDialog == null || !progressDialog.isShowing()) {
            String b0 = com.comviva.webaxn.utils.j1.a(this).b0();
            int a0 = com.comviva.webaxn.utils.j1.a(this).a0();
            if (-1 >= a0) {
                a0 = 0;
            }
            String c2 = com.comviva.webaxn.utils.j1.a(this).c("lbl.Crop");
            if (TextUtils.isEmpty(c2)) {
                c2 = getString(R.string.cropping);
            }
            ProgressDialog show = ProgressDialog.show(this, "", c2, true);
            this.j = show;
            try {
                TextView textView = (TextView) show.findViewById(android.R.id.message);
                if (!TextUtils.isEmpty(b0)) {
                    textView.setTypeface(com.comviva.webaxn.utils.v.a(b0), n1.e(a0));
                }
            } catch (Exception unused) {
            }
            this.j.setCancelable(false);
            this.j.setCanceledOnTouchOutside(false);
        }
    }

    public void b() {
        ProgressDialog progressDialog = this.j;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.j = null;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_crop);
        x1.j.a = t;
        x1.j.c = this;
        x1.x = true;
        this.r = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(this.r);
        DisplayMetrics displayMetrics = this.r;
        this.i = displayMetrics.heightPixels;
        this.h = displayMetrics.widthPixels;
        float f = displayMetrics.density;
        ((FrameLayout) findViewById(R.id.cropframe)).setBackgroundColor(u);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.crop_layout);
        this.d = (LinearLayout) relativeLayout.findViewById(R.id.header);
        this.e = (LinearLayout) relativeLayout.findViewById(R.id.footer);
        this.f = (TextView) relativeLayout.findViewById(R.id.header_text);
        this.g = (TextView) relativeLayout.findViewById(R.id.footer_text);
        this.f.setTextSize(16.0f);
        this.g.setTextSize(16.0f);
        this.f.setTextColor(-1);
        this.f.setTypeface(com.comviva.webaxn.utils.v.a("Poppins-Bold.ttf"));
        this.g.setTextColor(-1);
        this.g.setTypeface(com.comviva.webaxn.utils.v.a("Poppins-Bold.ttf"));
        int i = this.i;
        double d = i;
        Double.isNaN(d);
        int i2 = (int) (d * 0.1d);
        double d2 = i;
        Double.isNaN(d2);
        int i3 = (int) (d2 * 0.08d);
        if (this.d.getLayoutParams() != null) {
            this.d.getLayoutParams().width = -1;
            this.d.getLayoutParams().height = i2;
        }
        if (this.e.getLayoutParams() != null) {
            this.e.getLayoutParams().width = -1;
            this.e.getLayoutParams().height = i3;
        }
        this.d.setBackgroundColor(w);
        this.e.setBackgroundColor(x);
        ej ejVar = new ej(f);
        ejVar.b("3px");
        ejVar.d("3px");
        ejVar.c("3px");
        ejVar.a("3px");
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(R.id.button_layout);
        LinearLayout linearLayout2 = (LinearLayout) relativeLayout.findViewById(R.id.cancel_layout);
        LinearLayout linearLayout3 = (LinearLayout) relativeLayout.findViewById(R.id.yes_layout);
        linearLayout2.setBackgroundDrawable(x1.a(ejVar, B));
        linearLayout3.setBackgroundDrawable(x1.a(ejVar, z));
        Button button = (Button) relativeLayout.findViewById(R.id.crop);
        this.l = button;
        button.setBackgroundDrawable(x1.a(ejVar, y));
        this.l.setTextSize(14.0f);
        this.l.setTextColor(-1);
        this.l.setTypeface(com.comviva.webaxn.utils.v.a("Poppins-Bold.ttf"));
        this.l.setOnClickListener(new a());
        Button button2 = (Button) relativeLayout.findViewById(R.id.crop_cancel);
        this.k = button2;
        button2.setBackgroundDrawable(x1.a(ejVar, A));
        this.k.setTextSize(14.0f);
        this.k.setTextColor(-1);
        this.k.setTypeface(com.comviva.webaxn.utils.v.a("Poppins-Bold.ttf"));
        this.k.setOnClickListener(new b());
        if (com.comviva.webaxn.utils.b.a(this).a().h()) {
            this.f.setTextSize(26.0f);
            this.g.setTextSize(26.0f);
            this.l.setTextSize(22.0f);
            this.k.setTextSize(22.0f);
            this.l.setHeight(75);
            this.k.setHeight(75);
        }
        String c2 = com.comviva.webaxn.utils.j1.a(this).c("lbl.Cropheader");
        if (TextUtils.isEmpty(c2)) {
            c2 = getString(R.string.crop_header);
        }
        String c3 = com.comviva.webaxn.utils.j1.a(this).c("lbl.Cropfooter");
        if (TextUtils.isEmpty(c3)) {
            c3 = getString(R.string.crop_footer);
        }
        String c4 = com.comviva.webaxn.utils.j1.a(this).c("lbl.CropByes");
        if (TextUtils.isEmpty(c4)) {
            c4 = getString(R.string.crop_yes);
        }
        String c5 = com.comviva.webaxn.utils.j1.a(this).c("lbl.CropBcan");
        if (TextUtils.isEmpty(c5)) {
            c5 = getString(R.string.crop_cancel);
        }
        this.f.setText(c2);
        this.g.setText(c3);
        this.l.setText(c4);
        this.k.setText(c5);
        this.b = (TouchImageView) findViewById(R.id.cp_img);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec);
        linearLayout.getMeasuredHeight();
        int i4 = this.h;
        this.s = i4;
        if (f < 1.0f) {
            double d3 = i4;
            Double.isNaN(d3);
            this.s = (int) (d3 * 0.87d);
        }
        Bitmap a2 = getIntent().getStringExtra("imagepath") != null ? a(getIntent().getStringExtra("imagepath")) : null;
        if (getIntent() != null) {
            boolean booleanExtra = getIntent().getBooleanExtra("fromCamera", false);
            this.p = booleanExtra;
            if (booleanExtra) {
                a2 = com.comviva.webaxn.utils.c0.a(this).b();
            }
        }
        if (a2 != null) {
            this.b.setImageBitmap(a2);
            this.b.setMaxZoom(4.0f);
        }
        int i5 = this.s;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i5);
        layoutParams.gravity = 17;
        this.b.setLayoutParams(layoutParams);
        this.c = (ImageView) relativeLayout.findViewById(R.id.cp_face_template);
        int i6 = this.s;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i6, i6);
        layoutParams2.addRule(13);
        this.c.setLayoutParams(layoutParams2);
        int i7 = this.s;
        this.n = i7;
        this.o = i7;
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(v);
            if (!x1.c(v) || Build.VERSION.SDK_INT < 23) {
                return;
            }
            getWindow().getDecorView().setSystemUiVisibility(8192);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        b();
        x1.x = false;
        x1.j.b = false;
        x1.j.c = null;
        x1.j.a = null;
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
                    x1.a((Context) this, intent.getExtras().getInt("id"), true);
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
                if (x1.q == null || TextUtils.isEmpty(string)) {
                    return;
                }
                wj wjVar = x1.q;
                if (!wjVar.a(string, false, null, null, wjVar.k(), null)) {
                    wj wjVar2 = x1.q;
                    if (wjVar2.a(string, false, false, null, false, false, null, wjVar2.t().e()) > 0) {
                        x1.q.E();
                    }
                }
                x1.q = null;
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.m = true;
        x1.j.b = true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        x1.j.b = false;
        if (getPackageName().equals("com.comviva.cpw") || getPackageName().equals("com.comviva.cpwdev") || getPackageName().equals("com.comviva.cpwuat") || getPackageName().equals("com.comviva.cpwselfcare") || getPackageName().equals("com.cpw") || getPackageName().equals("com.comviva.cpwcit") || getPackageName().equals("com.comviva.cpwcit1") || getPackageName().equals("com.cpwdev2") || getPackageName().equals("com.agcpwdev") || getPackageName().equals("com.cloudcpw")) {
            if (x1.u || (com.comviva.webaxn.utils.j1.a(this).u0() && this.m)) {
                this.m = false;
                x1.u = false;
                com.comviva.webaxn.utils.j1.a(this).b(false);
            } else if (x1.v && this.m) {
                this.m = false;
                x1.v = false;
                x1.x = false;
                x1.j.b = false;
                x1.j.a = null;
                x1.j.c = null;
                x1.a((Context) this, 0, true);
                finish();
            }
        }
    }
}
