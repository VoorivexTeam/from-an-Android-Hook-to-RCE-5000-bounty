package defpackage;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class xu {
    private static final tu<String> c = vu.a();
    private static final tu<Boolean> d = wu.a();
    private static final b e = new b(null);
    private final Map<Class<?>, ru<?>> a = new HashMap();
    private final Map<Class<?>, tu<?>> b = new HashMap();

    /* loaded from: classes.dex */
    class a implements pu {
        a() {
        }

        @Override // defpackage.pu
        public String a(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        @Override // defpackage.pu
        public void a(Object obj, Writer writer) {
            yu yuVar = new yu(writer, xu.this.a, xu.this.b);
            yuVar.a(obj);
            yuVar.a();
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements tu<Date> {
        private static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // defpackage.tu
        public void a(Date date, uu uuVar) {
            uuVar.a(a.format(date));
        }
    }

    public xu() {
        a(String.class, c);
        a(Boolean.class, d);
        a(Date.class, e);
    }

    public pu a() {
        return new a();
    }

    public <T> xu a(Class<T> cls, ru<? super T> ruVar) {
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, ruVar);
            return this;
        }
        throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
    }

    public <T> xu a(Class<T> cls, tu<? super T> tuVar) {
        if (!this.b.containsKey(cls)) {
            this.b.put(cls, tuVar);
            return this;
        }
        throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
    }
}
