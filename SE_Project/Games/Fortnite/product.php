<?php
require("../../LoginPage/connection.php");
if (!isset($_SESSION['user_id'])) {
  header('location: ../../LoginPage/logout.php');
}
?>
<!DOCTYPE html>
<html>

<head>
  <title>Fortnite</title>
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
        <a href="../../Main Pages/account.php" id="btn-account" class="bn3637 bn36 dropbtn">My Account</a>
        <div class="dropdown-content main-menu clicky-menu no-js">
          <a href="../../Main Pages/account.php">Account Settings</a>
          <a href="../../LoginPage/logout.php">Log Out</a>
        </div>
      </div>
    </header>
    <main class="main-content">
      <section class="index-banner">
        <div class="container-1">
          <div class="navbar-container">
            <div class="navigation">
              <a href="../../Main Pages/games.php">
                <h4>Games</h4>
              </a>
              <p> &nbsp; <strong> -> </strong> &nbsp;</p>
              <a href="product.php">
                <h4>Fortnite</h4>
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
            <h1>Fortnite Battle Royale Download PC Computer</h1>
          </div>

          <p style="margin: 0 !important;">Fortnite Battle Royale Download PC Computer full version PC Game setup in
            single direct download link and torrent for Windows and Laptop from oceanofgames.</p>
          <h2>Fortnite Battle Royale Overview</h2>

          <p>Fortnite is a fight royale game from Epic Games where you can look for weapons, ensure yourself, and
            assault the other 99 players to be the last player remaining in the endurance game.
            It comes with smooth designs, snappy game mechanics, a functioning network, and 3 distinctive game modes
            which made this venture earned countless fans in only a time of presence.
          <div class="product-img">
            <img src="fortnite.jpg" alt="office" style="width: 50%; height: 100%;">
          </div>
          There are Four various types of saints in this game like: trooper, constructor, ninja, and stranger with
          having own skulls and exceptional highlights. Fortnite incorporates long-separation weapons, for example,
          shotguns, attack rifles or firearms, and hand-to-hand battle weapons, for example, blades, lance, and grass
          shearers.
          The game week after week refreshes always fuel the good times. New interactivity modes, genuine and crazy new
          searches for your symbol, new weapons and things. So download the game and collaborate with your companions
          far and wide or in a similar room!
          </p>

          <div class="product-img">
            <img src="fornite2.jpg" alt="cod" style="width: 60%; height: 90%;">
          </div>
          <h2>Fortnite Battle Royale Features</h2>

          <ul>
            <li>Four different kinds of heroes</li>
            <li>3 Different Game modes</li>
            <li>Long-distance weapons</li>
            <li>Reality Based Graphics</li>
          </ul>
          <div class="product-img">
            <img src="fortnite3.jpg" alt="cod" style="width: 60%; height: 90%;">
          </div>
          <h2>System Requirements</h2>
          <ul>
            <li>OS: Windows 10 64bit</li>
            <li>• CPU: Intel Core i5 2.8Ghz</li>
            <li>• GPU: Nvidia GTX 660 or AMD Radeon 7870 2GB</li>
            <li>• RAM: 8GB RAM</li>
            <li>• HDD space: 20 GB</li>
            <li>• DirectX – DirectX 11.0</li>
          </ul>

          <h2>Download from here:</h2>
          <div class="download-button-container">
            <a href="download.php?file=Fortnite" target="_blank" <button> <input type="button" name="button"
                value="Download for free" class="DownloadButton" button></a>
          </div>

          <div style="margin: 1.5rem 0 1rem 0 !important;">
            <strong>
              <p>Here is the video of how to install this game after downloading:</p>
            </strong>
          </div>

          <div class="tutorial-video-container">
            <video width="620" height="350" controls>
              <source src="tutorial.mp4" type="video/mp4">
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