package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class XssValidation {

    @Test
    public void test() {

//        String str = "<p>ㅇㅇㅇㅇㅇ</p><p>&nbsp;<a href=\"http://naver.com\" target=\"_self\">http://naver.com</a></p><p>&nbsp;</p><p><a href=\"http://naver.com/\" target=\"_self\">&nbsp;</a><a href=\"http://naver.com/\" target=\"_self\"><img src=\"https://down.wjthinkbig.com/SMARTALL/HOMEPAGE/DEV/CONTENTS/EDITOR/202308171024276862652f-d8b8-4a67-97fb-444aefcceeab.png\" title=\"스크린샷+2023-04-25+162213.png\" style=\"max-width:100%\"></a>&nbsp;</p>";
//        String str1 = "<p align=\"center\" style=\"text-align: center;\">40년 교육노하우를 가진 AI 1등 기업 ‘웅진씽크빅’이 <br>준비한 초등 전과목 AI 학습지 웅진스마트올이 드디어 런칭하였습니다.</p><p align=\"center\" style=\"text-align: center;\">&nbsp;</p><p align=\"center\" style=\"text-align: center;\">웅진의 전과목 노하우를 스마트올 하나에 쏙 담아, <br>전과목 실력부터 초등시기에 꼭 필요한 독서, 그리고 학습습관까지 <br>실리콘밸리에서 만든 AI 학습기술로 만든<br>웅진스마트올이 확실하게 잡아드리겠습니다.<br><strong><a href=\"https://smartall.wjthinkbig.com/brand/intro\" target=\"_self\">☞스마트올 소개 보러가기</a></strong></p><p align=\"center\" style=\"text-align: center;\">&nbsp;</p><p align=\"center\" style=\"text-align: center;\">우리 아이가 공부할건데 깐깐하게 고르셔야죠?<br>스마트한 학부모님들을 위하여 스마트올 무료체험을 준비하였습니다. <br>지금 바로 스마트올 무료체험을 신청하시고, 10일간 정회원과 동일한 학습 받아보세요.</p><p align=\"center\" style=\"text-align: center;\"><br>세상 어려운 학습지 선택, 이제 딱 하나만 확인하세요!<br>스마트올인지, 아닌지!&nbsp;</p><p>&nbsp;</p><p align=\"center\" style=\"text-align: center;\"><img title=\"notice_.jpg\" style=\"max-width: 100%;\" src=\"https://down.wjthinkbig.com/SMARTALL/HOMEPAGE/CONTENTS/EDITOR/20191101102945c7281a36-4167-4d4c-90cc-4b7c31c4b833.jpg\"></p><div align=\"center\" style=\"text-align: center;\"></div><p>&nbsp;</p><p><br style=\"clear: both;\">&nbsp;</p>";
//        String str2 = "<p>&nbsp;</p><p><font color=\"#3c3c3c\" face=\"NSR\"><span style=\"font-size: 16px;\">(내용)&nbsp;</span></font></p><p><font color=\"#3c3c3c\" face=\"NSR\"><span style=\"font-size: 16px;\">(2019.11.10~2019.11.11 업데이트안내)</span></font></p><p><font color=\"#3c3c3c\" face=\"NSR\"><span style=\"font-size: 16px;\"><br></span></font></p><p><font color=\"#3c3c3c\" face=\"NSR\"><span style=\"font-size: 16px;\"><br></span></font></p><p>&nbsp;</p>";
//
//        System.out.println(replaceContents(str2));
    }

    public String replaceContents(String str) {
        return (isValid(str))
            ? str
            : replaceXss(str);
    }

    public boolean isValid(String str) {
        if (null == str || "".equals(str)) return false;

        for (String word : validWord())
            if (str.contains(word)) {
                System.out.println("########!!!!!!!!!!: "  + word);
                return false;
            }

        return true;
    }

    public String replaceXss(String str) {
        return str.replaceAll("<", "&lt")
                .replaceAll(">", "&gt")
                .replaceAll("'", "&apos;")
                .replaceAll("\"", "&quot;");
    }

    public String[] validWord() {
        return new String[]{
                "innerHTML",
                "javascript",
                "eval",
                "onmousewheel",
                "onactive",
                "onfocusout",
                "expression",
                "charset",
                "ondataavailable",
                "oncut",
                "onkeyup",
                "applet",
                "document",
                "onafteripudate",
                "onclick",
                "onkeypress",
                "meta",
                "string",
                "onmousedown",
                "onchange",
                "onload",
                "xml",
                "create",
                "onbeforeactivate",
                "onbeforecut",
                "onbounce",
                "blink",
                "append",
                "onbeforecopy",
                "ondbclick",
                "onmouseenter",
                "link",
                "binding",
                "onbeforedeactivate",
                "ondeactivate",
                "onmouseout",
//                "style",
                "alert",
                "ondatasetchaged",
                "ondrag",
                "onmouseover",
                "script",
                "msgbox",
                "cnbeforeprint",
                "ondragend",
                "onsubmit",
                "embed",
                "refresh",
                "cnbeforepaste",
                "ondragenter",
                "onmouseend",
                "object",
                "void",
                "onbeforeeditfocus",
                "ondragleave",
                "onresizestart",
                "iframe",
                "cookie",
                "onbeforeuload",
                "ondragover",
                "onuload",
                "frame",
                "Href",
                "onbeforeupdate",
                "ondragstart",
                "onselectstart",
                "frameset",
                "onpaste",
                "onpropertychange",
                "ondrop",
                "onreset",
                "ilayer",
                "onresize",
                "ondatasetcomplete",
                "onerror",
                "onmove",
                "layer",
                "onselect",
                "oncellchange",
                "onfinish",
                "onstop",
                "bgsound",
                "base",
                "onlayoutcomplete",
                "onfocus",
                "onrowexit",
//                "title",
                "onblur",
                "onselectionchange",
                "vbscript",
                "onerrorupdate",
                "onbefore",
                "onstart",
                "onrowsinserted",
                "onkeydown",
                "onfilterchage",
                "onmouseup",
                "onfocusin",
                "oncontrolselected",
                "onrowsdelete",
                "onlosecapture",
                "onrowenter",
                "onhelp",
                "onreadystatechange",
                "onmouseleave",
                "onmousemove",
                "oncontextmenu"};
    }

}
