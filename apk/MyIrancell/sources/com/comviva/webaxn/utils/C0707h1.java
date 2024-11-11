package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import android.os.Looper;
import com.comviva.webaxn.utils.C0755x1;
import com.google.android.gms.common.api.C0860b;
import com.google.android.gms.common.api.C0980k;
import com.google.android.gms.location.C1572a;
import com.google.android.gms.location.C1574b;
import com.google.android.gms.location.C1578d;
import com.google.android.gms.location.C1580e;
import com.google.android.gms.location.C1584g;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import java.text.DateFormat;
import java.util.Date;
import p000.AbstractC2871ks;
import p000.InterfaceC2484fs;
import p000.InterfaceC2524gs;
import p000.InterfaceC2564hs;

/* renamed from: com.comviva.webaxn.utils.h1 */
/* loaded from: classes.dex */
public class C0707h1 {

    /* renamed from: o */
    private static C0707h1 f4825o;

    /* renamed from: b */
    private Context f4827b;

    /* renamed from: c */
    private C1572a f4828c;

    /* renamed from: d */
    private C1584g f4829d;

    /* renamed from: e */
    private LocationRequest f4830e;

    /* renamed from: f */
    private LocationSettingsRequest f4831f;

    /* renamed from: g */
    private C1574b f4832g;

    /* renamed from: h */
    private Location f4833h;

    /* renamed from: i */
    private String f4834i;

    /* renamed from: l */
    private boolean f4837l;

    /* renamed from: n */
    private C0755x1.l f4839n;

    /* renamed from: a */
    private final String f4826a = C0707h1.class.getSimpleName();

    /* renamed from: j */
    private boolean f4835j = false;

    /* renamed from: k */
    private boolean f4836k = false;

    /* renamed from: m */
    private boolean f4838m = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.h1$a */
    /* loaded from: classes.dex */
    public class a extends C1574b {
        a() {
        }

        @Override // com.google.android.gms.location.C1574b
        /* renamed from: a */
        public void mo5521a(LocationAvailability locationAvailability) {
            if (locationAvailability.m8946j()) {
                super.mo5521a(locationAvailability);
                return;
            }
            if (C0707h1.this.f4836k || !C0707h1.this.f4835j) {
                return;
            }
            C0707h1.this.f4835j = false;
            if (C0707h1.this.f4839n != null) {
                C0707h1.this.f4839n.mo5452a(false);
            }
            C0707h1.this.m5520f();
        }

        @Override // com.google.android.gms.location.C1574b
        /* renamed from: a */
        public void mo5522a(LocationResult locationResult) {
            super.mo5522a(locationResult);
            C0707h1.this.f4833h = locationResult.m8952j();
            C0707h1.this.f4834i = DateFormat.getTimeInstance().format(new Date());
            if (C0707h1.this.f4836k || !C0707h1.this.f4835j) {
                return;
            }
            C0707h1.this.f4835j = false;
            if (C0707h1.this.f4839n != null) {
                C0707h1.this.f4839n.mo5452a(true);
            }
            C0707h1.this.m5520f();
        }
    }

    /* renamed from: com.comviva.webaxn.utils.h1$b */
    /* loaded from: classes.dex */
    class b implements InterfaceC2524gs {

        /* renamed from: a */
        final /* synthetic */ int f4841a;

        b(int i) {
            this.f4841a = i;
        }

        @Override // p000.InterfaceC2524gs
        /* renamed from: a */
        public void mo3189a(Exception exc) {
            int m6527a = ((C0860b) exc).m6527a();
            if (m6527a != 6) {
                if (m6527a != 8502) {
                    return;
                }
                String unused = C0707h1.this.f4826a;
                C0707h1.this.f4837l = false;
                return;
            }
            String unused2 = C0707h1.this.f4826a;
            C0707h1.this.f4837l = false;
            try {
                ((C0980k) exc).m6939a((Activity) C0707h1.this.f4827b, this.f4841a);
            } catch (IntentSender.SendIntentException unused3) {
                String unused4 = C0707h1.this.f4826a;
            }
        }
    }

    /* renamed from: com.comviva.webaxn.utils.h1$c */
    /* loaded from: classes.dex */
    class c implements InterfaceC2564hs<C1580e> {

        /* renamed from: a */
        final /* synthetic */ int f4843a;

        c(int i) {
            this.f4843a = i;
        }

        @Override // p000.InterfaceC2564hs
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo3190a(C1580e c1580e) {
            String unused = C0707h1.this.f4826a;
            C0707h1.this.f4837l = true;
            if (this.f4843a == 3002 && C0707h1.this.f4839n != null) {
                C0707h1.this.f4839n.mo5452a(true);
            }
            C0707h1.this.f4828c.m8965a(C0707h1.this.f4830e, C0707h1.this.f4832g, Looper.myLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.h1$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC2484fs<Void> {
        d() {
        }

        @Override // p000.InterfaceC2484fs
        /* renamed from: a */
        public void mo5523a(AbstractC2871ks<Void> abstractC2871ks) {
            C0707h1.this.f4836k = false;
            C0707h1.this.f4838m = false;
        }
    }

    private C0707h1(Context context) {
        this.f4827b = context;
        this.f4828c = C1578d.m8968a(context);
        this.f4829d = C1578d.m8969b(this.f4827b);
    }

    /* renamed from: a */
    public static C0707h1 m5496a(Context context) {
        if (f4825o == null) {
            f4825o = new C0707h1(context);
        }
        return f4825o;
    }

    /* renamed from: a */
    private void m5499a(long j) {
        LocationRequest locationRequest = new LocationRequest();
        this.f4830e = locationRequest;
        if (j == -1) {
            locationRequest.m8949c(10000L);
        }
        this.f4830e.m8948b(5000L);
        this.f4830e.m8950d(100);
    }

    /* renamed from: g */
    private void m5510g() {
        LocationSettingsRequest.C1571a c1571a = new LocationSettingsRequest.C1571a();
        c1571a.m8954a(this.f4830e);
        this.f4831f = c1571a.m8955a();
    }

    /* renamed from: h */
    private void m5512h() {
        this.f4832g = new a();
    }

    /* renamed from: a */
    public void m5513a() {
        if (this.f4836k) {
            return;
        }
        m5519e();
    }

    /* renamed from: a */
    public void m5514a(int i) {
        AbstractC2871ks<C1580e> m8971a = this.f4829d.m8971a(this.f4831f);
        m8971a.mo11806a((Activity) this.f4827b, new c(i));
        m8971a.mo11805a((Activity) this.f4827b, new b(i));
    }

    /* renamed from: a */
    public void m5515a(long j, boolean z, boolean z2, C0755x1.l lVar) {
        this.f4835j = z;
        this.f4836k = z2;
        this.f4839n = lVar;
        if (this.f4838m) {
            return;
        }
        m5499a(j);
        m5510g();
        m5512h();
        this.f4838m = true;
    }

    /* renamed from: b */
    public String m5516b() {
        Location location = this.f4833h;
        if (location != null) {
            return String.valueOf(location.getLatitude());
        }
        return null;
    }

    /* renamed from: c */
    public String m5517c() {
        Location location = this.f4833h;
        if (location != null) {
            return String.valueOf(location.getLongitude());
        }
        return null;
    }

    /* renamed from: d */
    public String m5518d() {
        return this.f4834i;
    }

    /* renamed from: e */
    public void m5519e() {
        if (f4825o != null) {
            f4825o = null;
        }
        if (this.f4828c != null) {
            this.f4828c = null;
        }
        if (this.f4829d != null) {
            this.f4829d = null;
        }
        if (this.f4830e != null) {
            this.f4830e = null;
        }
        if (this.f4831f != null) {
            this.f4831f = null;
        }
        if (this.f4832g != null) {
            this.f4832g = null;
        }
        if (this.f4833h != null) {
            this.f4833h = null;
        }
        this.f4834i = null;
        this.f4835j = false;
        this.f4836k = false;
        this.f4838m = false;
    }

    /* renamed from: f */
    public void m5520f() {
        C1574b c1574b;
        C1572a c1572a = this.f4828c;
        if (c1572a == null || (c1574b = this.f4832g) == null) {
            return;
        }
        c1572a.m8966a(c1574b).mo11804a((Activity) this.f4827b, new d());
    }
}
