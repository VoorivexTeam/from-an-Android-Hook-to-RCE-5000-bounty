package com.neevar.neevarpaymentsdk;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.C0237b;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SalePaymentActivity extends AppCompatActivity {

    @Keep
    public static final String AMOUNT_PARAM = "Amount";

    @Keep
    public static final String ORDER_ID_PARAM = "OrderId";

    @Keep
    public static final String PHONO_NO_PARAM = "PhoneNo";

    @Keep
    public static final String TOKEN_PARAM = "Token";

    /* renamed from: A */
    private TextView f9177A;

    /* renamed from: B */
    private TextView f9178B;

    /* renamed from: C */
    private TextView f9179C;

    /* renamed from: D */
    private TextView f9180D;

    /* renamed from: E */
    private TextView f9181E;

    /* renamed from: F */
    private TextView f9182F;

    /* renamed from: G */
    private TextView f9183G;

    /* renamed from: H */
    private TextView f9184H;

    /* renamed from: I */
    private TextView f9185I;

    /* renamed from: J */
    private TextView f9186J;

    /* renamed from: K */
    private AutoCompleteTextView f9187K;

    /* renamed from: L */
    private EditText f9188L;

    /* renamed from: M */
    private EditText f9189M;

    /* renamed from: N */
    private EditText f9190N;

    /* renamed from: O */
    private EditText f9191O;

    /* renamed from: P */
    private Button f9192P;

    /* renamed from: Q */
    private Button f9193Q;

    /* renamed from: R */
    private LinearLayout f9194R;

    /* renamed from: S */
    private LinearLayout f9195S;

    /* renamed from: T */
    private LinearLayout f9196T;

    /* renamed from: U */
    private LinearLayout f9197U;

    /* renamed from: V */
    private ImageView f9198V;

    /* renamed from: W */
    private String f9199W;

    /* renamed from: X */
    private String f9200X;

    /* renamed from: Y */
    private String f9201Y;

    /* renamed from: a0 */
    private String f9203a0;

    /* renamed from: b0 */
    private String f9204b0;

    /* renamed from: c0 */
    private String f9205c0;

    /* renamed from: f0 */
    private List<C2295c> f9208f0;

    /* renamed from: g0 */
    private Long f9209g0;

    /* renamed from: h0 */
    private Long f9210h0;

    /* renamed from: i0 */
    private ImageView f9211i0;

    /* renamed from: j0 */
    private ImageView f9212j0;

    /* renamed from: k0 */
    private ImageView f9213k0;

    /* renamed from: l0 */
    private ImageView f9214l0;

    /* renamed from: q */
    private C2293a f9217q;

    /* renamed from: r */
    private Typeface f9218r;

    /* renamed from: s */
    private TextView f9219s;

    /* renamed from: t */
    private TextView f9220t;

    /* renamed from: u */
    private TextView f9221u;

    /* renamed from: v */
    private TextView f9222v;

    /* renamed from: w */
    private TextView f9223w;

    /* renamed from: x */
    private TextView f9224x;

    /* renamed from: y */
    private TextView f9225y;

    /* renamed from: z */
    private TextView f9226z;

    /* renamed from: Z */
    private long f9202Z = 10;

    /* renamed from: d0 */
    private boolean f9206d0 = false;

    /* renamed from: e0 */
    private boolean f9207e0 = false;

    /* renamed from: m0 */
    private int[] f9215m0 = {0, 300, 200, 300, 300, 500, 500, 1000, 1000, 3000, 3000, 5000, 5000, 5000};

    /* renamed from: n0 */
    private int f9216n0 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$a */
    /* loaded from: classes.dex */
    public class ViewOnTouchListenerC2267a implements View.OnTouchListener {
        ViewOnTouchListenerC2267a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1 || !SalePaymentActivity.this.f9191O.getText().toString().equals("**")) {
                return false;
            }
            SalePaymentActivity.this.f9190N.setText("");
            SalePaymentActivity.this.f9191O.setText("");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$b */
    /* loaded from: classes.dex */
    public class ViewOnTouchListenerC2268b implements View.OnTouchListener {
        ViewOnTouchListenerC2268b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1 || !SalePaymentActivity.this.f9191O.getText().toString().equals("**")) {
                return false;
            }
            SalePaymentActivity.this.f9190N.setText("");
            SalePaymentActivity.this.f9191O.setText("");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$c */
    /* loaded from: classes.dex */
    public class C2269c extends AbstractRunnableC2301i<String> {
        C2269c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            C2304l c2304l = new C2304l();
            try {
                JSONObject jSONObject = new JSONObject((String) this.f9273b);
                c2304l.f9304a = jSONObject.getInt("ErrorCode");
                c2304l.f9275b = jSONObject.getString("WorkingKey");
                if (c2304l.f9304a != 0) {
                    SalePaymentActivity.this.m10954d(1201);
                    return;
                }
                try {
                    byte[] m11000b = C2298f.m11000b(new SecretKeySpec(C2297e.m10998a("oMnPEUM+wJmzApS7Zh41MCbijU6JiGL5"), "DESede"), C2297e.m10998a(c2304l.f9275b));
                    SalePaymentActivity.this.f9205c0 = new String(m11000b, "UTF-8");
                    SalePaymentActivity.this.f9207e0 = true;
                    SalePaymentActivity.this.m10969o();
                } catch (Exception e) {
                    SalePaymentActivity.this.m10929a(1203, e);
                }
            } catch (JSONException e2) {
                SalePaymentActivity.this.m10929a(1204, e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$d */
    /* loaded from: classes.dex */
    public class C2270d extends AbstractRunnableC2301i<String> {
        C2270d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                C2309q c2309q = new C2309q();
                try {
                    JSONObject jSONObject = new JSONObject((String) this.f9273b);
                    c2309q.f9304a = jSONObject.getInt("ErrorCode");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("PaymentRequestResponse");
                    C2308p c2308p = new C2308p();
                    c2309q.f9302b = c2308p;
                    c2308p.f9301a = jSONObject2.getString("InquiryToken");
                    if (c2309q.f9304a == 0) {
                        SalePaymentActivity.this.m10989a(c2309q.f9302b.f9301a);
                    } else {
                        SalePaymentActivity.this.m10957e(1501);
                    }
                } catch (JSONException e) {
                    SalePaymentActivity.this.m10943b(1503, e);
                }
            } catch (Exception e2) {
                SalePaymentActivity.this.m10943b(1502, e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$e */
    /* loaded from: classes.dex */
    public class RunnableC2271e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f9231b;

        /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$e$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class C3564a extends AbstractRunnableC2301i<String> {
                C3564a() {
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C2306n c2306n = new C2306n();
                        c2306n.f9277b = new C2307o();
                        try {
                            JSONObject jSONObject = new JSONObject((String) this.f9273b);
                            c2306n.f9304a = jSONObject.getInt("ErrorCode");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("PaymentReceiptModel");
                            c2306n.f9277b.f9298u = jSONObject2.getBoolean("IsSuccessful");
                            c2306n.f9277b.f9280c = jSONObject2.getString("Message");
                            c2306n.f9277b.f9299v = jSONObject2.getInt("Status");
                            c2306n.f9277b.f9278a = jSONObject2.getBoolean("EnableRetryPayment");
                            c2306n.f9277b.f9286i = jSONObject2.getLong(SalePaymentActivity.AMOUNT_PARAM);
                            c2306n.f9277b.f9287j = jSONObject2.getString("AmountSeprated");
                            c2306n.f9277b.f9283f = jSONObject2.getString("CardAcqId");
                            c2306n.f9277b.f9289l = jSONObject2.getString("IssBankName");
                            c2306n.f9277b.f9296s = jSONObject2.getString("IV");
                            c2306n.f9277b.f9297t = jSONObject2.getInt("KeyVersion");
                            c2306n.f9277b.f9294q = jSONObject2.getString(SalePaymentActivity.ORDER_ID_PARAM);
                            c2306n.f9277b.f9291n = jSONObject2.getString("PersianTransactionDate");
                            c2306n.f9277b.f9288k = jSONObject2.getString("PrimaryAccNo");
                            c2306n.f9277b.f9279b = jSONObject2.getString("ResCode");
                            c2306n.f9277b.f9281d = jSONObject2.getString("RetrivalRefNo");
                            c2306n.f9277b.f9293p = jSONObject2.getString("ReturnUrl");
                            c2306n.f9277b.f9295r = jSONObject2.getString("SignData");
                            c2306n.f9277b.f9282e = jSONObject2.getString("StoreName");
                            c2306n.f9277b.f9285h = jSONObject2.getString("StoreUrl");
                            c2306n.f9277b.f9292o = jSONObject2.getString("SystemTraceNo");
                            c2306n.f9277b.f9284g = jSONObject2.getString("TerminalId");
                            c2306n.f9277b.f9300w = jSONObject2.getString(SalePaymentActivity.TOKEN_PARAM);
                            c2306n.f9277b.f9290m = jSONObject2.getString("TransactionDate");
                            if (c2306n.f9304a != 0) {
                                SalePaymentActivity.m10915H(SalePaymentActivity.this);
                                SalePaymentActivity.this.m10989a(RunnableC2271e.this.f9231b);
                            } else if (c2306n.f9277b.f9299v == 4) {
                                SalePaymentActivity.m10915H(SalePaymentActivity.this);
                                SalePaymentActivity.this.m10989a(RunnableC2271e.this.f9231b);
                            } else {
                                SalePaymentActivity.this.m10938a(c2306n.f9277b);
                                SalePaymentActivity.this.f9217q.m10995c();
                            }
                        } catch (JSONException e) {
                            SalePaymentActivity.this.m10943b(1602, e);
                        }
                    } catch (Exception e2) {
                        SalePaymentActivity.this.m10943b(1601, e2);
                    }
                }
            }

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    AsyncTaskC2299g asyncTaskC2299g = new AsyncTaskC2299g();
                    asyncTaskC2299g.m11002a(new C3564a());
                    asyncTaskC2299g.execute(SalePaymentActivity.this.f9203a0, SalePaymentActivity.this.f9204b0, SalePaymentActivity.this.f9205c0, RunnableC2271e.this.f9231b, SalePaymentActivity.this.f9199W, SalePaymentActivity.this.f9201Y);
                } catch (Exception e) {
                    SalePaymentActivity.this.m10943b(1600, e);
                }
            }
        }

        RunnableC2271e(String str) {
            this.f9231b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            new Handler().postDelayed(new a(), SalePaymentActivity.this.f9215m0[SalePaymentActivity.this.f9216n0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$f */
    /* loaded from: classes.dex */
    public class RunnableC2272f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C2307o f9235b;

        /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$f$a */
        /* loaded from: classes.dex */
        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    Intent intent = new Intent();
                    intent.putExtra(SalePaymentActivity.TOKEN_PARAM, RunnableC2272f.this.f9235b.f9300w);
                    intent.putExtra(SalePaymentActivity.ORDER_ID_PARAM, SalePaymentActivity.this.f9209g0);
                    intent.putExtra(SalePaymentActivity.AMOUNT_PARAM, SalePaymentActivity.this.f9210h0);
                    intent.putExtra(SalePaymentActivity.PHONO_NO_PARAM, SalePaymentActivity.this.f9203a0);
                    intent.putExtra("RetrivalRefNo", RunnableC2272f.this.f9235b.f9281d);
                    intent.putExtra("SystemTraceNo", RunnableC2272f.this.f9235b.f9292o);
                    intent.putExtra("TransactionDateTime", RunnableC2272f.this.f9235b.f9291n);
                    SalePaymentActivity.this.setResult(1, intent);
                    SalePaymentActivity.this.finish();
                } catch (Exception e) {
                    SalePaymentActivity.this.m10943b(3301, e);
                }
            }
        }

        /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$f$b */
        /* loaded from: classes.dex */
        class b extends CountDownTimer {
            b(long j, long j2) {
                super(j, j2);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                SalePaymentActivity.this.f9192P.setText(SalePaymentActivity.this.getString(R$string.neevar_complete_payment));
                SalePaymentActivity.this.f9192P.performClick();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                try {
                    SalePaymentActivity.this.f9192P.setText(SalePaymentActivity.this.getString(R$string.neevar_complete_payment) + "(" + (j / 1000) + ")");
                    SalePaymentActivity.this.f9202Z = j / 1000;
                } catch (Exception e) {
                    SalePaymentActivity.this.m10943b(3401, e);
                }
            }
        }

        /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$f$c */
        /* loaded from: classes.dex */
        class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra(SalePaymentActivity.ORDER_ID_PARAM, SalePaymentActivity.this.f9209g0);
                intent.putExtra(SalePaymentActivity.AMOUNT_PARAM, SalePaymentActivity.this.f9210h0);
                intent.putExtra(SalePaymentActivity.PHONO_NO_PARAM, SalePaymentActivity.this.f9203a0);
                SalePaymentActivity.this.f9217q.m10995c();
                SalePaymentActivity.this.setResult(20, intent);
                SalePaymentActivity.this.finish();
            }
        }

        RunnableC2272f(C2307o c2307o) {
            this.f9235b = c2307o;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            int m1458a;
            try {
                if (!this.f9235b.f9298u && this.f9235b.f9278a) {
                    SalePaymentActivity.this.m10955d(this.f9235b.f9280c);
                    return;
                }
                SalePaymentActivity.this.f9193Q.setVisibility(8);
                SalePaymentActivity.this.f9194R.setVisibility(8);
                if (this.f9235b.f9298u) {
                    SalePaymentActivity.this.f9178B.setText(SalePaymentActivity.this.getText(R$string.neevar_succeed_payment));
                    textView = SalePaymentActivity.this.f9178B;
                    m1458a = C0237b.m1458a(SalePaymentActivity.this, R$color.neevar_sdk_succeed);
                } else {
                    SalePaymentActivity.this.f9178B.setText(this.f9235b.f9280c);
                    textView = SalePaymentActivity.this.f9178B;
                    m1458a = C0237b.m1458a(SalePaymentActivity.this, R$color.neevar_sdk_failed);
                }
                textView.setTextColor(m1458a);
                if (this.f9235b.f9298u) {
                    SalePaymentActivity.this.f9198V.setImageResource(R$mipmap.neevar_success);
                    SalePaymentActivity.this.f9202Z = 10L;
                    SalePaymentActivity.this.f9222v.setText(this.f9235b.f9283f);
                    SalePaymentActivity.this.f9223w.setText(this.f9235b.f9284g);
                    SalePaymentActivity.this.f9224x.setText(this.f9235b.f9281d);
                    SalePaymentActivity.this.f9225y.setText(this.f9235b.f9292o);
                    SalePaymentActivity.this.f9226z.setText(this.f9235b.f9291n);
                    SalePaymentActivity.this.f9177A.setText(SalePaymentActivity.this.getString(R$string.neevar_sale));
                    SalePaymentActivity.this.f9197U.setVisibility(0);
                    SalePaymentActivity.this.f9192P.setText(SalePaymentActivity.this.getString(R$string.neevar_complete_payment) + "(" + SalePaymentActivity.this.f9202Z + ")");
                    SalePaymentActivity.this.f9192P.setOnClickListener(new a());
                    new b(SalePaymentActivity.this.f9202Z * 1000, 1000L).start();
                } else {
                    SalePaymentActivity.this.f9198V.setImageResource(R$mipmap.neevar_error);
                    SalePaymentActivity.this.f9192P.setText(SalePaymentActivity.this.getString(R$string.neevar_return_to_app));
                    SalePaymentActivity.this.f9192P.setOnClickListener(new c());
                }
                SalePaymentActivity.this.f9196T.setVisibility(0);
            } catch (Exception e) {
                SalePaymentActivity.this.m10943b(3101, e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$g */
    /* loaded from: classes.dex */
    public class RunnableC2273g implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f9240b;

        RunnableC2273g(String str) {
            this.f9240b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SalePaymentActivity salePaymentActivity;
            String str;
            Typeface typeface;
            if (TextUtils.isEmpty(this.f9240b)) {
                salePaymentActivity = SalePaymentActivity.this;
                str = salePaymentActivity.getString(R$string.neevar_general_failed_message);
                typeface = SalePaymentActivity.this.f9218r;
            } else {
                salePaymentActivity = SalePaymentActivity.this;
                str = this.f9240b;
                typeface = salePaymentActivity.f9218r;
            }
            C2302j.m11008a(salePaymentActivity, str, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$h */
    /* loaded from: classes.dex */
    public class RunnableC2274h implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f9242b;

        RunnableC2274h(String str) {
            this.f9242b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                SalePaymentActivity.this.f9185I.setText(this.f9242b);
                SalePaymentActivity.this.f9195S.setVisibility(0);
            } catch (Exception e) {
                SalePaymentActivity.this.m10939a(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$i */
    /* loaded from: classes.dex */
    public class RunnableC2275i implements Runnable {
        RunnableC2275i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SalePaymentActivity.this.f9195S.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$j */
    /* loaded from: classes.dex */
    public class RunnableC2276j implements Runnable {

        /* renamed from: b */
        final /* synthetic */ NonFocusingScrollView f9245b;

        RunnableC2276j(SalePaymentActivity salePaymentActivity, NonFocusingScrollView nonFocusingScrollView) {
            this.f9245b = nonFocusingScrollView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9245b.fullScroll(130);
        }
    }

    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$k */
    /* loaded from: classes.dex */
    class C2277k extends AbstractRunnableC2301i<String> {
        C2277k() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                SalePaymentActivity.this.f9204b0 = (String) this.f9273b;
                SalePaymentActivity.this.f9206d0 = true;
                SalePaymentActivity.this.m10967n();
            } catch (Exception e) {
                SalePaymentActivity.this.m10929a(1101, e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$l */
    /* loaded from: classes.dex */
    public class C2278l extends AbstractRunnableC2301i<String> {
        C2278l() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                C2296d c2296d = new C2296d();
                try {
                    c2296d.f9271b = new ArrayList();
                    JSONObject jSONObject = new JSONObject((String) this.f9273b);
                    c2296d.f9304a = jSONObject.getInt("ErrorCode");
                    JSONArray jSONArray = jSONObject.getJSONArray("CardNos");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        C2295c c2295c = new C2295c();
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        c2295c.f9269b = jSONObject2.getString("CardNoToken");
                        c2295c.f9268a = jSONObject2.getString("CardNoMask");
                        c2295c.f9270c = jSONObject2.getString("ExpireDate");
                        c2296d.f9271b.add(c2295c);
                    }
                    if (c2296d.f9304a == 0) {
                        if (c2296d.f9271b.size() > 0) {
                            SalePaymentActivity.this.f9187K.setAdapter(new C2294b(SalePaymentActivity.this, R$layout.neevar_card_row, c2296d.f9271b));
                            SalePaymentActivity.this.f9187K.showDropDown();
                            SalePaymentActivity.this.f9208f0 = c2296d.f9271b;
                            SalePaymentActivity.this.f9214l0.setVisibility(0);
                        } else {
                            SalePaymentActivity.this.f9187K.requestFocus();
                            SalePaymentActivity.this.m10930a((View) SalePaymentActivity.this.f9187K);
                        }
                    }
                    SalePaymentActivity.this.f9217q.m10995c();
                } catch (JSONException e) {
                    SalePaymentActivity.this.f9217q.m10995c();
                    SalePaymentActivity.this.m10939a(e);
                }
            } catch (Exception e2) {
                SalePaymentActivity.this.f9217q.m10995c();
                SalePaymentActivity.this.m10939a(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$m */
    /* loaded from: classes.dex */
    public class C2279m implements TextWatcher {
        C2279m() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (editable.toString().contains("*") && editable.length() < 19) {
                    editable.clear();
                    SalePaymentActivity.this.f9190N.setText("");
                    SalePaymentActivity.this.f9191O.setText("");
                    SalePaymentActivity.this.m10944b(SalePaymentActivity.this.f9187K);
                    SalePaymentActivity.this.m10944b(SalePaymentActivity.this.f9190N);
                    SalePaymentActivity.this.m10944b(SalePaymentActivity.this.f9191O);
                    SalePaymentActivity.this.m10983v();
                    SalePaymentActivity.this.f9187K.requestFocus();
                    SalePaymentActivity.this.m10930a((View) SalePaymentActivity.this.f9187K);
                }
                if (editable.length() == 19) {
                    SalePaymentActivity.this.m10944b(SalePaymentActivity.this.f9187K);
                }
                if (TextUtils.isEmpty(editable.toString())) {
                    SalePaymentActivity.this.f9211i0.setVisibility(8);
                } else {
                    SalePaymentActivity.this.f9211i0.setVisibility(0);
                }
                if (editable.length() == 19) {
                    SalePaymentActivity.this.f9188L.requestFocus();
                }
            } catch (Exception e) {
                SalePaymentActivity.this.m10929a(2002, e);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$n */
    /* loaded from: classes.dex */
    public class C2280n implements TextWatcher {
        C2280n() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (editable.length() > 2) {
                    SalePaymentActivity.this.m10944b(SalePaymentActivity.this.f9189M);
                }
                if (TextUtils.isEmpty(editable.toString())) {
                    SalePaymentActivity.this.f9213k0.setVisibility(8);
                } else {
                    SalePaymentActivity.this.f9213k0.setVisibility(0);
                }
                if (editable.length() != 4 || SalePaymentActivity.this.f9191O.getText().toString().equals("**")) {
                    SalePaymentActivity.this.m10985w();
                } else {
                    SalePaymentActivity.this.f9191O.requestFocus();
                }
            } catch (Exception e) {
                SalePaymentActivity.this.m10929a(2001, e);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$o */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2281o implements View.OnClickListener {
        ViewOnClickListenerC2281o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SalePaymentActivity.this.m10985w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$p */
    /* loaded from: classes.dex */
    public class C2282p implements TextWatcher {
        C2282p() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (editable.length() == 2) {
                    SalePaymentActivity.this.m10944b(SalePaymentActivity.this.f9191O);
                }
                if (editable.length() == 2) {
                    SalePaymentActivity.this.f9190N.requestFocus();
                }
            } catch (Exception e) {
                SalePaymentActivity.this.m10929a(2101, e);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$q */
    /* loaded from: classes.dex */
    public class C2283q implements TextWatcher {
        C2283q() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (editable.length() == 2) {
                    SalePaymentActivity.this.m10944b(SalePaymentActivity.this.f9190N);
                    SalePaymentActivity.this.m10985w();
                }
            } catch (Exception e) {
                SalePaymentActivity.this.m10929a(2201, e);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$r */
    /* loaded from: classes.dex */
    public class C2284r implements TextWatcher {
        C2284r() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ImageView imageView;
            int i;
            if (editable.length() > 4) {
                SalePaymentActivity salePaymentActivity = SalePaymentActivity.this;
                salePaymentActivity.m10944b(salePaymentActivity.f9188L);
            }
            if (TextUtils.isEmpty(editable.toString())) {
                imageView = SalePaymentActivity.this.f9212j0;
                i = 8;
            } else {
                imageView = SalePaymentActivity.this.f9212j0;
                i = 0;
            }
            imageView.setVisibility(i);
            if (editable.length() == 12) {
                SalePaymentActivity.this.f9189M.requestFocus();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$s */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2285s implements View.OnClickListener {
        ViewOnClickListenerC2285s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SalePaymentActivity.this.m10949c(21);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$t */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2286t implements View.OnClickListener {
        ViewOnClickListenerC2286t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SalePaymentActivity.this.f9187K.setText("");
            SalePaymentActivity.this.f9188L.setText("");
            SalePaymentActivity.this.f9189M.setText("");
            SalePaymentActivity.this.f9190N.setText("");
            SalePaymentActivity.this.f9191O.setText("");
            SalePaymentActivity salePaymentActivity = SalePaymentActivity.this;
            salePaymentActivity.m10944b(salePaymentActivity.f9187K);
            SalePaymentActivity salePaymentActivity2 = SalePaymentActivity.this;
            salePaymentActivity2.m10944b(salePaymentActivity2.f9189M);
            SalePaymentActivity salePaymentActivity3 = SalePaymentActivity.this;
            salePaymentActivity3.m10944b(salePaymentActivity3.f9190N);
            SalePaymentActivity salePaymentActivity4 = SalePaymentActivity.this;
            salePaymentActivity4.m10944b(salePaymentActivity4.f9191O);
            SalePaymentActivity salePaymentActivity5 = SalePaymentActivity.this;
            salePaymentActivity5.m10944b(salePaymentActivity5.f9188L);
            SalePaymentActivity.this.m10983v();
            SalePaymentActivity.this.f9187K.requestFocus();
            SalePaymentActivity salePaymentActivity6 = SalePaymentActivity.this;
            salePaymentActivity6.m10930a((View) salePaymentActivity6.f9187K);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$u */
    /* loaded from: classes.dex */
    public class ViewOnTouchListenerC2287u implements View.OnTouchListener {
        ViewOnTouchListenerC2287u() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            EditText editText;
            PasswordTransformationMethod passwordTransformationMethod;
            if (motionEvent.getAction() != 0) {
                if (motionEvent.getAction() == 1) {
                    editText = SalePaymentActivity.this.f9188L;
                    passwordTransformationMethod = new PasswordTransformationMethod();
                }
                return true;
            }
            editText = SalePaymentActivity.this.f9188L;
            passwordTransformationMethod = null;
            editText.setTransformationMethod(passwordTransformationMethod);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$v */
    /* loaded from: classes.dex */
    public class ViewOnTouchListenerC2288v implements View.OnTouchListener {
        ViewOnTouchListenerC2288v() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            EditText editText;
            PasswordTransformationMethod passwordTransformationMethod;
            if (motionEvent.getAction() != 0) {
                if (motionEvent.getAction() == 1) {
                    editText = SalePaymentActivity.this.f9189M;
                    passwordTransformationMethod = new PasswordTransformationMethod();
                }
                return true;
            }
            editText = SalePaymentActivity.this.f9189M;
            passwordTransformationMethod = null;
            editText.setTransformationMethod(passwordTransformationMethod);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$w */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2289w implements View.OnClickListener {
        ViewOnClickListenerC2289w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SalePaymentActivity.this.f9187K.showDropDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$x */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2290x implements View.OnClickListener {
        ViewOnClickListenerC2290x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SalePaymentActivity.this.f9187K.showDropDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$y */
    /* loaded from: classes.dex */
    public class C2291y implements AdapterView.OnItemClickListener {
        C2291y() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SalePaymentActivity.this.f9188L.setText("");
            SalePaymentActivity.this.f9189M.setText("");
            SalePaymentActivity.this.f9190N.setText("");
            SalePaymentActivity.this.f9191O.setText("");
            if (SalePaymentActivity.this.f9208f0 != null && SalePaymentActivity.this.f9208f0.size() > 0) {
                for (C2295c c2295c : SalePaymentActivity.this.f9208f0) {
                    if (view.getTag().toString().equals(c2295c.f9269b) && c2295c.m10996a()) {
                        SalePaymentActivity.this.f9190N.setText("**");
                        SalePaymentActivity.this.f9191O.setText("**");
                    }
                }
            }
            SalePaymentActivity.this.f9188L.requestFocus();
            SalePaymentActivity salePaymentActivity = SalePaymentActivity.this;
            salePaymentActivity.m10930a((View) salePaymentActivity.f9188L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.neevar.neevarpaymentsdk.SalePaymentActivity$z */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2292z implements View.OnClickListener {
        ViewOnClickListenerC2292z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SalePaymentActivity.this.m10979t();
        }
    }

    /* renamed from: H */
    static /* synthetic */ int m10915H(SalePaymentActivity salePaymentActivity) {
        int i = salePaymentActivity.f9216n0;
        salePaymentActivity.f9216n0 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10929a(int i, Exception exc) {
        this.f9217q.m10995c();
        m10990b((String) null);
        Intent intent = new Intent();
        intent.putExtra(ORDER_ID_PARAM, this.f9209g0);
        intent.putExtra(AMOUNT_PARAM, this.f9210h0);
        intent.putExtra(PHONO_NO_PARAM, this.f9203a0);
        setResult(i, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10930a(View view) {
        try {
            ((InputMethodManager) getSystemService("input_method")).showSoftInput(view, 1);
        } catch (Exception e) {
            m10939a(e);
        }
    }

    /* renamed from: a */
    private void m10931a(EditText editText) {
        if (Build.VERSION.SDK_INT < 16) {
            editText.setBackgroundDrawable(C0237b.m1466c(this, R$drawable.neevar_inner_edit_text_style_error));
        } else {
            editText.setBackground(C0237b.m1466c(this, R$drawable.neevar_inner_edit_text_style_error));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10938a(C2307o c2307o) {
        runOnUiThread(new RunnableC2272f(c2307o));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10939a(Exception exc) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m10943b(int i, Exception exc) {
        m10957e(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m10944b(EditText editText) {
        if (Build.VERSION.SDK_INT < 16) {
            editText.setBackgroundDrawable(C0237b.m1466c(this, R$drawable.neevar_inner_edit_text_style));
        } else {
            editText.setBackground(C0237b.m1466c(this, R$drawable.neevar_inner_edit_text_style));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m10949c(int i) {
        this.f9217q.m10995c();
        Intent intent = new Intent();
        intent.putExtra(ORDER_ID_PARAM, this.f9209g0);
        intent.putExtra(AMOUNT_PARAM, this.f9210h0);
        intent.putExtra(PHONO_NO_PARAM, this.f9203a0);
        setResult(i, intent);
        finish();
    }

    /* renamed from: c */
    private void m10952c(String str) {
        runOnUiThread(new RunnableC2274h(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m10954d(int i) {
        this.f9217q.m10995c();
        m10990b((String) null);
        Intent intent = new Intent();
        intent.putExtra(ORDER_ID_PARAM, this.f9209g0);
        intent.putExtra(AMOUNT_PARAM, this.f9210h0);
        intent.putExtra(PHONO_NO_PARAM, this.f9203a0);
        setResult(i, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m10955d(String str) {
        m10952c(str);
        m10990b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m10957e(int i) {
        this.f9217q.m10995c();
        C2307o c2307o = new C2307o();
        c2307o.f9298u = false;
        c2307o.f9280c = getString(R$string.neevar_failed_payment);
        m10938a(c2307o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m10967n() {
        if (this.f9207e0) {
            return;
        }
        try {
            AsyncTaskC2305m asyncTaskC2305m = new AsyncTaskC2305m();
            asyncTaskC2305m.m11014a(new C2269c());
            asyncTaskC2305m.execute(this.f9203a0, this.f9204b0, null);
        } catch (Exception e) {
            m10929a(1200, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m10969o() {
        try {
            AsyncTaskC2303k asyncTaskC2303k = new AsyncTaskC2303k();
            asyncTaskC2303k.m11011a(new C2278l());
            asyncTaskC2303k.execute(this.f9203a0, this.f9204b0, this.f9205c0);
        } catch (Exception e) {
            this.f9217q.m10995c();
            m10939a(e);
        }
    }

    /* renamed from: p */
    private void m10971p() {
        this.f9220t.setText(C2302j.m11007a(this.f9210h0.longValue()));
    }

    /* renamed from: q */
    private void m10973q() {
        this.f9187K.addTextChangedListener(new C2279m());
        this.f9189M.addTextChangedListener(new C2280n());
        this.f9189M.setOnClickListener(new ViewOnClickListenerC2281o());
        this.f9191O.addTextChangedListener(new C2282p());
        this.f9190N.addTextChangedListener(new C2283q());
        this.f9188L.addTextChangedListener(new C2284r());
        this.f9193Q.setOnClickListener(new ViewOnClickListenerC2285s());
        this.f9211i0.setOnClickListener(new ViewOnClickListenerC2286t());
        this.f9212j0.setOnTouchListener(new ViewOnTouchListenerC2287u());
        this.f9213k0.setOnTouchListener(new ViewOnTouchListenerC2288v());
        this.f9187K.setOnClickListener(new ViewOnClickListenerC2289w());
        this.f9214l0.setOnClickListener(new ViewOnClickListenerC2290x());
        this.f9187K.setOnItemClickListener(new C2291y());
        this.f9192P.setOnClickListener(new ViewOnClickListenerC2292z());
        this.f9190N.setOnTouchListener(new ViewOnTouchListenerC2267a());
        this.f9191O.setOnTouchListener(new ViewOnTouchListenerC2268b());
    }

    /* renamed from: r */
    private void m10974r() {
        getString(R$string.neevar_next);
        getString(R$string.neevar_payment);
        getString(R$string.neevar_cancel);
        getString(R$string.neevar_return_to_app);
    }

    /* renamed from: s */
    private void m10976s() {
        try {
            TextView textView = (TextView) findViewById(R$id.amount_title);
            this.f9219s = textView;
            textView.setTypeface(this.f9218r);
            TextView textView2 = (TextView) findViewById(R$id.amount);
            this.f9220t = textView2;
            textView2.setTypeface(this.f9218r);
            TextView textView3 = (TextView) findViewById(R$id.merchant_name);
            this.f9221u = textView3;
            textView3.setTypeface(this.f9218r);
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R$id.card_no);
            this.f9187K = autoCompleteTextView;
            autoCompleteTextView.setTypeface(this.f9218r);
            this.f9187K.addTextChangedListener(new C2300h());
            EditText editText = (EditText) findViewById(R$id.pin);
            this.f9188L = editText;
            editText.setTypeface(this.f9218r);
            EditText editText2 = (EditText) findViewById(R$id.cvv2);
            this.f9189M = editText2;
            editText2.setTypeface(this.f9218r);
            EditText editText3 = (EditText) findViewById(R$id.expireDate_year);
            this.f9190N = editText3;
            editText3.setTypeface(this.f9218r);
            EditText editText4 = (EditText) findViewById(R$id.expireDate_month);
            this.f9191O = editText4;
            editText4.setTypeface(this.f9218r);
            TextView textView4 = (TextView) findViewById(R$id.neevar_rial_text_view);
            this.f9186J = textView4;
            textView4.setTypeface(this.f9218r);
            TextView textView5 = (TextView) findViewById(R$id.receipt_merchant_no);
            this.f9222v = textView5;
            textView5.setTypeface(this.f9218r);
            TextView textView6 = (TextView) findViewById(R$id.receipt_terminalid);
            this.f9223w = textView6;
            textView6.setTypeface(this.f9218r);
            TextView textView7 = (TextView) findViewById(R$id.receipt_rrn);
            this.f9224x = textView7;
            textView7.setTypeface(this.f9218r);
            TextView textView8 = (TextView) findViewById(R$id.receipt_trace);
            this.f9225y = textView8;
            textView8.setTypeface(this.f9218r);
            TextView textView9 = (TextView) findViewById(R$id.receipt_datetime);
            this.f9226z = textView9;
            textView9.setTypeface(this.f9218r);
            TextView textView10 = (TextView) findViewById(R$id.receipt_trantype);
            this.f9177A = textView10;
            textView10.setTypeface(this.f9218r);
            TextView textView11 = (TextView) findViewById(R$id.receipt_message);
            this.f9178B = textView11;
            textView11.setTypeface(this.f9218r);
            TextView textView12 = (TextView) findViewById(R$id.receipt_merchant_no_title);
            this.f9179C = textView12;
            textView12.setTypeface(this.f9218r);
            TextView textView13 = (TextView) findViewById(R$id.receipt_terminalid_title);
            this.f9180D = textView13;
            textView13.setTypeface(this.f9218r);
            TextView textView14 = (TextView) findViewById(R$id.receipt_rrn_title);
            this.f9181E = textView14;
            textView14.setTypeface(this.f9218r);
            TextView textView15 = (TextView) findViewById(R$id.receipt_trace_title);
            this.f9182F = textView15;
            textView15.setTypeface(this.f9218r);
            TextView textView16 = (TextView) findViewById(R$id.receipt_datetime_title);
            this.f9183G = textView16;
            textView16.setTypeface(this.f9218r);
            TextView textView17 = (TextView) findViewById(R$id.receipt_tran_type_title);
            this.f9184H = textView17;
            textView17.setTypeface(this.f9218r);
            TextView textView18 = (TextView) findViewById(R$id.notification_text_view);
            this.f9185I = textView18;
            textView18.setTypeface(this.f9218r);
            Button button = (Button) findViewById(R$id.next_button);
            this.f9192P = button;
            button.setTypeface(this.f9218r);
            Button button2 = (Button) findViewById(R$id.back_button);
            this.f9193Q = button2;
            button2.setTypeface(this.f9218r);
            this.f9211i0 = (ImageView) findViewById(R$id.clear_card_text_box);
            this.f9212j0 = (ImageView) findViewById(R$id.pin_eye);
            this.f9213k0 = (ImageView) findViewById(R$id.cvv2_eye);
            this.f9194R = (LinearLayout) findViewById(R$id.card_detail_container);
            this.f9196T = (LinearLayout) findViewById(R$id.receipt_container);
            this.f9197U = (LinearLayout) findViewById(R$id.receipt_detail_container);
            this.f9195S = (LinearLayout) findViewById(R$id.notifiction_container);
            this.f9198V = (ImageView) findViewById(R$id.receipt_icon);
            this.f9214l0 = (ImageView) findViewById(R$id.neevar_cards_down_button);
        } catch (Exception e) {
            m10929a(2601, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m10979t() {
        View view;
        m10981u();
        m10944b(this.f9187K);
        m10944b(this.f9189M);
        m10944b(this.f9190N);
        m10944b(this.f9191O);
        m10944b(this.f9188L);
        if (this.f9187K.getText().length() < 19) {
            m10990b(getString(R$string.neevar_invalid_card_no));
            m10931a((EditText) this.f9187K);
            this.f9187K.requestFocus();
            view = this.f9187K;
        } else if (this.f9188L.getText().length() < 5) {
            m10990b(getString(R$string.neevar_invalid_pin));
            m10931a(this.f9188L);
            this.f9188L.requestFocus();
            view = this.f9188L;
        } else if (this.f9189M.getText().length() < 3) {
            m10990b(getString(R$string.neevar_invalid_cvv2));
            m10931a(this.f9189M);
            this.f9189M.requestFocus();
            view = this.f9189M;
        } else if (!this.f9191O.getText().toString().equals("**") && (this.f9191O.getText().length() < 2 || Integer.valueOf(this.f9191O.getText().toString()).intValue() > 12 || Integer.valueOf(this.f9191O.getText().toString()).intValue() < 1)) {
            m10990b(getString(R$string.neevar_invalid_expire_date));
            m10931a(this.f9191O);
            this.f9191O.requestFocus();
            view = this.f9191O;
        } else {
            if (this.f9190N.getText().toString().equals("**") || this.f9190N.getText().length() >= 2) {
                this.f9217q.m10994b();
                try {
                    AsyncTaskC2310r asyncTaskC2310r = new AsyncTaskC2310r();
                    asyncTaskC2310r.m11017a(new C2270d());
                    this.f9199W = this.f9187K.getText().toString().replace("-", "");
                    C2295c c2295c = null;
                    if (this.f9208f0 != null && this.f9208f0.size() > 0) {
                        for (C2295c c2295c2 : this.f9208f0) {
                            if (this.f9199W.equals(c2295c2.f9268a)) {
                                this.f9199W = 'T' + c2295c2.f9269b;
                                c2295c = c2295c2;
                            }
                        }
                    }
                    if (!this.f9199W.startsWith("T")) {
                        this.f9199W = "S" + this.f9199W;
                    }
                    String obj = this.f9188L.getText().toString();
                    String obj2 = this.f9189M.getText().toString();
                    String str = this.f9190N.getText().toString() + this.f9191O.getText().toString();
                    this.f9200X = str;
                    this.f9201Y = str;
                    if (c2295c != null && c2295c.m10996a() && this.f9200X.equals("****")) {
                        this.f9200X = c2295c.f9270c;
                        this.f9201Y = "0";
                    }
                    asyncTaskC2310r.execute(this.f9203a0, this.f9199W, obj, obj2, this.f9200X, String.valueOf(this.f9209g0), String.valueOf(this.f9210h0), this.f9205c0, this.f9204b0);
                    return;
                } catch (Exception e) {
                    m10943b(1500, e);
                    return;
                }
            }
            m10990b(getString(R$string.neevar_invalid_expire_date));
            m10931a(this.f9190N);
            this.f9190N.requestFocus();
            view = this.f9190N;
        }
        m10930a(view);
    }

    /* renamed from: u */
    private void m10981u() {
        runOnUiThread(new RunnableC2275i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m10983v() {
        m10981u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m10985w() {
        NonFocusingScrollView nonFocusingScrollView = (NonFocusingScrollView) findViewById(R$id.neevar_main_scroll_view);
        nonFocusingScrollView.postDelayed(new RunnableC2276j(this, nonFocusingScrollView), 200L);
    }

    /* renamed from: a */
    public void m10989a(String str) {
        if (this.f9216n0 > this.f9215m0.length) {
            m10957e(1605);
        } else {
            runOnUiThread(new RunnableC2271e(str));
        }
    }

    /* renamed from: b */
    public void m10990b(String str) {
        runOnUiThread(new RunnableC2273g(str));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f9217q.m10993a()) {
            return;
        }
        this.f9193Q.performClick();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_sale_payment);
        try {
            this.f9218r = Typeface.createFromAsset(getAssets(), "fonts/iransansmobile.ttf");
            this.f9217q = new C2293a(this);
            try {
                String stringExtra = getIntent().getStringExtra(PHONO_NO_PARAM);
                this.f9203a0 = stringExtra;
                if (TextUtils.isEmpty(stringExtra)) {
                    m10949c(10);
                    return;
                }
                Long valueOf = Long.valueOf(getIntent().getLongExtra(ORDER_ID_PARAM, 0L));
                this.f9209g0 = valueOf;
                if (valueOf.longValue() == 0) {
                    m10949c(11);
                    return;
                }
                Long valueOf2 = Long.valueOf(getIntent().getLongExtra(AMOUNT_PARAM, 0L));
                this.f9210h0 = valueOf2;
                if (valueOf2.longValue() == 0) {
                    m10949c(12);
                    return;
                }
                if (!C2302j.m11009a(this)) {
                    m10990b(getString(R$string.neevar_network_check));
                    m10949c(13);
                    return;
                }
                try {
                    m10976s();
                    m10974r();
                    m10973q();
                    m10971p();
                } catch (Exception e) {
                    m10929a(-1, e);
                }
            } catch (Exception e2) {
                m10929a(2501, e2);
            }
        } catch (Exception e3) {
            m10929a(2401, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.f9206d0) {
            return;
        }
        try {
            this.f9217q.m10994b();
            AsyncTaskC2312t asyncTaskC2312t = new AsyncTaskC2312t();
            asyncTaskC2312t.m11020a(new C2277k());
            asyncTaskC2312t.execute("");
        } catch (Exception e) {
            m10929a(1100, e);
        }
    }
}
