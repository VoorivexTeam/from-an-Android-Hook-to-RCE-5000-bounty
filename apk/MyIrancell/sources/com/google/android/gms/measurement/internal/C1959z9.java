package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.C0994d;
import com.google.android.gms.common.C1006h;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.util.C1100f;
import com.google.android.gms.internal.measurement.C1218bb;
import com.google.android.gms.internal.measurement.InterfaceC1428pc;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p000.C2440ep;

/* renamed from: com.google.android.gms.measurement.internal.z9 */
/* loaded from: classes.dex */
public final class C1959z9 extends AbstractC1703d6 {

    /* renamed from: g */
    private static final String[] f8214g = {"firebase_", "google_", "ga_"};

    /* renamed from: c */
    private SecureRandom f8215c;

    /* renamed from: d */
    private final AtomicLong f8216d;

    /* renamed from: e */
    private int f8217e;

    /* renamed from: f */
    private Integer f8218f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1959z9(C1774j5 c1774j5) {
        super(c1774j5);
        this.f8218f = null;
        this.f8216d = new AtomicLong(0L);
    }

    /* renamed from: a */
    public static long m9905a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m9906a(byte[] bArr) {
        C1057u.m7286a(bArr);
        int i = 0;
        C1057u.m7297b(bArr.length > 0);
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (bArr[length] & 255) << i;
            i += 8;
        }
        return j;
    }

    /* renamed from: a */
    public static Bundle m9907a(List<zzkq> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zzkq zzkqVar : list) {
            String str = zzkqVar.f8228f;
            if (str != null) {
                bundle.putString(zzkqVar.f8225c, str);
            } else {
                Long l = zzkqVar.f8227e;
                if (l != null) {
                    bundle.putLong(zzkqVar.f8225c, l.longValue());
                } else {
                    Double d = zzkqVar.f8230h;
                    if (d != null) {
                        bundle.putDouble(zzkqVar.f8225c, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: a */
    private static Object m9908a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m9909a(String.valueOf(obj), i, z);
        }
        return null;
    }

    /* renamed from: a */
    public static String m9909a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: a */
    private static void m9910a(Bundle bundle, Object obj) {
        C1057u.m7286a(bundle);
        if (obj != null) {
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", String.valueOf(obj).length());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m9911a(Context context, boolean z) {
        C1057u.m7286a(context);
        return m9922b(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m9912a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* renamed from: a */
    private static boolean m9913a(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m9914a(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    /* renamed from: a */
    private final boolean m9915a(String str, String str2, int i, Object obj, boolean z) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                if ((obj instanceof Bundle) && z) {
                    return true;
                }
                if ((obj instanceof Parcelable[]) && z) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (!(parcelable instanceof Bundle)) {
                            mo9324k().m9314y().m9367a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
                if (!(obj instanceof ArrayList) || !z) {
                    return false;
                }
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (!(obj2 instanceof Bundle)) {
                        mo9324k().m9314y().m9367a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                        return false;
                    }
                }
                return true;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                mo9324k().m9314y().m9368a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m9916a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m9917a(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static byte[] m9918a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Bundle[] m9919a(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else {
            if (!(obj instanceof ArrayList)) {
                return null;
            }
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    /* renamed from: b */
    public static Bundle m9920b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: b */
    public static ArrayList<Bundle> m9921b(List<zzv> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzv zzvVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzvVar.f8253b);
            bundle.putString("origin", zzvVar.f8254c);
            bundle.putLong("creation_timestamp", zzvVar.f8256e);
            bundle.putString("name", zzvVar.f8255d.f8225c);
            C1739g6.m9349a(bundle, zzvVar.f8255d.zza());
            bundle.putBoolean("active", zzvVar.f8257f);
            String str = zzvVar.f8258g;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzan zzanVar = zzvVar.f8259h;
            if (zzanVar != null) {
                bundle.putString("timed_out_event_name", zzanVar.f8220b);
                zzam zzamVar = zzvVar.f8259h.f8221c;
                if (zzamVar != null) {
                    bundle.putBundle("timed_out_event_params", zzamVar.zzb());
                }
            }
            bundle.putLong("trigger_timeout", zzvVar.f8260i);
            zzan zzanVar2 = zzvVar.f8261j;
            if (zzanVar2 != null) {
                bundle.putString("triggered_event_name", zzanVar2.f8220b);
                zzam zzamVar2 = zzvVar.f8261j.f8221c;
                if (zzamVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzamVar2.zzb());
                }
            }
            bundle.putLong("triggered_timestamp", zzvVar.f8255d.f8226d);
            bundle.putLong("time_to_live", zzvVar.f8262k);
            zzan zzanVar3 = zzvVar.f8263l;
            if (zzanVar3 != null) {
                bundle.putString("expired_event_name", zzanVar3.f8220b);
                zzam zzamVar3 = zzvVar.f8263l.f8221c;
                if (zzamVar3 != null) {
                    bundle.putBundle("expired_event_params", zzamVar3.zzb());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m9922b(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m9923c(Context context, String str) {
        C1749h4 m9309t;
        String str2;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo m11480b = C2440ep.m11628a(context).m11480b(str, 64);
            if (m11480b == null || m11480b.signatures == null || m11480b.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(m11480b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            m9309t = mo9324k().m9309t();
            str2 = "Package name not found";
            m9309t.m9366a(str2, e);
            return true;
        } catch (CertificateException e2) {
            e = e2;
            m9309t = mo9324k().m9309t();
            str2 = "Error obtaining certificate";
            m9309t.m9366a(str2, e);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m9924c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m9925e(String str) {
        C1057u.m7296b(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m9926f(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: g */
    private static boolean m9927g(String str) {
        C1057u.m7286a(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: h */
    private final int m9928h(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (m9326m().m9480a(C1828o.f7805D0) && "_lgclid".equals(str)) ? 100 : 36;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static MessageDigest m9929y() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final int m9930a(int i) {
        return C0994d.m6968a().mo6953a(mo9325l(), C1006h.f6075a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m9931a(String str) {
        if (!m9957b("event", str)) {
            return 2;
        }
        if (m9954a("event", C1775j6.f7680a, str)) {
            return !m9951a("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0069 -> B:7:0x0076). Please report as a decompilation issue!!! */
    /* renamed from: a */
    public final long m9932a(Context context, String str) {
        mo9194c();
        C1057u.m7286a(context);
        C1057u.m7296b(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest m9929y = m9929y();
        long j = -1;
        if (m9929y == null) {
            mo9324k().m9309t().m9365a("Could not get MD5 instance");
        } else {
            if (packageManager != null) {
                try {
                } catch (PackageManager.NameNotFoundException e) {
                    mo9324k().m9309t().m9366a("Package name not found", e);
                }
                if (!m9923c(context, str)) {
                    PackageInfo m11480b = C2440ep.m11628a(context).m11480b(mo9325l().getPackageName(), 64);
                    if (m11480b.signatures == null || m11480b.signatures.length <= 0) {
                        mo9324k().m9312w().m9365a("Could not get signatures");
                    } else {
                        j = m9906a(m9929y.digest(m11480b.signatures[0].toByteArray()));
                    }
                }
            }
            j = 0;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle m9933a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo9324k().m9312w().m9366a("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle m9934a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object m9937a = m9937a(str, bundle.get(str));
                if (m9937a == null) {
                    mo9324k().m9314y().m9366a("Param value can't be null", m9319f().m9121b(str));
                } else {
                    m9941a(bundle2, str, m9937a);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0065, code lost:
    
        if (m9951a("event param", 40, r15) == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle m9935a(java.lang.String r18, java.lang.String r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1959z9.m9935a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzan m9936a(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m9931a(str2) != 0) {
            mo9324k().m9309t().m9366a("Invalid conditional property event name", m9319f().m9122c(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        return new zzan(str2, new zzam(m9934a(m9935a(str, str2, bundle2, C1100f.m7379a("_o"), false, false))), str3, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object m9937a(String str, Object obj) {
        boolean z;
        if ("_ev".equals(str)) {
            z = true;
        } else {
            r1 = m9926f(str) ? 256 : 100;
            z = false;
        }
        return m9908a(r1, obj, z);
    }

    /* renamed from: a */
    public final URL m9938a(long j, String str, String str2, long j2) {
        try {
            C1057u.m7296b(str2);
            C1057u.m7296b(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j), Integer.valueOf(m9963v())), str2, str, Long.valueOf(j2));
            if (str.equals(m9326m().m9497t())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            mo9324k().m9309t().m9366a("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public final void m9939a(int i, String str, String str2, int i2) {
        m9949a((String) null, i, str, str2, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9940a(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            mo9324k().m9312w().m9366a("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9941a(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (str != null) {
            mo9324k().m9314y().m9367a("Not putting event parameter. Invalid value type. name, type", m9319f().m9121b(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    /* renamed from: a */
    public final void m9942a(InterfaceC1428pc interfaceC1428pc, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            interfaceC1428pc.mo7833a(bundle);
        } catch (RemoteException e) {
            this.f7550a.mo9324k().m9312w().m9366a("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void m9943a(InterfaceC1428pc interfaceC1428pc, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            interfaceC1428pc.mo7833a(bundle);
        } catch (RemoteException e) {
            this.f7550a.mo9324k().m9312w().m9366a("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void m9944a(InterfaceC1428pc interfaceC1428pc, Bundle bundle) {
        try {
            interfaceC1428pc.mo7833a(bundle);
        } catch (RemoteException e) {
            this.f7550a.mo9324k().m9312w().m9366a("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void m9945a(InterfaceC1428pc interfaceC1428pc, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC1428pc.mo7833a(bundle);
        } catch (RemoteException e) {
            this.f7550a.mo9324k().m9312w().m9366a("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void m9946a(InterfaceC1428pc interfaceC1428pc, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC1428pc.mo7833a(bundle);
        } catch (RemoteException e) {
            this.f7550a.mo9324k().m9312w().m9366a("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void m9947a(InterfaceC1428pc interfaceC1428pc, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            interfaceC1428pc.mo7833a(bundle);
        } catch (RemoteException e) {
            this.f7550a.mo9324k().m9312w().m9366a("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void m9948a(InterfaceC1428pc interfaceC1428pc, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC1428pc.mo7833a(bundle);
        } catch (RemoteException e) {
            this.f7550a.mo9324k().m9312w().m9366a("Error returning byte array to wrapper", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9949a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m9913a(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        this.f7550a.mo9317d();
        this.f7550a.m9425v().m9738a("auto", "_err", bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ApplySharedPref"})
    /* renamed from: a */
    public final boolean m9950a(String str, double d) {
        try {
            SharedPreferences.Editor edit = mo9325l().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return edit.commit();
        } catch (Exception e) {
            mo9324k().m9309t().m9366a("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m9951a(String str, int i, String str2) {
        if (str2 == null) {
            mo9324k().m9311v().m9366a("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        mo9324k().m9311v().m9368a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m9952a(String str, String str2) {
        if (str2 == null) {
            mo9324k().m9311v().m9366a("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            mo9324k().m9311v().m9366a("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            mo9324k().m9311v().m9367a("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                mo9324k().m9311v().m9367a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m9953a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (m9927g(str)) {
                return true;
            }
            if (this.f7550a.m9429z()) {
                mo9324k().m9311v().m9366a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C1725f4.m9298a(str));
            }
            return false;
        }
        if (C1218bb.m7671a() && m9326m().m9480a(C1828o.f7811G0) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f7550a.m9429z()) {
                mo9324k().m9311v().m9365a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (m9927g(str2)) {
            return true;
        }
        mo9324k().m9311v().m9366a("Invalid admob_app_id. Analytics disabled.", C1725f4.m9298a(str2));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m9954a(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            mo9324k().m9311v().m9366a("Name is required and can't be null. Type", str);
            return false;
        }
        C1057u.m7286a(str2);
        String[] strArr2 = f8214g;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            mo9324k().m9311v().m9367a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            C1057u.m7286a(strArr);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                }
                if (m9924c(str2, strArr[i2])) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                mo9324k().m9311v().m9367a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m9955b(String str) {
        if (!m9957b("user property", str)) {
            return 6;
        }
        if (m9954a("user property", C1799l6.f7740a, str)) {
            return !m9951a("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m9956b(String str, Object obj) {
        return "_ldl".equals(str) ? m9915a("user property referrer", str, m9928h(str), obj, false) : m9915a("user property", str, m9928h(str), obj, false) ? 0 : 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m9957b(String str, String str2) {
        if (str2 == null) {
            mo9324k().m9311v().m9366a("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            mo9324k().m9311v().m9366a("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            mo9324k().m9311v().m9367a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                mo9324k().m9311v().m9367a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object m9958c(String str, Object obj) {
        return m9908a(m9928h(str), obj, "_ldl".equals(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m9959c(String str) {
        mo9194c();
        if (C2440ep.m11628a(mo9325l()).m11473a(str) == 0) {
            return true;
        }
        mo9324k().m9303A().m9366a("Permission not granted", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m9960d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String m9496s = m9326m().m9496s();
        mo9317d();
        return m9496s.equals(str);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1703d6
    /* renamed from: n */
    protected final void mo9219n() {
        mo9194c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo9324k().m9312w().m9365a("Utils falling back to Random for random id");
            }
        }
        this.f8216d.set(nextLong);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1703d6
    /* renamed from: r */
    protected final boolean mo9123r() {
        return true;
    }

    /* renamed from: t */
    public final long m9961t() {
        long j = this.f8216d.get();
        synchronized (this.f8216d) {
            if (j != 0) {
                this.f8216d.compareAndSet(-1L, 1L);
                return this.f8216d.getAndIncrement();
            }
            long nextLong = new Random(System.nanoTime() ^ mo9321h().mo7375a()).nextLong();
            int i = this.f8217e + 1;
            this.f8217e = i;
            return nextLong + i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final SecureRandom m9962u() {
        mo9194c();
        if (this.f8215c == null) {
            this.f8215c = new SecureRandom();
        }
        return this.f8215c;
    }

    /* renamed from: v */
    public final int m9963v() {
        if (this.f8218f == null) {
            this.f8218f = Integer.valueOf(C0994d.m6968a().m6974b(mo9325l()) / 1000);
        }
        return this.f8218f.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final String m9964w() {
        byte[] bArr = new byte[16];
        m9962u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* renamed from: x */
    public final boolean m9965x() {
        try {
            mo9325l().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
