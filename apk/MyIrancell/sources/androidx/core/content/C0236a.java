package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import p000.C2413e1;
import p000.C2453f1;

/* renamed from: androidx.core.content.a */
/* loaded from: classes.dex */
public final class C0236a {
    /* renamed from: a */
    public static Cursor m1457a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C2413e1 c2413e1) {
        Object m11518b;
        if (Build.VERSION.SDK_INT < 16) {
            if (c2413e1 != null) {
                c2413e1.m11520d();
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        }
        if (c2413e1 != null) {
            try {
                m11518b = c2413e1.m11518b();
            } catch (Exception e) {
                if (e instanceof OperationCanceledException) {
                    throw new C2453f1();
                }
                throw e;
            }
        } else {
            m11518b = null;
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) m11518b);
    }
}
