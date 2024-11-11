package ir.tapsell.sdk.networkcacheutils;

import android.content.Context;
import defpackage.i50;
import java.io.File;

/* loaded from: classes.dex */
public class e {

    /* loaded from: classes.dex */
    public static class a {
        public File a;
        public int b;

        public a() {
        }

        public a(File file, int i) {
            this.a = file;
            this.b = i;
        }

        public static a a(Context context) {
            a aVar = new a();
            aVar.a = context.getCacheDir();
            aVar.b = 10;
            return aVar;
        }

        public File a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }

    public static a a(Context context) {
        if (context != null) {
            return new a(new File(context.getFilesDir(), "videos"), 10);
        }
        i50.a("null context for cache options");
        return null;
    }
}
