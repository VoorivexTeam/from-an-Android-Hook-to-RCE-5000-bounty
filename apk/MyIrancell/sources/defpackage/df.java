package defpackage;

import defpackage.la;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class df implements la<ByteBuffer> {
    private final ByteBuffer a;

    /* loaded from: classes.dex */
    public static class a implements la.a<ByteBuffer> {
        @Override // la.a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // la.a
        public la<ByteBuffer> a(ByteBuffer byteBuffer) {
            return new df(byteBuffer);
        }
    }

    public df(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.la
    public ByteBuffer a() {
        this.a.position(0);
        return this.a;
    }

    @Override // defpackage.la
    public void b() {
    }
}
