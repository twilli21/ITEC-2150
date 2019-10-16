Abstract Class In-Class
ITEC 2150
Fall 2019

In this IC, you will be creating an abstract class Movie.  This class should have two instance variables, title and genre.  This class should implement the Comparable interface.  You should compare on title.  You should implement getters, setters and constructors for this class.  You will also need a toString method.  The defaults for the no argument constructor should be title “Not set”, genre” Not Set”.  This class should have three abstract methods:
1.	public abstract String getMedia();
1.	public abstract int getMinutes();
1.	public abstract void setMinutes(int minutes) 

You should create two classes that inherit from Movie, BluRay and MP4.  These should each have an instance variable for minutes.  Minutes should be an int and must be greater than 0.  You will need a no argument constructor, and a three argument constructor.  You will also need to create a toString for each which will call the toString from your Movie class.  You must call the correct constructors from Movie and use setters that validate inputs as required.  Validation rules for these are:
1.	title – Cannot be blank.  If a blank title is passed in, do not change title
1.	genre – Cannot be blank. If a blank title is passed in, do not change genre
1.	minutes – Must be greater than 0.

A MovieDriver class.  All user interaction must be done in this class.  You should allow the user to enter a new Movie by doing the following:  
1.	Ask the user if they want to create a BluRay or MP4 object.  Then ask the user to enter the title, genre and minutes.  
1.	In the main method you should create an ArrayList<Movie> to store the movies created.  
1.	Ask the user if they want to create another, loop until they say no. 
