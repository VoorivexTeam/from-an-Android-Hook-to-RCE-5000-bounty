package p000;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p000.C2376d7;

@TargetApi(19)
/* renamed from: z4 */
/* loaded from: classes.dex */
public class C3511z4 implements InterfaceC0006a5, InterfaceC3422x4 {

    /* renamed from: d */
    private final String f14331d;

    /* renamed from: f */
    private final C2376d7 f14333f;

    /* renamed from: a */
    private final Path f14328a = new Path();

    /* renamed from: b */
    private final Path f14329b = new Path();

    /* renamed from: c */
    private final Path f14330c = new Path();

    /* renamed from: e */
    private final List<InterfaceC0006a5> f14332e = new ArrayList();

    /* renamed from: z4$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14334a;

        static {
            int[] iArr = new int[C2376d7.a.values().length];
            f14334a = iArr;
            try {
                iArr[C2376d7.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14334a[C2376d7.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14334a[C2376d7.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14334a[C2376d7.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14334a[C2376d7.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C3511z4(C2376d7 c2376d7) {
        if (Build.VERSION.SDK_INT < 19) {
            throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
        }
        this.f14331d = c2376d7.m11290b();
        this.f14333f = c2376d7;
    }

    @TargetApi(19)
    /* renamed from: a */
    private void m16729a(Path.Op op) {
        this.f14329b.reset();
        this.f14328a.reset();
        for (int size = this.f14332e.size() - 1; size >= 1; size--) {
            InterfaceC0006a5 interfaceC0006a5 = this.f14332e.get(size);
            if (interfaceC0006a5 instanceof C3151r4) {
                C3151r4 c3151r4 = (C3151r4) interfaceC0006a5;
                List<InterfaceC0006a5> m15200d = c3151r4.m15200d();
                for (int size2 = m15200d.size() - 1; size2 >= 0; size2--) {
                    Path mo49c = m15200d.get(size2).mo49c();
                    mo49c.transform(c3151r4.m15201e());
                    this.f14329b.addPath(mo49c);
                }
            } else {
                this.f14329b.addPath(interfaceC0006a5.mo49c());
            }
        }
        InterfaceC0006a5 interfaceC0006a52 = this.f14332e.get(0);
        if (interfaceC0006a52 instanceof C3151r4) {
            C3151r4 c3151r42 = (C3151r4) interfaceC0006a52;
            List<InterfaceC0006a5> m15200d2 = c3151r42.m15200d();
            for (int i = 0; i < m15200d2.size(); i++) {
                Path mo49c2 = m15200d2.get(i).mo49c();
                mo49c2.transform(c3151r42.m15201e());
                this.f14328a.addPath(mo49c2);
            }
        } else {
            this.f14328a.set(interfaceC0006a52.mo49c());
        }
        this.f14330c.op(this.f14328a, this.f14329b, op);
    }

    /* renamed from: b */
    private void m16730b() {
        for (int i = 0; i < this.f14332e.size(); i++) {
            this.f14330c.addPath(this.f14332e.get(i).mo49c());
        }
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public String mo3318a() {
        return this.f14331d;
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public void mo3321a(List<InterfaceC3109q4> list, List<InterfaceC3109q4> list2) {
        for (int i = 0; i < this.f14332e.size(); i++) {
            this.f14332e.get(i).mo3321a(list, list2);
        }
    }

    @Override // p000.InterfaceC3422x4
    /* renamed from: a */
    public void mo11277a(ListIterator<InterfaceC3109q4> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC3109q4 previous = listIterator.previous();
            if (previous instanceof InterfaceC0006a5) {
                this.f14332e.add((InterfaceC0006a5) previous);
                listIterator.remove();
            }
        }
    }

    @Override // p000.InterfaceC0006a5
    /* renamed from: c */
    public Path mo49c() {
        Path.Op op;
        this.f14330c.reset();
        if (this.f14333f.m11291c()) {
            return this.f14330c;
        }
        int i = a.f14334a[this.f14333f.m11289a().ordinal()];
        if (i != 1) {
            if (i == 2) {
                op = Path.Op.UNION;
            } else if (i == 3) {
                op = Path.Op.REVERSE_DIFFERENCE;
            } else if (i == 4) {
                op = Path.Op.INTERSECT;
            } else if (i == 5) {
                op = Path.Op.XOR;
            }
            m16729a(op);
        } else {
            m16730b();
        }
        return this.f14330c;
    }
}
