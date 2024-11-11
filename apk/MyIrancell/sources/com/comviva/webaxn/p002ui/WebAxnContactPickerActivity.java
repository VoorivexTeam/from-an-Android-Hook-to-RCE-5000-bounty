package com.comviva.webaxn.p002ui;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.comviva.webaxn.p002ui.WebAxnContactPickerFragment;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import p000.C3530zi;

/* loaded from: classes.dex */
public class WebAxnContactPickerActivity extends FragmentActivity implements WebAxnContactPickerFragment.InterfaceC0605e {

    /* renamed from: n */
    private boolean f3438n = false;

    @Override // com.comviva.webaxn.p002ui.WebAxnContactPickerFragment.InterfaceC0605e
    /* renamed from: a */
    public void mo4084a(Uri uri) {
    }

    @Override // com.comviva.webaxn.p002ui.WebAxnContactPickerFragment.InterfaceC0605e
    /* renamed from: b */
    public void mo4085b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(C3530zi.f14481x);
            if (C0755x1.m6178c(C3530zi.f14481x) && Build.VERSION.SDK_INT >= 23) {
                getWindow().getDecorView().setSystemUiVisibility(8192);
            }
        }
        setContentView(R.layout.activity_contact_picker);
        WebAxnContactPickerFragment webAxnContactPickerFragment = (WebAxnContactPickerFragment) m1738e().mo1808a(R.id.contact_list);
        webAxnContactPickerFragment.m4099b(getIntent().getIntExtra("minimum", 1), getIntent().getIntExtra("maximum", 0));
        if ("android.intent.action.SEARCH".equals(getIntent().getAction())) {
            String stringExtra = getIntent().getStringExtra("query");
            this.f3438n = true;
            webAxnContactPickerFragment.m4100b(stringExtra);
            setTitle(getString(R.string.contacts_list_search_results_title, new Object[]{stringExtra}));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return !this.f3438n && super.onSearchRequested();
    }
}
