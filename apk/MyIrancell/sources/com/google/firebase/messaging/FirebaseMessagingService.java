package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.firebase.iid.C2119s;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC2143e {

    /* renamed from: g */
    private static final Queue<String> f8997g = new ArrayDeque(10);

    @Override // com.google.firebase.messaging.AbstractServiceC2143e
    /* renamed from: a */
    protected final Intent mo10742a(Intent intent) {
        return C2119s.m10683b().m10686a();
    }

    /* renamed from: a */
    public void m10743a() {
    }

    /* renamed from: a */
    public void mo5308a(RemoteMessage remoteMessage) {
    }

    /* renamed from: a */
    public void m10744a(String str) {
    }

    /* renamed from: a */
    public void m10745a(String str, Exception exc) {
    }

    /* renamed from: b */
    public void mo5309b(String str) {
    }

    @Override // com.google.firebase.messaging.AbstractServiceC2143e
    /* renamed from: b */
    public final boolean mo10746b(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        if (!C2155q.m10804d(intent)) {
            return true;
        }
        C2155q.m10795a(intent);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00eb, code lost:
    
        if (r1.equals("gcm") != false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    @Override // com.google.firebase.messaging.AbstractServiceC2143e
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo10747c(android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.mo10747c(android.content.Intent):void");
    }
}
