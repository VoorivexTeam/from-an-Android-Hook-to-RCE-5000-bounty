package defpackage;

import android.util.SparseArray;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class nk {
    public static final nk zza = new nk("DEFAULT", 0, 0);
    public static final nk zzb = new nk("UNMETERED_ONLY", 1, 1);
    public static final nk zzc = new nk("UNMETERED_OR_DAILY", 2, 2);
    public static final nk zzd = new nk("FAST_IF_RADIO_AWAKE", 3, 3);
    public static final nk zze = new nk("NEVER", 4, 4);
    public static final nk zzf = new nk("UNRECOGNIZED", 5, -1);
    private static final SparseArray<nk> zzg;

    static {
        SparseArray<nk> sparseArray = new SparseArray<>();
        zzg = sparseArray;
        sparseArray.put(0, zza);
        zzg.put(1, zzb);
        zzg.put(2, zzc);
        zzg.put(3, zzd);
        zzg.put(4, zze);
        zzg.put(-1, zzf);
    }

    private nk(String str, int i, int i2) {
    }
}
