#Class that uses a list and defines methods to make it act like a stack
class Stack:
    def __init__(self):
        self.list = []
    
    #implementing the search method
    def search(self, name):
        i = 1
        x = -1
        while abs(x) <= len(self.list):
            if name != self.list[x]:
                i+=1
                x-=1
            else:
                return i
        return -1
            
    #implementing peek method
    def peek(self):
        return self.list[-1]
    
    #implementing isEmpty method
    def isEmpty(self):
        if len(self.list) == 0:
            return True
        else:
            return False
    

#creating an instance of the class (object)
stack = Stack()

print("List is empty: " + str(stack.isEmpty()))

stack.list.append("Minecraft")
stack.list.append("Fifa 20")
stack.list.append("Doom")
stack.list.append("Fortnite")

print(stack.list)

print("List is empty: " + str(stack.isEmpty()))

for name in stack.list:
    print(name + " is in position number: " + str(stack.search(name)))

#pops Fortnite
print("Popped " + stack.list.pop())

print(stack.list)

#returns Doom
print("Peeked " + stack.peek())


