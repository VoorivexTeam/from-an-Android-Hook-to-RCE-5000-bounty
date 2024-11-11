package p000;

import com.airbnb.lottie.C0537c;
import com.airbnb.lottie.InterfaceC0543i;
import java.util.HashSet;
import java.util.Set;

/* renamed from: p9 */
/* loaded from: classes.dex */
public class C3076p9 implements InterfaceC0543i {

    /* renamed from: a */
    private static final Set<String> f12577a = new HashSet();

    @Override // com.airbnb.lottie.InterfaceC0543i
    /* renamed from: a */
    public void mo3834a(String str) {
        mo3835a(str, null);
    }

    @Override // com.airbnb.lottie.InterfaceC0543i
    /* renamed from: a */
    public void mo3835a(String str, Throwable th) {
        if (f12577a.contains(str)) {
            return;
        }
        f12577a.add(str);
    }

    @Override // com.airbnb.lottie.InterfaceC0543i
    /* renamed from: b */
    public void mo3836b(String str) {
        m14739c(str, null);
    }

    @Override // com.airbnb.lottie.InterfaceC0543i
    /* renamed from: b */
    public void mo3837b(String str, Throwable th) {
        boolean z = C0537c.f3061a;
    }

    /* renamed from: c */
    public void m14739c(String str, Throwable th) {
        boolean z = C0537c.f3061a;
    }
}
