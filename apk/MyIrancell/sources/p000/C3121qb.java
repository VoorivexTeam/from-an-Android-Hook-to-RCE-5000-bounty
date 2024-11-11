package p000;

import com.bumptech.glide.load.EnumC0567a;
import com.bumptech.glide.load.InterfaceC0573g;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: qb */
/* loaded from: classes.dex */
public final class C3121qb extends Exception {

    /* renamed from: g */
    private static final StackTraceElement[] f12771g = new StackTraceElement[0];

    /* renamed from: b */
    private final List<Throwable> f12772b;

    /* renamed from: c */
    private InterfaceC0573g f12773c;

    /* renamed from: d */
    private EnumC0567a f12774d;

    /* renamed from: e */
    private Class<?> f12775e;

    /* renamed from: f */
    private String f12776f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qb$a */
    /* loaded from: classes.dex */
    public static final class a implements Appendable {

        /* renamed from: b */
        private final Appendable f12777b;

        /* renamed from: c */
        private boolean f12778c = true;

        a(Appendable appendable) {
            this.f12777b = appendable;
        }

        /* renamed from: a */
        private CharSequence m15052a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) {
            if (this.f12778c) {
                this.f12778c = false;
                this.f12777b.append("  ");
            }
            this.f12778c = c == '\n';
            this.f12777b.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence m15052a = m15052a(charSequence);
            append(m15052a, 0, m15052a.length());
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) {
            CharSequence m15052a = m15052a(charSequence);
            boolean z = false;
            if (this.f12778c) {
                this.f12778c = false;
                this.f12777b.append("  ");
            }
            if (m15052a.length() > 0 && m15052a.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.f12778c = z;
            this.f12777b.append(m15052a, i, i2);
            return this;
        }
    }

    public C3121qb(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public C3121qb(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public C3121qb(String str, List<Throwable> list) {
        this.f12776f = str;
        setStackTrace(f12771g);
        this.f12772b = list;
    }

    /* renamed from: a */
    private void m15041a(Appendable appendable) {
        m15042a(this, appendable);
        m15044a(m15046a(), new a(appendable));
    }

    /* renamed from: a */
    private static void m15042a(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    private void m15043a(Throwable th, List<Throwable> list) {
        if (!(th instanceof C3121qb)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((C3121qb) th).m15046a().iterator();
        while (it.hasNext()) {
            m15043a(it.next(), list);
        }
    }

    /* renamed from: a */
    private static void m15044a(List<Throwable> list, Appendable appendable) {
        try {
            m15045b(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static void m15045b(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof C3121qb) {
                ((C3121qb) th).m15041a(appendable);
            } else {
                m15042a(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: a */
    public List<Throwable> m15046a() {
        return this.f12772b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15047a(InterfaceC0573g interfaceC0573g, EnumC0567a enumC0567a) {
        m15048a(interfaceC0573g, enumC0567a, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15048a(InterfaceC0573g interfaceC0573g, EnumC0567a enumC0567a, Class<?> cls) {
        this.f12773c = interfaceC0573g;
        this.f12774d = enumC0567a;
        this.f12775e = cls;
    }

    /* renamed from: a */
    public void m15049a(Exception exc) {
    }

    /* renamed from: a */
    public void m15050a(String str) {
        List<Throwable> m15051b = m15051b();
        int size = m15051b.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            sb.toString();
            m15051b.get(i);
            i = i2;
        }
    }

    /* renamed from: b */
    public List<Throwable> m15051b() {
        ArrayList arrayList = new ArrayList();
        m15043a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f12776f);
        sb.append(this.f12775e != null ? ", " + this.f12775e : "");
        sb.append(this.f12774d != null ? ", " + this.f12774d : "");
        sb.append(this.f12773c != null ? ", " + this.f12773c : "");
        List<Throwable> m15051b = m15051b();
        if (m15051b.isEmpty()) {
            return sb.toString();
        }
        if (m15051b.size() == 1) {
            str = "\nThere was 1 cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(m15051b.size());
            str = " causes:";
        }
        sb.append(str);
        for (Throwable th : m15051b) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m15041a(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m15041a(printWriter);
    }
}
