package p000;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yg */
/* loaded from: classes.dex */
public final class C3486yg {

    /* renamed from: a */
    private final List<ImageHeaderParser> f14141a = new ArrayList();

    /* renamed from: a */
    public synchronized List<ImageHeaderParser> m16627a() {
        return this.f14141a;
    }

    /* renamed from: a */
    public synchronized void m16628a(ImageHeaderParser imageHeaderParser) {
        this.f14141a.add(imageHeaderParser);
    }
}
