<?php
require("../../LoginPage/connection.php");
if (!isset($_SESSION['user_id'])) {
  header('location: ../../LoginPage/logout.php');
}
?>
<!DOCTYPE html>
<html>

<head>
  <title>Warhammer</title>
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
              <a href="../../Main Pages/games.php">
                <h4>Games</h4>
              </a>
              <p> &nbsp; <strong> -> </strong> &nbsp;</p>
              <a href="product.php">
                <h4>Warhammer</h4>
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
            <h1>Warhammer 40000 Space Marine Free Download</h1>
          </div>

          <p style="margin: 0 !important;">Warhammer 40000 Space Marine Free Download PC game setup in direct single
            link for windows. It’s an action game. Which is based on orcs.</p>
          <h2>Warhammer 40000 Space Marine Overview</h2>

          <p>Relic Entertainment developed Warhammer 40000 Space Marine and it was published by THQ. It was released on
            9 September 2011.</p>
          <div class="product-img">
            <img src="Warh1.jpg" alt="office" style="width: 50%; height: 100%;">
          </div>

          <p>Warhammer 40000 Space Marine is a third person shooter game. It contains hybrid shooting and some melee
            combat. You have to control the main character Titus. He has some
            healing abilities also. If he gets his health lowered than after some action time he gains his health back.
            You will have the help by two more characters Sidonus and Leandros.
            But most of the missions are played alone.</p>
          <div class="product-img">
            <img src="Warh2.jpg" alt="cod" style="width: 60%; height: 90%;">
          </div>
          <p>You also have got the fury meter. Which when fills gives you powerful attack mode. In the start of the
            game. You have simple weapons like a knife and pistol. But you can have
            more weapons. You will have to conquer against the orcs. and the forces of chaos. This game is built
            beautifully. and has some special visuals. It has garnered positive reviews
            from the game critics. So it means. This game is very much enjoyable. But if you want to play a game which
            is fully based on orcs. Then you should try Of Orcs and Men.</p>
          <div class="product-img">
            <img src="Warh3.jpg" alt="cod" style="width: 60%; height: 90%;">
          </div>
          <h2>Features of Warhammer 40000 Space Marine</h2>
          <p>Following are the main features of Warhammer 40000 Space Marine.</p>
          <ul>
            <li>Action adventure strategy game.</li>
            <li>Shooting game with third person perspective.</li>
            <li>Beautiful environment is shown all around.</li>
            <li>Detailed graphics.</li>
            <li>Lots of levels to clear.</li>
          </ul>
          <div class="product-img">
            <img src="Warh4.jpg" alt="cod" style="width: 60%; height: 90%;">
          </div>
          <h2>System Requirements of Warhammer 40000 Space Marine</h2>
          <p>Below are the minimum system requirements of Warhammer 40000 Space Marine</p>
          <ul>
            <li>Operating System: Windows XP/ Windows Vista/ Windows 7/ Windows 8 and 8.1</li>
            <li>CPU: 2.0 GHz Dual core CPU</li>
            <li>RAM: 1 GB or 2 GB</li>
            <li>Hard disk Space: 20 GB at least</li>
          </ul>

          <h2>Warhammer 40000 Space Marine Free Download</h2>
          <p>Click on below button to start Warhammer 40000 Space Marine Free Download. It is a full and complete game.
            Just download and start playing it. We have provided direct link full setup of the game.</p>
          <div class="download-button-container">
            <a href="download.php?file=WarHammer" target="_blank" <button> <input type="button" name="button"
                value="Download for free" class="DownloadButton" button></a>
          </div>

          <div style="margin: 1.5rem 0 1rem 0 !important;">
            <strong>
              <p>Here is the video of how to install this game after downloading:</p>
            </strong>
          </div>

          <div class="tutorial-video-container">
            <video width="620" height="350" controls>
              <source src="Warhtutorial.mp4" type="video/mp4">
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