package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.core.content.C0238c;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.h */
/* loaded from: classes.dex */
class C0088h {

    /* renamed from: d */
    private static C0088h f432d;

    /* renamed from: a */
    private final Context f433a;

    /* renamed from: b */
    private final LocationManager f434b;

    /* renamed from: c */
    private final a f435c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.h$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        boolean f436a;

        /* renamed from: b */
        long f437b;

        /* renamed from: c */
        long f438c;

        /* renamed from: d */
        long f439d;

        /* renamed from: e */
        long f440e;

        /* renamed from: f */
        long f441f;

        a() {
        }
    }

    C0088h(Context context, LocationManager locationManager) {
        this.f433a = context;
        this.f434b = locationManager;
    }

    /* renamed from: a */
    private Location m510a(String str) {
        try {
            if (this.f434b.isProviderEnabled(str)) {
                return this.f434b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0088h m511a(Context context) {
        if (f432d == null) {
            Context applicationContext = context.getApplicationContext();
            f432d = new C0088h(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f432d;
    }

    /* renamed from: a */
    private void m512a(Location location) {
        long j;
        a aVar = this.f435c;
        long currentTimeMillis = System.currentTimeMillis();
        C0087g m508a = C0087g.m508a();
        m508a.m509a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = m508a.f429a;
        m508a.m509a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = m508a.f431c == 1;
        long j3 = m508a.f430b;
        long j4 = m508a.f429a;
        boolean z2 = z;
        m508a.m509a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = m508a.f430b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.f436a = z2;
        aVar.f437b = j2;
        aVar.f438c = j3;
        aVar.f439d = j4;
        aVar.f440e = j5;
        aVar.f441f = j;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m513b() {
        Location m510a = C0238c.m1469a(this.f433a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m510a("network") : null;
        Location m510a2 = C0238c.m1469a(this.f433a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m510a("gps") : null;
        return (m510a2 == null || m510a == null) ? m510a2 != null ? m510a2 : m510a : m510a2.getTime() > m510a.getTime() ? m510a2 : m510a;
    }

    /* renamed from: c */
    private boolean m514c() {
        return this.f435c.f441f > System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m515a() {
        a aVar = this.f435c;
        if (m514c()) {
            return aVar.f436a;
        }
        Location m513b = m513b();
        if (m513b != null) {
            m512a(m513b);
            return aVar.f436a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
