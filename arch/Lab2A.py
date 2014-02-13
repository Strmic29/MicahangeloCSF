operations = ['+','-','*','/']
expr = "512+4*+3-"
stack = []
total = 0
def jvm(expr):

    for i in expr:
        if i.isdigit()== True:
            stack.append(i)
        elif i == ('+'):
            a = stack.pop()
            b = stack.pop()
            total = int(a)+int(b)
            stack.append(total)

        elif i == ('-'):
            c = stack.pop()
            d = stack.pop()
            total = int(d)-int(c)
            stack.append(total)

        elif i == ('*'):
            e = stack.pop()
            f = stack.pop()
            total = int(f)*int(e)
            stack.append(total)
        elif i == ('/'):
            g = stack.pop()
            h = stack.pop()
            total = int(h)/int(g)
            stack.append(total)
        else:
            print "neither int or op, dance magick dance"
    print total


jvm(expr)
