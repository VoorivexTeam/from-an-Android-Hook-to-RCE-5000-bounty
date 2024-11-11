package p000;

import android.util.Log;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.EnumC0569c;
import com.bumptech.glide.load.InterfaceC0577k;
import java.io.File;
import java.io.IOException;

/* renamed from: pf */
/* loaded from: classes.dex */
public class C3083pf implements InterfaceC0577k<C3033of> {
    @Override // com.bumptech.glide.load.InterfaceC0577k
    /* renamed from: a */
    public EnumC0569c mo3966a(C0575i c0575i) {
        return EnumC0569c.SOURCE;
    }

    @Override // com.bumptech.glide.load.InterfaceC0570d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean mo3950a(InterfaceC3353vb<C3033of> interfaceC3353vb, File file, C0575i c0575i) {
        try {
            C0022ai.m157a(interfaceC3353vb.get().m14509b(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }
}
