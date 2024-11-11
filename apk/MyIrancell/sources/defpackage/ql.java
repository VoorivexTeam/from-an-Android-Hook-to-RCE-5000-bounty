package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
abstract class ql {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a() {
        return Executors.newSingleThreadExecutor();
    }
}
