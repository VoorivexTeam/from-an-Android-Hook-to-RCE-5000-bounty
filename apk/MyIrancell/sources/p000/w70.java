package p000;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import okio.Buffer;
import okio.BufferedSink;

/* loaded from: classes.dex */
public final class w70 extends h80 {

    /* renamed from: c */
    private static final b80 f13777c = b80.m3340a("application/x-www-form-urlencoded");

    /* renamed from: a */
    private final List<String> f13778a;

    /* renamed from: b */
    private final List<String> f13779b;

    /* renamed from: w70$a */
    /* loaded from: classes.dex */
    public static final class C3388a {

        /* renamed from: a */
        private final List<String> f13780a;

        /* renamed from: b */
        private final List<String> f13781b;

        /* renamed from: c */
        private final Charset f13782c;

        public C3388a() {
            this(null);
        }

        public C3388a(Charset charset) {
            this.f13780a = new ArrayList();
            this.f13781b = new ArrayList();
            this.f13782c = charset;
        }

        /* renamed from: a */
        public C3388a m16154a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f13780a.add(z70.m16793a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f13782c));
            this.f13781b.add(z70.m16793a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f13782c));
            return this;
        }

        /* renamed from: a */
        public w70 m16155a() {
            return new w70(this.f13780a, this.f13781b);
        }

        /* renamed from: b */
        public C3388a m16156b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f13780a.add(z70.m16793a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f13782c));
            this.f13781b.add(z70.m16793a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f13782c));
            return this;
        }
    }

    w70(List<String> list, List<String> list2) {
        this.f13778a = o80.m14451a(list);
        this.f13779b = o80.m14451a(list2);
    }

    /* renamed from: a */
    private long m16153a(@Nullable BufferedSink bufferedSink, boolean z) {
        Buffer buffer = z ? new Buffer() : bufferedSink.buffer();
        int size = this.f13778a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8(this.f13778a.get(i));
            buffer.writeByte(61);
            buffer.writeUtf8(this.f13779b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    @Override // p000.h80
    /* renamed from: a */
    public long mo3610a() {
        return m16153a((BufferedSink) null, true);
    }

    @Override // p000.h80
    /* renamed from: a */
    public void mo3611a(BufferedSink bufferedSink) {
        m16153a(bufferedSink, false);
    }

    @Override // p000.h80
    /* renamed from: b */
    public b80 mo3612b() {
        return f13777c;
    }
}
