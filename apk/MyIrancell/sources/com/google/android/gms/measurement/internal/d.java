package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.bb;
import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.o4;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends p9 {
    private static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    private static final String[] i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final e d;
    private final l9 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(o9 o9Var) {
        super(o9Var);
        this.e = new l9(h());
        this.d = new e(this, l(), "google_app_measurement.db");
    }

    private final boolean O() {
        return l().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long a(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            try {
                cursor = v().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j2;
            } catch (SQLiteException e) {
                k().t().a("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private final Object a(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            k().t().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            k().t().a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        k().t().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    private static void a(ContentValues contentValues, String str, Object obj) {
        com.google.android.gms.common.internal.u.b(str);
        com.google.android.gms.common.internal.u.a(obj);
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

    private final boolean a(String str, int i2, com.google.android.gms.internal.measurement.d0 d0Var) {
        r();
        c();
        com.google.android.gms.common.internal.u.b(str);
        com.google.android.gms.common.internal.u.a(d0Var);
        if (TextUtils.isEmpty(d0Var.q())) {
            k().w().a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", f4.a(str), Integer.valueOf(i2), String.valueOf(d0Var.zza() ? Integer.valueOf(d0Var.p()) : null));
            return false;
        }
        byte[] e = d0Var.e();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", d0Var.zza() ? Integer.valueOf(d0Var.p()) : null);
        contentValues.put("event_name", d0Var.q());
        if (m().e(str, o.l0)) {
            contentValues.put("session_scoped", d0Var.x() ? Boolean.valueOf(d0Var.y()) : null);
        }
        contentValues.put("data", e);
        try {
            if (v().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            k().t().a("Failed to insert event filter (got -1). appId", f4.a(str));
            return true;
        } catch (SQLiteException e2) {
            k().t().a("Error storing event filter. appId", f4.a(str), e2);
            return false;
        }
    }

    private final boolean a(String str, int i2, com.google.android.gms.internal.measurement.g0 g0Var) {
        r();
        c();
        com.google.android.gms.common.internal.u.b(str);
        com.google.android.gms.common.internal.u.a(g0Var);
        if (TextUtils.isEmpty(g0Var.q())) {
            k().w().a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", f4.a(str), Integer.valueOf(i2), String.valueOf(g0Var.zza() ? Integer.valueOf(g0Var.p()) : null));
            return false;
        }
        byte[] e = g0Var.e();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", g0Var.zza() ? Integer.valueOf(g0Var.p()) : null);
        contentValues.put("property_name", g0Var.q());
        if (m().e(str, o.l0)) {
            contentValues.put("session_scoped", g0Var.u() ? Boolean.valueOf(g0Var.v()) : null);
        }
        contentValues.put("data", e);
        try {
            if (v().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            k().t().a("Failed to insert property filter (got -1). appId", f4.a(str));
            return false;
        } catch (SQLiteException e2) {
            k().t().a("Error storing property filter. appId", f4.a(str), e2);
            return false;
        }
    }

    private final long b(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = v().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j2;
            } catch (SQLiteException e) {
                k().t().a("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean c(String str, List<Integer> list) {
        com.google.android.gms.common.internal.u.b(str);
        r();
        c();
        SQLiteDatabase v = v();
        try {
            long b = b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, m().b(str, o.F)));
            if (b <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
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
            return v.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            k().t().a("Database error querying filters. appId", f4.a(str), e);
            return false;
        }
    }

    public final boolean A() {
        return b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B() {
        int delete;
        c();
        r();
        if (O()) {
            long a = j().h.a();
            long b = h().b();
            if (Math.abs(b - a) > o.y.a(null).longValue()) {
                j().h.a(b);
                c();
                r();
                if (!O() || (delete = v().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(h().a()), String.valueOf(la.v())})) <= 0) {
                    return;
                }
                k().B().a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    public final long C() {
        return a("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    public final long D() {
        return a("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final boolean E() {
        return b("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean F() {
        return b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final long a(com.google.android.gms.internal.measurement.x0 x0Var) {
        c();
        r();
        com.google.android.gms.common.internal.u.a(x0Var);
        com.google.android.gms.common.internal.u.b(x0Var.o0());
        byte[] e = x0Var.e();
        long a = n().a(e);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", x0Var.o0());
        contentValues.put("metadata_fingerprint", Long.valueOf(a));
        contentValues.put("metadata", e);
        try {
            v().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return a;
        } catch (SQLiteException e2) {
            k().t().a("Error storing raw event metadata. appId", f4.a(x0Var.o0()), e2);
            throw e2;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0090: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x0090 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.t0, java.lang.Long> a(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.c()
            r7.r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.v()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
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
            com.google.android.gms.measurement.internal.f4 r8 = r7.k()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.h4 r8 = r8.B()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.internal.measurement.t0$a r4 = com.google.android.gms.internal.measurement.t0.x()     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.v9.a(r4, r2)     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.internal.measurement.t0$a r4 = (com.google.android.gms.internal.measurement.t0.a) r4     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.internal.measurement.x5 r2 = r4.i()     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.internal.measurement.o4 r2 = (com.google.android.gms.internal.measurement.o4) r2     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.internal.measurement.t0 r2 = (com.google.android.gms.internal.measurement.t0) r2     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            if (r1 == 0) goto L5d
            r1.close()
        L5d:
            return r8
        L5e:
            r2 = move-exception
            com.google.android.gms.measurement.internal.f4 r3 = r7.k()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.h4 r3 = r3.t()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.f4.a(r8)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            r3.a(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
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
            com.google.android.gms.measurement.internal.f4 r9 = r7.k()     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.h4 r9 = r9.t()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = "Error selecting main event"
            r9.a(r2, r8)     // Catch: java.lang.Throwable -> L8f
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.a(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.c a(long r22, java.lang.String r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.a(long, java.lang.String, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.c");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.k a(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.a(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.k");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(long r5) {
        /*
            r4 = this;
            r4.c()
            r4.r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.v()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r1 != 0) goto L34
            com.google.android.gms.measurement.internal.f4 r6 = r4.k()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.h4 r6 = r6.B()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
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
            com.google.android.gms.measurement.internal.f4 r1 = r4.k()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.h4 r1 = r1.t()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "Error selecting expired configs"
            r1.a(r2, r6)     // Catch: java.lang.Throwable -> L57
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.a(long):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.w9> a(java.lang.String r23) {
        /*
            r22 = this;
            com.google.android.gms.common.internal.u.b(r23)
            r22.c()
            r22.r()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r22.v()     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
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
            java.lang.Object r21 = r3.a(r2, r14)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            if (r21 != 0) goto L74
            com.google.android.gms.measurement.internal.f4 r4 = r22.k()     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            com.google.android.gms.measurement.internal.h4 r4 = r4.t()     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            java.lang.String r5 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.f4.a(r23)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            r4.a(r5, r6)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
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
            com.google.android.gms.measurement.internal.f4 r4 = r22.k()     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.measurement.internal.h4 r4 = r4.t()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = "Error querying user properties. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.f4.a(r23)     // Catch: java.lang.Throwable -> Lb4
            r4.a(r5, r6, r0)     // Catch: java.lang.Throwable -> Lb4
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.a(java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd A[EDGE_INSN: B:40:0x00cd->B:26:0x00cd BREAK  A[LOOP:0: B:17:0x005c->B:39:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.x0, java.lang.Long>> a(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.a(java.lang.String, int, int):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x009a, code lost:
    
        k().t().a("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.w9> a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        k().t().a("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzv> a(java.lang.String r40, java.lang.String[] r41) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.a(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> a(java.lang.String r14, java.util.List<java.lang.String> r15) {
        /*
            r13 = this;
            r13.r()
            r13.c()
            com.google.android.gms.common.internal.u.b(r14)
            com.google.android.gms.common.internal.u.a(r15)
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
            android.database.sqlite.SQLiteDatabase r4 = r13.v()
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
            com.google.android.gms.measurement.internal.f4 r2 = r13.k()     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.measurement.internal.h4 r2 = r2.t()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = "Database error querying filters. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.f4.a(r14)     // Catch: java.lang.Throwable -> Lc9
            r2.a(r3, r14, r0)     // Catch: java.lang.Throwable -> Lc9
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.a(java.lang.String, java.util.List):java.util.Map");
    }

    public final void a(e5 e5Var) {
        com.google.android.gms.common.internal.u.a(e5Var);
        c();
        r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", e5Var.l());
        contentValues.put("app_instance_id", e5Var.m());
        contentValues.put("gmp_app_id", e5Var.n());
        contentValues.put("resettable_device_id_hash", e5Var.q());
        contentValues.put("last_bundle_index", Long.valueOf(e5Var.B()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(e5Var.s()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(e5Var.t()));
        contentValues.put("app_version", e5Var.u());
        contentValues.put("app_store", e5Var.w());
        contentValues.put("gmp_version", Long.valueOf(e5Var.x()));
        contentValues.put("dev_cert_hash", Long.valueOf(e5Var.y()));
        contentValues.put("measurement_enabled", Boolean.valueOf(e5Var.A()));
        contentValues.put("day", Long.valueOf(e5Var.F()));
        contentValues.put("daily_public_events_count", Long.valueOf(e5Var.G()));
        contentValues.put("daily_events_count", Long.valueOf(e5Var.H()));
        contentValues.put("daily_conversions_count", Long.valueOf(e5Var.I()));
        contentValues.put("config_fetched_time", Long.valueOf(e5Var.C()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(e5Var.D()));
        contentValues.put("app_version_int", Long.valueOf(e5Var.v()));
        contentValues.put("firebase_instance_id", e5Var.r());
        contentValues.put("daily_error_events_count", Long.valueOf(e5Var.c()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(e5Var.b()));
        contentValues.put("health_monitor_sample", e5Var.d());
        contentValues.put("android_id", Long.valueOf(e5Var.f()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(e5Var.g()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(e5Var.h()));
        contentValues.put("admob_app_id", e5Var.o());
        contentValues.put("dynamite_version", Long.valueOf(e5Var.z()));
        if (e5Var.j() != null) {
            if (e5Var.j().size() == 0) {
                k().w().a("Safelisted events should not be an empty list. appId", e5Var.l());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", e5Var.j()));
            }
        }
        if (bb.a() && m().e(e5Var.l(), o.G0)) {
            contentValues.put("ga_app_id", e5Var.p());
        }
        try {
            SQLiteDatabase v = v();
            if (v.update("apps", contentValues, "app_id = ?", new String[]{e5Var.l()}) == 0 && v.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                k().t().a("Failed to insert/update app (got -1). appId", f4.a(e5Var.l()));
            }
        } catch (SQLiteException e) {
            k().t().a("Error storing app. appId", f4.a(e5Var.l()), e);
        }
    }

    public final void a(k kVar) {
        com.google.android.gms.common.internal.u.a(kVar);
        c();
        r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", kVar.a);
        contentValues.put("name", kVar.b);
        contentValues.put("lifetime_count", Long.valueOf(kVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(kVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(kVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(kVar.g));
        contentValues.put("last_bundled_day", kVar.h);
        contentValues.put("last_sampled_complex_event_id", kVar.i);
        contentValues.put("last_sampling_rate", kVar.j);
        if (m().e(kVar.a, o.m0)) {
            contentValues.put("current_session_count", Long.valueOf(kVar.e));
        }
        Boolean bool = kVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (v().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                k().t().a("Failed to insert/update event aggregates (got -1). appId", f4.a(kVar.a));
            }
        } catch (SQLiteException e) {
            k().t().a("Error storing event aggregates. appId", f4.a(kVar.a), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(List<Long> list) {
        c();
        r();
        com.google.android.gms.common.internal.u.a(list);
        com.google.android.gms.common.internal.u.a(list.size());
        if (O()) {
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
            if (b(sb3.toString(), (String[]) null) > 0) {
                k().w().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase v = v();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                v.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                k().t().a("Error incrementing retry count. error", e);
            }
        }
    }

    public final boolean a(com.google.android.gms.internal.measurement.x0 x0Var, boolean z) {
        h4 t;
        Object a;
        String str;
        ContentValues contentValues;
        c();
        r();
        com.google.android.gms.common.internal.u.a(x0Var);
        com.google.android.gms.common.internal.u.b(x0Var.o0());
        com.google.android.gms.common.internal.u.b(x0Var.d0());
        B();
        long a2 = h().a();
        if (x0Var.e0() < a2 - la.v() || x0Var.e0() > la.v() + a2) {
            k().w().a("Storing bundle outside of the max uploading time span. appId, now, timestamp", f4.a(x0Var.o0()), Long.valueOf(a2), Long.valueOf(x0Var.e0()));
        }
        try {
            byte[] c = n().c(x0Var.e());
            k().B().a("Saving bundle, size", Integer.valueOf(c.length));
            contentValues = new ContentValues();
            contentValues.put("app_id", x0Var.o0());
            contentValues.put("bundle_end_timestamp", Long.valueOf(x0Var.e0()));
            contentValues.put("data", c);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (x0Var.O()) {
                contentValues.put("retry_count", Integer.valueOf(x0Var.Q()));
            }
        } catch (IOException e) {
            e = e;
            t = k().t();
            a = f4.a(x0Var.o0());
            str = "Data loss. Failed to serialize bundle. appId";
        }
        try {
            if (v().insert("queue", null, contentValues) != -1) {
                return true;
            }
            k().t().a("Failed to insert bundle (got -1). appId", f4.a(x0Var.o0()));
            return false;
        } catch (SQLiteException e2) {
            e = e2;
            t = k().t();
            a = f4.a(x0Var.o0());
            str = "Error storing bundle. appId";
            t.a(str, a, e);
            return false;
        }
    }

    public final boolean a(l lVar, long j2, boolean z) {
        c();
        r();
        com.google.android.gms.common.internal.u.a(lVar);
        com.google.android.gms.common.internal.u.b(lVar.a);
        t0.a x = com.google.android.gms.internal.measurement.t0.x();
        x.b(lVar.e);
        Iterator<String> it = lVar.f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            v0.a y = com.google.android.gms.internal.measurement.v0.y();
            y.a(next);
            n().a(y, lVar.f.a(next));
            x.a(y);
        }
        byte[] e = ((com.google.android.gms.internal.measurement.t0) ((com.google.android.gms.internal.measurement.o4) x.i())).e();
        if (!com.google.android.gms.internal.measurement.ja.a() || !m().e(lVar.a, o.Y0)) {
            k().B().a("Saving event, name, data size", f().a(lVar.b), Integer.valueOf(e.length));
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", lVar.a);
        contentValues.put("name", lVar.b);
        contentValues.put("timestamp", Long.valueOf(lVar.d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", e);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (v().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            k().t().a("Failed to insert raw event (got -1). appId", f4.a(lVar.a));
            return false;
        } catch (SQLiteException e2) {
            k().t().a("Error storing raw event. appId", f4.a(lVar.a), e2);
            return false;
        }
    }

    public final boolean a(w9 w9Var) {
        com.google.android.gms.common.internal.u.a(w9Var);
        c();
        r();
        if (c(w9Var.a, w9Var.c) == null) {
            if (z9.e(w9Var.c)) {
                if (b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{w9Var.a}) >= 25) {
                    return false;
                }
            } else if (m().e(w9Var.a, o.a0)) {
                if (!"_npa".equals(w9Var.c) && b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{w9Var.a, w9Var.b}) >= 25) {
                    return false;
                }
            } else if (b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{w9Var.a, w9Var.b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", w9Var.a);
        contentValues.put("origin", w9Var.b);
        contentValues.put("name", w9Var.c);
        contentValues.put("set_timestamp", Long.valueOf(w9Var.d));
        a(contentValues, "value", w9Var.e);
        try {
            if (v().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                k().t().a("Failed to insert/update user property (got -1). appId", f4.a(w9Var.a));
            }
        } catch (SQLiteException e) {
            k().t().a("Error storing user property. appId", f4.a(w9Var.a), e);
        }
        return true;
    }

    public final boolean a(zzv zzvVar) {
        com.google.android.gms.common.internal.u.a(zzvVar);
        c();
        r();
        if (c(zzvVar.b, zzvVar.d.c) == null && b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzvVar.b}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzvVar.b);
        contentValues.put("origin", zzvVar.c);
        contentValues.put("name", zzvVar.d.c);
        a(contentValues, "value", zzvVar.d.zza());
        contentValues.put("active", Boolean.valueOf(zzvVar.f));
        contentValues.put("trigger_event_name", zzvVar.g);
        contentValues.put("trigger_timeout", Long.valueOf(zzvVar.i));
        i();
        contentValues.put("timed_out_event", z9.a((Parcelable) zzvVar.h));
        contentValues.put("creation_timestamp", Long.valueOf(zzvVar.e));
        i();
        contentValues.put("triggered_event", z9.a((Parcelable) zzvVar.j));
        contentValues.put("triggered_timestamp", Long.valueOf(zzvVar.d.d));
        contentValues.put("time_to_live", Long.valueOf(zzvVar.k));
        i();
        contentValues.put("expired_event", z9.a((Parcelable) zzvVar.l));
        try {
            if (v().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                k().t().a("Failed to insert/update conditional user property (got -1)", f4.a(zzvVar.b));
            }
        } catch (SQLiteException e) {
            k().t().a("Error storing conditional user property", f4.a(zzvVar.b), e);
        }
        return true;
    }

    public final boolean a(String str, Long l2, long j2, com.google.android.gms.internal.measurement.t0 t0Var) {
        c();
        r();
        com.google.android.gms.common.internal.u.a(t0Var);
        com.google.android.gms.common.internal.u.b(str);
        com.google.android.gms.common.internal.u.a(l2);
        byte[] e = t0Var.e();
        k().B().a("Saving complex main event, appId, data size", f().a(str), Integer.valueOf(e.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", e);
        try {
            if (v().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            k().t().a("Failed to insert complex main event (got -1). appId", f4.a(str));
            return false;
        } catch (SQLiteException e2) {
            k().t().a("Error storing complex main event. appId", f4.a(str), e2);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.e5 b(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.b(java.lang.String):com.google.android.gms.measurement.internal.e5");
    }

    public final List<zzv> b(String str, String str2, String str3) {
        com.google.android.gms.common.internal.u.b(str);
        c();
        r();
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
        return a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void b(String str, String str2) {
        h4 t;
        Object a;
        String c;
        String str3;
        com.google.android.gms.common.internal.u.b(str);
        com.google.android.gms.common.internal.u.b(str2);
        c();
        r();
        try {
            int delete = v().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
            if (com.google.android.gms.internal.measurement.ja.a() && this.b.b().e(str, o.Y0)) {
                return;
            }
            k().B().a("Deleted user attribute rows", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            if (com.google.android.gms.internal.measurement.ja.a() && this.b.b().e(str, o.Y0)) {
                t = k().t();
                a = f4.a(str);
                c = f().c(str2);
                str3 = "Error deleting user property. appId";
            } else {
                t = k().t();
                a = f4.a(str);
                c = f().c(str2);
                str3 = "Error deleting user attribute. appId";
            }
            t.a(str3, a, c, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, List<com.google.android.gms.internal.measurement.c0> list) {
        boolean z;
        h4 w;
        String str2;
        Object a;
        Integer valueOf;
        boolean z2;
        com.google.android.gms.common.internal.u.a(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            c0.a l2 = list.get(i2).l();
            if (l2.n() != 0) {
                for (int i3 = 0; i3 < l2.n(); i3++) {
                    d0.a l3 = l2.b(i3).l();
                    d0.a aVar = (d0.a) ((o4.a) l3.clone());
                    String a2 = j6.a(l3.zza());
                    if (a2 != null) {
                        aVar.a(a2);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i4 = 0; i4 < l3.n(); i4++) {
                        com.google.android.gms.internal.measurement.e0 a3 = l3.a(i4);
                        String a4 = i6.a(a3.v());
                        if (a4 != null) {
                            e0.a l4 = a3.l();
                            l4.a(a4);
                            aVar.a(i4, (com.google.android.gms.internal.measurement.e0) ((com.google.android.gms.internal.measurement.o4) l4.i()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        l2.a(i3, aVar);
                        list.set(i2, (com.google.android.gms.internal.measurement.c0) ((com.google.android.gms.internal.measurement.o4) l2.i()));
                    }
                }
            }
            if (l2.zza() != 0) {
                for (int i5 = 0; i5 < l2.zza(); i5++) {
                    com.google.android.gms.internal.measurement.g0 a5 = l2.a(i5);
                    String a6 = l6.a(a5.q());
                    if (a6 != null) {
                        g0.a l5 = a5.l();
                        l5.a(a6);
                        l2.a(i5, l5);
                        list.set(i2, (com.google.android.gms.internal.measurement.c0) ((com.google.android.gms.internal.measurement.o4) l2.i()));
                    }
                }
            }
        }
        r();
        c();
        com.google.android.gms.common.internal.u.b(str);
        com.google.android.gms.common.internal.u.a(list);
        SQLiteDatabase v = v();
        v.beginTransaction();
        try {
            r();
            c();
            com.google.android.gms.common.internal.u.b(str);
            SQLiteDatabase v2 = v();
            v2.delete("property_filters", "app_id=?", new String[]{str});
            v2.delete("event_filters", "app_id=?", new String[]{str});
            for (com.google.android.gms.internal.measurement.c0 c0Var : list) {
                r();
                c();
                com.google.android.gms.common.internal.u.b(str);
                com.google.android.gms.common.internal.u.a(c0Var);
                if (c0Var.zza()) {
                    int p = c0Var.p();
                    Iterator<com.google.android.gms.internal.measurement.d0> it = c0Var.s().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zza()) {
                                w = k().w();
                                str2 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                a = f4.a(str);
                                valueOf = Integer.valueOf(p);
                                break;
                            }
                        } else {
                            Iterator<com.google.android.gms.internal.measurement.g0> it2 = c0Var.q().iterator();
                            while (it2.hasNext()) {
                                if (!it2.next().zza()) {
                                    w = k().w();
                                    str2 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                    a = f4.a(str);
                                    valueOf = Integer.valueOf(p);
                                }
                            }
                            Iterator<com.google.android.gms.internal.measurement.d0> it3 = c0Var.s().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (!a(str, p, it3.next())) {
                                        z = false;
                                        break;
                                    }
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                            if (z) {
                                Iterator<com.google.android.gms.internal.measurement.g0> it4 = c0Var.q().iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (!a(str, p, it4.next())) {
                                            z = false;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                r();
                                c();
                                com.google.android.gms.common.internal.u.b(str);
                                SQLiteDatabase v3 = v();
                                v3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(p)});
                                v3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(p)});
                            }
                        }
                    }
                    w.a(str2, a, valueOf);
                    break;
                }
                k().w().a("Audience with no ID. appId", f4.a(str));
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.measurement.c0 c0Var2 : list) {
                arrayList.add(c0Var2.zza() ? Integer.valueOf(c0Var2.p()) : null);
            }
            c(str, arrayList);
            v.setTransactionSuccessful();
        } finally {
            v.endTransaction();
        }
    }

    public final long c(String str) {
        com.google.android.gms.common.internal.u.b(str);
        c();
        r();
        try {
            return v().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, m().b(str, o.p))))});
        } catch (SQLiteException e) {
            k().t().a("Error deleting over the limit events. appId", f4.a(str), e);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.w9 c(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.u.b(r19)
            com.google.android.gms.common.internal.u.b(r20)
            r18.c()
            r18.r()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.v()     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
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
            java.lang.Object r7 = r11.a(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            java.lang.String r3 = r10.getString(r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.w9 r0 = new com.google.android.gms.measurement.internal.w9     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            if (r1 == 0) goto L73
            com.google.android.gms.measurement.internal.f4 r1 = r18.k()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.h4 r1 = r1.t()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.f4.a(r19)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            r1.a(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
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
            com.google.android.gms.measurement.internal.f4 r1 = r18.k()     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.h4 r1 = r1.t()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.f4.a(r19)     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.c4 r4 = r18.f()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r4 = r4.c(r8)     // Catch: java.lang.Throwable -> Laa
            r1.a(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Laa
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.c(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.w9");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzv d(java.lang.String r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.d(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzv");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] d(java.lang.String r12) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.u.b(r12)
            r11.c()
            r11.r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.v()     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
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
            com.google.android.gms.measurement.internal.f4 r3 = r11.k()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.h4 r3 = r3.t()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.f4.a(r12)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            r3.a(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
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
            com.google.android.gms.measurement.internal.f4 r3 = r11.k()     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.h4 r3 = r3.t()     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.f4.a(r12)     // Catch: java.lang.Throwable -> L75
            r3.a(r4, r12, r2)     // Catch: java.lang.Throwable -> L75
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.d(java.lang.String):byte[]");
    }

    public final int e(String str, String str2) {
        com.google.android.gms.common.internal.u.b(str);
        com.google.android.gms.common.internal.u.b(str2);
        c();
        r();
        try {
            return v().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            k().t().a("Error deleting conditional property", f4.a(str), f().c(str2), e);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, List<com.google.android.gms.internal.measurement.d0>> e(String str) {
        com.google.android.gms.common.internal.u.b(str);
        defpackage.c0 c0Var = new defpackage.c0();
        Cursor cursor = null;
        try {
            try {
                Cursor query = v().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<com.google.android.gms.internal.measurement.d0>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    byte[] blob = query.getBlob(1);
                    try {
                        d0.a z = com.google.android.gms.internal.measurement.d0.z();
                        v9.a(z, blob);
                        com.google.android.gms.internal.measurement.d0 d0Var = (com.google.android.gms.internal.measurement.d0) ((com.google.android.gms.internal.measurement.o4) z.i());
                        if (d0Var.t()) {
                            int i2 = query.getInt(0);
                            List list = (List) c0Var.get(Integer.valueOf(i2));
                            if (list == null) {
                                list = new ArrayList();
                                c0Var.put(Integer.valueOf(i2), list);
                            }
                            list.add(d0Var);
                        }
                    } catch (IOException e) {
                        k().t().a("Failed to merge filter. appId", f4.a(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return c0Var;
            } catch (SQLiteException e2) {
                k().t().a("Database error querying filters. appId", f4.a(str), e2);
                Map<Integer, List<com.google.android.gms.internal.measurement.d0>> emptyMap2 = Collections.emptyMap();
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> f(java.lang.String r8) {
        /*
            r7 = this;
            r7.r()
            r7.c()
            com.google.android.gms.common.internal.u.b(r8)
            c0 r0 = new c0
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.v()
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
            com.google.android.gms.measurement.internal.f4 r3 = r7.k()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.h4 r3 = r3.t()     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.f4.a(r8)     // Catch: java.lang.Throwable -> L82
            r3.a(r4, r8, r0)     // Catch: java.lang.Throwable -> L82
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.f(java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.d0>> f(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.r()
            r12.c()
            com.google.android.gms.common.internal.u.b(r13)
            com.google.android.gms.common.internal.u.b(r14)
            c0 r0 = new c0
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.v()
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
            com.google.android.gms.internal.measurement.d0$a r2 = com.google.android.gms.internal.measurement.d0.z()     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.v9.a(r2, r1)     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.d0$a r2 = (com.google.android.gms.internal.measurement.d0.a) r2     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.x5 r1 = r2.i()     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.o4 r1 = (com.google.android.gms.internal.measurement.o4) r1     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.d0 r1 = (com.google.android.gms.internal.measurement.d0) r1     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
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
            com.google.android.gms.measurement.internal.f4 r2 = r12.k()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.h4 r2 = r2.t()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.f4.a(r13)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            r2.a(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
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
            com.google.android.gms.measurement.internal.f4 r1 = r12.k()     // Catch: java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.h4 r1 = r1.t()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.f4.a(r13)     // Catch: java.lang.Throwable -> Lb8
            r1.a(r2, r13, r0)     // Catch: java.lang.Throwable -> Lb8
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.f(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.z0> g(java.lang.String r12) {
        /*
            r11 = this;
            r11.r()
            r11.c()
            com.google.android.gms.common.internal.u.b(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.v()
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
            com.google.android.gms.internal.measurement.z0$a r4 = com.google.android.gms.internal.measurement.z0.w()     // Catch: java.io.IOException -> L5c android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            com.google.android.gms.measurement.internal.v9.a(r4, r3)     // Catch: java.io.IOException -> L5c android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            com.google.android.gms.internal.measurement.z0$a r4 = (com.google.android.gms.internal.measurement.z0.a) r4     // Catch: java.io.IOException -> L5c android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            com.google.android.gms.internal.measurement.x5 r3 = r4.i()     // Catch: java.io.IOException -> L5c android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            com.google.android.gms.internal.measurement.o4 r3 = (com.google.android.gms.internal.measurement.o4) r3     // Catch: java.io.IOException -> L5c android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            com.google.android.gms.internal.measurement.z0 r3 = (com.google.android.gms.internal.measurement.z0) r3     // Catch: java.io.IOException -> L5c android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            r1.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            goto L72
        L5c:
            r3 = move-exception
            com.google.android.gms.measurement.internal.f4 r4 = r11.k()     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            com.google.android.gms.measurement.internal.h4 r4 = r4.t()     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.f4.a(r12)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
            r4.a(r5, r6, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> L9b
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
            com.google.android.gms.measurement.internal.f4 r2 = r11.k()     // Catch: java.lang.Throwable -> L9b
            com.google.android.gms.measurement.internal.h4 r2 = r2.t()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.f4.a(r12)     // Catch: java.lang.Throwable -> L9b
            r2.a(r3, r12, r1)     // Catch: java.lang.Throwable -> L9b
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.g(java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.g0>> g(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.r()
            r12.c()
            com.google.android.gms.common.internal.u.b(r13)
            com.google.android.gms.common.internal.u.b(r14)
            c0 r0 = new c0
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.v()
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
            com.google.android.gms.internal.measurement.g0$a r2 = com.google.android.gms.internal.measurement.g0.w()     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.v9.a(r2, r1)     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.g0$a r2 = (com.google.android.gms.internal.measurement.g0.a) r2     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.x5 r1 = r2.i()     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.o4 r1 = (com.google.android.gms.internal.measurement.o4) r1     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.internal.measurement.g0 r1 = (com.google.android.gms.internal.measurement.g0) r1     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
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
            com.google.android.gms.measurement.internal.f4 r2 = r12.k()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.h4 r2 = r2.t()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.f4.a(r13)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
            r2.a(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Lb8
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
            com.google.android.gms.measurement.internal.f4 r1 = r12.k()     // Catch: java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.h4 r1 = r1.t()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.f4.a(r13)     // Catch: java.lang.Throwable -> Lb8
            r1.a(r2, r13, r0)     // Catch: java.lang.Throwable -> Lb8
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.g(java.lang.String, java.lang.String):java.util.Map");
    }

    public final long h(String str) {
        com.google.android.gms.common.internal.u.b(str);
        return a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long h(String str, String str2) {
        long a;
        com.google.android.gms.common.internal.u.b(str);
        com.google.android.gms.common.internal.u.b(str2);
        c();
        r();
        SQLiteDatabase v = v();
        v.beginTransaction();
        long j2 = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            try {
                try {
                    a = a(sb.toString(), new String[]{str}, -1L);
                    if (a == -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put("first_open_count", (Integer) 0);
                        contentValues.put("previous_install_count", (Integer) 0);
                        if (v.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            k().t().a("Failed to insert column (got -1). appId", f4.a(str), str2);
                            v.endTransaction();
                            return -1L;
                        }
                        a = 0;
                    }
                } catch (SQLiteException e) {
                    e = e;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + a));
                    if (v.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        k().t().a("Failed to update column (got 0). appId", f4.a(str), str2);
                        v.endTransaction();
                        return -1L;
                    }
                    v.setTransactionSuccessful();
                    v.endTransaction();
                    return a;
                } catch (SQLiteException e2) {
                    e = e2;
                    j2 = a;
                    k().t().a("Error inserting column. appId", f4.a(str), str2, e);
                    v.endTransaction();
                    return j2;
                }
            } catch (Throwable th) {
                th = th;
                v.endTransaction();
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.google.android.gms.measurement.internal.p9
    protected final boolean t() {
        return false;
    }

    public final void u() {
        r();
        v().setTransactionSuccessful();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SQLiteDatabase v() {
        c();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            k().w().a("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String w() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.v()
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
            com.google.android.gms.measurement.internal.f4 r3 = r6.k()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.h4 r3 = r3.t()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.a(r4, r2)     // Catch: java.lang.Throwable -> L3e
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.w():java.lang.String");
    }

    public final long x() {
        Cursor cursor = null;
        try {
            try {
                cursor = v().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1L;
                }
                long j2 = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j2;
            } catch (SQLiteException e) {
                k().t().a("Error querying raw events", e);
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

    public final void y() {
        r();
        v().beginTransaction();
    }

    public final void z() {
        r();
        v().endTransaction();
    }
}
