package ir.metrix.sdk;

import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ir.metrix.sdk.j */
/* loaded from: classes.dex */
public class C2627j extends SQLiteOpenHelper {

    /* renamed from: a */
    private static final Map<String, C2627j> f10729a = new HashMap();

    /* renamed from: b */
    private Application f10730b;

    /* renamed from: c */
    private File f10731c;

    /* renamed from: d */
    private String f10732d;

    protected C2627j(Application application, String str) {
        super(application.getApplicationContext(), m12577b(str), (SQLiteDatabase.CursorFactory) null, 2);
        this.f10730b = application;
        this.f10731c = application.getApplicationContext().getDatabasePath(m12577b(str));
        this.f10732d = C2617ai.m12553b(str);
    }

    /* renamed from: a */
    private synchronized long m12571a(String str, String str2, Object obj) {
        long j;
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
                    C2610ab.m12517a("DatabaseHelper", "Insert failed");
                } catch (SQLiteException e) {
                    e = e;
                    j2 = j;
                    C2610ab.m12518a("DatabaseHelper", String.format("insertOrReplaceKeyValue in %s failed", str), e);
                    m12579c();
                    j = j2;
                    return j;
                } catch (StackOverflowError e2) {
                    e = e2;
                    j2 = j;
                    C2610ab.m12518a("DatabaseHelper", String.format("insertOrReplaceKeyValue in %s failed", str), e);
                    m12579c();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized C2627j m12572a(Application application, String str) {
        C2627j c2627j;
        synchronized (C2627j.class) {
            String m12553b = C2617ai.m12553b(str);
            c2627j = f10729a.get(m12553b);
            if (c2627j == null) {
                c2627j = new C2627j(application, m12553b);
                f10729a.put(m12553b, c2627j);
            }
        }
        return c2627j;
    }

    /* renamed from: a */
    private void m12573a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS long_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }

    /* renamed from: a */
    private static void m12574a(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (C2617ai.m12552a(message)) {
            throw runtimeException;
        }
        if (!message.startsWith("Cursor window allocation of")) {
            throw runtimeException;
        }
        throw new C2625h(message);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (0 == 0) goto L22;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized long m12575b(java.lang.String r10, long r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            r1 = 1
            r2 = -1
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r9.getReadableDatabase()     // Catch: java.lang.Throwable -> L3c java.lang.StackOverflowError -> L3e android.database.sqlite.SQLiteException -> L54
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c java.lang.StackOverflowError -> L3e android.database.sqlite.SQLiteException -> L54
            r6.<init>()     // Catch: java.lang.Throwable -> L3c java.lang.StackOverflowError -> L3e android.database.sqlite.SQLiteException -> L54
            java.lang.String r7 = "SELECT id FROM "
            r6.append(r7)     // Catch: java.lang.Throwable -> L3c java.lang.StackOverflowError -> L3e android.database.sqlite.SQLiteException -> L54
            r6.append(r10)     // Catch: java.lang.Throwable -> L3c java.lang.StackOverflowError -> L3e android.database.sqlite.SQLiteException -> L54
            java.lang.String r7 = " LIMIT 1 OFFSET "
            r6.append(r7)     // Catch: java.lang.Throwable -> L3c java.lang.StackOverflowError -> L3e android.database.sqlite.SQLiteException -> L54
            r7 = 1
            long r11 = r11 - r7
            r6.append(r11)     // Catch: java.lang.Throwable -> L3c java.lang.StackOverflowError -> L3e android.database.sqlite.SQLiteException -> L54
            java.lang.String r11 = r6.toString()     // Catch: java.lang.Throwable -> L3c java.lang.StackOverflowError -> L3e android.database.sqlite.SQLiteException -> L54
            android.database.sqlite.SQLiteStatement r4 = r5.compileStatement(r11)     // Catch: java.lang.Throwable -> L3c java.lang.StackOverflowError -> L3e android.database.sqlite.SQLiteException -> L54
            long r10 = r4.simpleQueryForLong()     // Catch: android.database.sqlite.SQLiteDoneException -> L30 java.lang.Throwable -> L3c java.lang.StackOverflowError -> L3e android.database.sqlite.SQLiteException -> L54
            r2 = r10
            goto L36
        L30:
            r11 = move-exception
            java.lang.String r12 = "DatabaseHelper"
            ir.metrix.sdk.C2610ab.m12519a(r12, r11)     // Catch: java.lang.Throwable -> L3c java.lang.StackOverflowError -> L3e android.database.sqlite.SQLiteException -> L54
        L36:
            if (r4 == 0) goto L6a
        L38:
            r4.close()     // Catch: java.lang.Throwable -> L72
            goto L6a
        L3c:
            r10 = move-exception
            goto L6c
        L3e:
            r11 = move-exception
            java.lang.String r12 = "DatabaseHelper"
            java.lang.String r5 = "getNthEventId from %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3c
            r1[r0] = r10     // Catch: java.lang.Throwable -> L3c
            java.lang.String r10 = java.lang.String.format(r5, r1)     // Catch: java.lang.Throwable -> L3c
            ir.metrix.sdk.C2610ab.m12518a(r12, r10, r11)     // Catch: java.lang.Throwable -> L3c
            r9.m12579c()     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L6a
            goto L38
        L54:
            r11 = move-exception
            java.lang.String r12 = "DatabaseHelper"
            java.lang.String r5 = "getNthEventId from %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3c
            r1[r0] = r10     // Catch: java.lang.Throwable -> L3c
            java.lang.String r10 = java.lang.String.format(r5, r1)     // Catch: java.lang.Throwable -> L3c
            ir.metrix.sdk.C2610ab.m12518a(r12, r10, r11)     // Catch: java.lang.Throwable -> L3c
            r9.m12579c()     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L6a
            goto L38
        L6a:
            monitor-exit(r9)
            return r2
        L6c:
            if (r4 == 0) goto L71
            r4.close()     // Catch: java.lang.Throwable -> L72
        L71:
            throw r10     // Catch: java.lang.Throwable -> L72
        L72:
            r10 = move-exception
            monitor-exit(r9)
            goto L76
        L75:
            throw r10
        L76:
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.metrix.sdk.C2627j.m12575b(java.lang.String, long):long");
    }

    /* renamed from: b */
    private synchronized long m12576b(String str, Long l) {
        return l == null ? m12583e("long_store", str) : m12571a("long_store", str, l);
    }

    /* renamed from: b */
    private static String m12577b(String str) {
        if (C2617ai.m12552a(str) || str.equals("_default_instance")) {
            return "ir.metrix.sdk";
        }
        return "ir.metrix.sdk_" + str;
    }

    /* renamed from: c */
    private synchronized String m12578c(String str) {
        return (String) m12593a("store", str);
    }

    /* renamed from: c */
    private void m12579c() {
        try {
            this.f10731c.delete();
        } catch (SecurityException e) {
            C2610ab.m12518a("DatabaseHelper", "delete failed", e);
        }
    }

    /* renamed from: c */
    private synchronized void m12580c(String str, long j) {
        try {
            getWritableDatabase().delete(str, "id <= " + j, null);
        } catch (SQLiteException e) {
            C2610ab.m12518a("DatabaseHelper", String.format("removeEvents from %s failed", str), e);
            m12579c();
        } catch (StackOverflowError e2) {
            C2610ab.m12518a("DatabaseHelper", String.format("removeEvents from %s failed", str), e2);
            m12579c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r2 == null) goto L19;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized long m12581d(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            r1 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r6.getReadableDatabase()     // Catch: java.lang.Throwable -> L27 java.lang.StackOverflowError -> L29 android.database.sqlite.SQLiteException -> L42
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27 java.lang.StackOverflowError -> L29 android.database.sqlite.SQLiteException -> L42
            r4.<init>()     // Catch: java.lang.Throwable -> L27 java.lang.StackOverflowError -> L29 android.database.sqlite.SQLiteException -> L42
            java.lang.String r5 = "SELECT COUNT(*) FROM "
            r4.append(r5)     // Catch: java.lang.Throwable -> L27 java.lang.StackOverflowError -> L29 android.database.sqlite.SQLiteException -> L42
            r4.append(r7)     // Catch: java.lang.Throwable -> L27 java.lang.StackOverflowError -> L29 android.database.sqlite.SQLiteException -> L42
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L27 java.lang.StackOverflowError -> L29 android.database.sqlite.SQLiteException -> L42
            android.database.sqlite.SQLiteStatement r2 = r3.compileStatement(r4)     // Catch: java.lang.Throwable -> L27 java.lang.StackOverflowError -> L29 android.database.sqlite.SQLiteException -> L42
            long r0 = r2.simpleQueryForLong()     // Catch: java.lang.Throwable -> L27 java.lang.StackOverflowError -> L29 android.database.sqlite.SQLiteException -> L42
            if (r2 == 0) goto L5a
            r2.close()     // Catch: java.lang.Throwable -> L62
            goto L5a
        L27:
            r7 = move-exception
            goto L5c
        L29:
            r3 = move-exception
            java.lang.String r4 = "DatabaseHelper"
            java.lang.String r5 = "getNumberRows for %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L27
            r1[r0] = r7     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = java.lang.String.format(r5, r1)     // Catch: java.lang.Throwable -> L27
            ir.metrix.sdk.C2610ab.m12518a(r4, r7, r3)     // Catch: java.lang.Throwable -> L27
            r6.m12579c()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L58
        L3e:
            r2.close()     // Catch: java.lang.Throwable -> L62
            goto L58
        L42:
            r3 = move-exception
            java.lang.String r4 = "DatabaseHelper"
            java.lang.String r5 = "getNumberRows for %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L27
            r1[r0] = r7     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = java.lang.String.format(r5, r1)     // Catch: java.lang.Throwable -> L27
            ir.metrix.sdk.C2610ab.m12518a(r4, r7, r3)     // Catch: java.lang.Throwable -> L27
            r6.m12579c()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L58
            goto L3e
        L58:
            r0 = 0
        L5a:
            monitor-exit(r6)
            return r0
        L5c:
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.lang.Throwable -> L62
        L61:
            throw r7     // Catch: java.lang.Throwable -> L62
        L62:
            r7 = move-exception
            monitor-exit(r6)
            goto L66
        L65:
            throw r7
        L66:
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.metrix.sdk.C2627j.m12581d(java.lang.String):long");
    }

    /* renamed from: d */
    private synchronized long m12582d(String str, String str2) {
        return str2 == null ? m12583e("store", str) : m12571a("store", str, str2);
    }

    /* renamed from: e */
    private synchronized long m12583e(String str, String str2) {
        long j;
        try {
            j = getWritableDatabase().delete(str, "key=?", new String[]{str2});
        } catch (SQLiteException e) {
            C2610ab.m12518a("DatabaseHelper", String.format("deleteKey from %s failed", str), e);
            m12579c();
            j = -1;
            return j;
        } catch (StackOverflowError e2) {
            C2610ab.m12518a("DatabaseHelper", String.format("deleteKey from %s failed", str), e2);
            m12579c();
            j = -1;
            return j;
        }
        return j;
    }

    /* renamed from: e */
    private synchronized Long m12584e(String str) {
        return (Long) m12593a("long_store", str);
    }

    /* renamed from: f */
    private synchronized long m12585f(String str, String str2) {
        long j;
        long j2 = -1;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("event", str2);
            j = writableDatabase.insert(str, null, contentValues);
            if (j == -1) {
                try {
                    C2610ab.m12517a("DatabaseHelper", String.format("Insert into %s failed", str));
                } catch (SQLiteException e) {
                    e = e;
                    j2 = j;
                    C2610ab.m12518a("DatabaseHelper", String.format("addEvent to %s failed", str), e);
                    m12579c();
                    j = j2;
                    return j;
                } catch (StackOverflowError e2) {
                    e = e2;
                    j2 = j;
                    C2610ab.m12518a("DatabaseHelper", String.format("addEvent to %s failed", str), e);
                    m12579c();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m12586a(String str, int i) {
        Long l;
        try {
            l = m12584e(str);
        } catch (C2625h e) {
            C2610ab.m12529b("DatabaseHelper", String.format("Failed to get value " + str + " form Metrix SDK due to: %s", e.getMessage()));
            Application application = this.f10730b;
            if (application != null) {
                C2647z.m12732a(e, application);
            }
            l = null;
        }
        return l == null ? i : l.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized long m12587a() {
        return m12581d("events");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized long m12588a(long j) {
        return m12575b("events", j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized long m12589a(String str) {
        return m12585f("events", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m12590a(String str, long j) {
        Long l;
        try {
            l = m12584e(str);
        } catch (C2625h e) {
            C2610ab.m12529b("DatabaseHelper", String.format("Failed to get value " + str + " form Metrix SDK due to: %s", e.getMessage()));
            Application application = this.f10730b;
            if (application != null) {
                C2647z.m12732a(e, application);
            }
            l = null;
        }
        return l == null ? j : l.longValue();
    }

    /* renamed from: a */
    Cursor m12591a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Boolean m12592a(String str, Boolean bool) {
        Long l;
        try {
            l = m12584e(str);
        } catch (C2625h e) {
            C2610ab.m12529b("DatabaseHelper", String.format("Failed to get value " + str + " form Metrix SDK due to: %s", e.getMessage()));
            Application application = this.f10730b;
            if (application != null) {
                C2647z.m12732a(e, application);
            }
            l = null;
        }
        if (l == null) {
            return bool;
        }
        return Boolean.valueOf(l.longValue() == 1);
    }

    /* renamed from: a */
    protected synchronized Object m12593a(String str, String str2) {
        return m12594a(false, str, 0L, 0L, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c7, code lost:
    
        if (r1 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011e, code lost:
    
        if (0 != 0) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0127: MOVE (r13 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:45:0x0127 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a A[Catch: all -> 0x012e, TRY_ENTER, TryCatch #9 {, blocks: (B:4:0x0007, B:28:0x00c9, B:47:0x012a, B:48:0x012d), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ea  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected synchronized java.lang.Object m12594a(boolean r19, java.lang.String r20, long r21, long r23, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.metrix.sdk.C2627j.m12594a(boolean, java.lang.String, long, long, java.lang.String):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized List<JSONObject> m12595a(long j, long j2) {
        return m12596a("events", j, j2);
    }

    /* renamed from: a */
    protected synchronized List<JSONObject> m12596a(String str, long j, long j2) {
        return (List) m12594a(true, str, j, j2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12597a(String str, Long l) {
        m12576b(str, l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12598a(String str, boolean z) {
        m12576b(str, Long.valueOf(z ? 1L : 0L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized long m12599b() {
        return m12587a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m12600b(String str, String str2) {
        String str3;
        try {
            str3 = m12578c(str);
        } catch (C2625h e) {
            C2610ab.m12529b("DatabaseHelper", String.format("Failed to get value " + str + " form Metrix SDK due to: %s", e.getMessage()));
            Application application = this.f10730b;
            if (application != null) {
                C2647z.m12732a(e, application);
            }
            str3 = null;
        }
        return str3 == null ? str2 : str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m12601b(long j) {
        m12580c("events", j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m12602c(String str, String str2) {
        m12582d(str, str2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str;
        if (i > i2) {
            str = "onUpgrade() with invalid oldVersion and newVersion";
        } else {
            if (i2 <= 1) {
                return;
            }
            str = "onUpgrade() with unknown oldVersion " + i;
        }
        C2610ab.m12529b("DatabaseHelper", str);
        m12573a(sQLiteDatabase);
    }
}
