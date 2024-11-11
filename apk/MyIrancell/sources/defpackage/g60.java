package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes.dex */
class g60 extends SQLiteOpenHelper implements i60 {
    private static final String[] a = {"_id", "url", "length", "mime"};

    /* JADX INFO: Access modifiers changed from: package-private */
    public g60(Context context) {
        super(context, "AndroidVideoCache.db", (SQLiteDatabase.CursorFactory) null, 1);
        t60.a(context);
    }

    private ContentValues a(y60 y60Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", y60Var.a);
        contentValues.put("length", Long.valueOf(y60Var.b));
        contentValues.put("mime", y60Var.c);
        return contentValues;
    }

    private y60 a(Cursor cursor) {
        return new y60(cursor.getString(cursor.getColumnIndexOrThrow("url")), cursor.getLong(cursor.getColumnIndexOrThrow("length")), cursor.getString(cursor.getColumnIndexOrThrow("mime")));
    }

    @Override // defpackage.i60
    public y60 a(String str) {
        Throwable th;
        Cursor cursor;
        t60.a(str);
        y60 y60Var = null;
        try {
            cursor = getReadableDatabase().query("SourceInfo", a, "url=?", new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        y60Var = a(cursor);
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

    @Override // defpackage.i60
    public void a(String str, y60 y60Var) {
        t60.a(str, y60Var);
        boolean z = a(str) != null;
        ContentValues a2 = a(y60Var);
        if (z) {
            getWritableDatabase().update("SourceInfo", a2, "url=?", new String[]{str});
        } else {
            getWritableDatabase().insert("SourceInfo", null, a2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        t60.a(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new IllegalStateException("Should not be called. There is no any migration");
    }
}
