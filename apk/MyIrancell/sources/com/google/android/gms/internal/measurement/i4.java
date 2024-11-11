package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public enum i4 {
    DOUBLE(0, l4.SCALAR, y4.DOUBLE),
    FLOAT(1, l4.SCALAR, y4.FLOAT),
    INT64(2, l4.SCALAR, y4.LONG),
    UINT64(3, l4.SCALAR, y4.LONG),
    INT32(4, l4.SCALAR, y4.INT),
    FIXED64(5, l4.SCALAR, y4.LONG),
    FIXED32(6, l4.SCALAR, y4.INT),
    BOOL(7, l4.SCALAR, y4.BOOLEAN),
    STRING(8, l4.SCALAR, y4.STRING),
    MESSAGE(9, l4.SCALAR, y4.MESSAGE),
    BYTES(10, l4.SCALAR, y4.BYTE_STRING),
    UINT32(11, l4.SCALAR, y4.INT),
    ENUM(12, l4.SCALAR, y4.ENUM),
    SFIXED32(13, l4.SCALAR, y4.INT),
    SFIXED64(14, l4.SCALAR, y4.LONG),
    SINT32(15, l4.SCALAR, y4.INT),
    SINT64(16, l4.SCALAR, y4.LONG),
    GROUP(17, l4.SCALAR, y4.MESSAGE),
    DOUBLE_LIST(18, l4.VECTOR, y4.DOUBLE),
    FLOAT_LIST(19, l4.VECTOR, y4.FLOAT),
    INT64_LIST(20, l4.VECTOR, y4.LONG),
    UINT64_LIST(21, l4.VECTOR, y4.LONG),
    INT32_LIST(22, l4.VECTOR, y4.INT),
    FIXED64_LIST(23, l4.VECTOR, y4.LONG),
    FIXED32_LIST(24, l4.VECTOR, y4.INT),
    BOOL_LIST(25, l4.VECTOR, y4.BOOLEAN),
    STRING_LIST(26, l4.VECTOR, y4.STRING),
    MESSAGE_LIST(27, l4.VECTOR, y4.MESSAGE),
    BYTES_LIST(28, l4.VECTOR, y4.BYTE_STRING),
    UINT32_LIST(29, l4.VECTOR, y4.INT),
    ENUM_LIST(30, l4.VECTOR, y4.ENUM),
    SFIXED32_LIST(31, l4.VECTOR, y4.INT),
    SFIXED64_LIST(32, l4.VECTOR, y4.LONG),
    SINT32_LIST(33, l4.VECTOR, y4.INT),
    SINT64_LIST(34, l4.VECTOR, y4.LONG),
    DOUBLE_LIST_PACKED(35, l4.PACKED_VECTOR, y4.DOUBLE),
    FLOAT_LIST_PACKED(36, l4.PACKED_VECTOR, y4.FLOAT),
    INT64_LIST_PACKED(37, l4.PACKED_VECTOR, y4.LONG),
    UINT64_LIST_PACKED(38, l4.PACKED_VECTOR, y4.LONG),
    INT32_LIST_PACKED(39, l4.PACKED_VECTOR, y4.INT),
    FIXED64_LIST_PACKED(40, l4.PACKED_VECTOR, y4.LONG),
    FIXED32_LIST_PACKED(41, l4.PACKED_VECTOR, y4.INT),
    BOOL_LIST_PACKED(42, l4.PACKED_VECTOR, y4.BOOLEAN),
    UINT32_LIST_PACKED(43, l4.PACKED_VECTOR, y4.INT),
    ENUM_LIST_PACKED(44, l4.PACKED_VECTOR, y4.ENUM),
    SFIXED32_LIST_PACKED(45, l4.PACKED_VECTOR, y4.INT),
    SFIXED64_LIST_PACKED(46, l4.PACKED_VECTOR, y4.LONG),
    SINT32_LIST_PACKED(47, l4.PACKED_VECTOR, y4.INT),
    SINT64_LIST_PACKED(48, l4.PACKED_VECTOR, y4.LONG),
    GROUP_LIST(49, l4.VECTOR, y4.MESSAGE),
    MAP(50, l4.MAP, y4.VOID);

    private static final i4[] zzbe;
    private static final Type[] zzbf = new Type[0];
    private final y4 zzaz;
    private final int zzba;
    private final l4 zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    static {
        i4[] values = values();
        zzbe = new i4[values.length];
        for (i4 i4Var : values) {
            zzbe[i4Var.zzba] = i4Var;
        }
    }

    i4(int i, l4 l4Var, y4 y4Var) {
        int i2;
        this.zzba = i;
        this.zzbb = l4Var;
        this.zzaz = y4Var;
        int i3 = h4.a[l4Var.ordinal()];
        this.zzbc = (i3 == 1 || i3 == 2) ? y4Var.zza() : null;
        this.zzbd = (l4Var != l4.SCALAR || (i2 = h4.b[y4Var.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : true;
    }

    public final int zza() {
        return this.zzba;
    }
}
