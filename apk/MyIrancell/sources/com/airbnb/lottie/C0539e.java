package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.Okio;
import p000.AbstractC2852k9;
import p000.C2460f6;
import p000.C3157r8;
import p000.C3295u9;
import p000.C3427x7;

/* renamed from: com.airbnb.lottie.e */
/* loaded from: classes.dex */
public class C0539e {

    /* renamed from: a */
    private static final Map<String, C0547m<C0538d>> f3082a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.e$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0542h<C0538d> {

        /* renamed from: a */
        final /* synthetic */ String f3083a;

        a(String str) {
            this.f3083a = str;
        }

        @Override // com.airbnb.lottie.InterfaceC0542h
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo3717a(C0538d c0538d) {
            C0539e.f3082a.remove(this.f3083a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.e$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0542h<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f3084a;

        b(String str) {
            this.f3084a = str;
        }

        @Override // com.airbnb.lottie.InterfaceC0542h
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo3717a(Throwable th) {
            C0539e.f3082a.remove(this.f3084a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.e$c */
    /* loaded from: classes.dex */
    public class c implements Callable<C0546l<C0538d>> {

        /* renamed from: a */
        final /* synthetic */ Context f3085a;

        /* renamed from: b */
        final /* synthetic */ String f3086b;

        c(Context context, String str) {
            this.f3085a = context;
            this.f3086b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public C0546l<C0538d> call() {
            return C3427x7.m16452a(this.f3085a, this.f3086b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.e$d */
    /* loaded from: classes.dex */
    public class d implements Callable<C0546l<C0538d>> {

        /* renamed from: a */
        final /* synthetic */ Context f3087a;

        /* renamed from: b */
        final /* synthetic */ String f3088b;

        /* renamed from: c */
        final /* synthetic */ String f3089c;

        d(Context context, String str, String str2) {
            this.f3087a = context;
            this.f3088b = str;
            this.f3089c = str2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public C0546l<C0538d> call() {
            return C0539e.m3759b(this.f3087a, this.f3088b, this.f3089c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.e$e */
    /* loaded from: classes.dex */
    public class e implements Callable<C0546l<C0538d>> {

        /* renamed from: a */
        final /* synthetic */ WeakReference f3090a;

        /* renamed from: b */
        final /* synthetic */ Context f3091b;

        /* renamed from: c */
        final /* synthetic */ int f3092c;

        e(WeakReference weakReference, Context context, int i) {
            this.f3090a = weakReference;
            this.f3091b = context;
            this.f3092c = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public C0546l<C0538d> call() {
            Context context = (Context) this.f3090a.get();
            if (context == null) {
                context = this.f3091b;
            }
            return C0539e.m3757b(context, this.f3092c);
        }
    }

    /* renamed from: com.airbnb.lottie.e$f */
    /* loaded from: classes.dex */
    class f implements Callable<C0546l<C0538d>> {

        /* renamed from: a */
        final /* synthetic */ InputStream f3093a;

        /* renamed from: b */
        final /* synthetic */ String f3094b;

        f(InputStream inputStream, String str) {
            this.f3093a = inputStream;
            this.f3094b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public C0546l<C0538d> call() {
            return C0539e.m3760b(this.f3093a, this.f3094b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.e$g */
    /* loaded from: classes.dex */
    public class g implements Callable<C0546l<C0538d>> {

        /* renamed from: a */
        final /* synthetic */ C0538d f3095a;

        g(C0538d c0538d) {
            this.f3095a = c0538d;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public C0546l<C0538d> call() {
            return new C0546l<>(this.f3095a);
        }
    }

    /* renamed from: a */
    private static C0541g m3744a(C0538d c0538d, String str) {
        for (C0541g c0541g : c0538d.m3738h().values()) {
            if (c0541g.m3830b().equals(str)) {
                return c0541g;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C0546l<C0538d> m3745a(InputStream inputStream, String str, boolean z) {
        try {
            return m3747a(AbstractC2852k9.m13631a(Okio.buffer(Okio.source(inputStream))), str);
        } finally {
            if (z) {
                C3295u9.m15763a(inputStream);
            }
        }
    }

    /* renamed from: a */
    public static C0546l<C0538d> m3746a(ZipInputStream zipInputStream, String str) {
        try {
            return m3761b(zipInputStream, str);
        } finally {
            C3295u9.m15763a(zipInputStream);
        }
    }

    /* renamed from: a */
    public static C0546l<C0538d> m3747a(AbstractC2852k9 abstractC2852k9, String str) {
        return m3748a(abstractC2852k9, str, true);
    }

    /* renamed from: a */
    private static C0546l<C0538d> m3748a(AbstractC2852k9 abstractC2852k9, String str, boolean z) {
        try {
            try {
                C0538d m15223a = C3157r8.m15223a(abstractC2852k9);
                if (str != null) {
                    C2460f6.m11689a().m11691a(str, m15223a);
                }
                C0546l<C0538d> c0546l = new C0546l<>(m15223a);
                if (z) {
                    C3295u9.m15763a(abstractC2852k9);
                }
                return c0546l;
            } catch (Exception e2) {
                C0546l<C0538d> c0546l2 = new C0546l<>(e2);
                if (z) {
                    C3295u9.m15763a(abstractC2852k9);
                }
                return c0546l2;
            }
        } catch (Throwable th) {
            if (z) {
                C3295u9.m15763a(abstractC2852k9);
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static C0547m<C0538d> m3749a(Context context, int i) {
        return m3750a(context, i, m3764c(context, i));
    }

    /* renamed from: a */
    public static C0547m<C0538d> m3750a(Context context, int i, String str) {
        return m3754a(str, new e(new WeakReference(context), context.getApplicationContext(), i));
    }

    /* renamed from: a */
    public static C0547m<C0538d> m3751a(Context context, String str) {
        return m3752a(context, str, "asset_" + str);
    }

    /* renamed from: a */
    public static C0547m<C0538d> m3752a(Context context, String str, String str2) {
        return m3754a(str2, new d(context.getApplicationContext(), str, str2));
    }

    /* renamed from: a */
    public static C0547m<C0538d> m3753a(InputStream inputStream, String str) {
        return m3754a(str, new f(inputStream, str));
    }

    /* renamed from: a */
    private static C0547m<C0538d> m3754a(String str, Callable<C0546l<C0538d>> callable) {
        C0538d m11690a = str == null ? null : C2460f6.m11689a().m11690a(str);
        if (m11690a != null) {
            return new C0547m<>(new g(m11690a));
        }
        if (str != null && f3082a.containsKey(str)) {
            return f3082a.get(str);
        }
        C0547m<C0538d> c0547m = new C0547m<>(callable);
        if (str != null) {
            c0547m.m3850b(new a(str));
            c0547m.m3849a(new b(str));
            f3082a.put(str, c0547m);
        }
        return c0547m;
    }

    /* renamed from: a */
    private static boolean m3756a(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: b */
    public static C0546l<C0538d> m3757b(Context context, int i) {
        return m3758b(context, i, m3764c(context, i));
    }

    /* renamed from: b */
    public static C0546l<C0538d> m3758b(Context context, int i, String str) {
        try {
            return m3760b(context.getResources().openRawResource(i), str);
        } catch (Resources.NotFoundException e2) {
            return new C0546l<>((Throwable) e2);
        }
    }

    /* renamed from: b */
    public static C0546l<C0538d> m3759b(Context context, String str, String str2) {
        try {
            return str.endsWith(".zip") ? m3746a(new ZipInputStream(context.getAssets().open(str)), str2) : m3760b(context.getAssets().open(str), str2);
        } catch (IOException e2) {
            return new C0546l<>((Throwable) e2);
        }
    }

    /* renamed from: b */
    public static C0546l<C0538d> m3760b(InputStream inputStream, String str) {
        return m3745a(inputStream, str, true);
    }

    /* renamed from: b */
    private static C0546l<C0538d> m3761b(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C0538d c0538d = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (!name.contains("__MACOSX")) {
                    if (nextEntry.getName().contains(".json")) {
                        c0538d = m3748a(AbstractC2852k9.m13631a(Okio.buffer(Okio.source(zipInputStream))), (String) null, false).m3840b();
                    } else if (name.contains(".png") || name.contains(".webp")) {
                        hashMap.put(name.split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (c0538d == null) {
                return new C0546l<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C0541g m3744a = m3744a(c0538d, (String) entry.getKey());
                if (m3744a != null) {
                    m3744a.m3829a(C3295u9.m15757a((Bitmap) entry.getValue(), m3744a.m3833e(), m3744a.m3831c()));
                }
            }
            for (Map.Entry<String, C0541g> entry2 : c0538d.m3738h().entrySet()) {
                if (entry2.getValue().m3828a() == null) {
                    return new C0546l<>((Throwable) new IllegalStateException("There is no image for " + entry2.getValue().m3830b()));
                }
            }
            if (str != null) {
                C2460f6.m11689a().m11691a(str, c0538d);
            }
            return new C0546l<>(c0538d);
        } catch (IOException e2) {
            return new C0546l<>((Throwable) e2);
        }
    }

    /* renamed from: b */
    public static C0547m<C0538d> m3762b(Context context, String str) {
        return m3763c(context, str, "url_" + str);
    }

    /* renamed from: c */
    public static C0547m<C0538d> m3763c(Context context, String str, String str2) {
        return m3754a(str2, new c(context, str));
    }

    /* renamed from: c */
    private static String m3764c(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(m3756a(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }
}
