package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;

/* renamed from: ha */
/* loaded from: classes.dex */
public final class C2546ha extends AbstractC3201sa<AssetFileDescriptor> {
    public C2546ha(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC3201sa
    /* renamed from: a */
    public AssetFileDescriptor mo12154a(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    @Override // p000.InterfaceC2853ka
    /* renamed from: a */
    public Class<AssetFileDescriptor> mo3663a() {
        return AssetFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.AbstractC3201sa
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo12155a(AssetFileDescriptor assetFileDescriptor) {
        assetFileDescriptor.close();
    }
}
