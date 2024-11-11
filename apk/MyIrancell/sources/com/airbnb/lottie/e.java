package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import defpackage.f6;
import defpackage.k9;
import defpackage.r8;
import defpackage.u9;
import defpackage.x7;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.Okio;

/* loaded from: classes.dex */
public class e {
    private static final Map<String, m<com.airbnb.lottie.d>> a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements h<com.airbnb.lottie.d> {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.h
        public void a(com.airbnb.lottie.d dVar) {
            e.a.remove(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements h<Throwable> {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.h
        public void a(Throwable th) {
            e.a.remove(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Callable<l<com.airbnb.lottie.d>> {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        c(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public l<com.airbnb.lottie.d> call() {
            return x7.a(this.a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Callable<l<com.airbnb.lottie.d>> {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        d(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public l<com.airbnb.lottie.d> call() {
            return e.b(this.a, this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0026e implements Callable<l<com.airbnb.lottie.d>> {
        final /* synthetic */ WeakReference a;
        final /* synthetic */ Context b;
        final /* synthetic */ int c;

        CallableC0026e(WeakReference weakReference, Context context, int i) {
            this.a = weakReference;
            this.b = context;
            this.c = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public l<com.airbnb.lottie.d> call() {
            Context context = (Context) this.a.get();
            if (context == null) {
                context = this.b;
            }
            return e.b(context, this.c);
        }
    }

    /* loaded from: classes.dex */
    class f implements Callable<l<com.airbnb.lottie.d>> {
        final /* synthetic */ InputStream a;
        final /* synthetic */ String b;

        f(InputStream inputStream, String str) {
            this.a = inputStream;
            this.b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public l<com.airbnb.lottie.d> call() {
            return e.b(this.a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Callable<l<com.airbnb.lottie.d>> {
        final /* synthetic */ com.airbnb.lottie.d a;

        g(com.airbnb.lottie.d dVar) {
            this.a = dVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public l<com.airbnb.lottie.d> call() {
            return new l<>(this.a);
        }
    }

    private static com.airbnb.lottie.g a(com.airbnb.lottie.d dVar, String str) {
        for (com.airbnb.lottie.g gVar : dVar.h().values()) {
            if (gVar.b().equals(str)) {
                return gVar;
            }
        }
        return null;
    }

    private static l<com.airbnb.lottie.d> a(InputStream inputStream, String str, boolean z) {
        try {
            return a(k9.a(Okio.buffer(Okio.source(inputStream))), str);
        } finally {
            if (z) {
                u9.a(inputStream);
            }
        }
    }

    public static l<com.airbnb.lottie.d> a(ZipInputStream zipInputStream, String str) {
        try {
            return b(zipInputStream, str);
        } finally {
            u9.a(zipInputStream);
        }
    }

    public static l<com.airbnb.lottie.d> a(k9 k9Var, String str) {
        return a(k9Var, str, true);
    }

    private static l<com.airbnb.lottie.d> a(k9 k9Var, String str, boolean z) {
        try {
            try {
                com.airbnb.lottie.d a2 = r8.a(k9Var);
                if (str != null) {
                    f6.a().a(str, a2);
                }
                l<com.airbnb.lottie.d> lVar = new l<>(a2);
                if (z) {
                    u9.a(k9Var);
                }
                return lVar;
            } catch (Exception e) {
                l<com.airbnb.lottie.d> lVar2 = new l<>(e);
                if (z) {
                    u9.a(k9Var);
                }
                return lVar2;
            }
        } catch (Throwable th) {
            if (z) {
                u9.a(k9Var);
            }
            throw th;
        }
    }

    public static m<com.airbnb.lottie.d> a(Context context, int i) {
        return a(context, i, c(context, i));
    }

    public static m<com.airbnb.lottie.d> a(Context context, int i, String str) {
        return a(str, new CallableC0026e(new WeakReference(context), context.getApplicationContext(), i));
    }

    public static m<com.airbnb.lottie.d> a(Context context, String str) {
        return a(context, str, "asset_" + str);
    }

    public static m<com.airbnb.lottie.d> a(Context context, String str, String str2) {
        return a(str2, new d(context.getApplicationContext(), str, str2));
    }

    public static m<com.airbnb.lottie.d> a(InputStream inputStream, String str) {
        return a(str, new f(inputStream, str));
    }

    private static m<com.airbnb.lottie.d> a(String str, Callable<l<com.airbnb.lottie.d>> callable) {
        com.airbnb.lottie.d a2 = str == null ? null : f6.a().a(str);
        if (a2 != null) {
            return new m<>(new g(a2));
        }
        if (str != null && a.containsKey(str)) {
            return a.get(str);
        }
        m<com.airbnb.lottie.d> mVar = new m<>(callable);
        if (str != null) {
            mVar.b(new a(str));
            mVar.a(new b(str));
            a.put(str, mVar);
        }
        return mVar;
    }

    private static boolean a(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static l<com.airbnb.lottie.d> b(Context context, int i) {
        return b(context, i, c(context, i));
    }

    public static l<com.airbnb.lottie.d> b(Context context, int i, String str) {
        try {
            return b(context.getResources().openRawResource(i), str);
        } catch (Resources.NotFoundException e) {
            return new l<>((Throwable) e);
        }
    }

    public static l<com.airbnb.lottie.d> b(Context context, String str, String str2) {
        try {
            return str.endsWith(".zip") ? a(new ZipInputStream(context.getAssets().open(str)), str2) : b(context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new l<>((Throwable) e);
        }
    }

    public static l<com.airbnb.lottie.d> b(InputStream inputStream, String str) {
        return a(inputStream, str, true);
    }

    private static l<com.airbnb.lottie.d> b(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            com.airbnb.lottie.d dVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (!name.contains("__MACOSX")) {
                    if (nextEntry.getName().contains(".json")) {
                        dVar = a(k9.a(Okio.buffer(Okio.source(zipInputStream))), (String) null, false).b();
                    } else if (name.contains(".png") || name.contains(".webp")) {
                        hashMap.put(name.split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (dVar == null) {
                return new l<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                com.airbnb.lottie.g a2 = a(dVar, (String) entry.getKey());
                if (a2 != null) {
                    a2.a(u9.a((Bitmap) entry.getValue(), a2.e(), a2.c()));
                }
            }
            for (Map.Entry<String, com.airbnb.lottie.g> entry2 : dVar.h().entrySet()) {
                if (entry2.getValue().a() == null) {
                    return new l<>((Throwable) new IllegalStateException("There is no image for " + entry2.getValue().b()));
                }
            }
            if (str != null) {
                f6.a().a(str, dVar);
            }
            return new l<>(dVar);
        } catch (IOException e) {
            return new l<>((Throwable) e);
        }
    }

    public static m<com.airbnb.lottie.d> b(Context context, String str) {
        return c(context, str, "url_" + str);
    }

    public static m<com.airbnb.lottie.d> c(Context context, String str, String str2) {
        return a(str2, new c(context, str));
    }

    private static String c(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(a(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }
}
