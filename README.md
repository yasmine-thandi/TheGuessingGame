# TheGuessingGame

**Team Name: BEJY Developers**

Members of team: Yasmine Thandi, yt2003@my.yorku.ca (Section P, Laboratory 02); Jonathan Trinh, jon0506@my.yorku.ca, (Section P, Laboratory 02); Eric Xu, ericxu12@my.yorku.ca  (Section P, Laboratory 02); Brandon Petherick, branest@my.yorku.ca, (Section P, Laboratory 02).

**Project Description:**

  Our game, “The Guessing Game,” is an app that primarily focuses on the user trying to guess a number that is randomly chosen by the program. The number must be greater than 1. The user will first input how many tries they can have, then the user will be able to guess until the number of tries is 0. There will be hints that will tell the user if they are closer or farther from the correct number every few tries. Once the number of tries is 0, they are congratulated and prompted to enter their name, and are then shown their high score in the app of how many tries it took them to guess the number correctly. If the user does not guess the number correctly, the message “You lose” is displayed on the app screen, otherwise the message “You win” will be displayed if the user guesses the number correctly. They will be asked whether they would like to play the game again regardless of if they lose or win.
   
 **Functional Requirements:**

1.	The first screen that is shown to the user is the title screen which shows the user the name of the game, “The Guessing Game”, and a button named “play” which allows the user to play the game
2.	Users can view their high score of “The Guessing Game” on their mobile device showing both the high score of the Normal and Hard difficulty separately, using android studio
3.	Users can type in a number they wish to guess in a text box/label displayed on the mobile application on the emulator/device
4.	2 buttons are presented on the screen to select the difficulty of the game, which will be “Normal” and “Hard”
5.	Numbers will be randomly generated based on a factor of x, such that depending on what difficulty is chosen, the range of the random number is 1 to Kx, where K is the difficulty and x is the user’s number of guesses 
6.	Users will get a hint every few tries, which will tell the user how far or how close the user is to the number
7.	A validation error message “please type in a number value” will come up if something other than a numerical value is inputted
8.	“The Guessing Game” will redirect the user to an option of playing again after the game has finished
9.	After the game has ended the screen will show the user if they lost or if they won with captions like “You Win!” or “You Lose”
10.	Users are prompted to enter their name which will pop up as an empty textbox 
11.	“The Guessing Game” will terminate after the number of “guesses” runs out from the user’s choice, the number of “guesses” remaining will be displayed throughout the run-time of the game
12.	 An “Exit” button that allows the user to close the app that is shown on the first screen. Throughout the game the user can choose to exit the game as well without completing it. The “Exit” button will also be displayed at the end game screen.
