river = 'Missisipi'
target = input("Input a character to find: ")
for index in range(len(river)):
    if river[index] == target:
        print("Index found at {}".format(index))
        break
else:
    print("Not found!!!")

#Split function
    
