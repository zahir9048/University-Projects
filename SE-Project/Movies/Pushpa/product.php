<?php
require("../../LoginPage/connection.php");
if (!isset($_SESSION['user_id'])) {
  header('location: ../../LoginPage/logout.php');
}
?>
<!DOCTYPE html>
<html>

<head>
  <title>Avengers</title>
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
              <a href="../../Main Pages/movies.php">
                <h4>Movies</h4>
              </a>
              <p> &nbsp; <strong> -> </strong> &nbsp;</p>
              <a href="product.php">
                <h4>Pushpa</h4>
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
            <h1>Pushpa: The Rise - Part 1 (2021)</h1>
          </div>

          <h2>Description</h2>
          <p>Pushpa a labor works for small sum but dreams of living a life of king size he is always let down by his
            step brothers for being illegitimate child of their father.He gets chance to work in dense forest of red
            sanders where red sanders are smuggled to other countries.The labors are always under scanner of DSP
            Govindappa but Pushpa dares to go against everyone creating hurdles for DSP. Pushpa manages to save a
            smuggling consignment worth Crore's under the eye of DSP and becomes known to Reddy Brothers (Konda
            Reddy,Jakka Reddy and Jolly Reddy) known to do smuggling of red sanders.Pushpa manages to smuggle red
            sanders often with his tricks by bluffing DSP and his team and becomes close aide of Konda Reddy.Pushpa
            changes his lifestyle and decides to marry Srivelli but his step brothers disclose his mothers relationship
            with their father thus calling of the marriage.Pushpa who now decides not to stop in reaching heights and
            finds that Mangalam Srinu a syndicate member is giving Reddy gang much lesser share then they deserve and
            asks Konda Reddy to hike profit.Konda Reddy asks Pushpa to take thing sin his hands as his involvement will
            lead to war between the two gangs.A fearless Pushpa decides to take control of things leading to
            disagreements between two gangs.Story of Pushpa Raj, a lorry driver in Seshachalam forests of South India,
            set in the backdrop of red sandalwood smuggling. Red Sandalwood is endemic to South-Eastern Ghats (mountain
            range) of India.</p>
          <h2>Actors</h2>
          <p>Allu Arjun , Fahadh Faasil , Rashmika Mandanna</p>
          <h2>Directors</h2>
          <p>Sukumar</p>
          <h2>Producers</h2>
          <p>Chiranjeevi Pedamallu , K.V.V. Bala Subramanyam , Ravi Shankar Yalamanchili , Naveen Yerneni</p>
          <h2>Writer</h2>
          <p>Sukumar , Srikanth Vissa </p>
          <h2>Release Date</h2>
          <p>16th December 2021</p>
          <h2>Quality</h2>
          <p>Master</p>
          <h2>Genres</h2>
          <p>Action, Crime, Drama, Thriller, Adventure,</p>
          <h2>Trailer:</h2>
          <div class="tutorial-video-container">
            <video width="620" height="350" controls>
              <source src="trailer.mp4" type="video/mp4">
            </video>
          </div>
          <h2>Download from here:</h2>
          <div class="download-button-container">
            <a href="download.php?file=PushpaTheRisePart.1.2021.BRRip" target="_blank" <button> <input type="button"
                name="button" value="Download for free" class="DownloadButton" button></a>
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