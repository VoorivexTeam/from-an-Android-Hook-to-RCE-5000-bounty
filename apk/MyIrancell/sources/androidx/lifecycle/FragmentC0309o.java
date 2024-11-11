package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0299e;

/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
public class FragmentC0309o extends Fragment {

    /* renamed from: b */
    private a f1920b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.o$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void m2066a();

        /* renamed from: b */
        void m2067b();

        void onResume();
    }

    /* renamed from: a */
    public static void m2061a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0309o(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    private void m2062a(AbstractC0299e.a aVar) {
        ComponentCallbacks2 activity = getActivity();
        if (activity instanceof InterfaceC0303i) {
            ((InterfaceC0303i) activity).mo1356a().m2050a(aVar);
        } else if (activity instanceof InterfaceC0301g) {
            AbstractC0299e mo1356a = ((InterfaceC0301g) activity).mo1356a();
            if (mo1356a instanceof C0302h) {
                ((C0302h) mo1356a).m2050a(aVar);
            }
        }
    }

    /* renamed from: a */
    private void m2063a(a aVar) {
        if (aVar != null) {
            aVar.m2067b();
        }
    }

    /* renamed from: b */
    private void m2064b(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    /* renamed from: c */
    private void m2065c(a aVar) {
        if (aVar != null) {
            aVar.m2066a();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m2063a(this.f1920b);
        m2062a(AbstractC0299e.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m2062a(AbstractC0299e.a.ON_DESTROY);
        this.f1920b = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m2062a(AbstractC0299e.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m2064b(this.f1920b);
        m2062a(AbstractC0299e.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m2065c(this.f1920b);
        m2062a(AbstractC0299e.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m2062a(AbstractC0299e.a.ON_STOP);
    }
}
