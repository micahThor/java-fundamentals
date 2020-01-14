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
