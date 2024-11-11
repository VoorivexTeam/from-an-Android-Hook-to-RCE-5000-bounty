package p000;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class y50 implements u50 {

    /* renamed from: a */
    private final ExecutorService f14103a = Executors.newSingleThreadExecutor();

    /* renamed from: y50$a */
    /* loaded from: classes.dex */
    private class CallableC3473a implements Callable<Void> {

        /* renamed from: a */
        private final File f14104a;

        public CallableC3473a(File file) {
            this.f14104a = file;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            y50.this.m16580b(this.f14104a);
            return null;
        }
    }

    /* renamed from: a */
    private void m16577a(List<File> list) {
        long m16579b = m16579b(list);
        int size = list.size();
        for (File file : list) {
            if (!mo73a(file, m16579b, size)) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    m16579b -= length;
                    i50.m12372b("Cache file " + file + " is deleted because it exceeds cache limit");
                } else {
                    i50.m12368a("Error deleting file " + file + " for trimming cache");
                }
            }
        }
    }

    /* renamed from: b */
    private long m16579b(List<File> list) {
        Iterator<File> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().length();
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m16580b(File file) {
        x50.m16447c(file);
        m16577a(x50.m16446b(file.getParentFile()));
    }

    @Override // p000.u50
    /* renamed from: a */
    public void mo15722a(File file) {
        this.f14103a.submit(new CallableC3473a(file));
    }

    /* renamed from: a */
    protected abstract boolean mo73a(File file, long j, int i);
}
