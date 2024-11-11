package p000;

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
import p000.bb0;
import p000.c80;
import p000.g80;
import p000.y70;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class eb0 {

    /* renamed from: a */
    private final Method f9975a;

    /* renamed from: b */
    private final z70 f9976b;

    /* renamed from: c */
    final String f9977c;

    /* renamed from: d */
    @Nullable
    private final String f9978d;

    /* renamed from: e */
    @Nullable
    private final y70 f9979e;

    /* renamed from: f */
    @Nullable
    private final b80 f9980f;

    /* renamed from: g */
    private final boolean f9981g;

    /* renamed from: h */
    private final boolean f9982h;

    /* renamed from: i */
    private final boolean f9983i;

    /* renamed from: j */
    private final bb0<?>[] f9984j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: eb0$a */
    /* loaded from: classes.dex */
    public static final class C2426a {

        /* renamed from: w */
        private static final Pattern f9985w = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: x */
        private static final Pattern f9986x = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        final gb0 f9987a;

        /* renamed from: b */
        final Method f9988b;

        /* renamed from: c */
        final Annotation[] f9989c;

        /* renamed from: d */
        final Annotation[][] f9990d;

        /* renamed from: e */
        final Type[] f9991e;

        /* renamed from: f */
        boolean f9992f;

        /* renamed from: g */
        boolean f9993g;

        /* renamed from: h */
        boolean f9994h;

        /* renamed from: i */
        boolean f9995i;

        /* renamed from: j */
        boolean f9996j;

        /* renamed from: k */
        boolean f9997k;

        /* renamed from: l */
        boolean f9998l;

        /* renamed from: m */
        boolean f9999m;

        /* renamed from: n */
        @Nullable
        String f10000n;

        /* renamed from: o */
        boolean f10001o;

        /* renamed from: p */
        boolean f10002p;

        /* renamed from: q */
        boolean f10003q;

        /* renamed from: r */
        @Nullable
        String f10004r;

        /* renamed from: s */
        @Nullable
        y70 f10005s;

        /* renamed from: t */
        @Nullable
        b80 f10006t;

        /* renamed from: u */
        @Nullable
        Set<String> f10007u;

        /* renamed from: v */
        @Nullable
        bb0<?>[] f10008v;

        C2426a(gb0 gb0Var, Method method) {
            this.f9987a = gb0Var;
            this.f9988b = method;
            this.f9989c = method.getAnnotations();
            this.f9991e = method.getGenericParameterTypes();
            this.f9990d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        private bb0<?> m11578a(int i, Type type, @Nullable Annotation[] annotationArr) {
            bb0<?> bb0Var = null;
            if (annotationArr != null) {
                for (Annotation annotation : annotationArr) {
                    bb0<?> m11579a = m11579a(i, type, annotationArr, annotation);
                    if (m11579a != null) {
                        if (bb0Var != null) {
                            throw ib0.m12429a(this.f9988b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        bb0Var = m11579a;
                    }
                }
            }
            if (bb0Var != null) {
                return bb0Var;
            }
            throw ib0.m12429a(this.f9988b, i, "No Retrofit annotation found.", new Object[0]);
        }

        @Nullable
        /* renamed from: a */
        private bb0<?> m11579a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof sc0) {
                m11584a(i, type);
                if (this.f9999m) {
                    throw ib0.m12429a(this.f9988b, i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f9995i) {
                    throw ib0.m12429a(this.f9988b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f9996j) {
                    throw ib0.m12429a(this.f9988b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f9997k) {
                    throw ib0.m12429a(this.f9988b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f9998l) {
                    throw ib0.m12429a(this.f9988b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f10004r != null) {
                    throw ib0.m12429a(this.f9988b, i, "@Url cannot be used with @%s URL", this.f10000n);
                }
                this.f9999m = true;
                if (type == z70.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new bb0.C0474o();
                }
                throw ib0.m12429a(this.f9988b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof nc0) {
                m11584a(i, type);
                if (this.f9996j) {
                    throw ib0.m12429a(this.f9988b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f9997k) {
                    throw ib0.m12429a(this.f9988b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f9998l) {
                    throw ib0.m12429a(this.f9988b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f9999m) {
                    throw ib0.m12429a(this.f9988b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f10004r == null) {
                    throw ib0.m12429a(this.f9988b, i, "@Path can only be used with relative url on @%s", this.f10000n);
                }
                this.f9995i = true;
                nc0 nc0Var = (nc0) annotation;
                String value = nc0Var.value();
                m11583a(i, value);
                return new bb0.C0469j(value, this.f9987a.m11988c(type, annotationArr), nc0Var.encoded());
            }
            if (annotation instanceof oc0) {
                m11584a(i, type);
                oc0 oc0Var = (oc0) annotation;
                String value2 = oc0Var.value();
                boolean encoded = oc0Var.encoded();
                Class<?> m12444c = ib0.m12444c(type);
                this.f9996j = true;
                if (!Iterable.class.isAssignableFrom(m12444c)) {
                    return m12444c.isArray() ? new bb0.C0470k(value2, this.f9987a.m11988c(m11580a(m12444c.getComponentType()), annotationArr), encoded).m3367a() : new bb0.C0470k(value2, this.f9987a.m11988c(type, annotationArr), encoded);
                }
                if (type instanceof ParameterizedType) {
                    return new bb0.C0470k(value2, this.f9987a.m11988c(ib0.m12433a(0, (ParameterizedType) type), annotationArr), encoded).m3369b();
                }
                throw ib0.m12429a(this.f9988b, i, m12444c.getSimpleName() + " must include generic type (e.g., " + m12444c.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof qc0) {
                m11584a(i, type);
                boolean encoded2 = ((qc0) annotation).encoded();
                Class<?> m12444c2 = ib0.m12444c(type);
                this.f9997k = true;
                if (!Iterable.class.isAssignableFrom(m12444c2)) {
                    return m12444c2.isArray() ? new bb0.C0472m(this.f9987a.m11988c(m11580a(m12444c2.getComponentType()), annotationArr), encoded2).m3367a() : new bb0.C0472m(this.f9987a.m11988c(type, annotationArr), encoded2);
                }
                if (type instanceof ParameterizedType) {
                    return new bb0.C0472m(this.f9987a.m11988c(ib0.m12433a(0, (ParameterizedType) type), annotationArr), encoded2).m3369b();
                }
                throw ib0.m12429a(this.f9988b, i, m12444c2.getSimpleName() + " must include generic type (e.g., " + m12444c2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof pc0) {
                m11584a(i, type);
                Class<?> m12444c3 = ib0.m12444c(type);
                this.f9998l = true;
                if (!Map.class.isAssignableFrom(m12444c3)) {
                    throw ib0.m12429a(this.f9988b, i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type m12443b = ib0.m12443b(type, m12444c3, Map.class);
                if (!(m12443b instanceof ParameterizedType)) {
                    throw ib0.m12429a(this.f9988b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) m12443b;
                Type m12433a = ib0.m12433a(0, parameterizedType);
                if (String.class == m12433a) {
                    return new bb0.C0471l(this.f9987a.m11988c(ib0.m12433a(1, parameterizedType), annotationArr), ((pc0) annotation).encoded());
                }
                throw ib0.m12429a(this.f9988b, i, "@QueryMap keys must be of type String: " + m12433a, new Object[0]);
            }
            if (annotation instanceof ec0) {
                m11584a(i, type);
                String value3 = ((ec0) annotation).value();
                Class<?> m12444c4 = ib0.m12444c(type);
                if (!Iterable.class.isAssignableFrom(m12444c4)) {
                    return m12444c4.isArray() ? new bb0.C0465f(value3, this.f9987a.m11988c(m11580a(m12444c4.getComponentType()), annotationArr)).m3367a() : new bb0.C0465f(value3, this.f9987a.m11988c(type, annotationArr));
                }
                if (type instanceof ParameterizedType) {
                    return new bb0.C0465f(value3, this.f9987a.m11988c(ib0.m12433a(0, (ParameterizedType) type), annotationArr)).m3369b();
                }
                throw ib0.m12429a(this.f9988b, i, m12444c4.getSimpleName() + " must include generic type (e.g., " + m12444c4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof fc0) {
                m11584a(i, type);
                Class<?> m12444c5 = ib0.m12444c(type);
                if (!Map.class.isAssignableFrom(m12444c5)) {
                    throw ib0.m12429a(this.f9988b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type m12443b2 = ib0.m12443b(type, m12444c5, Map.class);
                if (!(m12443b2 instanceof ParameterizedType)) {
                    throw ib0.m12429a(this.f9988b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) m12443b2;
                Type m12433a2 = ib0.m12433a(0, parameterizedType2);
                if (String.class == m12433a2) {
                    return new bb0.C0466g(this.f9987a.m11988c(ib0.m12433a(1, parameterizedType2), annotationArr));
                }
                throw ib0.m12429a(this.f9988b, i, "@HeaderMap keys must be of type String: " + m12433a2, new Object[0]);
            }
            if (annotation instanceof zb0) {
                m11584a(i, type);
                if (!this.f10002p) {
                    throw ib0.m12429a(this.f9988b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                zb0 zb0Var = (zb0) annotation;
                String value4 = zb0Var.value();
                boolean encoded3 = zb0Var.encoded();
                this.f9992f = true;
                Class<?> m12444c6 = ib0.m12444c(type);
                if (!Iterable.class.isAssignableFrom(m12444c6)) {
                    return m12444c6.isArray() ? new bb0.C0463d(value4, this.f9987a.m11988c(m11580a(m12444c6.getComponentType()), annotationArr), encoded3).m3367a() : new bb0.C0463d(value4, this.f9987a.m11988c(type, annotationArr), encoded3);
                }
                if (type instanceof ParameterizedType) {
                    return new bb0.C0463d(value4, this.f9987a.m11988c(ib0.m12433a(0, (ParameterizedType) type), annotationArr), encoded3).m3369b();
                }
                throw ib0.m12429a(this.f9988b, i, m12444c6.getSimpleName() + " must include generic type (e.g., " + m12444c6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ac0) {
                m11584a(i, type);
                if (!this.f10002p) {
                    throw ib0.m12429a(this.f9988b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> m12444c7 = ib0.m12444c(type);
                if (!Map.class.isAssignableFrom(m12444c7)) {
                    throw ib0.m12429a(this.f9988b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type m12443b3 = ib0.m12443b(type, m12444c7, Map.class);
                if (!(m12443b3 instanceof ParameterizedType)) {
                    throw ib0.m12429a(this.f9988b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) m12443b3;
                Type m12433a3 = ib0.m12433a(0, parameterizedType3);
                if (String.class == m12433a3) {
                    ta0 m11988c = this.f9987a.m11988c(ib0.m12433a(1, parameterizedType3), annotationArr);
                    this.f9992f = true;
                    return new bb0.C0464e(m11988c, ((ac0) annotation).encoded());
                }
                throw ib0.m12429a(this.f9988b, i, "@FieldMap keys must be of type String: " + m12433a3, new Object[0]);
            }
            if (!(annotation instanceof lc0)) {
                if (!(annotation instanceof mc0)) {
                    if (!(annotation instanceof xb0)) {
                        return null;
                    }
                    m11584a(i, type);
                    if (this.f10002p || this.f10003q) {
                        throw ib0.m12429a(this.f9988b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f9994h) {
                        throw ib0.m12429a(this.f9988b, i, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        ta0 m11984a = this.f9987a.m11984a(type, annotationArr, this.f9989c);
                        this.f9994h = true;
                        return new bb0.C0462c(m11984a);
                    } catch (RuntimeException e) {
                        throw ib0.m12431a(this.f9988b, e, i, "Unable to create @Body converter for %s", type);
                    }
                }
                m11584a(i, type);
                if (!this.f10003q) {
                    throw ib0.m12429a(this.f9988b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.f9993g = true;
                Class<?> m12444c8 = ib0.m12444c(type);
                if (!Map.class.isAssignableFrom(m12444c8)) {
                    throw ib0.m12429a(this.f9988b, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type m12443b4 = ib0.m12443b(type, m12444c8, Map.class);
                if (!(m12443b4 instanceof ParameterizedType)) {
                    throw ib0.m12429a(this.f9988b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) m12443b4;
                Type m12433a4 = ib0.m12433a(0, parameterizedType4);
                if (String.class == m12433a4) {
                    Type m12433a5 = ib0.m12433a(1, parameterizedType4);
                    if (c80.C0510b.class.isAssignableFrom(ib0.m12444c(m12433a5))) {
                        throw ib0.m12429a(this.f9988b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                    }
                    return new bb0.C0468i(this.f9987a.m11984a(m12433a5, annotationArr, this.f9989c), ((mc0) annotation).encoding());
                }
                throw ib0.m12429a(this.f9988b, i, "@PartMap keys must be of type String: " + m12433a4, new Object[0]);
            }
            m11584a(i, type);
            if (!this.f10003q) {
                throw ib0.m12429a(this.f9988b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            lc0 lc0Var = (lc0) annotation;
            this.f9993g = true;
            String value5 = lc0Var.value();
            Class<?> m12444c9 = ib0.m12444c(type);
            if (value5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(m12444c9)) {
                    if (m12444c9.isArray()) {
                        if (c80.C0510b.class.isAssignableFrom(m12444c9.getComponentType())) {
                            return bb0.C0473n.f2790a.m3367a();
                        }
                        throw ib0.m12429a(this.f9988b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (c80.C0510b.class.isAssignableFrom(m12444c9)) {
                        return bb0.C0473n.f2790a;
                    }
                    throw ib0.m12429a(this.f9988b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (c80.C0510b.class.isAssignableFrom(ib0.m12444c(ib0.m12433a(0, (ParameterizedType) type)))) {
                        return bb0.C0473n.f2790a.m3369b();
                    }
                    throw ib0.m12429a(this.f9988b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw ib0.m12429a(this.f9988b, i, m12444c9.getSimpleName() + " must include generic type (e.g., " + m12444c9.getSimpleName() + "<String>)", new Object[0]);
            }
            y70 m16589a = y70.m16589a("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", lc0Var.encoding());
            if (!Iterable.class.isAssignableFrom(m12444c9)) {
                if (!m12444c9.isArray()) {
                    if (c80.C0510b.class.isAssignableFrom(m12444c9)) {
                        throw ib0.m12429a(this.f9988b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new bb0.C0467h(m16589a, this.f9987a.m11984a(type, annotationArr, this.f9989c));
                }
                Class<?> m11580a = m11580a(m12444c9.getComponentType());
                if (c80.C0510b.class.isAssignableFrom(m11580a)) {
                    throw ib0.m12429a(this.f9988b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new bb0.C0467h(m16589a, this.f9987a.m11984a(m11580a, annotationArr, this.f9989c)).m3367a();
            }
            if (type instanceof ParameterizedType) {
                Type m12433a6 = ib0.m12433a(0, (ParameterizedType) type);
                if (c80.C0510b.class.isAssignableFrom(ib0.m12444c(m12433a6))) {
                    throw ib0.m12429a(this.f9988b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new bb0.C0467h(m16589a, this.f9987a.m11984a(m12433a6, annotationArr, this.f9989c)).m3369b();
            }
            throw ib0.m12429a(this.f9988b, i, m12444c9.getSimpleName() + " must include generic type (e.g., " + m12444c9.getSimpleName() + "<String>)", new Object[0]);
        }

        /* renamed from: a */
        private static Class<?> m11580a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: a */
        static Set<String> m11581a(String str) {
            Matcher matcher = f9985w.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: a */
        private y70 m11582a(String[] strArr) {
            y70.C3476a c3476a = new y70.C3476a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw ib0.m12430a(this.f9988b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.f10006t = b80.m3340a(trim);
                    } catch (IllegalArgumentException e) {
                        throw ib0.m12432a(this.f9988b, e, "Malformed content type: %s", trim);
                    }
                } else {
                    c3476a.m16599a(substring, trim);
                }
            }
            return c3476a.m16600a();
        }

        /* renamed from: a */
        private void m11583a(int i, String str) {
            if (!f9986x.matcher(str).matches()) {
                throw ib0.m12429a(this.f9988b, i, "@Path parameter name must match %s. Found: %s", f9985w.pattern(), str);
            }
            if (!this.f10007u.contains(str)) {
                throw ib0.m12429a(this.f9988b, i, "URL \"%s\" does not contain \"{%s}\".", this.f10004r, str);
            }
        }

        /* renamed from: a */
        private void m11584a(int i, Type type) {
            if (ib0.m12445d(type)) {
                throw ib0.m12429a(this.f9988b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* renamed from: a */
        private void m11585a(String str, String str2, boolean z) {
            String str3 = this.f10000n;
            if (str3 != null) {
                throw ib0.m12430a(this.f9988b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f10000n = str;
            this.f10001o = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (f9985w.matcher(substring).find()) {
                    throw ib0.m12430a(this.f9988b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f10004r = str2;
            this.f10007u = m11581a(str2);
        }

        /* renamed from: a */
        private void m11586a(Annotation annotation) {
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
                                m11585a(dc0Var.method(), dc0Var.path(), dc0Var.hasBody());
                                return;
                            } else {
                                if (annotation instanceof gc0) {
                                    String[] value3 = ((gc0) annotation).value();
                                    if (value3.length == 0) {
                                        throw ib0.m12430a(this.f9988b, "@Headers annotation is empty.", new Object[0]);
                                    }
                                    this.f10005s = m11582a(value3);
                                    return;
                                }
                                return;
                            }
                        }
                        value = ((hc0) annotation).value();
                        str = "OPTIONS";
                    }
                    m11585a(str2, value2, true);
                    return;
                }
                value = ((cc0) annotation).value();
                str = "HEAD";
            }
            m11585a(str, value, false);
        }

        /* renamed from: a */
        eb0 m11587a() {
            for (Annotation annotation : this.f9989c) {
                m11586a(annotation);
            }
            if (this.f10000n == null) {
                throw ib0.m12430a(this.f9988b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f10001o) {
                if (this.f10003q) {
                    throw ib0.m12430a(this.f9988b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f10002p) {
                    throw ib0.m12430a(this.f9988b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f9990d.length;
            this.f10008v = new bb0[length];
            for (int i = 0; i < length; i++) {
                this.f10008v[i] = m11578a(i, this.f9991e[i], this.f9990d[i]);
            }
            if (this.f10004r == null && !this.f9999m) {
                throw ib0.m12430a(this.f9988b, "Missing either @%s URL or @Url parameter.", this.f10000n);
            }
            if (!this.f10002p && !this.f10003q && !this.f10001o && this.f9994h) {
                throw ib0.m12430a(this.f9988b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (this.f10002p && !this.f9992f) {
                throw ib0.m12430a(this.f9988b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f10003q || this.f9993g) {
                return new eb0(this);
            }
            throw ib0.m12430a(this.f9988b, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    eb0(C2426a c2426a) {
        this.f9975a = c2426a.f9988b;
        this.f9976b = c2426a.f9987a.f10296c;
        this.f9977c = c2426a.f10000n;
        this.f9978d = c2426a.f10004r;
        this.f9979e = c2426a.f10005s;
        this.f9980f = c2426a.f10006t;
        this.f9981g = c2426a.f10001o;
        this.f9982h = c2426a.f10002p;
        this.f9983i = c2426a.f10003q;
        this.f9984j = c2426a.f10008v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static eb0 m11576a(gb0 gb0Var, Method method) {
        return new C2426a(gb0Var, method).m11587a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public g80 m11577a(Object[] objArr) {
        bb0<?>[] bb0VarArr = this.f9984j;
        int length = objArr.length;
        if (length != bb0VarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + bb0VarArr.length + ")");
        }
        db0 db0Var = new db0(this.f9977c, this.f9976b, this.f9978d, this.f9979e, this.f9980f, this.f9981g, this.f9982h, this.f9983i);
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            bb0VarArr[i].mo3368a(db0Var, objArr[i]);
        }
        g80.C2502a m11350a = db0Var.m11350a();
        m11350a.m11926a((Class<? super Class>) ya0.class, (Class) new ya0(this.f9975a, arrayList));
        return m11350a.m11932a();
    }
}
