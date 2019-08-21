
def func():
    first_int = int(input("Input a number: "))
    while first_int > 1:
        if first_int % 2 != 0:
            first_int = (first_int * 3) + 1
        else:
            first_int = first_int / 2
        print(first_int)

print(func())
