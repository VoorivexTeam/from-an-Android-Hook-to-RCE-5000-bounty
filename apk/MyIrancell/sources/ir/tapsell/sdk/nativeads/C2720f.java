package ir.tapsell.sdk.nativeads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ir.tapsell.sdk.models.responseModels.subModels.KeyValuePair;
import ir.tapsell.sdk.models.responseModels.subModels.NativeVideoCreativeModel;
import ir.tapsell.sdk.models.responseModels.subModels.VastTrackingData;
import ir.tapsell.sdk.nativeads.views.videoplayer.InterfaceC2725b;
import ir.tapsell.sdk.nativeads.views.videoplayer.InterfaceC2726c;
import ir.tapsell.sdk.nativeads.views.videoplayer.TapsellNativeVideoPlayer;
import ir.tapsell.sdk.nativeads.views.videoplayer.VideoContainer;
import ir.tapsell.sdk.utils.C2766h;
import java.util.Iterator;
import java.util.List;
import p000.k50;

/* renamed from: ir.tapsell.sdk.nativeads.f */
/* loaded from: classes.dex */
public class C2720f {

    /* renamed from: a */
    private TextView f11156a;

    /* renamed from: b */
    private ImageView f11157b;

    /* renamed from: c */
    private ImageView f11158c;

    /* renamed from: d */
    private ImageView f11159d;

    /* renamed from: e */
    private View f11160e;

    /* renamed from: f */
    private TapsellNativeVideoPlayer f11161f;

    /* renamed from: g */
    private C2721g f11162g;

    /* renamed from: h */
    private Context f11163h;

    /* renamed from: i */
    private int f11164i = Resources.getSystem().getDisplayMetrics().widthPixels;

    /* renamed from: j */
    private Drawable f11165j;

    /* renamed from: k */
    private Drawable f11166k;

    /* renamed from: l */
    private Drawable f11167l;

    /* renamed from: m */
    private Drawable f11168m;

    /* renamed from: n */
    private Drawable f11169n;

    /* renamed from: ir.tapsell.sdk.nativeads.f$a */
    /* loaded from: classes.dex */
    class a implements AudioManager.OnAudioFocusChangeListener {
        a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == -2 || i == -1) {
                C2720f.this.m13048b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.f$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2720f.this.m13041g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.f$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2720f c2720f;
            boolean z;
            if (C2720f.this.f11161f.isMuted()) {
                c2720f = C2720f.this;
                z = false;
            } else {
                c2720f = C2720f.this;
                z = true;
            }
            c2720f.m13026a(z);
        }
    }

    /* renamed from: ir.tapsell.sdk.nativeads.f$d */
    /* loaded from: classes.dex */
    class d implements InterfaceC2726c {

        /* renamed from: a */
        final /* synthetic */ TapsellNativeVideoAdProgressListener f11173a;

        d(TapsellNativeVideoAdProgressListener tapsellNativeVideoAdProgressListener) {
            this.f11173a = tapsellNativeVideoAdProgressListener;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.InterfaceC2726c
        /* renamed from: a */
        public void mo13053a(int i, int i2) {
            int m13043i = C2720f.this.m13043i();
            TapsellNativeVideoAdProgressListener tapsellNativeVideoAdProgressListener = this.f11173a;
            if (tapsellNativeVideoAdProgressListener != null) {
                tapsellNativeVideoAdProgressListener.onNativeAdProgress(C2720f.this.f11162g.getAdSuggestion().getSuggestionId().toString(), m13043i);
            }
            if (C2720f.this.f11161f.isPlaying()) {
                C2720f.this.f11162g.m13063a(m13043i);
                if (C2720f.this.f11162g.getAdSuggestion() == null || C2720f.this.f11162g.getAdSuggestion().getCreative() == 0 || ((NativeVideoCreativeModel) C2720f.this.f11162g.getAdSuggestion().getCreative()).getVastTrackingData() == null) {
                    return;
                }
                VastTrackingData vastTrackingData = ((NativeVideoCreativeModel) C2720f.this.f11162g.getAdSuggestion().getCreative()).getVastTrackingData();
                if (m13043i >= 0 && !vastTrackingData.isStartTrackerReported() && vastTrackingData.getStartTrackerUrls() != null && vastTrackingData.getStartTrackerUrls().size() > 0) {
                    C2720f.this.m13025a(vastTrackingData.getStartTrackerUrls());
                    ((NativeVideoCreativeModel) C2720f.this.f11162g.getAdSuggestion().getCreative()).getVastTrackingData().setStartTrackerReported(true);
                }
                if (m13043i >= 25 && !vastTrackingData.isFirstQuartileTrackerReported() && vastTrackingData.getFirstQuartileTrackerUrls() != null && vastTrackingData.getFirstQuartileTrackerUrls().size() > 0) {
                    C2720f.this.m13030b(vastTrackingData.getFirstQuartileTrackerUrls());
                    ((NativeVideoCreativeModel) C2720f.this.f11162g.getAdSuggestion().getCreative()).getVastTrackingData().setFirstQuartileTrackerReported(true);
                }
                if (m13043i >= 50 && !vastTrackingData.isMidpointTrackerReported() && vastTrackingData.getMidpointTrackerUrls() != null && vastTrackingData.getMidpointTrackerUrls().size() > 0) {
                    C2720f.this.m13036d(vastTrackingData.getMidpointTrackerUrls());
                    ((NativeVideoCreativeModel) C2720f.this.f11162g.getAdSuggestion().getCreative()).getVastTrackingData().setMidpointTrackerReported(true);
                }
                if (m13043i >= 75 && !vastTrackingData.isThirdQuartileTrackerReported() && vastTrackingData.getThirdQuartileTrackerUrls() != null && vastTrackingData.getThirdQuartileTrackerUrls().size() > 0) {
                    C2720f.this.m13033c(vastTrackingData.getThirdQuartileTrackerUrls());
                    ((NativeVideoCreativeModel) C2720f.this.f11162g.getAdSuggestion().getCreative()).getVastTrackingData().setThirdQuartileTrackerReported(true);
                }
                if (vastTrackingData.getProgressTrackingUrls() == null || vastTrackingData.getProgressTrackingUrls().size() <= 0) {
                    return;
                }
                Iterator<KeyValuePair<String, String>> it = vastTrackingData.getProgressTrackingUrls().iterator();
                while (it.hasNext()) {
                    KeyValuePair<String, String> next = it.next();
                    if (next != null && next.getFirst() != null) {
                        if (next.getFirst().matches("[0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{3}")) {
                            String[] split = next.getFirst().split("\\.");
                            String[] split2 = split[0].split(":");
                            int parseInt = Integer.parseInt(split[1]);
                            int parseInt2 = Integer.parseInt(split2[0]);
                            if (i > parseInt + (Integer.parseInt(split2[2]) * 1000) + (Integer.parseInt(split2[1]) * 60000) + (parseInt2 * 3600000)) {
                                C2720f.this.m13024a(next.getSecond());
                                it.remove();
                            }
                        } else if (next.getFirst().matches("[0-9]{2}:[0-9]{2}:[0-9]{2}")) {
                            String[] split3 = next.getFirst().split(":");
                            int parseInt3 = Integer.parseInt(split3[0]);
                            if (i > (Integer.parseInt(split3[2]) * 1000) + (Integer.parseInt(split3[1]) * 60000) + (parseInt3 * 3600000)) {
                                C2720f.this.m13024a(next.getSecond());
                                it.remove();
                            }
                        } else if (next.getFirst().matches("[0-9]+%") && m13043i >= Integer.parseInt(next.getFirst().replace("%", ""))) {
                            C2720f.this.m13024a(next.getSecond());
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ir.tapsell.sdk.nativeads.f$e */
    /* loaded from: classes.dex */
    class e implements InterfaceC2725b {

        /* renamed from: a */
        final /* synthetic */ TapsellNativeVideoAdCompletionListener f11175a;

        e(TapsellNativeVideoAdCompletionListener tapsellNativeVideoAdCompletionListener) {
            this.f11175a = tapsellNativeVideoAdCompletionListener;
        }

        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.InterfaceC2725b
        /* renamed from: a */
        public void mo13054a(TapsellNativeVideoPlayer tapsellNativeVideoPlayer) {
            C2720f.this.m13018a(g.PAUSED);
            C2720f.this.f11162g.m13065a(Integer.valueOf(tapsellNativeVideoPlayer.getDuration()));
        }

        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.InterfaceC2725b
        /* renamed from: a */
        public void mo13055a(TapsellNativeVideoPlayer tapsellNativeVideoPlayer, int i) {
        }

        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.InterfaceC2725b
        /* renamed from: a */
        public void mo13056a(TapsellNativeVideoPlayer tapsellNativeVideoPlayer, Exception exc) {
        }

        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.InterfaceC2725b
        /* renamed from: b */
        public void mo13057b(TapsellNativeVideoPlayer tapsellNativeVideoPlayer) {
            C2720f.this.m13018a(g.LOADING);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.InterfaceC2725b
        /* renamed from: c */
        public void mo13058c(TapsellNativeVideoPlayer tapsellNativeVideoPlayer) {
            if (tapsellNativeVideoPlayer.isPrepared()) {
                if (C2720f.this.m13050d()) {
                    C2720f.this.m13048b();
                    return;
                }
                C2720f.this.m13049c();
                if (C2720f.this.f11162g == null || C2720f.this.f11162g.getAdSuggestion() == null || C2720f.this.f11162g.getAdSuggestion().getCreative() == 0 || ((NativeVideoCreativeModel) C2720f.this.f11162g.getAdSuggestion().getCreative()).getVastTrackingData() == null) {
                    return;
                }
                VastTrackingData vastTrackingData = ((NativeVideoCreativeModel) C2720f.this.f11162g.getAdSuggestion().getCreative()).getVastTrackingData();
                if (vastTrackingData.getReplayTrackerUrls() == null || vastTrackingData.getReplayTrackerUrls().size() <= 0) {
                    return;
                }
                C2720f.this.m13040f(vastTrackingData.getReplayTrackerUrls());
            }
        }

        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.InterfaceC2725b
        /* renamed from: d */
        public void mo13059d(TapsellNativeVideoPlayer tapsellNativeVideoPlayer) {
            C2720f.this.m13018a(g.PAUSED);
        }

        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.InterfaceC2725b
        /* renamed from: e */
        public void mo13060e(TapsellNativeVideoPlayer tapsellNativeVideoPlayer) {
            if (!C2720f.this.f11162g.m13075e() || C2720f.this.f11162g.m13080h() == null || C2720f.this.f11162g.m13080h().intValue() <= 0 || C2720f.this.f11162g.m13081i() <= 90) {
                return;
            }
            C2720f.this.m13018a(g.REPLAY);
            C2720f.this.f11162g.m13069b(false);
            C2720f.this.f11162g.m13076f(true);
            C2720f.this.m13042h();
            TapsellNativeVideoAdCompletionListener tapsellNativeVideoAdCompletionListener = this.f11175a;
            if (tapsellNativeVideoAdCompletionListener != null) {
                tapsellNativeVideoAdCompletionListener.onAdShowFinished(C2720f.this.f11162g.getAdSuggestion().getSuggestionId().toString());
            }
        }

        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.InterfaceC2725b
        /* renamed from: f */
        public void mo13061f(TapsellNativeVideoPlayer tapsellNativeVideoPlayer) {
            if (tapsellNativeVideoPlayer.hasPlayer()) {
                C2720f.this.f11162g.m13065a(Integer.valueOf(tapsellNativeVideoPlayer.getDuration()));
                C2720f.this.m13018a(g.PLAYING);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.f$f */
    /* loaded from: classes.dex */
    public static /* synthetic */ class f {

        /* renamed from: a */
        static final /* synthetic */ int[] f11177a;

        static {
            int[] iArr = new int[g.values().length];
            f11177a = iArr;
            try {
                iArr[g.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11177a[g.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11177a[g.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11177a[g.REPLAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11177a[g.PLAYING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11177a[g.MUTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11177a[g.UNMUTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ir.tapsell.sdk.nativeads.f$g */
    /* loaded from: classes.dex */
    public enum g {
        LOADING,
        PAUSED,
        PLAYING,
        MUTED,
        UNMUTED,
        ERROR,
        REPLAY
    }

    public C2720f(Context context, C2721g c2721g, TapsellNativeVideoIconSet tapsellNativeVideoIconSet) {
        this.f11163h = context;
        this.f11162g = c2721g;
        TapsellNativeVideoBitmapDrawableSet tapsellNativeVideoBitmapDrawableSet = new TapsellNativeVideoBitmapDrawableSet(context, tapsellNativeVideoIconSet);
        this.f11169n = tapsellNativeVideoBitmapDrawableSet.getFullscreenBitmapDrawable() != null ? tapsellNativeVideoBitmapDrawableSet.getFullscreenBitmapDrawable() : C2766h.f11272f;
        this.f11165j = tapsellNativeVideoBitmapDrawableSet.getSoundOffBitmapDrawable() != null ? tapsellNativeVideoBitmapDrawableSet.getSoundOffBitmapDrawable() : C2766h.f11267a;
        this.f11166k = tapsellNativeVideoBitmapDrawableSet.getSoundOnBitmapDrawable() != null ? tapsellNativeVideoBitmapDrawableSet.getSoundOnBitmapDrawable() : C2766h.f11268b;
        this.f11167l = tapsellNativeVideoBitmapDrawableSet.getPlayBitmapDrawable() != null ? tapsellNativeVideoBitmapDrawableSet.getPlayBitmapDrawable() : C2766h.f11270d;
        this.f11168m = tapsellNativeVideoBitmapDrawableSet.getReplayBitmapDrawable() != null ? tapsellNativeVideoBitmapDrawableSet.getReplayBitmapDrawable() : C2766h.f11271e;
        if (tapsellNativeVideoBitmapDrawableSet.getSkipBitmapDrawable() != null) {
            tapsellNativeVideoBitmapDrawableSet.getSkipBitmapDrawable();
        } else {
            BitmapDrawable bitmapDrawable = C2766h.f11273g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r5.m13079g() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0084, code lost:
    
        r4.f11159d.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r5.m13079g() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r5.m13079g() != false) goto L34;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m13018a(ir.tapsell.sdk.nativeads.C2720f.g r5) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.tapsell.sdk.nativeads.C2720f.m13018a(ir.tapsell.sdk.nativeads.f$g):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m13024a(String str) {
        if (str != null) {
            k50.m13613a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m13025a(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.m13613a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m13026a(boolean z) {
        g gVar;
        if (this.f11161f != null) {
            this.f11162g.m13078g(z);
            if (z) {
                this.f11161f.muteVideo();
                gVar = g.MUTED;
            } else {
                this.f11161f.unMuteVideo();
                gVar = g.UNMUTED;
            }
            m13018a(gVar);
        }
    }

    /* renamed from: b */
    private void m13029b(VideoContainer videoContainer) {
        TextView textView = new TextView(this.f11163h);
        this.f11156a = textView;
        textView.setGravity(17);
        this.f11156a.setTextSize(12.0f);
        this.f11157b = new ImageView(this.f11163h);
        ImageView imageView = new ImageView(this.f11163h);
        this.f11158c = imageView;
        imageView.setImageDrawable(this.f11169n);
        this.f11158c.setOnClickListener(new b());
        ImageView imageView2 = new ImageView(this.f11163h);
        this.f11159d = imageView2;
        imageView2.setOnClickListener(new c());
        View view = new View(this.f11163h);
        this.f11160e = view;
        view.setBackgroundColor(Color.parseColor("#7F000000"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams4.gravity = 8388693;
        layoutParams3.gravity = 8388691;
        videoContainer.addView(this.f11161f, layoutParams);
        videoContainer.addView(this.f11160e, layoutParams);
        videoContainer.addView(this.f11156a, layoutParams);
        videoContainer.addView(this.f11157b, layoutParams2);
        videoContainer.addView(this.f11158c, layoutParams3);
        videoContainer.addView(this.f11159d, layoutParams4);
        this.f11158c.setVisibility(8);
        this.f11159d.setVisibility(8);
        this.f11161f.initPlayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m13030b(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.m13613a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m13033c(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.m13613a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m13036d(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.m13613a(list.get(i));
            }
        }
    }

    /* renamed from: e */
    private void m13039e(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.m13613a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m13040f(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.m13613a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m13041g() {
        C2721g c2721g;
        Context context;
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = this.f11161f;
        if (tapsellNativeVideoPlayer == null || (c2721g = this.f11162g) == null || (context = this.f11163h) == null) {
            return;
        }
        tapsellNativeVideoPlayer.fullscreenVideo(context, c2721g.getAdSuggestion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public void m13042h() {
        C2721g c2721g = this.f11162g;
        if (c2721g != null && c2721g.getAdSuggestion() != null && this.f11162g.getAdSuggestion().getCreative() != 0 && ((NativeVideoCreativeModel) this.f11162g.getAdSuggestion().getCreative()).getVastTrackingData() != null) {
            VastTrackingData vastTrackingData = ((NativeVideoCreativeModel) this.f11162g.getAdSuggestion().getCreative()).getVastTrackingData();
            if (!vastTrackingData.isCompleteTrackerReported() && vastTrackingData.getCompleteTrackerUrls() != null && vastTrackingData.getCompleteTrackerUrls().size() > 0) {
                m13039e(vastTrackingData.getCompleteTrackerUrls());
                ((NativeVideoCreativeModel) this.f11162g.getAdSuggestion().getCreative()).getVastTrackingData().setCompleteTrackerReported(true);
            }
        }
        C2721g c2721g2 = this.f11162g;
        if (c2721g2 == null || c2721g2.isDoneStateReported() || this.f11162g.getAdSuggestion() == null) {
            return;
        }
        this.f11162g.setDoneStateReported(true);
        if (this.f11162g.getAdSuggestion() != null) {
            this.f11162g.getAdSuggestion().reportAdIsDone(this.f11163h, this.f11162g.m13062a(), this.f11162g.getAdSuggestion().getSuggestionId().toString(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public int m13043i() {
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = this.f11161f;
        if (tapsellNativeVideoPlayer == null || !tapsellNativeVideoPlayer.isPrepared() || this.f11161f.getDuration() == 0) {
            return 0;
        }
        return (int) ((this.f11161f.getCurrentPosition() / this.f11161f.getDuration()) * 100.0f);
    }

    /* renamed from: a */
    public TapsellNativeVideoPlayer m13044a(VideoContainer videoContainer) {
        AudioManager audioManager;
        if (videoContainer == null) {
            return null;
        }
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = new TapsellNativeVideoPlayer(this.f11163h);
        this.f11161f = tapsellNativeVideoPlayer;
        tapsellNativeVideoPlayer.setOnAudioFocusChangeListener(new a());
        m13029b(videoContainer);
        m13018a(g.LOADING);
        if (this.f11162g.m13079g() && (audioManager = (AudioManager) this.f11163h.getSystemService("audio")) != null) {
            int ringerMode = audioManager.getRingerMode();
            if (ringerMode != 0 && ringerMode != 1) {
                if (ringerMode == 2) {
                    if (!this.f11162g.m13082j()) {
                        m13026a(false);
                    }
                }
            }
            m13026a(true);
        }
        return this.f11161f;
    }

    /* renamed from: a */
    public void m13045a(Uri uri) {
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = this.f11161f;
        if (tapsellNativeVideoPlayer != null) {
            tapsellNativeVideoPlayer.setSource(uri);
        }
    }

    /* renamed from: a */
    public void m13046a(TapsellNativeVideoAdCompletionListener tapsellNativeVideoAdCompletionListener, TapsellNativeVideoAdProgressListener tapsellNativeVideoAdProgressListener) {
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = this.f11161f;
        if (tapsellNativeVideoPlayer == null) {
            return;
        }
        tapsellNativeVideoPlayer.setProgressCallback(new d(tapsellNativeVideoAdProgressListener));
        this.f11161f.setCallback(new e(tapsellNativeVideoAdCompletionListener));
    }

    /* renamed from: a */
    public boolean m13047a() {
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = this.f11161f;
        return tapsellNativeVideoPlayer != null && tapsellNativeVideoPlayer.hasPlayer();
    }

    /* renamed from: b */
    public void m13048b() {
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = this.f11161f;
        if (tapsellNativeVideoPlayer != null) {
            tapsellNativeVideoPlayer.pause();
            C2721g c2721g = this.f11162g;
            if (c2721g != null) {
                c2721g.m13069b(true);
            }
        }
    }

    /* renamed from: c */
    public void m13049c() {
        C2721g c2721g = this.f11162g;
        if (c2721g != null && !c2721g.isDoingStateReported() && this.f11162g.getAdSuggestion() != null && this.f11162g.getAdSuggestion().getSuggestionId() != null) {
            this.f11162g.setDoingStateReported(true);
            this.f11162g.getAdSuggestion().reportAdIsDoing(this.f11163h, this.f11162g.m13062a(), this.f11162g.getAdSuggestion().getSuggestionId().toString());
        }
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = this.f11161f;
        if (tapsellNativeVideoPlayer != null) {
            C2721g c2721g2 = this.f11162g;
            if (c2721g2 != null) {
                tapsellNativeVideoPlayer.setAutoPlay(c2721g2.m13077f());
                if (this.f11162g.m13082j()) {
                    this.f11161f.muteVideo();
                    m13018a(g.MUTED);
                }
            }
            this.f11161f.start();
            if (!this.f11162g.m13075e()) {
                this.f11162g.m13070c(true);
            } else if (this.f11162g.m13073d()) {
                this.f11162g.m13069b(false);
            }
        }
    }

    /* renamed from: d */
    public boolean m13050d() {
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = this.f11161f;
        return tapsellNativeVideoPlayer != null && tapsellNativeVideoPlayer.isPlaying();
    }

    /* renamed from: e */
    public void m13051e() {
        this.f11161f.initPlayer();
    }

    /* renamed from: f */
    public boolean m13052f() {
        return this.f11161f.isPrepared();
    }
}
