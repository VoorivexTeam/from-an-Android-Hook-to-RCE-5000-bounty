package com.comviva.webaxn.utils;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.fingerprint.FingerprintManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.provider.Settings;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.DateFormat;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.comviva.webaxn.utils.k */
/* loaded from: classes.dex */
public class C0714k {

    /* renamed from: a */
    public static int f4878a = -1;

    /* renamed from: b */
    public static int f4879b;

    /* renamed from: c */
    private static TelephonyManager f4880c;

    /* renamed from: d */
    public static C0725n1 f4881d;

    /* renamed from: e */
    private static ConnectivityManager f4882e;

    /* renamed from: f */
    private static AudioManager f4883f;

    /* renamed from: g */
    private static NfcAdapter f4884g;

    /* renamed from: h */
    private static final PhoneStateListener f4885h = new a();

    /* renamed from: i */
    static BroadcastReceiver f4886i = new b();

    /* renamed from: com.comviva.webaxn.utils.k$a */
    /* loaded from: classes.dex */
    static class a extends PhoneStateListener {
        a() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            C0714k.f4879b = signalStrength.isGsm() ? signalStrength.getGsmSignalStrength() : signalStrength.getCdmaDbm();
        }
    }

    /* renamed from: com.comviva.webaxn.utils.k$b */
    /* loaded from: classes.dex */
    static class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C0714k.f4878a = -1;
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 <= 0) {
                return;
            }
            C0714k.f4878a = (intExtra * 100) / intExtra2;
        }
    }

    public C0714k(Context context) {
        try {
            f4880c = (TelephonyManager) context.getSystemService("phone");
            f4882e = (ConnectivityManager) context.getSystemService("connectivity");
            f4883f = (AudioManager) context.getSystemService("audio");
            if (Build.VERSION.SDK_INT >= 10) {
                f4884g = NfcAdapter.getDefaultAdapter(context);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: A */
    public static void m5751A(Context context) {
        try {
            if (f4880c != null) {
                f4880c.listen(f4885h, 256);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static int m5752a() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static String m5753a(int i) {
        return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
    }

    /* renamed from: a */
    public static String m5754a(Context context) {
        StringBuffer stringBuffer = new StringBuffer();
        if (Build.VERSION.SDK_INT < 22) {
            if (f4880c != null) {
                stringBuffer.append("sim:");
                stringBuffer.append("OPERATOR-NAME".toLowerCase() + "=" + f4880c.getNetworkOperatorName());
                try {
                    if (!TextUtils.isEmpty(f4880c.getDeviceId())) {
                        stringBuffer.append(";" + "IMEI".toLowerCase() + "=" + f4880c.getDeviceId());
                    }
                    if (!TextUtils.isEmpty(f4880c.getSubscriberId())) {
                        stringBuffer.append(";imsi=" + f4880c.getSubscriberId());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return stringBuffer.toString();
        }
        List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) context.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList != null) {
            String str = activeSubscriptionInfoList.size() > 1 ? "sim1:" : "sim:";
            for (int i = 0; i < activeSubscriptionInfoList.size(); i++) {
                if (i == 1) {
                    str = "&sim2:";
                }
                stringBuffer.append(str);
                stringBuffer.append("OPERATOR-NAME".toLowerCase() + "=" + ((Object) activeSubscriptionInfoList.get(i).getCarrierName()));
                try {
                    if (f4880c != null && Build.VERSION.SDK_INT >= 23 && f4880c.getDeviceId(activeSubscriptionInfoList.get(i).getSimSlotIndex()) != null) {
                        stringBuffer.append(";" + "IMEI".toLowerCase() + "=" + f4880c.getDeviceId(activeSubscriptionInfoList.get(i).getSimSlotIndex()));
                    }
                    if (f4880c != null && Build.VERSION.SDK_INT >= 24) {
                        stringBuffer.append(";imsi=" + f4880c.createForSubscriptionId(activeSubscriptionInfoList.get(i).getSubscriptionId()).getSubscriberId());
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return stringBuffer.toString();
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m5755a(Context context, String str) {
        if (str != null && str.equals("IMEI")) {
            return m5770h(context);
        }
        if ((str != null && str.equals("LOC-LAT")) || (str != null && str.equals("LOC-LON"))) {
            return m5758b(context, str);
        }
        if (str != null && str.equals("LOC-TIME")) {
            return C0707h1.m5496a(context).m5518d();
        }
        if (str != null && str.equals("BATTERY")) {
            return m5756b();
        }
        if (str != null && str.equals("STORAGE")) {
            return "";
        }
        if (str != null && str.equals("CONNECTION-MODE")) {
            return m5762d(context);
        }
        if (str != null && str.equals("VOLUME")) {
            return m5782s(context);
        }
        if (str != null && str.equals("VIBRATION")) {
            return m5785v(context);
        }
        if (str != null && str.equals("BLUETOOTH")) {
            return m5757b(context);
        }
        if (str != null && str.equals("OPERATOR-NAME")) {
            return m5776m(context);
        }
        if (str != null && str.equals("SIGNAL")) {
            return m5769h();
        }
        if (str != null && str.equals("DATE-FORMAT")) {
            return m5766f(context);
        }
        if (str != null && str.equals("TIME-FORMAT")) {
            return m5780q(context);
        }
        if (str != null && str.equals("DATE")) {
            return m5764e(context);
        }
        if (str != null && str.equals("TIME")) {
            return m5779p(context);
        }
        if (str != null && str.equals("LANGUAGE")) {
            return m5773j(context);
        }
        if (str != null && str.equals("DEBUG")) {
            return "false";
        }
        if (str != null && str.equals("ROAMING")) {
            return m5784u(context);
        }
        if (str != null && str.equals("SERIAL-NO")) {
            return m5763e();
        }
        if (str != null && str.equals("SUB_ID")) {
            return C0713j1.m5563a(context).m5725s0();
        }
        if (str != null && str.equals("AZIMUTH") && m5767g() != null) {
            return m5767g().m5918b();
        }
        if (str != null && str.equals("PITCH") && m5767g() != null) {
            return m5767g().m5919c();
        }
        if (str != null && str.equals("ROLL") && m5767g() != null) {
            return m5767g().m5920d();
        }
        if (str != null && str.equals("SIM_NO")) {
            return m5778o(context);
        }
        if (str != null && str.equals("imsi")) {
            return m5771i(context);
        }
        if (str != null && str.equals("os_version")) {
            return String.valueOf(m5752a());
        }
        if (str != null && str.equals("SUBS-INFO")) {
            return m5754a(context);
        }
        if (str != null && str.equals("CPU_ARC")) {
            return m5761d();
        }
        if (str != null && str.equals("MAKE")) {
            return Build.MANUFACTURER;
        }
        if (str == null || !str.equals("MODEL")) {
            return null;
        }
        return Build.MODEL;
    }

    /* renamed from: b */
    public static String m5756b() {
        try {
            return String.valueOf(f4878a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m5757b(Context context) {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            return defaultAdapter != null ? defaultAdapter.isEnabled() ? "on" : "off" : "off";
        } catch (Exception unused) {
            return "off";
        }
    }

    /* renamed from: b */
    public static String m5758b(Context context, String str) {
        if (str.equals("LOC-LAT")) {
            return C0707h1.m5496a(context).m5516b();
        }
        if (str.equals("LOC-LON")) {
            return C0707h1.m5496a(context).m5517c();
        }
        return null;
    }

    /* renamed from: c */
    public static String m5759c() {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                        return inetAddress.getHostAddress();
                    }
                }
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public static String m5760c(Context context) {
        return m5753a(((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getIpAddress());
    }

    /* renamed from: d */
    public static String m5761d() {
        String str;
        if (Build.VERSION.SDK_INT < 21) {
            return !TextUtils.isEmpty(Build.CPU_ABI) ? Build.CPU_ABI : !TextUtils.isEmpty(Build.CPU_ABI2) ? Build.CPU_ABI2 : "armeabi";
        }
        String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
        if (strArr.length > 0) {
            str = strArr[0];
        } else {
            String[] strArr2 = Build.SUPPORTED_32_BIT_ABIS;
            if (strArr2.length <= 0) {
                return "armeabi";
            }
            str = strArr2[0];
        }
        return str;
    }

    /* renamed from: d */
    public static String m5762d(Context context) {
        NetworkInfo networkInfo;
        try {
            networkInfo = m5775l(context);
        } catch (Exception unused) {
            networkInfo = null;
        }
        if (networkInfo != null) {
            if (networkInfo.getType() == 1) {
                return "WIFI";
            }
            if (networkInfo.getType() == 0) {
                switch (networkInfo.getSubtype()) {
                    case 1:
                        return "GPRS";
                    case 2:
                        return "EDGE";
                    case 3:
                        return "UMTS";
                    case 4:
                        return "CDMA";
                    case 5:
                        return "EVDO_0";
                    case 6:
                        return "EVDO_A";
                    case 7:
                        return "1xRTT";
                    case 8:
                        return "HSDPA";
                    case 9:
                        return "HSUPA";
                    case 10:
                        return "HSPA";
                }
            }
        }
        return "";
    }

    /* renamed from: e */
    public static String m5763e() {
        int i = Build.VERSION.SDK_INT;
        return i >= 26 ? Build.getSerial() : i >= 9 ? Build.SERIAL : "";
    }

    /* renamed from: e */
    public static String m5764e(Context context) {
        return DateFormat.format("DD/MM/YYYY", Calendar.getInstance().getTime()).toString();
    }

    /* renamed from: f */
    public static NfcAdapter m5765f() {
        return f4884g;
    }

    /* renamed from: f */
    public static String m5766f(Context context) {
        return Settings.System.getString(context.getContentResolver(), "date_format");
    }

    /* renamed from: g */
    public static C0725n1 m5767g() {
        return f4881d;
    }

    /* renamed from: g */
    public static String m5768g(Context context) {
        int m5781r = m5781r(context);
        return (m5781r == 2 || m5781r == 3) ? m5759c() : m5781r == 1 ? m5760c(context) : "";
    }

    /* renamed from: h */
    public static String m5769h() {
        try {
            return String.valueOf(f4879b);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: h */
    public static String m5770h(Context context) {
        try {
            if (f4880c == null) {
                return "";
            }
            String deviceId = f4880c.getDeviceId();
            return TextUtils.isEmpty(deviceId) ? m5763e() : deviceId;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: i */
    public static String m5771i(Context context) {
        try {
            return f4880c != null ? f4880c.getSubscriberId() : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: i */
    public static boolean m5772i() {
        NfcAdapter nfcAdapter;
        if (Build.VERSION.SDK_INT < 9 || (nfcAdapter = f4884g) == null) {
            return false;
        }
        return nfcAdapter.isEnabled();
    }

    /* renamed from: j */
    public static String m5773j(Context context) {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: k */
    public static String m5774k(Context context) {
        try {
            return f4880c != null ? f4880c.getLine1Number() : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: l */
    public static NetworkInfo m5775l(Context context) {
        ConnectivityManager connectivityManager = f4882e;
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    /* renamed from: m */
    public static String m5776m(Context context) {
        TelephonyManager telephonyManager = f4880c;
        return telephonyManager != null ? telephonyManager.getNetworkOperatorName() : "";
    }

    /* renamed from: n */
    public static String m5777n(Context context) {
        String str = "";
        try {
            for (Account account : AccountManager.get(context).getAccounts()) {
                if (account.type.equals("com.google")) {
                    str = account.name;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    /* renamed from: o */
    public static String m5778o(Context context) {
        try {
            return f4880c != null ? f4880c.getSimSerialNumber() : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: p */
    public static String m5779p(Context context) {
        try {
            return DateFormat.format("hh:mm", Calendar.getInstance().getTime()).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: q */
    public static String m5780q(Context context) {
        return Settings.System.getString(context.getContentResolver(), "time_12_24");
    }

    /* renamed from: r */
    public static int m5781r(Context context) {
        int i = 0;
        try {
            NetworkInfo m5775l = m5775l(context);
            if (m5775l.getType() == 1) {
                if (m5775l.isConnected()) {
                    i = 1;
                }
            } else if (m5775l.isConnected()) {
                i = 2;
                if (m5775l.isRoaming()) {
                    i = 3;
                }
            }
        } catch (Exception unused) {
        }
        return i;
    }

    /* renamed from: s */
    public static String m5782s(Context context) {
        try {
            if (f4883f == null) {
                return "";
            }
            return String.valueOf(Math.round((f4883f.getStreamVolume(2) / f4883f.getStreamMaxVolume(2)) * 100.0f));
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: t */
    public static boolean m5783t(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService("fingerprint");
            if (fingerprintManager.isHardwareDetected()) {
                return fingerprintManager.hasEnrolledFingerprints();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: u */
    public static String m5784u(Context context) {
        TelephonyManager telephonyManager = f4880c;
        return (telephonyManager == null || !telephonyManager.isNetworkRoaming()) ? "off" : "on";
    }

    /* renamed from: v */
    public static String m5785v(Context context) {
        AudioManager audioManager = f4883f;
        return (audioManager == null || audioManager.getRingerMode() != 1) ? "off" : "on";
    }

    /* renamed from: w */
    public static void m5786w(Context context) {
        try {
            context.unregisterReceiver(f4886i);
        } catch (Exception unused) {
        }
    }

    /* renamed from: x */
    public static void m5787x(Context context) {
        f4880c = null;
        f4882e = null;
        f4883f = null;
    }

    /* renamed from: y */
    public static void m5788y(Context context) {
        try {
            if (f4880c != null) {
                f4880c.listen(f4885h, 0);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: z */
    public static void m5789z(Context context) {
        try {
            context.registerReceiver(f4886i, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception unused) {
        }
    }
}
