package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

/* loaded from: classes.dex */
final class h extends PathClassLoader {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    protected final Class<?> loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
