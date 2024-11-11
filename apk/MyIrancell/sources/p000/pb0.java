package p000;

import java.io.IOException;

/* loaded from: classes.dex */
final class pb0 implements ta0<j80, Character> {

    /* renamed from: a */
    static final pb0 f12594a = new pb0();

    pb0() {
    }

    @Override // p000.ta0
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Character mo133a(j80 j80Var) {
        String m13428f = j80Var.m13428f();
        if (m13428f.length() == 1) {
            return Character.valueOf(m13428f.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + m13428f.length());
    }
}
