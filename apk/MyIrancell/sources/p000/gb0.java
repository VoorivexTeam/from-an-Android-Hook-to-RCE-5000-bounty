package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p000.k70;
import p000.oa0;
import p000.qa0;
import p000.ta0;

/* loaded from: classes.dex */
public final class gb0 {

    /* renamed from: a */
    private final Map<Method, hb0<?>> f10294a = new ConcurrentHashMap();

    /* renamed from: b */
    final k70.InterfaceC2850a f10295b;

    /* renamed from: c */
    final z70 f10296c;

    /* renamed from: d */
    final List<ta0.AbstractC3255a> f10297d;

    /* renamed from: e */
    final List<qa0.AbstractC3120a> f10298e;

    /* renamed from: f */
    final boolean f10299f;

    /* renamed from: gb0$a */
    /* loaded from: classes.dex */
    class C2506a implements InvocationHandler {

        /* renamed from: a */
        private final cb0 f10300a = cb0.m3642e();

        /* renamed from: b */
        private final Object[] f10301b = new Object[0];

        /* renamed from: c */
        final /* synthetic */ Class f10302c;

        C2506a(Class cls) {
            this.f10302c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.f10300a.mo3646a(method)) {
                return this.f10300a.mo3643a(method, this.f10302c, obj, objArr);
            }
            hb0<?> m11980a = gb0.this.m11980a(method);
            if (objArr == null) {
                objArr = this.f10301b;
            }
            return m11980a.mo12197a(objArr);
        }
    }

    /* renamed from: gb0$b */
    /* loaded from: classes.dex */
    public static final class C2507b {

        /* renamed from: a */
        private final cb0 f10304a;

        /* renamed from: b */
        @Nullable
        private k70.InterfaceC2850a f10305b;

        /* renamed from: c */
        @Nullable
        private z70 f10306c;

        /* renamed from: d */
        private final List<ta0.AbstractC3255a> f10307d;

        /* renamed from: e */
        private final List<qa0.AbstractC3120a> f10308e;

        /* renamed from: f */
        @Nullable
        private Executor f10309f;

        /* renamed from: g */
        private boolean f10310g;

        public C2507b() {
            this(cb0.m3642e());
        }

        C2507b(cb0 cb0Var) {
            this.f10307d = new ArrayList();
            this.f10308e = new ArrayList();
            this.f10304a = cb0Var;
        }

        /* renamed from: a */
        public C2507b m11989a(d80 d80Var) {
            ib0.m12428a(d80Var, "client == null");
            m11991a((k70.InterfaceC2850a) d80Var);
            return this;
        }

        /* renamed from: a */
        public C2507b m11990a(String str) {
            ib0.m12428a(str, "baseUrl == null");
            m11993a(z70.m16802d(str));
            return this;
        }

        /* renamed from: a */
        public C2507b m11991a(k70.InterfaceC2850a interfaceC2850a) {
            ib0.m12428a(interfaceC2850a, "factory == null");
            this.f10305b = interfaceC2850a;
            return this;
        }

        /* renamed from: a */
        public C2507b m11992a(ta0.AbstractC3255a abstractC3255a) {
            List<ta0.AbstractC3255a> list = this.f10307d;
            ib0.m12428a(abstractC3255a, "factory == null");
            list.add(abstractC3255a);
            return this;
        }

        /* renamed from: a */
        public C2507b m11993a(z70 z70Var) {
            ib0.m12428a(z70Var, "baseUrl == null");
            if ("".equals(z70Var.m16815j().get(r0.size() - 1))) {
                this.f10306c = z70Var;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + z70Var);
        }

        /* renamed from: a */
        public gb0 m11994a() {
            if (this.f10306c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            k70.InterfaceC2850a interfaceC2850a = this.f10305b;
            if (interfaceC2850a == null) {
                interfaceC2850a = new d80();
            }
            k70.InterfaceC2850a interfaceC2850a2 = interfaceC2850a;
            Executor executor = this.f10309f;
            if (executor == null) {
                executor = this.f10304a.mo3645a();
            }
            Executor executor2 = executor;
            ArrayList arrayList = new ArrayList(this.f10308e);
            arrayList.addAll(this.f10304a.mo3644a(executor2));
            ArrayList arrayList2 = new ArrayList(this.f10307d.size() + 1 + this.f10304a.mo3648c());
            arrayList2.add(new oa0());
            arrayList2.addAll(this.f10307d);
            arrayList2.addAll(this.f10304a.mo3647b());
            return new gb0(interfaceC2850a2, this.f10306c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f10310g);
        }
    }

    gb0(k70.InterfaceC2850a interfaceC2850a, z70 z70Var, List<ta0.AbstractC3255a> list, List<qa0.AbstractC3120a> list2, @Nullable Executor executor, boolean z) {
        this.f10295b = interfaceC2850a;
        this.f10296c = z70Var;
        this.f10297d = list;
        this.f10298e = list2;
        this.f10299f = z;
    }

    /* renamed from: b */
    private void m11979b(Class<?> cls) {
        cb0 m3642e = cb0.m3642e();
        for (Method method : cls.getDeclaredMethods()) {
            if (!m3642e.mo3646a(method)) {
                m11980a(method);
            }
        }
    }

    /* renamed from: a */
    hb0<?> m11980a(Method method) {
        hb0<?> hb0Var;
        hb0<?> hb0Var2 = this.f10294a.get(method);
        if (hb0Var2 != null) {
            return hb0Var2;
        }
        synchronized (this.f10294a) {
            hb0Var = this.f10294a.get(method);
            if (hb0Var == null) {
                hb0Var = hb0.m12196a(this, method);
                this.f10294a.put(method, hb0Var);
            }
        }
        return hb0Var;
    }

    /* renamed from: a */
    public <T> T m11981a(Class<T> cls) {
        ib0.m12437a((Class) cls);
        if (this.f10299f) {
            m11979b(cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C2506a(cls));
    }

    /* renamed from: a */
    public qa0<?, ?> m11982a(Type type, Annotation[] annotationArr) {
        return m11983a((qa0.AbstractC3120a) null, type, annotationArr);
    }

    /* renamed from: a */
    public qa0<?, ?> m11983a(@Nullable qa0.AbstractC3120a abstractC3120a, Type type, Annotation[] annotationArr) {
        ib0.m12428a(type, "returnType == null");
        ib0.m12428a(annotationArr, "annotations == null");
        int indexOf = this.f10298e.indexOf(abstractC3120a) + 1;
        int size = this.f10298e.size();
        for (int i = indexOf; i < size; i++) {
            qa0<?, ?> mo15040a = this.f10298e.get(i).mo15040a(type, annotationArr, this);
            if (mo15040a != null) {
                return mo15040a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (abstractC3120a != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f10298e.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f10298e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f10298e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public <T> ta0<T, h80> m11984a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m11986a(null, type, annotationArr, annotationArr2);
    }

    /* renamed from: a */
    public <T> ta0<j80, T> m11985a(@Nullable ta0.AbstractC3255a abstractC3255a, Type type, Annotation[] annotationArr) {
        ib0.m12428a(type, "type == null");
        ib0.m12428a(annotationArr, "annotations == null");
        int indexOf = this.f10297d.indexOf(abstractC3255a) + 1;
        int size = this.f10297d.size();
        for (int i = indexOf; i < size; i++) {
            ta0<j80, T> ta0Var = (ta0<j80, T>) this.f10297d.get(i).mo132a(type, annotationArr, this);
            if (ta0Var != null) {
                return ta0Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (abstractC3255a != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f10297d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f10297d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f10297d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public <T> ta0<T, h80> m11986a(@Nullable ta0.AbstractC3255a abstractC3255a, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        ib0.m12428a(type, "type == null");
        ib0.m12428a(annotationArr, "parameterAnnotations == null");
        ib0.m12428a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f10297d.indexOf(abstractC3255a) + 1;
        int size = this.f10297d.size();
        for (int i = indexOf; i < size; i++) {
            ta0<T, h80> ta0Var = (ta0<T, h80>) this.f10297d.get(i).mo13441a(type, annotationArr, annotationArr2, this);
            if (ta0Var != null) {
                return ta0Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (abstractC3255a != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f10297d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f10297d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f10297d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public <T> ta0<j80, T> m11987b(Type type, Annotation[] annotationArr) {
        return m11985a((ta0.AbstractC3255a) null, type, annotationArr);
    }

    /* renamed from: c */
    public <T> ta0<T, String> m11988c(Type type, Annotation[] annotationArr) {
        ib0.m12428a(type, "type == null");
        ib0.m12428a(annotationArr, "annotations == null");
        int size = this.f10297d.size();
        for (int i = 0; i < size; i++) {
            ta0<T, String> ta0Var = (ta0<T, String>) this.f10297d.get(i).m15628b(type, annotationArr, this);
            if (ta0Var != null) {
                return ta0Var;
            }
        }
        return oa0.C3026d.f12450a;
    }
}
