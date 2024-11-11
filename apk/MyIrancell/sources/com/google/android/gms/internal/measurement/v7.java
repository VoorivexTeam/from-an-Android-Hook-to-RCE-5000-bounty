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
/* loaded from: classes.dex */
public class v7 {
    public static final v7 zza = new v7("DOUBLE", 0, c8.DOUBLE, 1);
    public static final v7 zzb = new v7("FLOAT", 1, c8.FLOAT, 5);
    public static final v7 zzc = new v7("INT64", 2, c8.LONG, 0);
    public static final v7 zzd = new v7("UINT64", 3, c8.LONG, 0);
    public static final v7 zze = new v7("INT32", 4, c8.INT, 0);
    public static final v7 zzf = new v7("FIXED64", 5, c8.LONG, 1);
    public static final v7 zzg = new v7("FIXED32", 6, c8.INT, 5);
    public static final v7 zzh = new v7("BOOL", 7, c8.BOOLEAN, 0);
    public static final v7 zzi;
    public static final v7 zzj;
    public static final v7 zzk;
    public static final v7 zzl;
    public static final v7 zzm;
    public static final v7 zzn;
    public static final v7 zzo;
    public static final v7 zzp;
    public static final v7 zzq;
    public static final v7 zzr;
    private static final /* synthetic */ v7[] zzu;
    private final c8 zzs;
    private final int zzt;

    static {
        final int i = 2;
        final int i2 = 3;
        final c8 c8Var = c8.STRING;
        final int i3 = 8;
        final String str = "STRING";
        zzi = new v7(str, i3, c8Var, i) { // from class: com.google.android.gms.internal.measurement.y7
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i4 = 8;
                int i5 = 2;
                w7 w7Var = null;
            }
        };
        final c8 c8Var2 = c8.MESSAGE;
        final int i4 = 9;
        final String str2 = "GROUP";
        zzj = new v7(str2, i4, c8Var2, i2) { // from class: com.google.android.gms.internal.measurement.x7
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i5 = 9;
                int i6 = 3;
                w7 w7Var = null;
            }
        };
        final c8 c8Var3 = c8.MESSAGE;
        final int i5 = 10;
        final String str3 = "MESSAGE";
        zzk = new v7(str3, i5, c8Var3, i) { // from class: com.google.android.gms.internal.measurement.a8
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i6 = 10;
                int i7 = 2;
                w7 w7Var = null;
            }
        };
        final c8 c8Var4 = c8.BYTE_STRING;
        final int i6 = 11;
        final String str4 = "BYTES";
        zzl = new v7(str4, i6, c8Var4, i) { // from class: com.google.android.gms.internal.measurement.z7
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i7 = 11;
                int i8 = 2;
                w7 w7Var = null;
            }
        };
        zzm = new v7("UINT32", 12, c8.INT, 0);
        zzn = new v7("ENUM", 13, c8.ENUM, 0);
        zzo = new v7("SFIXED32", 14, c8.INT, 5);
        zzp = new v7("SFIXED64", 15, c8.LONG, 1);
        zzq = new v7("SINT32", 16, c8.INT, 0);
        v7 v7Var = new v7("SINT64", 17, c8.LONG, 0);
        zzr = v7Var;
        zzu = new v7[]{zza, zzb, zzc, zzd, zze, zzf, zzg, zzh, zzi, zzj, zzk, zzl, zzm, zzn, zzo, zzp, zzq, v7Var};
    }

    private v7(String str, int i, c8 c8Var, int i2) {
        this.zzs = c8Var;
        this.zzt = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ v7(String str, int i, c8 c8Var, int i2, w7 w7Var) {
        this(str, i, c8Var, i2);
    }

    public static v7[] values() {
        return (v7[]) zzu.clone();
    }

    public final c8 zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
