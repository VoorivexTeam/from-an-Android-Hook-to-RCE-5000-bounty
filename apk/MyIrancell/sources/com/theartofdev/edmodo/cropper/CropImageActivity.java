package com.theartofdev.edmodo.cropper;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AbstractC0081a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.C0237b;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class CropImageActivity extends AppCompatActivity implements CropImageView.InterfaceC2328i, CropImageView.InterfaceC2324e {

    /* renamed from: q */
    private CropImageView f9309q;

    /* renamed from: r */
    private RelativeLayout f9310r;

    /* renamed from: s */
    private TextView f9311s;

    /* renamed from: t */
    private TextView f9312t;

    /* renamed from: u */
    private Uri f9313u;

    /* renamed from: v */
    private CropImageOptions f9314v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.theartofdev.edmodo.cropper.CropImageActivity$a */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2317a implements View.OnClickListener {
        ViewOnClickListenerC2317a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CropImageActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.theartofdev.edmodo.cropper.CropImageActivity$b */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2318b implements View.OnClickListener {
        ViewOnClickListenerC2318b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CropImageActivity.this.m11057n();
        }
    }

    /* renamed from: a */
    private Typeface m11049a(String str) {
        try {
            return Typeface.createFromAsset(getAssets(), "typeface/" + str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private void m11050a(Menu menu, int i, int i2) {
        Drawable icon;
        MenuItem findItem = menu.findItem(i);
        if (findItem == null || (icon = findItem.getIcon()) == null) {
            return;
        }
        try {
            icon.mutate();
            icon.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
            findItem.setIcon(icon);
        } catch (Exception unused) {
        }
    }

    /* renamed from: q */
    private void m11051q() {
        Typeface m11049a;
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.custom_action_layout);
        this.f9310r = relativeLayout;
        relativeLayout.setVisibility(0);
        this.f9310r.setBackgroundColor(this.f9314v.f9342Z);
        TextView textView = (TextView) findViewById(R$id.header_cancel);
        this.f9311s = textView;
        textView.setTextColor(this.f9314v.f9343a0);
        this.f9311s.setTextSize(this.f9314v.f9347c0);
        TextView textView2 = (TextView) findViewById(R$id.header_done);
        this.f9312t = textView2;
        textView2.setTextColor(this.f9314v.f9343a0);
        this.f9312t.setTextSize(this.f9314v.f9347c0);
        if (!TextUtils.isEmpty(this.f9314v.f9351e0) && (m11049a = m11049a(this.f9314v.f9351e0)) != null) {
            this.f9311s.setTypeface(m11049a);
            this.f9312t.setTypeface(m11049a);
        }
        this.f9311s.setOnClickListener(new ViewOnClickListenerC2317a());
        this.f9312t.setOnClickListener(new ViewOnClickListenerC2318b());
    }

    /* renamed from: a */
    protected Intent m11052a(Uri uri, Exception exc, int i) {
        CropImage.ActivityResult activityResult = new CropImage.ActivityResult(this.f9309q.getImageUri(), uri, exc, this.f9309q.getCropPoints(), this.f9309q.getCropRect(), this.f9309q.getRotatedDegrees(), this.f9309q.getWholeImageRect(), i);
        Intent intent = new Intent();
        intent.putExtras(getIntent());
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", activityResult);
        return intent;
    }

    @Override // com.theartofdev.edmodo.cropper.CropImageView.InterfaceC2328i
    /* renamed from: a */
    public void mo11053a(CropImageView cropImageView, Uri uri, Exception exc) {
        if (exc != null) {
            m11055b(null, exc, 1);
            return;
        }
        Rect rect = this.f9314v.f9330N;
        if (rect != null) {
            this.f9309q.setCropRect(rect);
        }
        int i = this.f9314v.f9331O;
        if (i > -1) {
            this.f9309q.setRotatedDegrees(i);
        }
    }

    @Override // com.theartofdev.edmodo.cropper.CropImageView.InterfaceC2324e
    /* renamed from: a */
    public void mo11054a(CropImageView cropImageView, CropImageView.C2321b c2321b) {
        m11055b(c2321b.m11089g(), c2321b.m11085c(), c2321b.m11088f());
    }

    /* renamed from: b */
    protected void m11055b(Uri uri, Exception exc, int i) {
        setResult(exc == null ? -1 : 204, m11052a(uri, exc, i));
        finish();
    }

    /* renamed from: c */
    protected void m11056c(int i) {
        this.f9309q.m11075a(i);
    }

    /* renamed from: n */
    protected void m11057n() {
        if (this.f9314v.f9329M) {
            m11055b(null, null, 1);
            return;
        }
        Uri m11058o = m11058o();
        CropImageView cropImageView = this.f9309q;
        CropImageOptions cropImageOptions = this.f9314v;
        cropImageView.m11077a(m11058o, cropImageOptions.f9324H, cropImageOptions.f9325I, cropImageOptions.f9326J, cropImageOptions.f9327K, cropImageOptions.f9328L);
    }

    /* renamed from: o */
    protected Uri m11058o() {
        Uri uri = this.f9314v.f9323G;
        if (uri != null && !uri.equals(Uri.EMPTY)) {
            return uri;
        }
        try {
            return Uri.fromFile(File.createTempFile("cropped", this.f9314v.f9324H == Bitmap.CompressFormat.JPEG ? ".jpg" : this.f9314v.f9324H == Bitmap.CompressFormat.PNG ? ".png" : ".webp", getCacheDir()));
        } catch (IOException e) {
            throw new RuntimeException("Failed to create temp file for output image", e);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    @SuppressLint({"NewApi"})
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 200) {
            if (i2 == 0) {
                m11059p();
            }
            if (i2 == -1) {
                Uri m11026a = CropImage.m11026a(this, intent);
                this.f9313u = m11026a;
                if (CropImage.m11032a(this, m11026a)) {
                    requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
                } else {
                    this.f9309q.setImageUriAsync(this.f9313u);
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        m11059p();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"NewApi"})
    public void onCreate(Bundle bundle) {
        CropImageOptions cropImageOptions;
        super.onCreate(bundle);
        setContentView(R$layout.crop_image_activity);
        this.f9309q = (CropImageView) findViewById(R$id.cropImageView);
        Bundle bundleExtra = getIntent().getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
        this.f9313u = (Uri) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_SOURCE");
        CropImageOptions cropImageOptions2 = (CropImageOptions) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        this.f9314v = cropImageOptions2;
        if (Build.VERSION.SDK_INT >= 21 && cropImageOptions2 != null) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(this.f9314v.f9340X);
        }
        if (bundle == null) {
            Uri uri = this.f9313u;
            if (uri == null || uri.equals(Uri.EMPTY)) {
                if (CropImage.m11036c(this)) {
                    requestPermissions(new String[]{"android.permission.CAMERA"}, 2011);
                } else {
                    CropImage.m11031a((Activity) this);
                }
            } else if (CropImage.m11032a(this, this.f9313u)) {
                requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
            } else {
                this.f9309q.setImageUriAsync(this.f9313u);
            }
        }
        AbstractC0081a m365k = m365k();
        if (m365k == null || (cropImageOptions = this.f9314v) == null) {
            return;
        }
        if (cropImageOptions.f9341Y) {
            m365k.mo477i();
            m11051q();
        } else {
            CharSequence charSequence = cropImageOptions.f9321E;
            m365k.mo465a((charSequence == null || charSequence.length() <= 0) ? getResources().getString(R$string.crop_image_activity_title) : this.f9314v.f9321E);
            m365k.mo471d(true);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R$menu.crop_image_menu, menu);
        CropImageOptions cropImageOptions = this.f9314v;
        if (!cropImageOptions.f9332P) {
            menu.removeItem(R$id.crop_image_menu_rotate_left);
            menu.removeItem(R$id.crop_image_menu_rotate_right);
        } else if (cropImageOptions.f9334R) {
            menu.findItem(R$id.crop_image_menu_rotate_left).setVisible(true);
        }
        if (!this.f9314v.f9333Q) {
            menu.removeItem(R$id.crop_image_menu_flip);
        }
        if (this.f9314v.f9338V != null) {
            menu.findItem(R$id.crop_image_menu_crop).setTitle(this.f9314v.f9338V);
        }
        Drawable drawable = null;
        try {
            if (this.f9314v.f9339W != 0) {
                drawable = C0237b.m1466c(this, this.f9314v.f9339W);
                menu.findItem(R$id.crop_image_menu_crop).setIcon(drawable);
            }
        } catch (Exception unused) {
        }
        int i = this.f9314v.f9322F;
        if (i != 0) {
            m11050a(menu, R$id.crop_image_menu_rotate_left, i);
            m11050a(menu, R$id.crop_image_menu_rotate_right, this.f9314v.f9322F);
            m11050a(menu, R$id.crop_image_menu_flip, this.f9314v.f9322F);
            if (drawable != null) {
                m11050a(menu, R$id.crop_image_menu_crop, this.f9314v.f9322F);
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R$id.crop_image_menu_crop) {
            m11057n();
            return true;
        }
        if (menuItem.getItemId() == R$id.crop_image_menu_rotate_left) {
            m11056c(-this.f9314v.f9335S);
            return true;
        }
        if (menuItem.getItemId() == R$id.crop_image_menu_rotate_right) {
            m11056c(this.f9314v.f9335S);
            return true;
        }
        if (menuItem.getItemId() == R$id.crop_image_menu_flip_horizontally) {
            this.f9309q.m11074a();
            return true;
        }
        if (menuItem.getItemId() == R$id.crop_image_menu_flip_vertically) {
            this.f9309q.m11080b();
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        m11059p();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, androidx.core.app.C0223a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 201) {
            Uri uri = this.f9313u;
            if (uri == null || iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(this, R$string.crop_image_activity_no_permissions, 1).show();
                m11059p();
            } else {
                this.f9309q.setImageUriAsync(uri);
            }
        }
        if (i == 2011) {
            CropImage.m11031a((Activity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f9309q.setOnSetImageUriCompleteListener(this);
        this.f9309q.setOnCropImageCompleteListener(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f9309q.setOnSetImageUriCompleteListener(null);
        this.f9309q.setOnCropImageCompleteListener(null);
    }

    /* renamed from: p */
    protected void m11059p() {
        setResult(0);
        finish();
    }
}
