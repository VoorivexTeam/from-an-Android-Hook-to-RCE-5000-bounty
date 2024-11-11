package defpackage;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class y50 implements u50 {
    private final ExecutorService a = Executors.newSingleThreadExecutor();

    /* loaded from: classes.dex */
    private class a implements Callable<Void> {
        private final File a;

        public a(File file) {
            this.a = file;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            y50.this.b(this.a);
            return null;
        }
    }

    private void a(List<File> list) {
        long b = b(list);
        int size = list.size();
        for (File file : list) {
            if (!a(file, b, size)) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    b -= length;
                    i50.b("Cache file " + file + " is deleted because it exceeds cache limit");
                } else {
                    i50.a("Error deleting file " + file + " for trimming cache");
                }
            }
        }
    }

    private long b(List<File> list) {
        Iterator<File> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().length();
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(File file) {
        x50.c(file);
        a(x50.b(file.getParentFile()));
    }

    @Override // defpackage.u50
    public void a(File file) {
        this.a.submit(new a(file));
    }

    protected abstract boolean a(File file, long j, int i);
}
