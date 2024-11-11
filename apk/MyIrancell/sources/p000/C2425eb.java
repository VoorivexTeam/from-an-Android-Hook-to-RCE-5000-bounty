package p000;

import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.InterfaceC0570d;
import java.io.File;
import p000.InterfaceC3030oc;

/* renamed from: eb */
/* loaded from: classes.dex */
class C2425eb<DataType> implements InterfaceC3030oc.b {

    /* renamed from: a */
    private final InterfaceC0570d<DataType> f9972a;

    /* renamed from: b */
    private final DataType f9973b;

    /* renamed from: c */
    private final C0575i f9974c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2425eb(InterfaceC0570d<DataType> interfaceC0570d, DataType datatype, C0575i c0575i) {
        this.f9972a = interfaceC0570d;
        this.f9973b = datatype;
        this.f9974c = c0575i;
    }

    @Override // p000.InterfaceC3030oc.b
    /* renamed from: a */
    public boolean mo11575a(File file) {
        return this.f9972a.mo3950a(this.f9973b, file, this.f9974c);
    }
}
