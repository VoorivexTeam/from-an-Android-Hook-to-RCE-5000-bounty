package p000;

import com.bumptech.glide.C0560e;
import com.bumptech.glide.C0563h;
import com.bumptech.glide.EnumC0562g;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.InterfaceC0570d;
import com.bumptech.glide.load.InterfaceC0573g;
import com.bumptech.glide.load.InterfaceC0577k;
import com.bumptech.glide.load.InterfaceC0578l;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.InterfaceC3031od;
import p000.RunnableC2547hb;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gb */
/* loaded from: classes.dex */
public final class C2505gb<Transcode> {

    /* renamed from: a */
    private final List<InterfaceC3031od.a<?>> f10276a = new ArrayList();

    /* renamed from: b */
    private final List<InterfaceC0573g> f10277b = new ArrayList();

    /* renamed from: c */
    private C0560e f10278c;

    /* renamed from: d */
    private Object f10279d;

    /* renamed from: e */
    private int f10280e;

    /* renamed from: f */
    private int f10281f;

    /* renamed from: g */
    private Class<?> f10282g;

    /* renamed from: h */
    private RunnableC2547hb.e f10283h;

    /* renamed from: i */
    private C0575i f10284i;

    /* renamed from: j */
    private Map<Class<?>, InterfaceC0578l<?>> f10285j;

    /* renamed from: k */
    private Class<Transcode> f10286k;

    /* renamed from: l */
    private boolean f10287l;

    /* renamed from: m */
    private boolean f10288m;

    /* renamed from: n */
    private InterfaceC0573g f10289n;

    /* renamed from: o */
    private EnumC0562g f10290o;

    /* renamed from: p */
    private AbstractC2809jb f10291p;

    /* renamed from: q */
    private boolean f10292q;

    /* renamed from: r */
    private boolean f10293r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public <X> InterfaceC0570d<X> m11955a(X x) {
        return this.f10278c.m3892f().m3911c(x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public <Z> InterfaceC0577k<Z> m11956a(InterfaceC3353vb<Z> interfaceC3353vb) {
        return this.f10278c.m3892f().m3904a((InterfaceC3353vb) interfaceC3353vb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<InterfaceC3031od<File, ?>> m11957a(File file) {
        return this.f10278c.m3892f().m3906a((C0563h) file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public <Data> C3256tb<Data, ?, Transcode> m11958a(Class<Data> cls) {
        return this.f10278c.m3892f().m3907a(cls, this.f10282g, this.f10286k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11959a() {
        this.f10278c = null;
        this.f10279d = null;
        this.f10289n = null;
        this.f10282g = null;
        this.f10286k = null;
        this.f10284i = null;
        this.f10290o = null;
        this.f10285j = null;
        this.f10291p = null;
        this.f10276a.clear();
        this.f10287l = false;
        this.f10277b.clear();
        this.f10288m = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <R> void m11960a(C0560e c0560e, Object obj, InterfaceC0573g interfaceC0573g, int i, int i2, AbstractC2809jb abstractC2809jb, Class<?> cls, Class<R> cls2, EnumC0562g enumC0562g, C0575i c0575i, Map<Class<?>, InterfaceC0578l<?>> map, boolean z, boolean z2, RunnableC2547hb.e eVar) {
        this.f10278c = c0560e;
        this.f10279d = obj;
        this.f10289n = interfaceC0573g;
        this.f10280e = i;
        this.f10281f = i2;
        this.f10291p = abstractC2809jb;
        this.f10282g = cls;
        this.f10283h = eVar;
        this.f10286k = cls2;
        this.f10290o = enumC0562g;
        this.f10284i = c0575i;
        this.f10285j = map;
        this.f10292q = z;
        this.f10293r = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m11961a(InterfaceC0573g interfaceC0573g) {
        List<InterfaceC3031od.a<?>> m11970g = m11970g();
        int size = m11970g.size();
        for (int i = 0; i < size; i++) {
            if (m11970g.get(i).f12454a.equals(interfaceC0573g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public InterfaceC0475bc m11962b() {
        return this.f10278c.m3885a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public <Z> InterfaceC0578l<Z> m11963b(Class<Z> cls) {
        InterfaceC0578l<Z> interfaceC0578l = (InterfaceC0578l) this.f10285j.get(cls);
        if (interfaceC0578l == null) {
            Iterator<Map.Entry<Class<?>, InterfaceC0578l<?>>> it = this.f10285j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, InterfaceC0578l<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    interfaceC0578l = (InterfaceC0578l) next.getValue();
                    break;
                }
            }
        }
        if (interfaceC0578l != null) {
            return interfaceC0578l;
        }
        if (!this.f10285j.isEmpty() || !this.f10292q) {
            return C2470fe.m11761a();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m11964b(InterfaceC3353vb<?> interfaceC3353vb) {
        return this.f10278c.m3892f().m3910b(interfaceC3353vb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public List<InterfaceC0573g> m11965c() {
        if (!this.f10288m) {
            this.f10288m = true;
            this.f10277b.clear();
            List<InterfaceC3031od.a<?>> m11970g = m11970g();
            int size = m11970g.size();
            for (int i = 0; i < size; i++) {
                InterfaceC3031od.a<?> aVar = m11970g.get(i);
                if (!this.f10277b.contains(aVar.f12454a)) {
                    this.f10277b.add(aVar.f12454a);
                }
                for (int i2 = 0; i2 < aVar.f12455b.size(); i2++) {
                    if (!this.f10277b.contains(aVar.f12455b.get(i2))) {
                        this.f10277b.add(aVar.f12455b.get(i2));
                    }
                }
            }
        }
        return this.f10277b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public boolean m11966c(Class<?> cls) {
        return m11958a((Class) cls) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC3030oc m11967d() {
        return this.f10283h.mo12190a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public AbstractC2809jb m11968e() {
        return this.f10291p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m11969f() {
        return this.f10281f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public List<InterfaceC3031od.a<?>> m11970g() {
        if (!this.f10287l) {
            this.f10287l = true;
            this.f10276a.clear();
            List m3906a = this.f10278c.m3892f().m3906a((C0563h) this.f10279d);
            int size = m3906a.size();
            for (int i = 0; i < size; i++) {
                InterfaceC3031od.a<?> mo137a = ((InterfaceC3031od) m3906a.get(i)).mo137a(this.f10279d, this.f10280e, this.f10281f, this.f10284i);
                if (mo137a != null) {
                    this.f10276a.add(mo137a);
                }
            }
        }
        return this.f10276a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Class<?> m11971h() {
        return this.f10279d.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C0575i m11972i() {
        return this.f10284i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public EnumC0562g m11973j() {
        return this.f10290o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public List<Class<?>> m11974k() {
        return this.f10278c.m3892f().m3908b(this.f10279d.getClass(), this.f10282g, this.f10286k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public InterfaceC0573g m11975l() {
        return this.f10289n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public Class<?> m11976m() {
        return this.f10286k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m11977n() {
        return this.f10280e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m11978o() {
        return this.f10293r;
    }
}
