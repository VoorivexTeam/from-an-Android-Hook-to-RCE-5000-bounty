package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC0107p;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public class C0098g extends BaseAdapter {

    /* renamed from: b */
    C0099h f590b;

    /* renamed from: c */
    private int f591c = -1;

    /* renamed from: d */
    private boolean f592d;

    /* renamed from: e */
    private final boolean f593e;

    /* renamed from: f */
    private final LayoutInflater f594f;

    /* renamed from: g */
    private final int f595g;

    public C0098g(C0099h c0099h, LayoutInflater layoutInflater, boolean z, int i) {
        this.f593e = z;
        this.f594f = layoutInflater;
        this.f590b = c0099h;
        this.f595g = i;
        m623a();
    }

    /* renamed from: a */
    void m623a() {
        C0101j m668f = this.f590b.m668f();
        if (m668f != null) {
            ArrayList<C0101j> m672j = this.f590b.m672j();
            int size = m672j.size();
            for (int i = 0; i < size; i++) {
                if (m672j.get(i) == m668f) {
                    this.f591c = i;
                    return;
                }
            }
        }
        this.f591c = -1;
    }

    /* renamed from: a */
    public void m624a(boolean z) {
        this.f592d = z;
    }

    /* renamed from: b */
    public C0099h m625b() {
        return this.f590b;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C0101j> m672j = this.f593e ? this.f590b.m672j() : this.f590b.m676n();
        int i = this.f591c;
        int size = m672j.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public C0101j getItem(int i) {
        ArrayList<C0101j> m672j = this.f593e ? this.f590b.m672j() : this.f590b.m676n();
        int i2 = this.f591c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return m672j.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f594f.inflate(this.f595g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f590b.mo677o() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        InterfaceC0107p.a aVar = (InterfaceC0107p.a) view;
        if (this.f592d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo557a(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m623a();
        super.notifyDataSetChanged();
    }
}
