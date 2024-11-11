package p000;

import com.bumptech.glide.load.C0575i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.C2586ib;

/* renamed from: tb */
/* loaded from: classes.dex */
public class C3256tb<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final InterfaceC3283u1<List<Throwable>> f13297a;

    /* renamed from: b */
    private final List<? extends C2586ib<Data, ResourceType, Transcode>> f13298b;

    /* renamed from: c */
    private final String f13299c;

    public C3256tb(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C2586ib<Data, ResourceType, Transcode>> list, InterfaceC3283u1<List<Throwable>> interfaceC3283u1) {
        this.f13297a = interfaceC3283u1;
        C2816ji.m13462a(list);
        this.f13298b = list;
        this.f13299c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    private InterfaceC3353vb<Transcode> m15629a(InterfaceC2890la<Data> interfaceC2890la, C0575i c0575i, int i, int i2, C2586ib.a<ResourceType> aVar, List<Throwable> list) {
        int size = this.f13298b.size();
        InterfaceC3353vb<Transcode> interfaceC3353vb = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                interfaceC3353vb = this.f13298b.get(i3).m12424a(interfaceC2890la, i, i2, c0575i, aVar);
            } catch (C3121qb e) {
                list.add(e);
            }
            if (interfaceC3353vb != null) {
                break;
            }
        }
        if (interfaceC3353vb != null) {
            return interfaceC3353vb;
        }
        throw new C3121qb(this.f13299c, new ArrayList(list));
    }

    /* renamed from: a */
    public InterfaceC3353vb<Transcode> m15630a(InterfaceC2890la<Data> interfaceC2890la, C0575i c0575i, int i, int i2, C2586ib.a<ResourceType> aVar) {
        List<Throwable> mo13874a = this.f13297a.mo13874a();
        C2816ji.m13459a(mo13874a);
        List<Throwable> list = mo13874a;
        try {
            return m15629a(interfaceC2890la, c0575i, i, i2, aVar, list);
        } finally {
            this.f13297a.mo13875a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f13298b.toArray()) + '}';
    }
}
