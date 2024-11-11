package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.AbstractC0282f;
import androidx.fragment.app.AbstractC0285i;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C0565j;
import com.bumptech.glide.ComponentCallbacks2C0558c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: og */
/* loaded from: classes.dex */
public class C3034og implements Handler.Callback {

    /* renamed from: f */
    private static final b f12474f = new a();

    /* renamed from: a */
    private volatile C0565j f12475a;

    /* renamed from: b */
    final Map<FragmentManager, FragmentC2988ng> f12476b = new HashMap();

    /* renamed from: c */
    final Map<AbstractC0282f, C3165rg> f12477c = new HashMap();

    /* renamed from: d */
    private final Handler f12478d;

    /* renamed from: e */
    private final b f12479e;

    /* renamed from: og$a */
    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // p000.C3034og.b
        /* renamed from: a */
        public C0565j mo14527a(ComponentCallbacks2C0558c componentCallbacks2C0558c, InterfaceC2859kg interfaceC2859kg, InterfaceC3084pg interfaceC3084pg, Context context) {
            return new C0565j(componentCallbacks2C0558c, interfaceC2859kg, interfaceC3084pg, context);
        }
    }

    /* renamed from: og$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        C0565j mo14527a(ComponentCallbacks2C0558c componentCallbacks2C0558c, InterfaceC2859kg interfaceC2859kg, InterfaceC3084pg interfaceC3084pg, Context context);
    }

    public C3034og(b bVar) {
        new C0500c0();
        new C0500c0();
        new Bundle();
        this.f12479e = bVar == null ? f12474f : bVar;
        this.f12478d = new Handler(Looper.getMainLooper(), this);
    }

    @Deprecated
    /* renamed from: a */
    private C0565j m14515a(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        FragmentC2988ng m14517a = m14517a(fragmentManager, fragment, z);
        C0565j m14331b = m14517a.m14331b();
        if (m14331b != null) {
            return m14331b;
        }
        C0565j mo14527a = this.f12479e.mo14527a(ComponentCallbacks2C0558c.m3866b(context), m14517a.m14328a(), m14517a.m14332c(), context);
        m14517a.m14330a(mo14527a);
        return mo14527a;
    }

    /* renamed from: a */
    private C0565j m14516a(Context context, AbstractC0282f abstractC0282f, androidx.fragment.app.Fragment fragment, boolean z) {
        C3165rg m14518a = m14518a(abstractC0282f, fragment, z);
        C0565j m15270g0 = m14518a.m15270g0();
        if (m15270g0 != null) {
            return m15270g0;
        }
        C0565j mo14527a = this.f12479e.mo14527a(ComponentCallbacks2C0558c.m3866b(context), m14518a.m15269f0(), m14518a.m15271h0(), context);
        m14518a.m15267a(mo14527a);
        return mo14527a;
    }

    /* renamed from: a */
    private FragmentC2988ng m14517a(FragmentManager fragmentManager, Fragment fragment, boolean z) {
        FragmentC2988ng fragmentC2988ng = (FragmentC2988ng) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (fragmentC2988ng == null && (fragmentC2988ng = this.f12476b.get(fragmentManager)) == null) {
            fragmentC2988ng = new FragmentC2988ng();
            fragmentC2988ng.m14329a(fragment);
            if (z) {
                fragmentC2988ng.m14328a().m11367b();
            }
            this.f12476b.put(fragmentManager, fragmentC2988ng);
            fragmentManager.beginTransaction().add(fragmentC2988ng, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f12478d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return fragmentC2988ng;
    }

    /* renamed from: a */
    private C3165rg m14518a(AbstractC0282f abstractC0282f, androidx.fragment.app.Fragment fragment, boolean z) {
        C3165rg c3165rg = (C3165rg) abstractC0282f.mo1809a("com.bumptech.glide.manager");
        if (c3165rg == null && (c3165rg = this.f12477c.get(abstractC0282f)) == null) {
            c3165rg = new C3165rg();
            c3165rg.m15268b(fragment);
            if (z) {
                c3165rg.m15269f0().m11367b();
            }
            this.f12477c.put(abstractC0282f, c3165rg);
            AbstractC0285i mo1810a = abstractC0282f.mo1810a();
            mo1810a.mo1757a(c3165rg, "com.bumptech.glide.manager");
            mo1810a.mo1765b();
            this.f12478d.obtainMessage(2, abstractC0282f).sendToTarget();
        }
        return c3165rg;
    }

    /* renamed from: b */
    private C0565j m14519b(Context context) {
        if (this.f12475a == null) {
            synchronized (this) {
                if (this.f12475a == null) {
                    this.f12475a = this.f12479e.mo14527a(ComponentCallbacks2C0558c.m3866b(context.getApplicationContext()), new C2431eg(), new C2814jg(), context.getApplicationContext());
                }
            }
        }
        return this.f12475a;
    }

    @TargetApi(17)
    /* renamed from: c */
    private static void m14520c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: d */
    private static boolean m14521d(Activity activity) {
        return !activity.isFinishing();
    }

    /* renamed from: a */
    public C0565j m14522a(Activity activity) {
        if (C2861ki.m13730b()) {
            return m14523a(activity.getApplicationContext());
        }
        m14520c(activity);
        return m14515a(activity, activity.getFragmentManager(), (Fragment) null, m14521d(activity));
    }

    /* renamed from: a */
    public C0565j m14523a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (C2861ki.m13734c() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m14524a((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                return m14522a((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                return m14523a(((ContextWrapper) context).getBaseContext());
            }
        }
        return m14519b(context);
    }

    /* renamed from: a */
    public C0565j m14524a(FragmentActivity fragmentActivity) {
        if (C2861ki.m13730b()) {
            return m14523a(fragmentActivity.getApplicationContext());
        }
        m14520c(fragmentActivity);
        return m14516a(fragmentActivity, fragmentActivity.m1738e(), (androidx.fragment.app.Fragment) null, m14521d(fragmentActivity));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: b */
    public FragmentC2988ng m14525b(Activity activity) {
        return m14517a(activity.getFragmentManager(), (Fragment) null, m14521d(activity));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C3165rg m14526b(FragmentActivity fragmentActivity) {
        return m14518a(fragmentActivity.m1738e(), (androidx.fragment.app.Fragment) null, m14521d(fragmentActivity));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        int i = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i == 1) {
            obj = (FragmentManager) message.obj;
            map = this.f12476b;
        } else {
            if (i != 2) {
                z = false;
                obj2 = null;
                if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                    String str = "Failed to remove expected request manager fragment, manager: " + obj2;
                }
                return z;
            }
            obj = (AbstractC0282f) message.obj;
            map = this.f12477c;
        }
        Object obj4 = obj;
        obj3 = map.remove(obj);
        obj2 = obj4;
        if (z) {
            String str2 = "Failed to remove expected request manager fragment, manager: " + obj2;
        }
        return z;
    }
}
