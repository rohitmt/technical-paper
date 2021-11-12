# technical-paper

# Java
Basics of java datatype and data structure

# Data Type 
Data types specifies the different size and values that can be stored in the variable.There are two types of data types in java.
1. Primitive data type
2. Non-Primitive data type

   1.**Primitive data type :**  Primitive data types are basic building block to store and manipulation the data in java.There are 
                              8 types as given below.
                               
      1. **boolean data type :** boolean store only one bit of information either true or false. 
           
           **Syntax**
           ```
               boolean variableName
          ```
           **Size**
           ```
               1 bit
           ```
           **values**
           ```
               true, false
            ```
           **Default value**
           ```
               false
            ```                  
      1. **byte data type :** The byte data type is an 8-bit signed two’s complement integer. This data type is use for same the memory in large arrays.
           
           **Syntax**
           ```
               byte variableName
          ```
           **Size**
           ```
               1 byte (8 bits)
           ```
            **values**
            ```
               -128 to 127
            ```
           **Default value**
           ```
                0
          ```
      1. **char data type :** The char data type is a single 16-bit Unicode character.
           
           **Syntax**
           ```
                char variableName
          ```
           **Size**
           ```
                2 byte (16 bits)
            ```
            **values**
            ```
                '\u0000' (0) to '\uffff' (65535)
            ```
           **Default value**
           ```
                '\u0000'
           ```
      1. **short data type :** The short data type is a 16-bit signed two’s complement intege. The short data type can also be used to save memory just like byte                                data type.Short data type is 2 time smaller the integer.
           
           **Syntax**
           ```
                short variableName
           ```
           **Size**
           ```
                2 byte
           ```
            **values**
           ```
                -32, 768 to 32, 767
           ```

           **Default value**
          ```
                0
           ```
      1. **int data type :** It is a 32-bit signed two’s complement integer.
           
           **Syntax**
           ```
                int variableName
          ```
           **Size**
           ```
                4 byte (32 bits)
           ```
            **values**
            ```
                -2, 147, 483, 648 to 2, 147, 483, 647 
            ```

           **Default value**
           ```
                 0
            ```                   
      1. **long data type :** The long data type is a 64-bit two’s complement integer.
           
           **Syntax**
            ```
                long variableName
          ```
           **Size**
           ```
                8 byte (64 bits)
           ```
            **values**
            ```
               -9, 223, 372, 036, 854, 775, 808 
                to 
                9, 223, 372, 036, 854, 775, 807 
          ```
           **Default value**
           ```
                0    
           ```
                     
     1. **float data type :** The float data type is a single-precision 32-bit IEEE 754 floating-point.
           
           **Syntax**
           ```
                float variableName
          ```
           **Size**
           ```
                4 byte (32 bits)
           ```
           **values**
           ```
                upto 7 decimal digits
           ```
           **Default value**
           ```
                0.0
            ```                                      
                  
     1. **double data type :** The double data type is a double-precision 64-bit IEEE 754 floating-point.
           
           **Syntax**
           ```
                double variableName
          ```
           **Size**
           ```
                8 byte (64 bits)
           ```
           **values**
           ```
                upto 16 decimal digits
           ``` 
           **Default value**
           ```
                0.0  
          ```
   2.**Non Primitive data type :**  The non-primitive data types include classes, interfaces and Arrays etc.
                               
      1. **Class :** A class is a user-defined blueprint or prototype from which objects are created.  It represents the set of properties or methods that are common to all objects of one type.class declarations can include these components as given below
           
           **. Modifier :** A class can be public or has default access.
           
           **. Class name :** The name should begin with a initial letter (capitalized by convention).
           
           **. Super class(if any) :** The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
           
           **. interface(if any) :** A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
                               
           **. Body :** The class body surrounded by braces, { }.
  
      2. **Array :** An array is a collection of similar type of elements which has contiguous memory location.  
      
      3. **Object :** It is a basic unit of Object-Oriented Programming and represents the real-life entities.It contains state as instance variable and behaviour as method.                       
      
# Data Structure

A data structure is perticular way of organizing the data in computer so that we can perform operation on data and get the desired output.There are two types of data structures.

1.**Primitive data structure :** The primitive data structures are primitive data types. The int, char, float, double, and pointer are the primitive data structures that can hold a single value.

2.**Non Primitive data structure :** Non-Primitive data structure is divided into two types.

- Array
- LinkedList
- Stack
- Queue
- Tree
- Graph
- Set
---

**REFERENCES :** [GeeksforGeeks](https://www.geeksforgeeks.org/data-types-in-java/)
                 [JavatPoints](https://www.javatpoint.com/java-data-types)
