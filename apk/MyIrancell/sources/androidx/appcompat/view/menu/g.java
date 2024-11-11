package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.p;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class g extends BaseAdapter {
    h b;
    private int c = -1;
    private boolean d;
    private final boolean e;
    private final LayoutInflater f;
    private final int g;

    public g(h hVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.e = z;
        this.f = layoutInflater;
        this.b = hVar;
        this.g = i;
        a();
    }

    void a() {
        j f = this.b.f();
        if (f != null) {
            ArrayList<j> j = this.b.j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (j.get(i) == f) {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public h b() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<j> j = this.e ? this.b.j() : this.b.n();
        int i = this.c;
        int size = j.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public j getItem(int i) {
        ArrayList<j> j = this.e ? this.b.j() : this.b.n();
        int i2 = this.c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return j.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f.inflate(this.g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.b.o() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        p.a aVar = (p.a) view;
        if (this.d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.a(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
