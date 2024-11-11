package p000;

import java.io.EOFException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p000.AbstractC2852k9;

/* renamed from: m9 */
/* loaded from: classes.dex */
final class C2928m9 extends AbstractC2852k9 {

    /* renamed from: o */
    private static final ByteString f12099o = ByteString.encodeUtf8("'\\");

    /* renamed from: p */
    private static final ByteString f12100p = ByteString.encodeUtf8("\"\\");

    /* renamed from: q */
    private static final ByteString f12101q = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: r */
    private static final ByteString f12102r = ByteString.encodeUtf8("\n\r");

    /* renamed from: s */
    private static final ByteString f12103s = ByteString.encodeUtf8("*/");

    /* renamed from: i */
    private final BufferedSource f12104i;

    /* renamed from: j */
    private final Buffer f12105j;

    /* renamed from: k */
    private int f12106k = 0;

    /* renamed from: l */
    private long f12107l;

    /* renamed from: m */
    private int f12108m;

    /* renamed from: n */
    private String f12109n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2928m9(BufferedSource bufferedSource) {
        if (bufferedSource == null) {
            throw new NullPointerException("source == null");
        }
        this.f12104i = bufferedSource;
        this.f12105j = bufferedSource.getBuffer();
        m13637a(6);
    }

    /* renamed from: a */
    private int m14071a(String str, AbstractC2852k9.a aVar) {
        int length = aVar.f11672a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f11672a[i])) {
                this.f12106k = 0;
                this.f11668d[this.f11666b - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.f12105j.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r1 != 47) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r6.f12104i.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        m14076p();
        r3 = r6.f12105j.getByte(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r3 == 42) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r6.f12105j.readByte();
        r6.f12105j.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (m14082v() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        m13635a("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        r6.f12105j.readByte();
        r6.f12105j.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        m14083w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0076, code lost:
    
        if (r1 != 35) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0078, code lost:
    
        m14076p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        return r1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m14072a(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            okio.BufferedSource r2 = r6.f12104i
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L7f
            okio.Buffer r2 = r6.f12105j
            long r4 = (long) r1
            byte r1 = r2.getByte(r4)
            r2 = 10
            if (r1 == r2) goto L7d
            r2 = 32
            if (r1 == r2) goto L7d
            r2 = 13
            if (r1 == r2) goto L7d
            r2 = 9
            if (r1 != r2) goto L25
            goto L7d
        L25:
            okio.Buffer r2 = r6.f12105j
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L74
            okio.BufferedSource r3 = r6.f12104i
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r6.m14076p()
            okio.Buffer r3 = r6.f12105j
            r4 = 1
            byte r3 = r3.getByte(r4)
            r4 = 42
            if (r3 == r4) goto L5c
            if (r3 == r2) goto L4e
            return r1
        L4e:
            okio.Buffer r1 = r6.f12105j
            r1.readByte()
            okio.Buffer r1 = r6.f12105j
            r1.readByte()
        L58:
            r6.m14083w()
            goto L1
        L5c:
            okio.Buffer r1 = r6.f12105j
            r1.readByte()
            okio.Buffer r1 = r6.f12105j
            r1.readByte()
            boolean r1 = r6.m14082v()
            if (r1 == 0) goto L6d
            goto L1
        L6d:
            java.lang.String r7 = "Unterminated comment"
            r6.m13635a(r7)
            r7 = 0
            throw r7
        L74:
            r2 = 35
            if (r1 != r2) goto L7c
            r6.m14076p()
            goto L58
        L7c:
            return r1
        L7d:
            r1 = r3
            goto L2
        L7f:
            if (r7 != 0) goto L83
            r7 = -1
            return r7
        L83:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            goto L8c
        L8b:
            throw r7
        L8c:
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2928m9.m14072a(boolean):int");
    }

    /* renamed from: a */
    private String m14073a(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long indexOfElement = this.f12104i.indexOfElement(byteString);
            if (indexOfElement == -1) {
                m13635a("Unterminated string");
                throw null;
            }
            if (this.f12105j.getByte(indexOfElement) != 92) {
                String readUtf8 = this.f12105j.readUtf8(indexOfElement);
                if (sb == null) {
                    this.f12105j.readByte();
                    return readUtf8;
                }
                sb.append(readUtf8);
                this.f12105j.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.f12105j.readUtf8(indexOfElement));
            this.f12105j.readByte();
            sb.append(m14081u());
        }
    }

    /* renamed from: b */
    private void m14074b(ByteString byteString) {
        while (true) {
            long indexOfElement = this.f12104i.indexOfElement(byteString);
            if (indexOfElement == -1) {
                m13635a("Unterminated string");
                throw null;
            }
            if (this.f12105j.getByte(indexOfElement) != 92) {
                this.f12105j.skip(indexOfElement + 1);
                return;
            } else {
                this.f12105j.skip(indexOfElement + 1);
                m14081u();
            }
        }
    }

    /* renamed from: b */
    private boolean m14075b(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m14076p();
        return false;
    }

    /* renamed from: p */
    private void m14076p() {
        if (this.f11670f) {
            return;
        }
        m13635a("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* renamed from: q */
    private int m14077q() {
        int i;
        int[] iArr = this.f11667c;
        int i2 = this.f11666b;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else {
            if (i3 != 2) {
                if (i3 == 3 || i3 == 5) {
                    this.f11667c[this.f11666b - 1] = 4;
                    if (i3 == 5) {
                        int m14072a = m14072a(true);
                        this.f12105j.readByte();
                        if (m14072a != 44) {
                            if (m14072a != 59) {
                                if (m14072a != 125) {
                                    m13635a("Unterminated object");
                                    throw null;
                                }
                                i = 2;
                            } else {
                                m14076p();
                            }
                        }
                    }
                    int m14072a2 = m14072a(true);
                    if (m14072a2 == 34) {
                        this.f12105j.readByte();
                        i = 13;
                    } else if (m14072a2 == 39) {
                        this.f12105j.readByte();
                        m14076p();
                        i = 12;
                    } else if (m14072a2 != 125) {
                        m14076p();
                        if (!m14075b((char) m14072a2)) {
                            m13635a("Expected name");
                            throw null;
                        }
                        i = 14;
                    } else {
                        if (i3 == 5) {
                            m13635a("Expected name");
                            throw null;
                        }
                        this.f12105j.readByte();
                        i = 2;
                    }
                } else if (i3 == 4) {
                    iArr[i2 - 1] = 5;
                    int m14072a3 = m14072a(true);
                    this.f12105j.readByte();
                    if (m14072a3 != 58) {
                        if (m14072a3 != 61) {
                            m13635a("Expected ':'");
                            throw null;
                        }
                        m14076p();
                        if (this.f12104i.request(1L) && this.f12105j.getByte(0L) == 62) {
                            this.f12105j.readByte();
                        }
                    }
                } else if (i3 == 6) {
                    iArr[i2 - 1] = 7;
                } else if (i3 == 7) {
                    if (m14072a(false) == -1) {
                        i = 18;
                    }
                    m14076p();
                } else if (i3 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.f12106k = i;
                return i;
            }
            int m14072a4 = m14072a(true);
            this.f12105j.readByte();
            if (m14072a4 != 44) {
                if (m14072a4 != 59) {
                    if (m14072a4 == 93) {
                        this.f12106k = 4;
                        return 4;
                    }
                    m13635a("Unterminated array");
                    throw null;
                }
                m14076p();
            }
        }
        int m14072a5 = m14072a(true);
        if (m14072a5 != 34) {
            if (m14072a5 == 39) {
                m14076p();
                this.f12105j.readByte();
                this.f12106k = 8;
                return 8;
            }
            if (m14072a5 != 44 && m14072a5 != 59) {
                if (m14072a5 == 91) {
                    this.f12105j.readByte();
                    this.f12106k = 3;
                    return 3;
                }
                if (m14072a5 != 93) {
                    if (m14072a5 == 123) {
                        this.f12105j.readByte();
                        this.f12106k = 1;
                        return 1;
                    }
                    int m14079s = m14079s();
                    if (m14079s != 0) {
                        return m14079s;
                    }
                    int m14080t = m14080t();
                    if (m14080t != 0) {
                        return m14080t;
                    }
                    if (!m14075b(this.f12105j.getByte(0L))) {
                        m13635a("Expected value");
                        throw null;
                    }
                    m14076p();
                    i = 10;
                } else if (i3 == 1) {
                    this.f12105j.readByte();
                    i = 4;
                }
            }
            if (i3 != 1 && i3 != 2) {
                m13635a("Unexpected value");
                throw null;
            }
            m14076p();
            this.f12106k = 7;
            return 7;
        }
        this.f12105j.readByte();
        i = 9;
        this.f12106k = i;
        return i;
    }

    /* renamed from: r */
    private String m14078r() {
        long indexOfElement = this.f12104i.indexOfElement(f12101q);
        return indexOfElement != -1 ? this.f12105j.readUtf8(indexOfElement) : this.f12105j.readUtf8();
    }

    /* renamed from: s */
    private int m14079s() {
        int i;
        String str;
        String str2;
        byte b = this.f12105j.getByte(0L);
        if (b == 116 || b == 84) {
            i = 5;
            str = "true";
            str2 = "TRUE";
        } else if (b == 102 || b == 70) {
            i = 6;
            str = "false";
            str2 = "FALSE";
        } else {
            if (b != 110 && b != 78) {
                return 0;
            }
            i = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f12104i.request(i3)) {
                return 0;
            }
            byte b2 = this.f12105j.getByte(i2);
            if (b2 != str.charAt(i2) && b2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f12104i.request(length + 1) && m14075b(this.f12105j.getByte(length))) {
            return 0;
        }
        this.f12105j.skip(length);
        this.f12106k = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0089, code lost:
    
        if (m14075b(r11) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008b, code lost:
    
        if (r6 != 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008d, code lost:
    
        if (r7 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
    
        if (r10 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
    
        if (r8 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009b, code lost:
    
        if (r10 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009d, code lost:
    
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a0, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a1, code lost:
    
        r16.f12107l = r8;
        r16.f12105j.skip(r5);
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ab, code lost:
    
        r16.f12106k = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ad, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ae, code lost:
    
        if (r6 == 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b1, code lost:
    
        if (r6 == 4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b4, code lost:
    
        if (r6 != 7) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b7, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b9, code lost:
    
        r16.f12108m = r5;
        r1 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00be, code lost:
    
        return 0;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m14080t() {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2928m9.m14080t():int");
    }

    /* renamed from: u */
    private char m14081u() {
        int i;
        int i2;
        if (!this.f12104i.request(1L)) {
            m13635a("Unterminated escape sequence");
            throw null;
        }
        byte readByte = this.f12105j.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            if (this.f11670f) {
                return (char) readByte;
            }
            m13635a("Invalid escape sequence: \\" + ((char) readByte));
            throw null;
        }
        if (!this.f12104i.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + m13641f());
        }
        char c = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte b = this.f12105j.getByte(i3);
            char c2 = (char) (c << 4);
            if (b < 48 || b > 57) {
                if (b >= 97 && b <= 102) {
                    i = b - 97;
                } else {
                    if (b < 65 || b > 70) {
                        m13635a("\\u" + this.f12105j.readUtf8(4L));
                        throw null;
                    }
                    i = b - 65;
                }
                i2 = i + 10;
            } else {
                i2 = b - 48;
            }
            c = (char) (c2 + i2);
        }
        this.f12105j.skip(4L);
        return c;
    }

    /* renamed from: v */
    private boolean m14082v() {
        long indexOf = this.f12104i.indexOf(f12103s);
        boolean z = indexOf != -1;
        Buffer buffer = this.f12105j;
        buffer.skip(z ? indexOf + f12103s.size() : buffer.size());
        return z;
    }

    /* renamed from: w */
    private void m14083w() {
        long indexOfElement = this.f12104i.indexOfElement(f12102r);
        Buffer buffer = this.f12105j;
        buffer.skip(indexOfElement != -1 ? indexOfElement + 1 : buffer.size());
    }

    /* renamed from: x */
    private void m14084x() {
        long indexOfElement = this.f12104i.indexOfElement(f12101q);
        Buffer buffer = this.f12105j;
        if (indexOfElement == -1) {
            indexOfElement = buffer.size();
        }
        buffer.skip(indexOfElement);
    }

    @Override // p000.AbstractC2852k9
    /* renamed from: a */
    public int mo13634a(AbstractC2852k9.a aVar) {
        int i = this.f12106k;
        if (i == 0) {
            i = m14077q();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m14071a(this.f12109n, aVar);
        }
        int select = this.f12104i.select(aVar.f11673b);
        if (select != -1) {
            this.f12106k = 0;
            this.f11668d[this.f11666b - 1] = aVar.f11672a[select];
            return select;
        }
        String str = this.f11668d[this.f11666b - 1];
        String mo13646l = mo13646l();
        int m14071a = m14071a(mo13646l, aVar);
        if (m14071a == -1) {
            this.f12106k = 15;
            this.f12109n = mo13646l;
            this.f11668d[this.f11666b - 1] = str;
        }
        return m14071a;
    }

    @Override // p000.AbstractC2852k9
    /* renamed from: a */
    public void mo13636a() {
        int i = this.f12106k;
        if (i == 0) {
            i = m14077q();
        }
        if (i == 3) {
            m13637a(1);
            this.f11669e[this.f11666b - 1] = 0;
            this.f12106k = 0;
        } else {
            throw new C2584i9("Expected BEGIN_ARRAY but was " + peek() + " at path " + m13641f());
        }
    }

    @Override // p000.AbstractC2852k9
    /* renamed from: c */
    public void mo13638c() {
        int i = this.f12106k;
        if (i == 0) {
            i = m14077q();
        }
        if (i == 1) {
            m13637a(3);
            this.f12106k = 0;
            return;
        }
        throw new C2584i9("Expected BEGIN_OBJECT but was " + peek() + " at path " + m13641f());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12106k = 0;
        this.f11667c[0] = 8;
        this.f11666b = 1;
        this.f12105j.clear();
        this.f12104i.close();
    }

    @Override // p000.AbstractC2852k9
    /* renamed from: d */
    public void mo13639d() {
        int i = this.f12106k;
        if (i == 0) {
            i = m14077q();
        }
        if (i != 4) {
            throw new C2584i9("Expected END_ARRAY but was " + peek() + " at path " + m13641f());
        }
        int i2 = this.f11666b - 1;
        this.f11666b = i2;
        int[] iArr = this.f11669e;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f12106k = 0;
    }

    @Override // p000.AbstractC2852k9
    /* renamed from: e */
    public void mo13640e() {
        int i = this.f12106k;
        if (i == 0) {
            i = m14077q();
        }
        if (i != 2) {
            throw new C2584i9("Expected END_OBJECT but was " + peek() + " at path " + m13641f());
        }
        int i2 = this.f11666b - 1;
        this.f11666b = i2;
        this.f11668d[i2] = null;
        int[] iArr = this.f11669e;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f12106k = 0;
    }

    @Override // p000.AbstractC2852k9
    /* renamed from: h */
    public boolean mo13642h() {
        int i = this.f12106k;
        if (i == 0) {
            i = m14077q();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // p000.AbstractC2852k9
    /* renamed from: i */
    public boolean mo13643i() {
        int i = this.f12106k;
        if (i == 0) {
            i = m14077q();
        }
        if (i == 5) {
            this.f12106k = 0;
            int[] iArr = this.f11669e;
            int i2 = this.f11666b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.f12106k = 0;
            int[] iArr2 = this.f11669e;
            int i3 = this.f11666b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new C2584i9("Expected a boolean but was " + peek() + " at path " + m13641f());
    }

    @Override // p000.AbstractC2852k9
    /* renamed from: j */
    public double mo13644j() {
        String m14078r;
        ByteString byteString;
        double parseDouble;
        int i = this.f12106k;
        if (i == 0) {
            i = m14077q();
        }
        if (i == 16) {
            this.f12106k = 0;
            int[] iArr = this.f11669e;
            int i2 = this.f11666b - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f12107l;
        }
        try {
            if (i == 17) {
                m14078r = this.f12105j.readUtf8(this.f12108m);
            } else {
                if (i == 9) {
                    byteString = f12100p;
                } else if (i == 8) {
                    byteString = f12099o;
                } else {
                    if (i != 10) {
                        if (i != 11) {
                            throw new C2584i9("Expected a double but was " + peek() + " at path " + m13641f());
                        }
                        this.f12106k = 11;
                        parseDouble = Double.parseDouble(this.f12109n);
                        if (this.f11670f && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                            throw new C2807j9("JSON forbids NaN and infinities: " + parseDouble + " at path " + m13641f());
                        }
                        this.f12109n = null;
                        this.f12106k = 0;
                        int[] iArr2 = this.f11669e;
                        int i3 = this.f11666b - 1;
                        iArr2[i3] = iArr2[i3] + 1;
                        return parseDouble;
                    }
                    m14078r = m14078r();
                }
                m14078r = m14073a(byteString);
            }
            parseDouble = Double.parseDouble(this.f12109n);
            if (this.f11670f) {
            }
            this.f12109n = null;
            this.f12106k = 0;
            int[] iArr22 = this.f11669e;
            int i32 = this.f11666b - 1;
            iArr22[i32] = iArr22[i32] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new C2584i9("Expected a double but was " + this.f12109n + " at path " + m13641f());
        }
        this.f12109n = m14078r;
        this.f12106k = 11;
    }

    @Override // p000.AbstractC2852k9
    /* renamed from: k */
    public int mo13645k() {
        int i = this.f12106k;
        if (i == 0) {
            i = m14077q();
        }
        if (i == 16) {
            long j = this.f12107l;
            int i2 = (int) j;
            if (j == i2) {
                this.f12106k = 0;
                int[] iArr = this.f11669e;
                int i3 = this.f11666b - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C2584i9("Expected an int but was " + this.f12107l + " at path " + m13641f());
        }
        if (i == 17) {
            this.f12109n = this.f12105j.readUtf8(this.f12108m);
        } else if (i == 9 || i == 8) {
            String m14073a = m14073a(i == 9 ? f12100p : f12099o);
            this.f12109n = m14073a;
            try {
                int parseInt = Integer.parseInt(m14073a);
                this.f12106k = 0;
                int[] iArr2 = this.f11669e;
                int i4 = this.f11666b - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new C2584i9("Expected an int but was " + peek() + " at path " + m13641f());
        }
        this.f12106k = 11;
        try {
            double parseDouble = Double.parseDouble(this.f12109n);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.f12109n = null;
                this.f12106k = 0;
                int[] iArr3 = this.f11669e;
                int i6 = this.f11666b - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new C2584i9("Expected an int but was " + this.f12109n + " at path " + m13641f());
        } catch (NumberFormatException unused2) {
            throw new C2584i9("Expected an int but was " + this.f12109n + " at path " + m13641f());
        }
    }

    @Override // p000.AbstractC2852k9
    /* renamed from: l */
    public String mo13646l() {
        String str;
        ByteString byteString;
        int i = this.f12106k;
        if (i == 0) {
            i = m14077q();
        }
        if (i == 14) {
            str = m14078r();
        } else {
            if (i == 13) {
                byteString = f12100p;
            } else if (i == 12) {
                byteString = f12099o;
            } else {
                if (i != 15) {
                    throw new C2584i9("Expected a name but was " + peek() + " at path " + m13641f());
                }
                str = this.f12109n;
            }
            str = m14073a(byteString);
        }
        this.f12106k = 0;
        this.f11668d[this.f11666b - 1] = str;
        return str;
    }

    @Override // p000.AbstractC2852k9
    /* renamed from: m */
    public String mo13647m() {
        String readUtf8;
        ByteString byteString;
        int i = this.f12106k;
        if (i == 0) {
            i = m14077q();
        }
        if (i == 10) {
            readUtf8 = m14078r();
        } else {
            if (i == 9) {
                byteString = f12100p;
            } else if (i == 8) {
                byteString = f12099o;
            } else if (i == 11) {
                readUtf8 = this.f12109n;
                this.f12109n = null;
            } else if (i == 16) {
                readUtf8 = Long.toString(this.f12107l);
            } else {
                if (i != 17) {
                    throw new C2584i9("Expected a string but was " + peek() + " at path " + m13641f());
                }
                readUtf8 = this.f12105j.readUtf8(this.f12108m);
            }
            readUtf8 = m14073a(byteString);
        }
        this.f12106k = 0;
        int[] iArr = this.f11669e;
        int i2 = this.f11666b - 1;
        iArr[i2] = iArr[i2] + 1;
        return readUtf8;
    }

    @Override // p000.AbstractC2852k9
    /* renamed from: n */
    public void mo13648n() {
        ByteString byteString;
        if (this.f11671g) {
            throw new C2584i9("Cannot skip unexpected " + peek() + " at " + m13641f());
        }
        int i = this.f12106k;
        if (i == 0) {
            i = m14077q();
        }
        if (i == 14) {
            m14084x();
        } else {
            if (i == 13) {
                byteString = f12100p;
            } else if (i == 12) {
                byteString = f12099o;
            } else if (i != 15) {
                throw new C2584i9("Expected a name but was " + peek() + " at path " + m13641f());
            }
            m14074b(byteString);
        }
        this.f12106k = 0;
        this.f11668d[this.f11666b - 1] = "null";
    }

    @Override // p000.AbstractC2852k9
    /* renamed from: o */
    public void mo13649o() {
        ByteString byteString;
        if (this.f11671g) {
            throw new C2584i9("Cannot skip unexpected " + peek() + " at " + m13641f());
        }
        int i = 0;
        do {
            int i2 = this.f12106k;
            if (i2 == 0) {
                i2 = m14077q();
            }
            if (i2 == 3) {
                m13637a(1);
            } else if (i2 == 1) {
                m13637a(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        throw new C2584i9("Expected a value but was " + peek() + " at path " + m13641f());
                    }
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        throw new C2584i9("Expected a value but was " + peek() + " at path " + m13641f());
                    }
                } else {
                    if (i2 == 14 || i2 == 10) {
                        m14084x();
                    } else {
                        if (i2 == 9 || i2 == 13) {
                            byteString = f12100p;
                        } else if (i2 == 8 || i2 == 12) {
                            byteString = f12099o;
                        } else if (i2 == 17) {
                            this.f12105j.skip(this.f12108m);
                        } else if (i2 == 18) {
                            throw new C2584i9("Expected a value but was " + peek() + " at path " + m13641f());
                        }
                        m14074b(byteString);
                    }
                    this.f12106k = 0;
                }
                this.f11666b--;
                this.f12106k = 0;
            }
            i++;
            this.f12106k = 0;
        } while (i != 0);
        int[] iArr = this.f11669e;
        int i3 = this.f11666b;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f11668d[i3 - 1] = "null";
    }

    @Override // p000.AbstractC2852k9
    public AbstractC2852k9.b peek() {
        int i = this.f12106k;
        if (i == 0) {
            i = m14077q();
        }
        switch (i) {
            case 1:
                return AbstractC2852k9.b.BEGIN_OBJECT;
            case 2:
                return AbstractC2852k9.b.END_OBJECT;
            case 3:
                return AbstractC2852k9.b.BEGIN_ARRAY;
            case 4:
                return AbstractC2852k9.b.END_ARRAY;
            case 5:
            case 6:
                return AbstractC2852k9.b.BOOLEAN;
            case 7:
                return AbstractC2852k9.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC2852k9.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return AbstractC2852k9.b.NAME;
            case 16:
            case 17:
                return AbstractC2852k9.b.NUMBER;
            case 18:
                return AbstractC2852k9.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonReader(" + this.f12104i + ")";
    }
}
