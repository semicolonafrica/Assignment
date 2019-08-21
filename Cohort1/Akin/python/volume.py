
## Prompt the user for the number of inches

inches = input("How many inches of rain has fallen: ")
inches = float(inches)

acre = 43560
cubic_foot = 7.48051945
volume = (inches/12) * acre
gallon = volume * cubic_foot

print(inches," in. rain on 1 acre is", gallon, "gallons")
