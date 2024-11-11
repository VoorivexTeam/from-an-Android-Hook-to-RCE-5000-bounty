package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.TextView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: qx */
/* loaded from: classes.dex */
public abstract class AbstractAsyncTaskC3143qx extends AsyncTask<Object, Object, Object> {

    /* renamed from: a */
    private final WeakReference<TextView> f12844a;

    /* renamed from: b */
    private final WeakReference<C3544zw> f12845b;

    /* renamed from: c */
    private final Collection<Spannable> f12846c = new ArrayList();

    /* renamed from: d */
    private final Collection<String[]> f12847d = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractAsyncTaskC3143qx(TextView textView, C3544zw c3544zw) {
        this.f12844a = new WeakReference<>(textView);
        this.f12845b = new WeakReference<>(c3544zw);
    }

    /* renamed from: a */
    public static void m15149a(TextView textView, AbstractC2914ly abstractC2914ly, C3544zw c3544zw, Context context) {
        try {
            if (abstractC2914ly instanceof C3455xy) {
                new AsyncTaskC3226sx(textView, (C3455xy) abstractC2914ly, c3544zw, context).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                new AsyncTaskC3182rx(textView, (C3455xy) abstractC2914ly, c3544zw).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
            } else if (abstractC2914ly instanceof C3006ny) {
                new AsyncTaskC3101px(textView, ((C3006ny) abstractC2914ly).m14399d(), c3544zw, context).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
            } else if (abstractC2914ly instanceof C2832jy) {
                String m13524c = ((C2832jy) abstractC2914ly).m13524c();
                new AsyncTaskC3101px(textView, m13524c, c3544zw, context).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                new AsyncTaskC3062ox(textView, m13524c, c3544zw, context).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
            }
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m15150a(String str, Collection<String> collection) {
        if (str == null || str.isEmpty()) {
            return;
        }
        collection.add(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m15151a(Collection<String> collection, Collection<String> collection2) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        boolean z = true;
        StringBuilder sb = new StringBuilder();
        for (String str : collection) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        collection2.add(sb.toString());
    }

    /* renamed from: a */
    abstract void mo14667a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m15152a(String str, String str2, String[] strArr, String str3) {
        StringBuilder sb;
        int i;
        StringBuilder sb2 = new StringBuilder();
        if (str2 != null) {
            sb2.append(str2);
            sb2.append(' ');
        }
        int length = sb2.length();
        boolean z = true;
        for (String str4 : strArr) {
            if (z) {
                sb2.append(str4);
                z = false;
            } else {
                sb2.append(" [");
                sb2.append(str4);
                sb2.append(']');
            }
        }
        int length2 = sb2.length();
        String sb3 = sb2.toString();
        SpannableString spannableString = new SpannableString(sb3 + "\n\n");
        if (str3 != null) {
            if (str3.startsWith("HTTP://")) {
                sb = new StringBuilder();
                sb.append("http");
                i = 4;
            } else {
                if (str3.startsWith("HTTPS://")) {
                    sb = new StringBuilder();
                    sb.append("https");
                    i = 5;
                }
                spannableString.setSpan(new URLSpan(str3), length, length2, 33);
            }
            sb.append(str3.substring(i));
            str3 = sb.toString();
            spannableString.setSpan(new URLSpan(str3), length, length2, 33);
        }
        this.f12846c.add(spannableString);
        this.f12847d.add(new String[]{str, sb3});
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object... objArr) {
        try {
            mo14667a();
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Object obj) {
        TextView textView = this.f12844a.get();
        if (textView != null) {
            Iterator<Spannable> it = this.f12846c.iterator();
            while (it.hasNext()) {
                textView.append(it.next());
            }
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C3544zw c3544zw = this.f12845b.get();
        if (c3544zw != null) {
            for (String[] strArr : this.f12847d) {
                c3544zw.m16965a(strArr[0], strArr[1]);
            }
        }
    }
}
