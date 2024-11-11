package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.core.app.C0228f;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.h */
/* loaded from: classes.dex */
public class C0230h {

    /* renamed from: a */
    private static final Object f1444a = new Object();

    /* renamed from: b */
    private static Field f1445b;

    /* renamed from: c */
    private static boolean f1446c;

    /* renamed from: a */
    public static Bundle m1429a(Notification.Builder builder, C0228f.a aVar) {
        builder.addAction(aVar.m1383e(), aVar.m1387i(), aVar.m1379a());
        Bundle bundle = new Bundle(aVar.m1382d());
        if (aVar.m1384f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m1434a(aVar.m1384f()));
        }
        if (aVar.m1381c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m1434a(aVar.m1381c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m1380b());
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m1430a(Notification notification) {
        synchronized (f1444a) {
            if (f1446c) {
                return null;
            }
            try {
                if (f1445b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        f1446c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f1445b = declaredField;
                }
                Bundle bundle = (Bundle) f1445b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f1445b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
                f1446c = true;
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Bundle m1431a(C0228f.a aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("icon", aVar.m1383e());
        bundle.putCharSequence("title", aVar.m1387i());
        bundle.putParcelable("actionIntent", aVar.m1379a());
        Bundle bundle2 = aVar.m1382d() != null ? new Bundle(aVar.m1382d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.m1380b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m1434a(aVar.m1384f()));
        bundle.putBoolean("showsUserInterface", aVar.m1386h());
        bundle.putInt("semanticAction", aVar.m1385g());
        return bundle;
    }

    /* renamed from: a */
    private static Bundle m1432a(C0231i c0231i) {
        new Bundle();
        c0231i.m1437a();
        throw null;
    }

    /* renamed from: a */
    public static SparseArray<Bundle> m1433a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    private static Bundle[] m1434a(C0231i[] c0231iArr) {
        if (c0231iArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c0231iArr.length];
        if (c0231iArr.length <= 0) {
            return bundleArr;
        }
        m1432a(c0231iArr[0]);
        throw null;
    }
}
