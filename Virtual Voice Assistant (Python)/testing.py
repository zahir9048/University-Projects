import pyttsx3
import speech_recognition as sr

engine = pyttsx3.init('sapi5')
voices = engine.getProperty('voices')
engine.setProperty('voices', voices[0].id)


# text to speech
def speak(audio):
    engine.say(audio)
    print(audio)
    engine.runAndWait()


# voice to text
def takecommand():
    r = sr.Recognizer()
    with sr.Microphone() as source:
        print("listening...")
        with sr.Microphone() as source:
            audio = r.record(source, duration=4)
    try:
        print("Recognizing...")
        query = r.recognize_google(audio, language='en-in')
        print(f"user said: {query}")

    except Exception as e:
        speak("Say it again please...")
        return "none"
    return query

if __name__ == "__main__":
    while True:

        query = takecommand().lower()

        # logic for different tasks
        if "hello"  in query and "greet" in query:
            print("success")

        elif "send file" in query:
            print("success 2")

        elif "bye" in query:
            break;