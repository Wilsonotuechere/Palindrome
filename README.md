# Palindrome
Simple palindrome detector using Java

Declare a string variable "str" and initialize it to the string you want to check for palindrome.

Declare a string variable "reversedStr" and initialize it to an empty string.

Declare an integer variable "strLength" and initialize it to the length of the "str" variable.

Use a "for" loop to reverse the "str" and store it in the "reversedStr" variable.
    Inside the loop, access the character at the "ith" index of the "str" variable using the "charAt()" method.
   
    Append the character to the "reversedStr" variable.
    
    Decrement the value of 'i' by 1.             
    
    Repeat the loop until 'i' becomes less than 0.
    
Check if "str" and "reversedStr" are equal by using the equalsIgnoreCase() method, which ignores the case of the characters.
    
    If they are equal, print that the string is a palindrome.
    
    If they are not equal, print that the string is not a palindrome.
