package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* renamed from: x3 */
/* loaded from: classes.dex */
public final class C3421x3 {

    /* renamed from: a */
    private static final Set<File> f13980a = new HashSet();

    /* renamed from: b */
    private static final boolean f13981b = m16425a(System.getProperty("java.vm.version"));

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b */
        private static final int f13982b = 4;

        /* renamed from: a */
        private final InterfaceC3579a f13983a;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x3$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC3579a {
            /* renamed from: a */
            Object mo16434a(File file, DexFile dexFile);
        }

        /* renamed from: x3$a$b */
        /* loaded from: classes.dex */
        private static class b implements InterfaceC3579a {

            /* renamed from: a */
            private final Constructor<?> f13984a;

            b(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.f13984a = constructor;
                constructor.setAccessible(true);
            }

            @Override // p000.C3421x3.a.InterfaceC3579a
            /* renamed from: a */
            public Object mo16434a(File file, DexFile dexFile) {
                return this.f13984a.newInstance(file, new ZipFile(file), dexFile);
            }
        }

        /* renamed from: x3$a$c */
        /* loaded from: classes.dex */
        private static class c implements InterfaceC3579a {

            /* renamed from: a */
            private final Constructor<?> f13985a;

            c(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
                this.f13985a = constructor;
                constructor.setAccessible(true);
            }

            @Override // p000.C3421x3.a.InterfaceC3579a
            /* renamed from: a */
            public Object mo16434a(File file, DexFile dexFile) {
                return this.f13985a.newInstance(file, file, dexFile);
            }
        }

        /* renamed from: x3$a$d */
        /* loaded from: classes.dex */
        private static class d implements InterfaceC3579a {

            /* renamed from: a */
            private final Constructor<?> f13986a;

            d(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.f13986a = constructor;
                constructor.setAccessible(true);
            }

            @Override // p000.C3421x3.a.InterfaceC3579a
            /* renamed from: a */
            public Object mo16434a(File file, DexFile dexFile) {
                return this.f13986a.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }

        private a() {
            InterfaceC3579a dVar;
            Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
            try {
                try {
                    dVar = new b(cls);
                } catch (NoSuchMethodException unused) {
                    dVar = new c(cls);
                }
            } catch (NoSuchMethodException unused2) {
                dVar = new d(cls);
            }
            this.f13983a = dVar;
        }

        /* renamed from: a */
        private static String m16431a(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - f13982b) + ".dex").getPath();
        }

        /* renamed from: a */
        static void m16432a(ClassLoader classLoader, List<? extends File> list) {
            Object obj = C3421x3.m16427b(classLoader, "pathList").get(classLoader);
            Object[] m16433a = new a().m16433a(list);
            try {
                C3421x3.m16429b(obj, "dexElements", m16433a);
            } catch (NoSuchFieldException unused) {
                C3421x3.m16429b(obj, "pathElements", m16433a);
            }
        }

        /* renamed from: a */
        private Object[] m16433a(List<? extends File> list) {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = list.get(i);
                objArr[i] = this.f13983a.mo16434a(file, DexFile.loadDex(file.getPath(), m16431a(file), 0));
            }
            return objArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3$b */
    /* loaded from: classes.dex */
    public static final class b {
        /* renamed from: a */
        static void m16435a(ClassLoader classLoader, List<? extends File> list, File file) {
            IOException[] iOExceptionArr;
            Object obj = C3421x3.m16427b(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            C3421x3.m16429b(obj, "dexElements", m16436a(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                }
                Field m16427b = C3421x3.m16427b(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) m16427b.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                m16427b.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        /* renamed from: a */
        private static Object[] m16436a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            return (Object[]) C3421x3.m16428b(obj, "makeDexElements", (Class<?>[]) new Class[]{ArrayList.class, File.class, ArrayList.class}).invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3$c */
    /* loaded from: classes.dex */
    public static final class c {
        /* renamed from: a */
        static void m16437a(ClassLoader classLoader, List<? extends File> list) {
            int size = list.size();
            Field m16427b = C3421x3.m16427b(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) m16427b.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File next = listIterator.next();
                String absolutePath = next.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = next;
                zipFileArr[previousIndex] = new ZipFile(next);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            m16427b.set(classLoader, sb.toString());
            C3421x3.m16429b(classLoader, "mPaths", strArr);
            C3421x3.m16429b(classLoader, "mFiles", fileArr);
            C3421x3.m16429b(classLoader, "mZips", zipFileArr);
            C3421x3.m16429b(classLoader, "mDexs", dexFileArr);
        }
    }

    /* renamed from: a */
    private static File m16417a(Context context, File file, String str) {
        File file2 = new File(file, "code_cache");
        try {
            m16422a(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m16422a(file2);
        }
        File file3 = new File(file2, str);
        m16422a(file3);
        return file3;
    }

    /* renamed from: a */
    private static void m16420a(Context context) {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            String str3 = "Clearing old secondary dex dir (" + file.getPath() + ").";
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                String str4 = "Failed to list secondary dex dir content (" + file.getPath() + ").";
                return;
            }
            for (File file2 : listFiles) {
                String str5 = "Trying to delete old file " + file2.getPath() + " of size " + file2.length();
                if (file2.delete()) {
                    sb2 = new StringBuilder();
                    str2 = "Deleted old file ";
                } else {
                    sb2 = new StringBuilder();
                    str2 = "Failed to delete old file ";
                }
                sb2.append(str2);
                sb2.append(file2.getPath());
                sb2.toString();
            }
            if (file.delete()) {
                sb = new StringBuilder();
                str = "Deleted old secondary dex dir ";
            } else {
                sb = new StringBuilder();
                str = "Failed to delete secondary dex dir ";
            }
            sb.append(str);
            sb.append(file.getPath());
            sb.toString();
        }
    }

    /* renamed from: a */
    private static void m16421a(Context context, File file, File file2, String str, String str2, boolean z) {
        synchronized (f13980a) {
            if (f13980a.contains(file)) {
                return;
            }
            f13980a.add(file);
            if (Build.VERSION.SDK_INT > 20) {
                String str3 = "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"";
            }
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (classLoader == null) {
                    return;
                }
                try {
                    m16420a(context);
                } catch (Throwable unused) {
                }
                File m16417a = m16417a(context, file2, str);
                C3510z3 c3510z3 = new C3510z3(file, m16417a);
                IOException e = null;
                try {
                    try {
                        m16423a(classLoader, m16417a, c3510z3.m16728a(context, str2, false));
                    } catch (IOException e2) {
                        if (!z) {
                            throw e2;
                        }
                        m16423a(classLoader, m16417a, c3510z3.m16728a(context, str2, true));
                    }
                    try {
                    } catch (IOException e3) {
                        e = e3;
                    }
                    if (e != null) {
                        throw e;
                    }
                } finally {
                    try {
                        c3510z3.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (RuntimeException unused3) {
            }
        }
    }

    /* renamed from: a */
    private static void m16422a(File file) {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            String str = "Failed to create dir " + file.getPath() + ". Parent file is null.";
        } else {
            String str2 = "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite();
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }

    /* renamed from: a */
    private static void m16423a(ClassLoader classLoader, File file, List<? extends File> list) {
        if (list.isEmpty()) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            b.m16435a(classLoader, list, file);
        } else if (i >= 14) {
            a.m16432a(classLoader, list);
        } else {
            c.m16437a(classLoader, list);
        }
    }

    /* renamed from: a */
    static boolean m16425a(String str) {
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        sb.toString();
        return z;
    }

    /* renamed from: b */
    private static ApplicationInfo m16426b(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static Field m16427b(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static Method m16428b(Object obj, String str, Class<?>... clsArr) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m16429b(Object obj, String str, Object[] objArr) {
        Field m16427b = m16427b(obj, str);
        Object[] objArr2 = (Object[]) m16427b.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        m16427b.set(obj, objArr3);
    }

    /* renamed from: c */
    public static void m16430c(Context context) {
        if (f13981b) {
            return;
        }
        if (Build.VERSION.SDK_INT < 4) {
            throw new RuntimeException("MultiDex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is 4.");
        }
        try {
            ApplicationInfo m16426b = m16426b(context);
            if (m16426b == null) {
                return;
            }
            m16421a(context, new File(m16426b.sourceDir), new File(m16426b.dataDir), "secondary-dexes", "", true);
        } catch (Exception e) {
            throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
        }
    }
}
