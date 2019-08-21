from math import sqrt

number_int = int(input("Input the number: "))
#Calculate the square root of the number
square_root = sqrt(number_int)

initial_guess_int = int(input("Guess the square root of the number"))

tolerance = float(input("Input the tolerance: "))
count = 0
#Divide the number by the guess
division_number = number_int / initial_guess_int

#Average the quotient and the guess
average_float = (division_number + initial_guess_int) / 2

#Make the new guess the average
new_guess = average_float

while (new_guess - initial_guess_int) > tolerance:
    if (new_guess - initial_guess_int) <= tolerance:
        break    
    else:
        #Divide the number by the guess
        division_number = division_number

        #Average the quotient and the guess
        average_float = (division_number + initial_guess_int) / 2

        #Make the new guess the average
        temp = initial_guess_int
        initial_guess_int = new_guess
        new_guess = temp
        
        
        count = count + 1
        print(count)

print()

print("The original number",number_int,"The square root",square_root,"The count", count)
