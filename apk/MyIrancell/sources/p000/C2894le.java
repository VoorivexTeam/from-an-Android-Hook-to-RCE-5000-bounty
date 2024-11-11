package p000;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.InterfaceC0576j;
import java.nio.ByteBuffer;

/* renamed from: le */
/* loaded from: classes.dex */
public class C2894le implements InterfaceC0576j<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C3124qe f11872a;

    public C2894le(C3124qe c3124qe) {
        this.f11872a = c3124qe;
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3353vb<Bitmap> mo3381a(ByteBuffer byteBuffer, int i, int i2, C0575i c0575i) {
        return this.f11872a.m15083a(C0022ai.m159c(byteBuffer), i, i2, c0575i);
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo3382a(ByteBuffer byteBuffer, C0575i c0575i) {
        return this.f11872a.m15086a(byteBuffer);
    }
}
