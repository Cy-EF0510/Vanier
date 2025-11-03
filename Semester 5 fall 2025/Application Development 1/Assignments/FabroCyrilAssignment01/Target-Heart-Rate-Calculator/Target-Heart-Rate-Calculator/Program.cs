using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Target_Heart_Rate_Calculator
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
            Console.Write("Enter the current year: ");
            int currentYear = int.Parse(Console.ReadLine());
            Console.WriteLine();
            HeartRates patient1 = new HeartRates(firstName, lastName, birthYear, currentYear);
            patient1.DisplayPatientRecord();
        }
    }
}
