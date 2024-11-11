package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$color;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$style;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.C0097f;
import androidx.appcompat.view.menu.C0099h;
import androidx.appcompat.view.menu.InterfaceC0106o;
import androidx.appcompat.view.menu.InterfaceC0107p;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0175i;
import androidx.appcompat.widget.C0198t0;
import androidx.appcompat.widget.C0208y0;
import androidx.appcompat.widget.C0210z0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0166d0;
import androidx.appcompat.widget.InterfaceC0209z;
import androidx.core.app.C0226d;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p000.AbstractC2532h;
import p000.C0000a;
import p000.C0502c2;
import p000.C2371d2;
import p000.C2794j;
import p000.C2879l;
import p000.C2916m;
import p000.C3107q2;
import p000.C3284u2;
import p000.C3382w2;
import p000.C3460y2;
import p000.InterfaceC2965n2;
import p000.InterfaceC3328v2;
import p000.WindowCallbackC3008o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AppCompatDelegateImpl extends AbstractC0084d implements C0099h.a, LayoutInflater.Factory2 {

    /* renamed from: T */
    private static final boolean f319T;

    /* renamed from: U */
    private static final int[] f320U;

    /* renamed from: V */
    private static boolean f321V;

    /* renamed from: A */
    boolean f322A;

    /* renamed from: B */
    boolean f323B;

    /* renamed from: C */
    boolean f324C;

    /* renamed from: D */
    boolean f325D;

    /* renamed from: E */
    private boolean f326E;

    /* renamed from: F */
    private PanelFeatureState[] f327F;

    /* renamed from: G */
    private PanelFeatureState f328G;

    /* renamed from: H */
    private boolean f329H;

    /* renamed from: I */
    boolean f330I;

    /* renamed from: K */
    private boolean f332K;

    /* renamed from: L */
    private C0077k f333L;

    /* renamed from: M */
    boolean f334M;

    /* renamed from: N */
    int f335N;

    /* renamed from: P */
    private boolean f337P;

    /* renamed from: Q */
    private Rect f338Q;

    /* renamed from: R */
    private Rect f339R;

    /* renamed from: S */
    private AppCompatViewInflater f340S;

    /* renamed from: c */
    final Context f341c;

    /* renamed from: d */
    final Window f342d;

    /* renamed from: e */
    final Window.Callback f343e;

    /* renamed from: f */
    final Window.Callback f344f;

    /* renamed from: g */
    final InterfaceC0083c f345g;

    /* renamed from: h */
    AbstractC0081a f346h;

    /* renamed from: i */
    MenuInflater f347i;

    /* renamed from: j */
    private CharSequence f348j;

    /* renamed from: k */
    private InterfaceC0209z f349k;

    /* renamed from: l */
    private C0074h f350l;

    /* renamed from: m */
    private C0079m f351m;

    /* renamed from: n */
    AbstractC2532h f352n;

    /* renamed from: o */
    ActionBarContextView f353o;

    /* renamed from: p */
    PopupWindow f354p;

    /* renamed from: q */
    Runnable f355q;

    /* renamed from: t */
    private boolean f358t;

    /* renamed from: u */
    private ViewGroup f359u;

    /* renamed from: v */
    private TextView f360v;

    /* renamed from: w */
    private View f361w;

    /* renamed from: x */
    private boolean f362x;

    /* renamed from: y */
    private boolean f363y;

    /* renamed from: z */
    boolean f364z;

    /* renamed from: r */
    C3284u2 f356r = null;

    /* renamed from: s */
    private boolean f357s = true;

    /* renamed from: J */
    private int f331J = -100;

    /* renamed from: O */
    private final Runnable f336O = new RunnableC0068b();

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class PanelFeatureState {

        /* renamed from: a */
        int f365a;

        /* renamed from: b */
        int f366b;

        /* renamed from: c */
        int f367c;

        /* renamed from: d */
        int f368d;

        /* renamed from: e */
        int f369e;

        /* renamed from: f */
        int f370f;

        /* renamed from: g */
        ViewGroup f371g;

        /* renamed from: h */
        View f372h;

        /* renamed from: i */
        View f373i;

        /* renamed from: j */
        C0099h f374j;

        /* renamed from: k */
        C0097f f375k;

        /* renamed from: l */
        Context f376l;

        /* renamed from: m */
        boolean f377m;

        /* renamed from: n */
        boolean f378n;

        /* renamed from: o */
        boolean f379o;

        /* renamed from: p */
        public boolean f380p;

        /* renamed from: q */
        boolean f381q = false;

        /* renamed from: r */
        boolean f382r;

        /* renamed from: s */
        Bundle f383s;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new C0066a();

            /* renamed from: b */
            int f384b;

            /* renamed from: c */
            boolean f385c;

            /* renamed from: d */
            Bundle f386d;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a */
            /* loaded from: classes.dex */
            static class C0066a implements Parcelable.ClassLoaderCreator<SavedState> {
                C0066a() {
                }

                @Override // android.os.Parcelable.Creator
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.m443a(parcel, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m443a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            SavedState() {
            }

            /* renamed from: a */
            static SavedState m443a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f384b = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                savedState.f385c = z;
                if (z) {
                    savedState.f386d = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f384b);
                parcel.writeInt(this.f385c ? 1 : 0);
                if (this.f385c) {
                    parcel.writeBundle(this.f386d);
                }
            }
        }

        PanelFeatureState(int i) {
            this.f365a = i;
        }

        /* renamed from: a */
        InterfaceC0107p m439a(InterfaceC0106o.a aVar) {
            if (this.f374j == null) {
                return null;
            }
            if (this.f375k == null) {
                C0097f c0097f = new C0097f(this.f376l, R$layout.abc_list_menu_item_layout);
                this.f375k = c0097f;
                c0097f.mo584a(aVar);
                this.f374j.m645a(this.f375k);
            }
            return this.f375k.m621a(this.f371g);
        }

        /* renamed from: a */
        void m440a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R$attr.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(R$attr.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = R$style.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            C2794j c2794j = new C2794j(context, 0);
            c2794j.getTheme().setTo(newTheme);
            this.f376l = c2794j;
            TypedArray obtainStyledAttributes = c2794j.obtainStyledAttributes(R$styleable.AppCompatTheme);
            this.f366b = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTheme_panelBackground, 0);
            this.f370f = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m441a(C0099h c0099h) {
            C0097f c0097f;
            C0099h c0099h2 = this.f374j;
            if (c0099h == c0099h2) {
                return;
            }
            if (c0099h2 != null) {
                c0099h2.m656b(this.f375k);
            }
            this.f374j = c0099h;
            if (c0099h == null || (c0097f = this.f375k) == null) {
                return;
            }
            c0099h.m645a(c0097f);
        }

        /* renamed from: a */
        public boolean m442a() {
            if (this.f372h == null) {
                return false;
            }
            return this.f373i != null || this.f375k.m620a().getCount() > 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    /* loaded from: classes.dex */
    static class C0067a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f387a;

        C0067a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f387a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m444a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!m444a(th)) {
                this.f387a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f387a.uncaughtException(thread, notFoundException);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    /* loaded from: classes.dex */
    class RunnableC0068b implements Runnable {
        RunnableC0068b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f335N & 1) != 0) {
                appCompatDelegateImpl.m421e(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f335N & 4096) != 0) {
                appCompatDelegateImpl2.m421e(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f334M = false;
            appCompatDelegateImpl3.f335N = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    /* loaded from: classes.dex */
    public class C0069c implements InterfaceC2965n2 {
        C0069c() {
        }

        @Override // p000.InterfaceC2965n2
        /* renamed from: a */
        public C3460y2 mo445a(View view, C3460y2 c3460y2) {
            int m16558d = c3460y2.m16558d();
            int m428i = AppCompatDelegateImpl.this.m428i(m16558d);
            if (m16558d != m428i) {
                c3460y2 = c3460y2.m16555a(c3460y2.m16556b(), m428i, c3460y2.m16557c(), c3460y2.m16554a());
            }
            return C3107q2.m14901b(view, c3460y2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    /* loaded from: classes.dex */
    public class C0070d implements InterfaceC0166d0.a {
        C0070d() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0166d0.a
        /* renamed from: a */
        public void mo446a(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.m428i(rect.top);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    /* loaded from: classes.dex */
    public class C0071e implements ContentFrameLayout.InterfaceC0132a {
        C0071e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0132a
        /* renamed from: a */
        public void mo447a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0132a
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.m430k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    /* loaded from: classes.dex */
    public class RunnableC0072f implements Runnable {

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f$a */
        /* loaded from: classes.dex */
        class a extends C3382w2 {
            a() {
            }

            @Override // p000.InterfaceC3328v2
            /* renamed from: b */
            public void mo448b(View view) {
                AppCompatDelegateImpl.this.f353o.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f356r.m15707a((InterfaceC3328v2) null);
                AppCompatDelegateImpl.this.f356r = null;
            }

            @Override // p000.C3382w2, p000.InterfaceC3328v2
            /* renamed from: c */
            public void mo449c(View view) {
                AppCompatDelegateImpl.this.f353o.setVisibility(0);
            }
        }

        RunnableC0072f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f354p.showAtLocation(appCompatDelegateImpl.f353o, 55, 0, 0);
            AppCompatDelegateImpl.this.m431l();
            if (!AppCompatDelegateImpl.this.m438s()) {
                AppCompatDelegateImpl.this.f353o.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f353o.setVisibility(0);
                return;
            }
            AppCompatDelegateImpl.this.f353o.setAlpha(0.0f);
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            C3284u2 m14882a = C3107q2.m14882a(appCompatDelegateImpl2.f353o);
            m14882a.m15704a(1.0f);
            appCompatDelegateImpl2.f356r = m14882a;
            AppCompatDelegateImpl.this.f356r.m15707a(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    /* loaded from: classes.dex */
    public class C0073g extends C3382w2 {
        C0073g() {
        }

        @Override // p000.InterfaceC3328v2
        /* renamed from: b */
        public void mo448b(View view) {
            AppCompatDelegateImpl.this.f353o.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f356r.m15707a((InterfaceC3328v2) null);
            AppCompatDelegateImpl.this.f356r = null;
        }

        @Override // p000.C3382w2, p000.InterfaceC3328v2
        /* renamed from: c */
        public void mo449c(View view) {
            AppCompatDelegateImpl.this.f353o.setVisibility(0);
            AppCompatDelegateImpl.this.f353o.sendAccessibilityEvent(32);
            if (AppCompatDelegateImpl.this.f353o.getParent() instanceof View) {
                C3107q2.m14878B((View) AppCompatDelegateImpl.this.f353o.getParent());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    /* loaded from: classes.dex */
    public final class C0074h implements InterfaceC0106o.a {
        C0074h() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0106o.a
        /* renamed from: a */
        public void mo450a(C0099h c0099h, boolean z) {
            AppCompatDelegateImpl.this.m411b(c0099h);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0106o.a
        /* renamed from: a */
        public boolean mo451a(C0099h c0099h) {
            Window.Callback m434o = AppCompatDelegateImpl.this.m434o();
            if (m434o == null) {
                return true;
            }
            m434o.onMenuOpened(108, c0099h);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    /* loaded from: classes.dex */
    public class C0075i implements AbstractC2532h.a {

        /* renamed from: a */
        private AbstractC2532h.a f396a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i$a */
        /* loaded from: classes.dex */
        class a extends C3382w2 {
            a() {
            }

            @Override // p000.InterfaceC3328v2
            /* renamed from: b */
            public void mo448b(View view) {
                AppCompatDelegateImpl.this.f353o.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f354p;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f353o.getParent() instanceof View) {
                    C3107q2.m14878B((View) AppCompatDelegateImpl.this.f353o.getParent());
                }
                AppCompatDelegateImpl.this.f353o.removeAllViews();
                AppCompatDelegateImpl.this.f356r.m15707a((InterfaceC3328v2) null);
                AppCompatDelegateImpl.this.f356r = null;
            }
        }

        public C0075i(AbstractC2532h.a aVar) {
            this.f396a = aVar;
        }

        @Override // p000.AbstractC2532h.a
        /* renamed from: a */
        public void mo452a(AbstractC2532h abstractC2532h) {
            this.f396a.mo452a(abstractC2532h);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f354p != null) {
                appCompatDelegateImpl.f342d.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f355q);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f353o != null) {
                appCompatDelegateImpl2.m431l();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                C3284u2 m14882a = C3107q2.m14882a(appCompatDelegateImpl3.f353o);
                m14882a.m15704a(0.0f);
                appCompatDelegateImpl3.f356r = m14882a;
                AppCompatDelegateImpl.this.f356r.m15707a(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            InterfaceC0083c interfaceC0083c = appCompatDelegateImpl4.f345g;
            if (interfaceC0083c != null) {
                interfaceC0083c.mo360b(appCompatDelegateImpl4.f352n);
            }
            AppCompatDelegateImpl.this.f352n = null;
        }

        @Override // p000.AbstractC2532h.a
        /* renamed from: a */
        public boolean mo453a(AbstractC2532h abstractC2532h, Menu menu) {
            return this.f396a.mo453a(abstractC2532h, menu);
        }

        @Override // p000.AbstractC2532h.a
        /* renamed from: a */
        public boolean mo454a(AbstractC2532h abstractC2532h, MenuItem menuItem) {
            return this.f396a.mo454a(abstractC2532h, menuItem);
        }

        @Override // p000.AbstractC2532h.a
        /* renamed from: b */
        public boolean mo455b(AbstractC2532h abstractC2532h, Menu menu) {
            return this.f396a.mo455b(abstractC2532h, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    /* loaded from: classes.dex */
    class C0076j extends WindowCallbackC3008o {
        C0076j(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: a */
        final ActionMode m456a(ActionMode.Callback callback) {
            C2879l.a aVar = new C2879l.a(AppCompatDelegateImpl.this.f341c, callback);
            AbstractC2532h m393a = AppCompatDelegateImpl.this.m393a(aVar);
            if (m393a != null) {
                return aVar.m13765b(m393a);
            }
            return null;
        }

        @Override // p000.WindowCallbackC3008o, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.m405a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p000.WindowCallbackC3008o, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.m413b(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p000.WindowCallbackC3008o, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0099h)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p000.WindowCallbackC3008o, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.m425g(i);
            return true;
        }

        @Override // p000.WindowCallbackC3008o, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.m427h(i);
        }

        @Override // p000.WindowCallbackC3008o, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0099h c0099h = menu instanceof C0099h ? (C0099h) menu : null;
            if (i == 0 && c0099h == null) {
                return false;
            }
            if (c0099h != null) {
                c0099h.m662c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (c0099h != null) {
                c0099h.m662c(false);
            }
            return onPreparePanel;
        }

        @Override // p000.WindowCallbackC3008o, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0099h c0099h;
            PanelFeatureState m391a = AppCompatDelegateImpl.this.m391a(0, true);
            if (m391a == null || (c0099h = m391a.f374j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, c0099h, i);
            }
        }

        @Override // p000.WindowCallbackC3008o, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return AppCompatDelegateImpl.this.m435p() ? m456a(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // p000.WindowCallbackC3008o, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (AppCompatDelegateImpl.this.m435p() && i == 0) ? m456a(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    /* loaded from: classes.dex */
    public final class C0077k {

        /* renamed from: a */
        private C0088h f400a;

        /* renamed from: b */
        private boolean f401b;

        /* renamed from: c */
        private BroadcastReceiver f402c;

        /* renamed from: d */
        private IntentFilter f403d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k$a */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                C0077k.this.m458b();
            }
        }

        C0077k(C0088h c0088h) {
            this.f400a = c0088h;
            this.f401b = c0088h.m515a();
        }

        /* renamed from: a */
        void m457a() {
            BroadcastReceiver broadcastReceiver = this.f402c;
            if (broadcastReceiver != null) {
                AppCompatDelegateImpl.this.f341c.unregisterReceiver(broadcastReceiver);
                this.f402c = null;
            }
        }

        /* renamed from: b */
        void m458b() {
            boolean m515a = this.f400a.m515a();
            if (m515a != this.f401b) {
                this.f401b = m515a;
                AppCompatDelegateImpl.this.mo403a();
            }
        }

        /* renamed from: c */
        int m459c() {
            boolean m515a = this.f400a.m515a();
            this.f401b = m515a;
            return m515a ? 2 : 1;
        }

        /* renamed from: d */
        void m460d() {
            m457a();
            if (this.f402c == null) {
                this.f402c = new a();
            }
            if (this.f403d == null) {
                IntentFilter intentFilter = new IntentFilter();
                this.f403d = intentFilter;
                intentFilter.addAction("android.intent.action.TIME_SET");
                this.f403d.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f403d.addAction("android.intent.action.TIME_TICK");
            }
            AppCompatDelegateImpl.this.f341c.registerReceiver(this.f402c, this.f403d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    /* loaded from: classes.dex */
    public class C0078l extends ContentFrameLayout {
        public C0078l(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m461a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.m405a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m461a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.m419d(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0000a.m4c(getContext(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    /* loaded from: classes.dex */
    public final class C0079m implements InterfaceC0106o.a {
        C0079m() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0106o.a
        /* renamed from: a */
        public void mo450a(C0099h c0099h, boolean z) {
            C0099h mo675m = c0099h.mo675m();
            boolean z2 = mo675m != c0099h;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                c0099h = mo675m;
            }
            PanelFeatureState m392a = appCompatDelegateImpl.m392a((Menu) c0099h);
            if (m392a != null) {
                if (!z2) {
                    AppCompatDelegateImpl.this.m400a(m392a, z);
                } else {
                    AppCompatDelegateImpl.this.m394a(m392a.f365a, m392a, mo675m);
                    AppCompatDelegateImpl.this.m400a(m392a, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0106o.a
        /* renamed from: a */
        public boolean mo451a(C0099h c0099h) {
            Window.Callback m434o;
            if (c0099h != null) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f364z || (m434o = appCompatDelegateImpl.m434o()) == null || AppCompatDelegateImpl.this.f330I) {
                return true;
            }
            m434o.onMenuOpened(108, c0099h);
            return true;
        }
    }

    static {
        boolean z = Build.VERSION.SDK_INT < 21;
        f319T = z;
        f320U = new int[]{R.attr.windowBackground};
        if (!z || f321V) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new C0067a(Thread.getDefaultUncaughtExceptionHandler()));
        f321V = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatDelegateImpl(Context context, Window window, InterfaceC0083c interfaceC0083c) {
        this.f341c = context;
        this.f342d = window;
        this.f345g = interfaceC0083c;
        Window.Callback callback = window.getCallback();
        this.f343e = callback;
        if (callback instanceof C0076j) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C0076j c0076j = new C0076j(callback);
        this.f344f = c0076j;
        this.f342d.setCallback(c0076j);
        C0198t0 m1132a = C0198t0.m1132a(context, (AttributeSet) null, f320U);
        Drawable m1144c = m1132a.m1144c(0);
        if (m1144c != null) {
            this.f342d.setBackgroundDrawable(m1144c);
        }
        m1132a.m1138a();
    }

    /* renamed from: A */
    private void m368A() {
        if (this.f358t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: a */
    private void m369a(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.f379o || this.f330I) {
            return;
        }
        if (panelFeatureState.f365a == 0) {
            if ((this.f341c.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback m434o = m434o();
        if (m434o != null && !m434o.onMenuOpened(panelFeatureState.f365a, panelFeatureState.f374j)) {
            m400a(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f341c.getSystemService("window");
        if (windowManager != null && m375b(panelFeatureState, keyEvent)) {
            if (panelFeatureState.f371g == null || panelFeatureState.f381q) {
                ViewGroup viewGroup = panelFeatureState.f371g;
                if (viewGroup == null) {
                    if (!m374b(panelFeatureState) || panelFeatureState.f371g == null) {
                        return;
                    }
                } else if (panelFeatureState.f381q && viewGroup.getChildCount() > 0) {
                    panelFeatureState.f371g.removeAllViews();
                }
                if (!m372a(panelFeatureState) || !panelFeatureState.m442a()) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = panelFeatureState.f372h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                panelFeatureState.f371g.setBackgroundResource(panelFeatureState.f366b);
                ViewParent parent = panelFeatureState.f372h.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(panelFeatureState.f372h);
                }
                panelFeatureState.f371g.addView(panelFeatureState.f372h, layoutParams2);
                if (!panelFeatureState.f372h.hasFocus()) {
                    panelFeatureState.f372h.requestFocus();
                }
            } else {
                View view = panelFeatureState.f373i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                    panelFeatureState.f378n = false;
                    WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f368d, panelFeatureState.f369e, 1002, 8519680, -3);
                    layoutParams3.gravity = panelFeatureState.f367c;
                    layoutParams3.windowAnimations = panelFeatureState.f370f;
                    windowManager.addView(panelFeatureState.f371g, layoutParams3);
                    panelFeatureState.f379o = true;
                }
            }
            i = -2;
            panelFeatureState.f378n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f368d, panelFeatureState.f369e, 1002, 8519680, -3);
            layoutParams32.gravity = panelFeatureState.f367c;
            layoutParams32.windowAnimations = panelFeatureState.f370f;
            windowManager.addView(panelFeatureState.f371g, layoutParams32);
            panelFeatureState.f379o = true;
        }
    }

    /* renamed from: a */
    private void m370a(C0099h c0099h, boolean z) {
        InterfaceC0209z interfaceC0209z = this.f349k;
        if (interfaceC0209z == null || !interfaceC0209z.mo760f() || (ViewConfiguration.get(this.f341c).hasPermanentMenuKey() && !this.f349k.mo757c())) {
            PanelFeatureState m391a = m391a(0, true);
            m391a.f381q = true;
            m400a(m391a, false);
            m369a(m391a, (KeyEvent) null);
            return;
        }
        Window.Callback m434o = m434o();
        if (this.f349k.mo755a() && z) {
            this.f349k.mo758d();
            if (this.f330I) {
                return;
            }
            m434o.onPanelClosed(108, m391a(0, true).f374j);
            return;
        }
        if (m434o == null || this.f330I) {
            return;
        }
        if (this.f334M && (this.f335N & 1) != 0) {
            this.f342d.getDecorView().removeCallbacks(this.f336O);
            this.f336O.run();
        }
        PanelFeatureState m391a2 = m391a(0, true);
        C0099h c0099h2 = m391a2.f374j;
        if (c0099h2 == null || m391a2.f382r || !m434o.onPreparePanel(0, m391a2.f373i, c0099h2)) {
            return;
        }
        m434o.onMenuOpened(108, m391a2.f374j);
        this.f349k.mo759e();
    }

    /* renamed from: a */
    private boolean m371a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f342d.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C3107q2.m14931w((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: a */
    private boolean m372a(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f373i;
        if (view != null) {
            panelFeatureState.f372h = view;
            return true;
        }
        if (panelFeatureState.f374j == null) {
            return false;
        }
        if (this.f351m == null) {
            this.f351m = new C0079m();
        }
        View view2 = (View) panelFeatureState.m439a(this.f351m);
        panelFeatureState.f372h = view2;
        return view2 != null;
    }

    /* renamed from: a */
    private boolean m373a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        C0099h c0099h;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f377m || m375b(panelFeatureState, keyEvent)) && (c0099h = panelFeatureState.f374j) != null) {
            z = c0099h.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f349k == null) {
            m400a(panelFeatureState, true);
        }
        return z;
    }

    /* renamed from: b */
    private boolean m374b(PanelFeatureState panelFeatureState) {
        panelFeatureState.m440a(m432m());
        panelFeatureState.f371g = new C0078l(panelFeatureState.f376l);
        panelFeatureState.f367c = 81;
        return true;
    }

    /* renamed from: b */
    private boolean m375b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        InterfaceC0209z interfaceC0209z;
        InterfaceC0209z interfaceC0209z2;
        InterfaceC0209z interfaceC0209z3;
        if (this.f330I) {
            return false;
        }
        if (panelFeatureState.f377m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f328G;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            m400a(panelFeatureState2, false);
        }
        Window.Callback m434o = m434o();
        if (m434o != null) {
            panelFeatureState.f373i = m434o.onCreatePanelView(panelFeatureState.f365a);
        }
        int i = panelFeatureState.f365a;
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC0209z3 = this.f349k) != null) {
            interfaceC0209z3.mo756b();
        }
        if (panelFeatureState.f373i == null) {
            if (z) {
                m437r();
            }
            if (panelFeatureState.f374j == null || panelFeatureState.f382r) {
                if (panelFeatureState.f374j == null && (!m376c(panelFeatureState) || panelFeatureState.f374j == null)) {
                    return false;
                }
                if (z && this.f349k != null) {
                    if (this.f350l == null) {
                        this.f350l = new C0074h();
                    }
                    this.f349k.mo754a(panelFeatureState.f374j, this.f350l);
                }
                panelFeatureState.f374j.m681s();
                if (!m434o.onCreatePanelMenu(panelFeatureState.f365a, panelFeatureState.f374j)) {
                    panelFeatureState.m441a((C0099h) null);
                    if (z && (interfaceC0209z = this.f349k) != null) {
                        interfaceC0209z.mo754a(null, this.f350l);
                    }
                    return false;
                }
                panelFeatureState.f382r = false;
            }
            panelFeatureState.f374j.m681s();
            Bundle bundle = panelFeatureState.f383s;
            if (bundle != null) {
                panelFeatureState.f374j.m642a(bundle);
                panelFeatureState.f383s = null;
            }
            if (!m434o.onPreparePanel(0, panelFeatureState.f373i, panelFeatureState.f374j)) {
                if (z && (interfaceC0209z2 = this.f349k) != null) {
                    interfaceC0209z2.mo754a(null, this.f350l);
                }
                panelFeatureState.f374j.m680r();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f380p = z2;
            panelFeatureState.f374j.setQwertyMode(z2);
            panelFeatureState.f374j.m680r();
        }
        panelFeatureState.f377m = true;
        panelFeatureState.f378n = false;
        this.f328G = panelFeatureState;
        return true;
    }

    /* renamed from: c */
    private boolean m376c(PanelFeatureState panelFeatureState) {
        Context context = this.f341c;
        int i = panelFeatureState.f365a;
        if ((i == 0 || i == 108) && this.f349k != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(R$attr.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C2794j c2794j = new C2794j(context, 0);
                c2794j.getTheme().setTo(theme2);
                context = c2794j;
            }
        }
        C0099h c0099h = new C0099h(context);
        c0099h.mo644a(this);
        panelFeatureState.m441a(c0099h);
        return true;
    }

    /* renamed from: d */
    private boolean m377d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState m391a = m391a(i, true);
        if (m391a.f379o) {
            return false;
        }
        return m375b(m391a, keyEvent);
    }

    /* renamed from: e */
    private boolean m378e(int i, KeyEvent keyEvent) {
        boolean z;
        AudioManager audioManager;
        InterfaceC0209z interfaceC0209z;
        if (this.f352n != null) {
            return false;
        }
        boolean z2 = true;
        PanelFeatureState m391a = m391a(i, true);
        if (i != 0 || (interfaceC0209z = this.f349k) == null || !interfaceC0209z.mo760f() || ViewConfiguration.get(this.f341c).hasPermanentMenuKey()) {
            if (m391a.f379o || m391a.f378n) {
                boolean z3 = m391a.f379o;
                m400a(m391a, true);
                z2 = z3;
            } else {
                if (m391a.f377m) {
                    if (m391a.f382r) {
                        m391a.f377m = false;
                        z = m375b(m391a, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        m369a(m391a, keyEvent);
                    }
                }
                z2 = false;
            }
        } else if (this.f349k.mo755a()) {
            z2 = this.f349k.mo758d();
        } else {
            if (!this.f330I && m375b(m391a, keyEvent)) {
                z2 = this.f349k.mo759e();
            }
            z2 = false;
        }
        if (z2 && (audioManager = (AudioManager) this.f341c.getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return z2;
    }

    /* renamed from: j */
    private void m379j(int i) {
        this.f335N = (1 << i) | this.f335N;
        if (this.f334M) {
            return;
        }
        C3107q2.m14892a(this.f342d.getDecorView(), this.f336O);
        this.f334M = true;
    }

    /* renamed from: k */
    private int m380k(int i) {
        if (i == 8) {
            return 108;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    /* renamed from: l */
    private boolean m381l(int i) {
        Resources resources = this.f341c.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (m388z()) {
            ((Activity) this.f341c).recreate();
            return true;
        }
        Configuration configuration2 = new Configuration(configuration);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        resources.updateConfiguration(configuration2, displayMetrics);
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        C0086f.m503a(resources);
        return true;
    }

    /* renamed from: t */
    private void m382t() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f359u.findViewById(R.id.content);
        View decorView = this.f342d.getDecorView();
        contentFrameLayout.m803a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f341c.obtainStyledAttributes(R$styleable.AppCompatTheme);
        obtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    private ViewGroup m383u() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f341c.obtainStyledAttributes(R$styleable.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowNoTitle, false)) {
            mo412b(1);
        } else if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionBar, false)) {
            mo412b(108);
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            mo412b(109);
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            mo412b(10);
        }
        this.f324C = obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        this.f342d.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f341c);
        if (this.f325D) {
            ViewGroup viewGroup2 = (ViewGroup) from.inflate(this.f323B ? R$layout.abc_screen_simple_overlay_action_mode : R$layout.abc_screen_simple, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                C3107q2.m14895a(viewGroup2, new C0069c());
                viewGroup = viewGroup2;
            } else {
                ((InterfaceC0166d0) viewGroup2).setOnFitSystemWindowsListener(new C0070d());
                viewGroup = viewGroup2;
            }
        } else if (this.f324C) {
            ViewGroup viewGroup3 = (ViewGroup) from.inflate(R$layout.abc_dialog_title_material, (ViewGroup) null);
            this.f322A = false;
            this.f364z = false;
            viewGroup = viewGroup3;
        } else if (this.f364z) {
            TypedValue typedValue = new TypedValue();
            this.f341c.getTheme().resolveAttribute(R$attr.actionBarTheme, typedValue, true);
            ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C2794j(this.f341c, typedValue.resourceId) : this.f341c).inflate(R$layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0209z interfaceC0209z = (InterfaceC0209z) viewGroup4.findViewById(R$id.decor_content_parent);
            this.f349k = interfaceC0209z;
            interfaceC0209z.setWindowCallback(m434o());
            if (this.f322A) {
                this.f349k.mo753a(109);
            }
            if (this.f362x) {
                this.f349k.mo753a(2);
            }
            viewGroup = viewGroup4;
            if (this.f363y) {
                this.f349k.mo753a(5);
                viewGroup = viewGroup4;
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f364z + ", windowActionBarOverlay: " + this.f322A + ", android:windowIsFloating: " + this.f324C + ", windowActionModeOverlay: " + this.f323B + ", windowNoTitle: " + this.f325D + " }");
        }
        if (this.f349k == null) {
            this.f360v = (TextView) viewGroup.findViewById(R$id.title);
        }
        C0210z0.m1245b(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R$id.action_bar_activity_content);
        ViewGroup viewGroup5 = (ViewGroup) this.f342d.findViewById(R.id.content);
        if (viewGroup5 != null) {
            while (viewGroup5.getChildCount() > 0) {
                View childAt = viewGroup5.getChildAt(0);
                viewGroup5.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup5.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup5 instanceof FrameLayout) {
                ((FrameLayout) viewGroup5).setForeground(null);
            }
        }
        this.f342d.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0071e());
        return viewGroup;
    }

    /* renamed from: v */
    private void m384v() {
        if (this.f333L == null) {
            this.f333L = new C0077k(C0088h.m511a(this.f341c));
        }
    }

    /* renamed from: w */
    private void m385w() {
        if (this.f358t) {
            return;
        }
        this.f359u = m383u();
        CharSequence m433n = m433n();
        if (!TextUtils.isEmpty(m433n)) {
            InterfaceC0209z interfaceC0209z = this.f349k;
            if (interfaceC0209z != null) {
                interfaceC0209z.setWindowTitle(m433n);
            } else if (m437r() != null) {
                m437r().mo468b(m433n);
            } else {
                TextView textView = this.f360v;
                if (textView != null) {
                    textView.setText(m433n);
                }
            }
        }
        m382t();
        m399a(this.f359u);
        this.f358t = true;
        PanelFeatureState m391a = m391a(0, false);
        if (this.f330I) {
            return;
        }
        if (m391a == null || m391a.f374j == null) {
            m379j(108);
        }
    }

    /* renamed from: x */
    private int m386x() {
        int i = this.f331J;
        return i != -100 ? i : AbstractC0084d.m497j();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m387y() {
        /*
            r3 = this;
            r3.m385w()
            boolean r0 = r3.f364z
            if (r0 == 0) goto L37
            androidx.appcompat.app.a r0 = r3.f346h
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            android.view.Window$Callback r0 = r3.f343e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.i r0 = new androidx.appcompat.app.i
            android.view.Window$Callback r1 = r3.f343e
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f322A
            r0.<init>(r1, r2)
        L1d:
            r3.f346h = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            androidx.appcompat.app.i r0 = new androidx.appcompat.app.i
            android.view.Window$Callback r1 = r3.f343e
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.a r0 = r3.f346h
            if (r0 == 0) goto L37
            boolean r1 = r3.f337P
            r0.mo470c(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m387y():void");
    }

    /* renamed from: z */
    private boolean m388z() {
        if (this.f332K) {
            Context context = this.f341c;
            if (context instanceof Activity) {
                try {
                    return (context.getPackageManager().getActivityInfo(new ComponentName(this.f341c, this.f341c.getClass()), 0).configChanges & 512) == 0;
                } catch (PackageManager.NameNotFoundException unused) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: a */
    public <T extends View> T mo389a(int i) {
        m385w();
        return (T) this.f342d.findViewById(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public View m390a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        AppCompatViewInflater appCompatViewInflater;
        boolean z2 = false;
        if (this.f340S == null) {
            String string = this.f341c.obtainStyledAttributes(R$styleable.AppCompatTheme).getString(R$styleable.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.f340S = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    String str2 = "Failed to instantiate custom view inflater " + string + ". Falling back to default.";
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.f340S = appCompatViewInflater;
        }
        if (f319T) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m371a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f340S.createView(view, str, context, attributeSet, z, f319T, true, C0208y0.m1241b());
    }

    /* renamed from: a */
    protected PanelFeatureState m391a(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f327F;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f327F = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* renamed from: a */
    PanelFeatureState m392a(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f327F;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f374j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* renamed from: a */
    public AbstractC2532h m393a(AbstractC2532h.a aVar) {
        InterfaceC0083c interfaceC0083c;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC2532h abstractC2532h = this.f352n;
        if (abstractC2532h != null) {
            abstractC2532h.mo540a();
        }
        C0075i c0075i = new C0075i(aVar);
        AbstractC0081a mo414c = mo414c();
        if (mo414c != null) {
            AbstractC2532h mo463a = mo414c.mo463a(c0075i);
            this.f352n = mo463a;
            if (mo463a != null && (interfaceC0083c = this.f345g) != null) {
                interfaceC0083c.mo358a(mo463a);
            }
        }
        if (this.f352n == null) {
            this.f352n = m408b(c0075i);
        }
        return this.f352n;
    }

    /* renamed from: a */
    void m394a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f327F;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f374j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f379o) && !this.f330I) {
            this.f343e.onPanelClosed(i, menu);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: a */
    public void mo395a(Configuration configuration) {
        AbstractC0081a mo414c;
        if (this.f364z && this.f358t && (mo414c = mo414c()) != null) {
            mo414c.mo464a(configuration);
        }
        C0175i.m1020a().m1042a(this.f341c);
        mo403a();
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: a */
    public void mo396a(Bundle bundle) {
        Window.Callback callback = this.f343e;
        if (callback instanceof Activity) {
            String str = null;
            try {
                str = C0226d.m1374b((Activity) callback);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AbstractC0081a m437r = m437r();
                if (m437r == null) {
                    this.f337P = true;
                } else {
                    m437r.mo470c(true);
                }
            }
        }
        if (bundle == null || this.f331J != -100) {
            return;
        }
        this.f331J = bundle.getInt("appcompat:local_night_mode", -100);
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: a */
    public void mo397a(View view) {
        m385w();
        ViewGroup viewGroup = (ViewGroup) this.f359u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f343e.onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: a */
    public void mo398a(View view, ViewGroup.LayoutParams layoutParams) {
        m385w();
        ((ViewGroup) this.f359u.findViewById(R.id.content)).addView(view, layoutParams);
        this.f343e.onContentChanged();
    }

    /* renamed from: a */
    void m399a(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    void m400a(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        InterfaceC0209z interfaceC0209z;
        if (z && panelFeatureState.f365a == 0 && (interfaceC0209z = this.f349k) != null && interfaceC0209z.mo755a()) {
            m411b(panelFeatureState.f374j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f341c.getSystemService("window");
        if (windowManager != null && panelFeatureState.f379o && (viewGroup = panelFeatureState.f371g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m394a(panelFeatureState.f365a, panelFeatureState, null);
            }
        }
        panelFeatureState.f377m = false;
        panelFeatureState.f378n = false;
        panelFeatureState.f379o = false;
        panelFeatureState.f372h = null;
        panelFeatureState.f381q = true;
        if (this.f328G == panelFeatureState) {
            this.f328G = null;
        }
    }

    @Override // androidx.appcompat.view.menu.C0099h.a
    /* renamed from: a */
    public void mo401a(C0099h c0099h) {
        m370a(c0099h, true);
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: a */
    public final void mo402a(CharSequence charSequence) {
        this.f348j = charSequence;
        InterfaceC0209z interfaceC0209z = this.f349k;
        if (interfaceC0209z != null) {
            interfaceC0209z.setWindowTitle(charSequence);
            return;
        }
        if (m437r() != null) {
            m437r().mo468b(charSequence);
            return;
        }
        TextView textView = this.f360v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: a */
    public boolean mo403a() {
        int m386x = m386x();
        int m422f = m422f(m386x);
        boolean m381l = m422f != -1 ? m381l(m422f) : false;
        if (m386x == 0) {
            m384v();
            this.f333L.m460d();
        }
        this.f332K = true;
        return m381l;
    }

    /* renamed from: a */
    boolean m404a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.f329H = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            m377d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    boolean m405a(KeyEvent keyEvent) {
        View decorView;
        Window.Callback callback = this.f343e;
        if (((callback instanceof C0502c2.a) || (callback instanceof DialogC0085e)) && (decorView = this.f342d.getDecorView()) != null && C0502c2.m3525a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f343e.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m404a(keyCode, keyEvent) : m417c(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.view.menu.C0099h.a
    /* renamed from: a */
    public boolean mo406a(C0099h c0099h, MenuItem menuItem) {
        PanelFeatureState m392a;
        Window.Callback m434o = m434o();
        if (m434o == null || this.f330I || (m392a = m392a((Menu) c0099h.mo675m())) == null) {
            return false;
        }
        return m434o.onMenuItemSelected(m392a.f365a, menuItem);
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: b */
    public MenuInflater mo407b() {
        if (this.f347i == null) {
            m387y();
            AbstractC0081a abstractC0081a = this.f346h;
            this.f347i = new C2916m(abstractC0081a != null ? abstractC0081a.mo476h() : this.f341c);
        }
        return this.f347i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    p000.AbstractC2532h m408b(p000.AbstractC2532h.a r8) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m408b(h$a):h");
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: b */
    public void mo409b(Bundle bundle) {
        m385w();
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: b */
    public void mo410b(View view, ViewGroup.LayoutParams layoutParams) {
        m385w();
        ViewGroup viewGroup = (ViewGroup) this.f359u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f343e.onContentChanged();
    }

    /* renamed from: b */
    void m411b(C0099h c0099h) {
        if (this.f326E) {
            return;
        }
        this.f326E = true;
        this.f349k.mo761g();
        Window.Callback m434o = m434o();
        if (m434o != null && !this.f330I) {
            m434o.onPanelClosed(108, c0099h);
        }
        this.f326E = false;
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: b */
    public boolean mo412b(int i) {
        int m380k = m380k(i);
        if (this.f325D && m380k == 108) {
            return false;
        }
        if (this.f364z && m380k == 1) {
            this.f364z = false;
        }
        if (m380k == 1) {
            m368A();
            this.f325D = true;
            return true;
        }
        if (m380k == 2) {
            m368A();
            this.f362x = true;
            return true;
        }
        if (m380k == 5) {
            m368A();
            this.f363y = true;
            return true;
        }
        if (m380k == 10) {
            m368A();
            this.f323B = true;
            return true;
        }
        if (m380k == 108) {
            m368A();
            this.f364z = true;
            return true;
        }
        if (m380k != 109) {
            return this.f342d.requestFeature(m380k);
        }
        m368A();
        this.f322A = true;
        return true;
    }

    /* renamed from: b */
    boolean m413b(int i, KeyEvent keyEvent) {
        AbstractC0081a mo414c = mo414c();
        if (mo414c != null && mo414c.mo466a(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f328G;
        if (panelFeatureState != null && m373a(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.f328G;
            if (panelFeatureState2 != null) {
                panelFeatureState2.f378n = true;
            }
            return true;
        }
        if (this.f328G == null) {
            PanelFeatureState m391a = m391a(0, true);
            m375b(m391a, keyEvent);
            boolean m373a = m373a(m391a, keyEvent.getKeyCode(), keyEvent, 1);
            m391a.f377m = false;
            if (m373a) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: c */
    public AbstractC0081a mo414c() {
        m387y();
        return this.f346h;
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: c */
    public void mo415c(int i) {
        m385w();
        ViewGroup viewGroup = (ViewGroup) this.f359u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f341c).inflate(i, viewGroup);
        this.f343e.onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: c */
    public void mo416c(Bundle bundle) {
        int i = this.f331J;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    /* renamed from: c */
    boolean m417c(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f329H;
            this.f329H = false;
            PanelFeatureState m391a = m391a(0, false);
            if (m391a != null && m391a.f379o) {
                if (!z) {
                    m400a(m391a, true);
                }
                return true;
            }
            if (m436q()) {
                return true;
            }
        } else if (i == 82) {
            m378e(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: d */
    public void mo418d() {
        LayoutInflater from = LayoutInflater.from(this.f341c);
        if (from.getFactory() == null) {
            C2371d2.m11249b(from, this);
        } else {
            boolean z = from.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    /* renamed from: d */
    void m419d(int i) {
        m400a(m391a(i, true), true);
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: e */
    public void mo420e() {
        AbstractC0081a mo414c = mo414c();
        if (mo414c == null || !mo414c.m478j()) {
            m379j(0);
        }
    }

    /* renamed from: e */
    void m421e(int i) {
        PanelFeatureState m391a;
        PanelFeatureState m391a2 = m391a(i, true);
        if (m391a2.f374j != null) {
            Bundle bundle = new Bundle();
            m391a2.f374j.m655b(bundle);
            if (bundle.size() > 0) {
                m391a2.f383s = bundle;
            }
            m391a2.f374j.m681s();
            m391a2.f374j.clear();
        }
        m391a2.f382r = true;
        m391a2.f381q = true;
        if ((i != 108 && i != 0) || this.f349k == null || (m391a = m391a(0, false)) == null) {
            return;
        }
        m391a.f377m = false;
        m375b(m391a, (KeyEvent) null);
    }

    /* renamed from: f */
    int m422f(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f341c.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        m384v();
        return this.f333L.m459c();
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: f */
    public void mo423f() {
        if (this.f334M) {
            this.f342d.getDecorView().removeCallbacks(this.f336O);
        }
        this.f330I = true;
        AbstractC0081a abstractC0081a = this.f346h;
        if (abstractC0081a != null) {
            abstractC0081a.m479k();
        }
        C0077k c0077k = this.f333L;
        if (c0077k != null) {
            c0077k.m457a();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: g */
    public void mo424g() {
        AbstractC0081a mo414c = mo414c();
        if (mo414c != null) {
            mo414c.mo472e(true);
        }
    }

    /* renamed from: g */
    void m425g(int i) {
        AbstractC0081a mo414c;
        if (i != 108 || (mo414c = mo414c()) == null) {
            return;
        }
        mo414c.mo469b(true);
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: h */
    public void mo426h() {
        mo403a();
    }

    /* renamed from: h */
    void m427h(int i) {
        if (i == 108) {
            AbstractC0081a mo414c = mo414c();
            if (mo414c != null) {
                mo414c.mo469b(false);
                return;
            }
            return;
        }
        if (i == 0) {
            PanelFeatureState m391a = m391a(i, true);
            if (m391a.f379o) {
                m400a(m391a, false);
            }
        }
    }

    /* renamed from: i */
    int m428i(int i) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.f353o;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f353o.getLayoutParams();
            if (this.f353o.isShown()) {
                if (this.f338Q == null) {
                    this.f338Q = new Rect();
                    this.f339R = new Rect();
                }
                Rect rect = this.f338Q;
                Rect rect2 = this.f339R;
                rect.set(0, i, 0, 0);
                C0210z0.m1243a(this.f359u, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f361w;
                    if (view == null) {
                        View view2 = new View(this.f341c);
                        this.f361w = view2;
                        view2.setBackgroundColor(this.f341c.getResources().getColor(R$color.abc_input_method_navigation_guard));
                        this.f359u.addView(this.f361w, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f361w.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                r3 = this.f361w != null;
                if (!this.f323B && r3) {
                    i = 0;
                }
                boolean z3 = r3;
                r3 = z2;
                z = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r3 = false;
            }
            if (r3) {
                this.f353o.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.f361w;
        if (view3 != null) {
            view3.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    @Override // androidx.appcompat.app.AbstractC0084d
    /* renamed from: i */
    public void mo429i() {
        AbstractC0081a mo414c = mo414c();
        if (mo414c != null) {
            mo414c.mo472e(false);
        }
        C0077k c0077k = this.f333L;
        if (c0077k != null) {
            c0077k.m457a();
        }
    }

    /* renamed from: k */
    void m430k() {
        C0099h c0099h;
        InterfaceC0209z interfaceC0209z = this.f349k;
        if (interfaceC0209z != null) {
            interfaceC0209z.mo761g();
        }
        if (this.f354p != null) {
            this.f342d.getDecorView().removeCallbacks(this.f355q);
            if (this.f354p.isShowing()) {
                try {
                    this.f354p.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f354p = null;
        }
        m431l();
        PanelFeatureState m391a = m391a(0, false);
        if (m391a == null || (c0099h = m391a.f374j) == null) {
            return;
        }
        c0099h.close();
    }

    /* renamed from: l */
    void m431l() {
        C3284u2 c3284u2 = this.f356r;
        if (c3284u2 != null) {
            c3284u2.m15709a();
        }
    }

    /* renamed from: m */
    final Context m432m() {
        AbstractC0081a mo414c = mo414c();
        Context mo476h = mo414c != null ? mo414c.mo476h() : null;
        return mo476h == null ? this.f341c : mo476h;
    }

    /* renamed from: n */
    final CharSequence m433n() {
        Window.Callback callback = this.f343e;
        return callback instanceof Activity ? ((Activity) callback).getTitle() : this.f348j;
    }

    /* renamed from: o */
    final Window.Callback m434o() {
        return this.f342d.getCallback();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m390a(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: p */
    public boolean m435p() {
        return this.f357s;
    }

    /* renamed from: q */
    boolean m436q() {
        AbstractC2532h abstractC2532h = this.f352n;
        if (abstractC2532h != null) {
            abstractC2532h.mo540a();
            return true;
        }
        AbstractC0081a mo414c = mo414c();
        return mo414c != null && mo414c.mo474f();
    }

    /* renamed from: r */
    final AbstractC0081a m437r() {
        return this.f346h;
    }

    /* renamed from: s */
    final boolean m438s() {
        ViewGroup viewGroup;
        return this.f358t && (viewGroup = this.f359u) != null && C3107q2.m14932x(viewGroup);
    }
}
