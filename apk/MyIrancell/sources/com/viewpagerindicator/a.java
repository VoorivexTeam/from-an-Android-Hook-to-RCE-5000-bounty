package com.viewpagerindicator;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class a extends androidx.viewpager.widget.a {
    private androidx.viewpager.widget.a b;

    private void a(String str) {
    }

    @Override // androidx.viewpager.widget.a
    public int a() {
        return c() == 0 ? 0 : Integer.MAX_VALUE;
    }

    @Override // androidx.viewpager.widget.a
    public int a(Object obj) {
        return this.b.a(obj);
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence a(int i) {
        return this.b.a(i % c());
    }

    @Override // androidx.viewpager.widget.a
    public Object a(ViewGroup viewGroup, int i) {
        int c = i % c();
        a("instantiateItem: real position: " + i);
        a("instantiateItem: virtual position: " + c);
        return this.b.a(viewGroup, c);
    }

    @Override // androidx.viewpager.widget.a
    public void a(DataSetObserver dataSetObserver) {
        this.b.a(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.a
    public void a(Parcelable parcelable, ClassLoader classLoader) {
        this.b.a(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup) {
        this.b.a(viewGroup);
    }

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup, int i, Object obj) {
        int c = i % c();
        a("destroyItem: real position: " + i);
        a("destroyItem: virtual position: " + c);
        this.b.a(viewGroup, c, obj);
    }

    @Override // androidx.viewpager.widget.a
    public boolean a(View view, Object obj) {
        return this.b.a(view, obj);
    }

    @Override // androidx.viewpager.widget.a
    public float b(int i) {
        return this.b.b(i);
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable b() {
        return this.b.b();
    }

    @Override // androidx.viewpager.widget.a
    public void b(ViewGroup viewGroup) {
        this.b.b(viewGroup);
    }

    @Override // androidx.viewpager.widget.a
    public void b(ViewGroup viewGroup, int i, Object obj) {
        this.b.b(viewGroup, i, obj);
    }

    public int c() {
        return this.b.a();
    }

    @Override // androidx.viewpager.widget.a
    public void c(DataSetObserver dataSetObserver) {
        this.b.c(dataSetObserver);
    }
}
