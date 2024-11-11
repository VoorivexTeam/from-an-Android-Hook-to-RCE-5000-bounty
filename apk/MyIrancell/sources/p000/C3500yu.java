package p000;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: yu */
/* loaded from: classes.dex */
final class C3500yu implements InterfaceC3223su, InterfaceC3319uu {

    /* renamed from: a */
    private C3500yu f14282a = null;

    /* renamed from: b */
    private boolean f14283b = true;

    /* renamed from: c */
    private final JsonWriter f14284c;

    /* renamed from: d */
    private final Map<Class<?>, InterfaceC3179ru<?>> f14285d;

    /* renamed from: e */
    private final Map<Class<?>, InterfaceC3275tu<?>> f14286e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3500yu(Writer writer, Map<Class<?>, InterfaceC3179ru<?>> map, Map<Class<?>, InterfaceC3275tu<?>> map2) {
        this.f14284c = new JsonWriter(writer);
        this.f14285d = map;
        this.f14286e = map2;
    }

    /* renamed from: b */
    private void m16659b() {
        if (!this.f14283b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        C3500yu c3500yu = this.f14282a;
        if (c3500yu != null) {
            c3500yu.m16659b();
            this.f14282a.f14283b = false;
            this.f14282a = null;
            this.f14284c.endObject();
        }
    }

    @Override // p000.InterfaceC3223su
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC3223su mo15455a(String str, int i) {
        mo15455a(str, i);
        return this;
    }

    @Override // p000.InterfaceC3223su
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC3223su mo15456a(String str, long j) {
        mo15456a(str, j);
        return this;
    }

    @Override // p000.InterfaceC3223su
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC3223su mo15457a(String str, Object obj) {
        mo15457a(str, obj);
        return this;
    }

    @Override // p000.InterfaceC3319uu
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC3319uu mo15852a(String str) {
        mo15852a(str);
        return this;
    }

    @Override // p000.InterfaceC3319uu
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC3319uu mo15853a(boolean z) {
        mo15853a(z);
        return this;
    }

    /* renamed from: a */
    public C3500yu m16660a(int i) {
        m16659b();
        this.f14284c.value(i);
        return this;
    }

    /* renamed from: a */
    public C3500yu m16661a(long j) {
        m16659b();
        this.f14284c.value(j);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C3500yu m16662a(Object obj) {
        if (obj == null) {
            this.f14284c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f14284c.value((Number) obj);
            return this;
        }
        int i = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f14284c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m16662a(it.next());
                }
                this.f14284c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f14284c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        mo15457a((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new C3140qu(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.f14284c.endObject();
                return this;
            }
            InterfaceC3179ru<?> interfaceC3179ru = this.f14285d.get(obj.getClass());
            if (interfaceC3179ru != null) {
                this.f14284c.beginObject();
                interfaceC3179ru.mo3695a(obj, this);
                this.f14284c.endObject();
                return this;
            }
            InterfaceC3275tu<?> interfaceC3275tu = this.f14286e.get(obj.getClass());
            if (interfaceC3275tu != null) {
                interfaceC3275tu.mo15691a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                mo15852a(((Enum) obj).name());
                return this;
            }
            throw new C3140qu("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
        if (obj instanceof byte[]) {
            m16663a((byte[]) obj);
            return this;
        }
        this.f14284c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                this.f14284c.value(r7[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                m16661a(jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                this.f14284c.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                this.f14284c.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                m16662a(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                m16662a(objArr[i]);
                i++;
            }
        }
        this.f14284c.endArray();
        return this;
    }

    @Override // p000.InterfaceC3319uu
    /* renamed from: a */
    public C3500yu mo15852a(String str) {
        m16659b();
        this.f14284c.value(str);
        return this;
    }

    @Override // p000.InterfaceC3223su
    /* renamed from: a */
    public C3500yu mo15455a(String str, int i) {
        m16659b();
        this.f14284c.name(str);
        m16660a(i);
        return this;
    }

    @Override // p000.InterfaceC3223su
    /* renamed from: a */
    public C3500yu mo15456a(String str, long j) {
        m16659b();
        this.f14284c.name(str);
        m16661a(j);
        return this;
    }

    @Override // p000.InterfaceC3223su
    /* renamed from: a */
    public C3500yu mo15457a(String str, Object obj) {
        m16659b();
        this.f14284c.name(str);
        if (obj == null) {
            this.f14284c.nullValue();
            return this;
        }
        m16662a(obj);
        return this;
    }

    @Override // p000.InterfaceC3319uu
    /* renamed from: a */
    public C3500yu mo15853a(boolean z) {
        m16659b();
        this.f14284c.value(z);
        return this;
    }

    /* renamed from: a */
    public C3500yu m16663a(byte[] bArr) {
        m16659b();
        if (bArr == null) {
            this.f14284c.nullValue();
        } else {
            this.f14284c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m16664a() {
        m16659b();
        this.f14284c.flush();
    }
}
