package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VersionCheck {

    String iosVer = "2.5.8";
    String aosVer = "3.2.7";

    @Test
    public void test() {

        String aos = "android";
        String ios = "iphone";

//        List<T> list = new ArrayList<>();

//          for (T row : list) versionTest(t.getOs, t.getVer, t.message);

//        versionTest(aos, "3.2.7", "TURE");
//        versionTest(aos, "4.2.7", "TURE");
//        versionTest(aos, "3.3.8", "TURE");
//        versionTest(aos, "3.2.7", "TURE");
//
//        versionTest(aos, "3.2.6", "FALSE");
//        versionTest(aos, "3.1.7", "FALSE");
//        versionTest(aos, "2.2.7", "FALSE");

//        versionTest(aos, ".2.7", "ERROR");
//        versionTest(aos, "2.7.", "ERROR");
//        versionTest(aos, "2..7", "ERROR");
//        versionTest(aos, "2.7.1.1", "ERROR");
//        versionTest(aos, "3", "ERROR");

//        versionTest(null, "3.2.7", "ERROR");
//        versionTest("", "3.2.7", "ERROR");
//        versionTest("  ", "3.2.7", "ERROR");
//        versionTest(aos, null, "ERROR");
//        versionTest(aos, "", "ERROR");
//        versionTest(aos, "  ", "ERROR");


//        if (isUpdate(os, ver)) {
//            return;// ("android".equals(os)) ? "androidPath" : "iosPath";
//        }

    }


    public void versionTest(String os, String ver, String message) {

        System.out.println("================== START ==================");
        System.out.println("["+message+"]");
        System.out.println("os: "+os);
        System.out.println("ver: "+ver);

        if (isBlank(os)) {
            System.out.println("####### os is blank: "+os);
            return;
        }
        if (isBlank(ver)) {
            System.out.println("####### ver is blank: "+ver);
            return;
        }

        if ('.' == ver.charAt(ver.length() -1) || '.' == ver.charAt(0) || ver.contains("..")) {
            System.out.println("####### ver: "+ver);
            return;
        }

        String[] userVer = ver.split("\\.");

        if (userVer.length != 3) {
            System.out.println("####### ver length: "+ver);
            return;
        }

        if ("android".equals(os)) {
            String aosVer = "3.2.7";
            String[] aosArr = aosVer.split("\\.");
            try {
                for (int i = 0; i < 3; i++) {
                    if (Integer.parseInt(aosArr[i]) == Integer.parseInt(userVer[i])) continue;

                    if (Integer.parseInt(aosArr[i]) > Integer.parseInt(userVer[i])) {
                        System.out.println("[FALSE AOS] new: "+aosVer);
                        return;// update massage;
                    }
                    break;// end;
                }
            }
            catch (Exception e) {
                System.out.println("[ERROR] E001");
                return;// update massage;
            }
        }
        else {
            String iosVer = "1.2.7";
            String[] iosArr = iosVer.split("\\.");
            try {
                for (int i = 0; i < 3; i++) {
                    if (Integer.parseInt(iosArr[i]) == Integer.parseInt(userVer[i])) continue;

                    if (Integer.parseInt(iosArr[i]) > Integer.parseInt(userVer[i])) {
                        System.out.println("[FALSE IOS] new: "+iosVer);
                        return;// update massage;
                    }
                    break;// end;
                }
            }
            catch (Exception e) {
                System.out.println("[ERROR] E002");
                return;// update massage;
            }
        }
        System.out.println("[TURE]");
    }


    public boolean isUpdate(String os, String ver) {

        if (null == os || null == ver) return true;
        if (ver.indexOf("\\.") == -1) return true;

        String[] osArr = (("andorid".equals(os)) ? aosVer : iosVer).split("\\.");
        String[] userArr = ver.split("\\.");

        if (userArr.length != 3) return true;

        return isOldVer(osArr, userArr);
    }

    private boolean isOldVer(String[] osVer, String[] userVer) {
        try {
            for (int i = 0; i < 3; i++) {
                if (Integer.parseInt(osVer[i]) == Integer.parseInt(userVer[i])) continue;
                if (Integer.parseInt(osVer[i]) > Integer.parseInt(userVer[i])) return true;
                break;
            }
        }
        catch (Exception e) {
            return true;
        }
        return false;
    }

    public boolean isBlank (String str) {
        return null == str || str.trim().length() == 0;
    }

}
