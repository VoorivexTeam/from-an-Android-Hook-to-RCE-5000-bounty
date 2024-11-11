package defpackage;

import defpackage.k70;
import defpackage.oa0;
import defpackage.qa0;
import defpackage.ta0;
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

/* loaded from: classes.dex */
public final class gb0 {
    private final Map<Method, hb0<?>> a = new ConcurrentHashMap();
    final k70.a b;
    final z70 c;
    final List<ta0.a> d;
    final List<qa0.a> e;
    final boolean f;

    /* loaded from: classes.dex */
    class a implements InvocationHandler {
        private final cb0 a = cb0.e();
        private final Object[] b = new Object[0];
        final /* synthetic */ Class c;

        a(Class cls) {
            this.c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.a.a(method)) {
                return this.a.a(method, this.c, obj, objArr);
            }
            hb0<?> a = gb0.this.a(method);
            if (objArr == null) {
                objArr = this.b;
            }
            return a.a(objArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private final cb0 a;

        @Nullable
        private k70.a b;

        @Nullable
        private z70 c;
        private final List<ta0.a> d;
        private final List<qa0.a> e;

        @Nullable
        private Executor f;
        private boolean g;

        public b() {
            this(cb0.e());
        }

        b(cb0 cb0Var) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = cb0Var;
        }

        public b a(d80 d80Var) {
            ib0.a(d80Var, "client == null");
            a((k70.a) d80Var);
            return this;
        }

        public b a(String str) {
            ib0.a(str, "baseUrl == null");
            a(z70.d(str));
            return this;
        }

        public b a(k70.a aVar) {
            ib0.a(aVar, "factory == null");
            this.b = aVar;
            return this;
        }

        public b a(ta0.a aVar) {
            List<ta0.a> list = this.d;
            ib0.a(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b a(z70 z70Var) {
            ib0.a(z70Var, "baseUrl == null");
            if ("".equals(z70Var.j().get(r0.size() - 1))) {
                this.c = z70Var;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + z70Var);
        }

        public gb0 a() {
            if (this.c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            k70.a aVar = this.b;
            if (aVar == null) {
                aVar = new d80();
            }
            k70.a aVar2 = aVar;
            Executor executor = this.f;
            if (executor == null) {
                executor = this.a.a();
            }
            Executor executor2 = executor;
            ArrayList arrayList = new ArrayList(this.e);
            arrayList.addAll(this.a.a(executor2));
            ArrayList arrayList2 = new ArrayList(this.d.size() + 1 + this.a.c());
            arrayList2.add(new oa0());
            arrayList2.addAll(this.d);
            arrayList2.addAll(this.a.b());
            return new gb0(aVar2, this.c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.g);
        }
    }

    gb0(k70.a aVar, z70 z70Var, List<ta0.a> list, List<qa0.a> list2, @Nullable Executor executor, boolean z) {
        this.b = aVar;
        this.c = z70Var;
        this.d = list;
        this.e = list2;
        this.f = z;
    }

    private void b(Class<?> cls) {
        cb0 e = cb0.e();
        for (Method method : cls.getDeclaredMethods()) {
            if (!e.a(method)) {
                a(method);
            }
        }
    }

    hb0<?> a(Method method) {
        hb0<?> hb0Var;
        hb0<?> hb0Var2 = this.a.get(method);
        if (hb0Var2 != null) {
            return hb0Var2;
        }
        synchronized (this.a) {
            hb0Var = this.a.get(method);
            if (hb0Var == null) {
                hb0Var = hb0.a(this, method);
                this.a.put(method, hb0Var);
            }
        }
        return hb0Var;
    }

    public <T> T a(Class<T> cls) {
        ib0.a((Class) cls);
        if (this.f) {
            b(cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public qa0<?, ?> a(Type type, Annotation[] annotationArr) {
        return a((qa0.a) null, type, annotationArr);
    }

    public qa0<?, ?> a(@Nullable qa0.a aVar, Type type, Annotation[] annotationArr) {
        ib0.a(type, "returnType == null");
        ib0.a(annotationArr, "annotations == null");
        int indexOf = this.e.indexOf(aVar) + 1;
        int size = this.e.size();
        for (int i = indexOf; i < size; i++) {
            qa0<?, ?> a2 = this.e.get(i).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.e.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> ta0<T, h80> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return a(null, type, annotationArr, annotationArr2);
    }

    public <T> ta0<j80, T> a(@Nullable ta0.a aVar, Type type, Annotation[] annotationArr) {
        ib0.a(type, "type == null");
        ib0.a(annotationArr, "annotations == null");
        int indexOf = this.d.indexOf(aVar) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            ta0<j80, T> ta0Var = (ta0<j80, T>) this.d.get(i).a(type, annotationArr, this);
            if (ta0Var != null) {
                return ta0Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> ta0<T, h80> a(@Nullable ta0.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        ib0.a(type, "type == null");
        ib0.a(annotationArr, "parameterAnnotations == null");
        ib0.a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.d.indexOf(aVar) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            ta0<T, h80> ta0Var = (ta0<T, h80>) this.d.get(i).a(type, annotationArr, annotationArr2, this);
            if (ta0Var != null) {
                return ta0Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> ta0<j80, T> b(Type type, Annotation[] annotationArr) {
        return a((ta0.a) null, type, annotationArr);
    }

    public <T> ta0<T, String> c(Type type, Annotation[] annotationArr) {
        ib0.a(type, "type == null");
        ib0.a(annotationArr, "annotations == null");
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            ta0<T, String> ta0Var = (ta0<T, String>) this.d.get(i).b(type, annotationArr, this);
            if (ta0Var != null) {
                return ta0Var;
            }
        }
        return oa0.d.a;
    }
}
