package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0360a;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes.dex */
public class C0366g {

    /* renamed from: a */
    final a f2353a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.g$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        C0360a.b mo2747a(int i, int i2, int i3, Object obj);

        /* renamed from: a */
        void mo2749a(C0360a.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0366g(a aVar) {
        this.f2353a = aVar;
    }

    /* renamed from: a */
    private void m2840a(List<C0360a.b> list, int i, int i2) {
        C0360a.b bVar = list.get(i);
        C0360a.b bVar2 = list.get(i2);
        int i3 = bVar2.f2233a;
        if (i3 == 1) {
            m2842c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            m2844a(list, i, bVar, i2, bVar2);
        } else {
            if (i3 != 4) {
                return;
            }
            m2845b(list, i, bVar, i2, bVar2);
        }
    }

    /* renamed from: b */
    private int m2841b(List<C0360a.b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f2233a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m2842c(List<C0360a.b> list, int i, C0360a.b bVar, int i2, C0360a.b bVar2) {
        int i3 = bVar.f2236d < bVar2.f2234b ? -1 : 0;
        if (bVar.f2234b < bVar2.f2234b) {
            i3++;
        }
        int i4 = bVar2.f2234b;
        int i5 = bVar.f2234b;
        if (i4 <= i5) {
            bVar.f2234b = i5 + bVar2.f2236d;
        }
        int i6 = bVar2.f2234b;
        int i7 = bVar.f2236d;
        if (i6 <= i7) {
            bVar.f2236d = i7 + bVar2.f2236d;
        }
        bVar2.f2234b += i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2843a(List<C0360a.b> list) {
        while (true) {
            int m2841b = m2841b(list);
            if (m2841b == -1) {
                return;
            } else {
                m2840a(list, m2841b, m2841b + 1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        if (r0 > r14.f2234b) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        r12.f2236d = r0 - r14.f2236d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
    
        if (r0 >= r14.f2234b) goto L60;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m2844a(java.util.List<androidx.recyclerview.widget.C0360a.b> r10, int r11, androidx.recyclerview.widget.C0360a.b r12, int r13, androidx.recyclerview.widget.C0360a.b r14) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0366g.m2844a(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m2845b(java.util.List<androidx.recyclerview.widget.C0360a.b> r9, int r10, androidx.recyclerview.widget.C0360a.b r11, int r12, androidx.recyclerview.widget.C0360a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f2236d
            int r1 = r13.f2234b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto Ld
            int r1 = r1 - r4
            r13.f2234b = r1
            goto L20
        Ld:
            int r5 = r13.f2236d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r4
            r13.f2236d = r5
            androidx.recyclerview.widget.g$a r0 = r8.f2353a
            int r1 = r11.f2234b
            java.lang.Object r5 = r13.f2235c
            androidx.recyclerview.widget.a$b r0 = r0.mo2747a(r2, r1, r4, r5)
            goto L21
        L20:
            r0 = r3
        L21:
            int r1 = r11.f2234b
            int r5 = r13.f2234b
            if (r1 > r5) goto L2b
            int r5 = r5 + r4
            r13.f2234b = r5
            goto L41
        L2b:
            int r6 = r13.f2236d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.g$a r3 = r8.f2353a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f2235c
            androidx.recyclerview.widget.a$b r3 = r3.mo2747a(r2, r1, r5, r4)
            int r1 = r13.f2236d
            int r1 = r1 - r5
            r13.f2236d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f2236d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.g$a r11 = r8.f2353a
            r11.mo2749a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r3 == 0) goto L5e
            r9.add(r10, r3)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0366g.m2845b(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
