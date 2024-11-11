package ir.tapsell.sdk.networkcacheutils;

import android.widget.ImageView;
import ir.tapsell.sdk.NoProguard;

/* loaded from: classes.dex */
public class ImageLoadOptions implements NoProguard {
    private float borderToWidthRatio;
    private Integer colorFilter;
    private long delayMillisecondsBeforeDownload;
    private Integer errorStubResID;
    private String fileCacheSuffix;
    private Integer initialStubResID;
    private ImageView.ScaleType mErrorScaleType;
    private ImageView.ScaleType mScaleType;
    private EnumC2737j modificationType;
    private Integer reloadIcon;
    private int requiredHeight;
    private int requiredWidth;
    private float roundRatio;
    public boolean clearMemoryWhenShowingNewImage = false;
    private InterfaceC2732e imageLoadListener = null;
    private EnumC2729b bitmapDecodingMethod = EnumC2729b.USE_NEEDED_SIZE;
    private boolean useAnimationInShowFromCache = true;
    private EnumC2733f showAnimationStyle = EnumC2733f.NONE;
    private EnumC2731d backgroundReplacementType = EnumC2731d.DO_NOTHING;
    private int backgroundReplacementColor = -16777216;
    private EnumC2736i watermarkType = EnumC2736i.NO_WATERMARK;
    private EnumC2734g initialReplacementType = EnumC2734g.DO_NOTHING;
    private EnumC2735h onErrorReplacement = EnumC2735h.DO_NOTHING;
    private EnumC2728a colorModification = EnumC2728a.NO_MODIFICATION;
    private EnumC2730c filterModification = EnumC2730c.NO_FILTER;

    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoadOptions$a */
    /* loaded from: classes.dex */
    public enum EnumC2728a {
        GREYSCALE("GREYSCALE"),
        CUSTOM_COLOR("CUSTOM_COLOR"),
        NO_MODIFICATION("NO_MODIFICATION");

        private final String name;

        EnumC2728a(String str) {
            this.name = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoadOptions$b */
    /* loaded from: classes.dex */
    public enum EnumC2729b {
        HIGHEST_CONFIG("HC"),
        HIGHEST_CONFIG_LOW_MEMORY("HCLM"),
        USE_NEEDED_SIZE("UNS"),
        USE_NEEDED_SIZE_UNLIMITED("UNSU"),
        MINIMUM_CONFIG("MC");

        private final String name;

        EnumC2729b(String str) {
            this.name = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoadOptions$c */
    /* loaded from: classes.dex */
    public enum EnumC2730c {
        BLUR("BLUR"),
        NO_FILTER("NO_FILTER");

        private final String name;

        EnumC2730c(String str) {
            this.name = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoadOptions$d */
    /* loaded from: classes.dex */
    public enum EnumC2731d {
        DO_NOTHING("DO_NOTHING"),
        REPLACE_WITH_COLOR("REPLACE_WITH_COLOR");

        private final String name;

        EnumC2731d(String str) {
            this.name = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoadOptions$e */
    /* loaded from: classes.dex */
    public interface InterfaceC2732e {
        /* renamed from: a */
        void m13085a();

        /* renamed from: b */
        void m13086b();
    }

    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoadOptions$f */
    /* loaded from: classes.dex */
    public enum EnumC2733f {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        FADE_IN,
        NONE
    }

    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoadOptions$g */
    /* loaded from: classes.dex */
    public enum EnumC2734g {
        REPLACE_INITIALLY_WITH_STUB,
        HIDE_IMAGE_VIEW,
        DO_NOTHING
    }

    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoadOptions$h */
    /* loaded from: classes.dex */
    public enum EnumC2735h {
        REPLACE_WITH_RELOAD,
        REPLACE_WITH_STUB,
        DO_NOTHING
    }

    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoadOptions$i */
    /* loaded from: classes.dex */
    public enum EnumC2736i {
        NO_WATERMARK
    }

    /* renamed from: ir.tapsell.sdk.networkcacheutils.ImageLoadOptions$j */
    /* loaded from: classes.dex */
    public enum EnumC2737j {
        ROUND_CORNERS("ROUND_CORNERS"),
        CIRCLE_CLIP("CIRCLE_CLIP"),
        SQUARE_CROP("SQUARE_CROP"),
        CENTER_CROP("CENTER_CROP"),
        CENTER_LARGE_CROP("CENTER_LARGE_CROP"),
        DO_NOTHING("DO_NOTHING");

        private final String name;

        EnumC2737j(String str) {
            this.name = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    public ImageLoadOptions() {
        this.modificationType = EnumC2737j.DO_NOTHING;
        this.roundRatio = 0.0f;
        this.borderToWidthRatio = 0.0f;
        this.fileCacheSuffix = null;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        this.mScaleType = scaleType;
        this.reloadIcon = null;
        this.mErrorScaleType = scaleType;
        this.delayMillisecondsBeforeDownload = 0L;
        this.modificationType = EnumC2737j.DO_NOTHING;
        this.roundRatio = 0.0f;
        this.borderToWidthRatio = 0.0f;
        this.fileCacheSuffix = null;
        this.mScaleType = ImageView.ScaleType.FIT_CENTER;
    }

    public boolean UseAnimationInShowFromCache() {
        return this.useAnimationInShowFromCache;
    }

    public int getBackgroundReplacementColor() {
        return this.backgroundReplacementColor;
    }

    public EnumC2731d getBackgroundReplacementType() {
        return this.backgroundReplacementType;
    }

    public EnumC2729b getBitmapDecodingMethod() {
        return this.bitmapDecodingMethod;
    }

    public float getBorderToWidthRatio() {
        return this.borderToWidthRatio;
    }

    public Integer getColorFilter() {
        return this.colorFilter;
    }

    public EnumC2728a getColorModification() {
        return this.colorModification;
    }

    public long getDelayMillisecondsBeforeDownload() {
        return this.delayMillisecondsBeforeDownload;
    }

    public ImageView.ScaleType getErrorScaleType() {
        if (this.mErrorScaleType == null) {
            this.mErrorScaleType = ImageView.ScaleType.CENTER_INSIDE;
        }
        return this.mErrorScaleType;
    }

    public Integer getErrorStubResID() {
        return this.errorStubResID;
    }

    public String getFileCacheSuffix() {
        return this.fileCacheSuffix;
    }

    public EnumC2730c getFilterModification() {
        return this.filterModification;
    }

    public InterfaceC2732e getImageLoadListener() {
        return this.imageLoadListener;
    }

    public EnumC2734g getInitialReplacementType() {
        return this.initialReplacementType;
    }

    public Integer getInitialStubResID() {
        return this.initialStubResID;
    }

    public String getModificationPostfix() {
        String str = "";
        if (this.modificationType != null) {
            str = "" + this.modificationType.toString();
        }
        String str2 = str + "_";
        if (this.colorModification != null) {
            str2 = str2 + this.colorModification.toString();
        }
        String str3 = str2 + "_";
        if (this.bitmapDecodingMethod != null) {
            str3 = str3 + this.bitmapDecodingMethod.toString();
        }
        String str4 = str3 + "_";
        EnumC2731d enumC2731d = this.backgroundReplacementType;
        if (enumC2731d != null && enumC2731d != EnumC2731d.DO_NOTHING) {
            str4 = str4 + this.backgroundReplacementType.toString() + String.valueOf(this.backgroundReplacementColor);
        }
        return str4 + "_" + String.valueOf(this.requiredWidth) + "_" + String.valueOf(this.requiredHeight);
    }

    public EnumC2737j getModificationType() {
        return this.modificationType;
    }

    public EnumC2735h getOnErrorReplacement() {
        return this.onErrorReplacement;
    }

    public Integer getReloadIcon() {
        return this.reloadIcon;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getRequiredHeight() {
        return this.requiredHeight;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getRequiredWidth() {
        return this.requiredWidth;
    }

    public float getRoundRatio() {
        return this.roundRatio;
    }

    public ImageView.ScaleType getScaleType() {
        if (this.mScaleType == null) {
            this.mScaleType = ImageView.ScaleType.FIT_CENTER;
        }
        return this.mScaleType;
    }

    public EnumC2733f getShowAnimationStyle() {
        return this.showAnimationStyle;
    }

    public EnumC2736i getWatermarkType() {
        return this.watermarkType;
    }

    public void setBackgroundReplacementColor(int i) {
        this.backgroundReplacementColor = i;
    }

    public void setBackgroundReplacementType(EnumC2731d enumC2731d) {
        this.backgroundReplacementType = enumC2731d;
    }

    public void setBitmapDecodingMethod(EnumC2729b enumC2729b) {
        this.bitmapDecodingMethod = enumC2729b;
    }

    public ImageLoadOptions setBorderToWidthRatio(float f) {
        this.borderToWidthRatio = f;
        return this;
    }

    public void setClearMemoryWhenShowingNewImage(boolean z) {
        this.clearMemoryWhenShowingNewImage = z;
    }

    public ImageLoadOptions setColorFilter(Integer num) {
        this.colorFilter = num;
        return this;
    }

    public ImageLoadOptions setColorModification(EnumC2728a enumC2728a) {
        this.colorModification = enumC2728a;
        return this;
    }

    public void setDelayMillisecondsBeforeDownload(long j) {
        this.delayMillisecondsBeforeDownload = j;
    }

    public ImageLoadOptions setErrorScaleType(ImageView.ScaleType scaleType) {
        this.mErrorScaleType = scaleType;
        return this;
    }

    public ImageLoadOptions setErrorStubResID(Integer num) {
        this.errorStubResID = num;
        return this;
    }

    public ImageLoadOptions setFileCacheSuffix(String str) {
        this.fileCacheSuffix = str;
        return this;
    }

    public ImageLoadOptions setFilterModification(EnumC2730c enumC2730c) {
        this.filterModification = enumC2730c;
        return this;
    }

    public void setImageLoadListener(InterfaceC2732e interfaceC2732e) {
        this.imageLoadListener = interfaceC2732e;
    }

    public ImageLoadOptions setInitialReplacementType(EnumC2734g enumC2734g) {
        this.initialReplacementType = enumC2734g;
        return this;
    }

    public ImageLoadOptions setInitialStubResID(Integer num) {
        this.initialStubResID = num;
        return this;
    }

    public ImageLoadOptions setModificationType(EnumC2737j enumC2737j) {
        this.modificationType = enumC2737j;
        return this;
    }

    public ImageLoadOptions setOnErrorReplacement(EnumC2735h enumC2735h) {
        this.onErrorReplacement = enumC2735h;
        return this;
    }

    public void setReloadIcon(Integer num) {
        this.reloadIcon = num;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRequiredHeight(int i) {
        this.requiredHeight = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRequiredWidth(int i) {
        this.requiredWidth = i;
    }

    public ImageLoadOptions setRoundRatio(float f) {
        this.roundRatio = f;
        return this;
    }

    public ImageLoadOptions setScaleType(ImageView.ScaleType scaleType) {
        this.mScaleType = scaleType;
        return this;
    }

    public void setShowAnimationStyle(EnumC2733f enumC2733f) {
        this.showAnimationStyle = enumC2733f;
    }

    public void setUseAnimationInShowFromCache(boolean z) {
        this.useAnimationInShowFromCache = z;
    }

    public void setWatermarkType(EnumC2736i enumC2736i) {
        this.watermarkType = enumC2736i;
    }

    public boolean shallClearMemoryWhenShowingNewImage() {
        return this.clearMemoryWhenShowingNewImage;
    }
}
