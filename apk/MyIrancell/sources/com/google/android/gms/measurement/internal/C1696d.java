package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.internal.measurement.AbstractC1406o4;
import com.google.android.gms.internal.measurement.C1218bb;
import com.google.android.gms.internal.measurement.C1222c0;
import com.google.android.gms.internal.measurement.C1237d0;
import com.google.android.gms.internal.measurement.C1252e0;
import com.google.android.gms.internal.measurement.C1282g0;
import com.google.android.gms.internal.measurement.C1337ja;
import com.google.android.gms.internal.measurement.C1472t0;
import com.google.android.gms.internal.measurement.C1500v0;
import com.google.android.gms.internal.measurement.C1528x0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.C0500c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.d */
/* loaded from: classes.dex */
public final class C1696d extends AbstractC1849p9 {

    /* renamed from: f */
    private static final String[] f7443f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    private static final String[] f7444g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h */
    private static final String[] f7445h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};

    /* renamed from: i */
    private static final String[] f7446i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j */
    private static final String[] f7447j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k */
    private static final String[] f7448k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l */
    private static final String[] f7449l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m */
    private static final String[] f7450m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    private final C1708e f7451d;

    /* renamed from: e */
    private final C1802l9 f7452e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1696d(C1838o9 c1838o9) {
        super(c1838o9);
        this.f7452e = new C1802l9(mo9321h());
        this.f7451d = new C1708e(this, mo9325l(), "google_app_measurement.db");
    }

    /* renamed from: O */
    private final boolean m9138O() {
        return mo9325l().getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: a */
    private final long m9139a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = m9188v().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                mo9324k().m9309t().m9367a("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: a */
    private final Object m9141a(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            mo9324k().m9309t().m9365a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            mo9324k().m9309t().m9366a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        mo9324k().m9309t().m9365a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* renamed from: a */
    private static void m9142a(ContentValues contentValues, String str, Object obj) {
        C1057u.m7296b(str);
        C1057u.m7286a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (Double) obj);
        }
    }

    /* renamed from: a */
    private final boolean m9143a(String str, int i, C1237d0 c1237d0) {
        m9755r();
        mo9194c();
        C1057u.m7296b(str);
        C1057u.m7286a(c1237d0);
        if (TextUtils.isEmpty(c1237d0.m7712q())) {
            mo9324k().m9312w().m9368a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", C1725f4.m9298a(str), Integer.valueOf(i), String.valueOf(c1237d0.zza() ? Integer.valueOf(c1237d0.m7711p()) : null));
            return false;
        }
        byte[] m8880e = c1237d0.m8880e();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", c1237d0.zza() ? Integer.valueOf(c1237d0.m7711p()) : null);
        contentValues.put("event_name", c1237d0.m7712q());
        if (m9326m().m9488e(str, C1828o.f7873l0)) {
            contentValues.put("session_scoped", c1237d0.m7719x() ? Boolean.valueOf(c1237d0.m7720y()) : null);
        }
        contentValues.put("data", m8880e);
        try {
            if (m9188v().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            mo9324k().m9309t().m9366a("Failed to insert event filter (got -1). appId", C1725f4.m9298a(str));
            return true;
        } catch (SQLiteException e) {
            mo9324k().m9309t().m9367a("Error storing event filter. appId", C1725f4.m9298a(str), e);
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m9144a(String str, int i, C1282g0 c1282g0) {
        m9755r();
        mo9194c();
        C1057u.m7296b(str);
        C1057u.m7286a(c1282g0);
        if (TextUtils.isEmpty(c1282g0.m7839q())) {
            mo9324k().m9312w().m9368a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", C1725f4.m9298a(str), Integer.valueOf(i), String.valueOf(c1282g0.zza() ? Integer.valueOf(c1282g0.m7838p()) : null));
            return false;
        }
        byte[] m8880e = c1282g0.m8880e();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", c1282g0.zza() ? Integer.valueOf(c1282g0.m7838p()) : null);
        contentValues.put("property_name", c1282g0.m7839q());
        if (m9326m().m9488e(str, C1828o.f7873l0)) {
            contentValues.put("session_scoped", c1282g0.m7843u() ? Boolean.valueOf(c1282g0.m7844v()) : null);
        }
        contentValues.put("data", m8880e);
        try {
            if (m9188v().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            mo9324k().m9309t().m9366a("Failed to insert property filter (got -1). appId", C1725f4.m9298a(str));
            return false;
        } catch (SQLiteException e) {
            mo9324k().m9309t().m9367a("Error storing property filter. appId", C1725f4.m9298a(str), e);
            return false;
        }
    }

    /* renamed from: b */
    private final long m9145b(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = m9188v().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j;
            } catch (SQLiteException e) {
                mo9324k().m9309t().m9367a("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: c */
    private final boolean m9146c(String str, List<Integer> list) {
        C1057u.m7296b(str);
        m9755r();
        mo9194c();
        SQLiteDatabase m9188v = m9188v();
        try {
            long m9145b = m9145b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, m9326m().m9481b(str, C1828o.f7808F)));
            if (m9145b <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return m9188v.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            mo9324k().m9309t().m9367a("Database error querying filters. appId", C1725f4.m9298a(str), e);
            return false;
        }
    }

    /* renamed from: A */
    public final boolean m9147A() {
        return m9145b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final void m9148B() {
        int delete;
        mo9194c();
        m9755r();
        if (m9138O()) {
            long m9792a = m9323j().f8026h.m9792a();
            long mo7376b = mo9321h().mo7376b();
            if (Math.abs(mo7376b - m9792a) > C1828o.f7898y.m9875a(null).longValue()) {
                m9323j().f8026h.m9793a(mo7376b);
                mo9194c();
                m9755r();
                if (!m9138O() || (delete = m9188v().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo9321h().mo7375a()), String.valueOf(C1803la.m9473v())})) <= 0) {
                    return;
                }
                mo9324k().m9304B().m9366a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    /* renamed from: C */
    public final long m9149C() {
        return m9139a("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    /* renamed from: D */
    public final long m9150D() {
        return m9139a("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    /* renamed from: E */
    public final boolean m9151E() {
        return m9145b("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* renamed from: F */
    public final boolean m9152F() {
        return m9145b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: a */
    public final long m9153a(C1528x0 c1528x0) {
        mo9194c();
        m9755r();
        C1057u.m7286a(c1528x0);
        C1057u.m7296b(c1528x0.m8790o0());
        byte[] m8880e = c1528x0.m8880e();
        long m9824a = m9503n().m9824a(m8880e);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c1528x0.m8790o0());
        contentValues.put("metadata_fingerprint", Long.valueOf(m9824a));
        contentValues.put("metadata", m8880e);
        try {
            m9188v().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return m9824a;
        } catch (SQLiteException e) {
            mo9324k().m9309t().m9367a("Error storing raw event metadata. appId", C1725f4.m9298a(c1528x0.m8790o0()), e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0090: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x0090 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.C1472t0, java.lang.Long> m9154a(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.mo9194c()
            r7.m9755r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.m9188v()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            if (r2 != 0) goto L37
            com.google.android.gms.measurement.internal.f4 r8 = r7.mo9324k()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.h4 r8 = r8.m9304B()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            java.lang.String r9 = "Main event not found"
            r8.m9365a(r9)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.internal.measurement.t0$a r4 = com.google.android.gms.internal.measurement.C1472t0.m8448x()     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.C1915v9.m9810a(r4, r2)     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.internal.measurement.t0$a r4 = (com.google.android.gms.internal.measurement.C1472t0.a) r4     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.internal.measurement.x5 r2 = r4.mo7537i()     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.internal.measurement.o4 r2 = (com.google.android.gms.internal.measurement.AbstractC1406o4) r2     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.internal.measurement.t0 r2 = (com.google.android.gms.internal.measurement.C1472t0) r2     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            if (r1 == 0) goto L5d
            r1.close()
        L5d:
            return r8
        L5e:
            r2 = move-exception
            com.google.android.gms.measurement.internal.f4 r3 = r7.mo9324k()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.h4 r3 = r3.m9309t()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1725f4.m9298a(r8)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            r3.m9368a(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            if (r1 == 0) goto L75
            r1.close()
        L75:
            return r0
        L76:
            r8 = move-exception
            goto L7c
        L78:
            r8 = move-exception
            goto L91
        L7a:
            r8 = move-exception
            r1 = r0
        L7c:
            com.google.android.gms.measurement.internal.f4 r9 = r7.mo9324k()     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.h4 r9 = r9.m9309t()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = "Error selecting main event"
            r9.m9366a(r2, r8)     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8e
            r1.close()
        L8e:
            return r0
        L8f:
            r8 = move-exception
            r0 = r1
        L91:
            if (r0 == 0) goto L96
            r0.close()
        L96:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9154a(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x012a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C1684c m9155a(long r22, java.lang.String r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9155a(long, java.lang.String, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.c");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C1780k m9156a(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9156a(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.k");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m9157a(long r5) {
        /*
            r4 = this;
            r4.mo9194c()
            r4.m9755r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.m9188v()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r1 != 0) goto L34
            com.google.android.gms.measurement.internal.f4 r6 = r4.mo9324k()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.h4 r6 = r6.m9304B()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.m9365a(r1)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L33
            r5.close()
        L33:
            return r0
        L34:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L3d
            r5.close()
        L3d:
            return r6
        L3e:
            r6 = move-exception
            goto L44
        L40:
            r6 = move-exception
            goto L59
        L42:
            r6 = move-exception
            r5 = r0
        L44:
            com.google.android.gms.measurement.internal.f4 r1 = r4.mo9324k()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.h4 r1 = r1.m9309t()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "Error selecting expired configs"
            r1.m9366a(r2, r6)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L56
            r5.close()
        L56:
            return r0
        L57:
            r6 = move-exception
            r0 = r5
        L59:
            if (r0 == 0) goto L5e
            r0.close()
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9157a(long):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.C1926w9> m9158a(java.lang.String r23) {
        /*
            r22 = this;
            com.google.android.gms.common.internal.C1057u.m7296b(r23)
            r22.mo9194c()
            r22.m9755r()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r22.m9188v()     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            r6[r11] = r23     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L8d android.database.sqlite.SQLiteException -> L91
            if (r3 != 0) goto L48
            if (r2 == 0) goto L47
            r2.close()
        L47:
            return r0
        L48:
            java.lang.String r18 = r2.getString(r11)     // Catch: java.lang.Throwable -> L8d android.database.sqlite.SQLiteException -> L91
            java.lang.String r3 = r2.getString(r12)     // Catch: java.lang.Throwable -> L8d android.database.sqlite.SQLiteException -> L91
            if (r3 != 0) goto L54
            java.lang.String r3 = ""
        L54:
            r17 = r3
            long r19 = r2.getLong(r13)     // Catch: java.lang.Throwable -> L8d android.database.sqlite.SQLiteException -> L91
            r3 = r22
            java.lang.Object r21 = r3.m9141a(r2, r14)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            if (r21 != 0) goto L74
            com.google.android.gms.measurement.internal.f4 r4 = r22.mo9324k()     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            com.google.android.gms.measurement.internal.h4 r4 = r4.m9309t()     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            java.lang.String r5 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1725f4.m9298a(r23)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            r4.m9366a(r5, r6)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            goto L7f
        L74:
            com.google.android.gms.measurement.internal.w9 r4 = new com.google.android.gms.measurement.internal.w9     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            r15 = r4
            r16 = r23
            r15.<init>(r16, r17, r18, r19, r21)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            r0.add(r4)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
        L7f:
            boolean r4 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            if (r4 != 0) goto L48
            if (r2 == 0) goto L8a
            r2.close()
        L8a:
            return r0
        L8b:
            r0 = move-exception
            goto L9d
        L8d:
            r0 = move-exception
            r3 = r22
            goto Lb5
        L91:
            r0 = move-exception
            r3 = r22
            goto L9d
        L95:
            r0 = move-exception
            r3 = r22
            goto Lb6
        L99:
            r0 = move-exception
            r3 = r22
            r2 = r1
        L9d:
            com.google.android.gms.measurement.internal.f4 r4 = r22.mo9324k()     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.measurement.internal.h4 r4 = r4.m9309t()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = "Error querying user properties. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1725f4.m9298a(r23)     // Catch: java.lang.Throwable -> Lb4
            r4.m9367a(r5, r6, r0)     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto Lb3
            r2.close()
        Lb3:
            return r1
        Lb4:
            r0 = move-exception
        Lb5:
            r1 = r2
        Lb6:
            if (r1 == 0) goto Lbb
            r1.close()
        Lbb:
            goto Lbd
        Lbc:
            throw r0
        Lbd:
            goto Lbc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9158a(java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd A[EDGE_INSN: B:40:0x00cd->B:26:0x00cd BREAK  A[LOOP:0: B:17:0x005c->B:39:?], SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.C1528x0, java.lang.Long>> m9159a(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9159a(java.lang.String, int, int):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x009a, code lost:
    
        mo9324k().m9309t().m9366a("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.C1926w9> m9160a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9160a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        mo9324k().m9309t().m9366a("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0175  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzv> m9161a(java.lang.String r40, java.lang.String[] r41) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9161a(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> m9162a(java.lang.String r14, java.util.List<java.lang.String> r15) {
        /*
            r13 = this;
            r13.m9755r()
            r13.mo9194c()
            com.google.android.gms.common.internal.C1057u.m7296b(r14)
            com.google.android.gms.common.internal.C1057u.m7286a(r15)
            c0 r0 = new c0
            r0.<init>()
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L18
            return r0
        L18:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "app_id=? AND property_name in ("
            r1.append(r2)
            r2 = 0
            r3 = 0
        L24:
            int r4 = r15.size()
            if (r3 >= r4) goto L39
            if (r3 <= 0) goto L31
            java.lang.String r4 = ","
            r1.append(r4)
        L31:
            java.lang.String r4 = "?"
            r1.append(r4)
            int r3 = r3 + 1
            goto L24
        L39:
            java.lang.String r3 = ")"
            r1.append(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r15)
            r3.add(r2, r14)
            android.database.sqlite.SQLiteDatabase r4 = r13.m9188v()
            r15 = 0
            java.lang.String r5 = "property_filters"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            java.lang.String r7 = "audience_id"
            r6[r2] = r7     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            java.lang.String r7 = "filter_id"
            r12 = 1
            r6[r12] = r7     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            java.lang.Object[] r1 = r3.toArray(r1)     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            r8 = r1
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            boolean r3 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            if (r3 != 0) goto L79
            if (r1 == 0) goto L78
            r1.close()
        L78:
            return r0
        L79:
            int r3 = r1.getInt(r2)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            java.lang.Object r4 = r0.get(r4)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            java.util.List r4 = (java.util.List) r4     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            if (r4 != 0) goto L95
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            r0.put(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
        L95:
            int r3 = r1.getInt(r12)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            r4.add(r3)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            if (r3 != 0) goto L79
            if (r1 == 0) goto Lab
            r1.close()
        Lab:
            return r0
        Lac:
            r0 = move-exception
            goto Lb2
        Lae:
            r14 = move-exception
            goto Lcb
        Lb0:
            r0 = move-exception
            r1 = r15
        Lb2:
            com.google.android.gms.measurement.internal.f4 r2 = r13.mo9324k()     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.measurement.internal.h4 r2 = r2.m9309t()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = "Database error querying filters. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C1725f4.m9298a(r14)     // Catch: java.lang.Throwable -> Lc9
            r2.m9367a(r3, r14, r0)     // Catch: java.lang.Throwable -> Lc9
            if (r1 == 0) goto Lc8
            r1.close()
        Lc8:
            return r15
        Lc9:
            r14 = move-exception
            r15 = r1
        Lcb:
            if (r15 == 0) goto Ld0
            r15.close()
        Ld0:
            goto Ld2
        Ld1:
            throw r14
        Ld2:
            goto Ld1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9162a(java.lang.String, java.util.List):java.util.Map");
    }

    /* renamed from: a */
    public final void m9163a(C1714e5 c1714e5) {
        C1057u.m7286a(c1714e5);
        mo9194c();
        m9755r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c1714e5.m9269l());
        contentValues.put("app_instance_id", c1714e5.m9271m());
        contentValues.put("gmp_app_id", c1714e5.m9273n());
        contentValues.put("resettable_device_id_hash", c1714e5.m9279q());
        contentValues.put("last_bundle_index", Long.valueOf(c1714e5.m9225B()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c1714e5.m9281s()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c1714e5.m9282t()));
        contentValues.put("app_version", c1714e5.m9283u());
        contentValues.put("app_store", c1714e5.m9285w());
        contentValues.put("gmp_version", Long.valueOf(c1714e5.m9286x()));
        contentValues.put("dev_cert_hash", Long.valueOf(c1714e5.m9287y()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c1714e5.m9224A()));
        contentValues.put("day", Long.valueOf(c1714e5.m9229F()));
        contentValues.put("daily_public_events_count", Long.valueOf(c1714e5.m9230G()));
        contentValues.put("daily_events_count", Long.valueOf(c1714e5.m9231H()));
        contentValues.put("daily_conversions_count", Long.valueOf(c1714e5.m9232I()));
        contentValues.put("config_fetched_time", Long.valueOf(c1714e5.m9226C()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c1714e5.m9227D()));
        contentValues.put("app_version_int", Long.valueOf(c1714e5.m9284v()));
        contentValues.put("firebase_instance_id", c1714e5.m9280r());
        contentValues.put("daily_error_events_count", Long.valueOf(c1714e5.m9243c()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c1714e5.m9239b()));
        contentValues.put("health_monitor_sample", c1714e5.m9247d());
        contentValues.put("android_id", Long.valueOf(c1714e5.m9253f()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c1714e5.m9258g()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(c1714e5.m9261h()));
        contentValues.put("admob_app_id", c1714e5.m9275o());
        contentValues.put("dynamite_version", Long.valueOf(c1714e5.m9288z()));
        if (c1714e5.m9265j() != null) {
            if (c1714e5.m9265j().size() == 0) {
                mo9324k().m9312w().m9366a("Safelisted events should not be an empty list. appId", c1714e5.m9269l());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", c1714e5.m9265j()));
            }
        }
        if (C1218bb.m7671a() && m9326m().m9488e(c1714e5.m9269l(), C1828o.f7811G0)) {
            contentValues.put("ga_app_id", c1714e5.m9277p());
        }
        try {
            SQLiteDatabase m9188v = m9188v();
            if (m9188v.update("apps", contentValues, "app_id = ?", new String[]{c1714e5.m9269l()}) == 0 && m9188v.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                mo9324k().m9309t().m9366a("Failed to insert/update app (got -1). appId", C1725f4.m9298a(c1714e5.m9269l()));
            }
        } catch (SQLiteException e) {
            mo9324k().m9309t().m9367a("Error storing app. appId", C1725f4.m9298a(c1714e5.m9269l()), e);
        }
    }

    /* renamed from: a */
    public final void m9164a(C1780k c1780k) {
        C1057u.m7286a(c1780k);
        mo9194c();
        m9755r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c1780k.f7694a);
        contentValues.put("name", c1780k.f7695b);
        contentValues.put("lifetime_count", Long.valueOf(c1780k.f7696c));
        contentValues.put("current_bundle_count", Long.valueOf(c1780k.f7697d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c1780k.f7699f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c1780k.f7700g));
        contentValues.put("last_bundled_day", c1780k.f7701h);
        contentValues.put("last_sampled_complex_event_id", c1780k.f7702i);
        contentValues.put("last_sampling_rate", c1780k.f7703j);
        if (m9326m().m9488e(c1780k.f7694a, C1828o.f7875m0)) {
            contentValues.put("current_session_count", Long.valueOf(c1780k.f7698e));
        }
        Boolean bool = c1780k.f7704k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m9188v().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                mo9324k().m9309t().m9366a("Failed to insert/update event aggregates (got -1). appId", C1725f4.m9298a(c1780k.f7694a));
            }
        } catch (SQLiteException e) {
            mo9324k().m9309t().m9367a("Error storing event aggregates. appId", C1725f4.m9298a(c1780k.f7694a), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9165a(List<Long> list) {
        mo9194c();
        m9755r();
        C1057u.m7286a(list);
        C1057u.m7285a(list.size());
        if (m9138O()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m9145b(sb3.toString(), (String[]) null) > 0) {
                mo9324k().m9312w().m9365a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase m9188v = m9188v();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                m9188v.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                mo9324k().m9309t().m9366a("Error incrementing retry count. error", e);
            }
        }
    }

    /* renamed from: a */
    public final boolean m9166a(C1528x0 c1528x0, boolean z) {
        C1749h4 m9309t;
        Object m9298a;
        String str;
        ContentValues contentValues;
        mo9194c();
        m9755r();
        C1057u.m7286a(c1528x0);
        C1057u.m7296b(c1528x0.m8790o0());
        C1057u.m7297b(c1528x0.m8778d0());
        m9148B();
        long mo7375a = mo9321h().mo7375a();
        if (c1528x0.m8779e0() < mo7375a - C1803la.m9473v() || c1528x0.m8779e0() > C1803la.m9473v() + mo7375a) {
            mo9324k().m9312w().m9368a("Storing bundle outside of the max uploading time span. appId, now, timestamp", C1725f4.m9298a(c1528x0.m8790o0()), Long.valueOf(mo7375a), Long.valueOf(c1528x0.m8779e0()));
        }
        try {
            byte[] m9835c = m9503n().m9835c(c1528x0.m8880e());
            mo9324k().m9304B().m9366a("Saving bundle, size", Integer.valueOf(m9835c.length));
            contentValues = new ContentValues();
            contentValues.put("app_id", c1528x0.m8790o0());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c1528x0.m8779e0()));
            contentValues.put("data", m9835c);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (c1528x0.m8760O()) {
                contentValues.put("retry_count", Integer.valueOf(c1528x0.m8762Q()));
            }
        } catch (IOException e) {
            e = e;
            m9309t = mo9324k().m9309t();
            m9298a = C1725f4.m9298a(c1528x0.m8790o0());
            str = "Data loss. Failed to serialize bundle. appId";
        }
        try {
            if (m9188v().insert("queue", null, contentValues) != -1) {
                return true;
            }
            mo9324k().m9309t().m9366a("Failed to insert bundle (got -1). appId", C1725f4.m9298a(c1528x0.m8790o0()));
            return false;
        } catch (SQLiteException e2) {
            e = e2;
            m9309t = mo9324k().m9309t();
            m9298a = C1725f4.m9298a(c1528x0.m8790o0());
            str = "Error storing bundle. appId";
            m9309t.m9367a(str, m9298a, e);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean m9167a(C1792l c1792l, long j, boolean z) {
        mo9194c();
        m9755r();
        C1057u.m7286a(c1792l);
        C1057u.m7296b(c1792l.f7728a);
        C1472t0.a m8448x = C1472t0.m8448x();
        m8448x.m8469b(c1792l.f7732e);
        Iterator<String> it = c1792l.f7733f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            C1500v0.a m8511y = C1500v0.m8511y();
            m8511y.m8524a(next);
            m9503n().m9831a(m8511y, c1792l.f7733f.m9967a(next));
            m8448x.m8463a(m8511y);
        }
        byte[] m8880e = ((C1472t0) ((AbstractC1406o4) m8448x.mo7537i())).m8880e();
        if (!C1337ja.m7940a() || !m9326m().m9488e(c1792l.f7728a, C1828o.f7847Y0)) {
            mo9324k().m9304B().m9367a("Saving event, name, data size", m9319f().m9120a(c1792l.f7729b), Integer.valueOf(m8880e.length));
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c1792l.f7728a);
        contentValues.put("name", c1792l.f7729b);
        contentValues.put("timestamp", Long.valueOf(c1792l.f7731d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", m8880e);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (m9188v().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            mo9324k().m9309t().m9366a("Failed to insert raw event (got -1). appId", C1725f4.m9298a(c1792l.f7728a));
            return false;
        } catch (SQLiteException e) {
            mo9324k().m9309t().m9367a("Error storing raw event. appId", C1725f4.m9298a(c1792l.f7728a), e);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean m9168a(C1926w9 c1926w9) {
        C1057u.m7286a(c1926w9);
        mo9194c();
        m9755r();
        if (m9176c(c1926w9.f8149a, c1926w9.f8151c) == null) {
            if (C1959z9.m9925e(c1926w9.f8151c)) {
                if (m9145b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c1926w9.f8149a}) >= 25) {
                    return false;
                }
            } else if (m9326m().m9488e(c1926w9.f8149a, C1828o.f7851a0)) {
                if (!"_npa".equals(c1926w9.f8151c) && m9145b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c1926w9.f8149a, c1926w9.f8150b}) >= 25) {
                    return false;
                }
            } else if (m9145b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c1926w9.f8149a, c1926w9.f8150b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c1926w9.f8149a);
        contentValues.put("origin", c1926w9.f8150b);
        contentValues.put("name", c1926w9.f8151c);
        contentValues.put("set_timestamp", Long.valueOf(c1926w9.f8152d));
        m9142a(contentValues, "value", c1926w9.f8153e);
        try {
            if (m9188v().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                mo9324k().m9309t().m9366a("Failed to insert/update user property (got -1). appId", C1725f4.m9298a(c1926w9.f8149a));
            }
        } catch (SQLiteException e) {
            mo9324k().m9309t().m9367a("Error storing user property. appId", C1725f4.m9298a(c1926w9.f8149a), e);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m9169a(zzv zzvVar) {
        C1057u.m7286a(zzvVar);
        mo9194c();
        m9755r();
        if (m9176c(zzvVar.f8253b, zzvVar.f8255d.f8225c) == null && m9145b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzvVar.f8253b}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzvVar.f8253b);
        contentValues.put("origin", zzvVar.f8254c);
        contentValues.put("name", zzvVar.f8255d.f8225c);
        m9142a(contentValues, "value", zzvVar.f8255d.zza());
        contentValues.put("active", Boolean.valueOf(zzvVar.f8257f));
        contentValues.put("trigger_event_name", zzvVar.f8258g);
        contentValues.put("trigger_timeout", Long.valueOf(zzvVar.f8260i));
        m9322i();
        contentValues.put("timed_out_event", C1959z9.m9918a((Parcelable) zzvVar.f8259h));
        contentValues.put("creation_timestamp", Long.valueOf(zzvVar.f8256e));
        m9322i();
        contentValues.put("triggered_event", C1959z9.m9918a((Parcelable) zzvVar.f8261j));
        contentValues.put("triggered_timestamp", Long.valueOf(zzvVar.f8255d.f8226d));
        contentValues.put("time_to_live", Long.valueOf(zzvVar.f8262k));
        m9322i();
        contentValues.put("expired_event", C1959z9.m9918a((Parcelable) zzvVar.f8263l));
        try {
            if (m9188v().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                mo9324k().m9309t().m9366a("Failed to insert/update conditional user property (got -1)", C1725f4.m9298a(zzvVar.f8253b));
            }
        } catch (SQLiteException e) {
            mo9324k().m9309t().m9367a("Error storing conditional user property", C1725f4.m9298a(zzvVar.f8253b), e);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m9170a(String str, Long l, long j, C1472t0 c1472t0) {
        mo9194c();
        m9755r();
        C1057u.m7286a(c1472t0);
        C1057u.m7296b(str);
        C1057u.m7286a(l);
        byte[] m8880e = c1472t0.m8880e();
        mo9324k().m9304B().m9367a("Saving complex main event, appId, data size", m9319f().m9120a(str), Integer.valueOf(m8880e.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", m8880e);
        try {
            if (m9188v().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            mo9324k().m9309t().m9366a("Failed to insert complex main event (got -1). appId", C1725f4.m9298a(str));
            return false;
        } catch (SQLiteException e) {
            mo9324k().m9309t().m9367a("Error storing complex main event. appId", C1725f4.m9298a(str), e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f1 A[Catch: SQLiteException -> 0x026b, all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:15:0x00ea, B:17:0x0147, B:21:0x0151, B:24:0x019b, B:27:0x01d1, B:29:0x01dc, B:33:0x01e6, B:35:0x01f1, B:37:0x01f8, B:40:0x0213, B:42:0x021e, B:43:0x0230, B:45:0x0236, B:47:0x0242, B:48:0x024b, B:50:0x0254, B:55:0x020f, B:58:0x01cd, B:59:0x0196, B:62:0x027d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x021e A[Catch: SQLiteException -> 0x026b, all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:15:0x00ea, B:17:0x0147, B:21:0x0151, B:24:0x019b, B:27:0x01d1, B:29:0x01dc, B:33:0x01e6, B:35:0x01f1, B:37:0x01f8, B:40:0x0213, B:42:0x021e, B:43:0x0230, B:45:0x0236, B:47:0x0242, B:48:0x024b, B:50:0x0254, B:55:0x020f, B:58:0x01cd, B:59:0x0196, B:62:0x027d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0236 A[Catch: SQLiteException -> 0x026b, all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:15:0x00ea, B:17:0x0147, B:21:0x0151, B:24:0x019b, B:27:0x01d1, B:29:0x01dc, B:33:0x01e6, B:35:0x01f1, B:37:0x01f8, B:40:0x0213, B:42:0x021e, B:43:0x0230, B:45:0x0236, B:47:0x0242, B:48:0x024b, B:50:0x0254, B:55:0x020f, B:58:0x01cd, B:59:0x0196, B:62:0x027d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0254 A[Catch: SQLiteException -> 0x026b, all -> 0x0294, TRY_LEAVE, TryCatch #1 {all -> 0x0294, blocks: (B:15:0x00ea, B:17:0x0147, B:21:0x0151, B:24:0x019b, B:27:0x01d1, B:29:0x01dc, B:33:0x01e6, B:35:0x01f1, B:37:0x01f8, B:40:0x0213, B:42:0x021e, B:43:0x0230, B:45:0x0236, B:47:0x0242, B:48:0x024b, B:50:0x0254, B:55:0x020f, B:58:0x01cd, B:59:0x0196, B:62:0x027d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020f A[Catch: SQLiteException -> 0x026b, all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:15:0x00ea, B:17:0x0147, B:21:0x0151, B:24:0x019b, B:27:0x01d1, B:29:0x01dc, B:33:0x01e6, B:35:0x01f1, B:37:0x01f8, B:40:0x0213, B:42:0x021e, B:43:0x0230, B:45:0x0236, B:47:0x0242, B:48:0x024b, B:50:0x0254, B:55:0x020f, B:58:0x01cd, B:59:0x0196, B:62:0x027d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cd A[Catch: SQLiteException -> 0x026b, all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:15:0x00ea, B:17:0x0147, B:21:0x0151, B:24:0x019b, B:27:0x01d1, B:29:0x01dc, B:33:0x01e6, B:35:0x01f1, B:37:0x01f8, B:40:0x0213, B:42:0x021e, B:43:0x0230, B:45:0x0236, B:47:0x0242, B:48:0x024b, B:50:0x0254, B:55:0x020f, B:58:0x01cd, B:59:0x0196, B:62:0x027d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0196 A[Catch: SQLiteException -> 0x026b, all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:15:0x00ea, B:17:0x0147, B:21:0x0151, B:24:0x019b, B:27:0x01d1, B:29:0x01dc, B:33:0x01e6, B:35:0x01f1, B:37:0x01f8, B:40:0x0213, B:42:0x021e, B:43:0x0230, B:45:0x0236, B:47:0x0242, B:48:0x024b, B:50:0x0254, B:55:0x020f, B:58:0x01cd, B:59:0x0196, B:62:0x027d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0298  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C1714e5 m9171b(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9171b(java.lang.String):com.google.android.gms.measurement.internal.e5");
    }

    /* renamed from: b */
    public final List<zzv> m9172b(String str, String str2, String str3) {
        C1057u.m7296b(str);
        mo9194c();
        m9755r();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return m9161a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: b */
    public final void m9173b(String str, String str2) {
        C1749h4 m9309t;
        Object m9298a;
        String m9122c;
        String str3;
        C1057u.m7296b(str);
        C1057u.m7296b(str2);
        mo9194c();
        m9755r();
        try {
            int delete = m9188v().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
            if (C1337ja.m7940a() && this.f7776b.m9680b().m9488e(str, C1828o.f7847Y0)) {
                return;
            }
            mo9324k().m9304B().m9366a("Deleted user attribute rows", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            if (C1337ja.m7940a() && this.f7776b.m9680b().m9488e(str, C1828o.f7847Y0)) {
                m9309t = mo9324k().m9309t();
                m9298a = C1725f4.m9298a(str);
                m9122c = m9319f().m9122c(str2);
                str3 = "Error deleting user property. appId";
            } else {
                m9309t = mo9324k().m9309t();
                m9298a = C1725f4.m9298a(str);
                m9122c = m9319f().m9122c(str2);
                str3 = "Error deleting user attribute. appId";
            }
            m9309t.m9368a(str3, m9298a, m9122c, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m9174b(String str, List<C1222c0> list) {
        boolean z;
        C1749h4 m9312w;
        String str2;
        Object m9298a;
        Integer valueOf;
        boolean z2;
        C1057u.m7286a(list);
        for (int i = 0; i < list.size(); i++) {
            C1222c0.a m8099l = list.get(i).m8099l();
            if (m8099l.m7690n() != 0) {
                for (int i2 = 0; i2 < m8099l.m7690n(); i2++) {
                    C1237d0.a m8099l2 = m8099l.m7689b(i2).m8099l();
                    C1237d0.a aVar = (C1237d0.a) ((AbstractC1406o4.a) m8099l2.clone());
                    String m9430a = C1775j6.m9430a(m8099l2.zza());
                    if (m9430a != null) {
                        aVar.m7722a(m9430a);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < m8099l2.m7724n(); i3++) {
                        C1252e0 m7723a = m8099l2.m7723a(i3);
                        String m9378a = C1763i6.m9378a(m7723a.m7783v());
                        if (m9378a != null) {
                            C1252e0.a m8099l3 = m7723a.m8099l();
                            m8099l3.m7784a(m9378a);
                            aVar.m7721a(i3, (C1252e0) ((AbstractC1406o4) m8099l3.mo7537i()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        m8099l.m7686a(i2, aVar);
                        list.set(i, (C1222c0) ((AbstractC1406o4) m8099l.mo7537i()));
                    }
                }
            }
            if (m8099l.zza() != 0) {
                for (int i4 = 0; i4 < m8099l.zza(); i4++) {
                    C1282g0 m7688a = m8099l.m7688a(i4);
                    String m9467a = C1799l6.m9467a(m7688a.m7839q());
                    if (m9467a != null) {
                        C1282g0.a m8099l4 = m7688a.m8099l();
                        m8099l4.m7845a(m9467a);
                        m8099l.m7687a(i4, m8099l4);
                        list.set(i, (C1222c0) ((AbstractC1406o4) m8099l.mo7537i()));
                    }
                }
            }
        }
        m9755r();
        mo9194c();
        C1057u.m7296b(str);
        C1057u.m7286a(list);
        SQLiteDatabase m9188v = m9188v();
        m9188v.beginTransaction();
        try {
            m9755r();
            mo9194c();
            C1057u.m7296b(str);
            SQLiteDatabase m9188v2 = m9188v();
            m9188v2.delete("property_filters", "app_id=?", new String[]{str});
            m9188v2.delete("event_filters", "app_id=?", new String[]{str});
            for (C1222c0 c1222c0 : list) {
                m9755r();
                mo9194c();
                C1057u.m7296b(str);
                C1057u.m7286a(c1222c0);
                if (c1222c0.zza()) {
                    int m7681p = c1222c0.m7681p();
                    Iterator<C1237d0> it = c1222c0.m7684s().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zza()) {
                                m9312w = mo9324k().m9312w();
                                str2 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                m9298a = C1725f4.m9298a(str);
                                valueOf = Integer.valueOf(m7681p);
                                break;
                            }
                        } else {
                            Iterator<C1282g0> it2 = c1222c0.m7682q().iterator();
                            while (it2.hasNext()) {
                                if (!it2.next().zza()) {
                                    m9312w = mo9324k().m9312w();
                                    str2 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                    m9298a = C1725f4.m9298a(str);
                                    valueOf = Integer.valueOf(m7681p);
                                }
                            }
                            Iterator<C1237d0> it3 = c1222c0.m7684s().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (!m9143a(str, m7681p, it3.next())) {
                                        z = false;
                                        break;
                                    }
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                            if (z) {
                                Iterator<C1282g0> it4 = c1222c0.m7682q().iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (!m9144a(str, m7681p, it4.next())) {
                                            z = false;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                m9755r();
                                mo9194c();
                                C1057u.m7296b(str);
                                SQLiteDatabase m9188v3 = m9188v();
                                m9188v3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(m7681p)});
                                m9188v3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(m7681p)});
                            }
                        }
                    }
                    m9312w.m9367a(str2, m9298a, valueOf);
                    break;
                }
                mo9324k().m9312w().m9366a("Audience with no ID. appId", C1725f4.m9298a(str));
            }
            ArrayList arrayList = new ArrayList();
            for (C1222c0 c1222c02 : list) {
                arrayList.add(c1222c02.zza() ? Integer.valueOf(c1222c02.m7681p()) : null);
            }
            m9146c(str, arrayList);
            m9188v.setTransactionSuccessful();
        } finally {
            m9188v.endTransaction();
        }
    }

    /* renamed from: c */
    public final long m9175c(String str) {
        C1057u.m7296b(str);
        mo9194c();
        m9755r();
        try {
            return m9188v().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, m9326m().m9481b(str, C1828o.f7880p))))});
        } catch (SQLiteException e) {
            mo9324k().m9309t().m9367a("Error deleting over the limit events. appId", C1725f4.m9298a(str), e);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C1926w9 m9176c(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.C1057u.m7296b(r19)
            com.google.android.gms.common.internal.C1057u.m7296b(r20)
            r18.mo9194c()
            r18.m9755r()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.m9188v()     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r11 = "user_attributes"
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r0 = "set_timestamp"
            r1 = 0
            r12[r1] = r0     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r0 = "value"
            r2 = 1
            r12[r2] = r0     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r0 = "origin"
            r3 = 2
            r12[r3] = r0     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r13 = "app_id=? and name=?"
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            r14[r1] = r19     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            r14[r2] = r8     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            boolean r0 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7f
            if (r0 != 0) goto L44
            if (r10 == 0) goto L43
            r10.close()
        L43:
            return r9
        L44:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7f
            r11 = r18
            java.lang.Object r7 = r11.m9141a(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            java.lang.String r3 = r10.getString(r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.w9 r0 = new com.google.android.gms.measurement.internal.w9     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            if (r1 == 0) goto L73
            com.google.android.gms.measurement.internal.f4 r1 = r18.mo9324k()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.h4 r1 = r1.m9309t()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1725f4.m9298a(r19)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            r1.m9366a(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
        L73:
            if (r10 == 0) goto L78
            r10.close()
        L78:
            return r0
        L79:
            r0 = move-exception
            goto L8b
        L7b:
            r0 = move-exception
            r11 = r18
            goto Lab
        L7f:
            r0 = move-exception
            r11 = r18
            goto L8b
        L83:
            r0 = move-exception
            r11 = r18
            goto Lac
        L87:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L8b:
            com.google.android.gms.measurement.internal.f4 r1 = r18.mo9324k()     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.h4 r1 = r1.m9309t()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1725f4.m9298a(r19)     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.c4 r4 = r18.m9319f()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r4 = r4.m9122c(r8)     // Catch: java.lang.Throwable -> Laa
            r1.m9368a(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Laa
            if (r10 == 0) goto La9
            r10.close()
        La9:
            return r9
        Laa:
            r0 = move-exception
        Lab:
            r9 = r10
        Lac:
            if (r9 == 0) goto Lb1
            r9.close()
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9176c(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.w9");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0155  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzv m9177d(java.lang.String r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9177d(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzv");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] m9178d(java.lang.String r12) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.C1057u.m7296b(r12)
            r11.mo9194c()
            r11.m9755r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.m9188v()     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            java.lang.String r2 = "apps"
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            java.lang.String r5 = "remote_config"
            r9 = 0
            r4[r9] = r5     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            r6[r9] = r12     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            r7 = 0
            r8 = 0
            r10 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            if (r2 != 0) goto L37
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            byte[] r2 = r1.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            if (r3 == 0) goto L52
            com.google.android.gms.measurement.internal.f4 r3 = r11.mo9324k()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.h4 r3 = r3.m9309t()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1725f4.m9298a(r12)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            r3.m9366a(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
        L52:
            if (r1 == 0) goto L57
            r1.close()
        L57:
            return r2
        L58:
            r2 = move-exception
            goto L5e
        L5a:
            r12 = move-exception
            goto L77
        L5c:
            r2 = move-exception
            r1 = r0
        L5e:
            com.google.android.gms.measurement.internal.f4 r3 = r11.mo9324k()     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.h4 r3 = r3.m9309t()     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C1725f4.m9298a(r12)     // Catch: java.lang.Throwable -> L75
            r3.m9367a(r4, r12, r2)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L74
            r1.close()
        L74:
            return r0
        L75:
            r12 = move-exception
            r0 = r1
        L77:
            if (r0 == 0) goto L7c
            r0.close()
        L7c:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9178d(java.lang.String):byte[]");
    }

    /* renamed from: e */
    public final int m9179e(String str, String str2) {
        C1057u.m7296b(str);
        C1057u.m7296b(str2);
        mo9194c();
        m9755r();
        try {
            return m9188v().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo9324k().m9309t().m9368a("Error deleting conditional property", C1725f4.m9298a(str), m9319f().m9122c(str2), e);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final Map<Integer, List<C1237d0>> m9180e(String str) {
        C1057u.m7296b(str);
        C0500c0 c0500c0 = new C0500c0();
        Cursor cursor = null;
        try {
            try {
                Cursor query = m9188v().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<C1237d0>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    byte[] blob = query.getBlob(1);
                    try {
                        C1237d0.a m7709z = C1237d0.m7709z();
                        C1915v9.m9810a(m7709z, blob);
                        C1237d0 c1237d0 = (C1237d0) ((AbstractC1406o4) m7709z.mo7537i());
                        if (c1237d0.m7715t()) {
                            int i = query.getInt(0);
                            List list = (List) c0500c0.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                c0500c0.put(Integer.valueOf(i), list);
                            }
                            list.add(c1237d0);
                        }
                    } catch (IOException e) {
                        mo9324k().m9309t().m9367a("Failed to merge filter. appId", C1725f4.m9298a(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return c0500c0;
            } catch (SQLiteException e2) {
                mo9324k().m9309t().m9367a("Database error querying filters. appId", C1725f4.m9298a(str), e2);
                Map<Integer, List<C1237d0>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> m9181f(java.lang.String r8) {
        /*
            r7 = this;
            r7.m9755r()
            r7.mo9194c()
            com.google.android.gms.common.internal.C1057u.m7296b(r8)
            c0 r0 = new c0
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.m9188v()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            r5 = 0
            r4[r5] = r8     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            r6 = 1
            r4[r6] = r8     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            boolean r3 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            if (r3 != 0) goto L32
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            if (r1 == 0) goto L31
            r1.close()
        L31:
            return r8
        L32:
            int r3 = r1.getInt(r5)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            java.lang.Object r4 = r0.get(r4)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            java.util.List r4 = (java.util.List) r4     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            if (r4 != 0) goto L4e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            r0.put(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
        L4e:
            int r3 = r1.getInt(r6)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            r4.add(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            if (r3 != 0) goto L32
            if (r1 == 0) goto L64
            r1.close()
        L64:
            return r0
        L65:
            r0 = move-exception
            goto L6b
        L67:
            r8 = move-exception
            goto L84
        L69:
            r0 = move-exception
            r1 = r2
        L6b:
            com.google.android.gms.measurement.internal.f4 r3 = r7.mo9324k()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.h4 r3 = r3.m9309t()     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1725f4.m9298a(r8)     // Catch: java.lang.Throwable -> L82
            r3.m9367a(r4, r8, r0)     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L81
            r1.close()
        L81:
            return r2
        L82:
            r8 = move-exception
            r2 = r1
        L84:
            if (r2 == 0) goto L89
            r2.close()
        L89:
            goto L8b
        L8a:
            throw r8
        L8b:
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9181f(java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.C1237d0>> m9182f(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.m9755r()
            r12.mo9194c()
            com.google.android.gms.common.internal.C1057u.m7296b(r13)
            com.google.android.gms.common.internal.C1057u.m7296b(r14)
            c0 r0 = new c0
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.m9188v()
            r9 = 0
            java.lang.String r2 = "event_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            java.lang.String r5 = "app_id=? AND event_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            r6[r10] = r13     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            r6[r11] = r14     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            if (r1 != 0) goto L48
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            if (r14 == 0) goto L47
            r14.close()
        L47:
            return r13
        L48:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.d0$a r2 = com.google.android.gms.internal.measurement.C1237d0.m7709z()     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.C1915v9.m9810a(r2, r1)     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.d0$a r2 = (com.google.android.gms.internal.measurement.C1237d0.a) r2     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.x5 r1 = r2.mo7537i()     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.o4 r1 = (com.google.android.gms.internal.measurement.AbstractC1406o4) r1     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.d0 r1 = (com.google.android.gms.internal.measurement.C1237d0) r1     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            if (r3 != 0) goto L79
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
        L79:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            goto L8f
        L7d:
            r1 = move-exception
            com.google.android.gms.measurement.internal.f4 r2 = r12.mo9324k()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.h4 r2 = r2.m9309t()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1725f4.m9298a(r13)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            r2.m9367a(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
        L8f:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            if (r1 != 0) goto L48
            if (r14 == 0) goto L9a
            r14.close()
        L9a:
            return r0
        L9b:
            r0 = move-exception
            goto La1
        L9d:
            r13 = move-exception
            goto Lba
        L9f:
            r0 = move-exception
            r14 = r9
        La1:
            com.google.android.gms.measurement.internal.f4 r1 = r12.mo9324k()     // Catch: java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.h4 r1 = r1.m9309t()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C1725f4.m9298a(r13)     // Catch: java.lang.Throwable -> Lb8
            r1.m9367a(r2, r13, r0)     // Catch: java.lang.Throwable -> Lb8
            if (r14 == 0) goto Lb7
            r14.close()
        Lb7:
            return r9
        Lb8:
            r13 = move-exception
            r9 = r14
        Lba:
            if (r9 == 0) goto Lbf
            r9.close()
        Lbf:
            goto Lc1
        Lc0:
            throw r13
        Lc1:
            goto Lc0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9182f(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.C1556z0> m9183g(java.lang.String r12) {
        /*
            r11 = this;
            r11.m9755r()
            r11.mo9194c()
            com.google.android.gms.common.internal.C1057u.m7296b(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.m9188v()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L82
            java.lang.String r3 = "audience_id"
            r9 = 0
            r2[r9] = r3     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L82
            java.lang.String r3 = "current_results"
            r10 = 1
            r2[r10] = r3     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L82
            java.lang.String r3 = "app_id=?"
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L82
            r4[r9] = r12     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L82
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L82
            boolean r1 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            if (r1 != 0) goto L36
            if (r0 == 0) goto L35
            r0.close()
        L35:
            return r8
        L36:
            c0 r1 = new c0     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            r1.<init>()     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
        L3b:
            int r2 = r0.getInt(r9)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            byte[] r3 = r0.getBlob(r10)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            com.google.android.gms.internal.measurement.z0$a r4 = com.google.android.gms.internal.measurement.C1556z0.m8909w()     // Catch: java.io.IOException -> L5c android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            com.google.android.gms.measurement.internal.C1915v9.m9810a(r4, r3)     // Catch: java.io.IOException -> L5c android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            com.google.android.gms.internal.measurement.z0$a r4 = (com.google.android.gms.internal.measurement.C1556z0.a) r4     // Catch: java.io.IOException -> L5c android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            com.google.android.gms.internal.measurement.x5 r3 = r4.mo7537i()     // Catch: java.io.IOException -> L5c android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            com.google.android.gms.internal.measurement.o4 r3 = (com.google.android.gms.internal.measurement.AbstractC1406o4) r3     // Catch: java.io.IOException -> L5c android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            com.google.android.gms.internal.measurement.z0 r3 = (com.google.android.gms.internal.measurement.C1556z0) r3     // Catch: java.io.IOException -> L5c android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            r1.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            goto L72
        L5c:
            r3 = move-exception
            com.google.android.gms.measurement.internal.f4 r4 = r11.mo9324k()     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            com.google.android.gms.measurement.internal.h4 r4 = r4.m9309t()     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1725f4.m9298a(r12)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            r4.m9368a(r5, r6, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
        L72:
            boolean r2 = r0.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            if (r2 != 0) goto L3b
            if (r0 == 0) goto L7d
            r0.close()
        L7d:
            return r1
        L7e:
            r1 = move-exception
            goto L84
        L80:
            r12 = move-exception
            goto L9d
        L82:
            r1 = move-exception
            r0 = r8
        L84:
            com.google.android.gms.measurement.internal.f4 r2 = r11.mo9324k()     // Catch: java.lang.Throwable -> L9b
            com.google.android.gms.measurement.internal.h4 r2 = r2.m9309t()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C1725f4.m9298a(r12)     // Catch: java.lang.Throwable -> L9b
            r2.m9367a(r3, r12, r1)     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L9a
            r0.close()
        L9a:
            return r8
        L9b:
            r12 = move-exception
            r8 = r0
        L9d:
            if (r8 == 0) goto La2
            r8.close()
        La2:
            goto La4
        La3:
            throw r12
        La4:
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9183g(java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.C1282g0>> m9184g(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.m9755r()
            r12.mo9194c()
            com.google.android.gms.common.internal.C1057u.m7296b(r13)
            com.google.android.gms.common.internal.C1057u.m7296b(r14)
            c0 r0 = new c0
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.m9188v()
            r9 = 0
            java.lang.String r2 = "property_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            java.lang.String r5 = "app_id=? AND property_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            r6[r10] = r13     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            r6[r11] = r14     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            if (r1 != 0) goto L48
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            if (r14 == 0) goto L47
            r14.close()
        L47:
            return r13
        L48:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.g0$a r2 = com.google.android.gms.internal.measurement.C1282g0.m7836w()     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.C1915v9.m9810a(r2, r1)     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.g0$a r2 = (com.google.android.gms.internal.measurement.C1282g0.a) r2     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.x5 r1 = r2.mo7537i()     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.o4 r1 = (com.google.android.gms.internal.measurement.AbstractC1406o4) r1     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.g0 r1 = (com.google.android.gms.internal.measurement.C1282g0) r1     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            if (r3 != 0) goto L79
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
        L79:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            goto L8f
        L7d:
            r1 = move-exception
            com.google.android.gms.measurement.internal.f4 r2 = r12.mo9324k()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.h4 r2 = r2.m9309t()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1725f4.m9298a(r13)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            r2.m9367a(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
        L8f:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            if (r1 != 0) goto L48
            if (r14 == 0) goto L9a
            r14.close()
        L9a:
            return r0
        L9b:
            r0 = move-exception
            goto La1
        L9d:
            r13 = move-exception
            goto Lba
        L9f:
            r0 = move-exception
            r14 = r9
        La1:
            com.google.android.gms.measurement.internal.f4 r1 = r12.mo9324k()     // Catch: java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.h4 r1 = r1.m9309t()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C1725f4.m9298a(r13)     // Catch: java.lang.Throwable -> Lb8
            r1.m9367a(r2, r13, r0)     // Catch: java.lang.Throwable -> Lb8
            if (r14 == 0) goto Lb7
            r14.close()
        Lb7:
            return r9
        Lb8:
            r13 = move-exception
            r9 = r14
        Lba:
            if (r9 == 0) goto Lbf
            r9.close()
        Lbf:
            goto Lc1
        Lc0:
            throw r13
        Lc1:
            goto Lc0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9184g(java.lang.String, java.lang.String):java.util.Map");
    }

    /* renamed from: h */
    public final long m9185h(String str) {
        C1057u.m7296b(str);
        return m9139a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final long m9186h(String str, String str2) {
        long m9139a;
        C1057u.m7296b(str);
        C1057u.m7296b(str2);
        mo9194c();
        m9755r();
        SQLiteDatabase m9188v = m9188v();
        m9188v.beginTransaction();
        long j = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            try {
                try {
                    m9139a = m9139a(sb.toString(), new String[]{str}, -1L);
                    if (m9139a == -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put("first_open_count", (Integer) 0);
                        contentValues.put("previous_install_count", (Integer) 0);
                        if (m9188v.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            mo9324k().m9309t().m9367a("Failed to insert column (got -1). appId", C1725f4.m9298a(str), str2);
                            m9188v.endTransaction();
                            return -1L;
                        }
                        m9139a = 0;
                    }
                } catch (SQLiteException e) {
                    e = e;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + m9139a));
                    if (m9188v.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        mo9324k().m9309t().m9367a("Failed to update column (got 0). appId", C1725f4.m9298a(str), str2);
                        m9188v.endTransaction();
                        return -1L;
                    }
                    m9188v.setTransactionSuccessful();
                    m9188v.endTransaction();
                    return m9139a;
                } catch (SQLiteException e2) {
                    e = e2;
                    j = m9139a;
                    mo9324k().m9309t().m9368a("Error inserting column. appId", C1725f4.m9298a(str), str2, e);
                    m9188v.endTransaction();
                    return j;
                }
            } catch (Throwable th) {
                th = th;
                m9188v.endTransaction();
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1849p9
    /* renamed from: t */
    protected final boolean mo9129t() {
        return false;
    }

    /* renamed from: u */
    public final void m9187u() {
        m9755r();
        m9188v().setTransactionSuccessful();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final SQLiteDatabase m9188v() {
        mo9194c();
        try {
            return this.f7451d.getWritableDatabase();
        } catch (SQLiteException e) {
            mo9324k().m9312w().m9366a("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m9189w() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.m9188v()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L29
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r2 == 0) goto L1c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r0 == 0) goto L1b
            r0.close()
        L1b:
            return r1
        L1c:
            if (r0 == 0) goto L21
            r0.close()
        L21:
            return r1
        L22:
            r2 = move-exception
            goto L2b
        L24:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3f
        L29:
            r2 = move-exception
            r0 = r1
        L2b:
            com.google.android.gms.measurement.internal.f4 r3 = r6.mo9324k()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.h4 r3 = r3.m9309t()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.m9366a(r4, r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3d
            r0.close()
        L3d:
            return r1
        L3e:
            r1 = move-exception
        L3f:
            if (r0 == 0) goto L44
            r0.close()
        L44:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1696d.m9189w():java.lang.String");
    }

    /* renamed from: x */
    public final long m9190x() {
        Cursor cursor = null;
        try {
            try {
                cursor = m9188v().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1L;
                }
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                mo9324k().m9309t().m9366a("Error querying raw events", e);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: y */
    public final void m9191y() {
        m9755r();
        m9188v().beginTransaction();
    }

    /* renamed from: z */
    public final void m9192z() {
        m9755r();
        m9188v().endTransaction();
    }
}
