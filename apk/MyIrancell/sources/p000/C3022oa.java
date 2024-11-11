package p000;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* renamed from: oa */
/* loaded from: classes.dex */
public class C3022oa extends AbstractC2585ia<ParcelFileDescriptor> {
    public C3022oa(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC2585ia
    /* renamed from: a */
    public ParcelFileDescriptor mo12419a(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    @Override // p000.InterfaceC2853ka
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo3663a() {
        return ParcelFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.AbstractC2585ia
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo12420a(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }
}
