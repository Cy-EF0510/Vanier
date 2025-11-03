using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace Practical_Midterm_Exam
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //char[][] weatherArray =
            //{
            //    new char[30],
            //    new char[30],
            //    new char[30]
            //};
            //weatherArray = InputWeatherData(weatherArray);

            //The following two codes shows the exact copy of the example shown in the problem paper. i am not able to do a random input nor user input at the moment
            char[][] weatherArray = GenerateArrayList();
            WeatherData(weatherArray);
            Console.WriteLine();
            WeatherReport(weatherArray);
            
        }
        public static char[][] GenerateArrayList()
        {
            char[][] weatherArray =
            {
                new char[]{'C', 'S', 'R', 'C', 'C', 'R', 'S', 'C', 'R', 'C', 'C', 'S', 'R', 'S', 'C', 'R', 'C', 'S', 'C', 'S', 'S', 'S', 'S', 'S', 'C', 'S', 'S', 'R', 'C', 'S'},
                new char[]{'R', 'S', 'S', 'S', 'R', 'S', 'R', 'C', 'C', 'R', 'S', 'R', 'C', 'R', 'R', 'R', 'R', 'C', 'S', 'S', 'R', 'R', 'C', 'S', 'R', 'C', 'S', 'S', 'C', 'R'},
                new char[]{'R', 'R', 'C', 'R', 'R', 'R', 'C', 'S', 'C', 'R', 'S', 'S', 'S', 'R', 'S', 'R', 'R', 'R', 'R', 'R', 'C', 'S', 'R', 'C', 'R', 'S', 'R', 'S', 'R', 'R'}
            };
            return weatherArray;
        }

        public static char[][] InputWeatherData(char[][] array) // this is the function for the user input
        {
            for(int i = 0; i < array.Length; i++)
            {
                Console.Write($"Please input the weather for month {i + 1}: ");
                for (int j = 0; j < array[i].Length; j++)
                {
                    char weather = (char)Console.Read();
                    array[i][j] = weather;
                }
                
            }

            return array;
        }

        public static void DrawLine()
        {
            Console.Write("|");
            for(int i = 0; i < 101; i++)
            {
                Console.Write("-");
            }
            Console.Write("|\n");
        }

        public static void DrawLine2()
        {
            Console.Write("|");
            for (int i = 0; i < 47; i++)
            {
                Console.Write("-");
            }
            Console.Write("|\n");
        }
        public static void WeatherData(char[][] array)
        {
            DrawLine();
            Console.WriteLine($"| {"Following table shows the weather conditions during the three months", 83} {"|", 17}");
            DrawLine();
            Console.Write("| June   |  ");
            foreach(char element in array[0])
                Console.Write(element + "  ");
            Console.WriteLine("|");
            Console.Write("| July   |  ");
            foreach (char element in array[1])
                Console.Write(element + "  ");
            Console.WriteLine("|");
            Console.Write("| August |  ");
            foreach (char element in array[2])
                Console.Write(element + "  ");
            Console.WriteLine("|");
            DrawLine();
        }

        public static void WeatherReport(char[][] array)
        {
            int juneRainy = 0;
            int juneCloudy = 0;
            int juneSunny = 0;
            foreach (char element in array[0])
            {
                if (element == 'C')
                    juneCloudy++;
                else if (element == 'R')
                    juneRainy++;
                else if (element == 'S')
                    juneSunny++;
            }

            int julyRainy = 0;
            int julyCloudy = 0;
            int julySunny = 0;
            foreach (char element in array[1])
            {
                if (element == 'C')
                    julyCloudy++;
                else if (element == 'R')
                    julyRainy++;
                else if (element == 'S')
                    julySunny++;
            }

            int augustRainy = 0;
            int augustCloudy = 0;
            int augustSunny = 0;
            foreach (char element in array[2])
            {
                if (element == 'C')
                    augustCloudy++;
                else if (element == 'R')
                    augustRainy++;
                else if (element == 'S')
                    augustSunny++;
            }

            int[] rainyArray = { juneRainy, julyRainy, augustRainy };
            int rainyMonth = 0;
            String mostRainy = null;
            foreach (int element in rainyArray)
            {
                if (element > rainyMonth)
                {
                    rainyMonth = element;
                }
            }
            if (rainyMonth == juneRainy)
                mostRainy = "June";
            else if (rainyMonth == julyRainy)
                mostRainy = "July";
            else if (rainyMonth == augustRainy)
                mostRainy = "August";

                DrawLine2();
            Console.WriteLine($"| {"Summer Weather Report", 34} {"|", 12}");
            DrawLine2();
            Console.WriteLine("| Month  |       Rainy     Cloudy      Sunny    |");
            DrawLine2();
            Console.WriteLine($"| June   | {juneRainy, 10} {juneCloudy,10} {juneSunny,10} {"|", 5}");
            Console.WriteLine($"| July   | {julyRainy, 10} {julyCloudy,10} {julySunny,10} {"|",5}");
            Console.WriteLine($"| August | {augustRainy, 10} {augustCloudy,10} {augustSunny,10} {"|",5}");
            DrawLine2();
            Console.WriteLine($"| Totals | {juneRainy + julyRainy + augustRainy, 10} {juneCloudy + julyCloudy + augustCloudy,10} {juneSunny + julySunny + augustSunny, 10} {"|",5}");
            DrawLine2();
            Console.WriteLine($"| The month with the most rainy days was {mostRainy, -2} |");
            DrawLine2();

        }
    }
}
