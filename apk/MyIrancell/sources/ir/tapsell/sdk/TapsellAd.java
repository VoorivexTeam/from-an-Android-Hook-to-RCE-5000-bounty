package ir.tapsell.sdk;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import ir.tapsell.sdk.models.responseModels.DefaultErrorModel;
import ir.tapsell.sdk.models.responseModels.SuggestionListDirectResponseModel;
import ir.tapsell.sdk.networkcacheutils.C2751e;
import ir.tapsell.sdk.networkcacheutils.C2753g;
import ir.tapsell.sdk.utils.C2760b;
import ir.tapsell.sdk.utils.C2763e;
import java.io.File;
import java.io.Serializable;
import java.util.Calendar;
import p000.b70;
import p000.c70;
import p000.g50;
import p000.i50;
import p000.k50;
import p000.m50;
import p000.pa0;
import p000.v40;
import p000.z50;

/* loaded from: classes.dex */
public class TapsellAd implements NoProguard, Serializable {

    /* renamed from: ad */
    private b70 f10944ad = null;
    private String videoFilePath = null;
    private Long cacheTime = null;
    private String zoneId = null;
    private boolean isShown = false;
    private TapsellAdRequestOptions requestOptions = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAd$a */
    /* loaded from: classes.dex */
    public class RunnableC2648a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ TapsellShowOptions f10945b;

        /* renamed from: c */
        final /* synthetic */ Context f10946c;

        /* renamed from: d */
        final /* synthetic */ TapsellAdShowListener f10947d;

        /* renamed from: ir.tapsell.sdk.TapsellAd$a$a */
        /* loaded from: classes.dex */
        class a extends m50<SuggestionListDirectResponseModel, DefaultErrorModel> {

            /* renamed from: b */
            final /* synthetic */ ProgressDialog f10949b;

            /* renamed from: c */
            final /* synthetic */ TapsellShowOptions f10950c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: ir.tapsell.sdk.TapsellAd$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C3568a implements C2753g.b {

                /* renamed from: a */
                final /* synthetic */ b70 f10952a;

                C3568a(b70 b70Var) {
                    this.f10952a = b70Var;
                }

                @Override // ir.tapsell.sdk.networkcacheutils.C2753g.b
                /* renamed from: a */
                public void mo12857a(String str) {
                    a aVar = a.this;
                    TapsellAd.this.closeDialog(aVar.f10949b);
                    v40 m15925a = v40.m15925a();
                    RunnableC2648a runnableC2648a = RunnableC2648a.this;
                    m15925a.m15927a(runnableC2648a.f10946c, TapsellAd.this, false);
                    i50.m12368a("download failed: " + str);
                }

                @Override // ir.tapsell.sdk.networkcacheutils.C2753g.b
                /* renamed from: a */
                public void mo12858a(String str, File file) {
                    i50.m12368a("ad file downloaded");
                    TapsellAd.this.setAd(this.f10952a);
                    TapsellAd.this.setCacheTime(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
                    TapsellAd tapsellAd = TapsellAd.this;
                    tapsellAd.setZoneId(tapsellAd.zoneId);
                    TapsellAd tapsellAd2 = TapsellAd.this;
                    tapsellAd2.setRequestOptions(tapsellAd2.requestOptions);
                    TapsellAd.this.setVideoFilePath(file.getAbsolutePath());
                    C2671b m12861a = C2671b.m12861a();
                    RunnableC2648a runnableC2648a = RunnableC2648a.this;
                    m12861a.m12868b(runnableC2648a.f10946c, TapsellAd.this);
                    a aVar = a.this;
                    TapsellAd.this.closeDialog(aVar.f10949b);
                    C2686e.m12880a(TapsellAd.this.getZoneId());
                    a aVar2 = a.this;
                    RunnableC2648a runnableC2648a2 = RunnableC2648a.this;
                    TapsellAd.this.showAd(runnableC2648a2.f10946c, aVar2.f10950c, runnableC2648a2.f10947d);
                }
            }

            a(ProgressDialog progressDialog, TapsellShowOptions tapsellShowOptions) {
                this.f10949b = progressDialog;
                this.f10950c = tapsellShowOptions;
            }

            @Override // p000.m50
            /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo12854a(pa0<SuggestionListDirectResponseModel> pa0Var, DefaultErrorModel defaultErrorModel) {
                TapsellAd.this.closeDialog(this.f10949b);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.m50
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo12856b(pa0<SuggestionListDirectResponseModel> pa0Var, SuggestionListDirectResponseModel suggestionListDirectResponseModel) {
                String str;
                String str2;
                Context context = RunnableC2648a.this.f10946c;
                if (!(context instanceof Activity) || C2686e.m12881a((Activity) context)) {
                    if (suggestionListDirectResponseModel != null && suggestionListDirectResponseModel.getTapsellUserId() != null) {
                        C2688g.m12913j().m12919b(suggestionListDirectResponseModel.getTapsellUserId().toString());
                    }
                    if (suggestionListDirectResponseModel != null && suggestionListDirectResponseModel.getSelectDirectAdRandomly() != null && suggestionListDirectResponseModel.getSelectDirectAdRandomly().booleanValue()) {
                        C2760b.m13134a(suggestionListDirectResponseModel);
                    }
                    b70 m12875a = C2686e.m12875a(RunnableC2648a.this.f10946c, suggestionListDirectResponseModel);
                    if (m12875a == null) {
                        i50.m12368a("suitable ad not found! :(");
                        try {
                            this.f10949b.dismiss();
                        } catch (Throwable th) {
                            g50.m11895a(th);
                        }
                        v40 m15925a = v40.m15925a();
                        RunnableC2648a runnableC2648a = RunnableC2648a.this;
                        m15925a.m15927a(runnableC2648a.f10946c, TapsellAd.this, false);
                        C2687f.m12904b(TapsellAd.this);
                        C2671b.m12861a().m12864a(RunnableC2648a.this.f10946c.getApplicationContext(), TapsellAd.this);
                        return;
                    }
                    i50.m12368a("suitable ad found");
                    TapsellAd.this.setAd(m12875a);
                    RunnableC2648a runnableC2648a2 = RunnableC2648a.this;
                    m12875a.reportAdIsFilled(runnableC2648a2.f10946c, TapsellAd.this.zoneId, m12875a.getSuggestionId().toString());
                    if (m12875a.getCreative() == 0 || ((c70) m12875a.getCreative()).getCtaType() == null) {
                        str = "The ad creative is not supported";
                    } else {
                        String ctaUrl = ((c70) m12875a.getCreative()).getCtaUrl();
                        int intValue = ((c70) m12875a.getCreative()).getCtaType().intValue();
                        if (intValue != 1) {
                            if (intValue == 2) {
                                str2 = "Interstitial webview ad found.";
                                i50.m12368a(str2);
                                TapsellAd.this.setAd(m12875a);
                                TapsellAd.this.setCacheTime(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
                                TapsellAd tapsellAd = TapsellAd.this;
                                tapsellAd.setZoneId(tapsellAd.zoneId);
                                TapsellAd tapsellAd2 = TapsellAd.this;
                                tapsellAd2.setRequestOptions(tapsellAd2.requestOptions);
                                TapsellAd.this.setVideoFilePath(null);
                                C2671b m12861a = C2671b.m12861a();
                                RunnableC2648a runnableC2648a3 = RunnableC2648a.this;
                                m12861a.m12868b(runnableC2648a3.f10946c, TapsellAd.this);
                                TapsellAd.this.closeDialog(this.f10949b);
                                C2686e.m12880a(TapsellAd.this.getZoneId());
                                RunnableC2648a runnableC2648a4 = RunnableC2648a.this;
                                TapsellAd.this.showAd(runnableC2648a4.f10946c, this.f10950c, runnableC2648a4.f10947d);
                                return;
                            }
                            if (intValue != 3) {
                                TapsellAd.this.closeDialog(this.f10949b);
                                str = "The ad cta type" + String.valueOf(((c70) m12875a.getCreative()).getCtaType()) + " is not supported";
                            }
                        }
                        if (suggestionListDirectResponseModel != null && suggestionListDirectResponseModel.getServerSuggestedCacheType() == null) {
                            TapsellAd.this.closeDialog(this.f10949b);
                            str = "The server suggested cache type is null";
                        } else {
                            if (suggestionListDirectResponseModel != null && suggestionListDirectResponseModel.getServerSuggestedCacheType().intValue() == 1) {
                                i50.m12368a("downloading video of suitable ad");
                                String mo16135a = new z50().mo16135a(ctaUrl);
                                C2753g m13118a = C2753g.m13118a();
                                Context context2 = RunnableC2648a.this.f10946c;
                                m13118a.m13123a(context2, ctaUrl, C2751e.m13102a(context2), mo16135a, new C3568a(m12875a));
                                return;
                            }
                            if (suggestionListDirectResponseModel != null && suggestionListDirectResponseModel.getServerSuggestedCacheType().intValue() == 2) {
                                str2 = "suitable ad found, streamed no need to download";
                                i50.m12368a(str2);
                                TapsellAd.this.setAd(m12875a);
                                TapsellAd.this.setCacheTime(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
                                TapsellAd tapsellAd3 = TapsellAd.this;
                                tapsellAd3.setZoneId(tapsellAd3.zoneId);
                                TapsellAd tapsellAd22 = TapsellAd.this;
                                tapsellAd22.setRequestOptions(tapsellAd22.requestOptions);
                                TapsellAd.this.setVideoFilePath(null);
                                C2671b m12861a2 = C2671b.m12861a();
                                RunnableC2648a runnableC2648a32 = RunnableC2648a.this;
                                m12861a2.m12868b(runnableC2648a32.f10946c, TapsellAd.this);
                                TapsellAd.this.closeDialog(this.f10949b);
                                C2686e.m12880a(TapsellAd.this.getZoneId());
                                RunnableC2648a runnableC2648a42 = RunnableC2648a.this;
                                TapsellAd.this.showAd(runnableC2648a42.f10946c, this.f10950c, runnableC2648a42.f10947d);
                                return;
                            }
                            TapsellAd.this.closeDialog(this.f10949b);
                            str = "The server suggested cache type " + String.valueOf(suggestionListDirectResponseModel.getServerSuggestedCacheType()) + " ad is not supported";
                        }
                    }
                    i50.m12368a(str);
                }
            }

            @Override // p000.m50
            /* renamed from: a */
            public void mo12855a(pa0<SuggestionListDirectResponseModel> pa0Var, Throwable th) {
                TapsellAd.this.closeDialog(this.f10949b);
            }
        }

        RunnableC2648a(TapsellShowOptions tapsellShowOptions, Context context, TapsellAdShowListener tapsellAdShowListener) {
            this.f10945b = tapsellShowOptions;
            this.f10946c = context;
            this.f10947d = tapsellAdShowListener;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            String str;
            TapsellShowOptions tapsellShowOptions = this.f10945b;
            if (this.f10946c == null) {
                str = "Null context";
            } else if (TapsellAd.this.isShown) {
                str = "Ad is already shown.";
            } else if (!TapsellAd.this.isValid()) {
                str = "Ad is Expired/Invalid";
            } else {
                if (TapsellAd.this.f10944ad == null || (TapsellAd.this.f10944ad.getCreative() != 0 && ((c70) TapsellAd.this.f10944ad.getCreative()).isSupported())) {
                    if (tapsellShowOptions == null) {
                        tapsellShowOptions = new TapsellShowOptions();
                    }
                    TapsellAd.this.isShown = true;
                    if (TapsellAd.this.getAd() != null) {
                        C2686e.m12880a(TapsellAd.this.getZoneId());
                        TapsellAd.this.showAd(this.f10946c, tapsellShowOptions, this.f10947d);
                        return;
                    }
                    i50.m12368a("Show ad no/data");
                    C2671b.m12861a().m12864a(this.f10946c.getApplicationContext(), TapsellAd.this);
                    ProgressDialog progressDialog = new ProgressDialog(this.f10946c);
                    progressDialog.setMessage("لطفا صبر کنید...");
                    progressDialog.setCancelable(false);
                    progressDialog.setCanceledOnTouchOutside(false);
                    try {
                        progressDialog.show();
                    } catch (Throwable th) {
                        g50.m11895a(th);
                    }
                    TapsellAd.this.requestOptions = new TapsellAdRequestOptions(2);
                    k50.m13614a(TapsellAd.this.zoneId, TapsellAd.this.requestOptions.getCacheType(), new a(progressDialog, tapsellShowOptions));
                    return;
                }
                str = "This type of ad is not supported with this version of sdk";
            }
            i50.m12368a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAd$b */
    /* loaded from: classes.dex */
    public class RunnableC2649b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ProgressDialog f10954b;

        RunnableC2649b(TapsellAd tapsellAd, ProgressDialog progressDialog) {
            this.f10954b = progressDialog;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10954b.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAd$c */
    /* loaded from: classes.dex */
    public class RunnableC2650c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Context f10955b;

        /* renamed from: c */
        final /* synthetic */ Intent f10956c;

        RunnableC2650c(TapsellAd tapsellAd, Context context, Intent intent) {
            this.f10955b = context;
            this.f10956c = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10955b.startActivity(this.f10956c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAd$d */
    /* loaded from: classes.dex */
    public class RunnableC2651d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Intent f10957b;

        /* renamed from: c */
        final /* synthetic */ Context f10958c;

        RunnableC2651d(TapsellAd tapsellAd, Intent intent, Context context) {
            this.f10957b = intent;
            this.f10958c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10957b.setFlags(268435456);
            this.f10958c.startActivity(this.f10957b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeDialog(ProgressDialog progressDialog) {
        try {
            new Handler(Looper.getMainLooper()).post(new RunnableC2649b(this, progressDialog));
        } catch (Throwable th) {
            g50.m11895a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void showAd(Context context, TapsellShowOptions tapsellShowOptions, TapsellAdShowListener tapsellAdShowListener) {
        Handler handler;
        Runnable runnableC2651d;
        String str;
        if (context == null) {
            str = "Null context";
        } else if (isValid()) {
            b70 b70Var = this.f10944ad;
            if (b70Var == null || (b70Var.getCreative() != 0 && ((c70) this.f10944ad.getCreative()).isSupported())) {
                if (getAd() != null) {
                    getAd().reportAdIsDoing(context, this.zoneId, getAd().getSuggestionId().toString());
                }
                v40.m15925a().m15930a(getZoneId());
                v40.m15925a().m15933a(getId(), tapsellAdShowListener);
                i50.m12368a("Showing Ad");
                C2671b.m12861a().m12864a(context.getApplicationContext(), this);
                v40.m15925a().m15928a(this);
                Intent intent = new Intent(context, (Class<?>) TapsellAdActivity.class);
                intent.putExtra(TapsellAdActivity.ROTATION_MODE, tapsellShowOptions.getRotationMode());
                intent.putExtra(TapsellAdActivity.IMMERSIVE_MODE, tapsellShowOptions.isImmersiveMode());
                intent.putExtra(TapsellAdActivity.BACK_DISABLED, tapsellShowOptions.isBackDisabled());
                intent.putExtra(TapsellAdActivity.SHOW_DIALOG, tapsellShowOptions.isShowDialog());
                if (tapsellShowOptions.getWarnBackPressedDialogMessage() != null) {
                    intent.putExtra(TapsellAdActivity.BACK_DIAlOG_MESSAGE, tapsellShowOptions.getWarnBackPressedDialogMessage());
                }
                if (tapsellShowOptions.getWarnBackPressedDialogMessageTextColor() != null) {
                    intent.putExtra(TapsellAdActivity.BACK_DIAlOG_MESSAGE_TEXT_COLOR, tapsellShowOptions.getWarnBackPressedDialogMessageTextColor());
                }
                if (tapsellShowOptions.getWarnBackPressedDialogPositiveButtonText() != null) {
                    intent.putExtra(TapsellAdActivity.BACK_DIAlOG_BTN_POSITIVE_TEXT, tapsellShowOptions.getWarnBackPressedDialogPositiveButtonText());
                }
                if (tapsellShowOptions.getWarnBackPressedDialogNegativeButtonText() != null) {
                    intent.putExtra(TapsellAdActivity.BACK_DIAlOG_BTN_NEGATIVE_TEXT, tapsellShowOptions.getWarnBackPressedDialogNegativeButtonText());
                }
                if (tapsellShowOptions.getWarnBackPressedDialogAssetTypefaceFileName() != null) {
                    intent.putExtra(TapsellAdActivity.BACK_DIAlOG_TYPEFACE_PATH, tapsellShowOptions.getWarnBackPressedDialogAssetTypefaceFileName());
                }
                if (tapsellShowOptions.getWarnBackPressedDialogPositiveButtonBackgroundResId() != null) {
                    intent.putExtra(TapsellAdActivity.BACK_DIAlOG_BTN_POSITIVE_BACKGROUND_RES_ID, tapsellShowOptions.getWarnBackPressedDialogPositiveButtonBackgroundResId());
                }
                if (tapsellShowOptions.getWarnBackPressedDialogNegativeButtonBackgroundResId() != null) {
                    intent.putExtra(TapsellAdActivity.BACK_DIAlOG_BTN_NEGATIVE_BACKGROUND_RES_ID, tapsellShowOptions.getWarnBackPressedDialogNegativeButtonBackgroundResId());
                }
                if (tapsellShowOptions.getWarnBackPressedDialogPositiveButtonTextColor() != null) {
                    intent.putExtra(TapsellAdActivity.BACK_DIAlOG_BTN_POSITIVE_TEXT_COLOR, tapsellShowOptions.getWarnBackPressedDialogPositiveButtonTextColor());
                }
                if (tapsellShowOptions.getWarnBackPressedDialogNegativeButtonTextColor() != null) {
                    intent.putExtra(TapsellAdActivity.BACK_DIAlOG_BTN_NEGATIVE_TEXT_COLOR, tapsellShowOptions.getWarnBackPressedDialogNegativeButtonTextColor());
                }
                if (tapsellShowOptions.getWarnBackPressedDialogBackgroundResId() != null) {
                    intent.putExtra(TapsellAdActivity.BACK_DIAlOG_BACKGROUND_RES_ID, tapsellShowOptions.getWarnBackPressedDialogBackgroundResId());
                }
                if (tapsellShowOptions.getBackDisabledToastMessage() != null) {
                    intent.putExtra(TapsellAdActivity.BACK_DISABLED_TOAST_MESSAGE, tapsellShowOptions.getBackDisabledToastMessage());
                }
                intent.putExtra(TapsellAdActivity.EXTRA_DATA, this);
                if (context instanceof Activity) {
                    handler = new Handler(Looper.getMainLooper());
                    runnableC2651d = new RunnableC2650c(this, context, intent);
                } else {
                    handler = new Handler(Looper.getMainLooper());
                    runnableC2651d = new RunnableC2651d(this, intent, context);
                }
                handler.post(runnableC2651d);
                return;
            }
            str = "This type of ad is not supported with this version of sdk";
        } else {
            str = "Ad is Expired/Invalid";
        }
        i50.m12368a(str);
    }

    public b70 getAd() {
        return this.f10944ad;
    }

    public Long getCacheTime() {
        return this.cacheTime;
    }

    public String getId() {
        String str;
        if (getAd() != null) {
            if (getAd().getSuggestionId() == null) {
                return null;
            }
            return getAd().getSuggestionId().toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("3353_fkad");
        if (this.zoneId == null) {
            str = "";
        } else {
            str = "_" + this.zoneId;
        }
        sb.append(str);
        return sb.toString();
    }

    public TapsellAdRequestOptions getRequestOptions() {
        return this.requestOptions;
    }

    public String getVideoFilePath() {
        return this.videoFilePath;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isBannerAd() {
        b70 b70Var = this.f10944ad;
        return (b70Var == null || b70Var.getCreative() == 0 || ((c70) this.f10944ad.getCreative()).getCtaType() == null || ((c70) this.f10944ad.getCreative()).getCtaType().intValue() != 2) ? false : true;
    }

    public boolean isExpired() {
        Long l;
        b70 b70Var = this.f10944ad;
        return b70Var == null || (b70Var.getExpirationTimeInMillis() != null && ((l = this.cacheTime) == null || l.longValue() + this.f10944ad.getExpirationTimeInMillis().longValue() < Calendar.getInstance().getTimeInMillis()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isFileRemoved() {
        b70 b70Var = this.f10944ad;
        return b70Var != null && b70Var.getCreative() != 0 && ((c70) this.f10944ad.getCreative()).isSupported() && (((c70) this.f10944ad.getCreative()).getCtaType().intValue() == 3 || ((c70) this.f10944ad.getCreative()).getCtaType().intValue() == 1) && (this.videoFilePath == null || !new File(this.videoFilePath).exists());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isRewardedAd() {
        b70 b70Var = this.f10944ad;
        return (b70Var == null || b70Var.getCreative() == 0 || ((c70) this.f10944ad.getCreative()).getCtaType() == null || ((c70) this.f10944ad.getCreative()).getCtaType().intValue() != 1) ? false : true;
    }

    public boolean isShown() {
        return this.isShown;
    }

    public boolean isValid() {
        if (!isVideoAd()) {
            return isBannerAd() ? !isExpired() : getAd() == null;
        }
        if (getRequestOptions() == null) {
            return false;
        }
        if (getRequestOptions().getCacheType() == 1) {
            return (isExpired() || isFileRemoved()) ? false : true;
        }
        if (getRequestOptions().getCacheType() == 2) {
            return !isExpired();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isVideoAd() {
        b70 b70Var = this.f10944ad;
        return (b70Var == null || b70Var.getCreative() == 0 || ((c70) this.f10944ad.getCreative()).getCtaType() == null || (((c70) this.f10944ad.getCreative()).getCtaType().intValue() != 1 && ((c70) this.f10944ad.getCreative()).getCtaType().intValue() != 3)) ? false : true;
    }

    public void setAd(b70 b70Var) {
        this.f10944ad = b70Var;
    }

    public void setCacheTime(Long l) {
        this.cacheTime = l;
    }

    public void setRequestOptions(TapsellAdRequestOptions tapsellAdRequestOptions) {
        this.requestOptions = tapsellAdRequestOptions;
    }

    public void setShown(boolean z) {
        this.isShown = z;
    }

    public void setVideoFilePath(String str) {
        this.videoFilePath = str;
    }

    public void setZoneId(String str) {
        this.zoneId = str;
    }

    public void show(Context context, TapsellShowOptions tapsellShowOptions) {
        show(context, tapsellShowOptions, null);
    }

    public void show(Context context, TapsellShowOptions tapsellShowOptions, TapsellAdShowListener tapsellAdShowListener) {
        C2763e.m13143a(new RunnableC2648a(tapsellShowOptions, context, tapsellAdShowListener));
    }
}
