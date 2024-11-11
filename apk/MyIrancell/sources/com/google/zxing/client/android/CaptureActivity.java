package com.google.zxing.client.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import p000.AbstractAsyncTaskC3143qx;
import p000.AbstractC2569hx;
import p000.C2488fw;
import p000.C2568hw;
import p000.C3142qw;
import p000.C3413ww;
import p000.C3544zw;
import p000.EnumC2528gw;
import p000.EnumC3224sv;
import p000.EnumC3412wv;
import p000.ViewOnClickListenerC2529gx;

/* loaded from: classes.dex */
public final class CaptureActivity extends Activity implements SurfaceHolder.Callback {

    /* renamed from: C */
    private static final String[] f9035C = {"http://zxing.appspot.com/scan", "zxing://scan/"};

    /* renamed from: D */
    private static final Collection<EnumC2528gw> f9036D = EnumSet.of(EnumC2528gw.ISSUE_NUMBER, EnumC2528gw.SUGGESTED_PRICE, EnumC2528gw.ERROR_CORRECTION_LEVEL, EnumC2528gw.POSSIBLE_COUNTRY);

    /* renamed from: b */
    private C3142qw f9039b;

    /* renamed from: c */
    private HandlerC2254c f9040c;

    /* renamed from: d */
    private C2488fw f9041d;

    /* renamed from: e */
    private ViewfinderView f9042e;

    /* renamed from: f */
    private TextView f9043f;

    /* renamed from: g */
    private TextView f9044g;

    /* renamed from: h */
    private View f9045h;

    /* renamed from: i */
    private C2488fw f9046i;

    /* renamed from: j */
    private boolean f9047j;

    /* renamed from: k */
    private boolean f9048k;

    /* renamed from: l */
    private EnumC2263l f9049l;

    /* renamed from: m */
    private String f9050m;

    /* renamed from: n */
    private C2265n f9051n;

    /* renamed from: o */
    private Collection<EnumC3224sv> f9052o;

    /* renamed from: p */
    private Map<EnumC3412wv, ?> f9053p;

    /* renamed from: q */
    private String f9054q;

    /* renamed from: r */
    private C3544zw f9055r;

    /* renamed from: s */
    private C2262k f9056s;

    /* renamed from: t */
    private C2247b f9057t;

    /* renamed from: u */
    private C2246a f9058u;

    /* renamed from: v */
    private int f9059v;

    /* renamed from: w */
    private int f9060w;

    /* renamed from: z */
    private ImageView f9063z;

    /* renamed from: x */
    private boolean f9061x = false;

    /* renamed from: y */
    private boolean f9062y = false;

    /* renamed from: A */
    private boolean f9037A = false;

    /* renamed from: B */
    private View.OnClickListener f9038B = new ViewOnClickListenerC2244a();

    /* renamed from: com.google.zxing.client.android.CaptureActivity$a */
    /* loaded from: classes.dex */
    class ViewOnClickListenerC2244a implements View.OnClickListener {
        ViewOnClickListenerC2244a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == R$id.cancel) {
                CaptureActivity.this.finish();
            } else if (view.getId() == R$id.flash) {
                CaptureActivity.this.m10827e();
            } else if (view.getId() == R$id.picker) {
                CaptureActivity.this.m10829g();
            }
        }
    }

    /* renamed from: com.google.zxing.client.android.CaptureActivity$b */
    /* loaded from: classes.dex */
    static /* synthetic */ class C2245b {

        /* renamed from: a */
        static final /* synthetic */ int[] f9065a;

        static {
            int[] iArr = new int[EnumC2263l.values().length];
            f9065a = iArr;
            try {
                iArr[EnumC2263l.NATIVE_APP_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9065a[EnumC2263l.PRODUCT_SEARCH_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9065a[EnumC2263l.ZXING_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9065a[EnumC2263l.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    private void m10816a(int i, Object obj, long j) {
        HandlerC2254c handlerC2254c = this.f9040c;
        if (handlerC2254c != null) {
            Message obtain = Message.obtain(handlerC2254c, i, obj);
            if (j > 0) {
                this.f9040c.sendMessageDelayed(obtain, j);
            } else {
                this.f9040c.sendMessage(obtain);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m10817a(android.graphics.Bitmap r11) {
        /*
            r10 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r1 = r1.getAction()
            r0.<init>(r1)
            r1 = 524288(0x80000, float:7.34684E-40)
            r0.addFlags(r1)
            if (r11 == 0) goto L55
            int r1 = r11.getWidth()
            int r2 = r11.getHeight()
            int r1 = r1 * r2
            int[] r1 = new int[r1]
            r4 = 0
            int r5 = r11.getWidth()
            r6 = 0
            r7 = 0
            int r8 = r11.getWidth()
            int r9 = r11.getHeight()
            r2 = r11
            r3 = r1
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
            cw r2 = new cw
            int r3 = r11.getWidth()
            int r11 = r11.getHeight()
            r2.<init>(r3, r11, r1)
            uv r11 = new uv
            pz r1 = new pz
            r1.<init>(r2)
            r11.<init>(r1)
            zv r1 = new zv
            r1.<init>()
            fw r11 = r1.mo11487a(r11)     // Catch: java.lang.Throwable -> L55
            goto L56
        L55:
            r11 = 0
        L56:
            java.lang.String r1 = "SCAN_RESULT"
            if (r11 == 0) goto Led
            java.lang.String r2 = r11.toString()
            r0.putExtra(r1, r2)
            sv r1 = r11.m11835a()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SCAN_RESULT_FORMAT"
            r0.putExtra(r2, r1)
            byte[] r1 = r11.m11839b()
            if (r1 == 0) goto L7c
            int r2 = r1.length
            if (r2 <= 0) goto L7c
            java.lang.String r2 = "SCAN_RESULT_BYTES"
            r0.putExtra(r2, r1)
        L7c:
            java.util.Map r11 = r11.m11840c()
            if (r11 == 0) goto Lf2
            gw r1 = p000.EnumC2528gw.UPC_EAN_EXTENSION
            boolean r1 = r11.containsKey(r1)
            if (r1 == 0) goto L99
            gw r1 = p000.EnumC2528gw.UPC_EAN_EXTENSION
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SCAN_RESULT_UPC_EAN_EXTENSION"
            r0.putExtra(r2, r1)
        L99:
            gw r1 = p000.EnumC2528gw.ORIENTATION
            java.lang.Object r1 = r11.get(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto Lac
            int r1 = r1.intValue()
            java.lang.String r2 = "SCAN_RESULT_ORIENTATION"
            r0.putExtra(r2, r1)
        Lac:
            gw r1 = p000.EnumC2528gw.ERROR_CORRECTION_LEVEL
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lbb
            java.lang.String r2 = "SCAN_RESULT_ERROR_CORRECTION_LEVEL"
            r0.putExtra(r2, r1)
        Lbb:
            gw r1 = p000.EnumC2528gw.BYTE_SEGMENTS
            java.lang.Object r11 = r11.get(r1)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            if (r11 == 0) goto Lf2
            r1 = 0
            java.util.Iterator r11 = r11.iterator()
        Lca:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Lf2
            java.lang.Object r2 = r11.next()
            byte[] r2 = (byte[]) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "SCAN_RESULT_BYTE_SEGMENTS_"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.putExtra(r3, r2)
            int r1 = r1 + 1
            goto Lca
        Led:
            java.lang.String r11 = "NAD"
            r0.putExtra(r1, r11)
        Lf2:
            r11 = -1
            r10.setResult(r11, r0)
            r10.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.android.CaptureActivity.m10817a(android.graphics.Bitmap):void");
    }

    /* renamed from: a */
    private void m10818a(Bitmap bitmap, float f, C2488fw c2488fw) {
        C2568hw c2568hw;
        C2568hw c2568hw2;
        C2568hw[] m11841d = c2488fw.m11841d();
        if (m11841d == null || m11841d.length <= 0) {
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R$color.result_points));
        if (m11841d.length == 2) {
            paint.setStrokeWidth(4.0f);
            c2568hw = m11841d[0];
            c2568hw2 = m11841d[1];
        } else {
            if (m11841d.length != 4 || (c2488fw.m11835a() != EnumC3224sv.UPC_A && c2488fw.m11835a() != EnumC3224sv.EAN_13)) {
                paint.setStrokeWidth(10.0f);
                for (C2568hw c2568hw3 : m11841d) {
                    if (c2568hw3 != null) {
                        canvas.drawPoint(c2568hw3.m12248a() * f, c2568hw3.m12249b() * f, paint);
                    }
                }
                return;
            }
            m10820a(canvas, paint, m11841d[0], m11841d[1], f);
            c2568hw = m11841d[2];
            c2568hw2 = m11841d[3];
        }
        m10820a(canvas, paint, c2568hw, c2568hw2, f);
    }

    /* renamed from: a */
    private void m10819a(Bitmap bitmap, C2488fw c2488fw) {
        if (this.f9040c == null) {
            this.f9041d = c2488fw;
            return;
        }
        if (c2488fw != null) {
            this.f9041d = c2488fw;
        }
        C2488fw c2488fw2 = this.f9041d;
        if (c2488fw2 != null) {
            this.f9040c.sendMessage(Message.obtain(this.f9040c, R$id.decode_succeeded, c2488fw2));
        }
        this.f9041d = null;
    }

    /* renamed from: a */
    private static void m10820a(Canvas canvas, Paint paint, C2568hw c2568hw, C2568hw c2568hw2, float f) {
        if (c2568hw == null || c2568hw2 == null) {
            return;
        }
        canvas.drawLine(f * c2568hw.m12248a(), f * c2568hw.m12249b(), f * c2568hw2.m12248a(), f * c2568hw2.m12249b(), paint);
    }

    /* renamed from: a */
    private void m10821a(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalStateException("No SurfaceHolder provided");
        }
        if (this.f9039b.m15146d()) {
            return;
        }
        try {
            this.f9039b.m15141a(surfaceHolder);
            if (this.f9061x && !this.f9062y) {
                this.f9039b.m15144b(this.f9059v, this.f9060w);
            }
            if (this.f9040c == null) {
                this.f9040c = new HandlerC2254c(this, this.f9052o, this.f9053p, this.f9054q, this.f9039b);
            }
            m10819a(null, null);
        } catch (IOException | RuntimeException unused) {
            m10828f();
        }
    }

    /* renamed from: a */
    private void m10823a(C2488fw c2488fw, AbstractC2569hx abstractC2569hx, Bitmap bitmap) {
        C2265n c2265n;
        Object m10905a;
        if (bitmap != null) {
            this.f9042e.m10838a(bitmap);
        }
        long longExtra = getIntent() != null ? getIntent().getLongExtra("RESULT_DISPLAY_DURATION_MS", 1500L) : 1500L;
        int i = 0;
        if (longExtra > 0) {
            String valueOf = String.valueOf(c2488fw);
            if (valueOf.length() > 32) {
                valueOf = valueOf.substring(0, 32) + " ...";
            }
            if (!this.f9061x) {
                this.f9043f.setText(getString(abstractC2569hx.mo3201f()) + " : " + valueOf);
            }
        }
        if (this.f9048k && !abstractC2569hx.mo12264a()) {
            C3413ww.m16400a(abstractC2569hx.mo3200e(), this);
        }
        EnumC2263l enumC2263l = this.f9049l;
        if (enumC2263l != EnumC2263l.NATIVE_APP_INTENT) {
            if (enumC2263l == EnumC2263l.PRODUCT_SEARCH_LINK) {
                m10905a = this.f9050m.substring(0, this.f9050m.lastIndexOf("/scan")) + "?q=" + ((Object) abstractC2569hx.mo3200e()) + "&source=zxing";
            } else {
                if (enumC2263l != EnumC2263l.ZXING_LINK || (c2265n = this.f9051n) == null || !c2265n.m10906a()) {
                    return;
                }
                m10905a = this.f9051n.m10905a(c2488fw, abstractC2569hx);
                this.f9051n = null;
            }
            m10816a(R$id.launch_product_query, m10905a, longExtra);
            return;
        }
        Intent intent = new Intent(getIntent().getAction());
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", c2488fw.toString());
        intent.putExtra("SCAN_RESULT_FORMAT", c2488fw.m11835a().toString());
        byte[] m11839b = c2488fw.m11839b();
        if (m11839b != null && m11839b.length > 0) {
            intent.putExtra("SCAN_RESULT_BYTES", m11839b);
        }
        Map<EnumC2528gw, Object> m11840c = c2488fw.m11840c();
        if (m11840c != null) {
            if (m11840c.containsKey(EnumC2528gw.UPC_EAN_EXTENSION)) {
                intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", m11840c.get(EnumC2528gw.UPC_EAN_EXTENSION).toString());
            }
            Number number = (Number) m11840c.get(EnumC2528gw.ORIENTATION);
            if (number != null) {
                intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
            }
            String str = (String) m11840c.get(EnumC2528gw.ERROR_CORRECTION_LEVEL);
            if (str != null) {
                intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str);
            }
            Iterable iterable = (Iterable) m11840c.get(EnumC2528gw.BYTE_SEGMENTS);
            if (iterable != null) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i, (byte[]) it.next());
                    i++;
                }
            }
        }
        m10816a(R$id.return_scan_result, intent, longExtra);
    }

    /* renamed from: a */
    private static boolean m10824a(String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : f9035C) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m10826b(C2488fw c2488fw, AbstractC2569hx abstractC2569hx, Bitmap bitmap) {
        CharSequence mo3200e = abstractC2569hx.mo3200e();
        if (this.f9048k && !abstractC2569hx.mo12264a()) {
            C3413ww.m16400a(mo3200e, this);
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (abstractC2569hx.mo12272d() != null && defaultSharedPreferences.getBoolean("preferences_auto_open_web", false)) {
            abstractC2569hx.mo3198b(abstractC2569hx.mo12272d().intValue());
            return;
        }
        this.f9042e.setVisibility(8);
        if (this.f9061x) {
            return;
        }
        this.f9043f.setVisibility(8);
        this.f9045h.setVisibility(0);
        ImageView imageView = (ImageView) findViewById(R$id.barcode_image_view);
        if (bitmap == null) {
            bitmap = BitmapFactory.decodeResource(getResources(), R$drawable.launcher_icon);
        }
        imageView.setImageBitmap(bitmap);
        ((TextView) findViewById(R$id.format_text_view)).setText(c2488fw.m11835a().toString());
        ((TextView) findViewById(R$id.type_text_view)).setText(abstractC2569hx.m12278h().toString());
        ((TextView) findViewById(R$id.time_text_view)).setText(DateFormat.getDateTimeInstance(3, 3).format(new Date(c2488fw.m11843f())));
        TextView textView = (TextView) findViewById(R$id.meta_text_view);
        View findViewById = findViewById(R$id.meta_text_view_label);
        textView.setVisibility(8);
        findViewById.setVisibility(8);
        Map<EnumC2528gw, Object> m11840c = c2488fw.m11840c();
        if (m11840c != null) {
            StringBuilder sb = new StringBuilder(20);
            for (Map.Entry<EnumC2528gw, Object> entry : m11840c.entrySet()) {
                if (f9036D.contains(entry.getKey())) {
                    sb.append(entry.getValue());
                    sb.append('\n');
                }
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
                textView.setText(sb);
                textView.setVisibility(0);
                findViewById.setVisibility(0);
            }
        }
        TextView textView2 = (TextView) findViewById(R$id.contents_text_view);
        textView2.setText(mo3200e);
        textView2.setTextSize(2, Math.max(22, 32 - (mo3200e.length() / 4)));
        TextView textView3 = (TextView) findViewById(R$id.contents_supplement_text_view);
        textView3.setText("");
        textView3.setOnClickListener(null);
        if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("preferences_supplemental", true)) {
            AbstractAsyncTaskC3143qx.m15149a(textView3, abstractC2569hx.m12276g(), this.f9055r, this);
        }
        int mo3199c = abstractC2569hx.mo3199c();
        ViewGroup viewGroup = (ViewGroup) findViewById(R$id.result_button_view);
        viewGroup.requestFocus();
        for (int i = 0; i < 4; i++) {
            TextView textView4 = (TextView) viewGroup.getChildAt(i);
            if (i < mo3199c) {
                textView4.setVisibility(0);
                textView4.setText(abstractC2569hx.mo3197a(i));
                textView4.setOnClickListener(new ViewOnClickListenerC2529gx(abstractC2569hx, i));
            } else {
                textView4.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m10827e() {
        C3142qw c3142qw;
        boolean z;
        if (this.f9037A) {
            this.f9063z.setImageResource(R$drawable.flash_off);
            c3142qw = this.f9039b;
            z = false;
        } else {
            this.f9063z.setImageResource(R$drawable.flash_on);
            c3142qw = this.f9039b;
            z = true;
        }
        c3142qw.m15142a(z);
        this.f9037A = z;
    }

    /* renamed from: f */
    private void m10828f() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R$string.app_name));
        builder.setMessage(getString(R$string.msg_camera_framework_bug));
        builder.setPositiveButton(R$string.button_ok, new DialogInterfaceOnClickListenerC2260i(this));
        builder.setOnCancelListener(new DialogInterfaceOnClickListenerC2260i(this));
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m10829g() {
        startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 47821);
    }

    /* renamed from: h */
    private void m10830h() {
        if (!this.f9061x) {
            this.f9045h.setVisibility(8);
        }
        this.f9043f.setText(R$string.msg_default_status);
        this.f9043f.setVisibility(0);
        this.f9042e.setVisibility(0);
        this.f9046i = null;
    }

    /* renamed from: a */
    public void m10831a() {
        this.f9042e.m10837a();
    }

    /* renamed from: a */
    public void m10832a(long j) {
        HandlerC2254c handlerC2254c = this.f9040c;
        if (handlerC2254c != null) {
            handlerC2254c.sendEmptyMessageDelayed(R$id.restart_preview, j);
        }
        m10830h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r8.m10906a() != false) goto L27;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m10833a(p000.C2488fw r6, android.graphics.Bitmap r7, float r8) {
        /*
            r5 = this;
            com.google.zxing.client.android.k r0 = r5.f9056s
            r0.m10893a()
            r5.f9046i = r6
            hx r0 = p000.C2791ix.m13266a(r5, r6)
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            if (r3 == 0) goto L21
            zw r4 = r5.f9055r
            r4.m16964a(r6, r0)
            com.google.zxing.client.android.b r4 = r5.f9057t
            r4.m10844a()
            r5.m10818a(r7, r8, r6)
        L21:
            int[] r8 = com.google.zxing.client.android.CaptureActivity.C2245b.f9065a
            com.google.zxing.client.android.l r4 = r5.f9049l
            int r4 = r4.ordinal()
            r8 = r8[r4]
            if (r8 == r1) goto L8b
            r1 = 2
            if (r8 == r1) goto L8b
            r1 = 3
            if (r8 == r1) goto L7d
            r1 = 4
            if (r8 == r1) goto L37
            goto L8e
        L37:
            android.content.SharedPreferences r8 = android.preference.PreferenceManager.getDefaultSharedPreferences(r5)
            if (r3 == 0) goto L87
            java.lang.String r1 = "preferences_bulk_mode"
            boolean r8 = r8.getBoolean(r1, r2)
            if (r8 == 0) goto L87
            android.content.Context r7 = r5.getApplicationContext()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.res.Resources r0 = r5.getResources()
            int r1 = com.google.zxing.client.android.R$string.msg_bulk_mode_scanned
            java.lang.String r0 = r0.getString(r1)
            r8.append(r0)
            java.lang.String r0 = " ("
            r8.append(r0)
            java.lang.String r6 = r6.m11842e()
            r8.append(r6)
            r6 = 41
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            android.widget.Toast r6 = android.widget.Toast.makeText(r7, r6, r2)
            r6.show()
            r6 = 1000(0x3e8, double:4.94E-321)
            r5.m10832a(r6)
            goto L8e
        L7d:
            com.google.zxing.client.android.n r8 = r5.f9051n
            if (r8 == 0) goto L87
            boolean r8 = r8.m10906a()
            if (r8 != 0) goto L8b
        L87:
            r5.m10826b(r6, r0, r7)
            goto L8e
        L8b:
            r5.m10823a(r6, r0, r7)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.android.CaptureActivity.m10833a(fw, android.graphics.Bitmap, float):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C3142qw m10834b() {
        return this.f9039b;
    }

    /* renamed from: c */
    public Handler m10835c() {
        return this.f9040c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public ViewfinderView m10836d() {
        return this.f9042e;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int intExtra;
        Bitmap bitmap = null;
        if (i == 47820 && this.f9055r != null) {
            if (i2 != -1 || (intExtra = intent.getIntExtra("ITEM_NUMBER", -1)) < 0) {
                return;
            }
            m10819a(null, this.f9055r.m16962a(intExtra).m16669a());
            return;
        }
        if (i == 47821 && i2 == -1 && intent != null) {
            try {
                Uri data = intent.getData();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 24) {
                    InputStream openInputStream = getContentResolver().openInputStream(data);
                    bitmap = BitmapFactory.decodeStream(openInputStream, new Rect(), options);
                    openInputStream.close();
                } else {
                    String[] strArr = {"_data"};
                    Cursor query = getContentResolver().query(data, strArr, null, null, null);
                    query.moveToFirst();
                    bitmap = BitmapFactory.decodeFile(query.getString(query.getColumnIndex(strArr[0])), options);
                    query.close();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            m10817a(bitmap);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        if ("com.google.zxing.client.android.webaxn.SCAN".equals(getIntent().getAction())) {
            setContentView(R$layout.scanner);
            this.f9061x = true;
        } else {
            setContentView(R$layout.capture);
        }
        this.f9047j = false;
        this.f9056s = new C2262k(this);
        this.f9057t = new C2247b(this);
        this.f9058u = new C2246a(this);
        PreferenceManager.setDefaultValues(this, R$xml.preferences, true);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.f9061x = false;
        this.f9062y = false;
        this.f9037A = false;
        this.f9056s.m10896d();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.f9061x) {
            if (i != 4) {
                if (i != 27 && i != 80) {
                    if (i == 24) {
                        this.f9039b.m15142a(true);
                    } else if (i == 25) {
                        this.f9039b.m15142a(false);
                        return true;
                    }
                }
                return true;
            }
            EnumC2263l enumC2263l = this.f9049l;
            if (enumC2263l == EnumC2263l.NATIVE_APP_INTENT) {
                setResult(0);
                finish();
                return true;
            }
            if ((enumC2263l == EnumC2263l.NONE || enumC2263l == EnumC2263l.ZXING_LINK) && this.f9046i != null) {
                m10832a(0L);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        HandlerC2254c handlerC2254c = this.f9040c;
        if (handlerC2254c != null) {
            handlerC2254c.m10870a();
            this.f9040c = null;
        }
        this.f9056s.m10894b();
        this.f9058u.m10840a();
        this.f9057t.close();
        this.f9039b.m15137a();
        if (!this.f9047j) {
            ((SurfaceView) findViewById(R$id.preview_view)).getHolder().removeCallback(this);
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        int intExtra;
        super.onResume();
        C3544zw c3544zw = new C3544zw(this);
        this.f9055r = c3544zw;
        c3544zw.m16963a();
        this.f9039b = new C3142qw(getApplication());
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R$id.viewfinder_view);
        this.f9042e = viewfinderView;
        viewfinderView.setCameraManager(this.f9039b);
        if (this.f9061x) {
            this.f9044g = (TextView) findViewById(R$id.title_view);
            ImageView imageView = (ImageView) findViewById(R$id.cancel);
            this.f9063z = (ImageView) findViewById(R$id.flash);
            ImageView imageView2 = (ImageView) findViewById(R$id.picker);
            imageView.setOnClickListener(this.f9038B);
            this.f9063z.setOnClickListener(this.f9038B);
            imageView2.setOnClickListener(this.f9038B);
        } else {
            this.f9045h = findViewById(R$id.result_view);
        }
        this.f9043f = (TextView) findViewById(R$id.status_view);
        this.f9040c = null;
        this.f9046i = null;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        m10830h();
        this.f9057t.m10845c();
        this.f9058u.m10841a(this.f9039b);
        this.f9056s.m10895c();
        Intent intent = getIntent();
        this.f9048k = defaultSharedPreferences.getBoolean("preferences_copy_to_clipboard", true) && (intent == null || intent.getBooleanExtra("SAVE_HISTORY", true));
        this.f9049l = EnumC2263l.NONE;
        this.f9050m = null;
        this.f9051n = null;
        this.f9052o = null;
        this.f9054q = null;
        if (intent != null) {
            String action = intent.getAction();
            String dataString = intent.getDataString();
            if ("com.google.zxing.client.android.webaxn.SCAN".equals(action)) {
                this.f9049l = EnumC2263l.NATIVE_APP_INTENT;
                this.f9052o = C2256e.m10871a(intent);
                this.f9053p = C2258g.m10876a(intent);
                int intExtra2 = intent.getIntExtra("ORIENTATION", 6);
                this.f9059v = intExtra2;
                setRequestedOrientation(intExtra2);
                String stringExtra = intent.getStringExtra("TITLE");
                if (!TextUtils.isEmpty(stringExtra)) {
                    this.f9044g.setText(stringExtra);
                }
                this.f9044g.setTextSize(intent.getIntExtra("TITLE_SIZE", 22));
                this.f9044g.setTextColor(intent.getIntExtra("TITLE_COLOR", -1));
                String stringExtra2 = intent.getStringExtra("PROMPT_MESSAGE");
                if (stringExtra2 != null) {
                    this.f9043f.setText(stringExtra2);
                }
                this.f9043f.setTextSize(intent.getIntExtra("PROMPT_MESSAGE_SIZE", 22));
                this.f9043f.setTextColor(intent.getIntExtra("PROMPT_MESSAGE_COLOR", -1));
                this.f9060w = intent.getIntExtra("VIEWTYPE", 2);
                if (intent.hasExtra("SCAN_WIDTH") && intent.hasExtra("SCAN_HEIGHT")) {
                    int intExtra3 = intent.getIntExtra("SCAN_WIDTH", 0);
                    int intExtra4 = intent.getIntExtra("SCAN_HEIGHT", 0);
                    this.f9062y = true;
                    if (intExtra3 > 0 && intExtra4 > 0) {
                        this.f9039b.m15139a(intExtra3, intExtra4);
                    }
                }
                if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
                    this.f9039b.m15138a(intExtra);
                }
            } else if (dataString != null && dataString.contains("https://www.google") && dataString.contains("/m/products/scan")) {
                this.f9049l = EnumC2263l.PRODUCT_SEARCH_LINK;
                this.f9050m = dataString;
                this.f9052o = C2256e.f9121b;
            } else if (m10824a(dataString)) {
                this.f9049l = EnumC2263l.ZXING_LINK;
                this.f9050m = dataString;
                Uri parse = Uri.parse(dataString);
                this.f9051n = new C2265n(parse);
                this.f9052o = C2256e.m10872a(parse);
                this.f9053p = C2258g.m10877a(parse);
            }
            this.f9054q = intent.getStringExtra("CHARACTER_SET");
        }
        SurfaceHolder holder = ((SurfaceView) findViewById(R$id.preview_view)).getHolder();
        if (this.f9047j) {
            m10821a(holder);
        } else {
            holder.addCallback(this);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f9047j) {
            return;
        }
        this.f9047j = true;
        m10821a(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f9047j = false;
    }
}
