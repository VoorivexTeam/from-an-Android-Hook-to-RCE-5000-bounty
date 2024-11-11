package p000;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.EnumC0562g;
import com.bumptech.glide.load.EnumC0567a;
import java.io.IOException;
import p000.InterfaceC2853ka;

/* renamed from: ia */
/* loaded from: classes.dex */
public abstract class AbstractC2585ia<T> implements InterfaceC2853ka<T> {

    /* renamed from: b */
    private final String f10605b;

    /* renamed from: c */
    private final AssetManager f10606c;

    /* renamed from: d */
    private T f10607d;

    public AbstractC2585ia(AssetManager assetManager, String str) {
        this.f10606c = assetManager;
        this.f10605b = str;
    }

    /* renamed from: a */
    protected abstract T mo12419a(AssetManager assetManager, String str);

    @Override // p000.InterfaceC2853ka
    /* renamed from: a */
    public void mo3664a(EnumC0562g enumC0562g, InterfaceC2853ka.a<? super T> aVar) {
        try {
            T mo12419a = mo12419a(this.f10606c, this.f10605b);
            this.f10607d = mo12419a;
            aVar.mo3639a((InterfaceC2853ka.a<? super T>) mo12419a);
        } catch (IOException e) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.mo3638a((Exception) e);
        }
    }

    /* renamed from: a */
    protected abstract void mo12420a(T t);

    @Override // p000.InterfaceC2853ka
    /* renamed from: b */
    public void mo3665b() {
        T t = this.f10607d;
        if (t == null) {
            return;
        }
        try {
            mo12420a(t);
        } catch (IOException unused) {
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
