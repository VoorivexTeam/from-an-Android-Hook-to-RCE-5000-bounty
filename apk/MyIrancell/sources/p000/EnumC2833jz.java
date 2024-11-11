package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: jz */
/* loaded from: classes.dex */
public enum EnumC2833jz {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");

    private final String[] otherEncodingNames;
    private final int[] values;
    private static final Map<Integer, EnumC2833jz> VALUE_TO_ECI = new HashMap();
    private static final Map<String, EnumC2833jz> NAME_TO_ECI = new HashMap();

    static {
        for (EnumC2833jz enumC2833jz : values()) {
            for (int i : enumC2833jz.values) {
                VALUE_TO_ECI.put(Integer.valueOf(i), enumC2833jz);
            }
            NAME_TO_ECI.put(enumC2833jz.name(), enumC2833jz);
            for (String str : enumC2833jz.otherEncodingNames) {
                NAME_TO_ECI.put(str, enumC2833jz);
            }
        }
    }

    EnumC2833jz(int i) {
        this(new int[]{i}, new String[0]);
    }

    EnumC2833jz(int i, String... strArr) {
        this.values = new int[]{i};
        this.otherEncodingNames = strArr;
    }

    EnumC2833jz(int[] iArr, String... strArr) {
        this.values = iArr;
        this.otherEncodingNames = strArr;
    }

    public static EnumC2833jz getCharacterSetECIByName(String str) {
        return NAME_TO_ECI.get(str);
    }

    public static EnumC2833jz getCharacterSetECIByValue(int i) {
        if (i < 0 || i >= 900) {
            throw C3452xv.m16518a();
        }
        return VALUE_TO_ECI.get(Integer.valueOf(i));
    }

    public int getValue() {
        return this.values[0];
    }
}
