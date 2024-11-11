package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p000.C3435xe;
import p000.InterfaceC0475bc;

/* renamed from: com.bumptech.glide.load.f */
/* loaded from: classes.dex */
public final class C0572f {
    /* renamed from: a */
    public static int m3951a(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC0475bc interfaceC0475bc) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C3435xe(inputStream, interfaceC0475bc);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int mo3947a = list.get(i).mo3947a(inputStream, interfaceC0475bc);
                if (mo3947a != -1) {
                    return mo3947a;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static ImageHeaderParser.ImageType m3952a(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType mo3949a = list.get(i).mo3949a(byteBuffer);
            if (mo3949a != ImageHeaderParser.ImageType.UNKNOWN) {
                return mo3949a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: b */
    public static ImageHeaderParser.ImageType m3953b(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC0475bc interfaceC0475bc) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C3435xe(inputStream, interfaceC0475bc);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType mo3948a = list.get(i).mo3948a(inputStream);
                if (mo3948a != ImageHeaderParser.ImageType.UNKNOWN) {
                    return mo3948a;
                }
            } finally {
                inputStream.reset();
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
