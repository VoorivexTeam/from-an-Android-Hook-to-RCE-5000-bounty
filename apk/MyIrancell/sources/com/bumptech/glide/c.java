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
import com.bumptech.glide.load.ImageHeaderParser;
import defpackage.Cif;
import defpackage.ad;
import defpackage.ae;
import defpackage.bc;
import defpackage.bd;
import defpackage.be;
import defpackage.bf;
import defpackage.ca;
import defpackage.cd;
import defpackage.ce;
import defpackage.cf;
import defpackage.dd;
import defpackage.de;
import defpackage.df;
import defpackage.ec;
import defpackage.ed;
import defpackage.fd;
import defpackage.gd;
import defpackage.ge;
import defpackage.gg;
import defpackage.hd;
import defpackage.he;
import defpackage.hh;
import defpackage.ie;
import defpackage.ih;
import defpackage.jf;
import defpackage.ji;
import defpackage.kb;
import defpackage.kf;
import defpackage.ki;
import defpackage.la;
import defpackage.ld;
import defpackage.le;
import defpackage.mf;
import defpackage.oe;
import defpackage.of;
import defpackage.og;
import defpackage.pf;
import defpackage.qe;
import defpackage.qh;
import defpackage.ra;
import defpackage.td;
import defpackage.te;
import defpackage.tf;
import defpackage.th;
import defpackage.ud;
import defpackage.ug;
import defpackage.vc;
import defpackage.vd;
import defpackage.vf;
import defpackage.wd;
import defpackage.wf;
import defpackage.wg;
import defpackage.xd;
import defpackage.xf;
import defpackage.yd;
import defpackage.ye;
import defpackage.yf;
import defpackage.zd;
import defpackage.ze;
import defpackage.zf;
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

/* loaded from: classes.dex */
public class c implements ComponentCallbacks2 {
    private static volatile c j;
    private static volatile boolean k;
    private final ec b;
    private final vc c;
    private final e d;
    private final h e;
    private final bc f;
    private final og g;
    private final gg h;
    private final List<j> i = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, kb kbVar, vc vcVar, ec ecVar, bc bcVar, og ogVar, gg ggVar, int i, ih ihVar, Map<Class<?>, k<?, ?>> map, List<hh<Object>> list, boolean z) {
        f fVar = f.NORMAL;
        this.b = ecVar;
        this.f = bcVar;
        this.c = vcVar;
        this.g = ogVar;
        this.h = ggVar;
        new ad(vcVar, ecVar, (com.bumptech.glide.load.b) ihVar.m().a(qe.f));
        Resources resources = context.getResources();
        h hVar = new h();
        this.e = hVar;
        hVar.a((ImageHeaderParser) new oe());
        if (Build.VERSION.SDK_INT >= 27) {
            this.e.a((ImageHeaderParser) new te());
        }
        List<ImageHeaderParser> a = this.e.a();
        qe qeVar = new qe(a, resources.getDisplayMetrics(), ecVar, bcVar);
        mf mfVar = new mf(context, a, ecVar, bcVar);
        com.bumptech.glide.load.j<ParcelFileDescriptor, Bitmap> b = cf.b(ecVar);
        le leVar = new le(qeVar);
        ze zeVar = new ze(qeVar, bcVar);
        Cif cif = new Cif(context);
        td.c cVar = new td.c(resources);
        td.d dVar = new td.d(resources);
        td.b bVar = new td.b(resources);
        td.a aVar = new td.a(resources);
        ie ieVar = new ie(bcVar);
        wf wfVar = new wf();
        zf zfVar = new zf();
        ContentResolver contentResolver = context.getContentResolver();
        h hVar2 = this.e;
        hVar2.a(ByteBuffer.class, new dd());
        hVar2.a(InputStream.class, new ud(bcVar));
        hVar2.a("Bitmap", ByteBuffer.class, Bitmap.class, leVar);
        hVar2.a("Bitmap", InputStream.class, Bitmap.class, zeVar);
        hVar2.a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, b);
        hVar2.a("Bitmap", AssetFileDescriptor.class, Bitmap.class, cf.a(ecVar));
        hVar2.a(Bitmap.class, Bitmap.class, wd.a.a());
        hVar2.a("Bitmap", Bitmap.class, Bitmap.class, new bf());
        hVar2.a(Bitmap.class, (com.bumptech.glide.load.k) ieVar);
        hVar2.a("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new ge(resources, leVar));
        hVar2.a("BitmapDrawable", InputStream.class, BitmapDrawable.class, new ge(resources, zeVar));
        hVar2.a("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new ge(resources, b));
        hVar2.a(BitmapDrawable.class, (com.bumptech.glide.load.k) new he(ecVar, ieVar));
        hVar2.a("Gif", InputStream.class, of.class, new vf(a, mfVar, bcVar));
        hVar2.a("Gif", ByteBuffer.class, of.class, mfVar);
        hVar2.a(of.class, (com.bumptech.glide.load.k) new pf());
        hVar2.a(ca.class, ca.class, wd.a.a());
        hVar2.a("Bitmap", ca.class, Bitmap.class, new tf(ecVar));
        hVar2.a(Uri.class, Drawable.class, cif);
        hVar2.a(Uri.class, Bitmap.class, new ye(cif, ecVar));
        hVar2.a((la.a<?>) new df.a());
        hVar2.a(File.class, ByteBuffer.class, new ed.b());
        hVar2.a(File.class, InputStream.class, new gd.e());
        hVar2.a(File.class, File.class, new kf());
        hVar2.a(File.class, ParcelFileDescriptor.class, new gd.b());
        hVar2.a(File.class, File.class, wd.a.a());
        hVar2.a((la.a<?>) new ra.a(bcVar));
        hVar2.a(Integer.TYPE, InputStream.class, cVar);
        hVar2.a(Integer.TYPE, ParcelFileDescriptor.class, bVar);
        hVar2.a(Integer.class, InputStream.class, cVar);
        hVar2.a(Integer.class, ParcelFileDescriptor.class, bVar);
        hVar2.a(Integer.class, Uri.class, dVar);
        hVar2.a(Integer.TYPE, AssetFileDescriptor.class, aVar);
        hVar2.a(Integer.class, AssetFileDescriptor.class, aVar);
        hVar2.a(Integer.TYPE, Uri.class, dVar);
        hVar2.a(String.class, InputStream.class, new fd.c());
        hVar2.a(Uri.class, InputStream.class, new fd.c());
        hVar2.a(String.class, InputStream.class, new vd.c());
        hVar2.a(String.class, ParcelFileDescriptor.class, new vd.b());
        hVar2.a(String.class, AssetFileDescriptor.class, new vd.a());
        hVar2.a(Uri.class, InputStream.class, new ae.a());
        hVar2.a(Uri.class, InputStream.class, new bd.c(context.getAssets()));
        hVar2.a(Uri.class, ParcelFileDescriptor.class, new bd.b(context.getAssets()));
        hVar2.a(Uri.class, InputStream.class, new be.a(context));
        hVar2.a(Uri.class, InputStream.class, new ce.a(context));
        hVar2.a(Uri.class, InputStream.class, new xd.d(contentResolver));
        hVar2.a(Uri.class, ParcelFileDescriptor.class, new xd.b(contentResolver));
        hVar2.a(Uri.class, AssetFileDescriptor.class, new xd.a(contentResolver));
        hVar2.a(Uri.class, InputStream.class, new yd.a());
        hVar2.a(URL.class, InputStream.class, new de.a());
        hVar2.a(Uri.class, File.class, new ld.a(context));
        hVar2.a(hd.class, InputStream.class, new zd.a());
        hVar2.a(byte[].class, ByteBuffer.class, new cd.a());
        hVar2.a(byte[].class, InputStream.class, new cd.d());
        hVar2.a(Uri.class, Uri.class, wd.a.a());
        hVar2.a(Drawable.class, Drawable.class, wd.a.a());
        hVar2.a(Drawable.class, Drawable.class, new jf());
        hVar2.a(Bitmap.class, BitmapDrawable.class, new xf(resources));
        hVar2.a(Bitmap.class, byte[].class, wfVar);
        hVar2.a(Drawable.class, byte[].class, new yf(ecVar, wfVar, zfVar));
        hVar2.a(of.class, byte[].class, zfVar);
        this.d = new e(context, bcVar, this.e, new qh(), ihVar, map, list, kbVar, z, i);
    }

    private static void a(Context context) {
        if (k) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        k = true;
        d(context);
        k = false;
    }

    private static void a(Context context, d dVar) {
        Context applicationContext = context.getApplicationContext();
        a i = i();
        List<ug> emptyList = Collections.emptyList();
        if (i == null || i.a()) {
            emptyList = new wg(applicationContext).a();
        }
        if (i != null && !i.b().isEmpty()) {
            Set<Class<?>> b = i.b();
            Iterator<ug> it = emptyList.iterator();
            while (it.hasNext()) {
                ug next = it.next();
                if (b.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        String str = "AppGlideModule excludes manifest GlideModule: " + next;
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<ug> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                String str2 = "Discovered GlideModule from manifest: " + it2.next().getClass();
            }
        }
        dVar.a(i != null ? i.c() : null);
        Iterator<ug> it3 = emptyList.iterator();
        while (it3.hasNext()) {
            it3.next().a(applicationContext, dVar);
        }
        if (i != null) {
            i.a(applicationContext, dVar);
        }
        c a = dVar.a(applicationContext);
        Iterator<ug> it4 = emptyList.iterator();
        while (it4.hasNext()) {
            it4.next().a(applicationContext, a, a.e);
        }
        if (i != null) {
            i.a(applicationContext, a, a.e);
        }
        applicationContext.registerComponentCallbacks(a);
        j = a;
    }

    private static void a(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static c b(Context context) {
        if (j == null) {
            synchronized (c.class) {
                if (j == null) {
                    a(context);
                }
            }
        }
        return j;
    }

    private static og c(Context context) {
        ji.a(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).h();
    }

    private static void d(Context context) {
        a(context, new d());
    }

    public static j e(Context context) {
        return c(context).a(context);
    }

    private static a i() {
        try {
            return (a) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            Log.isLoggable("Glide", 5);
            return null;
        } catch (IllegalAccessException e) {
            a(e);
            throw null;
        } catch (InstantiationException e2) {
            a(e2);
            throw null;
        } catch (NoSuchMethodException e3) {
            a(e3);
            throw null;
        } catch (InvocationTargetException e4) {
            a(e4);
            throw null;
        }
    }

    public void a() {
        ki.a();
        this.c.a();
        this.b.a();
        this.f.a();
    }

    public void a(int i) {
        ki.a();
        this.c.a(i);
        this.b.a(i);
        this.f.a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(j jVar) {
        synchronized (this.i) {
            if (this.i.contains(jVar)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.i.add(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(th<?> thVar) {
        synchronized (this.i) {
            Iterator<j> it = this.i.iterator();
            while (it.hasNext()) {
                if (it.next().b(thVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public bc b() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(j jVar) {
        synchronized (this.i) {
            if (!this.i.contains(jVar)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.i.remove(jVar);
        }
    }

    public ec c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public gg d() {
        return this.h;
    }

    public Context e() {
        return this.d.getBaseContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e f() {
        return this.d;
    }

    public h g() {
        return this.e;
    }

    public og h() {
        return this.g;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        a();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        a(i);
    }
}
