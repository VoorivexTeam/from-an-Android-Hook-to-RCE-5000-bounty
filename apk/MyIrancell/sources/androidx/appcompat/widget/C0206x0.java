package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$style;

/* renamed from: androidx.appcompat.widget.x0 */
/* loaded from: classes.dex */
class C0206x0 {

    /* renamed from: a */
    private final Context f1298a;

    /* renamed from: b */
    private final View f1299b;

    /* renamed from: c */
    private final TextView f1300c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1301d = new WindowManager.LayoutParams();

    /* renamed from: e */
    private final Rect f1302e = new Rect();

    /* renamed from: f */
    private final int[] f1303f = new int[2];

    /* renamed from: g */
    private final int[] f1304g = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0206x0(Context context) {
        this.f1298a = context;
        View inflate = LayoutInflater.from(context).inflate(R$layout.abc_tooltip, (ViewGroup) null);
        this.f1299b = inflate;
        this.f1300c = (TextView) inflate.findViewById(R$id.message);
        this.f1301d.setTitle(C0206x0.class.getSimpleName());
        this.f1301d.packageName = this.f1298a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f1301d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R$style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private static View m1209a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    private void m1210a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1298a.getResources().getDimensionPixelOffset(R$dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1298a.getResources().getDimensionPixelOffset(R$dimen.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1298a.getResources().getDimensionPixelOffset(z ? R$dimen.tooltip_y_offset_touch : R$dimen.tooltip_y_offset_non_touch);
        View m1209a = m1209a(view);
        if (m1209a == null) {
            return;
        }
        m1209a.getWindowVisibleDisplayFrame(this.f1302e);
        Rect rect = this.f1302e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1298a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1302e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m1209a.getLocationOnScreen(this.f1304g);
        view.getLocationOnScreen(this.f1303f);
        int[] iArr = this.f1303f;
        int i4 = iArr[0];
        int[] iArr2 = this.f1304g;
        iArr[0] = i4 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (m1209a.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1299b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1299b.getMeasuredHeight();
        int[] iArr3 = this.f1303f;
        int i5 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i6 = iArr3[1] + height + dimensionPixelOffset3;
        if (!z ? measuredHeight + i6 <= this.f1302e.height() : i5 < 0) {
            layoutParams.y = i5;
        } else {
            layoutParams.y = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1211a() {
        if (m1213b()) {
            ((WindowManager) this.f1298a.getSystemService("window")).removeView(this.f1299b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1212a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m1213b()) {
            m1211a();
        }
        this.f1300c.setText(charSequence);
        m1210a(view, i, i2, z, this.f1301d);
        ((WindowManager) this.f1298a.getSystemService("window")).addView(this.f1299b, this.f1301d);
    }

    /* renamed from: b */
    boolean m1213b() {
        return this.f1299b.getParent() != null;
    }
}
