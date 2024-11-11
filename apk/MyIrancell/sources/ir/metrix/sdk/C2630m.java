package ir.metrix.sdk;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ir.metrix.sdk.m */
/* loaded from: classes.dex */
public class C2630m {

    /* renamed from: a */
    @SerializedName("cdmas")
    private transient List<C2637o> f10767a = new ArrayList();

    /* renamed from: b */
    @SerializedName("gsms")
    private transient List<C2638p> f10768b = new ArrayList();

    /* renamed from: c */
    @SerializedName("ltes")
    private transient List<C2642u> f10769c = new ArrayList();

    /* renamed from: d */
    @SerializedName("wcdmas")
    private transient List<C2643v> f10770d = new ArrayList();

    /* renamed from: e */
    @SerializedName("cellInfos")
    private transient List<C2622e> f10771e = new ArrayList();

    /* renamed from: f */
    @SerializedName("gsmCellLocation")
    private transient C2639q f10772f = new C2639q();

    /* renamed from: g */
    @SerializedName("locationAndroid")
    private C2640s f10773g = new C2640s();

    /* renamed from: h */
    @SerializedName("locationIOS")
    private transient C2641t f10774h = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2630m(Context context, boolean z) {
        m12652a(context, z);
    }

    /* renamed from: a */
    private Location m12648a(LocationManager locationManager) {
        Location location = null;
        for (String str : locationManager.getProviders(true)) {
            Location lastKnownLocation = locationManager.getLastKnownLocation(str);
            C2610ab.m12532c(false, "GeoInfo", String.format("last known location, provider: %s, location: %s", str, lastKnownLocation));
            if (lastKnownLocation != null && (location == null || lastKnownLocation.getTime() > location.getTime())) {
                location = lastKnownLocation;
            }
        }
        if (location == null) {
            return null;
        }
        return location;
    }

    /* renamed from: a */
    private static Integer m12649a(CellIdentityGsm cellIdentityGsm) {
        try {
            Field declaredField = cellIdentityGsm.getClass().getDeclaredField("mArfcn");
            declaredField.setAccessible(true);
            return (Integer) declaredField.get(cellIdentityGsm);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Integer m12650a(CellIdentityLte cellIdentityLte) {
        try {
            Field declaredField = cellIdentityLte.getClass().getDeclaredField("mEarfcn");
            declaredField.setAccessible(true);
            return (Integer) declaredField.get(cellIdentityLte);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Integer m12651a(CellIdentityWcdma cellIdentityWcdma) {
        try {
            Field declaredField = cellIdentityWcdma.getClass().getDeclaredField("mUarfcn");
            declaredField.setAccessible(true);
            return (Integer) declaredField.get(cellIdentityWcdma);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x018a A[Catch: all -> 0x019e, TRY_LEAVE, TryCatch #3 {all -> 0x019e, blocks: (B:64:0x0172, B:66:0x0178, B:71:0x018a, B:73:0x0181), top: B:63:0x0172, outer: #1 }] */
    @android.annotation.SuppressLint({"MissingPermission"})
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m12652a(android.content.Context r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.metrix.sdk.C2630m.m12652a(android.content.Context, boolean):void");
    }

    /* renamed from: b */
    private static Integer m12653b(CellIdentityGsm cellIdentityGsm) {
        try {
            Field declaredField = cellIdentityGsm.getClass().getDeclaredField("mBsic");
            declaredField.setAccessible(true);
            return (Integer) declaredField.get(cellIdentityGsm);
        } catch (Throwable unused) {
            return null;
        }
    }
}
