top_num_str = input("What is the upper number number for the range: ")

top_num = int(top_num_str)
number = 2

while number <= top_num:
    #sum up the divisor
    divisor = 1
    sum_of_divisors = 0

    while divisor < number:
        if number % divisor == 0:
            sum_of_divisors = sum_of_divisors + divisor
        divisor  = divisor + 1

    if number == sum_of_divisors:
        print(number, "is perfect")
    elif number < sum_of_divisors:
        print(number, "is abundant")
    else:
        print(number,"is deficient")
    number += 1
