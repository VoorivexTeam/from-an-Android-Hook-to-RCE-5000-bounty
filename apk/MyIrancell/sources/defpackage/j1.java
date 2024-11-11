package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import defpackage.k1;
import defpackage.p0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class j1 {
    static final g0<String, Typeface> a = new g0<>(16);
    private static final k1 b = new k1("fonts", 10, 10000);
    static final Object c = new Object();
    static final i0<String, ArrayList<k1.d<g>>> d = new i0<>();
    private static final Comparator<byte[]> e = new d();

    /* loaded from: classes.dex */
    static class a implements Callable<g> {
        final /* synthetic */ Context a;
        final /* synthetic */ i1 b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;

        a(Context context, i1 i1Var, int i, String str) {
            this.a = context;
            this.b = i1Var;
            this.c = i;
            this.d = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public g call() {
            g a = j1.a(this.a, this.b, this.c);
            Typeface typeface = a.a;
            if (typeface != null) {
                j1.a.a(this.d, typeface);
            }
            return a;
        }
    }

    /* loaded from: classes.dex */
    static class b implements k1.d<g> {
        final /* synthetic */ p0.a a;
        final /* synthetic */ Handler b;

        b(p0.a aVar, Handler handler) {
            this.a = aVar;
            this.b = handler;
        }

        @Override // k1.d
        public void a(g gVar) {
            int i;
            p0.a aVar;
            if (gVar == null) {
                aVar = this.a;
                i = 1;
            } else {
                i = gVar.b;
                if (i == 0) {
                    this.a.a(gVar.a, this.b);
                    return;
                }
                aVar = this.a;
            }
            aVar.a(i, this.b);
        }
    }

    /* loaded from: classes.dex */
    static class c implements k1.d<g> {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        @Override // k1.d
        public void a(g gVar) {
            synchronized (j1.c) {
                ArrayList<k1.d<g>> arrayList = j1.d.get(this.a);
                if (arrayList == null) {
                    return;
                }
                j1.d.remove(this.a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).a(gVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static class d implements Comparator<byte[]> {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length == bArr2.length) {
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        i = bArr[i3];
                        i2 = bArr2[i3];
                    }
                }
                return 0;
            }
            i = bArr.length;
            i2 = bArr2.length;
            return i - i2;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        private final int a;
        private final f[] b;

        public e(int i, f[] fVarArr) {
            this.a = i;
            this.b = fVarArr;
        }

        public f[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        private final Uri a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            x1.a(uri);
            this.a = uri;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }

        public int a() {
            return this.e;
        }

        public int b() {
            return this.b;
        }

        public Uri c() {
            return this.a;
        }

        public int d() {
            return this.c;
        }

        public boolean e() {
            return this.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g {
        final Typeface a;
        final int b;

        g(Typeface typeface, int i) {
            this.a = typeface;
            this.b = i;
        }
    }

    public static ProviderInfo a(PackageManager packageManager, i1 i1Var, Resources resources) {
        String d2 = i1Var.d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d2, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + d2);
        }
        if (!resolveContentProvider.packageName.equals(i1Var.e())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + d2 + ", but package was not " + i1Var.e());
        }
        List<byte[]> a2 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
        Collections.sort(a2, e);
        List<List<byte[]>> a3 = a(i1Var, resources);
        for (int i = 0; i < a3.size(); i++) {
            ArrayList arrayList = new ArrayList(a3.get(i));
            Collections.sort(arrayList, e);
            if (a(a2, arrayList)) {
                return resolveContentProvider;
            }
        }
        return null;
    }

    public static Typeface a(Context context, i1 i1Var, p0.a aVar, Handler handler, boolean z, int i, int i2) {
        String str = i1Var.c() + "-" + i2;
        Typeface b2 = a.b(str);
        if (b2 != null) {
            if (aVar != null) {
                aVar.a(b2);
            }
            return b2;
        }
        if (z && i == -1) {
            g a2 = a(context, i1Var, i2);
            if (aVar != null) {
                int i3 = a2.b;
                if (i3 == 0) {
                    aVar.a(a2.a, handler);
                } else {
                    aVar.a(i3, handler);
                }
            }
            return a2.a;
        }
        a aVar2 = new a(context, i1Var, i2, str);
        if (z) {
            try {
                return ((g) b.a(aVar2, i)).a;
            } catch (InterruptedException unused) {
                return null;
            }
        }
        b bVar = aVar == null ? null : new b(aVar, handler);
        synchronized (c) {
            if (d.containsKey(str)) {
                if (bVar != null) {
                    d.get(str).add(bVar);
                }
                return null;
            }
            if (bVar != null) {
                ArrayList<k1.d<g>> arrayList = new ArrayList<>();
                arrayList.add(bVar);
                d.put(str, arrayList);
            }
            b.a(aVar2, new c(str));
            return null;
        }
    }

    public static e a(Context context, CancellationSignal cancellationSignal, i1 i1Var) {
        ProviderInfo a2 = a(context.getPackageManager(), i1Var, context.getResources());
        return a2 == null ? new e(1, null) : new e(0, a(context, i1Var, a2.authority, cancellationSignal));
    }

    static g a(Context context, i1 i1Var, int i) {
        try {
            e a2 = a(context, (CancellationSignal) null, i1Var);
            if (a2.b() != 0) {
                return new g(null, a2.b() == 1 ? -2 : -3);
            }
            Typeface a3 = t0.a(context, null, a2.a(), i);
            return new g(a3, a3 != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    private static List<List<byte[]>> a(i1 i1Var, Resources resources) {
        return i1Var.a() != null ? i1Var.a() : m0.a(resources, i1Var.b());
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static Map<Uri, ByteBuffer> a(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.a() == 0) {
                Uri c2 = fVar.c();
                if (!hashMap.containsKey(c2)) {
                    hashMap.put(c2, z0.a(context, cancellationSignal, c2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private static boolean a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static j1.f[] a(android.content.Context r23, defpackage.i1 r24, java.lang.String r25, android.os.CancellationSignal r26) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j1.a(android.content.Context, i1, java.lang.String, android.os.CancellationSignal):j1$f[]");
    }
}
