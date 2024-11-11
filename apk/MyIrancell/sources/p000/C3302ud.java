package p000;

import android.util.Log;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.InterfaceC0570d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ud */
/* loaded from: classes.dex */
public class C3302ud implements InterfaceC0570d<InputStream> {

    /* renamed from: a */
    private final InterfaceC0475bc f13464a;

    public C3302ud(InterfaceC0475bc interfaceC0475bc) {
        this.f13464a = interfaceC0475bc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // com.bumptech.glide.load.InterfaceC0570d
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo3950a(InputStream inputStream, File file, C0575i c0575i) {
        byte[] bArr = (byte[]) this.f13464a.mo3379b(65536, byte[].class);
        boolean z = false;
        ?? r1 = 0;
        r1 = 0;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            r1 = -1;
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        } catch (IOException unused) {
                            r1 = fileOutputStream;
                            Log.isLoggable("StreamEncoder", 3);
                            if (r1 != 0) {
                                r1.close();
                                r1 = r1;
                            }
                            this.f13464a.mo3378a((InterfaceC0475bc) bArr);
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            r1 = fileOutputStream;
                            if (r1 != 0) {
                                try {
                                    r1.close();
                                } catch (IOException unused2) {
                                }
                            }
                            this.f13464a.mo3378a((InterfaceC0475bc) bArr);
                            throw th;
                        }
                    }
                    fileOutputStream.close();
                    z = true;
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
            }
            this.f13464a.mo3378a((InterfaceC0475bc) bArr);
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
