package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
class w7 {
    private final Context a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w7(Context context, String str) {
        this.a = context.getApplicationContext();
        this.b = str;
    }

    private File a(String str) {
        File file = new File(this.a.getCacheDir(), a(str, v7.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(this.a.getCacheDir(), a(str, v7.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private static String a(String str, v7 v7Var, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? v7Var.tempExtension() : v7Var.extension);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File a(InputStream inputStream, v7 v7Var) {
        File file = new File(this.a.getCacheDir(), a(this.b, v7Var, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t1<v7, InputStream> a() {
        try {
            File a = a(this.b);
            if (a == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(a);
            v7 v7Var = a.getAbsolutePath().endsWith(".zip") ? v7.ZIP : v7.JSON;
            q9.a("Cache hit for " + this.b + " at " + a.getAbsolutePath());
            return new t1<>(v7Var, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(v7 v7Var) {
        File file = new File(this.a.getCacheDir(), a(this.b, v7Var, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        q9.a("Copying temp file to real file (" + file2 + ")");
        if (renameTo) {
            return;
        }
        q9.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }
}
