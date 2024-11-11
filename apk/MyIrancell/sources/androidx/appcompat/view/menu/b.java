package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b implements o {
    protected Context b;
    protected Context c;
    protected h d;
    protected LayoutInflater e;
    private o.a f;
    private int g;
    private int h;
    protected p i;

    public b(Context context, int i, int i2) {
        this.b = context;
        this.e = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View a(j jVar, View view, ViewGroup viewGroup) {
        p.a a = view instanceof p.a ? (p.a) view : a(viewGroup);
        a(jVar, a);
        return (View) a;
    }

    public o.a a() {
        return this.f;
    }

    public p.a a(ViewGroup viewGroup) {
        return (p.a) this.e.inflate(this.h, viewGroup, false);
    }

    public void a(int i) {
    }

    @Override // androidx.appcompat.view.menu.o
    public void a(Context context, h hVar) {
        this.c = context;
        LayoutInflater.from(context);
        this.d = hVar;
    }

    protected void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.o
    public void a(h hVar, boolean z) {
        o.a aVar = this.f;
        if (aVar != null) {
            aVar.a(hVar, z);
        }
    }

    public abstract void a(j jVar, p.a aVar);

    @Override // androidx.appcompat.view.menu.o
    public void a(o.a aVar) {
        this.f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.o
    public void a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return;
        }
        h hVar = this.d;
        int i = 0;
        if (hVar != null) {
            hVar.b();
            ArrayList<j> n = this.d.n();
            int size = n.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                j jVar = n.get(i3);
                if (a(i2, jVar)) {
                    View childAt = viewGroup.getChildAt(i2);
                    j itemData = childAt instanceof p.a ? ((p.a) childAt).getItemData() : null;
                    View a = a(jVar, childAt, viewGroup);
                    if (jVar != itemData) {
                        a.setPressed(false);
                        a.jumpDrawablesToCurrentState();
                    }
                    if (a != childAt) {
                        a(a, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!a(viewGroup, i)) {
                i++;
            }
        }
    }

    public abstract boolean a(int i, j jVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean a(h hVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean a(u uVar) {
        o.a aVar = this.f;
        if (aVar != null) {
            return aVar.a(uVar);
        }
        return false;
    }

    public p b(ViewGroup viewGroup) {
        if (this.i == null) {
            p pVar = (p) this.e.inflate(this.g, viewGroup, false);
            this.i = pVar;
            pVar.a(this.d);
            a(true);
        }
        return this.i;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean b(h hVar, j jVar) {
        return false;
    }
}
