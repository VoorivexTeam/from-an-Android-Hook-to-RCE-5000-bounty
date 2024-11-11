package defpackage;

import com.airbnb.lottie.f;

/* loaded from: classes.dex */
public class d7 implements x6 {
    private final String a;
    private final a b;
    private final boolean c;

    /* loaded from: classes.dex */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a forId(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public d7(String str, a aVar, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = z;
    }

    public a a() {
        return this.b;
    }

    @Override // defpackage.x6
    public q4 a(f fVar, n7 n7Var) {
        if (fVar.c()) {
            return new z4(this);
        }
        q9.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.b + '}';
    }
}
