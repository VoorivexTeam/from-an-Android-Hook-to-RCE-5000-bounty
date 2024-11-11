package defpackage;

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

/* loaded from: classes.dex */
public abstract class qx extends AsyncTask<Object, Object, Object> {
    private final WeakReference<TextView> a;
    private final WeakReference<zw> b;
    private final Collection<Spannable> c = new ArrayList();
    private final Collection<String[]> d = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public qx(TextView textView, zw zwVar) {
        this.a = new WeakReference<>(textView);
        this.b = new WeakReference<>(zwVar);
    }

    public static void a(TextView textView, ly lyVar, zw zwVar, Context context) {
        try {
            if (lyVar instanceof xy) {
                new sx(textView, (xy) lyVar, zwVar, context).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                new rx(textView, (xy) lyVar, zwVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
            } else if (lyVar instanceof ny) {
                new px(textView, ((ny) lyVar).d(), zwVar, context).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
            } else if (lyVar instanceof jy) {
                String c = ((jy) lyVar).c();
                new px(textView, c, zwVar, context).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                new ox(textView, c, zwVar, context).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
            }
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, Collection<String> collection) {
        if (str == null || str.isEmpty()) {
            return;
        }
        collection.add(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Collection<String> collection, Collection<String> collection2) {
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

    abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2, String[] strArr, String str3) {
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
        this.c.add(spannableString);
        this.d.add(new String[]{str, sb3});
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object... objArr) {
        try {
            a();
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Object obj) {
        TextView textView = this.a.get();
        if (textView != null) {
            Iterator<Spannable> it = this.c.iterator();
            while (it.hasNext()) {
                textView.append(it.next());
            }
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        zw zwVar = this.b.get();
        if (zwVar != null) {
            for (String[] strArr : this.d) {
                zwVar.a(strArr[0], strArr[1]);
            }
        }
    }
}
