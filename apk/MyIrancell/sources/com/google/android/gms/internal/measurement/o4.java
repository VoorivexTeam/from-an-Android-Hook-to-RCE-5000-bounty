package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;
import com.google.android.gms.internal.measurement.o4.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class o4<MessageType extends o4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends x2<MessageType, BuilderType> {
    private static Map<Object, o4<?, ?>> zzd = new ConcurrentHashMap();
    protected h7 zzb = h7.d();
    private int zzc = -1;

    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends o4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends w2<MessageType, BuilderType> {
        private final MessageType b;
        protected MessageType c;
        protected boolean d = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.b = messagetype;
            this.c = (MessageType) messagetype.a(f.d, null, null);
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            n6.a().a((n6) messagetype).b(messagetype, messagetype2);
        }

        private final BuilderType b(byte[] bArr, int i, int i2, a4 a4Var) {
            if (this.d) {
                k();
                this.d = false;
            }
            try {
                n6.a().a((n6) this.c).a(this.c, bArr, 0, i2 + 0, new c3(a4Var));
                return this;
            } catch (w4 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw w4.a();
            }
        }

        @Override // com.google.android.gms.internal.measurement.w2
        public final BuilderType a(MessageType messagetype) {
            if (this.d) {
                k();
                this.d = false;
            }
            a(this.c, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.measurement.w2
        public final /* synthetic */ w2 a(byte[] bArr, int i, int i2) {
            b(bArr, 0, i2, a4.a());
            return this;
        }

        @Override // com.google.android.gms.internal.measurement.w2
        public final /* synthetic */ w2 a(byte[] bArr, int i, int i2, a4 a4Var) {
            b(bArr, 0, i2, a4Var);
            return this;
        }

        @Override // com.google.android.gms.internal.measurement.z5
        public final boolean a() {
            return o4.a(this.c, false);
        }

        @Override // com.google.android.gms.internal.measurement.z5
        public final /* synthetic */ x5 b() {
            return this.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Object clone() {
            a aVar = (a) this.b.a(f.e, null, null);
            aVar.a((a) d());
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void k() {
            MessageType messagetype = (MessageType) this.c.a(f.d, null, null);
            a(messagetype, this.c);
            this.c = messagetype;
        }

        @Override // com.google.android.gms.internal.measurement.a6
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public MessageType d() {
            if (this.d) {
                return this.c;
            }
            MessageType messagetype = this.c;
            n6.a().a((n6) messagetype).c(messagetype);
            this.d = true;
            return this.c;
        }

        @Override // com.google.android.gms.internal.measurement.a6
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final MessageType i() {
            MessageType messagetype = (MessageType) d();
            if (messagetype.a()) {
                return messagetype;
            }
            throw new f7(messagetype);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends o4<MessageType, BuilderType> implements z5 {
        protected d4<e> zzc = d4.g();

        /* JADX INFO: Access modifiers changed from: package-private */
        public final d4<e> zza() {
            if (this.zzc.b()) {
                this.zzc = (d4) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* loaded from: classes.dex */
    public static class c<T extends o4<T, ?>> extends y2<T> {
        public c(T t) {
        }
    }

    /* loaded from: classes.dex */
    public static class d<ContainingType extends x5, Type> extends y3<ContainingType, Type> {
    }

    /* loaded from: classes.dex */
    static final class e implements f4<e> {
        @Override // com.google.android.gms.internal.measurement.f4
        public final a6 a(a6 a6Var, x5 x5Var) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.f4
        public final g6 a(g6 g6Var, g6 g6Var2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.f4
        public final boolean a() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.f4
        public final c8 b() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.f4
        public final boolean c() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.f4
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.f4
        public final v7 zzb() {
            throw new NoSuchMethodError();
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        private static final /* synthetic */ int[] h = {1, 2, 3, 4, 5, 6, 7};
        public static final int i = 1;
        public static final int j = 2;
        public static final int k = 1;
        public static final int l = 2;

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends o4<?, ?>> T a(Class<T> cls) {
        o4<?, ?> o4Var = zzd.get(cls);
        if (o4Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                o4Var = zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (o4Var == null) {
            o4Var = (T) ((o4) o7.a(cls)).a(f.f, (Object) null, (Object) null);
            if (o4Var == null) {
                throw new IllegalStateException();
            }
            zzd.put(cls, o4Var);
        }
        return (T) o4Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static u4 a(u4 u4Var) {
        int size = u4Var.size();
        return u4Var.a(size == 0 ? 10 : size << 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> x4<E> a(x4<E> x4Var) {
        int size = x4Var.size();
        return x4Var.a(size == 0 ? 10 : size << 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object a(x5 x5Var, String str, Object[] objArr) {
        return new o6(x5Var, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends o4<?, ?>> void a(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    protected static final <T extends o4<T, ?>> boolean a(T t, boolean z) {
        byte byteValue = ((Byte) t.a(f.a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b2 = n6.a().a((n6) t).b(t);
        if (z) {
            t.a(f.b, b2 ? t : null, null);
        }
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static v4 m() {
        return p4.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static u4 n() {
        return l5.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> x4<E> o() {
        return m6.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.x2
    final void a(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.x5
    public final void a(v3 v3Var) {
        n6.a().a((n6) this).a((q6) this, (b8) x3.a(v3Var));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final boolean a() {
        return a(this, Boolean.TRUE.booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final /* synthetic */ x5 b() {
        return (o4) a(f.f, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.x5
    public final int c() {
        if (this.zzc == -1) {
            this.zzc = n6.a().a((n6) this).d(this);
        }
        return this.zzc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return n6.a().a((n6) this).a(this, (o4<MessageType, BuilderType>) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.x2
    final int f() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.x5
    public final /* synthetic */ a6 g() {
        a aVar = (a) a(f.e, (Object) null, (Object) null);
        aVar.a((a) this);
        return aVar;
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int a2 = n6.a().a((n6) this).a(this);
        this.zza = a2;
        return a2;
    }

    @Override // com.google.android.gms.internal.measurement.x5
    public final /* synthetic */ a6 j() {
        return (a) a(f.e, (Object) null, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends o4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType k() {
        return (BuilderType) a(f.e, (Object) null, (Object) null);
    }

    public final BuilderType l() {
        BuilderType buildertype = (BuilderType) a(f.e, (Object) null, (Object) null);
        buildertype.a(this);
        return buildertype;
    }

    public String toString() {
        return c6.a(this, super.toString());
    }
}
