# CommandLine_Music_Player
🎵 A simple command-line music player built in Java with playlist support, pause/play navigation, and categorized song selection (devotional/movie).

# 🎶 Java Command-Line Music Player

A lightweight and interactive **command-line music player** built using Java. It provides a simple UI in the terminal to play `.wav` files, categorized into playlists such as **Devotional Songs** and **Movie Songs**.

---

## 🚀 Features

- 🎼 **Play All Songs** or select from categories:
  - Devotional Songs
  - Movie Songs
- ▶️ **Play / Pause / Resume** functionality
- ⏪ **Previous** and ⏩ **Next** song navigation
- 📜 **List songs** dynamically
- ❌ **Stop / Exit** anytime
- 🎧 Supports `.wav` audio format

---

## 📷 Sample Interface

Choose a Play List
1-->Play all songs
2-->Devotional songs
3-->Movie songs

[4] << ->PREVIOUS SONG [5] >/|| ->PLAY OR PAUSE [6] >> ->NEXT SONG
[0] X -->STOP/EXIT [1] = -->SONGS LIST
NOW PLAYING -- (Krishna Trance.wav)

---

## 🛠️ Technologies Used

- Java
- Java Sound API (`javax.sound.sampled`)
- Command-Line Interface

---

## 📂 Project Structure

├── MusicPlayer.java
├── Playlist.java
├── Song.java
├── /songs
│ ├── Krishna Trance.wav
│ ├── Hanuman Chalisa.wav
│ └── ...

yaml
Copy
Edit

---

## 📦 How to Run

1. Make sure you have **Java JDK** installed.
2. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/java-music-player.git
   cd java-music-player
Compile the project:

bash
Copy
Edit
javac MusicPlayer.java
Run the player:

bash
Copy
Edit
java MusicPlayer
✅ Ensure that .wav files are placed correctly in the /songs folder.

🗒️ Notes
Only .wav format is supported (Java's native sound API has limited format support).

Built as a fun mini project to explore basic I/O and Java Sound APIs.

📌 Future Improvements
Add support for .mp3 using external libraries like JLayer or JavaFX Media.

GUI version with JavaFX or Swing.

Playlist management (add/remove songs).


![command line interface 1](<Screenshot 2025-07-07 075216.png>) ![command line interface 1](<Screenshot 2025-07-07 075153.png>)

📜 License
This project is open-source and free to use for learning purposes.
