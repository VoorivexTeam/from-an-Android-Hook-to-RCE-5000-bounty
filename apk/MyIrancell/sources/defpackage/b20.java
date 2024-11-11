package defpackage;

/* loaded from: classes.dex */
final class b20 {
    private static final Object a = new Object();
    private static final Object[][] b = {new Object[]{"00", 18}, new Object[]{"01", 14}, new Object[]{"02", 14}, new Object[]{"10", a, 20}, new Object[]{"11", 6}, new Object[]{"12", 6}, new Object[]{"13", 6}, new Object[]{"15", 6}, new Object[]{"17", 6}, new Object[]{"20", 2}, new Object[]{"21", a, 20}, new Object[]{"22", a, 29}, new Object[]{"30", a, 8}, new Object[]{"37", a, 8}, new Object[]{"90", a, 30}, new Object[]{"91", a, 30}, new Object[]{"92", a, 30}, new Object[]{"93", a, 30}, new Object[]{"94", a, 30}, new Object[]{"95", a, 30}, new Object[]{"96", a, 30}, new Object[]{"97", a, 30}, new Object[]{"98", a, 30}, new Object[]{"99", a, 30}};
    private static final Object[][] c = {new Object[]{"240", a, 30}, new Object[]{"241", a, 30}, new Object[]{"242", a, 6}, new Object[]{"250", a, 30}, new Object[]{"251", a, 30}, new Object[]{"253", a, 17}, new Object[]{"254", a, 20}, new Object[]{"400", a, 30}, new Object[]{"401", a, 30}, new Object[]{"402", 17}, new Object[]{"403", a, 30}, new Object[]{"410", 13}, new Object[]{"411", 13}, new Object[]{"412", 13}, new Object[]{"413", 13}, new Object[]{"414", 13}, new Object[]{"420", a, 20}, new Object[]{"421", a, 15}, new Object[]{"422", 3}, new Object[]{"423", a, 15}, new Object[]{"424", 3}, new Object[]{"425", 3}, new Object[]{"426", 3}};
    private static final Object[][] d = {new Object[]{"310", 6}, new Object[]{"311", 6}, new Object[]{"312", 6}, new Object[]{"313", 6}, new Object[]{"314", 6}, new Object[]{"315", 6}, new Object[]{"316", 6}, new Object[]{"320", 6}, new Object[]{"321", 6}, new Object[]{"322", 6}, new Object[]{"323", 6}, new Object[]{"324", 6}, new Object[]{"325", 6}, new Object[]{"326", 6}, new Object[]{"327", 6}, new Object[]{"328", 6}, new Object[]{"329", 6}, new Object[]{"330", 6}, new Object[]{"331", 6}, new Object[]{"332", 6}, new Object[]{"333", 6}, new Object[]{"334", 6}, new Object[]{"335", 6}, new Object[]{"336", 6}, new Object[]{"340", 6}, new Object[]{"341", 6}, new Object[]{"342", 6}, new Object[]{"343", 6}, new Object[]{"344", 6}, new Object[]{"345", 6}, new Object[]{"346", 6}, new Object[]{"347", 6}, new Object[]{"348", 6}, new Object[]{"349", 6}, new Object[]{"350", 6}, new Object[]{"351", 6}, new Object[]{"352", 6}, new Object[]{"353", 6}, new Object[]{"354", 6}, new Object[]{"355", 6}, new Object[]{"356", 6}, new Object[]{"357", 6}, new Object[]{"360", 6}, new Object[]{"361", 6}, new Object[]{"362", 6}, new Object[]{"363", 6}, new Object[]{"364", 6}, new Object[]{"365", 6}, new Object[]{"366", 6}, new Object[]{"367", 6}, new Object[]{"368", 6}, new Object[]{"369", 6}, new Object[]{"390", a, 15}, new Object[]{"391", a, 18}, new Object[]{"392", a, 15}, new Object[]{"393", a, 18}, new Object[]{"703", a, 30}};
    private static final Object[][] e = {new Object[]{"7001", 13}, new Object[]{"7002", a, 30}, new Object[]{"7003", 10}, new Object[]{"8001", 14}, new Object[]{"8002", a, 20}, new Object[]{"8003", a, 30}, new Object[]{"8004", a, 30}, new Object[]{"8005", 6}, new Object[]{"8006", 18}, new Object[]{"8007", a, 30}, new Object[]{"8008", a, 12}, new Object[]{"8018", 18}, new Object[]{"8020", a, 25}, new Object[]{"8100", 6}, new Object[]{"8101", 10}, new Object[]{"8102", 2}, new Object[]{"8110", a, 70}, new Object[]{"8200", a, 70}};

    private static String a(int i, int i2, String str) {
        if (str.length() < i) {
            throw aw.a();
        }
        String substring = str.substring(0, i);
        int i3 = i2 + i;
        if (str.length() < i3) {
            throw aw.a();
        }
        String substring2 = str.substring(i, i3);
        String str2 = '(' + substring + ')' + substring2;
        String a2 = a(str.substring(i3));
        if (a2 == null) {
            return str2;
        }
        return str2 + a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw aw.a();
        }
        String substring = str.substring(0, 2);
        for (Object[] objArr : b) {
            if (objArr[0].equals(substring)) {
                return objArr[1] == a ? b(2, ((Integer) objArr[2]).intValue(), str) : a(2, ((Integer) objArr[1]).intValue(), str);
            }
        }
        if (str.length() < 3) {
            throw aw.a();
        }
        String substring2 = str.substring(0, 3);
        for (Object[] objArr2 : c) {
            if (objArr2[0].equals(substring2)) {
                return objArr2[1] == a ? b(3, ((Integer) objArr2[2]).intValue(), str) : a(3, ((Integer) objArr2[1]).intValue(), str);
            }
        }
        for (Object[] objArr3 : d) {
            if (objArr3[0].equals(substring2)) {
                return objArr3[1] == a ? b(4, ((Integer) objArr3[2]).intValue(), str) : a(4, ((Integer) objArr3[1]).intValue(), str);
            }
        }
        if (str.length() < 4) {
            throw aw.a();
        }
        String substring3 = str.substring(0, 4);
        for (Object[] objArr4 : e) {
            if (objArr4[0].equals(substring3)) {
                return objArr4[1] == a ? b(4, ((Integer) objArr4[2]).intValue(), str) : a(4, ((Integer) objArr4[1]).intValue(), str);
            }
        }
        throw aw.a();
    }

    private static String b(int i, int i2, String str) {
        String substring = str.substring(0, i);
        int i3 = i2 + i;
        if (str.length() < i3) {
            i3 = str.length();
        }
        String substring2 = str.substring(i, i3);
        String str2 = '(' + substring + ')' + substring2;
        String a2 = a(str.substring(i3));
        if (a2 == null) {
            return str2;
        }
        return str2 + a2;
    }
}
