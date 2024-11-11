package defpackage;

import android.graphics.Paint;
import com.airbnb.lottie.f;
import java.util.List;

/* loaded from: classes.dex */
public class l7 implements x6 {
    private final String a;
    private final j6 b;
    private final List<j6> c;
    private final i6 d;
    private final l6 e;
    private final j6 f;
    private final b g;
    private final c h;
    private final float i;
    private final boolean j;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c.values().length];
            b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = a.a[ordinal()];
            return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = a.b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public l7(String str, j6 j6Var, List<j6> list, i6 i6Var, l6 l6Var, j6 j6Var2, b bVar, c cVar, float f, boolean z) {
        this.a = str;
        this.b = j6Var;
        this.c = list;
        this.d = i6Var;
        this.e = l6Var;
        this.f = j6Var2;
        this.g = bVar;
        this.h = cVar;
        this.i = f;
        this.j = z;
    }

    public b a() {
        return this.g;
    }

    @Override // defpackage.x6
    public q4 a(f fVar, n7 n7Var) {
        return new f5(fVar, n7Var, this);
    }

    public i6 b() {
        return this.d;
    }

    public j6 c() {
        return this.b;
    }

    public c d() {
        return this.h;
    }

    public List<j6> e() {
        return this.c;
    }

    public float f() {
        return this.i;
    }

    public String g() {
        return this.a;
    }

    public l6 h() {
        return this.e;
    }

    public j6 i() {
        return this.f;
    }

    public boolean j() {
        return this.j;
    }
}
