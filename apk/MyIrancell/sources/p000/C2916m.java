package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.C0101j;
import androidx.appcompat.view.menu.MenuItemC0102k;
import androidx.appcompat.widget.C0162b0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: m */
/* loaded from: classes.dex */
public class C2916m extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f11932e;

    /* renamed from: f */
    static final Class<?>[] f11933f;

    /* renamed from: a */
    final Object[] f11934a;

    /* renamed from: b */
    final Object[] f11935b;

    /* renamed from: c */
    Context f11936c;

    /* renamed from: d */
    private Object f11937d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m$a */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f11938c = {MenuItem.class};

        /* renamed from: a */
        private Object f11939a;

        /* renamed from: b */
        private Method f11940b;

        public a(Object obj, String str) {
            this.f11939a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f11940b = cls.getMethod(str, f11938c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f11940b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f11940b.invoke(this.f11939a, menuItem)).booleanValue();
                }
                this.f11940b.invoke(this.f11939a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m$b */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: A */
        AbstractC0003a2 f11941A;

        /* renamed from: B */
        private CharSequence f11942B;

        /* renamed from: C */
        private CharSequence f11943C;

        /* renamed from: D */
        private ColorStateList f11944D = null;

        /* renamed from: E */
        private PorterDuff.Mode f11945E = null;

        /* renamed from: a */
        private Menu f11947a;

        /* renamed from: b */
        private int f11948b;

        /* renamed from: c */
        private int f11949c;

        /* renamed from: d */
        private int f11950d;

        /* renamed from: e */
        private int f11951e;

        /* renamed from: f */
        private boolean f11952f;

        /* renamed from: g */
        private boolean f11953g;

        /* renamed from: h */
        private boolean f11954h;

        /* renamed from: i */
        private int f11955i;

        /* renamed from: j */
        private int f11956j;

        /* renamed from: k */
        private CharSequence f11957k;

        /* renamed from: l */
        private CharSequence f11958l;

        /* renamed from: m */
        private int f11959m;

        /* renamed from: n */
        private char f11960n;

        /* renamed from: o */
        private int f11961o;

        /* renamed from: p */
        private char f11962p;

        /* renamed from: q */
        private int f11963q;

        /* renamed from: r */
        private int f11964r;

        /* renamed from: s */
        private boolean f11965s;

        /* renamed from: t */
        private boolean f11966t;

        /* renamed from: u */
        private boolean f11967u;

        /* renamed from: v */
        private int f11968v;

        /* renamed from: w */
        private int f11969w;

        /* renamed from: x */
        private String f11970x;

        /* renamed from: y */
        private String f11971y;

        /* renamed from: z */
        private String f11972z;

        public b(Menu menu) {
            this.f11947a = menu;
            m13958d();
        }

        /* renamed from: a */
        private char m13950a(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private <T> T m13951a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = C2916m.this.f11936c.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                String str2 = "Cannot instantiate class: " + str;
                return null;
            }
        }

        /* renamed from: a */
        private void m13952a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f11965s).setVisible(this.f11966t).setEnabled(this.f11967u).setCheckable(this.f11964r >= 1).setTitleCondensed(this.f11958l).setIcon(this.f11959m);
            int i = this.f11968v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f11972z != null) {
                if (C2916m.this.f11936c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(C2916m.this.m13949a(), this.f11972z));
            }
            boolean z2 = menuItem instanceof C0101j;
            if (z2) {
            }
            if (this.f11964r >= 2) {
                if (z2) {
                    ((C0101j) menuItem).m693c(true);
                } else if (menuItem instanceof MenuItemC0102k) {
                    ((MenuItemC0102k) menuItem).m708a(true);
                }
            }
            String str = this.f11970x;
            if (str != null) {
                menuItem.setActionView((View) m13951a(str, C2916m.f11932e, C2916m.this.f11934a));
                z = true;
            }
            int i2 = this.f11969w;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            AbstractC0003a2 abstractC0003a2 = this.f11941A;
            if (abstractC0003a2 != null) {
                C2454f2.m11661a(menuItem, abstractC0003a2);
            }
            C2454f2.m11665a(menuItem, this.f11942B);
            C2454f2.m11667b(menuItem, this.f11943C);
            C2454f2.m11662a(menuItem, this.f11960n, this.f11961o);
            C2454f2.m11666b(menuItem, this.f11962p, this.f11963q);
            PorterDuff.Mode mode = this.f11945E;
            if (mode != null) {
                C2454f2.m11664a(menuItem, mode);
            }
            ColorStateList colorStateList = this.f11944D;
            if (colorStateList != null) {
                C2454f2.m11663a(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void m13953a() {
            this.f11954h = true;
            m13952a(this.f11947a.add(this.f11948b, this.f11955i, this.f11956j, this.f11957k));
        }

        /* renamed from: a */
        public void m13954a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C2916m.this.f11936c.obtainStyledAttributes(attributeSet, R$styleable.MenuGroup);
            this.f11948b = obtainStyledAttributes.getResourceId(R$styleable.MenuGroup_android_id, 0);
            this.f11949c = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_menuCategory, 0);
            this.f11950d = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_orderInCategory, 0);
            this.f11951e = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_checkableBehavior, 0);
            this.f11952f = obtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_visible, true);
            this.f11953g = obtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public SubMenu m13955b() {
            this.f11954h = true;
            SubMenu addSubMenu = this.f11947a.addSubMenu(this.f11948b, this.f11955i, this.f11956j, this.f11957k);
            m13952a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m13956b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C2916m.this.f11936c.obtainStyledAttributes(attributeSet, R$styleable.MenuItem);
            this.f11955i = obtainStyledAttributes.getResourceId(R$styleable.MenuItem_android_id, 0);
            this.f11956j = (obtainStyledAttributes.getInt(R$styleable.MenuItem_android_menuCategory, this.f11949c) & (-65536)) | (obtainStyledAttributes.getInt(R$styleable.MenuItem_android_orderInCategory, this.f11950d) & 65535);
            this.f11957k = obtainStyledAttributes.getText(R$styleable.MenuItem_android_title);
            this.f11958l = obtainStyledAttributes.getText(R$styleable.MenuItem_android_titleCondensed);
            this.f11959m = obtainStyledAttributes.getResourceId(R$styleable.MenuItem_android_icon, 0);
            this.f11960n = m13950a(obtainStyledAttributes.getString(R$styleable.MenuItem_android_alphabeticShortcut));
            this.f11961o = obtainStyledAttributes.getInt(R$styleable.MenuItem_alphabeticModifiers, 4096);
            this.f11962p = m13950a(obtainStyledAttributes.getString(R$styleable.MenuItem_android_numericShortcut));
            this.f11963q = obtainStyledAttributes.getInt(R$styleable.MenuItem_numericModifiers, 4096);
            this.f11964r = obtainStyledAttributes.hasValue(R$styleable.MenuItem_android_checkable) ? obtainStyledAttributes.getBoolean(R$styleable.MenuItem_android_checkable, false) : this.f11951e;
            this.f11965s = obtainStyledAttributes.getBoolean(R$styleable.MenuItem_android_checked, false);
            this.f11966t = obtainStyledAttributes.getBoolean(R$styleable.MenuItem_android_visible, this.f11952f);
            this.f11967u = obtainStyledAttributes.getBoolean(R$styleable.MenuItem_android_enabled, this.f11953g);
            this.f11968v = obtainStyledAttributes.getInt(R$styleable.MenuItem_showAsAction, -1);
            this.f11972z = obtainStyledAttributes.getString(R$styleable.MenuItem_android_onClick);
            this.f11969w = obtainStyledAttributes.getResourceId(R$styleable.MenuItem_actionLayout, 0);
            this.f11970x = obtainStyledAttributes.getString(R$styleable.MenuItem_actionViewClass);
            String string = obtainStyledAttributes.getString(R$styleable.MenuItem_actionProviderClass);
            this.f11971y = string;
            if ((string != null) && this.f11969w == 0 && this.f11970x == null) {
                this.f11941A = (AbstractC0003a2) m13951a(this.f11971y, C2916m.f11933f, C2916m.this.f11935b);
            } else {
                this.f11941A = null;
            }
            this.f11942B = obtainStyledAttributes.getText(R$styleable.MenuItem_contentDescription);
            this.f11943C = obtainStyledAttributes.getText(R$styleable.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(R$styleable.MenuItem_iconTintMode)) {
                this.f11945E = C0162b0.m921a(obtainStyledAttributes.getInt(R$styleable.MenuItem_iconTintMode, -1), this.f11945E);
            } else {
                this.f11945E = null;
            }
            if (obtainStyledAttributes.hasValue(R$styleable.MenuItem_iconTint)) {
                this.f11944D = obtainStyledAttributes.getColorStateList(R$styleable.MenuItem_iconTint);
            } else {
                this.f11944D = null;
            }
            obtainStyledAttributes.recycle();
            this.f11954h = false;
        }

        /* renamed from: c */
        public boolean m13957c() {
            return this.f11954h;
        }

        /* renamed from: d */
        public void m13958d() {
            this.f11948b = 0;
            this.f11949c = 0;
            this.f11950d = 0;
            this.f11951e = 0;
            this.f11952f = true;
            this.f11953g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f11932e = clsArr;
        f11933f = clsArr;
    }

    public C2916m(Context context) {
        super(context);
        this.f11936c = context;
        Object[] objArr = {context};
        this.f11934a = objArr;
        this.f11935b = objArr;
    }

    /* renamed from: a */
    private Object m13947a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m13947a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.m13958d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.m13957c() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r15 = r0.f11941A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r15.mo34a() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0.m13955b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r0.m13953a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r0.m13954a(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0.m13956b(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        m13948a(r13, r14, r0.m13955b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L61;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m13948a(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            m$b r0 = new m$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r4
            r6 = 0
            r7 = 0
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r4
            r7 = 0
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.m13958d()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.m13957c()
            if (r15 != 0) goto Lb9
            a2 r15 = r0.f11941A
            if (r15 == 0) goto L82
            boolean r15 = r15.mo34a()
            if (r15 == 0) goto L82
            r0.m13955b()
            goto Lb9
        L82:
            r0.m13953a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = 1
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.m13954a(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.m13956b(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.m13955b()
            r12.m13948a(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = 1
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2916m.m13948a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* renamed from: a */
    Object m13949a() {
        if (this.f11937d == null) {
            this.f11937d = m13947a(this.f11936c);
        }
        return this.f11937d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0002a1)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f11936c.getResources().getLayout(i);
                    m13948a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
