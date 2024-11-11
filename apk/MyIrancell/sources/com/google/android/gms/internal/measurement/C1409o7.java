package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.o7 */
/* loaded from: classes.dex */
public final class C1409o7 {

    /* renamed from: a */
    private static final Logger f6811a = Logger.getLogger(C1409o7.class.getName());

    /* renamed from: b */
    private static final Unsafe f6812b = m8134c();

    /* renamed from: c */
    private static final Class<?> f6813c = C1195a3.m7529b();

    /* renamed from: d */
    private static final boolean f6814d = m8142d(Long.TYPE);

    /* renamed from: e */
    private static final boolean f6815e = m8142d(Integer.TYPE);

    /* renamed from: f */
    private static final c f6816f;

    /* renamed from: g */
    private static final boolean f6817g;

    /* renamed from: h */
    private static final boolean f6818h;

    /* renamed from: i */
    private static final long f6819i;

    /* renamed from: j */
    static final boolean f6820j;

    /* renamed from: com.google.android.gms.internal.measurement.o7$a */
    /* loaded from: classes.dex */
    static final class a extends c {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: a */
        public final byte mo8156a(Object obj, long j) {
            return C1409o7.f6820j ? C1409o7.m8152k(obj, j) : C1409o7.m8153l(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: a */
        public final void mo8157a(Object obj, long j, byte b) {
            if (C1409o7.f6820j) {
                C1409o7.m8135c(obj, j, b);
            } else {
                C1409o7.m8139d(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: a */
        public final void mo8158a(Object obj, long j, double d) {
            m8165a(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: a */
        public final void mo8159a(Object obj, long j, float f) {
            m8164a(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: a */
        public final void mo8160a(Object obj, long j, boolean z) {
            if (C1409o7.f6820j) {
                C1409o7.m8140d(obj, j, z);
            } else {
                C1409o7.m8144e(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: b */
        public final boolean mo8161b(Object obj, long j) {
            return C1409o7.f6820j ? C1409o7.m8154m(obj, j) : C1409o7.m8155n(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: c */
        public final float mo8162c(Object obj, long j) {
            return Float.intBitsToFloat(m8166e(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: d */
        public final double mo8163d(Object obj, long j) {
            return Double.longBitsToDouble(m8167f(obj, j));
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.o7$b */
    /* loaded from: classes.dex */
    static final class b extends c {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: a */
        public final byte mo8156a(Object obj, long j) {
            return C1409o7.f6820j ? C1409o7.m8152k(obj, j) : C1409o7.m8153l(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: a */
        public final void mo8157a(Object obj, long j, byte b) {
            if (C1409o7.f6820j) {
                C1409o7.m8135c(obj, j, b);
            } else {
                C1409o7.m8139d(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: a */
        public final void mo8158a(Object obj, long j, double d) {
            m8165a(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: a */
        public final void mo8159a(Object obj, long j, float f) {
            m8164a(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: a */
        public final void mo8160a(Object obj, long j, boolean z) {
            if (C1409o7.f6820j) {
                C1409o7.m8140d(obj, j, z);
            } else {
                C1409o7.m8144e(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: b */
        public final boolean mo8161b(Object obj, long j) {
            return C1409o7.f6820j ? C1409o7.m8154m(obj, j) : C1409o7.m8155n(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: c */
        public final float mo8162c(Object obj, long j) {
            return Float.intBitsToFloat(m8166e(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: d */
        public final double mo8163d(Object obj, long j) {
            return Double.longBitsToDouble(m8167f(obj, j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.measurement.o7$c */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        Unsafe f6821a;

        c(Unsafe unsafe) {
            this.f6821a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo8156a(Object obj, long j);

        /* renamed from: a */
        public abstract void mo8157a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo8158a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo8159a(Object obj, long j, float f);

        /* renamed from: a */
        public final void m8164a(Object obj, long j, int i) {
            this.f6821a.putInt(obj, j, i);
        }

        /* renamed from: a */
        public final void m8165a(Object obj, long j, long j2) {
            this.f6821a.putLong(obj, j, j2);
        }

        /* renamed from: a */
        public abstract void mo8160a(Object obj, long j, boolean z);

        /* renamed from: b */
        public abstract boolean mo8161b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo8162c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo8163d(Object obj, long j);

        /* renamed from: e */
        public final int m8166e(Object obj, long j) {
            return this.f6821a.getInt(obj, j);
        }

        /* renamed from: f */
        public final long m8167f(Object obj, long j) {
            return this.f6821a.getLong(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.o7$d */
    /* loaded from: classes.dex */
    static final class d extends c {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: a */
        public final byte mo8156a(Object obj, long j) {
            return this.f6821a.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: a */
        public final void mo8157a(Object obj, long j, byte b) {
            this.f6821a.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: a */
        public final void mo8158a(Object obj, long j, double d) {
            this.f6821a.putDouble(obj, j, d);
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: a */
        public final void mo8159a(Object obj, long j, float f) {
            this.f6821a.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: a */
        public final void mo8160a(Object obj, long j, boolean z) {
            this.f6821a.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: b */
        public final boolean mo8161b(Object obj, long j) {
            return this.f6821a.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: c */
        public final float mo8162c(Object obj, long j) {
            return this.f6821a.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.C1409o7.c
        /* renamed from: d */
        public final double mo8163d(Object obj, long j) {
            return this.f6821a.getDouble(obj, j);
        }
    }

    static {
        c cVar;
        c cVar2 = null;
        if (f6812b != null) {
            if (!C1195a3.m7528a()) {
                cVar2 = new d(f6812b);
            } else if (f6814d) {
                cVar2 = new a(f6812b);
            } else if (f6815e) {
                cVar2 = new b(f6812b);
            }
        }
        f6816f = cVar2;
        f6817g = m8145e();
        f6818h = m8141d();
        f6819i = m8128b(byte[].class);
        m8128b(boolean[].class);
        m8133c(boolean[].class);
        m8128b(int[].class);
        m8133c(int[].class);
        m8128b(long[].class);
        m8133c(long[].class);
        m8128b(float[].class);
        m8133c(float[].class);
        m8128b(double[].class);
        m8133c(double[].class);
        m8128b(Object[].class);
        m8133c(Object[].class);
        Field m8147f = m8147f();
        if (m8147f != null && (cVar = f6816f) != null) {
            cVar.f6821a.objectFieldOffset(m8147f);
        }
        f6820j = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private C1409o7() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static byte m8115a(byte[] bArr, long j) {
        return f6816f.mo8156a(bArr, f6819i + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m8116a(Object obj, long j) {
        return f6816f.m8166e(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> T m8117a(Class<T> cls) {
        try {
            return (T) f6812b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    private static Field m8118a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8120a(Object obj, long j, double d2) {
        f6816f.mo8158a(obj, j, d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8121a(Object obj, long j, float f) {
        f6816f.mo8159a(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8122a(Object obj, long j, int i) {
        f6816f.m8164a(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8123a(Object obj, long j, long j2) {
        f6816f.m8165a(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8124a(Object obj, long j, Object obj2) {
        f6816f.f6821a.putObject(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8125a(Object obj, long j, boolean z) {
        f6816f.mo8160a(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8126a(byte[] bArr, long j, byte b2) {
        f6816f.mo8157a((Object) bArr, f6819i + j, b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m8127a() {
        return f6818h;
    }

    /* renamed from: b */
    private static int m8128b(Class<?> cls) {
        if (f6818h) {
            return f6816f.f6821a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static long m8129b(Object obj, long j) {
        return f6816f.m8167f(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m8132b() {
        return f6817g;
    }

    /* renamed from: c */
    private static int m8133c(Class<?> cls) {
        if (f6818h) {
            return f6816f.f6821a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Unsafe m8134c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1394n7());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m8135c(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        m8122a(obj, j2, ((255 & b2) << i) | (m8116a(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m8137c(Object obj, long j) {
        return f6816f.mo8161b(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static float m8138d(Object obj, long j) {
        return f6816f.mo8162c(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m8139d(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m8122a(obj, j2, ((255 & b2) << i) | (m8116a(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m8140d(Object obj, long j, boolean z) {
        m8135c(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: d */
    private static boolean m8141d() {
        Unsafe unsafe = f6812b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (C1195a3.m7528a()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f6811a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m8142d(Class<?> cls) {
        if (!C1195a3.m7528a()) {
            return false;
        }
        try {
            Class<?> cls2 = f6813c;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static double m8143e(Object obj, long j) {
        return f6816f.mo8163d(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static void m8144e(Object obj, long j, boolean z) {
        m8139d(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: e */
    private static boolean m8145e() {
        Unsafe unsafe = f6812b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (m8147f() == null) {
                return false;
            }
            if (C1195a3.m7528a()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f6811a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Object m8146f(Object obj, long j) {
        return f6816f.f6821a.getObject(obj, j);
    }

    /* renamed from: f */
    private static Field m8147f() {
        Field m8118a;
        if (C1195a3.m7528a() && (m8118a = m8118a((Class<?>) Buffer.class, "effectiveDirectAddress")) != null) {
            return m8118a;
        }
        Field m8118a2 = m8118a((Class<?>) Buffer.class, "address");
        if (m8118a2 == null || m8118a2.getType() != Long.TYPE) {
            return null;
        }
        return m8118a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static byte m8152k(Object obj, long j) {
        return (byte) (m8116a(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static byte m8153l(Object obj, long j) {
        return (byte) (m8116a(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m8154m(Object obj, long j) {
        return m8152k(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m8155n(Object obj, long j) {
        return m8153l(obj, j) != 0;
    }
}
