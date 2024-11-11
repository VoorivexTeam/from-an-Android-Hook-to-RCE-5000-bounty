package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import ir.metrix.sdk.Metrix;
import ir.tapsell.sdk.models.responseModels.subModels.BaseAdSuggestionModel;
import ir.tapsell.sdk.models.responseModels.subModels.BaseCreativeModel;
import ir.tapsell.sdk.utils.C2762d;
import ir.tapsell.sdk.utils.InterfaceC2759a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a70<T extends BaseCreativeModel> extends BaseAdSuggestionModel<T> implements Serializable {
    public static final int STATE_DOING = 2;
    public static final int STATE_DONE = 3;
    public static final int STATE_DONE_AND_GET_REWARD = 4;
    public static final int STATE_FILLED = 5;

    public abstract int getZoneType();

    public boolean isValidForThisUser(Context context) {
        int intValue;
        if (getSuggestionValidationRule() == null || getSuggestionValidationRule().getType() == null || (intValue = getSuggestionValidationRule().getType().intValue()) == 1) {
            return true;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return true;
            }
            PackageManager packageManager = context.getPackageManager();
            for (ApplicationInfo applicationInfo : packageManager.getInstalledApplications(128)) {
                if (getSuggestionValidationRule().getPackageName().equals(applicationInfo.packageName)) {
                    try {
                        if (getSuggestionValidationRule().getMinVersion() != null && getSuggestionValidationRule().getMinVersion().intValue() != -1) {
                            if (packageManager.getPackageInfo(applicationInfo.packageName, 0).versionCode < getSuggestionValidationRule().getMinVersion().intValue()) {
                                return true;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        g50.m11894a("AppSuggestion", e);
                        return true;
                    }
                }
            }
            return true;
        }
        if (getSuggestionValidationRule().getPackageName() == null) {
            return true;
        }
        PackageManager packageManager2 = context.getPackageManager();
        Iterator<ApplicationInfo> it = packageManager2.getInstalledApplications(128).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ApplicationInfo next = it.next();
            if (getSuggestionValidationRule().getPackageName().equals(next.packageName)) {
                try {
                    if (getSuggestionValidationRule().getMinVersion() == null) {
                        return true;
                    }
                    if (packageManager2.getPackageInfo(next.packageName, 0).versionCode >= getSuggestionValidationRule().getMinVersion().intValue()) {
                        return true;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    g50.m11894a("AppSuggestion", e2);
                }
            }
        }
        return false;
    }

    public void reportAdIsClick(String str, String str2) {
        if (isClickReported()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("METRIX_DATA_ZONE_ID", str);
        hashMap.put("METRIX_DATA_SUGGESTION_ID", str2);
        hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
        Metrix.getInstance().newEvent("wzkkm", hashMap, null);
        setClickIsReported(true);
    }

    public void reportAdIsDoing(Context context, String str, String str2) {
        if (isDoingReported()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("METRIX_DATA_ZONE_ID", str);
        hashMap.put("METRIX_DATA_SUGGESTION_ID", str2);
        hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
        Metrix.getInstance().newEvent("izaft", hashMap, null);
        setDoingIsReported(true);
        setAdIsDoing(context);
    }

    public void reportAdIsDone(Context context, String str, String str2, InterfaceC2759a interfaceC2759a) {
        if (isDoneReported()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("METRIX_DATA_ZONE_ID", str);
        hashMap.put("METRIX_DATA_SUGGESTION_ID", str2);
        hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
        Metrix.getInstance().newEvent("lmsmd", hashMap, null);
        setDoneIsReported(true);
        setAdIsDone(context);
    }

    public void reportAdIsFilled(Context context, String str, String str2) {
        if (isFilledReported()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("METRIX_DATA_ZONE_ID", str);
        hashMap.put("METRIX_DATA_SUGGESTION_ID", str2);
        hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
        Metrix.getInstance().newEvent("qibdk", hashMap, null);
        setFilledIsReported(true);
        setAdIsFilled(context);
    }

    protected void setAdIsDoing(Context context) {
        if (getSuggestionId() != null) {
            if (this instanceof b70) {
                C2762d.m13138b(context.getApplicationContext());
            }
            k50.m13616a(getSuggestionId(), 2, getZoneType());
        }
    }

    protected void setAdIsDone(Context context) {
        if (getSuggestionId() != null) {
            if (this instanceof b70) {
                C2762d.m13136a(context.getApplicationContext());
            }
            k50.m13616a(getSuggestionId(), 4, getZoneType());
        }
    }

    protected void setAdIsFilled(Context context) {
        if (getSuggestionId() != null) {
            k50.m13616a(getSuggestionId(), 5, getZoneType());
        }
    }
}
