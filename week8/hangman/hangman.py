# Hangman Game
# Colton Northcutt
# 26 November 2018

import random
def hangmanStart():
    HANGMAN = ("""
    ------------
    |         |
    |
    |
    |
    |
    |
    |
    |
    |
    -------------
    """,
    """
    ------------
    |         |
    |         O
    |
    |
    |
    |
    |
    |
    |
    -------------
    """,
    """
    ------------
    |         |
    |         O
    |         |
    |         |
    |
    |
    |
    |
    |
    -------------
    """,
    """
    ------------
    |         |
    |         O
    |         |/
    |         |
    |
    |
    |
    |
    |
    -------------
    """,
    """
    ------------
    |         |
    |         O
    |        \|/
    |         |
    |
    |
    |
    |
    |
    -------------
    """,
    """
    ------------
    |         |
    |         O
    |        \|/
    |         |
    |        /
    |
    |
    |
    |
    -------------
    """,
    """
    ------------
    |         |
    |         O
    |        \|/
    |         |
    |        / \ 
    |
    |
    |
    |
    -------------
    """
    )

    MAX_WRONG = len(HANGMAN) - 1

    WORDS = ("PYTHON", "STRING", "LIST", "VARIABLE", "FLOAT", "INPUT", "FUNCTION", "PRINT", "INTEGER", "WHILE")
    # Chooses the random word to guess
    word = random.choice(WORDS)
    soFar = "-" * len(word) # one dash for each letter
    wrong = 0 # number of wrong guesses the player has made
    used = [] # letters already guessed
    print("Welcome to hangman. Good Luck!")
    hangmanPlay(HANGMAN, MAX_WRONG, word, soFar, wrong, used)


def hangmanPlay(HANGMAN, MAX_WRONG, word, soFar, wrong, used):
    while wrong < MAX_WRONG and soFar != word:
        print(HANGMAN[wrong])
        print("You used the following letters:\n", used)
        print("\nSo far the word is:", soFar)

        guess = input("\n\nEnter your guess: ").upper()
        while not guess.isalpha() or len(guess) != 1:
            print("You can only enter one letter.")
            guess = input("\n\nEnter your guess: ").upper()
        while guess in used:
            print("You have alredy guessed thae letter", guess)
            guess = input("Enter your guess: ").upper()
        used.append(guess)

        if guess in word:
            print("\nYes!", guess, "is in the word!")
            new = ""

            for i in range(len(word)):
                if guess == word[i]:
                    new += guess
                else:
                    new += soFar[i]
            soFar = new
        else:
            print("\nSorry,", guess, "isn't in the word.")    
            wrong += 1
    hangmanWinLoose(wrong, MAX_WRONG, HANGMAN, word)


def hangmanWinLoose(wrong, MAX_WRONG, HANGMAN, word):
    if wrong == MAX_WRONG:
        print(HANGMAN[wrong])
        print("\n You have been hanged!")
    else:
        print("\nYou guessed it!")

    print("\nThe word was", word)
    input("\n\nPress enter to exit")



hangmanStart()