package ir.tapsell.sdk.networkcacheutils;

import android.content.Context;
import java.io.File;
import p000.i50;

/* renamed from: ir.tapsell.sdk.networkcacheutils.e */
/* loaded from: classes.dex */
public class C2751e {

    /* renamed from: ir.tapsell.sdk.networkcacheutils.e$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public File f11235a;

        /* renamed from: b */
        public int f11236b;

        public a() {
        }

        public a(File file, int i) {
            this.f11235a = file;
            this.f11236b = i;
        }

        /* renamed from: a */
        public static a m13103a(Context context) {
            a aVar = new a();
            aVar.f11235a = context.getCacheDir();
            aVar.f11236b = 10;
            return aVar;
        }

        /* renamed from: a */
        public File m13104a() {
            return this.f11235a;
        }

        /* renamed from: b */
        public int m13105b() {
            return this.f11236b;
        }
    }

    /* renamed from: a */
    public static a m13102a(Context context) {
        if (context != null) {
            return new a(new File(context.getFilesDir(), "videos"), 10);
        }
        i50.m12368a("null context for cache options");
        return null;
    }
}
