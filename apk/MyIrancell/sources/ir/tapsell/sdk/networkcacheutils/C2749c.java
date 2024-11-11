package ir.tapsell.sdk.networkcacheutils;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ir.tapsell.sdk.networkcacheutils.c */
/* loaded from: classes.dex */
public class C2749c {

    /* renamed from: ir.tapsell.sdk.networkcacheutils.c$a */
    /* loaded from: classes.dex */
    class a implements Comparator<File> {

        /* renamed from: b */
        final /* synthetic */ Map f11231b;

        a(Map map) {
            this.f11231b = map;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            if (!this.f11231b.containsKey(file) || !this.f11231b.containsKey(file2)) {
                return 0;
            }
            long longValue = ((Long) this.f11231b.get(file2)).longValue() - ((Long) this.f11231b.get(file)).longValue();
            if (longValue == 0) {
                return 0;
            }
            return longValue > 0 ? 1 : -1;
        }
    }

    /* renamed from: a */
    public static void m13093a(File file, int i) {
        File[] listFiles = file.listFiles();
        if ((listFiles.length > i) && (listFiles != null)) {
            HashMap hashMap = new HashMap();
            for (File file2 : listFiles) {
                hashMap.put(file2, Long.valueOf(file2.lastModified()));
            }
            Arrays.sort(listFiles, new a(hashMap));
            hashMap.clear();
            while (i < listFiles.length) {
                listFiles[i].delete();
                i++;
            }
        }
    }
}
