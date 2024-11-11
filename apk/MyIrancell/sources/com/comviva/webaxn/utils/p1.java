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
import com.comviva.webaxn.ui.CameraActivity;
import com.comviva.webaxn.ui.InlineVideoPlayer;
import com.comviva.webaxn.ui.RecorderActivity;
import com.comviva.webaxn.ui.WebAxnContactPickerActivity;
import com.comviva.webaxn.ui.WebViewActivity;
import com.mtni.myirancell.R;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.yj;
import defpackage.zi;
import java.io.File;
import java.util.Iterator;

/* loaded from: classes.dex */
public class p1 {
    public static long a = 0;
    public static byte[] b = null;
    public static boolean c = false;
    public static yj d;
    public static yj e;
    public static yj f;
    public static yj g;
    public static m h;
    public static File i;
    public static Uri j;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000c, B:8:0x0010, B:9:0x003a, B:11:0x003e, B:13:0x0046, B:17:0x004f, B:19:0x0065, B:29:0x001e, B:31:0x002c), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File a(android.content.Context r3, int r4, int r5, java.lang.String r6) {
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
            com.comviva.webaxn.utils.p1.i = r3     // Catch: java.lang.Exception -> L13
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
            java.io.File r3 = com.comviva.webaxn.utils.p1.i     // Catch: java.lang.Exception -> L13
            if (r3 == 0) goto L94
            java.io.File r3 = com.comviva.webaxn.utils.p1.i     // Catch: java.lang.Exception -> L13
            boolean r3 = r3.exists()     // Catch: java.lang.Exception -> L13
            if (r3 != 0) goto L4f
            java.io.File r3 = com.comviva.webaxn.utils.p1.i     // Catch: java.lang.Exception -> L13
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
            java.io.File r6 = com.comviva.webaxn.utils.p1.i     // Catch: java.lang.Exception -> L13
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
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.p1.a(android.content.Context, int, int, java.lang.String):java.io.File");
    }

    public static String a(Context context, wj wjVar, mj mjVar, lj ljVar, String str, yj yjVar, e eVar) {
        return y1.a(context, wjVar, mjVar, ljVar, str, yjVar, eVar);
    }

    public static void a() {
        ProgressDialog progressDialog = m.v;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    public static void a(Activity activity, Uri uri) {
        CropImage.b a2 = CropImage.a(uri);
        a2.a(CropImageView.d.ON);
        a2.a(true);
        a2.b(zi.x);
        a2.a("Poppins-Regular.ttf");
        a2.a((CharSequence) activity.getString(R.string.crop_header));
        a2.a(CropImageView.c.RECTANGLE);
        a2.a(400, 400);
        a2.a(R.drawable.crop_ph);
        a2.a(activity);
    }

    public static void a(Context context, int i2) {
        try {
            x1.v = true;
            ((Activity) context).startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), i2);
        } catch (Exception unused) {
            String c2 = j1.a(context).c("msg.AppNotFound");
            if (c2 == null) {
                c2 = context.getString(R.string.app_not_found_error);
            }
            Toast.makeText(context, c2, 0).show();
        }
    }

    public static void a(Context context, int i2, int i3, int i4) {
        try {
            x1.v = true;
            Intent intent = new Intent();
            intent.setClass(context, WebAxnContactPickerActivity.class);
            intent.putExtra("minimum", i2);
            intent.putExtra("maximum", i3);
            ((Activity) context).startActivityForResult(intent, i4);
        } catch (ActivityNotFoundException unused) {
            String c2 = j1.a(context).c("msg.AppNotFound");
            if (c2 == null) {
                c2 = context.getString(R.string.app_not_found_error);
            }
            Toast.makeText(context, c2, 0).show();
        }
    }

    private static void a(Context context, com.comviva.webaxn.ui.n1 n1Var, String str, String str2, String str3, boolean z, wj wjVar) {
        if (m1.a(context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
            h = new m(context, n1Var, str2, str3, z, wjVar);
            try {
                if (Build.VERSION.SDK_INT >= 11) {
                    h.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, str);
                } else {
                    h.execute(str);
                }
                return;
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (j1.a(context).d("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            m1.a((Activity) context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9);
        } else {
            if (!m1.a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                x1.d(context, "msg.rpStorage");
                return;
            }
            m1.a((Activity) context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9);
        }
        x1.v = true;
    }

    public static void a(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 11) {
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
            } else {
                ((android.text.ClipboardManager) context.getSystemService("clipboard")).setText(str);
            }
            String c2 = j1.a(context).c("msg.copyToCB");
            if (TextUtils.isEmpty(c2)) {
                c2 = context.getString(R.string.copy_clipboard);
            }
            Toast.makeText(context, c2, 0).show();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(Context context, String str, int i2) {
        try {
            if (i2 == -1) {
                ((Activity) context).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
            } else {
                ((Activity) context).startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), i2);
            }
        } catch (ActivityNotFoundException unused) {
        }
    }

    public static void a(Context context, String str, com.comviva.webaxn.ui.o1 o1Var, yj yjVar) {
        if (o1Var != null && str.startsWith("analytics://firebase?") && zi.w == 1) {
            t.a(context).a(Uri.decode(str.substring(21)), o1Var, yjVar);
        }
    }

    public static void a(Context context, String str, String str2) {
        try {
            x1.v = true;
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(str2))));
        } catch (Exception unused) {
            if (!TextUtils.isEmpty(str)) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return;
            }
            String c2 = j1.a(context).c("msg.AppNotFound");
            if (c2 == null) {
                c2 = context.getString(R.string.app_not_found_error);
            }
            Toast.makeText(context, c2, 0).show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
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
            boolean r6 = b(r5, r0)     // Catch: java.lang.Exception -> L7c
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
            com.comviva.webaxn.utils.j1 r6 = com.comviva.webaxn.utils.j1.a(r5)
            java.lang.String r7 = "msg.AppNotFound"
            java.lang.String r6 = r6.c(r7)
            if (r6 != 0) goto L90
            r6 = 2131755690(0x7f1002aa, float:1.9142266E38)
            java.lang.String r6 = r5.getString(r6)
        L90:
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r1)
            r5.show()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.p1.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5) {
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
        x1.v = true;
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

    public static void a(Context context, String str, boolean z) {
        try {
            ((Activity) context).startActivity(((Activity) context).getPackageManager().getLaunchIntentForPackage(str));
        } catch (Exception unused) {
            if (z) {
                a(context, str, -1);
            } else {
                x1.a(context, j1.a(context).c("ttl.Alert"), j1.a(context).c("msg.FDownload"), true, true, str);
            }
        }
    }

    public static void a(Context context, yj yjVar) {
        try {
            x1.v = true;
            x1.x = true;
            e = yjVar;
            ((Activity) context).startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 1501);
        } catch (Exception unused) {
            String c2 = j1.a(context).c("msg.AppNotFound");
            if (c2 == null) {
                c2 = context.getString(R.string.app_not_found_error);
            }
            Toast.makeText(context, c2, 0).show();
        }
    }

    public static void a(Context context, yj yjVar, int i2, Uri uri) {
        try {
            x1.v = true;
            x1.x = true;
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            j = uri;
            intent.putExtra("output", uri);
            f = yjVar;
            ((Activity) context).startActivityForResult(intent, i2);
        } catch (Exception unused) {
            String c2 = j1.a(context).c("msg.AppNotFound");
            if (c2 == null) {
                c2 = context.getString(R.string.app_not_found_error);
            }
            Toast.makeText(context, c2, 0).show();
        }
    }

    public static void a(Context context, yj yjVar, int i2, String str, int i3) {
        a(context, yjVar, i3, Build.VERSION.SDK_INT >= 24 ? FileProvider.a(context, context.getString(R.string.authority), a(context, i2, 1, str)) : Uri.fromFile(a(context, i2, 1, str)));
    }

    public static void a(Context context, yj yjVar, CameraData cameraData, int i2) {
        x1.v = true;
        x1.x = true;
        f = yjVar;
        Intent intent = new Intent();
        intent.setClass(context, CameraActivity.class);
        intent.putExtra("camera_usage", "image_capture");
        intent.putExtra("camera_data", cameraData);
        ((Activity) context).startActivityForResult(intent, i2);
    }

    public static void a(Context context, yj yjVar, RecorderData recorderData, int i2) {
        x1.v = true;
        x1.x = true;
        g = yjVar;
        Intent intent = new Intent();
        intent.setClass(context, RecorderActivity.class);
        intent.putExtra("recorder_data", recorderData);
        ((Activity) context).startActivityForResult(intent, i2);
    }

    public static void a(Context context, yj yjVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        d = yjVar;
    }

    public static void a(com.comviva.webaxn.ui.n1 n1Var, Context context, String str, String str2, String str3, boolean z, wj wjVar) {
        String str4;
        String str5;
        if (str2.startsWith("http://") || str2.startsWith("https://") || str2.startsWith("rtsp://")) {
            str4 = str2;
        } else {
            str4 = new String("http://" + str2);
        }
        if (!str.startsWith("video/") || z) {
            if (Environment.getExternalStorageState().equals("mounted")) {
                if (System.currentTimeMillis() - a > 1700) {
                    a = System.currentTimeMillis();
                    a(context, n1Var, str4, str3, str, z, wjVar);
                    return;
                }
                return;
            }
            str5 = "No SD card present.Action not allowed.";
        } else {
            if (!TextUtils.isEmpty(str4)) {
                e(context, str4);
                x1.q = wjVar;
                return;
            }
            str5 = "There is no url for Video streaming.";
        }
        Toast.makeText(context, str5, 0).show();
    }

    public static void b(Context context, String str, String str2) {
        try {
            x1.v = true;
            Intent intent = new Intent("android.intent.action.SENDTO");
            if (str2 != null) {
                intent.putExtra("sms_body", str2);
            }
            if (str != null) {
                intent.setData(Uri.parse("smsto:" + str));
            }
            context.startActivity(intent);
        } catch (Exception unused) {
            String c2 = j1.a(context).c("msg.AppNotFound");
            if (c2 == null) {
                c2 = context.getString(R.string.app_not_found_error);
            }
            Toast.makeText(context, c2, 0).show();
        }
    }

    public static void b(Context context, yj yjVar, CameraData cameraData, int i2) {
        x1.v = true;
        x1.x = true;
        f = yjVar;
        Intent intent = new Intent();
        intent.setClass(context, CameraActivity.class);
        intent.putExtra("camera_usage", "video_capture");
        intent.putExtra("camera_data", cameraData);
        ((Activity) context).startActivityForResult(intent, i2);
    }

    public static boolean b(Context context, String str) {
        Iterator<ApplicationInfo> it = context.getPackageManager().getInstalledApplications(0).iterator();
        while (it.hasNext()) {
            if (it.next().packageName.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void c(Context context, String str) {
        try {
            x1.v = true;
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:" + Uri.encode(str)));
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static void d(Context context, String str) {
        x1.v = true;
        Intent intent = new Intent();
        intent.setClass(context, WebViewActivity.class);
        intent.putExtra("URL", str);
        context.startActivity(intent);
    }

    public static void e(Context context, String str) {
        x1.v = true;
        Intent intent = new Intent();
        intent.setClass(context, InlineVideoPlayer.class);
        intent.putExtra("url", str);
        context.startActivity(intent);
    }

    public static void f(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                Toast.makeText(context, "Enter text to be shared.", 0).show();
            } else {
                x1.v = true;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", str);
                intent.setType("text/plain");
                context.startActivity(Intent.createChooser(intent, "Via shareApp"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
