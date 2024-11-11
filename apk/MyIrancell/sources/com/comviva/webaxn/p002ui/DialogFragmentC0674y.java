package com.comviva.webaxn.p002ui;

import android.app.Activity;
import android.app.DialogFragment;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.comviva.webaxn.p002ui.C0676z;
import com.comviva.webaxn.utils.C0703g0;
import com.mtni.myirancell.R;

/* renamed from: com.comviva.webaxn.ui.y */
/* loaded from: classes.dex */
public class DialogFragmentC0674y extends DialogFragment implements C0676z.d {

    /* renamed from: b */
    private Button f4510b;

    /* renamed from: c */
    private Button f4511c;

    /* renamed from: d */
    private View f4512d;

    /* renamed from: e */
    private View f4513e;

    /* renamed from: f */
    private CheckBox f4514f;

    /* renamed from: g */
    private TextView f4515g;

    /* renamed from: h */
    private TextView f4516h;

    /* renamed from: i */
    private d f4517i = d.FINGERPRINT;

    /* renamed from: j */
    private FingerprintManager.CryptoObject f4518j;

    /* renamed from: k */
    private C0676z f4519k;

    /* renamed from: l */
    private WebAxnActivity f4520l;

    /* renamed from: com.comviva.webaxn.ui.y$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC0674y.this.dismiss();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.y$b */
    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0703g0.m5463a(DialogFragmentC0674y.this.f4520l).m5472f();
            DialogFragmentC0674y.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.y$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f4523a;

        static {
            int[] iArr = new int[d.values().length];
            f4523a = iArr;
            try {
                iArr[d.FINGERPRINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4523a[d.NEW_FINGERPRINT_ENROLLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4523a[d.PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.y$d */
    /* loaded from: classes.dex */
    public enum d {
        FINGERPRINT,
        NEW_FINGERPRINT_ENROLLED,
        PASSWORD
    }

    /* renamed from: b */
    private void m5155b() {
        this.f4517i = d.PASSWORD;
        m5156c();
        this.f4519k.m5176b();
    }

    /* renamed from: c */
    private void m5156c() {
        int i = c.f4523a[this.f4517i.ordinal()];
        if (i == 1) {
            this.f4510b.setText(R.string.cancel);
            this.f4511c.setText(R.string.use_password);
            this.f4512d.setVisibility(0);
            this.f4513e.setVisibility(8);
            return;
        }
        if (i == 2 || i == 3) {
            this.f4510b.setText(R.string.cancel);
            this.f4511c.setText(R.string.ok);
            this.f4512d.setVisibility(8);
            this.f4513e.setVisibility(0);
            if (this.f4517i == d.NEW_FINGERPRINT_ENROLLED) {
                this.f4515g.setVisibility(8);
                this.f4516h.setVisibility(0);
                this.f4514f.setVisibility(0);
            }
        }
    }

    @Override // com.comviva.webaxn.p002ui.C0676z.d
    /* renamed from: a */
    public void mo5157a() {
        dismiss();
        C0703g0.m5463a(this.f4520l).m5473g();
    }

    /* renamed from: a */
    public void m5158a(FingerprintManager.CryptoObject cryptoObject) {
        this.f4518j = cryptoObject;
    }

    /* renamed from: a */
    public void m5159a(d dVar) {
        this.f4517i = dVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f4520l = (WebAxnActivity) activity;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        setStyle(0, android.R.style.Theme.Material.Light.Dialog);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().setTitle(getString(R.string.sign_in));
        View inflate = layoutInflater.inflate(R.layout.fingerprint_dialog_container, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        this.f4510b = button;
        button.setOnClickListener(new a());
        Button button2 = (Button) inflate.findViewById(R.id.second_dialog_button);
        this.f4511c = button2;
        button2.setOnClickListener(new b());
        this.f4512d = inflate.findViewById(R.id.fingerprint_container);
        this.f4513e = inflate.findViewById(R.id.backup_container);
        this.f4514f = (CheckBox) inflate.findViewById(R.id.use_fingerprint_in_future_check);
        this.f4516h = (TextView) inflate.findViewById(R.id.new_fingerprint_enrolled_description);
        this.f4519k = new C0676z((FingerprintManager) this.f4520l.getSystemService(FingerprintManager.class), (ImageView) inflate.findViewById(R.id.fingerprint_icon), (TextView) inflate.findViewById(R.id.fingerprint_status), this);
        m5156c();
        return inflate;
    }

    @Override // com.comviva.webaxn.p002ui.C0676z.d
    public void onError() {
        m5155b();
        dismiss();
        C0703g0.m5463a(this.f4520l).m5472f();
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.f4519k.m5176b();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f4517i == d.FINGERPRINT) {
            this.f4519k.m5174a(this.f4518j);
        }
    }
}
