# LAB 06 - 14 JAN 2019

## Lab Overview 
This lab is in an introduction to inheritance.  My project does not utilize inheritance as far as a super/sub-class relationship is concerned.  In this project I defined a Restaurant object that contains a list of Review objects.  This relationship is an aggregate relationship in the sense that part of a Restaurant object is comprised of a list of Review objects.

## Featured Tasks

- **Restaurant** class:
    - Properties:  
      name,  
      price category,  
      star ranking,  
      list of Review 
      
    - Behavior:  
      get instance name, price category, star ranking, 
      get Review from list,  
      add Review to list,  
      update star ranking,  
      toString
      
- **Review** class:
    - Properties:  
      reviewMessage,  
      author,  
      numOfStars  
      
    - Behavior:  
      get review message,  
      get author,  
      get number of stars,  
      set number of stars,  
      toString

---
---

# LAB 07 - 15 JAN 2019

## Lab Overview 
This lab is an extension from lab 6.  In this lab I created a superclass **Shop** and two sub-classes **Restaurant** and **Theatre**.  The sub-classes of Shop make use of common methods found in Shop.  In addition, Restaurant contains a property of a price category and Theatre contains a list of movies.

I also updated my **Review** class to accomodate a movie title property.  Upon creating a Review, a user an specify what movie they attended, and leave details about their experience.

## Featured Tasks

- **Shop** class:
    - Properties:  
      name,    
      star ranking,  
      list of Review 
      
    - Behavior:  
      get instance name, price category, star ranking, 
      get Review from list,  
      add Review to list,  
      update star ranking,  
      toString

- **Restaurant** class:
    - Properties:
      price category
      
    - Behavior:  
      get price category,   
      toString
      
- **Theatre** class:
    - Properties:
      ArrayList of String for movies
      
    - Behavior:  
      addMovie,
      removeMovie
      
- **Review** class:
    - Properties:  
      reviewMessage,  
      author,  
      numOfStars,  
      movieTitle   
      
    - Behavior:  
      get review message,  
      get author,  
      get movieTitle,  
      get number of stars,  
      set number of stars,  
      toString
