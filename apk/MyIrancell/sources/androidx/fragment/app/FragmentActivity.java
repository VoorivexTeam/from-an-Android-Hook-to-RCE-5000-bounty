package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.app.C0223a;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.AbstractC0299e;
import androidx.lifecycle.C0312r;
import androidx.lifecycle.InterfaceC0313s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000.AbstractC3150r3;
import p000.C2795j0;

/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements InterfaceC0313s, C0223a.b, C0223a.d {

    /* renamed from: e */
    private C0312r f1662e;

    /* renamed from: f */
    boolean f1663f;

    /* renamed from: g */
    boolean f1664g;

    /* renamed from: i */
    boolean f1666i;

    /* renamed from: j */
    boolean f1667j;

    /* renamed from: k */
    boolean f1668k;

    /* renamed from: l */
    int f1669l;

    /* renamed from: m */
    C2795j0<String> f1670m;

    /* renamed from: c */
    final Handler f1660c = new HandlerC0271a();

    /* renamed from: d */
    final C0280d f1661d = C0280d.m1778a(new C0272b());

    /* renamed from: h */
    boolean f1665h = true;

    /* renamed from: androidx.fragment.app.FragmentActivity$a */
    /* loaded from: classes.dex */
    class HandlerC0271a extends Handler {
        HandlerC0271a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
            } else {
                FragmentActivity.this.m1740g();
                FragmentActivity.this.f1661d.m1799i();
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentActivity$b */
    /* loaded from: classes.dex */
    class C0272b extends AbstractC0281e<FragmentActivity> {
        public C0272b() {
            super(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.AbstractC0279c
        /* renamed from: a */
        public View mo1725a(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // androidx.fragment.app.AbstractC0281e
        /* renamed from: a */
        public void mo1742a(Fragment fragment) {
            FragmentActivity.this.m1735a(fragment);
        }

        @Override // androidx.fragment.app.AbstractC0281e
        /* renamed from: a */
        public void mo1743a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            FragmentActivity.this.m1736a(fragment, intent, i, bundle);
        }

        @Override // androidx.fragment.app.AbstractC0281e
        /* renamed from: a */
        public void mo1744a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC0279c
        /* renamed from: a */
        public boolean mo1727a() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.AbstractC0281e
        /* renamed from: b */
        public boolean mo1745b(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.AbstractC0281e
        /* renamed from: f */
        public LayoutInflater mo1746f() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.AbstractC0281e
        /* renamed from: g */
        public int mo1747g() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.AbstractC0281e
        /* renamed from: h */
        public boolean mo1748h() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.AbstractC0281e
        /* renamed from: i */
        public void mo1749i() {
            FragmentActivity.this.mo363i();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentActivity$c */
    /* loaded from: classes.dex */
    static final class C0273c {

        /* renamed from: a */
        Object f1673a;

        /* renamed from: b */
        C0312r f1674b;

        /* renamed from: c */
        C0284h f1675c;

        C0273c() {
        }
    }

    /* renamed from: a */
    private static boolean m1730a(AbstractC0282f abstractC0282f, AbstractC0299e.b bVar) {
        boolean z = false;
        for (Fragment fragment : abstractC0282f.mo1813b()) {
            if (fragment != null) {
                if (fragment.mo1356a().mo2035a().isAtLeast(AbstractC0299e.b.STARTED)) {
                    fragment.f1608T.m2051a(bVar);
                    z = true;
                }
                AbstractC0282f m1637U = fragment.m1637U();
                if (m1637U != null) {
                    z |= m1730a(m1637U, bVar);
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    private int m1731b(Fragment fragment) {
        if (this.f1670m.m13280b() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.f1670m.m13283c(this.f1669l) >= 0) {
            this.f1669l = (this.f1669l + 1) % 65534;
        }
        int i = this.f1669l;
        this.f1670m.m13284c(i, fragment.f1617g);
        this.f1669l = (this.f1669l + 1) % 65534;
        return i;
    }

    /* renamed from: b */
    static void m1732b(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: j */
    private void m1733j() {
        do {
        } while (m1730a(m1738e(), AbstractC0299e.b.CREATED));
    }

    /* renamed from: a */
    final View m1734a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1661d.m1779a(view, str, context, attributeSet);
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.InterfaceC0301g
    /* renamed from: a */
    public AbstractC0299e mo1356a() {
        return super.mo1356a();
    }

    @Override // androidx.core.app.C0223a.d
    /* renamed from: a */
    public final void mo1366a(int i) {
        if (this.f1666i || i == -1) {
            return;
        }
        m1732b(i);
    }

    /* renamed from: a */
    public void m1735a(Fragment fragment) {
    }

    /* renamed from: a */
    public void m1736a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.f1668k = true;
        try {
            if (i == -1) {
                C0223a.m1361a(this, intent, -1, bundle);
            } else {
                m1732b(i);
                C0223a.m1361a(this, intent, ((m1731b(fragment) + 1) << 16) + (i & 65535), bundle);
            }
        } finally {
            this.f1668k = false;
        }
    }

    /* renamed from: a */
    protected boolean m1737a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // androidx.lifecycle.InterfaceC0313s
    /* renamed from: d */
    public C0312r mo1685d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1662e == null) {
            C0273c c0273c = (C0273c) getLastNonConfigurationInstance();
            if (c0273c != null) {
                this.f1662e = c0273c.f1674b;
            }
            if (this.f1662e == null) {
                this.f1662e = new C0312r();
            }
        }
        return this.f1662e;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1663f);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1664g);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1665h);
        if (getApplication() != null) {
            AbstractC3150r3.m15184a(this).mo15187a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f1661d.m1800j().mo1812a(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: e */
    public AbstractC0282f m1738e() {
        return this.f1661d.m1800j();
    }

    @Deprecated
    /* renamed from: f */
    public AbstractC3150r3 m1739f() {
        return AbstractC3150r3.m15184a(this);
    }

    /* renamed from: g */
    protected void m1740g() {
        this.f1661d.m1796f();
    }

    /* renamed from: h */
    public Object m1741h() {
        return null;
    }

    @Deprecated
    /* renamed from: i */
    public void mo363i() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f1661d.m1801k();
        int i3 = i >> 16;
        if (i3 == 0) {
            C0223a.c m1359a = C0223a.m1359a();
            if (m1359a == null || !m1359a.m1364a(this, i, i2, intent)) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        int i4 = i3 - 1;
        String m13281b = this.f1670m.m13281b(i4);
        this.f1670m.m13286e(i4);
        if (m13281b == null) {
            return;
        }
        Fragment m1780a = this.f1661d.m1780a(m13281b);
        if (m1780a != null) {
            m1780a.mo1649a(i & 65535, i2, intent);
            return;
        }
        String str = "Activity result no fragment exists for who: " + m13281b;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        AbstractC0282f m1800j = this.f1661d.m1800j();
        boolean mo1814c = m1800j.mo1814c();
        if (!mo1814c || Build.VERSION.SDK_INT > 25) {
            if (mo1814c || !m1800j.mo1815d()) {
                super.onBackPressed();
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1661d.m1801k();
        this.f1661d.m1782a(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        C0312r c0312r;
        this.f1661d.m1785a((Fragment) null);
        super.onCreate(bundle);
        C0273c c0273c = (C0273c) getLastNonConfigurationInstance();
        if (c0273c != null && (c0312r = c0273c.f1674b) != null && this.f1662e == null) {
            this.f1662e = c0312r;
        }
        if (bundle != null) {
            this.f1661d.m1783a(bundle.getParcelable("android:support:fragments"), c0273c != null ? c0273c.f1675c : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f1669l = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray != null && stringArray != null && intArray.length == stringArray.length) {
                    this.f1670m = new C2795j0<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f1670m.m13284c(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f1670m == null) {
            this.f1670m = new C2795j0<>();
            this.f1669l = 0;
        }
        this.f1661d.m1789b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f1661d.m1787a(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View m1734a = m1734a(view, str, context, attributeSet);
        return m1734a == null ? super.onCreateView(view, str, context, attributeSet) : m1734a;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View m1734a = m1734a((View) null, str, context, attributeSet);
        return m1734a == null ? super.onCreateView(str, context, attributeSet) : m1734a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f1662e != null && !isChangingConfigurations()) {
            this.f1662e.m2073a();
        }
        this.f1661d.m1793c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f1661d.m1794d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f1661d.m1792b(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f1661d.m1788a(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f1661d.m1786a(z);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f1661d.m1801k();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f1661d.m1784a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f1664g = false;
        if (this.f1660c.hasMessages(2)) {
            this.f1660c.removeMessages(2);
            m1740g();
        }
        this.f1661d.m1795e();
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f1661d.m1790b(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f1660c.removeMessages(2);
        m1740g();
        this.f1661d.m1799i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : m1737a(view, menu) | this.f1661d.m1791b(menu);
    }

    @Override // android.app.Activity, androidx.core.app.C0223a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f1661d.m1801k();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String m13281b = this.f1670m.m13281b(i3);
            this.f1670m.m13286e(i3);
            if (m13281b == null) {
                return;
            }
            Fragment m1780a = this.f1661d.m1780a(m13281b);
            if (m1780a != null) {
                m1780a.m1651a(i & 65535, strArr, iArr);
                return;
            }
            String str = "Activity result no fragment exists for who: " + m13281b;
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f1660c.sendEmptyMessage(2);
        this.f1664g = true;
        this.f1661d.m1799i();
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        Object m1741h = m1741h();
        C0284h m1802l = this.f1661d.m1802l();
        if (m1802l == null && this.f1662e == null && m1741h == null) {
            return null;
        }
        C0273c c0273c = new C0273c();
        c0273c.f1673a = m1741h;
        c0273c.f1674b = this.f1662e;
        c0273c.f1675c = m1802l;
        return c0273c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m1733j();
        Parcelable m1803m = this.f1661d.m1803m();
        if (m1803m != null) {
            bundle.putParcelable("android:support:fragments", m1803m);
        }
        if (this.f1670m.m13280b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f1669l);
            int[] iArr = new int[this.f1670m.m13280b()];
            String[] strArr = new String[this.f1670m.m13280b()];
            for (int i = 0; i < this.f1670m.m13280b(); i++) {
                iArr[i] = this.f1670m.m13285d(i);
                strArr[i] = this.f1670m.m13287f(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f1665h = false;
        if (!this.f1663f) {
            this.f1663f = true;
            this.f1661d.m1781a();
        }
        this.f1661d.m1801k();
        this.f1661d.m1799i();
        this.f1661d.m1797g();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f1661d.m1801k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f1665h = true;
        m1733j();
        this.f1661d.m1798h();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.f1668k && i != -1) {
            m1732b(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.f1668k && i != -1) {
            m1732b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f1667j && i != -1) {
            m1732b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f1667j && i != -1) {
            m1732b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
