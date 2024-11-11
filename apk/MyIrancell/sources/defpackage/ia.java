package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.a;
import defpackage.ka;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class ia<T> implements ka<T> {
    private final String b;
    private final AssetManager c;
    private T d;

    public ia(AssetManager assetManager, String str) {
        this.c = assetManager;
        this.b = str;
    }

    protected abstract T a(AssetManager assetManager, String str);

    @Override // defpackage.ka
    public void a(g gVar, ka.a<? super T> aVar) {
        try {
            T a = a(this.c, this.b);
            this.d = a;
            aVar.a((ka.a<? super T>) a);
        } catch (IOException e) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.a((Exception) e);
        }
    }

    protected abstract void a(T t);

    @Override // defpackage.ka
    public void b() {
        T t = this.d;
        if (t == null) {
            return;
        }
        try {
            a(t);
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.ka
    public a c() {
        return a.LOCAL;
    }

    @Override // defpackage.ka
    public void cancel() {
    }
}
