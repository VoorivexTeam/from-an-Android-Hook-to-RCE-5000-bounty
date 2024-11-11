package p000;

import com.bumptech.glide.load.EnumC0567a;
import com.bumptech.glide.load.EnumC0569c;

/* renamed from: jb */
/* loaded from: classes.dex */
public abstract class AbstractC2809jb {

    /* renamed from: a */
    public static final AbstractC2809jb f11499a;

    /* renamed from: b */
    public static final AbstractC2809jb f11500b;

    /* renamed from: c */
    public static final AbstractC2809jb f11501c;

    /* renamed from: jb$a */
    /* loaded from: classes.dex */
    class a extends AbstractC2809jb {
        a() {
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: a */
        public boolean mo13435a() {
            return true;
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: a */
        public boolean mo13436a(EnumC0567a enumC0567a) {
            return enumC0567a == EnumC0567a.REMOTE;
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: a */
        public boolean mo13437a(boolean z, EnumC0567a enumC0567a, EnumC0569c enumC0569c) {
            return (enumC0567a == EnumC0567a.RESOURCE_DISK_CACHE || enumC0567a == EnumC0567a.MEMORY_CACHE) ? false : true;
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: b */
        public boolean mo13438b() {
            return true;
        }
    }

    /* renamed from: jb$b */
    /* loaded from: classes.dex */
    class b extends AbstractC2809jb {
        b() {
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: a */
        public boolean mo13435a() {
            return false;
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: a */
        public boolean mo13436a(EnumC0567a enumC0567a) {
            return false;
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: a */
        public boolean mo13437a(boolean z, EnumC0567a enumC0567a, EnumC0569c enumC0569c) {
            return false;
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: b */
        public boolean mo13438b() {
            return false;
        }
    }

    /* renamed from: jb$c */
    /* loaded from: classes.dex */
    class c extends AbstractC2809jb {
        c() {
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: a */
        public boolean mo13435a() {
            return true;
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: a */
        public boolean mo13436a(EnumC0567a enumC0567a) {
            return (enumC0567a == EnumC0567a.DATA_DISK_CACHE || enumC0567a == EnumC0567a.MEMORY_CACHE) ? false : true;
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: a */
        public boolean mo13437a(boolean z, EnumC0567a enumC0567a, EnumC0569c enumC0569c) {
            return false;
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: b */
        public boolean mo13438b() {
            return false;
        }
    }

    /* renamed from: jb$d */
    /* loaded from: classes.dex */
    class d extends AbstractC2809jb {
        d() {
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: a */
        public boolean mo13435a() {
            return false;
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: a */
        public boolean mo13436a(EnumC0567a enumC0567a) {
            return false;
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: a */
        public boolean mo13437a(boolean z, EnumC0567a enumC0567a, EnumC0569c enumC0569c) {
            return (enumC0567a == EnumC0567a.RESOURCE_DISK_CACHE || enumC0567a == EnumC0567a.MEMORY_CACHE) ? false : true;
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: b */
        public boolean mo13438b() {
            return true;
        }
    }

    /* renamed from: jb$e */
    /* loaded from: classes.dex */
    class e extends AbstractC2809jb {
        e() {
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: a */
        public boolean mo13435a() {
            return true;
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: a */
        public boolean mo13436a(EnumC0567a enumC0567a) {
            return enumC0567a == EnumC0567a.REMOTE;
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: a */
        public boolean mo13437a(boolean z, EnumC0567a enumC0567a, EnumC0569c enumC0569c) {
            return ((z && enumC0567a == EnumC0567a.DATA_DISK_CACHE) || enumC0567a == EnumC0567a.LOCAL) && enumC0569c == EnumC0569c.TRANSFORMED;
        }

        @Override // p000.AbstractC2809jb
        /* renamed from: b */
        public boolean mo13438b() {
            return true;
        }
    }

    static {
        new a();
        f11499a = new b();
        f11500b = new c();
        new d();
        f11501c = new e();
    }

    /* renamed from: a */
    public abstract boolean mo13435a();

    /* renamed from: a */
    public abstract boolean mo13436a(EnumC0567a enumC0567a);

    /* renamed from: a */
    public abstract boolean mo13437a(boolean z, EnumC0567a enumC0567a, EnumC0569c enumC0569c);

    /* renamed from: b */
    public abstract boolean mo13438b();
}
