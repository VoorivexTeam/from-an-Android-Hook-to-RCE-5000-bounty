package p000;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: c2 */
/* loaded from: classes.dex */
public class C0502c2 {

    /* renamed from: a */
    private static boolean f2896a = false;

    /* renamed from: b */
    private static Method f2897b = null;

    /* renamed from: c */
    private static boolean f2898c = false;

    /* renamed from: d */
    private static Field f2899d;

    /* renamed from: c2$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo502a(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static DialogInterface.OnKeyListener m3521a(Dialog dialog) {
        if (!f2898c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f2899d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2898c = true;
        }
        Field field = f2899d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m3522a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f2896a) {
            try {
                f2897b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f2896a = true;
        }
        Method method = f2897b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m3523a(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m3522a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C3107q2.m14899a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: a */
    private static boolean m3524a(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener m3521a = m3521a(dialog);
        if (m3521a != null && m3521a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C3107q2.m14899a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: a */
    public static boolean m3525a(View view, KeyEvent keyEvent) {
        return C3107q2.m14904b(view, keyEvent);
    }

    /* renamed from: a */
    public static boolean m3526a(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.mo502a(keyEvent) : callback instanceof Activity ? m3523a((Activity) callback, keyEvent) : callback instanceof Dialog ? m3524a((Dialog) callback, keyEvent) : (view != null && C3107q2.m14899a(view, keyEvent)) || aVar.mo502a(keyEvent);
    }
}
