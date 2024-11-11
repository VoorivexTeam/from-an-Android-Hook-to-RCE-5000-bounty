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

/* loaded from: classes.dex */
public class k {
    public static int a = -1;
    public static int b;
    private static TelephonyManager c;
    public static n1 d;
    private static ConnectivityManager e;
    private static AudioManager f;
    private static NfcAdapter g;
    private static final PhoneStateListener h = new a();
    static BroadcastReceiver i = new b();

    /* loaded from: classes.dex */
    static class a extends PhoneStateListener {
        a() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            k.b = signalStrength.isGsm() ? signalStrength.getGsmSignalStrength() : signalStrength.getCdmaDbm();
        }
    }

    /* loaded from: classes.dex */
    static class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            k.a = -1;
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 <= 0) {
                return;
            }
            k.a = (intExtra * 100) / intExtra2;
        }
    }

    public k(Context context) {
        try {
            c = (TelephonyManager) context.getSystemService("phone");
            e = (ConnectivityManager) context.getSystemService("connectivity");
            f = (AudioManager) context.getSystemService("audio");
            if (Build.VERSION.SDK_INT >= 10) {
                g = NfcAdapter.getDefaultAdapter(context);
            }
        } catch (Exception unused) {
        }
    }

    public static void A(Context context) {
        try {
            if (c != null) {
                c.listen(h, 256);
            }
        } catch (Exception unused) {
        }
    }

    public static int a() {
        return Build.VERSION.SDK_INT;
    }

    public static String a(int i2) {
        return (i2 & 255) + "." + ((i2 >> 8) & 255) + "." + ((i2 >> 16) & 255) + "." + ((i2 >> 24) & 255);
    }

    public static String a(Context context) {
        StringBuffer stringBuffer = new StringBuffer();
        if (Build.VERSION.SDK_INT < 22) {
            if (c != null) {
                stringBuffer.append("sim:");
                stringBuffer.append("OPERATOR-NAME".toLowerCase() + "=" + c.getNetworkOperatorName());
                try {
                    if (!TextUtils.isEmpty(c.getDeviceId())) {
                        stringBuffer.append(";" + "IMEI".toLowerCase() + "=" + c.getDeviceId());
                    }
                    if (!TextUtils.isEmpty(c.getSubscriberId())) {
                        stringBuffer.append(";imsi=" + c.getSubscriberId());
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return stringBuffer.toString();
        }
        List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) context.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList != null) {
            String str = activeSubscriptionInfoList.size() > 1 ? "sim1:" : "sim:";
            for (int i2 = 0; i2 < activeSubscriptionInfoList.size(); i2++) {
                if (i2 == 1) {
                    str = "&sim2:";
                }
                stringBuffer.append(str);
                stringBuffer.append("OPERATOR-NAME".toLowerCase() + "=" + ((Object) activeSubscriptionInfoList.get(i2).getCarrierName()));
                try {
                    if (c != null && Build.VERSION.SDK_INT >= 23 && c.getDeviceId(activeSubscriptionInfoList.get(i2).getSimSlotIndex()) != null) {
                        stringBuffer.append(";" + "IMEI".toLowerCase() + "=" + c.getDeviceId(activeSubscriptionInfoList.get(i2).getSimSlotIndex()));
                    }
                    if (c != null && Build.VERSION.SDK_INT >= 24) {
                        stringBuffer.append(";imsi=" + c.createForSubscriptionId(activeSubscriptionInfoList.get(i2).getSubscriptionId()).getSubscriberId());
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
        return stringBuffer.toString();
        return stringBuffer.toString();
    }

    public static String a(Context context, String str) {
        if (str != null && str.equals("IMEI")) {
            return h(context);
        }
        if ((str != null && str.equals("LOC-LAT")) || (str != null && str.equals("LOC-LON"))) {
            return b(context, str);
        }
        if (str != null && str.equals("LOC-TIME")) {
            return h1.a(context).d();
        }
        if (str != null && str.equals("BATTERY")) {
            return b();
        }
        if (str != null && str.equals("STORAGE")) {
            return "";
        }
        if (str != null && str.equals("CONNECTION-MODE")) {
            return d(context);
        }
        if (str != null && str.equals("VOLUME")) {
            return s(context);
        }
        if (str != null && str.equals("VIBRATION")) {
            return v(context);
        }
        if (str != null && str.equals("BLUETOOTH")) {
            return b(context);
        }
        if (str != null && str.equals("OPERATOR-NAME")) {
            return m(context);
        }
        if (str != null && str.equals("SIGNAL")) {
            return h();
        }
        if (str != null && str.equals("DATE-FORMAT")) {
            return f(context);
        }
        if (str != null && str.equals("TIME-FORMAT")) {
            return q(context);
        }
        if (str != null && str.equals("DATE")) {
            return e(context);
        }
        if (str != null && str.equals("TIME")) {
            return p(context);
        }
        if (str != null && str.equals("LANGUAGE")) {
            return j(context);
        }
        if (str != null && str.equals("DEBUG")) {
            return "false";
        }
        if (str != null && str.equals("ROAMING")) {
            return u(context);
        }
        if (str != null && str.equals("SERIAL-NO")) {
            return e();
        }
        if (str != null && str.equals("SUB_ID")) {
            return j1.a(context).s0();
        }
        if (str != null && str.equals("AZIMUTH") && g() != null) {
            return g().b();
        }
        if (str != null && str.equals("PITCH") && g() != null) {
            return g().c();
        }
        if (str != null && str.equals("ROLL") && g() != null) {
            return g().d();
        }
        if (str != null && str.equals("SIM_NO")) {
            return o(context);
        }
        if (str != null && str.equals("imsi")) {
            return i(context);
        }
        if (str != null && str.equals("os_version")) {
            return String.valueOf(a());
        }
        if (str != null && str.equals("SUBS-INFO")) {
            return a(context);
        }
        if (str != null && str.equals("CPU_ARC")) {
            return d();
        }
        if (str != null && str.equals("MAKE")) {
            return Build.MANUFACTURER;
        }
        if (str == null || !str.equals("MODEL")) {
            return null;
        }
        return Build.MODEL;
    }

    public static String b() {
        try {
            return String.valueOf(a);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(Context context) {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            return defaultAdapter != null ? defaultAdapter.isEnabled() ? "on" : "off" : "off";
        } catch (Exception unused) {
            return "off";
        }
    }

    public static String b(Context context, String str) {
        if (str.equals("LOC-LAT")) {
            return h1.a(context).b();
        }
        if (str.equals("LOC-LON")) {
            return h1.a(context).c();
        }
        return null;
    }

    public static String c() {
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
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String c(Context context) {
        return a(((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getIpAddress());
    }

    public static String d() {
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

    public static String d(Context context) {
        NetworkInfo networkInfo;
        try {
            networkInfo = l(context);
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

    public static String e() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 26 ? Build.getSerial() : i2 >= 9 ? Build.SERIAL : "";
    }

    public static String e(Context context) {
        return DateFormat.format("DD/MM/YYYY", Calendar.getInstance().getTime()).toString();
    }

    public static NfcAdapter f() {
        return g;
    }

    public static String f(Context context) {
        return Settings.System.getString(context.getContentResolver(), "date_format");
    }

    public static n1 g() {
        return d;
    }

    public static String g(Context context) {
        int r = r(context);
        return (r == 2 || r == 3) ? c() : r == 1 ? c(context) : "";
    }

    public static String h() {
        try {
            return String.valueOf(b);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String h(Context context) {
        try {
            if (c == null) {
                return "";
            }
            String deviceId = c.getDeviceId();
            return TextUtils.isEmpty(deviceId) ? e() : deviceId;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String i(Context context) {
        try {
            return c != null ? c.getSubscriberId() : "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static boolean i() {
        NfcAdapter nfcAdapter;
        if (Build.VERSION.SDK_INT < 9 || (nfcAdapter = g) == null) {
            return false;
        }
        return nfcAdapter.isEnabled();
    }

    public static String j(Context context) {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String k(Context context) {
        try {
            return c != null ? c.getLine1Number() : "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static NetworkInfo l(Context context) {
        ConnectivityManager connectivityManager = e;
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static String m(Context context) {
        TelephonyManager telephonyManager = c;
        return telephonyManager != null ? telephonyManager.getNetworkOperatorName() : "";
    }

    public static String n(Context context) {
        String str = "";
        try {
            for (Account account : AccountManager.get(context).getAccounts()) {
                if (account.type.equals("com.google")) {
                    str = account.name;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return str;
    }

    public static String o(Context context) {
        try {
            return c != null ? c.getSimSerialNumber() : "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String p(Context context) {
        try {
            return DateFormat.format("hh:mm", Calendar.getInstance().getTime()).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String q(Context context) {
        return Settings.System.getString(context.getContentResolver(), "time_12_24");
    }

    public static int r(Context context) {
        int i2 = 0;
        try {
            NetworkInfo l = l(context);
            if (l.getType() == 1) {
                if (l.isConnected()) {
                    i2 = 1;
                }
            } else if (l.isConnected()) {
                i2 = 2;
                if (l.isRoaming()) {
                    i2 = 3;
                }
            }
        } catch (Exception unused) {
        }
        return i2;
    }

    public static String s(Context context) {
        try {
            if (f == null) {
                return "";
            }
            return String.valueOf(Math.round((f.getStreamVolume(2) / f.getStreamMaxVolume(2)) * 100.0f));
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean t(Context context) {
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

    public static String u(Context context) {
        TelephonyManager telephonyManager = c;
        return (telephonyManager == null || !telephonyManager.isNetworkRoaming()) ? "off" : "on";
    }

    public static String v(Context context) {
        AudioManager audioManager = f;
        return (audioManager == null || audioManager.getRingerMode() != 1) ? "off" : "on";
    }

    public static void w(Context context) {
        try {
            context.unregisterReceiver(i);
        } catch (Exception unused) {
        }
    }

    public static void x(Context context) {
        c = null;
        e = null;
        f = null;
    }

    public static void y(Context context) {
        try {
            if (c != null) {
                c.listen(h, 0);
            }
        } catch (Exception unused) {
        }
    }

    public static void z(Context context) {
        try {
            context.registerReceiver(i, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception unused) {
        }
    }
}
