package p000;

import android.util.Log;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.InterfaceC0576j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ib */
/* loaded from: classes.dex */
public class C2586ib<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f10609a;

    /* renamed from: b */
    private final List<? extends InterfaceC0576j<DataType, ResourceType>> f10610b;

    /* renamed from: c */
    private final InterfaceC0020ag<ResourceType, Transcode> f10611c;

    /* renamed from: d */
    private final InterfaceC3283u1<List<Throwable>> f10612d;

    /* renamed from: e */
    private final String f10613e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ib$a */
    /* loaded from: classes.dex */
    public interface a<ResourceType> {
        /* renamed from: a */
        InterfaceC3353vb<ResourceType> mo12185a(InterfaceC3353vb<ResourceType> interfaceC3353vb);
    }

    public C2586ib(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends InterfaceC0576j<DataType, ResourceType>> list, InterfaceC0020ag<ResourceType, Transcode> interfaceC0020ag, InterfaceC3283u1<List<Throwable>> interfaceC3283u1) {
        this.f10609a = cls;
        this.f10610b = list;
        this.f10611c = interfaceC0020ag;
        this.f10612d = interfaceC3283u1;
        this.f10613e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    private InterfaceC3353vb<ResourceType> m12422a(InterfaceC2890la<DataType> interfaceC2890la, int i, int i2, C0575i c0575i) {
        List<Throwable> mo13874a = this.f10612d.mo13874a();
        C2816ji.m13459a(mo13874a);
        List<Throwable> list = mo13874a;
        try {
            return m12423a(interfaceC2890la, i, i2, c0575i, list);
        } finally {
            this.f10612d.mo13875a(list);
        }
    }

    /* renamed from: a */
    private InterfaceC3353vb<ResourceType> m12423a(InterfaceC2890la<DataType> interfaceC2890la, int i, int i2, C0575i c0575i, List<Throwable> list) {
        int size = this.f10610b.size();
        InterfaceC3353vb<ResourceType> interfaceC3353vb = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC0576j<DataType, ResourceType> interfaceC0576j = this.f10610b.get(i3);
            try {
                if (interfaceC0576j.mo3382a(interfaceC2890la.mo11361a(), c0575i)) {
                    interfaceC3353vb = interfaceC0576j.mo3381a(interfaceC2890la.mo11361a(), i, i2, c0575i);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    String str = "Failed to decode data for " + interfaceC0576j;
                }
                list.add(e);
            }
            if (interfaceC3353vb != null) {
                break;
            }
        }
        if (interfaceC3353vb != null) {
            return interfaceC3353vb;
        }
        throw new C3121qb(this.f10613e, new ArrayList(list));
    }

    /* renamed from: a */
    public InterfaceC3353vb<Transcode> m12424a(InterfaceC2890la<DataType> interfaceC2890la, int i, int i2, C0575i c0575i, a<ResourceType> aVar) {
        return this.f10611c.mo152a(aVar.mo12185a(m12422a(interfaceC2890la, i, i2, c0575i)), c0575i);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f10609a + ", decoders=" + this.f10610b + ", transcoder=" + this.f10611c + '}';
    }
}
