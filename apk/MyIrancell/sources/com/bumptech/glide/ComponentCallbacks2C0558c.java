package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.EnumC0568b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC0576j;
import com.bumptech.glide.load.InterfaceC0577k;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.C0017ad;
import p000.C0018ae;
import p000.C0476bd;
import p000.C0477be;
import p000.C0478bf;
import p000.C0518cd;
import p000.C0519ce;
import p000.C0520cf;
import p000.C2385dd;
import p000.C2386de;
import p000.C2387df;
import p000.C2428ed;
import p000.C2469fd;
import p000.C2509gd;
import p000.C2510ge;
import p000.C2549hd;
import p000.C2550he;
import p000.C2592ie;
import p000.C2593if;
import p000.C2595ih;
import p000.C2813jf;
import p000.C2816ji;
import p000.C2854kb;
import p000.C2858kf;
import p000.C2861ki;
import p000.C2893ld;
import p000.C2894le;
import p000.C2941mf;
import p000.C3032oe;
import p000.C3033of;
import p000.C3034og;
import p000.C3083pf;
import p000.C3124qe;
import p000.C3127qh;
import p000.C3159ra;
import p000.C3258td;
import p000.C3259te;
import p000.C3260tf;
import p000.C3302ud;
import p000.C3355vd;
import p000.C3357vf;
import p000.C3394wd;
import p000.C3396wf;
import p000.C3397wg;
import p000.C3434xd;
import p000.C3436xf;
import p000.C3483yd;
import p000.C3484ye;
import p000.C3485yf;
import p000.C3525zd;
import p000.C3526ze;
import p000.C3527zf;
import p000.InterfaceC0475bc;
import p000.InterfaceC0513ca;
import p000.InterfaceC2427ec;
import p000.InterfaceC2512gg;
import p000.InterfaceC2553hh;
import p000.InterfaceC2890la;
import p000.InterfaceC3262th;
import p000.InterfaceC3305ug;
import p000.InterfaceC3354vc;

/* renamed from: com.bumptech.glide.c */
/* loaded from: classes.dex */
public class ComponentCallbacks2C0558c implements ComponentCallbacks2 {

    /* renamed from: j */
    private static volatile ComponentCallbacks2C0558c f3200j;

    /* renamed from: k */
    private static volatile boolean f3201k;

    /* renamed from: b */
    private final InterfaceC2427ec f3202b;

    /* renamed from: c */
    private final InterfaceC3354vc f3203c;

    /* renamed from: d */
    private final C0560e f3204d;

    /* renamed from: e */
    private final C0563h f3205e;

    /* renamed from: f */
    private final InterfaceC0475bc f3206f;

    /* renamed from: g */
    private final C3034og f3207g;

    /* renamed from: h */
    private final InterfaceC2512gg f3208h;

    /* renamed from: i */
    private final List<C0565j> f3209i = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentCallbacks2C0558c(Context context, C2854kb c2854kb, InterfaceC3354vc interfaceC3354vc, InterfaceC2427ec interfaceC2427ec, InterfaceC0475bc interfaceC0475bc, C3034og c3034og, InterfaceC2512gg interfaceC2512gg, int i, C2595ih c2595ih, Map<Class<?>, AbstractC0566k<?, ?>> map, List<InterfaceC2553hh<Object>> list, boolean z) {
        EnumC0561f enumC0561f = EnumC0561f.NORMAL;
        this.f3202b = interfaceC2427ec;
        this.f3206f = interfaceC0475bc;
        this.f3203c = interfaceC3354vc;
        this.f3207g = c3034og;
        this.f3208h = interfaceC2512gg;
        new C0017ad(interfaceC3354vc, interfaceC2427ec, (EnumC0568b) c2595ih.m11410m().m3964a(C3124qe.f12789f));
        Resources resources = context.getResources();
        C0563h c0563h = new C0563h();
        this.f3205e = c0563h;
        c0563h.m3895a((ImageHeaderParser) new C3032oe());
        if (Build.VERSION.SDK_INT >= 27) {
            this.f3205e.m3895a((ImageHeaderParser) new C3259te());
        }
        List<ImageHeaderParser> m3905a = this.f3205e.m3905a();
        C3124qe c3124qe = new C3124qe(m3905a, resources.getDisplayMetrics(), interfaceC2427ec, interfaceC0475bc);
        C2941mf c2941mf = new C2941mf(context, m3905a, interfaceC2427ec, interfaceC0475bc);
        InterfaceC0576j<ParcelFileDescriptor, Bitmap> m3672b = C0520cf.m3672b(interfaceC2427ec);
        C2894le c2894le = new C2894le(c3124qe);
        C3526ze c3526ze = new C3526ze(c3124qe, interfaceC0475bc);
        C2593if c2593if = new C2593if(context);
        C3258td.c cVar = new C3258td.c(resources);
        C3258td.d dVar = new C3258td.d(resources);
        C3258td.b bVar = new C3258td.b(resources);
        C3258td.a aVar = new C3258td.a(resources);
        C2592ie c2592ie = new C2592ie(interfaceC0475bc);
        C3396wf c3396wf = new C3396wf();
        C3527zf c3527zf = new C3527zf();
        ContentResolver contentResolver = context.getContentResolver();
        C0563h c0563h2 = this.f3205e;
        c0563h2.m3896a(ByteBuffer.class, new C2385dd());
        c0563h2.m3896a(InputStream.class, new C3302ud(interfaceC0475bc));
        c0563h2.m3901a("Bitmap", ByteBuffer.class, Bitmap.class, c2894le);
        c0563h2.m3901a("Bitmap", InputStream.class, Bitmap.class, c3526ze);
        c0563h2.m3901a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, m3672b);
        c0563h2.m3901a("Bitmap", AssetFileDescriptor.class, Bitmap.class, C0520cf.m3670a(interfaceC2427ec));
        c0563h2.m3900a(Bitmap.class, Bitmap.class, C3394wd.a.m16209a());
        c0563h2.m3901a("Bitmap", Bitmap.class, Bitmap.class, new C0478bf());
        c0563h2.m3897a(Bitmap.class, (InterfaceC0577k) c2592ie);
        c0563h2.m3901a("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C2510ge(resources, c2894le));
        c0563h2.m3901a("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C2510ge(resources, c3526ze));
        c0563h2.m3901a("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C2510ge(resources, m3672b));
        c0563h2.m3897a(BitmapDrawable.class, (InterfaceC0577k) new C2550he(interfaceC2427ec, c2592ie));
        c0563h2.m3901a("Gif", InputStream.class, C3033of.class, new C3357vf(m3905a, c2941mf, interfaceC0475bc));
        c0563h2.m3901a("Gif", ByteBuffer.class, C3033of.class, c2941mf);
        c0563h2.m3897a(C3033of.class, (InterfaceC0577k) new C3083pf());
        c0563h2.m3900a(InterfaceC0513ca.class, InterfaceC0513ca.class, C3394wd.a.m16209a());
        c0563h2.m3901a("Bitmap", InterfaceC0513ca.class, Bitmap.class, new C3260tf(interfaceC2427ec));
        c0563h2.m3899a(Uri.class, Drawable.class, c2593if);
        c0563h2.m3899a(Uri.class, Bitmap.class, new C3484ye(c2593if, interfaceC2427ec));
        c0563h2.m3903a((InterfaceC2890la.a<?>) new C2387df.a());
        c0563h2.m3900a(File.class, ByteBuffer.class, new C2428ed.b());
        c0563h2.m3900a(File.class, InputStream.class, new C2509gd.e());
        c0563h2.m3899a(File.class, File.class, new C2858kf());
        c0563h2.m3900a(File.class, ParcelFileDescriptor.class, new C2509gd.b());
        c0563h2.m3900a(File.class, File.class, C3394wd.a.m16209a());
        c0563h2.m3903a((InterfaceC2890la.a<?>) new C3159ra.a(interfaceC0475bc));
        c0563h2.m3900a(Integer.TYPE, InputStream.class, cVar);
        c0563h2.m3900a(Integer.TYPE, ParcelFileDescriptor.class, bVar);
        c0563h2.m3900a(Integer.class, InputStream.class, cVar);
        c0563h2.m3900a(Integer.class, ParcelFileDescriptor.class, bVar);
        c0563h2.m3900a(Integer.class, Uri.class, dVar);
        c0563h2.m3900a(Integer.TYPE, AssetFileDescriptor.class, aVar);
        c0563h2.m3900a(Integer.class, AssetFileDescriptor.class, aVar);
        c0563h2.m3900a(Integer.TYPE, Uri.class, dVar);
        c0563h2.m3900a(String.class, InputStream.class, new C2469fd.c());
        c0563h2.m3900a(Uri.class, InputStream.class, new C2469fd.c());
        c0563h2.m3900a(String.class, InputStream.class, new C3355vd.c());
        c0563h2.m3900a(String.class, ParcelFileDescriptor.class, new C3355vd.b());
        c0563h2.m3900a(String.class, AssetFileDescriptor.class, new C3355vd.a());
        c0563h2.m3900a(Uri.class, InputStream.class, new C0018ae.a());
        c0563h2.m3900a(Uri.class, InputStream.class, new C0476bd.c(context.getAssets()));
        c0563h2.m3900a(Uri.class, ParcelFileDescriptor.class, new C0476bd.b(context.getAssets()));
        c0563h2.m3900a(Uri.class, InputStream.class, new C0477be.a(context));
        c0563h2.m3900a(Uri.class, InputStream.class, new C0519ce.a(context));
        c0563h2.m3900a(Uri.class, InputStream.class, new C3434xd.d(contentResolver));
        c0563h2.m3900a(Uri.class, ParcelFileDescriptor.class, new C3434xd.b(contentResolver));
        c0563h2.m3900a(Uri.class, AssetFileDescriptor.class, new C3434xd.a(contentResolver));
        c0563h2.m3900a(Uri.class, InputStream.class, new C3483yd.a());
        c0563h2.m3900a(URL.class, InputStream.class, new C2386de.a());
        c0563h2.m3900a(Uri.class, File.class, new C2893ld.a(context));
        c0563h2.m3900a(C2549hd.class, InputStream.class, new C3525zd.a());
        c0563h2.m3900a(byte[].class, ByteBuffer.class, new C0518cd.a());
        c0563h2.m3900a(byte[].class, InputStream.class, new C0518cd.d());
        c0563h2.m3900a(Uri.class, Uri.class, C3394wd.a.m16209a());
        c0563h2.m3900a(Drawable.class, Drawable.class, C3394wd.a.m16209a());
        c0563h2.m3899a(Drawable.class, Drawable.class, new C2813jf());
        c0563h2.m3898a(Bitmap.class, BitmapDrawable.class, new C3436xf(resources));
        c0563h2.m3898a(Bitmap.class, byte[].class, c3396wf);
        c0563h2.m3898a(Drawable.class, byte[].class, new C3485yf(interfaceC2427ec, c3396wf, c3527zf));
        c0563h2.m3898a(C3033of.class, byte[].class, c3527zf);
        this.f3204d = new C0560e(context, interfaceC0475bc, this.f3205e, new C3127qh(), c2595ih, map, list, c2854kb, z, i);
    }

    /* renamed from: a */
    private static void m3863a(Context context) {
        if (f3201k) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f3201k = true;
        m3868d(context);
        f3201k = false;
    }

    /* renamed from: a */
    private static void m3864a(Context context, C0559d c0559d) {
        Context applicationContext = context.getApplicationContext();
        AbstractC0556a m3870i = m3870i();
        List<InterfaceC3305ug> emptyList = Collections.emptyList();
        if (m3870i == null || m3870i.m15633a()) {
            emptyList = new C3397wg(applicationContext).m16213a();
        }
        if (m3870i != null && !m3870i.m3861b().isEmpty()) {
            Set<Class<?>> m3861b = m3870i.m3861b();
            Iterator<InterfaceC3305ug> it = emptyList.iterator();
            while (it.hasNext()) {
                InterfaceC3305ug next = it.next();
                if (m3861b.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        String str = "AppGlideModule excludes manifest GlideModule: " + next;
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<InterfaceC3305ug> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                String str2 = "Discovered GlideModule from manifest: " + it2.next().getClass();
            }
        }
        c0559d.m3884a(m3870i != null ? m3870i.m3862c() : null);
        Iterator<InterfaceC3305ug> it3 = emptyList.iterator();
        while (it3.hasNext()) {
            it3.next().m15796a(applicationContext, c0559d);
        }
        if (m3870i != null) {
            m3870i.m15632a(applicationContext, c0559d);
        }
        ComponentCallbacks2C0558c m3883a = c0559d.m3883a(applicationContext);
        Iterator<InterfaceC3305ug> it4 = emptyList.iterator();
        while (it4.hasNext()) {
            it4.next().m15795a(applicationContext, m3883a, m3883a.f3205e);
        }
        if (m3870i != null) {
            m3870i.m16016a(applicationContext, m3883a, m3883a.f3205e);
        }
        applicationContext.registerComponentCallbacks(m3883a);
        f3200j = m3883a;
    }

    /* renamed from: a */
    private static void m3865a(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: b */
    public static ComponentCallbacks2C0558c m3866b(Context context) {
        if (f3200j == null) {
            synchronized (ComponentCallbacks2C0558c.class) {
                if (f3200j == null) {
                    m3863a(context);
                }
            }
        }
        return f3200j;
    }

    /* renamed from: c */
    private static C3034og m3867c(Context context) {
        C2816ji.m13460a(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m3866b(context).m3882h();
    }

    /* renamed from: d */
    private static void m3868d(Context context) {
        m3864a(context, new C0559d());
    }

    /* renamed from: e */
    public static C0565j m3869e(Context context) {
        return m3867c(context).m14523a(context);
    }

    /* renamed from: i */
    private static AbstractC0556a m3870i() {
        try {
            return (AbstractC0556a) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            Log.isLoggable("Glide", 5);
            return null;
        } catch (IllegalAccessException e) {
            m3865a(e);
            throw null;
        } catch (InstantiationException e2) {
            m3865a(e2);
            throw null;
        } catch (NoSuchMethodException e3) {
            m3865a(e3);
            throw null;
        } catch (InvocationTargetException e4) {
            m3865a(e4);
            throw null;
        }
    }

    /* renamed from: a */
    public void m3871a() {
        C2861ki.m13728a();
        this.f3203c.m16009a();
        this.f3202b.mo11589a();
        this.f3206f.mo3376a();
    }

    /* renamed from: a */
    public void m3872a(int i) {
        C2861ki.m13728a();
        this.f3203c.mo15792a(i);
        this.f3202b.mo11590a(i);
        this.f3206f.mo3377a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3873a(C0565j c0565j) {
        synchronized (this.f3209i) {
            if (this.f3209i.contains(c0565j)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.f3209i.add(c0565j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m3874a(InterfaceC3262th<?> interfaceC3262th) {
        synchronized (this.f3209i) {
            Iterator<C0565j> it = this.f3209i.iterator();
            while (it.hasNext()) {
                if (it.next().m3937b(interfaceC3262th)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public InterfaceC0475bc m3875b() {
        return this.f3206f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m3876b(C0565j c0565j) {
        synchronized (this.f3209i) {
            if (!this.f3209i.contains(c0565j)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f3209i.remove(c0565j);
        }
    }

    /* renamed from: c */
    public InterfaceC2427ec m3877c() {
        return this.f3202b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC2512gg m3878d() {
        return this.f3208h;
    }

    /* renamed from: e */
    public Context m3879e() {
        return this.f3204d.getBaseContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C0560e m3880f() {
        return this.f3204d;
    }

    /* renamed from: g */
    public C0563h m3881g() {
        return this.f3205e;
    }

    /* renamed from: h */
    public C3034og m3882h() {
        return this.f3207g;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m3871a();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        m3872a(i);
    }
}
