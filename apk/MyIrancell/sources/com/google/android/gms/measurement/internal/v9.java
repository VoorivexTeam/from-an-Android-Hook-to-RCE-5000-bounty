package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.x0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class v9 extends p9 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public v9(o9 o9Var) {
        super(o9Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(x0.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i = 0; i < aVar.q(); i++) {
            if (str.equals(aVar.d(i).q())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <Builder extends com.google.android.gms.internal.measurement.a6> Builder a(Builder builder, byte[] bArr) {
        com.google.android.gms.internal.measurement.a4 b = com.google.android.gms.internal.measurement.a4.b();
        if (b != null) {
            builder.a(bArr, b);
            return builder;
        }
        builder.a(bArr);
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.gms.internal.measurement.v0 a(com.google.android.gms.internal.measurement.t0 t0Var, String str) {
        for (com.google.android.gms.internal.measurement.v0 v0Var : t0Var.zza()) {
            if (v0Var.p().equals(str)) {
                return v0Var;
            }
        }
        return null;
    }

    private static String a(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Long> a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(t0.a aVar, String str, Object obj) {
        List<com.google.android.gms.internal.measurement.v0> zza = aVar.zza();
        int i = 0;
        while (true) {
            if (i >= zza.size()) {
                i = -1;
                break;
            } else if (str.equals(zza.get(i).p())) {
                break;
            } else {
                i++;
            }
        }
        v0.a y = com.google.android.gms.internal.measurement.v0.y();
        y.a(str);
        if (obj instanceof Long) {
            y.a(((Long) obj).longValue());
        } else if (obj instanceof String) {
            y.b((String) obj);
        } else if (obj instanceof Double) {
            y.a(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            aVar.a(i, y);
        } else {
            aVar.a(y);
        }
    }

    private static void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private final void a(StringBuilder sb, int i, com.google.android.gms.internal.measurement.e0 e0Var) {
        if (e0Var == null) {
            return;
        }
        a(sb, i);
        sb.append("filter {\n");
        if (e0Var.s()) {
            a(sb, i, "complement", Boolean.valueOf(e0Var.t()));
        }
        if (!com.google.android.gms.internal.measurement.ja.a() || !m().a(o.Y0) || e0Var.u()) {
            a(sb, i, "param_name", f().b(e0Var.v()));
        }
        if (!com.google.android.gms.internal.measurement.ja.a() || !m().a(o.Y0) || e0Var.zza()) {
            int i2 = i + 1;
            com.google.android.gms.internal.measurement.h0 p = e0Var.p();
            if (p != null) {
                a(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (p.zza()) {
                    a(sb, i2, "match_type", p.p().name());
                }
                if (!com.google.android.gms.internal.measurement.ja.a() || !m().a(o.Y0) || p.q()) {
                    a(sb, i2, "expression", p.r());
                }
                if (p.s()) {
                    a(sb, i2, "case_sensitive", Boolean.valueOf(p.t()));
                }
                if (p.v() > 0) {
                    a(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str : p.u()) {
                        a(sb, i2 + 2);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                a(sb, i2);
                sb.append("}\n");
            }
        }
        if (!com.google.android.gms.internal.measurement.ja.a() || !m().a(o.Y0) || e0Var.q()) {
            a(sb, i + 1, "number_filter", e0Var.r());
        }
        a(sb, i);
        sb.append("}\n");
    }

    private final void a(StringBuilder sb, int i, String str, com.google.android.gms.internal.measurement.f0 f0Var) {
        if (f0Var == null) {
            return;
        }
        a(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (f0Var.zza()) {
            a(sb, i, "comparison_type", f0Var.p().name());
        }
        if (f0Var.q()) {
            a(sb, i, "match_as_float", Boolean.valueOf(f0Var.r()));
        }
        if (!com.google.android.gms.internal.measurement.ja.a() || !m().a(o.Y0) || f0Var.s()) {
            a(sb, i, "comparison_value", f0Var.t());
        }
        if (!com.google.android.gms.internal.measurement.ja.a() || !m().a(o.Y0) || f0Var.u()) {
            a(sb, i, "min_comparison_value", f0Var.v());
        }
        if (!com.google.android.gms.internal.measurement.ja.a() || !m().a(o.Y0) || f0Var.w()) {
            a(sb, i, "max_comparison_value", f0Var.x());
        }
        a(sb, i);
        sb.append("}\n");
    }

    private static void a(StringBuilder sb, int i, String str, com.google.android.gms.internal.measurement.z0 z0Var, String str2) {
        if (z0Var == null) {
            return;
        }
        a(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (z0Var.r() != 0) {
            a(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : z0Var.q()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (z0Var.p() != 0) {
            a(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : z0Var.zza()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (z0Var.t() != 0) {
            a(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (com.google.android.gms.internal.measurement.s0 s0Var : z0Var.s()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(s0Var.zza() ? Integer.valueOf(s0Var.p()) : null);
                sb.append(":");
                sb.append(s0Var.q() ? Long.valueOf(s0Var.r()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (z0Var.v() != 0) {
            a(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (com.google.android.gms.internal.measurement.a1 a1Var : z0Var.u()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(a1Var.zza() ? Integer.valueOf(a1Var.p()) : null);
                sb.append(": [");
                Iterator<Long> it = a1Var.q().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        a(sb, 3);
        sb.append("}\n");
    }

    private static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        a(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private final void a(StringBuilder sb, int i, List<com.google.android.gms.internal.measurement.v0> list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        for (com.google.android.gms.internal.measurement.v0 v0Var : list) {
            if (v0Var != null) {
                a(sb, i2);
                sb.append("param {\n");
                if (com.google.android.gms.internal.measurement.d9.a() && m().a(o.Z0)) {
                    a(sb, i2, "name", v0Var.zza() ? f().b(v0Var.p()) : null);
                    a(sb, i2, "string_value", v0Var.q() ? v0Var.r() : null);
                    a(sb, i2, "int_value", v0Var.s() ? Long.valueOf(v0Var.t()) : null);
                    a(sb, i2, "double_value", v0Var.u() ? Double.valueOf(v0Var.v()) : null);
                    if (v0Var.x() > 0) {
                        a(sb, i2, v0Var.w());
                    }
                } else {
                    a(sb, i2, "name", f().b(v0Var.p()));
                    a(sb, i2, "string_value", v0Var.r());
                    a(sb, i2, "int_value", v0Var.s() ? Long.valueOf(v0Var.t()) : null);
                    a(sb, i2, "double_value", v0Var.u() ? Double.valueOf(v0Var.v()) : null);
                }
                a(sb, i2);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object b(com.google.android.gms.internal.measurement.t0 t0Var, String str) {
        com.google.android.gms.internal.measurement.v0 a = a(t0Var, str);
        if (a == null) {
            return null;
        }
        if (a.q()) {
            return a.r();
        }
        if (a.s()) {
            return Long.valueOf(a.t());
        }
        if (a.u()) {
            return Double.valueOf(a.v());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(byte[] bArr) {
        com.google.android.gms.common.internal.u.a(bArr);
        i().c();
        MessageDigest y = z9.y();
        if (y != null) {
            return z9.a(y.digest(bArr));
        }
        k().t().a("Failed to get MD5");
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T extends Parcelable> T a(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (a.C0047a unused) {
            k().t().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(com.google.android.gms.internal.measurement.d0 d0Var) {
        if (d0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (d0Var.zza()) {
            a(sb, 0, "filter_id", Integer.valueOf(d0Var.p()));
        }
        a(sb, 0, "event_name", f().a(d0Var.q()));
        String a = a(d0Var.v(), d0Var.w(), d0Var.y());
        if (!a.isEmpty()) {
            a(sb, 0, "filter_type", a);
        }
        if (!com.google.android.gms.internal.measurement.ja.a() || !m().a(o.Y0) || d0Var.t()) {
            a(sb, 1, "event_count_filter", d0Var.u());
        }
        if (!com.google.android.gms.internal.measurement.ja.a() || !m().a(o.Y0) || d0Var.s() > 0) {
            sb.append("  filters {\n");
            Iterator<com.google.android.gms.internal.measurement.e0> it = d0Var.r().iterator();
            while (it.hasNext()) {
                a(sb, 2, it.next());
            }
        }
        a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(com.google.android.gms.internal.measurement.g0 g0Var) {
        if (g0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (g0Var.zza()) {
            a(sb, 0, "filter_id", Integer.valueOf(g0Var.p()));
        }
        a(sb, 0, "property_name", f().c(g0Var.q()));
        String a = a(g0Var.s(), g0Var.t(), g0Var.v());
        if (!a.isEmpty()) {
            a(sb, 0, "filter_type", a);
        }
        a(sb, 1, g0Var.r());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(com.google.android.gms.internal.measurement.w0 w0Var) {
        if (w0Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.x0 x0Var : w0Var.zza()) {
            if (x0Var != null) {
                a(sb, 1);
                sb.append("bundle {\n");
                if (x0Var.zza()) {
                    a(sb, 1, "protocol_version", Integer.valueOf(x0Var.P()));
                }
                a(sb, 1, "platform", x0Var.j0());
                if (x0Var.q0()) {
                    a(sb, 1, "gmp_version", Long.valueOf(x0Var.p()));
                }
                if (x0Var.q()) {
                    a(sb, 1, "uploading_gmp_version", Long.valueOf(x0Var.r()));
                }
                if (x0Var.S()) {
                    a(sb, 1, "dynamite_version", Long.valueOf(x0Var.T()));
                }
                if (x0Var.J()) {
                    a(sb, 1, "config_version", Long.valueOf(x0Var.K()));
                }
                a(sb, 1, "gmp_app_id", x0Var.B());
                a(sb, 1, "admob_app_id", x0Var.R());
                a(sb, 1, "app_id", x0Var.o0());
                a(sb, 1, "app_version", x0Var.p0());
                if (x0Var.G()) {
                    a(sb, 1, "app_version_major", Integer.valueOf(x0Var.H()));
                }
                a(sb, 1, "firebase_instance_id", x0Var.F());
                if (x0Var.w()) {
                    a(sb, 1, "dev_cert_hash", Long.valueOf(x0Var.x()));
                }
                a(sb, 1, "app_store", x0Var.n0());
                if (x0Var.Z()) {
                    a(sb, 1, "upload_timestamp_millis", Long.valueOf(x0Var.a0()));
                }
                if (x0Var.b0()) {
                    a(sb, 1, "start_timestamp_millis", Long.valueOf(x0Var.c0()));
                }
                if (x0Var.d0()) {
                    a(sb, 1, "end_timestamp_millis", Long.valueOf(x0Var.e0()));
                }
                if (x0Var.f0()) {
                    a(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(x0Var.g0()));
                }
                if (x0Var.h0()) {
                    a(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(x0Var.i0()));
                }
                a(sb, 1, "app_instance_id", x0Var.v());
                a(sb, 1, "resettable_device_id", x0Var.s());
                a(sb, 1, "device_id", x0Var.I());
                a(sb, 1, "ds_id", x0Var.N());
                if (x0Var.t()) {
                    a(sb, 1, "limited_ad_tracking", Boolean.valueOf(x0Var.u()));
                }
                a(sb, 1, "os_version", x0Var.k0());
                a(sb, 1, "device_model", x0Var.l0());
                a(sb, 1, "user_default_language", x0Var.m0());
                if (x0Var.d()) {
                    a(sb, 1, "time_zone_offset_minutes", Integer.valueOf(x0Var.i()));
                }
                if (x0Var.y()) {
                    a(sb, 1, "bundle_sequential_index", Integer.valueOf(x0Var.z()));
                }
                if (x0Var.C()) {
                    a(sb, 1, "service_upload", Boolean.valueOf(x0Var.D()));
                }
                a(sb, 1, "health_monitor", x0Var.A());
                if (x0Var.L() && x0Var.M() != 0) {
                    a(sb, 1, "android_id", Long.valueOf(x0Var.M()));
                }
                if (x0Var.O()) {
                    a(sb, 1, "retry_counter", Integer.valueOf(x0Var.Q()));
                }
                List<com.google.android.gms.internal.measurement.b1> X = x0Var.X();
                if (X != null) {
                    for (com.google.android.gms.internal.measurement.b1 b1Var : X) {
                        if (b1Var != null) {
                            a(sb, 2);
                            sb.append("user_property {\n");
                            a(sb, 2, "set_timestamp_millis", b1Var.zza() ? Long.valueOf(b1Var.p()) : null);
                            a(sb, 2, "name", f().c(b1Var.q()));
                            a(sb, 2, "string_value", b1Var.s());
                            a(sb, 2, "int_value", b1Var.t() ? Long.valueOf(b1Var.u()) : null);
                            a(sb, 2, "double_value", b1Var.v() ? Double.valueOf(b1Var.w()) : null);
                            a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.r0> E = x0Var.E();
                String o0 = x0Var.o0();
                if (E != null) {
                    for (com.google.android.gms.internal.measurement.r0 r0Var : E) {
                        if (r0Var != null) {
                            a(sb, 2);
                            sb.append("audience_membership {\n");
                            if (r0Var.zza()) {
                                a(sb, 2, "audience_id", Integer.valueOf(r0Var.p()));
                            }
                            if (r0Var.t()) {
                                a(sb, 2, "new_audience", Boolean.valueOf(r0Var.u()));
                            }
                            a(sb, 2, "current_data", r0Var.q(), o0);
                            if (!com.google.android.gms.internal.measurement.ja.a() || !m().a(o.Y0) || r0Var.r()) {
                                a(sb, 2, "previous_data", r0Var.s(), o0);
                            }
                            a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.t0> V = x0Var.V();
                if (V != null) {
                    for (com.google.android.gms.internal.measurement.t0 t0Var : V) {
                        if (t0Var != null) {
                            a(sb, 2);
                            sb.append("event {\n");
                            a(sb, 2, "name", f().a(t0Var.q()));
                            if (t0Var.r()) {
                                a(sb, 2, "timestamp_millis", Long.valueOf(t0Var.s()));
                            }
                            if (t0Var.t()) {
                                a(sb, 2, "previous_timestamp_millis", Long.valueOf(t0Var.u()));
                            }
                            if (t0Var.v()) {
                                a(sb, 2, "count", Integer.valueOf(t0Var.w()));
                            }
                            if (t0Var.p() != 0) {
                                a(sb, 2, t0Var.zza());
                            }
                            a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                a(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Long> a(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                k().w().a("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    k().w().a("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ (-1))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(b1.a aVar, Object obj) {
        com.google.android.gms.common.internal.u.a(obj);
        aVar.zza();
        aVar.n();
        aVar.o();
        if (obj instanceof String) {
            aVar.b((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.b(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.a(((Double) obj).doubleValue());
        } else {
            k().t().a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(v0.a aVar, Object obj) {
        com.google.android.gms.common.internal.u.a(obj);
        aVar.zza();
        aVar.n();
        aVar.o();
        if (obj instanceof String) {
            aVar.b((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.a(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.a(((Double) obj).doubleValue());
        } else {
            k().t().a("Ignoring invalid (type) event param value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(h().a() - j) > j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(zzan zzanVar, zzm zzmVar) {
        com.google.android.gms.common.internal.u.a(zzanVar);
        com.google.android.gms.common.internal.u.a(zzmVar);
        if (com.google.android.gms.internal.measurement.s8.a() && m().a(o.N0)) {
            return (TextUtils.isEmpty(zzmVar.c) && TextUtils.isEmpty(zzmVar.s)) ? false : true;
        }
        if (!TextUtils.isEmpty(zzmVar.c) || !TextUtils.isEmpty(zzmVar.s)) {
            return true;
        }
        d();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] b(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException e) {
            k().t().a("Failed to ungzip content", e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] c(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            k().t().a("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.p9
    protected final boolean t() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Integer> u() {
        Map<String, String> a = o.a(this.b.l());
        if (a == null || a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = o.M.a(null).intValue();
        for (Map.Entry<String, String> entry : a.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            k().w().a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    k().w().a("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }
}
