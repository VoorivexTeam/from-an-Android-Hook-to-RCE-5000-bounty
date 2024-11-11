package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.measurement.internal.C1739g6;
import com.google.android.gms.measurement.internal.C1774j5;
import com.google.android.gms.measurement.internal.InterfaceC1776j7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: d */
    private static volatile AppMeasurement f7338d;

    /* renamed from: a */
    private final C1774j5 f7339a;

    /* renamed from: b */
    private final InterfaceC1776j7 f7340b;

    /* renamed from: c */
    private final boolean f7341c;

    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        private ConditionalUserProperty(Bundle bundle) {
            C1057u.m7286a(bundle);
            this.mAppId = (String) C1739g6.m9348a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) C1739g6.m9348a(bundle, "origin", String.class, null);
            this.mName = (String) C1739g6.m9348a(bundle, "name", String.class, null);
            this.mValue = C1739g6.m9348a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C1739g6.m9348a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) C1739g6.m9348a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) C1739g6.m9348a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) C1739g6.m9348a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C1739g6.m9348a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) C1739g6.m9348a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C1739g6.m9348a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) C1739g6.m9348a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) C1739g6.m9348a(bundle, "expired_event_params", Bundle.class, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public final Bundle m9074a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                C1739g6.m9349a(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }
    }

    private AppMeasurement(C1774j5 c1774j5) {
        C1057u.m7286a(c1774j5);
        this.f7339a = c1774j5;
        this.f7340b = null;
        this.f7341c = false;
    }

    private AppMeasurement(InterfaceC1776j7 interfaceC1776j7) {
        C1057u.m7286a(interfaceC1776j7);
        this.f7340b = interfaceC1776j7;
        this.f7339a = null;
        this.f7341c = true;
    }

    /* renamed from: a */
    public static AppMeasurement m9069a(Context context, Bundle bundle) {
        if (f7338d == null) {
            synchronized (AppMeasurement.class) {
                if (f7338d == null) {
                    InterfaceC1776j7 m9071b = m9071b(context, bundle);
                    if (m9071b != null) {
                        f7338d = new AppMeasurement(m9071b);
                    } else {
                        f7338d = new AppMeasurement(C1774j5.m9390a(context, null, null, bundle));
                    }
                }
            }
        }
        return f7338d;
    }

    /* renamed from: a */
    private static AppMeasurement m9070a(Context context, String str, String str2) {
        if (f7338d == null) {
            synchronized (AppMeasurement.class) {
                if (f7338d == null) {
                    InterfaceC1776j7 m9071b = m9071b(context, null);
                    if (m9071b != null) {
                        f7338d = new AppMeasurement(m9071b);
                    } else {
                        f7338d = new AppMeasurement(C1774j5.m9390a(context, null, null, null));
                    }
                }
            }
        }
        return f7338d;
    }

    /* renamed from: b */
    private static InterfaceC1776j7 m9071b(Context context, Bundle bundle) {
        try {
            return (InterfaceC1776j7) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, bundle);
        } catch (ClassNotFoundException | Exception unused) {
            return null;
        }
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return m9070a(context, (String) null, (String) null);
    }

    /* renamed from: a */
    public void m9072a(String str, String str2, Object obj) {
        C1057u.m7296b(str);
        if (this.f7341c) {
            this.f7340b.mo9437a(str, str2, obj);
        } else {
            this.f7339a.m9425v().m9742a(str, str2, obj, true);
        }
    }

    /* renamed from: a */
    public final void m9073a(boolean z) {
        if (this.f7341c) {
            this.f7340b.mo9441b(z);
        } else {
            this.f7339a.m9425v().m9750b(z);
        }
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.f7341c) {
            this.f7340b.mo9435a(str);
        } else {
            this.f7339a.m9404I().m9901a(str, this.f7339a.mo9321h().mo7376b());
        }
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.f7341c) {
            this.f7340b.mo9436a(str, str2, bundle);
        } else {
            this.f7339a.m9425v().m9752c(str, str2, bundle);
        }
    }

    @Keep
    protected void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (this.f7341c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f7339a.m9425v().m9744a(str, str2, str3, bundle);
        throw null;
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.f7341c) {
            this.f7340b.mo9443c(str);
        } else {
            this.f7339a.m9404I().m9902b(str, this.f7339a.mo9321h().mo7376b());
        }
    }

    @Keep
    public long generateEventId() {
        return this.f7341c ? this.f7340b.mo9442c() : this.f7339a.m9426w().m9961t();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f7341c ? this.f7340b.mo9439b() : this.f7339a.m9425v().m9721H();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> mo9432a = this.f7341c ? this.f7340b.mo9432a(str, str2) : this.f7339a.m9425v().m9726a(str, str2);
        ArrayList arrayList = new ArrayList(mo9432a == null ? 0 : mo9432a.size());
        Iterator<Bundle> it = mo9432a.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @Keep
    protected List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (this.f7341c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f7339a.m9425v().m9727a(str, str2, str3);
        throw null;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f7341c ? this.f7340b.zzb() : this.f7339a.m9425v().m9724K();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f7341c ? this.f7340b.zza() : this.f7339a.m9425v().m9723J();
    }

    @Keep
    public String getGmpAppId() {
        return this.f7341c ? this.f7340b.mo9431a() : this.f7339a.m9425v().m9725L();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        if (this.f7341c) {
            return this.f7340b.mo9438b(str);
        }
        this.f7339a.m9425v();
        C1057u.m7296b(str);
        return 25;
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f7341c ? this.f7340b.mo9433a(str, str2, z) : this.f7339a.m9425v().m9729a(str, str2, z);
    }

    @Keep
    protected Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (this.f7341c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f7339a.m9425v().m9728a(str, str2, str3, z);
        throw null;
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f7341c) {
            this.f7340b.mo9440b(str, str2, bundle);
        } else {
            this.f7339a.m9425v().m9738a(str, str2, bundle);
        }
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C1057u.m7286a(conditionalUserProperty);
        if (this.f7341c) {
            this.f7340b.mo9434a(conditionalUserProperty.m9074a());
        } else {
            this.f7339a.m9425v().m9731a(conditionalUserProperty.m9074a());
        }
    }

    @Keep
    protected void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        C1057u.m7286a(conditionalUserProperty);
        if (this.f7341c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f7339a.m9425v().m9747b(conditionalUserProperty.m9074a());
        throw null;
    }
}
