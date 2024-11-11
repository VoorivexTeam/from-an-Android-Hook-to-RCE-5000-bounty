package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0237b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.C3149r2;
import p000.InterfaceMenuC0002a1;

/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
public class C0099h implements InterfaceMenuC0002a1 {

    /* renamed from: A */
    private static final int[] f596A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f597a;

    /* renamed from: b */
    private final Resources f598b;

    /* renamed from: c */
    private boolean f599c;

    /* renamed from: d */
    private boolean f600d;

    /* renamed from: e */
    private a f601e;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f609m;

    /* renamed from: n */
    CharSequence f610n;

    /* renamed from: o */
    Drawable f611o;

    /* renamed from: p */
    View f612p;

    /* renamed from: x */
    private C0101j f620x;

    /* renamed from: z */
    private boolean f622z;

    /* renamed from: l */
    private int f608l = 0;

    /* renamed from: q */
    private boolean f613q = false;

    /* renamed from: r */
    private boolean f614r = false;

    /* renamed from: s */
    private boolean f615s = false;

    /* renamed from: t */
    private boolean f616t = false;

    /* renamed from: u */
    private boolean f617u = false;

    /* renamed from: v */
    private ArrayList<C0101j> f618v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<InterfaceC0106o>> f619w = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private boolean f621y = false;

    /* renamed from: f */
    private ArrayList<C0101j> f602f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<C0101j> f603g = new ArrayList<>();

    /* renamed from: h */
    private boolean f604h = true;

    /* renamed from: i */
    private ArrayList<C0101j> f605i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0101j> f606j = new ArrayList<>();

    /* renamed from: k */
    private boolean f607k = true;

    /* renamed from: androidx.appcompat.view.menu.h$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo401a(C0099h c0099h);

        /* renamed from: a */
        boolean mo406a(C0099h c0099h, MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.view.menu.h$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        boolean mo566a(C0101j c0101j);
    }

    public C0099h(Context context) {
        this.f597a = context;
        this.f598b = context.getResources();
        m632e(true);
    }

    /* renamed from: a */
    private static int m626a(ArrayList<C0101j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m692c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private C0101j m627a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0101j(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: a */
    private void m628a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources m674l = m674l();
        if (view != null) {
            this.f612p = view;
            this.f610n = null;
            this.f611o = null;
        } else {
            if (i > 0) {
                this.f610n = m674l.getText(i);
            } else if (charSequence != null) {
                this.f610n = charSequence;
            }
            if (i2 > 0) {
                this.f611o = C0237b.m1466c(m666e(), i2);
            } else if (drawable != null) {
                this.f611o = drawable;
            }
            this.f612p = null;
        }
        m657b(false);
    }

    /* renamed from: a */
    private void m629a(int i, boolean z) {
        if (i < 0 || i >= this.f602f.size()) {
            return;
        }
        this.f602f.remove(i);
        if (z) {
            m657b(true);
        }
    }

    /* renamed from: a */
    private boolean m630a(SubMenuC0112u subMenuC0112u, InterfaceC0106o interfaceC0106o) {
        if (this.f619w.isEmpty()) {
            return false;
        }
        boolean mo589a = interfaceC0106o != null ? interfaceC0106o.mo589a(subMenuC0112u) : false;
        Iterator<WeakReference<InterfaceC0106o>> it = this.f619w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0106o> next = it.next();
            InterfaceC0106o interfaceC0106o2 = next.get();
            if (interfaceC0106o2 == null) {
                this.f619w.remove(next);
            } else if (!mo589a) {
                mo589a = interfaceC0106o2.mo589a(subMenuC0112u);
            }
        }
        return mo589a;
    }

    /* renamed from: d */
    private void m631d(boolean z) {
        if (this.f619w.isEmpty()) {
            return;
        }
        m681s();
        Iterator<WeakReference<InterfaceC0106o>> it = this.f619w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0106o> next = it.next();
            InterfaceC0106o interfaceC0106o = next.get();
            if (interfaceC0106o == null) {
                this.f619w.remove(next);
            } else {
                interfaceC0106o.mo585a(z);
            }
        }
        m680r();
    }

    /* renamed from: e */
    private void m632e(boolean z) {
        this.f600d = z && this.f598b.getConfiguration().keyboard != 1 && C3149r2.m15173d(ViewConfiguration.get(this.f597a), this.f597a);
    }

    /* renamed from: f */
    private static int m633f(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f596A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: a */
    public int m634a(int i) {
        return m635a(i, 0);
    }

    /* renamed from: a */
    public int m635a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f602f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: a */
    protected MenuItem m636a(int i, int i2, int i3, CharSequence charSequence) {
        int m633f = m633f(i3);
        C0101j m627a = m627a(i, i2, i3, m633f, charSequence, this.f608l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f609m;
        if (contextMenuInfo != null) {
            m627a.m687a(contextMenuInfo);
        }
        ArrayList<C0101j> arrayList = this.f602f;
        arrayList.add(m626a(arrayList, m633f), m627a);
        m657b(true);
        return m627a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C0099h m637a(Drawable drawable) {
        m628a(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C0099h m638a(View view) {
        m628a(0, null, 0, null, view);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C0099h m639a(CharSequence charSequence) {
        m628a(0, charSequence, 0, null, null);
        return this;
    }

    /* renamed from: a */
    C0101j m640a(int i, KeyEvent keyEvent) {
        ArrayList<C0101j> arrayList = this.f618v;
        arrayList.clear();
        m647a(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo678p = mo678p();
        for (int i2 = 0; i2 < size; i2++) {
            C0101j c0101j = arrayList.get(i2);
            char alphabeticShortcut = mo678p ? c0101j.getAlphabeticShortcut() : c0101j.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (mo678p && alphabeticShortcut == '\b' && i == 67))) {
                return c0101j;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m641a() {
        a aVar = this.f601e;
        if (aVar != null) {
            aVar.mo401a(this);
        }
    }

    /* renamed from: a */
    public void m642a(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo664d());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0112u) item.getSubMenu()).m642a(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m643a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f602f.size();
        m681s();
        for (int i = 0; i < size; i++) {
            C0101j c0101j = this.f602f.get(i);
            if (c0101j.getGroupId() == groupId && c0101j.m701i() && c0101j.isCheckable()) {
                c0101j.m691b(c0101j == menuItem);
            }
        }
        m680r();
    }

    /* renamed from: a */
    public void mo644a(a aVar) {
        this.f601e = aVar;
    }

    /* renamed from: a */
    public void m645a(InterfaceC0106o interfaceC0106o) {
        m646a(interfaceC0106o, this.f597a);
    }

    /* renamed from: a */
    public void m646a(InterfaceC0106o interfaceC0106o, Context context) {
        this.f619w.add(new WeakReference<>(interfaceC0106o));
        interfaceC0106o.mo580a(context, this);
        this.f607k = true;
    }

    /* renamed from: a */
    void m647a(List<C0101j> list, int i, KeyEvent keyEvent) {
        boolean mo678p = mo678p();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f602f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0101j c0101j = this.f602f.get(i2);
                if (c0101j.hasSubMenu()) {
                    ((C0099h) c0101j.getSubMenu()).m647a(list, i, keyEvent);
                }
                char alphabeticShortcut = mo678p ? c0101j.getAlphabeticShortcut() : c0101j.getNumericShortcut();
                if (((modifiers & 69647) == ((mo678p ? c0101j.getAlphabeticModifiers() : c0101j.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (mo678p && alphabeticShortcut == '\b' && i == 67)) && c0101j.isEnabled()) {
                        list.add(c0101j);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m648a(boolean z) {
        if (this.f617u) {
            return;
        }
        this.f617u = true;
        Iterator<WeakReference<InterfaceC0106o>> it = this.f619w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0106o> next = it.next();
            InterfaceC0106o interfaceC0106o = next.get();
            if (interfaceC0106o == null) {
                this.f619w.remove(next);
            } else {
                interfaceC0106o.mo582a(this, z);
            }
        }
        this.f617u = false;
    }

    /* renamed from: a */
    public boolean m649a(MenuItem menuItem, int i) {
        return m650a(menuItem, (InterfaceC0106o) null, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r1 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        m648a(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if ((r9 & 1) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r1 == false) goto L17;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m650a(android.view.MenuItem r7, androidx.appcompat.view.menu.InterfaceC0106o r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.j r7 = (androidx.appcompat.view.menu.C0101j) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.m699g()
            a2 r2 = r7.mo574a()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.mo34a()
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            boolean r5 = r7.m698f()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.m648a(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.m648a(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            androidx.appcompat.view.menu.u r9 = new androidx.appcompat.view.menu.u
            android.content.Context r0 = r6.m666e()
            r9.<init>(r0, r6, r7)
            r7.m688a(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.u r7 = (androidx.appcompat.view.menu.SubMenuC0112u) r7
            if (r4 == 0) goto L63
            r2.mo33a(r7)
        L63:
            boolean r7 = r6.m630a(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0099h.m650a(android.view.MenuItem, androidx.appcompat.view.menu.o, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo651a(C0099h c0099h, MenuItem menuItem) {
        a aVar = this.f601e;
        return aVar != null && aVar.mo406a(c0099h, menuItem);
    }

    /* renamed from: a */
    public boolean mo652a(C0101j c0101j) {
        boolean z = false;
        if (!this.f619w.isEmpty() && this.f620x == c0101j) {
            m681s();
            Iterator<WeakReference<InterfaceC0106o>> it = this.f619w.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0106o> next = it.next();
                InterfaceC0106o interfaceC0106o = next.get();
                if (interfaceC0106o == null) {
                    this.f619w.remove(next);
                } else {
                    z = interfaceC0106o.mo588a(this, c0101j);
                    if (z) {
                        break;
                    }
                }
            }
            m680r();
            if (z) {
                this.f620x = null;
            }
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m636a(0, 0, 0, this.f598b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m636a(i, i2, i3, this.f598b.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m636a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m636a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f597a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f598b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f598b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0101j c0101j = (C0101j) m636a(i, i2, i3, charSequence);
        SubMenuC0112u subMenuC0112u = new SubMenuC0112u(this.f597a, this, c0101j);
        c0101j.m688a(subMenuC0112u);
        return subMenuC0112u;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public int m653b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f602f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void m654b() {
        ArrayList<C0101j> m676n = m676n();
        if (this.f607k) {
            Iterator<WeakReference<InterfaceC0106o>> it = this.f619w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0106o> next = it.next();
                InterfaceC0106o interfaceC0106o = next.get();
                if (interfaceC0106o == null) {
                    this.f619w.remove(next);
                } else {
                    z |= interfaceC0106o.mo614c();
                }
            }
            if (z) {
                this.f605i.clear();
                this.f606j.clear();
                int size = m676n.size();
                for (int i = 0; i < size; i++) {
                    C0101j c0101j = m676n.get(i);
                    (c0101j.m700h() ? this.f605i : this.f606j).add(c0101j);
                }
            } else {
                this.f605i.clear();
                this.f606j.clear();
                this.f606j.addAll(m676n());
            }
            this.f607k = false;
        }
    }

    /* renamed from: b */
    public void m655b(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0112u) item.getSubMenu()).m655b(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo664d(), sparseArray);
        }
    }

    /* renamed from: b */
    public void m656b(InterfaceC0106o interfaceC0106o) {
        Iterator<WeakReference<InterfaceC0106o>> it = this.f619w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0106o> next = it.next();
            InterfaceC0106o interfaceC0106o2 = next.get();
            if (interfaceC0106o2 == null || interfaceC0106o2 == interfaceC0106o) {
                this.f619w.remove(next);
            }
        }
    }

    /* renamed from: b */
    public void m657b(boolean z) {
        if (this.f613q) {
            this.f614r = true;
            if (z) {
                this.f615s = true;
                return;
            }
            return;
        }
        if (z) {
            this.f604h = true;
            this.f607k = true;
        }
        m631d(z);
    }

    /* renamed from: b */
    public boolean mo658b(C0101j c0101j) {
        boolean z = false;
        if (this.f619w.isEmpty()) {
            return false;
        }
        m681s();
        Iterator<WeakReference<InterfaceC0106o>> it = this.f619w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0106o> next = it.next();
            InterfaceC0106o interfaceC0106o = next.get();
            if (interfaceC0106o == null) {
                this.f619w.remove(next);
            } else {
                z = interfaceC0106o.mo591b(this, c0101j);
                if (z) {
                    break;
                }
            }
        }
        m680r();
        if (z) {
            this.f620x = c0101j;
        }
        return z;
    }

    /* renamed from: c */
    public C0099h m659c(int i) {
        this.f608l = i;
        return this;
    }

    /* renamed from: c */
    public ArrayList<C0101j> m660c() {
        m654b();
        return this.f605i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m661c(C0101j c0101j) {
        this.f607k = true;
        m657b(true);
    }

    /* renamed from: c */
    public void m662c(boolean z) {
        this.f622z = z;
    }

    @Override // android.view.Menu
    public void clear() {
        C0101j c0101j = this.f620x;
        if (c0101j != null) {
            mo652a(c0101j);
        }
        this.f602f.clear();
        m657b(true);
    }

    public void clearHeader() {
        this.f611o = null;
        this.f610n = null;
        this.f612p = null;
        m657b(false);
    }

    @Override // android.view.Menu
    public void close() {
        m648a(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public C0099h m663d(int i) {
        m628a(0, null, i, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public String mo664d() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m665d(C0101j c0101j) {
        this.f604h = true;
        m657b(true);
    }

    /* renamed from: e */
    public Context m666e() {
        return this.f597a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public C0099h m667e(int i) {
        m628a(i, null, 0, null, null);
        return this;
    }

    /* renamed from: f */
    public C0101j m668f() {
        return this.f620x;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0101j c0101j = this.f602f.get(i2);
            if (c0101j.getItemId() == i) {
                return c0101j;
            }
            if (c0101j.hasSubMenu() && (findItem = c0101j.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public Drawable m669g() {
        return this.f611o;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f602f.get(i);
    }

    /* renamed from: h */
    public CharSequence m670h() {
        return this.f610n;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f622z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f602f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public View m671i() {
        return this.f612p;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m640a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public ArrayList<C0101j> m672j() {
        m654b();
        return this.f606j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean m673k() {
        return this.f616t;
    }

    /* renamed from: l */
    Resources m674l() {
        return this.f598b;
    }

    /* renamed from: m */
    public C0099h mo675m() {
        return this;
    }

    /* renamed from: n */
    public ArrayList<C0101j> m676n() {
        if (!this.f604h) {
            return this.f603g;
        }
        this.f603g.clear();
        int size = this.f602f.size();
        for (int i = 0; i < size; i++) {
            C0101j c0101j = this.f602f.get(i);
            if (c0101j.isVisible()) {
                this.f603g.add(c0101j);
            }
        }
        this.f604h = false;
        this.f607k = true;
        return this.f603g;
    }

    /* renamed from: o */
    public boolean mo677o() {
        return this.f621y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo678p() {
        return this.f599c;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m649a(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0101j m640a = m640a(i, keyEvent);
        boolean m649a = m640a != null ? m649a(m640a, i2) : false;
        if ((i2 & 2) != 0) {
            m648a(true);
        }
        return m649a;
    }

    /* renamed from: q */
    public boolean mo679q() {
        return this.f600d;
    }

    /* renamed from: r */
    public void m680r() {
        this.f613q = false;
        if (this.f614r) {
            this.f614r = false;
            m657b(this.f615s);
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int m634a = m634a(i);
        if (m634a >= 0) {
            int size = this.f602f.size() - m634a;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f602f.get(m634a).getGroupId() != i) {
                    break;
                }
                m629a(m634a, false);
                i2 = i3;
            }
            m657b(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m629a(m653b(i), true);
    }

    /* renamed from: s */
    public void m681s() {
        if (this.f613q) {
            return;
        }
        this.f613q = true;
        this.f614r = false;
        this.f615s = false;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f602f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0101j c0101j = this.f602f.get(i2);
            if (c0101j.getGroupId() == i) {
                c0101j.m693c(z2);
                c0101j.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f621y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f602f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0101j c0101j = this.f602f.get(i2);
            if (c0101j.getGroupId() == i) {
                c0101j.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f602f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0101j c0101j = this.f602f.get(i2);
            if (c0101j.getGroupId() == i && c0101j.m697e(z)) {
                z2 = true;
            }
        }
        if (z2) {
            m657b(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f599c = z;
        m657b(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f602f.size();
    }
}
