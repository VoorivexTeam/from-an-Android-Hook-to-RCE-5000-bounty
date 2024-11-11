package com.viewpagerindicator;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.AbstractC0429a;

/* renamed from: com.viewpagerindicator.a */
/* loaded from: classes.dex */
public class C2348a extends AbstractC0429a {

    /* renamed from: b */
    private AbstractC0429a f9591b;

    /* renamed from: a */
    private void m11203a(String str) {
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: a */
    public int mo3160a() {
        return m11204c() == 0 ? 0 : Integer.MAX_VALUE;
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: a */
    public int mo3161a(Object obj) {
        return this.f9591b.mo3161a(obj);
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: a */
    public CharSequence mo3162a(int i) {
        return this.f9591b.mo3162a(i % m11204c());
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: a */
    public Object mo3163a(ViewGroup viewGroup, int i) {
        int m11204c = i % m11204c();
        m11203a("instantiateItem: real position: " + i);
        m11203a("instantiateItem: virtual position: " + m11204c);
        return this.f9591b.mo3163a(viewGroup, m11204c);
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: a */
    public void mo3164a(DataSetObserver dataSetObserver) {
        this.f9591b.mo3164a(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: a */
    public void mo3165a(Parcelable parcelable, ClassLoader classLoader) {
        this.f9591b.mo3165a(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: a */
    public void mo3168a(ViewGroup viewGroup) {
        this.f9591b.mo3168a(viewGroup);
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: a */
    public void mo3169a(ViewGroup viewGroup, int i, Object obj) {
        int m11204c = i % m11204c();
        m11203a("destroyItem: real position: " + i);
        m11203a("destroyItem: virtual position: " + m11204c);
        this.f9591b.mo3169a(viewGroup, m11204c, obj);
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: a */
    public boolean mo3170a(View view, Object obj) {
        return this.f9591b.mo3170a(view, obj);
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: b */
    public float mo3171b(int i) {
        return this.f9591b.mo3171b(i);
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: b */
    public Parcelable mo3172b() {
        return this.f9591b.mo3172b();
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: b */
    public void mo3175b(ViewGroup viewGroup) {
        this.f9591b.mo3175b(viewGroup);
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: b */
    public void mo3176b(ViewGroup viewGroup, int i, Object obj) {
        this.f9591b.mo3176b(viewGroup, i, obj);
    }

    /* renamed from: c */
    public int m11204c() {
        return this.f9591b.mo3160a();
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: c */
    public void mo3177c(DataSetObserver dataSetObserver) {
        this.f9591b.mo3177c(dataSetObserver);
    }
}
