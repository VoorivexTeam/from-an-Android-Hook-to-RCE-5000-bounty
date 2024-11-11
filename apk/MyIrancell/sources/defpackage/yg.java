package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class yg {
    private final List<ImageHeaderParser> a = new ArrayList();

    public synchronized List<ImageHeaderParser> a() {
        return this.a;
    }

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.a.add(imageHeaderParser);
    }
}
