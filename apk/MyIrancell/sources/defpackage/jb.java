package defpackage;

/* loaded from: classes.dex */
public abstract class jb {
    public static final jb a;
    public static final jb b;
    public static final jb c;

    /* loaded from: classes.dex */
    class a extends jb {
        a() {
        }

        @Override // defpackage.jb
        public boolean a() {
            return true;
        }

        @Override // defpackage.jb
        public boolean a(com.bumptech.glide.load.a aVar) {
            return aVar == com.bumptech.glide.load.a.REMOTE;
        }

        @Override // defpackage.jb
        public boolean a(boolean z, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return (aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || aVar == com.bumptech.glide.load.a.MEMORY_CACHE) ? false : true;
        }

        @Override // defpackage.jb
        public boolean b() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b extends jb {
        b() {
        }

        @Override // defpackage.jb
        public boolean a() {
            return false;
        }

        @Override // defpackage.jb
        public boolean a(com.bumptech.glide.load.a aVar) {
            return false;
        }

        @Override // defpackage.jb
        public boolean a(boolean z, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return false;
        }

        @Override // defpackage.jb
        public boolean b() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    class c extends jb {
        c() {
        }

        @Override // defpackage.jb
        public boolean a() {
            return true;
        }

        @Override // defpackage.jb
        public boolean a(com.bumptech.glide.load.a aVar) {
            return (aVar == com.bumptech.glide.load.a.DATA_DISK_CACHE || aVar == com.bumptech.glide.load.a.MEMORY_CACHE) ? false : true;
        }

        @Override // defpackage.jb
        public boolean a(boolean z, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return false;
        }

        @Override // defpackage.jb
        public boolean b() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    class d extends jb {
        d() {
        }

        @Override // defpackage.jb
        public boolean a() {
            return false;
        }

        @Override // defpackage.jb
        public boolean a(com.bumptech.glide.load.a aVar) {
            return false;
        }

        @Override // defpackage.jb
        public boolean a(boolean z, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return (aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || aVar == com.bumptech.glide.load.a.MEMORY_CACHE) ? false : true;
        }

        @Override // defpackage.jb
        public boolean b() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    class e extends jb {
        e() {
        }

        @Override // defpackage.jb
        public boolean a() {
            return true;
        }

        @Override // defpackage.jb
        public boolean a(com.bumptech.glide.load.a aVar) {
            return aVar == com.bumptech.glide.load.a.REMOTE;
        }

        @Override // defpackage.jb
        public boolean a(boolean z, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return ((z && aVar == com.bumptech.glide.load.a.DATA_DISK_CACHE) || aVar == com.bumptech.glide.load.a.LOCAL) && cVar == com.bumptech.glide.load.c.TRANSFORMED;
        }

        @Override // defpackage.jb
        public boolean b() {
            return true;
        }
    }

    static {
        new a();
        a = new b();
        b = new c();
        new d();
        c = new e();
    }

    public abstract boolean a();

    public abstract boolean a(com.bumptech.glide.load.a aVar);

    public abstract boolean a(boolean z, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar);

    public abstract boolean b();
}
