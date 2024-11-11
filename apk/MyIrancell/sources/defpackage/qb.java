package defpackage;

import com.bumptech.glide.load.g;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class qb extends Exception {
    private static final StackTraceElement[] g = new StackTraceElement[0];
    private final List<Throwable> b;
    private g c;
    private com.bumptech.glide.load.a d;
    private Class<?> e;
    private String f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements Appendable {
        private final Appendable b;
        private boolean c = true;

        a(Appendable appendable) {
            this.b = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) {
            if (this.c) {
                this.c = false;
                this.b.append("  ");
            }
            this.c = c == '\n';
            this.b.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence a = a(charSequence);
            append(a, 0, a.length());
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) {
            CharSequence a = a(charSequence);
            boolean z = false;
            if (this.c) {
                this.c = false;
                this.b.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.c = z;
            this.b.append(a, i, i2);
            return this;
        }
    }

    public qb(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public qb(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public qb(String str, List<Throwable> list) {
        this.f = str;
        setStackTrace(g);
        this.b = list;
    }

    private void a(Appendable appendable) {
        a(this, appendable);
        a(a(), new a(appendable));
    }

    private static void a(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void a(Throwable th, List<Throwable> list) {
        if (!(th instanceof qb)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((qb) th).a().iterator();
        while (it.hasNext()) {
            a(it.next(), list);
        }
    }

    private static void a(List<Throwable> list, Appendable appendable) {
        try {
            b(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof qb) {
                ((qb) th).a(appendable);
            } else {
                a(th, appendable);
            }
            i = i2;
        }
    }

    public List<Throwable> a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(g gVar, com.bumptech.glide.load.a aVar) {
        a(gVar, aVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(g gVar, com.bumptech.glide.load.a aVar, Class<?> cls) {
        this.c = gVar;
        this.d = aVar;
        this.e = cls;
    }

    public void a(Exception exc) {
    }

    public void a(String str) {
        List<Throwable> b = b();
        int size = b.size();
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
            b.get(i);
            i = i2;
        }
    }

    public List<Throwable> b() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
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
        sb.append(this.f);
        sb.append(this.e != null ? ", " + this.e : "");
        sb.append(this.d != null ? ", " + this.d : "");
        sb.append(this.c != null ? ", " + this.c : "");
        List<Throwable> b = b();
        if (b.isEmpty()) {
            return sb.toString();
        }
        if (b.size() == 1) {
            str = "\nThere was 1 cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(b.size());
            str = " causes:";
        }
        sb.append(str);
        for (Throwable th : b) {
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
        a(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        a(printWriter);
    }
}
