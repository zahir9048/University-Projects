<?php
require("../../LoginPage/connection.php");
if (!isset($_SESSION['user_id'])) {
  header('location: ../../LoginPage/logout.php');
}
?>
<!DOCTYPE html>
<html>

<head>
  <title>Visual Studio Code</title>
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
                <h4>Home</h4>
              </a>
              <p> &nbsp; <strong> -> </strong> &nbsp;</p>
              <a href="product.php">
                <h4>Microsoft Office</h4>
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
            <h1>Visual Studio Code Free Download</h1>
          </div>

          <p style="margin: 0 !important;">Visual Studio Code Free Download Latest Version for Windows. It is full
            offline installer standalone setup of Visual Studio Code.</p>
          <h2>Visual Studio Code Overview</h2>
          <p>Visual Studio Code is a light-weight yet powerful code editing program used for code compiling, building or
            debugging the Web applications. It provides the web
            developers with a new choice of developing tool that combines the simplicity and streamlined experience of a
            code editor with the best of what developers need
            for their code editing and debugging. This code editor is a fully featured integrated development
            environment (IDE) designed for developers working with Microsoft’s
            open cloud technologies. The application comes with a simple and intuitive interface based on a common
            explorer style with a panel on the showing all the files and
            folders you want to access. It facilitates the testing, building, packaging and even the deployment of
            various types of software. You can create several tasks within
            Visual Studio Code, save them in the desired project and quickly configure it by establishing the proper
            arguments. You can also download
            <a href="#">Microsoft Visual Studio 2017 Team Foundation Server Free Download.</a>
          </p>
          <div class="product-img">
            <img src="VSC1.jpg" alt="office" style="width: 50%; height: 100%;">
          </div>

          <p>Visual Studio Code is a cross-platform development and first code editor tool supporting OSX, Linux and
            Windows. It can export projects as text files and it works with
            multiple programming languages including C++, C#, Clojure, F#, HTML, JSON, Java,Lua, PHP, Perl, Python, SQL,
            Visual Basic, XML and many others. The program offers interesting
            debugging features and lets you open several instances at the same time and features a flexible workflow
            that can be split in two. This features facilitates the code comparison
            allowing you to visually identify issues. It also features a powerful searching engine allowing you to find
            components, files, programs or any same matching item. When it comes
            to debugging, the program helps you monitor variables and components allowing you to control the Call Stack
            and define breakpoints. Moreover, the application supports the usage
            of snippets, a feature that can help you remarkably minimize the time spent while writing codes. You can
            easily launch the loaded application or attach the selected code to the
            main script. All in all, Visual Studio Code is an amazing code editor optimized for building and debugging
            modern web and cloud applications. You can also download
            <a href="#">Bitwig Studio Free Download.</a>
          </p>
          <div class="product-img">
            <img src="VSC2.jpg" alt="office" style="width: 60%; height: 90%;">
          </div>
          <h2>Features of Visual Studio Code</h2>
          <p>Below are some noticeable features which you will experience after Visual Studio Code free download.</p>
          <ul>
            <li>Powerful code editing program used for code compiling, building or debugging the Web applications.</li>
            <li>Facilitates the testing, building, packaging and even the deployment of various types of software.</li>
            <li>Export projects as text files.</li>
            <li>Supports a wide range of programming languages including C++, C#, Clojure, F#, HTML, JSON, Java,Lua,
              PHP, Perl, Python, SQL, Visual Basic, XML etc.</li>
            <li>Visualization code makes it easier for biginners.</li>
            <li>Supports batch processing.</li>
            <li>Good documentation to help you get going.</li>
            <li>Git support and debugging features.</li>
            <li>Quickly compile the program you load.</li>
          </ul>
          <div class="product-img">
            <img src="VSC3.jpg" alt="office" style="width: 60%; height: 90%;">
          </div>
          <h2>Visual Studio Code Technical Setup Details</h2>
          <p>Prior to start Visual Studio Code Free download, ensure the availability of the below listed system
            specifications.</p>
          <ul>
            <li>Software Full Name: Visual Studio Code</li>
            <li>Setup File Name: Visual_Studio_Code_1.41.0.rar</li>
            <li>Setup Size: 112 MB</li>
            <li>Setup Type: Offline Installer / Full Standalone Setup</li>
            <li>Compatibility Mechanical: 32 Bit (x86) / 64 Bit (x64)</li>
            <li>Latest Version Release Added On: 06th Jan 2020</li>
            <li>Developers: <a href="#" target="_blank" rel="noopener">Visual Studio Code</a></li>
          </ul>
          <div class="product-img">
            <img src="VSC4.jpg" alt="office" style="width: 60%;height: 90%;">
          </div>
          <h2>System Requirements for Visual Studio Code</h2>
          <ul>
            <li>Operating System: Windows-7/8/8.1/10</li>
            <li>RAM: 1 GB</li>
            <li>Hard Disk: 200 MB</li>
            <li>Processor: 1.6 GHz Processor</li>
            <li>.NET Framework 4.5.2</li>
          </ul>
          <h2>Visual Studio Code Free Download</h2>
          <p>Click on the below button to start Visual Studio Code Free Download. This is full offline
            installer and standalone setup for Windows Operating System.</p>
          <div class="download-button-container">
            <a href="download.php?file=Microsoft VS Code" target="_blank" <button> <input type="button" name="button"
                value="Download for free" class="DownloadButton" button></a>
          </div>

          <div style="margin: 1.5rem 0 1rem 0 !important;">
            <strong>
              <p>Here is the video of how to install this software after downloading:</p>
            </strong>
          </div>

          <div class="tutorial-video-container">
            <video width="620" height="350" controls>
              <source src="VSCtutorial.mp4" type="video/mp4">
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