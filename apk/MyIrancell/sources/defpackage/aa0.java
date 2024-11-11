package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class aa0 extends IOException {
    public final o90 b;

    public aa0(o90 o90Var) {
        super("stream was reset: " + o90Var);
        this.b = o90Var;
    }
}
