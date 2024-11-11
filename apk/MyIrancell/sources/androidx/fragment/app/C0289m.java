package androidx.fragment.app;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

/* renamed from: androidx.fragment.app.m */
/* loaded from: classes.dex */
public class C0289m extends Fragment {

    /* renamed from: Z */
    private final Handler f1861Z = new Handler();

    /* renamed from: a0 */
    private final Runnable f1862a0 = new a();

    /* renamed from: b0 */
    private final AdapterView.OnItemClickListener f1863b0 = new b();

    /* renamed from: c0 */
    ListAdapter f1864c0;

    /* renamed from: d0 */
    ListView f1865d0;

    /* renamed from: e0 */
    View f1866e0;

    /* renamed from: f0 */
    TextView f1867f0;

    /* renamed from: g0 */
    View f1868g0;

    /* renamed from: h0 */
    View f1869h0;

    /* renamed from: i0 */
    CharSequence f1870i0;

    /* renamed from: j0 */
    boolean f1871j0;

    /* renamed from: androidx.fragment.app.m$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = C0289m.this.f1865d0;
            listView.focusableViewAvailable(listView);
        }
    }

    /* renamed from: androidx.fragment.app.m$b */
    /* loaded from: classes.dex */
    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C0289m.this.m2000a((ListView) adapterView, view, i, j);
        }
    }

    /* renamed from: a */
    private void m1997a(boolean z, boolean z2) {
        m1998g0();
        View view = this.f1868g0;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f1871j0 == z) {
            return;
        }
        this.f1871j0 = z;
        if (z) {
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(m1706k(), R.anim.fade_out));
                this.f1869h0.startAnimation(AnimationUtils.loadAnimation(m1706k(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.f1869h0.clearAnimation();
            }
            this.f1868g0.setVisibility(8);
            this.f1869h0.setVisibility(0);
            return;
        }
        if (z2) {
            view.startAnimation(AnimationUtils.loadAnimation(m1706k(), R.anim.fade_in));
            this.f1869h0.startAnimation(AnimationUtils.loadAnimation(m1706k(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f1869h0.clearAnimation();
        }
        this.f1868g0.setVisibility(0);
        this.f1869h0.setVisibility(8);
    }

    /* renamed from: g0 */
    private void m1998g0() {
        if (this.f1865d0 != null) {
            return;
        }
        View m1618B = m1618B();
        if (m1618B == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (m1618B instanceof ListView) {
            this.f1865d0 = (ListView) m1618B;
        } else {
            TextView textView = (TextView) m1618B.findViewById(16711681);
            this.f1867f0 = textView;
            if (textView == null) {
                this.f1866e0 = m1618B.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f1868g0 = m1618B.findViewById(16711682);
            this.f1869h0 = m1618B.findViewById(16711683);
            View findViewById = m1618B.findViewById(R.id.list);
            if (!(findViewById instanceof ListView)) {
                if (findViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) findViewById;
            this.f1865d0 = listView;
            View view = this.f1866e0;
            if (view == null) {
                CharSequence charSequence = this.f1870i0;
                if (charSequence != null) {
                    this.f1867f0.setText(charSequence);
                    listView = this.f1865d0;
                    view = this.f1867f0;
                }
            }
            listView.setEmptyView(view);
        }
        this.f1871j0 = true;
        this.f1865d0.setOnItemClickListener(this.f1863b0);
        ListAdapter listAdapter = this.f1864c0;
        if (listAdapter != null) {
            this.f1864c0 = null;
            m1999a(listAdapter);
        } else if (this.f1868g0 != null) {
            m1997a(false, false);
        }
        this.f1861Z.post(this.f1862a0);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: O */
    public void mo1631O() {
        this.f1861Z.removeCallbacks(this.f1862a0);
        this.f1865d0 = null;
        this.f1871j0 = false;
        this.f1869h0 = null;
        this.f1868g0 = null;
        this.f1866e0 = null;
        this.f1867f0 = null;
        super.mo1631O();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a */
    public void mo1662a(View view, Bundle bundle) {
        super.mo1662a(view, bundle);
        m1998g0();
    }

    /* renamed from: a */
    public void m1999a(ListAdapter listAdapter) {
        boolean z = this.f1864c0 != null;
        this.f1864c0 = listAdapter;
        ListView listView = this.f1865d0;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.f1871j0 || z) {
                return;
            }
            m1997a(true, m1618B().getWindowToken() != null);
        }
    }

    /* renamed from: a */
    public void m2000a(ListView listView, View view, int i, long j) {
    }

    /* renamed from: f0 */
    public ListView m2001f0() {
        m1998g0();
        return this.f1865d0;
    }
}
