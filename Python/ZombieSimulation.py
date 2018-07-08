import math
import random
import numpy as np
import matplotlib.pyplot as plt


susceptibleCounter = 0
susceptibleDict= {}
infectedCounter = 0
infectedDict = {}
removedCounter = 0
removedDict = {}
ImmuneCounter = 0
ImmuneDict = {}
mapLength = 20
mapWidth = 20

class Person:
    def __init__(self, name=None, strength=None):

        if name is None:
            name = "Person" + str(susceptibleCounter)
        self.name = name
        
        
        if strength is None:
            strength = [3,4,5,6,7,8,9,10,99]
            random.shuffle(strength)
        self.strength = random.choice(strength)
        
        x = random.randrange(0,21)
        self.x = x
    
        y = random.randrange(0,21)
        self.y = y
        
        self.location =(self.x, self.y)
        
    def getLocation(self):
        
        return (self.x, self.y)
    
    def walk(self):
        if ((self.x!=50) or (self.y!=50)):
            
        
            self.x += random.randrange(-2, 3)
            self.y += random.randrange(-2, 3)
            
            if self.x > mapWidth:
                self.x = self.x % 21
            
            if self.y > mapWidth:
                self.y = self.y % 21
                
            if self.x < 0:
                self.x += 20
                
            if self.y < 0:
                self.y += 20
            
        

    def isAlive(self):
        
        if (self.getLocation() != (50, 50)):
            return True
        else:
            return False

class Susceptible(Person):
    def __init__(self, name=None, strength=None):

        Person.__init__(self)
        
        global susceptibleCounter
        susceptibleCounter +=1
        if name is None:
            name = "Person" + str(susceptibleCounter)
        self.name = name
        
        
        if strength is None:
            strength = [3,4,5,6,7,8,9,10,99]
            random.shuffle(strength)
        self.strength = random.choice(strength)

class Infected(Person):
    def __init__(self, name =None, strength=None):

        Person.__init__(self)
        
        global infectedCounter
        infectedCounter +=1
        if name is None:
            name = "Zombie" + str(infectedCounter)
        self.name = name
        
        
        
        if strength is None:
            strength = [5, 15, 30, 100]
        self.strength = random.choice(strength)
        
    def canSmell(self, susceptible):
        distanceTo = math.hypot(self.x - susceptible.x, self.y - susceptible.y)
        if (distanceTo <= 3):
            if (isinstance(susceptible, Susceptible)):
                return True
        
            
class Removed(Person):
    def __init__(self, name =None, strength=None):
        Person.__init__(self)
    
    #global removedCounter
    removedCounter +=1

def population(totalPerson, totalZombie):
    for x in range(1, totalPerson +1):
        name = "Person" + str(x)
        newPerson = Susceptible()
        susceptibleDict[name] = newPerson
    
    for x in range(1, totalZombie+1):
        name = "Zombie" + str(x)
        newZombie = Infected()
        infectedDict[name] = newZombie
        
def battle(susceptible, zombie):
    
    print(susceptible.name+ " vs " + zombie.name)
    if (susceptible.strength > zombie.strength):
        infectedDict[zombie.name].x = 50
        infectedDict[zombie.name].y = 50
        
    if (zombie.strength > susceptible.strength):
        if (zombie.strength > 10*(susceptible.strength)):
            susceptibleDict[susceptible.name].x = 50
            susceptibleDict[susceptible.name].y = 50
        else:
            newZombie = Infected("Zombified" +str(susceptible.name))
            
            newZombie.location = susceptible.location
            newZombie.strength = susceptible.strength + 10
            
            susceptibleDict[str(newZombie.name)] = newZombie
            susceptibleDict.pop(str(susceptible.name))
        
        
        
def currentPopulation():
    susceptibleCount = 0
    zombieCount = 0
    removedCount = 0
    for (zombieName, zombieObj) in infectedDict.items():
        if zombieObj.isAlive():
            zombieCount+= 1
        else:
            removedCount += 1
    for (personName, personObj)  in susceptibleDict.items():
        if (isinstance(personObj, Susceptible)):
            if personObj.isAlive():
                susceptibleCount +=1
            else:
                removedCount += 1
        else:
            removedCount += 1
            
    print("Starting Population: " + str((len(susceptibleDict)+len(infectedDict))))
    print("Susceptible Count: " + str(susceptibleCount))
    print("Zombie Count: " + str(zombieCount))
    print("Death Count: " + str(removedCount))
    countArray = np.array([susceptibleCount, zombieCount, removedCount])
    return countArray

def simulation():
    population(45, 15)
    
    fightCount = 0
    days = 0
    while (len(susceptibleDict) > 0) and (days < 100):        
        for (zombieName, zombieObj) in infectedDict.items():
            zombieObj.walk()
            for (personName, personObj)  in susceptibleDict.items():
                personObj.walk()       
                if (zombieObj.canSmell(personObj)):
                    if (personObj.x!= 50) and (zombieObj.x != 50):
                    
                        battle(personObj, zombieObj)
                        fightCount+= 1
        
                        
        
        days+= 1
         
        
    print("Fights: "+str(fightCount))
    print("Days: " +str(days))
    y = days
    x1 = currentPopulation()
    
    
    plt.plot(y, x1[0], 'bo', color='green')
    plt.plot(y, x1[1], 'bo', color='yellow')
    plt.plot(y, x1[2], 'bo', color='red')
    plt.show()
    
simulation()



        