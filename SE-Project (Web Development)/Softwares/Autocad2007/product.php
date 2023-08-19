<?php
require("../../LoginPage/connection.php");
if (!isset($_SESSION['user_id'])) {
  header('location: ../../LoginPage/logout.php');
}
?>
<!DOCTYPE html>
<html>

<head>
  <title>Autocad 2007</title>
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
                <h4>AutoCAD 2007</h4>
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
            <h1>AutoCAD 2007 Free Download</h1>
          </div>

          <p style="margin: 0 !important;">AutoCAD 2007 Free Download
            is CAD designing tool used in archtiechure engineering.
            It is one of the widely tool used in world by engineers and modelers.</p>
          <h2>AutoCAD 2007 Overview</h2>

          <p>AutoCAD, developed by Autodesk is a software application for 2D and 3D designs and drafting.
            Autodesk, the leader in design and drafting, is releasing the AutoCAD versions on almost annual basis.
            The version under review is AutoCAD 2007 which has come up with lots of improvements which were missing
            in the previous versions and made the job easy for all the engineers and designers for creating different
            drawings and designs.</p>
          <div class="product-img">
            <img src="Autocad1.jpg" alt="office" style="width: 50%; height: 100%;">
          </div>

          <p>The inclusion of these new features has made use of AutoCAD more easy, flexible, productive and time
            saving.

            AutoCAD 2007 has come up with a new panel which has included many design tools this panel is known as
            dashboard. DAshboard includes many toos which are useful for creating and editing different designs.</p>
          <div class="product-img">
            <img src="Autocad2.jpg" alt="office" style="width: 60%; height: 90%;">
          </div>
          <p>Creating a pyramid shaped object was never easy before the release of 2007 version.
            AutoCAD 2007 gives you the luxury to make such complex object with ease all you need to
            do is to give a newly added PYRAMID command. With this command making pyramid is as easy
            as creating a polygon.All you need to do is to provide some basic characteristics of pyramid
            like number sides top and base radius as well as height.</p>
          <div class="product-img">
            <img src="Autocad3.jpg" alt="office" style="width: 60%; height: 90%;">
          </div>
          <p>Creating a helical shape is hell of a job and all the engineers as well as designers know how
            difficult it is to tackle with these objects. AutoCAD 2007 is there again to assist you and can
            save your day. Helical shapes can be created with ease by just indicating some basic properties
            of helix like height, number of turns top/base radii etc.</p>
          <p>You must have experienced or heard of spinning a camera on tripod. AutoCAD 2007 is giving you
            to look all around in 360 degrees by adding a new 3DSWIVEL command.</p>
          <div class="product-img">
            <img src="Autocad4.jpg" alt="office" style="width: 60%; height: 90%;">
          </div>
          <p>On a conclusive note we can say that AutoCAD 2007 is a productive tool for designing and drafting
            which saves lots of user’s time by simplfying lots complexities with the addition of many powerful tools.
          </p>
          <h2>Features of AutoCAD 2007</h2>
          <p>Here are some main feature which you will experience after AutoCAD 2007.</p>
          <ul>
            <li>User friendly interface.</li>
            <li>Dynamic blocks.</li>
            <li>Communication made easy.</li>
            <li>More flexible and productive.</li>
            <li>Introduction of dashboard.</li>
            <li>New dynamic UCS.</li>
          </ul>
          <h2>AutoCAD 2007 System Requirements</h2>
          <p>Make sure that you system meets the minimum system requirements.</p>
          <ul>
            <li>Operating Systems: Windows XP, 2000, Vista, Windows 7 and 8</li>
            <li>Processor: Intel Pentium IV, or compatible</li>
            <li>RAM: 512MB of RAM</li>
            <li>Hard Disk Space: 750MB of disk space required</li>
          </ul>
          <h2>AutoCAD 2007 Free Download</h2>
          <p>Click on below button to start AutoCAD 2007. This is complete offline installer and standalone setup for
            AutoCAD 2007.
            This would be compatible with both 64 bit windows.</p>

          <div class="download-button-container">
            <a href="download.php?file=AutoCAD2007" target="_blank" <button> <input type="button" name="button"
                value="Download for free" class="DownloadButton" button></a>
          </div>

          <div style="margin: 1.5rem 0 1rem 0 !important;">
            <strong>
              <p>Here is the video of how to install this software after downloading:</p>
            </strong>
          </div>
          <div class="tutorial-video-container">
            <video width="620" height="350" controls>
              <source src="Autotutorial.mp4" type="video/mp4">
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