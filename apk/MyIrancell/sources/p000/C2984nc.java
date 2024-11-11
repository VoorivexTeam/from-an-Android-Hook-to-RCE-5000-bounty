package p000;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: nc */
/* loaded from: classes.dex */
public class C2984nc implements InterfaceC2892lc {

    /* renamed from: d */
    private static final Bitmap.Config[] f12311d;

    /* renamed from: e */
    private static final Bitmap.Config[] f12312e;

    /* renamed from: f */
    private static final Bitmap.Config[] f12313f;

    /* renamed from: g */
    private static final Bitmap.Config[] f12314g;

    /* renamed from: h */
    private static final Bitmap.Config[] f12315h;

    /* renamed from: a */
    private final c f12316a = new c();

    /* renamed from: b */
    private final C2548hc<b, Bitmap> f12317b = new C2548hc<>();

    /* renamed from: c */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f12318c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nc$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12319a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f12319a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12319a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12319a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12319a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nc$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC2938mc {

        /* renamed from: a */
        private final c f12320a;

        /* renamed from: b */
        int f12321b;

        /* renamed from: c */
        private Bitmap.Config f12322c;

        public b(c cVar) {
            this.f12320a = cVar;
        }

        @Override // p000.InterfaceC2938mc
        /* renamed from: a */
        public void mo3657a() {
            this.f12320a.m11359a(this);
        }

        /* renamed from: a */
        public void m14315a(int i, Bitmap.Config config) {
            this.f12321b = i;
            this.f12322c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f12321b == bVar.f12321b && C2861ki.m13733b(this.f12322c, bVar.f12322c);
        }

        public int hashCode() {
            int i = this.f12321b * 31;
            Bitmap.Config config = this.f12322c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C2984nc.m14313b(this.f12321b, this.f12322c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nc$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC2384dc<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p000.AbstractC2384dc
        /* renamed from: a, reason: avoid collision after fix types in other method */
        public b mo3659a() {
            return new b(this);
        }

        /* renamed from: a */
        public b m14316a(int i, Bitmap.Config config) {
            b m11360b = m11360b();
            m11360b.m14315a(i, config);
            return m11360b;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f12311d = configArr;
        f12312e = configArr;
        f12313f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f12314g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f12315h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: a */
    private b m14310a(int i, Bitmap.Config config) {
        b m14316a = this.f12316a.m14316a(i, config);
        for (Bitmap.Config config2 : m14312a(config)) {
            Integer ceilingKey = m14314b(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey != null && ceilingKey.intValue() <= i * 8) {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return m14316a;
                        }
                    } else if (config2.equals(config)) {
                        return m14316a;
                    }
                }
                this.f12316a.m11359a(m14316a);
                return this.f12316a.m14316a(ceilingKey.intValue(), config2);
            }
        }
        return m14316a;
    }

    /* renamed from: a */
    private void m14311a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> m14314b = m14314b(bitmap.getConfig());
        Integer num2 = (Integer) m14314b.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                m14314b.remove(num);
                return;
            } else {
                m14314b.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo3656c(bitmap) + ", this: " + this);
    }

    /* renamed from: a */
    private static Bitmap.Config[] m14312a(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f12312e;
        }
        int i = a.f12319a[config.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new Bitmap.Config[]{config} : f12315h : f12314g : f12313f : f12311d;
    }

    /* renamed from: b */
    static String m14313b(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: b */
    private NavigableMap<Integer, Integer> m14314b(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f12318c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f12318c.put(config, treeMap);
        return treeMap;
    }

    @Override // p000.InterfaceC2892lc
    /* renamed from: a */
    public Bitmap mo3651a() {
        Bitmap m12202a = this.f12317b.m12202a();
        if (m12202a != null) {
            m14311a(Integer.valueOf(C2861ki.m13721a(m12202a)), m12202a);
        }
        return m12202a;
    }

    @Override // p000.InterfaceC2892lc
    /* renamed from: a */
    public Bitmap mo3652a(int i, int i2, Bitmap.Config config) {
        b m14310a = m14310a(C2861ki.m13719a(i, i2, config), config);
        Bitmap m12203a = this.f12317b.m12203a((C2548hc<b, Bitmap>) m14310a);
        if (m12203a != null) {
            m14311a(Integer.valueOf(m14310a.f12321b), m12203a);
            m12203a.reconfigure(i, i2, config);
        }
        return m12203a;
    }

    @Override // p000.InterfaceC2892lc
    /* renamed from: a */
    public void mo3653a(Bitmap bitmap) {
        b m14316a = this.f12316a.m14316a(C2861ki.m13721a(bitmap), bitmap.getConfig());
        this.f12317b.m12204a(m14316a, bitmap);
        NavigableMap<Integer, Integer> m14314b = m14314b(bitmap.getConfig());
        Integer num = (Integer) m14314b.get(Integer.valueOf(m14316a.f12321b));
        m14314b.put(Integer.valueOf(m14316a.f12321b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p000.InterfaceC2892lc
    /* renamed from: b */
    public int mo3654b(Bitmap bitmap) {
        return C2861ki.m13721a(bitmap);
    }

    @Override // p000.InterfaceC2892lc
    /* renamed from: b */
    public String mo3655b(int i, int i2, Bitmap.Config config) {
        return m14313b(C2861ki.m13719a(i, i2, config), config);
    }

    @Override // p000.InterfaceC2892lc
    /* renamed from: c */
    public String mo3656c(Bitmap bitmap) {
        return m14313b(C2861ki.m13721a(bitmap), bitmap.getConfig());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f12317b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f12318c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f12318c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
