package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.core.content.C0237b;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.i */
/* loaded from: classes.dex */
public final class C1756i extends AbstractC1703d6 {

    /* renamed from: c */
    private long f7609c;

    /* renamed from: d */
    private String f7610d;

    /* renamed from: e */
    private Boolean f7611e;

    /* renamed from: f */
    private AccountManager f7612f;

    /* renamed from: g */
    private Boolean f7613g;

    /* renamed from: h */
    private long f7614h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1756i(C1774j5 c1774j5) {
        super(c1774j5);
    }

    /* renamed from: a */
    public final boolean m9372a(Context context) {
        if (this.f7611e == null) {
            mo9317d();
            this.f7611e = false;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f7611e = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.f7611e.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1703d6
    /* renamed from: r */
    protected final boolean mo9123r() {
        Calendar calendar = Calendar.getInstance();
        this.f7609c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f7610d = sb.toString();
        return false;
    }

    /* renamed from: t */
    public final long m9373t() {
        m9220o();
        return this.f7609c;
    }

    /* renamed from: u */
    public final String m9374u() {
        m9220o();
        return this.f7610d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final long m9375v() {
        mo9194c();
        return this.f7614h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final void m9376w() {
        mo9194c();
        this.f7613g = null;
        this.f7614h = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final boolean m9377x() {
        mo9194c();
        long mo7375a = mo9321h().mo7375a();
        if (mo7375a - this.f7614h > 86400000) {
            this.f7613g = null;
        }
        Boolean bool = this.f7613g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C0237b.m1459a(mo9325l(), "android.permission.GET_ACCOUNTS") != 0) {
            mo9324k().m9313x().m9365a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f7612f == null) {
                this.f7612f = AccountManager.get(mo9325l());
            }
            try {
                Account[] result = this.f7612f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.f7613g = true;
                    this.f7614h = mo7375a;
                    return true;
                }
                Account[] result2 = this.f7612f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f7613g = true;
                    this.f7614h = mo7375a;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                mo9324k().m9310u().m9366a("Exception checking account types", e);
            }
        }
        this.f7614h = mo7375a;
        this.f7613g = false;
        return false;
    }
}
