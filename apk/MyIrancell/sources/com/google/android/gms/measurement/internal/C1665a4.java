package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.measurement.internal.a4 */
/* loaded from: classes.dex */
public final class C1665a4 extends AbstractC1688c3 {

    /* renamed from: c */
    private final C1713e4 f7360c;

    /* renamed from: d */
    private boolean f7361d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1665a4(C1774j5 c1774j5) {
        super(c1774j5);
        this.f7360c = new C1713e4(this, mo9325l(), "google_app_measurement_local.db");
    }

    /* renamed from: E */
    private final SQLiteDatabase m9086E() {
        if (this.f7361d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f7360c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f7361d = true;
        return null;
    }

    /* renamed from: F */
    private final boolean m9087F() {
        return mo9325l().getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* renamed from: a */
    private static long m9088a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                return cursor.getLong(0);
            }
            if (cursor == null) {
                return -1L;
            }
            cursor.close();
            return -1L;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m9089a(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1665a4.m9089a(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1688c3
    /* renamed from: A */
    protected final boolean mo9090A() {
        return false;
    }

    /* renamed from: B */
    public final void m9091B() {
        mo9193a();
        mo9194c();
        try {
            int delete = m9086E().delete("messages", null, null) + 0;
            if (delete > 0) {
                mo9324k().m9304B().m9366a("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            mo9324k().m9309t().m9366a("Error resetting local analytics data. error", e);
        }
    }

    /* renamed from: C */
    public final boolean m9092C() {
        return m9089a(3, new byte[0]);
    }

    /* renamed from: D */
    public final boolean m9093D() {
        int i;
        mo9194c();
        mo9193a();
        if (this.f7361d || !m9087F()) {
            return false;
        }
        int i2 = 5;
        while (i < 5) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase m9086E = m9086E();
                    if (m9086E == null) {
                        this.f7361d = true;
                        if (m9086E != null) {
                            m9086E.close();
                        }
                        return false;
                    }
                    m9086E.beginTransaction();
                    m9086E.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    m9086E.setTransactionSuccessful();
                    m9086E.endTransaction();
                    if (m9086E != null) {
                        m9086E.close();
                    }
                    return true;
                } catch (SQLiteException e) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    mo9324k().m9309t().m9366a("Error deleting app launch break from local database", e);
                    this.f7361d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep(i2);
                i2 += 20;
                i = 0 == 0 ? i + 1 : 0;
                sQLiteDatabase.close();
            } catch (SQLiteFullException e2) {
                mo9324k().m9309t().m9366a("Error deleting app launch break from local database", e2);
                this.f7361d = true;
                if (0 == 0) {
                }
                sQLiteDatabase.close();
            }
        }
        mo9324k().m9312w().m9365a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x024f  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable>] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v22, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> m9094a(int r25) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1665a4.m9094a(int):java.util.List");
    }

    /* renamed from: a */
    public final boolean m9095a(zzan zzanVar) {
        Parcel obtain = Parcel.obtain();
        zzanVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m9089a(0, marshall);
        }
        mo9324k().m9310u().m9365a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* renamed from: a */
    public final boolean m9096a(zzkq zzkqVar) {
        Parcel obtain = Parcel.obtain();
        zzkqVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m9089a(1, marshall);
        }
        mo9324k().m9310u().m9365a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: a */
    public final boolean m9097a(zzv zzvVar) {
        m9322i();
        byte[] m9918a = C1959z9.m9918a((Parcelable) zzvVar);
        if (m9918a.length <= 131072) {
            return m9089a(2, m9918a);
        }
        mo9324k().m9310u().m9365a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }
}
