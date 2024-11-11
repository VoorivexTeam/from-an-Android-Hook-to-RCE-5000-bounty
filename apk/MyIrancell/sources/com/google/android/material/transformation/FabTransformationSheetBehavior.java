package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$animator;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p000.C3058ot;
import p000.C3107q2;
import p000.C3139qt;

/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: g */
    private Map<View, Integer> f8776g;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m10480a(View view, boolean z) {
        int intValue;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f8776g = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0217f) && (((CoordinatorLayout.C0217f) childAt.getLayoutParams()).m1336d() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f8776g;
                        intValue = (map != null && map.containsKey(childAt)) ? this.f8776g.get(childAt).intValue() : 4;
                    } else if (Build.VERSION.SDK_INT >= 16) {
                        this.f8776g.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                    C3107q2.m14912f(childAt, intValue);
                }
            }
            if (z) {
                return;
            }
            this.f8776g = null;
        }
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: a */
    protected FabTransformationBehavior.C2043e mo10478a(Context context, boolean z) {
        int i = z ? R$animator.mtrl_fab_transformation_sheet_expand_spec : R$animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C2043e c2043e = new FabTransformationBehavior.C2043e();
        c2043e.f8770a = C3058ot.m14651a(context, i);
        c2043e.f8771b = new C3139qt(17, 0.0f, 0.0f);
        return c2043e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: a */
    public boolean mo10456a(View view, View view2, boolean z, boolean z2) {
        m10480a(view2, z);
        return super.mo10456a(view, view2, z, z2);
    }
}
