package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import p000.C2796j1;
import p000.C2917m0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y0 */
/* loaded from: classes.dex */
public class C3458y0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0$a */
    /* loaded from: classes.dex */
    public class a implements c<C2796j1.f> {
        a(C3458y0 c3458y0) {
        }

        @Override // p000.C3458y0.c
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public int mo16534a(C2796j1.f fVar) {
            return fVar.m13310d();
        }

        @Override // p000.C3458y0.c
        /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public boolean mo16535b(C2796j1.f fVar) {
            return fVar.m13311e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0$b */
    /* loaded from: classes.dex */
    public class b implements c<C2917m0.c> {
        b(C3458y0 c3458y0) {
        }

        @Override // p000.C3458y0.c
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public int mo16534a(C2917m0.c cVar) {
            return cVar.m13972e();
        }

        @Override // p000.C3458y0.c
        /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public boolean mo16535b(C2917m0.c cVar) {
            return cVar.m13973f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0$c */
    /* loaded from: classes.dex */
    public interface c<T> {
        /* renamed from: a */
        int mo16534a(T t);

        /* renamed from: b */
        boolean mo16535b(T t);
    }

    /* renamed from: a */
    private static <T> T m16530a(T[] tArr, int i, c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo16534a(t2) - i2) * 2) + (cVar.mo16535b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: a */
    private C2917m0.c m16531a(C2917m0.b bVar, int i) {
        return (C2917m0.c) m16530a(bVar.m13967a(), i, new b(this));
    }

    /* renamed from: a */
    public Typeface mo16089a(Context context, Resources resources, int i, String str, int i2) {
        File m16689a = C3507z0.m16689a(context);
        if (m16689a == null) {
            return null;
        }
        try {
            if (C3507z0.m16694a(m16689a, resources, i)) {
                return Typeface.createFromFile(m16689a.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m16689a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo15700a(Context context, CancellationSignal cancellationSignal, C2796j1.f[] fVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(m16533a(fVarArr, i).m13309c());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface m16532a = m16532a(context, inputStream);
            C3507z0.m16693a(inputStream);
            return m16532a;
        } catch (IOException unused2) {
            C3507z0.m16693a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            C3507z0.m16693a(inputStream2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface m16532a(Context context, InputStream inputStream) {
        File m16689a = C3507z0.m16689a(context);
        if (m16689a == null) {
            return null;
        }
        try {
            if (C3507z0.m16695a(m16689a, inputStream)) {
                return Typeface.createFromFile(m16689a.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m16689a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo15890a(Context context, C2917m0.b bVar, Resources resources, int i) {
        C2917m0.c m16531a = m16531a(bVar, i);
        if (m16531a == null) {
            return null;
        }
        return C3230t0.m15471a(context, resources, m16531a.m13969b(), m16531a.m13968a(), i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C2796j1.f m16533a(C2796j1.f[] fVarArr, int i) {
        return (C2796j1.f) m16530a(fVarArr, i, new a(this));
    }
}
