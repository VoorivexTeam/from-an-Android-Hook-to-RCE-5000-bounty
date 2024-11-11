package ir.tapsell.sdk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import ir.tapsell.sdk.NoProguard;
import ir.tapsell.sdk.utils.C2770l;
import ir.tapsell.sdk.utils.FontManager;

/* loaded from: classes.dex */
public class DonutProgress extends View implements NoProguard {
    private static final String INSTANCE_BACKGROUND_COLOR = "inner_background_color";
    private static final String INSTANCE_CUSTOM_TYPEFACE = "custom-typeface";
    private static final String INSTANCE_FINISHED_STROKE_COLOR = "finished_stroke_color";
    private static final String INSTANCE_FINISHED_STROKE_WIDTH = "finished_stroke_width";
    private static final String INSTANCE_INNER_BOTTOM_TEXT = "inner_bottom_text";
    private static final String INSTANCE_INNER_BOTTOM_TEXT_COLOR = "inner_bottom_text_color";
    private static final String INSTANCE_INNER_BOTTOM_TEXT_SIZE = "inner_bottom_text_size";
    private static final String INSTANCE_MAX = "max";
    private static final String INSTANCE_PREFIX = "prefix";
    private static final String INSTANCE_PROGRESS = "progress";
    private static final String INSTANCE_STATE = "saved_instance";
    private static final String INSTANCE_SUFFIX = "suffix";
    private static final String INSTANCE_TEXT = "text";
    private static final String INSTANCE_TEXT_COLOR = "text_color";
    private static final String INSTANCE_TEXT_SIZE = "text_size";
    private static final String INSTANCE_UNFINISHED_STROKE_COLOR = "unfinished_stroke_color";
    private static final String INSTANCE_UNFINISHED_STROKE_WIDTH = "unfinished_stroke_width";
    private final int default_finished_color;
    private final int default_inner_background_color;
    private final int default_inner_bottom_text_color;
    private final float default_inner_bottom_text_size;
    private final int default_max;
    private final float default_stroke_width;
    private final int default_text_color;
    private final float default_text_size;
    private final int default_unfinished_color;
    private RectF finishedOuterRect;
    private Paint finishedPaint;
    private int finishedStrokeColor;
    private float finishedStrokeWidth;
    private int innerBackgroundColor;
    private String innerBottomText;
    private int innerBottomTextColor;
    private float innerBottomTextHeight;
    protected Paint innerBottomTextPaint;
    private float innerBottomTextSize;
    private Paint innerCirclePaint;
    private FontManager.FontName mFontName;
    private int max;
    private final int min_size;
    private String prefixText;
    private int progress;
    private String suffixText;
    private String text;
    private int textColor;
    protected Paint textPaint;
    private float textSize;
    private RectF unfinishedOuterRect;
    private Paint unfinishedPaint;
    private int unfinishedStrokeColor;
    private float unfinishedStrokeWidth;

    /* renamed from: ir.tapsell.sdk.views.DonutProgress$a */
    /* loaded from: classes.dex */
    public static class C2783a {

        /* renamed from: a */
        public Integer f11314a;

        /* renamed from: b */
        public Integer f11315b;

        /* renamed from: c */
        public Integer f11316c;

        /* renamed from: d */
        public Integer f11317d;

        /* renamed from: e */
        public Float f11318e;

        /* renamed from: f */
        public Float f11319f;

        /* renamed from: g */
        public Float f11320g;

        /* renamed from: h */
        public Integer f11321h;

        /* renamed from: i */
        public String f11322i;

        /* renamed from: j */
        public String f11323j;

        /* renamed from: k */
        public Integer f11324k;

        public C2783a() {
        }

        public C2783a(Integer num, Integer num2, Integer num3, Integer num4, Float f, Float f2, Float f3, Integer num5, String str, String str2, Integer num6) {
            this.f11314a = num;
            this.f11315b = num2;
            this.f11316c = num3;
            this.f11317d = num4;
            this.f11318e = f;
            this.f11319f = f2;
            this.f11320g = f3;
            this.f11321h = num5;
            this.f11322i = str;
            this.f11323j = str2;
            this.f11324k = num6;
        }
    }

    public DonutProgress(Context context) {
        this(context, null);
    }

    public DonutProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, new C2783a());
    }

    public DonutProgress(Context context, AttributeSet attributeSet, int i, C2783a c2783a) {
        super(context, attributeSet, i);
        this.default_finished_color = Color.rgb(66, 145, 241);
        this.default_unfinished_color = Color.rgb(204, 204, 204);
        this.default_text_color = Color.rgb(66, 145, 241);
        this.default_inner_bottom_text_color = Color.rgb(66, 145, 241);
        this.default_inner_background_color = 0;
        this.default_max = 100;
        this.finishedOuterRect = new RectF();
        this.unfinishedOuterRect = new RectF();
        this.progress = 0;
        this.prefixText = "";
        this.suffixText = "%";
        this.text = null;
        this.default_text_size = C2770l.m13174b(getResources(), 18.0f);
        this.min_size = (int) C2770l.m13173a(getResources(), 100.0f);
        this.default_stroke_width = C2770l.m13173a(getResources(), 10.0f);
        this.default_inner_bottom_text_size = C2770l.m13174b(getResources(), 18.0f);
        initByAttributes(c2783a);
        initPainters();
    }

    private float getProgressAngle() {
        return (getProgress() / this.max) * 360.0f;
    }

    private int measure(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int i2 = this.min_size;
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }

    public int getFinishedStrokeColor() {
        return this.finishedStrokeColor;
    }

    public float getFinishedStrokeWidth() {
        return this.finishedStrokeWidth;
    }

    public int getInnerBackgroundColor() {
        return this.innerBackgroundColor;
    }

    public String getInnerBottomText() {
        return this.innerBottomText;
    }

    public int getInnerBottomTextColor() {
        return this.innerBottomTextColor;
    }

    public float getInnerBottomTextSize() {
        return this.innerBottomTextSize;
    }

    public int getMax() {
        return this.max;
    }

    public String getPrefixText() {
        return this.prefixText;
    }

    public int getProgress() {
        return this.progress;
    }

    public String getSuffixText() {
        return this.suffixText;
    }

    public String getText() {
        return this.text;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public float getTextSize() {
        return this.textSize;
    }

    public int getUnfinishedStrokeColor() {
        return this.unfinishedStrokeColor;
    }

    public float getUnfinishedStrokeWidth() {
        return this.unfinishedStrokeWidth;
    }

    protected void initByAttributes(C2783a c2783a) {
        Integer num = c2783a.f11317d;
        this.finishedStrokeColor = num == null ? this.default_finished_color : num.intValue();
        Integer num2 = c2783a.f11316c;
        this.unfinishedStrokeColor = num2 == null ? this.default_unfinished_color : num2.intValue();
        Integer num3 = c2783a.f11321h;
        this.textColor = num3 == null ? this.default_text_color : num3.intValue();
        Float f = c2783a.f11320g;
        this.textSize = f == null ? this.default_text_size : f.floatValue();
        Integer num4 = c2783a.f11315b;
        setMax(num4 == null ? 100 : num4.intValue());
        Integer num5 = c2783a.f11314a;
        setProgress(num5 == null ? 0 : num5.intValue());
        Float f2 = c2783a.f11318e;
        this.finishedStrokeWidth = f2 == null ? this.default_stroke_width : f2.floatValue();
        Float f3 = c2783a.f11319f;
        this.unfinishedStrokeWidth = f3 == null ? this.default_stroke_width : f3.floatValue();
        String str = c2783a.f11322i;
        if (str != null) {
            this.prefixText = str;
        }
        String str2 = c2783a.f11323j;
        if (str2 != null) {
            this.suffixText = str2;
        }
        Integer num6 = c2783a.f11324k;
        this.innerBackgroundColor = num6 != null ? num6.intValue() : 0;
    }

    protected void initPainters() {
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        textPaint.setColor(this.textColor);
        this.textPaint.setTextSize(this.textSize);
        if (this.mFontName != null) {
            this.textPaint.setTypeface(FontManager.getFont(getContext(), this.mFontName));
        }
        this.textPaint.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.innerBottomTextPaint = textPaint2;
        textPaint2.setColor(this.innerBottomTextColor);
        this.innerBottomTextPaint.setTextSize(this.innerBottomTextSize);
        this.innerBottomTextPaint.setAntiAlias(true);
        Paint paint = new Paint();
        this.finishedPaint = paint;
        paint.setColor(this.finishedStrokeColor);
        this.finishedPaint.setStyle(Paint.Style.STROKE);
        this.finishedPaint.setAntiAlias(true);
        this.finishedPaint.setStrokeWidth(this.finishedStrokeWidth);
        this.finishedPaint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.unfinishedPaint = paint2;
        paint2.setColor(this.unfinishedStrokeColor);
        this.unfinishedPaint.setStyle(Paint.Style.STROKE);
        this.unfinishedPaint.setAntiAlias(true);
        this.unfinishedPaint.setStrokeWidth(this.unfinishedStrokeWidth);
        this.unfinishedPaint.setStrokeCap(Paint.Cap.BUTT);
        Paint paint3 = new Paint();
        this.innerCirclePaint = paint3;
        paint3.setColor(this.innerBackgroundColor);
        this.innerCirclePaint.setAntiAlias(true);
    }

    @Override // android.view.View
    public void invalidate() {
        initPainters();
        super.invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float max = Math.max(this.finishedStrokeWidth, this.unfinishedStrokeWidth) + 2.0f;
        this.finishedOuterRect.set(max, max, getWidth() - max, getHeight() - max);
        this.unfinishedOuterRect.set(max, max, getWidth() - max, getHeight() - max);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((getWidth() - Math.min(this.finishedStrokeWidth, this.unfinishedStrokeWidth)) + Math.abs(this.finishedStrokeWidth - this.unfinishedStrokeWidth)) / 2.0f, this.innerCirclePaint);
        canvas.drawArc(this.unfinishedOuterRect, getProgressAngle(), 360.0f - getProgressAngle(), false, this.unfinishedPaint);
        if (getProgressAngle() > 0.0f) {
            canvas.drawArc(this.finishedOuterRect, 0.0f, getProgressAngle(), false, this.finishedPaint);
        }
        String str = this.text;
        if (str == null) {
            str = this.prefixText + this.progress + this.suffixText;
        }
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.textPaint.measureText(str)) / 2.0f, (getWidth() - (this.textPaint.descent() + this.textPaint.ascent())) / 2.0f, this.textPaint);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.innerBottomTextPaint.setTextSize(this.innerBottomTextSize);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.innerBottomTextPaint.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.innerBottomTextHeight) - ((this.textPaint.descent() + this.textPaint.ascent()) / 2.0f), this.innerBottomTextPaint);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(measure(i), measure(i2));
        this.innerBottomTextHeight = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.textColor = bundle.getInt(INSTANCE_TEXT_COLOR);
        this.textSize = bundle.getFloat(INSTANCE_TEXT_SIZE);
        this.innerBottomTextSize = bundle.getFloat(INSTANCE_INNER_BOTTOM_TEXT_SIZE);
        this.innerBottomText = bundle.getString(INSTANCE_INNER_BOTTOM_TEXT);
        this.innerBottomTextColor = bundle.getInt(INSTANCE_INNER_BOTTOM_TEXT_COLOR);
        this.finishedStrokeColor = bundle.getInt(INSTANCE_FINISHED_STROKE_COLOR);
        this.unfinishedStrokeColor = bundle.getInt(INSTANCE_UNFINISHED_STROKE_COLOR);
        this.finishedStrokeWidth = bundle.getFloat(INSTANCE_FINISHED_STROKE_WIDTH);
        this.unfinishedStrokeWidth = bundle.getFloat(INSTANCE_UNFINISHED_STROKE_WIDTH);
        this.innerBackgroundColor = bundle.getInt(INSTANCE_BACKGROUND_COLOR);
        initPainters();
        setMax(bundle.getInt(INSTANCE_MAX));
        setProgress(bundle.getInt(INSTANCE_PROGRESS));
        this.prefixText = bundle.getString(INSTANCE_PREFIX);
        this.suffixText = bundle.getString(INSTANCE_SUFFIX);
        this.text = bundle.getString(INSTANCE_TEXT);
        if (bundle.containsKey(INSTANCE_CUSTOM_TYPEFACE)) {
            setTypeface(FontManager.FontName.from(bundle.getString(INSTANCE_CUSTOM_TYPEFACE)));
        }
        super.onRestoreInstanceState(bundle.getParcelable(INSTANCE_STATE));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(INSTANCE_STATE, super.onSaveInstanceState());
        bundle.putInt(INSTANCE_TEXT_COLOR, getTextColor());
        bundle.putFloat(INSTANCE_TEXT_SIZE, getTextSize());
        bundle.putFloat(INSTANCE_INNER_BOTTOM_TEXT_SIZE, getInnerBottomTextSize());
        bundle.putFloat(INSTANCE_INNER_BOTTOM_TEXT_COLOR, getInnerBottomTextColor());
        bundle.putString(INSTANCE_INNER_BOTTOM_TEXT, getInnerBottomText());
        bundle.putInt(INSTANCE_INNER_BOTTOM_TEXT_COLOR, getInnerBottomTextColor());
        bundle.putInt(INSTANCE_FINISHED_STROKE_COLOR, getFinishedStrokeColor());
        bundle.putInt(INSTANCE_UNFINISHED_STROKE_COLOR, getUnfinishedStrokeColor());
        bundle.putInt(INSTANCE_MAX, getMax());
        bundle.putInt(INSTANCE_PROGRESS, getProgress());
        bundle.putString(INSTANCE_SUFFIX, getSuffixText());
        bundle.putString(INSTANCE_PREFIX, getPrefixText());
        bundle.putString(INSTANCE_TEXT, getText());
        bundle.putFloat(INSTANCE_FINISHED_STROKE_WIDTH, getFinishedStrokeWidth());
        bundle.putFloat(INSTANCE_UNFINISHED_STROKE_WIDTH, getUnfinishedStrokeWidth());
        bundle.putInt(INSTANCE_BACKGROUND_COLOR, getInnerBackgroundColor());
        FontManager.FontName fontName = this.mFontName;
        if (fontName != null) {
            bundle.putString(INSTANCE_CUSTOM_TYPEFACE, fontName.getValue());
        }
        return bundle;
    }

    public void setFinishedStrokeColor(int i) {
        this.finishedStrokeColor = i;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f) {
        this.finishedStrokeWidth = f;
        invalidate();
    }

    public void setInnerBackgroundColor(int i) {
        this.innerBackgroundColor = i;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.innerBottomText = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i) {
        this.innerBottomTextColor = i;
        invalidate();
    }

    public void setInnerBottomTextSize(float f) {
        this.innerBottomTextSize = f;
        invalidate();
    }

    public void setMax(int i) {
        if (i > 0) {
            this.max = i;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.prefixText = str;
        invalidate();
    }

    public void setProgress(int i) {
        this.progress = i;
        if (i > getMax()) {
            this.progress %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.suffixText = str;
        invalidate();
    }

    public void setText(String str) {
        this.text = str;
        invalidate();
    }

    public void setTextColor(int i) {
        this.textColor = i;
        invalidate();
    }

    public void setTextSize(float f) {
        this.textSize = f;
        invalidate();
    }

    public void setTypeface(FontManager.FontName fontName) {
        this.mFontName = fontName;
        Paint paint = this.textPaint;
        if (paint != null) {
            paint.setTypeface(FontManager.getFont(getContext(), this.mFontName));
        }
        invalidate();
    }

    public void setUnfinishedStrokeColor(int i) {
        this.unfinishedStrokeColor = i;
        invalidate();
    }

    public void setUnfinishedStrokeWidth(float f) {
        this.unfinishedStrokeWidth = f;
        invalidate();
    }
}
