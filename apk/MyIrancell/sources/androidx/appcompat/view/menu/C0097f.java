package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.InterfaceC0106o;
import androidx.appcompat.view.menu.InterfaceC0107p;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
public class C0097f implements InterfaceC0106o, AdapterView.OnItemClickListener {

    /* renamed from: b */
    Context f579b;

    /* renamed from: c */
    LayoutInflater f580c;

    /* renamed from: d */
    C0099h f581d;

    /* renamed from: e */
    ExpandedMenuView f582e;

    /* renamed from: f */
    int f583f;

    /* renamed from: g */
    int f584g;

    /* renamed from: h */
    int f585h;

    /* renamed from: i */
    private InterfaceC0106o.a f586i;

    /* renamed from: j */
    a f587j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.f$a */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: b */
        private int f588b = -1;

        public a() {
            m622a();
        }

        /* renamed from: a */
        void m622a() {
            C0101j m668f = C0097f.this.f581d.m668f();
            if (m668f != null) {
                ArrayList<C0101j> m672j = C0097f.this.f581d.m672j();
                int size = m672j.size();
                for (int i = 0; i < size; i++) {
                    if (m672j.get(i) == m668f) {
                        this.f588b = i;
                        return;
                    }
                }
            }
            this.f588b = -1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0097f.this.f581d.m672j().size() - C0097f.this.f583f;
            return this.f588b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public C0101j getItem(int i) {
            ArrayList<C0101j> m672j = C0097f.this.f581d.m672j();
            int i2 = i + C0097f.this.f583f;
            int i3 = this.f588b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return m672j.get(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0097f c0097f = C0097f.this;
                view = c0097f.f580c.inflate(c0097f.f585h, viewGroup, false);
            }
            ((InterfaceC0107p.a) view).mo557a(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m622a();
            super.notifyDataSetChanged();
        }
    }

    public C0097f(int i, int i2) {
        this.f585h = i;
        this.f584g = i2;
    }

    public C0097f(Context context, int i) {
        this(i, 0);
        this.f579b = context;
        this.f580c = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter m620a() {
        if (this.f587j == null) {
            this.f587j = new a();
        }
        return this.f587j;
    }

    /* renamed from: a */
    public InterfaceC0107p m621a(ViewGroup viewGroup) {
        if (this.f582e == null) {
            this.f582e = (ExpandedMenuView) this.f580c.inflate(R$layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f587j == null) {
                this.f587j = new a();
            }
            this.f582e.setAdapter((ListAdapter) this.f587j);
            this.f582e.setOnItemClickListener(this);
        }
        return this.f582e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo580a(android.content.Context r3, androidx.appcompat.view.menu.C0099h r4) {
        /*
            r2 = this;
            int r0 = r2.f584g
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f584g
            r0.<init>(r3, r1)
            r2.f579b = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f580c = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f579b
            if (r0 == 0) goto L23
            r2.f579b = r3
            android.view.LayoutInflater r0 = r2.f580c
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f581d = r4
            androidx.appcompat.view.menu.f$a r3 = r2.f587j
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0097f.mo580a(android.content.Context, androidx.appcompat.view.menu.h):void");
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo582a(C0099h c0099h, boolean z) {
        InterfaceC0106o.a aVar = this.f586i;
        if (aVar != null) {
            aVar.mo450a(c0099h, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo584a(InterfaceC0106o.a aVar) {
        this.f586i = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo585a(boolean z) {
        a aVar = this.f587j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public boolean mo588a(C0099h c0099h, C0101j c0101j) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public boolean mo589a(SubMenuC0112u subMenuC0112u) {
        if (!subMenuC0112u.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC0100i(subMenuC0112u).m683a((IBinder) null);
        InterfaceC0106o.a aVar = this.f586i;
        if (aVar == null) {
            return true;
        }
        aVar.mo451a(subMenuC0112u);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: b */
    public boolean mo591b(C0099h c0099h, C0101j c0101j) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: c */
    public boolean mo614c() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f581d.m650a(this.f587j.getItem(i), this, 0);
    }
}
