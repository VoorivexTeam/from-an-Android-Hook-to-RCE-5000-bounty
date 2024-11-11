package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import p000.AbstractC3089pl;
import p000.AbstractC3266tl;
import p000.InterfaceC3365vn;

/* renamed from: nn */
/* loaded from: classes.dex */
public class C2995nn implements InterfaceC3132qm, InterfaceC3365vn {

    /* renamed from: f */
    private static final C2476fk f12344f = C2476fk.m11789a("proto");

    /* renamed from: b */
    private final C3216sn f12345b;

    /* renamed from: c */
    private final InterfaceC3404wn f12346c;

    /* renamed from: d */
    private final InterfaceC3404wn f12347d;

    /* renamed from: e */
    private final AbstractC3171rm f12348e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nn$b */
    /* loaded from: classes.dex */
    public interface b<T, U> {
        /* renamed from: a */
        U mo219a(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nn$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final String f12349a;

        /* renamed from: b */
        final String f12350b;

        private c(String str, String str2) {
            this.f12349a = str;
            this.f12350b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nn$d */
    /* loaded from: classes.dex */
    public interface d<T> {
        /* renamed from: a */
        T mo3698a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2995nn(InterfaceC3404wn interfaceC3404wn, InterfaceC3404wn interfaceC3404wn2, AbstractC3171rm abstractC3171rm, C3216sn c3216sn) {
        this.f12345b = c3216sn;
        this.f12346c = interfaceC3404wn;
        this.f12347d = interfaceC3404wn2;
        this.f12348e = abstractC3171rm;
    }

    /* renamed from: a */
    private long m14339a(SQLiteDatabase sQLiteDatabase, AbstractC3266tl abstractC3266tl) {
        Long m14360b = m14360b(sQLiteDatabase, abstractC3266tl);
        if (m14360b != null) {
            return m14360b.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC3266tl.mo13735a());
        contentValues.put("priority", Integer.valueOf(C0529co.m3699a(abstractC3266tl.mo13737c())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC3266tl.mo13736b() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC3266tl.mo13736b(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* renamed from: a */
    private SQLiteDatabase m14340a() {
        C3216sn c3216sn = this.f12345b;
        c3216sn.getClass();
        return (SQLiteDatabase) m14352a(C2479fn.m11794a(c3216sn), C2559hn.m12240a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m14341a(C2995nn c2995nn, AbstractC3266tl abstractC3266tl, SQLiteDatabase sQLiteDatabase) {
        Long m14360b = c2995nn.m14360b(sQLiteDatabase, abstractC3266tl);
        if (m14360b == null) {
            return false;
        }
        return (Boolean) m14346a(c2995nn.m14340a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m14360b.toString()}), C2519gn.m12035a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Long m14344a(C2995nn c2995nn, AbstractC3266tl abstractC3266tl, AbstractC3089pl abstractC3089pl, SQLiteDatabase sQLiteDatabase) {
        if (c2995nn.m14369e()) {
            return -1L;
        }
        long m14339a = c2995nn.m14339a(sQLiteDatabase, abstractC3266tl);
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(m14339a));
        contentValues.put("transport_name", abstractC3089pl.mo12482f());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC3089pl.mo12481d()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC3089pl.mo12483g()));
        contentValues.put("payload_encoding", abstractC3089pl.mo12480c().m14636b().m11790a());
        contentValues.put("payload", abstractC3089pl.mo12480c().m14635a());
        contentValues.put("code", abstractC3089pl.mo12479b());
        contentValues.put("num_attempts", (Integer) 0);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        for (Map.Entry<String, String> entry : abstractC3089pl.m14805e().entrySet()) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("event_id", Long.valueOf(insert));
            contentValues2.put("name", entry.getKey());
            contentValues2.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues2);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Object m14345a(long j, AbstractC3266tl abstractC3266tl, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC3266tl.mo13735a(), String.valueOf(C0529co.m3699a(abstractC3266tl.mo13737c()))}) < 1) {
            contentValues.put("backend_name", abstractC3266tl.mo13735a());
            contentValues.put("priority", Integer.valueOf(C0529co.m3699a(abstractC3266tl.mo13737c())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* renamed from: a */
    private static <T> T m14346a(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.mo219a(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Object m14347a(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Object m14348a(Throwable th) {
        throw new C3312un("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Object m14349a(List list, AbstractC3266tl abstractC3266tl, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            AbstractC3089pl.a m14801i = AbstractC3089pl.m14801i();
            m14801i.mo12486a(cursor.getString(1));
            m14801i.mo12484a(cursor.getLong(2));
            m14801i.mo12491b(cursor.getLong(3));
            m14801i.mo12488a(new C3050ol(m14358b(cursor.getString(4)), cursor.getBlob(5)));
            if (!cursor.isNull(6)) {
                m14801i.mo12485a(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC3364vm.m16039a(j, abstractC3266tl, m14801i.mo12489a()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Object m14350a(Map map, Cursor cursor) {
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

    /* renamed from: a */
    private <T> T m14351a(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase m14340a = m14340a();
        m14340a.beginTransaction();
        try {
            T mo219a = bVar.mo219a(m14340a);
            m14340a.setTransactionSuccessful();
            return mo219a;
        } finally {
            m14340a.endTransaction();
        }
    }

    /* renamed from: a */
    private <T> T m14352a(d<T> dVar, b<Throwable, T> bVar) {
        long mo3178a = this.f12347d.mo3178a();
        while (true) {
            try {
                return dVar.mo3698a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f12347d.mo3178a() >= this.f12348e.mo14637a() + mo3178a) {
                    return bVar.mo219a(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* renamed from: a */
    private List<AbstractC3364vm> m14353a(List<AbstractC3364vm> list, Map<Long, Set<c>> map) {
        ListIterator<AbstractC3364vm> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC3364vm next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo14811b()))) {
                AbstractC3089pl.a m14806h = next.mo14810a().m14806h();
                for (c cVar : map.get(Long.valueOf(next.mo14811b()))) {
                    m14806h.m14809a(cVar.f12349a, cVar.f12350b);
                }
                listIterator.set(AbstractC3364vm.m16039a(next.mo14811b(), next.mo14812c(), m14806h.mo12489a()));
            }
        }
        return list;
    }

    /* renamed from: a */
    private Map<Long, Set<c>> m14354a(SQLiteDatabase sQLiteDatabase, List<AbstractC3364vm> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo14811b());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m14346a(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), C0486bn.m3434a((Map) hashMap));
        return hashMap;
    }

    /* renamed from: a */
    private void m14355a(SQLiteDatabase sQLiteDatabase) {
        m14352a(C0528cn.m3697a(sQLiteDatabase), C2395dn.m11470a());
    }

    /* renamed from: a */
    private static byte[] m14356a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ SQLiteDatabase m14357b(Throwable th) {
        throw new C3312un("Timed out while trying to open db.", th);
    }

    /* renamed from: b */
    private static C2476fk m14358b(String str) {
        return str == null ? f12344f : C2476fk.m11789a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ Long m14359b(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* renamed from: b */
    private Long m14360b(SQLiteDatabase sQLiteDatabase, AbstractC3266tl abstractC3266tl) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC3266tl.mo13735a(), String.valueOf(C0529co.m3699a(abstractC3266tl.mo13737c()))));
        if (abstractC3266tl.mo13736b() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC3266tl.mo13736b(), 0));
        }
        return (Long) m14346a(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), C2821jn.m13511a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ Object m14361b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ List m14362b(C2995nn c2995nn, AbstractC3266tl abstractC3266tl, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC3364vm> m14367c = c2995nn.m14367c(sQLiteDatabase, abstractC3266tl);
        c2995nn.m14353a(m14367c, c2995nn.m14354a(sQLiteDatabase, m14367c));
        return m14367c;
    }

    /* renamed from: c */
    private long m14363c() {
        return m14340a().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: c */
    private static String m14364c(Iterable<AbstractC3364vm> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<AbstractC3364vm> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo14811b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ List m14365c(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            AbstractC3266tl.a m15657d = AbstractC3266tl.m15657d();
            m15657d.mo13739a(cursor.getString(1));
            m15657d.mo13738a(C0529co.m3700a(cursor.getInt(2)));
            m15657d.mo13740a(m14356a(cursor.getString(3)));
            arrayList.add(m15657d.mo13741a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ List m14366c(SQLiteDatabase sQLiteDatabase) {
        return (List) m14346a(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C2438en.m11626a());
    }

    /* renamed from: c */
    private List<AbstractC3364vm> m14367c(SQLiteDatabase sQLiteDatabase, AbstractC3266tl abstractC3266tl) {
        ArrayList arrayList = new ArrayList();
        Long m14360b = m14360b(sQLiteDatabase, abstractC3266tl);
        if (m14360b == null) {
            return arrayList;
        }
        m14346a(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code"}, "context_id = ?", new String[]{m14360b.toString()}, null, null, null, String.valueOf(this.f12348e.mo14639c())), C0027an.m218a(arrayList, abstractC3266tl));
        return arrayList;
    }

    /* renamed from: d */
    private long m14368d() {
        return m14340a().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: e */
    private boolean m14369e() {
        return m14363c() * m14368d() >= this.f12348e.mo14640d();
    }

    @Override // p000.InterfaceC3132qm
    /* renamed from: a */
    public Iterable<AbstractC3364vm> mo14370a(AbstractC3266tl abstractC3266tl) {
        return (Iterable) m14351a(C3443xm.m16501a(this, abstractC3266tl));
    }

    @Override // p000.InterfaceC3365vn
    /* renamed from: a */
    public <T> T mo14371a(InterfaceC3365vn.a<T> aVar) {
        SQLiteDatabase m14340a = m14340a();
        m14355a(m14340a);
        try {
            T mo6321e = aVar.mo6321e();
            m14340a.setTransactionSuccessful();
            return mo6321e;
        } finally {
            m14340a.endTransaction();
        }
    }

    @Override // p000.InterfaceC3132qm
    /* renamed from: a */
    public AbstractC3364vm mo14372a(AbstractC3266tl abstractC3266tl, AbstractC3089pl abstractC3089pl) {
        C0485bm.m3432a("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC3266tl.mo13737c(), abstractC3089pl.mo12482f(), abstractC3266tl.mo13735a());
        long longValue = ((Long) m14351a(C2601in.m12493a(this, abstractC3266tl, abstractC3089pl))).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC3364vm.m16039a(longValue, abstractC3266tl, abstractC3089pl);
    }

    @Override // p000.InterfaceC3132qm
    /* renamed from: a */
    public void mo14373a(Iterable<AbstractC3364vm> iterable) {
        if (iterable.iterator().hasNext()) {
            m14340a().compileStatement("DELETE FROM events WHERE _id in " + m14364c(iterable)).execute();
        }
    }

    @Override // p000.InterfaceC3132qm
    /* renamed from: a */
    public void mo14374a(AbstractC3266tl abstractC3266tl, long j) {
        m14351a(C3403wm.m16383a(j, abstractC3266tl));
    }

    @Override // p000.InterfaceC3132qm
    /* renamed from: b */
    public int mo14375b() {
        return ((Integer) m14351a(C3534zm.m16951a(this.f12346c.mo3178a() - this.f12348e.mo14638b()))).intValue();
    }

    @Override // p000.InterfaceC3132qm
    /* renamed from: b */
    public long mo14376b(AbstractC3266tl abstractC3266tl) {
        return ((Long) m14346a(m14340a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC3266tl.mo13735a(), String.valueOf(C0529co.m3699a(abstractC3266tl.mo13737c()))}), C2903ln.m13921a())).longValue();
    }

    @Override // p000.InterfaceC3132qm
    /* renamed from: b */
    public void mo14377b(Iterable<AbstractC3364vm> iterable) {
        if (iterable.iterator().hasNext()) {
            m14351a(C2866kn.m13743a("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m14364c(iterable)));
        }
    }

    @Override // p000.InterfaceC3132qm
    /* renamed from: c */
    public boolean mo14378c(AbstractC3266tl abstractC3266tl) {
        return ((Boolean) m14351a(C2949mn.m14171a(this, abstractC3266tl))).booleanValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12345b.close();
    }

    @Override // p000.InterfaceC3132qm
    /* renamed from: g */
    public Iterable<AbstractC3266tl> mo14379g() {
        return (Iterable) m14351a(C3492ym.m16654a());
    }
}
