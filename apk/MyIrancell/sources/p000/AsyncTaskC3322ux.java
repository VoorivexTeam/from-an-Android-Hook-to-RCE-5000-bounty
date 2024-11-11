package p000;

import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: ux */
/* loaded from: classes.dex */
public final class AsyncTaskC3322ux extends AsyncTask<C2450ez, Object, Object> {

    /* renamed from: b */
    private static final String f13510b = AsyncTaskC3322ux.class.getSimpleName();

    /* renamed from: c */
    private static final Pattern f13511c = Pattern.compile("[0-9A-Fa-f]+");

    /* renamed from: a */
    private final WifiManager f13512a;

    public AsyncTaskC3322ux(WifiManager wifiManager) {
        this.f13512a = wifiManager;
    }

    /* renamed from: a */
    private static WifiConfiguration m15863a(C2450ez c2450ez) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.allowedAuthAlgorithms.clear();
        wifiConfiguration.allowedGroupCiphers.clear();
        wifiConfiguration.allowedKeyManagement.clear();
        wifiConfiguration.allowedPairwiseCiphers.clear();
        wifiConfiguration.allowedProtocols.clear();
        wifiConfiguration.SSID = m15866a(c2450ez.m11643e(), new int[0]);
        wifiConfiguration.hiddenSSID = c2450ez.m11644f();
        return wifiConfiguration;
    }

    /* renamed from: a */
    private static Integer m15864a(WifiManager wifiManager, String str) {
        List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
        if (configuredNetworks == null) {
            return null;
        }
        for (WifiConfiguration wifiConfiguration : configuredNetworks) {
            String str2 = wifiConfiguration.SSID;
            if (str2 != null && str2.equals(str)) {
                return Integer.valueOf(wifiConfiguration.networkId);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m15865a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str.charAt(0) == '\"' && str.charAt(str.length() - 1) == '\"') {
            return str;
        }
        return '\"' + str + '\"';
    }

    /* renamed from: a */
    private static String m15866a(String str, int... iArr) {
        return m15869a((CharSequence) str, iArr) ? str : m15865a(str);
    }

    /* renamed from: a */
    private static void m15867a(WifiManager wifiManager, WifiConfiguration wifiConfiguration) {
        StringBuilder sb;
        String str;
        Integer m15864a = m15864a(wifiManager, wifiConfiguration.SSID);
        if (m15864a != null) {
            String str2 = "Removing old configuration for network " + wifiConfiguration.SSID;
            wifiManager.removeNetwork(m15864a.intValue());
            wifiManager.saveConfiguration();
        }
        int addNetwork = wifiManager.addNetwork(wifiConfiguration);
        if (addNetwork < 0) {
            sb = new StringBuilder();
            str = "Unable to add network ";
        } else {
            if (wifiManager.enableNetwork(addNetwork, true)) {
                String str3 = "Associating to network " + wifiConfiguration.SSID;
                wifiManager.saveConfiguration();
                return;
            }
            sb = new StringBuilder();
            str = "Failed to enable network ";
        }
        sb.append(str);
        sb.append(wifiConfiguration.SSID);
        sb.toString();
    }

    /* renamed from: a */
    private static void m15868a(WifiManager wifiManager, C2450ez c2450ez) {
        WifiConfiguration m15863a = m15863a(c2450ez);
        m15863a.allowedKeyManagement.set(0);
        m15867a(wifiManager, m15863a);
    }

    /* renamed from: a */
    private static boolean m15869a(CharSequence charSequence, int... iArr) {
        if (charSequence != null && f13511c.matcher(charSequence).matches()) {
            if (iArr.length == 0) {
                return true;
            }
            for (int i : iArr) {
                if (charSequence.length() == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private static void m15870b(WifiManager wifiManager, C2450ez c2450ez) {
        WifiConfiguration m15863a = m15863a(c2450ez);
        m15863a.wepKeys[0] = m15866a(c2450ez.m11642d(), 10, 26, 58);
        m15863a.wepTxKeyIndex = 0;
        m15863a.allowedAuthAlgorithms.set(1);
        m15863a.allowedKeyManagement.set(0);
        m15863a.allowedGroupCiphers.set(2);
        m15863a.allowedGroupCiphers.set(3);
        m15863a.allowedGroupCiphers.set(0);
        m15863a.allowedGroupCiphers.set(1);
        m15867a(wifiManager, m15863a);
    }

    /* renamed from: c */
    private static void m15871c(WifiManager wifiManager, C2450ez c2450ez) {
        WifiConfiguration m15863a = m15863a(c2450ez);
        m15863a.preSharedKey = m15866a(c2450ez.m11642d(), 64);
        m15863a.allowedAuthAlgorithms.set(0);
        m15863a.allowedProtocols.set(0);
        m15863a.allowedProtocols.set(1);
        m15863a.allowedKeyManagement.set(1);
        m15863a.allowedKeyManagement.set(2);
        m15863a.allowedPairwiseCiphers.set(1);
        m15863a.allowedPairwiseCiphers.set(2);
        m15863a.allowedGroupCiphers.set(2);
        m15863a.allowedGroupCiphers.set(3);
        m15867a(wifiManager, m15863a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object doInBackground(C2450ez... c2450ezArr) {
        int i = 0;
        C2450ez c2450ez = c2450ezArr[0];
        if (!this.f13512a.isWifiEnabled()) {
            if (!this.f13512a.setWifiEnabled(true)) {
                return null;
            }
            while (!this.f13512a.isWifiEnabled()) {
                if (i >= 10) {
                    return null;
                }
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
                i++;
            }
        }
        String m11641c = c2450ez.m11641c();
        try {
            EnumC3278tx forIntentValue = EnumC3278tx.forIntentValue(m11641c);
            if (forIntentValue == EnumC3278tx.NO_PASSWORD) {
                m15868a(this.f13512a, c2450ez);
            } else {
                String m11642d = c2450ez.m11642d();
                if (m11642d != null && !m11642d.isEmpty()) {
                    if (forIntentValue == EnumC3278tx.WEP) {
                        m15870b(this.f13512a, c2450ez);
                    } else if (forIntentValue == EnumC3278tx.WPA) {
                        m15871c(this.f13512a, c2450ez);
                    }
                }
            }
            return null;
        } catch (IllegalArgumentException unused2) {
            String str = "Bad network type; see NetworkType values: " + m11641c;
            return null;
        }
    }
}
