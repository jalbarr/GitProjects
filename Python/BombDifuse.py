bombActive = True

bombSequence = ["white", "red", "green", "white"]
userSequence = []

white = True
black = True
purple = True
red = True
green = True
orange = True
def standard():
    white = True
    black = True
    purple = True
    red = True
    green = True
    orange = True



def cutWire(cableColor):
    global white, black, purple, red, green, orange, userSequence, bombSequence
    standard()
    if ((cableColor == "white") and (white)):
        standard()
        white = False
        black = False
        userSequence += cableColor
    elif ((cableColor == "red") and (red)):
        standard()
        userSequence += cableColor
        print("green cable cut also :)")
        cutWire("green")
    elif ((cableColor == "black") and (black)):
        standard()
        white = False
        green = False
        orange = False
        userSequence += cableColor
    elif ((cableColor == "orange") and (orange)):
        standard()
        white = False
        black = True
        purple = False
        red = True
        green = False
        orange = False
        userSequence += cableColor

    elif ((cableColor == "green") and (green)):
        standard()
        white = True
        black = False
        purple = False
        red = False
        green = False
        orange = True
        userSequence += cableColor
        
    
    elif ((cableColor == "purple") and (purple)):
        standard()
        white = False
        black = True
        purple = False
        red = True
        green = False
        orange = False
        userSequence += cableColor

    else:
        print("Color not valid.")
        return False

    return True
        

def bombDisarm():
    standard()
    for i in range(0,(len(bombSequence)-1)):
        result = cutWire(str(input("Pick a cable color: ")))
        if (not(result)):
            print("Boom.")
            return
        
    print("Bomb defused")


bombDisarm()
    

        
