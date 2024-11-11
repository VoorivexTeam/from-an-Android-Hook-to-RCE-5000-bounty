package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.Status;
import p000.AbstractC3150r3;
import p000.C3329v3;

@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends FragmentActivity {

    /* renamed from: s */
    private static boolean f5629s = false;

    /* renamed from: n */
    private boolean f5630n = false;

    /* renamed from: o */
    private SignInConfiguration f5631o;

    /* renamed from: p */
    private boolean f5632p;

    /* renamed from: q */
    private int f5633q;

    /* renamed from: r */
    private Intent f5634r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    /* loaded from: classes.dex */
    public class C0832a implements AbstractC3150r3.a<Void> {
        private C0832a() {
        }

        @Override // p000.AbstractC3150r3.a
        /* renamed from: a */
        public final C3329v3<Void> mo4096a(int i, Bundle bundle) {
            return new C0838f(SignInHubActivity.this, AbstractC0864f.m6549h());
        }

        @Override // p000.AbstractC3150r3.a
        /* renamed from: a */
        public final void mo4097a(C3329v3<Void> c3329v3) {
        }

        @Override // p000.AbstractC3150r3.a
        /* renamed from: a */
        public final /* synthetic */ void mo4098a(C3329v3<Void> c3329v3, Void r3) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f5633q, SignInHubActivity.this.f5634r);
            SignInHubActivity.this.finish();
        }
    }

    /* renamed from: c */
    private final void m6436c(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f5629s = false;
    }

    /* renamed from: j */
    private final void m6437j() {
        m1739f().mo15185a(0, null, new C0832a());
        f5629s = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.f5630n) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.m6430i() != null) {
                GoogleSignInAccount m6430i = signInAccount.m6430i();
                C0845m.m6474a(this).m6477a(this.f5631o.m6433j(), m6430i);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", m6430i);
                this.f5632p = true;
                this.f5633q = i2;
                this.f5634r = intent;
                m6437j();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m6436c(intExtra);
                return;
            }
        }
        m6436c(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m6436c(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                "Unknown action: ".concat(valueOf);
            } else {
                new String("Unknown action: ");
            }
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
        this.f5631o = signInConfiguration;
        if (signInConfiguration == null) {
            setResult(0);
            finish();
            return;
        }
        if (!(bundle == null)) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.f5632p = z;
            if (z) {
                this.f5633q = bundle.getInt("signInResultCode");
                this.f5634r = (Intent) bundle.getParcelable("signInResultData");
                m6437j();
                return;
            }
            return;
        }
        if (f5629s) {
            setResult(0);
            m6436c(12502);
            return;
        }
        f5629s = true;
        Intent intent2 = new Intent(action);
        intent2.setPackage(action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
        intent2.putExtra("config", this.f5631o);
        try {
            startActivityForResult(intent2, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f5630n = true;
            m6436c(17);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f5632p);
        if (this.f5632p) {
            bundle.putInt("signInResultCode", this.f5633q);
            bundle.putParcelable("signInResultData", this.f5634r);
        }
    }
}
