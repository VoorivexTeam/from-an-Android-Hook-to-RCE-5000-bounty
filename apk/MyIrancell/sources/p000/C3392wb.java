package p000;

import com.bumptech.glide.load.EnumC0567a;
import com.bumptech.glide.load.InterfaceC0573g;
import java.io.File;
import java.util.List;
import p000.InterfaceC2467fb;
import p000.InterfaceC2853ka;
import p000.InterfaceC3031od;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wb */
/* loaded from: classes.dex */
public class C3392wb implements InterfaceC2467fb, InterfaceC2853ka.a<Object> {

    /* renamed from: b */
    private final InterfaceC2467fb.a f13807b;

    /* renamed from: c */
    private final C2505gb<?> f13808c;

    /* renamed from: d */
    private int f13809d;

    /* renamed from: e */
    private int f13810e = -1;

    /* renamed from: f */
    private InterfaceC0573g f13811f;

    /* renamed from: g */
    private List<InterfaceC3031od<File, ?>> f13812g;

    /* renamed from: h */
    private int f13813h;

    /* renamed from: i */
    private volatile InterfaceC3031od.a<?> f13814i;

    /* renamed from: j */
    private File f13815j;

    /* renamed from: k */
    private C3432xb f13816k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3392wb(C2505gb<?> c2505gb, InterfaceC2467fb.a aVar) {
        this.f13808c = c2505gb;
        this.f13807b = aVar;
    }

    /* renamed from: b */
    private boolean m16197b() {
        return this.f13813h < this.f13812g.size();
    }

    @Override // p000.InterfaceC2853ka.a
    /* renamed from: a */
    public void mo3638a(Exception exc) {
        this.f13807b.mo11746a(this.f13816k, exc, this.f13814i.f12456c, EnumC0567a.RESOURCE_DISK_CACHE);
    }

    @Override // p000.InterfaceC2853ka.a
    /* renamed from: a */
    public void mo3639a(Object obj) {
        this.f13807b.mo11747a(this.f13811f, obj, this.f13814i.f12456c, EnumC0567a.RESOURCE_DISK_CACHE, this.f13816k);
    }

    @Override // p000.InterfaceC2467fb
    /* renamed from: a */
    public boolean mo3640a() {
        List<InterfaceC0573g> m11965c = this.f13808c.m11965c();
        boolean z = false;
        if (m11965c.isEmpty()) {
            return false;
        }
        List<Class<?>> m11974k = this.f13808c.m11974k();
        if (m11974k.isEmpty()) {
            if (File.class.equals(this.f13808c.m11976m())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f13808c.m11971h() + " to " + this.f13808c.m11976m());
        }
        while (true) {
            if (this.f13812g != null && m16197b()) {
                this.f13814i = null;
                while (!z && m16197b()) {
                    List<InterfaceC3031od<File, ?>> list = this.f13812g;
                    int i = this.f13813h;
                    this.f13813h = i + 1;
                    this.f13814i = list.get(i).mo137a(this.f13815j, this.f13808c.m11977n(), this.f13808c.m11969f(), this.f13808c.m11972i());
                    if (this.f13814i != null && this.f13808c.m11966c(this.f13814i.f12456c.mo3663a())) {
                        this.f13814i.f12456c.mo3664a(this.f13808c.m11973j(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f13810e + 1;
            this.f13810e = i2;
            if (i2 >= m11974k.size()) {
                int i3 = this.f13809d + 1;
                this.f13809d = i3;
                if (i3 >= m11965c.size()) {
                    return false;
                }
                this.f13810e = 0;
            }
            InterfaceC0573g interfaceC0573g = m11965c.get(this.f13809d);
            Class<?> cls = m11974k.get(this.f13810e);
            this.f13816k = new C3432xb(this.f13808c.m11962b(), interfaceC0573g, this.f13808c.m11975l(), this.f13808c.m11977n(), this.f13808c.m11969f(), this.f13808c.m11963b(cls), cls, this.f13808c.m11972i());
            File mo14480a = this.f13808c.m11967d().mo14480a(this.f13816k);
            this.f13815j = mo14480a;
            if (mo14480a != null) {
                this.f13811f = interfaceC0573g;
                this.f13812g = this.f13808c.m11957a(mo14480a);
                this.f13813h = 0;
            }
        }
    }

    @Override // p000.InterfaceC2467fb
    public void cancel() {
        InterfaceC3031od.a<?> aVar = this.f13814i;
        if (aVar != null) {
            aVar.f12456c.cancel();
        }
    }
}
