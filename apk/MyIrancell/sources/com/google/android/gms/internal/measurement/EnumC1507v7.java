package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzi' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.android.gms.internal.measurement.v7 */
/* loaded from: classes.dex */
public class EnumC1507v7 {
    public static final EnumC1507v7 zza = new EnumC1507v7("DOUBLE", 0, EnumC1230c8.DOUBLE, 1);
    public static final EnumC1507v7 zzb = new EnumC1507v7("FLOAT", 1, EnumC1230c8.FLOAT, 5);
    public static final EnumC1507v7 zzc = new EnumC1507v7("INT64", 2, EnumC1230c8.LONG, 0);
    public static final EnumC1507v7 zzd = new EnumC1507v7("UINT64", 3, EnumC1230c8.LONG, 0);
    public static final EnumC1507v7 zze = new EnumC1507v7("INT32", 4, EnumC1230c8.INT, 0);
    public static final EnumC1507v7 zzf = new EnumC1507v7("FIXED64", 5, EnumC1230c8.LONG, 1);
    public static final EnumC1507v7 zzg = new EnumC1507v7("FIXED32", 6, EnumC1230c8.INT, 5);
    public static final EnumC1507v7 zzh = new EnumC1507v7("BOOL", 7, EnumC1230c8.BOOLEAN, 0);
    public static final EnumC1507v7 zzi;
    public static final EnumC1507v7 zzj;
    public static final EnumC1507v7 zzk;
    public static final EnumC1507v7 zzl;
    public static final EnumC1507v7 zzm;
    public static final EnumC1507v7 zzn;
    public static final EnumC1507v7 zzo;
    public static final EnumC1507v7 zzp;
    public static final EnumC1507v7 zzq;
    public static final EnumC1507v7 zzr;
    private static final /* synthetic */ EnumC1507v7[] zzu;
    private final EnumC1230c8 zzs;
    private final int zzt;

    static {
        final int i = 2;
        final int i2 = 3;
        final EnumC1230c8 enumC1230c8 = EnumC1230c8.STRING;
        final int i3 = 8;
        final String str = "STRING";
        zzi = new EnumC1507v7(str, i3, enumC1230c8, i) { // from class: com.google.android.gms.internal.measurement.y7
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i4 = 8;
                int i5 = 2;
                C1521w7 c1521w7 = null;
            }
        };
        final EnumC1230c8 enumC1230c82 = EnumC1230c8.MESSAGE;
        final int i4 = 9;
        final String str2 = "GROUP";
        zzj = new EnumC1507v7(str2, i4, enumC1230c82, i2) { // from class: com.google.android.gms.internal.measurement.x7
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i5 = 9;
                int i6 = 3;
                C1521w7 c1521w7 = null;
            }
        };
        final EnumC1230c8 enumC1230c83 = EnumC1230c8.MESSAGE;
        final int i5 = 10;
        final String str3 = "MESSAGE";
        zzk = new EnumC1507v7(str3, i5, enumC1230c83, i) { // from class: com.google.android.gms.internal.measurement.a8
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i6 = 10;
                int i7 = 2;
                C1521w7 c1521w7 = null;
            }
        };
        final EnumC1230c8 enumC1230c84 = EnumC1230c8.BYTE_STRING;
        final int i6 = 11;
        final String str4 = "BYTES";
        zzl = new EnumC1507v7(str4, i6, enumC1230c84, i) { // from class: com.google.android.gms.internal.measurement.z7
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i7 = 11;
                int i8 = 2;
                C1521w7 c1521w7 = null;
            }
        };
        zzm = new EnumC1507v7("UINT32", 12, EnumC1230c8.INT, 0);
        zzn = new EnumC1507v7("ENUM", 13, EnumC1230c8.ENUM, 0);
        zzo = new EnumC1507v7("SFIXED32", 14, EnumC1230c8.INT, 5);
        zzp = new EnumC1507v7("SFIXED64", 15, EnumC1230c8.LONG, 1);
        zzq = new EnumC1507v7("SINT32", 16, EnumC1230c8.INT, 0);
        EnumC1507v7 enumC1507v7 = new EnumC1507v7("SINT64", 17, EnumC1230c8.LONG, 0);
        zzr = enumC1507v7;
        zzu = new EnumC1507v7[]{zza, zzb, zzc, zzd, zze, zzf, zzg, zzh, zzi, zzj, zzk, zzl, zzm, zzn, zzo, zzp, zzq, enumC1507v7};
    }

    private EnumC1507v7(String str, int i, EnumC1230c8 enumC1230c8, int i2) {
        this.zzs = enumC1230c8;
        this.zzt = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ EnumC1507v7(String str, int i, EnumC1230c8 enumC1230c8, int i2, C1521w7 c1521w7) {
        this(str, i, enumC1230c8, i2);
    }

    public static EnumC1507v7[] values() {
        return (EnumC1507v7[]) zzu.clone();
    }

    public final EnumC1230c8 zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
