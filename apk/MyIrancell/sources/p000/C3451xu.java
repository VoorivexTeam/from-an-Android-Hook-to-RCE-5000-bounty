package p000;

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

/* renamed from: xu */
/* loaded from: classes.dex */
public final class C3451xu {

    /* renamed from: c */
    private static final InterfaceC3275tu<String> f14073c = C3372vu.m16056a();

    /* renamed from: d */
    private static final InterfaceC3275tu<Boolean> f14074d = C3411wu.m16398a();

    /* renamed from: e */
    private static final b f14075e = new b(null);

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC3179ru<?>> f14076a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC3275tu<?>> f14077b = new HashMap();

    /* renamed from: xu$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC3098pu {
        a() {
        }

        @Override // p000.InterfaceC3098pu
        /* renamed from: a */
        public String mo14825a(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo14826a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        @Override // p000.InterfaceC3098pu
        /* renamed from: a */
        public void mo14826a(Object obj, Writer writer) {
            C3500yu c3500yu = new C3500yu(writer, C3451xu.this.f14076a, C3451xu.this.f14077b);
            c3500yu.m16662a(obj);
            c3500yu.m16664a();
        }
    }

    /* renamed from: xu$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC3275tu<Date> {

        /* renamed from: a */
        private static final DateFormat f14079a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f14079a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // p000.InterfaceC3275tu
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo15691a(Date date, InterfaceC3319uu interfaceC3319uu) {
            interfaceC3319uu.mo15852a(f14079a.format(date));
        }
    }

    public C3451xu() {
        m16516a(String.class, f14073c);
        m16516a(Boolean.class, f14074d);
        m16516a(Date.class, f14075e);
    }

    /* renamed from: a */
    public InterfaceC3098pu m16514a() {
        return new a();
    }

    /* renamed from: a */
    public <T> C3451xu m16515a(Class<T> cls, InterfaceC3179ru<? super T> interfaceC3179ru) {
        if (!this.f14076a.containsKey(cls)) {
            this.f14076a.put(cls, interfaceC3179ru);
            return this;
        }
        throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
    }

    /* renamed from: a */
    public <T> C3451xu m16516a(Class<T> cls, InterfaceC3275tu<? super T> interfaceC3275tu) {
        if (!this.f14077b.containsKey(cls)) {
            this.f14077b.put(cls, interfaceC3275tu);
            return this;
        }
        throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
    }
}
