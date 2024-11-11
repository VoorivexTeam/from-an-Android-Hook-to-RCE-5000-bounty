package defpackage;

import com.airbnb.lottie.c;
import com.airbnb.lottie.i;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class p9 implements i {
    private static final Set<String> a = new HashSet();

    @Override // com.airbnb.lottie.i
    public void a(String str) {
        a(str, null);
    }

    @Override // com.airbnb.lottie.i
    public void a(String str, Throwable th) {
        if (a.contains(str)) {
            return;
        }
        a.add(str);
    }

    @Override // com.airbnb.lottie.i
    public void b(String str) {
        c(str, null);
    }

    @Override // com.airbnb.lottie.i
    public void b(String str, Throwable th) {
        boolean z = c.a;
    }

    public void c(String str, Throwable th) {
        boolean z = c.a;
    }
}
