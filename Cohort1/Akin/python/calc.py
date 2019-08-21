import math

def calc(radius):
    circum = 2 * math.pi * radius
    area = math.pi * (radius * radius)

    return circum, area




radius = int(input("Input the radius to use for calculation: "))
print("The circumference and the area respectively: ", calc(radius))
