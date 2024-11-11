package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import p000.C2536h3;

/* renamed from: g3 */
/* loaded from: classes.dex */
public abstract class AbstractC2496g3 extends BaseAdapter implements Filterable, C2536h3.a {

    /* renamed from: b */
    protected boolean f10189b;

    /* renamed from: c */
    protected boolean f10190c;

    /* renamed from: d */
    protected Cursor f10191d;

    /* renamed from: e */
    protected Context f10192e;

    /* renamed from: f */
    protected int f10193f;

    /* renamed from: g */
    protected a f10194g;

    /* renamed from: h */
    protected DataSetObserver f10195h;

    /* renamed from: i */
    protected C2536h3 f10196i;

    /* renamed from: j */
    protected FilterQueryProvider f10197j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g3$a */
    /* loaded from: classes.dex */
    public class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractC2496g3.this.m11879b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g3$b */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC2496g3 abstractC2496g3 = AbstractC2496g3.this;
            abstractC2496g3.f10189b = true;
            abstractC2496g3.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC2496g3 abstractC2496g3 = AbstractC2496g3.this;
            abstractC2496g3.f10189b = false;
            abstractC2496g3.notifyDataSetInvalidated();
        }
    }

    public AbstractC2496g3(Context context, Cursor cursor, int i) {
        m11878a(context, cursor, i);
    }

    public AbstractC2496g3(Context context, Cursor cursor, boolean z) {
        m11878a(context, cursor, z ? 1 : 2);
    }

    @Override // p000.C2536h3.a
    /* renamed from: a */
    public Cursor mo11876a() {
        return this.f10191d;
    }

    /* renamed from: a */
    public Cursor mo1095a(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f10197j;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f10191d;
    }

    /* renamed from: a */
    public View mo11877a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo1100b(context, cursor, viewGroup);
    }

    /* renamed from: a */
    void m11878a(Context context, Cursor cursor, int i) {
        b bVar;
        if ((i & 1) == 1) {
            i |= 2;
            this.f10190c = true;
        } else {
            this.f10190c = false;
        }
        boolean z = cursor != null;
        this.f10191d = cursor;
        this.f10189b = z;
        this.f10192e = context;
        this.f10193f = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f10194g = new a();
            bVar = new b();
        } else {
            bVar = null;
            this.f10194g = null;
        }
        this.f10195h = bVar;
        if (z) {
            a aVar = this.f10194g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f10195h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo1098a(Cursor cursor) {
        Cursor mo4109c = mo4109c(cursor);
        if (mo4109c != null) {
            mo4109c.close();
        }
    }

    /* renamed from: a */
    public abstract void mo1099a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public abstract View mo1100b(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: b */
    public CharSequence mo1101b(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    /* renamed from: b */
    protected void m11879b() {
        Cursor cursor;
        if (!this.f10190c || (cursor = this.f10191d) == null || cursor.isClosed()) {
            return;
        }
        this.f10189b = this.f10191d.requery();
    }

    /* renamed from: c */
    public Cursor mo4109c(Cursor cursor) {
        Cursor cursor2 = this.f10191d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f10194g;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f10195h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f10191d = cursor;
        if (cursor != null) {
            a aVar2 = this.f10194g;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f10195h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f10193f = cursor.getColumnIndexOrThrow("_id");
            this.f10189b = true;
            notifyDataSetChanged();
        } else {
            this.f10193f = -1;
            this.f10189b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f10189b || (cursor = this.f10191d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f10189b) {
            return null;
        }
        this.f10191d.moveToPosition(i);
        if (view == null) {
            view = mo11877a(this.f10192e, this.f10191d, viewGroup);
        }
        mo1099a(view, this.f10192e, this.f10191d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f10196i == null) {
            this.f10196i = new C2536h3(this);
        }
        return this.f10196i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f10189b || (cursor = this.f10191d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f10191d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f10189b && (cursor = this.f10191d) != null && cursor.moveToPosition(i)) {
            return this.f10191d.getLong(this.f10193f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f10189b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f10191d.moveToPosition(i)) {
            if (view == null) {
                view = mo1100b(this.f10192e, this.f10191d, viewGroup);
            }
            mo1099a(view, this.f10192e, this.f10191d);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
