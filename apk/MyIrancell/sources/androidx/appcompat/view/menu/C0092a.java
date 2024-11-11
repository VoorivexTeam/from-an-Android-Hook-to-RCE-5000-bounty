package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0237b;
import androidx.core.graphics.drawable.C0239a;
import p000.AbstractC0003a2;
import p000.InterfaceMenuItemC0446b1;

/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public class C0092a implements InterfaceMenuItemC0446b1 {

    /* renamed from: a */
    private final int f511a;

    /* renamed from: b */
    private final int f512b;

    /* renamed from: c */
    private final int f513c;

    /* renamed from: d */
    private CharSequence f514d;

    /* renamed from: e */
    private CharSequence f515e;

    /* renamed from: f */
    private Intent f516f;

    /* renamed from: g */
    private char f517g;

    /* renamed from: i */
    private char f519i;

    /* renamed from: k */
    private Drawable f521k;

    /* renamed from: l */
    private Context f522l;

    /* renamed from: m */
    private CharSequence f523m;

    /* renamed from: n */
    private CharSequence f524n;

    /* renamed from: h */
    private int f518h = 4096;

    /* renamed from: j */
    private int f520j = 4096;

    /* renamed from: o */
    private ColorStateList f525o = null;

    /* renamed from: p */
    private PorterDuff.Mode f526p = null;

    /* renamed from: q */
    private boolean f527q = false;

    /* renamed from: r */
    private boolean f528r = false;

    /* renamed from: s */
    private int f529s = 16;

    public C0092a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f522l = context;
        this.f511a = i2;
        this.f512b = i;
        this.f513c = i4;
        this.f514d = charSequence;
    }

    /* renamed from: b */
    private void m573b() {
        if (this.f521k != null) {
            if (this.f527q || this.f528r) {
                Drawable m1495i = C0239a.m1495i(this.f521k);
                this.f521k = m1495i;
                Drawable mutate = m1495i.mutate();
                this.f521k = mutate;
                if (this.f527q) {
                    C0239a.m1480a(mutate, this.f525o);
                }
                if (this.f528r) {
                    C0239a.m1483a(this.f521k, this.f526p);
                }
            }
        }
    }

    @Override // p000.InterfaceMenuItemC0446b1
    /* renamed from: a */
    public AbstractC0003a2 mo574a() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC0446b1
    /* renamed from: a */
    public InterfaceMenuItemC0446b1 mo575a(AbstractC0003a2 abstractC0003a2) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f520j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f519i;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f523m;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f512b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f521k;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f525o;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f526p;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f516f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f511a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f518h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f517g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f513c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f514d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f515e;
        return charSequence != null ? charSequence : this.f514d;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f524n;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f529s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f529s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f529s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f529s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        setActionView(i);
        throw null;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        setActionView(view);
        throw null;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public InterfaceMenuItemC0446b1 setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public InterfaceMenuItemC0446b1 setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f519i = Character.toLowerCase(c);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f519i = Character.toLowerCase(c);
        this.f520j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f529s = (z ? 1 : 0) | (this.f529s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f529s = (z ? 2 : 0) | (this.f529s & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public InterfaceMenuItemC0446b1 setContentDescription(CharSequence charSequence) {
        this.f523m = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f529s = (z ? 16 : 0) | (this.f529s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f521k = C0237b.m1466c(this.f522l, i);
        m573b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f521k = drawable;
        m573b();
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f525o = colorStateList;
        this.f527q = true;
        m573b();
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f526p = mode;
        this.f528r = true;
        m573b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f516f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f517g = c;
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f517g = c;
        this.f518h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f517g = c;
        this.f519i = Character.toLowerCase(c2);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f517g = c;
        this.f518h = KeyEvent.normalizeMetaState(i);
        this.f519i = Character.toLowerCase(c2);
        this.f520j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public void setShowAsAction(int i) {
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
        this.f514d = this.f522l.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f514d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f515e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // p000.InterfaceMenuItemC0446b1, android.view.MenuItem
    public InterfaceMenuItemC0446b1 setTooltipText(CharSequence charSequence) {
        this.f524n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f529s = (this.f529s & 8) | (z ? 0 : 8);
        return this;
    }
}
