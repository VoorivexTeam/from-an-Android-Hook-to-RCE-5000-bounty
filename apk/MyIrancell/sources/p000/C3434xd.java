package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C0575i;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p000.InterfaceC3031od;

/* renamed from: xd */
/* loaded from: classes.dex */
public class C3434xd<Data> implements InterfaceC3031od<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f14037b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a */
    private final c<Data> f14038a;

    /* renamed from: xd$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC3081pd<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f14039a;

        public a(ContentResolver contentResolver) {
            this.f14039a = contentResolver;
        }

        @Override // p000.C3434xd.c
        /* renamed from: a */
        public InterfaceC2853ka<AssetFileDescriptor> mo16486a(Uri uri) {
            return new C2546ha(this.f14039a, uri);
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<Uri, AssetFileDescriptor> mo139a(C3206sd c3206sd) {
            return new C3434xd(this);
        }
    }

    /* renamed from: xd$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC3081pd<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f14040a;

        public b(ContentResolver contentResolver) {
            this.f14040a = contentResolver;
        }

        @Override // p000.C3434xd.c
        /* renamed from: a */
        public InterfaceC2853ka<ParcelFileDescriptor> mo16486a(Uri uri) {
            return new C3078pa(this.f14040a, uri);
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<Uri, ParcelFileDescriptor> mo139a(C3206sd c3206sd) {
            return new C3434xd(this);
        }
    }

    /* renamed from: xd$c */
    /* loaded from: classes.dex */
    public interface c<Data> {
        /* renamed from: a */
        InterfaceC2853ka<Data> mo16486a(Uri uri);
    }

    /* renamed from: xd$d */
    /* loaded from: classes.dex */
    public static class d implements InterfaceC3081pd<Uri, InputStream>, c<InputStream> {

        /* renamed from: a */
        private final ContentResolver f14041a;

        public d(ContentResolver contentResolver) {
            this.f14041a = contentResolver;
        }

        @Override // p000.C3434xd.c
        /* renamed from: a */
        public InterfaceC2853ka<InputStream> mo16486a(Uri uri) {
            return new C3298ua(this.f14041a, uri);
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<Uri, InputStream> mo139a(C3206sd c3206sd) {
            return new C3434xd(this);
        }
    }

    public C3434xd(c<Data> cVar) {
        this.f14038a = cVar;
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3031od.a<Data> mo137a(Uri uri, int i, int i2, C0575i c0575i) {
        return new InterfaceC3031od.a<>(new C3529zh(uri), this.f14038a.mo16486a(uri));
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo138a(Uri uri) {
        return f14037b.contains(uri.getScheme());
    }
}
