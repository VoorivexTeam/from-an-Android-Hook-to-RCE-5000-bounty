package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.a;
import defpackage.ka;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class sa<T> implements ka<T> {
    private final Uri b;
    private final ContentResolver c;
    private T d;

    public sa(ContentResolver contentResolver, Uri uri) {
        this.c = contentResolver;
        this.b = uri;
    }

    protected abstract T a(Uri uri, ContentResolver contentResolver);

    @Override // defpackage.ka
    public final void a(g gVar, ka.a<? super T> aVar) {
        try {
            T a = a(this.b, this.c);
            this.d = a;
            aVar.a((ka.a<? super T>) a);
        } catch (FileNotFoundException e) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.a((Exception) e);
        }
    }

    protected abstract void a(T t);

    @Override // defpackage.ka
    public void b() {
        T t = this.d;
        if (t != null) {
            try {
                a(t);
            } catch (IOException unused) {
            }
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
