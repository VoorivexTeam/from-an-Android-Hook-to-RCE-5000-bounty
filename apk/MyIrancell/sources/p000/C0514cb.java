package p000;

import com.bumptech.glide.load.EnumC0567a;
import com.bumptech.glide.load.InterfaceC0573g;
import java.io.File;
import java.util.List;
import p000.InterfaceC2467fb;
import p000.InterfaceC2853ka;
import p000.InterfaceC3031od;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cb */
/* loaded from: classes.dex */
public class C0514cb implements InterfaceC2467fb, InterfaceC2853ka.a<Object> {

    /* renamed from: b */
    private final List<InterfaceC0573g> f2981b;

    /* renamed from: c */
    private final C2505gb<?> f2982c;

    /* renamed from: d */
    private final InterfaceC2467fb.a f2983d;

    /* renamed from: e */
    private int f2984e;

    /* renamed from: f */
    private InterfaceC0573g f2985f;

    /* renamed from: g */
    private List<InterfaceC3031od<File, ?>> f2986g;

    /* renamed from: h */
    private int f2987h;

    /* renamed from: i */
    private volatile InterfaceC3031od.a<?> f2988i;

    /* renamed from: j */
    private File f2989j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0514cb(C2505gb<?> c2505gb, InterfaceC2467fb.a aVar) {
        this(c2505gb.m11965c(), c2505gb, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0514cb(List<InterfaceC0573g> list, C2505gb<?> c2505gb, InterfaceC2467fb.a aVar) {
        this.f2984e = -1;
        this.f2981b = list;
        this.f2982c = c2505gb;
        this.f2983d = aVar;
    }

    /* renamed from: b */
    private boolean m3637b() {
        return this.f2987h < this.f2986g.size();
    }

    @Override // p000.InterfaceC2853ka.a
    /* renamed from: a */
    public void mo3638a(Exception exc) {
        this.f2983d.mo11746a(this.f2985f, exc, this.f2988i.f12456c, EnumC0567a.DATA_DISK_CACHE);
    }

    @Override // p000.InterfaceC2853ka.a
    /* renamed from: a */
    public void mo3639a(Object obj) {
        this.f2983d.mo11747a(this.f2985f, obj, this.f2988i.f12456c, EnumC0567a.DATA_DISK_CACHE, this.f2985f);
    }

    @Override // p000.InterfaceC2467fb
    /* renamed from: a */
    public boolean mo3640a() {
        while (true) {
            boolean z = false;
            if (this.f2986g != null && m3637b()) {
                this.f2988i = null;
                while (!z && m3637b()) {
                    List<InterfaceC3031od<File, ?>> list = this.f2986g;
                    int i = this.f2987h;
                    this.f2987h = i + 1;
                    this.f2988i = list.get(i).mo137a(this.f2989j, this.f2982c.m11977n(), this.f2982c.m11969f(), this.f2982c.m11972i());
                    if (this.f2988i != null && this.f2982c.m11966c(this.f2988i.f12456c.mo3663a())) {
                        this.f2988i.f12456c.mo3664a(this.f2982c.m11973j(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f2984e + 1;
            this.f2984e = i2;
            if (i2 >= this.f2981b.size()) {
                return false;
            }
            InterfaceC0573g interfaceC0573g = this.f2981b.get(this.f2984e);
            File mo14480a = this.f2982c.m11967d().mo14480a(new C2382db(interfaceC0573g, this.f2982c.m11975l()));
            this.f2989j = mo14480a;
            if (mo14480a != null) {
                this.f2985f = interfaceC0573g;
                this.f2986g = this.f2982c.m11957a(mo14480a);
                this.f2987h = 0;
            }
        }
    }

    @Override // p000.InterfaceC2467fb
    public void cancel() {
        InterfaceC3031od.a<?> aVar = this.f2988i;
        if (aVar != null) {
            aVar.f12456c.cancel();
        }
    }
}
