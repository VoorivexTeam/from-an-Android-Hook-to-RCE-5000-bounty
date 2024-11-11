package com.comviva.webaxn.ui;

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
import com.comviva.webaxn.ui.z;
import com.mtni.myirancell.R;

/* loaded from: classes.dex */
public class y extends DialogFragment implements z.d {
    private Button b;
    private Button c;
    private View d;
    private View e;
    private CheckBox f;
    private TextView g;
    private TextView h;
    private d i = d.FINGERPRINT;
    private FingerprintManager.CryptoObject j;
    private z k;
    private WebAxnActivity l;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.comviva.webaxn.utils.g0.a(y.this.l).f();
            y.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.FINGERPRINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.NEW_FINGERPRINT_ENROLLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        FINGERPRINT,
        NEW_FINGERPRINT_ENROLLED,
        PASSWORD
    }

    private void b() {
        this.i = d.PASSWORD;
        c();
        this.k.b();
    }

    private void c() {
        int i = c.a[this.i.ordinal()];
        if (i == 1) {
            this.b.setText(R.string.cancel);
            this.c.setText(R.string.use_password);
            this.d.setVisibility(0);
            this.e.setVisibility(8);
            return;
        }
        if (i == 2 || i == 3) {
            this.b.setText(R.string.cancel);
            this.c.setText(R.string.ok);
            this.d.setVisibility(8);
            this.e.setVisibility(0);
            if (this.i == d.NEW_FINGERPRINT_ENROLLED) {
                this.g.setVisibility(8);
                this.h.setVisibility(0);
                this.f.setVisibility(0);
            }
        }
    }

    @Override // com.comviva.webaxn.ui.z.d
    public void a() {
        dismiss();
        com.comviva.webaxn.utils.g0.a(this.l).g();
    }

    public void a(FingerprintManager.CryptoObject cryptoObject) {
        this.j = cryptoObject;
    }

    public void a(d dVar) {
        this.i = dVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.l = (WebAxnActivity) activity;
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
        this.b = button;
        button.setOnClickListener(new a());
        Button button2 = (Button) inflate.findViewById(R.id.second_dialog_button);
        this.c = button2;
        button2.setOnClickListener(new b());
        this.d = inflate.findViewById(R.id.fingerprint_container);
        this.e = inflate.findViewById(R.id.backup_container);
        this.f = (CheckBox) inflate.findViewById(R.id.use_fingerprint_in_future_check);
        this.h = (TextView) inflate.findViewById(R.id.new_fingerprint_enrolled_description);
        this.k = new z((FingerprintManager) this.l.getSystemService(FingerprintManager.class), (ImageView) inflate.findViewById(R.id.fingerprint_icon), (TextView) inflate.findViewById(R.id.fingerprint_status), this);
        c();
        return inflate;
    }

    @Override // com.comviva.webaxn.ui.z.d
    public void onError() {
        b();
        dismiss();
        com.comviva.webaxn.utils.g0.a(this.l).f();
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.k.b();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.i == d.FINGERPRINT) {
            this.k.a(this.j);
        }
    }
}
