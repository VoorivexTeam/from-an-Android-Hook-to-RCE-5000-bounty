package ir.tapsell.sdk;

/* loaded from: classes.dex */
public class TapsellShowOptions implements NoProguard {
    public static final int ROTATION_LOCKED_LANDSCAPE = 2;
    public static final int ROTATION_LOCKED_PORTRAIT = 1;
    public static final int ROTATION_LOCKED_REVERSED_LANDSCAPE = 4;
    public static final int ROTATION_LOCKED_REVERSED_PORTRAIT = 5;
    public static final int ROTATION_UNLOCKED = 3;
    private String backDisabledToastMessage;
    private String warnBackPressedDialogAssetTypefaceFileName;
    private Integer warnBackPressedDialogBackgroundResId;
    private String warnBackPressedDialogMessage;
    private Integer warnBackPressedDialogMessageTextColor;
    private Integer warnBackPressedDialogNegativeButtonBackgroundResId;
    private String warnBackPressedDialogNegativeButtonText;
    private Integer warnBackPressedDialogNegativeButtonTextColor;
    private Integer warnBackPressedDialogPositiveButtonBackgroundResId;
    private String warnBackPressedDialogPositiveButtonText;
    private Integer warnBackPressedDialogPositiveButtonTextColor;
    private int rotationMode = 3;
    private boolean immersiveMode = false;
    private boolean backDisabled = false;
    private boolean showDialog = false;

    public String getBackDisabledToastMessage() {
        return this.backDisabledToastMessage;
    }

    public int getRotationMode() {
        return this.rotationMode;
    }

    public String getWarnBackPressedDialogAssetTypefaceFileName() {
        return this.warnBackPressedDialogAssetTypefaceFileName;
    }

    public Integer getWarnBackPressedDialogBackgroundResId() {
        return this.warnBackPressedDialogBackgroundResId;
    }

    public String getWarnBackPressedDialogMessage() {
        return this.warnBackPressedDialogMessage;
    }

    public Integer getWarnBackPressedDialogMessageTextColor() {
        return this.warnBackPressedDialogMessageTextColor;
    }

    public Integer getWarnBackPressedDialogNegativeButtonBackgroundResId() {
        return this.warnBackPressedDialogNegativeButtonBackgroundResId;
    }

    public String getWarnBackPressedDialogNegativeButtonText() {
        return this.warnBackPressedDialogNegativeButtonText;
    }

    public Integer getWarnBackPressedDialogNegativeButtonTextColor() {
        return this.warnBackPressedDialogNegativeButtonTextColor;
    }

    public Integer getWarnBackPressedDialogPositiveButtonBackgroundResId() {
        return this.warnBackPressedDialogPositiveButtonBackgroundResId;
    }

    public String getWarnBackPressedDialogPositiveButtonText() {
        return this.warnBackPressedDialogPositiveButtonText;
    }

    public Integer getWarnBackPressedDialogPositiveButtonTextColor() {
        return this.warnBackPressedDialogPositiveButtonTextColor;
    }

    public boolean isBackDisabled() {
        return this.backDisabled;
    }

    public boolean isImmersiveMode() {
        return this.immersiveMode;
    }

    public boolean isShowDialog() {
        return this.showDialog;
    }

    public void setBackDisabled(boolean z) {
        this.backDisabled = z;
    }

    public void setBackDisabledToastMessage(String str) {
        this.backDisabledToastMessage = str;
    }

    public void setImmersiveMode(boolean z) {
        this.immersiveMode = z;
    }

    public void setRotationMode(int i) {
        this.rotationMode = i;
    }

    public void setShowDialog(boolean z) {
        this.showDialog = z;
    }

    public void setWarnBackPressedDialogAssetTypefaceFileName(String str) {
        this.warnBackPressedDialogAssetTypefaceFileName = str;
    }

    public void setWarnBackPressedDialogBackgroundResId(Integer num) {
        this.warnBackPressedDialogBackgroundResId = num;
    }

    public void setWarnBackPressedDialogMessage(String str) {
        this.warnBackPressedDialogMessage = str;
    }

    public void setWarnBackPressedDialogMessageTextColor(Integer num) {
        this.warnBackPressedDialogMessageTextColor = num;
    }

    public void setWarnBackPressedDialogNegativeButtonBackgroundResId(Integer num) {
        this.warnBackPressedDialogNegativeButtonBackgroundResId = num;
    }

    public void setWarnBackPressedDialogNegativeButtonText(String str) {
        this.warnBackPressedDialogNegativeButtonText = str;
    }

    public void setWarnBackPressedDialogNegativeButtonTextColor(Integer num) {
        this.warnBackPressedDialogNegativeButtonTextColor = num;
    }

    public void setWarnBackPressedDialogPositiveButtonBackgroundResId(Integer num) {
        this.warnBackPressedDialogPositiveButtonBackgroundResId = num;
    }

    public void setWarnBackPressedDialogPositiveButtonText(String str) {
        this.warnBackPressedDialogPositiveButtonText = str;
    }

    public void setWarnBackPressedDialogPositiveButtonTextColor(Integer num) {
        this.warnBackPressedDialogPositiveButtonTextColor = num;
    }
}
