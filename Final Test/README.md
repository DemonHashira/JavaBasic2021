Documentation for final project Java Basic

The project is about a simple library that has the basic functions of a real one implemented. 
The goal is to represent artificially a fully working one.

It has four packages: books, demo, exception, library.

The package books has four classes:
1.	An abstract class called Readable that all other from books inherit. It has three fields representing the book’s heading, number in the library database, and the room where it is stored. There is a designed constructor for creating a book with all the parameters. There are getters and setters, because all the fields are private to ensure encapsulation is guaranteed.
2.	A class called Book that extends Readable. This is the first type of readable the library has. Same as the parent class it has its fields private with getters and setters and a constructor that calls the super one. There is an additional field for the author.
3.	A class called Magazine extending Readable. The second type of readable. It has all the fields, methods and constructors the other class has with the addition of a field present.
4.	The final class Newspaper that inherits Readable. Again, having all the parameters, the other classes have with a city field. 

The package exception has one class:
1.	A class called NotEnoughBooksException that extends Exception. Its sole purpose is to print a message when there are not enough books. 

The package library has four classes: 
1.	A class Library that is essentially the most important of all. It has a field for name, rooms, readable, and personal. A String, ArrayList and HashSet. As mentioned all the fields are private. The methods are, of course, getters and setters with the addition of a method to add an element to the lists, and to remove a readable. And a constructor that has only the name as parameter.
2.	A class called Personal that represents them. Has a filled name, a constructor with it, and a getter and setter. 
3.	A class called Raft that has only a HashSet for books. 
4.	A class called Room that has an ArrayList and an int. 

The package demo has two classes:
1.	A class called Client. Has two fields: name and bookHashSet. Private, with getters and setters. A constructor with name. A method for getting a readable that is the most important one and for returning books to the library. 
2.	A class called Demo. Here is where a library is created. 

