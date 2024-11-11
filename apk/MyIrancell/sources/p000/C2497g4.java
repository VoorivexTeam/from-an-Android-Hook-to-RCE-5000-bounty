package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0239a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: g4 */
/* loaded from: classes.dex */
public class C2497g4 extends AbstractC2884l4 implements InterfaceC2458f4 {

    /* renamed from: c */
    private b f10201c;

    /* renamed from: d */
    private Context f10202d;

    /* renamed from: e */
    private ArgbEvaluator f10203e;

    /* renamed from: f */
    final Drawable.Callback f10204f;

    /* renamed from: g4$a */
    /* loaded from: classes.dex */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C2497g4.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C2497g4.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C2497g4.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g4$b */
    /* loaded from: classes.dex */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a */
        int f10206a;

        /* renamed from: b */
        C2921m4 f10207b;

        /* renamed from: c */
        AnimatorSet f10208c;

        /* renamed from: d */
        ArrayList<Animator> f10209d;

        /* renamed from: e */
        C0500c0<Animator, String> f10210e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f10206a = bVar.f10206a;
                C2921m4 c2921m4 = bVar.f10207b;
                if (c2921m4 != null) {
                    Drawable.ConstantState constantState = c2921m4.getConstantState();
                    this.f10207b = (C2921m4) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    C2921m4 c2921m42 = this.f10207b;
                    c2921m42.mutate();
                    C2921m4 c2921m43 = c2921m42;
                    this.f10207b = c2921m43;
                    c2921m43.setCallback(callback);
                    this.f10207b.setBounds(bVar.f10207b.getBounds());
                    this.f10207b.m14015a(false);
                }
                ArrayList<Animator> arrayList = bVar.f10209d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f10209d = new ArrayList<>(size);
                    this.f10210e = new C0500c0<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f10209d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f10210e.get(animator);
                        clone.setTarget(this.f10207b.m14014a(str));
                        this.f10209d.add(clone);
                        this.f10210e.put(clone, str);
                    }
                    m11885a();
                }
            }
        }

        /* renamed from: a */
        public void m11885a() {
            if (this.f10208c == null) {
                this.f10208c = new AnimatorSet();
            }
            this.f10208c.playTogether(this.f10209d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f10206a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: g4$c */
    /* loaded from: classes.dex */
    private static class c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f10211a;

        public c(Drawable.ConstantState constantState) {
            this.f10211a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f10211a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f10211a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C2497g4 c2497g4 = new C2497g4();
            Drawable newDrawable = this.f10211a.newDrawable();
            c2497g4.f11804b = newDrawable;
            newDrawable.setCallback(c2497g4.f10204f);
            return c2497g4;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C2497g4 c2497g4 = new C2497g4();
            Drawable newDrawable = this.f10211a.newDrawable(resources);
            c2497g4.f11804b = newDrawable;
            newDrawable.setCallback(c2497g4.f10204f);
            return c2497g4;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C2497g4 c2497g4 = new C2497g4();
            Drawable newDrawable = this.f10211a.newDrawable(resources, theme);
            c2497g4.f11804b = newDrawable;
            newDrawable.setCallback(c2497g4.f10204f);
            return c2497g4;
        }
    }

    C2497g4() {
        this(null, null, null);
    }

    private C2497g4(Context context) {
        this(context, null, null);
    }

    private C2497g4(Context context, b bVar, Resources resources) {
        this.f10203e = null;
        this.f10204f = new a();
        this.f10202d = context;
        if (bVar != null) {
            this.f10201c = bVar;
        } else {
            this.f10201c = new b(context, bVar, this.f10204f, resources);
        }
    }

    /* renamed from: a */
    public static C2497g4 m11882a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C2497g4 c2497g4 = new C2497g4(context);
        c2497g4.inflate(resources, xmlPullParser, attributeSet, theme);
        return c2497g4;
    }

    /* renamed from: a */
    private void m11883a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m11883a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f10203e == null) {
                    this.f10203e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f10203e);
            }
        }
    }

    /* renamed from: a */
    private void m11884a(String str, Animator animator) {
        animator.setTarget(this.f10201c.f10207b.m14014a(str));
        if (Build.VERSION.SDK_INT < 21) {
            m11883a(animator);
        }
        b bVar = this.f10201c;
        if (bVar.f10209d == null) {
            bVar.f10209d = new ArrayList<>();
            this.f10201c.f10210e = new C0500c0<>();
        }
        this.f10201c.f10209d.add(animator);
        this.f10201c.f10210e.put(animator, str);
    }

    @Override // p000.AbstractC2884l4, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            C0239a.m1481a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            return C0239a.m1485a(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f10201c.f10207b.draw(canvas);
        if (this.f10201c.f10208c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f11804b;
        return drawable != null ? C0239a.m1489c(drawable) : this.f10201c.f10207b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f11804b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f10201c.f10206a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f11804b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f11804b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f11804b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f10201c.f10207b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f11804b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f10201c.f10207b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f11804b;
        return drawable != null ? drawable.getOpacity() : this.f10201c.f10207b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            C0239a.m1482a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C3105q0.m14861a(resources, theme, attributeSet, C2416e4.f9916e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C2921m4 m14009a = C2921m4.m14009a(resources, resourceId, theme);
                        m14009a.m14015a(false);
                        m14009a.setCallback(this.f10204f);
                        C2921m4 c2921m4 = this.f10201c.f10207b;
                        if (c2921m4 != null) {
                            c2921m4.setCallback(null);
                        }
                        this.f10201c.f10207b = m14009a;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C2416e4.f9917f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f10202d;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m11884a(string, C2577i4.m12347a(context, resourceId2));
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f10201c.m11885a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f11804b;
        return drawable != null ? C0239a.m1492f(drawable) : this.f10201c.f10207b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f11804b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f10201c.f10208c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f11804b;
        return drawable != null ? drawable.isStateful() : this.f10201c.f10207b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f10201c.f10207b.setBounds(rect);
        }
    }

    @Override // p000.AbstractC2884l4, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f11804b;
        return drawable != null ? drawable.setLevel(i) : this.f10201c.f10207b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11804b;
        return drawable != null ? drawable.setState(iArr) : this.f10201c.f10207b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f10201c.f10207b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            C0239a.m1484a(drawable, z);
        } else {
            this.f10201c.f10207b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f10201c.f10207b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0240b
    public void setTint(int i) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            C0239a.m1488b(drawable, i);
        } else {
            this.f10201c.f10207b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0240b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            C0239a.m1480a(drawable, colorStateList);
        } else {
            this.f10201c.f10207b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0240b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            C0239a.m1483a(drawable, mode);
        } else {
            this.f10201c.f10207b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f10201c.f10207b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f10201c.f10208c.isStarted()) {
                return;
            }
            this.f10201c.f10208c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f10201c.f10208c.end();
        }
    }
}
