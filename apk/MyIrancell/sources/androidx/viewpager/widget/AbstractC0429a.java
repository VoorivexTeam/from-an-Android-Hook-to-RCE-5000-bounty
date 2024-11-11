package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.viewpager.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0429a {

    /* renamed from: a */
    private final DataSetObservable f2630a = new DataSetObservable();

    /* renamed from: a */
    public abstract int mo3160a();

    /* renamed from: a */
    public int mo3161a(Object obj) {
        return -1;
    }

    /* renamed from: a */
    public CharSequence mo3162a(int i) {
        return null;
    }

    /* renamed from: a */
    public abstract Object mo3163a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public void mo3164a(DataSetObserver dataSetObserver) {
        this.f2630a.registerObserver(dataSetObserver);
    }

    /* renamed from: a */
    public void mo3165a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Deprecated
    /* renamed from: a */
    public void m3166a(View view) {
    }

    @Deprecated
    /* renamed from: a */
    public void m3167a(View view, int i, Object obj) {
    }

    /* renamed from: a */
    public void mo3168a(ViewGroup viewGroup) {
        m3166a((View) viewGroup);
    }

    /* renamed from: a */
    public abstract void mo3169a(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: a */
    public abstract boolean mo3170a(View view, Object obj);

    /* renamed from: b */
    public float mo3171b(int i) {
        return 1.0f;
    }

    /* renamed from: b */
    public Parcelable mo3172b() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m3173b(DataSetObserver dataSetObserver) {
        synchronized (this) {
        }
    }

    @Deprecated
    /* renamed from: b */
    public void m3174b(View view) {
    }

    /* renamed from: b */
    public void mo3175b(ViewGroup viewGroup) {
        m3174b((View) viewGroup);
    }

    /* renamed from: b */
    public void mo3176b(ViewGroup viewGroup, int i, Object obj) {
        m3167a((View) viewGroup, i, obj);
    }

    /* renamed from: c */
    public void mo3177c(DataSetObserver dataSetObserver) {
        this.f2630a.unregisterObserver(dataSetObserver);
    }
}
