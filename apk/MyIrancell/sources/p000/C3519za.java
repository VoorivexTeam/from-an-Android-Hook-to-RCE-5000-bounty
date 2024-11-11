package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C0572f;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: za */
/* loaded from: classes.dex */
class C3519za {

    /* renamed from: f */
    private static final C3350va f14414f = new C3350va();

    /* renamed from: a */
    private final C3350va f14415a;

    /* renamed from: b */
    private final InterfaceC3480ya f14416b;

    /* renamed from: c */
    private final InterfaceC0475bc f14417c;

    /* renamed from: d */
    private final ContentResolver f14418d;

    /* renamed from: e */
    private final List<ImageHeaderParser> f14419e;

    C3519za(List<ImageHeaderParser> list, C3350va c3350va, InterfaceC3480ya interfaceC3480ya, InterfaceC0475bc interfaceC0475bc, ContentResolver contentResolver) {
        this.f14415a = c3350va;
        this.f14416b = interfaceC3480ya;
        this.f14417c = interfaceC0475bc;
        this.f14418d = contentResolver;
        this.f14419e = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3519za(List<ImageHeaderParser> list, InterfaceC3480ya interfaceC3480ya, InterfaceC0475bc interfaceC0475bc, ContentResolver contentResolver) {
        this(list, f14414f, interfaceC3480ya, interfaceC0475bc, contentResolver);
    }

    /* renamed from: a */
    private boolean m16910a(File file) {
        return this.f14415a.m16007a(file) && 0 < this.f14415a.m16008b(file);
    }

    /* renamed from: c */
    private String m16911c(Uri uri) {
        Cursor mo16479a = this.f14416b.mo16479a(uri);
        if (mo16479a != null) {
            try {
                if (mo16479a.moveToFirst()) {
                    return mo16479a.getString(0);
                }
            } finally {
                if (mo16479a != null) {
                    mo16479a.close();
                }
            }
        }
        if (mo16479a != null) {
            mo16479a.close();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m16912a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f14418d.openInputStream(uri);
                int m3951a = C0572f.m3951a(this.f14419e, inputStream, this.f14417c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return m3951a;
            } catch (IOException | NullPointerException unused2) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    String str = "Failed to open uri: " + uri;
                }
                if (inputStream == null) {
                    return -1;
                }
                try {
                    inputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    public InputStream m16913b(Uri uri) {
        String m16911c = m16911c(uri);
        if (TextUtils.isEmpty(m16911c)) {
            return null;
        }
        File m16006a = this.f14415a.m16006a(m16911c);
        if (!m16910a(m16006a)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(m16006a);
        try {
            return this.f14418d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }
}
