package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements InterfaceC0982m, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;

    /* renamed from: f */
    public static final Status f5668f = new Status(0);

    /* renamed from: g */
    public static final Status f5669g = new Status(14);

    /* renamed from: h */
    public static final Status f5670h = new Status(8);

    /* renamed from: i */
    public static final Status f5671i = new Status(15);

    /* renamed from: j */
    public static final Status f5672j = new Status(16);

    /* renamed from: b */
    private final int f5673b;

    /* renamed from: c */
    private final int f5674c;

    /* renamed from: d */
    private final String f5675d;

    /* renamed from: e */
    private final PendingIntent f5676e;

    static {
        new Status(17);
        new Status(18);
        CREATOR = new C0991v();
    }

    public Status(int i) {
        this(i, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f5673b = i;
        this.f5674c = i2;
        this.f5675d = str;
        this.f5676e = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    /* renamed from: a */
    public final void m6495a(Activity activity, int i) {
        if (m6499l()) {
            activity.startIntentSenderForResult(this.f5676e.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    @Override // com.google.android.gms.common.api.InterfaceC0982m
    /* renamed from: e */
    public final Status mo6496e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5673b == status.f5673b && this.f5674c == status.f5674c && C1050s.m7205a(this.f5675d, status.f5675d) && C1050s.m7205a(this.f5676e, status.f5676e);
    }

    public final int hashCode() {
        return C1050s.m7203a(Integer.valueOf(this.f5673b), Integer.valueOf(this.f5674c), this.f5675d, this.f5676e);
    }

    /* renamed from: j */
    public final int m6497j() {
        return this.f5674c;
    }

    /* renamed from: k */
    public final String m6498k() {
        return this.f5675d;
    }

    /* renamed from: l */
    public final boolean m6499l() {
        return this.f5676e != null;
    }

    /* renamed from: m */
    public final boolean m6500m() {
        return this.f5674c <= 0;
    }

    /* renamed from: n */
    public final String m6501n() {
        String str = this.f5675d;
        return str != null ? str : C0862d.m6530a(this.f5674c);
    }

    public final String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("statusCode", m6501n());
        m7204a.m7206a("resolution", this.f5676e);
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, m6497j());
        C1053b.m7266a(parcel, 2, m6498k(), false);
        C1053b.m7260a(parcel, 3, (Parcelable) this.f5676e, i, false);
        C1053b.m7255a(parcel, 1000, this.f5673b);
        C1053b.m7251a(parcel, m7250a);
    }
}
