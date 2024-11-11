package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC0396l;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.transition.p */
/* loaded from: classes.dex */
public class C0400p extends AbstractC0396l {

    /* renamed from: M */
    int f2516M;

    /* renamed from: K */
    private ArrayList<AbstractC0396l> f2514K = new ArrayList<>();

    /* renamed from: L */
    private boolean f2515L = true;

    /* renamed from: N */
    boolean f2517N = false;

    /* renamed from: O */
    private int f2518O = 0;

    /* renamed from: androidx.transition.p$a */
    /* loaded from: classes.dex */
    class a extends C0397m {

        /* renamed from: a */
        final /* synthetic */ AbstractC0396l f2519a;

        a(C0400p c0400p, AbstractC0396l abstractC0396l) {
            this.f2519a = abstractC0396l;
        }

        @Override // androidx.transition.AbstractC0396l.f
        /* renamed from: d */
        public void mo2939d(AbstractC0396l abstractC0396l) {
            this.f2519a.mo3037r();
            abstractC0396l.mo3020b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.p$b */
    /* loaded from: classes.dex */
    public static class b extends C0397m {

        /* renamed from: a */
        C0400p f2520a;

        b(C0400p c0400p) {
            this.f2520a = c0400p;
        }

        @Override // androidx.transition.C0397m, androidx.transition.AbstractC0396l.f
        /* renamed from: a */
        public void mo2969a(AbstractC0396l abstractC0396l) {
            C0400p c0400p = this.f2520a;
            if (c0400p.f2517N) {
                return;
            }
            c0400p.m3038s();
            this.f2520a.f2517N = true;
        }

        @Override // androidx.transition.AbstractC0396l.f
        /* renamed from: d */
        public void mo2939d(AbstractC0396l abstractC0396l) {
            C0400p c0400p = this.f2520a;
            int i = c0400p.f2516M - 1;
            c0400p.f2516M = i;
            if (i == 0) {
                c0400p.f2517N = false;
                c0400p.m3009a();
            }
            abstractC0396l.mo3020b(this);
        }
    }

    /* renamed from: u */
    private void m3047u() {
        b bVar = new b(this);
        Iterator<AbstractC0396l> it = this.f2514K.iterator();
        while (it.hasNext()) {
            it.next().mo3006a(bVar);
        }
        this.f2516M = this.f2514K.size();
    }

    /* renamed from: a */
    public AbstractC0396l m3048a(int i) {
        if (i < 0 || i >= this.f2514K.size()) {
            return null;
        }
        return this.f2514K.get(i);
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: a */
    public /* bridge */ /* synthetic */ AbstractC0396l mo3003a(long j) {
        mo3003a(j);
        return this;
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: a */
    public C0400p mo3003a(long j) {
        super.mo3003a(j);
        if (this.f2476d >= 0) {
            int size = this.f2514K.size();
            for (int i = 0; i < size; i++) {
                this.f2514K.get(i).mo3003a(j);
            }
        }
        return this;
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: a */
    public C0400p mo3004a(TimeInterpolator timeInterpolator) {
        this.f2518O |= 1;
        ArrayList<AbstractC0396l> arrayList = this.f2514K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f2514K.get(i).mo3004a(timeInterpolator);
            }
        }
        super.mo3004a(timeInterpolator);
        return this;
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: a */
    public C0400p mo3005a(View view) {
        for (int i = 0; i < this.f2514K.size(); i++) {
            this.f2514K.get(i).mo3005a(view);
        }
        super.mo3005a(view);
        return this;
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: a */
    public C0400p mo3006a(AbstractC0396l.f fVar) {
        super.mo3006a(fVar);
        return this;
    }

    /* renamed from: a */
    public C0400p m3049a(AbstractC0396l abstractC0396l) {
        this.f2514K.add(abstractC0396l);
        abstractC0396l.f2491s = this;
        long j = this.f2476d;
        if (j >= 0) {
            abstractC0396l.mo3003a(j);
        }
        if ((this.f2518O & 1) != 0) {
            abstractC0396l.mo3004a(m3028g());
        }
        if ((this.f2518O & 2) != 0) {
            abstractC0396l.mo3016a(m3031k());
        }
        if ((this.f2518O & 4) != 0) {
            abstractC0396l.mo3014a(m3030j());
        }
        if ((this.f2518O & 8) != 0) {
            abstractC0396l.mo3015a(m3024c());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.AbstractC0396l
    /* renamed from: a */
    public String mo3008a(String str) {
        String mo3008a = super.mo3008a(str);
        for (int i = 0; i < this.f2514K.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo3008a);
            sb.append("\n");
            sb.append(this.f2514K.get(i).mo3008a(str + "  "));
            mo3008a = sb.toString();
        }
        return mo3008a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.AbstractC0396l
    /* renamed from: a */
    public void mo3012a(ViewGroup viewGroup, C0403s c0403s, C0403s c0403s2, ArrayList<C0402r> arrayList, ArrayList<C0402r> arrayList2) {
        long m3032l = m3032l();
        int size = this.f2514K.size();
        for (int i = 0; i < size; i++) {
            AbstractC0396l abstractC0396l = this.f2514K.get(i);
            if (m3032l > 0 && (this.f2515L || i == 0)) {
                long m3032l2 = abstractC0396l.m3032l();
                if (m3032l2 > 0) {
                    abstractC0396l.mo3019b(m3032l2 + m3032l);
                } else {
                    abstractC0396l.mo3019b(m3032l);
                }
            }
            abstractC0396l.mo3012a(viewGroup, c0403s, c0403s2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: a */
    public void mo3014a(AbstractC0386g abstractC0386g) {
        super.mo3014a(abstractC0386g);
        this.f2518O |= 4;
        for (int i = 0; i < this.f2514K.size(); i++) {
            this.f2514K.get(i).mo3014a(abstractC0386g);
        }
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: a */
    public void mo3015a(AbstractC0396l.e eVar) {
        super.mo3015a(eVar);
        this.f2518O |= 8;
        int size = this.f2514K.size();
        for (int i = 0; i < size; i++) {
            this.f2514K.get(i).mo3015a(eVar);
        }
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: a */
    public void mo3016a(AbstractC0399o abstractC0399o) {
        super.mo3016a(abstractC0399o);
        this.f2518O |= 2;
        int size = this.f2514K.size();
        for (int i = 0; i < size; i++) {
            this.f2514K.get(i).mo3016a(abstractC0399o);
        }
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: a */
    public void mo2922a(C0402r c0402r) {
        if (m3023b(c0402r.f2525b)) {
            Iterator<AbstractC0396l> it = this.f2514K.iterator();
            while (it.hasNext()) {
                AbstractC0396l next = it.next();
                if (next.m3023b(c0402r.f2525b)) {
                    next.mo2922a(c0402r);
                    c0402r.f2526c.add(next);
                }
            }
        }
    }

    /* renamed from: b */
    public C0400p m3050b(int i) {
        if (i == 0) {
            this.f2515L = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
            }
            this.f2515L = false;
        }
        return this;
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: b */
    public C0400p mo3019b(long j) {
        super.mo3019b(j);
        return this;
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: b */
    public C0400p mo3020b(AbstractC0396l.f fVar) {
        super.mo3020b(fVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.AbstractC0396l
    /* renamed from: b */
    public void mo3022b(C0402r c0402r) {
        super.mo3022b(c0402r);
        int size = this.f2514K.size();
        for (int i = 0; i < size; i++) {
            this.f2514K.get(i).mo3022b(c0402r);
        }
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: c */
    public void mo3025c(View view) {
        super.mo3025c(view);
        int size = this.f2514K.size();
        for (int i = 0; i < size; i++) {
            this.f2514K.get(i).mo3025c(view);
        }
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: c */
    public void mo2923c(C0402r c0402r) {
        if (m3023b(c0402r.f2525b)) {
            Iterator<AbstractC0396l> it = this.f2514K.iterator();
            while (it.hasNext()) {
                AbstractC0396l next = it.next();
                if (next.m3023b(c0402r.f2525b)) {
                    next.mo2923c(c0402r);
                    c0402r.f2526c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: clone */
    public AbstractC0396l mo16978clone() {
        C0400p c0400p = (C0400p) super.mo16978clone();
        c0400p.f2514K = new ArrayList<>();
        int size = this.f2514K.size();
        for (int i = 0; i < size; i++) {
            c0400p.m3049a(this.f2514K.get(i).mo16978clone());
        }
        return c0400p;
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: d */
    public C0400p mo3026d(View view) {
        for (int i = 0; i < this.f2514K.size(); i++) {
            this.f2514K.get(i).mo3026d(view);
        }
        super.mo3026d(view);
        return this;
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: e */
    public void mo3027e(View view) {
        super.mo3027e(view);
        int size = this.f2514K.size();
        for (int i = 0; i < size; i++) {
            this.f2514K.get(i).mo3027e(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.AbstractC0396l
    /* renamed from: r */
    public void mo3037r() {
        if (this.f2514K.isEmpty()) {
            m3038s();
            m3009a();
            return;
        }
        m3047u();
        if (this.f2515L) {
            Iterator<AbstractC0396l> it = this.f2514K.iterator();
            while (it.hasNext()) {
                it.next().mo3037r();
            }
            return;
        }
        for (int i = 1; i < this.f2514K.size(); i++) {
            this.f2514K.get(i - 1).mo3006a(new a(this, this.f2514K.get(i)));
        }
        AbstractC0396l abstractC0396l = this.f2514K.get(0);
        if (abstractC0396l != null) {
            abstractC0396l.mo3037r();
        }
    }

    /* renamed from: t */
    public int m3051t() {
        return this.f2514K.size();
    }
}
