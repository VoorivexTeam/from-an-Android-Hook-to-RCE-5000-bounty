package p000;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.InterfaceC0576j;
import java.io.IOException;
import java.io.InputStream;
import p000.C3124qe;

/* renamed from: ze */
/* loaded from: classes.dex */
public class C3526ze implements InterfaceC0576j<InputStream, Bitmap> {

    /* renamed from: a */
    private final C3124qe f14446a;

    /* renamed from: b */
    private final InterfaceC0475bc f14447b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ze$a */
    /* loaded from: classes.dex */
    public static class a implements C3124qe.b {

        /* renamed from: a */
        private final C3435xe f14448a;

        /* renamed from: b */
        private final C2390di f14449b;

        a(C3435xe c3435xe, C2390di c2390di) {
            this.f14448a = c3435xe;
            this.f14449b = c2390di;
        }

        @Override // p000.C3124qe.b
        /* renamed from: a */
        public void mo15087a() {
            this.f14448a.m16489a();
        }

        @Override // p000.C3124qe.b
        /* renamed from: a */
        public void mo15088a(InterfaceC2427ec interfaceC2427ec, Bitmap bitmap) {
            IOException m11425a = this.f14449b.m11425a();
            if (m11425a != null) {
                if (bitmap == null) {
                    throw m11425a;
                }
                interfaceC2427ec.mo11591a(bitmap);
                throw m11425a;
            }
        }
    }

    public C3526ze(C3124qe c3124qe, InterfaceC0475bc interfaceC0475bc) {
        this.f14446a = c3124qe;
        this.f14447b = interfaceC0475bc;
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3353vb<Bitmap> mo3381a(InputStream inputStream, int i, int i2, C0575i c0575i) {
        C3435xe c3435xe;
        boolean z;
        if (inputStream instanceof C3435xe) {
            c3435xe = (C3435xe) inputStream;
            z = false;
        } else {
            c3435xe = new C3435xe(inputStream, this.f14447b);
            z = true;
        }
        C2390di m11424b = C2390di.m11424b(c3435xe);
        try {
            return this.f14446a.m15084a(new C2554hi(m11424b), i, i2, c0575i, new a(c3435xe, m11424b));
        } finally {
            m11424b.m11427c();
            if (z) {
                c3435xe.m16490c();
            }
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo3382a(InputStream inputStream, C0575i c0575i) {
        return this.f14446a.m15085a(inputStream);
    }
}
