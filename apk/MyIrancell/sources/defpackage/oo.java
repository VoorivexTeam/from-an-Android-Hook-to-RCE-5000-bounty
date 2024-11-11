package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;

/* loaded from: classes.dex */
final class oo extends io {
    private final e<Status> a;

    public oo(e<Status> eVar) {
        this.a = eVar;
    }

    @Override // defpackage.so
    public final void e(int i) {
        this.a.a(new Status(i));
    }
}
