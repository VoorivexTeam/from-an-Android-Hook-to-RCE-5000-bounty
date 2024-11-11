package p000;

/* loaded from: classes.dex */
public final class g90 {
    /* renamed from: a */
    public static boolean m11935a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* renamed from: b */
    public static boolean m11936b(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* renamed from: c */
    public static boolean m11937c(String str) {
        return !str.equals("PROPFIND");
    }

    /* renamed from: d */
    public static boolean m11938d(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: e */
    public static boolean m11939e(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
