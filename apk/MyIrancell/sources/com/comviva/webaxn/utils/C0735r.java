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

/* renamed from: com.comviva.webaxn.utils.r */
/* loaded from: classes.dex */
public class C0735r {

    /* renamed from: g */
    public static final BigDecimal f5097g = new BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679");

    /* renamed from: b */
    private String f5099b;

    /* renamed from: a */
    private MathContext f5098a = MathContext.DECIMAL32;

    /* renamed from: c */
    private List<String> f5100c = null;

    /* renamed from: d */
    private Map<String, i0> f5101d = new HashMap();

    /* renamed from: e */
    private Map<String, h0> f5102e = new HashMap();

    /* renamed from: f */
    private Map<String, BigDecimal> f5103f = new HashMap();

    /* renamed from: com.comviva.webaxn.utils.r$a */
    /* loaded from: classes.dex */
    class a extends i0 {
        a(C0735r c0735r, String str, int i, boolean z) {
            super(c0735r, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.C0735r.i0
        /* renamed from: a */
        public BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.compareTo(bigDecimal2) >= 0 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$a0 */
    /* loaded from: classes.dex */
    class a0 extends i0 {
        a0(String str, int i, boolean z) {
            super(C0735r.this, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.C0735r.i0
        /* renamed from: a */
        public BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.divide(bigDecimal2, C0735r.this.f5098a);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$b */
    /* loaded from: classes.dex */
    class b extends i0 {
        b(C0735r c0735r, String str, int i, boolean z) {
            super(c0735r, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.C0735r.i0
        /* renamed from: a */
        public BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.compareTo(bigDecimal2) == -1 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$b0 */
    /* loaded from: classes.dex */
    class b0 extends i0 {
        b0(String str, int i, boolean z) {
            super(C0735r.this, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.C0735r.i0
        /* renamed from: a */
        public BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.remainder(bigDecimal2, C0735r.this.f5098a);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$c */
    /* loaded from: classes.dex */
    class c extends i0 {
        c(C0735r c0735r, String str, int i, boolean z) {
            super(c0735r, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.C0735r.i0
        /* renamed from: a */
        public BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.compareTo(bigDecimal2) <= 0 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$c0 */
    /* loaded from: classes.dex */
    class c0 extends i0 {
        c0(String str, int i, boolean z) {
            super(C0735r.this, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.C0735r.i0
        /* renamed from: a */
        public BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            int signum = bigDecimal2.signum();
            double doubleValue = bigDecimal.doubleValue();
            BigDecimal multiply = bigDecimal2.multiply(new BigDecimal(signum));
            BigDecimal remainder = multiply.remainder(BigDecimal.ONE);
            BigDecimal multiply2 = bigDecimal.pow(multiply.subtract(remainder).intValueExact(), C0735r.this.f5098a).multiply(new BigDecimal(Math.pow(doubleValue, remainder.doubleValue())), C0735r.this.f5098a);
            return signum == -1 ? BigDecimal.ONE.divide(multiply2, C0735r.this.f5098a.getPrecision(), RoundingMode.HALF_UP) : multiply2;
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$d */
    /* loaded from: classes.dex */
    class d extends i0 {
        d(C0735r c0735r, String str, int i, boolean z) {
            super(c0735r, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.C0735r.i0
        /* renamed from: a */
        public BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.compareTo(bigDecimal2) == 0 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$d0 */
    /* loaded from: classes.dex */
    class d0 extends i0 {
        d0(C0735r c0735r, String str, int i, boolean z) {
            super(c0735r, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.C0735r.i0
        /* renamed from: a */
        public BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return ((bigDecimal.equals(BigDecimal.ZERO) ^ true) && (bigDecimal2.equals(BigDecimal.ZERO) ^ true)) ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$e */
    /* loaded from: classes.dex */
    class e extends i0 {
        e(String str, int i, boolean z) {
            super(C0735r.this, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.C0735r.i0
        /* renamed from: a */
        public BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return ((i0) C0735r.this.f5101d.get("=")).mo5994a(bigDecimal, bigDecimal2);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$e0 */
    /* loaded from: classes.dex */
    class e0 extends i0 {
        e0(C0735r c0735r, String str, int i, boolean z) {
            super(c0735r, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.C0735r.i0
        /* renamed from: a */
        public BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return ((bigDecimal.equals(BigDecimal.ZERO) ^ true) || (bigDecimal2.equals(BigDecimal.ZERO) ^ true)) ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$f */
    /* loaded from: classes.dex */
    class f extends i0 {
        f(C0735r c0735r, String str, int i, boolean z) {
            super(c0735r, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.C0735r.i0
        /* renamed from: a */
        public BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.compareTo(bigDecimal2) != 0 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$f0 */
    /* loaded from: classes.dex */
    class f0 extends i0 {
        f0(C0735r c0735r, String str, int i, boolean z) {
            super(c0735r, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.C0735r.i0
        /* renamed from: a */
        public BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.compareTo(bigDecimal2) == 1 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$g */
    /* loaded from: classes.dex */
    class g extends i0 {
        g(String str, int i, boolean z) {
            super(C0735r.this, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.C0735r.i0
        /* renamed from: a */
        public BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return ((i0) C0735r.this.f5101d.get("!=")).mo5994a(bigDecimal, bigDecimal2);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$g0 */
    /* loaded from: classes.dex */
    public class g0 extends RuntimeException {
        public g0(C0735r c0735r, String str) {
            super(str);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$h */
    /* loaded from: classes.dex */
    class h extends h0 {
        h(C0735r c0735r, String str, int i) {
            super(c0735r, str, i);
        }

        @Override // com.comviva.webaxn.utils.C0735r.h0
        /* renamed from: a */
        public BigDecimal mo5995a(List<BigDecimal> list) {
            return list.get(0).compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$h0 */
    /* loaded from: classes.dex */
    public abstract class h0 {

        /* renamed from: a */
        private String f5109a;

        /* renamed from: b */
        private int f5110b;

        public h0(C0735r c0735r, String str, int i) {
            this.f5109a = str.toUpperCase();
            this.f5110b = i;
        }

        /* renamed from: a */
        public String m5997a() {
            return this.f5109a;
        }

        /* renamed from: a */
        public abstract BigDecimal mo5995a(List<BigDecimal> list);

        /* renamed from: b */
        public int m5998b() {
            return this.f5110b;
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$i */
    /* loaded from: classes.dex */
    class i extends h0 {
        i(String str, int i) {
            super(C0735r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.C0735r.h0
        /* renamed from: a */
        public BigDecimal mo5995a(List<BigDecimal> list) {
            return new BigDecimal(new SecureRandom().nextDouble(), C0735r.this.f5098a);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$i0 */
    /* loaded from: classes.dex */
    public abstract class i0 {

        /* renamed from: a */
        private String f5112a;

        /* renamed from: b */
        private int f5113b;

        /* renamed from: c */
        private boolean f5114c;

        public i0(C0735r c0735r, String str, int i, boolean z) {
            this.f5112a = str;
            this.f5113b = i;
            this.f5114c = z;
        }

        /* renamed from: a */
        public String m5999a() {
            return this.f5112a;
        }

        /* renamed from: a */
        public abstract BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2);

        /* renamed from: b */
        public int m6000b() {
            return this.f5113b;
        }

        /* renamed from: c */
        public boolean m6001c() {
            return this.f5114c;
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$j */
    /* loaded from: classes.dex */
    class j extends h0 {
        j(String str, int i) {
            super(C0735r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.C0735r.h0
        /* renamed from: a */
        public BigDecimal mo5995a(List<BigDecimal> list) {
            return new BigDecimal(Math.sin(Math.toRadians(list.get(0).doubleValue())), C0735r.this.f5098a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.comviva.webaxn.utils.r$j0 */
    /* loaded from: classes.dex */
    public class j0 implements Iterator<String> {

        /* renamed from: b */
        private int f5116b = 0;

        /* renamed from: c */
        private String f5117c;

        /* renamed from: d */
        private String f5118d;

        public j0(String str) {
            this.f5117c = str;
        }

        /* renamed from: a */
        private char m6002a() {
            if (this.f5116b < this.f5117c.length() - 1) {
                return this.f5117c.charAt(this.f5116b + 1);
            }
            return (char) 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5116b < this.f5117c.length();
        }

        @Override // java.util.Iterator
        public String next() {
            char charAt;
            String sb;
            StringBuilder sb2 = new StringBuilder();
            if (this.f5116b >= this.f5117c.length()) {
                sb = null;
            } else {
                String str = this.f5117c;
                int i = this.f5116b;
                while (true) {
                    charAt = str.charAt(i);
                    if (!Character.isWhitespace(charAt) || this.f5116b >= this.f5117c.length()) {
                        break;
                    }
                    str = this.f5117c;
                    i = this.f5116b + 1;
                    this.f5116b = i;
                }
                if (Character.isDigit(charAt)) {
                    while (true) {
                        if ((!Character.isDigit(charAt) && charAt != '.') || this.f5116b >= this.f5117c.length()) {
                            break;
                        }
                        String str2 = this.f5117c;
                        int i2 = this.f5116b;
                        this.f5116b = i2 + 1;
                        sb2.append(str2.charAt(i2));
                        charAt = this.f5116b == this.f5117c.length() ? (char) 0 : this.f5117c.charAt(this.f5116b);
                    }
                } else if (charAt == '-' && Character.isDigit(m6002a()) && ("(".equals(this.f5118d) || ",".equals(this.f5118d) || this.f5118d == null || C0735r.this.f5101d.containsKey(this.f5118d))) {
                    sb2.append('-');
                    this.f5116b++;
                    sb2.append(next());
                } else if (Character.isLetter(charAt)) {
                    while (true) {
                        if ((!Character.isLetter(charAt) && !Character.isDigit(charAt) && charAt != '_') || this.f5116b >= this.f5117c.length()) {
                            break;
                        }
                        String str3 = this.f5117c;
                        int i3 = this.f5116b;
                        this.f5116b = i3 + 1;
                        sb2.append(str3.charAt(i3));
                        charAt = this.f5116b == this.f5117c.length() ? (char) 0 : this.f5117c.charAt(this.f5116b);
                    }
                } else {
                    if (charAt == '(' || charAt == ')' || charAt == ',') {
                        sb2.append(charAt);
                        this.f5116b++;
                    }
                    while (!Character.isLetter(charAt) && !Character.isDigit(charAt) && !Character.isWhitespace(charAt) && charAt != '(' && charAt != ')' && charAt != ',' && this.f5116b < this.f5117c.length()) {
                        sb2.append(this.f5117c.charAt(this.f5116b));
                        int i4 = this.f5116b + 1;
                        this.f5116b = i4;
                        charAt = i4 == this.f5117c.length() ? (char) 0 : this.f5117c.charAt(this.f5116b);
                        if (charAt == '-') {
                            break;
                        }
                    }
                    if (!C0735r.this.f5101d.containsKey(sb2.toString())) {
                        throw new g0(C0735r.this, "Unknown operator '" + ((Object) sb2) + "' at position " + ((this.f5116b - sb2.length()) + 1));
                    }
                }
                sb = sb2.toString();
            }
            this.f5118d = sb;
            return sb;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new g0(C0735r.this, "remove() not supported");
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$k */
    /* loaded from: classes.dex */
    class k extends i0 {
        k(String str, int i, boolean z) {
            super(C0735r.this, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.C0735r.i0
        /* renamed from: a */
        public BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.add(bigDecimal2, C0735r.this.f5098a);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$l */
    /* loaded from: classes.dex */
    class l extends h0 {
        l(String str, int i) {
            super(C0735r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.C0735r.h0
        /* renamed from: a */
        public BigDecimal mo5995a(List<BigDecimal> list) {
            return new BigDecimal(Math.cos(Math.toRadians(list.get(0).doubleValue())), C0735r.this.f5098a);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$m */
    /* loaded from: classes.dex */
    class m extends h0 {
        m(String str, int i) {
            super(C0735r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.C0735r.h0
        /* renamed from: a */
        public BigDecimal mo5995a(List<BigDecimal> list) {
            return new BigDecimal(Math.tan(Math.toRadians(list.get(0).doubleValue())), C0735r.this.f5098a);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$n */
    /* loaded from: classes.dex */
    class n extends h0 {
        n(String str, int i) {
            super(C0735r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.C0735r.h0
        /* renamed from: a */
        public BigDecimal mo5995a(List<BigDecimal> list) {
            return new BigDecimal(Math.sinh(list.get(0).doubleValue()), C0735r.this.f5098a);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$o */
    /* loaded from: classes.dex */
    class o extends h0 {
        o(String str, int i) {
            super(C0735r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.C0735r.h0
        /* renamed from: a */
        public BigDecimal mo5995a(List<BigDecimal> list) {
            return new BigDecimal(Math.cosh(list.get(0).doubleValue()), C0735r.this.f5098a);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$p */
    /* loaded from: classes.dex */
    class p extends h0 {
        p(String str, int i) {
            super(C0735r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.C0735r.h0
        /* renamed from: a */
        public BigDecimal mo5995a(List<BigDecimal> list) {
            return new BigDecimal(Math.tanh(list.get(0).doubleValue()), C0735r.this.f5098a);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$q */
    /* loaded from: classes.dex */
    class q extends h0 {
        q(String str, int i) {
            super(C0735r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.C0735r.h0
        /* renamed from: a */
        public BigDecimal mo5995a(List<BigDecimal> list) {
            return new BigDecimal(Math.toRadians(list.get(0).doubleValue()), C0735r.this.f5098a);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$r */
    /* loaded from: classes.dex */
    class r extends h0 {
        r(String str, int i) {
            super(C0735r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.C0735r.h0
        /* renamed from: a */
        public BigDecimal mo5995a(List<BigDecimal> list) {
            return new BigDecimal(Math.toDegrees(list.get(0).doubleValue()), C0735r.this.f5098a);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$s */
    /* loaded from: classes.dex */
    class s extends h0 {
        s(C0735r c0735r, String str, int i) {
            super(c0735r, str, i);
        }

        @Override // com.comviva.webaxn.utils.C0735r.h0
        /* renamed from: a */
        public BigDecimal mo5995a(List<BigDecimal> list) {
            BigDecimal bigDecimal = list.get(0);
            BigDecimal bigDecimal2 = list.get(1);
            return bigDecimal.compareTo(bigDecimal2) > 0 ? bigDecimal : bigDecimal2;
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$t */
    /* loaded from: classes.dex */
    class t extends h0 {
        t(C0735r c0735r, String str, int i) {
            super(c0735r, str, i);
        }

        @Override // com.comviva.webaxn.utils.C0735r.h0
        /* renamed from: a */
        public BigDecimal mo5995a(List<BigDecimal> list) {
            BigDecimal bigDecimal = list.get(0);
            BigDecimal bigDecimal2 = list.get(1);
            return bigDecimal.compareTo(bigDecimal2) < 0 ? bigDecimal : bigDecimal2;
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$u */
    /* loaded from: classes.dex */
    class u extends h0 {
        u(String str, int i) {
            super(C0735r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.C0735r.h0
        /* renamed from: a */
        public BigDecimal mo5995a(List<BigDecimal> list) {
            return list.get(0).abs(C0735r.this.f5098a);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$v */
    /* loaded from: classes.dex */
    class v extends i0 {
        v(String str, int i, boolean z) {
            super(C0735r.this, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.C0735r.i0
        /* renamed from: a */
        public BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.subtract(bigDecimal2, C0735r.this.f5098a);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$w */
    /* loaded from: classes.dex */
    class w extends h0 {
        w(String str, int i) {
            super(C0735r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.C0735r.h0
        /* renamed from: a */
        public BigDecimal mo5995a(List<BigDecimal> list) {
            return new BigDecimal(Math.log(list.get(0).doubleValue()), C0735r.this.f5098a);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$x */
    /* loaded from: classes.dex */
    class x extends h0 {
        x(String str, int i) {
            super(C0735r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.C0735r.h0
        /* renamed from: a */
        public BigDecimal mo5995a(List<BigDecimal> list) {
            return list.get(1).setScale(list.get(0).intValue(), C0735r.this.f5098a.getRoundingMode());
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$y */
    /* loaded from: classes.dex */
    class y extends h0 {
        y(String str, int i) {
            super(C0735r.this, str, i);
        }

        @Override // com.comviva.webaxn.utils.C0735r.h0
        /* renamed from: a */
        public BigDecimal mo5995a(List<BigDecimal> list) {
            BigDecimal bigDecimal = list.get(0);
            if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
                return new BigDecimal(0);
            }
            if (bigDecimal.signum() < 0) {
                throw new g0(C0735r.this, "Argument to SQRT() function must not be negative");
            }
            BigInteger bigInteger = bigDecimal.movePointRight(C0735r.this.f5098a.getPrecision() << 1).toBigInteger();
            BigInteger shiftRight = bigInteger.shiftRight((bigInteger.bitLength() + 1) >> 1);
            while (true) {
                BigInteger shiftRight2 = shiftRight.add(bigInteger.divide(shiftRight)).shiftRight(1);
                Thread.yield();
                if (shiftRight2.compareTo(shiftRight) == 0) {
                    return new BigDecimal(shiftRight2, C0735r.this.f5098a.getPrecision());
                }
                shiftRight = shiftRight2;
            }
        }
    }

    /* renamed from: com.comviva.webaxn.utils.r$z */
    /* loaded from: classes.dex */
    class z extends i0 {
        z(String str, int i, boolean z) {
            super(C0735r.this, str, i, z);
        }

        @Override // com.comviva.webaxn.utils.C0735r.i0
        /* renamed from: a */
        public BigDecimal mo5994a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.multiply(bigDecimal2, C0735r.this.f5098a);
        }
    }

    public C0735r(String str) {
        this.f5099b = null;
        this.f5099b = str;
        m5992a(new k("+", 20, true));
        m5992a(new v("-", 20, true));
        m5992a(new z("*", 30, true));
        m5992a(new a0("/", 30, true));
        m5992a(new b0("%", 30, true));
        m5992a(new c0("^", 40, false));
        m5992a(new d0(this, "&&", 4, false));
        m5992a(new e0(this, "||", 2, false));
        m5992a(new f0(this, ">", 10, false));
        m5992a(new a(this, ">=", 10, false));
        m5992a(new b(this, "<", 10, false));
        m5992a(new c(this, "<=", 10, false));
        m5992a(new d(this, "=", 7, false));
        m5992a(new e("==", 7, false));
        m5992a(new f(this, "!=", 7, false));
        m5992a(new g("<>", 7, false));
        m5991a(new h(this, "NOT", 1));
        m5991a(new i("RANDOM", 0));
        m5991a(new j("SIN", 1));
        m5991a(new l("COS", 1));
        m5991a(new m("TAN", 1));
        m5991a(new n("SINH", 1));
        m5991a(new o("COSH", 1));
        m5991a(new p("TANH", 1));
        m5991a(new q("RAD", 1));
        m5991a(new r("DEG", 1));
        m5991a(new s(this, "MAX", 2));
        m5991a(new t(this, "MIN", 2));
        m5991a(new u("ABS", 1));
        m5991a(new w("LOG", 1));
        m5991a(new x("ROUND", 2));
        m5991a(new y("SQRT", 1));
        this.f5103f.put("PI", f5097g);
    }

    /* renamed from: a */
    private boolean m5987a(String str) {
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

    /* renamed from: b */
    private List<String> m5989b() {
        if (this.f5100c == null) {
            this.f5100c = m5990b(this.f5099b);
        }
        return this.f5100c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ab, code lost:
    
        if (r1.isEmpty() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ad, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00bb, code lost:
    
        if (r10.f5101d.containsKey(r6) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c1, code lost:
    
        if (r5.m6001c() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d3, code lost:
    
        if (r5.m6000b() <= r10.f5101d.get(r6).m6000b()) goto L43;
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
    
        if (r5.m6000b() >= r10.f5101d.get(r6).m6000b()) goto L109;
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
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<java.lang.String> m5990b(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0735r.m5990b(java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public h0 m5991a(h0 h0Var) {
        return this.f5102e.put(h0Var.m5997a(), h0Var);
    }

    /* renamed from: a */
    public i0 m5992a(i0 i0Var) {
        return this.f5101d.put(i0Var.m5999a(), i0Var);
    }

    /* renamed from: a */
    public BigDecimal m5993a() {
        BigDecimal mo5994a;
        Stack stack = new Stack();
        for (String str : m5989b()) {
            if (this.f5101d.containsKey(str)) {
                BigDecimal bigDecimal = (BigDecimal) stack.pop();
                mo5994a = this.f5101d.get(str).mo5994a((BigDecimal) stack.pop(), bigDecimal);
            } else if (this.f5103f.containsKey(str)) {
                mo5994a = this.f5103f.get(str).round(this.f5098a);
            } else if (this.f5102e.containsKey(str.toUpperCase())) {
                h0 h0Var = this.f5102e.get(str.toUpperCase());
                ArrayList arrayList = new ArrayList(h0Var.m5998b());
                for (int i2 = 0; i2 < h0Var.f5110b; i2++) {
                    arrayList.add(stack.pop());
                }
                mo5994a = h0Var.mo5995a(arrayList);
            } else {
                stack.push(new BigDecimal(str, this.f5098a));
            }
            stack.push(mo5994a);
        }
        return (BigDecimal) stack.pop();
    }
}
