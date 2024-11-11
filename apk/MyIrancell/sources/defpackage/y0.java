package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import defpackage.j1;
import defpackage.m0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c<j1.f> {
        a(y0 y0Var) {
        }

        @Override // y0.c
        public int a(j1.f fVar) {
            return fVar.d();
        }

        @Override // y0.c
        public boolean b(j1.f fVar) {
            return fVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements c<m0.c> {
        b(y0 y0Var) {
        }

        @Override // y0.c
        public int a(m0.c cVar) {
            return cVar.e();
        }

        @Override // y0.c
        public boolean b(m0.c cVar) {
            return cVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    private static <T> T a(T[] tArr, int i, c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.a(t2) - i2) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    private m0.c a(m0.b bVar, int i) {
        return (m0.c) a(bVar.a(), i, new b(this));
    }

    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        File a2 = z0.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (z0.a(a2, resources, i)) {
                return Typeface.createFromFile(a2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, j1.f[] fVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(a(fVarArr, i).c());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface a2 = a(context, inputStream);
            z0.a(inputStream);
            return a2;
        } catch (IOException unused2) {
            z0.a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            z0.a(inputStream2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Typeface a(Context context, InputStream inputStream) {
        File a2 = z0.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (z0.a(a2, inputStream)) {
                return Typeface.createFromFile(a2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }

    public Typeface a(Context context, m0.b bVar, Resources resources, int i) {
        m0.c a2 = a(bVar, i);
        if (a2 == null) {
            return null;
        }
        return t0.a(context, resources, a2.b(), a2.a(), i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j1.f a(j1.f[] fVarArr, int i) {
        return (j1.f) a(fVarArr, i, new a(this));
    }
}
