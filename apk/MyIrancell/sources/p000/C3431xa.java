package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0558c;
import com.bumptech.glide.EnumC0562g;
import com.bumptech.glide.load.EnumC0567a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p000.InterfaceC2853ka;

/* renamed from: xa */
/* loaded from: classes.dex */
public class C3431xa implements InterfaceC2853ka<InputStream> {

    /* renamed from: b */
    private final Uri f14013b;

    /* renamed from: c */
    private final C3519za f14014c;

    /* renamed from: d */
    private InputStream f14015d;

    /* renamed from: xa$a */
    /* loaded from: classes.dex */
    static class a implements InterfaceC3480ya {

        /* renamed from: b */
        private static final String[] f14016b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f14017a;

        a(ContentResolver contentResolver) {
            this.f14017a = contentResolver;
        }

        @Override // p000.InterfaceC3480ya
        /* renamed from: a */
        public Cursor mo16479a(Uri uri) {
            return this.f14017a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f14016b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: xa$b */
    /* loaded from: classes.dex */
    static class b implements InterfaceC3480ya {

        /* renamed from: b */
        private static final String[] f14018b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f14019a;

        b(ContentResolver contentResolver) {
            this.f14019a = contentResolver;
        }

        @Override // p000.InterfaceC3480ya
        /* renamed from: a */
        public Cursor mo16479a(Uri uri) {
            return this.f14019a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f14018b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    C3431xa(Uri uri, C3519za c3519za) {
        this.f14013b = uri;
        this.f14014c = c3519za;
    }

    /* renamed from: a */
    public static C3431xa m16475a(Context context, Uri uri) {
        return m16476a(context, uri, new a(context.getContentResolver()));
    }

    /* renamed from: a */
    private static C3431xa m16476a(Context context, Uri uri, InterfaceC3480ya interfaceC3480ya) {
        return new C3431xa(uri, new C3519za(ComponentCallbacks2C0558c.m3866b(context).m3881g().m3905a(), interfaceC3480ya, ComponentCallbacks2C0558c.m3866b(context).m3875b(), context.getContentResolver()));
    }

    /* renamed from: b */
    public static C3431xa m16477b(Context context, Uri uri) {
        return m16476a(context, uri, new b(context.getContentResolver()));
    }

    /* renamed from: d */
    private InputStream m16478d() {
        InputStream m16913b = this.f14014c.m16913b(this.f14013b);
        int m16912a = m16913b != null ? this.f14014c.m16912a(this.f14013b) : -1;
        return m16912a != -1 ? new C2980na(m16913b, m16912a) : m16913b;
    }

    @Override // p000.InterfaceC2853ka
    /* renamed from: a */
    public Class<InputStream> mo3663a() {
        return InputStream.class;
    }

    @Override // p000.InterfaceC2853ka
    /* renamed from: a */
    public void mo3664a(EnumC0562g enumC0562g, InterfaceC2853ka.a<? super InputStream> aVar) {
        try {
            InputStream m16478d = m16478d();
            this.f14015d = m16478d;
            aVar.mo3639a((InterfaceC2853ka.a<? super InputStream>) m16478d);
        } catch (FileNotFoundException e) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.mo3638a((Exception) e);
        }
    }

    @Override // p000.InterfaceC2853ka
    /* renamed from: b */
    public void mo3665b() {
        InputStream inputStream = this.f14015d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // p000.InterfaceC2853ka
    /* renamed from: c */
    public EnumC0567a mo3666c() {
        return EnumC0567a.LOCAL;
    }

    @Override // p000.InterfaceC2853ka
    public void cancel() {
    }
}
