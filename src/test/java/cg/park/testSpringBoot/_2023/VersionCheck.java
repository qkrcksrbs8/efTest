package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VersionCheck {

    String iosVer = "2.5.8";
    String aosVer = "3.2.7";

    @Test
    public void test() {

        String os = "android";
        String ver = "3.2.6";



        String[] userVer = ver.split("\\.");

        System.out.println("================== START ==================");
        System.out.println("length: "+ (3 != userVer.length));

        if ("android".equals(os)) {
            String aosVer = "1.2.7";
            String[] aosArr = aosVer.split("\\.");
            try {
                for (int i = 0; i < 3; i++) {
                    if (Integer.parseInt(aosArr[i]) == Integer.parseInt(userVer[i])) continue;

                    if (Integer.parseInt(aosArr[i]) > Integer.parseInt(userVer[i])) {
                        return;// update massage;
                    }

                    break;// end;
                }
            }
            catch (Exception e) {
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
                        return;// update massage;
                    }

                    break;// end;
                }
            }
            catch (Exception e) {
                return;// update massage;
            }
        }


        System.out.println("================== E N D ==================");


        if (isUpdate(os, ver)) {
            return;// ("android".equals(os)) ? "androidPath" : "iosPath";
        }

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

}
