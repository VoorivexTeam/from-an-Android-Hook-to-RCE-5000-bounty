package p000;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: h3 */
/* loaded from: classes.dex */
class C2536h3 extends Filter {

    /* renamed from: a */
    a f10371a;

    /* renamed from: h3$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        Cursor mo11876a();

        /* renamed from: a */
        Cursor mo1095a(CharSequence charSequence);

        /* renamed from: a */
        void mo1098a(Cursor cursor);

        /* renamed from: b */
        CharSequence mo1101b(Cursor cursor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2536h3(a aVar) {
        this.f10371a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f10371a.mo1101b((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo1095a = this.f10371a.mo1095a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo1095a != null) {
            filterResults.count = mo1095a.getCount();
        } else {
            filterResults.count = 0;
            mo1095a = null;
        }
        filterResults.values = mo1095a;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo11876a = this.f10371a.mo11876a();
        Object obj = filterResults.values;
        if (obj == null || obj == mo11876a) {
            return;
        }
        this.f10371a.mo1098a((Cursor) obj);
    }
}
