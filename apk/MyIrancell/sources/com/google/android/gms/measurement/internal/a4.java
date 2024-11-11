package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class a4 extends c3 {
    private final e4 c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a4(j5 j5Var) {
        super(j5Var);
        this.c = new e4(this, l(), "google_app_measurement_local.db");
    }

    private final SQLiteDatabase E() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    private final boolean F() {
        return l().getDatabasePath("google_app_measurement_local.db").exists();
    }

    private static long a(SQLiteDatabase sQLiteDatabase) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean a(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.a4.a(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.c3
    protected final boolean A() {
        return false;
    }

    public final void B() {
        a();
        c();
        try {
            int delete = E().delete("messages", null, null) + 0;
            if (delete > 0) {
                k().B().a("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            k().t().a("Error resetting local analytics data. error", e);
        }
    }

    public final boolean C() {
        return a(3, new byte[0]);
    }

    public final boolean D() {
        int i;
        c();
        a();
        if (this.d || !F()) {
            return false;
        }
        int i2 = 5;
        while (i < 5) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase E = E();
                    if (E == null) {
                        this.d = true;
                        if (E != null) {
                            E.close();
                        }
                        return false;
                    }
                    E.beginTransaction();
                    E.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    E.setTransactionSuccessful();
                    E.endTransaction();
                    if (E != null) {
                        E.close();
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
                    k().t().a("Error deleting app launch break from local database", e);
                    this.d = true;
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
                k().t().a("Error deleting app launch break from local database", e2);
                this.d = true;
                if (0 == 0) {
                }
                sQLiteDatabase.close();
            }
        }
        k().w().a("Error deleting app launch break from local database in reasonable time");
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> a(int r25) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.a4.a(int):java.util.List");
    }

    public final boolean a(zzan zzanVar) {
        Parcel obtain = Parcel.obtain();
        zzanVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return a(0, marshall);
        }
        k().u().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean a(zzkq zzkqVar) {
        Parcel obtain = Parcel.obtain();
        zzkqVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return a(1, marshall);
        }
        k().u().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean a(zzv zzvVar) {
        i();
        byte[] a = z9.a((Parcelable) zzvVar);
        if (a.length <= 131072) {
            return a(2, a);
        }
        k().u().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }
}
