package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ta extends ia<InputStream> {
    public ta(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.ia
    public InputStream a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // defpackage.ka
    public Class<InputStream> a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ia
    public void a(InputStream inputStream) {
        inputStream.close();
    }
}
