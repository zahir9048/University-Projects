<?php
require("../../LoginPage/connection.php");
if (!isset($_SESSION['user_id'])) {
  header('location: ../../LoginPage/logout.php');
}
?>
<!DOCTYPE html>
<html>

<head>
  <title>Visual Studio 2022</title>
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
                <h4>Visual Studio</h4>
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
            <h1>Microsoft Visual Studio 2022 All in One Free Download</h1>
          </div>

          <p style="margin: 0 !important;">Microsoft Visual Studio 2022 All in One Free Download. It is full offline
            installer standalone setup of Microsoft
            Visual Studio 2022.Microsoft Visual Studio 2022 All in One Free Download. It is full offline installer
            standalone setup of Microsoft Visual Studio 2022.</p>
          <h2>Microsoft Visual Studio 2022 All in One Overview</h2>
          <p>Microsoft Visual Studio 2022 All in One is really an all-in-one and full-featured IDE which comes loaded
            with all the essential tools you need to create
            innovative applications.It is the ultimate suite which enables you to easily build the projects including
            software solutions, graphical user interfaces and
            console apps. It is a multi-platform application which enables developers to develop computer programs, as
            well as websites, web apps, web services, Windows
            Forms applications, ASP.NET applications, and mobile apps.It offers support for web, cloud, mobile, and game
            development.It supports almost all the popular
            programming languages such as Visual C++, Visual Basic, and Visual C# and many more.This great tool offers a
            neat and clean interface with self-explaining
            tools making it easier to work with even bigger projects and more complex workloads. You can also
            personalize your IDE so you can code the way you want.
            You can also download <a href="#">Microsoft .NET Framework 2021 Free Download.</a></p>
          <div class="product-img">
            <img src="VS1.jpg" alt="office" style="width: 50%; height: 100%;">
          </div>

          <p>Microsoft Visual Studio 2022 All in One is an excellent IDE for building applications that have visually
            stunning user experiences, seamless and secure
            communication.The latest version offers a powerful set of automatic code completion tools that understand
            your code context such as variable names, functions,
            and the type of code you’re writing. It gives you complete control for your workspace, including your
            layout, fonts, themes, icons, menus, custom notifications,
            and update schedule.It can instantly provide the necessary code with libraries, classes and templates needed
            by programmers to seamlessly put together desktop
            apps and web services by simply calling the code, instead of having to write everything from scratch.It
            includes a powerful built-in debugger that can be used
            both as a source-level and as a machine-level one which offers a perfect solution for any problem that may
            arise during the creation of applications. The program
            also allows you to jump back to specific lines of code instead of restarting sessions or manually recreate
            your app’s state. It also has the ability to import and
            export data from different types of databases, including Oracle Database and Microsoft Structured Query
            Language (SQL) Server. You can also download
            <a href="#">Programming IDE for Arduino Free Download.</a>
          </p>
          <div class="product-img">
            <img src="VS2.jpg" alt="office" style="width: 60%; height: 90%;">
          </div>
          <h2>Microsoft Visual Studio 2022 All in One Features</h2>
          <p>Below are some noticeable features which you will experience after Microsoft Visual Studio 2022 All in One
            Free Download</p>
          <ul>
            <li>Full-featured IDE which comes loaded with all the essential tools you need to create innovative
              applications.</li>
            <li>Enables you to easily build the projects including software solutions, graphical user interfaces and
              console apps.</li>
            <li>Develop computer programs, as well as websites, web apps, web services, Windows Forms applications,
              ASP.NET applications, and mobile apps.</li>
            <li>Offers support for web, cloud, mobile, and game development.</li>
            <li>Supports almost all the popular programming languages such as Visual C++, Visual Basic, and Visual C#
              and many more.</li>
            <li>Offers a neat and clean interface with self-explaining tools making it easier to work with even bigger
              projects and more complex workloads.</li>
            <li>Excellent IDE for building applications that have visually stunning user experiences, seamless and
              secure communication.</li>
            <li>Provides automatic code completion tools that understand your code context such as variable names,
              functions, and the type of code you’re writing.</li>
            <li>Gives you complete control for your workspace, including your layout, fonts, themes, icons, menus,
              custom notifications, and update schedule.</li>
            <li>Provides the necessary code with libraries, classes and templates needed by programmers to seamlessly
              put together desktop apps and web services.</li>
            <li>Allows you to jump back to specific lines of code instead of restarting sessions or manually recreate
              your app’s state.</li>
            <li>Ability to import and export data from different types of databases, including Oracle Database and
              Microsoft Structured Query Language (SQL) Server.</li>
          </ul>
          <div class="product-img">
            <img src="VS3.jpg" alt="office" style="width: 60%; height: 90%;">
          </div>
          <h2>Microsoft Visual Studio 2022 All in One Technical Setup Details</h2>
          <p>Prior to start Microsoft Visual Studio 2022 All in One Free Download, ensure the availability of the below
            listed system specifications</p>
          <ul>
            <li>Software Full Name: Microsoft Visual Studio 2022 All in One</li>
            <li>Setup File Name: VS2022_2.rar</li>
            <li>Setup Size: 28 GB</li>
            <li>Setup Type: Offline Installer / Full Standalone Setup</li>
            <li>Compatibility Mechanical: 32 Bit (x86) / 64 Bit (x64)</li>
            <li>Latest Version Release Added On: 04th Jun 2022</li>
            <li>Developers: <a href="#" target="_blank" rel="noopener">Microsoft</a></li>
          </ul>
          <div class="product-img">
            <img src="VS4.jpg" alt="office" style="width: 60%;height: 90%;">
          </div>
          <h2>System Requirements for Microsoft Visual Studio 2022 All in One</h2>
          <ul>
            <li>Operating System: Windows XP/Vista/7/8/8.1/10</li>
            <li>RAM: 2 GB</li>
            <li>Hard Disk: 30 GB</li>
            <li>Processor: Intel Dual Core or higher processor</li>
          </ul>
          <h2>Microsoft Visual Studio 2022 All in One Free Download</h2>
          <p>Click on the link below to start the Microsoft Visual Studio 2022 All in One Free Download.
            This is a full offline installer standalone setup for Windows Operating System. This would be compatible
            with both 32 bit and 64 bit windows.</p>
          <div class="download-button-container">
            <a href="download.php?file=VisualStudio2019" target="_blank" <button> <input type="button" name="button"
                value="Download for free" class="DownloadButton" button></a>
          </div>

          <div style="margin: 1.5rem 0 1rem 0 !important;">
            <strong>
              <p>Here is the video of how to install this software after downloading:</p>
            </strong>
          </div>

          <div class="tutorial-video-container">
            <video width="620" height="350" controls>
              <source src="VStutorial.mp4" type="video/mp4">
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