package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.C2440ep;

/* renamed from: com.google.android.gms.common.util.r */
/* loaded from: classes.dex */
public class C1112r {

    /* renamed from: a */
    private static final Method f6360a;

    /* renamed from: b */
    private static final Method f6361b;

    /* renamed from: c */
    private static final Method f6362c;

    /* renamed from: d */
    private static final Method f6363d;

    static {
        Process.myUid();
        f6360a = m7423e();
        f6361b = m7424f();
        f6362c = m7425g();
        m7415a();
        f6363d = m7420b();
        m7421c();
        m7422d();
    }

    /* renamed from: a */
    private static WorkSource m7412a(int i, String str) {
        WorkSource workSource = new WorkSource();
        m7417a(workSource, i, str);
        return workSource;
    }

    /* renamed from: a */
    public static WorkSource m7413a(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo m11475a = C2440ep.m11628a(context).m11475a(str, 0);
                if (m11475a != null) {
                    return m7412a(m11475a.uid, str);
                }
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Could not get applicationInfo from package: ".concat(valueOf);
                } else {
                    new String("Could not get applicationInfo from package: ");
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    "Could not find package: ".concat(valueOf2);
                } else {
                    new String("Could not find package: ");
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m7414a(WorkSource workSource, int i) {
        Method method = f6363d;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i));
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return null;
        }
    }

    /* renamed from: a */
    private static Method m7415a() {
        try {
            return WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static List<String> m7416a(WorkSource workSource) {
        int m7419b = workSource == null ? 0 : m7419b(workSource);
        if (m7419b == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < m7419b; i++) {
            String m7414a = m7414a(workSource, i);
            if (!C1110p.m7409a(m7414a)) {
                arrayList.add(m7414a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m7417a(WorkSource workSource, int i, String str) {
        if (f6361b != null) {
            if (str == null) {
                str = "";
            }
            try {
                f6361b.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method = f6360a;
        if (method != null) {
            try {
                method.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    /* renamed from: a */
    public static boolean m7418a(Context context) {
        return (context == null || context.getPackageManager() == null || C2440ep.m11628a(context).m11474a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    /* renamed from: b */
    private static int m7419b(WorkSource workSource) {
        Method method = f6362c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    /* renamed from: b */
    private static Method m7420b() {
        if (C1108n.m7399e()) {
            try {
                return WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private static final Method m7421c() {
        if (C1108n.m7405k()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: d */
    private static final Method m7422d() {
        if (C1108n.m7405k()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    private static Method m7423e() {
        try {
            return WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static Method m7424f() {
        if (C1108n.m7399e()) {
            try {
                return WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: g */
    private static Method m7425g() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
