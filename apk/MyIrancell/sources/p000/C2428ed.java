package p000;

import android.util.Log;
import com.bumptech.glide.EnumC0562g;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.EnumC0567a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p000.InterfaceC2853ka;
import p000.InterfaceC3031od;

/* renamed from: ed */
/* loaded from: classes.dex */
public class C2428ed implements InterfaceC3031od<File, ByteBuffer> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ed$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC2853ka<ByteBuffer> {

        /* renamed from: b */
        private final File f10009b;

        a(File file) {
            this.f10009b = file;
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: a */
        public Class<ByteBuffer> mo3663a() {
            return ByteBuffer.class;
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: a */
        public void mo3664a(EnumC0562g enumC0562g, InterfaceC2853ka.a<? super ByteBuffer> aVar) {
            try {
                aVar.mo3639a((InterfaceC2853ka.a<? super ByteBuffer>) C0022ai.m156a(this.f10009b));
            } catch (IOException e) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.mo3638a((Exception) e);
            }
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: b */
        public void mo3665b() {
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: c */
        public EnumC0567a mo3666c() {
            return EnumC0567a.LOCAL;
        }

        @Override // p000.InterfaceC2853ka
        public void cancel() {
        }
    }

    /* renamed from: ed$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC3081pd<File, ByteBuffer> {
        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<File, ByteBuffer> mo139a(C3206sd c3206sd) {
            return new C2428ed();
        }
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3031od.a<ByteBuffer> mo137a(File file, int i, int i2, C0575i c0575i) {
        return new InterfaceC3031od.a<>(new C3529zh(file), new a(file));
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo138a(File file) {
        return true;
    }
}
