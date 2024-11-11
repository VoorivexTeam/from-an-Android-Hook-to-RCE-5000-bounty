package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;
import com.google.android.gms.internal.measurement.AbstractC1406o4.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.o4 */
/* loaded from: classes.dex */
public abstract class AbstractC1406o4<MessageType extends AbstractC1406o4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC1530x2<MessageType, BuilderType> {
    private static Map<Object, AbstractC1406o4<?, ?>> zzd = new ConcurrentHashMap();
    protected C1304h7 zzb = C1304h7.m7886d();
    private int zzc = -1;

    /* renamed from: com.google.android.gms.internal.measurement.o4$a */
    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends AbstractC1406o4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC1516w2<MessageType, BuilderType> {

        /* renamed from: b */
        private final MessageType f6790b;

        /* renamed from: c */
        protected MessageType f6791c;

        /* renamed from: d */
        protected boolean f6792d = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.f6790b = messagetype;
            this.f6791c = (MessageType) messagetype.mo7518a(f.f6796d, null, null);
        }

        /* renamed from: a */
        private static void m8100a(MessageType messagetype, MessageType messagetype2) {
            C1393n6.m8049a().m8051a((C1393n6) messagetype).mo7626b(messagetype, messagetype2);
        }

        /* renamed from: b */
        private final BuilderType m8101b(byte[] bArr, int i, int i2, C1196a4 c1196a4) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            try {
                C1393n6.m8049a().m8051a((C1393n6) this.f6791c).mo7624a(this.f6791c, bArr, 0, i2 + 0, new C1225c3(c1196a4));
                return this;
            } catch (C1518w4 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw C1518w4.m8630a();
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1516w2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BuilderType mo8103a(MessageType messagetype) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            m8100a(this.f6791c, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1516w2
        /* renamed from: a */
        public final /* synthetic */ AbstractC1516w2 mo8104a(byte[] bArr, int i, int i2) {
            m8101b(bArr, 0, i2, C1196a4.m7530a());
            return this;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1516w2
        /* renamed from: a */
        public final /* synthetic */ AbstractC1516w2 mo8105a(byte[] bArr, int i, int i2, C1196a4 c1196a4) {
            m8101b(bArr, 0, i2, c1196a4);
            return this;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC1561z5
        /* renamed from: a */
        public final boolean mo8092a() {
            return AbstractC1406o4.m8086a(this.f6791c, false);
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC1561z5
        /* renamed from: b */
        public final /* synthetic */ InterfaceC1533x5 mo8093b() {
            return this.f6790b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Object clone() {
            a aVar = (a) this.f6790b.mo7518a(f.f6797e, null, null);
            aVar.mo8103a((a) mo7536d());
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: k */
        public void m8106k() {
            MessageType messagetype = (MessageType) this.f6791c.mo7518a(f.f6796d, null, null);
            m8100a(messagetype, this.f6791c);
            this.f6791c = messagetype;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC1198a6
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public MessageType mo7536d() {
            if (this.f6792d) {
                return this.f6791c;
            }
            MessageType messagetype = this.f6791c;
            C1393n6.m8049a().m8051a((C1393n6) messagetype).mo7628c(messagetype);
            this.f6792d = true;
            return this.f6791c;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC1198a6
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final MessageType mo7537i() {
            MessageType messagetype = (MessageType) mo7536d();
            if (messagetype.mo8092a()) {
                return messagetype;
            }
            throw new C1274f7(messagetype);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.o4$b */
    /* loaded from: classes.dex */
    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends AbstractC1406o4<MessageType, BuilderType> implements InterfaceC1561z5 {
        protected C1241d4<e> zzc = C1241d4.m7758g();

        /* JADX INFO: Access modifiers changed from: package-private */
        public final C1241d4<e> zza() {
            if (this.zzc.m7761b()) {
                this.zzc = (C1241d4) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.o4$c */
    /* loaded from: classes.dex */
    public static class c<T extends AbstractC1406o4<T, ?>> extends C1544y2<T> {
        public c(T t) {
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.o4$d */
    /* loaded from: classes.dex */
    public static class d<ContainingType extends InterfaceC1533x5, Type> extends C1545y3<ContainingType, Type> {
    }

    /* renamed from: com.google.android.gms.internal.measurement.o4$e */
    /* loaded from: classes.dex */
    static final class e implements InterfaceC1271f4<e> {
        @Override // com.google.android.gms.internal.measurement.InterfaceC1271f4
        /* renamed from: a */
        public final InterfaceC1198a6 mo7822a(InterfaceC1198a6 interfaceC1198a6, InterfaceC1533x5 interfaceC1533x5) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC1271f4
        /* renamed from: a */
        public final InterfaceC1288g6 mo7823a(InterfaceC1288g6 interfaceC1288g6, InterfaceC1288g6 interfaceC1288g62) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC1271f4
        /* renamed from: a */
        public final boolean mo7824a() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC1271f4
        /* renamed from: b */
        public final EnumC1230c8 mo7825b() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC1271f4
        /* renamed from: c */
        public final boolean mo7826c() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC1271f4
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC1271f4
        public final EnumC1507v7 zzb() {
            throw new NoSuchMethodError();
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.o4$f */
    /* loaded from: classes.dex */
    public enum f {

        /* renamed from: a */
        public static final int f6793a = 1;

        /* renamed from: b */
        public static final int f6794b = 2;

        /* renamed from: c */
        public static final int f6795c = 3;

        /* renamed from: d */
        public static final int f6796d = 4;

        /* renamed from: e */
        public static final int f6797e = 5;

        /* renamed from: f */
        public static final int f6798f = 6;

        /* renamed from: g */
        public static final int f6799g = 7;

        /* renamed from: h */
        private static final /* synthetic */ int[] f6800h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: i */
        public static final int f6801i = 1;

        /* renamed from: j */
        public static final int f6802j = 2;

        /* renamed from: k */
        public static final int f6803k = 1;

        /* renamed from: l */
        public static final int f6804l = 2;

        /* renamed from: a */
        public static int[] m8109a() {
            return (int[]) f6800h.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T extends AbstractC1406o4<?, ?>> T m8080a(Class<T> cls) {
        AbstractC1406o4<?, ?> abstractC1406o4 = zzd.get(cls);
        if (abstractC1406o4 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1406o4 = zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (abstractC1406o4 == null) {
            abstractC1406o4 = (T) ((AbstractC1406o4) C1409o7.m8117a(cls)).mo7518a(f.f6798f, (Object) null, (Object) null);
            if (abstractC1406o4 == null) {
                throw new IllegalStateException();
            }
            zzd.put(cls, abstractC1406o4);
        }
        return (T) abstractC1406o4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static InterfaceC1490u4 m8081a(InterfaceC1490u4 interfaceC1490u4) {
        int size = interfaceC1490u4.size();
        return interfaceC1490u4.mo7796a(size == 0 ? 10 : size << 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static <E> InterfaceC1532x4<E> m8082a(InterfaceC1532x4<E> interfaceC1532x4) {
        int size = interfaceC1532x4.size();
        return interfaceC1532x4.mo7796a(size == 0 ? 10 : size << 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static Object m8083a(InterfaceC1533x5 interfaceC1533x5, String str, Object[] objArr) {
        return new C1408o6(interfaceC1533x5, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m8084a(Method method, Object obj, Object... objArr) {
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
    /* renamed from: a */
    public static <T extends AbstractC1406o4<?, ?>> void m8085a(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    /* renamed from: a */
    protected static final <T extends AbstractC1406o4<T, ?>> boolean m8086a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo7518a(f.f6793a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo7627b = C1393n6.m8049a().m8051a((C1393n6) t).mo7627b(t);
        if (z) {
            t.mo7518a(f.f6794b, mo7627b ? t : null, null);
        }
        return mo7627b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public static InterfaceC1504v4 m8087m() {
        return C1420p4.m8175a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public static InterfaceC1490u4 m8088n() {
        return C1362l5.m7961a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public static <E> InterfaceC1532x4<E> m8089o() {
        return C1378m6.m8025a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo7518a(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.AbstractC1530x2
    /* renamed from: a */
    final void mo8090a(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1533x5
    /* renamed from: a */
    public final void mo8091a(AbstractC1503v3 abstractC1503v3) {
        C1393n6.m8049a().m8051a((C1393n6) this).mo7623a((InterfaceC1436q6) this, (InterfaceC1215b8) C1531x3.m8882a(abstractC1503v3));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1561z5
    /* renamed from: a */
    public final boolean mo8092a() {
        return m8086a(this, Boolean.TRUE.booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1561z5
    /* renamed from: b */
    public final /* synthetic */ InterfaceC1533x5 mo8093b() {
        return (AbstractC1406o4) mo7518a(f.f6798f, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1533x5
    /* renamed from: c */
    public final int mo8094c() {
        if (this.zzc == -1) {
            this.zzc = C1393n6.m8049a().m8051a((C1393n6) this).mo7629d(this);
        }
        return this.zzc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C1393n6.m8049a().m8051a((C1393n6) this).mo7625a(this, (AbstractC1406o4<MessageType, BuilderType>) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1530x2
    /* renamed from: f */
    final int mo8095f() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1533x5
    /* renamed from: g */
    public final /* synthetic */ InterfaceC1198a6 mo8096g() {
        a aVar = (a) mo7518a(f.f6797e, (Object) null, (Object) null);
        aVar.mo8103a((a) this);
        return aVar;
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int mo7621a = C1393n6.m8049a().m8051a((C1393n6) this).mo7621a(this);
        this.zza = mo7621a;
        return mo7621a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1533x5
    /* renamed from: j */
    public final /* synthetic */ InterfaceC1198a6 mo8097j() {
        return (a) mo7518a(f.f6797e, (Object) null, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final <MessageType extends AbstractC1406o4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType m8098k() {
        return (BuilderType) mo7518a(f.f6797e, (Object) null, (Object) null);
    }

    /* renamed from: l */
    public final BuilderType m8099l() {
        BuilderType buildertype = (BuilderType) mo7518a(f.f6797e, (Object) null, (Object) null);
        buildertype.mo8103a(this);
        return buildertype;
    }

    public String toString() {
        return C1228c6.m7696a(this, super.toString());
    }
}
