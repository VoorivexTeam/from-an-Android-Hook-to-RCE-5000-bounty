package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.content.C0236a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import p000.C3329v3;

/* renamed from: u3 */
/* loaded from: classes.dex */
public class C3285u3 extends AbstractC3233t3<Cursor> {

    /* renamed from: p */
    final C3329v3<Cursor>.a f13390p;

    /* renamed from: q */
    Uri f13391q;

    /* renamed from: r */
    String[] f13392r;

    /* renamed from: s */
    String f13393s;

    /* renamed from: t */
    String[] f13394t;

    /* renamed from: u */
    String f13395u;

    /* renamed from: v */
    Cursor f13396v;

    /* renamed from: w */
    C2413e1 f13397w;

    public C3285u3(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f13390p = new C3329v3.a();
        this.f13391q = uri;
        this.f13392r = strArr;
        this.f13393s = str;
        this.f13394t = strArr2;
        this.f13395u = str2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC3233t3
    /* renamed from: A */
    public Cursor mo6458A() {
        synchronized (this) {
            if (m15506z()) {
                throw new C2453f1();
            }
            this.f13397w = new C2413e1();
        }
        try {
            Cursor m1457a = C0236a.m1457a(m15907g().getContentResolver(), this.f13391q, this.f13392r, this.f13393s, this.f13394t, this.f13395u, this.f13397w);
            if (m1457a != null) {
                try {
                    m1457a.getCount();
                    m1457a.registerContentObserver(this.f13390p);
                } catch (RuntimeException e) {
                    m1457a.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.f13397w = null;
            }
            return m1457a;
        } catch (Throwable th) {
            synchronized (this) {
                this.f13397w = null;
                throw th;
            }
        }
    }

    @Override // p000.C3329v3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo15718b(Cursor cursor) {
        if (m15910j()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f13396v;
        this.f13396v = cursor;
        if (m15911k()) {
            super.mo15718b((C3285u3) cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // p000.AbstractC3233t3, p000.C3329v3
    @Deprecated
    /* renamed from: a */
    public void mo15498a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo15498a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f13391q);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f13392r));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f13393s);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f13394t));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f13395u);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f13396v);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f13550h);
    }

    @Override // p000.AbstractC3233t3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo15501c(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.C3329v3
    /* renamed from: p */
    public void mo15719p() {
        super.mo15719p();
        mo15720r();
        Cursor cursor = this.f13396v;
        if (cursor != null && !cursor.isClosed()) {
            this.f13396v.close();
        }
        this.f13396v = null;
    }

    @Override // p000.C3329v3
    /* renamed from: q */
    protected void mo6460q() {
        Cursor cursor = this.f13396v;
        if (cursor != null) {
            mo15718b(cursor);
        }
        if (m15918w() || this.f13396v == null) {
            m15906f();
        }
    }

    @Override // p000.C3329v3
    /* renamed from: r */
    protected void mo15720r() {
        m15903c();
    }

    @Override // p000.AbstractC3233t3
    /* renamed from: x */
    public void mo15504x() {
        super.mo15504x();
        synchronized (this) {
            if (this.f13397w != null) {
                this.f13397w.m11517a();
            }
        }
    }
}
