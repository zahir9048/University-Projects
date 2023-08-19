import pyttsx3
import speech_recognition as sr
import datetime
import os
import cv2
import random
import requests
import wikipedia
import webbrowser
import pywhatkit as kit
import smtplib
import sys
import pyjokes
import time
from email.mime.multipart import MIMEMultipart
from email.mime.base import MIMEBase
from email.mime.text import MIMEText
from email import encoders
import pyautogui
import PyPDF2
from bs4 import BeautifulSoup
from requests import get
import operator
from PyQt5 import QtWidgets, QtCore, QtGui
from PyQt5.QtCore import QTimer, QTime, QDate, Qt
from PyQt5.QtCore import *
from PyQt5.QtWidgets import *
from PyQt5.QtGui import *
from PyQt5.QtGui import QMovie
from PyQt5.uic import loadUiType
import psutil
import instaloader
import PyQt5
import pyqt5_tools
from GUI.vaUI import Ui_vaUI


engine = pyttsx3.init('sapi5')
voices = engine.getProperty('voices')
engine.setProperty('voices', voices[0].id)
# engine.setProperty('rate', 200)
count_none = 0
count = 0

# text to speech
def speak(audio):
    engine.say(audio)
    print(audio)
    engine.runAndWait()


def wish():
    hour = int(datetime.datetime.now().hour)
    t = time.strftime("%I:%M %p")
    if (hour >= 0 and hour <= 11):
        speak(f"Good Morning. It's {t}")
    elif (hour >= 12 and hour <= 17):
        speak(f"Good Afternoon. It's {t}")
    elif (hour >=18 and hour <=23):
        speak(f"Good Evening. It's {t}")


def news():
    main_url = 'https://newsapi.org/v2/top-headlines?sources=techcrunch&apiKey=7a5874d916c944d4b7608a9b74db3fa6'
    main_page = requests.get(main_url).json()
    articles = main_page["articles"]
    head = []
    day = ["first", "second", "third", "fourth", "fifth"]
    for article in articles:
        head.append(article["title"])
    speak("Here is today's some important news headlines...")
    for i in range(len(day)):
        speak(f"Today's {day[i]} news headline is: {head[i]}.")


def pdf_reader():
    b_path = 'D:\\Books\\python.pdf'
    book = open(b_path, 'rb')
    pdfReader = PyPDF2.PdfFileReader(book)
    pages = pdfReader.numPages
    speak(f"Reading the pdf book from directory{b_path}")
    speak(f"The total number of pages in the book is {pages}")
    speak("Please type the page number in terminal that i have to read...")
    pg_num = int(input("Type page number here: "))
    page = pdfReader.getPage(pg_num - 1)
    text = page.extractText()
    # text.setProperty('rate', 400)
    time.sleep(3)
    speak(f"Reading the page number {pg_num}...")
    time.sleep(1)
    speak(text)


class MainThread(QThread):
    def __init__(self):
        super(MainThread, self).__init__()


    def run(self):
        wish()
        self.startExecution()
        while True:
            self.query = self.keepRunning()
            if "wake up" in self.query or "are you there" in self.query or "hello" in self.query:
                self.startExecution()
            elif "goodbye" in self.query or "stop" in self.query or "bye" in self.query:
                speak("Okay, have a great day... ;)")
                sys.exit(0)
            else:
                self.query = ""
                pass


    @property
    def takeCommand(self):
        r = sr.Recognizer()
        with sr.Microphone() as source:
            print("Listening...")
            r.pause_threshold = 1
            # audio = r.listen(source, timeout=2, phrase_time_limit=7)
            #r.adjust_for_ambient_noise(source)
            audio = r.record(source, duration=7)
        try:
            print("Recognizing...")
            query = r.recognize_google(audio, language='en-in')
            print(f"User said: {query}")
            global count_none
            count_none = 0

        except Exception as e:
            global var
            global flag
            count_none += 1
            if count_none <= 4:
                speak("Couldn't hear... say it again please...")
                flag = 2
                var = 0
                return "null"
            else:
                speak("No response from user, going to sleep...")
                while True:
                    self.query = self.keepRunning()
                    if "wake up" in self.query or "are you there" in self.query or "hello" in self.query or "hi" in self.query:
                        count_none = 0
                        self.startExecution()
                    elif "goodbye" in self.query or "bye" in self.query:
                        speak("Okay, have a great day... ;)")
                        sys.exit(0)
                    else:
                        self.query = ""
                        pass

        query = query.lower()
        return query


    def keepRunning(self):
        r = sr.Recognizer()
        with sr.Microphone() as source:
            print("Listening silently...")
            r.pause_threshold = 1
            audio = r.record(source, duration=10)
        try:
            print("Recognizing...")
            query = r.recognize_google(audio, language='en-in')
            print(f"User said: {query}")

        except Exception as e:
                return "null"

        query = query.lower()
        return query


    def startExecution(self):

        global count
        count += 1

        if count < 2:
            speak("I am your Virtual Assistant. How can i help you Sir?")
        else:
            speak("Welcome back Sir. How can i help you?")

        while True:
            global var
            global flag
            flag = 0
            var = 1
            self.query = self.takeCommand


            if "hello" in self.query:
                speak("hello, how are you today?")
                flag = 2


            elif "how are you" in self.query:
                speak("im fine, how are you doing ?")
                flag = 2


            elif "i am good" in self.query or "i am great" in self.query:
                speak("That's great... May i help you with something?")
                flag = 2


            elif "i am fine" in self.query:
                speak("You don't seem okay...May i help you with something?")
                flag = 2


            elif "i am not ok" in self.query or "i am not okay" in self.query or "not good" in self.query:
                speak("Why, what happened?")
                self.query3 = self.takeCommand
                speak("That's bad, let me cheer you up...wanna hear a joke?")
                self.query3 = self.takeCommand
                if "yes" in self.query3 or "yeah" in self.query3:
                    joke = pyjokes.get_joke()
                    speak(joke)
                    time.sleep(4)
                    speak("Anyways, may i help you with something?")
                    flag = 2

                else:
                    speak("okay, may i help you with something?")
                    flag = 2


            elif "what" in self.query and "tasks" in self.query:
                speak("These are the following tasks that i can perform:")
                speak("Open Notepad")
                speak("Open Google Chrome")
                speak("Open Command Prompt")
                speak("Play music from computer folder")
                speak("Open webcam")
                speak("Show you your IP Address")
                speak("Search a query in WikiPedia")
                speak("Open YouTube")
                speak("Open Instagram")
                speak("Open CMS")
                speak("Open Facebook")
                speak("Search a query on Google")
                speak("Open WhatsApp")
                speak("Send a message on WhatsApp")
                speak("Play any song on YouTube")
                speak("Set volume up, down or mute")
                speak("Crack some jokes")
                speak("Send an email with file attached too")
                speak("Perform 2 number calculations")
                speak("Fetch latest news headlines to you")
                speak("Fetch your current location")
                speak("Search a profile in Instagram using username")
                speak("Take Screenshot of window")
                speak("Read PDF Book by audio output")
                speak("Fetch current temperature")
                speak("Shutdown, restart or Sleep the computer")
                time.sleep(2)
                speak("That's all... What do you want me to do now?")
                flag = 2


            # logic for different tasks
            elif "open" in self.query and "notepad" in self.query in self.query:
                speak("Opening notepad...")
                npath = "C:\\WINDOWS\\system32\\notepad.exe"
                os.startfile(npath)
                flag = 1

            elif "open" in self.query and "google" in self.query and "chrome" in self.query:
                speak("Opening Google Chrome...")
                cpath = "C:\\Program Files\\Google\Chrome\\Application\\chrome"
                os.startfile(cpath)
                flag = 1

            elif "open command prompt" in self.query or "open cmd" in self.query:
                speak("Opening Command Prompt...")
                os.system("start cmd")
                flag = 1

            elif "play" in self.query and "song" in self.query and "youtube" in self.query:
                speak("Which song you want to play?")
                song = self.takeCommand
                speak(f"Playing {song} on Youtube...")
                kit.playonyt(song)
                flag = 1

            elif 'play' in self.query and 'music' in self.query:
                music_dir = "D:\\Music"
                speak("Playing random Music from music folder...")
                songs = os.listdir(music_dir)
                rd = random.choice(songs)
                for song in songs:
                    if song.endswith('.mp3'):
                        os.startfile(os.path.join(music_dir, song))
                flag = 1


            elif 'open' in self.query and 'camera' in self.query:
                speak("Opening Camera , please wait a moment...")
                cam = cv2.VideoCapture(0)
                while True:
                    ret, img = cam.read()
                    cv2.imshow('webcam', img)
                    k = cv2.waitKey(50)
                    print(k)
                    if k == 27:
                        break;
                cam.release()
                cv2.destroyAllWindows()
                flag = 1


            elif 'what' in self.query and "ip address" in self.query:
                ip = get('https://api.ipify.org').text
                speak(f"Your IP Address is: {ip}")
                flag = 1

            elif "wikipedia" in self.query:
                speak("Searching Wikipedia...")
                q = self.query.replace("wikipedia", "")
                result = wikipedia.summary(q, sentences=2)
                speak("According to WikiPedia...")
                speak(result)
                flag = 1

            elif "open" in self.query and "youtube" in self.query:
                speak("Opening Youtube...")
                webbrowser.open("https://www.youtube.com")
                flag = 1

            elif "open" in self.query and "instagram" in self.query or ('instagram' in self.query):
                speak("Opening Instagram...")
                webbrowser.open("https://www.instagram.com")
                flag = 1

            elif "open cms" in self.query:
                speak("Opening cms...")
                webbrowser.open("https://edusmartz.ssuet.edu.pk/StudentPortal/Login")
                flag = 1

            elif "open" in self.query and "facebook" in self.query:
                speak("Opening Facebook...")
                webbrowser.open("https://www.facebook.com")
                flag = 1

            elif "open google" in self.query or ("search" in self.query and "google "in self.query):
                speak("What should i search on google?")
                search = self.takeCommand
                speak(f"Searching Google for {search}...")
                webbrowser.open(f"{search}")
                flag = 1

            elif "open" in self.query and "whatsapp" in self.query:
                speak("Opening WhatsApp...")
                webbrowser.open("https://web.whatsapp.com")
                flag = 1


            elif "send message on whatsapp" in self.query or ("message" in self.query and "whatsapp" in self.query):
                speak("Message will be sent to ammi")
                speak("Whats the message sir?")
                msg = self.takeCommand
                speak("Type the time in terminal to send message please.")
                hour = int(input("Enter Hour(24 hour format): "))
                mins = int(input("Enter Mins: "))
                ammi = "+923332456346"
                s = kit.sendwhatmsg(ammi, msg, hour, mins)
                time.sleep(60)
                speak("Message has been sent to ammi.")
                flag = 1

            elif "volume" in self.query and "increase" in self.query:
                pyautogui.press("volumeup")
                flag = 1

            elif "volume" in self.query and "decrease" in self.query:
                pyautogui.press("volumedown")
                flag = 1

            elif "volume" in self.query and "mute" in self.query:
                pyautogui.press("volumemute")
                flag = 1

            elif "close" in self.query and "notepad" in self.query:
                speak("Closing notepad...")
                os.system("taskkill /f /im notepad.exe")
                flag = 1

            elif "joke" in self.query:
                joke = pyjokes.get_joke()
                speak(joke)
                flag = 1

            elif "send" in self.query and "email" in self.query:
                try:
                    # speak("What is the email address: ")
                    # recipient = takeCommand().lower()
                    speak("Say the message: ")
                    query2 = self.takeCommand
                    if "send" in query2 and "file" in query2:
                        email = "zahir9048@gmail.com"
                        password = "ulpwoepjrmgkszvj"
                        speak("Please type the recipient email in terminal.")
                        recipient = input("Type the recipient email: ")
                        speak("What is the subject for the email?")
                        subject = self.takeCommand

                        speak("What is the message for the email?")
                        message = self.takeCommand

                        speak("Please type the path of the file which you want to send in terminal window.")
                        f_path = input("Enter path here: ")
                        speak("Please wait a moment, sending email now...")
                        msg = MIMEMultipart()
                        msg['From'] = email
                        msg['To'] = recipient
                        msg['Subject'] = subject
                        msg.attach(MIMEText(message, 'plain'))

                        # setup attachment
                        filename = os.path.basename(f_path)
                        attachment = open(f_path, "rb")
                        part = MIMEBase('application', 'octet-stream')
                        part.set_payload(attachment.read())
                        encoders.encode_base64(part)
                        part.add_header('Content-Disposition', "attachment; filename = %s" % filename)

                        # attach the Attachment to MIMEMultipart object
                        msg.attach(part)

                        server = smtplib.SMTP('smtp.gmail.com', 587)
                        server.starttls()
                        server.login(email, password)
                        text = msg.as_string()
                        server.sendmail(email, recipient, text)
                        server.quit()
                        speak("Email has been sent.")

                    else:
                        email = "zahir9048@gmail.com"
                        password = "ulpwoepjrmgkszvj"
                        speak("Type the recipient email in terminal.")
                        recipient = input("Type the recipient email: ")
                        message = query2
                        server = smtplib.SMTP('smtp.gmail.com', 587)
                        server.starttls()
                        server.login(email, password)
                        speak("Sending email...")
                        server.sendmail(email, recipient, message)
                        server.quit()
                        speak("Email has been sent.")

                except Exception as e:
                    print(e)
                flag = 1

            elif "calculations" in self.query or "calculate" in self.query:
                try:
                    r = sr.Recognizer()
                    with sr.Microphone() as source:
                        speak("Say what do you want to calculate, example: 49 + 5")
                        print("Listening...")
                        r.adjust_for_ambient_noise(source)
                        audio = r.listen(source)
                    my_string = r.recognize_google(audio)
                    print(my_string)

                    def get_operator(op):
                        return{
                            '+': operator.add, #plus
                            '-': operator.sub, #minus
                            'x': operator.mul, #multiply by
                            '/': operator.__truediv__, #divide by
                        }[op]

                    def evaluate(num1, op, num2):
                        num1, num2 = int(num1), int (num2)
                        return get_operator(op)(num1, num2)

                    res = evaluate(*(my_string.split()))
                    speak(f"Your result is: {res}")


                except Exception as e:
                    print(e)
                    speak("Couldn't get what you said, sorry...")
                    pass
                flag = 1

            elif ("tell me" in self.query and "news" in self.query) or "news" in self.query:
                speak("Please wait, fetching the latest news...")
                news()
                flag = 1

            elif ("where" in self.query and "am" in self.query and "i" in self.query) or "location" in self.query:
                speak("Wait, let me check...")
                try:
                    ipAddress = requests.get('https://api.ipify.org').text
                    url = 'https://get.geojs.io/v1/ip/geo/' + ipAddress + '.json'
                    geo_requests = requests.get(url)
                    geo_data = geo_requests.json()
                    city = geo_data['city']
                    country = geo_data['country']
                    speak(f"We are in {city}, {country} right now.")

                except Exception as e:
                    speak("Sorry, due to network issue I am unable to find where we are.")
                    pass
                flag = 1

            elif "instagram" in self.query and "profile" in self.query:
                speak("Please type the instagram username correctly in terminal.")
                insta_uname = input("Type username here: ")
                webbrowser.open(f'https://www.instagram.com/{insta_uname}')
                speak(f"Here is the user {insta_uname} profile.")
                time.sleep(7)
                flag = 1

            elif "screen shot" in self.query or "screenshot" in self.query:
                speak("Hold on a second, taking screenshot...")
                img = pyautogui.screenshot()
                speak("Screenshot taken, please type the name of screenshot file in terminal.")
                ss_name = input("Type the screenshot name here: ")
                img.save(f"{ss_name}.png")
                time.sleep(3)
                speak("Screenshot is saved in your main folder.")
                flag = 1

            elif "read pdf" in self.query or "pdf" in self.query:
                speak("okay, please wait a moment...")
                pdf_reader()
                flag = 1

            elif "temperature" in self.query:
                speak("okay, let me check...")
                search = "temperature in karachi"
                url = f"https://www.google.com/search?q={search}"
                r = requests.get(url)
                data = BeautifulSoup(r.text, "html.parser")
                temp = data.find("div", class_="BNeawe").text
                speak(f"Current {search} is {temp}")
                flag = 1

            elif "thanks" in self.query or "thank you" in self.query:
                speak("Your welcome")
                speak("May i help you with something else?")
                flag = 2

            elif "shutdown system" in self.query or ("shutdown" in self.query and "computer" in self.query):
                speak("Shutting down Computer...")
                os.system("shutdown /s /t 5")
                flag = 1

            elif "restart system" in self.query or ("restart" in self.query and "computer" in self.query):
                speak("Restarting Computer...")
                os.system("shutdown /r /t 5")
                flag = 1

            elif "sleep system" in self.query or ("sleep" in self.query and "computer" in self.query):
                speak("Putting Computer to sleep...")
                os.system("rundll32.exe powrprof.dll, SetSuspendState 0, 1, 0")
                flag = 1

            elif "no you can sleep" in self.query or "sleep" in self.query:
                speak("Going to sleep, say wake up to wake me up...")
                break;

            elif "stop" in self.query or "goodbye" in self.query or "bye" in self.query:
                speak("Okay, have a great day... ;)")
                sys.exit(0)

            else:
                if var != 0:
                    speak("I am sorry i couldn't understand. Please say another query.")

            if flag == 1:
                speak("Sir, do you have any other work? ")

            elif flag == 2:
                pass


class Main(QMainWindow):

    def __init__(self):
        super().__init__()
        self.ui = Ui_vaUI()
        self.ui.setupUi(self)
        self.ui.pushButton.clicked.connect(self.startTask)
        self.ui.pushButton_2.clicked.connect(self.close)

    def startTask(self):
        self.ui.movie = QtGui.QMovie("C:/Users/CC/PycharmProjects/VoiceAssistant/GUI/GIFs/circle.gif")
        self.ui.label.setMovie(self.ui.movie)
        self.ui.movie.start()

        timer = QTimer(self)
        timer.timeout.connect(self.showTime)
        timer.start(1000)

        startExecution.start()

    def showTime(self):
        current_time = QTime.currentTime()
        current_date = QDate.currentDate()
        label_date = current_date.toString('dd-MM-yyyy')
        label_time = current_time.toString('hh:mm:ss')
        label_time = "  " + label_time
        self.ui.textBrowser.setText(label_date)
        self.ui.textBrowser_2.setText(label_time)


startExecution = MainThread()


app = QApplication(sys.argv)
VirtualAssistant = Main()
VirtualAssistant.show()
VirtualAssistant.setWindowTitle("Voice Assistant")
exit(app.exec_())