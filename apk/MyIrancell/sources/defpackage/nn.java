package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import defpackage.pl;
import defpackage.tl;
import defpackage.vn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class nn implements qm, vn {
    private static final fk f = fk.a("proto");
    private final sn b;
    private final wn c;
    private final wn d;
    private final rm e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b<T, U> {
        U a(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        final String a;
        final String b;

        private c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public nn(wn wnVar, wn wnVar2, rm rmVar, sn snVar) {
        this.b = snVar;
        this.c = wnVar;
        this.d = wnVar2;
        this.e = rmVar;
    }

    private long a(SQLiteDatabase sQLiteDatabase, tl tlVar) {
        Long b2 = b(sQLiteDatabase, tlVar);
        if (b2 != null) {
            return b2.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", tlVar.a());
        contentValues.put("priority", Integer.valueOf(co.a(tlVar.c())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (tlVar.b() != null) {
            contentValues.put("extras", Base64.encodeToString(tlVar.b(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private SQLiteDatabase a() {
        sn snVar = this.b;
        snVar.getClass();
        return (SQLiteDatabase) a(fn.a(snVar), hn.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Boolean a(nn nnVar, tl tlVar, SQLiteDatabase sQLiteDatabase) {
        Long b2 = nnVar.b(sQLiteDatabase, tlVar);
        if (b2 == null) {
            return false;
        }
        return (Boolean) a(nnVar.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b2.toString()}), gn.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Long a(nn nnVar, tl tlVar, pl plVar, SQLiteDatabase sQLiteDatabase) {
        if (nnVar.e()) {
            return -1L;
        }
        long a2 = nnVar.a(sQLiteDatabase, tlVar);
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(a2));
        contentValues.put("transport_name", plVar.f());
        contentValues.put("timestamp_ms", Long.valueOf(plVar.d()));
        contentValues.put("uptime_ms", Long.valueOf(plVar.g()));
        contentValues.put("payload_encoding", plVar.c().b().a());
        contentValues.put("payload", plVar.c().a());
        contentValues.put("code", plVar.b());
        contentValues.put("num_attempts", (Integer) 0);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        for (Map.Entry<String, String> entry : plVar.e().entrySet()) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("event_id", Long.valueOf(insert));
            contentValues2.put("name", entry.getKey());
            contentValues2.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues2);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(long j, tl tlVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{tlVar.a(), String.valueOf(co.a(tlVar.c()))}) < 1) {
            contentValues.put("backend_name", tlVar.a());
            contentValues.put("priority", Integer.valueOf(co.a(tlVar.c())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private static <T> T a(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.a(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(Throwable th) {
        throw new un("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(List list, tl tlVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            pl.a i = pl.i();
            i.a(cursor.getString(1));
            i.a(cursor.getLong(2));
            i.b(cursor.getLong(3));
            i.a(new ol(b(cursor.getString(4)), cursor.getBlob(5)));
            if (!cursor.isNull(6)) {
                i.a(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(vm.a(j, tlVar, i.a()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    private <T> T a(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase a2 = a();
        a2.beginTransaction();
        try {
            T a3 = bVar.a(a2);
            a2.setTransactionSuccessful();
            return a3;
        } finally {
            a2.endTransaction();
        }
    }

    private <T> T a(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.d.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.d.a() >= this.e.a() + a2) {
                    return bVar.a(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private List<vm> a(List<vm> list, Map<Long, Set<c>> map) {
        ListIterator<vm> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            vm next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.b()))) {
                pl.a h = next.a().h();
                for (c cVar : map.get(Long.valueOf(next.b()))) {
                    h.a(cVar.a, cVar.b);
                }
                listIterator.set(vm.a(next.b(), next.c(), h.a()));
            }
        }
        return list;
    }

    private Map<Long, Set<c>> a(SQLiteDatabase sQLiteDatabase, List<vm> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).b());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        a(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), bn.a((Map) hashMap));
        return hashMap;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        a(cn.a(sQLiteDatabase), dn.a());
    }

    private static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ SQLiteDatabase b(Throwable th) {
        throw new un("Timed out while trying to open db.", th);
    }

    private static fk b(String str) {
        return str == null ? f : fk.a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Long b(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    private Long b(SQLiteDatabase sQLiteDatabase, tl tlVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(tlVar.a(), String.valueOf(co.a(tlVar.c()))));
        if (tlVar.b() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(tlVar.b(), 0));
        }
        return (Long) a(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), jn.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List b(nn nnVar, tl tlVar, SQLiteDatabase sQLiteDatabase) {
        List<vm> c2 = nnVar.c(sQLiteDatabase, tlVar);
        nnVar.a(c2, nnVar.a(sQLiteDatabase, c2));
        return c2;
    }

    private long c() {
        return a().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private static String c(Iterable<vm> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<vm> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List c(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            tl.a d2 = tl.d();
            d2.a(cursor.getString(1));
            d2.a(co.a(cursor.getInt(2)));
            d2.a(a(cursor.getString(3)));
            arrayList.add(d2.a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List c(SQLiteDatabase sQLiteDatabase) {
        return (List) a(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), en.a());
    }

    private List<vm> c(SQLiteDatabase sQLiteDatabase, tl tlVar) {
        ArrayList arrayList = new ArrayList();
        Long b2 = b(sQLiteDatabase, tlVar);
        if (b2 == null) {
            return arrayList;
        }
        a(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code"}, "context_id = ?", new String[]{b2.toString()}, null, null, null, String.valueOf(this.e.c())), an.a(arrayList, tlVar));
        return arrayList;
    }

    private long d() {
        return a().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private boolean e() {
        return c() * d() >= this.e.d();
    }

    @Override // defpackage.qm
    public Iterable<vm> a(tl tlVar) {
        return (Iterable) a(xm.a(this, tlVar));
    }

    @Override // defpackage.vn
    public <T> T a(vn.a<T> aVar) {
        SQLiteDatabase a2 = a();
        a(a2);
        try {
            T e = aVar.e();
            a2.setTransactionSuccessful();
            return e;
        } finally {
            a2.endTransaction();
        }
    }

    @Override // defpackage.qm
    public vm a(tl tlVar, pl plVar) {
        bm.a("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", tlVar.c(), plVar.f(), tlVar.a());
        long longValue = ((Long) a(in.a(this, tlVar, plVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return vm.a(longValue, tlVar, plVar);
    }

    @Override // defpackage.qm
    public void a(Iterable<vm> iterable) {
        if (iterable.iterator().hasNext()) {
            a().compileStatement("DELETE FROM events WHERE _id in " + c(iterable)).execute();
        }
    }

    @Override // defpackage.qm
    public void a(tl tlVar, long j) {
        a(wm.a(j, tlVar));
    }

    @Override // defpackage.qm
    public int b() {
        return ((Integer) a(zm.a(this.c.a() - this.e.b()))).intValue();
    }

    @Override // defpackage.qm
    public long b(tl tlVar) {
        return ((Long) a(a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{tlVar.a(), String.valueOf(co.a(tlVar.c()))}), ln.a())).longValue();
    }

    @Override // defpackage.qm
    public void b(Iterable<vm> iterable) {
        if (iterable.iterator().hasNext()) {
            a(kn.a("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + c(iterable)));
        }
    }

    @Override // defpackage.qm
    public boolean c(tl tlVar) {
        return ((Boolean) a(mn.a(this, tlVar))).booleanValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // defpackage.qm
    public Iterable<tl> g() {
        return (Iterable) a(ym.a());
    }
}
