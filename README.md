# TicToc


## Problem Definition

❖	We consider a computer program playing Tic Tac Toe game with a human. The program tries its best to win the game.

❖This game is well known in France under the name of " jeu du morpion ".


## Contributors


|  [![Kwadwo Busumtwi](https://avatars3.githubusercontent.com/u/10486306?v=4&s=200)](https://github.com/supasheva) | [![Girilakshmi](https://avatars3.githubusercontent.com/u/679275?v=4&s=200)](https://github.com/girilakshmi)  | [![Abir](https://avatars3.githubusercontent.com/u/679275?v=4&s=200)](https://github.com/AbirBenSalem) | [![Sandeep](https://avatars3.githubusercontent.com/u/679275?v=4&s=200)](https://github.com/sanddyy10) 

## Rules of the game :

❖	The goal is to be able to line up three circles or three crosses in a grid of 3 out of 3.

❖	Players choose one of the elements, and play alternately.

❖	The game ends when one of the players has succeeded in aligning three elements, or when the 9 boxes have been filled.
Given the advantage given to the player who starts the game, it is recommended to play several rounds, by varying the player who starts.

## Project scope

❖	There will be a square game board divided into nine tiles spaces. 

❖	The player selects either an "X" or an "O" on one of the grid spaces using keyboard keys. 

❖	The game is over when one player claims 3 grid spaces in a row or there are no moves left.

❖	First both the players are humans and then the first player is human and second player will be computer.

❖	Game can be continue from the previous paused session(History of game is available)

❖	Keyboard keys are replaced with mouse clicks for the game play. 

❖	So now when the player clicks on one of the grid spaces, it will be assigned either an "X" or an "O"

## Installation instructions

To compile and run the files in the src folder you need to have `java` set up on your machine 

1.  [Fork](https://help.github.com/articles/fork-a-repo/) the project, clone your fork:

    ```
    # Clone your fork
    git clone https://github.com/<your-username>/TicToc.git

    # Navigate to the newly cloned directory
    cd TicToc/src
    
    #compile and run the console game code
    
    javac TicTocConsole.java
    java TicTocConsole
    
    #compile and run the gui game code
    
     javac TicTocGUI.java
     java TicTocGUI

    ```

## Testing instructions

This project makes use of Junit 4.13 for testing

   ```
    # Navigate to the test directory
    cd TicToc/tests
    
    #run the shell script
      ./test.sh
     ```
