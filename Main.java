import java.util.Scanner; // Needed for the Scanner class

/*
DD:
String city

Ask the user for the name of their favorite city
Read input into city
Display length of city
Display city in all uppercase
Display city in all lowercase
Display first character of city
*/

public class Main
{
   public static void main(String[] args)
   {
      String city;      // To hold user input

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the user's favorite city.
      System.out.print("Enter the name of your favorite city: ");
      city = keyboard.nextLine();
      
      // Display the number of characters.
      System.out.println("Number of characters: " + city.length());
      
      // Display the city name in uppercase characters.
      System.out.println(city.toUpperCase());
      
      // Display the city name in lowercase characters.
      System.out.println(city.toLowerCase());
      
      // Display the first character in the city name.
      System.out.println(city.charAt(0));
   }
}
