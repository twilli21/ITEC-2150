HW2 - ITEC 2150 - Fall 2019

Due Date:

Sunday, September 22, 2019 11:30 PM- Questions to instructor should be emailed no later than 4 PM on Friday before. You must upload to D2L AND submit to Homework2 in Mimir

In this program we are going to utilize multiple classes to demonstrate inheritance and polymorphism.   We will be creating a base class for our game character.  The base class will be LifeForm.  We will have derived classes of Human, Dragon, and Unicorn.  

LifeForm will have the following attributes:
1.	hitPoints – range 0 to 100 
1.	strength – range 0 to 18

You will need to provide a default constructor that initializes these attributes as follows:
1.	strength – 15
1.	hitPoints – 100

You will need to provide a getter and setter for each of these variables.   When the attribute has a range, the setter method should not allow a value outside that range.  For example, if the setHitPoints(points) is called with points = -1, the attribute should NOT be changed.  The variables should be private.  Please provide a toString method which will return a String containing the values in these variables.

In your Human, Dragon and Unicorn classes you will need variables to hold the character name, weapon, and magic values.  Values will be as follow:
Weapon, Magic Amount
1.	Human: Sword or Dagger,	0-50
1.	Dragon:	Fire or Ice,	0-100
1.	Unicorn:	Horn or Charm,	100-500

You will need to provide getters and setters for each of these private variables. Again, they should not allow values not in the table.  You also need to provide a constructor for all of the variables, both the ones in the derived class and the ones in the base class.  

Please provide a toString method that returns the type of character, the name, the weapon, the magic amount and the values from base class, call the toString() from the base class.

Create a driver class that allows the user to create a random set of characters.  These should be of type Human, Dragon and Unicorn.  These should be stored in an ArrayList of LIfeForm.    You should prompt the user for entries and create three characters of each class type and store them in the ArrayList.  Once you have added the three characters. Print the characters from the ArrayList using your toString methods.

Example output: (Italics indicate user input)

Enter Lifeform 1:
1.	Enter Lifeform Type:  human
1.	Enter Lifeform Name:  Jon Snow
1.	Enter hit points: 10
1.	Enter strength: 5
1.	Enter weapon: sword
1.	Enter magic: 25

Enter Lifeform 2:
1.	Enter Lifeform Type: unicorn
1.	Enter Lifeform Name:  Sparkles
1.	Enter hit points: 0
1.	Enter strength: 18
1.	Enter weapon: charm
1.	Enter magic: 300

Enter Lifeform 3:
1.	Enter Lifeform Type: dragon
1.	Enter Lifeform Name:  Smaug
1.	Enter hit points: 0
1.	Enter strength: 18
1.	Enter weapon: ice
1.	Enter magic: 99

The available life forms are: ↵

Lifeform [hitPoints=10, strength=5, type=human]Human [name=jon snow, weapon=sword, magic=25]↵

Lifeform [hitPoints=0, strength=18, type=unicorn]Unicorn [name=sparkles, weapon=charm,magic=300]↵

Lifeform [hitPoints=0, strength=18, type=dragon]Dragon [name=smaug, weapon=ice, magic=99]↵

