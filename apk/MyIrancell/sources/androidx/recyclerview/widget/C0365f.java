package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes.dex */
class C0365f {

    /* renamed from: b */
    int f2345b;

    /* renamed from: c */
    int f2346c;

    /* renamed from: d */
    int f2347d;

    /* renamed from: e */
    int f2348e;

    /* renamed from: h */
    boolean f2351h;

    /* renamed from: i */
    boolean f2352i;

    /* renamed from: a */
    boolean f2344a = true;

    /* renamed from: f */
    int f2349f = 0;

    /* renamed from: g */
    int f2350g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public View m2838a(RecyclerView.C0349v c0349v) {
        View m2608d = c0349v.m2608d(this.f2346c);
        this.f2346c += this.f2347d;
        return m2608d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m2839a(RecyclerView.C0353z c0353z) {
        int i = this.f2346c;
        return i >= 0 && i < c0353z.m2627a();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f2345b + ", mCurrentPosition=" + this.f2346c + ", mItemDirection=" + this.f2347d + ", mLayoutDirection=" + this.f2348e + ", mStartLine=" + this.f2349f + ", mEndLine=" + this.f2350g + '}';
    }
}
