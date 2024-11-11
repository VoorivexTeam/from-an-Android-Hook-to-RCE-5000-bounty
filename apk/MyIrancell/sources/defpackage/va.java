package defpackage;

import java.io.File;

/* loaded from: classes.dex */
class va {
    public File a(String str) {
        return new File(str);
    }

    public boolean a(File file) {
        return file.exists();
    }

    public long b(File file) {
        return file.length();
    }
}
