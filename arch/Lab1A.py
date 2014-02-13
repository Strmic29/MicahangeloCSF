#BitString in 2sComp
#Micah Stringham

string = "101101" + "0"*30
print  "the", len("101101" + "0"*30), "bit number in base 2"
print string + " in base ten is"


#number in decimal
num = 0
#start at 0th place
go = 0

#turns 1s to decimal rep
for i in string:
   
    #what to add if 1 and not 0
    decimal = 2**(len(string)-go-1)
    #checks if 1 for adding
    num += (string[go] == '1') * decimal
  
    #goes to next place value
    go += 1
   
#Subtracts 2^n if negative 2sComp
if string[0] == "1":
    num = num - 2**len(string)
    print num
else:
    print num