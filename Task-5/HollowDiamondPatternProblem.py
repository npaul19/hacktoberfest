# Hollow Diamond pattern

# Reading number of row
row = 9

# Upper part of hollow diamond
for i in range(0, int(row/2)+1):
    for j in range(0,row):
        lowLimit = int((row+1)/2)-(i-1)
        upperLimit = int((row+1)/2)+(i-1)
        if(j<lowLimit-1 or j>=upperLimit):
            print("* ", end="")
        else:
            print("  ", end="")

    print()

# Lower part of hollow diamond
for k in range(2, int(row/2)+2):
    i = int(row/2)+1-k
    for j in range(0,row):
        lowLimit = int((row+1)/2)-(i-1)
        upperLimit = int((row+1)/2)+(i-1)
        if(j<lowLimit-1 or j>=upperLimit):
            print("* ", end="")
        else:
            print("  ", end="")

    print()
