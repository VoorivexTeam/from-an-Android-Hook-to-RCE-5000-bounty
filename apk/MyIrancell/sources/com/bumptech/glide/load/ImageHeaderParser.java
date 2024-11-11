package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.InterfaceC0475bc;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    /* renamed from: a */
    int mo3947a(InputStream inputStream, InterfaceC0475bc interfaceC0475bc);

    /* renamed from: a */
    ImageType mo3948a(InputStream inputStream);

    /* renamed from: a */
    ImageType mo3949a(ByteBuffer byteBuffer);
}
