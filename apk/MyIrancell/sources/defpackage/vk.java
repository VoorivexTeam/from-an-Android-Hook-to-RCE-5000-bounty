package defpackage;

import defpackage.gl;

/* loaded from: classes.dex */
final class vk extends gl {
    private final gl.c a;
    private final gl.b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends gl.a {
        private gl.c a;
        private gl.b b;

        @Override // gl.a
        public gl.a a(gl.b bVar) {
            this.b = bVar;
            return this;
        }

        @Override // gl.a
        public gl.a a(gl.c cVar) {
            this.a = cVar;
            return this;
        }

        @Override // gl.a
        public gl a() {
            return new vk(this.a, this.b, null);
        }
    }

    /* synthetic */ vk(gl.c cVar, gl.b bVar, a aVar) {
        this.a = cVar;
        this.b = bVar;
    }

    public gl.b b() {
        return this.b;
    }

    public gl.c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gl)) {
            return false;
        }
        gl.c cVar = this.a;
        if (cVar != null ? cVar.equals(((vk) obj).a) : ((vk) obj).a == null) {
            gl.b bVar = this.b;
            gl.b bVar2 = ((vk) obj).b;
            if (bVar == null) {
                if (bVar2 == null) {
                    return true;
                }
            } else if (bVar.equals(bVar2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        gl.c cVar = this.a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        gl.b bVar = this.b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
