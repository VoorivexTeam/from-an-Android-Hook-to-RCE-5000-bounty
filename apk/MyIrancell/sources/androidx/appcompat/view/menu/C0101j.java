package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.R$string;
import androidx.appcompat.view.menu.InterfaceC0107p;
import androidx.core.graphics.drawable.C0239a;
import p000.AbstractC0003a2;
import p000.C0000a;
import p000.InterfaceMenuItemC0446b1;

/* renamed from: androidx.appcompat.view.menu.j */
/* loaded from: classes.dex */
public final class C0101j implements InterfaceMenuItemC0446b1 {

    /* renamed from: A */
    private View f627A;

    /* renamed from: B */
    private AbstractC0003a2 f628B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f629C;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f631E;

    /* renamed from: a */
    private final int f632a;

    /* renamed from: b */
    private final int f633b;

    /* renamed from: c */
    private final int f634c;

    /* renamed from: d */
    private final int f635d;

    /* renamed from: e */
    private CharSequence f636e;

    /* renamed from: f */
    private CharSequence f637f;

    /* renamed from: g */
    private Intent f638g;

    /* renamed from: h */
    private char f639h;

    /* renamed from: j */
    private char f641j;

    /* renamed from: l */
    private Drawable f643l;

    /* renamed from: n */
    C0099h f645n;

    /* renamed from: o */
    private SubMenuC0112u f646o;

    /* renamed from: p */
    private Runnable f647p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f648q;

    /* renamed from: r */
    private CharSequence f649r;

    /* renamed from: s */
    private CharSequence f650s;

    /* renamed from: z */
    private int f657z;

    /* renamed from: i */
    private int f640i = 4096;

    /* renamed from: k */
    private int f642k = 4096;

    /* renamed from: m */
    private int f644m = 0;

    /* renamed from: t */
    private ColorStateList f651t = null;

    /* renamed from: u */
    private PorterDuff.Mode f652u = null;

    /* renamed from: v */
    private boolean f653v = false;

    /* renamed from: w */
    private boolean f654w = false;

    /* renamed from: x */
    private boolean f655x = false;

    /* renamed from: y */
    private int f656y = 16;

    /* renamed from: D */
    private boolean f630D = false;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    /* loaded from: classes.dex */
    class a implements AbstractC0003a2.b {
        a() {
        }

        @Override // p000.AbstractC0003a2.b
        public void onActionProviderVisibilityChanged(boolean z) {
            C0101j c0101j = C0101j.this;
            c0101j.f645n.m665d(c0101j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0101j(C0099h c0099h, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f657z = 0;
        this.f645n = c0099h;
        this.f632a = i2;
        this.f633b = i;
        this.f634c = i3;
        this.f635d = i4;
        this.f636e = charSequence;
        this.f657z = i5;
    }

    /* renamed from: a */
    private Drawable m684a(Drawable drawable) {
        if (drawable != null && this.f655x && (this.f653v || this.f654w)) {
            drawable = C0239a.m1495i(drawable).mutate();
            if (this.f653v) {
                C0239a.m1480a(drawable, this.f651t);
            }
            if (this.f654w) {
                C0239a.m1483a(drawable, this.f652u);
            }
            this.f655x = false;
        }
        return drawable;
    }

    /* renamed from: a */
    private static void m685a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p000.InterfaceMenuItemC0446b1
    /* renamed from: a */
    public AbstractC0003a2 mo574a() {
        return this.f628B;
    }

    @Override // p000.InterfaceMenuItemC0446b1
    /* renamed from: a */
    public InterfaceMenuItemC0446b1 mo575a(AbstractC0003a2 abstractC0003a2) {
        AbstractC0003a2 abstractC0003a22 = this.f628B;
        if (abstractC0003a22 != null) {
            abstractC0003a22.m39f();
        }
        this.f627A = null;
        this.f628B = abstractC0003a2;
        this.f645n.m657b(true);
        AbstractC0003a2 abstractC0003a23 = this.f628B;
        if (abstractC0003a23 != null) {
            abstractC0003a23.mo32a(new a());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence m686a(InterfaceC0107p.a aVar) {
        return (aVar == null || !aVar.mo559b()) ? getTitle() : getTitleCondensed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m687a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f631E = contextMenuInfo;
    }

    /* renamed from: a */
    public void m688a(SubMenuC0112u subMenuC0112u) {
        this.f646o = subMenuC0112u;
        subMenuC0112u.setHeaderTitle(getTitle());
    }

    /* renamed from: a */
    public void m689a(boolean z) {
        this.f630D = z;
        this.f645n.m657b(false);
    }

    /* renamed from: b */
    public void m690b() {
        this.f645n.m661c(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m691b(boolean z) {
        int i = this.f656y;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f656y = i2;
        if (i != i2) {
            this.f645n.m657b(false);
        }
    }

    /* renamed from: c */
    public int m692c() {
        return this.f635d;
    }

    /* renamed from: c */
    public void m693c(boolean z) {
        this.f656y = (z ? 4 : 0) | (this.f656y & (-5));
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f657z & 8) == 0) {
            return false;
        }
        if (this.f627A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f629C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f645n.mo652a(this);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public char m694d() {
        return this.f645n.mo678p() ? this.f641j : this.f639h;
    }

    /* renamed from: d */
    public void m695d(boolean z) {
        this.f656y = z ? this.f656y | 32 : this.f656y & (-33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m696e() {
        int i;
        char m694d = m694d();
        if (m694d == 0) {
            return "";
        }
        Resources resources = this.f645n.m666e().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f645n.m666e()).hasPermanentMenuKey()) {
            sb.append(resources.getString(R$string.abc_prepend_shortcut_label));
        }
        int i2 = this.f645n.mo678p() ? this.f642k : this.f640i;
        m685a(sb, i2, 65536, resources.getString(R$string.abc_menu_meta_shortcut_label));
        m685a(sb, i2, 4096, resources.getString(R$string.abc_menu_ctrl_shortcut_label));
        m685a(sb, i2, 2, resources.getString(R$string.abc_menu_alt_shortcut_label));
        m685a(sb, i2, 1, resources.getString(R$string.abc_menu_shift_shortcut_label));
        m685a(sb, i2, 4, resources.getString(R$string.abc_menu_sym_shortcut_label));
        m685a(sb, i2, 8, resources.getString(R$string.abc_menu_function_shortcut_label));
        if (m694d == '\b') {
            i = R$string.abc_menu_delete_shortcut_label;
        } else if (m694d == '\n') {
            i = R$string.abc_menu_enter_shortcut_label;
        } else {
            if (m694d != ' ') {
                sb.append(m694d);
                return sb.toString();
            }
            i = R$string.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m697e(boolean z) {
        int i = this.f656y;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f656y = i2;
        return i != i2;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public boolean expandActionView() {
        if (!m698f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f629C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f645n.mo658b(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m698f() {
        AbstractC0003a2 abstractC0003a2;
        if ((this.f657z & 8) == 0) {
            return false;
        }
        if (this.f627A == null && (abstractC0003a2 = this.f628B) != null) {
            this.f627A = abstractC0003a2.mo30a(this);
        }
        return this.f627A != null;
    }

    /* renamed from: g */
    public boolean m699g() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f648q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0099h c0099h = this.f645n;
        if (c0099h.mo651a(c0099h, this)) {
            return true;
        }
        Runnable runnable = this.f647p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f638g != null) {
            try {
                this.f645n.m666e().startActivity(this.f638g);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        AbstractC0003a2 abstractC0003a2 = this.f628B;
        return abstractC0003a2 != null && abstractC0003a2.mo37d();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public View getActionView() {
        View view = this.f627A;
        if (view != null) {
            return view;
        }
        AbstractC0003a2 abstractC0003a2 = this.f628B;
        if (abstractC0003a2 == null) {
            return null;
        }
        View mo30a = abstractC0003a2.mo30a(this);
        this.f627A = mo30a;
        return mo30a;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f642k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f641j;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f649r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f633b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f643l;
        if (drawable != null) {
            return m684a(drawable);
        }
        if (this.f644m == 0) {
            return null;
        }
        Drawable m4c = C0000a.m4c(this.f645n.m666e(), this.f644m);
        this.f644m = 0;
        this.f643l = m4c;
        return m684a(m4c);
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f651t;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f652u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f638g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f632a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f631E;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f640i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f639h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f634c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f646o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f636e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f637f;
        if (charSequence == null) {
            charSequence = this.f636e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f650s;
    }

    /* renamed from: h */
    public boolean m700h() {
        return (this.f656y & 32) == 32;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f646o != null;
    }

    /* renamed from: i */
    public boolean m701i() {
        return (this.f656y & 4) != 0;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f630D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f656y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f656y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f656y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0003a2 abstractC0003a2 = this.f628B;
        return (abstractC0003a2 == null || !abstractC0003a2.mo38e()) ? (this.f656y & 8) == 0 : (this.f656y & 8) == 0 && this.f628B.mo35b();
    }

    /* renamed from: j */
    public boolean m702j() {
        return (this.f657z & 1) == 1;
    }

    /* renamed from: k */
    public boolean m703k() {
        return (this.f657z & 2) == 2;
    }

    /* renamed from: l */
    public boolean m704l() {
        return this.f645n.m673k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean m705m() {
        return this.f645n.mo679q() && m694d() != 0;
    }

    /* renamed from: n */
    public boolean m706n() {
        return (this.f657z & 4) == 4;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        setActionView(i);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        setActionView(view);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public InterfaceMenuItemC0446b1 setActionView(int i) {
        Context m666e = this.f645n.m666e();
        setActionView(LayoutInflater.from(m666e).inflate(i, (ViewGroup) new LinearLayout(m666e), false));
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public InterfaceMenuItemC0446b1 setActionView(View view) {
        int i;
        this.f627A = view;
        this.f628B = null;
        if (view != null && view.getId() == -1 && (i = this.f632a) > 0) {
            view.setId(i);
        }
        this.f645n.m661c(this);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f641j == c) {
            return this;
        }
        this.f641j = Character.toLowerCase(c);
        this.f645n.m657b(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f641j == c && this.f642k == i) {
            return this;
        }
        this.f641j = Character.toLowerCase(c);
        this.f642k = KeyEvent.normalizeMetaState(i);
        this.f645n.m657b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f656y;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f656y = i2;
        if (i != i2) {
            this.f645n.m657b(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f656y & 4) != 0) {
            this.f645n.m643a((MenuItem) this);
        } else {
            m691b(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public InterfaceMenuItemC0446b1 setContentDescription(CharSequence charSequence) {
        this.f649r = charSequence;
        this.f645n.m657b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f656y = z ? this.f656y | 16 : this.f656y & (-17);
        this.f645n.m657b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f643l = null;
        this.f644m = i;
        this.f655x = true;
        this.f645n.m657b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f644m = 0;
        this.f643l = drawable;
        this.f655x = true;
        this.f645n.m657b(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f651t = colorStateList;
        this.f653v = true;
        this.f655x = true;
        this.f645n.m657b(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f652u = mode;
        this.f654w = true;
        this.f655x = true;
        this.f645n.m657b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f638g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f639h == c) {
            return this;
        }
        this.f639h = c;
        this.f645n.m657b(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f639h == c && this.f640i == i) {
            return this;
        }
        this.f639h = c;
        this.f640i = KeyEvent.normalizeMetaState(i);
        this.f645n.m657b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f629C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f648q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f639h = c;
        this.f641j = Character.toLowerCase(c2);
        this.f645n.m657b(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f639h = c;
        this.f640i = KeyEvent.normalizeMetaState(i);
        this.f641j = Character.toLowerCase(c2);
        this.f642k = KeyEvent.normalizeMetaState(i2);
        this.f645n.m657b(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f657z = i;
        this.f645n.m661c(this);
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsActionFlags(i);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public InterfaceMenuItemC0446b1 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.f645n.m666e().getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f636e = charSequence;
        this.f645n.m657b(false);
        SubMenuC0112u subMenuC0112u = this.f646o;
        if (subMenuC0112u != null) {
            subMenuC0112u.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f637f = charSequence;
        this.f645n.m657b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public InterfaceMenuItemC0446b1 setTooltipText(CharSequence charSequence) {
        this.f650s = charSequence;
        this.f645n.m657b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m697e(z)) {
            this.f645n.m665d(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f636e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
