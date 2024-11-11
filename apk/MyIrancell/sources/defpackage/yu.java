package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class yu implements su, uu {
    private yu a = null;
    private boolean b = true;
    private final JsonWriter c;
    private final Map<Class<?>, ru<?>> d;
    private final Map<Class<?>, tu<?>> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yu(Writer writer, Map<Class<?>, ru<?>> map, Map<Class<?>, tu<?>> map2) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
    }

    private void b() {
        if (!this.b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        yu yuVar = this.a;
        if (yuVar != null) {
            yuVar.b();
            this.a.b = false;
            this.a = null;
            this.c.endObject();
        }
    }

    @Override // defpackage.su
    public /* bridge */ /* synthetic */ su a(String str, int i) {
        a(str, i);
        return this;
    }

    @Override // defpackage.su
    public /* bridge */ /* synthetic */ su a(String str, long j) {
        a(str, j);
        return this;
    }

    @Override // defpackage.su
    public /* bridge */ /* synthetic */ su a(String str, Object obj) {
        a(str, obj);
        return this;
    }

    @Override // defpackage.uu
    public /* bridge */ /* synthetic */ uu a(String str) {
        a(str);
        return this;
    }

    @Override // defpackage.uu
    public /* bridge */ /* synthetic */ uu a(boolean z) {
        a(z);
        return this;
    }

    public yu a(int i) {
        b();
        this.c.value(i);
        return this;
    }

    public yu a(long j) {
        b();
        this.c.value(j);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public yu a(Object obj) {
        if (obj == null) {
            this.c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        }
        int i = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
                this.c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        a((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new qu(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.c.endObject();
                return this;
            }
            ru<?> ruVar = this.d.get(obj.getClass());
            if (ruVar != null) {
                this.c.beginObject();
                ruVar.a(obj, this);
                this.c.endObject();
                return this;
            }
            tu<?> tuVar = this.e.get(obj.getClass());
            if (tuVar != null) {
                tuVar.a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                a(((Enum) obj).name());
                return this;
            }
            throw new qu("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
        if (obj instanceof byte[]) {
            a((byte[]) obj);
            return this;
        }
        this.c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                this.c.value(r7[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                a(jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                this.c.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                this.c.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                a(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                a(objArr[i]);
                i++;
            }
        }
        this.c.endArray();
        return this;
    }

    @Override // defpackage.uu
    public yu a(String str) {
        b();
        this.c.value(str);
        return this;
    }

    @Override // defpackage.su
    public yu a(String str, int i) {
        b();
        this.c.name(str);
        a(i);
        return this;
    }

    @Override // defpackage.su
    public yu a(String str, long j) {
        b();
        this.c.name(str);
        a(j);
        return this;
    }

    @Override // defpackage.su
    public yu a(String str, Object obj) {
        b();
        this.c.name(str);
        if (obj == null) {
            this.c.nullValue();
            return this;
        }
        a(obj);
        return this;
    }

    @Override // defpackage.uu
    public yu a(boolean z) {
        b();
        this.c.value(z);
        return this;
    }

    public yu a(byte[] bArr) {
        b();
        if (bArr == null) {
            this.c.nullValue();
        } else {
            this.c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        b();
        this.c.flush();
    }
}
