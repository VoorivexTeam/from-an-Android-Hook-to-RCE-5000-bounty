package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.util.C1101g;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
import p000.BinderC2521gp;
import p000.InterfaceC2481fp;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: b */
    @GuardedBy("DynamiteModule.class")
    private static Boolean f6376b = null;

    /* renamed from: c */
    @GuardedBy("DynamiteModule.class")
    private static InterfaceC1133j f6377c = null;

    /* renamed from: d */
    @GuardedBy("DynamiteModule.class")
    private static InterfaceC1135l f6378d = null;

    /* renamed from: e */
    @GuardedBy("DynamiteModule.class")
    private static String f6379e = null;

    /* renamed from: f */
    @GuardedBy("DynamiteModule.class")
    private static int f6380f = -1;

    /* renamed from: g */
    private static final ThreadLocal<C1122c> f6381g = new ThreadLocal<>();

    /* renamed from: h */
    private static final InterfaceC1121b.b f6382h = new C1124a();

    /* renamed from: i */
    public static final InterfaceC1121b f6383i;

    /* renamed from: j */
    public static final InterfaceC1121b f6384j;

    /* renamed from: k */
    public static final InterfaceC1121b f6385k;

    /* renamed from: a */
    private final Context f6386a;

    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {

        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    /* loaded from: classes.dex */
    public static class C1120a extends Exception {
        private C1120a(String str) {
            super(str);
        }

        /* synthetic */ C1120a(String str, C1124a c1124a) {
            this(str);
        }

        private C1120a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ C1120a(String str, Throwable th, C1124a c1124a) {
            this(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1121b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            public int f6387a = 0;

            /* renamed from: b */
            public int f6388b = 0;

            /* renamed from: c */
            public int f6389c = 0;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        /* loaded from: classes.dex */
        public interface b {
            /* renamed from: a */
            int mo7452a(Context context, String str);

            /* renamed from: a */
            int mo7453a(Context context, String str, boolean z);
        }

        /* renamed from: a */
        a mo7451a(Context context, String str, b bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$c */
    /* loaded from: classes.dex */
    public static class C1122c {

        /* renamed from: a */
        public Cursor f6390a;

        private C1122c() {
        }

        /* synthetic */ C1122c(C1124a c1124a) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$d */
    /* loaded from: classes.dex */
    private static class C1123d implements InterfaceC1121b.b {

        /* renamed from: a */
        private final int f6391a;

        public C1123d(int i, int i2) {
            this.f6391a = i;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1121b.b
        /* renamed from: a */
        public final int mo7452a(Context context, String str) {
            return this.f6391a;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1121b.b
        /* renamed from: a */
        public final int mo7453a(Context context, String str, boolean z) {
            return 0;
        }
    }

    static {
        new C1126c();
        f6383i = new C1125b();
        new C1128e();
        f6384j = new C1127d();
        f6385k = new C1130g();
        new C1129f();
    }

    private DynamiteModule(Context context) {
        C1057u.m7286a(context);
        this.f6386a = context;
    }

    /* renamed from: a */
    public static int m7438a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            sb2.toString();
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            sb3.toString();
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                "Failed to load module descriptor class: ".concat(valueOf2);
            } else {
                new String("Failed to load module descriptor class: ");
            }
            return 0;
        }
    }

    /* renamed from: a */
    public static int m7439a(Context context, String str, boolean z) {
        Class<?> loadClass;
        Field declaredField;
        Boolean bool;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool2 = f6376b;
                if (bool2 == null) {
                    try {
                        loadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                        declaredField = loadClass.getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(valueOf);
                        sb.toString();
                        bool2 = Boolean.FALSE;
                    }
                    synchronized (loadClass) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader != ClassLoader.getSystemClassLoader()) {
                                try {
                                    m7444a(classLoader);
                                } catch (C1120a unused) {
                                }
                                bool = Boolean.TRUE;
                                bool2 = bool;
                                f6376b = bool2;
                            }
                        } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                        } else {
                            try {
                                int m7448c = m7448c(context, str, z);
                                if (f6379e != null && !f6379e.isEmpty()) {
                                    ClassLoader delegateLastClassLoader = Build.VERSION.SDK_INT >= 29 ? new DelegateLastClassLoader(f6379e, ClassLoader.getSystemClassLoader()) : new C1131h(f6379e, ClassLoader.getSystemClassLoader());
                                    m7444a(delegateLastClassLoader);
                                    declaredField.set(null, delegateLastClassLoader);
                                    f6376b = Boolean.TRUE;
                                    return m7448c;
                                }
                                return m7448c;
                            } catch (C1120a unused2) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                            }
                        }
                        bool = Boolean.FALSE;
                        bool2 = bool;
                        f6376b = bool2;
                    }
                }
                if (!bool2.booleanValue()) {
                    return m7446b(context, str, z);
                }
                try {
                    return m7448c(context, str, z);
                } catch (C1120a e2) {
                    String valueOf2 = String.valueOf(e2.getMessage());
                    if (valueOf2.length() != 0) {
                        "Failed to retrieve remote module version: ".concat(valueOf2);
                        return 0;
                    }
                    new String("Failed to retrieve remote module version: ");
                    return 0;
                }
            }
        } catch (Throwable th) {
            C1101g.m7383a(context, th);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r10 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c4, code lost:
    
        if (r10 != null) goto L18;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.dynamite.DynamiteModule m7440a(android.content.Context r9, com.google.android.gms.dynamite.DynamiteModule.InterfaceC1121b r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m7440a(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* renamed from: a */
    private static DynamiteModule m7441a(Context context, String str, int i) {
        Boolean bool;
        C1124a c1124a = null;
        try {
            synchronized (DynamiteModule.class) {
                bool = f6376b;
            }
            if (bool == null) {
                throw new C1120a("Failed to determine which loading route to use.", c1124a);
            }
            if (bool.booleanValue()) {
                return m7447b(context, str, i);
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
            sb.append("Selected remote version of ");
            sb.append(str);
            sb.append(", version >= ");
            sb.append(i);
            sb.toString();
            InterfaceC1133j m7442a = m7442a(context);
            if (m7442a == null) {
                throw new C1120a("Failed to create IDynamiteLoader.", c1124a);
            }
            InterfaceC2481fp mo7455a = m7442a.mo7458g() >= 2 ? m7442a.mo7455a(BinderC2521gp.m12036a(context), str, i) : m7442a.mo7457b(BinderC2521gp.m12036a(context), str, i);
            if (BinderC2521gp.m12037a(mo7455a) != null) {
                return new DynamiteModule((Context) BinderC2521gp.m12037a(mo7455a));
            }
            throw new C1120a("Failed to load remote module.", c1124a);
        } catch (RemoteException e) {
            throw new C1120a("Failed to load remote module.", e, c1124a);
        } catch (C1120a e2) {
            throw e2;
        } catch (Throwable th) {
            C1101g.m7383a(context, th);
            throw new C1120a("Failed to load remote module.", th, c1124a);
        }
    }

    /* renamed from: a */
    private static InterfaceC1133j m7442a(Context context) {
        InterfaceC1133j c1132i;
        synchronized (DynamiteModule.class) {
            if (f6377c != null) {
                return f6377c;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c1132i = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c1132i = queryLocalInterface instanceof InterfaceC1133j ? (InterfaceC1133j) queryLocalInterface : new C1132i(iBinder);
                }
                if (c1132i != null) {
                    f6377c = c1132i;
                    return c1132i;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf);
                } else {
                    new String("Failed to load IDynamiteLoader from GmsCore: ");
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    private static Boolean m7443a() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f6380f >= 2);
        }
        return valueOf;
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: a */
    private static void m7444a(ClassLoader classLoader) {
        InterfaceC1135l c1134k;
        C1124a c1124a = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                c1134k = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c1134k = queryLocalInterface instanceof InterfaceC1135l ? (InterfaceC1135l) queryLocalInterface : new C1134k(iBinder);
            }
            f6378d = c1134k;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C1120a("Failed to instantiate dynamite loader", e, c1124a);
        }
    }

    /* renamed from: b */
    public static int m7445b(Context context, String str) {
        return m7439a(context, str, false);
    }

    /* renamed from: b */
    private static int m7446b(Context context, String str, boolean z) {
        InterfaceC1133j m7442a = m7442a(context);
        if (m7442a == null) {
            return 0;
        }
        try {
            return m7442a.mo7458g() >= 2 ? m7442a.mo7454a(BinderC2521gp.m12036a(context), str, z) : m7442a.mo7456b(BinderC2521gp.m12036a(context), str, z);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Failed to retrieve remote module version: ".concat(valueOf);
            } else {
                new String("Failed to retrieve remote module version: ");
            }
            return 0;
        }
    }

    /* renamed from: b */
    private static DynamiteModule m7447b(Context context, String str, int i) {
        InterfaceC1135l interfaceC1135l;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        sb.toString();
        synchronized (DynamiteModule.class) {
            interfaceC1135l = f6378d;
        }
        C1124a c1124a = null;
        if (interfaceC1135l == null) {
            throw new C1120a("DynamiteLoaderV2 was not cached.", c1124a);
        }
        C1122c c1122c = f6381g.get();
        if (c1122c == null || c1122c.f6390a == null) {
            throw new C1120a("No result cursor", c1124a);
        }
        Context applicationContext = context.getApplicationContext();
        Cursor cursor = c1122c.f6390a;
        BinderC2521gp.m12036a((Object) null);
        boolean booleanValue = m7443a().booleanValue();
        InterfaceC2481fp m12036a = BinderC2521gp.m12036a(applicationContext);
        InterfaceC2481fp m12036a2 = BinderC2521gp.m12036a(cursor);
        Context context2 = (Context) BinderC2521gp.m12037a(booleanValue ? interfaceC1135l.mo7460b(m12036a, str, i, m12036a2) : interfaceC1135l.mo7459a(m12036a, str, i, m12036a2));
        if (context2 != null) {
            return new DynamiteModule(context2);
        }
        throw new C1120a("Failed to get module context", c1124a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.dynamite.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int m7448c(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            if (r10 == 0) goto La
            java.lang.String r8 = "api_force_staging"
            goto Lc
        La:
            java.lang.String r8 = "api"
        Lc:
            int r10 = r8.length()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r2.append(r8)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r2.append(r9)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            if (r8 == 0) goto L8c
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
            if (r9 == 0) goto L8c
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
            if (r9 <= 0) goto L7c
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.dynamite.DynamiteModule.f6379e = r1     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L79
            if (r1 < 0) goto L67
            int r1 = r8.getInt(r1)     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.dynamite.DynamiteModule.f6380f = r1     // Catch: java.lang.Throwable -> L79
        L67:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L79
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = com.google.android.gms.dynamite.DynamiteModule.f6381g     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
            com.google.android.gms.dynamite.DynamiteModule$c r10 = (com.google.android.gms.dynamite.DynamiteModule.C1122c) r10     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
            if (r10 == 0) goto L7c
            android.database.Cursor r1 = r10.f6390a     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
            if (r1 != 0) goto L7c
            r10.f6390a = r8     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
            goto L7d
        L79:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L79
            throw r9     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
        L7c:
            r0 = r8
        L7d:
            if (r0 == 0) goto L82
            r0.close()
        L82:
            return r9
        L83:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto La7
        L87:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L98
        L8c:
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
            throw r9     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L87
        L94:
            r8 = move-exception
            goto La7
        L96:
            r8 = move-exception
            r9 = r0
        L98:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.C1120a     // Catch: java.lang.Throwable -> La5
            if (r10 == 0) goto L9d
            throw r8     // Catch: java.lang.Throwable -> La5
        L9d:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> La5
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch: java.lang.Throwable -> La5
            throw r10     // Catch: java.lang.Throwable -> La5
        La5:
            r8 = move-exception
            r0 = r9
        La7:
            if (r0 == 0) goto Lac
            r0.close()
        Lac:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m7448c(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: c */
    private static DynamiteModule m7449c(Context context, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Selected local version of ".concat(valueOf);
        } else {
            new String("Selected local version of ");
        }
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: a */
    public final IBinder m7450a(String str) {
        try {
            return (IBinder) this.f6386a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new C1120a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, null);
        }
    }
}
