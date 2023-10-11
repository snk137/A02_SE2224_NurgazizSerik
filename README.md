 Overview 

In this implementation, I used the Decorator design pattern to extend the functionalities of a base Coffee class. The base Coffee class provides a foundation for various types of coffee orders, and the decorators allow for adding extra features or condiments to these base coffee orders. 

  

Code Structure 

 “CoffeeShop"class: Contains the main method where I interact with the user to create customized coffee orders. 

 "Coffee"class: Represents the base Coffee class with a description and cost method. 

 "Espresso"and "Latte"classes: Concrete coffee classes that extend the Coffee base class. 

 "CondimentDecorator"class: Abstract decorator class that extends Coffee and provides a base for additional condiments. 

 "Milk", "Sugar", "Caramel", and "WhippedCream"classes: Concrete decorator classes extending CondimentDecorator, representing various condiments that can be added to the coffee. 

  

Decorator Design Pattern 

The "Decorator design pattern"is a structural pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class. In this implementation, it allowed me to extend the functionalities of the Coffee class by adding condiments dynamically while preserving the original Coffee object. 

  

The "use case"of the Decorator pattern in this context is customizing coffee orders. Users can start with a base coffee type (Espresso or Latte) and then add multiple condiments (Milk, Sugar, Caramel, Whipped Cream) to their liking, enhancing the coffee's description and cost accordingly. 

  

 Screenshots 

  

 

 

  

Additional Insights 

 The Decorator pattern is especially useful when we want to extend the functionalities of objects dynamically and in a flexible manner. 

 Implementing the Decorator pattern provides a more maintainable and clean way to add optional features or behaviors to individual objects. 

 Handling floating-point arithmetic in Java requires careful consideration of formatting to ensure proper display, as seen in formatting the cost value for better readability. 

  
