package ir.tapsell.sdk.vast;

import android.content.Context;
import android.view.ViewGroup;
import defpackage.d50;
import defpackage.h50;
import defpackage.j50;
import ir.tapsell.sdk.utils.k;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public class a {
    public static Object a(VideoProgressUpdate videoProgressUpdate) {
        Class<?> u = u();
        Class<?> cls = Long.TYPE;
        return u.getConstructor(cls, cls).newInstance(Long.valueOf(videoProgressUpdate.getCurrentTime()), Long.valueOf(videoProgressUpdate.getDuration()));
    }

    public static Object a(Object obj, Context context, Object obj2) {
        return d().getMethod("createAdsLoader", Context.class, e()).invoke(obj, context, obj2);
    }

    public static Object a(Object obj, Object obj2, ViewGroup viewGroup) {
        Object invoke = d().getMethod("createAdDisplayContainer", new Class[0]).invoke(obj, new Object[0]);
        k().getMethod("setPlayer", r()).invoke(invoke, obj2);
        k().getMethod("setAdContainer", ViewGroup.class).invoke(invoke, viewGroup);
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(String str) {
        Object invoke = d().getMethod("createImaSdkSettings", new Class[0]).invoke(c(), new Object[0]);
        e().getMethod("setLanguage", String.class).invoke(invoke, str);
        return invoke;
    }

    public static Object a(InvocationHandler invocationHandler) {
        return Proxy.newProxyInstance(r().getClassLoader(), new Class[]{r()}, invocationHandler);
    }

    public static String a(String str, int i, int i2) {
        String a = j50.a(str);
        try {
            return a + k.a(d50.a(i2, i));
        } catch (UnsupportedEncodingException e) {
            h50.a("TapsellVastUtils", e.getMessage(), e);
            return a;
        }
    }

    public static void a(Object obj) {
        g().getMethod("contentComplete", new Class[0]).invoke(obj, new Object[0]);
    }

    public static void a(Object obj, Object obj2, String str, Object obj3, Object obj4) {
        Object invoke = d().getMethod("createAdsRequest", new Class[0]).invoke(obj, new Object[0]);
        l().getMethod("setAdTagUrl", String.class).invoke(invoke, str);
        l().getMethod("setAdDisplayContainer", k()).invoke(invoke, obj3);
        l().getMethod("setContentProgressProvider", t()).invoke(invoke, obj4);
        g().getMethod("requestAds", l()).invoke(obj2, invoke);
    }

    public static void a(Object obj, String str) {
        s().getMethod(str, new Class[0]).invoke(obj, new Object[0]);
    }

    public static void a(Object obj, String str, int i) {
        s().getMethod(str, Integer.TYPE).invoke(obj, Integer.valueOf(i));
    }

    public static void a(Object obj, InvocationHandler invocationHandler) {
        g().getMethod("addAdErrorListener", q()).invoke(obj, Proxy.newProxyInstance(q().getClassLoader(), new Class[]{q()}, invocationHandler));
    }

    public static boolean a() {
        try {
            d();
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Object b(InvocationHandler invocationHandler) {
        return Proxy.newProxyInstance(t().getClassLoader(), new Class[]{t()}, invocationHandler);
    }

    public static void b(Object obj) {
        i().getMethod("pause", new Class[0]).invoke(obj, new Object[0]);
    }

    public static void b(Object obj, InvocationHandler invocationHandler) {
        g().getMethod("addAdsLoadedListener", h()).invoke(obj, Proxy.newProxyInstance(h().getClassLoader(), new Class[]{h()}, invocationHandler));
    }

    public static boolean b() {
        try {
            f();
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Object c() {
        return d().getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
    }

    public static void c(Object obj) {
        i().getMethod("resume", new Class[0]).invoke(obj, new Object[0]);
    }

    public static void c(Object obj, InvocationHandler invocationHandler) {
        i().getMethod("addAdErrorListener", q()).invoke(obj, Proxy.newProxyInstance(q().getClassLoader(), new Class[]{q()}, invocationHandler));
    }

    private static Class<?> d() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.ImaSdkFactory");
    }

    public static void d(Object obj) {
        i().getMethod("destroy", new Class[0]).invoke(obj, new Object[0]);
    }

    public static void d(Object obj, InvocationHandler invocationHandler) {
        i().getMethod("addAdEventListener", n()).invoke(obj, Proxy.newProxyInstance(n().getClassLoader(), new Class[]{n()}, invocationHandler));
    }

    private static Class<?> e() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.ImaSdkSettings");
    }

    public static void e(Object obj) {
        i().getMethod("init", new Class[0]).invoke(obj, new Object[0]);
    }

    private static void f() {
        Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    public static void f(Object obj) {
        i().getMethod("start", new Class[0]).invoke(obj, new Object[0]);
    }

    private static Class<?> g() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdsLoader");
    }

    public static String g(Object obj) {
        return (String) o().getMethod("getMessage", new Class[0]).invoke(p().getMethod("getError", new Class[0]).invoke(obj, new Object[0]), new Object[0]);
    }

    private static Class<?> h() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdsLoader$AdsLoadedListener");
    }

    public static Object h(Object obj) {
        return j().getMethod("getAdsManager", new Class[0]).invoke(obj, new Object[0]);
    }

    private static Class<?> i() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdsManager");
    }

    public static Object i(Object obj) {
        return m().getMethod("getType", new Class[0]).invoke(obj, new Object[0]);
    }

    private static Class<?> j() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent");
    }

    private static Class<?> k() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdDisplayContainer");
    }

    private static Class<?> l() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdsRequest");
    }

    private static Class<?> m() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdEvent");
    }

    private static Class<?> n() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener");
    }

    private static Class<?> o() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdError");
    }

    private static Class<?> p() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdErrorEvent");
    }

    private static Class<?> q() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdErrorEvent$AdErrorListener");
    }

    private static Class<?> r() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer");
    }

    private static Class<?> s() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback");
    }

    private static Class<?> t() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider");
    }

    private static Class<?> u() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate");
    }
}
