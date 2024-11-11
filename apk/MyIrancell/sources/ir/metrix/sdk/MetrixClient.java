package ir.metrix.sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public class MetrixClient implements NoProguard {
    private C2647z metrixCore;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MetrixClient() {
        this.metrixCore = null;
        this.metrixCore = new C2647z();
    }

    public void activityCreated(Activity activity, Bundle bundle) {
        this.metrixCore.m12813a(activity, bundle);
    }

    public void activityDestroyed(Activity activity) {
        this.metrixCore.m12847f(activity);
    }

    public void activityDisplayed(Activity activity) {
        this.metrixCore.m12812a(activity);
    }

    public void activityPaused(Activity activity) {
        this.metrixCore.m12841d(activity);
    }

    public void activityResumed(Activity activity) {
        this.metrixCore.m12835c(activity);
    }

    public void activityStarted(Activity activity) {
        this.metrixCore.m12828b(activity);
    }

    public void activityStopped(Activity activity) {
        this.metrixCore.m12844e(activity);
    }

    public void addUserAttributes(Map<String, String> map) {
        this.metrixCore.m12823a(map, false);
    }

    public void appWillOpenUrl(Uri uri) {
        this.metrixCore.m12815a(uri);
    }

    public MetrixClient disableLocationListening() {
        this.metrixCore.m12824b();
        return this;
    }

    public MetrixClient enableLocationListening() {
        this.metrixCore.m12805a();
        return this;
    }

    public MetrixClient enableLogging(boolean z) {
        this.metrixCore.m12810a(z);
        return this;
    }

    public void fragmentDisplayed(Fragment fragment) {
        this.metrixCore.m12814a(fragment);
    }

    public long getSessionNum() {
        return this.metrixCore.m12838d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MetrixClient initialize(Application application, String str) {
        this.metrixCore.m12809a(application, str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MetrixClient initializeAndTrack(Activity activity, String str) {
        this.metrixCore.m12808a(activity, str);
        return this;
    }

    public boolean isScreenFlowsAutoFill() {
        return this.metrixCore.m12846e();
    }

    public void newEvent(String str) {
        this.metrixCore.m12836c(str);
    }

    public void newEvent(String str, Map<String, String> map, Map<String, Double> map2) {
        this.metrixCore.m12822a(str, map, map2);
    }

    public void newRevenue(String str, Double d) {
        this.metrixCore.m12818a(str, d);
    }

    public void newRevenue(String str, Double d, MetrixCurrency metrixCurrency) {
        this.metrixCore.m12819a(str, d, metrixCurrency);
    }

    public void newRevenue(String str, Double d, MetrixCurrency metrixCurrency, String str2) {
        this.metrixCore.m12820a(str, d, metrixCurrency, str2);
    }

    public void newRevenue(String str, Double d, String str2) {
        this.metrixCore.m12821a(str, d, str2);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.metrixCore.m12829b(activity, bundle);
    }

    public void screenDisplayed(String str) {
        this.metrixCore.m12842d(str);
    }

    public void setAppSecret(long j, long j2, long j3, long j4, long j5) {
        this.metrixCore.m12811a(j, j2, j3, j4, j5);
    }

    public void setDefaultTracker(String str) {
        this.metrixCore.m12830b(str);
    }

    public MetrixClient setEventMaxCount(int i) {
        this.metrixCore.m12832c(i);
        return this;
    }

    public MetrixClient setEventUploadMaxBatchSize(int i) {
        this.metrixCore.m12825b(i);
        return this;
    }

    public MetrixClient setEventUploadPeriodMillis(int i) {
        this.metrixCore.m12839d(i);
        return this;
    }

    public MetrixClient setEventUploadThreshold(int i) {
        this.metrixCore.m12806a(i);
        return this;
    }

    public MetrixClient setFlushEventsOnClose(boolean z) {
        this.metrixCore.m12826b(z);
        return this;
    }

    public MetrixClient setLogLevel(int i) {
        this.metrixCore.m12843e(i);
        return this;
    }

    public void setMetrixApiKey(String str) {
        this.metrixCore.m12848f(str);
    }

    public void setOnAttributionChangedListener(OnAttributionChangedListener onAttributionChangedListener) {
        this.metrixCore.m12816a(onAttributionChangedListener);
    }

    public void setOnDeeplinkResponseListener(OnDeeplinkResponseListener onDeeplinkResponseListener) {
        this.metrixCore.m12817a(onDeeplinkResponseListener);
    }

    public void setScreenFlowsAutoFill(boolean z) {
        this.metrixCore.m12837c(z);
    }

    public MetrixClient setSessionTimeoutMillis(long j) {
        this.metrixCore.m12807a(j);
        return this;
    }

    public void setStore(String str) {
        this.metrixCore.m12849g(str);
    }

    public void setUserMetrics(Map<String, Double> map) {
        this.metrixCore.m12831b(map, false);
    }
}
