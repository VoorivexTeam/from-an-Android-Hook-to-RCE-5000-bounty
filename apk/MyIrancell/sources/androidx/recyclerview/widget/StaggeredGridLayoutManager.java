package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p000.C0448b3;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC0342o {

    /* renamed from: B */
    private BitSet f2170B;

    /* renamed from: G */
    private boolean f2175G;

    /* renamed from: H */
    private boolean f2176H;

    /* renamed from: I */
    private SavedState f2177I;

    /* renamed from: J */
    private int f2178J;

    /* renamed from: O */
    private int[] f2183O;

    /* renamed from: t */
    C0359d[] f2186t;

    /* renamed from: u */
    AbstractC0367h f2187u;

    /* renamed from: v */
    AbstractC0367h f2188v;

    /* renamed from: w */
    private int f2189w;

    /* renamed from: x */
    private int f2190x;

    /* renamed from: y */
    private final C0365f f2191y;

    /* renamed from: s */
    private int f2185s = -1;

    /* renamed from: z */
    boolean f2192z = false;

    /* renamed from: A */
    boolean f2169A = false;

    /* renamed from: C */
    int f2171C = -1;

    /* renamed from: D */
    int f2172D = Integer.MIN_VALUE;

    /* renamed from: E */
    LazySpanLookup f2173E = new LazySpanLookup();

    /* renamed from: F */
    private int f2174F = 2;

    /* renamed from: K */
    private final Rect f2179K = new Rect();

    /* renamed from: L */
    private final C0357b f2180L = new C0357b();

    /* renamed from: M */
    private boolean f2181M = false;

    /* renamed from: N */
    private boolean f2182N = true;

    /* renamed from: P */
    private final Runnable f2184P = new RunnableC0356a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class LazySpanLookup {

        /* renamed from: a */
        int[] f2193a;

        /* renamed from: b */
        List<FullSpanItem> f2194b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C0354a();

            /* renamed from: b */
            int f2195b;

            /* renamed from: c */
            int f2196c;

            /* renamed from: d */
            int[] f2197d;

            /* renamed from: e */
            boolean f2198e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            /* loaded from: classes.dex */
            static class C0354a implements Parcelable.Creator<FullSpanItem> {
                C0354a() {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            FullSpanItem() {
            }

            FullSpanItem(Parcel parcel) {
                this.f2195b = parcel.readInt();
                this.f2196c = parcel.readInt();
                this.f2198e = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2197d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            int m2707a(int i) {
                int[] iArr = this.f2197d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f2195b + ", mGapDir=" + this.f2196c + ", mHasUnwantedGapAfter=" + this.f2198e + ", mGapPerSpan=" + Arrays.toString(this.f2197d) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2195b);
                parcel.writeInt(this.f2196c);
                parcel.writeInt(this.f2198e ? 1 : 0);
                int[] iArr = this.f2197d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f2197d);
                }
            }
        }

        LazySpanLookup() {
        }

        /* renamed from: c */
        private void m2692c(int i, int i2) {
            List<FullSpanItem> list = this.f2194b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f2194b.get(size);
                int i3 = fullSpanItem.f2195b;
                if (i3 >= i) {
                    fullSpanItem.f2195b = i3 + i2;
                }
            }
        }

        /* renamed from: d */
        private void m2693d(int i, int i2) {
            List<FullSpanItem> list = this.f2194b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f2194b.get(size);
                int i4 = fullSpanItem.f2195b;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f2194b.remove(size);
                    } else {
                        fullSpanItem.f2195b = i4 - i2;
                    }
                }
            }
        }

        /* renamed from: g */
        private int m2694g(int i) {
            if (this.f2194b == null) {
                return -1;
            }
            FullSpanItem m2703c = m2703c(i);
            if (m2703c != null) {
                this.f2194b.remove(m2703c);
            }
            int size = this.f2194b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (this.f2194b.get(i2).f2195b >= i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.f2194b.get(i2);
            this.f2194b.remove(i2);
            return fullSpanItem.f2195b;
        }

        /* renamed from: a */
        public FullSpanItem m2695a(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f2194b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f2194b.get(i4);
                int i5 = fullSpanItem.f2195b;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f2196c == i3 || (z && fullSpanItem.f2198e))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: a */
        void m2696a() {
            int[] iArr = this.f2193a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2194b = null;
        }

        /* renamed from: a */
        void m2697a(int i) {
            int[] iArr = this.f2193a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f2193a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[m2706f(i)];
                this.f2193a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2193a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: a */
        void m2698a(int i, int i2) {
            int[] iArr = this.f2193a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m2697a(i3);
            int[] iArr2 = this.f2193a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f2193a, i, i3, -1);
            m2692c(i, i2);
        }

        /* renamed from: a */
        void m2699a(int i, C0359d c0359d) {
            m2697a(i);
            this.f2193a[i] = c0359d.f2223e;
        }

        /* renamed from: a */
        public void m2700a(FullSpanItem fullSpanItem) {
            if (this.f2194b == null) {
                this.f2194b = new ArrayList();
            }
            int size = this.f2194b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f2194b.get(i);
                if (fullSpanItem2.f2195b == fullSpanItem.f2195b) {
                    this.f2194b.remove(i);
                }
                if (fullSpanItem2.f2195b >= fullSpanItem.f2195b) {
                    this.f2194b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f2194b.add(fullSpanItem);
        }

        /* renamed from: b */
        int m2701b(int i) {
            List<FullSpanItem> list = this.f2194b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f2194b.get(size).f2195b >= i) {
                        this.f2194b.remove(size);
                    }
                }
            }
            return m2705e(i);
        }

        /* renamed from: b */
        void m2702b(int i, int i2) {
            int[] iArr = this.f2193a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m2697a(i3);
            int[] iArr2 = this.f2193a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f2193a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m2693d(i, i2);
        }

        /* renamed from: c */
        public FullSpanItem m2703c(int i) {
            List<FullSpanItem> list = this.f2194b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f2194b.get(size);
                if (fullSpanItem.f2195b == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: d */
        int m2704d(int i) {
            int[] iArr = this.f2193a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* renamed from: e */
        int m2705e(int i) {
            int[] iArr = this.f2193a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int m2694g = m2694g(i);
            if (m2694g == -1) {
                int[] iArr2 = this.f2193a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f2193a.length;
            }
            int i2 = m2694g + 1;
            Arrays.fill(this.f2193a, i, i2, -1);
            return i2;
        }

        /* renamed from: f */
        int m2706f(int i) {
            int length = this.f2193a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0355a();

        /* renamed from: b */
        int f2199b;

        /* renamed from: c */
        int f2200c;

        /* renamed from: d */
        int f2201d;

        /* renamed from: e */
        int[] f2202e;

        /* renamed from: f */
        int f2203f;

        /* renamed from: g */
        int[] f2204g;

        /* renamed from: h */
        List<LazySpanLookup.FullSpanItem> f2205h;

        /* renamed from: i */
        boolean f2206i;

        /* renamed from: j */
        boolean f2207j;

        /* renamed from: k */
        boolean f2208k;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        /* loaded from: classes.dex */
        static class C0355a implements Parcelable.Creator<SavedState> {
            C0355a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f2199b = parcel.readInt();
            this.f2200c = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2201d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2202e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2203f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2204g = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f2206i = parcel.readInt() == 1;
            this.f2207j = parcel.readInt() == 1;
            this.f2208k = parcel.readInt() == 1;
            this.f2205h = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f2201d = savedState.f2201d;
            this.f2199b = savedState.f2199b;
            this.f2200c = savedState.f2200c;
            this.f2202e = savedState.f2202e;
            this.f2203f = savedState.f2203f;
            this.f2204g = savedState.f2204g;
            this.f2206i = savedState.f2206i;
            this.f2207j = savedState.f2207j;
            this.f2208k = savedState.f2208k;
            this.f2205h = savedState.f2205h;
        }

        /* renamed from: a */
        void m2708a() {
            this.f2202e = null;
            this.f2201d = 0;
            this.f2203f = 0;
            this.f2204g = null;
            this.f2205h = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2199b);
            parcel.writeInt(this.f2200c);
            parcel.writeInt(this.f2201d);
            if (this.f2201d > 0) {
                parcel.writeIntArray(this.f2202e);
            }
            parcel.writeInt(this.f2203f);
            if (this.f2203f > 0) {
                parcel.writeIntArray(this.f2204g);
            }
            parcel.writeInt(this.f2206i ? 1 : 0);
            parcel.writeInt(this.f2207j ? 1 : 0);
            parcel.writeInt(this.f2208k ? 1 : 0);
            parcel.writeList(this.f2205h);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: classes.dex */
    class RunnableC0356a implements Runnable {
        RunnableC0356a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m2675F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: classes.dex */
    public class C0357b {

        /* renamed from: a */
        int f2210a;

        /* renamed from: b */
        int f2211b;

        /* renamed from: c */
        boolean f2212c;

        /* renamed from: d */
        boolean f2213d;

        /* renamed from: e */
        boolean f2214e;

        /* renamed from: f */
        int[] f2215f;

        C0357b() {
            m2712b();
        }

        /* renamed from: a */
        void m2709a() {
            this.f2211b = this.f2212c ? StaggeredGridLayoutManager.this.f2187u.mo2852b() : StaggeredGridLayoutManager.this.f2187u.mo2860f();
        }

        /* renamed from: a */
        void m2710a(int i) {
            this.f2211b = this.f2212c ? StaggeredGridLayoutManager.this.f2187u.mo2852b() - i : StaggeredGridLayoutManager.this.f2187u.mo2860f() + i;
        }

        /* renamed from: a */
        void m2711a(C0359d[] c0359dArr) {
            int length = c0359dArr.length;
            int[] iArr = this.f2215f;
            if (iArr == null || iArr.length < length) {
                this.f2215f = new int[StaggeredGridLayoutManager.this.f2186t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f2215f[i] = c0359dArr[i].m2722b(Integer.MIN_VALUE);
            }
        }

        /* renamed from: b */
        void m2712b() {
            this.f2210a = -1;
            this.f2211b = Integer.MIN_VALUE;
            this.f2212c = false;
            this.f2213d = false;
            this.f2214e = false;
            int[] iArr = this.f2215f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C0358c extends RecyclerView.C0343p {

        /* renamed from: e */
        C0359d f2217e;

        /* renamed from: f */
        boolean f2218f;

        public C0358c(int i, int i2) {
            super(i, i2);
        }

        public C0358c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0358c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0358c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: e */
        public final int m2713e() {
            C0359d c0359d = this.f2217e;
            if (c0359d == null) {
                return -1;
            }
            return c0359d.f2223e;
        }

        /* renamed from: f */
        public boolean m2714f() {
            return this.f2218f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    /* loaded from: classes.dex */
    public class C0359d {

        /* renamed from: a */
        ArrayList<View> f2219a = new ArrayList<>();

        /* renamed from: b */
        int f2220b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f2221c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f2222d = 0;

        /* renamed from: e */
        final int f2223e;

        C0359d(int i) {
            this.f2223e = i;
        }

        /* renamed from: a */
        int m2715a(int i) {
            int i2 = this.f2221c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2219a.size() == 0) {
                return i;
            }
            m2719a();
            return this.f2221c;
        }

        /* renamed from: a */
        int m2716a(int i, int i2, boolean z) {
            return m2717a(i, i2, false, false, z);
        }

        /* renamed from: a */
        int m2717a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int mo2860f = StaggeredGridLayoutManager.this.f2187u.mo2860f();
            int mo2852b = StaggeredGridLayoutManager.this.f2187u.mo2852b();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f2219a.get(i);
                int mo2857d = StaggeredGridLayoutManager.this.f2187u.mo2857d(view);
                int mo2850a = StaggeredGridLayoutManager.this.f2187u.mo2850a(view);
                boolean z4 = false;
                boolean z5 = !z3 ? mo2857d >= mo2852b : mo2857d > mo2852b;
                if (!z3 ? mo2850a > mo2860f : mo2850a >= mo2860f) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && mo2857d >= mo2860f && mo2850a <= mo2852b) {
                        }
                        return StaggeredGridLayoutManager.this.m2534l(view);
                    }
                    if (mo2857d >= mo2860f && mo2850a <= mo2852b) {
                        return StaggeredGridLayoutManager.this.m2534l(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: a */
        public View m2718a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f2219a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2219a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f2192z && staggeredGridLayoutManager.m2534l(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f2192z && staggeredGridLayoutManager2.m2534l(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2219a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f2219a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f2192z && staggeredGridLayoutManager3.m2534l(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f2192z && staggeredGridLayoutManager4.m2534l(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: a */
        void m2719a() {
            LazySpanLookup.FullSpanItem m2703c;
            ArrayList<View> arrayList = this.f2219a;
            View view = arrayList.get(arrayList.size() - 1);
            C0358c m2723b = m2723b(view);
            this.f2221c = StaggeredGridLayoutManager.this.f2187u.mo2850a(view);
            if (m2723b.f2218f && (m2703c = StaggeredGridLayoutManager.this.f2173E.m2703c(m2723b.m2556a())) != null && m2703c.f2196c == 1) {
                this.f2221c += m2703c.m2707a(this.f2223e);
            }
        }

        /* renamed from: a */
        void m2720a(View view) {
            C0358c m2723b = m2723b(view);
            m2723b.f2217e = this;
            this.f2219a.add(view);
            this.f2221c = Integer.MIN_VALUE;
            if (this.f2219a.size() == 1) {
                this.f2220b = Integer.MIN_VALUE;
            }
            if (m2723b.m2558c() || m2723b.m2557b()) {
                this.f2222d += StaggeredGridLayoutManager.this.f2187u.mo2853b(view);
            }
        }

        /* renamed from: a */
        void m2721a(boolean z, int i) {
            int m2715a = z ? m2715a(Integer.MIN_VALUE) : m2722b(Integer.MIN_VALUE);
            m2725c();
            if (m2715a == Integer.MIN_VALUE) {
                return;
            }
            if (!z || m2715a >= StaggeredGridLayoutManager.this.f2187u.mo2852b()) {
                if (z || m2715a <= StaggeredGridLayoutManager.this.f2187u.mo2860f()) {
                    if (i != Integer.MIN_VALUE) {
                        m2715a += i;
                    }
                    this.f2221c = m2715a;
                    this.f2220b = m2715a;
                }
            }
        }

        /* renamed from: b */
        int m2722b(int i) {
            int i2 = this.f2220b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2219a.size() == 0) {
                return i;
            }
            m2724b();
            return this.f2220b;
        }

        /* renamed from: b */
        C0358c m2723b(View view) {
            return (C0358c) view.getLayoutParams();
        }

        /* renamed from: b */
        void m2724b() {
            LazySpanLookup.FullSpanItem m2703c;
            View view = this.f2219a.get(0);
            C0358c m2723b = m2723b(view);
            this.f2220b = StaggeredGridLayoutManager.this.f2187u.mo2857d(view);
            if (m2723b.f2218f && (m2703c = StaggeredGridLayoutManager.this.f2173E.m2703c(m2723b.m2556a())) != null && m2703c.f2196c == -1) {
                this.f2220b -= m2703c.m2707a(this.f2223e);
            }
        }

        /* renamed from: c */
        void m2725c() {
            this.f2219a.clear();
            m2734i();
            this.f2222d = 0;
        }

        /* renamed from: c */
        void m2726c(int i) {
            int i2 = this.f2220b;
            if (i2 != Integer.MIN_VALUE) {
                this.f2220b = i2 + i;
            }
            int i3 = this.f2221c;
            if (i3 != Integer.MIN_VALUE) {
                this.f2221c = i3 + i;
            }
        }

        /* renamed from: c */
        void m2727c(View view) {
            C0358c m2723b = m2723b(view);
            m2723b.f2217e = this;
            this.f2219a.add(0, view);
            this.f2220b = Integer.MIN_VALUE;
            if (this.f2219a.size() == 1) {
                this.f2221c = Integer.MIN_VALUE;
            }
            if (m2723b.m2558c() || m2723b.m2557b()) {
                this.f2222d += StaggeredGridLayoutManager.this.f2187u.mo2853b(view);
            }
        }

        /* renamed from: d */
        public int m2728d() {
            int i;
            int size;
            if (StaggeredGridLayoutManager.this.f2192z) {
                i = this.f2219a.size() - 1;
                size = -1;
            } else {
                i = 0;
                size = this.f2219a.size();
            }
            return m2716a(i, size, true);
        }

        /* renamed from: d */
        void m2729d(int i) {
            this.f2220b = i;
            this.f2221c = i;
        }

        /* renamed from: e */
        public int m2730e() {
            int size;
            int i;
            if (StaggeredGridLayoutManager.this.f2192z) {
                size = 0;
                i = this.f2219a.size();
            } else {
                size = this.f2219a.size() - 1;
                i = -1;
            }
            return m2716a(size, i, true);
        }

        /* renamed from: f */
        public int m2731f() {
            return this.f2222d;
        }

        /* renamed from: g */
        int m2732g() {
            int i = this.f2221c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m2719a();
            return this.f2221c;
        }

        /* renamed from: h */
        int m2733h() {
            int i = this.f2220b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m2724b();
            return this.f2220b;
        }

        /* renamed from: i */
        void m2734i() {
            this.f2220b = Integer.MIN_VALUE;
            this.f2221c = Integer.MIN_VALUE;
        }

        /* renamed from: j */
        void m2735j() {
            int size = this.f2219a.size();
            View remove = this.f2219a.remove(size - 1);
            C0358c m2723b = m2723b(remove);
            m2723b.f2217e = null;
            if (m2723b.m2558c() || m2723b.m2557b()) {
                this.f2222d -= StaggeredGridLayoutManager.this.f2187u.mo2853b(remove);
            }
            if (size == 1) {
                this.f2220b = Integer.MIN_VALUE;
            }
            this.f2221c = Integer.MIN_VALUE;
        }

        /* renamed from: k */
        void m2736k() {
            View remove = this.f2219a.remove(0);
            C0358c m2723b = m2723b(remove);
            m2723b.f2217e = null;
            if (this.f2219a.size() == 0) {
                this.f2221c = Integer.MIN_VALUE;
            }
            if (m2723b.m2558c() || m2723b.m2557b()) {
                this.f2222d -= StaggeredGridLayoutManager.this.f2187u.mo2853b(remove);
            }
            this.f2220b = Integer.MIN_VALUE;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.AbstractC0342o.d m2453a = RecyclerView.AbstractC0342o.m2453a(context, attributeSet, i, i2);
        m2689h(m2453a.f2128a);
        m2690i(m2453a.f2129b);
        m2688c(m2453a.f2130c);
        this.f2191y = new C0365f();
        m2634M();
    }

    /* renamed from: M */
    private void m2634M() {
        this.f2187u = AbstractC0367h.m2847a(this, this.f2189w);
        this.f2188v = AbstractC0367h.m2847a(this, 1 - this.f2189w);
    }

    /* renamed from: N */
    private void m2635N() {
        if (this.f2188v.mo2856d() == 1073741824) {
            return;
        }
        float f = 0.0f;
        int m2514e = m2514e();
        for (int i = 0; i < m2514e; i++) {
            View m2501c = m2501c(i);
            float mo2853b = this.f2188v.mo2853b(m2501c);
            if (mo2853b >= f) {
                if (((C0358c) m2501c.getLayoutParams()).m2714f()) {
                    mo2853b = (mo2853b * 1.0f) / this.f2185s;
                }
                f = Math.max(f, mo2853b);
            }
        }
        int i2 = this.f2190x;
        int round = Math.round(f * this.f2185s);
        if (this.f2188v.mo2856d() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f2188v.mo2862g());
        }
        m2691j(round);
        if (this.f2190x == i2) {
            return;
        }
        for (int i3 = 0; i3 < m2514e; i3++) {
            View m2501c2 = m2501c(i3);
            C0358c c0358c = (C0358c) m2501c2.getLayoutParams();
            if (!c0358c.f2218f) {
                if (m2681L() && this.f2189w == 1) {
                    int i4 = this.f2185s;
                    int i5 = c0358c.f2217e.f2223e;
                    m2501c2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f2190x) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = c0358c.f2217e.f2223e;
                    int i7 = this.f2189w;
                    int i8 = (this.f2190x * i6) - (i6 * i2);
                    if (i7 == 1) {
                        m2501c2.offsetLeftAndRight(i8);
                    } else {
                        m2501c2.offsetTopAndBottom(i8);
                    }
                }
            }
        }
    }

    /* renamed from: O */
    private void m2636O() {
        this.f2169A = (this.f2189w == 1 || !m2681L()) ? this.f2192z : !this.f2192z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: a */
    private int m2637a(RecyclerView.C0349v c0349v, C0365f c0365f, RecyclerView.C0353z c0353z) {
        int i;
        C0359d c0359d;
        int mo2853b;
        int i2;
        int i3;
        int mo2853b2;
        RecyclerView.AbstractC0342o abstractC0342o;
        View view;
        int i4;
        int i5;
        ?? r9 = 0;
        this.f2170B.set(0, this.f2185s, true);
        if (this.f2191y.f2352i) {
            i = c0365f.f2348e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = c0365f.f2348e == 1 ? c0365f.f2350g + c0365f.f2345b : c0365f.f2349f - c0365f.f2345b;
        }
        m2655e(c0365f.f2348e, i);
        int mo2852b = this.f2169A ? this.f2187u.mo2852b() : this.f2187u.mo2860f();
        boolean z = false;
        while (c0365f.m2839a(c0353z) && (this.f2191y.f2352i || !this.f2170B.isEmpty())) {
            View m2838a = c0365f.m2838a(c0349v);
            C0358c c0358c = (C0358c) m2838a.getLayoutParams();
            int m2556a = c0358c.m2556a();
            int m2704d = this.f2173E.m2704d(m2556a);
            boolean z2 = m2704d == -1;
            if (z2) {
                c0359d = c0358c.f2218f ? this.f2186t[r9] : m2638a(c0365f);
                this.f2173E.m2699a(m2556a, c0359d);
            } else {
                c0359d = this.f2186t[m2704d];
            }
            C0359d c0359d2 = c0359d;
            c0358c.f2217e = c0359d2;
            if (c0365f.f2348e == 1) {
                m2494b(m2838a);
            } else {
                m2495b(m2838a, (int) r9);
            }
            m2641a(m2838a, c0358c, (boolean) r9);
            if (c0365f.f2348e == 1) {
                int m2666q = c0358c.f2218f ? m2666q(mo2852b) : c0359d2.m2715a(mo2852b);
                int mo2853b3 = this.f2187u.mo2853b(m2838a) + m2666q;
                if (z2 && c0358c.f2218f) {
                    LazySpanLookup.FullSpanItem m2661m = m2661m(m2666q);
                    m2661m.f2196c = -1;
                    m2661m.f2195b = m2556a;
                    this.f2173E.m2700a(m2661m);
                }
                i2 = mo2853b3;
                mo2853b = m2666q;
            } else {
                int m2670t = c0358c.f2218f ? m2670t(mo2852b) : c0359d2.m2722b(mo2852b);
                mo2853b = m2670t - this.f2187u.mo2853b(m2838a);
                if (z2 && c0358c.f2218f) {
                    LazySpanLookup.FullSpanItem m2662n = m2662n(m2670t);
                    m2662n.f2196c = 1;
                    m2662n.f2195b = m2556a;
                    this.f2173E.m2700a(m2662n);
                }
                i2 = m2670t;
            }
            if (c0358c.f2218f && c0365f.f2347d == -1) {
                if (!z2) {
                    if (!(c0365f.f2348e == 1 ? m2673D() : m2674E())) {
                        LazySpanLookup.FullSpanItem m2703c = this.f2173E.m2703c(m2556a);
                        if (m2703c != null) {
                            m2703c.f2198e = true;
                        }
                    }
                }
                this.f2181M = true;
            }
            m2640a(m2838a, c0358c, c0365f);
            if (m2681L() && this.f2189w == 1) {
                int mo2852b2 = c0358c.f2218f ? this.f2188v.mo2852b() : this.f2188v.mo2852b() - (((this.f2185s - 1) - c0359d2.f2223e) * this.f2190x);
                mo2853b2 = mo2852b2;
                i3 = mo2852b2 - this.f2188v.mo2853b(m2838a);
            } else {
                int mo2860f = c0358c.f2218f ? this.f2188v.mo2860f() : (c0359d2.f2223e * this.f2190x) + this.f2188v.mo2860f();
                i3 = mo2860f;
                mo2853b2 = this.f2188v.mo2853b(m2838a) + mo2860f;
            }
            if (this.f2189w == 1) {
                abstractC0342o = this;
                view = m2838a;
                i4 = i3;
                i3 = mo2853b;
                i5 = mo2853b2;
            } else {
                abstractC0342o = this;
                view = m2838a;
                i4 = mo2853b;
                i5 = i2;
                i2 = mo2853b2;
            }
            abstractC0342o.m2467a(view, i4, i3, i5, i2);
            if (c0358c.f2218f) {
                m2655e(this.f2191y.f2348e, i);
            } else {
                m2646a(c0359d2, this.f2191y.f2348e, i);
            }
            m2644a(c0349v, this.f2191y);
            if (this.f2191y.f2351h && m2838a.hasFocusable()) {
                if (c0358c.f2218f) {
                    this.f2170B.clear();
                } else {
                    this.f2170B.set(c0359d2.f2223e, false);
                    z = true;
                    r9 = 0;
                }
            }
            z = true;
            r9 = 0;
        }
        if (!z) {
            m2644a(c0349v, this.f2191y);
        }
        int mo2860f2 = this.f2191y.f2348e == -1 ? this.f2187u.mo2860f() - m2670t(this.f2187u.mo2860f()) : m2666q(this.f2187u.mo2852b()) - this.f2187u.mo2852b();
        if (mo2860f2 > 0) {
            return Math.min(c0365f.f2345b, mo2860f2);
        }
        return 0;
    }

    /* renamed from: a */
    private C0359d m2638a(C0365f c0365f) {
        int i;
        int i2;
        int i3 = -1;
        if (m2671u(c0365f.f2348e)) {
            i = this.f2185s - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.f2185s;
            i2 = 1;
        }
        C0359d c0359d = null;
        if (c0365f.f2348e == 1) {
            int i4 = Integer.MAX_VALUE;
            int mo2860f = this.f2187u.mo2860f();
            while (i != i3) {
                C0359d c0359d2 = this.f2186t[i];
                int m2715a = c0359d2.m2715a(mo2860f);
                if (m2715a < i4) {
                    c0359d = c0359d2;
                    i4 = m2715a;
                }
                i += i2;
            }
            return c0359d;
        }
        int i5 = Integer.MIN_VALUE;
        int mo2852b = this.f2187u.mo2852b();
        while (i != i3) {
            C0359d c0359d3 = this.f2186t[i];
            int m2722b = c0359d3.m2722b(mo2852b);
            if (m2722b > i5) {
                c0359d = c0359d3;
                i5 = m2722b;
            }
            i += i2;
        }
        return c0359d;
    }

    /* renamed from: a */
    private void m2639a(View view, int i, int i2, boolean z) {
        m2469a(view, this.f2179K);
        C0358c c0358c = (C0358c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0358c).leftMargin;
        Rect rect = this.f2179K;
        int m2652c = m2652c(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) c0358c).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) c0358c).topMargin;
        Rect rect2 = this.f2179K;
        int m2652c2 = m2652c(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) c0358c).bottomMargin + rect2.bottom);
        if (z ? m2499b(view, m2652c, m2652c2, c0358c) : m2482a(view, m2652c, m2652c2, c0358c)) {
            view.measure(m2652c, m2652c2);
        }
    }

    /* renamed from: a */
    private void m2640a(View view, C0358c c0358c, C0365f c0365f) {
        if (c0365f.f2348e == 1) {
            if (c0358c.f2218f) {
                m2665p(view);
                return;
            } else {
                c0358c.f2217e.m2720a(view);
                return;
            }
        }
        if (c0358c.f2218f) {
            m2667q(view);
        } else {
            c0358c.f2217e.m2727c(view);
        }
    }

    /* renamed from: a */
    private void m2641a(View view, C0358c c0358c, boolean z) {
        int m2452a;
        int m2452a2;
        if (c0358c.f2218f) {
            if (this.f2189w != 1) {
                m2639a(view, RecyclerView.AbstractC0342o.m2452a(m2542q(), m2543r(), m2537n() + m2539o(), ((ViewGroup.MarginLayoutParams) c0358c).width, true), this.f2178J, z);
                return;
            }
            m2452a = this.f2178J;
        } else {
            if (this.f2189w != 1) {
                m2452a = RecyclerView.AbstractC0342o.m2452a(m2542q(), m2543r(), m2537n() + m2539o(), ((ViewGroup.MarginLayoutParams) c0358c).width, true);
                m2452a2 = RecyclerView.AbstractC0342o.m2452a(this.f2190x, m2527i(), 0, ((ViewGroup.MarginLayoutParams) c0358c).height, false);
                m2639a(view, m2452a, m2452a2, z);
            }
            m2452a = RecyclerView.AbstractC0342o.m2452a(this.f2190x, m2543r(), 0, ((ViewGroup.MarginLayoutParams) c0358c).width, false);
        }
        m2452a2 = RecyclerView.AbstractC0342o.m2452a(m2525h(), m2527i(), m2541p() + m2535m(), ((ViewGroup.MarginLayoutParams) c0358c).height, true);
        m2639a(view, m2452a, m2452a2, z);
    }

    /* renamed from: a */
    private void m2642a(RecyclerView.C0349v c0349v, int i) {
        for (int m2514e = m2514e() - 1; m2514e >= 0; m2514e--) {
            View m2501c = m2501c(m2514e);
            if (this.f2187u.mo2857d(m2501c) < i || this.f2187u.mo2861f(m2501c) < i) {
                return;
            }
            C0358c c0358c = (C0358c) m2501c.getLayoutParams();
            if (c0358c.f2218f) {
                for (int i2 = 0; i2 < this.f2185s; i2++) {
                    if (this.f2186t[i2].f2219a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f2185s; i3++) {
                    this.f2186t[i3].m2735j();
                }
            } else if (c0358c.f2217e.f2219a.size() == 1) {
                return;
            } else {
                c0358c.f2217e.m2735j();
            }
            m2470a(m2501c, c0349v);
        }
    }

    /* renamed from: a */
    private void m2643a(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, boolean z) {
        int mo2852b;
        int m2666q = m2666q(Integer.MIN_VALUE);
        if (m2666q != Integer.MIN_VALUE && (mo2852b = this.f2187u.mo2852b() - m2666q) > 0) {
            int i = mo2852b - (-m2687c(-mo2852b, c0349v, c0353z));
            if (!z || i <= 0) {
                return;
            }
            this.f2187u.mo2851a(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r4.f2348e == (-1)) goto L11;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m2644a(androidx.recyclerview.widget.RecyclerView.C0349v r3, androidx.recyclerview.widget.C0365f r4) {
        /*
            r2 = this;
            boolean r0 = r4.f2344a
            if (r0 == 0) goto L4d
            boolean r0 = r4.f2352i
            if (r0 == 0) goto L9
            goto L4d
        L9:
            int r0 = r4.f2345b
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.f2348e
            if (r0 != r1) goto L18
        L12:
            int r4 = r4.f2350g
        L14:
            r2.m2642a(r3, r4)
            goto L4d
        L18:
            int r4 = r4.f2349f
        L1a:
            r2.m2650b(r3, r4)
            goto L4d
        L1e:
            int r0 = r4.f2348e
            if (r0 != r1) goto L37
            int r0 = r4.f2349f
            int r1 = r2.m2668r(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2c
            goto L12
        L2c:
            int r1 = r4.f2350g
            int r4 = r4.f2345b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L14
        L37:
            int r0 = r4.f2350g
            int r0 = r2.m2669s(r0)
            int r1 = r4.f2350g
            int r0 = r0 - r1
            if (r0 >= 0) goto L43
            goto L18
        L43:
            int r1 = r4.f2349f
            int r4 = r4.f2345b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L1a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m2644a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.f):void");
    }

    /* renamed from: a */
    private void m2645a(C0357b c0357b) {
        boolean z;
        SavedState savedState = this.f2177I;
        int i = savedState.f2201d;
        if (i > 0) {
            if (i == this.f2185s) {
                for (int i2 = 0; i2 < this.f2185s; i2++) {
                    this.f2186t[i2].m2725c();
                    SavedState savedState2 = this.f2177I;
                    int i3 = savedState2.f2202e[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += savedState2.f2207j ? this.f2187u.mo2852b() : this.f2187u.mo2860f();
                    }
                    this.f2186t[i2].m2729d(i3);
                }
            } else {
                savedState.m2708a();
                SavedState savedState3 = this.f2177I;
                savedState3.f2199b = savedState3.f2200c;
            }
        }
        SavedState savedState4 = this.f2177I;
        this.f2176H = savedState4.f2208k;
        m2688c(savedState4.f2206i);
        m2636O();
        SavedState savedState5 = this.f2177I;
        int i4 = savedState5.f2199b;
        if (i4 != -1) {
            this.f2171C = i4;
            z = savedState5.f2207j;
        } else {
            z = this.f2169A;
        }
        c0357b.f2212c = z;
        SavedState savedState6 = this.f2177I;
        if (savedState6.f2203f > 1) {
            LazySpanLookup lazySpanLookup = this.f2173E;
            lazySpanLookup.f2193a = savedState6.f2204g;
            lazySpanLookup.f2194b = savedState6.f2205h;
        }
    }

    /* renamed from: a */
    private void m2646a(C0359d c0359d, int i, int i2) {
        int m2731f = c0359d.m2731f();
        if (i == -1) {
            if (c0359d.m2733h() + m2731f > i2) {
                return;
            }
        } else if (c0359d.m2732g() - m2731f < i2) {
            return;
        }
        this.f2170B.set(c0359d.f2223e, false);
    }

    /* renamed from: a */
    private boolean m2647a(C0359d c0359d) {
        if (this.f2169A) {
            if (c0359d.m2732g() < this.f2187u.mo2852b()) {
                ArrayList<View> arrayList = c0359d.f2219a;
                return !c0359d.m2723b(arrayList.get(arrayList.size() - 1)).f2218f;
            }
        } else if (c0359d.m2733h() > this.f2187u.mo2860f()) {
            return !c0359d.m2723b(c0359d.f2219a.get(0)).f2218f;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m2648b(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f2169A
            if (r0 == 0) goto L9
            int r0 = r6.m2678I()
            goto Ld
        L9:
            int r0 = r6.m2677H()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f2173E
            r4.m2705e(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f2173E
            r9.m2702b(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f2173E
            r7.m2698a(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f2173E
            r9.m2702b(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f2173E
            r9.m2698a(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f2169A
            if (r7 == 0) goto L4d
            int r7 = r6.m2677H()
            goto L51
        L4d:
            int r7 = r6.m2678I()
        L51:
            if (r3 > r7) goto L56
            r6.m2548y()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m2648b(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m2649b(int r5, androidx.recyclerview.widget.RecyclerView.C0353z r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.f2191y
            r1 = 0
            r0.f2345b = r1
            r0.f2346c = r5
            boolean r0 = r4.m2547w()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.m2630b()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.f2169A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.h r5 = r4.f2187u
            int r5 = r5.mo2862g()
            goto L2f
        L25:
            androidx.recyclerview.widget.h r5 = r4.f2187u
            int r5 = r5.mo2862g()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.m2521f()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.f r0 = r4.f2191y
            androidx.recyclerview.widget.h r3 = r4.f2187u
            int r3 = r3.mo2860f()
            int r3 = r3 - r6
            r0.f2349f = r3
            androidx.recyclerview.widget.f r6 = r4.f2191y
            androidx.recyclerview.widget.h r0 = r4.f2187u
            int r0 = r0.mo2852b()
            int r0 = r0 + r5
            r6.f2350g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.f r0 = r4.f2191y
            androidx.recyclerview.widget.h r3 = r4.f2187u
            int r3 = r3.mo2849a()
            int r3 = r3 + r5
            r0.f2350g = r3
            androidx.recyclerview.widget.f r5 = r4.f2191y
            int r6 = -r6
            r5.f2349f = r6
        L5d:
            androidx.recyclerview.widget.f r5 = r4.f2191y
            r5.f2351h = r1
            r5.f2344a = r2
            androidx.recyclerview.widget.h r6 = r4.f2187u
            int r6 = r6.mo2856d()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.h r6 = r4.f2187u
            int r6 = r6.mo2849a()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.f2352i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m2649b(int, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    /* renamed from: b */
    private void m2650b(RecyclerView.C0349v c0349v, int i) {
        while (m2514e() > 0) {
            View m2501c = m2501c(0);
            if (this.f2187u.mo2850a(m2501c) > i || this.f2187u.mo2859e(m2501c) > i) {
                return;
            }
            C0358c c0358c = (C0358c) m2501c.getLayoutParams();
            if (c0358c.f2218f) {
                for (int i2 = 0; i2 < this.f2185s; i2++) {
                    if (this.f2186t[i2].f2219a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f2185s; i3++) {
                    this.f2186t[i3].m2736k();
                }
            } else if (c0358c.f2217e.f2219a.size() == 1) {
                return;
            } else {
                c0358c.f2217e.m2736k();
            }
            m2470a(m2501c, c0349v);
        }
    }

    /* renamed from: b */
    private void m2651b(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, boolean z) {
        int mo2860f;
        int m2670t = m2670t(Integer.MAX_VALUE);
        if (m2670t != Integer.MAX_VALUE && (mo2860f = m2670t - this.f2187u.mo2860f()) > 0) {
            int m2687c = mo2860f - m2687c(mo2860f, c0349v, c0353z);
            if (!z || m2687c <= 0) {
                return;
            }
            this.f2187u.mo2851a(-m2687c);
        }
    }

    /* renamed from: c */
    private int m2652c(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x014b, code lost:
    
        if (m2675F() != false) goto L90;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m2653c(androidx.recyclerview.widget.RecyclerView.C0349v r9, androidx.recyclerview.widget.RecyclerView.C0353z r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m2653c(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    /* renamed from: c */
    private boolean m2654c(RecyclerView.C0353z c0353z, C0357b c0357b) {
        boolean z = this.f2175G;
        int m2627a = c0353z.m2627a();
        c0357b.f2210a = z ? m2664p(m2627a) : m2663o(m2627a);
        c0357b.f2211b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: e */
    private void m2655e(int i, int i2) {
        for (int i3 = 0; i3 < this.f2185s; i3++) {
            if (!this.f2186t[i3].f2219a.isEmpty()) {
                m2646a(this.f2186t[i3], i, i2);
            }
        }
    }

    /* renamed from: h */
    private int m2656h(RecyclerView.C0353z c0353z) {
        if (m2514e() == 0) {
            return 0;
        }
        return C0369j.m2867a(c0353z, this.f2187u, m2685b(!this.f2182N), m2682a(!this.f2182N), this, this.f2182N);
    }

    /* renamed from: i */
    private int m2657i(RecyclerView.C0353z c0353z) {
        if (m2514e() == 0) {
            return 0;
        }
        return C0369j.m2868a(c0353z, this.f2187u, m2685b(!this.f2182N), m2682a(!this.f2182N), this, this.f2182N, this.f2169A);
    }

    /* renamed from: j */
    private int m2658j(RecyclerView.C0353z c0353z) {
        if (m2514e() == 0) {
            return 0;
        }
        return C0369j.m2869b(c0353z, this.f2187u, m2685b(!this.f2182N), m2682a(!this.f2182N), this, this.f2182N);
    }

    /* renamed from: k */
    private int m2659k(int i) {
        if (m2514e() == 0) {
            return this.f2169A ? 1 : -1;
        }
        return (i < m2677H()) != this.f2169A ? -1 : 1;
    }

    /* renamed from: l */
    private int m2660l(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f2189w == 1) ? 1 : Integer.MIN_VALUE : this.f2189w == 0 ? 1 : Integer.MIN_VALUE : this.f2189w == 1 ? -1 : Integer.MIN_VALUE : this.f2189w == 0 ? -1 : Integer.MIN_VALUE : (this.f2189w != 1 && m2681L()) ? -1 : 1 : (this.f2189w != 1 && m2681L()) ? 1 : -1;
    }

    /* renamed from: m */
    private LazySpanLookup.FullSpanItem m2661m(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f2197d = new int[this.f2185s];
        for (int i2 = 0; i2 < this.f2185s; i2++) {
            fullSpanItem.f2197d[i2] = i - this.f2186t[i2].m2715a(i);
        }
        return fullSpanItem;
    }

    /* renamed from: n */
    private LazySpanLookup.FullSpanItem m2662n(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f2197d = new int[this.f2185s];
        for (int i2 = 0; i2 < this.f2185s; i2++) {
            fullSpanItem.f2197d[i2] = this.f2186t[i2].m2722b(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: o */
    private int m2663o(int i) {
        int m2514e = m2514e();
        for (int i2 = 0; i2 < m2514e; i2++) {
            int m2534l = m2534l(m2501c(i2));
            if (m2534l >= 0 && m2534l < i) {
                return m2534l;
            }
        }
        return 0;
    }

    /* renamed from: p */
    private int m2664p(int i) {
        for (int m2514e = m2514e() - 1; m2514e >= 0; m2514e--) {
            int m2534l = m2534l(m2501c(m2514e));
            if (m2534l >= 0 && m2534l < i) {
                return m2534l;
            }
        }
        return 0;
    }

    /* renamed from: p */
    private void m2665p(View view) {
        for (int i = this.f2185s - 1; i >= 0; i--) {
            this.f2186t[i].m2720a(view);
        }
    }

    /* renamed from: q */
    private int m2666q(int i) {
        int m2715a = this.f2186t[0].m2715a(i);
        for (int i2 = 1; i2 < this.f2185s; i2++) {
            int m2715a2 = this.f2186t[i2].m2715a(i);
            if (m2715a2 > m2715a) {
                m2715a = m2715a2;
            }
        }
        return m2715a;
    }

    /* renamed from: q */
    private void m2667q(View view) {
        for (int i = this.f2185s - 1; i >= 0; i--) {
            this.f2186t[i].m2727c(view);
        }
    }

    /* renamed from: r */
    private int m2668r(int i) {
        int m2722b = this.f2186t[0].m2722b(i);
        for (int i2 = 1; i2 < this.f2185s; i2++) {
            int m2722b2 = this.f2186t[i2].m2722b(i);
            if (m2722b2 > m2722b) {
                m2722b = m2722b2;
            }
        }
        return m2722b;
    }

    /* renamed from: s */
    private int m2669s(int i) {
        int m2715a = this.f2186t[0].m2715a(i);
        for (int i2 = 1; i2 < this.f2185s; i2++) {
            int m2715a2 = this.f2186t[i2].m2715a(i);
            if (m2715a2 < m2715a) {
                m2715a = m2715a2;
            }
        }
        return m2715a;
    }

    /* renamed from: t */
    private int m2670t(int i) {
        int m2722b = this.f2186t[0].m2722b(i);
        for (int i2 = 1; i2 < this.f2185s; i2++) {
            int m2722b2 = this.f2186t[i2].m2722b(i);
            if (m2722b2 < m2722b) {
                m2722b = m2722b2;
            }
        }
        return m2722b;
    }

    /* renamed from: u */
    private boolean m2671u(int i) {
        if (this.f2189w == 0) {
            return (i == -1) != this.f2169A;
        }
        return ((i == -1) == this.f2169A) == m2681L();
    }

    /* renamed from: v */
    private void m2672v(int i) {
        C0365f c0365f = this.f2191y;
        c0365f.f2348e = i;
        c0365f.f2347d = this.f2169A != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: C */
    public boolean mo2095C() {
        return this.f2177I == null;
    }

    /* renamed from: D */
    boolean m2673D() {
        int m2715a = this.f2186t[0].m2715a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2185s; i++) {
            if (this.f2186t[i].m2715a(Integer.MIN_VALUE) != m2715a) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E */
    boolean m2674E() {
        int m2722b = this.f2186t[0].m2722b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2185s; i++) {
            if (this.f2186t[i].m2722b(Integer.MIN_VALUE) != m2722b) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    boolean m2675F() {
        int m2677H;
        int m2678I;
        if (m2514e() == 0 || this.f2174F == 0 || !m2545t()) {
            return false;
        }
        if (this.f2169A) {
            m2677H = m2678I();
            m2678I = m2677H();
        } else {
            m2677H = m2677H();
            m2678I = m2678I();
        }
        if (m2677H == 0 && m2679J() != null) {
            this.f2173E.m2696a();
        } else {
            if (!this.f2181M) {
                return false;
            }
            int i = this.f2169A ? -1 : 1;
            int i2 = m2678I + 1;
            LazySpanLookup.FullSpanItem m2695a = this.f2173E.m2695a(m2677H, i2, i, true);
            if (m2695a == null) {
                this.f2181M = false;
                this.f2173E.m2701b(i2);
                return false;
            }
            LazySpanLookup.FullSpanItem m2695a2 = this.f2173E.m2695a(m2677H, m2695a.f2195b, i * (-1), true);
            if (m2695a2 == null) {
                this.f2173E.m2701b(m2695a.f2195b);
            } else {
                this.f2173E.m2701b(m2695a2.f2195b + 1);
            }
        }
        m2549z();
        m2548y();
        return true;
    }

    /* renamed from: G */
    int m2676G() {
        View m2682a = this.f2169A ? m2682a(true) : m2685b(true);
        if (m2682a == null) {
            return -1;
        }
        return m2534l(m2682a);
    }

    /* renamed from: H */
    int m2677H() {
        if (m2514e() == 0) {
            return 0;
        }
        return m2534l(m2501c(0));
    }

    /* renamed from: I */
    int m2678I() {
        int m2514e = m2514e();
        if (m2514e == 0) {
            return 0;
        }
        return m2534l(m2501c(m2514e - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r10 == r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
    
        if (r10 == r11) goto L37;
     */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View m2679J() {
        /*
            r12 = this;
            int r0 = r12.m2514e()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f2185s
            r2.<init>(r3)
            int r3 = r12.f2185s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f2189w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.m2681L()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.f2169A
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.m2501c(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0358c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f2217e
            int r9 = r9.f2223e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f2217e
            boolean r9 = r12.m2647a(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f2217e
            int r9 = r9.f2223e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f2218f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.m2501c(r9)
            boolean r10 = r12.f2169A
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.h r10 = r12.f2187u
            int r10 = r10.mo2850a(r7)
            androidx.recyclerview.widget.h r11 = r12.f2187u
            int r11 = r11.mo2850a(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.h r10 = r12.f2187u
            int r10 = r10.mo2857d(r7)
            androidx.recyclerview.widget.h r11 = r12.f2187u
            int r11 = r11.mo2857d(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0358c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f2217e
            int r8 = r8.f2223e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f2217e
            int r9 = r9.f2223e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m2679J():android.view.View");
    }

    /* renamed from: K */
    public void m2680K() {
        this.f2173E.m2696a();
        m2548y();
    }

    /* renamed from: L */
    boolean m2681L() {
        return m2529j() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public int mo2096a(int i, RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        return m2687c(i, c0349v, c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public int mo2097a(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        return this.f2189w == 1 ? this.f2185s : super.mo2097a(c0349v, c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public int mo2168a(RecyclerView.C0353z c0353z) {
        return m2656h(c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public View mo2098a(View view, int i, RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        View m2502c;
        View m2718a;
        if (m2514e() == 0 || (m2502c = m2502c(view)) == null) {
            return null;
        }
        m2636O();
        int m2660l = m2660l(i);
        if (m2660l == Integer.MIN_VALUE) {
            return null;
        }
        C0358c c0358c = (C0358c) m2502c.getLayoutParams();
        boolean z = c0358c.f2218f;
        C0359d c0359d = c0358c.f2217e;
        int m2678I = m2660l == 1 ? m2678I() : m2677H();
        m2649b(m2678I, c0353z);
        m2672v(m2660l);
        C0365f c0365f = this.f2191y;
        c0365f.f2346c = c0365f.f2347d + m2678I;
        c0365f.f2345b = (int) (this.f2187u.mo2862g() * 0.33333334f);
        C0365f c0365f2 = this.f2191y;
        c0365f2.f2351h = true;
        c0365f2.f2344a = false;
        m2637a(c0349v, c0365f2, c0353z);
        this.f2175G = this.f2169A;
        if (!z && (m2718a = c0359d.m2718a(m2678I, m2660l)) != null && m2718a != m2502c) {
            return m2718a;
        }
        if (m2671u(m2660l)) {
            for (int i2 = this.f2185s - 1; i2 >= 0; i2--) {
                View m2718a2 = this.f2186t[i2].m2718a(m2678I, m2660l);
                if (m2718a2 != null && m2718a2 != m2502c) {
                    return m2718a2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f2185s; i3++) {
                View m2718a3 = this.f2186t[i3].m2718a(m2678I, m2660l);
                if (m2718a3 != null && m2718a3 != m2502c) {
                    return m2718a3;
                }
            }
        }
        boolean z2 = (this.f2192z ^ true) == (m2660l == -1);
        if (!z) {
            View mo2178b = mo2178b(z2 ? c0359d.m2728d() : c0359d.m2730e());
            if (mo2178b != null && mo2178b != m2502c) {
                return mo2178b;
            }
        }
        if (m2671u(m2660l)) {
            for (int i4 = this.f2185s - 1; i4 >= 0; i4--) {
                if (i4 != c0359d.f2223e) {
                    C0359d[] c0359dArr = this.f2186t;
                    View mo2178b2 = mo2178b(z2 ? c0359dArr[i4].m2728d() : c0359dArr[i4].m2730e());
                    if (mo2178b2 != null && mo2178b2 != m2502c) {
                        return mo2178b2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f2185s; i5++) {
                C0359d[] c0359dArr2 = this.f2186t;
                View mo2178b3 = mo2178b(z2 ? c0359dArr2[i5].m2728d() : c0359dArr2[i5].m2730e());
                if (mo2178b3 != null && mo2178b3 != m2502c) {
                    return mo2178b3;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    View m2682a(boolean z) {
        int mo2860f = this.f2187u.mo2860f();
        int mo2852b = this.f2187u.mo2852b();
        View view = null;
        for (int m2514e = m2514e() - 1; m2514e >= 0; m2514e--) {
            View m2501c = m2501c(m2514e);
            int mo2857d = this.f2187u.mo2857d(m2501c);
            int mo2850a = this.f2187u.mo2850a(m2501c);
            if (mo2850a > mo2860f && mo2857d < mo2852b) {
                if (mo2850a <= mo2852b || !z) {
                    return m2501c;
                }
                if (view == null) {
                    view = m2501c;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public RecyclerView.C0343p mo2100a(Context context, AttributeSet attributeSet) {
        return new C0358c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public RecyclerView.C0343p mo2101a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0358c((ViewGroup.MarginLayoutParams) layoutParams) : new C0358c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2170a(int i, int i2, RecyclerView.C0353z c0353z, RecyclerView.AbstractC0342o.c cVar) {
        int m2715a;
        int i3;
        if (this.f2189w != 0) {
            i = i2;
        }
        if (m2514e() == 0 || i == 0) {
            return;
        }
        m2683a(i, c0353z);
        int[] iArr = this.f2183O;
        if (iArr == null || iArr.length < this.f2185s) {
            this.f2183O = new int[this.f2185s];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f2185s; i5++) {
            C0365f c0365f = this.f2191y;
            if (c0365f.f2347d == -1) {
                m2715a = c0365f.f2349f;
                i3 = this.f2186t[i5].m2722b(m2715a);
            } else {
                m2715a = this.f2186t[i5].m2715a(c0365f.f2350g);
                i3 = this.f2191y.f2350g;
            }
            int i6 = m2715a - i3;
            if (i6 >= 0) {
                this.f2183O[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.f2183O, 0, i4);
        for (int i7 = 0; i7 < i4 && this.f2191y.m2839a(c0353z); i7++) {
            cVar.mo2555a(this.f2191y.f2346c, this.f2183O[i7]);
            C0365f c0365f2 = this.f2191y;
            c0365f2.f2346c += c0365f2.f2347d;
        }
    }

    /* renamed from: a */
    void m2683a(int i, RecyclerView.C0353z c0353z) {
        int m2677H;
        int i2;
        if (i > 0) {
            m2677H = m2678I();
            i2 = 1;
        } else {
            m2677H = m2677H();
            i2 = -1;
        }
        this.f2191y.f2344a = true;
        m2649b(m2677H, c0353z);
        m2672v(i2);
        C0365f c0365f = this.f2191y;
        c0365f.f2346c = m2677H + c0365f.f2347d;
        c0365f.f2345b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2102a(Rect rect, int i, int i2) {
        int m2451a;
        int m2451a2;
        int m2537n = m2537n() + m2539o();
        int m2541p = m2541p() + m2535m();
        if (this.f2189w == 1) {
            m2451a2 = RecyclerView.AbstractC0342o.m2451a(i2, rect.height() + m2541p, m2531k());
            m2451a = RecyclerView.AbstractC0342o.m2451a(i, (this.f2190x * this.f2185s) + m2537n, m2533l());
        } else {
            m2451a = RecyclerView.AbstractC0342o.m2451a(i, rect.width() + m2537n, m2533l());
            m2451a2 = RecyclerView.AbstractC0342o.m2451a(i2, (this.f2190x * this.f2185s) + m2541p, m2531k());
        }
        m2503c(m2451a, m2451a2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2172a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f2177I = (SavedState) parcelable;
            m2548y();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2173a(AccessibilityEvent accessibilityEvent) {
        super.mo2173a(accessibilityEvent);
        if (m2514e() > 0) {
            View m2685b = m2685b(false);
            View m2682a = m2682a(false);
            if (m2685b == null || m2682a == null) {
                return;
            }
            int m2534l = m2534l(m2685b);
            int m2534l2 = m2534l(m2682a);
            if (m2534l < m2534l2) {
                accessibilityEvent.setFromIndex(m2534l);
                accessibilityEvent.setToIndex(m2534l2);
            } else {
                accessibilityEvent.setFromIndex(m2534l2);
                accessibilityEvent.setToIndex(m2534l);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2103a(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, View view, C0448b3 c0448b3) {
        int i;
        int i2;
        int m2713e;
        int i3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0358c)) {
            super.m2471a(view, c0448b3);
            return;
        }
        C0358c c0358c = (C0358c) layoutParams;
        if (this.f2189w == 0) {
            i = c0358c.m2713e();
            i2 = c0358c.f2218f ? this.f2185s : 1;
            m2713e = -1;
            i3 = -1;
        } else {
            i = -1;
            i2 = -1;
            m2713e = c0358c.m2713e();
            i3 = c0358c.f2218f ? this.f2185s : 1;
        }
        c0448b3.m3287b(C0448b3.b.m3311a(i, i2, m2713e, i3, c0358c.f2218f, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2107a(RecyclerView recyclerView, int i, int i2) {
        m2648b(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2108a(RecyclerView recyclerView, int i, int i2, int i3) {
        m2648b(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2109a(RecyclerView recyclerView, int i, int i2, Object obj) {
        m2648b(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2174a(String str) {
        if (this.f2177I == null) {
            super.mo2174a(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public boolean mo2176a() {
        return this.f2189w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public boolean mo2110a(RecyclerView.C0343p c0343p) {
        return c0343p instanceof C0358c;
    }

    /* renamed from: a */
    boolean m2684a(RecyclerView.C0353z c0353z, C0357b c0357b) {
        int i;
        int mo2860f;
        int mo2857d;
        if (!c0353z.m2632d() && (i = this.f2171C) != -1) {
            if (i >= 0 && i < c0353z.m2627a()) {
                SavedState savedState = this.f2177I;
                if (savedState == null || savedState.f2199b == -1 || savedState.f2201d < 1) {
                    View mo2178b = mo2178b(this.f2171C);
                    if (mo2178b != null) {
                        c0357b.f2210a = this.f2169A ? m2678I() : m2677H();
                        if (this.f2172D != Integer.MIN_VALUE) {
                            if (c0357b.f2212c) {
                                mo2860f = this.f2187u.mo2852b() - this.f2172D;
                                mo2857d = this.f2187u.mo2850a(mo2178b);
                            } else {
                                mo2860f = this.f2187u.mo2860f() + this.f2172D;
                                mo2857d = this.f2187u.mo2857d(mo2178b);
                            }
                            c0357b.f2211b = mo2860f - mo2857d;
                            return true;
                        }
                        if (this.f2187u.mo2853b(mo2178b) > this.f2187u.mo2862g()) {
                            c0357b.f2211b = c0357b.f2212c ? this.f2187u.mo2852b() : this.f2187u.mo2860f();
                            return true;
                        }
                        int mo2857d2 = this.f2187u.mo2857d(mo2178b) - this.f2187u.mo2860f();
                        if (mo2857d2 < 0) {
                            c0357b.f2211b = -mo2857d2;
                            return true;
                        }
                        int mo2852b = this.f2187u.mo2852b() - this.f2187u.mo2850a(mo2178b);
                        if (mo2852b < 0) {
                            c0357b.f2211b = mo2852b;
                            return true;
                        }
                        c0357b.f2211b = Integer.MIN_VALUE;
                    } else {
                        int i2 = this.f2171C;
                        c0357b.f2210a = i2;
                        int i3 = this.f2172D;
                        if (i3 == Integer.MIN_VALUE) {
                            c0357b.f2212c = m2659k(i2) == 1;
                            c0357b.m2709a();
                        } else {
                            c0357b.m2710a(i3);
                        }
                        c0357b.f2213d = true;
                    }
                } else {
                    c0357b.f2211b = Integer.MIN_VALUE;
                    c0357b.f2210a = this.f2171C;
                }
                return true;
            }
            this.f2171C = -1;
            this.f2172D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: b */
    public int mo2111b(int i, RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        return m2687c(i, c0349v, c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: b */
    public int mo2112b(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        return this.f2189w == 0 ? this.f2185s : super.mo2112b(c0349v, c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: b */
    public int mo2177b(RecyclerView.C0353z c0353z) {
        return m2657i(c0353z);
    }

    /* renamed from: b */
    View m2685b(boolean z) {
        int mo2860f = this.f2187u.mo2860f();
        int mo2852b = this.f2187u.mo2852b();
        int m2514e = m2514e();
        View view = null;
        for (int i = 0; i < m2514e; i++) {
            View m2501c = m2501c(i);
            int mo2857d = this.f2187u.mo2857d(m2501c);
            if (this.f2187u.mo2850a(m2501c) > mo2860f && mo2857d < mo2852b) {
                if (mo2857d >= mo2860f || !z) {
                    return m2501c;
                }
                if (view == null) {
                    view = m2501c;
                }
            }
        }
        return view;
    }

    /* renamed from: b */
    void m2686b(RecyclerView.C0353z c0353z, C0357b c0357b) {
        if (m2684a(c0353z, c0357b) || m2654c(c0353z, c0357b)) {
            return;
        }
        c0357b.m2709a();
        c0357b.f2210a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: b */
    public void mo2113b(RecyclerView recyclerView, int i, int i2) {
        m2648b(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: b */
    public void mo2179b(RecyclerView recyclerView, RecyclerView.C0349v c0349v) {
        super.mo2179b(recyclerView, c0349v);
        m2492a(this.f2184P);
        for (int i = 0; i < this.f2185s; i++) {
            this.f2186t[i].m2725c();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: b */
    public boolean mo2180b() {
        return this.f2189w == 1;
    }

    /* renamed from: c */
    int m2687c(int i, RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        if (m2514e() == 0 || i == 0) {
            return 0;
        }
        m2683a(i, c0353z);
        int m2637a = m2637a(c0349v, this.f2191y, c0353z);
        if (this.f2191y.f2345b >= m2637a) {
            i = i < 0 ? -m2637a : m2637a;
        }
        this.f2187u.mo2851a(-i);
        this.f2175G = this.f2169A;
        C0365f c0365f = this.f2191y;
        c0365f.f2345b = 0;
        m2644a(c0349v, c0365f);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: c */
    public int mo2182c(RecyclerView.C0353z c0353z) {
        return m2658j(c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: c */
    public RecyclerView.C0343p mo2115c() {
        return this.f2189w == 0 ? new C0358c(-2, -1) : new C0358c(-1, -2);
    }

    /* renamed from: c */
    public void m2688c(boolean z) {
        mo2174a((String) null);
        SavedState savedState = this.f2177I;
        if (savedState != null && savedState.f2206i != z) {
            savedState.f2206i = z;
        }
        this.f2192z = z;
        m2548y();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: d */
    public int mo2183d(RecyclerView.C0353z c0353z) {
        return m2656h(c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: d */
    public void mo2511d(int i) {
        super.mo2511d(i);
        for (int i2 = 0; i2 < this.f2185s; i2++) {
            this.f2186t[i2].m2726c(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: d */
    public void mo2116d(RecyclerView recyclerView) {
        this.f2173E.m2696a();
        m2548y();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: e */
    public int mo2184e(RecyclerView.C0353z c0353z) {
        return m2657i(c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: e */
    public void mo2516e(int i) {
        super.mo2516e(i);
        for (int i2 = 0; i2 < this.f2185s; i2++) {
            this.f2186t[i2].m2726c(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: e */
    public void mo2117e(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        m2653c(c0349v, c0353z, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: f */
    public int mo2186f(RecyclerView.C0353z c0353z) {
        return m2658j(c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: f */
    public void mo2519f(int i) {
        if (i == 0) {
            m2675F();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: g */
    public void mo2119g(RecyclerView.C0353z c0353z) {
        super.mo2119g(c0353z);
        this.f2171C = -1;
        this.f2172D = Integer.MIN_VALUE;
        this.f2177I = null;
        this.f2180L.m2712b();
    }

    /* renamed from: h */
    public void m2689h(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo2174a((String) null);
        if (i == this.f2189w) {
            return;
        }
        this.f2189w = i;
        AbstractC0367h abstractC0367h = this.f2187u;
        this.f2187u = this.f2188v;
        this.f2188v = abstractC0367h;
        m2548y();
    }

    /* renamed from: i */
    public void m2690i(int i) {
        mo2174a((String) null);
        if (i != this.f2185s) {
            m2680K();
            this.f2185s = i;
            this.f2170B = new BitSet(this.f2185s);
            this.f2186t = new C0359d[this.f2185s];
            for (int i2 = 0; i2 < this.f2185s; i2++) {
                this.f2186t[i2] = new C0359d(i2);
            }
            m2548y();
        }
    }

    /* renamed from: j */
    void m2691j(int i) {
        this.f2190x = i / this.f2185s;
        this.f2178J = View.MeasureSpec.makeMeasureSpec(i, this.f2188v.mo2856d());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: u */
    public boolean mo2190u() {
        return this.f2174F != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: x */
    public Parcelable mo2191x() {
        int m2722b;
        int mo2860f;
        int[] iArr;
        if (this.f2177I != null) {
            return new SavedState(this.f2177I);
        }
        SavedState savedState = new SavedState();
        savedState.f2206i = this.f2192z;
        savedState.f2207j = this.f2175G;
        savedState.f2208k = this.f2176H;
        LazySpanLookup lazySpanLookup = this.f2173E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f2193a) == null) {
            savedState.f2203f = 0;
        } else {
            savedState.f2204g = iArr;
            savedState.f2203f = iArr.length;
            savedState.f2205h = lazySpanLookup.f2194b;
        }
        if (m2514e() > 0) {
            savedState.f2199b = this.f2175G ? m2678I() : m2677H();
            savedState.f2200c = m2676G();
            int i = this.f2185s;
            savedState.f2201d = i;
            savedState.f2202e = new int[i];
            for (int i2 = 0; i2 < this.f2185s; i2++) {
                if (this.f2175G) {
                    m2722b = this.f2186t[i2].m2715a(Integer.MIN_VALUE);
                    if (m2722b != Integer.MIN_VALUE) {
                        mo2860f = this.f2187u.mo2852b();
                        m2722b -= mo2860f;
                        savedState.f2202e[i2] = m2722b;
                    } else {
                        savedState.f2202e[i2] = m2722b;
                    }
                } else {
                    m2722b = this.f2186t[i2].m2722b(Integer.MIN_VALUE);
                    if (m2722b != Integer.MIN_VALUE) {
                        mo2860f = this.f2187u.mo2860f();
                        m2722b -= mo2860f;
                        savedState.f2202e[i2] = m2722b;
                    } else {
                        savedState.f2202e[i2] = m2722b;
                    }
                }
            }
        } else {
            savedState.f2199b = -1;
            savedState.f2200c = -1;
            savedState.f2201d = 0;
        }
        return savedState;
    }
}
