package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.C0237b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.k */
/* loaded from: classes.dex */
public final class C0233k implements Iterable<Intent> {

    /* renamed from: b */
    private final ArrayList<Intent> f1447b = new ArrayList<>();

    /* renamed from: c */
    private final Context f1448c;

    /* renamed from: androidx.core.app.k$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: c */
        Intent mo362c();
    }

    private C0233k(Context context) {
        this.f1448c = context;
    }

    /* renamed from: a */
    public static C0233k m1441a(Context context) {
        return new C0233k(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public C0233k m1442a(Activity activity) {
        Intent mo362c = activity instanceof a ? ((a) activity).mo362c() : null;
        if (mo362c == null) {
            mo362c = C0226d.m1371a(activity);
        }
        if (mo362c != null) {
            ComponentName component = mo362c.getComponent();
            if (component == null) {
                component = mo362c.resolveActivity(this.f1448c.getPackageManager());
            }
            m1443a(component);
            m1444a(mo362c);
        }
        return this;
    }

    /* renamed from: a */
    public C0233k m1443a(ComponentName componentName) {
        int size = this.f1447b.size();
        try {
            Context context = this.f1448c;
            while (true) {
                Intent m1372a = C0226d.m1372a(context, componentName);
                if (m1372a == null) {
                    return this;
                }
                this.f1447b.add(size, m1372a);
                context = this.f1448c;
                componentName = m1372a.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public C0233k m1444a(Intent intent) {
        this.f1447b.add(intent);
        return this;
    }

    /* renamed from: a */
    public void m1445a(Bundle bundle) {
        if (this.f1447b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f1447b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C0237b.m1462a(this.f1448c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f1448c.startActivity(intent);
    }

    /* renamed from: b */
    public void m1446b() {
        m1445a((Bundle) null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1447b.iterator();
    }
}
