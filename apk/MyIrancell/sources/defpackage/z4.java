package defpackage;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import defpackage.d7;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* loaded from: classes.dex */
public class z4 implements a5, x4 {
    private final String d;
    private final d7 f;
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List<a5> e = new ArrayList();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d7.a.values().length];
            a = iArr;
            try {
                iArr[d7.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d7.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d7.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d7.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d7.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public z4(d7 d7Var) {
        if (Build.VERSION.SDK_INT < 19) {
            throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
        }
        this.d = d7Var.b();
        this.f = d7Var;
    }

    @TargetApi(19)
    private void a(Path.Op op) {
        this.b.reset();
        this.a.reset();
        for (int size = this.e.size() - 1; size >= 1; size--) {
            a5 a5Var = this.e.get(size);
            if (a5Var instanceof r4) {
                r4 r4Var = (r4) a5Var;
                List<a5> d = r4Var.d();
                for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                    Path c = d.get(size2).c();
                    c.transform(r4Var.e());
                    this.b.addPath(c);
                }
            } else {
                this.b.addPath(a5Var.c());
            }
        }
        a5 a5Var2 = this.e.get(0);
        if (a5Var2 instanceof r4) {
            r4 r4Var2 = (r4) a5Var2;
            List<a5> d2 = r4Var2.d();
            for (int i = 0; i < d2.size(); i++) {
                Path c2 = d2.get(i).c();
                c2.transform(r4Var2.e());
                this.a.addPath(c2);
            }
        } else {
            this.a.set(a5Var2.c());
        }
        this.c.op(this.a, this.b, op);
    }

    private void b() {
        for (int i = 0; i < this.e.size(); i++) {
            this.c.addPath(this.e.get(i).c());
        }
    }

    @Override // defpackage.q4
    public String a() {
        return this.d;
    }

    @Override // defpackage.q4
    public void a(List<q4> list, List<q4> list2) {
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).a(list, list2);
        }
    }

    @Override // defpackage.x4
    public void a(ListIterator<q4> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            q4 previous = listIterator.previous();
            if (previous instanceof a5) {
                this.e.add((a5) previous);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.a5
    public Path c() {
        Path.Op op;
        this.c.reset();
        if (this.f.c()) {
            return this.c;
        }
        int i = a.a[this.f.a().ordinal()];
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
            a(op);
        } else {
            b();
        }
        return this.c;
    }
}
