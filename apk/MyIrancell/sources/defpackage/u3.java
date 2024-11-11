package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.content.a;
import defpackage.v3;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* loaded from: classes.dex */
public class u3 extends t3<Cursor> {
    final v3<Cursor>.a p;
    Uri q;
    String[] r;
    String s;
    String[] t;
    String u;
    Cursor v;
    e1 w;

    public u3(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.p = new v3.a();
        this.q = uri;
        this.r = strArr;
        this.s = str;
        this.t = strArr2;
        this.u = str2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.t3
    public Cursor A() {
        synchronized (this) {
            if (z()) {
                throw new f1();
            }
            this.w = new e1();
        }
        try {
            Cursor a = a.a(g().getContentResolver(), this.q, this.r, this.s, this.t, this.u, this.w);
            if (a != null) {
                try {
                    a.getCount();
                    a.registerContentObserver(this.p);
                } catch (RuntimeException e) {
                    a.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.w = null;
            }
            return a;
        } catch (Throwable th) {
            synchronized (this) {
                this.w = null;
                throw th;
            }
        }
    }

    @Override // defpackage.v3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(Cursor cursor) {
        if (j()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.v;
        this.v = cursor;
        if (k()) {
            super.b((u3) cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // defpackage.t3, defpackage.v3
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.r));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.t));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.u);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.h);
    }

    @Override // defpackage.t3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.v3
    public void p() {
        super.p();
        r();
        Cursor cursor = this.v;
        if (cursor != null && !cursor.isClosed()) {
            this.v.close();
        }
        this.v = null;
    }

    @Override // defpackage.v3
    protected void q() {
        Cursor cursor = this.v;
        if (cursor != null) {
            b(cursor);
        }
        if (w() || this.v == null) {
            f();
        }
    }

    @Override // defpackage.v3
    protected void r() {
        c();
    }

    @Override // defpackage.t3
    public void x() {
        super.x();
        synchronized (this) {
            if (this.w != null) {
                this.w.a();
            }
        }
    }
}
