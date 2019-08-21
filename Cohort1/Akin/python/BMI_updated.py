# 1 pound = 0.453592kilogram, 1 kilogram = 2.20462pound
# 1 inch = 0.0254meters, 1meter = 39.3701inches
## Body Mass index: Number calculated from a person's weight and height
## BMI = weight / height ** 2 where weight is in kilograms and height is in metres

pound = 0.453592
inch = 0.0254
weight = input("Enter weight in pounds: ")
height = input("Enter height in inches: ")
weight = int(weight) * pound
height = int(height) * inch
BMI = weight / height ** 2

print("The BMI value of weight {:2} and height {:2} is {:2f}kg/m2 ".format(weight, height, BMI))

