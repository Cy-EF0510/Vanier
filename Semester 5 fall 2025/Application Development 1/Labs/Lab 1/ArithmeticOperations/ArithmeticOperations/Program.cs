using System;
//using System.Collections.Generic;
//using System.Linq;
//using System.Runtime.CompilerServices;
//using System.Runtime.Remoting.Channels;
//using System.Text;
//using System.Threading.Tasks;

namespace ArithmeticOperations
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int number1;
            int number2;
            int sum;
            int difference;
            int product;
            int quotient;
            int remainder;
            String firstName;
            string lastName;
            String line3, line4, line5, line6, line7;

            Console.Write("Please Enter you Last Name: ");
            lastName = Console.ReadLine();
            Console.Write("Please Enter you First Name: ");
            firstName = Console.ReadLine();
            Console.Write("Please Enter First Integer Number: ");
            number1 = int.Parse(Console.ReadLine());
            Console.Write("Please Enter First Integer Number: ");
            number2 = int.Parse(Console.ReadLine());

            sum = number1 + number2;
            difference = number1 - number2;
            product = number1 * number2;
            quotient = number1 / number2;
            remainder = number1 % number2;

            Console.WriteLine($"Your First Name is : {firstName}");
            Console.WriteLine($"Your Last Name is: {lastName}");
            Console.WriteLine($"The sume of {number1} and {number2} is {sum}");
            Console.WriteLine($"The difference between {number1} and {number2} is {difference}");
            Console.WriteLine($"The product of {number1} and {number2} is {product}");
            Console.WriteLine($"The quotient of {number1} divided by {number2} is {quotient}");
            Console.WriteLine($"The Remainder of {number1} divided by {number2} is {remainder}");

            line3 = "The sum of " + number1 + " and " +  number2 + " is";
            line4 = "The difference between " + number1 + " and " + number2 + " is";
            line5 = "The product of " + number1 + " and " + number2 + " is";
            line6 = "The quotient of " + number1 + " divided by " + number2 + " is";
            line7 = "The remainder of " + number1 + " divided by " + number2 + " is";

            drawLine();
            Console.WriteLine($"| {"Table of Arithmetic Operations",53}  {"|",25}");
            drawLine();
            Console.WriteLine($"| {"Your Fist Name is", -50} | {firstName, -25} |");
            Console.WriteLine($"| {"Your Last Name is", -50} | {lastName, -25} |");
            Console.WriteLine($"| {line3,-50} | {sum,25} |");
            Console.WriteLine($"| {line4,-50} | {difference,25} |");
            Console.WriteLine($"| {line5,-50} | {product,25} |");
            Console.WriteLine($"| {line6,-50} | {quotient,25} |");
            Console.WriteLine($"| {line7,-50} | {remainder,25} |");
            drawLine();
        }
        public static void drawLine()
        {
            Console.Write("|");
            for(int i = 0; i < 80; i++)
                Console.Write("-");
            Console.WriteLine("|");
        }
    }
}
