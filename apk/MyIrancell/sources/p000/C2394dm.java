package p000;

/* renamed from: dm */
/* loaded from: classes.dex */
public final class C2394dm {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m11469a(int i, TInput tinput, InterfaceC0527cm<TInput, TResult, TException> interfaceC0527cm, InterfaceC2437em<TInput, TResult> interfaceC2437em) {
        TResult mo3696a;
        if (i < 1) {
            return interfaceC0527cm.mo3696a(tinput);
        }
        do {
            mo3696a = interfaceC0527cm.mo3696a(tinput);
            tinput = interfaceC2437em.mo6258a(tinput, mo3696a);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return mo3696a;
    }
}
