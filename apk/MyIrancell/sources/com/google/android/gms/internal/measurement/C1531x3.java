package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.x3 */
/* loaded from: classes.dex */
final class C1531x3 implements InterfaceC1215b8 {

    /* renamed from: a */
    private final AbstractC1503v3 f7002a;

    private C1531x3(AbstractC1503v3 abstractC1503v3) {
        C1448r4.m8292a(abstractC1503v3, "output");
        AbstractC1503v3 abstractC1503v32 = abstractC1503v3;
        this.f7002a = abstractC1503v32;
        abstractC1503v32.f6967a = this;
    }

    /* renamed from: a */
    public static C1531x3 m8882a(AbstractC1503v3 abstractC1503v3) {
        C1531x3 c1531x3 = abstractC1503v3.f6967a;
        return c1531x3 != null ? c1531x3 : new C1531x3(abstractC1503v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: a */
    public final void mo7631a(int i) {
        this.f7002a.mo8586a(i, 3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: a */
    public final void mo7632a(int i, double d) {
        this.f7002a.m8584a(i, d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: a */
    public final void mo7633a(int i, float f) {
        this.f7002a.m8585a(i, f);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: a */
    public final void mo7634a(int i, int i2) {
        this.f7002a.mo8612e(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: a */
    public final void mo7635a(int i, long j) {
        this.f7002a.mo8608c(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: a */
    public final void mo7636a(int i, AbstractC1300h3 abstractC1300h3) {
        this.f7002a.mo8588a(i, abstractC1300h3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: a */
    public final <K, V> void mo7637a(int i, C1463s5<K, V> c1463s5, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f7002a.mo8586a(i, 2);
            this.f7002a.mo8600b(C1421p5.m8181a(c1463s5, entry.getKey(), entry.getValue()));
            C1421p5.m8182a(this.f7002a, c1463s5, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: a */
    public final void mo7638a(int i, Object obj) {
        if (obj instanceof AbstractC1300h3) {
            this.f7002a.mo8603b(i, (AbstractC1300h3) obj);
        } else {
            this.f7002a.mo8589a(i, (InterfaceC1533x5) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: a */
    public final void mo7639a(int i, Object obj, InterfaceC1436q6 interfaceC1436q6) {
        this.f7002a.mo8590a(i, (InterfaceC1533x5) obj, interfaceC1436q6);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: a */
    public final void mo7640a(int i, String str) {
        this.f7002a.mo8591a(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: a */
    public final void mo7641a(int i, List<AbstractC1300h3> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f7002a.mo8588a(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: a */
    public final void mo7642a(int i, List<?> list, InterfaceC1436q6 interfaceC1436q6) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo7648b(i, list.get(i2), interfaceC1436q6);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: a */
    public final void mo7643a(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f7002a.mo8608c(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f7002a.mo8586a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC1503v3.m8565g(list.get(i4).longValue());
        }
        this.f7002a.mo8600b(i3);
        while (i2 < list.size()) {
            this.f7002a.mo8609c(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: a */
    public final void mo7644a(int i, boolean z) {
        this.f7002a.mo8592a(i, z);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: b */
    public final void mo7645b(int i) {
        this.f7002a.mo8586a(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: b */
    public final void mo7646b(int i, int i2) {
        this.f7002a.m8611d(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: b */
    public final void mo7647b(int i, long j) {
        this.f7002a.mo8587a(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: b */
    public final void mo7648b(int i, Object obj, InterfaceC1436q6 interfaceC1436q6) {
        AbstractC1503v3 abstractC1503v3 = this.f7002a;
        abstractC1503v3.mo8586a(i, 3);
        interfaceC1436q6.mo7623a((InterfaceC1436q6) obj, (InterfaceC1215b8) abstractC1503v3.f6967a);
        abstractC1503v3.mo8586a(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: b */
    public final void mo7649b(int i, List<String> list) {
        int i2 = 0;
        if (!(list instanceof InterfaceC1302h5)) {
            while (i2 < list.size()) {
                this.f7002a.mo8591a(i, list.get(i2));
                i2++;
            }
            return;
        }
        InterfaceC1302h5 interfaceC1302h5 = (InterfaceC1302h5) list;
        while (i2 < list.size()) {
            Object mo7799b = interfaceC1302h5.mo7799b(i2);
            if (mo7799b instanceof String) {
                this.f7002a.mo8591a(i, (String) mo7799b);
            } else {
                this.f7002a.mo8588a(i, (AbstractC1300h3) mo7799b);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: b */
    public final void mo7650b(int i, List<?> list, InterfaceC1436q6 interfaceC1436q6) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo7639a(i, list.get(i2), interfaceC1436q6);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: b */
    public final void mo7651b(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f7002a.mo8592a(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.f7002a.mo8586a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC1503v3.m8546b(list.get(i4).booleanValue());
        }
        this.f7002a.mo8600b(i3);
        while (i2 < list.size()) {
            this.f7002a.m8598a(list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: c */
    public final void mo7652c(int i, int i2) {
        this.f7002a.mo8601b(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: c */
    public final void mo7653c(int i, long j) {
        this.f7002a.mo8608c(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: c */
    public final void mo7654c(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f7002a.m8602b(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f7002a.mo8586a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC1503v3.m8561f(list.get(i4).longValue());
        }
        this.f7002a.mo8600b(i3);
        while (i2 < list.size()) {
            this.f7002a.m8604b(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: d */
    public final void mo7655d(int i, int i2) {
        this.f7002a.mo8601b(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: d */
    public final void mo7656d(int i, long j) {
        this.f7002a.m8602b(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: d */
    public final void mo7657d(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f7002a.mo8601b(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f7002a.mo8586a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC1503v3.m8558f(list.get(i4).intValue());
        }
        this.f7002a.mo8600b(i3);
        while (i2 < list.size()) {
            this.f7002a.mo8583a(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: e */
    public final void mo7658e(int i, int i2) {
        this.f7002a.mo8612e(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: e */
    public final void mo7659e(int i, long j) {
        this.f7002a.mo8587a(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: e */
    public final void mo7660e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f7002a.mo8587a(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f7002a.mo8586a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC1503v3.m8557e(list.get(i4).longValue());
        }
        this.f7002a.mo8600b(i3);
        while (i2 < list.size()) {
            this.f7002a.mo8593a(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: f */
    public final void mo7661f(int i, int i2) {
        this.f7002a.mo8607c(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: f */
    public final void mo7662f(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f7002a.mo8601b(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f7002a.mo8586a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC1503v3.m8575k(list.get(i4).intValue());
        }
        this.f7002a.mo8600b(i3);
        while (i2 < list.size()) {
            this.f7002a.mo8583a(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: g */
    public final void mo7663g(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f7002a.m8611d(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f7002a.mo8586a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC1503v3.m8566h(list.get(i4).intValue());
        }
        this.f7002a.mo8600b(i3);
        while (i2 < list.size()) {
            this.f7002a.m8606c(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: h */
    public final void mo7664h(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f7002a.mo8587a(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f7002a.mo8586a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC1503v3.m8554d(list.get(i4).longValue());
        }
        this.f7002a.mo8600b(i3);
        while (i2 < list.size()) {
            this.f7002a.mo8593a(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: i */
    public final void mo7665i(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f7002a.m8584a(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.f7002a.mo8586a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC1503v3.m8534b(list.get(i4).doubleValue());
        }
        this.f7002a.mo8600b(i3);
        while (i2 < list.size()) {
            this.f7002a.m8581a(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: j */
    public final void mo7666j(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f7002a.mo8608c(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f7002a.mo8586a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC1503v3.m8569h(list.get(i4).longValue());
        }
        this.f7002a.mo8600b(i3);
        while (i2 < list.size()) {
            this.f7002a.mo8609c(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: k */
    public final void mo7667k(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f7002a.mo8612e(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f7002a.mo8586a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC1503v3.m8570i(list.get(i4).intValue());
        }
        this.f7002a.mo8600b(i3);
        while (i2 < list.size()) {
            this.f7002a.mo8610d(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: l */
    public final void mo7668l(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f7002a.m8585a(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.f7002a.mo8586a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC1503v3.m8535b(list.get(i4).floatValue());
        }
        this.f7002a.mo8600b(i3);
        while (i2 < list.size()) {
            this.f7002a.m8582a(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: m */
    public final void mo7669m(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f7002a.mo8607c(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f7002a.mo8586a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC1503v3.m8562g(list.get(i4).intValue());
        }
        this.f7002a.mo8600b(i3);
        while (i2 < list.size()) {
            this.f7002a.mo8600b(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    /* renamed from: n */
    public final void mo7670n(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f7002a.mo8612e(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f7002a.mo8586a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += AbstractC1503v3.m8573j(list.get(i4).intValue());
        }
        this.f7002a.mo8600b(i3);
        while (i2 < list.size()) {
            this.f7002a.mo8610d(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1215b8
    public final int zza() {
        return AbstractC1406o4.f.f6803k;
    }
}
