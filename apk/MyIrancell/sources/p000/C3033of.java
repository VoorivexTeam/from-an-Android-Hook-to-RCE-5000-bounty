package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.ComponentCallbacks2C0558c;
import com.bumptech.glide.load.InterfaceC0578l;
import java.nio.ByteBuffer;
import java.util.List;
import p000.C3208sf;
import p000.InterfaceC2458f4;

/* renamed from: of */
/* loaded from: classes.dex */
public class C3033of extends Drawable implements C3208sf.b, Animatable, InterfaceC2458f4 {

    /* renamed from: b */
    private final a f12462b;

    /* renamed from: c */
    private boolean f12463c;

    /* renamed from: d */
    private boolean f12464d;

    /* renamed from: e */
    private boolean f12465e;

    /* renamed from: f */
    private boolean f12466f;

    /* renamed from: g */
    private int f12467g;

    /* renamed from: h */
    private int f12468h;

    /* renamed from: i */
    private boolean f12469i;

    /* renamed from: j */
    private Paint f12470j;

    /* renamed from: k */
    private Rect f12471k;

    /* renamed from: l */
    private List<InterfaceC2458f4.a> f12472l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: of$a */
    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a */
        final C3208sf f12473a;

        a(C3208sf c3208sf) {
            this.f12473a = c3208sf;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C3033of(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public C3033of(Context context, InterfaceC0513ca interfaceC0513ca, InterfaceC0578l<Bitmap> interfaceC0578l, int i, int i2, Bitmap bitmap) {
        this(new a(new C3208sf(ComponentCallbacks2C0558c.m3866b(context), interfaceC0513ca, i, i2, interfaceC0578l, bitmap)));
    }

    C3033of(a aVar) {
        this.f12466f = true;
        this.f12468h = -1;
        C2816ji.m13459a(aVar);
        this.f12462b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    private Drawable.Callback m14500h() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: i */
    private Rect m14501i() {
        if (this.f12471k == null) {
            this.f12471k = new Rect();
        }
        return this.f12471k;
    }

    /* renamed from: j */
    private Paint m14502j() {
        if (this.f12470j == null) {
            this.f12470j = new Paint(2);
        }
        return this.f12470j;
    }

    /* renamed from: k */
    private void m14503k() {
        List<InterfaceC2458f4.a> list = this.f12472l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f12472l.get(i).m11687a(this);
            }
        }
    }

    /* renamed from: l */
    private void m14504l() {
        this.f12467g = 0;
    }

    /* renamed from: m */
    private void m14505m() {
        C2816ji.m13463a(!this.f12465e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f12462b.f12473a.m15424f() != 1) {
            if (this.f12463c) {
                return;
            }
            this.f12463c = true;
            this.f12462b.f12473a.m15418a(this);
        }
        invalidateSelf();
    }

    /* renamed from: n */
    private void m14506n() {
        this.f12463c = false;
        this.f12462b.f12473a.m15420b(this);
    }

    @Override // p000.C3208sf.b
    /* renamed from: a */
    public void mo14507a() {
        if (m14500h() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m14512e() == m14511d() - 1) {
            this.f12467g++;
        }
        int i = this.f12468h;
        if (i == -1 || this.f12467g < i) {
            return;
        }
        m14503k();
        stop();
    }

    /* renamed from: a */
    public void m14508a(InterfaceC0578l<Bitmap> interfaceC0578l, Bitmap bitmap) {
        this.f12462b.f12473a.m15416a(interfaceC0578l, bitmap);
    }

    /* renamed from: b */
    public ByteBuffer m14509b() {
        return this.f12462b.f12473a.m15419b();
    }

    /* renamed from: c */
    public Bitmap m14510c() {
        return this.f12462b.f12473a.m15423e();
    }

    /* renamed from: d */
    public int m14511d() {
        return this.f12462b.f12473a.m15424f();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f12465e) {
            return;
        }
        if (this.f12469i) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m14501i());
            this.f12469i = false;
        }
        canvas.drawBitmap(this.f12462b.f12473a.m15421c(), (Rect) null, m14501i(), m14502j());
    }

    /* renamed from: e */
    public int m14512e() {
        return this.f12462b.f12473a.m15422d();
    }

    /* renamed from: f */
    public int m14513f() {
        return this.f12462b.f12473a.m15426h();
    }

    /* renamed from: g */
    public void m14514g() {
        this.f12465e = true;
        this.f12462b.f12473a.m15415a();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f12462b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f12462b.f12473a.m15425g();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f12462b.f12473a.m15427i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f12463c;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f12469i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        m14502j().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m14502j().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        C2816ji.m13463a(!this.f12465e, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f12466f = z;
        if (!z) {
            m14506n();
        } else if (this.f12464d) {
            m14505m();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f12464d = true;
        m14504l();
        if (this.f12466f) {
            m14505m();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f12464d = false;
        m14506n();
    }
}
