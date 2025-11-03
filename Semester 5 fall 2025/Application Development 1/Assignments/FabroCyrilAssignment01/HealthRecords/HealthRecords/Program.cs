using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HealthRecords
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter your first name: ");
            String firstName = Console.ReadLine();
            Console.Write("Enter your last name: ");
            String lastName = Console.ReadLine();
            Console.Write("Enter your birth year: ");
            int birthYear = int.Parse(Console.ReadLine());
            Console.Write("Enter your height (in inches): ");
            int height = int.Parse(Console.ReadLine());
            Console.Write("Enter your weight (in pounds): ");
            int weight = int.Parse(Console.ReadLine());
            Console.Write("Enter the current year: ");
            int currentYear = int.Parse(Console.ReadLine());
            Console.WriteLine();
            HealthProfile patient1 = new HealthProfile(firstName, lastName, birthYear, height, weight, currentYear);
            patient1.DisplayHealthRecord();
        }
    }
}
