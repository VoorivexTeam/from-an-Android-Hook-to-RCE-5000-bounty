package defpackage;

/* loaded from: classes.dex */
public final class dm {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i, TInput tinput, cm<TInput, TResult, TException> cmVar, em<TInput, TResult> emVar) {
        TResult a;
        if (i < 1) {
            return cmVar.a(tinput);
        }
        do {
            a = cmVar.a(tinput);
            tinput = emVar.a(tinput, a);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return a;
    }
}
