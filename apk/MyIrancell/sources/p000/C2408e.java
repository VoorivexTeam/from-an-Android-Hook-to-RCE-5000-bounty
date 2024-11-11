package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p000.C0499c;

/* renamed from: e */
/* loaded from: classes.dex */
class C2408e extends C0499c {

    /* renamed from: n */
    private a f9886n;

    /* renamed from: o */
    private boolean f9887o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e$a */
    /* loaded from: classes.dex */
    public static class a extends C0499c.c {

        /* renamed from: J */
        int[][] f9888J;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(a aVar, C2408e c2408e, Resources resources) {
            super(aVar, c2408e, resources);
            if (aVar != null) {
                this.f9888J = aVar.f9888J;
            } else {
                this.f9888J = new int[m3494c()];
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m11497a(int[] iArr) {
            int[][] iArr2 = this.f9888J;
            int m3496d = m3496d();
            for (int i = 0; i < m3496d; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m11498a(int[] iArr, Drawable drawable) {
            int m3483a = m3483a(drawable);
            this.f9888J[m3483a] = iArr;
            return m3483a;
        }

        @Override // p000.C0499c.c
        /* renamed from: a */
        public void mo3485a(int i, int i2) {
            super.mo3485a(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.f9888J, 0, iArr, 0, i);
            this.f9888J = iArr;
        }

        @Override // p000.C0499c.c
        /* renamed from: m */
        void mo3233m() {
            int[][] iArr = this.f9888J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f9888J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f9888J = iArr2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C2408e(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C2408e(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2408e(a aVar) {
        if (aVar != null) {
            mo3222a(aVar);
        }
    }

    C2408e(a aVar, Resources resources) {
        mo3222a(new a(aVar, this, resources));
        onStateChange(getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000.C0499c
    /* renamed from: a */
    public a mo3220a() {
        return new a(this.f9886n, this, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.C0499c
    /* renamed from: a */
    public void mo3222a(C0499c.c cVar) {
        super.mo3222a(cVar);
        if (cVar instanceof a) {
            this.f9886n = (a) cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] m11496a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // p000.C0499c, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p000.C0499c, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f9887o) {
            super.mutate();
            if (this == this) {
                this.f9886n.mo3233m();
                this.f9887o = true;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.C0499c, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m11497a = this.f9886n.m11497a(iArr);
        if (m11497a < 0) {
            m11497a = this.f9886n.m11497a(StateSet.WILD_CARD);
        }
        return m3477a(m11497a) || onStateChange;
    }
}
