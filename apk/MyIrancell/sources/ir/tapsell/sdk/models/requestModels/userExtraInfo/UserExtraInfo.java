package ir.tapsell.sdk.models.requestModels.userExtraInfo;

import ir.tapsell.sdk.NoProguard;

/* loaded from: classes.dex */
public class UserExtraInfo implements NoProguard {
    private AdInfo adInfo;
    private String androidId;
    private int appVersionCode;
    private String appVersionName;
    private String carrier;
    private String customerUserId;
    private boolean dataAvailability;
    private String deviceBrand;
    private String deviceLanguage;
    private String deviceManufacturer;
    private String deviceModel;
    private String imei;
    private int networkType;
    private boolean npa;

    /* renamed from: os */
    private String f11058os;
    private float screenDensity;
    private int screenHeight;
    private int screenOrientation;
    private int screenRealTimeOrientation;
    private int screenWidth;
    private String userId;

    public AdInfo getAdInfo() {
        return this.adInfo;
    }

    public String getAndroidId() {
        String str = this.androidId;
        return str == null ? "" : str;
    }

    public int getAppVersionCode() {
        return this.appVersionCode;
    }

    public String getAppVersionName() {
        String str = this.appVersionName;
        return str == null ? "" : str;
    }

    public String getCarrier() {
        String str = this.carrier;
        return str == null ? "" : str;
    }

    public String getCustomerUserId() {
        String str = this.customerUserId;
        return str == null ? "" : str;
    }

    public boolean getDataAvailability() {
        return this.dataAvailability;
    }

    public String getDeviceBrand() {
        String str = this.deviceBrand;
        return str == null ? "" : str;
    }

    public String getDeviceLanguage() {
        String str = this.deviceLanguage;
        return str == null ? "" : str;
    }

    public String getDeviceManufacturer() {
        String str = this.deviceManufacturer;
        return str == null ? "" : str;
    }

    public String getDeviceModel() {
        String str = this.deviceModel;
        return str == null ? "" : str;
    }

    public String getImei() {
        String str = this.imei;
        return str == null ? "" : str;
    }

    public int getNetworkType() {
        return this.networkType;
    }

    public boolean getNpa() {
        return this.npa;
    }

    public String getOs() {
        String str = this.f11058os;
        return str == null ? "" : str;
    }

    public float getScreenDensity() {
        return this.screenDensity;
    }

    public int getScreenHeight() {
        return this.screenHeight;
    }

    public int getScreenOrientation() {
        return this.screenOrientation;
    }

    public int getScreenRealTimeOrientation() {
        return this.screenRealTimeOrientation;
    }

    public int getScreenWidth() {
        return this.screenWidth;
    }

    public String getUserId() {
        String str = this.userId;
        return str == null ? "" : str;
    }

    public void setAdInfo(AdInfo adInfo) {
        this.adInfo = adInfo;
    }

    public void setAndroidId(String str) {
        this.androidId = str;
    }

    public void setAppVersionCode(int i) {
        this.appVersionCode = i;
    }

    public void setAppVersionName(String str) {
        this.appVersionName = str;
    }

    public void setCarrier(String str) {
        this.carrier = str;
    }

    public void setCustomerUserId(String str) {
        this.customerUserId = str;
    }

    public void setDataAvailability(boolean z) {
        this.dataAvailability = z;
    }

    public void setDeviceBrand(String str) {
        this.deviceBrand = str;
    }

    public void setDeviceLanguage(String str) {
        this.deviceLanguage = str;
    }

    public void setDeviceManufacturer(String str) {
        this.deviceManufacturer = str;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setImei(String str) {
        this.imei = str;
    }

    public void setNetworkType(int i) {
        this.networkType = i;
    }

    public void setNpa(boolean z) {
        this.npa = z;
    }

    public void setOs(String str) {
        this.f11058os = str;
    }

    public void setScreenDensity(float f) {
        this.screenDensity = f;
    }

    public void setScreenHeight(int i) {
        this.screenHeight = i;
    }

    public void setScreenOrientation(int i) {
        this.screenOrientation = i;
    }

    public void setScreenRealTimeOrientation(int i) {
        this.screenRealTimeOrientation = i;
    }

    public void setScreenWidth(int i) {
        this.screenWidth = i;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
