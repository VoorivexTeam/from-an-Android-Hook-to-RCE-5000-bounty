package ir.tapsell.sdk;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ir.tapsell.sdk.utils.C2770l;
import p000.i50;

/* renamed from: ir.tapsell.sdk.h */
/* loaded from: classes.dex */
class DialogC2689h extends Dialog {

    /* renamed from: b */
    private final String f11045b;

    /* renamed from: c */
    private final String f11046c;

    /* renamed from: d */
    private final String f11047d;

    /* renamed from: e */
    private final Typeface f11048e;

    /* renamed from: f */
    private final Integer f11049f;

    /* renamed from: g */
    private final Integer f11050g;

    /* renamed from: h */
    private final Integer f11051h;

    /* renamed from: i */
    private final Integer f11052i;

    /* renamed from: j */
    private final Integer f11053j;

    /* renamed from: k */
    private final Integer f11054k;

    /* renamed from: l */
    private final DialogInterface.OnClickListener f11055l;

    /* renamed from: ir.tapsell.sdk.h$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC2689h.this.f11055l.onClick(DialogC2689h.this, -1);
        }
    }

    /* renamed from: ir.tapsell.sdk.h$b */
    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC2689h.this.f11055l.onClick(DialogC2689h.this, -2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogC2689h(Context context, String str, Integer num, String str2, Integer num2, Integer num3, String str3, Integer num4, Integer num5, DialogInterface.OnClickListener onClickListener, Typeface typeface, Integer num6) {
        super(context);
        this.f11045b = str;
        this.f11046c = str2;
        this.f11047d = str3;
        this.f11048e = typeface;
        this.f11049f = num6;
        this.f11050g = num;
        this.f11055l = onClickListener;
        this.f11053j = num3;
        this.f11054k = num5;
        this.f11051h = num2;
        this.f11052i = num4;
    }

    /* renamed from: a */
    private Button m12935a(Resources resources, Integer num, Integer num2) {
        Button button = new Button(getContext());
        button.setPadding((int) C2770l.m13173a(resources, 4.0f), 0, (int) C2770l.m13173a(resources, 4.0f), 0);
        button.setGravity(17);
        button.setMinWidth((int) C2770l.m13173a(resources, 64.0f));
        button.setMinHeight((int) C2770l.m13173a(resources, 32.0f));
        button.setMaxLines(2);
        button.setTextSize(0, C2770l.m13173a(resources, 14.0f));
        button.setTextColor(num2 != null ? num2.intValue() : -1);
        if (num != null) {
            TypedValue typedValue = new TypedValue();
            try {
                resources.getValue(num.intValue(), typedValue, true);
                if (typedValue.type < 28 || typedValue.type > 31) {
                    button.setBackgroundResource(num.intValue());
                    i50.m12368a("Unsupported positive button background res type: " + typedValue.type + ", name:" + resources.getResourceTypeName(num.intValue()));
                } else {
                    button.setBackgroundColor(typedValue.data);
                }
            } catch (Throwable unused) {
            }
        } else {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((int) C2770l.m13173a(resources, 4.0f));
            gradientDrawable.setColor(-12303292);
            if (Build.VERSION.SDK_INT >= 16) {
                button.setBackground(gradientDrawable);
            } else {
                button.setBackgroundDrawable(gradientDrawable);
            }
        }
        return button;
    }

    /* renamed from: a */
    private LinearLayout.LayoutParams m12936a() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 0.5f;
        layoutParams.width = 0;
        return layoutParams;
    }

    /* renamed from: a */
    private LinearLayout.LayoutParams m12937a(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        layoutParams.width = 0;
        layoutParams.gravity = i;
        return layoutParams;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (getWindow() != null) {
            getWindow().addFlags(2);
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.5f;
        getWindow().setAttributes(attributes);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        Resources resources = getContext().getResources();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins((int) C2770l.m13173a(resources, 16.0f), (int) C2770l.m13173a(resources, 16.0f), (int) C2770l.m13173a(resources, 16.0f), (int) C2770l.m13173a(resources, 16.0f));
        layoutParams.gravity = 17;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setForegroundGravity(17);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding((int) C2770l.m13173a(resources, 4.0f), (int) C2770l.m13173a(resources, 8.0f), (int) C2770l.m13173a(resources, 4.0f), (int) C2770l.m13173a(resources, 8.0f));
        linearLayout.setOrientation(1);
        Integer num = this.f11049f;
        if (num != null) {
            linearLayout.setBackgroundResource(num.intValue());
        } else {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((int) C2770l.m13173a(resources, 4.0f));
            gradientDrawable.setColor(-7829368);
            if (Build.VERSION.SDK_INT >= 16) {
                linearLayout.setBackground(gradientDrawable);
            } else {
                linearLayout.setBackgroundDrawable(gradientDrawable);
            }
        }
        linearLayout.setGravity(17);
        TextView textView = new TextView(getContext());
        textView.setTextSize(0, C2770l.m13173a(resources, 16.0f));
        String str = this.f11045b;
        if (str == null) {
            str = "در صورتی که ویدئو را تا انتها مشاهده نکنید جایزه درون برنامه به شما داده نمی شود.";
        }
        textView.setText(str);
        textView.setPadding((int) C2770l.m13173a(resources, 4.0f), (int) C2770l.m13173a(resources, 8.0f), (int) C2770l.m13173a(resources, 4.0f), (int) C2770l.m13173a(resources, 8.0f));
        Integer num2 = this.f11050g;
        if (num2 != null) {
            textView.setTextColor(num2.intValue());
        } else {
            textView.setTextColor(-1);
        }
        textView.setTypeface(this.f11048e);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding((int) C2770l.m13173a(resources, 8.0f), 0, (int) C2770l.m13173a(resources, 8.0f), 0);
        linearLayout2.setMeasureWithLargestChildEnabled(true);
        Button m12935a = m12935a(resources, this.f11053j, this.f11051h);
        CharSequence charSequence = this.f11046c;
        if (charSequence == null) {
            charSequence = "ادامه تماشای ویدئو";
        }
        m12935a.setText(charSequence);
        m12935a.setTypeface(this.f11048e);
        Button m12935a2 = m12935a(resources, this.f11054k, this.f11052i);
        CharSequence charSequence2 = this.f11047d;
        if (charSequence2 == null) {
            charSequence2 = "خروج";
        }
        m12935a2.setText(charSequence2);
        m12935a2.setTypeface(this.f11048e);
        linearLayout2.addView(m12935a2, m12937a(5));
        linearLayout2.addView(new FrameLayout(getContext()), m12936a());
        linearLayout2.addView(m12935a, m12937a(3));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        frameLayout.addView(linearLayout, layoutParams2);
        m12935a.setOnClickListener(new a());
        m12935a2.setOnClickListener(new b());
        setContentView(frameLayout);
    }
}
