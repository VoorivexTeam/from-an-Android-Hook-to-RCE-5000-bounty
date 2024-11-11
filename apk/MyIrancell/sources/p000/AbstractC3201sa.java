package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.EnumC0562g;
import com.bumptech.glide.load.EnumC0567a;
import java.io.FileNotFoundException;
import java.io.IOException;
import p000.InterfaceC2853ka;

/* renamed from: sa */
/* loaded from: classes.dex */
public abstract class AbstractC3201sa<T> implements InterfaceC2853ka<T> {

    /* renamed from: b */
    private final Uri f13064b;

    /* renamed from: c */
    private final ContentResolver f13065c;

    /* renamed from: d */
    private T f13066d;

    public AbstractC3201sa(ContentResolver contentResolver, Uri uri) {
        this.f13065c = contentResolver;
        this.f13064b = uri;
    }

    /* renamed from: a */
    protected abstract T mo12154a(Uri uri, ContentResolver contentResolver);

    @Override // p000.InterfaceC2853ka
    /* renamed from: a */
    public final void mo3664a(EnumC0562g enumC0562g, InterfaceC2853ka.a<? super T> aVar) {
        try {
            T mo12154a = mo12154a(this.f13064b, this.f13065c);
            this.f13066d = mo12154a;
            aVar.mo3639a((InterfaceC2853ka.a<? super T>) mo12154a);
        } catch (FileNotFoundException e) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.mo3638a((Exception) e);
        }
    }

    /* renamed from: a */
    protected abstract void mo12155a(T t);

    @Override // p000.InterfaceC2853ka
    /* renamed from: b */
    public void mo3665b() {
        T t = this.f13066d;
        if (t != null) {
            try {
                mo12155a(t);
            } catch (IOException unused) {
            }
        }
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
