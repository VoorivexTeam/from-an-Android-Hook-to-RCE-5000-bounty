package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public class d {
    private final e<?> a;

    private d(e<?> eVar) {
        this.a = eVar;
    }

    public static d a(e<?> eVar) {
        return new d(eVar);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.d.onCreateView(view, str, context, attributeSet);
    }

    public Fragment a(String str) {
        return this.a.d.b(str);
    }

    public void a() {
        this.a.d.e();
    }

    public void a(Configuration configuration) {
        this.a.d.a(configuration);
    }

    public void a(Parcelable parcelable, h hVar) {
        this.a.d.a(parcelable, hVar);
    }

    public void a(Menu menu) {
        this.a.d.a(menu);
    }

    public void a(Fragment fragment) {
        e<?> eVar = this.a;
        eVar.d.a(eVar, eVar, fragment);
    }

    public void a(boolean z) {
        this.a.d.a(z);
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        return this.a.d.a(menu, menuInflater);
    }

    public boolean a(MenuItem menuItem) {
        return this.a.d.a(menuItem);
    }

    public void b() {
        this.a.d.f();
    }

    public void b(boolean z) {
        this.a.d.b(z);
    }

    public boolean b(Menu menu) {
        return this.a.d.b(menu);
    }

    public boolean b(MenuItem menuItem) {
        return this.a.d.b(menuItem);
    }

    public void c() {
        this.a.d.g();
    }

    public void d() {
        this.a.d.i();
    }

    public void e() {
        this.a.d.j();
    }

    public void f() {
        this.a.d.k();
    }

    public void g() {
        this.a.d.l();
    }

    public void h() {
        this.a.d.m();
    }

    public boolean i() {
        return this.a.d.o();
    }

    public f j() {
        return this.a.d();
    }

    public void k() {
        this.a.d.r();
    }

    public h l() {
        return this.a.d.t();
    }

    public Parcelable m() {
        return this.a.d.u();
    }
}
