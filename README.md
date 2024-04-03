## **Java Random Password Generator**

This project is a **Java implementation** of a Random Password Generator. The generator allows you to specify the number of lower case letters, upper case letters, and digits in your password. It then generates a random password with your specified characteristics.

## **Features**

- **User Input**: You will input numbers to specify the number of lower case letters, upper case letters, and digits in your password.
- **Random Password Generation**: The generator will produce a random password with your specified characteristics.

## **Techniques and Skills**

1. **Java Programming**: The generator is entirely written in Java.
2. **Scanner Class**: The `Scanner` class is used to get the user's input for the password characteristics.
3. **Random Number Generation**: The `Math.random()` function is used to generate random numbers for selecting characters.
4. **String Manipulation**: The `charAt()` method is used to select characters from strings, and the `+=` operator is used to append characters to the password.
5. **Array Manipulation**: The `toCharArray()` method is used to convert strings to arrays, and array indexing is used to shuffle the characters in the password.

## **To run the generator, follow these steps:**

- Ensure that **Java** is installed on your machine. You can check this by running java --version in your terminal/command prompt. If Java is correctly installed, you should see your Java version.
- Clone the repository or download the Java file containing the generator code.
- Open a terminal/command prompt and navigate to the directory containing the Java file.
- Run the command javac filename.java to compile the Java file, replacing “filename” with the name of the Java file.
- Run the command java filename to run the compiled Java program, replacing “filename” with the name of the Java file (without the .java extension).
- The generator will prompt you to enter the number of lower case letters, upper case letters, and digits for your password. Enter the numbers and the generator will start.
- The generator will display the generated password. The password will be a random combination of the specified number of lower case letters, upper case letters, and digits, shuffled in a random order.
