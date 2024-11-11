package p000;

import android.util.SparseArray;
import p000.C3362vk;

/* renamed from: gl */
/* loaded from: classes.dex */
public abstract class AbstractC2517gl {

    /* renamed from: gl$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract a mo12031a(b bVar);

        /* renamed from: a */
        public abstract a mo12032a(c cVar);

        /* renamed from: a */
        public abstract AbstractC2517gl mo12033a();
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: gl$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static final b zza = new b("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
        public static final b zzb = new b("GPRS", 1, 1);
        public static final b zzc = new b("EDGE", 2, 2);
        public static final b zzd = new b("UMTS", 3, 3);
        public static final b zze = new b("CDMA", 4, 4);
        public static final b zzf = new b("EVDO_0", 5, 5);
        public static final b zzg = new b("EVDO_A", 6, 6);
        public static final b zzh = new b("RTT", 7, 7);
        public static final b zzi = new b("HSDPA", 8, 8);
        public static final b zzj = new b("HSUPA", 9, 9);
        public static final b zzk = new b("HSPA", 10, 10);
        public static final b zzl = new b("IDEN", 11, 11);
        public static final b zzm = new b("EVDO_B", 12, 12);
        public static final b zzn = new b("LTE", 13, 13);
        public static final b zzo = new b("EHRPD", 14, 14);
        public static final b zzp = new b("HSPAP", 15, 15);
        public static final b zzq = new b("GSM", 16, 16);
        public static final b zzr = new b("TD_SCDMA", 17, 17);
        public static final b zzs = new b("IWLAN", 18, 18);
        public static final b zzt = new b("LTE_CA", 19, 19);
        public static final b zzu = new b("COMBINED", 20, 100);
        private static final SparseArray<b> zzv;
        private final int zzw;

        static {
            SparseArray<b> sparseArray = new SparseArray<>();
            zzv = sparseArray;
            sparseArray.put(0, zza);
            zzv.put(1, zzb);
            zzv.put(2, zzc);
            zzv.put(3, zzd);
            zzv.put(4, zze);
            zzv.put(5, zzf);
            zzv.put(6, zzg);
            zzv.put(7, zzh);
            zzv.put(8, zzi);
            zzv.put(9, zzj);
            zzv.put(10, zzk);
            zzv.put(11, zzl);
            zzv.put(12, zzm);
            zzv.put(13, zzn);
            zzv.put(14, zzo);
            zzv.put(15, zzp);
            zzv.put(16, zzq);
            zzv.put(17, zzr);
            zzv.put(18, zzs);
            zzv.put(19, zzt);
        }

        private b(String str, int i, int i2) {
            this.zzw = i2;
        }

        public static b zza(int i) {
            return zzv.get(i);
        }

        public int zza() {
            return this.zzw;
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: gl$c */
    /* loaded from: classes.dex */
    public static final class c {
        public static final c zza = new c("MOBILE", 0, 0);
        public static final c zzb = new c("WIFI", 1, 1);
        public static final c zzc = new c("MOBILE_MMS", 2, 2);
        public static final c zzd = new c("MOBILE_SUPL", 3, 3);
        public static final c zze = new c("MOBILE_DUN", 4, 4);
        public static final c zzf = new c("MOBILE_HIPRI", 5, 5);
        public static final c zzg = new c("WIMAX", 6, 6);
        public static final c zzh = new c("BLUETOOTH", 7, 7);
        public static final c zzi = new c("DUMMY", 8, 8);
        public static final c zzj = new c("ETHERNET", 9, 9);
        public static final c zzk = new c("MOBILE_FOTA", 10, 10);
        public static final c zzl = new c("MOBILE_IMS", 11, 11);
        public static final c zzm = new c("MOBILE_CBS", 12, 12);
        public static final c zzn = new c("WIFI_P2P", 13, 13);
        public static final c zzo = new c("MOBILE_IA", 14, 14);
        public static final c zzp = new c("MOBILE_EMERGENCY", 15, 15);
        public static final c zzq = new c("PROXY", 16, 16);
        public static final c zzr = new c("VPN", 17, 17);
        public static final c zzs = new c("NONE", 18, -1);
        private static final SparseArray<c> zzt;
        private final int zzu;

        static {
            SparseArray<c> sparseArray = new SparseArray<>();
            zzt = sparseArray;
            sparseArray.put(0, zza);
            zzt.put(1, zzb);
            zzt.put(2, zzc);
            zzt.put(3, zzd);
            zzt.put(4, zze);
            zzt.put(5, zzf);
            zzt.put(6, zzg);
            zzt.put(7, zzh);
            zzt.put(8, zzi);
            zzt.put(9, zzj);
            zzt.put(10, zzk);
            zzt.put(11, zzl);
            zzt.put(12, zzm);
            zzt.put(13, zzn);
            zzt.put(14, zzo);
            zzt.put(15, zzp);
            zzt.put(16, zzq);
            zzt.put(17, zzr);
            zzt.put(-1, zzs);
        }

        private c(String str, int i, int i2) {
            this.zzu = i2;
        }

        public static c zza(int i) {
            return zzt.get(i);
        }

        public int zza() {
            return this.zzu;
        }
    }

    /* renamed from: a */
    public static a m12030a() {
        return new C3362vk.b();
    }
}
