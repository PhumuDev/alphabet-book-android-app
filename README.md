# alphabet-book-android-app
The Alphabet Book App is a simple educational application that helps users explore the alphabet through interactive pages for each letter. It allows users to navigate through the letters of the alphabet and view corresponding images associated with each letter.

## Features
- Users can navigate through the alphabet using buttons for each letter.
- Each letter page displays an image associated with the letter.
- Users can move to the next or previous letter using dedicated buttons.
- The app remembers the last viewed letter and opens the corresponding page on launch.

## Installation
### Option 1
1. Clone or download the repository to your local machine.
2. Open the project in Android Studio.
3. Build and run the app on an Android emulator or physical device.

# Option 2
1. Install the apk file on an Android phone
2. Run the app
   
## Usage
1. Launch the app.
2. The main page displays buttons for each letter of the alphabet.
3. Click on a letter button to open the corresponding letter page.
4. On the letter page, you can see the image associated with the letter.
5. Use the "Next" and "Previous" buttons to navigate through the alphabet pages.
6. The "First" and "Last" buttons take you to the first and last letter pages, respectively.

## Implementation Details
The app is implemented in Kotlin using the Android development framework. It consists of two main activities:

### MainActivity
Displays the buttons for each letter. Users can click on a letter button to open the corresponding letter page.

### LetterActivity
Displays the image associated with the selected letter. Users can navigate to the next or previous letter pages using buttons.

The app uses SharedPreferences to remember the last opened letter page and the last viewed letter. This information is used to maintain the app's state between launches.
