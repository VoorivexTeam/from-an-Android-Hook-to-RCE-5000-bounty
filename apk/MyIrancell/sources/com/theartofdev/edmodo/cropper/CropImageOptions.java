package com.theartofdev.edmodo.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.theartofdev.edmodo.cropper.CropImageView;

/* loaded from: classes.dex */
public class CropImageOptions implements Parcelable {
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new C2319a();

    /* renamed from: A */
    public int f9317A;

    /* renamed from: B */
    public int f9318B;

    /* renamed from: C */
    public int f9319C;

    /* renamed from: D */
    public int f9320D;

    /* renamed from: E */
    public CharSequence f9321E;

    /* renamed from: F */
    public int f9322F;

    /* renamed from: G */
    public Uri f9323G;

    /* renamed from: H */
    public Bitmap.CompressFormat f9324H;

    /* renamed from: I */
    public int f9325I;

    /* renamed from: J */
    public int f9326J;

    /* renamed from: K */
    public int f9327K;

    /* renamed from: L */
    public CropImageView.EnumC2329j f9328L;

    /* renamed from: M */
    public boolean f9329M;

    /* renamed from: N */
    public Rect f9330N;

    /* renamed from: O */
    public int f9331O;

    /* renamed from: P */
    public boolean f9332P;

    /* renamed from: Q */
    public boolean f9333Q;

    /* renamed from: R */
    public boolean f9334R;

    /* renamed from: S */
    public int f9335S;

    /* renamed from: T */
    public boolean f9336T;

    /* renamed from: U */
    public boolean f9337U;

    /* renamed from: V */
    public CharSequence f9338V;

    /* renamed from: W */
    public int f9339W;

    /* renamed from: X */
    public int f9340X;

    /* renamed from: Y */
    public boolean f9341Y;

    /* renamed from: Z */
    public int f9342Z;

    /* renamed from: a0 */
    public int f9343a0;

    /* renamed from: b */
    public CropImageView.EnumC2322c f9344b;

    /* renamed from: b0 */
    public int f9345b0;

    /* renamed from: c */
    public float f9346c;

    /* renamed from: c0 */
    public int f9347c0;

    /* renamed from: d */
    public float f9348d;

    /* renamed from: d0 */
    public int f9349d0;

    /* renamed from: e */
    public CropImageView.EnumC2323d f9350e;

    /* renamed from: e0 */
    public String f9351e0;

    /* renamed from: f */
    public CropImageView.EnumC2330k f9352f;

    /* renamed from: g */
    public boolean f9353g;

    /* renamed from: h */
    public boolean f9354h;

    /* renamed from: i */
    public boolean f9355i;

    /* renamed from: j */
    public boolean f9356j;

    /* renamed from: k */
    public int f9357k;

    /* renamed from: l */
    public float f9358l;

    /* renamed from: m */
    public boolean f9359m;

    /* renamed from: n */
    public int f9360n;

    /* renamed from: o */
    public int f9361o;

    /* renamed from: p */
    public float f9362p;

    /* renamed from: q */
    public int f9363q;

    /* renamed from: r */
    public float f9364r;

    /* renamed from: s */
    public float f9365s;

    /* renamed from: t */
    public float f9366t;

    /* renamed from: u */
    public int f9367u;

    /* renamed from: v */
    public float f9368v;

    /* renamed from: w */
    public int f9369w;

    /* renamed from: x */
    public int f9370x;

    /* renamed from: y */
    public int f9371y;

    /* renamed from: z */
    public int f9372z;

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageOptions$a */
    /* loaded from: classes.dex */
    static class C2319a implements Parcelable.Creator<CropImageOptions> {
        C2319a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CropImageOptions createFromParcel(Parcel parcel) {
            return new CropImageOptions(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CropImageOptions[] newArray(int i) {
            return new CropImageOptions[i];
        }
    }

    public CropImageOptions() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f9344b = CropImageView.EnumC2322c.RECTANGLE;
        this.f9346c = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f9348d = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f9350e = CropImageView.EnumC2323d.ON_TOUCH;
        this.f9352f = CropImageView.EnumC2330k.FIT_CENTER;
        this.f9353g = true;
        this.f9354h = true;
        this.f9355i = true;
        this.f9356j = false;
        this.f9357k = 4;
        this.f9358l = 0.1f;
        this.f9359m = false;
        this.f9360n = 1;
        this.f9361o = 1;
        this.f9362p = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f9363q = Color.argb(170, 255, 255, 255);
        this.f9364r = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.f9365s = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.f9366t = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.f9367u = -1;
        this.f9368v = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.f9369w = Color.argb(170, 255, 255, 255);
        this.f9370x = Color.argb(119, 0, 0, 0);
        this.f9371y = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f9372z = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f9317A = 40;
        this.f9318B = 40;
        this.f9319C = 99999;
        this.f9320D = 99999;
        this.f9321E = "";
        this.f9322F = 0;
        this.f9323G = Uri.EMPTY;
        this.f9324H = Bitmap.CompressFormat.JPEG;
        this.f9325I = 90;
        this.f9326J = 0;
        this.f9327K = 0;
        this.f9328L = CropImageView.EnumC2329j.NONE;
        this.f9329M = false;
        this.f9330N = null;
        this.f9331O = -1;
        this.f9332P = true;
        this.f9333Q = true;
        this.f9334R = false;
        this.f9335S = 90;
        this.f9336T = false;
        this.f9337U = false;
        this.f9338V = null;
        this.f9339W = 0;
        this.f9340X = 0;
        this.f9341Y = false;
        this.f9342Z = Color.argb(255, 1, 1, 3);
        this.f9343a0 = Color.argb(255, 110, 110, 112);
        this.f9345b0 = Color.argb(255, 110, 110, 112);
        this.f9347c0 = 22;
        this.f9349d0 = 22;
        this.f9351e0 = null;
    }

    protected CropImageOptions(Parcel parcel) {
        this.f9344b = CropImageView.EnumC2322c.values()[parcel.readInt()];
        this.f9346c = parcel.readFloat();
        this.f9348d = parcel.readFloat();
        this.f9350e = CropImageView.EnumC2323d.values()[parcel.readInt()];
        this.f9352f = CropImageView.EnumC2330k.values()[parcel.readInt()];
        this.f9353g = parcel.readByte() != 0;
        this.f9354h = parcel.readByte() != 0;
        this.f9355i = parcel.readByte() != 0;
        this.f9356j = parcel.readByte() != 0;
        this.f9357k = parcel.readInt();
        this.f9358l = parcel.readFloat();
        this.f9359m = parcel.readByte() != 0;
        this.f9360n = parcel.readInt();
        this.f9361o = parcel.readInt();
        this.f9362p = parcel.readFloat();
        this.f9363q = parcel.readInt();
        this.f9364r = parcel.readFloat();
        this.f9365s = parcel.readFloat();
        this.f9366t = parcel.readFloat();
        this.f9367u = parcel.readInt();
        this.f9368v = parcel.readFloat();
        this.f9369w = parcel.readInt();
        this.f9370x = parcel.readInt();
        this.f9371y = parcel.readInt();
        this.f9372z = parcel.readInt();
        this.f9317A = parcel.readInt();
        this.f9318B = parcel.readInt();
        this.f9319C = parcel.readInt();
        this.f9320D = parcel.readInt();
        this.f9321E = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f9322F = parcel.readInt();
        this.f9323G = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f9324H = Bitmap.CompressFormat.valueOf(parcel.readString());
        this.f9325I = parcel.readInt();
        this.f9326J = parcel.readInt();
        this.f9327K = parcel.readInt();
        this.f9328L = CropImageView.EnumC2329j.values()[parcel.readInt()];
        this.f9329M = parcel.readByte() != 0;
        this.f9330N = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f9331O = parcel.readInt();
        this.f9332P = parcel.readByte() != 0;
        this.f9333Q = parcel.readByte() != 0;
        this.f9334R = parcel.readByte() != 0;
        this.f9335S = parcel.readInt();
        this.f9336T = parcel.readByte() != 0;
        this.f9337U = parcel.readByte() != 0;
        this.f9338V = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f9339W = parcel.readInt();
        this.f9340X = parcel.readInt();
        this.f9341Y = parcel.readByte() != 0;
        this.f9342Z = parcel.readInt();
        this.f9343a0 = parcel.readInt();
        this.f9345b0 = parcel.readInt();
        this.f9347c0 = parcel.readInt();
        this.f9349d0 = parcel.readInt();
        this.f9351e0 = parcel.readString();
    }

    /* renamed from: a */
    public void m11060a() {
        if (this.f9357k < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        }
        if (this.f9348d < 0.0f) {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        float f = this.f9358l;
        if (f < 0.0f || f >= 0.5d) {
            throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
        if (this.f9360n <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f9361o <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f9362p < 0.0f) {
            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
        }
        if (this.f9364r < 0.0f) {
            throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
        }
        if (this.f9368v < 0.0f) {
            throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
        }
        if (this.f9372z < 0) {
            throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
        }
        int i = this.f9317A;
        if (i < 0) {
            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
        }
        int i2 = this.f9318B;
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
        }
        if (this.f9319C < i) {
            throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
        }
        if (this.f9320D < i2) {
            throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
        }
        if (this.f9326J < 0) {
            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
        }
        if (this.f9327K < 0) {
            throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
        }
        int i3 = this.f9335S;
        if (i3 < 0 || i3 > 360) {
            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9344b.ordinal());
        parcel.writeFloat(this.f9346c);
        parcel.writeFloat(this.f9348d);
        parcel.writeInt(this.f9350e.ordinal());
        parcel.writeInt(this.f9352f.ordinal());
        parcel.writeByte(this.f9353g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9354h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9355i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9356j ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f9357k);
        parcel.writeFloat(this.f9358l);
        parcel.writeByte(this.f9359m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f9360n);
        parcel.writeInt(this.f9361o);
        parcel.writeFloat(this.f9362p);
        parcel.writeInt(this.f9363q);
        parcel.writeFloat(this.f9364r);
        parcel.writeFloat(this.f9365s);
        parcel.writeFloat(this.f9366t);
        parcel.writeInt(this.f9367u);
        parcel.writeFloat(this.f9368v);
        parcel.writeInt(this.f9369w);
        parcel.writeInt(this.f9370x);
        parcel.writeInt(this.f9371y);
        parcel.writeInt(this.f9372z);
        parcel.writeInt(this.f9317A);
        parcel.writeInt(this.f9318B);
        parcel.writeInt(this.f9319C);
        parcel.writeInt(this.f9320D);
        TextUtils.writeToParcel(this.f9321E, parcel, i);
        parcel.writeInt(this.f9322F);
        parcel.writeParcelable(this.f9323G, i);
        parcel.writeString(this.f9324H.name());
        parcel.writeInt(this.f9325I);
        parcel.writeInt(this.f9326J);
        parcel.writeInt(this.f9327K);
        parcel.writeInt(this.f9328L.ordinal());
        parcel.writeInt(this.f9329M ? 1 : 0);
        parcel.writeParcelable(this.f9330N, i);
        parcel.writeInt(this.f9331O);
        parcel.writeByte(this.f9332P ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9333Q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9334R ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f9335S);
        parcel.writeByte(this.f9336T ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9337U ? (byte) 1 : (byte) 0);
        TextUtils.writeToParcel(this.f9338V, parcel, i);
        parcel.writeInt(this.f9339W);
        parcel.writeInt(this.f9340X);
        parcel.writeByte(this.f9341Y ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f9342Z);
        parcel.writeInt(this.f9343a0);
        parcel.writeInt(this.f9345b0);
        parcel.writeInt(this.f9347c0);
        parcel.writeInt(this.f9349d0);
        parcel.writeString(this.f9351e0);
    }
}
