package ir.tapsell.sdk.networkcacheutils;

import android.content.Context;
import ir.tapsell.sdk.networkcacheutils.C2751e;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import p000.g50;

/* renamed from: ir.tapsell.sdk.networkcacheutils.g */
/* loaded from: classes.dex */
public class C2753g {

    /* renamed from: c */
    private static final Semaphore f11237c = new Semaphore(1);

    /* renamed from: d */
    private static C2753g f11238d = null;

    /* renamed from: a */
    private C2747a f11239a = new C2747a();

    /* renamed from: b */
    private ExecutorService f11240b = Executors.newFixedThreadPool(4);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.networkcacheutils.g$a */
    /* loaded from: classes.dex */
    public class a implements Callable<File> {

        /* renamed from: a */
        final /* synthetic */ String f11241a;

        /* renamed from: b */
        final /* synthetic */ File f11242b;

        /* renamed from: c */
        final /* synthetic */ b f11243c;

        /* renamed from: d */
        final /* synthetic */ File f11244d;

        /* renamed from: e */
        final /* synthetic */ int f11245e;

        /* renamed from: f */
        final /* synthetic */ File f11246f;

        a(String str, File file, b bVar, File file2, int i, File file3) {
            this.f11241a = str;
            this.f11242b = file;
            this.f11243c = bVar;
            this.f11244d = file2;
            this.f11245e = i;
            this.f11246f = file3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:103:0x013e, code lost:
        
            r7.flush();
            r7.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x005d, code lost:
        
            if (r5 == null) goto L138;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x005f, code lost:
        
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0063, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0065, code lost:
        
            p000.g50.m11895a(r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:119:0x017f A[Catch: all -> 0x0196, TryCatch #3 {all -> 0x0196, blocks: (B:8:0x0038, B:10:0x0053, B:101:0x006f, B:64:0x0065, B:12:0x007f, B:14:0x008f, B:15:0x00a7, B:17:0x00b3, B:19:0x00bf, B:21:0x00c7, B:23:0x00cb, B:25:0x00d5, B:27:0x00e0, B:33:0x0121, B:40:0x012f, B:44:0x00e9, B:46:0x00f4, B:49:0x010a, B:50:0x0102, B:51:0x0132, B:110:0x0155, B:112:0x015d, B:115:0x0168, B:116:0x016f, B:117:0x0170, B:119:0x017f, B:121:0x0183, B:122:0x018a, B:123:0x0193, B:127:0x0151, B:131:0x0146, B:59:0x005f, B:103:0x013e, B:36:0x0129, B:66:0x0069, B:106:0x014b), top: B:7:0x0038, inners: #0, #1, #7, #8, #9 }] */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.io.File call() {
            /*
                Method dump skipped, instructions count: 486
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.tapsell.sdk.networkcacheutils.C2753g.a.call():java.io.File");
        }
    }

    /* renamed from: ir.tapsell.sdk.networkcacheutils.g$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo12857a(String str);

        /* renamed from: a */
        void mo12858a(String str, File file);
    }

    private C2753g() {
    }

    /* renamed from: a */
    public static C2753g m13118a() {
        if (f11238d == null) {
            try {
                f11237c.acquire();
            } catch (InterruptedException e) {
                g50.m11895a(e);
            }
            if (f11238d == null) {
                f11238d = new C2753g();
            }
            f11237c.release();
        }
        return f11238d;
    }

    /* renamed from: a */
    private File m13119a(Context context, String str, String str2, File file, boolean z, int i, b bVar) {
        File file2 = null;
        if (context == null || str == null || str2 == null || file == null) {
            if (bVar != null) {
                bVar.mo12857a(str);
            }
            return null;
        }
        try {
            this.f11239a.m13087a(str);
        } catch (InterruptedException e) {
            g50.m11895a(e);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        File file3 = new File(file, str2);
        if (file3.exists() && !z) {
            this.f11239a.m13088b(str);
            if (bVar != null) {
                bVar.mo12858a(str, file3);
            }
            return file3;
        }
        File file4 = new File(file, "Temp" + str2);
        if (file4.isFile()) {
            file4.delete();
        }
        Future submit = this.f11240b.submit(new a(str, file4, bVar, file3, i, file));
        if (bVar == null) {
            this.f11239a.m13088b(str);
            try {
                file2 = (File) submit.get();
            } catch (InterruptedException | ExecutionException e2) {
                g50.m11895a(e2);
            }
            if (file2 != null && i != 0) {
                C2749c.m13093a(file, i);
            }
        }
        return file2;
    }

    /* renamed from: a */
    public static String m13120a(Context context, C2751e.a aVar, String str) {
        if (m13121b(context, aVar, str)) {
            return new File(aVar.m13104a(), str).getAbsolutePath();
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m13121b(Context context, C2751e.a aVar, String str) {
        if (context == null || str == null) {
            return false;
        }
        return new File(aVar.m13104a(), str).exists();
    }

    /* renamed from: a */
    public File m13122a(Context context, String str, C2751e.a aVar, String str2) {
        return m13119a(context, str, str2, aVar.m13104a(), false, aVar.m13105b(), null);
    }

    /* renamed from: a */
    public void m13123a(Context context, String str, C2751e.a aVar, String str2, b bVar) {
        m13119a(context, str, str2, aVar.m13104a(), false, aVar.m13105b(), bVar);
    }

    /* renamed from: b */
    public File m13124b(Context context, String str, C2751e.a aVar, String str2) {
        return m13119a(context, str, str2, aVar.m13104a(), true, aVar.m13105b(), null);
    }
}
