package defpackage;

/* loaded from: classes.dex */
public class hw {
    private final float a;
    private final float b;

    public hw(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static float a(hw hwVar, hw hwVar2) {
        return sz.a(hwVar.a, hwVar.b, hwVar2.a, hwVar2.b);
    }

    private static float a(hw hwVar, hw hwVar2, hw hwVar3) {
        float f = hwVar2.a;
        float f2 = hwVar2.b;
        return ((hwVar3.a - f) * (hwVar.b - f2)) - ((hwVar3.b - f2) * (hwVar.a - f));
    }

    public static void a(hw[] hwVarArr) {
        hw hwVar;
        hw hwVar2;
        hw hwVar3;
        float a = a(hwVarArr[0], hwVarArr[1]);
        float a2 = a(hwVarArr[1], hwVarArr[2]);
        float a3 = a(hwVarArr[0], hwVarArr[2]);
        if (a2 >= a && a2 >= a3) {
            hwVar = hwVarArr[0];
            hwVar2 = hwVarArr[1];
            hwVar3 = hwVarArr[2];
        } else if (a3 < a2 || a3 < a) {
            hwVar = hwVarArr[2];
            hwVar2 = hwVarArr[0];
            hwVar3 = hwVarArr[1];
        } else {
            hwVar = hwVarArr[1];
            hwVar2 = hwVarArr[0];
            hwVar3 = hwVarArr[2];
        }
        if (a(hwVar2, hwVar, hwVar3) < 0.0f) {
            hw hwVar4 = hwVar3;
            hwVar3 = hwVar2;
            hwVar2 = hwVar4;
        }
        hwVarArr[0] = hwVar2;
        hwVarArr[1] = hwVar;
        hwVarArr[2] = hwVar3;
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hw)) {
            return false;
        }
        hw hwVar = (hw) obj;
        return this.a == hwVar.a && this.b == hwVar.b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(25);
        sb.append('(');
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
