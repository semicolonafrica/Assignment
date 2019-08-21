from math import cos,sqrt,acos

a = 3
b = 7
c = 9

#The law of cosines

#The first angle to calculate:
first_part = a**2 + b**2 

second_part = first_part - c ** 2

third_part = 2 * a * b

C_angle = acos(second_part / third_part)

print("Angle C: ",C_angle)

#To calculate for second angle

a_part = a**2 + c**2

a_part_2 = a_part - b**2

a_part_3 = 2 * a * c

B_angle = acos(a_part_2 / a_part_3)

print("Angle B: ", B_angle)


#To calculate for third angle

b_part = b**2 + c**2

b_part_2 = b_part - a**2

b_part_3 = 2 * b * c

A_angle = acos(b_part_2 / b_part_3)

print("Angle A: ", A_angle)
