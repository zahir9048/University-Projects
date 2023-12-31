<?php
require("../LoginPage/connection.php");
if (!isset($_SESSION['user_id'])) {
  header('location: ../LoginPage/logout.php');
}
?>
<!doctype html>
<html>

<head>
  <meta charset="utf-8">
  <title>ARZ-Movies</title>
  <link rel="shortcut icon" type="png" href="../meta data/logo3.png">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="./CSS/styles.css">
  <link rel="stylesheet" href="./CSS/bootstrap.min.css">
</head>

<body>
  <div class="page">
    <header class="header1">
      <div id="logocontainer">
        <a href="../meta data/logo3.png" target="_blank"><img id="logo" src="../meta data/logo3.png"
            alt="main logo"></a>
      </div>
      <nav class="header-nav">
        <ul>
          <li>
            <a href="./homepage.php" class="bn3637 bn36">Home</a>
          </li>
          <li>
            <a href="./softwares.php" id="softwares-btn" class="bn3637 bn36">Softwares</a>
          </li>
          <li>

            <a href="./games.php" id="" class="bn3637 bn36">Games</a>
          </li>
          <li>
            <a href="./movies.php" class="bn3637 bn36">Movies</a>
          </li>
        </ul>
      </nav>
      <div class="dropdown">
        <a href="./clear_acc_scr.php" id="btn-account" class="bn3637 bn36 dropbtn">Greetings, <?php echo $_SESSION['fname']; ?></a>
        <div class="dropdown-content main-menu clicky-menu no-js">
          <a href="./clear_acc_scr.php">Account Settings</a>
          <a href="../LoginPage/logout.php">Log Out</a>
        </div>
      </div>
    </header>
    <main class="main-content">
      <section id="offer">
        <h2 class="offer-h2">The Place That Thrives On Entertainment!</h2>
        <p class="offer-p">ALL FOR FREE</p>
      </section>

      <section id="content">


        <div class="sidebar">
          <!-- This adds a sidebar with 1 searchbox,2 menusets, each with 4 links -->

          <div class="navbar-container">
            <div class="navigation">
              <a href="movies.php">
                <h3>Movies</h3>
              </a>
            </div>
          </div>

          <div class="menubar">
            <nav class="menu" id="menu1">
              <h2><!-- Title for menuset 1 -->Trending Softwares </h2>
              <ul>
                <!-- List of links under menuset 1 -->
                <li><a href="../Softwares/Pycharm/product.php" title="Link">PyCharm Pro 2021</a></li>
                <li><a href="../Softwares/Unity/product.php" title="Link">Unity Pro 2019 + Addons + Support
                    Files</a>
                </li>
                <li><a href="../Softwares/Netbeans/product.php" title="Link">NetBeans</a></li>
                <li class="notimp">
                  <!-- notimp class is applied to remove this link from the tablet and phone views --><a
                    href="../Softwares/Intellij2022/product.php" title="Link">IntelliJ IDEA</a>
                </li>
              </ul>
            </nav>
            <nav class="menu" id="menu2">
              <h2><!-- Title for menuset 1 -->Trending Games </h2>
              <ul>
                <!-- List of links under menuset 1 -->
                <li><a href="../Games/Fortnite/product.php" title="Link">Fortnite</a></li>
                <li><a href="../Games/Valorant/product.php" title="Link">Valorant</a></li>
                <li><a href="../Games/NFSRivals/product.php" title="Link">Need For Speed Rivals</a></li>
                <li class="notimp">
                  <!-- notimp class is applied to remove this link from the tablet and phone views --><a
                    href="../Games/CSGO/product.php" title="Link">CS: Global Offensive</a>
                </li>
              </ul>
            </nav>
            <nav class="menu" id="menu3">
              <h2><!-- Title for menuset 1 -->Trending Movies </h2>
              <ul>
                <!-- List of links under menuset 1 -->
                <li><a href="../Movies/JohnWick1/product.php" title="Link">John Wick 2014</a></li>
                <li><a href="../Movies/Avatar/product.php" title="Link">Avatar 2010</a></li>
                <li><a href="../Movies/ManOfSteel/product.php" title="Link">Man Of Steel</a></li>
                <li class="notimp">
                  <!-- notimp class is applied to remove this link from the tablet and phone views --><a
                    href="../Movies/Transporter1/product.php" title="Link">The Transporter 2002</a>
                </li>
              </ul>
            </nav>
          </div>
        </div>
        <div class="product-section">
          <div class="searchbar">
            <div class="search-container">
              <div class="search-box clear-block">
                <input type="search" id="search" class="form-control" placeholder="Search Softwares, Movies & Games">
              </div>
            </div>
          </div>

          <div class="products" id="parent">
            <div class="productInfo box movies"><!-- Each individual product description -->
              <div class="product-img-container">
                <a href="../Movies/3idiots/product.php"><img class="product-img" alt="sample" src="./movies/3idiots.jpg"
                    button></a>
              </div>
              <p class="productContent name"><a href="../Movies/3idiots/product.php">3 Idiots</a></p>
            </div>

            <!--row1 box 2-->
            <div class="productInfo box movies"><!-- Each individual product description -->
              <div class="product-img-container">
                <a href="../Movies/Avengers/product.php"><img class="product-img" alt="sample"
                    src="./movies/avaengers age of ult.jpg" button></a>
              </div>
              <p class="productContent name"><a href="../Movies/Avengers/product.php">Avengers: Age of Ultron</a></p>
            </div>

            <!--row1 box 3-->
            <div class="productInfo box movies"><!-- Each individual product description -->
              <div class="product-img-container">
                <a href="../Movies/Avatar/product.php"><img class="product-img" alt="sample" src="./movies/avatar.jpg"
                    button></a>
              </div>
              <p class="productContent name"><a href="../Movies/Avatar/product.php">Avatar 2010</a></p>
            </div>


            <!--row2 box 1-->
            <div class="productInfo box movies"><!-- Each individual product description -->
              <div class="product-img-container">
                <a href="../Movies/Bahubali/product.php"><img class="product-img" alt="sample"
                    src="./movies/bahubali.png" button></a>
              </div>
              <p class="productContent name"><a href="../Movies/Bahubali/product.php">Baahubali: The Beginning</a></p>
            </div>

            <!--row2 box 2-->
            <div class="productInfo box movies"><!-- Each individual product description -->
              <div class="product-img-container">
                <a href="../Movies/JohnWick1/product.php"><img class="product-img" alt="sample"
                    src="./movies/john wick 1.jpg" button></a>
              </div>
              <p class="productContent name"><a href="../Movies/JohnWick1/product.php">John Wick 2014</a></p>
            </div>

            <!--row2 box 3-->
            <div class="productInfo box movies"><!-- Each individual product description -->
              <div class="product-img-container">
                <a href="../Movies/ManOfSteel/product.php"><img class="product-img" alt="sample"
                    src="./movies/manof steel 2013.jpg" button></a>
              </div>
              <p class="productContent name"><a href="../Movies/ManOfSteel/product.php">Man of Steel 2013</a></p>
            </div>

            <!--row3 box 1-->
            <div class="productInfo box movies"><!-- Each individual product description -->
              <div class="product-img-container">
                <a href="../Movies/Pushpa/product.php"><img class="product-img" alt="sample" src="./movies/pushpa.jpg"
                    button></a>
              </div>
              <p class="productContent name"><a href="../Movies/Pushpa/product.php">Pushpa: The Rise</a></p>
            </div>

            <!--row3 box 2-->
            <div class="productInfo box movies"><!-- Each individual product description -->
              <div class="product-img-container">
                <a href="../Movies/StuartLittle/product.php"><img class="product-img" alt="sample"
                    src="./movies/stuart little.jpg" button></a>
              </div>
              <p class="productContent name"><a href="../Movies/StuartLittle/product.php">Stuart Little</a></p>
            </div>

            <!--row3 box 3-->
            <div class="productInfo box movies"><!-- Each individual product description -->
              <div class="product-img-container">
                <a href="../Movies/Transporter1/product.php"><img class="product-img" alt="sample"
                    src="./movies/transporter 2002.jpg" button></a>
              </div>
              <p class="productContent name"><a href="../Movies/Transporter1/product.php">The Transporter 2002</a></p>
            </div>

          </div>

        </div>
      </section>
    </main>


    <footer class="footer1">
      <div class="footer-links">
        <ul class="footer-main-links">
          <li><a href="./homepage.php">Home</a></li>
          <li><a href="./softwares.php">Softwares</a></li>
          <li><a href="./games.php">Games</a></li>
          <li><a href="./movies.php">Movies</a></li>
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
              <img class="yt-img" src="../meta data/youtube.png" alt="Youtube icon">
            </a>
          </div>
          <div class="img-container">
            <a href="#">
              <img class="tw-img" src="../meta data/twitter.png" alt="Twitter icon">
            </a>
          </div>
          <div class="img-container">
            <a href="#">
              <img class="fb-img" src="../meta data/fb.png" alt="Facebook icon">
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

  <script src="./jquery-3.6.3.min.js"></script>
  <script src="./script.js"></script>
</body>


</html>