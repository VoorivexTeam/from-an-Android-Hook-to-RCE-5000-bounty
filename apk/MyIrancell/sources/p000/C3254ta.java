package p000;

import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: ta */
/* loaded from: classes.dex */
public class C3254ta extends AbstractC2585ia<InputStream> {
    public C3254ta(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC2585ia
    /* renamed from: a */
    public InputStream mo12419a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // p000.InterfaceC2853ka
    /* renamed from: a */
    public Class<InputStream> mo3663a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.AbstractC2585ia
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo12420a(InputStream inputStream) {
        inputStream.close();
    }
}
