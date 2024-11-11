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
import defpackage.k50;
import ir.tapsell.sdk.models.responseModels.subModels.KeyValuePair;
import ir.tapsell.sdk.models.responseModels.subModels.NativeVideoCreativeModel;
import ir.tapsell.sdk.models.responseModels.subModels.VastTrackingData;
import ir.tapsell.sdk.nativeads.views.videoplayer.TapsellNativeVideoPlayer;
import ir.tapsell.sdk.nativeads.views.videoplayer.VideoContainer;
import ir.tapsell.sdk.utils.h;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f {
    private TextView a;
    private ImageView b;
    private ImageView c;
    private ImageView d;
    private View e;
    private TapsellNativeVideoPlayer f;
    private ir.tapsell.sdk.nativeads.g g;
    private Context h;
    private int i = Resources.getSystem().getDisplayMetrics().widthPixels;
    private Drawable j;
    private Drawable k;
    private Drawable l;
    private Drawable m;
    private Drawable n;

    /* loaded from: classes.dex */
    class a implements AudioManager.OnAudioFocusChangeListener {
        a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == -2 || i == -1) {
                f.this.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f fVar;
            boolean z;
            if (f.this.f.isMuted()) {
                fVar = f.this;
                z = false;
            } else {
                fVar = f.this;
                z = true;
            }
            fVar.a(z);
        }
    }

    /* loaded from: classes.dex */
    class d implements ir.tapsell.sdk.nativeads.views.videoplayer.c {
        final /* synthetic */ TapsellNativeVideoAdProgressListener a;

        d(TapsellNativeVideoAdProgressListener tapsellNativeVideoAdProgressListener) {
            this.a = tapsellNativeVideoAdProgressListener;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.c
        public void a(int i, int i2) {
            int i3 = f.this.i();
            TapsellNativeVideoAdProgressListener tapsellNativeVideoAdProgressListener = this.a;
            if (tapsellNativeVideoAdProgressListener != null) {
                tapsellNativeVideoAdProgressListener.onNativeAdProgress(f.this.g.getAdSuggestion().getSuggestionId().toString(), i3);
            }
            if (f.this.f.isPlaying()) {
                f.this.g.a(i3);
                if (f.this.g.getAdSuggestion() == null || f.this.g.getAdSuggestion().getCreative() == 0 || ((NativeVideoCreativeModel) f.this.g.getAdSuggestion().getCreative()).getVastTrackingData() == null) {
                    return;
                }
                VastTrackingData vastTrackingData = ((NativeVideoCreativeModel) f.this.g.getAdSuggestion().getCreative()).getVastTrackingData();
                if (i3 >= 0 && !vastTrackingData.isStartTrackerReported() && vastTrackingData.getStartTrackerUrls() != null && vastTrackingData.getStartTrackerUrls().size() > 0) {
                    f.this.a(vastTrackingData.getStartTrackerUrls());
                    ((NativeVideoCreativeModel) f.this.g.getAdSuggestion().getCreative()).getVastTrackingData().setStartTrackerReported(true);
                }
                if (i3 >= 25 && !vastTrackingData.isFirstQuartileTrackerReported() && vastTrackingData.getFirstQuartileTrackerUrls() != null && vastTrackingData.getFirstQuartileTrackerUrls().size() > 0) {
                    f.this.b(vastTrackingData.getFirstQuartileTrackerUrls());
                    ((NativeVideoCreativeModel) f.this.g.getAdSuggestion().getCreative()).getVastTrackingData().setFirstQuartileTrackerReported(true);
                }
                if (i3 >= 50 && !vastTrackingData.isMidpointTrackerReported() && vastTrackingData.getMidpointTrackerUrls() != null && vastTrackingData.getMidpointTrackerUrls().size() > 0) {
                    f.this.d(vastTrackingData.getMidpointTrackerUrls());
                    ((NativeVideoCreativeModel) f.this.g.getAdSuggestion().getCreative()).getVastTrackingData().setMidpointTrackerReported(true);
                }
                if (i3 >= 75 && !vastTrackingData.isThirdQuartileTrackerReported() && vastTrackingData.getThirdQuartileTrackerUrls() != null && vastTrackingData.getThirdQuartileTrackerUrls().size() > 0) {
                    f.this.c(vastTrackingData.getThirdQuartileTrackerUrls());
                    ((NativeVideoCreativeModel) f.this.g.getAdSuggestion().getCreative()).getVastTrackingData().setThirdQuartileTrackerReported(true);
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
                                f.this.a(next.getSecond());
                                it.remove();
                            }
                        } else if (next.getFirst().matches("[0-9]{2}:[0-9]{2}:[0-9]{2}")) {
                            String[] split3 = next.getFirst().split(":");
                            int parseInt3 = Integer.parseInt(split3[0]);
                            if (i > (Integer.parseInt(split3[2]) * 1000) + (Integer.parseInt(split3[1]) * 60000) + (parseInt3 * 3600000)) {
                                f.this.a(next.getSecond());
                                it.remove();
                            }
                        } else if (next.getFirst().matches("[0-9]+%") && i3 >= Integer.parseInt(next.getFirst().replace("%", ""))) {
                            f.this.a(next.getSecond());
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements ir.tapsell.sdk.nativeads.views.videoplayer.b {
        final /* synthetic */ TapsellNativeVideoAdCompletionListener a;

        e(TapsellNativeVideoAdCompletionListener tapsellNativeVideoAdCompletionListener) {
            this.a = tapsellNativeVideoAdCompletionListener;
        }

        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.b
        public void a(TapsellNativeVideoPlayer tapsellNativeVideoPlayer) {
            f.this.a(g.PAUSED);
            f.this.g.a(Integer.valueOf(tapsellNativeVideoPlayer.getDuration()));
        }

        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.b
        public void a(TapsellNativeVideoPlayer tapsellNativeVideoPlayer, int i) {
        }

        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.b
        public void a(TapsellNativeVideoPlayer tapsellNativeVideoPlayer, Exception exc) {
        }

        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.b
        public void b(TapsellNativeVideoPlayer tapsellNativeVideoPlayer) {
            f.this.a(g.LOADING);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.b
        public void c(TapsellNativeVideoPlayer tapsellNativeVideoPlayer) {
            if (tapsellNativeVideoPlayer.isPrepared()) {
                if (f.this.d()) {
                    f.this.b();
                    return;
                }
                f.this.c();
                if (f.this.g == null || f.this.g.getAdSuggestion() == null || f.this.g.getAdSuggestion().getCreative() == 0 || ((NativeVideoCreativeModel) f.this.g.getAdSuggestion().getCreative()).getVastTrackingData() == null) {
                    return;
                }
                VastTrackingData vastTrackingData = ((NativeVideoCreativeModel) f.this.g.getAdSuggestion().getCreative()).getVastTrackingData();
                if (vastTrackingData.getReplayTrackerUrls() == null || vastTrackingData.getReplayTrackerUrls().size() <= 0) {
                    return;
                }
                f.this.f(vastTrackingData.getReplayTrackerUrls());
            }
        }

        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.b
        public void d(TapsellNativeVideoPlayer tapsellNativeVideoPlayer) {
            f.this.a(g.PAUSED);
        }

        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.b
        public void e(TapsellNativeVideoPlayer tapsellNativeVideoPlayer) {
            if (!f.this.g.e() || f.this.g.h() == null || f.this.g.h().intValue() <= 0 || f.this.g.i() <= 90) {
                return;
            }
            f.this.a(g.REPLAY);
            f.this.g.b(false);
            f.this.g.f(true);
            f.this.h();
            TapsellNativeVideoAdCompletionListener tapsellNativeVideoAdCompletionListener = this.a;
            if (tapsellNativeVideoAdCompletionListener != null) {
                tapsellNativeVideoAdCompletionListener.onAdShowFinished(f.this.g.getAdSuggestion().getSuggestionId().toString());
            }
        }

        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.b
        public void f(TapsellNativeVideoPlayer tapsellNativeVideoPlayer) {
            if (tapsellNativeVideoPlayer.hasPlayer()) {
                f.this.g.a(Integer.valueOf(tapsellNativeVideoPlayer.getDuration()));
                f.this.a(g.PLAYING);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.f$f, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0070f {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.values().length];
            a = iArr;
            try {
                iArr[g.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[g.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[g.REPLAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[g.PLAYING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[g.MUTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[g.UNMUTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    public f(Context context, ir.tapsell.sdk.nativeads.g gVar, TapsellNativeVideoIconSet tapsellNativeVideoIconSet) {
        this.h = context;
        this.g = gVar;
        TapsellNativeVideoBitmapDrawableSet tapsellNativeVideoBitmapDrawableSet = new TapsellNativeVideoBitmapDrawableSet(context, tapsellNativeVideoIconSet);
        this.n = tapsellNativeVideoBitmapDrawableSet.getFullscreenBitmapDrawable() != null ? tapsellNativeVideoBitmapDrawableSet.getFullscreenBitmapDrawable() : h.f;
        this.j = tapsellNativeVideoBitmapDrawableSet.getSoundOffBitmapDrawable() != null ? tapsellNativeVideoBitmapDrawableSet.getSoundOffBitmapDrawable() : h.a;
        this.k = tapsellNativeVideoBitmapDrawableSet.getSoundOnBitmapDrawable() != null ? tapsellNativeVideoBitmapDrawableSet.getSoundOnBitmapDrawable() : h.b;
        this.l = tapsellNativeVideoBitmapDrawableSet.getPlayBitmapDrawable() != null ? tapsellNativeVideoBitmapDrawableSet.getPlayBitmapDrawable() : h.d;
        this.m = tapsellNativeVideoBitmapDrawableSet.getReplayBitmapDrawable() != null ? tapsellNativeVideoBitmapDrawableSet.getReplayBitmapDrawable() : h.e;
        if (tapsellNativeVideoBitmapDrawableSet.getSkipBitmapDrawable() != null) {
            tapsellNativeVideoBitmapDrawableSet.getSkipBitmapDrawable();
        } else {
            BitmapDrawable bitmapDrawable = h.g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r5.g() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0084, code lost:
    
        r4.d.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r5.g() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r5.g() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(ir.tapsell.sdk.nativeads.f.g r5) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.tapsell.sdk.nativeads.f.a(ir.tapsell.sdk.nativeads.f$g):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (str != null) {
            k50.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        g gVar;
        if (this.f != null) {
            this.g.g(z);
            if (z) {
                this.f.muteVideo();
                gVar = g.MUTED;
            } else {
                this.f.unMuteVideo();
                gVar = g.UNMUTED;
            }
            a(gVar);
        }
    }

    private void b(VideoContainer videoContainer) {
        TextView textView = new TextView(this.h);
        this.a = textView;
        textView.setGravity(17);
        this.a.setTextSize(12.0f);
        this.b = new ImageView(this.h);
        ImageView imageView = new ImageView(this.h);
        this.c = imageView;
        imageView.setImageDrawable(this.n);
        this.c.setOnClickListener(new b());
        ImageView imageView2 = new ImageView(this.h);
        this.d = imageView2;
        imageView2.setOnClickListener(new c());
        View view = new View(this.h);
        this.e = view;
        view.setBackgroundColor(Color.parseColor("#7F000000"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams4.gravity = 8388693;
        layoutParams3.gravity = 8388691;
        videoContainer.addView(this.f, layoutParams);
        videoContainer.addView(this.e, layoutParams);
        videoContainer.addView(this.a, layoutParams);
        videoContainer.addView(this.b, layoutParams2);
        videoContainer.addView(this.c, layoutParams3);
        videoContainer.addView(this.d, layoutParams4);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.f.initPlayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.a(list.get(i));
            }
        }
    }

    private void e(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ir.tapsell.sdk.nativeads.g gVar;
        Context context;
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = this.f;
        if (tapsellNativeVideoPlayer == null || (gVar = this.g) == null || (context = this.h) == null) {
            return;
        }
        tapsellNativeVideoPlayer.fullscreenVideo(context, gVar.getAdSuggestion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void h() {
        ir.tapsell.sdk.nativeads.g gVar = this.g;
        if (gVar != null && gVar.getAdSuggestion() != null && this.g.getAdSuggestion().getCreative() != 0 && ((NativeVideoCreativeModel) this.g.getAdSuggestion().getCreative()).getVastTrackingData() != null) {
            VastTrackingData vastTrackingData = ((NativeVideoCreativeModel) this.g.getAdSuggestion().getCreative()).getVastTrackingData();
            if (!vastTrackingData.isCompleteTrackerReported() && vastTrackingData.getCompleteTrackerUrls() != null && vastTrackingData.getCompleteTrackerUrls().size() > 0) {
                e(vastTrackingData.getCompleteTrackerUrls());
                ((NativeVideoCreativeModel) this.g.getAdSuggestion().getCreative()).getVastTrackingData().setCompleteTrackerReported(true);
            }
        }
        ir.tapsell.sdk.nativeads.g gVar2 = this.g;
        if (gVar2 == null || gVar2.isDoneStateReported() || this.g.getAdSuggestion() == null) {
            return;
        }
        this.g.setDoneStateReported(true);
        if (this.g.getAdSuggestion() != null) {
            this.g.getAdSuggestion().reportAdIsDone(this.h, this.g.a(), this.g.getAdSuggestion().getSuggestionId().toString(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i() {
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = this.f;
        if (tapsellNativeVideoPlayer == null || !tapsellNativeVideoPlayer.isPrepared() || this.f.getDuration() == 0) {
            return 0;
        }
        return (int) ((this.f.getCurrentPosition() / this.f.getDuration()) * 100.0f);
    }

    public TapsellNativeVideoPlayer a(VideoContainer videoContainer) {
        AudioManager audioManager;
        if (videoContainer == null) {
            return null;
        }
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = new TapsellNativeVideoPlayer(this.h);
        this.f = tapsellNativeVideoPlayer;
        tapsellNativeVideoPlayer.setOnAudioFocusChangeListener(new a());
        b(videoContainer);
        a(g.LOADING);
        if (this.g.g() && (audioManager = (AudioManager) this.h.getSystemService("audio")) != null) {
            int ringerMode = audioManager.getRingerMode();
            if (ringerMode != 0 && ringerMode != 1) {
                if (ringerMode == 2) {
                    if (!this.g.j()) {
                        a(false);
                    }
                }
            }
            a(true);
        }
        return this.f;
    }

    public void a(Uri uri) {
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = this.f;
        if (tapsellNativeVideoPlayer != null) {
            tapsellNativeVideoPlayer.setSource(uri);
        }
    }

    public void a(TapsellNativeVideoAdCompletionListener tapsellNativeVideoAdCompletionListener, TapsellNativeVideoAdProgressListener tapsellNativeVideoAdProgressListener) {
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = this.f;
        if (tapsellNativeVideoPlayer == null) {
            return;
        }
        tapsellNativeVideoPlayer.setProgressCallback(new d(tapsellNativeVideoAdProgressListener));
        this.f.setCallback(new e(tapsellNativeVideoAdCompletionListener));
    }

    public boolean a() {
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = this.f;
        return tapsellNativeVideoPlayer != null && tapsellNativeVideoPlayer.hasPlayer();
    }

    public void b() {
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = this.f;
        if (tapsellNativeVideoPlayer != null) {
            tapsellNativeVideoPlayer.pause();
            ir.tapsell.sdk.nativeads.g gVar = this.g;
            if (gVar != null) {
                gVar.b(true);
            }
        }
    }

    public void c() {
        ir.tapsell.sdk.nativeads.g gVar = this.g;
        if (gVar != null && !gVar.isDoingStateReported() && this.g.getAdSuggestion() != null && this.g.getAdSuggestion().getSuggestionId() != null) {
            this.g.setDoingStateReported(true);
            this.g.getAdSuggestion().reportAdIsDoing(this.h, this.g.a(), this.g.getAdSuggestion().getSuggestionId().toString());
        }
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = this.f;
        if (tapsellNativeVideoPlayer != null) {
            ir.tapsell.sdk.nativeads.g gVar2 = this.g;
            if (gVar2 != null) {
                tapsellNativeVideoPlayer.setAutoPlay(gVar2.f());
                if (this.g.j()) {
                    this.f.muteVideo();
                    a(g.MUTED);
                }
            }
            this.f.start();
            if (!this.g.e()) {
                this.g.c(true);
            } else if (this.g.d()) {
                this.g.b(false);
            }
        }
    }

    public boolean d() {
        TapsellNativeVideoPlayer tapsellNativeVideoPlayer = this.f;
        return tapsellNativeVideoPlayer != null && tapsellNativeVideoPlayer.isPlaying();
    }

    public void e() {
        this.f.initPlayer();
    }

    public boolean f() {
        return this.f.isPrepared();
    }
}
