package defpackage;

import defpackage.bb0;
import defpackage.c80;
import defpackage.g80;
import defpackage.y70;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class eb0 {
    private final Method a;
    private final z70 b;
    final String c;

    @Nullable
    private final String d;

    @Nullable
    private final y70 e;

    @Nullable
    private final b80 f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final bb0<?>[] j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        private static final Pattern w = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final Pattern x = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        final gb0 a;
        final Method b;
        final Annotation[] c;
        final Annotation[][] d;
        final Type[] e;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        boolean m;

        @Nullable
        String n;
        boolean o;
        boolean p;
        boolean q;

        @Nullable
        String r;

        @Nullable
        y70 s;

        @Nullable
        b80 t;

        @Nullable
        Set<String> u;

        @Nullable
        bb0<?>[] v;

        a(gb0 gb0Var, Method method) {
            this.a = gb0Var;
            this.b = method;
            this.c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        private bb0<?> a(int i, Type type, @Nullable Annotation[] annotationArr) {
            bb0<?> bb0Var = null;
            if (annotationArr != null) {
                for (Annotation annotation : annotationArr) {
                    bb0<?> a = a(i, type, annotationArr, annotation);
                    if (a != null) {
                        if (bb0Var != null) {
                            throw ib0.a(this.b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        bb0Var = a;
                    }
                }
            }
            if (bb0Var != null) {
                return bb0Var;
            }
            throw ib0.a(this.b, i, "No Retrofit annotation found.", new Object[0]);
        }

        @Nullable
        private bb0<?> a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof sc0) {
                a(i, type);
                if (this.m) {
                    throw ib0.a(this.b, i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.i) {
                    throw ib0.a(this.b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.j) {
                    throw ib0.a(this.b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.k) {
                    throw ib0.a(this.b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.l) {
                    throw ib0.a(this.b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.r != null) {
                    throw ib0.a(this.b, i, "@Url cannot be used with @%s URL", this.n);
                }
                this.m = true;
                if (type == z70.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new bb0.o();
                }
                throw ib0.a(this.b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof nc0) {
                a(i, type);
                if (this.j) {
                    throw ib0.a(this.b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.k) {
                    throw ib0.a(this.b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.l) {
                    throw ib0.a(this.b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.m) {
                    throw ib0.a(this.b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.r == null) {
                    throw ib0.a(this.b, i, "@Path can only be used with relative url on @%s", this.n);
                }
                this.i = true;
                nc0 nc0Var = (nc0) annotation;
                String value = nc0Var.value();
                a(i, value);
                return new bb0.j(value, this.a.c(type, annotationArr), nc0Var.encoded());
            }
            if (annotation instanceof oc0) {
                a(i, type);
                oc0 oc0Var = (oc0) annotation;
                String value2 = oc0Var.value();
                boolean encoded = oc0Var.encoded();
                Class<?> c = ib0.c(type);
                this.j = true;
                if (!Iterable.class.isAssignableFrom(c)) {
                    return c.isArray() ? new bb0.k(value2, this.a.c(a(c.getComponentType()), annotationArr), encoded).a() : new bb0.k(value2, this.a.c(type, annotationArr), encoded);
                }
                if (type instanceof ParameterizedType) {
                    return new bb0.k(value2, this.a.c(ib0.a(0, (ParameterizedType) type), annotationArr), encoded).b();
                }
                throw ib0.a(this.b, i, c.getSimpleName() + " must include generic type (e.g., " + c.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof qc0) {
                a(i, type);
                boolean encoded2 = ((qc0) annotation).encoded();
                Class<?> c2 = ib0.c(type);
                this.k = true;
                if (!Iterable.class.isAssignableFrom(c2)) {
                    return c2.isArray() ? new bb0.m(this.a.c(a(c2.getComponentType()), annotationArr), encoded2).a() : new bb0.m(this.a.c(type, annotationArr), encoded2);
                }
                if (type instanceof ParameterizedType) {
                    return new bb0.m(this.a.c(ib0.a(0, (ParameterizedType) type), annotationArr), encoded2).b();
                }
                throw ib0.a(this.b, i, c2.getSimpleName() + " must include generic type (e.g., " + c2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof pc0) {
                a(i, type);
                Class<?> c3 = ib0.c(type);
                this.l = true;
                if (!Map.class.isAssignableFrom(c3)) {
                    throw ib0.a(this.b, i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type b = ib0.b(type, c3, Map.class);
                if (!(b instanceof ParameterizedType)) {
                    throw ib0.a(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) b;
                Type a = ib0.a(0, parameterizedType);
                if (String.class == a) {
                    return new bb0.l(this.a.c(ib0.a(1, parameterizedType), annotationArr), ((pc0) annotation).encoded());
                }
                throw ib0.a(this.b, i, "@QueryMap keys must be of type String: " + a, new Object[0]);
            }
            if (annotation instanceof ec0) {
                a(i, type);
                String value3 = ((ec0) annotation).value();
                Class<?> c4 = ib0.c(type);
                if (!Iterable.class.isAssignableFrom(c4)) {
                    return c4.isArray() ? new bb0.f(value3, this.a.c(a(c4.getComponentType()), annotationArr)).a() : new bb0.f(value3, this.a.c(type, annotationArr));
                }
                if (type instanceof ParameterizedType) {
                    return new bb0.f(value3, this.a.c(ib0.a(0, (ParameterizedType) type), annotationArr)).b();
                }
                throw ib0.a(this.b, i, c4.getSimpleName() + " must include generic type (e.g., " + c4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof fc0) {
                a(i, type);
                Class<?> c5 = ib0.c(type);
                if (!Map.class.isAssignableFrom(c5)) {
                    throw ib0.a(this.b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type b2 = ib0.b(type, c5, Map.class);
                if (!(b2 instanceof ParameterizedType)) {
                    throw ib0.a(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) b2;
                Type a2 = ib0.a(0, parameterizedType2);
                if (String.class == a2) {
                    return new bb0.g(this.a.c(ib0.a(1, parameterizedType2), annotationArr));
                }
                throw ib0.a(this.b, i, "@HeaderMap keys must be of type String: " + a2, new Object[0]);
            }
            if (annotation instanceof zb0) {
                a(i, type);
                if (!this.p) {
                    throw ib0.a(this.b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                zb0 zb0Var = (zb0) annotation;
                String value4 = zb0Var.value();
                boolean encoded3 = zb0Var.encoded();
                this.f = true;
                Class<?> c6 = ib0.c(type);
                if (!Iterable.class.isAssignableFrom(c6)) {
                    return c6.isArray() ? new bb0.d(value4, this.a.c(a(c6.getComponentType()), annotationArr), encoded3).a() : new bb0.d(value4, this.a.c(type, annotationArr), encoded3);
                }
                if (type instanceof ParameterizedType) {
                    return new bb0.d(value4, this.a.c(ib0.a(0, (ParameterizedType) type), annotationArr), encoded3).b();
                }
                throw ib0.a(this.b, i, c6.getSimpleName() + " must include generic type (e.g., " + c6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ac0) {
                a(i, type);
                if (!this.p) {
                    throw ib0.a(this.b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> c7 = ib0.c(type);
                if (!Map.class.isAssignableFrom(c7)) {
                    throw ib0.a(this.b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type b3 = ib0.b(type, c7, Map.class);
                if (!(b3 instanceof ParameterizedType)) {
                    throw ib0.a(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) b3;
                Type a3 = ib0.a(0, parameterizedType3);
                if (String.class == a3) {
                    ta0 c8 = this.a.c(ib0.a(1, parameterizedType3), annotationArr);
                    this.f = true;
                    return new bb0.e(c8, ((ac0) annotation).encoded());
                }
                throw ib0.a(this.b, i, "@FieldMap keys must be of type String: " + a3, new Object[0]);
            }
            if (!(annotation instanceof lc0)) {
                if (!(annotation instanceof mc0)) {
                    if (!(annotation instanceof xb0)) {
                        return null;
                    }
                    a(i, type);
                    if (this.p || this.q) {
                        throw ib0.a(this.b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.h) {
                        throw ib0.a(this.b, i, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        ta0 a4 = this.a.a(type, annotationArr, this.c);
                        this.h = true;
                        return new bb0.c(a4);
                    } catch (RuntimeException e) {
                        throw ib0.a(this.b, e, i, "Unable to create @Body converter for %s", type);
                    }
                }
                a(i, type);
                if (!this.q) {
                    throw ib0.a(this.b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.g = true;
                Class<?> c9 = ib0.c(type);
                if (!Map.class.isAssignableFrom(c9)) {
                    throw ib0.a(this.b, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type b4 = ib0.b(type, c9, Map.class);
                if (!(b4 instanceof ParameterizedType)) {
                    throw ib0.a(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) b4;
                Type a5 = ib0.a(0, parameterizedType4);
                if (String.class == a5) {
                    Type a6 = ib0.a(1, parameterizedType4);
                    if (c80.b.class.isAssignableFrom(ib0.c(a6))) {
                        throw ib0.a(this.b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                    }
                    return new bb0.i(this.a.a(a6, annotationArr, this.c), ((mc0) annotation).encoding());
                }
                throw ib0.a(this.b, i, "@PartMap keys must be of type String: " + a5, new Object[0]);
            }
            a(i, type);
            if (!this.q) {
                throw ib0.a(this.b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            lc0 lc0Var = (lc0) annotation;
            this.g = true;
            String value5 = lc0Var.value();
            Class<?> c10 = ib0.c(type);
            if (value5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(c10)) {
                    if (c10.isArray()) {
                        if (c80.b.class.isAssignableFrom(c10.getComponentType())) {
                            return bb0.n.a.a();
                        }
                        throw ib0.a(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (c80.b.class.isAssignableFrom(c10)) {
                        return bb0.n.a;
                    }
                    throw ib0.a(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (c80.b.class.isAssignableFrom(ib0.c(ib0.a(0, (ParameterizedType) type)))) {
                        return bb0.n.a.b();
                    }
                    throw ib0.a(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw ib0.a(this.b, i, c10.getSimpleName() + " must include generic type (e.g., " + c10.getSimpleName() + "<String>)", new Object[0]);
            }
            y70 a7 = y70.a("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", lc0Var.encoding());
            if (!Iterable.class.isAssignableFrom(c10)) {
                if (!c10.isArray()) {
                    if (c80.b.class.isAssignableFrom(c10)) {
                        throw ib0.a(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new bb0.h(a7, this.a.a(type, annotationArr, this.c));
                }
                Class<?> a8 = a(c10.getComponentType());
                if (c80.b.class.isAssignableFrom(a8)) {
                    throw ib0.a(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new bb0.h(a7, this.a.a(a8, annotationArr, this.c)).a();
            }
            if (type instanceof ParameterizedType) {
                Type a9 = ib0.a(0, (ParameterizedType) type);
                if (c80.b.class.isAssignableFrom(ib0.c(a9))) {
                    throw ib0.a(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new bb0.h(a7, this.a.a(a9, annotationArr, this.c)).b();
            }
            throw ib0.a(this.b, i, c10.getSimpleName() + " must include generic type (e.g., " + c10.getSimpleName() + "<String>)", new Object[0]);
        }

        private static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        static Set<String> a(String str) {
            Matcher matcher = w.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private y70 a(String[] strArr) {
            y70.a aVar = new y70.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw ib0.a(this.b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.t = b80.a(trim);
                    } catch (IllegalArgumentException e) {
                        throw ib0.a(this.b, e, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.a(substring, trim);
                }
            }
            return aVar.a();
        }

        private void a(int i, String str) {
            if (!x.matcher(str).matches()) {
                throw ib0.a(this.b, i, "@Path parameter name must match %s. Found: %s", w.pattern(), str);
            }
            if (!this.u.contains(str)) {
                throw ib0.a(this.b, i, "URL \"%s\" does not contain \"{%s}\".", this.r, str);
            }
        }

        private void a(int i, Type type) {
            if (ib0.d(type)) {
                throw ib0.a(this.b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        private void a(String str, String str2, boolean z) {
            String str3 = this.n;
            if (str3 != null) {
                throw ib0.a(this.b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.n = str;
            this.o = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (w.matcher(substring).find()) {
                    throw ib0.a(this.b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.r = str2;
            this.u = a(str2);
        }

        private void a(Annotation annotation) {
            String value;
            String str;
            String value2;
            String str2;
            if (annotation instanceof yb0) {
                value = ((yb0) annotation).value();
                str = "DELETE";
            } else if (annotation instanceof bc0) {
                value = ((bc0) annotation).value();
                str = "GET";
            } else {
                if (!(annotation instanceof cc0)) {
                    if (annotation instanceof ic0) {
                        value2 = ((ic0) annotation).value();
                        str2 = "PATCH";
                    } else if (annotation instanceof jc0) {
                        value2 = ((jc0) annotation).value();
                        str2 = "POST";
                    } else if (annotation instanceof kc0) {
                        value2 = ((kc0) annotation).value();
                        str2 = "PUT";
                    } else {
                        if (!(annotation instanceof hc0)) {
                            if (annotation instanceof dc0) {
                                dc0 dc0Var = (dc0) annotation;
                                a(dc0Var.method(), dc0Var.path(), dc0Var.hasBody());
                                return;
                            } else {
                                if (annotation instanceof gc0) {
                                    String[] value3 = ((gc0) annotation).value();
                                    if (value3.length == 0) {
                                        throw ib0.a(this.b, "@Headers annotation is empty.", new Object[0]);
                                    }
                                    this.s = a(value3);
                                    return;
                                }
                                return;
                            }
                        }
                        value = ((hc0) annotation).value();
                        str = "OPTIONS";
                    }
                    a(str2, value2, true);
                    return;
                }
                value = ((cc0) annotation).value();
                str = "HEAD";
            }
            a(str, value, false);
        }

        eb0 a() {
            for (Annotation annotation : this.c) {
                a(annotation);
            }
            if (this.n == null) {
                throw ib0.a(this.b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.o) {
                if (this.q) {
                    throw ib0.a(this.b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.p) {
                    throw ib0.a(this.b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.d.length;
            this.v = new bb0[length];
            for (int i = 0; i < length; i++) {
                this.v[i] = a(i, this.e[i], this.d[i]);
            }
            if (this.r == null && !this.m) {
                throw ib0.a(this.b, "Missing either @%s URL or @Url parameter.", this.n);
            }
            if (!this.p && !this.q && !this.o && this.h) {
                throw ib0.a(this.b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (this.p && !this.f) {
                throw ib0.a(this.b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.q || this.g) {
                return new eb0(this);
            }
            throw ib0.a(this.b, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    eb0(a aVar) {
        this.a = aVar.b;
        this.b = aVar.a.c;
        this.c = aVar.n;
        this.d = aVar.r;
        this.e = aVar.s;
        this.f = aVar.t;
        this.g = aVar.o;
        this.h = aVar.p;
        this.i = aVar.q;
        this.j = aVar.v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static eb0 a(gb0 gb0Var, Method method) {
        return new a(gb0Var, method).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g80 a(Object[] objArr) {
        bb0<?>[] bb0VarArr = this.j;
        int length = objArr.length;
        if (length != bb0VarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + bb0VarArr.length + ")");
        }
        db0 db0Var = new db0(this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i);
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            bb0VarArr[i].a(db0Var, objArr[i]);
        }
        g80.a a2 = db0Var.a();
        a2.a((Class<? super Class>) ya0.class, (Class) new ya0(this.a, arrayList));
        return a2.a();
    }
}
