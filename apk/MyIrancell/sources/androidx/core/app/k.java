package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements Iterable<Intent> {
    private final ArrayList<Intent> b = new ArrayList<>();
    private final Context c;

    /* loaded from: classes.dex */
    public interface a {
        Intent c();
    }

    private k(Context context) {
        this.c = context;
    }

    public static k a(Context context) {
        return new k(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k a(Activity activity) {
        Intent c = activity instanceof a ? ((a) activity).c() : null;
        if (c == null) {
            c = d.a(activity);
        }
        if (c != null) {
            ComponentName component = c.getComponent();
            if (component == null) {
                component = c.resolveActivity(this.c.getPackageManager());
            }
            a(component);
            a(c);
        }
        return this;
    }

    public k a(ComponentName componentName) {
        int size = this.b.size();
        try {
            Context context = this.c;
            while (true) {
                Intent a2 = d.a(context, componentName);
                if (a2 == null) {
                    return this;
                }
                this.b.add(size, a2);
                context = this.c;
                componentName = a2.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public k a(Intent intent) {
        this.b.add(intent);
        return this;
    }

    public void a(Bundle bundle) {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.b.a(this.c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.c.startActivity(intent);
    }

    public void b() {
        a((Bundle) null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.b.iterator();
    }
}
