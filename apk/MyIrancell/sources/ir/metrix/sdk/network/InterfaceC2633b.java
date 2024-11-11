package ir.metrix.sdk.network;

import ir.metrix.sdk.network.model.AttributionModel;
import ir.metrix.sdk.network.model.ResponseModel;
import ir.metrix.sdk.network.model.sentry.SentryCrashModel;
import p000.bc0;
import p000.ec0;
import p000.gc0;
import p000.jc0;
import p000.nc0;
import p000.oc0;
import p000.pa0;
import p000.sc0;
import p000.xb0;

/* renamed from: ir.metrix.sdk.network.b */
/* loaded from: classes.dex */
public interface InterfaceC2633b {
    @gc0({"X-Sentry-Auth: Sentry sentry_version=6,sentry_client=sentry-java/1.7.14-548f5,sentry_key=5a01b344d8dd4266a3877b3d806d6381"})
    @jc0("https://sdk-sentry.metrix.ir/api/2/store/")
    /* renamed from: a */
    pa0<Void> m12655a(@xb0 SentryCrashModel sentryCrashModel);

    @bc0("https://tracker.metrix.ir/{metrixTracker}")
    /* renamed from: a */
    pa0<Void> m12656a(@nc0("metrixTracker") String str);

    @bc0
    /* renamed from: a */
    pa0<AttributionModel> m12657a(@sc0 String str, @oc0("user-id") String str2);

    @gc0({"Content-Type: application/json"})
    @jc0("engagement_event")
    /* renamed from: a */
    pa0<ResponseModel> m12658a(@ec0("X-Application-Id") String str, @ec0("Authorization") String str2, @xb0 String str3);
}
