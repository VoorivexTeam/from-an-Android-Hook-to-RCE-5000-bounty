package defpackage;

import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ux extends AsyncTask<ez, Object, Object> {
    private static final String b = ux.class.getSimpleName();
    private static final Pattern c = Pattern.compile("[0-9A-Fa-f]+");
    private final WifiManager a;

    public ux(WifiManager wifiManager) {
        this.a = wifiManager;
    }

    private static WifiConfiguration a(ez ezVar) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.allowedAuthAlgorithms.clear();
        wifiConfiguration.allowedGroupCiphers.clear();
        wifiConfiguration.allowedKeyManagement.clear();
        wifiConfiguration.allowedPairwiseCiphers.clear();
        wifiConfiguration.allowedProtocols.clear();
        wifiConfiguration.SSID = a(ezVar.e(), new int[0]);
        wifiConfiguration.hiddenSSID = ezVar.f();
        return wifiConfiguration;
    }

    private static Integer a(WifiManager wifiManager, String str) {
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

    private static String a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str.charAt(0) == '\"' && str.charAt(str.length() - 1) == '\"') {
            return str;
        }
        return '\"' + str + '\"';
    }

    private static String a(String str, int... iArr) {
        return a((CharSequence) str, iArr) ? str : a(str);
    }

    private static void a(WifiManager wifiManager, WifiConfiguration wifiConfiguration) {
        StringBuilder sb;
        String str;
        Integer a = a(wifiManager, wifiConfiguration.SSID);
        if (a != null) {
            String str2 = "Removing old configuration for network " + wifiConfiguration.SSID;
            wifiManager.removeNetwork(a.intValue());
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

    private static void a(WifiManager wifiManager, ez ezVar) {
        WifiConfiguration a = a(ezVar);
        a.allowedKeyManagement.set(0);
        a(wifiManager, a);
    }

    private static boolean a(CharSequence charSequence, int... iArr) {
        if (charSequence != null && c.matcher(charSequence).matches()) {
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

    private static void b(WifiManager wifiManager, ez ezVar) {
        WifiConfiguration a = a(ezVar);
        a.wepKeys[0] = a(ezVar.d(), 10, 26, 58);
        a.wepTxKeyIndex = 0;
        a.allowedAuthAlgorithms.set(1);
        a.allowedKeyManagement.set(0);
        a.allowedGroupCiphers.set(2);
        a.allowedGroupCiphers.set(3);
        a.allowedGroupCiphers.set(0);
        a.allowedGroupCiphers.set(1);
        a(wifiManager, a);
    }

    private static void c(WifiManager wifiManager, ez ezVar) {
        WifiConfiguration a = a(ezVar);
        a.preSharedKey = a(ezVar.d(), 64);
        a.allowedAuthAlgorithms.set(0);
        a.allowedProtocols.set(0);
        a.allowedProtocols.set(1);
        a.allowedKeyManagement.set(1);
        a.allowedKeyManagement.set(2);
        a.allowedPairwiseCiphers.set(1);
        a.allowedPairwiseCiphers.set(2);
        a.allowedGroupCiphers.set(2);
        a.allowedGroupCiphers.set(3);
        a(wifiManager, a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object doInBackground(ez... ezVarArr) {
        int i = 0;
        ez ezVar = ezVarArr[0];
        if (!this.a.isWifiEnabled()) {
            if (!this.a.setWifiEnabled(true)) {
                return null;
            }
            while (!this.a.isWifiEnabled()) {
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
        String c2 = ezVar.c();
        try {
            tx forIntentValue = tx.forIntentValue(c2);
            if (forIntentValue == tx.NO_PASSWORD) {
                a(this.a, ezVar);
            } else {
                String d = ezVar.d();
                if (d != null && !d.isEmpty()) {
                    if (forIntentValue == tx.WEP) {
                        b(this.a, ezVar);
                    } else if (forIntentValue == tx.WPA) {
                        c(this.a, ezVar);
                    }
                }
            }
            return null;
        } catch (IllegalArgumentException unused2) {
            String str = "Bad network type; see NetworkType values: " + c2;
            return null;
        }
    }
}
