package ir.tapsell.sdk.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Looper;
import defpackage.i50;
import defpackage.w40;
import ir.tapsell.sdk.TapsellAd;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e extends SQLiteOpenHelper {
    private static w40 b = new w40("dbAccessThread");
    private static e c;
    private File a;

    protected e(Context context) {
        super(context, "tap.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.a = context.getDatabasePath("tap.db");
    }

    public static synchronized e a(Context context) {
        e eVar;
        synchronized (e.class) {
            if (c == null) {
                c = new e(context.getApplicationContext());
            }
            eVar = c;
        }
        return eVar;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS long_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }

    public static synchronized void a(Runnable runnable) {
        synchronized (e.class) {
            if (Thread.currentThread() != b) {
                if (b == null) {
                    b = new w40("dbAccessThread");
                }
                if (!b.isAlive()) {
                    b.start();
                }
                b.a(runnable);
            } else {
                runnable.run();
            }
        }
    }

    private void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new RuntimeException("Accessing database through MainThread is not allowed.");
        }
    }

    private boolean c() {
        b();
        try {
            close();
            return this.a.delete();
        } catch (SecurityException e) {
            i50.a("delete failed");
            e.printStackTrace();
            return false;
        }
    }

    public int a(TapsellAd tapsellAd) {
        b();
        try {
            return getWritableDatabase().delete("cached_ads", "key =?", new String[]{tapsellAd.getAd().getSuggestionId().toString()});
        } catch (SQLiteException e) {
            i50.a(String.format("removeCachedAd from %s failed", "cached_ads"));
            e.printStackTrace();
            c();
            return -1;
        } catch (StackOverflowError e2) {
            i50.a(String.format("removeCachedAd from %s failed", "cached_ads"));
            e2.printStackTrace();
            return -1;
        }
    }

    public synchronized long a(String str, String str2) {
        return str2 == null ? b("store", str) : a("store", str, str2);
    }

    synchronized long a(String str, String str2, Object obj) {
        long j;
        b();
        long j2 = -1;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str2);
            if (obj instanceof Long) {
                contentValues.put("value", (Long) obj);
            } else {
                contentValues.put("value", (String) obj);
            }
            j = writableDatabase.insertWithOnConflict(str, null, contentValues, 5);
            if (j == -1) {
                try {
                    i50.c("Insert failed");
                } catch (SQLiteException e) {
                    e = e;
                    j2 = j;
                    i50.a(String.format("insertOrReplaceKeyValue in %s failed", str));
                    e.printStackTrace();
                    c();
                    j = j2;
                    return j;
                } catch (StackOverflowError e2) {
                    e = e2;
                    j2 = j;
                    i50.a(String.format("insertOrReplaceKeyValue in %s failed", str));
                    e.printStackTrace();
                    j = j2;
                    return j;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
        } catch (StackOverflowError e4) {
            e = e4;
        }
        return j;
    }

    Cursor a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public TapsellAd[] a() {
        Cursor rawQuery;
        b();
        ArrayList arrayList = new ArrayList();
        try {
            rawQuery = getWritableDatabase().rawQuery("SELECT * FROM cached_ads", null);
        } catch (SQLiteException e) {
            i50.a(String.format("getCachedAds from %s failed", "cached_ads"));
            e.printStackTrace();
            c();
        } catch (StackOverflowError e2) {
            i50.a(String.format("getCachedAds from %s failed", "cached_ads"));
            e2.printStackTrace();
        }
        if (rawQuery != null && rawQuery.getCount() != 0) {
            rawQuery.moveToFirst();
            int count = rawQuery.getCount();
            for (int i = 0; i < count; i++) {
                arrayList.add((TapsellAd) GsonHelper.getCustomGson().fromJson(rawQuery.getString(rawQuery.getColumnIndex("value")), TapsellAd.class));
                if (i < count - 1) {
                    rawQuery.moveToNext();
                }
            }
            rawQuery.close();
            return (TapsellAd[]) arrayList.toArray(new TapsellAd[arrayList.size()]);
        }
        return new TapsellAd[0];
    }

    public long b(TapsellAd tapsellAd) {
        b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", tapsellAd.getAd().getSuggestionId().toString());
        contentValues.put("value", GsonHelper.getCustomGson().toJson(tapsellAd));
        try {
            return getWritableDatabase().insert("cached_ads", null, contentValues);
        } catch (SQLiteException e) {
            i50.a(String.format("cacheNewAd to %s failed", "cached_ads"));
            e.printStackTrace();
            c();
            return -1L;
        } catch (StackOverflowError e2) {
            i50.a(String.format("cacheNewAd to %s failed", "cached_ads"));
            e2.printStackTrace();
            return -1L;
        }
    }

    synchronized long b(String str, String str2) {
        long j;
        b();
        j = -1;
        try {
            try {
                j = getWritableDatabase().delete(str, "key=?", new String[]{str2});
            } catch (SQLiteException e) {
                i50.a(String.format("deleteKey from %s failed", str));
                e.printStackTrace();
                c();
            }
        } catch (StackOverflowError e2) {
            i50.a(String.format("deleteKey from %s failed", str));
            e2.printStackTrace();
        }
        return j;
    }

    public synchronized String c(String str, String str2) {
        String str3 = (String) d("store", str);
        if (str3 != null) {
            str2 = str3;
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r15 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r15 == null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f A[Catch: all -> 0x0093, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:16:0x0044, B:35:0x008f, B:36:0x0092), top: B:2:0x0001 }] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected synchronized java.lang.Object d(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            r13.b()     // Catch: java.lang.Throwable -> L93
            r0 = 0
            r1 = 0
            r2 = 1
            android.database.sqlite.SQLiteDatabase r4 = r13.getReadableDatabase()     // Catch: java.lang.Throwable -> L4e java.lang.RuntimeException -> L50 java.lang.StackOverflowError -> L5c android.database.sqlite.SQLiteException -> L71
            r3 = 2
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L4e java.lang.RuntimeException -> L50 java.lang.StackOverflowError -> L5c android.database.sqlite.SQLiteException -> L71
            java.lang.String r3 = "key"
            r6[r1] = r3     // Catch: java.lang.Throwable -> L4e java.lang.RuntimeException -> L50 java.lang.StackOverflowError -> L5c android.database.sqlite.SQLiteException -> L71
            java.lang.String r3 = "value"
            r6[r2] = r3     // Catch: java.lang.Throwable -> L4e java.lang.RuntimeException -> L50 java.lang.StackOverflowError -> L5c android.database.sqlite.SQLiteException -> L71
            java.lang.String r7 = "key = ?"
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L4e java.lang.RuntimeException -> L50 java.lang.StackOverflowError -> L5c android.database.sqlite.SQLiteException -> L71
            r8[r1] = r15     // Catch: java.lang.Throwable -> L4e java.lang.RuntimeException -> L50 java.lang.StackOverflowError -> L5c android.database.sqlite.SQLiteException -> L71
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r3 = r13
            r5 = r14
            android.database.Cursor r15 = r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L4e java.lang.RuntimeException -> L50 java.lang.StackOverflowError -> L5c android.database.sqlite.SQLiteException -> L71
            boolean r3 = r15.moveToFirst()     // Catch: java.lang.RuntimeException -> L48 java.lang.StackOverflowError -> L4a android.database.sqlite.SQLiteException -> L4c java.lang.Throwable -> L8b
            if (r3 == 0) goto L42
            java.lang.String r3 = "store"
            boolean r3 = r14.equals(r3)     // Catch: java.lang.RuntimeException -> L48 java.lang.StackOverflowError -> L4a android.database.sqlite.SQLiteException -> L4c java.lang.Throwable -> L8b
            if (r3 == 0) goto L39
            java.lang.String r14 = r15.getString(r2)     // Catch: java.lang.RuntimeException -> L48 java.lang.StackOverflowError -> L4a android.database.sqlite.SQLiteException -> L4c java.lang.Throwable -> L8b
            goto L41
        L39:
            long r3 = r15.getLong(r2)     // Catch: java.lang.RuntimeException -> L48 java.lang.StackOverflowError -> L4a android.database.sqlite.SQLiteException -> L4c java.lang.Throwable -> L8b
            java.lang.Long r14 = java.lang.Long.valueOf(r3)     // Catch: java.lang.RuntimeException -> L48 java.lang.StackOverflowError -> L4a android.database.sqlite.SQLiteException -> L4c java.lang.Throwable -> L8b
        L41:
            r0 = r14
        L42:
            if (r15 == 0) goto L89
        L44:
            r15.close()     // Catch: java.lang.Throwable -> L93
            goto L89
        L48:
            r14 = move-exception
            goto L52
        L4a:
            r3 = move-exception
            goto L5e
        L4c:
            r3 = move-exception
            goto L73
        L4e:
            r14 = move-exception
            goto L8d
        L50:
            r14 = move-exception
            r15 = r0
        L52:
            java.lang.String r14 = r14.getMessage()     // Catch: java.lang.Throwable -> L8b
            defpackage.h50.a(r14)     // Catch: java.lang.Throwable -> L8b
            if (r15 == 0) goto L89
            goto L44
        L5c:
            r3 = move-exception
            r15 = r0
        L5e:
            java.lang.String r4 = "getValue from %s failed"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L8b
            r2[r1] = r14     // Catch: java.lang.Throwable -> L8b
            java.lang.String r14 = java.lang.String.format(r4, r2)     // Catch: java.lang.Throwable -> L8b
            defpackage.i50.a(r14)     // Catch: java.lang.Throwable -> L8b
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L8b
            if (r15 == 0) goto L89
            goto L44
        L71:
            r3 = move-exception
            r15 = r0
        L73:
            java.lang.String r4 = "getValue from %s failed"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L8b
            r2[r1] = r14     // Catch: java.lang.Throwable -> L8b
            java.lang.String r14 = java.lang.String.format(r4, r2)     // Catch: java.lang.Throwable -> L8b
            defpackage.i50.a(r14)     // Catch: java.lang.Throwable -> L8b
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L8b
            r13.c()     // Catch: java.lang.Throwable -> L8b
            if (r15 == 0) goto L89
            goto L44
        L89:
            monitor-exit(r13)
            return r0
        L8b:
            r14 = move-exception
            r0 = r15
        L8d:
            if (r0 == 0) goto L92
            r0.close()     // Catch: java.lang.Throwable -> L93
        L92:
            throw r14     // Catch: java.lang.Throwable -> L93
        L93:
            r14 = move-exception
            monitor-exit(r13)
            goto L97
        L96:
            throw r14
        L97:
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.tapsell.sdk.utils.e.d(java.lang.String, java.lang.String):java.lang.Object");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cached_ads (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            i50.a("onUpgrade() with invalid oldVersion and newVersion");
            a(sQLiteDatabase);
            return;
        }
        if (i2 <= 1) {
            return;
        }
        if (i == 1) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
            if (i2 <= 2) {
                return;
            }
        } else if (i != 2) {
            if (i != 3) {
                i50.a("onUpgrade() with unknown oldVersion " + i);
                a(sQLiteDatabase);
                return;
            }
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
    }
}
