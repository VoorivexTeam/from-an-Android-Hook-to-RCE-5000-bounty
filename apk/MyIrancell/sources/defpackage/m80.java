package defpackage;

import defpackage.i80;
import defpackage.y70;
import java.io.IOException;
import java.net.Socket;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public abstract class m80 {
    public static m80 a;

    public abstract int a(i80.a aVar);

    @Nullable
    public abstract IOException a(k70 k70Var, @Nullable IOException iOException);

    public abstract Socket a(p70 p70Var, g70 g70Var, a90 a90Var);

    public abstract w80 a(p70 p70Var, g70 g70Var, a90 a90Var, k80 k80Var);

    public abstract x80 a(p70 p70Var);

    public abstract void a(q70 q70Var, SSLSocket sSLSocket, boolean z);

    public abstract void a(y70.a aVar, String str);

    public abstract void a(y70.a aVar, String str, String str2);

    public abstract boolean a(g70 g70Var, g70 g70Var2);

    public abstract boolean a(p70 p70Var, w80 w80Var);

    public abstract void b(p70 p70Var, w80 w80Var);
}
