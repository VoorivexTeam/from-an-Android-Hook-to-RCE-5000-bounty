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

/* loaded from: classes.dex */
public class m extends Fragment {
    private final Handler Z = new Handler();
    private final Runnable a0 = new a();
    private final AdapterView.OnItemClickListener b0 = new b();
    ListAdapter c0;
    ListView d0;
    View e0;
    TextView f0;
    View g0;
    View h0;
    CharSequence i0;
    boolean j0;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = m.this.d0;
            listView.focusableViewAvailable(listView);
        }
    }

    /* loaded from: classes.dex */
    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            m.this.a((ListView) adapterView, view, i, j);
        }
    }

    private void a(boolean z, boolean z2) {
        g0();
        View view = this.g0;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.j0 == z) {
            return;
        }
        this.j0 = z;
        if (z) {
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(k(), R.anim.fade_out));
                this.h0.startAnimation(AnimationUtils.loadAnimation(k(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.h0.clearAnimation();
            }
            this.g0.setVisibility(8);
            this.h0.setVisibility(0);
            return;
        }
        if (z2) {
            view.startAnimation(AnimationUtils.loadAnimation(k(), R.anim.fade_in));
            this.h0.startAnimation(AnimationUtils.loadAnimation(k(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.h0.clearAnimation();
        }
        this.g0.setVisibility(0);
        this.h0.setVisibility(8);
    }

    private void g0() {
        if (this.d0 != null) {
            return;
        }
        View B = B();
        if (B == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (B instanceof ListView) {
            this.d0 = (ListView) B;
        } else {
            TextView textView = (TextView) B.findViewById(16711681);
            this.f0 = textView;
            if (textView == null) {
                this.e0 = B.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.g0 = B.findViewById(16711682);
            this.h0 = B.findViewById(16711683);
            View findViewById = B.findViewById(R.id.list);
            if (!(findViewById instanceof ListView)) {
                if (findViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) findViewById;
            this.d0 = listView;
            View view = this.e0;
            if (view == null) {
                CharSequence charSequence = this.i0;
                if (charSequence != null) {
                    this.f0.setText(charSequence);
                    listView = this.d0;
                    view = this.f0;
                }
            }
            listView.setEmptyView(view);
        }
        this.j0 = true;
        this.d0.setOnItemClickListener(this.b0);
        ListAdapter listAdapter = this.c0;
        if (listAdapter != null) {
            this.c0 = null;
            a(listAdapter);
        } else if (this.g0 != null) {
            a(false, false);
        }
        this.Z.post(this.a0);
    }

    @Override // androidx.fragment.app.Fragment
    public void O() {
        this.Z.removeCallbacks(this.a0);
        this.d0 = null;
        this.j0 = false;
        this.h0 = null;
        this.g0 = null;
        this.e0 = null;
        this.f0 = null;
        super.O();
    }

    @Override // androidx.fragment.app.Fragment
    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
        g0();
    }

    public void a(ListAdapter listAdapter) {
        boolean z = this.c0 != null;
        this.c0 = listAdapter;
        ListView listView = this.d0;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.j0 || z) {
                return;
            }
            a(true, B().getWindowToken() != null);
        }
    }

    public void a(ListView listView, View view, int i, long j) {
    }

    public ListView f0() {
        g0();
        return this.d0;
    }
}
