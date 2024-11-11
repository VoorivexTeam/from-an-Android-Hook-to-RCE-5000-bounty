package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class fw {
    private final String a;
    private final byte[] b;
    private hw[] c;
    private final sv d;
    private Map<gw, Object> e;
    private final long f;

    public fw(String str, byte[] bArr, hw[] hwVarArr, sv svVar) {
        this(str, bArr, hwVarArr, svVar, System.currentTimeMillis());
    }

    public fw(String str, byte[] bArr, hw[] hwVarArr, sv svVar, long j) {
        this.a = str;
        this.b = bArr;
        this.c = hwVarArr;
        this.d = svVar;
        this.e = null;
        this.f = j;
    }

    public sv a() {
        return this.d;
    }

    public void a(gw gwVar, Object obj) {
        if (this.e == null) {
            this.e = new EnumMap(gw.class);
        }
        this.e.put(gwVar, obj);
    }

    public void a(Map<gw, Object> map) {
        if (map != null) {
            Map<gw, Object> map2 = this.e;
            if (map2 == null) {
                this.e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void a(hw[] hwVarArr) {
        hw[] hwVarArr2 = this.c;
        if (hwVarArr2 == null) {
            this.c = hwVarArr;
            return;
        }
        if (hwVarArr == null || hwVarArr.length <= 0) {
            return;
        }
        hw[] hwVarArr3 = new hw[hwVarArr2.length + hwVarArr.length];
        System.arraycopy(hwVarArr2, 0, hwVarArr3, 0, hwVarArr2.length);
        System.arraycopy(hwVarArr, 0, hwVarArr3, hwVarArr2.length, hwVarArr.length);
        this.c = hwVarArr3;
    }

    public byte[] b() {
        return this.b;
    }

    public Map<gw, Object> c() {
        return this.e;
    }

    public hw[] d() {
        return this.c;
    }

    public String e() {
        return this.a;
    }

    public long f() {
        return this.f;
    }

    public String toString() {
        return this.a;
    }
}
