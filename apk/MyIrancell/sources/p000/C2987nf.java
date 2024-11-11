package p000;

import android.graphics.Bitmap;
import p000.InterfaceC0513ca;

/* renamed from: nf */
/* loaded from: classes.dex */
public final class C2987nf implements InterfaceC0513ca.a {

    /* renamed from: a */
    private final InterfaceC2427ec f12329a;

    /* renamed from: b */
    private final InterfaceC0475bc f12330b;

    public C2987nf(InterfaceC2427ec interfaceC2427ec, InterfaceC0475bc interfaceC0475bc) {
        this.f12329a = interfaceC2427ec;
        this.f12330b = interfaceC0475bc;
    }

    @Override // p000.InterfaceC0513ca.a
    /* renamed from: a */
    public Bitmap mo3628a(int i, int i2, Bitmap.Config config) {
        return this.f12329a.mo11592b(i, i2, config);
    }

    @Override // p000.InterfaceC0513ca.a
    /* renamed from: a */
    public void mo3629a(Bitmap bitmap) {
        this.f12329a.mo11591a(bitmap);
    }

    @Override // p000.InterfaceC0513ca.a
    /* renamed from: a */
    public void mo3630a(byte[] bArr) {
        InterfaceC0475bc interfaceC0475bc = this.f12330b;
        if (interfaceC0475bc == null) {
            return;
        }
        interfaceC0475bc.mo3378a((InterfaceC0475bc) bArr);
    }

    @Override // p000.InterfaceC0513ca.a
    /* renamed from: a */
    public void mo3631a(int[] iArr) {
        InterfaceC0475bc interfaceC0475bc = this.f12330b;
        if (interfaceC0475bc == null) {
            return;
        }
        interfaceC0475bc.mo3378a((InterfaceC0475bc) iArr);
    }

    @Override // p000.InterfaceC0513ca.a
    /* renamed from: a */
    public byte[] mo3632a(int i) {
        InterfaceC0475bc interfaceC0475bc = this.f12330b;
        return interfaceC0475bc == null ? new byte[i] : (byte[]) interfaceC0475bc.mo3379b(i, byte[].class);
    }

    @Override // p000.InterfaceC0513ca.a
    /* renamed from: b */
    public int[] mo3633b(int i) {
        InterfaceC0475bc interfaceC0475bc = this.f12330b;
        return interfaceC0475bc == null ? new int[i] : (int[]) interfaceC0475bc.mo3379b(i, int[].class);
    }
}
