package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p000.C2836k1;
import p000.C3066p0;

/* renamed from: j1 */
/* loaded from: classes.dex */
public class C2796j1 {

    /* renamed from: a */
    static final C2493g0<String, Typeface> f11391a = new C2493g0<>(16);

    /* renamed from: b */
    private static final C2836k1 f11392b = new C2836k1("fonts", 10, 10000);

    /* renamed from: c */
    static final Object f11393c = new Object();

    /* renamed from: d */
    static final C2573i0<String, ArrayList<C2836k1.d<g>>> f11394d = new C2573i0<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f11395e = new d();

    /* renamed from: j1$a */
    /* loaded from: classes.dex */
    static class a implements Callable<g> {

        /* renamed from: a */
        final /* synthetic */ Context f11396a;

        /* renamed from: b */
        final /* synthetic */ C2574i1 f11397b;

        /* renamed from: c */
        final /* synthetic */ int f11398c;

        /* renamed from: d */
        final /* synthetic */ String f11399d;

        a(Context context, C2574i1 c2574i1, int i, String str) {
            this.f11396a = context;
            this.f11397b = c2574i1;
            this.f11398c = i;
            this.f11399d = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public g call() {
            g m13297a = C2796j1.m13297a(this.f11396a, this.f11397b, this.f11398c);
            Typeface typeface = m13297a.f11410a;
            if (typeface != null) {
                C2796j1.f11391a.m11858a(this.f11399d, typeface);
            }
            return m13297a;
        }
    }

    /* renamed from: j1$b */
    /* loaded from: classes.dex */
    static class b implements C2836k1.d<g> {

        /* renamed from: a */
        final /* synthetic */ C3066p0.a f11400a;

        /* renamed from: b */
        final /* synthetic */ Handler f11401b;

        b(C3066p0.a aVar, Handler handler) {
            this.f11400a = aVar;
            this.f11401b = handler;
        }

        @Override // p000.C2836k1.d
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo13303a(g gVar) {
            int i;
            C3066p0.a aVar;
            if (gVar == null) {
                aVar = this.f11400a;
                i = 1;
            } else {
                i = gVar.f11411b;
                if (i == 0) {
                    this.f11400a.m14679a(gVar.f11410a, this.f11401b);
                    return;
                }
                aVar = this.f11400a;
            }
            aVar.m14678a(i, this.f11401b);
        }
    }

    /* renamed from: j1$c */
    /* loaded from: classes.dex */
    static class c implements C2836k1.d<g> {

        /* renamed from: a */
        final /* synthetic */ String f11402a;

        c(String str) {
            this.f11402a = str;
        }

        @Override // p000.C2836k1.d
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo13303a(g gVar) {
            synchronized (C2796j1.f11393c) {
                ArrayList<C2836k1.d<g>> arrayList = C2796j1.f11394d.get(this.f11402a);
                if (arrayList == null) {
                    return;
                }
                C2796j1.f11394d.remove(this.f11402a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).mo13303a(gVar);
                }
            }
        }
    }

    /* renamed from: j1$d */
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

    /* renamed from: j1$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        private final int f11403a;

        /* renamed from: b */
        private final f[] f11404b;

        public e(int i, f[] fVarArr) {
            this.f11403a = i;
            this.f11404b = fVarArr;
        }

        /* renamed from: a */
        public f[] m13305a() {
            return this.f11404b;
        }

        /* renamed from: b */
        public int m13306b() {
            return this.f11403a;
        }
    }

    /* renamed from: j1$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        private final Uri f11405a;

        /* renamed from: b */
        private final int f11406b;

        /* renamed from: c */
        private final int f11407c;

        /* renamed from: d */
        private final boolean f11408d;

        /* renamed from: e */
        private final int f11409e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            C3419x1.m16410a(uri);
            this.f11405a = uri;
            this.f11406b = i;
            this.f11407c = i2;
            this.f11408d = z;
            this.f11409e = i3;
        }

        /* renamed from: a */
        public int m13307a() {
            return this.f11409e;
        }

        /* renamed from: b */
        public int m13308b() {
            return this.f11406b;
        }

        /* renamed from: c */
        public Uri m13309c() {
            return this.f11405a;
        }

        /* renamed from: d */
        public int m13310d() {
            return this.f11407c;
        }

        /* renamed from: e */
        public boolean m13311e() {
            return this.f11408d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1$g */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        final Typeface f11410a;

        /* renamed from: b */
        final int f11411b;

        g(Typeface typeface, int i) {
            this.f11410a = typeface;
            this.f11411b = i;
        }
    }

    /* renamed from: a */
    public static ProviderInfo m13294a(PackageManager packageManager, C2574i1 c2574i1, Resources resources) {
        String m12317d = c2574i1.m12317d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m12317d, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + m12317d);
        }
        if (!resolveContentProvider.packageName.equals(c2574i1.m12318e())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + m12317d + ", but package was not " + c2574i1.m12318e());
        }
        List<byte[]> m13299a = m13299a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
        Collections.sort(m13299a, f11395e);
        List<List<byte[]>> m13298a = m13298a(c2574i1, resources);
        for (int i = 0; i < m13298a.size(); i++) {
            ArrayList arrayList = new ArrayList(m13298a.get(i));
            Collections.sort(arrayList, f11395e);
            if (m13301a(m13299a, arrayList)) {
                return resolveContentProvider;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Typeface m13295a(Context context, C2574i1 c2574i1, C3066p0.a aVar, Handler handler, boolean z, int i, int i2) {
        String str = c2574i1.m12316c() + "-" + i2;
        Typeface m11861b = f11391a.m11861b(str);
        if (m11861b != null) {
            if (aVar != null) {
                aVar.mo1199a(m11861b);
            }
            return m11861b;
        }
        if (z && i == -1) {
            g m13297a = m13297a(context, c2574i1, i2);
            if (aVar != null) {
                int i3 = m13297a.f11411b;
                if (i3 == 0) {
                    aVar.m14679a(m13297a.f11410a, handler);
                } else {
                    aVar.m14678a(i3, handler);
                }
            }
            return m13297a.f11410a;
        }
        a aVar2 = new a(context, c2574i1, i2, str);
        if (z) {
            try {
                return ((g) f11392b.m13533a(aVar2, i)).f11410a;
            } catch (InterruptedException unused) {
                return null;
            }
        }
        b bVar = aVar == null ? null : new b(aVar, handler);
        synchronized (f11393c) {
            if (f11394d.containsKey(str)) {
                if (bVar != null) {
                    f11394d.get(str).add(bVar);
                }
                return null;
            }
            if (bVar != null) {
                ArrayList<C2836k1.d<g>> arrayList = new ArrayList<>();
                arrayList.add(bVar);
                f11394d.put(str, arrayList);
            }
            f11392b.m13536a(aVar2, new c(str));
            return null;
        }
    }

    /* renamed from: a */
    public static e m13296a(Context context, CancellationSignal cancellationSignal, C2574i1 c2574i1) {
        ProviderInfo m13294a = m13294a(context.getPackageManager(), c2574i1, context.getResources());
        return m13294a == null ? new e(1, null) : new e(0, m13302a(context, c2574i1, m13294a.authority, cancellationSignal));
    }

    /* renamed from: a */
    static g m13297a(Context context, C2574i1 c2574i1, int i) {
        try {
            e m13296a = m13296a(context, (CancellationSignal) null, c2574i1);
            if (m13296a.m13306b() != 0) {
                return new g(null, m13296a.m13306b() == 1 ? -2 : -3);
            }
            Typeface m15472a = C3230t0.m15472a(context, null, m13296a.m13305a(), i);
            return new g(m15472a, m15472a != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    /* renamed from: a */
    private static List<List<byte[]>> m13298a(C2574i1 c2574i1, Resources resources) {
        return c2574i1.m12314a() != null ? c2574i1.m12314a() : C2917m0.m13960a(resources, c2574i1.m12315b());
    }

    /* renamed from: a */
    private static List<byte[]> m13299a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m13300a(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.m13307a() == 0) {
                Uri m13309c = fVar.m13309c();
                if (!hashMap.containsKey(m13309c)) {
                    hashMap.put(m13309c, C3507z0.m16691a(context, cancellationSignal, m13309c));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static boolean m13301a(List<byte[]> list, List<byte[]> list2) {
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static p000.C2796j1.f[] m13302a(android.content.Context r23, p000.C2574i1 r24, java.lang.String r25, android.os.CancellationSignal r26) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2796j1.m13302a(android.content.Context, i1, java.lang.String, android.os.CancellationSignal):j1$f[]");
    }
}
