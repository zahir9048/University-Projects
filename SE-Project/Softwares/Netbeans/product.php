<?php
require("../../LoginPage/connection.php");
if (!isset($_SESSION['user_id'])) {
  header('location: ../../LoginPage/logout.php');
}
?>
<!DOCTYPE html>
<html>

<head>
  <title>NetBeans 8.0.2</title>
  <meta charset="UTF-8">
  <link rel="shortcut icon" type="png" href="../../meta data/logo3.png">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="../styles.css">
  <link rel="stylesheet" href="../bootstrap.min.css">
</head>

<body>
  <div class="page">
    <header class="header1">
      <div id="logocontainer">
        <a href="../../meta data/logo3.png" target="_blank"><img id="logo" src="../../meta data/logo3.png"
            alt="main logo"></a>
      </div>
      <nav class="header-nav">
        <ul>
          <li>
            <a href="../../Main Pages/homepage.php" class="bn3637 bn36">Home</a>
          </li>
          <li>
            <a href="../../Main Pages/softwares.php" id="softwares-btn" class="bn3637 bn36">Softwares</a>
          </li>
          <li>

            <a href="../../Main Pages/games.php" id="" class="bn3637 bn36">Games</a>
          </li>
          <li>
            <a href="../../Main Pages/movies.php" class="bn3637 bn36">Movies</a>
          </li>
        </ul>
      </nav>
      <div class="dropdown">
        <a href="../../Main Pages/clear_acc_scr.php" id="btn-account" class="bn3637 bn36 dropbtn">My Account</a>
        <div class="dropdown-content main-menu clicky-menu no-js">
          <a href="../../Main Pages/clear_acc_scr.php">Account Settings</a>
          <a href="../../LoginPage/logout.php">Log Out</a>
        </div>
      </div>
    </header>
    <main class="main-content">
      <section class="index-banner">
        <div class="container-1">
          <div class="navbar-container">
            <div class="navigation">
              <a href="../../Main Pages/softwares.php">
                <h4>Softwares</h4>
              </a>
              <p> &nbsp; <strong> -> </strong> &nbsp;</p>
              <a href="product.php">
                <h4>NetBeans</h4>
              </a>
            </div>
          </div>
          <div class="hr">
            <hr>
          </div>
          <div class="menubar">
            <nav class="menu" id="menu1">
              <h2><!-- Title for menuset 1 -->Trending Softwares </h2>
              <ul>
                <!-- List of links under menuset 1 -->
                <li><a href="../../Softwares/Pycharm/product.php" title="Link">PyCharm Pro 2021</a></li>
                <li><a href="../../Softwares/Unity/product.php" title="Link">Unity Pro 2019 + Addons + Support
                    Files</a>
                </li>
                <li><a href="../../Softwares/Netbeans/product.php" title="Link">NetBeans</a></li>
                <li class="notimp">
                  <!-- notimp class is applied to remove this link from the tablet and phone views --><a
                    href="../../Softwares/Intellij2022/product.php" title="Link">IntelliJ IDEA</a>
                </li>
              </ul>
            </nav>
            <nav class="menu" id="menu2">
              <h2><!-- Title for menuset 1 -->Trending Games </h2>
              <ul>
                <!-- List of links under menuset 1 -->
                <li><a href="../../Games/Fortnite/product.php" title="Link">Fortnite</a></li>
                <li><a href="../../Games/Valorant/product.php" title="Link">Valorant</a></li>
                <li><a href="../../Games/NFSRivals/product.php" title="Link">Need For Speed Rivals</a></li>
                <li class="notimp">
                  <!-- notimp class is applied to remove this link from the tablet and phone views --><a
                    href="../../Games/CSGO/product.php" title="Link">CS: Global Offensive</a>
                </li>
              </ul>
            </nav>
            <nav class="menu" id="menu3">
              <h2><!-- Title for menuset 1 -->Trending Movies </h2>
              <ul>
                <!-- List of links under menuset 1 -->
                <li><a href="../../Movies/JohnWick1/product.php" title="Link">John Wick 2014</a></li>
                <li><a href="../../Movies/Avatar/product.php" title="Link">Avatar 2010</a></li>
                <li><a href="../../Movies/ManOfSteel/product.php" title="Link">Man Of Steel</a></li>
                <li class="notimp">
                  <!-- notimp class is applied to remove this link from the tablet and phone views --><a
                    href="../../Movies/Transporter1/product.php" title="Link">The Transporter 2002</a>
                </li>
              </ul>
            </nav>
          </div>
          <div class="hr">
            <hr>
          </div>
          <div class="advertisement-container">
            <div class="advertisement-1">
              <a target="_blank" href="https://fastendtechnologies.dreamhosters.com/"><img class="ad-img-1"
                  src="../../meta data/advertisement.jpg" alt="advertisement" width="100" height="100"></a>
            </div>
            <div class="advertisement-2">
              <a target="_blank" href="https://getintopc.com/donate/"><img class="ad-img-2"
                  src="../../meta data/donate.png" alt="advertisement" width="100" height="100"></a>

            </div>
          </div>
        </div>
        <div class="container-2">
          <div class="product-h1">
            <h1>NetBeans 8.0.2 Complete Bundle Free Download</h1>
          </div>

          <p style="margin: 0 !important;">NetBeans 8.0.2 Complete Bundle Free Download Latest Version for Windows.
            It is full offline installer standalone setup of NetBeans 8.0.2 Complete Bundle.</p>
          <h2>NetBeans 8.0.2 Complete Bundle Overview</h2>

          <p>NetBeans 8.0.2 Complete Bundle is a beneficial open-source Integrated Development Environment for the
            developers.
            It supports a number of different languages and code completion. When it comes to Software Developers they
            have their
            own choices of tools for developing of applications. And NetBeans 8.0.2 Complete Bundle is considered as one
            of the most
            appreciated and successful IDE.</p>
          <div class="product-img">
            <img src="netbeans1.jpg" alt="office" style="width: 50%; height: 100%;">
          </div>

          <p>This software has an amazing and simple interface which provides you a quick access. The easy access saves
            a lot of time
            and it avoids you to go through many tabs. It is actually developed to create Java applications for desktop,
            mobile and other
            environments. Inside this software you will get a number of dedicated editors which are not only for Java
            but you can also use
            for Groovy, HTML, XML and many other. You also get a built-in NetBeans Debugger which helps you debug your
            scripts and it would
            be a great help. In the conclusion you can say that when it comes to Java Application Development NetBeans
            8.0.2 Complete Bundle
            is the ultimate software you have to go for.</p>
          <div class="product-img">
            <img src="netbeans2.jpg" alt="office" style="width: 60%; height: 90%;">
          </div>
          <h2>Features of NetBeans 8.0.2 Complete Bundle</h2>
          <p>Below are some noticeable features which you’ll experience after NetBeans 8.0.2 Complete Bundle free
            download.</p>
          <ul>
            <li>It’s a really useful open source IDE for the developers.</li>
            <li>This software supports a number of languages.</li>
            <li>You also get code completion feature.</li>
            <li>It has a built in NetBeans Debugger.</li>
            <li>You can use it for Java, Groovy, HTML, XML etc.</li>
          </ul>
          <div class="product-img">
            <img src="netbeans3.jpg" alt="office" style="width: 60%; height: 90%;">
          </div>
          <h2>NetBeans 8.0.2 Complete Bundle Technical Setup Details</h2>
          <ul>
            <li>Software Full Name: NetBeans 8.0.2 Complete Bundle</li>
            <li>Setup File Name: netbeans-8.1-windows.rar</li>
            <li>Full Setup Size: 214 MB</li>
            <li>Setup Type: Offline Installer / Full Standalone Setup</li>
            <li>Compatibility Architecture: 32 Bit (x86) / 64 Bit (x64)</li>
            <li>Latest Version Release Added On: 19th Feb 2016</li>
            <li>Developers: <a href="https://netbeans.org/" target="_blank" rel="noopener">Cisco Packet Tracer</a></li>
          </ul>
          <div class="product-img">
            <img src="netbeans4.jpg" alt="office" style="width: 60%;height: 90%;">
          </div>
          <h2>System Requirements For NetBeans 8.0.2 Complete Bundle</h2>
          <p>Before you start NetBeans 8.0.2 Complete Bundle free download, make sure your PC meets minimum system
            requirements.</p>
          <ul>
            <li>Operating System: Windows Vista/7/8/10</li>
            <li>Memory (RAM): 512 MB of RAM is requiredMemory (RAM): 512MB of RAM required.</li>
            <li>Hard Disk Space: 750 MB of free space is required</li>
            <li>Processor: Intel Pentium IV 2.6 GHz or faster</li>
          </ul>
          <h2>NetBeans 8.0.2 Complete Bundle Free Download</h2>
          <p>Click on below button to start NetBeans 8.0.2 Complete Bundle Free Download. This is complete offline
            installer and standalone
            setup for NetBeans 8.0.2 Complete Bundle. This would be compatible with both 32 bit and 64 bit windows.</p>

          <div class="download-button-container">
            <a href="download.php?file=NetBeans-12.6" target="_blank" <button> <input type="button" name="button"
                value="Download for free" class="DownloadButton" button></a>
          </div>
          <div style="margin: 1.5rem 0 1rem 0 !important;">
            <strong>
              <p>Here is the video of how to install this software after downloading:</p>
            </strong>
          </div>

          <div class="tutorial-video-container">
            <video width="620" height="350" controls>
              <source src="NetbeansTuttorial.mp4" type="video/mp4">
            </video>
          </div>

        </div>
      </section>

    </main>
    <footer class="footer1">
      <div class="footer-links">
        <ul class="footer-main-links">
          <li><a href="../../Main Pages/homepage.php">Home</a></li>
          <li><a href="../../Main Pages/softwares.php">Softwares</a></li>
          <li><a href="../../Main Pages/games.php">Games</a></li>
          <li><a href="../../Main Pages/movies.php">Movies</a></li>
        </ul>

        <ul class="footer-main-cases">
        </ul>
      </div>


      <div class="footer-social">
        <div class="footer-h2">
          <h2>Visit Us</h2>
        </div>
        <div class="footer-sm">
          <div class="img-container">
            <a href="#">
              <img class="yt-img" src="../../meta data/youtube.png" alt="Youtube icon">
            </a>
          </div>
          <div class="img-container">
            <a href="#">
              <img class="tw-img" src="../../meta data/twitter.png" alt="Twitter icon">
            </a>
          </div>
          <div class="img-container">
            <a href="#">
              <img class="fb-img" src="../../meta data/fb.png" alt="Facebook icon">
            </a>
          </div>
        </div>
      </div>
      <div class="copyrights">
        <span>© 2023 ARZ All rights reserved.</span>
        <span><a href="">Terms of Use</a></span>
        <span><a href="">Privacy and Cookies</a></span>
        <span><a href="">Contact us</a></span>
      </div>
    </footer>
  </div>
</body>

</html>