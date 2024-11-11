package ir.tapsell.sdk.vast;

import android.content.Context;
import android.view.ViewGroup;
import ir.tapsell.sdk.utils.C2769k;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import p000.d50;
import p000.h50;
import p000.j50;

/* renamed from: ir.tapsell.sdk.vast.a */
/* loaded from: classes.dex */
public class C2776a {
    /* renamed from: a */
    public static Object m13180a(VideoProgressUpdate videoProgressUpdate) {
        Class<?> m13223u = m13223u();
        Class<?> cls = Long.TYPE;
        return m13223u.getConstructor(cls, cls).newInstance(Long.valueOf(videoProgressUpdate.getCurrentTime()), Long.valueOf(videoProgressUpdate.getDuration()));
    }

    /* renamed from: a */
    public static Object m13181a(Object obj, Context context, Object obj2) {
        return m13199d().getMethod("createAdsLoader", Context.class, m13202e()).invoke(obj, context, obj2);
    }

    /* renamed from: a */
    public static Object m13182a(Object obj, Object obj2, ViewGroup viewGroup) {
        Object invoke = m13199d().getMethod("createAdDisplayContainer", new Class[0]).invoke(obj, new Object[0]);
        m13213k().getMethod("setPlayer", m13220r()).invoke(invoke, obj2);
        m13213k().getMethod("setAdContainer", ViewGroup.class).invoke(invoke, viewGroup);
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m13183a(String str) {
        Object invoke = m13199d().getMethod("createImaSdkSettings", new Class[0]).invoke(m13196c(), new Object[0]);
        m13202e().getMethod("setLanguage", String.class).invoke(invoke, str);
        return invoke;
    }

    /* renamed from: a */
    public static Object m13184a(InvocationHandler invocationHandler) {
        return Proxy.newProxyInstance(m13220r().getClassLoader(), new Class[]{m13220r()}, invocationHandler);
    }

    /* renamed from: a */
    public static String m13185a(String str, int i, int i2) {
        String m13401a = j50.m13401a(str);
        try {
            return m13401a + C2769k.m13172a(d50.m11278a(i2, i));
        } catch (UnsupportedEncodingException e) {
            h50.m12122a("TapsellVastUtils", e.getMessage(), e);
            return m13401a;
        }
    }

    /* renamed from: a */
    public static void m13186a(Object obj) {
        m13206g().getMethod("contentComplete", new Class[0]).invoke(obj, new Object[0]);
    }

    /* renamed from: a */
    public static void m13187a(Object obj, Object obj2, String str, Object obj3, Object obj4) {
        Object invoke = m13199d().getMethod("createAdsRequest", new Class[0]).invoke(obj, new Object[0]);
        m13214l().getMethod("setAdTagUrl", String.class).invoke(invoke, str);
        m13214l().getMethod("setAdDisplayContainer", m13213k()).invoke(invoke, obj3);
        m13214l().getMethod("setContentProgressProvider", m13222t()).invoke(invoke, obj4);
        m13206g().getMethod("requestAds", m13214l()).invoke(obj2, invoke);
    }

    /* renamed from: a */
    public static void m13188a(Object obj, String str) {
        m13221s().getMethod(str, new Class[0]).invoke(obj, new Object[0]);
    }

    /* renamed from: a */
    public static void m13189a(Object obj, String str, int i) {
        m13221s().getMethod(str, Integer.TYPE).invoke(obj, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static void m13190a(Object obj, InvocationHandler invocationHandler) {
        m13206g().getMethod("addAdErrorListener", m13219q()).invoke(obj, Proxy.newProxyInstance(m13219q().getClassLoader(), new Class[]{m13219q()}, invocationHandler));
    }

    /* renamed from: a */
    public static boolean m13191a() {
        try {
            m13199d();
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static Object m13192b(InvocationHandler invocationHandler) {
        return Proxy.newProxyInstance(m13222t().getClassLoader(), new Class[]{m13222t()}, invocationHandler);
    }

    /* renamed from: b */
    public static void m13193b(Object obj) {
        m13210i().getMethod("pause", new Class[0]).invoke(obj, new Object[0]);
    }

    /* renamed from: b */
    public static void m13194b(Object obj, InvocationHandler invocationHandler) {
        m13206g().getMethod("addAdsLoadedListener", m13208h()).invoke(obj, Proxy.newProxyInstance(m13208h().getClassLoader(), new Class[]{m13208h()}, invocationHandler));
    }

    /* renamed from: b */
    public static boolean m13195b() {
        try {
            m13204f();
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static Object m13196c() {
        return m13199d().getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
    }

    /* renamed from: c */
    public static void m13197c(Object obj) {
        m13210i().getMethod("resume", new Class[0]).invoke(obj, new Object[0]);
    }

    /* renamed from: c */
    public static void m13198c(Object obj, InvocationHandler invocationHandler) {
        m13210i().getMethod("addAdErrorListener", m13219q()).invoke(obj, Proxy.newProxyInstance(m13219q().getClassLoader(), new Class[]{m13219q()}, invocationHandler));
    }

    /* renamed from: d */
    private static Class<?> m13199d() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.ImaSdkFactory");
    }

    /* renamed from: d */
    public static void m13200d(Object obj) {
        m13210i().getMethod("destroy", new Class[0]).invoke(obj, new Object[0]);
    }

    /* renamed from: d */
    public static void m13201d(Object obj, InvocationHandler invocationHandler) {
        m13210i().getMethod("addAdEventListener", m13216n()).invoke(obj, Proxy.newProxyInstance(m13216n().getClassLoader(), new Class[]{m13216n()}, invocationHandler));
    }

    /* renamed from: e */
    private static Class<?> m13202e() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.ImaSdkSettings");
    }

    /* renamed from: e */
    public static void m13203e(Object obj) {
        m13210i().getMethod("init", new Class[0]).invoke(obj, new Object[0]);
    }

    /* renamed from: f */
    private static void m13204f() {
        Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    /* renamed from: f */
    public static void m13205f(Object obj) {
        m13210i().getMethod("start", new Class[0]).invoke(obj, new Object[0]);
    }

    /* renamed from: g */
    private static Class<?> m13206g() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdsLoader");
    }

    /* renamed from: g */
    public static String m13207g(Object obj) {
        return (String) m13217o().getMethod("getMessage", new Class[0]).invoke(m13218p().getMethod("getError", new Class[0]).invoke(obj, new Object[0]), new Object[0]);
    }

    /* renamed from: h */
    private static Class<?> m13208h() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdsLoader$AdsLoadedListener");
    }

    /* renamed from: h */
    public static Object m13209h(Object obj) {
        return m13212j().getMethod("getAdsManager", new Class[0]).invoke(obj, new Object[0]);
    }

    /* renamed from: i */
    private static Class<?> m13210i() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdsManager");
    }

    /* renamed from: i */
    public static Object m13211i(Object obj) {
        return m13215m().getMethod("getType", new Class[0]).invoke(obj, new Object[0]);
    }

    /* renamed from: j */
    private static Class<?> m13212j() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent");
    }

    /* renamed from: k */
    private static Class<?> m13213k() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdDisplayContainer");
    }

    /* renamed from: l */
    private static Class<?> m13214l() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdsRequest");
    }

    /* renamed from: m */
    private static Class<?> m13215m() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdEvent");
    }

    /* renamed from: n */
    private static Class<?> m13216n() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener");
    }

    /* renamed from: o */
    private static Class<?> m13217o() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdError");
    }

    /* renamed from: p */
    private static Class<?> m13218p() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdErrorEvent");
    }

    /* renamed from: q */
    private static Class<?> m13219q() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.AdErrorEvent$AdErrorListener");
    }

    /* renamed from: r */
    private static Class<?> m13220r() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer");
    }

    /* renamed from: s */
    private static Class<?> m13221s() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback");
    }

    /* renamed from: t */
    private static Class<?> m13222t() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider");
    }

    /* renamed from: u */
    private static Class<?> m13223u() {
        return Class.forName("com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate");
    }
}
