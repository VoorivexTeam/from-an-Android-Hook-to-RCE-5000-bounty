package ir.metrix.sdk.network;

import defpackage.bc0;
import defpackage.ec0;
import defpackage.gc0;
import defpackage.jc0;
import defpackage.nc0;
import defpackage.oc0;
import defpackage.pa0;
import defpackage.sc0;
import defpackage.xb0;
import ir.metrix.sdk.network.model.AttributionModel;
import ir.metrix.sdk.network.model.ResponseModel;
import ir.metrix.sdk.network.model.sentry.SentryCrashModel;

/* loaded from: classes.dex */
public interface b {
    @gc0({"X-Sentry-Auth: Sentry sentry_version=6,sentry_client=sentry-java/1.7.14-548f5,sentry_key=5a01b344d8dd4266a3877b3d806d6381"})
    @jc0("https://sdk-sentry.metrix.ir/api/2/store/")
    pa0<Void> a(@xb0 SentryCrashModel sentryCrashModel);

    @bc0("https://tracker.metrix.ir/{metrixTracker}")
    pa0<Void> a(@nc0("metrixTracker") String str);

    @bc0
    pa0<AttributionModel> a(@sc0 String str, @oc0("user-id") String str2);

    @gc0({"Content-Type: application/json"})
    @jc0("engagement_event")
    pa0<ResponseModel> a(@ec0("X-Application-Id") String str, @ec0("Authorization") String str2, @xb0 String str3);
}
