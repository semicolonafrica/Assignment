
#Product Number calculation
number_int = int(input("Input the number to check if it is a Product Number: "))
divisor_int = 1
sum_of_number_int = 0
while divisor_int < number_int:
    if number_int % divisor_int == 0:
        sum_of_number_int = sum_of_number_int + divisor_int
        print(divisor_int, end=' ')
    divisor_int = divisor_int + 1
print()
if sum_of_number_int == number_int:
    print("Product Number")
else:
    print("Other Numbers")
