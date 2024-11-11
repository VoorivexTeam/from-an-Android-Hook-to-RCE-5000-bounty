package com.comviva.webaxn.ui;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.comviva.webaxn.ui.WebAxnContactPickerFragment;
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.zi;

/* loaded from: classes.dex */
public class WebAxnContactPickerActivity extends FragmentActivity implements WebAxnContactPickerFragment.e {
    private boolean n = false;

    @Override // com.comviva.webaxn.ui.WebAxnContactPickerFragment.e
    public void a(Uri uri) {
    }

    @Override // com.comviva.webaxn.ui.WebAxnContactPickerFragment.e
    public void b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(zi.x);
            if (x1.c(zi.x) && Build.VERSION.SDK_INT >= 23) {
                getWindow().getDecorView().setSystemUiVisibility(8192);
            }
        }
        setContentView(R.layout.activity_contact_picker);
        WebAxnContactPickerFragment webAxnContactPickerFragment = (WebAxnContactPickerFragment) e().a(R.id.contact_list);
        webAxnContactPickerFragment.b(getIntent().getIntExtra("minimum", 1), getIntent().getIntExtra("maximum", 0));
        if ("android.intent.action.SEARCH".equals(getIntent().getAction())) {
            String stringExtra = getIntent().getStringExtra("query");
            this.n = true;
            webAxnContactPickerFragment.b(stringExtra);
            setTitle(getString(R.string.contacts_list_search_results_title, new Object[]{stringExtra}));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return !this.n && super.onSearchRequested();
    }
}
