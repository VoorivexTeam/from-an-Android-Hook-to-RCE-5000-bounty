package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import defpackage.e1;
import defpackage.f1;

/* loaded from: classes.dex */
public final class a {
    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, e1 e1Var) {
        Object b;
        if (Build.VERSION.SDK_INT < 16) {
            if (e1Var != null) {
                e1Var.d();
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        }
        if (e1Var != null) {
            try {
                b = e1Var.b();
            } catch (Exception e) {
                if (e instanceof OperationCanceledException) {
                    throw new f1();
                }
                throw e;
            }
        } else {
            b = null;
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) b);
    }
}
