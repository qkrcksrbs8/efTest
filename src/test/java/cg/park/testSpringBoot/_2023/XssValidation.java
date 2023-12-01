package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class XssValidation {

    @Test
    public void test() {

        String str3 = "<p><a onmouseover=\"alert(document.cookie)\">xss link</a></p>";
        System.out.println(replaceContents(str3));

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
                "oncontextmenu",
                "onerror"
        };
    }

}
