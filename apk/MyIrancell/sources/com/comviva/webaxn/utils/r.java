package com.comviva.webaxn.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes.dex */
public class r {
    public static final BigDecimal g = new BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679");
    private String b;
    private MathContext a = MathContext.DECIMAL32;
    private List<String> c = null;
    private Map<String, i0> d = new HashMap();
    private Map<String, h0> e = new HashMap();
    private Map<String, BigDecimal> f = new HashMap();

    /* loaded from: classes.dex */
    class a extends i0 {
        a(r rVar, String str, int i, boolean z) {
            super(rVar, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.r.i0
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.compareTo(bigDecimal2) >= 0 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* loaded from: classes.dex */
    class a0 extends i0 {
        a0(String str, int i, boolean z) {
            super(r.this, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.r.i0
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.divide(bigDecimal2, r.this.a);
        }
    }

    /* loaded from: classes.dex */
    class b extends i0 {
        b(r rVar, String str, int i, boolean z) {
            super(rVar, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.r.i0
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.compareTo(bigDecimal2) == -1 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* loaded from: classes.dex */
    class b0 extends i0 {
        b0(String str, int i, boolean z) {
            super(r.this, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.r.i0
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.remainder(bigDecimal2, r.this.a);
        }
    }

    /* loaded from: classes.dex */
    class c extends i0 {
        c(r rVar, String str, int i, boolean z) {
            super(rVar, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.r.i0
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.compareTo(bigDecimal2) <= 0 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* loaded from: classes.dex */
    class c0 extends i0 {
        c0(String str, int i, boolean z) {
            super(r.this, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.r.i0
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            int signum = bigDecimal2.signum();
            double doubleValue = bigDecimal.doubleValue();
            BigDecimal multiply = bigDecimal2.multiply(new BigDecimal(signum));
            BigDecimal remainder = multiply.remainder(BigDecimal.ONE);
            BigDecimal multiply2 = bigDecimal.pow(multiply.subtract(remainder).intValueExact(), r.this.a).multiply(new BigDecimal(Math.pow(doubleValue, remainder.doubleValue())), r.this.a);
            return signum == -1 ? BigDecimal.ONE.divide(multiply2, r.this.a.getPrecision(), RoundingMode.HALF_UP) : multiply2;
        }
    }

    /* loaded from: classes.dex */
    class d extends i0 {
        d(r rVar, String str, int i, boolean z) {
            super(rVar, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.r.i0
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.compareTo(bigDecimal2) == 0 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* loaded from: classes.dex */
    class d0 extends i0 {
        d0(r rVar, String str, int i, boolean z) {
            super(rVar, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.r.i0
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return ((bigDecimal.equals(BigDecimal.ZERO) ^ true) && (bigDecimal2.equals(BigDecimal.ZERO) ^ true)) ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* loaded from: classes.dex */
    class e extends i0 {
        e(String str, int i, boolean z) {
            super(r.this, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.r.i0
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return ((i0) r.this.d.get("=")).a(bigDecimal, bigDecimal2);
        }
    }

    /* loaded from: classes.dex */
    class e0 extends i0 {
        e0(r rVar, String str, int i, boolean z) {
            super(rVar, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.r.i0
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return ((bigDecimal.equals(BigDecimal.ZERO) ^ true) || (bigDecimal2.equals(BigDecimal.ZERO) ^ true)) ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* loaded from: classes.dex */
    class f extends i0 {
        f(r rVar, String str, int i, boolean z) {
            super(rVar, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.r.i0
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.compareTo(bigDecimal2) != 0 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* loaded from: classes.dex */
    class f0 extends i0 {
        f0(r rVar, String str, int i, boolean z) {
            super(rVar, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.r.i0
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.compareTo(bigDecimal2) == 1 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* loaded from: classes.dex */
    class g extends i0 {
        g(String str, int i, boolean z) {
            super(r.this, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.r.i0
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return ((i0) r.this.d.get("!=")).a(bigDecimal, bigDecimal2);
        }
    }

    /* loaded from: classes.dex */
    public class g0 extends RuntimeException {
        public g0(r rVar, String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    class h extends h0 {
        h(r rVar, String str, int i) {
            super(rVar, str, i);
        }

        @Override // com.comviva.webaxn.utils.r.h0
        public BigDecimal a(List<BigDecimal> list) {
            return list.get(0).compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* loaded from: classes.dex */
    public abstract class h0 {
        private String a;
        private int b;

        public h0(r rVar, String str, int i) {
            this.a = str.toUpperCase();
            this.b = i;
        }

        public String a() {
            return this.a;
        }

        public abstract BigDecimal a(List<BigDecimal> list);

        public int b() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    class i extends h0 {
        i(String str, int i) {
            super(r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.r.h0
        public BigDecimal a(List<BigDecimal> list) {
            return new BigDecimal(new SecureRandom().nextDouble(), r.this.a);
        }
    }

    /* loaded from: classes.dex */
    public abstract class i0 {
        private String a;
        private int b;
        private boolean c;

        public i0(r rVar, String str, int i, boolean z) {
            this.a = str;
            this.b = i;
            this.c = z;
        }

        public String a() {
            return this.a;
        }

        public abstract BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2);

        public int b() {
            return this.b;
        }

        public boolean c() {
            return this.c;
        }
    }

    /* loaded from: classes.dex */
    class j extends h0 {
        j(String str, int i) {
            super(r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.r.h0
        public BigDecimal a(List<BigDecimal> list) {
            return new BigDecimal(Math.sin(Math.toRadians(list.get(0).doubleValue())), r.this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class j0 implements Iterator<String> {
        private int b = 0;
        private String c;
        private String d;

        public j0(String str) {
            this.c = str;
        }

        private char a() {
            if (this.b < this.c.length() - 1) {
                return this.c.charAt(this.b + 1);
            }
            return (char) 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b < this.c.length();
        }

        @Override // java.util.Iterator
        public String next() {
            char charAt;
            String sb;
            StringBuilder sb2 = new StringBuilder();
            if (this.b >= this.c.length()) {
                sb = null;
            } else {
                String str = this.c;
                int i = this.b;
                while (true) {
                    charAt = str.charAt(i);
                    if (!Character.isWhitespace(charAt) || this.b >= this.c.length()) {
                        break;
                    }
                    str = this.c;
                    i = this.b + 1;
                    this.b = i;
                }
                if (Character.isDigit(charAt)) {
                    while (true) {
                        if ((!Character.isDigit(charAt) && charAt != '.') || this.b >= this.c.length()) {
                            break;
                        }
                        String str2 = this.c;
                        int i2 = this.b;
                        this.b = i2 + 1;
                        sb2.append(str2.charAt(i2));
                        charAt = this.b == this.c.length() ? (char) 0 : this.c.charAt(this.b);
                    }
                } else if (charAt == '-' && Character.isDigit(a()) && ("(".equals(this.d) || ",".equals(this.d) || this.d == null || r.this.d.containsKey(this.d))) {
                    sb2.append('-');
                    this.b++;
                    sb2.append(next());
                } else if (Character.isLetter(charAt)) {
                    while (true) {
                        if ((!Character.isLetter(charAt) && !Character.isDigit(charAt) && charAt != '_') || this.b >= this.c.length()) {
                            break;
                        }
                        String str3 = this.c;
                        int i3 = this.b;
                        this.b = i3 + 1;
                        sb2.append(str3.charAt(i3));
                        charAt = this.b == this.c.length() ? (char) 0 : this.c.charAt(this.b);
                    }
                } else {
                    if (charAt == '(' || charAt == ')' || charAt == ',') {
                        sb2.append(charAt);
                        this.b++;
                    }
                    while (!Character.isLetter(charAt) && !Character.isDigit(charAt) && !Character.isWhitespace(charAt) && charAt != '(' && charAt != ')' && charAt != ',' && this.b < this.c.length()) {
                        sb2.append(this.c.charAt(this.b));
                        int i4 = this.b + 1;
                        this.b = i4;
                        charAt = i4 == this.c.length() ? (char) 0 : this.c.charAt(this.b);
                        if (charAt == '-') {
                            break;
                        }
                    }
                    if (!r.this.d.containsKey(sb2.toString())) {
                        throw new g0(r.this, "Unknown operator '" + ((Object) sb2) + "' at position " + ((this.b - sb2.length()) + 1));
                    }
                }
                sb = sb2.toString();
            }
            this.d = sb;
            return sb;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new g0(r.this, "remove() not supported");
        }
    }

    /* loaded from: classes.dex */
    class k extends i0 {
        k(String str, int i, boolean z) {
            super(r.this, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.r.i0
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.add(bigDecimal2, r.this.a);
        }
    }

    /* loaded from: classes.dex */
    class l extends h0 {
        l(String str, int i) {
            super(r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.r.h0
        public BigDecimal a(List<BigDecimal> list) {
            return new BigDecimal(Math.cos(Math.toRadians(list.get(0).doubleValue())), r.this.a);
        }
    }

    /* loaded from: classes.dex */
    class m extends h0 {
        m(String str, int i) {
            super(r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.r.h0
        public BigDecimal a(List<BigDecimal> list) {
            return new BigDecimal(Math.tan(Math.toRadians(list.get(0).doubleValue())), r.this.a);
        }
    }

    /* loaded from: classes.dex */
    class n extends h0 {
        n(String str, int i) {
            super(r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.r.h0
        public BigDecimal a(List<BigDecimal> list) {
            return new BigDecimal(Math.sinh(list.get(0).doubleValue()), r.this.a);
        }
    }

    /* loaded from: classes.dex */
    class o extends h0 {
        o(String str, int i) {
            super(r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.r.h0
        public BigDecimal a(List<BigDecimal> list) {
            return new BigDecimal(Math.cosh(list.get(0).doubleValue()), r.this.a);
        }
    }

    /* loaded from: classes.dex */
    class p extends h0 {
        p(String str, int i) {
            super(r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.r.h0
        public BigDecimal a(List<BigDecimal> list) {
            return new BigDecimal(Math.tanh(list.get(0).doubleValue()), r.this.a);
        }
    }

    /* loaded from: classes.dex */
    class q extends h0 {
        q(String str, int i) {
            super(r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.r.h0
        public BigDecimal a(List<BigDecimal> list) {
            return new BigDecimal(Math.toRadians(list.get(0).doubleValue()), r.this.a);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$r, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0037r extends h0 {
        C0037r(String str, int i) {
            super(r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.r.h0
        public BigDecimal a(List<BigDecimal> list) {
            return new BigDecimal(Math.toDegrees(list.get(0).doubleValue()), r.this.a);
        }
    }

    /* loaded from: classes.dex */
    class s extends h0 {
        s(r rVar, String str, int i) {
            super(rVar, str, i);
        }

        @Override // com.comviva.webaxn.utils.r.h0
        public BigDecimal a(List<BigDecimal> list) {
            BigDecimal bigDecimal = list.get(0);
            BigDecimal bigDecimal2 = list.get(1);
            return bigDecimal.compareTo(bigDecimal2) > 0 ? bigDecimal : bigDecimal2;
        }
    }

    /* loaded from: classes.dex */
    class t extends h0 {
        t(r rVar, String str, int i) {
            super(rVar, str, i);
        }

        @Override // com.comviva.webaxn.utils.r.h0
        public BigDecimal a(List<BigDecimal> list) {
            BigDecimal bigDecimal = list.get(0);
            BigDecimal bigDecimal2 = list.get(1);
            return bigDecimal.compareTo(bigDecimal2) < 0 ? bigDecimal : bigDecimal2;
        }
    }

    /* loaded from: classes.dex */
    class u extends h0 {
        u(String str, int i) {
            super(r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.r.h0
        public BigDecimal a(List<BigDecimal> list) {
            return list.get(0).abs(r.this.a);
        }
    }

    /* loaded from: classes.dex */
    class v extends i0 {
        v(String str, int i, boolean z) {
            super(r.this, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.r.i0
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.subtract(bigDecimal2, r.this.a);
        }
    }

    /* loaded from: classes.dex */
    class w extends h0 {
        w(String str, int i) {
            super(r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.r.h0
        public BigDecimal a(List<BigDecimal> list) {
            return new BigDecimal(Math.log(list.get(0).doubleValue()), r.this.a);
        }
    }

    /* loaded from: classes.dex */
    class x extends h0 {
        x(String str, int i) {
            super(r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.r.h0
        public BigDecimal a(List<BigDecimal> list) {
            return list.get(1).setScale(list.get(0).intValue(), r.this.a.getRoundingMode());
        }
    }

    /* loaded from: classes.dex */
    class y extends h0 {
        y(String str, int i) {
            super(r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.r.h0
        public BigDecimal a(List<BigDecimal> list) {
            BigDecimal bigDecimal = list.get(0);
            if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
                return new BigDecimal(0);
            }
            if (bigDecimal.signum() < 0) {
                throw new g0(r.this, "Argument to SQRT() function must not be negative");
            }
            BigInteger bigInteger = bigDecimal.movePointRight(r.this.a.getPrecision() << 1).toBigInteger();
            BigInteger shiftRight = bigInteger.shiftRight((bigInteger.bitLength() + 1) >> 1);
            while (true) {
                BigInteger shiftRight2 = shiftRight.add(bigInteger.divide(shiftRight)).shiftRight(1);
                Thread.yield();
                if (shiftRight2.compareTo(shiftRight) == 0) {
                    return new BigDecimal(shiftRight2, r.this.a.getPrecision());
                }
                shiftRight = shiftRight2;
            }
        }
    }

    /* loaded from: classes.dex */
    class z extends i0 {
        z(String str, int i, boolean z) {
            super(r.this, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.r.i0
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.multiply(bigDecimal2, r.this.a);
        }
    }

    public r(String str) {
        this.b = null;
        this.b = str;
        a(new k("+", 20, true));
        a(new v("-", 20, true));
        a(new z("*", 30, true));
        a(new a0("/", 30, true));
        a(new b0("%", 30, true));
        a(new c0("^", 40, false));
        a(new d0(this, "&&", 4, false));
        a(new e0(this, "||", 2, false));
        a(new f0(this, ">", 10, false));
        a(new a(this, ">=", 10, false));
        a(new b(this, "<", 10, false));
        a(new c(this, "<=", 10, false));
        a(new d(this, "=", 7, false));
        a(new e("==", 7, false));
        a(new f(this, "!=", 7, false));
        a(new g("<>", 7, false));
        a(new h(this, "NOT", 1));
        a(new i("RANDOM", 0));
        a(new j("SIN", 1));
        a(new l("COS", 1));
        a(new m("TAN", 1));
        a(new n("SINH", 1));
        a(new o("COSH", 1));
        a(new p("TANH", 1));
        a(new q("RAD", 1));
        a(new C0037r("DEG", 1));
        a(new s(this, "MAX", 2));
        a(new t(this, "MIN", 2));
        a(new u("ABS", 1));
        a(new w("LOG", 1));
        a(new x("ROUND", 2));
        a(new y("SQRT", 1));
        this.f.put("PI", g);
    }

    private boolean a(String str) {
        if (str.charAt(0) == '-' && str.length() == 1) {
            return false;
        }
        for (char c2 : str.toCharArray()) {
            if (!Character.isDigit(c2) && c2 != '-' && c2 != '.') {
                return false;
            }
        }
        return true;
    }

    private List<String> b() {
        if (this.c == null) {
            this.c = b(this.b);
        }
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ab, code lost:
    
        if (r1.isEmpty() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ad, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00bb, code lost:
    
        if (r10.d.containsKey(r6) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c1, code lost:
    
        if (r5.c() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d3, code lost:
    
        if (r5.b() <= r10.d.get(r6).b()) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e7, code lost:
    
        r0.add(r1.pop());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f2, code lost:
    
        if (r1.isEmpty() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00af, code lost:
    
        r6 = (java.lang.String) r1.peek();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00e5, code lost:
    
        if (r5.b() >= r10.d.get(r6).b()) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00b5, code lost:
    
        r6 = (java.lang.String) r1.peek();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.comviva.webaxn.utils.r] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f2 -> B:31:0x00ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<java.lang.String> b(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.r.b(java.lang.String):java.util.List");
    }

    public h0 a(h0 h0Var) {
        return this.e.put(h0Var.a(), h0Var);
    }

    public i0 a(i0 i0Var) {
        return this.d.put(i0Var.a(), i0Var);
    }

    public BigDecimal a() {
        BigDecimal a2;
        Stack stack = new Stack();
        for (String str : b()) {
            if (this.d.containsKey(str)) {
                BigDecimal bigDecimal = (BigDecimal) stack.pop();
                a2 = this.d.get(str).a((BigDecimal) stack.pop(), bigDecimal);
            } else if (this.f.containsKey(str)) {
                a2 = this.f.get(str).round(this.a);
            } else if (this.e.containsKey(str.toUpperCase())) {
                h0 h0Var = this.e.get(str.toUpperCase());
                ArrayList arrayList = new ArrayList(h0Var.b());
                for (int i2 = 0; i2 < h0Var.b; i2++) {
                    arrayList.add(stack.pop());
                }
                a2 = h0Var.a(arrayList);
            } else {
                stack.push(new BigDecimal(str, this.a));
            }
            stack.push(a2);
        }
        return (BigDecimal) stack.pop();
    }
}
