package p000;

import android.util.SparseArray;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: nk */
/* loaded from: classes.dex */
public final class EnumC2992nk {
    public static final EnumC2992nk zza = new EnumC2992nk("DEFAULT", 0, 0);
    public static final EnumC2992nk zzb = new EnumC2992nk("UNMETERED_ONLY", 1, 1);
    public static final EnumC2992nk zzc = new EnumC2992nk("UNMETERED_OR_DAILY", 2, 2);
    public static final EnumC2992nk zzd = new EnumC2992nk("FAST_IF_RADIO_AWAKE", 3, 3);
    public static final EnumC2992nk zze = new EnumC2992nk("NEVER", 4, 4);
    public static final EnumC2992nk zzf = new EnumC2992nk("UNRECOGNIZED", 5, -1);
    private static final SparseArray<EnumC2992nk> zzg;

    static {
        SparseArray<EnumC2992nk> sparseArray = new SparseArray<>();
        zzg = sparseArray;
        sparseArray.put(0, zza);
        zzg.put(1, zzb);
        zzg.put(2, zzc);
        zzg.put(3, zzd);
        zzg.put(4, zze);
        zzg.put(-1, zzf);
    }

    private EnumC2992nk(String str, int i, int i2) {
    }
}
