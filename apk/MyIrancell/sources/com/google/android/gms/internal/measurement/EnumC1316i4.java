package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.measurement.i4 */
/* loaded from: classes.dex */
public enum EnumC1316i4 {
    DOUBLE(0, EnumC1361l4.SCALAR, EnumC1546y4.DOUBLE),
    FLOAT(1, EnumC1361l4.SCALAR, EnumC1546y4.FLOAT),
    INT64(2, EnumC1361l4.SCALAR, EnumC1546y4.LONG),
    UINT64(3, EnumC1361l4.SCALAR, EnumC1546y4.LONG),
    INT32(4, EnumC1361l4.SCALAR, EnumC1546y4.INT),
    FIXED64(5, EnumC1361l4.SCALAR, EnumC1546y4.LONG),
    FIXED32(6, EnumC1361l4.SCALAR, EnumC1546y4.INT),
    BOOL(7, EnumC1361l4.SCALAR, EnumC1546y4.BOOLEAN),
    STRING(8, EnumC1361l4.SCALAR, EnumC1546y4.STRING),
    MESSAGE(9, EnumC1361l4.SCALAR, EnumC1546y4.MESSAGE),
    BYTES(10, EnumC1361l4.SCALAR, EnumC1546y4.BYTE_STRING),
    UINT32(11, EnumC1361l4.SCALAR, EnumC1546y4.INT),
    ENUM(12, EnumC1361l4.SCALAR, EnumC1546y4.ENUM),
    SFIXED32(13, EnumC1361l4.SCALAR, EnumC1546y4.INT),
    SFIXED64(14, EnumC1361l4.SCALAR, EnumC1546y4.LONG),
    SINT32(15, EnumC1361l4.SCALAR, EnumC1546y4.INT),
    SINT64(16, EnumC1361l4.SCALAR, EnumC1546y4.LONG),
    GROUP(17, EnumC1361l4.SCALAR, EnumC1546y4.MESSAGE),
    DOUBLE_LIST(18, EnumC1361l4.VECTOR, EnumC1546y4.DOUBLE),
    FLOAT_LIST(19, EnumC1361l4.VECTOR, EnumC1546y4.FLOAT),
    INT64_LIST(20, EnumC1361l4.VECTOR, EnumC1546y4.LONG),
    UINT64_LIST(21, EnumC1361l4.VECTOR, EnumC1546y4.LONG),
    INT32_LIST(22, EnumC1361l4.VECTOR, EnumC1546y4.INT),
    FIXED64_LIST(23, EnumC1361l4.VECTOR, EnumC1546y4.LONG),
    FIXED32_LIST(24, EnumC1361l4.VECTOR, EnumC1546y4.INT),
    BOOL_LIST(25, EnumC1361l4.VECTOR, EnumC1546y4.BOOLEAN),
    STRING_LIST(26, EnumC1361l4.VECTOR, EnumC1546y4.STRING),
    MESSAGE_LIST(27, EnumC1361l4.VECTOR, EnumC1546y4.MESSAGE),
    BYTES_LIST(28, EnumC1361l4.VECTOR, EnumC1546y4.BYTE_STRING),
    UINT32_LIST(29, EnumC1361l4.VECTOR, EnumC1546y4.INT),
    ENUM_LIST(30, EnumC1361l4.VECTOR, EnumC1546y4.ENUM),
    SFIXED32_LIST(31, EnumC1361l4.VECTOR, EnumC1546y4.INT),
    SFIXED64_LIST(32, EnumC1361l4.VECTOR, EnumC1546y4.LONG),
    SINT32_LIST(33, EnumC1361l4.VECTOR, EnumC1546y4.INT),
    SINT64_LIST(34, EnumC1361l4.VECTOR, EnumC1546y4.LONG),
    DOUBLE_LIST_PACKED(35, EnumC1361l4.PACKED_VECTOR, EnumC1546y4.DOUBLE),
    FLOAT_LIST_PACKED(36, EnumC1361l4.PACKED_VECTOR, EnumC1546y4.FLOAT),
    INT64_LIST_PACKED(37, EnumC1361l4.PACKED_VECTOR, EnumC1546y4.LONG),
    UINT64_LIST_PACKED(38, EnumC1361l4.PACKED_VECTOR, EnumC1546y4.LONG),
    INT32_LIST_PACKED(39, EnumC1361l4.PACKED_VECTOR, EnumC1546y4.INT),
    FIXED64_LIST_PACKED(40, EnumC1361l4.PACKED_VECTOR, EnumC1546y4.LONG),
    FIXED32_LIST_PACKED(41, EnumC1361l4.PACKED_VECTOR, EnumC1546y4.INT),
    BOOL_LIST_PACKED(42, EnumC1361l4.PACKED_VECTOR, EnumC1546y4.BOOLEAN),
    UINT32_LIST_PACKED(43, EnumC1361l4.PACKED_VECTOR, EnumC1546y4.INT),
    ENUM_LIST_PACKED(44, EnumC1361l4.PACKED_VECTOR, EnumC1546y4.ENUM),
    SFIXED32_LIST_PACKED(45, EnumC1361l4.PACKED_VECTOR, EnumC1546y4.INT),
    SFIXED64_LIST_PACKED(46, EnumC1361l4.PACKED_VECTOR, EnumC1546y4.LONG),
    SINT32_LIST_PACKED(47, EnumC1361l4.PACKED_VECTOR, EnumC1546y4.INT),
    SINT64_LIST_PACKED(48, EnumC1361l4.PACKED_VECTOR, EnumC1546y4.LONG),
    GROUP_LIST(49, EnumC1361l4.VECTOR, EnumC1546y4.MESSAGE),
    MAP(50, EnumC1361l4.MAP, EnumC1546y4.VOID);

    private static final EnumC1316i4[] zzbe;
    private static final Type[] zzbf = new Type[0];
    private final EnumC1546y4 zzaz;
    private final int zzba;
    private final EnumC1361l4 zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    static {
        EnumC1316i4[] values = values();
        zzbe = new EnumC1316i4[values.length];
        for (EnumC1316i4 enumC1316i4 : values) {
            zzbe[enumC1316i4.zzba] = enumC1316i4;
        }
    }

    EnumC1316i4(int i, EnumC1361l4 enumC1361l4, EnumC1546y4 enumC1546y4) {
        int i2;
        this.zzba = i;
        this.zzbb = enumC1361l4;
        this.zzaz = enumC1546y4;
        int i3 = C1301h4.f6638a[enumC1361l4.ordinal()];
        this.zzbc = (i3 == 1 || i3 == 2) ? enumC1546y4.zza() : null;
        this.zzbd = (enumC1361l4 != EnumC1361l4.SCALAR || (i2 = C1301h4.f6639b[enumC1546y4.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : true;
    }

    public final int zza() {
        return this.zzba;
    }
}
