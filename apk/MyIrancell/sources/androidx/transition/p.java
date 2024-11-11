package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.l;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class p extends l {
    int M;
    private ArrayList<l> K = new ArrayList<>();
    private boolean L = true;
    boolean N = false;
    private int O = 0;

    /* loaded from: classes.dex */
    class a extends m {
        final /* synthetic */ l a;

        a(p pVar, l lVar) {
            this.a = lVar;
        }

        @Override // androidx.transition.l.f
        public void d(l lVar) {
            this.a.r();
            lVar.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends m {
        p a;

        b(p pVar) {
            this.a = pVar;
        }

        @Override // androidx.transition.m, androidx.transition.l.f
        public void a(l lVar) {
            p pVar = this.a;
            if (pVar.N) {
                return;
            }
            pVar.s();
            this.a.N = true;
        }

        @Override // androidx.transition.l.f
        public void d(l lVar) {
            p pVar = this.a;
            int i = pVar.M - 1;
            pVar.M = i;
            if (i == 0) {
                pVar.N = false;
                pVar.a();
            }
            lVar.b(this);
        }
    }

    private void u() {
        b bVar = new b(this);
        Iterator<l> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.M = this.K.size();
    }

    public l a(int i) {
        if (i < 0 || i >= this.K.size()) {
            return null;
        }
        return this.K.get(i);
    }

    @Override // androidx.transition.l
    public /* bridge */ /* synthetic */ l a(long j) {
        a(j);
        return this;
    }

    @Override // androidx.transition.l
    public p a(long j) {
        super.a(j);
        if (this.d >= 0) {
            int size = this.K.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).a(j);
            }
        }
        return this;
    }

    @Override // androidx.transition.l
    public p a(TimeInterpolator timeInterpolator) {
        this.O |= 1;
        ArrayList<l> arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).a(timeInterpolator);
            }
        }
        super.a(timeInterpolator);
        return this;
    }

    @Override // androidx.transition.l
    public p a(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).a(view);
        }
        super.a(view);
        return this;
    }

    @Override // androidx.transition.l
    public p a(l.f fVar) {
        super.a(fVar);
        return this;
    }

    public p a(l lVar) {
        this.K.add(lVar);
        lVar.s = this;
        long j = this.d;
        if (j >= 0) {
            lVar.a(j);
        }
        if ((this.O & 1) != 0) {
            lVar.a(g());
        }
        if ((this.O & 2) != 0) {
            lVar.a(k());
        }
        if ((this.O & 4) != 0) {
            lVar.a(j());
        }
        if ((this.O & 8) != 0) {
            lVar.a(c());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.l
    public String a(String str) {
        String a2 = super.a(str);
        for (int i = 0; i < this.K.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("\n");
            sb.append(this.K.get(i).a(str + "  "));
            a2 = sb.toString();
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.l
    public void a(ViewGroup viewGroup, s sVar, s sVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        long l = l();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            l lVar = this.K.get(i);
            if (l > 0 && (this.L || i == 0)) {
                long l2 = lVar.l();
                if (l2 > 0) {
                    lVar.b(l2 + l);
                } else {
                    lVar.b(l);
                }
            }
            lVar.a(viewGroup, sVar, sVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.l
    public void a(g gVar) {
        super.a(gVar);
        this.O |= 4;
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).a(gVar);
        }
    }

    @Override // androidx.transition.l
    public void a(l.e eVar) {
        super.a(eVar);
        this.O |= 8;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).a(eVar);
        }
    }

    @Override // androidx.transition.l
    public void a(o oVar) {
        super.a(oVar);
        this.O |= 2;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).a(oVar);
        }
    }

    @Override // androidx.transition.l
    public void a(r rVar) {
        if (b(rVar.b)) {
            Iterator<l> it = this.K.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next.b(rVar.b)) {
                    next.a(rVar);
                    rVar.c.add(next);
                }
            }
        }
    }

    public p b(int i) {
        if (i == 0) {
            this.L = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
            }
            this.L = false;
        }
        return this;
    }

    @Override // androidx.transition.l
    public p b(long j) {
        super.b(j);
        return this;
    }

    @Override // androidx.transition.l
    public p b(l.f fVar) {
        super.b(fVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.l
    public void b(r rVar) {
        super.b(rVar);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).b(rVar);
        }
    }

    @Override // androidx.transition.l
    public void c(View view) {
        super.c(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).c(view);
        }
    }

    @Override // androidx.transition.l
    public void c(r rVar) {
        if (b(rVar.b)) {
            Iterator<l> it = this.K.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next.b(rVar.b)) {
                    next.c(rVar);
                    rVar.c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.l
    /* renamed from: clone */
    public l mo0clone() {
        p pVar = (p) super.mo0clone();
        pVar.K = new ArrayList<>();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            pVar.a(this.K.get(i).mo0clone());
        }
        return pVar;
    }

    @Override // androidx.transition.l
    public p d(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).d(view);
        }
        super.d(view);
        return this;
    }

    @Override // androidx.transition.l
    public void e(View view) {
        super.e(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).e(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.l
    public void r() {
        if (this.K.isEmpty()) {
            s();
            a();
            return;
        }
        u();
        if (this.L) {
            Iterator<l> it = this.K.iterator();
            while (it.hasNext()) {
                it.next().r();
            }
            return;
        }
        for (int i = 1; i < this.K.size(); i++) {
            this.K.get(i - 1).a(new a(this, this.K.get(i)));
        }
        l lVar = this.K.get(0);
        if (lVar != null) {
            lVar.r();
        }
    }

    public int t() {
        return this.K.size();
    }
}
