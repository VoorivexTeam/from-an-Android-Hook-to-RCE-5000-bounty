package defpackage;

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
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.f;
import androidx.fragment.app.i;
import com.bumptech.glide.c;
import com.bumptech.glide.j;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class og implements Handler.Callback {
    private static final b f = new a();
    private volatile j a;
    final Map<FragmentManager, ng> b = new HashMap();
    final Map<f, rg> c = new HashMap();
    private final Handler d;
    private final b e;

    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // og.b
        public j a(c cVar, kg kgVar, pg pgVar, Context context) {
            return new j(cVar, kgVar, pgVar, context);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        j a(c cVar, kg kgVar, pg pgVar, Context context);
    }

    public og(b bVar) {
        new c0();
        new c0();
        new Bundle();
        this.e = bVar == null ? f : bVar;
        this.d = new Handler(Looper.getMainLooper(), this);
    }

    @Deprecated
    private j a(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        ng a2 = a(fragmentManager, fragment, z);
        j b2 = a2.b();
        if (b2 != null) {
            return b2;
        }
        j a3 = this.e.a(c.b(context), a2.a(), a2.c(), context);
        a2.a(a3);
        return a3;
    }

    private j a(Context context, f fVar, androidx.fragment.app.Fragment fragment, boolean z) {
        rg a2 = a(fVar, fragment, z);
        j g0 = a2.g0();
        if (g0 != null) {
            return g0;
        }
        j a3 = this.e.a(c.b(context), a2.f0(), a2.h0(), context);
        a2.a(a3);
        return a3;
    }

    private ng a(FragmentManager fragmentManager, Fragment fragment, boolean z) {
        ng ngVar = (ng) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (ngVar == null && (ngVar = this.b.get(fragmentManager)) == null) {
            ngVar = new ng();
            ngVar.a(fragment);
            if (z) {
                ngVar.a().b();
            }
            this.b.put(fragmentManager, ngVar);
            fragmentManager.beginTransaction().add(ngVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return ngVar;
    }

    private rg a(f fVar, androidx.fragment.app.Fragment fragment, boolean z) {
        rg rgVar = (rg) fVar.a("com.bumptech.glide.manager");
        if (rgVar == null && (rgVar = this.c.get(fVar)) == null) {
            rgVar = new rg();
            rgVar.b(fragment);
            if (z) {
                rgVar.f0().b();
            }
            this.c.put(fVar, rgVar);
            i a2 = fVar.a();
            a2.a(rgVar, "com.bumptech.glide.manager");
            a2.b();
            this.d.obtainMessage(2, fVar).sendToTarget();
        }
        return rgVar;
    }

    private j b(Context context) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = this.e.a(c.b(context.getApplicationContext()), new eg(), new jg(), context.getApplicationContext());
                }
            }
        }
        return this.a;
    }

    @TargetApi(17)
    private static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static boolean d(Activity activity) {
        return !activity.isFinishing();
    }

    public j a(Activity activity) {
        if (ki.b()) {
            return a(activity.getApplicationContext());
        }
        c(activity);
        return a(activity, activity.getFragmentManager(), (Fragment) null, d(activity));
    }

    public j a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (ki.c() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return a((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                return a((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                return a(((ContextWrapper) context).getBaseContext());
            }
        }
        return b(context);
    }

    public j a(FragmentActivity fragmentActivity) {
        if (ki.b()) {
            return a(fragmentActivity.getApplicationContext());
        }
        c(fragmentActivity);
        return a(fragmentActivity, fragmentActivity.e(), (androidx.fragment.app.Fragment) null, d(fragmentActivity));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public ng b(Activity activity) {
        return a(activity.getFragmentManager(), (Fragment) null, d(activity));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public rg b(FragmentActivity fragmentActivity) {
        return a(fragmentActivity.e(), (androidx.fragment.app.Fragment) null, d(fragmentActivity));
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
            map = this.b;
        } else {
            if (i != 2) {
                z = false;
                obj2 = null;
                if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                    String str = "Failed to remove expected request manager fragment, manager: " + obj2;
                }
                return z;
            }
            obj = (f) message.obj;
            map = this.c;
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
