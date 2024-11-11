package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import android.os.Looper;
import com.comviva.webaxn.utils.x1;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import defpackage.fs;
import defpackage.gs;
import defpackage.hs;
import defpackage.ks;
import java.text.DateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public class h1 {
    private static h1 o;
    private Context b;
    private com.google.android.gms.location.a c;
    private com.google.android.gms.location.g d;
    private LocationRequest e;
    private LocationSettingsRequest f;
    private com.google.android.gms.location.b g;
    private Location h;
    private String i;
    private boolean l;
    private x1.l n;
    private final String a = h1.class.getSimpleName();
    private boolean j = false;
    private boolean k = false;
    private boolean m = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends com.google.android.gms.location.b {
        a() {
        }

        @Override // com.google.android.gms.location.b
        public void a(LocationAvailability locationAvailability) {
            if (locationAvailability.j()) {
                super.a(locationAvailability);
                return;
            }
            if (h1.this.k || !h1.this.j) {
                return;
            }
            h1.this.j = false;
            if (h1.this.n != null) {
                h1.this.n.a(false);
            }
            h1.this.f();
        }

        @Override // com.google.android.gms.location.b
        public void a(LocationResult locationResult) {
            super.a(locationResult);
            h1.this.h = locationResult.j();
            h1.this.i = DateFormat.getTimeInstance().format(new Date());
            if (h1.this.k || !h1.this.j) {
                return;
            }
            h1.this.j = false;
            if (h1.this.n != null) {
                h1.this.n.a(true);
            }
            h1.this.f();
        }
    }

    /* loaded from: classes.dex */
    class b implements gs {
        final /* synthetic */ int a;

        b(int i) {
            this.a = i;
        }

        @Override // defpackage.gs
        public void a(Exception exc) {
            int a = ((com.google.android.gms.common.api.b) exc).a();
            if (a != 6) {
                if (a != 8502) {
                    return;
                }
                String unused = h1.this.a;
                h1.this.l = false;
                return;
            }
            String unused2 = h1.this.a;
            h1.this.l = false;
            try {
                ((com.google.android.gms.common.api.k) exc).a((Activity) h1.this.b, this.a);
            } catch (IntentSender.SendIntentException unused3) {
                String unused4 = h1.this.a;
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements hs<com.google.android.gms.location.e> {
        final /* synthetic */ int a;

        c(int i) {
            this.a = i;
        }

        @Override // defpackage.hs
        public void a(com.google.android.gms.location.e eVar) {
            String unused = h1.this.a;
            h1.this.l = true;
            if (this.a == 3002 && h1.this.n != null) {
                h1.this.n.a(true);
            }
            h1.this.c.a(h1.this.e, h1.this.g, Looper.myLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements fs<Void> {
        d() {
        }

        @Override // defpackage.fs
        public void a(ks<Void> ksVar) {
            h1.this.k = false;
            h1.this.m = false;
        }
    }

    private h1(Context context) {
        this.b = context;
        this.c = com.google.android.gms.location.d.a(context);
        this.d = com.google.android.gms.location.d.b(this.b);
    }

    public static h1 a(Context context) {
        if (o == null) {
            o = new h1(context);
        }
        return o;
    }

    private void a(long j) {
        LocationRequest locationRequest = new LocationRequest();
        this.e = locationRequest;
        if (j == -1) {
            locationRequest.c(10000L);
        }
        this.e.b(5000L);
        this.e.d(100);
    }

    private void g() {
        LocationSettingsRequest.a aVar = new LocationSettingsRequest.a();
        aVar.a(this.e);
        this.f = aVar.a();
    }

    private void h() {
        this.g = new a();
    }

    public void a() {
        if (this.k) {
            return;
        }
        e();
    }

    public void a(int i) {
        ks<com.google.android.gms.location.e> a2 = this.d.a(this.f);
        a2.a((Activity) this.b, new c(i));
        a2.a((Activity) this.b, new b(i));
    }

    public void a(long j, boolean z, boolean z2, x1.l lVar) {
        this.j = z;
        this.k = z2;
        this.n = lVar;
        if (this.m) {
            return;
        }
        a(j);
        g();
        h();
        this.m = true;
    }

    public String b() {
        Location location = this.h;
        if (location != null) {
            return String.valueOf(location.getLatitude());
        }
        return null;
    }

    public String c() {
        Location location = this.h;
        if (location != null) {
            return String.valueOf(location.getLongitude());
        }
        return null;
    }

    public String d() {
        return this.i;
    }

    public void e() {
        if (o != null) {
            o = null;
        }
        if (this.c != null) {
            this.c = null;
        }
        if (this.d != null) {
            this.d = null;
        }
        if (this.e != null) {
            this.e = null;
        }
        if (this.f != null) {
            this.f = null;
        }
        if (this.g != null) {
            this.g = null;
        }
        if (this.h != null) {
            this.h = null;
        }
        this.i = null;
        this.j = false;
        this.k = false;
        this.m = false;
    }

    public void f() {
        com.google.android.gms.location.b bVar;
        com.google.android.gms.location.a aVar = this.c;
        if (aVar == null || (bVar = this.g) == null) {
            return;
        }
        aVar.a(bVar).a((Activity) this.b, new d());
    }
}
