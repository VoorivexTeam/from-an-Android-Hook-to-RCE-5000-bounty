package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public class C0280d {

    /* renamed from: a */
    private final AbstractC0281e<?> f1729a;

    private C0280d(AbstractC0281e<?> abstractC0281e) {
        this.f1729a = abstractC0281e;
    }

    /* renamed from: a */
    public static C0280d m1778a(AbstractC0281e<?> abstractC0281e) {
        return new C0280d(abstractC0281e);
    }

    /* renamed from: a */
    public View m1779a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1729a.f1733d.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public Fragment m1780a(String str) {
        return this.f1729a.f1733d.m1883b(str);
    }

    /* renamed from: a */
    public void m1781a() {
        this.f1729a.f1733d.m1899e();
    }

    /* renamed from: a */
    public void m1782a(Configuration configuration) {
        this.f1729a.f1733d.m1864a(configuration);
    }

    /* renamed from: a */
    public void m1783a(Parcelable parcelable, C0284h c0284h) {
        this.f1729a.f1733d.m1866a(parcelable, c0284h);
    }

    /* renamed from: a */
    public void m1784a(Menu menu) {
        this.f1729a.f1733d.m1867a(menu);
    }

    /* renamed from: a */
    public void m1785a(Fragment fragment) {
        AbstractC0281e<?> abstractC0281e = this.f1729a;
        abstractC0281e.f1733d.m1876a(abstractC0281e, abstractC0281e, fragment);
    }

    /* renamed from: a */
    public void m1786a(boolean z) {
        this.f1729a.f1733d.m1878a(z);
    }

    /* renamed from: a */
    public boolean m1787a(Menu menu, MenuInflater menuInflater) {
        return this.f1729a.f1733d.m1879a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean m1788a(MenuItem menuItem) {
        return this.f1729a.f1733d.m1880a(menuItem);
    }

    /* renamed from: b */
    public void m1789b() {
        this.f1729a.f1733d.m1902f();
    }

    /* renamed from: b */
    public void m1790b(boolean z) {
        this.f1729a.f1733d.m1889b(z);
    }

    /* renamed from: b */
    public boolean m1791b(Menu menu) {
        return this.f1729a.f1733d.m1890b(menu);
    }

    /* renamed from: b */
    public boolean m1792b(MenuItem menuItem) {
        return this.f1729a.f1733d.m1891b(menuItem);
    }

    /* renamed from: c */
    public void m1793c() {
        this.f1729a.f1733d.m1905g();
    }

    /* renamed from: d */
    public void m1794d() {
        this.f1729a.f1733d.m1911i();
    }

    /* renamed from: e */
    public void m1795e() {
        this.f1729a.f1733d.m1913j();
    }

    /* renamed from: f */
    public void m1796f() {
        this.f1729a.f1733d.m1915k();
    }

    /* renamed from: g */
    public void m1797g() {
        this.f1729a.f1733d.m1918l();
    }

    /* renamed from: h */
    public void m1798h() {
        this.f1729a.f1733d.m1919m();
    }

    /* renamed from: i */
    public boolean m1799i() {
        return this.f1729a.f1733d.m1924o();
    }

    /* renamed from: j */
    public AbstractC0282f m1800j() {
        return this.f1729a.m1806d();
    }

    /* renamed from: k */
    public void m1801k() {
        this.f1729a.f1733d.m1927r();
    }

    /* renamed from: l */
    public C0284h m1802l() {
        return this.f1729a.f1733d.m1929t();
    }

    /* renamed from: m */
    public Parcelable m1803m() {
        return this.f1729a.f1733d.m1930u();
    }
}
