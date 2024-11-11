package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes.dex */
class g60 extends SQLiteOpenHelper implements i60 {

    /* renamed from: a */
    private static final String[] f10223a = {"_id", "url", "length", "mime"};

    /* JADX INFO: Access modifiers changed from: package-private */
    public g60(Context context) {
        super(context, "AndroidVideoCache.db", (SQLiteDatabase.CursorFactory) null, 1);
        t60.m15549a(context);
    }

    /* renamed from: a */
    private ContentValues m11897a(y60 y60Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", y60Var.f14108a);
        contentValues.put("length", Long.valueOf(y60Var.f14109b));
        contentValues.put("mime", y60Var.f14110c);
        return contentValues;
    }

    /* renamed from: a */
    private y60 m11898a(Cursor cursor) {
        return new y60(cursor.getString(cursor.getColumnIndexOrThrow("url")), cursor.getLong(cursor.getColumnIndexOrThrow("length")), cursor.getString(cursor.getColumnIndexOrThrow("mime")));
    }

    @Override // p000.i60
    /* renamed from: a */
    public y60 mo11899a(String str) {
        Throwable th;
        Cursor cursor;
        t60.m15549a(str);
        y60 y60Var = null;
        try {
            cursor = getReadableDatabase().query("SourceInfo", f10223a, "url=?", new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        y60Var = m11898a(cursor);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return y60Var;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    @Override // p000.i60
    /* renamed from: a */
    public void mo11900a(String str, y60 y60Var) {
        t60.m15553a(str, y60Var);
        boolean z = mo11899a(str) != null;
        ContentValues m11897a = m11897a(y60Var);
        if (z) {
            getWritableDatabase().update("SourceInfo", m11897a, "url=?", new String[]{str});
        } else {
            getWritableDatabase().insert("SourceInfo", null, m11897a);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        t60.m15549a(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new IllegalStateException("Should not be called. There is no any migration");
    }
}
