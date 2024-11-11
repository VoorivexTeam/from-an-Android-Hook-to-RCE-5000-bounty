package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.HashMap;

/* renamed from: aj */
/* loaded from: classes.dex */
public class C0023aj extends SQLiteOpenHelper {

    /* renamed from: d */
    private static C0023aj f110d;

    /* renamed from: a */
    private final HashMap<String, String> f111a;

    /* renamed from: b */
    private final HashMap<String, String> f112b;

    /* renamed from: c */
    private final HashMap<String, String> f113c;

    private C0023aj(Context context) {
        super(context, "wxn.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f111a = new HashMap<>();
        this.f112b = new HashMap<>();
        this.f113c = new HashMap<>();
    }

    /* renamed from: a */
    public static synchronized C0023aj m160a(Context context) {
        C0023aj c0023aj;
        synchronized (C0023aj.class) {
            if (f110d == null) {
                f110d = new C0023aj(context);
            }
            c0023aj = f110d;
        }
        return c0023aj;
    }

    /* renamed from: a */
    private void m161a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cachedAcrossSession (_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,_data blob );");
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: b */
    private void m162b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cachedpagemap (_id INTEGER PRIMARY KEY AUTOINCREMENT,menulistname TEXT,name TEXT );");
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: c */
    private void m163c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE cached (_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,_data blob );");
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: d */
    private void m164d(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS emoticons_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,url TEXT,_data blob, Notation TEXT, ImageIndex TEXT );");
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: e */
    private void m165e(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE private (_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,_data blob, size INTEGER DEFAULT 0 );");
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: f */
    private void m166f(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE public (_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,_data blob, size INTEGER DEFAULT 0 );");
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: g */
    private void m167g(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE startup_images (_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,type INTEGER DEFAULT 0,_data blob, size INTEGER DEFAULT 0 );");
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: h */
    private void m168h(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("PRAGMA default_cache_size = 4096;PRAGMA page_size = 4096;PRAGMA temp_store = MEMORY;PRAGMA synchronous = OFF;");
    }

    /* renamed from: a */
    public void m169a() {
        try {
            getWritableDatabase().delete("cachedAcrossSession", null, null);
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: a */
    public void m170a(String str) {
        try {
            getWritableDatabase().delete(str, null, null);
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: a */
    public void m171a(String str, int i) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (str != null) {
                writableDatabase.delete("startup_images", "name=?", new String[]{str});
            } else if (i != -1) {
                writableDatabase.delete("startup_images", "type=?", new String[]{Long.valueOf(i).toString()});
            }
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: a */
    public void m172a(String str, String str2, byte[] bArr) {
        if (str == null || bArr == null || str2 == null) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (m205i(str, str2)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("name", str);
                contentValues.put("_data", bArr);
                contentValues.put("size", Integer.valueOf(bArr.length));
                writableDatabase.update(str2, contentValues, "name=?", new String[]{str});
            } else {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("name", str);
                contentValues2.put("_data", bArr);
                contentValues2.put("size", Integer.valueOf(bArr.length));
                writableDatabase.insert(str2, null, contentValues2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void m173a(String str, byte[] bArr) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            m161a(writableDatabase);
            if (m205i(str, "cachedAcrossSession")) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("name", str);
                contentValues.put("_data", bArr);
                writableDatabase.update("cachedAcrossSession", contentValues, "name=?", new String[]{str});
            } else {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("name", str);
                contentValues2.put("_data", bArr);
                writableDatabase.insert("cachedAcrossSession", null, contentValues2);
            }
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: a */
    public void m174a(String str, byte[] bArr, int i) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (m176a((String) null, "startup_images", i)) {
                m171a((String) null, i);
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("_data", bArr);
            contentValues.put("type", Integer.valueOf(i));
            writableDatabase.insert("startup_images", null, contentValues);
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: a */
    public void m175a(String str, byte[] bArr, String str2, String str3, String str4) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            m164d(writableDatabase);
            if (!m177a(str3, "emoticons_table", str, str2)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("url", str4);
                contentValues.put("_data", bArr);
                contentValues.put("name", str);
                contentValues.put("Notation", str2);
                contentValues.put("ImageIndex", str3);
                writableDatabase.insert("emoticons_table", null, contentValues);
                return;
            }
            ContentValues contentValues2 = new ContentValues();
            if (str4 != null) {
                contentValues2.put("url", str4);
            }
            if (bArr != null) {
                contentValues2.put("_data", bArr);
            }
            if (contentValues2.size() > 0) {
                writableDatabase.update("emoticons_table", contentValues2, "ImageIndex=?", new String[]{str3});
            }
        } catch (SQLiteException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r2 == null) goto L29;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m176a(java.lang.String r13, java.lang.String r14, int r15) {
        /*
            r12 = this;
            long r0 = (long) r15
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 0
            if (r14 == 0) goto L6c
            java.lang.String r2 = "startup_images"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L6c
            r2 = 0
            r3 = 1
            if (r13 == 0) goto L33
            android.database.sqlite.SQLiteDatabase r4 = r12.getReadableDatabase()     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31
            r6 = 0
            java.lang.String r7 = "name=? AND type=?"
            r15 = 2
            java.lang.String[] r8 = new java.lang.String[r15]     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31
            r8[r1] = r13     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31
            r8[r3] = r13     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31
            r9 = 0
            r10 = 0
            r11 = 0
            r5 = r14
            android.database.Cursor r13 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31
            goto L4c
        L2f:
            r13 = move-exception
            goto L5e
        L31:
            goto L64
        L33:
            if (r15 <= 0) goto L4d
            android.database.sqlite.SQLiteDatabase r4 = r12.getReadableDatabase()     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31
            r6 = 0
            java.lang.String r7 = "type=?"
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31
            r8[r1] = r13     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31
            r9 = 0
            r10 = 0
            r11 = 0
            r5 = r14
            android.database.Cursor r13 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31
        L4c:
            r2 = r13
        L4d:
            if (r2 == 0) goto L67
            int r13 = r2.getCount()     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31
            if (r13 <= 0) goto L67
            r2.close()     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31
            if (r2 == 0) goto L5d
            r2.close()
        L5d:
            return r3
        L5e:
            if (r2 == 0) goto L63
            r2.close()
        L63:
            throw r13
        L64:
            if (r2 == 0) goto L6c
            goto L69
        L67:
            if (r2 == 0) goto L6c
        L69:
            r2.close()
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0023aj.m176a(java.lang.String, java.lang.String, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r2 == null) goto L24;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m177a(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L53
            if (r13 == 0) goto L53
            r1 = 1
            r2 = 0
            if (r14 == 0) goto L25
            if (r15 == 0) goto L25
            android.database.sqlite.SQLiteDatabase r3 = r11.getReadableDatabase()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4f
            r5 = 0
            java.lang.String r6 = "ImageIndex=? AND name=? AND Notation=?"
            r4 = 3
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4f
            r7[r0] = r12     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4f
            r7[r1] = r14     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4f
            r12 = 2
            r7[r12] = r15     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4f
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r13
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4f
            goto L38
        L25:
            android.database.sqlite.SQLiteDatabase r3 = r11.getReadableDatabase()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4f
            r5 = 0
            java.lang.String r6 = "ImageIndex=?"
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4f
            r7[r0] = r12     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4f
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r13
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4f
        L38:
            r2 = r12
            if (r2 == 0) goto L42
            int r12 = r2.getCount()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4f
            if (r12 <= 0) goto L42
            r0 = 1
        L42:
            if (r2 == 0) goto L53
        L44:
            r2.close()
            goto L53
        L48:
            r12 = move-exception
            if (r2 == 0) goto L4e
            r2.close()
        L4e:
            throw r12
        L4f:
            if (r2 == 0) goto L53
            goto L44
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0023aj.m177a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r12 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0067, code lost:
    
        if (r12 == null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] m178a(java.lang.String r12, int r13, java.lang.String r14) {
        /*
            r11 = this;
            r0 = 0
            if (r14 == 0) goto L6c
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L1f
            android.database.sqlite.SQLiteDatabase r3 = r11.getReadableDatabase()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r5 = 0
            java.lang.String r6 = "name=?"
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r7[r1] = r12     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r14
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            goto L3f
        L1b:
            r12 = move-exception
            goto L5d
        L1d:
            r12 = r0
            goto L64
        L1f:
            if (r13 <= 0) goto L3e
            long r12 = (long) r13     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            android.database.sqlite.SQLiteDatabase r3 = r11.getReadableDatabase()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r5 = 0
            java.lang.String r6 = "type=?"
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r7[r1] = r12     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r14
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            goto L3f
        L3e:
            r12 = r0
        L3f:
            if (r12 == 0) goto L67
            boolean r13 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L63
            if (r13 == 0) goto L67
            java.lang.String r13 = "_data"
            int r13 = r12.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L63
            byte[] r13 = r12.getBlob(r13)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L63
            r12.close()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L63
            if (r12 == 0) goto L59
            r12.close()
        L59:
            return r13
        L5a:
            r13 = move-exception
            r0 = r12
            r12 = r13
        L5d:
            if (r0 == 0) goto L62
            r0.close()
        L62:
            throw r12
        L63:
        L64:
            if (r12 == 0) goto L6c
            goto L69
        L67:
            if (r12 == 0) goto L6c
        L69:
            r12.close()
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0023aj.m178a(java.lang.String, int, java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006b, code lost:
    
        if (r12 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0060, code lost:
    
        if (r12 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
    
        return null;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] m179a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getWritableDatabase()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L6a
            r10.m161a(r1)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L6a
            if (r11 == 0) goto L5f
            if (r12 == 0) goto L5f
            android.database.sqlite.SQLiteDatabase r2 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L6a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r12
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L6a
            if (r12 == 0) goto L60
        L1d:
            boolean r1 = r12.moveToNext()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            if (r1 == 0) goto L60
            java.lang.String r1 = "name"
            int r1 = r12.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.lang.String r1 = r12.getString(r1)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            if (r1 == 0) goto L1d
            if (r1 == 0) goto L1d
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            if (r2 <= 0) goto L1d
            r2 = 0
        L38:
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            if (r2 >= r3) goto L1d
            boolean r3 = r1.equals(r11)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            if (r3 == 0) goto L57
            java.lang.String r11 = "_data"
            int r11 = r12.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            byte[] r11 = r12.getBlob(r11)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            r12.close()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            if (r12 == 0) goto L56
            r12.close()
        L56:
            return r11
        L57:
            int r2 = r2 + 1
            goto L38
        L5a:
            r11 = move-exception
            r0 = r12
            goto L64
        L5d:
            goto L6b
        L5f:
            r12 = r0
        L60:
            if (r12 == 0) goto L70
            goto L6d
        L63:
            r11 = move-exception
        L64:
            if (r0 == 0) goto L69
            r0.close()
        L69:
            throw r11
        L6a:
            r12 = r0
        L6b:
            if (r12 == 0) goto L70
        L6d:
            r12.close()
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0023aj.m179a(java.lang.String, java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
    
        if (r12 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        if (r12 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0064, code lost:
    
        return null;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m180b(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getWritableDatabase()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            r10.m162b(r1)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            if (r11 == 0) goto L53
            if (r12 == 0) goto L53
            android.database.sqlite.SQLiteDatabase r2 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r12
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            if (r12 == 0) goto L54
        L1d:
            boolean r1 = r12.moveToNext()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            if (r1 == 0) goto L54
            java.lang.String r1 = "menulistname"
            int r1 = r12.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            java.lang.String r1 = r12.getString(r1)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            if (r1 == 0) goto L1d
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            if (r2 <= 0) goto L1d
            boolean r1 = r1.equals(r11)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            if (r1 == 0) goto L1d
            java.lang.String r11 = "name"
            int r11 = r12.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            java.lang.String r11 = r12.getString(r11)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            r12.close()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            if (r12 == 0) goto L4d
            r12.close()
        L4d:
            return r11
        L4e:
            r11 = move-exception
            r0 = r12
            goto L58
        L51:
            goto L5f
        L53:
            r12 = r0
        L54:
            if (r12 == 0) goto L64
            goto L61
        L57:
            r11 = move-exception
        L58:
            if (r0 == 0) goto L5d
            r0.close()
        L5d:
            throw r11
        L5e:
            r12 = r0
        L5f:
            if (r12 == 0) goto L64
        L61:
            r12.close()
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0023aj.m180b(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public void m181b() {
        try {
            getWritableDatabase().delete("cachedpagemap", null, null);
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: b */
    public void m182b(String str) {
        try {
            getWritableDatabase().delete("cachedAcrossSession", "name=?", new String[]{str});
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: b */
    public void m183b(String str, byte[] bArr) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (m205i(str, "cached")) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("name", str);
                contentValues.put("_data", bArr);
                writableDatabase.update("cached", contentValues, "name=?", new String[]{str});
            } else {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("name", str);
                contentValues2.put("_data", bArr);
                writableDatabase.insert("cached", null, contentValues2);
            }
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: b */
    public void m184b(String str, byte[] bArr, int i) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (m176a(str, "startup_images", i)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("name", str);
                contentValues.put("_data", bArr);
                contentValues.put("type", Integer.valueOf(i));
                writableDatabase.update("startup_images", contentValues, "name=?", new String[]{str});
            } else {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("name", str);
                contentValues2.put("_data", bArr);
                contentValues2.put("type", Integer.valueOf(i));
                writableDatabase.insert("startup_images", null, contentValues2);
            }
        } catch (SQLiteException | IllegalArgumentException unused) {
        }
    }

    /* renamed from: c */
    public void m185c() {
        try {
            m170a("private");
            m170a("public");
            m170a("cached");
            m170a("startup_images");
            m181b();
            m198g();
            m169a();
            m188d();
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: c */
    public void m186c(String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            int delete = writableDatabase.delete("cachedpagemap", "menulistname=?", new String[]{str});
            if (delete != 1 && delete == 0) {
                writableDatabase.delete("cachedpagemap", "name=?", new String[]{str});
            }
        } catch (SQLiteException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0065, code lost:
    
        if (r11 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005a, code lost:
    
        if (r11 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0067, code lost:
    
        r11.close();
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] m187c(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L6a
            if (r11 == 0) goto L6a
            android.database.sqlite.SQLiteDatabase r1 = r9.getReadableDatabase()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L64
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r2 = r11
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L64
            if (r11 == 0) goto L5a
        L16:
            boolean r1 = r11.moveToNext()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            if (r1 == 0) goto L5a
            java.lang.String r1 = "name"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            if (r1 == 0) goto L16
            java.lang.String r2 = ";"
            java.lang.String[] r1 = r1.split(r2)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            if (r1 == 0) goto L16
            int r2 = r1.length     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            if (r2 <= 0) goto L16
            r2 = 0
        L34:
            int r3 = r1.length     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            if (r2 >= r3) goto L16
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            boolean r3 = r3.equals(r10)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            if (r3 == 0) goto L52
            java.lang.String r10 = "_data"
            int r10 = r11.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            byte[] r10 = r11.getBlob(r10)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            r11.close()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            if (r11 == 0) goto L51
            r11.close()
        L51:
            return r10
        L52:
            int r2 = r2 + 1
            goto L34
        L55:
            r10 = move-exception
            r0 = r11
            goto L5e
        L58:
            goto L65
        L5a:
            if (r11 == 0) goto L6a
            goto L67
        L5d:
            r10 = move-exception
        L5e:
            if (r0 == 0) goto L63
            r0.close()
        L63:
            throw r10
        L64:
            r11 = r0
        L65:
            if (r11 == 0) goto L6a
        L67:
            r11.close()
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0023aj.m187c(java.lang.String, java.lang.String):byte[]");
    }

    /* renamed from: d */
    public void m188d() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            m164d(writableDatabase);
            writableDatabase.delete("emoticons_table", null, null);
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: d */
    public void m189d(String str) {
        try {
            getWritableDatabase().delete("cached", "name=?", new String[]{str});
        } catch (SQLiteException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r10 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        if (r10 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        r10.close();
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] m190d(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L4a
            if (r11 == 0) goto L4a
            android.database.sqlite.SQLiteDatabase r1 = r9.getReadableDatabase()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            r3 = 0
            java.lang.String r4 = "name=?"
            r2 = 1
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            r2 = 0
            r5[r2] = r10     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            r6 = 0
            r7 = 0
            r8 = 0
            r2 = r11
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            if (r10 == 0) goto L3a
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            if (r11 == 0) goto L3a
            java.lang.String r11 = "_data"
            int r11 = r10.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            byte[] r11 = r10.getBlob(r11)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r10.close()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            if (r10 == 0) goto L34
            r10.close()
        L34:
            return r11
        L35:
            r11 = move-exception
            r0 = r10
            goto L3e
        L38:
            goto L45
        L3a:
            if (r10 == 0) goto L4a
            goto L47
        L3d:
            r11 = move-exception
        L3e:
            if (r0 == 0) goto L43
            r0.close()
        L43:
            throw r11
        L44:
            r10 = r0
        L45:
            if (r10 == 0) goto L4a
        L47:
            r10.close()
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0023aj.m190d(java.lang.String, java.lang.String):byte[]");
    }

    /* renamed from: e */
    public String m191e(String str) {
        return this.f112b.get(str);
    }

    /* renamed from: e */
    public void m192e() {
        try {
            getWritableDatabase().delete("cached", null, null);
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: e */
    public void m193e(String str, String str2) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            m162b(writableDatabase);
            if (m208j(str, "cachedpagemap")) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("menulistname", str);
                contentValues.put("name", str2);
                writableDatabase.update("cachedpagemap", contentValues, "menulistname=?", new String[]{str2});
            } else {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("menulistname", str);
                contentValues2.put("name", str2);
                writableDatabase.insert("cachedpagemap", null, contentValues2);
            }
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: f */
    public String m194f(String str) {
        return this.f113c.get(str);
    }

    /* renamed from: f */
    public void m195f() {
        this.f113c.clear();
    }

    /* renamed from: f */
    public void m196f(String str, String str2) {
        this.f112b.put(str, str2);
    }

    /* renamed from: g */
    public String m197g(String str) {
        return this.f111a.get(str);
    }

    /* renamed from: g */
    public void m198g() {
        this.f111a.clear();
        this.f112b.clear();
    }

    /* renamed from: g */
    public void m199g(String str, String str2) {
        this.f113c.put(str, str2);
    }

    /* renamed from: h */
    public String m200h(String str) {
        return this.f111a.get(str);
    }

    /* renamed from: h */
    public void m201h() {
        try {
            getWritableDatabase().delete("private", null, null);
        } catch (SQLiteException unused) {
        }
    }

    /* renamed from: h */
    public void m202h(String str, String str2) {
        this.f111a.put(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r2 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r2 == null) goto L21;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m203i(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r0 = "size"
            r1 = 0
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.getReadableDatabase()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            r5[r1] = r0     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r12
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            if (r2 == 0) goto L38
            boolean r12 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            if (r12 == 0) goto L38
            int r12 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            int r12 = r2.getInt(r12)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            r1 = r12
        L28:
            boolean r12 = r2.moveToNext()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            if (r12 == 0) goto L38
            int r12 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            int r12 = r2.getInt(r12)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            int r1 = r1 + r12
            goto L28
        L38:
            if (r2 == 0) goto L49
        L3a:
            r2.close()
            goto L49
        L3e:
            r12 = move-exception
            if (r2 == 0) goto L44
            r2.close()
        L44:
            throw r12
        L45:
            if (r2 == 0) goto L49
            goto L3a
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0023aj.m203i(java.lang.String):int");
    }

    /* renamed from: i */
    public void m204i() {
        try {
            getWritableDatabase().delete("public", null, null);
        } catch (SQLiteException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r1 == null) goto L23;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m205i(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L3b
            if (r13 == 0) goto L3b
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r11.getReadableDatabase()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L35
            r4 = 0
            java.lang.String r5 = "name=?"
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L35
            r6[r0] = r12     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L35
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r13
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L35
            if (r1 == 0) goto L2b
            int r12 = r1.getCount()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L35
            if (r12 <= 0) goto L2b
            r1.close()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L35
            if (r1 == 0) goto L2a
            r1.close()
        L2a:
            return r10
        L2b:
            if (r1 == 0) goto L3b
            goto L38
        L2e:
            r12 = move-exception
            if (r1 == 0) goto L34
            r1.close()
        L34:
            throw r12
        L35:
            if (r1 == 0) goto L3b
        L38:
            r1.close()
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0023aj.m205i(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: j */
    public Cursor m206j() {
        try {
            m164d(getWritableDatabase());
            return getReadableDatabase().query("emoticons_table", null, null, null, null, null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: j */
    public boolean m207j(String str) {
        return this.f111a.containsKey(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r1 == null) goto L23;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m208j(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L3b
            if (r13 == 0) goto L3b
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r11.getReadableDatabase()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L35
            r4 = 0
            java.lang.String r5 = "menulistname=?"
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L35
            r6[r0] = r12     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L35
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r13
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L35
            if (r1 == 0) goto L2b
            int r12 = r1.getCount()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L35
            if (r12 <= 0) goto L2b
            r1.close()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L35
            if (r1 == 0) goto L2a
            r1.close()
        L2a:
            return r10
        L2b:
            if (r1 == 0) goto L3b
            goto L38
        L2e:
            r12 = move-exception
            if (r1 == 0) goto L34
            r1.close()
        L34:
            throw r12
        L35:
            if (r1 == 0) goto L3b
        L38:
            r1.close()
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0023aj.m208j(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: k */
    public String m209k(String str, String str2) {
        return this.f111a.put(str, str2);
    }

    /* renamed from: k */
    public HashMap<String, String> m210k() {
        return this.f111a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m168h(sQLiteDatabase);
        m165e(sQLiteDatabase);
        m166f(sQLiteDatabase);
        m163c(sQLiteDatabase);
        m161a(sQLiteDatabase);
        m167g(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.isDbLockedByCurrentThread();
        sQLiteDatabase.isDbLockedByOtherThreads();
        sQLiteDatabase.inTransaction();
        sQLiteDatabase.isReadOnly();
        sQLiteDatabase.isOpen();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
