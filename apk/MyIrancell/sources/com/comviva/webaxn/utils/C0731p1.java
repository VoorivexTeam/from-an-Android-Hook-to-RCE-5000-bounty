package com.comviva.webaxn.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0655o1;
import com.comviva.webaxn.p002ui.CameraActivity;
import com.comviva.webaxn.p002ui.InlineVideoPlayer;
import com.comviva.webaxn.p002ui.RecorderActivity;
import com.comviva.webaxn.p002ui.WebAxnContactPickerActivity;
import com.comviva.webaxn.p002ui.WebViewActivity;
import com.mtni.myirancell.R;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.File;
import java.util.Iterator;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3489yj;
import p000.C3530zi;

/* renamed from: com.comviva.webaxn.utils.p1 */
/* loaded from: classes.dex */
public class C0731p1 {

    /* renamed from: a */
    public static long f5072a = 0;

    /* renamed from: b */
    public static byte[] f5073b = null;

    /* renamed from: c */
    public static boolean f5074c = false;

    /* renamed from: d */
    public static C3489yj f5075d;

    /* renamed from: e */
    public static C3489yj f5076e;

    /* renamed from: f */
    public static C3489yj f5077f;

    /* renamed from: g */
    public static C3489yj f5078g;

    /* renamed from: h */
    public static AsyncTaskC0720m f5079h;

    /* renamed from: i */
    public static File f5080i;

    /* renamed from: j */
    public static Uri f5081j;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000c, B:8:0x0010, B:9:0x003a, B:11:0x003e, B:13:0x0046, B:17:0x004f, B:19:0x0065, B:29:0x001e, B:31:0x002c), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File m5945a(android.content.Context r3, int r4, int r5, java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L8
            java.lang.String r6 = "temp"
        L8:
            r0 = 1
            r1 = 0
            if (r4 != r0) goto L16
            java.io.File r3 = r3.getFileStreamPath(r6)     // Catch: java.lang.Exception -> L13
        L10:
            com.comviva.webaxn.utils.C0731p1.f5080i = r3     // Catch: java.lang.Exception -> L13
            goto L3a
        L13:
            r3 = move-exception
            goto L91
        L16:
            r3 = 3
            r2 = 2
            if (r4 == r2) goto L1c
            if (r4 != r3) goto L3a
        L1c:
            if (r4 != r2) goto L2a
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L13
            java.lang.String r4 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.Exception -> L13
            java.io.File r4 = android.os.Environment.getExternalStoragePublicDirectory(r4)     // Catch: java.lang.Exception -> L13
            r3.<init>(r4, r6)     // Catch: java.lang.Exception -> L13
            goto L10
        L2a:
            if (r4 != r3) goto L3a
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L13
            java.io.File r4 = android.os.Environment.getExternalStoragePublicDirectory(r6)     // Catch: java.lang.Exception -> L13
            java.lang.String r4 = r4.getPath()     // Catch: java.lang.Exception -> L13
            r3.<init>(r4)     // Catch: java.lang.Exception -> L13
            goto L10
        L3a:
            java.io.File r3 = com.comviva.webaxn.utils.C0731p1.f5080i     // Catch: java.lang.Exception -> L13
            if (r3 == 0) goto L94
            java.io.File r3 = com.comviva.webaxn.utils.C0731p1.f5080i     // Catch: java.lang.Exception -> L13
            boolean r3 = r3.exists()     // Catch: java.lang.Exception -> L13
            if (r3 != 0) goto L4f
            java.io.File r3 = com.comviva.webaxn.utils.C0731p1.f5080i     // Catch: java.lang.Exception -> L13
            boolean r3 = r3.mkdirs()     // Catch: java.lang.Exception -> L13
            if (r3 != 0) goto L4f
            return r1
        L4f:
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L13
            java.lang.String r4 = "yyyyMMdd_HHmmss"
            java.util.Locale r6 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L13
            r3.<init>(r4, r6)     // Catch: java.lang.Exception -> L13
            java.util.Date r4 = new java.util.Date     // Catch: java.lang.Exception -> L13
            r4.<init>()     // Catch: java.lang.Exception -> L13
            java.lang.String r3 = r3.format(r4)     // Catch: java.lang.Exception -> L13
            if (r5 != r0) goto L90
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L13
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L13
            r5.<init>()     // Catch: java.lang.Exception -> L13
            java.io.File r6 = com.comviva.webaxn.utils.C0731p1.f5080i     // Catch: java.lang.Exception -> L13
            java.lang.String r6 = r6.getPath()     // Catch: java.lang.Exception -> L13
            r5.append(r6)     // Catch: java.lang.Exception -> L13
            java.lang.String r6 = java.io.File.separator     // Catch: java.lang.Exception -> L13
            r5.append(r6)     // Catch: java.lang.Exception -> L13
            java.lang.String r6 = "IMG_"
            r5.append(r6)     // Catch: java.lang.Exception -> L13
            r5.append(r3)     // Catch: java.lang.Exception -> L13
            java.lang.String r3 = ".jpg"
            r5.append(r3)     // Catch: java.lang.Exception -> L13
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Exception -> L13
            r4.<init>(r3)     // Catch: java.lang.Exception -> L13
            r1 = r4
            goto L94
        L90:
            return r1
        L91:
            r3.printStackTrace()
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0731p1.m5945a(android.content.Context, int, int, java.lang.String):java.io.File");
    }

    /* renamed from: a */
    public static String m5946a(Context context, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, String str, C3489yj c3489yj, C0696e c0696e) {
        return C0758y1.m6222a(context, c3400wj, c2945mj, c2899lj, str, c3489yj, c0696e);
    }

    /* renamed from: a */
    public static void m5947a() {
        ProgressDialog progressDialog = AsyncTaskC0720m.f4974v;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* renamed from: a */
    public static void m5948a(Activity activity, Uri uri) {
        CropImage.C2316b m11028a = CropImage.m11028a(uri);
        m11028a.m11043a(CropImageView.EnumC2323d.ON);
        m11028a.m11046a(true);
        m11028a.m11048b(C3530zi.f14481x);
        m11028a.m11045a("Poppins-Regular.ttf");
        m11028a.m11044a((CharSequence) activity.getString(R.string.crop_header));
        m11028a.m11042a(CropImageView.EnumC2322c.RECTANGLE);
        m11028a.m11040a(400, 400);
        m11028a.m11039a(R.drawable.crop_ph);
        m11028a.m11047a(activity);
    }

    /* renamed from: a */
    public static void m5949a(Context context, int i) {
        try {
            C0755x1.f5264v = true;
            ((Activity) context).startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), i);
        } catch (Exception unused) {
            String m5641c = C0713j1.m5563a(context).m5641c("msg.AppNotFound");
            if (m5641c == null) {
                m5641c = context.getString(R.string.app_not_found_error);
            }
            Toast.makeText(context, m5641c, 0).show();
        }
    }

    /* renamed from: a */
    public static void m5950a(Context context, int i, int i2, int i3) {
        try {
            C0755x1.f5264v = true;
            Intent intent = new Intent();
            intent.setClass(context, WebAxnContactPickerActivity.class);
            intent.putExtra("minimum", i);
            intent.putExtra("maximum", i2);
            ((Activity) context).startActivityForResult(intent, i3);
        } catch (ActivityNotFoundException unused) {
            String m5641c = C0713j1.m5563a(context).m5641c("msg.AppNotFound");
            if (m5641c == null) {
                m5641c = context.getString(R.string.app_not_found_error);
            }
            Toast.makeText(context, m5641c, 0).show();
        }
    }

    /* renamed from: a */
    private static void m5951a(Context context, AbstractC0652n1 abstractC0652n1, String str, String str2, String str3, boolean z, C3400wj c3400wj) {
        if (C0722m1.m5887a(context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
            f5079h = new AsyncTaskC0720m(context, abstractC0652n1, str2, str3, z, c3400wj);
            try {
                if (Build.VERSION.SDK_INT >= 11) {
                    f5079h.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, str);
                } else {
                    f5079h.execute(str);
                }
                return;
            } catch (IllegalStateException e) {
                e.printStackTrace();
                return;
            }
        }
        if (C0713j1.m5563a(context).m5647d("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            C0722m1.m5885a((Activity) context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9);
        } else {
            if (!C0722m1.m5886a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C0755x1.m6181d(context, "msg.rpStorage");
                return;
            }
            C0722m1.m5885a((Activity) context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9);
        }
        C0755x1.f5264v = true;
    }

    /* renamed from: a */
    public static void m5952a(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 11) {
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
            } else {
                ((android.text.ClipboardManager) context.getSystemService("clipboard")).setText(str);
            }
            String m5641c = C0713j1.m5563a(context).m5641c("msg.copyToCB");
            if (TextUtils.isEmpty(m5641c)) {
                m5641c = context.getString(R.string.copy_clipboard);
            }
            Toast.makeText(context, m5641c, 0).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m5953a(Context context, String str, int i) {
        try {
            if (i == -1) {
                ((Activity) context).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
            } else {
                ((Activity) context).startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), i);
            }
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public static void m5954a(Context context, String str, C0655o1 c0655o1, C3489yj c3489yj) {
        if (c0655o1 != null && str.startsWith("analytics://firebase?") && C3530zi.f14480w == 1) {
            C0741t.m6035a(context).m6042a(Uri.decode(str.substring(21)), c0655o1, c3489yj);
        }
    }

    /* renamed from: a */
    public static void m5955a(Context context, String str, String str2) {
        try {
            C0755x1.f5264v = true;
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(str2))));
        } catch (Exception unused) {
            if (!TextUtils.isEmpty(str)) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return;
            }
            String m5641c = C0713j1.m5563a(context).m5641c("msg.AppNotFound");
            if (m5641c == null) {
                m5641c = context.getString(R.string.app_not_found_error);
            }
            Toast.makeText(context, m5641c, 0).show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5956a(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "com.google.android.apps.maps"
            r1 = 0
            java.lang.String r2 = ","
            if (r6 == 0) goto L39
            if (r7 == 0) goto L39
            if (r8 == 0) goto L39
            if (r9 == 0) goto L39
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "https://maps.google.com/maps?saddr="
            r3.append(r4)
            r3.append(r6)
            r3.append(r2)
            r3.append(r7)
            java.lang.String r6 = "&daddr="
            r3.append(r6)
            r3.append(r8)
            r3.append(r2)
            r3.append(r9)
            java.lang.String r6 = r3.toString()
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r6 = java.lang.String.format(r6, r7)
            goto L54
        L39:
            if (r6 == 0) goto L59
            if (r7 == 0) goto L59
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "geo:0,0?q="
            r8.append(r9)
            r8.append(r6)
            r8.append(r2)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
        L54:
            android.net.Uri r6 = android.net.Uri.parse(r6)
            goto L5a
        L59:
            r6 = 0
        L5a:
            if (r6 == 0) goto L97
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r8 = "android.intent.action.VIEW"
            r7.<init>(r8, r6)
            boolean r6 = m5968b(r5, r0)     // Catch: java.lang.Exception -> L7c
            if (r6 == 0) goto L72
            java.lang.String r6 = "com.google.android.maps.MapsActivity"
            r7.setClassName(r0, r6)     // Catch: java.lang.Exception -> L7c
            r5.startActivity(r7)     // Catch: java.lang.Exception -> L7c
            goto L97
        L72:
            java.lang.String r6 = "Please install android Maps appliction"
            android.widget.Toast r6 = android.widget.Toast.makeText(r5, r6, r1)     // Catch: java.lang.Exception -> L7c
            r6.show()     // Catch: java.lang.Exception -> L7c
            goto L97
        L7c:
            com.comviva.webaxn.utils.j1 r6 = com.comviva.webaxn.utils.C0713j1.m5563a(r5)
            java.lang.String r7 = "msg.AppNotFound"
            java.lang.String r6 = r6.m5641c(r7)
            if (r6 != 0) goto L90
            r6 = 2131755690(0x7f1002aa, float:1.9142266E38)
            java.lang.String r6 = r5.getString(r6)
        L90:
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r1)
            r5.show()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0731p1.m5956a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m5957a(Context context, String str, String str2, String str3, String str4, String str5) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        if (str5 == null) {
            str5 = "";
        }
        C0755x1.f5264v = true;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SENDTO");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        intent.putExtra("android.intent.extra.CC", new String[]{str2});
        intent.putExtra("android.intent.extra.BCC", new String[]{str3});
        intent.putExtra("android.intent.extra.SUBJECT", str4);
        intent.putExtra("android.intent.extra.TEXT", str5);
        intent.setData(Uri.parse("mailto:"));
        context.startActivity(Intent.createChooser(intent, "Send Email... "));
    }

    /* renamed from: a */
    public static void m5958a(Context context, String str, boolean z) {
        try {
            ((Activity) context).startActivity(((Activity) context).getPackageManager().getLaunchIntentForPackage(str));
        } catch (Exception unused) {
            if (z) {
                m5953a(context, str, -1);
            } else {
                C0755x1.m6149a(context, C0713j1.m5563a(context).m5641c("ttl.Alert"), C0713j1.m5563a(context).m5641c("msg.FDownload"), true, true, str);
            }
        }
    }

    /* renamed from: a */
    public static void m5959a(Context context, C3489yj c3489yj) {
        try {
            C0755x1.f5264v = true;
            C0755x1.f5266x = true;
            f5076e = c3489yj;
            ((Activity) context).startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 1501);
        } catch (Exception unused) {
            String m5641c = C0713j1.m5563a(context).m5641c("msg.AppNotFound");
            if (m5641c == null) {
                m5641c = context.getString(R.string.app_not_found_error);
            }
            Toast.makeText(context, m5641c, 0).show();
        }
    }

    /* renamed from: a */
    public static void m5960a(Context context, C3489yj c3489yj, int i, Uri uri) {
        try {
            C0755x1.f5264v = true;
            C0755x1.f5266x = true;
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            f5081j = uri;
            intent.putExtra("output", uri);
            f5077f = c3489yj;
            ((Activity) context).startActivityForResult(intent, i);
        } catch (Exception unused) {
            String m5641c = C0713j1.m5563a(context).m5641c("msg.AppNotFound");
            if (m5641c == null) {
                m5641c = context.getString(R.string.app_not_found_error);
            }
            Toast.makeText(context, m5641c, 0).show();
        }
    }

    /* renamed from: a */
    public static void m5961a(Context context, C3489yj c3489yj, int i, String str, int i2) {
        m5960a(context, c3489yj, i2, Build.VERSION.SDK_INT >= 24 ? FileProvider.m1448a(context, context.getString(R.string.authority), m5945a(context, i, 1, str)) : Uri.fromFile(m5945a(context, i, 1, str)));
    }

    /* renamed from: a */
    public static void m5962a(Context context, C3489yj c3489yj, CameraData cameraData, int i) {
        C0755x1.f5264v = true;
        C0755x1.f5266x = true;
        f5077f = c3489yj;
        Intent intent = new Intent();
        intent.setClass(context, CameraActivity.class);
        intent.putExtra("camera_usage", "image_capture");
        intent.putExtra("camera_data", cameraData);
        ((Activity) context).startActivityForResult(intent, i);
    }

    /* renamed from: a */
    public static void m5963a(Context context, C3489yj c3489yj, RecorderData recorderData, int i) {
        C0755x1.f5264v = true;
        C0755x1.f5266x = true;
        f5078g = c3489yj;
        Intent intent = new Intent();
        intent.setClass(context, RecorderActivity.class);
        intent.putExtra("recorder_data", recorderData);
        ((Activity) context).startActivityForResult(intent, i);
    }

    /* renamed from: a */
    public static void m5964a(Context context, C3489yj c3489yj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        f5075d = c3489yj;
    }

    /* renamed from: a */
    public static void m5965a(AbstractC0652n1 abstractC0652n1, Context context, String str, String str2, String str3, boolean z, C3400wj c3400wj) {
        String str4;
        String str5;
        if (str2.startsWith("http://") || str2.startsWith("https://") || str2.startsWith("rtsp://")) {
            str4 = str2;
        } else {
            str4 = new String("http://" + str2);
        }
        if (!str.startsWith("video/") || z) {
            if (Environment.getExternalStorageState().equals("mounted")) {
                if (System.currentTimeMillis() - f5072a > 1700) {
                    f5072a = System.currentTimeMillis();
                    m5951a(context, abstractC0652n1, str4, str3, str, z, c3400wj);
                    return;
                }
                return;
            }
            str5 = "No SD card present.Action not allowed.";
        } else {
            if (!TextUtils.isEmpty(str4)) {
                m5971e(context, str4);
                C0755x1.f5259q = c3400wj;
                return;
            }
            str5 = "There is no url for Video streaming.";
        }
        Toast.makeText(context, str5, 0).show();
    }

    /* renamed from: b */
    public static void m5966b(Context context, String str, String str2) {
        try {
            C0755x1.f5264v = true;
            Intent intent = new Intent("android.intent.action.SENDTO");
            if (str2 != null) {
                intent.putExtra("sms_body", str2);
            }
            if (str != null) {
                intent.setData(Uri.parse("smsto:" + str));
            }
            context.startActivity(intent);
        } catch (Exception unused) {
            String m5641c = C0713j1.m5563a(context).m5641c("msg.AppNotFound");
            if (m5641c == null) {
                m5641c = context.getString(R.string.app_not_found_error);
            }
            Toast.makeText(context, m5641c, 0).show();
        }
    }

    /* renamed from: b */
    public static void m5967b(Context context, C3489yj c3489yj, CameraData cameraData, int i) {
        C0755x1.f5264v = true;
        C0755x1.f5266x = true;
        f5077f = c3489yj;
        Intent intent = new Intent();
        intent.setClass(context, CameraActivity.class);
        intent.putExtra("camera_usage", "video_capture");
        intent.putExtra("camera_data", cameraData);
        ((Activity) context).startActivityForResult(intent, i);
    }

    /* renamed from: b */
    public static boolean m5968b(Context context, String str) {
        Iterator<ApplicationInfo> it = context.getPackageManager().getInstalledApplications(0).iterator();
        while (it.hasNext()) {
            if (it.next().packageName.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m5969c(Context context, String str) {
        try {
            C0755x1.f5264v = true;
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:" + Uri.encode(str)));
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static void m5970d(Context context, String str) {
        C0755x1.f5264v = true;
        Intent intent = new Intent();
        intent.setClass(context, WebViewActivity.class);
        intent.putExtra("URL", str);
        context.startActivity(intent);
    }

    /* renamed from: e */
    public static void m5971e(Context context, String str) {
        C0755x1.f5264v = true;
        Intent intent = new Intent();
        intent.setClass(context, InlineVideoPlayer.class);
        intent.putExtra("url", str);
        context.startActivity(intent);
    }

    /* renamed from: f */
    public static void m5972f(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                Toast.makeText(context, "Enter text to be shared.", 0).show();
            } else {
                C0755x1.f5264v = true;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", str);
                intent.setType("text/plain");
                context.startActivity(Intent.createChooser(intent, "Via shareApp"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
