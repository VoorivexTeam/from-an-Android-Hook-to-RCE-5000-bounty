package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC0106o;
import androidx.appcompat.view.menu.InterfaceC0107p;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public abstract class AbstractC0093b implements InterfaceC0106o {

    /* renamed from: b */
    protected Context f530b;

    /* renamed from: c */
    protected Context f531c;

    /* renamed from: d */
    protected C0099h f532d;

    /* renamed from: e */
    protected LayoutInflater f533e;

    /* renamed from: f */
    private InterfaceC0106o.a f534f;

    /* renamed from: g */
    private int f535g;

    /* renamed from: h */
    private int f536h;

    /* renamed from: i */
    protected InterfaceC0107p f537i;

    public AbstractC0093b(Context context, int i, int i2) {
        this.f530b = context;
        this.f533e = LayoutInflater.from(context);
        this.f535g = i;
        this.f536h = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public View mo576a(C0101j c0101j, View view, ViewGroup viewGroup) {
        InterfaceC0107p.a m578a = view instanceof InterfaceC0107p.a ? (InterfaceC0107p.a) view : m578a(viewGroup);
        mo583a(c0101j, m578a);
        return (View) m578a;
    }

    /* renamed from: a */
    public InterfaceC0106o.a m577a() {
        return this.f534f;
    }

    /* renamed from: a */
    public InterfaceC0107p.a m578a(ViewGroup viewGroup) {
        return (InterfaceC0107p.a) this.f533e.inflate(this.f536h, viewGroup, false);
    }

    /* renamed from: a */
    public void m579a(int i) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo580a(Context context, C0099h c0099h) {
        this.f531c = context;
        LayoutInflater.from(context);
        this.f532d = c0099h;
    }

    /* renamed from: a */
    protected void m581a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f537i).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo582a(C0099h c0099h, boolean z) {
        InterfaceC0106o.a aVar = this.f534f;
        if (aVar != null) {
            aVar.mo450a(c0099h, z);
        }
    }

    /* renamed from: a */
    public abstract void mo583a(C0101j c0101j, InterfaceC0107p.a aVar);

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo584a(InterfaceC0106o.a aVar) {
        this.f534f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo585a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f537i;
        if (viewGroup == null) {
            return;
        }
        C0099h c0099h = this.f532d;
        int i = 0;
        if (c0099h != null) {
            c0099h.m654b();
            ArrayList<C0101j> m676n = this.f532d.m676n();
            int size = m676n.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C0101j c0101j = m676n.get(i3);
                if (mo586a(i2, c0101j)) {
                    View childAt = viewGroup.getChildAt(i2);
                    C0101j itemData = childAt instanceof InterfaceC0107p.a ? ((InterfaceC0107p.a) childAt).getItemData() : null;
                    View mo576a = mo576a(c0101j, childAt, viewGroup);
                    if (c0101j != itemData) {
                        mo576a.setPressed(false);
                        mo576a.jumpDrawablesToCurrentState();
                    }
                    if (mo576a != childAt) {
                        m581a(mo576a, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo587a(viewGroup, i)) {
                i++;
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo586a(int i, C0101j c0101j);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo587a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public boolean mo588a(C0099h c0099h, C0101j c0101j) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public boolean mo589a(SubMenuC0112u subMenuC0112u) {
        InterfaceC0106o.a aVar = this.f534f;
        if (aVar != null) {
            return aVar.mo451a(subMenuC0112u);
        }
        return false;
    }

    /* renamed from: b */
    public InterfaceC0107p mo590b(ViewGroup viewGroup) {
        if (this.f537i == null) {
            InterfaceC0107p interfaceC0107p = (InterfaceC0107p) this.f533e.inflate(this.f535g, viewGroup, false);
            this.f537i = interfaceC0107p;
            interfaceC0107p.mo565a(this.f532d);
            mo585a(true);
        }
        return this.f537i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: b */
    public boolean mo591b(C0099h c0099h, C0101j c0101j) {
        return false;
    }
}
