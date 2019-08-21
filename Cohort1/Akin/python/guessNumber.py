import random
 
number =  random.randint(0,100)

print("Hi-Lo Number Guessing Game: between 0 and 100 inclusive.")
print()

#User guess the number

user_guess = int(input("Guess the random number between 0 and 100"))

while 0 >= user_guess <= 100:
    if user_guess > number:
        print("Guess too high")
    elif user_guess < number:
        print("Guess too low")
    else:
        print("Guess correct!!!")
        break

    user_guess = int(input("Guess the random number between 0 and 100"))

else:
    print("You quit early, the number is", number)


