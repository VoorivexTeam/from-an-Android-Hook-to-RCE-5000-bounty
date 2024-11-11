package defpackage;

import defpackage.mk;

/* loaded from: classes.dex */
final class pk extends mk {
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends mk.a {
        private Integer a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;

        @Override // mk.a
        public mk.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // mk.a
        public mk.a a(String str) {
            this.d = str;
            return this;
        }

        @Override // mk.a
        public mk a() {
            String str = "";
            if (this.a == null) {
                str = " sdkVersion";
            }
            if (str.isEmpty()) {
                return new pk(this.a.intValue(), this.b, this.c, this.d, this.e, this.f, this.g, this.h, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // mk.a
        public mk.a b(String str) {
            this.h = str;
            return this;
        }

        @Override // mk.a
        public mk.a c(String str) {
            this.c = str;
            return this;
        }

        @Override // mk.a
        public mk.a d(String str) {
            this.g = str;
            return this;
        }

        @Override // mk.a
        public mk.a e(String str) {
            this.b = str;
            return this;
        }

        @Override // mk.a
        public mk.a f(String str) {
            this.f = str;
            return this;
        }

        @Override // mk.a
        public mk.a g(String str) {
            this.e = str;
            return this;
        }
    }

    /* synthetic */ pk(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.h;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mk)) {
            return false;
        }
        pk pkVar = (pk) ((mk) obj);
        if (this.a == pkVar.a && ((str = this.b) != null ? str.equals(pkVar.b) : pkVar.b == null) && ((str2 = this.c) != null ? str2.equals(pkVar.c) : pkVar.c == null) && ((str3 = this.d) != null ? str3.equals(pkVar.d) : pkVar.d == null) && ((str4 = this.e) != null ? str4.equals(pkVar.e) : pkVar.e == null) && ((str5 = this.f) != null ? str5.equals(pkVar.f) : pkVar.f == null) && ((str6 = this.g) != null ? str6.equals(pkVar.g) : pkVar.g == null)) {
            String str7 = this.h;
            String str8 = pkVar.h;
            if (str7 == null) {
                if (str8 == null) {
                    return true;
                }
            } else if (str7.equals(str8)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.f;
    }

    public String h() {
        return this.e;
    }

    public int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode5 = (hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode6 = (hashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        return hashCode6 ^ (str7 != null ? str7.hashCode() : 0);
    }

    public int i() {
        return this.a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.a + ", model=" + this.b + ", hardware=" + this.c + ", device=" + this.d + ", product=" + this.e + ", osBuild=" + this.f + ", manufacturer=" + this.g + ", fingerprint=" + this.h + "}";
    }
}
