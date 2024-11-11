package p000;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.preference.PreferenceManager;

/* renamed from: zw */
/* loaded from: classes.dex */
public final class C3544zw {

    /* renamed from: c */
    private static final String[] f14539c = {"text", "display", "format", "timestamp", "details"};

    /* renamed from: d */
    private static final String[] f14540d = {"id"};

    /* renamed from: e */
    private static final String[] f14541e = {"id", "details"};

    /* renamed from: a */
    private final Activity f14542a;

    /* renamed from: b */
    private final boolean f14543b;

    public C3544zw(Activity activity) {
        this.f14542a = activity;
        this.f14543b = PreferenceManager.getDefaultSharedPreferences(activity).getBoolean("preferences_history", true);
    }

    /* renamed from: a */
    private static void m16960a(Cursor cursor, SQLiteDatabase sQLiteDatabase) {
        if (cursor != null) {
            cursor.close();
        }
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    /* renamed from: a */
    private void m16961a(String str) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = new C3453xw(this.f14542a).getWritableDatabase();
            try {
                sQLiteDatabase.delete("history", "text=?", new String[]{str});
                m16960a((Cursor) null, sQLiteDatabase);
            } catch (Throwable th) {
                th = th;
                m16960a((Cursor) null, sQLiteDatabase);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    /* renamed from: a */
    public C3502yw m16962a(int i) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor = null;
        try {
            sQLiteDatabase = new C3453xw(this.f14542a).getReadableDatabase();
            try {
                cursor = sQLiteDatabase.query("history", f14539c, null, null, null, null, "timestamp DESC");
                cursor.move(i + 1);
                String string = cursor.getString(0);
                String string2 = cursor.getString(1);
                String string3 = cursor.getString(2);
                C3502yw c3502yw = new C3502yw(new C2488fw(string, null, null, EnumC3224sv.valueOf(string3), cursor.getLong(3)), string2, cursor.getString(4));
                m16960a(cursor, sQLiteDatabase);
                return c3502yw;
            } catch (Throwable th) {
                th = th;
                m16960a(cursor, sQLiteDatabase);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    /* renamed from: a */
    public void m16963a() {
        Cursor cursor;
        Throwable th;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor2 = null;
        try {
            sQLiteDatabase = new C3453xw(this.f14542a).getWritableDatabase();
            try {
                cursor = sQLiteDatabase.query("history", f14540d, null, null, null, null, "timestamp DESC");
                try {
                    cursor.move(2000);
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(0);
                        String str = "Deleting scan history ID " + string;
                        sQLiteDatabase.delete("history", "id=" + string, null);
                    }
                    m16960a(cursor, sQLiteDatabase);
                } catch (SQLiteException unused) {
                    cursor2 = cursor;
                    m16960a(cursor2, sQLiteDatabase);
                } catch (Throwable th2) {
                    th = th2;
                    m16960a(cursor, sQLiteDatabase);
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

    /* renamed from: a */
    public void m16964a(C2488fw c2488fw, AbstractC2569hx abstractC2569hx) {
        SQLiteDatabase sQLiteDatabase;
        if (!this.f14542a.getIntent().getBooleanExtra("SAVE_HISTORY", true) || abstractC2569hx.mo12264a() || !this.f14543b) {
            return;
        }
        if (!PreferenceManager.getDefaultSharedPreferences(this.f14542a).getBoolean("preferences_remember_duplicates", false)) {
            m16961a(c2488fw.m11842e());
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("text", c2488fw.m11842e());
        contentValues.put("format", c2488fw.m11835a().toString());
        contentValues.put("display", abstractC2569hx.mo3200e().toString());
        contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        try {
            sQLiteDatabase = new C3453xw(this.f14542a).getWritableDatabase();
            try {
                sQLiteDatabase.insert("history", "timestamp", contentValues);
                m16960a((Cursor) null, sQLiteDatabase);
            } catch (Throwable th) {
                th = th;
                m16960a((Cursor) null, sQLiteDatabase);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    /* renamed from: a */
    public void m16965a(String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        String str3;
        String str4;
        Cursor cursor = null;
        try {
            sQLiteDatabase = new C3453xw(this.f14542a).getWritableDatabase();
            try {
                Cursor query = sQLiteDatabase.query("history", f14541e, "text=?", new String[]{str}, null, null, "timestamp DESC", "1");
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
                    m16960a(query, sQLiteDatabase);
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    m16960a(cursor, sQLiteDatabase);
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
