package defpackage;

import defpackage.k9;
import java.io.EOFException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* loaded from: classes.dex */
final class m9 extends k9 {
    private static final ByteString o = ByteString.encodeUtf8("'\\");
    private static final ByteString p = ByteString.encodeUtf8("\"\\");
    private static final ByteString q = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
    private static final ByteString r = ByteString.encodeUtf8("\n\r");
    private static final ByteString s = ByteString.encodeUtf8("*/");
    private final BufferedSource i;
    private final Buffer j;
    private int k = 0;
    private long l;
    private int m;
    private String n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m9(BufferedSource bufferedSource) {
        if (bufferedSource == null) {
            throw new NullPointerException("source == null");
        }
        this.i = bufferedSource;
        this.j = bufferedSource.getBuffer();
        a(6);
    }

    private int a(String str, k9.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.k = 0;
                this.d[this.b - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.j.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r1 != 47) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r6.i.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        p();
        r3 = r6.j.getByte(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r3 == 42) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r6.j.readByte();
        r6.j.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (v() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        a("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        r6.j.readByte();
        r6.j.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        w();
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
    
        p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            okio.BufferedSource r2 = r6.i
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L7f
            okio.Buffer r2 = r6.j
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
            okio.Buffer r2 = r6.j
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L74
            okio.BufferedSource r3 = r6.i
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r6.p()
            okio.Buffer r3 = r6.j
            r4 = 1
            byte r3 = r3.getByte(r4)
            r4 = 42
            if (r3 == r4) goto L5c
            if (r3 == r2) goto L4e
            return r1
        L4e:
            okio.Buffer r1 = r6.j
            r1.readByte()
            okio.Buffer r1 = r6.j
            r1.readByte()
        L58:
            r6.w()
            goto L1
        L5c:
            okio.Buffer r1 = r6.j
            r1.readByte()
            okio.Buffer r1 = r6.j
            r1.readByte()
            boolean r1 = r6.v()
            if (r1 == 0) goto L6d
            goto L1
        L6d:
            java.lang.String r7 = "Unterminated comment"
            r6.a(r7)
            r7 = 0
            throw r7
        L74:
            r2 = 35
            if (r1 != r2) goto L7c
            r6.p()
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m9.a(boolean):int");
    }

    private String a(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long indexOfElement = this.i.indexOfElement(byteString);
            if (indexOfElement == -1) {
                a("Unterminated string");
                throw null;
            }
            if (this.j.getByte(indexOfElement) != 92) {
                String readUtf8 = this.j.readUtf8(indexOfElement);
                if (sb == null) {
                    this.j.readByte();
                    return readUtf8;
                }
                sb.append(readUtf8);
                this.j.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.j.readUtf8(indexOfElement));
            this.j.readByte();
            sb.append(u());
        }
    }

    private void b(ByteString byteString) {
        while (true) {
            long indexOfElement = this.i.indexOfElement(byteString);
            if (indexOfElement == -1) {
                a("Unterminated string");
                throw null;
            }
            if (this.j.getByte(indexOfElement) != 92) {
                this.j.skip(indexOfElement + 1);
                return;
            } else {
                this.j.skip(indexOfElement + 1);
                u();
            }
        }
    }

    private boolean b(int i) {
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
        p();
        return false;
    }

    private void p() {
        if (this.f) {
            return;
        }
        a("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    private int q() {
        int i;
        int[] iArr = this.c;
        int i2 = this.b;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else {
            if (i3 != 2) {
                if (i3 == 3 || i3 == 5) {
                    this.c[this.b - 1] = 4;
                    if (i3 == 5) {
                        int a = a(true);
                        this.j.readByte();
                        if (a != 44) {
                            if (a != 59) {
                                if (a != 125) {
                                    a("Unterminated object");
                                    throw null;
                                }
                                i = 2;
                            } else {
                                p();
                            }
                        }
                    }
                    int a2 = a(true);
                    if (a2 == 34) {
                        this.j.readByte();
                        i = 13;
                    } else if (a2 == 39) {
                        this.j.readByte();
                        p();
                        i = 12;
                    } else if (a2 != 125) {
                        p();
                        if (!b((char) a2)) {
                            a("Expected name");
                            throw null;
                        }
                        i = 14;
                    } else {
                        if (i3 == 5) {
                            a("Expected name");
                            throw null;
                        }
                        this.j.readByte();
                        i = 2;
                    }
                } else if (i3 == 4) {
                    iArr[i2 - 1] = 5;
                    int a3 = a(true);
                    this.j.readByte();
                    if (a3 != 58) {
                        if (a3 != 61) {
                            a("Expected ':'");
                            throw null;
                        }
                        p();
                        if (this.i.request(1L) && this.j.getByte(0L) == 62) {
                            this.j.readByte();
                        }
                    }
                } else if (i3 == 6) {
                    iArr[i2 - 1] = 7;
                } else if (i3 == 7) {
                    if (a(false) == -1) {
                        i = 18;
                    }
                    p();
                } else if (i3 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.k = i;
                return i;
            }
            int a4 = a(true);
            this.j.readByte();
            if (a4 != 44) {
                if (a4 != 59) {
                    if (a4 == 93) {
                        this.k = 4;
                        return 4;
                    }
                    a("Unterminated array");
                    throw null;
                }
                p();
            }
        }
        int a5 = a(true);
        if (a5 != 34) {
            if (a5 == 39) {
                p();
                this.j.readByte();
                this.k = 8;
                return 8;
            }
            if (a5 != 44 && a5 != 59) {
                if (a5 == 91) {
                    this.j.readByte();
                    this.k = 3;
                    return 3;
                }
                if (a5 != 93) {
                    if (a5 == 123) {
                        this.j.readByte();
                        this.k = 1;
                        return 1;
                    }
                    int s2 = s();
                    if (s2 != 0) {
                        return s2;
                    }
                    int t = t();
                    if (t != 0) {
                        return t;
                    }
                    if (!b(this.j.getByte(0L))) {
                        a("Expected value");
                        throw null;
                    }
                    p();
                    i = 10;
                } else if (i3 == 1) {
                    this.j.readByte();
                    i = 4;
                }
            }
            if (i3 != 1 && i3 != 2) {
                a("Unexpected value");
                throw null;
            }
            p();
            this.k = 7;
            return 7;
        }
        this.j.readByte();
        i = 9;
        this.k = i;
        return i;
    }

    private String r() {
        long indexOfElement = this.i.indexOfElement(q);
        return indexOfElement != -1 ? this.j.readUtf8(indexOfElement) : this.j.readUtf8();
    }

    private int s() {
        int i;
        String str;
        String str2;
        byte b = this.j.getByte(0L);
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
            if (!this.i.request(i3)) {
                return 0;
            }
            byte b2 = this.j.getByte(i2);
            if (b2 != str.charAt(i2) && b2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.i.request(length + 1) && b(this.j.getByte(length))) {
            return 0;
        }
        this.j.skip(length);
        this.k = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0089, code lost:
    
        if (b(r11) != false) goto L73;
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
    
        r16.l = r8;
        r16.j.skip(r5);
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ab, code lost:
    
        r16.k = r1;
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
    
        r16.m = r5;
        r1 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00be, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int t() {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m9.t():int");
    }

    private char u() {
        int i;
        int i2;
        if (!this.i.request(1L)) {
            a("Unterminated escape sequence");
            throw null;
        }
        byte readByte = this.j.readByte();
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
            if (this.f) {
                return (char) readByte;
            }
            a("Invalid escape sequence: \\" + ((char) readByte));
            throw null;
        }
        if (!this.i.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + f());
        }
        char c = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte b = this.j.getByte(i3);
            char c2 = (char) (c << 4);
            if (b < 48 || b > 57) {
                if (b >= 97 && b <= 102) {
                    i = b - 97;
                } else {
                    if (b < 65 || b > 70) {
                        a("\\u" + this.j.readUtf8(4L));
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
        this.j.skip(4L);
        return c;
    }

    private boolean v() {
        long indexOf = this.i.indexOf(s);
        boolean z = indexOf != -1;
        Buffer buffer = this.j;
        buffer.skip(z ? indexOf + s.size() : buffer.size());
        return z;
    }

    private void w() {
        long indexOfElement = this.i.indexOfElement(r);
        Buffer buffer = this.j;
        buffer.skip(indexOfElement != -1 ? indexOfElement + 1 : buffer.size());
    }

    private void x() {
        long indexOfElement = this.i.indexOfElement(q);
        Buffer buffer = this.j;
        if (indexOfElement == -1) {
            indexOfElement = buffer.size();
        }
        buffer.skip(indexOfElement);
    }

    @Override // defpackage.k9
    public int a(k9.a aVar) {
        int i = this.k;
        if (i == 0) {
            i = q();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return a(this.n, aVar);
        }
        int select = this.i.select(aVar.b);
        if (select != -1) {
            this.k = 0;
            this.d[this.b - 1] = aVar.a[select];
            return select;
        }
        String str = this.d[this.b - 1];
        String l = l();
        int a = a(l, aVar);
        if (a == -1) {
            this.k = 15;
            this.n = l;
            this.d[this.b - 1] = str;
        }
        return a;
    }

    @Override // defpackage.k9
    public void a() {
        int i = this.k;
        if (i == 0) {
            i = q();
        }
        if (i == 3) {
            a(1);
            this.e[this.b - 1] = 0;
            this.k = 0;
        } else {
            throw new i9("Expected BEGIN_ARRAY but was " + peek() + " at path " + f());
        }
    }

    @Override // defpackage.k9
    public void c() {
        int i = this.k;
        if (i == 0) {
            i = q();
        }
        if (i == 1) {
            a(3);
            this.k = 0;
            return;
        }
        throw new i9("Expected BEGIN_OBJECT but was " + peek() + " at path " + f());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.k = 0;
        this.c[0] = 8;
        this.b = 1;
        this.j.clear();
        this.i.close();
    }

    @Override // defpackage.k9
    public void d() {
        int i = this.k;
        if (i == 0) {
            i = q();
        }
        if (i != 4) {
            throw new i9("Expected END_ARRAY but was " + peek() + " at path " + f());
        }
        int i2 = this.b - 1;
        this.b = i2;
        int[] iArr = this.e;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.k = 0;
    }

    @Override // defpackage.k9
    public void e() {
        int i = this.k;
        if (i == 0) {
            i = q();
        }
        if (i != 2) {
            throw new i9("Expected END_OBJECT but was " + peek() + " at path " + f());
        }
        int i2 = this.b - 1;
        this.b = i2;
        this.d[i2] = null;
        int[] iArr = this.e;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.k = 0;
    }

    @Override // defpackage.k9
    public boolean h() {
        int i = this.k;
        if (i == 0) {
            i = q();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // defpackage.k9
    public boolean i() {
        int i = this.k;
        if (i == 0) {
            i = q();
        }
        if (i == 5) {
            this.k = 0;
            int[] iArr = this.e;
            int i2 = this.b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.k = 0;
            int[] iArr2 = this.e;
            int i3 = this.b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new i9("Expected a boolean but was " + peek() + " at path " + f());
    }

    @Override // defpackage.k9
    public double j() {
        String r2;
        ByteString byteString;
        double parseDouble;
        int i = this.k;
        if (i == 0) {
            i = q();
        }
        if (i == 16) {
            this.k = 0;
            int[] iArr = this.e;
            int i2 = this.b - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.l;
        }
        try {
            if (i == 17) {
                r2 = this.j.readUtf8(this.m);
            } else {
                if (i == 9) {
                    byteString = p;
                } else if (i == 8) {
                    byteString = o;
                } else {
                    if (i != 10) {
                        if (i != 11) {
                            throw new i9("Expected a double but was " + peek() + " at path " + f());
                        }
                        this.k = 11;
                        parseDouble = Double.parseDouble(this.n);
                        if (this.f && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                            throw new j9("JSON forbids NaN and infinities: " + parseDouble + " at path " + f());
                        }
                        this.n = null;
                        this.k = 0;
                        int[] iArr2 = this.e;
                        int i3 = this.b - 1;
                        iArr2[i3] = iArr2[i3] + 1;
                        return parseDouble;
                    }
                    r2 = r();
                }
                r2 = a(byteString);
            }
            parseDouble = Double.parseDouble(this.n);
            if (this.f) {
            }
            this.n = null;
            this.k = 0;
            int[] iArr22 = this.e;
            int i32 = this.b - 1;
            iArr22[i32] = iArr22[i32] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new i9("Expected a double but was " + this.n + " at path " + f());
        }
        this.n = r2;
        this.k = 11;
    }

    @Override // defpackage.k9
    public int k() {
        int i = this.k;
        if (i == 0) {
            i = q();
        }
        if (i == 16) {
            long j = this.l;
            int i2 = (int) j;
            if (j == i2) {
                this.k = 0;
                int[] iArr = this.e;
                int i3 = this.b - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new i9("Expected an int but was " + this.l + " at path " + f());
        }
        if (i == 17) {
            this.n = this.j.readUtf8(this.m);
        } else if (i == 9 || i == 8) {
            String a = a(i == 9 ? p : o);
            this.n = a;
            try {
                int parseInt = Integer.parseInt(a);
                this.k = 0;
                int[] iArr2 = this.e;
                int i4 = this.b - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new i9("Expected an int but was " + peek() + " at path " + f());
        }
        this.k = 11;
        try {
            double parseDouble = Double.parseDouble(this.n);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.n = null;
                this.k = 0;
                int[] iArr3 = this.e;
                int i6 = this.b - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new i9("Expected an int but was " + this.n + " at path " + f());
        } catch (NumberFormatException unused2) {
            throw new i9("Expected an int but was " + this.n + " at path " + f());
        }
    }

    @Override // defpackage.k9
    public String l() {
        String str;
        ByteString byteString;
        int i = this.k;
        if (i == 0) {
            i = q();
        }
        if (i == 14) {
            str = r();
        } else {
            if (i == 13) {
                byteString = p;
            } else if (i == 12) {
                byteString = o;
            } else {
                if (i != 15) {
                    throw new i9("Expected a name but was " + peek() + " at path " + f());
                }
                str = this.n;
            }
            str = a(byteString);
        }
        this.k = 0;
        this.d[this.b - 1] = str;
        return str;
    }

    @Override // defpackage.k9
    public String m() {
        String readUtf8;
        ByteString byteString;
        int i = this.k;
        if (i == 0) {
            i = q();
        }
        if (i == 10) {
            readUtf8 = r();
        } else {
            if (i == 9) {
                byteString = p;
            } else if (i == 8) {
                byteString = o;
            } else if (i == 11) {
                readUtf8 = this.n;
                this.n = null;
            } else if (i == 16) {
                readUtf8 = Long.toString(this.l);
            } else {
                if (i != 17) {
                    throw new i9("Expected a string but was " + peek() + " at path " + f());
                }
                readUtf8 = this.j.readUtf8(this.m);
            }
            readUtf8 = a(byteString);
        }
        this.k = 0;
        int[] iArr = this.e;
        int i2 = this.b - 1;
        iArr[i2] = iArr[i2] + 1;
        return readUtf8;
    }

    @Override // defpackage.k9
    public void n() {
        ByteString byteString;
        if (this.g) {
            throw new i9("Cannot skip unexpected " + peek() + " at " + f());
        }
        int i = this.k;
        if (i == 0) {
            i = q();
        }
        if (i == 14) {
            x();
        } else {
            if (i == 13) {
                byteString = p;
            } else if (i == 12) {
                byteString = o;
            } else if (i != 15) {
                throw new i9("Expected a name but was " + peek() + " at path " + f());
            }
            b(byteString);
        }
        this.k = 0;
        this.d[this.b - 1] = "null";
    }

    @Override // defpackage.k9
    public void o() {
        ByteString byteString;
        if (this.g) {
            throw new i9("Cannot skip unexpected " + peek() + " at " + f());
        }
        int i = 0;
        do {
            int i2 = this.k;
            if (i2 == 0) {
                i2 = q();
            }
            if (i2 == 3) {
                a(1);
            } else if (i2 == 1) {
                a(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        throw new i9("Expected a value but was " + peek() + " at path " + f());
                    }
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        throw new i9("Expected a value but was " + peek() + " at path " + f());
                    }
                } else {
                    if (i2 == 14 || i2 == 10) {
                        x();
                    } else {
                        if (i2 == 9 || i2 == 13) {
                            byteString = p;
                        } else if (i2 == 8 || i2 == 12) {
                            byteString = o;
                        } else if (i2 == 17) {
                            this.j.skip(this.m);
                        } else if (i2 == 18) {
                            throw new i9("Expected a value but was " + peek() + " at path " + f());
                        }
                        b(byteString);
                    }
                    this.k = 0;
                }
                this.b--;
                this.k = 0;
            }
            i++;
            this.k = 0;
        } while (i != 0);
        int[] iArr = this.e;
        int i3 = this.b;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.d[i3 - 1] = "null";
    }

    @Override // defpackage.k9
    public k9.b peek() {
        int i = this.k;
        if (i == 0) {
            i = q();
        }
        switch (i) {
            case 1:
                return k9.b.BEGIN_OBJECT;
            case 2:
                return k9.b.END_OBJECT;
            case 3:
                return k9.b.BEGIN_ARRAY;
            case 4:
                return k9.b.END_ARRAY;
            case 5:
            case 6:
                return k9.b.BOOLEAN;
            case 7:
                return k9.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return k9.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return k9.b.NAME;
            case 16:
            case 17:
                return k9.b.NUMBER;
            case 18:
                return k9.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonReader(" + this.i + ")";
    }
}
