
## Body Mass index: Number calculated from a person's weight and height
## BMI = weight / height ** 2 where weight is in kilograms and height is in metres

weight = input("Enter weight: ")
height = input("Enter height: ")
weight = int(weight)
height = int(height)
BMI = weight / height ** 2

print("The BMI value of weight {:2} and height {:2} is {:2f} ".format(weight, height, BMI))

