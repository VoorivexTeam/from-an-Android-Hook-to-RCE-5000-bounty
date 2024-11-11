package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000.AbstractC2496g3;
import p000.C3107q2;
import p000.InterfaceC2572i;

/* loaded from: classes.dex */
public class SearchView extends C0170f0 implements InterfaceC2572i {

    /* renamed from: r0 */
    static final C0145k f821r0 = new C0145k();

    /* renamed from: A */
    private Rect f822A;

    /* renamed from: B */
    private Rect f823B;

    /* renamed from: C */
    private int[] f824C;

    /* renamed from: D */
    private int[] f825D;

    /* renamed from: E */
    private final ImageView f826E;

    /* renamed from: F */
    private final Drawable f827F;

    /* renamed from: G */
    private final int f828G;

    /* renamed from: H */
    private final int f829H;

    /* renamed from: I */
    private final Intent f830I;

    /* renamed from: J */
    private final Intent f831J;

    /* renamed from: K */
    private final CharSequence f832K;

    /* renamed from: L */
    private InterfaceC0147m f833L;

    /* renamed from: M */
    private InterfaceC0146l f834M;

    /* renamed from: N */
    View.OnFocusChangeListener f835N;

    /* renamed from: O */
    private InterfaceC0148n f836O;

    /* renamed from: P */
    private View.OnClickListener f837P;

    /* renamed from: Q */
    private boolean f838Q;

    /* renamed from: R */
    private boolean f839R;

    /* renamed from: S */
    AbstractC2496g3 f840S;

    /* renamed from: T */
    private boolean f841T;

    /* renamed from: U */
    private CharSequence f842U;

    /* renamed from: V */
    private boolean f843V;

    /* renamed from: W */
    private boolean f844W;

    /* renamed from: a0 */
    private int f845a0;

    /* renamed from: b0 */
    private boolean f846b0;

    /* renamed from: c0 */
    private CharSequence f847c0;

    /* renamed from: d0 */
    private CharSequence f848d0;

    /* renamed from: e0 */
    private boolean f849e0;

    /* renamed from: f0 */
    private int f850f0;

    /* renamed from: g0 */
    SearchableInfo f851g0;

    /* renamed from: h0 */
    private Bundle f852h0;

    /* renamed from: i0 */
    private final Runnable f853i0;

    /* renamed from: j0 */
    private Runnable f854j0;

    /* renamed from: k0 */
    private final WeakHashMap<String, Drawable.ConstantState> f855k0;

    /* renamed from: l0 */
    private final View.OnClickListener f856l0;

    /* renamed from: m0 */
    View.OnKeyListener f857m0;

    /* renamed from: n0 */
    private final TextView.OnEditorActionListener f858n0;

    /* renamed from: o0 */
    private final AdapterView.OnItemClickListener f859o0;

    /* renamed from: p0 */
    private final AdapterView.OnItemSelectedListener f860p0;

    /* renamed from: q */
    final SearchAutoComplete f861q;

    /* renamed from: q0 */
    private TextWatcher f862q0;

    /* renamed from: r */
    private final View f863r;

    /* renamed from: s */
    private final View f864s;

    /* renamed from: t */
    private final View f865t;

    /* renamed from: u */
    final ImageView f866u;

    /* renamed from: v */
    final ImageView f867v;

    /* renamed from: w */
    final ImageView f868w;

    /* renamed from: x */
    final ImageView f869x;

    /* renamed from: y */
    private final View f870y;

    /* renamed from: z */
    private C0149o f871z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0133a();

        /* renamed from: d */
        boolean f872d;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        /* loaded from: classes.dex */
        static class C0133a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0133a() {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f872d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f872d + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f872d));
        }
    }

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C0163c {

        /* renamed from: e */
        private int f873e;

        /* renamed from: f */
        private SearchView f874f;

        /* renamed from: g */
        private boolean f875g;

        /* renamed from: h */
        final Runnable f876h;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        /* loaded from: classes.dex */
        class RunnableC0134a implements Runnable {
            RunnableC0134a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m843b();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R$attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f876h = new RunnableC0134a();
            this.f873e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        boolean m842a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: b */
        void m843b() {
            if (this.f875g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f875g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f873e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C0163c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f875g) {
                removeCallbacks(this.f876h);
                post(this.f876h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f874f.m839j();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f874f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f874f.hasFocus() && getVisibility() == 0) {
                this.f875g = true;
                if (SearchView.m811a(getContext())) {
                    SearchView.f821r0.m845a(this, true);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f875g = false;
                removeCallbacks(this.f876h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f875g = true;
                    return;
                }
                this.f875g = false;
                removeCallbacks(this.f876h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f874f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f873e = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    /* loaded from: classes.dex */
    class C0135a implements TextWatcher {
        C0135a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.m831b(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    /* loaded from: classes.dex */
    class RunnableC0136b implements Runnable {
        RunnableC0136b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m841l();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    /* loaded from: classes.dex */
    class RunnableC0137c implements Runnable {
        RunnableC0137c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2496g3 abstractC2496g3 = SearchView.this.f840S;
            if (abstractC2496g3 == null || !(abstractC2496g3 instanceof ViewOnClickListenerC0184m0)) {
                return;
            }
            abstractC2496g3.mo1098a((Cursor) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    /* loaded from: classes.dex */
    class ViewOnFocusChangeListenerC0138d implements View.OnFocusChangeListener {
        ViewOnFocusChangeListenerC0138d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f835N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    /* loaded from: classes.dex */
    class ViewOnLayoutChangeListenerC0139e implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0139e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.m832d();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    /* loaded from: classes.dex */
    class ViewOnClickListenerC0140f implements View.OnClickListener {
        ViewOnClickListenerC0140f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f866u) {
                searchView.m837h();
                return;
            }
            if (view == searchView.f868w) {
                searchView.m836g();
                return;
            }
            if (view == searchView.f867v) {
                searchView.m838i();
            } else if (view == searchView.f869x) {
                searchView.m840k();
            } else if (view == searchView.f861q) {
                searchView.m834e();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    /* loaded from: classes.dex */
    class ViewOnKeyListenerC0141g implements View.OnKeyListener {
        ViewOnKeyListenerC0141g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f851g0 == null) {
                return false;
            }
            if (searchView.f861q.isPopupShowing() && SearchView.this.f861q.getListSelection() != -1) {
                return SearchView.this.m830a(view, i, keyEvent);
            }
            if (SearchView.this.f861q.m842a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m826a(0, (String) null, searchView2.f861q.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    /* loaded from: classes.dex */
    class C0142h implements TextView.OnEditorActionListener {
        C0142h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m838i();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    /* loaded from: classes.dex */
    class C0143i implements AdapterView.OnItemClickListener {
        C0143i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m829a(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    /* loaded from: classes.dex */
    class C0144j implements AdapterView.OnItemSelectedListener {
        C0144j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m833d(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.SearchView$k */
    /* loaded from: classes.dex */
    public static class C0145k {

        /* renamed from: a */
        private Method f888a;

        /* renamed from: b */
        private Method f889b;

        /* renamed from: c */
        private Method f890c;

        C0145k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f888a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f889b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f890c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: a */
        void m844a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f889b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: a */
        void m845a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f890c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z));
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        void m846b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f888a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    /* loaded from: classes.dex */
    public interface InterfaceC0146l {
        /* renamed from: a */
        boolean m847a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    /* loaded from: classes.dex */
    public interface InterfaceC0147m {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    /* loaded from: classes.dex */
    public interface InterfaceC0148n {
        /* renamed from: a */
        boolean m848a(int i);

        /* renamed from: b */
        boolean m849b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    /* loaded from: classes.dex */
    private static class C0149o extends TouchDelegate {

        /* renamed from: a */
        private final View f891a;

        /* renamed from: b */
        private final Rect f892b;

        /* renamed from: c */
        private final Rect f893c;

        /* renamed from: d */
        private final Rect f894d;

        /* renamed from: e */
        private final int f895e;

        /* renamed from: f */
        private boolean f896f;

        public C0149o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f895e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f892b = new Rect();
            this.f894d = new Rect();
            this.f893c = new Rect();
            m850a(rect, rect2);
            this.f891a = view;
        }

        /* renamed from: a */
        public void m850a(Rect rect, Rect rect2) {
            this.f892b.set(rect);
            this.f894d.set(rect);
            Rect rect3 = this.f894d;
            int i = this.f895e;
            rect3.inset(-i, -i);
            this.f893c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float f;
            int i;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f896f;
                    if (z2 && !this.f894d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f896f;
                        this.f896f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f892b.contains(x, y)) {
                    this.f896f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.f893c.contains(x, y)) {
                Rect rect = this.f893c;
                f = x - rect.left;
                i = y - rect.top;
            } else {
                f = this.f891a.getWidth() / 2;
                i = this.f891a.getHeight() / 2;
            }
            motionEvent.setLocation(f, i);
            return this.f891a.dispatchTouchEvent(motionEvent);
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f822A = new Rect();
        this.f823B = new Rect();
        this.f824C = new int[2];
        this.f825D = new int[2];
        this.f853i0 = new RunnableC0136b();
        this.f854j0 = new RunnableC0137c();
        this.f855k0 = new WeakHashMap<>();
        this.f856l0 = new ViewOnClickListenerC0140f();
        this.f857m0 = new ViewOnKeyListenerC0141g();
        this.f858n0 = new C0142h();
        this.f859o0 = new C0143i();
        this.f860p0 = new C0144j();
        this.f862q0 = new C0135a();
        C0198t0 m1133a = C0198t0.m1133a(context, attributeSet, R$styleable.SearchView, i, 0);
        LayoutInflater.from(context).inflate(m1133a.m1151g(R$styleable.SearchView_layout, R$layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R$id.search_src_text);
        this.f861q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f863r = findViewById(R$id.search_edit_frame);
        this.f864s = findViewById(R$id.search_plate);
        this.f865t = findViewById(R$id.submit_area);
        this.f866u = (ImageView) findViewById(R$id.search_button);
        this.f867v = (ImageView) findViewById(R$id.search_go_btn);
        this.f868w = (ImageView) findViewById(R$id.search_close_btn);
        this.f869x = (ImageView) findViewById(R$id.search_voice_btn);
        this.f826E = (ImageView) findViewById(R$id.search_mag_icon);
        C3107q2.m14891a(this.f864s, m1133a.m1142b(R$styleable.SearchView_queryBackground));
        C3107q2.m14891a(this.f865t, m1133a.m1142b(R$styleable.SearchView_submitBackground));
        this.f866u.setImageDrawable(m1133a.m1142b(R$styleable.SearchView_searchIcon));
        this.f867v.setImageDrawable(m1133a.m1142b(R$styleable.SearchView_goIcon));
        this.f868w.setImageDrawable(m1133a.m1142b(R$styleable.SearchView_closeIcon));
        this.f869x.setImageDrawable(m1133a.m1142b(R$styleable.SearchView_voiceIcon));
        this.f826E.setImageDrawable(m1133a.m1142b(R$styleable.SearchView_searchIcon));
        this.f827F = m1133a.m1142b(R$styleable.SearchView_searchHintIcon);
        C0202v0.m1176a(this.f866u, getResources().getString(R$string.abc_searchview_description_search));
        this.f828G = m1133a.m1151g(R$styleable.SearchView_suggestionRowLayout, R$layout.abc_search_dropdown_item_icons_2line);
        this.f829H = m1133a.m1151g(R$styleable.SearchView_commitIcon, 0);
        this.f866u.setOnClickListener(this.f856l0);
        this.f868w.setOnClickListener(this.f856l0);
        this.f867v.setOnClickListener(this.f856l0);
        this.f869x.setOnClickListener(this.f856l0);
        this.f861q.setOnClickListener(this.f856l0);
        this.f861q.addTextChangedListener(this.f862q0);
        this.f861q.setOnEditorActionListener(this.f858n0);
        this.f861q.setOnItemClickListener(this.f859o0);
        this.f861q.setOnItemSelectedListener(this.f860p0);
        this.f861q.setOnKeyListener(this.f857m0);
        this.f861q.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0138d());
        setIconifiedByDefault(m1133a.m1139a(R$styleable.SearchView_iconifiedByDefault, true));
        int m1143c = m1133a.m1143c(R$styleable.SearchView_android_maxWidth, -1);
        if (m1143c != -1) {
            setMaxWidth(m1143c);
        }
        this.f832K = m1133a.m1148e(R$styleable.SearchView_defaultQueryHint);
        this.f842U = m1133a.m1148e(R$styleable.SearchView_queryHint);
        int m1145d = m1133a.m1145d(R$styleable.SearchView_android_imeOptions, -1);
        if (m1145d != -1) {
            setImeOptions(m1145d);
        }
        int m1145d2 = m1133a.m1145d(R$styleable.SearchView_android_inputType, -1);
        if (m1145d2 != -1) {
            setInputType(m1145d2);
        }
        setFocusable(m1133a.m1139a(R$styleable.SearchView_android_focusable, true));
        m1133a.m1138a();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f830I = intent;
        intent.addFlags(268435456);
        this.f830I.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f831J = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.f861q.getDropDownAnchor());
        this.f870y = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0139e());
        }
        m813b(this.f838Q);
        m823r();
    }

    /* renamed from: a */
    private Intent m805a(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f852h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: a */
    private Intent m806a(Cursor cursor, int i, String str) {
        int i2;
        String m1082a;
        try {
            try {
                String m1082a2 = ViewOnClickListenerC0184m0.m1082a(cursor, "suggest_intent_action");
                if (m1082a2 == null) {
                    m1082a2 = this.f851g0.getSuggestIntentAction();
                }
                if (m1082a2 == null) {
                    m1082a2 = "android.intent.action.SEARCH";
                }
                String str2 = m1082a2;
                String m1082a3 = ViewOnClickListenerC0184m0.m1082a(cursor, "suggest_intent_data");
                if (m1082a3 == null) {
                    m1082a3 = this.f851g0.getSuggestIntentData();
                }
                if (m1082a3 != null && (m1082a = ViewOnClickListenerC0184m0.m1082a(cursor, "suggest_intent_data_id")) != null) {
                    m1082a3 = m1082a3 + "/" + Uri.encode(m1082a);
                }
                return m807a(str2, m1082a3 == null ? null : Uri.parse(m1082a3), ViewOnClickListenerC0184m0.m1082a(cursor, "suggest_intent_extra_data"), ViewOnClickListenerC0184m0.m1082a(cursor, "suggest_intent_query"), i, str);
            } catch (RuntimeException unused) {
                i2 = -1;
                String str3 = "Search suggestions cursor at row " + i2 + " returned exception.";
                return null;
            }
        } catch (RuntimeException unused2) {
            i2 = cursor.getPosition();
            String str32 = "Search suggestions cursor at row " + i2 + " returned exception.";
            return null;
        }
    }

    /* renamed from: a */
    private Intent m807a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f848d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f852h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f851g0.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private void m808a(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException unused) {
            String str = "Failed launch activity: " + intent;
        }
    }

    /* renamed from: a */
    private void m809a(View view, Rect rect) {
        view.getLocationInWindow(this.f824C);
        getLocationInWindow(this.f825D);
        int[] iArr = this.f824C;
        int i = iArr[1];
        int[] iArr2 = this.f825D;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: a */
    private void m810a(boolean z) {
        this.f867v.setVisibility((this.f841T && m820o() && hasFocus() && (z || !this.f846b0)) ? 0 : 8);
    }

    /* renamed from: a */
    static boolean m811a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    private Intent m812b(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: b */
    private void m813b(boolean z) {
        this.f839R = z;
        int i = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f861q.getText());
        this.f866u.setVisibility(i);
        m810a(z2);
        this.f863r.setVisibility(z ? 8 : 0);
        this.f826E.setVisibility((this.f826E.getDrawable() == null || this.f838Q) ? 8 : 0);
        m822q();
        m816c(!z2);
        m825t();
    }

    /* renamed from: b */
    private boolean m814b(int i, int i2, String str) {
        Cursor mo11876a = this.f840S.mo11876a();
        if (mo11876a == null || !mo11876a.moveToPosition(i)) {
            return false;
        }
        m808a(m806a(mo11876a, i2, str));
        return true;
    }

    /* renamed from: c */
    private CharSequence m815c(CharSequence charSequence) {
        if (!this.f838Q || this.f827F == null) {
            return charSequence;
        }
        double textSize = this.f861q.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f827F.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f827F), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    private void m816c(boolean z) {
        int i = 8;
        if (this.f846b0 && !m835f() && z) {
            this.f867v.setVisibility(8);
            i = 0;
        }
        this.f869x.setVisibility(i);
    }

    /* renamed from: e */
    private void m817e(int i) {
        CharSequence mo1101b;
        Editable text = this.f861q.getText();
        Cursor mo11876a = this.f840S.mo11876a();
        if (mo11876a == null) {
            return;
        }
        if (!mo11876a.moveToPosition(i) || (mo1101b = this.f840S.mo1101b(mo11876a)) == null) {
            setQuery(text);
        } else {
            setQuery(mo1101b);
        }
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R$dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R$dimen.abc_search_view_preferred_width);
    }

    /* renamed from: m */
    private void m818m() {
        this.f861q.dismissDropDown();
    }

    /* renamed from: n */
    private boolean m819n() {
        SearchableInfo searchableInfo = this.f851g0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f851g0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f830I;
        } else if (this.f851g0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f831J;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: o */
    private boolean m820o() {
        return (this.f841T || this.f846b0) && !m835f();
    }

    /* renamed from: p */
    private void m821p() {
        post(this.f853i0);
    }

    /* renamed from: q */
    private void m822q() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f861q.getText());
        if (!z2 && (!this.f838Q || this.f849e0)) {
            z = false;
        }
        this.f868w.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f868w.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: r */
    private void m823r() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f861q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m815c(queryHint));
    }

    /* renamed from: s */
    private void m824s() {
        this.f861q.setThreshold(this.f851g0.getSuggestThreshold());
        this.f861q.setImeOptions(this.f851g0.getImeOptions());
        int inputType = this.f851g0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f851g0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f861q.setInputType(inputType);
        AbstractC2496g3 abstractC2496g3 = this.f840S;
        if (abstractC2496g3 != null) {
            abstractC2496g3.mo1098a((Cursor) null);
        }
        if (this.f851g0.getSuggestAuthority() != null) {
            ViewOnClickListenerC0184m0 viewOnClickListenerC0184m0 = new ViewOnClickListenerC0184m0(getContext(), this, this.f851g0, this.f855k0);
            this.f840S = viewOnClickListenerC0184m0;
            this.f861q.setAdapter(viewOnClickListenerC0184m0);
            ((ViewOnClickListenerC0184m0) this.f840S).m1097a(this.f843V ? 2 : 1);
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.f861q.setText(charSequence);
        this.f861q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: t */
    private void m825t() {
        this.f865t.setVisibility((m820o() && (this.f867v.getVisibility() == 0 || this.f869x.getVisibility() == 0)) ? 0 : 8);
    }

    @Override // p000.InterfaceC2572i
    /* renamed from: a */
    public void mo709a() {
        if (this.f849e0) {
            return;
        }
        this.f849e0 = true;
        int imeOptions = this.f861q.getImeOptions();
        this.f850f0 = imeOptions;
        this.f861q.setImeOptions(imeOptions | 33554432);
        this.f861q.setText("");
        setIconified(false);
    }

    /* renamed from: a */
    void m826a(int i, String str, String str2) {
        getContext().startActivity(m807a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m827a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: a */
    public void m828a(CharSequence charSequence, boolean z) {
        this.f861q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f861q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f848d0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m838i();
    }

    /* renamed from: a */
    boolean m829a(int i, int i2, String str) {
        InterfaceC0148n interfaceC0148n = this.f836O;
        if (interfaceC0148n != null && interfaceC0148n.m849b(i)) {
            return false;
        }
        m814b(i, 0, null);
        this.f861q.setImeVisibility(false);
        m818m();
        return true;
    }

    /* renamed from: a */
    boolean m830a(View view, int i, KeyEvent keyEvent) {
        if (this.f851g0 != null && this.f840S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m829a(this.f861q.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                this.f861q.setSelection(i == 21 ? 0 : this.f861q.length());
                this.f861q.setListSelection(0);
                this.f861q.clearListSelection();
                f821r0.m845a(this.f861q, true);
                return true;
            }
            if (i != 19 || this.f861q.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    void m831b(CharSequence charSequence) {
        Editable text = this.f861q.getText();
        this.f848d0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m810a(z);
        m816c(!z);
        m822q();
        m825t();
        if (this.f833L != null && !TextUtils.equals(charSequence, this.f847c0)) {
            this.f833L.onQueryTextChange(charSequence.toString());
        }
        this.f847c0 = charSequence.toString();
    }

    @Override // p000.InterfaceC2572i
    /* renamed from: c */
    public void mo711c() {
        m828a("", false);
        clearFocus();
        m813b(true);
        this.f861q.setImeOptions(this.f850f0);
        this.f849e0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f844W = true;
        super.clearFocus();
        this.f861q.clearFocus();
        this.f861q.setImeVisibility(false);
        this.f844W = false;
    }

    /* renamed from: d */
    void m832d() {
        if (this.f870y.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f864s.getPaddingLeft();
            Rect rect = new Rect();
            boolean m1244a = C0210z0.m1244a(this);
            int dimensionPixelSize = this.f838Q ? resources.getDimensionPixelSize(R$dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R$dimen.abc_dropdownitem_text_padding_left) : 0;
            this.f861q.getDropDownBackground().getPadding(rect);
            int i = rect.left;
            this.f861q.setDropDownHorizontalOffset(m1244a ? -i : paddingLeft - (i + dimensionPixelSize));
            this.f861q.setDropDownWidth((((this.f870y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* renamed from: d */
    boolean m833d(int i) {
        InterfaceC0148n interfaceC0148n = this.f836O;
        if (interfaceC0148n != null && interfaceC0148n.m848a(i)) {
            return false;
        }
        m817e(i);
        return true;
    }

    /* renamed from: e */
    void m834e() {
        f821r0.m846b(this.f861q);
        f821r0.m844a(this.f861q);
    }

    /* renamed from: f */
    public boolean m835f() {
        return this.f839R;
    }

    /* renamed from: g */
    void m836g() {
        if (!TextUtils.isEmpty(this.f861q.getText())) {
            this.f861q.setText("");
            this.f861q.requestFocus();
            this.f861q.setImeVisibility(true);
        } else if (this.f838Q) {
            InterfaceC0146l interfaceC0146l = this.f834M;
            if (interfaceC0146l == null || !interfaceC0146l.m847a()) {
                clearFocus();
                m813b(true);
            }
        }
    }

    public int getImeOptions() {
        return this.f861q.getImeOptions();
    }

    public int getInputType() {
        return this.f861q.getInputType();
    }

    public int getMaxWidth() {
        return this.f845a0;
    }

    public CharSequence getQuery() {
        return this.f861q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f842U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f851g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f832K : getContext().getText(this.f851g0.getHintId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f829H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f828G;
    }

    public AbstractC2496g3 getSuggestionsAdapter() {
        return this.f840S;
    }

    /* renamed from: h */
    void m837h() {
        m813b(false);
        this.f861q.requestFocus();
        this.f861q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f837P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: i */
    void m838i() {
        Editable text = this.f861q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0147m interfaceC0147m = this.f833L;
        if (interfaceC0147m == null || !interfaceC0147m.onQueryTextSubmit(text.toString())) {
            if (this.f851g0 != null) {
                m826a(0, (String) null, text.toString());
            }
            this.f861q.setImeVisibility(false);
            m818m();
        }
    }

    /* renamed from: j */
    void m839j() {
        m813b(m835f());
        m821p();
        if (this.f861q.hasFocus()) {
            m834e();
        }
    }

    /* renamed from: k */
    void m840k() {
        Intent m805a;
        SearchableInfo searchableInfo = this.f851g0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                m805a = m812b(this.f830I, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                m805a = m805a(this.f831J, searchableInfo);
            }
            getContext().startActivity(m805a);
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* renamed from: l */
    void m841l() {
        int[] iArr = this.f861q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f864s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f865t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f853i0);
        post(this.f854j0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0170f0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m809a(this.f861q, this.f822A);
            Rect rect = this.f823B;
            Rect rect2 = this.f822A;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0149o c0149o = this.f871z;
            if (c0149o != null) {
                c0149o.m850a(this.f823B, this.f822A);
                return;
            }
            C0149o c0149o2 = new C0149o(this.f823B, this.f822A, this.f861q);
            this.f871z = c0149o2;
            setTouchDelegate(c0149o2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r0 <= 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    @Override // androidx.appcompat.widget.C0170f0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.m835f()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.f845a0
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.f845a0
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.f845a0
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m1612a());
        m813b(savedState.f872d);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f872d = m835f();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m821p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.f844W || !isFocusable()) {
            return false;
        }
        if (m835f()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f861q.requestFocus(i, rect);
        if (requestFocus) {
            m813b(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f852h0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m836g();
        } else {
            m837h();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f838Q == z) {
            return;
        }
        this.f838Q = z;
        m813b(z);
        m823r();
    }

    public void setImeOptions(int i) {
        this.f861q.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f861q.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f845a0 = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0146l interfaceC0146l) {
        this.f834M = interfaceC0146l;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f835N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0147m interfaceC0147m) {
        this.f833L = interfaceC0147m;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f837P = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0148n interfaceC0148n) {
        this.f836O = interfaceC0148n;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f842U = charSequence;
        m823r();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f843V = z;
        AbstractC2496g3 abstractC2496g3 = this.f840S;
        if (abstractC2496g3 instanceof ViewOnClickListenerC0184m0) {
            ((ViewOnClickListenerC0184m0) abstractC2496g3).m1097a(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f851g0 = searchableInfo;
        if (searchableInfo != null) {
            m824s();
            m823r();
        }
        boolean m819n = m819n();
        this.f846b0 = m819n;
        if (m819n) {
            this.f861q.setPrivateImeOptions("nm");
        }
        m813b(m835f());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f841T = z;
        m813b(m835f());
    }

    public void setSuggestionsAdapter(AbstractC2496g3 abstractC2496g3) {
        this.f840S = abstractC2496g3;
        this.f861q.setAdapter(abstractC2496g3);
    }
}
