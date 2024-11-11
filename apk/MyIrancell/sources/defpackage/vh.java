package defpackage;

import defpackage.wh;

/* loaded from: classes.dex */
public class vh<R> implements wh<R> {
    static final vh<?> a = new vh<>();
    private static final xh<?> b = new a();

    /* loaded from: classes.dex */
    public static class a<R> implements xh<R> {
        @Override // defpackage.xh
        public wh<R> a(com.bumptech.glide.load.a aVar, boolean z) {
            return vh.a;
        }
    }

    public static <R> xh<R> a() {
        return (xh<R>) b;
    }

    @Override // defpackage.wh
    public boolean a(Object obj, wh.a aVar) {
        return false;
    }
}
