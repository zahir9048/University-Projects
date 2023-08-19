<?php
require("../../LoginPage/connection.php");
if (!isset($_SESSION['user_id'])) {
  header('location: ../../LoginPage/logout.php');
}
?>
<!DOCTYPE html>
<html>

<head>
  <title>JetBrains PyCharm Pro</title>
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
                <h4>PyCharm</h4>
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
            <h1>JetBrains PyCharm Pro 2021 Free Download</h1>
          </div>

          <p style="margin: 0 !important;">JetBrains PyCharm Pro 2021 Free Download Latest Version. It is full offline
            installer standalone
            setup of JetBrains PyCharm Pro 2021.</p>
          <h2>JetBrains PyCharm Pro Overview</h2>
          <p>JetBrains PyCharm Pro 2021 is an imposing IDE that provides support for the JavaScript, Django IDE and HTML
            which can be used
            for running any Python file. You don’t need to apply the specific programming language as the application
            can read as well as
            analyze lines of code written down in Python, CoffeeScript, JavaScript, Google App Engine and many more. It
            has support for Django
            IDE, HTML and JavaScript which can be used for running any Python file. You can also download <a
              href="#">JetBrains PyCharm Pro 2020.</a></p>
          <div class="product-img">
            <img src="Pycharm1.jpg" alt="office" style="width: 50%; height: 100%;">
          </div>

          <p>JetBrains PyCharm Pro 2021 has an advanced and pretty solid Python Editor and you can use the color of the
            codes which makes it really
            easy to work with. The application also offers Quick Debugging in it as well which really saves a lot of
            time. It has got an interface
            which has got all the features cleverly spread throughout he workspace. It has got a side panel which will
            provide you with the quick
            access to available libraries and you can drag the desired files over the space where the writing has been
            done. It includes a wide range
            of options and settings to give users customizations and desired workflow. You can also
            download-button-container <a href="#">JetBrains PyCharm Pro 2019.</a></p>
          <div class="product-img">
            <img src="Pycharm2.jpg" alt="office" style="width: 60%; height: 90%;">
          </div>
          <h2>Features of JetBrains PyCharm Pro</h2>
          <p>Below are some noticeable features which you’ll experience after JetBrains PyCharm Pro free download.</p>
          <ul>
            <li>Simple and easy to use.</li>
            <li>Fast and quick operations.</li>
            <li>Support for wide range of languages.</li>
            <li>Quick debugging for troubleshoot or testing.</li>
            <li>Solid Python editor.</li>
            <li>Powerful and advanced tools and features.</li>
            <li>No need for external libraries or app.</li>
          </ul>
          <div class="product-img">
            <img src="Pycharm3.jpg" alt="office" style="width: 60%; height: 90%;">
          </div>
          <h2>JetBrains PyCharm Pro Technical Setup Details</h2>
          <ul>
            <li>Software Full Name: JetBrains PyCharm Pro 2021</li>
            <li>Setup File Name:</li>
            <li>JetBrains_PyCharm_Professional_2021.2.2×64.rar/li>
            <li>JetBrains_PyCharm_Pro_2021.2.2_Fix_Only.rar</li>
            <li>Full Setup Size:</li>
            <li>465 MB, 11 MB</li>
            <li>Setup Type: Offline Installer / Full Standalone Setup</li>
            <li>Compatibility Architecture: 64 Bit (x64)</li>
            <li>Latest Version Release Added On: 29th Sep 2021</li>
            <li>Developers: <a href="#" target="_blank" rel="noopener">Homepage</a></li>
          </ul>
          <div class="product-img">
            <img src="Pycharm4.jpg" alt="office" style="width: 60%;height: 90%;">
          </div>
          <h2>System Requirements For JetBrains PyCharm Pro</h2>
          <p>Before you start JetBrains PyCharm Pro free download, make sure your PC meets minimum system requirements.
          </p>
          <ul>
            <li>Operating System: Windows 7/8/8.1/10.</li>
            <li>Memory (RAM): 512 MB of RAM required.</li>
            <li>Hard Disk Space: 500 MB of free space required.</li>
            <li>Processor: Intel Dual Core processor or later.</li>
          </ul>
          <h2>JetBrains PyCharm Pro Free Download</h2>
          <p>Click on below button to start JetBrains PyCharm Pro Download. This is complete offline installer and
            standalone
            setup for JetBrains PyCharm Pro. This would be compatible with 32 bit and 64-bit windows. </p>
          <div class="download-button-container">
            <a href="download.php?file=PyCharm Community Edition 2021.3.3" target="_blank" <button> <input type="button"
                name="button" value="Download for free" class="DownloadButton" button></a>
          </div>

          <div style="margin: 1.5rem 0 1rem 0 !important;">
            <strong>
              <p>Here is the video of how to install this software after downloading:</p>
            </strong>
          </div>

          <div class="tutorial-video-container">
            <video width="620" height="350" controls>
              <source src="PycharmTutorial.mp4" type="video/mp4">
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