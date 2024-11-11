package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: sn */
/* loaded from: classes.dex */
final class C3216sn extends SQLiteOpenHelper {

    /* renamed from: c */
    static int f13134c = 3;

    /* renamed from: d */
    private static final a f13135d = C3091pn.m14813a();

    /* renamed from: e */
    private static final a f13136e = C3133qn.m15128a();

    /* renamed from: f */
    private static final a f13137f;

    /* renamed from: g */
    private static final List<a> f13138g;

    /* renamed from: a */
    private final int f13139a;

    /* renamed from: b */
    private boolean f13140b;

    /* renamed from: sn$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo14814a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a m15289a = C3172rn.m15289a();
        f13137f = m15289a;
        f13138g = Arrays.asList(f13135d, f13136e, m15289a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3216sn(Context context, int i) {
        super(context, "com.google.android.datatransport.events", (SQLiteDatabase.CursorFactory) null, i);
        this.f13140b = false;
        this.f13139a = i;
    }

    /* renamed from: a */
    private void m15447a(SQLiteDatabase sQLiteDatabase) {
        if (this.f13140b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* renamed from: a */
    private void m15448a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 <= f13138g.size()) {
            while (i < i2) {
                f13138g.get(i).mo14814a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + f13138g.size() + " migrations are provided");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m15449b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m15450c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f13140b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m15447a(sQLiteDatabase);
        m15448a(sQLiteDatabase, 0, this.f13139a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m15447a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m15447a(sQLiteDatabase);
        m15448a(sQLiteDatabase, i, i2);
    }
}
