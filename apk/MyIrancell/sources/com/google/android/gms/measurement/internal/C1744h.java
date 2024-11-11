package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.h */
/* loaded from: classes.dex */
public final class C1744h {
    /* renamed from: a */
    private static Set<String> m9361a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9362a(C1725f4 c1725f4, SQLiteDatabase sQLiteDatabase) {
        if (c1725f4 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            c1725f4.m9312w().m9365a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c1725f4.m9312w().m9365a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c1725f4.m9312w().m9365a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c1725f4.m9312w().m9365a("Failed to turn on database write permission for owner");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9363a(C1725f4 c1725f4, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (c1725f4 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!m9364a(c1725f4, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            if (c1725f4 == null) {
                throw new IllegalArgumentException("Monitor must not be null");
            }
            Set<String> m9361a = m9361a(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!m9361a.remove(str4)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length());
                    sb.append("Table ");
                    sb.append(str);
                    sb.append(" is missing required column: ");
                    sb.append(str4);
                    throw new SQLiteException(sb.toString());
                }
            }
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i += 2) {
                    if (!m9361a.remove(strArr[i])) {
                        sQLiteDatabase.execSQL(strArr[i + 1]);
                    }
                }
            }
            if (m9361a.isEmpty()) {
                return;
            }
            c1725f4.m9312w().m9367a("Table has extra columns. table, columns", str, TextUtils.join(", ", m9361a));
        } catch (SQLiteException e) {
            c1725f4.m9309t().m9366a("Failed to verify columns on table that was just created", str);
            throw e;
        }
    }

    /* renamed from: a */
    private static boolean m9364a(C1725f4 c1725f4, SQLiteDatabase sQLiteDatabase, String str) {
        if (c1725f4 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                if (cursor != null) {
                    cursor.close();
                }
                return moveToFirst;
            } catch (SQLiteException e) {
                c1725f4.m9312w().m9367a("Error querying for table", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
