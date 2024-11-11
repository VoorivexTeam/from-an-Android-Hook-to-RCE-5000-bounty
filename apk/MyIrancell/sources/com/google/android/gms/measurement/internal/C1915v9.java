package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import com.google.android.gms.internal.measurement.C1193a1;
import com.google.android.gms.internal.measurement.C1196a4;
import com.google.android.gms.internal.measurement.C1208b1;
import com.google.android.gms.internal.measurement.C1237d0;
import com.google.android.gms.internal.measurement.C1246d9;
import com.google.android.gms.internal.measurement.C1252e0;
import com.google.android.gms.internal.measurement.C1267f0;
import com.google.android.gms.internal.measurement.C1282g0;
import com.google.android.gms.internal.measurement.C1297h0;
import com.google.android.gms.internal.measurement.C1337ja;
import com.google.android.gms.internal.measurement.C1444r0;
import com.google.android.gms.internal.measurement.C1458s0;
import com.google.android.gms.internal.measurement.C1466s8;
import com.google.android.gms.internal.measurement.C1472t0;
import com.google.android.gms.internal.measurement.C1500v0;
import com.google.android.gms.internal.measurement.C1514w0;
import com.google.android.gms.internal.measurement.C1528x0;
import com.google.android.gms.internal.measurement.C1556z0;
import com.google.android.gms.internal.measurement.InterfaceC1198a6;
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

/* renamed from: com.google.android.gms.measurement.internal.v9 */
/* loaded from: classes.dex */
public final class C1915v9 extends AbstractC1849p9 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1915v9(C1838o9 c1838o9) {
        super(c1838o9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m9809a(C1528x0.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i = 0; i < aVar.m8855q(); i++) {
            if (str.equals(aVar.m8824d(i).m7560q())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <Builder extends InterfaceC1198a6> Builder m9810a(Builder builder, byte[] bArr) {
        C1196a4 m7531b = C1196a4.m7531b();
        if (m7531b != null) {
            builder.mo7535a(bArr, m7531b);
            return builder;
        }
        builder.mo7534a(bArr);
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1500v0 m9811a(C1472t0 c1472t0, String str) {
        for (C1500v0 c1500v0 : c1472t0.zza()) {
            if (c1500v0.m8513p().equals(str)) {
                return c1500v0;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m9812a(boolean z, boolean z2, boolean z3) {
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
    /* renamed from: a */
    public static List<Long> m9813a(BitSet bitSet) {
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
    /* renamed from: a */
    public static void m9814a(C1472t0.a aVar, String str, Object obj) {
        List<C1500v0> zza = aVar.zza();
        int i = 0;
        while (true) {
            if (i >= zza.size()) {
                i = -1;
                break;
            } else if (str.equals(zza.get(i).m8513p())) {
                break;
            } else {
                i++;
            }
        }
        C1500v0.a m8511y = C1500v0.m8511y();
        m8511y.m8524a(str);
        if (obj instanceof Long) {
            m8511y.m8523a(((Long) obj).longValue());
        } else if (obj instanceof String) {
            m8511y.m8525b((String) obj);
        } else if (obj instanceof Double) {
            m8511y.m8522a(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            aVar.m8460a(i, m8511y);
        } else {
            aVar.m8463a(m8511y);
        }
    }

    /* renamed from: a */
    private static void m9815a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: a */
    private final void m9816a(StringBuilder sb, int i, C1252e0 c1252e0) {
        if (c1252e0 == null) {
            return;
        }
        m9815a(sb, i);
        sb.append("filter {\n");
        if (c1252e0.m7780s()) {
            m9819a(sb, i, "complement", Boolean.valueOf(c1252e0.m7781t()));
        }
        if (!C1337ja.m7940a() || !m9326m().m9480a(C1828o.f7847Y0) || c1252e0.m7782u()) {
            m9819a(sb, i, "param_name", m9319f().m9121b(c1252e0.m7783v()));
        }
        if (!C1337ja.m7940a() || !m9326m().m9480a(C1828o.f7847Y0) || c1252e0.zza()) {
            int i2 = i + 1;
            C1297h0 m7777p = c1252e0.m7777p();
            if (m7777p != null) {
                m9815a(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (m7777p.zza()) {
                    m9819a(sb, i2, "match_type", m7777p.m7860p().name());
                }
                if (!C1337ja.m7940a() || !m9326m().m9480a(C1828o.f7847Y0) || m7777p.m7861q()) {
                    m9819a(sb, i2, "expression", m7777p.m7862r());
                }
                if (m7777p.m7863s()) {
                    m9819a(sb, i2, "case_sensitive", Boolean.valueOf(m7777p.m7864t()));
                }
                if (m7777p.m7866v() > 0) {
                    m9815a(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str : m7777p.m7865u()) {
                        m9815a(sb, i2 + 2);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m9815a(sb, i2);
                sb.append("}\n");
            }
        }
        if (!C1337ja.m7940a() || !m9326m().m9480a(C1828o.f7847Y0) || c1252e0.m7778q()) {
            m9817a(sb, i + 1, "number_filter", c1252e0.m7779r());
        }
        m9815a(sb, i);
        sb.append("}\n");
    }

    /* renamed from: a */
    private final void m9817a(StringBuilder sb, int i, String str, C1267f0 c1267f0) {
        if (c1267f0 == null) {
            return;
        }
        m9815a(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (c1267f0.zza()) {
            m9819a(sb, i, "comparison_type", c1267f0.m7806p().name());
        }
        if (c1267f0.m7807q()) {
            m9819a(sb, i, "match_as_float", Boolean.valueOf(c1267f0.m7808r()));
        }
        if (!C1337ja.m7940a() || !m9326m().m9480a(C1828o.f7847Y0) || c1267f0.m7809s()) {
            m9819a(sb, i, "comparison_value", c1267f0.m7810t());
        }
        if (!C1337ja.m7940a() || !m9326m().m9480a(C1828o.f7847Y0) || c1267f0.m7811u()) {
            m9819a(sb, i, "min_comparison_value", c1267f0.m7812v());
        }
        if (!C1337ja.m7940a() || !m9326m().m9480a(C1828o.f7847Y0) || c1267f0.m7813w()) {
            m9819a(sb, i, "max_comparison_value", c1267f0.m7814x());
        }
        m9815a(sb, i);
        sb.append("}\n");
    }

    /* renamed from: a */
    private static void m9818a(StringBuilder sb, int i, String str, C1556z0 c1556z0, String str2) {
        if (c1556z0 == null) {
            return;
        }
        m9815a(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c1556z0.m8917r() != 0) {
            m9815a(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : c1556z0.m8916q()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (c1556z0.m8915p() != 0) {
            m9815a(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : c1556z0.zza()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (c1556z0.m8919t() != 0) {
            m9815a(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (C1458s0 c1458s0 : c1556z0.m8918s()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(c1458s0.zza() ? Integer.valueOf(c1458s0.m8363p()) : null);
                sb.append(":");
                sb.append(c1458s0.m8364q() ? Long.valueOf(c1458s0.m8365r()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (c1556z0.m8921v() != 0) {
            m9815a(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (C1193a1 c1193a1 : c1556z0.m8920u()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(c1193a1.zza() ? Integer.valueOf(c1193a1.m7520p()) : null);
                sb.append(": [");
                Iterator<Long> it = c1193a1.m7521q().iterator();
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
        m9815a(sb, 3);
        sb.append("}\n");
    }

    /* renamed from: a */
    private static void m9819a(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m9815a(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* renamed from: a */
    private final void m9820a(StringBuilder sb, int i, List<C1500v0> list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        for (C1500v0 c1500v0 : list) {
            if (c1500v0 != null) {
                m9815a(sb, i2);
                sb.append("param {\n");
                if (C1246d9.m7769a() && m9326m().m9480a(C1828o.f7849Z0)) {
                    m9819a(sb, i2, "name", c1500v0.zza() ? m9319f().m9121b(c1500v0.m8513p()) : null);
                    m9819a(sb, i2, "string_value", c1500v0.m8514q() ? c1500v0.m8515r() : null);
                    m9819a(sb, i2, "int_value", c1500v0.m8516s() ? Long.valueOf(c1500v0.m8517t()) : null);
                    m9819a(sb, i2, "double_value", c1500v0.m8518u() ? Double.valueOf(c1500v0.m8519v()) : null);
                    if (c1500v0.m8521x() > 0) {
                        m9820a(sb, i2, c1500v0.m8520w());
                    }
                } else {
                    m9819a(sb, i2, "name", m9319f().m9121b(c1500v0.m8513p()));
                    m9819a(sb, i2, "string_value", c1500v0.m8515r());
                    m9819a(sb, i2, "int_value", c1500v0.m8516s() ? Long.valueOf(c1500v0.m8517t()) : null);
                    m9819a(sb, i2, "double_value", c1500v0.m8518u() ? Double.valueOf(c1500v0.m8519v()) : null);
                }
                m9815a(sb, i2);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m9821a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m9822a(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Object m9823b(C1472t0 c1472t0, String str) {
        C1500v0 m9811a = m9811a(c1472t0, str);
        if (m9811a == null) {
            return null;
        }
        if (m9811a.m8514q()) {
            return m9811a.m8515r();
        }
        if (m9811a.m8516s()) {
            return Long.valueOf(m9811a.m8517t());
        }
        if (m9811a.m8518u()) {
            return Double.valueOf(m9811a.m8519v());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final long m9824a(byte[] bArr) {
        C1057u.m7286a(bArr);
        m9322i().mo9194c();
        MessageDigest m9929y = C1959z9.m9929y();
        if (m9929y != null) {
            return C1959z9.m9906a(m9929y.digest(bArr));
        }
        mo9324k().m9309t().m9365a("Failed to get MD5");
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T extends Parcelable> T m9825a(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (C1052a.a unused) {
            mo9324k().m9309t().m9365a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m9826a(C1237d0 c1237d0) {
        if (c1237d0 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (c1237d0.zza()) {
            m9819a(sb, 0, "filter_id", Integer.valueOf(c1237d0.m7711p()));
        }
        m9819a(sb, 0, "event_name", m9319f().m9120a(c1237d0.m7712q()));
        String m9812a = m9812a(c1237d0.m7717v(), c1237d0.m7718w(), c1237d0.m7720y());
        if (!m9812a.isEmpty()) {
            m9819a(sb, 0, "filter_type", m9812a);
        }
        if (!C1337ja.m7940a() || !m9326m().m9480a(C1828o.f7847Y0) || c1237d0.m7715t()) {
            m9817a(sb, 1, "event_count_filter", c1237d0.m7716u());
        }
        if (!C1337ja.m7940a() || !m9326m().m9480a(C1828o.f7847Y0) || c1237d0.m7714s() > 0) {
            sb.append("  filters {\n");
            Iterator<C1252e0> it = c1237d0.m7713r().iterator();
            while (it.hasNext()) {
                m9816a(sb, 2, it.next());
            }
        }
        m9815a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m9827a(C1282g0 c1282g0) {
        if (c1282g0 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (c1282g0.zza()) {
            m9819a(sb, 0, "filter_id", Integer.valueOf(c1282g0.m7838p()));
        }
        m9819a(sb, 0, "property_name", m9319f().m9122c(c1282g0.m7839q()));
        String m9812a = m9812a(c1282g0.m7841s(), c1282g0.m7842t(), c1282g0.m7844v());
        if (!m9812a.isEmpty()) {
            m9819a(sb, 0, "filter_type", m9812a);
        }
        m9816a(sb, 1, c1282g0.m7840r());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m9828a(C1514w0 c1514w0) {
        if (c1514w0 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C1528x0 c1528x0 : c1514w0.zza()) {
            if (c1528x0 != null) {
                m9815a(sb, 1);
                sb.append("bundle {\n");
                if (c1528x0.zza()) {
                    m9819a(sb, 1, "protocol_version", Integer.valueOf(c1528x0.m8761P()));
                }
                m9819a(sb, 1, "platform", c1528x0.m8785j0());
                if (c1528x0.m8794q0()) {
                    m9819a(sb, 1, "gmp_version", Long.valueOf(c1528x0.m8791p()));
                }
                if (c1528x0.m8793q()) {
                    m9819a(sb, 1, "uploading_gmp_version", Long.valueOf(c1528x0.m8795r()));
                }
                if (c1528x0.m8764S()) {
                    m9819a(sb, 1, "dynamite_version", Long.valueOf(c1528x0.m8765T()));
                }
                if (c1528x0.m8755J()) {
                    m9819a(sb, 1, "config_version", Long.valueOf(c1528x0.m8756K()));
                }
                m9819a(sb, 1, "gmp_app_id", c1528x0.m8747B());
                m9819a(sb, 1, "admob_app_id", c1528x0.m8763R());
                m9819a(sb, 1, "app_id", c1528x0.m8790o0());
                m9819a(sb, 1, "app_version", c1528x0.m8792p0());
                if (c1528x0.m8752G()) {
                    m9819a(sb, 1, "app_version_major", Integer.valueOf(c1528x0.m8753H()));
                }
                m9819a(sb, 1, "firebase_instance_id", c1528x0.m8751F());
                if (c1528x0.m8800w()) {
                    m9819a(sb, 1, "dev_cert_hash", Long.valueOf(c1528x0.m8801x()));
                }
                m9819a(sb, 1, "app_store", c1528x0.m8789n0());
                if (c1528x0.m8771Z()) {
                    m9819a(sb, 1, "upload_timestamp_millis", Long.valueOf(c1528x0.m8772a0()));
                }
                if (c1528x0.m8774b0()) {
                    m9819a(sb, 1, "start_timestamp_millis", Long.valueOf(c1528x0.m8776c0()));
                }
                if (c1528x0.m8778d0()) {
                    m9819a(sb, 1, "end_timestamp_millis", Long.valueOf(c1528x0.m8779e0()));
                }
                if (c1528x0.m8780f0()) {
                    m9819a(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c1528x0.m8781g0()));
                }
                if (c1528x0.m8782h0()) {
                    m9819a(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c1528x0.m8784i0()));
                }
                m9819a(sb, 1, "app_instance_id", c1528x0.m8799v());
                m9819a(sb, 1, "resettable_device_id", c1528x0.m8796s());
                m9819a(sb, 1, "device_id", c1528x0.m8754I());
                m9819a(sb, 1, "ds_id", c1528x0.m8759N());
                if (c1528x0.m8797t()) {
                    m9819a(sb, 1, "limited_ad_tracking", Boolean.valueOf(c1528x0.m8798u()));
                }
                m9819a(sb, 1, "os_version", c1528x0.m8786k0());
                m9819a(sb, 1, "device_model", c1528x0.m8787l0());
                m9819a(sb, 1, "user_default_language", c1528x0.m8788m0());
                if (c1528x0.m8777d()) {
                    m9819a(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c1528x0.m8783i()));
                }
                if (c1528x0.m8802y()) {
                    m9819a(sb, 1, "bundle_sequential_index", Integer.valueOf(c1528x0.m8803z()));
                }
                if (c1528x0.m8748C()) {
                    m9819a(sb, 1, "service_upload", Boolean.valueOf(c1528x0.m8749D()));
                }
                m9819a(sb, 1, "health_monitor", c1528x0.m8746A());
                if (c1528x0.m8757L() && c1528x0.m8758M() != 0) {
                    m9819a(sb, 1, "android_id", Long.valueOf(c1528x0.m8758M()));
                }
                if (c1528x0.m8760O()) {
                    m9819a(sb, 1, "retry_counter", Integer.valueOf(c1528x0.m8762Q()));
                }
                List<C1208b1> m8769X = c1528x0.m8769X();
                if (m8769X != null) {
                    for (C1208b1 c1208b1 : m8769X) {
                        if (c1208b1 != null) {
                            m9815a(sb, 2);
                            sb.append("user_property {\n");
                            m9819a(sb, 2, "set_timestamp_millis", c1208b1.zza() ? Long.valueOf(c1208b1.m7559p()) : null);
                            m9819a(sb, 2, "name", m9319f().m9122c(c1208b1.m7560q()));
                            m9819a(sb, 2, "string_value", c1208b1.m7562s());
                            m9819a(sb, 2, "int_value", c1208b1.m7563t() ? Long.valueOf(c1208b1.m7564u()) : null);
                            m9819a(sb, 2, "double_value", c1208b1.m7565v() ? Double.valueOf(c1208b1.m7566w()) : null);
                            m9815a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C1444r0> m8750E = c1528x0.m8750E();
                String m8790o0 = c1528x0.m8790o0();
                if (m8750E != null) {
                    for (C1444r0 c1444r0 : m8750E) {
                        if (c1444r0 != null) {
                            m9815a(sb, 2);
                            sb.append("audience_membership {\n");
                            if (c1444r0.zza()) {
                                m9819a(sb, 2, "audience_id", Integer.valueOf(c1444r0.m8274p()));
                            }
                            if (c1444r0.m8278t()) {
                                m9819a(sb, 2, "new_audience", Boolean.valueOf(c1444r0.m8279u()));
                            }
                            m9818a(sb, 2, "current_data", c1444r0.m8275q(), m8790o0);
                            if (!C1337ja.m7940a() || !m9326m().m9480a(C1828o.f7847Y0) || c1444r0.m8276r()) {
                                m9818a(sb, 2, "previous_data", c1444r0.m8277s(), m8790o0);
                            }
                            m9815a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C1472t0> m8767V = c1528x0.m8767V();
                if (m8767V != null) {
                    for (C1472t0 c1472t0 : m8767V) {
                        if (c1472t0 != null) {
                            m9815a(sb, 2);
                            sb.append("event {\n");
                            m9819a(sb, 2, "name", m9319f().m9120a(c1472t0.m8453q()));
                            if (c1472t0.m8454r()) {
                                m9819a(sb, 2, "timestamp_millis", Long.valueOf(c1472t0.m8455s()));
                            }
                            if (c1472t0.m8456t()) {
                                m9819a(sb, 2, "previous_timestamp_millis", Long.valueOf(c1472t0.m8457u()));
                            }
                            if (c1472t0.m8458v()) {
                                m9819a(sb, 2, "count", Integer.valueOf(c1472t0.m8459w()));
                            }
                            if (c1472t0.m8452p() != 0) {
                                m9820a(sb, 2, c1472t0.zza());
                            }
                            m9815a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m9815a(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<Long> m9829a(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                mo9324k().m9312w().m9366a("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    mo9324k().m9312w().m9367a("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
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
    /* renamed from: a */
    public final void m9830a(C1208b1.a aVar, Object obj) {
        C1057u.m7286a(obj);
        aVar.zza();
        aVar.m7572n();
        aVar.m7573o();
        if (obj instanceof String) {
            aVar.m7571b((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.m7570b(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.m7567a(((Double) obj).doubleValue());
        } else {
            mo9324k().m9309t().m9366a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9831a(C1500v0.a aVar, Object obj) {
        C1057u.m7286a(obj);
        aVar.zza();
        aVar.m8526n();
        aVar.m8527o();
        if (obj instanceof String) {
            aVar.m8525b((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.m8523a(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.m8522a(((Double) obj).doubleValue());
        } else {
            mo9324k().m9309t().m9366a("Ignoring invalid (type) event param value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m9832a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo9321h().mo7375a() - j) > j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m9833a(zzan zzanVar, zzm zzmVar) {
        C1057u.m7286a(zzanVar);
        C1057u.m7286a(zzmVar);
        if (C1466s8.m8428a() && m9326m().m9480a(C1828o.f7825N0)) {
            return (TextUtils.isEmpty(zzmVar.f8232c) && TextUtils.isEmpty(zzmVar.f8248s)) ? false : true;
        }
        if (!TextUtils.isEmpty(zzmVar.f8232c) || !TextUtils.isEmpty(zzmVar.f8248s)) {
            return true;
        }
        mo9317d();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte[] m9834b(byte[] bArr) {
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
            mo9324k().m9309t().m9366a("Failed to ungzip content", e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final byte[] m9835c(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo9324k().m9309t().m9366a("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1849p9
    /* renamed from: t */
    protected final boolean mo9129t() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final List<Integer> m9836u() {
        Map<String, String> m9560a = C1828o.m9560a(this.f7776b.mo9325l());
        if (m9560a == null || m9560a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = C1828o.f7822M.m9875a(null).intValue();
        for (Map.Entry<String, String> entry : m9560a.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            mo9324k().m9312w().m9366a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    mo9324k().m9312w().m9366a("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }
}
