package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
final class pb0 implements ta0<j80, Character> {
    static final pb0 a = new pb0();

    pb0() {
    }

    @Override // defpackage.ta0
    public Character a(j80 j80Var) {
        String f = j80Var.f();
        if (f.length() == 1) {
            return Character.valueOf(f.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + f.length());
    }
}
