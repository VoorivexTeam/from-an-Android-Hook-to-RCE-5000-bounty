package ir.tapsell.sdk.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Base64;
import ir.tapsell.sdk.NoProguard;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class FontManager implements NoProguard {
    private static final String FONTS_FOLDER = "fonts";
    private static FontName defaultFont;
    private static Map<FontName, Typeface> typefaceCache = Collections.synchronizedMap(new WeakHashMap());

    /* loaded from: classes.dex */
    public enum FontName implements NoProguard {
        FONT_BKOODAK("bkoodb.ttf");

        String value;

        FontName(String str) {
            this.value = str;
        }

        public static FontName from(String str) {
            for (FontName fontName : values()) {
                if (fontName.getValue().equals(str)) {
                    return fontName;
                }
            }
            return null;
        }

        public String getBase64() {
            if (C2757b.f11256a[ordinal()] != 1) {
                return null;
            }
            return "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";
        }

        public File getFile(Context context) {
            return new File(new File(context.getFilesDir(), FontManager.FONTS_FOLDER), this.value);
        }

        public String getValue() {
            return this.value;
        }
    }

    /* renamed from: ir.tapsell.sdk.utils.FontManager$a */
    /* loaded from: classes.dex */
    class RunnableC2756a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Context f11255b;

        RunnableC2756a(Context context) {
            this.f11255b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file = new File(this.f11255b.getFilesDir(), FontManager.FONTS_FOLDER);
            if (file.exists() || file.mkdirs()) {
                for (FontName fontName : FontName.values()) {
                    File file2 = fontName.getFile(this.f11255b);
                    if (!file2.exists()) {
                        byte[] decode = Base64.decode(fontName.getBase64().getBytes(), 0);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            fileOutputStream.write(decode);
                            fileOutputStream.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.utils.FontManager$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2757b {

        /* renamed from: a */
        static final /* synthetic */ int[] f11256a;

        static {
            int[] iArr = new int[FontName.values().length];
            f11256a = iArr;
            try {
                iArr[FontName.FONT_BKOODAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static Typeface getCustomFont(Context context, String str) {
        try {
            return Typeface.createFromAsset(context.getAssets(), str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Typeface getDefaultFont(Context context) {
        if (defaultFont == null) {
            "fa".equalsIgnoreCase(Locale.getDefault().getLanguage());
            defaultFont = FontName.FONT_BKOODAK;
        }
        return getFont(context, defaultFont);
    }

    public static Typeface getFont(Context context, FontName fontName) {
        if (typefaceCache == null) {
            typefaceCache = Collections.synchronizedMap(new WeakHashMap());
        }
        Typeface typeface = typefaceCache.get(fontName);
        if (typeface != null || context == null) {
            return typeface;
        }
        try {
            typeface = Typeface.createFromFile(fontName.getFile(context));
            typefaceCache.put(fontName, typeface);
            return typeface;
        } catch (Exception e) {
            e.printStackTrace();
            return typeface;
        }
    }

    public static void initialize(Context context) {
        new Thread(new RunnableC2756a(context)).start();
    }
}
