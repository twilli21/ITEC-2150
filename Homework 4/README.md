HW4 - ITEC 2150 - Fall 2019

Due Date:  Thursday, Nov 7, 2019 by 11:59 PM – Earlier submissions are accepted 

In this assignment, we will be creating an inventory system for a specialty media store.  You will create an Item base class and three classes that inherit from this class, Book, Music, and Video.  

Specific requirements:

Item

An abstract base class. It will implement the Comparable interface.  It will contain the following instance variables:
1.	Name – A String to hold the name of the item.  This attribute cannot be blank.  Default – “no name”
1.	Number – An int containing the number in stock- default is 0
1.	Type – A String containing book, music or video.  Default book
1.	Cost – a double containing the cost of one item.  This can range from 0 to 100.  Default 100.

You must provide getters/setters for all four instance variables (attributes) and appropriate constructors.  
Abstract methods must include:
1.	String getMediaType()
1.	void setMediaType(String mediaType)
1.	String getSource()
1.	void setSource(String source)

You will also need to create a toString method that returns a String for the variables in the Item.
1.	compareTo will compare two Items.  They are equal if name and type are the same.  Otherwise, use the String compareTo on the names to determine greater than or less than.  If the names are equal and the types are not, use the String compareTo on the type to determine greater than or less than.

Book

Inherits from Item.  You must implement all abstract methods.  from that method.  Magic will have the following instance variables:
1.	String mediaType – print or eBook Default is print.
1.	String source- The publisher from which book is ordered

You should create getters and setters for each of these variables.  

Music

Inherits from Item.  You must implement all abstract methods.  Magic will have the following instance variables:
1.	String mediaType – MP3, CD or Vinyl
1.	String source- The record label the music is ordered from

You should create getters and setters for each of these variables.  

Video

Inherits from Item.  You must implement all abstract methods. Video will have the following instance variables:
1.	String mediaType – mp4 or BluRay DVD
1.	String source- The studio from which the movie is ordered

You should create getters and setters for each of these variables.  



Driver(Your name is your choice)
In the Driver, you will read in the attached text file which contains three books, three music and three movie items.   Read them in, create the appropriate object and add to an ArrayList of Items.   Then choose a sort algorithm and implement it as a generic sort algorithm.  Sort the ArrayList and print each Item on it’s own line.   Do NOT use Collections sort algorithm- create a generic sort algorithm based on examples in D2L.

Grading Criteria (total 95 points):
1.	Read in file correctly: 10
1.	Create ArrayList of Items: 15
1.	Inheritance and abstract use correct:	15
1.	Comparable correctly implemented: 15
1.	Create generic sort algorithm: 15
1.	Coding Standards: 15
1.	Output Correct (all items printed in correct sorted order): 10
