package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class i extends d6 {
    private long c;
    private String d;
    private Boolean e;
    private AccountManager f;
    private Boolean g;
    private long h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(j5 j5Var) {
        super(j5Var);
    }

    public final boolean a(Context context) {
        if (this.e == null) {
            d();
            this.e = false;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.e = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.e.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.d6
    protected final boolean r() {
        Calendar calendar = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.d = sb.toString();
        return false;
    }

    public final long t() {
        o();
        return this.c;
    }

    public final String u() {
        o();
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long v() {
        c();
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w() {
        c();
        this.g = null;
        this.h = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean x() {
        c();
        long a = h().a();
        if (a - this.h > 86400000) {
            this.g = null;
        }
        Boolean bool = this.g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (androidx.core.content.b.a(l(), "android.permission.GET_ACCOUNTS") != 0) {
            k().x().a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f == null) {
                this.f = AccountManager.get(l());
            }
            try {
                Account[] result = this.f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.g = true;
                    this.h = a;
                    return true;
                }
                Account[] result2 = this.f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.g = true;
                    this.h = a;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                k().u().a("Exception checking account types", e);
            }
        }
        this.h = a;
        this.g = false;
        return false;
    }
}
