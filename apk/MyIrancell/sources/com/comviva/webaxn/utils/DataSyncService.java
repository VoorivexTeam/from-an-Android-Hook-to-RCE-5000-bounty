package com.comviva.webaxn.utils;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.comviva.webaxn.transport.C0579a;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class DataSyncService extends IntentService {

    /* renamed from: b */
    private String f4577b;

    /* renamed from: c */
    private int f4578c;

    public DataSyncService() {
        super(DataSyncService.class.getName());
    }

    /* renamed from: a */
    public void m5220a() {
        int i = this.f4578c;
        if (i != 1) {
            if (i == 2) {
                TextUtils.isEmpty(this.f4577b);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(this.f4577b)) {
            return;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                String str = this.f4577b + "?id=" + C0713j1.m5563a(getApplicationContext()).m5725s0() + "&lat=" + C0714k.m5758b(getApplicationContext(), "LOC-LAT") + "&lon=" + C0714k.m5758b(getApplicationContext(), "LOC-LON");
                this.f4577b = str;
                httpURLConnection = C0579a.m3968a(str, C0713j1.m5563a(getApplicationContext()).m5658e0());
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.addRequestProperty("User-Agent", "2.3.0.11583/" + C0713j1.m5563a(getApplicationContext()).m5617V());
                httpURLConnection.getResponseCode();
                if (httpURLConnection == null) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (httpURLConnection == null) {
                    return;
                }
            }
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        this.f4577b = null;
        this.f4578c = -1;
        if (intent.getExtras() != null) {
            this.f4577b = intent.getExtras().getString("url");
            this.f4578c = intent.getExtras().getInt("type", -1);
        }
        if (!TextUtils.isEmpty(this.f4577b)) {
            this.f4577b = Uri.decode(this.f4577b);
        }
        m5220a();
    }
}
