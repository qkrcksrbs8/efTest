<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html>
<head><title>Dimension | HTML5 UP</title>
    <meta charset="utf-8">
    <link rel="icon" href="data:;base64,iVBORw0KGgo=">
</head>
<body class="is-article-visible">

<!-- Wrapper -->
<div id="wrapper">

    <!-- Header -->
    <header id="header" style="display: none;">
        <div class="logo">
            <span class="icon fa-gem"></span>
        </div>
        <div class="content">
            <div class="inner">
                <h1>Dimension</h1>
                <p>A fully responsive site template designed by <a href="https://html5up.net">HTML5 UP</a> and released<br>
                    for free under the <a href="https://html5up.net/license">Creative Commons</a> license.</p>
            </div>
        </div>
        <nav class="use-middle">
            <ul>
                <li><a href="#intro">Intro</a></li>
                <li><a href="#work">Work</a></li>
                <li class="is-middle"><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
                <!--<li><a href="#elements">Elements</a></li>-->
            </ul>
        </nav>
    </header>

    <!-- Main -->
    <div id="main" style="">

        <!-- Contact -->
        <article id="contact" style="" class="active">
            <h2 class="major">Contact</h2>
            <form method="post" action="#">
                <div class="fields">
                    <div class="field half">
                        <label for="name">Name</label>
                        <input type="text" name="name" id="name">
                    </div>
                    <div class="field half">
                        <label for="email">Email</label>
                        <input type="text" name="email" id="email">
                    </div>
                    <div class="field">
                        <label for="message">Message</label>
                        <textarea name="message" id="message" rows="4"></textarea>
                    </div>
                </div>
                <ul class="actions">
                    <li><input type="reset" value="Send Message" class="primary"></li>
                    <li><input type="reset" value="Reset"></li>
                </ul>
            </form>

        </article>

    </div>

    <div id="sub" style="">

        <!-- Contact -->
        <article id="contact" style="" class="active">
            <h2 class="major">Color</h2>
            <form method="post" action="#">
                <div class="fields">
                    <div class="field half">
                        <label for="name">Color</label>
                        <input type="color" name="bgcolor" id="bgcolor" onkeyup="colorChange(e.id)" value="#e66465">
                        <input type="button"
                               onclick="alert(document.getElementById('bgcolor').value);"
                               value="HEX값">
                        <input type="button"
                               onclick="rgbColor();"
                               value="RGB값">
                        <input type="button"
                               onclick="alert(parseInt((document.getElementById('bgcolor').value).replace(/^#/, '').substring(0, 2), 16));"
                               value="R 노출">
                        <input type="button"
                               onclick="alert(parseInt((document.getElementById('bgcolor').value).replace(/^#/, '').substring(2, 4), 16));"
                               value="G 노출">
                        <input type="button"
                               onclick="alert(parseInt((document.getElementById('bgcolor').value).replace(/^#/, '').substring(4, 6), 16));"
                               value="B 노출">
                    </div>
                </div>
            </form>

        </article>

    </div>

</div>


</body>
<script>

    const rgbColor = () => {
        let hex = document.getElementById('bgcolor').value;
        hex = hex.replace(/^#/, '');

        let r = parseInt(hex.substring(0, 2), 16);
        let g = parseInt(hex.substring(2, 4), 16);
        let b = parseInt(hex.substring(4, 6), 16);
        alert('R:'+r+" G:"+g+" B:"+b);
    }

    const hexToRgb = (hex, rgb) => {
        if (null == hex || '' == hex || hex.replace(/^#/, '').length != 6) return '';

        hex = hex.replace(/^#/, '');

        if ('R' == rgb) return parseInt(hex.substring(0, 2), 16);
        if ('G' == rgb) return parseInt(hex.substring(2, 4), 16);
        if ('B' == rgb) return parseInt(hex.substring(4, 6), 16);
        return '';
    }


</script>
</html>




















