package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.preference.PreferenceManager;

/* loaded from: classes.dex */
public final class zw {
    private static final String[] c = {"text", "display", "format", "timestamp", "details"};
    private static final String[] d = {"id"};
    private static final String[] e = {"id", "details"};
    private final Activity a;
    private final boolean b;

    public zw(Activity activity) {
        this.a = activity;
        this.b = PreferenceManager.getDefaultSharedPreferences(activity).getBoolean("preferences_history", true);
    }

    private static void a(Cursor cursor, SQLiteDatabase sQLiteDatabase) {
        if (cursor != null) {
            cursor.close();
        }
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    private void a(String str) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = new xw(this.a).getWritableDatabase();
            try {
                sQLiteDatabase.delete("history", "text=?", new String[]{str});
                a((Cursor) null, sQLiteDatabase);
            } catch (Throwable th) {
                th = th;
                a((Cursor) null, sQLiteDatabase);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    public yw a(int i) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor = null;
        try {
            sQLiteDatabase = new xw(this.a).getReadableDatabase();
            try {
                cursor = sQLiteDatabase.query("history", c, null, null, null, null, "timestamp DESC");
                cursor.move(i + 1);
                String string = cursor.getString(0);
                String string2 = cursor.getString(1);
                String string3 = cursor.getString(2);
                yw ywVar = new yw(new fw(string, null, null, sv.valueOf(string3), cursor.getLong(3)), string2, cursor.getString(4));
                a(cursor, sQLiteDatabase);
                return ywVar;
            } catch (Throwable th) {
                th = th;
                a(cursor, sQLiteDatabase);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    public void a() {
        Cursor cursor;
        Throwable th;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor2 = null;
        try {
            sQLiteDatabase = new xw(this.a).getWritableDatabase();
            try {
                cursor = sQLiteDatabase.query("history", d, null, null, null, null, "timestamp DESC");
                try {
                    cursor.move(2000);
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(0);
                        String str = "Deleting scan history ID " + string;
                        sQLiteDatabase.delete("history", "id=" + string, null);
                    }
                    a(cursor, sQLiteDatabase);
                } catch (SQLiteException unused) {
                    cursor2 = cursor;
                    a(cursor2, sQLiteDatabase);
                } catch (Throwable th2) {
                    th = th2;
                    a(cursor, sQLiteDatabase);
                    throw th;
                }
            } catch (SQLiteException unused2) {
            } catch (Throwable th3) {
                cursor = null;
                th = th3;
            }
        } catch (SQLiteException unused3) {
            sQLiteDatabase = null;
        } catch (Throwable th4) {
            cursor = null;
            th = th4;
            sQLiteDatabase = null;
        }
    }

    public void a(fw fwVar, hx hxVar) {
        SQLiteDatabase sQLiteDatabase;
        if (!this.a.getIntent().getBooleanExtra("SAVE_HISTORY", true) || hxVar.a() || !this.b) {
            return;
        }
        if (!PreferenceManager.getDefaultSharedPreferences(this.a).getBoolean("preferences_remember_duplicates", false)) {
            a(fwVar.e());
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("text", fwVar.e());
        contentValues.put("format", fwVar.a().toString());
        contentValues.put("display", hxVar.e().toString());
        contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        try {
            sQLiteDatabase = new xw(this.a).getWritableDatabase();
            try {
                sQLiteDatabase.insert("history", "timestamp", contentValues);
                a((Cursor) null, sQLiteDatabase);
            } catch (Throwable th) {
                th = th;
                a((Cursor) null, sQLiteDatabase);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    public void a(String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        String str3;
        String str4;
        Cursor cursor = null;
        try {
            sQLiteDatabase = new xw(this.a).getWritableDatabase();
            try {
                Cursor query = sQLiteDatabase.query("history", e, "text=?", new String[]{str}, null, null, "timestamp DESC", "1");
                try {
                    if (query.moveToNext()) {
                        str3 = query.getString(0);
                        str4 = query.getString(1);
                    } else {
                        str3 = null;
                        str4 = null;
                    }
                    if (str3 != null) {
                        if (str4 != null) {
                            if (str4.contains(str2)) {
                                str2 = null;
                            } else {
                                str2 = str4 + " : " + str2;
                            }
                        }
                        if (str2 != null) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("details", str2);
                            sQLiteDatabase.update("history", contentValues, "id=?", new String[]{str3});
                        }
                    }
                    a(query, sQLiteDatabase);
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    a(cursor, sQLiteDatabase);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = null;
        }
    }
}
