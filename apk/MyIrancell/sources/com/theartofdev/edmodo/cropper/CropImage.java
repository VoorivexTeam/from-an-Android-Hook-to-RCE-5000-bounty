package com.theartofdev.edmodo.cropper;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class CropImage {

    /* loaded from: classes.dex */
    public static final class ActivityResult extends CropImageView.C2321b implements Parcelable {
        public static final Parcelable.Creator<ActivityResult> CREATOR = new C2314a();

        /* renamed from: com.theartofdev.edmodo.cropper.CropImage$ActivityResult$a */
        /* loaded from: classes.dex */
        static class C2314a implements Parcelable.Creator<ActivityResult> {
            C2314a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ActivityResult createFromParcel(Parcel parcel) {
                return new ActivityResult(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ActivityResult[] newArray(int i) {
                return new ActivityResult[i];
            }
        }

        public ActivityResult(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i, Rect rect2, int i2) {
            super(null, uri, null, uri2, exc, fArr, rect, rect2, i, i2);
        }

        protected ActivityResult(Parcel parcel) {
            super(null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Exception) parcel.readSerializable(), parcel.createFloatArray(), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(m11086d(), i);
            parcel.writeParcelable(m11089g(), i);
            parcel.writeSerializable(m11085c());
            parcel.writeFloatArray(m11083a());
            parcel.writeParcelable(m11084b(), i);
            parcel.writeParcelable(m11090h(), i);
            parcel.writeInt(m11087e());
            parcel.writeInt(m11088f());
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImage$b */
    /* loaded from: classes.dex */
    public static final class C2316b {

        /* renamed from: a */
        private final Uri f9307a;

        /* renamed from: b */
        private final CropImageOptions f9308b;

        private C2316b(Uri uri) {
            this.f9307a = uri;
            this.f9308b = new CropImageOptions();
        }

        /* renamed from: a */
        public Intent m11037a(Context context) {
            return m11038a(context, CropImageActivity.class);
        }

        /* renamed from: a */
        public Intent m11038a(Context context, Class<?> cls) {
            this.f9308b.m11060a();
            Intent intent = new Intent();
            intent.setClass(context, cls);
            Bundle bundle = new Bundle();
            bundle.putParcelable("CROP_IMAGE_EXTRA_SOURCE", this.f9307a);
            bundle.putParcelable("CROP_IMAGE_EXTRA_OPTIONS", this.f9308b);
            intent.putExtra("CROP_IMAGE_EXTRA_BUNDLE", bundle);
            return intent;
        }

        /* renamed from: a */
        public C2316b m11039a(int i) {
            this.f9308b.f9339W = i;
            return this;
        }

        /* renamed from: a */
        public C2316b m11040a(int i, int i2) {
            m11041a(i, i2, CropImageView.EnumC2329j.RESIZE_INSIDE);
            return this;
        }

        /* renamed from: a */
        public C2316b m11041a(int i, int i2, CropImageView.EnumC2329j enumC2329j) {
            CropImageOptions cropImageOptions = this.f9308b;
            cropImageOptions.f9326J = i;
            cropImageOptions.f9327K = i2;
            cropImageOptions.f9328L = enumC2329j;
            return this;
        }

        /* renamed from: a */
        public C2316b m11042a(CropImageView.EnumC2322c enumC2322c) {
            this.f9308b.f9344b = enumC2322c;
            return this;
        }

        /* renamed from: a */
        public C2316b m11043a(CropImageView.EnumC2323d enumC2323d) {
            this.f9308b.f9350e = enumC2323d;
            return this;
        }

        /* renamed from: a */
        public C2316b m11044a(CharSequence charSequence) {
            this.f9308b.f9321E = charSequence;
            return this;
        }

        /* renamed from: a */
        public C2316b m11045a(String str) {
            this.f9308b.f9351e0 = str;
            return this;
        }

        /* renamed from: a */
        public C2316b m11046a(boolean z) {
            this.f9308b.f9341Y = z;
            return this;
        }

        /* renamed from: a */
        public void m11047a(Activity activity) {
            this.f9308b.m11060a();
            activity.startActivityForResult(m11037a((Context) activity), 203);
        }

        /* renamed from: b */
        public C2316b m11048b(int i) {
            this.f9308b.f9340X = i;
            return this;
        }
    }

    /* renamed from: a */
    public static Intent m11024a(Context context, CharSequence charSequence, boolean z, boolean z2) {
        Intent intent;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        if (!m11036c(context) && z2) {
            arrayList.addAll(m11029a(context, packageManager));
        }
        List<Intent> m11030a = m11030a(packageManager, "android.intent.action.GET_CONTENT", z);
        if (m11030a.size() == 0) {
            m11030a = m11030a(packageManager, "android.intent.action.PICK", z);
        }
        arrayList.addAll(m11030a);
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            intent = (Intent) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
        }
        Intent createChooser = Intent.createChooser(intent, charSequence);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
        return createChooser;
    }

    /* renamed from: a */
    public static Uri m11025a(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            return Uri.fromFile(new File(externalCacheDir.getPath(), "pickImageResult.jpeg"));
        }
        return null;
    }

    /* renamed from: a */
    public static Uri m11026a(Context context, Intent intent) {
        String action;
        boolean z = true;
        if (intent != null && intent.getData() != null && ((action = intent.getAction()) == null || !action.equals("android.media.action.IMAGE_CAPTURE"))) {
            z = false;
        }
        return (z || intent.getData() == null) ? m11025a(context) : intent.getData();
    }

    /* renamed from: a */
    public static ActivityResult m11027a(Intent intent) {
        if (intent != null) {
            return (ActivityResult) intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT");
        }
        return null;
    }

    /* renamed from: a */
    public static C2316b m11028a(Uri uri) {
        return new C2316b(uri);
    }

    /* renamed from: a */
    public static List<Intent> m11029a(Context context, PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        Uri m11025a = m11025a(context);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (m11025a != null) {
                intent2.putExtra("output", m11025a);
            }
            arrayList.add(intent2);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<Intent> m11030a(PackageManager packageManager, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Intent intent = str == "android.intent.action.GET_CONTENT" ? new Intent(str) : new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        if (!z) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Intent intent3 = (Intent) it.next();
                if (intent3.getComponent().getClassName().equals("com.android.documentsui.DocumentsActivity")) {
                    arrayList.remove(intent3);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m11031a(Activity activity) {
        activity.startActivityForResult(m11034b(activity), 200);
    }

    /* renamed from: a */
    public static boolean m11032a(Context context, Uri uri) {
        return Build.VERSION.SDK_INT >= 23 && context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0 && m11035b(context, uri);
    }

    /* renamed from: a */
    public static boolean m11033a(Context context, String str) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                for (String str2 : strArr) {
                    if (str2.equalsIgnoreCase(str)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: b */
    public static Intent m11034b(Context context) {
        return m11024a(context, context.getString(R$string.pick_image_intent_chooser_title), false, true);
    }

    /* renamed from: b */
    public static boolean m11035b(Context context, Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return false;
            }
            openInputStream.close();
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: c */
    public static boolean m11036c(Context context) {
        return Build.VERSION.SDK_INT >= 23 && m11033a(context, "android.permission.CAMERA") && context.checkSelfPermission("android.permission.CAMERA") != 0;
    }
}
