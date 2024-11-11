package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.measurement.internal.k */
/* loaded from: classes.dex */
final class C1780k {

    /* renamed from: a */
    final String f7694a;

    /* renamed from: b */
    final String f7695b;

    /* renamed from: c */
    final long f7696c;

    /* renamed from: d */
    final long f7697d;

    /* renamed from: e */
    final long f7698e;

    /* renamed from: f */
    final long f7699f;

    /* renamed from: g */
    final long f7700g;

    /* renamed from: h */
    final Long f7701h;

    /* renamed from: i */
    final Long f7702i;

    /* renamed from: j */
    final Long f7703j;

    /* renamed from: k */
    final Boolean f7704k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1780k(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        C1057u.m7296b(str);
        C1057u.m7296b(str2);
        C1057u.m7293a(j >= 0);
        C1057u.m7293a(j2 >= 0);
        C1057u.m7293a(j3 >= 0);
        C1057u.m7293a(j5 >= 0);
        this.f7694a = str;
        this.f7695b = str2;
        this.f7696c = j;
        this.f7697d = j2;
        this.f7698e = j3;
        this.f7699f = j4;
        this.f7700g = j5;
        this.f7701h = l;
        this.f7702i = l2;
        this.f7703j = l3;
        this.f7704k = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1780k(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, j, j2, 0L, j3, 0L, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1780k m9451a(long j) {
        return new C1780k(this.f7694a, this.f7695b, this.f7696c, this.f7697d, this.f7698e, j, this.f7700g, this.f7701h, this.f7702i, this.f7703j, this.f7704k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1780k m9452a(long j, long j2) {
        return new C1780k(this.f7694a, this.f7695b, this.f7696c, this.f7697d, this.f7698e, this.f7699f, j, Long.valueOf(j2), this.f7702i, this.f7703j, this.f7704k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1780k m9453a(Long l, Long l2, Boolean bool) {
        return new C1780k(this.f7694a, this.f7695b, this.f7696c, this.f7697d, this.f7698e, this.f7699f, this.f7700g, this.f7701h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
