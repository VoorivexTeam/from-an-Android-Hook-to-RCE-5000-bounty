package p000;

import java.nio.ByteBuffer;
import p000.InterfaceC2890la;

/* renamed from: df */
/* loaded from: classes.dex */
public class C2387df implements InterfaceC2890la<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f9807a;

    /* renamed from: df$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC2890la.a<ByteBuffer> {
        @Override // p000.InterfaceC2890la.a
        /* renamed from: a */
        public Class<ByteBuffer> mo11363a() {
            return ByteBuffer.class;
        }

        @Override // p000.InterfaceC2890la.a
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public InterfaceC2890la<ByteBuffer> mo11364a(ByteBuffer byteBuffer) {
            return new C2387df(byteBuffer);
        }
    }

    public C2387df(ByteBuffer byteBuffer) {
        this.f9807a = byteBuffer;
    }

    @Override // p000.InterfaceC2890la
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public ByteBuffer mo11361a() {
        this.f9807a.position(0);
        return this.f9807a;
    }

    @Override // p000.InterfaceC2890la
    /* renamed from: b */
    public void mo11362b() {
    }
}
