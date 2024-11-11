package p000;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: w7 */
/* loaded from: classes.dex */
class C3387w7 {

    /* renamed from: a */
    private final Context f13775a;

    /* renamed from: b */
    private final String f13776b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3387w7(Context context, String str) {
        this.f13775a = context.getApplicationContext();
        this.f13776b = str;
    }

    /* renamed from: a */
    private File m16148a(String str) {
        File file = new File(this.f13775a.getCacheDir(), m16149a(str, EnumC3341v7.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(this.f13775a.getCacheDir(), m16149a(str, EnumC3341v7.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: a */
    private static String m16149a(String str, EnumC3341v7 enumC3341v7, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? enumC3341v7.tempExtension() : enumC3341v7.extension);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public File m16150a(InputStream inputStream, EnumC3341v7 enumC3341v7) {
        File file = new File(this.f13775a.getCacheDir(), m16149a(this.f13776b, enumC3341v7, true));
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
    /* renamed from: a */
    public C3231t1<EnumC3341v7, InputStream> m16151a() {
        try {
            File m16148a = m16148a(this.f13776b);
            if (m16148a == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(m16148a);
            EnumC3341v7 enumC3341v7 = m16148a.getAbsolutePath().endsWith(".zip") ? EnumC3341v7.ZIP : EnumC3341v7.JSON;
            C3116q9.m15000a("Cache hit for " + this.f13776b + " at " + m16148a.getAbsolutePath());
            return new C3231t1<>(enumC3341v7, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m16152a(EnumC3341v7 enumC3341v7) {
        File file = new File(this.f13775a.getCacheDir(), m16149a(this.f13776b, enumC3341v7, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        C3116q9.m15000a("Copying temp file to real file (" + file2 + ")");
        if (renameTo) {
            return;
        }
        C3116q9.m15002b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }
}
