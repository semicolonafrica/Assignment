
    sc1 = int(input("Input the number for the first team: "))
    sc2 = int(input("Input the number for the second team: "))

    T = 0

    if(SC1 > SC2):
        T = 1
    else:
        T = 2

        d = abs(sc1 - sc2)
        d -= 3

        check = input("1 if sc1 has the ball, No if the sc2 has the ball: ")
        if(check == T):
             d += 0.5
        else:
            d -= 0.5
