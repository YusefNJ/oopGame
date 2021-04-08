------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: coursework game
PURPOSE OF PROJECT: coursework
VERSION or DATE: 1
HOW TO START THIS PROJECT: run main function in class game.
AUTHORS: Yusef NJ
USER INSTRUCTIONS:

Student name: Yusef Naqvi-Jukes
Student number: 200926041

Now complete the statements below for each level you wish to be marked. Replace all text in square brackets.

LEVEL ONE

My code demonstrates inheritance in the following way...

I have a superclass called [character]

This superclass is extended into at least two subclasses called [knight, dragon, zombie, goblin, medic, magicalHealer]

For each of the named subclasses complete the following...


Subclass 1.

Subclass [goblin] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [keyItem.]

These/this new properties/property are used by the subclass in the following way: [When you kill a goblin it drops an item that the user can use this item is the heal potion. This is used in lines 105, 182, 188 of game class.]

Subclass [goblin] extends the superclass by overriding the following methods (there must be at least one): attack() in goblin class 23-44 

These overridden methods are used in the working code in the following places: used in Game.java in line(s) 175


Subclass 2.

Subclass [zombie] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [keyItem]

These/this new properties/property are used by the subclass in the following way: [When you kill a zombie it drops an item that the user can use this item is the shield. This is used in lines 105, 182, 188 of game class.]

Subclass [zombie] extends the superclass by overriding the following methods (there must be at least one): attack() in zombie class 20-48

These overridden methods are used in the working code in the following places: used in Game.java in line(s) 175

Subclass 3.

Subclass [dragon] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [keyItem]

These/this new properties/property are used by the subclass in the following way: [When you kill a dragon it drops an item that the user can use this item is the dragon heart. This is used in lines 105, 182, 188 of game class.]

Subclass [dragon] extends the superclass by overriding the following methods (there must be at least one): attack() in dragon class 24-58

These overridden methods are used in the working code in the following places: used in Game.java in line(s) 175


Subclass 4.

Subclass [knight] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [longsword]

These/this new properties/property are used by the subclass in the following way: [longsword allows the knight to do more damage in attacks. This is used in game class 171, and in knight class its used in line 22] 

Subclass [knight] extends the superclass by overriding the following methods (there must be at least one): attack() in knight class 20-48

These overridden methods are used in the working code in the following places: used in Game.java in line(s) 171


Subclass 5.

Subclass [assassin] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [poison]

These/this new properties/property are used by the subclass in the following way: [poison allows the assassin to do more damage in attacks. This is used in game class 171, and in assassin class its used in line 25]

Subclass [assassin] extends the superclass by overriding the following methods (there must be at least one): attack() in assassin class 13-33.

These overridden methods are used in the working code in the following places: used in Game.java in line(s) 171


Subclass 6.

Subclass [magicalHealer] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [heal]

These/this new properties/property are used by the subclass in the following way: [magicHealer needs this property as he has the ability to heal the user, This is used in game class 199, and in magicHealer class in line 26]

Subclass [Insert name of subclass] extends the superclass by overriding the following methods (there must be at least one): healUser() in magicHealer class 25-27

These overridden methods are used in the working code in the following places: used in Game.java file at 199.

Subclass 7.

Subclass [medic] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [heal]

These/this new properties/property are used by the subclass in the following way: [medic needs this property as he has the ability to heal the user, This is used in game class 199, and in medic class in line 21]

Subclass [Insert name of subclass] extends the superclass by overriding the following methods (there must be at least one): healUser() in medic class 20-22

These overridden methods are used in the working code in the following places: used in Game.java file at 199.



LEVEL TWO

Polymorphism consists of the use of the Substitution principle and Late Dynamic binding.

In my code, polymorphism is implemented in at least two places…

Example 1.

The substitution principle can be seen in use in [game class at lines 41, 44, 47]. The name of the superclass used in this example is [character] and the subclasses used are [knight, dragon, goblin, zombie].

Late dynamic binding can be seen in [game class at 171, 175].


[we need this polymorphism to allow the method attack() to be dynamic and different for different subclasses of character. This allows us to make different characters with differnt attacks (by overriding attack()) and thus distinguish them from the others. So for example a dragon has differnt attacks to a zombie]

Example 2.

The substitution principle can be seen in use in [game and substituion used at 56, 59, 62]. The name of the superclass used in this example is [character] and the subclasses used are [medic, magicalHealer].

Late dynamic binding can be seen in [game class at line 199].

[This polymophism is necessary because we need a varity of team mates of type character that will override the method healUser(). This allows us to have different types of healers in the game with differnt amounts to heal, making an elemet of luck in the game. A magicalHealer is more rare but does more healing.]


