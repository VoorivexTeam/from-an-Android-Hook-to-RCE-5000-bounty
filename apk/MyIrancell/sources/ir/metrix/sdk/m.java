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
/* loaded from: classes.dex */
public class m {

    @SerializedName("cdmas")
    private transient List<o> a = new ArrayList();

    @SerializedName("gsms")
    private transient List<p> b = new ArrayList();

    @SerializedName("ltes")
    private transient List<u> c = new ArrayList();

    @SerializedName("wcdmas")
    private transient List<v> d = new ArrayList();

    @SerializedName("cellInfos")
    private transient List<e> e = new ArrayList();

    @SerializedName("gsmCellLocation")
    private transient q f = new q();

    @SerializedName("locationAndroid")
    private s g = new s();

    @SerializedName("locationIOS")
    private transient t h = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Context context, boolean z) {
        a(context, z);
    }

    private Location a(LocationManager locationManager) {
        Location location = null;
        for (String str : locationManager.getProviders(true)) {
            Location lastKnownLocation = locationManager.getLastKnownLocation(str);
            ab.c(false, "GeoInfo", String.format("last known location, provider: %s, location: %s", str, lastKnownLocation));
            if (lastKnownLocation != null && (location == null || lastKnownLocation.getTime() > location.getTime())) {
                location = lastKnownLocation;
            }
        }
        if (location == null) {
            return null;
        }
        return location;
    }

    private static Integer a(CellIdentityGsm cellIdentityGsm) {
        try {
            Field declaredField = cellIdentityGsm.getClass().getDeclaredField("mArfcn");
            declaredField.setAccessible(true);
            return (Integer) declaredField.get(cellIdentityGsm);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Integer a(CellIdentityLte cellIdentityLte) {
        try {
            Field declaredField = cellIdentityLte.getClass().getDeclaredField("mEarfcn");
            declaredField.setAccessible(true);
            return (Integer) declaredField.get(cellIdentityLte);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Integer a(CellIdentityWcdma cellIdentityWcdma) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.content.Context r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.metrix.sdk.m.a(android.content.Context, boolean):void");
    }

    private static Integer b(CellIdentityGsm cellIdentityGsm) {
        try {
            Field declaredField = cellIdentityGsm.getClass().getDeclaredField("mBsic");
            declaredField.setAccessible(true);
            return (Integer) declaredField.get(cellIdentityGsm);
        } catch (Throwable unused) {
            return null;
        }
    }
}
