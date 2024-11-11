package androidx.lifecycle;

import androidx.lifecycle.AbstractC0299e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements InterfaceC0298d {

    /* renamed from: a */
    private final InterfaceC0296b f1878a;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0292a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1879a;

        static {
            int[] iArr = new int[AbstractC0299e.a.values().length];
            f1879a = iArr;
            try {
                iArr[AbstractC0299e.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1879a[AbstractC0299e.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1879a[AbstractC0299e.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1879a[AbstractC0299e.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1879a[AbstractC0299e.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1879a[AbstractC0299e.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1879a[AbstractC0299e.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(InterfaceC0296b interfaceC0296b) {
        this.f1878a = interfaceC0296b;
    }

    @Override // androidx.lifecycle.InterfaceC0298d
    /* renamed from: a */
    public void mo2004a(InterfaceC0301g interfaceC0301g, AbstractC0299e.a aVar) {
        switch (C0292a.f1879a[aVar.ordinal()]) {
            case 1:
                this.f1878a.m2030c(interfaceC0301g);
                return;
            case 2:
                this.f1878a.m2032e(interfaceC0301g);
                return;
            case 3:
                this.f1878a.m2028a(interfaceC0301g);
                return;
            case 4:
                this.f1878a.m2031d(interfaceC0301g);
                return;
            case 5:
                this.f1878a.m2033f(interfaceC0301g);
                return;
            case 6:
                this.f1878a.m2029b(interfaceC0301g);
                return;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
