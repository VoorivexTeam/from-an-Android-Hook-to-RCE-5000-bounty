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
import defpackage.i50;
import ir.tapsell.sdk.utils.l;

/* loaded from: classes.dex */
class h extends Dialog {
    private final String b;
    private final String c;
    private final String d;
    private final Typeface e;
    private final Integer f;
    private final Integer g;
    private final Integer h;
    private final Integer i;
    private final Integer j;
    private final Integer k;
    private final DialogInterface.OnClickListener l;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.l.onClick(h.this, -1);
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.l.onClick(h.this, -2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Context context, String str, Integer num, String str2, Integer num2, Integer num3, String str3, Integer num4, Integer num5, DialogInterface.OnClickListener onClickListener, Typeface typeface, Integer num6) {
        super(context);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = typeface;
        this.f = num6;
        this.g = num;
        this.l = onClickListener;
        this.j = num3;
        this.k = num5;
        this.h = num2;
        this.i = num4;
    }

    private Button a(Resources resources, Integer num, Integer num2) {
        Button button = new Button(getContext());
        button.setPadding((int) l.a(resources, 4.0f), 0, (int) l.a(resources, 4.0f), 0);
        button.setGravity(17);
        button.setMinWidth((int) l.a(resources, 64.0f));
        button.setMinHeight((int) l.a(resources, 32.0f));
        button.setMaxLines(2);
        button.setTextSize(0, l.a(resources, 14.0f));
        button.setTextColor(num2 != null ? num2.intValue() : -1);
        if (num != null) {
            TypedValue typedValue = new TypedValue();
            try {
                resources.getValue(num.intValue(), typedValue, true);
                if (typedValue.type < 28 || typedValue.type > 31) {
                    button.setBackgroundResource(num.intValue());
                    i50.a("Unsupported positive button background res type: " + typedValue.type + ", name:" + resources.getResourceTypeName(num.intValue()));
                } else {
                    button.setBackgroundColor(typedValue.data);
                }
            } catch (Throwable unused) {
            }
        } else {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((int) l.a(resources, 4.0f));
            gradientDrawable.setColor(-12303292);
            if (Build.VERSION.SDK_INT >= 16) {
                button.setBackground(gradientDrawable);
            } else {
                button.setBackgroundDrawable(gradientDrawable);
            }
        }
        return button;
    }

    private LinearLayout.LayoutParams a() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 0.5f;
        layoutParams.width = 0;
        return layoutParams;
    }

    private LinearLayout.LayoutParams a(int i) {
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
        layoutParams.setMargins((int) l.a(resources, 16.0f), (int) l.a(resources, 16.0f), (int) l.a(resources, 16.0f), (int) l.a(resources, 16.0f));
        layoutParams.gravity = 17;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setForegroundGravity(17);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding((int) l.a(resources, 4.0f), (int) l.a(resources, 8.0f), (int) l.a(resources, 4.0f), (int) l.a(resources, 8.0f));
        linearLayout.setOrientation(1);
        Integer num = this.f;
        if (num != null) {
            linearLayout.setBackgroundResource(num.intValue());
        } else {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((int) l.a(resources, 4.0f));
            gradientDrawable.setColor(-7829368);
            if (Build.VERSION.SDK_INT >= 16) {
                linearLayout.setBackground(gradientDrawable);
            } else {
                linearLayout.setBackgroundDrawable(gradientDrawable);
            }
        }
        linearLayout.setGravity(17);
        TextView textView = new TextView(getContext());
        textView.setTextSize(0, l.a(resources, 16.0f));
        String str = this.b;
        if (str == null) {
            str = "در صورتی که ویدئو را تا انتها مشاهده نکنید جایزه درون برنامه به شما داده نمی شود.";
        }
        textView.setText(str);
        textView.setPadding((int) l.a(resources, 4.0f), (int) l.a(resources, 8.0f), (int) l.a(resources, 4.0f), (int) l.a(resources, 8.0f));
        Integer num2 = this.g;
        if (num2 != null) {
            textView.setTextColor(num2.intValue());
        } else {
            textView.setTextColor(-1);
        }
        textView.setTypeface(this.e);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding((int) l.a(resources, 8.0f), 0, (int) l.a(resources, 8.0f), 0);
        linearLayout2.setMeasureWithLargestChildEnabled(true);
        Button a2 = a(resources, this.j, this.h);
        CharSequence charSequence = this.c;
        if (charSequence == null) {
            charSequence = "ادامه تماشای ویدئو";
        }
        a2.setText(charSequence);
        a2.setTypeface(this.e);
        Button a3 = a(resources, this.k, this.i);
        CharSequence charSequence2 = this.d;
        if (charSequence2 == null) {
            charSequence2 = "خروج";
        }
        a3.setText(charSequence2);
        a3.setTypeface(this.e);
        linearLayout2.addView(a3, a(5));
        linearLayout2.addView(new FrameLayout(getContext()), a());
        linearLayout2.addView(a2, a(3));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        frameLayout.addView(linearLayout, layoutParams2);
        a2.setOnClickListener(new a());
        a3.setOnClickListener(new b());
        setContentView(frameLayout);
    }
}
