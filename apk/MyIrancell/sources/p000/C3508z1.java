package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: z1 */
/* loaded from: classes.dex */
public class C3508z1 {

    /* renamed from: b */
    private static final View.AccessibilityDelegate f14313b = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f14314a = new a(this);

    /* renamed from: z1$a */
    /* loaded from: classes.dex */
    private static final class a extends View.AccessibilityDelegate {

        /* renamed from: a */
        private final C3508z1 f14315a;

        a(C3508z1 c3508z1) {
            this.f14315a = c3508z1;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f14315a.m16701a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0503c3 m16699a = this.f14315a.m16699a(view);
            if (m16699a != null) {
                return (AccessibilityNodeProvider) m16699a.m3544a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f14315a.mo1540b(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.f14315a.mo1538a(view, C0448b3.m3275a(accessibilityNodeInfo));
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f14315a.mo10406c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f14315a.m16702a(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f14315a.mo1539a(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f14315a.m16700a(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f14315a.m16703d(view, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public View.AccessibilityDelegate m16698a() {
        return this.f14314a;
    }

    /* renamed from: a */
    public C0503c3 m16699a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = f14313b.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C0503c3(accessibilityNodeProvider);
    }

    /* renamed from: a */
    public void m16700a(View view, int i) {
        f14313b.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public void mo1538a(View view, C0448b3 c0448b3) {
        f14313b.onInitializeAccessibilityNodeInfo(view, c0448b3.m3309r());
    }

    /* renamed from: a */
    public boolean mo1539a(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return f14313b.performAccessibilityAction(view, i, bundle);
        }
        return false;
    }

    /* renamed from: a */
    public boolean m16701a(View view, AccessibilityEvent accessibilityEvent) {
        return f14313b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean m16702a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f14313b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo1540b(View view, AccessibilityEvent accessibilityEvent) {
        f14313b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo10406c(View view, AccessibilityEvent accessibilityEvent) {
        f14313b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void m16703d(View view, AccessibilityEvent accessibilityEvent) {
        f14313b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
