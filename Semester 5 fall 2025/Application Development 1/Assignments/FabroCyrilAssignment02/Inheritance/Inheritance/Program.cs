using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inheritance
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Please Enter Customer Number: ");
            int customerNumber = int.Parse(Console.ReadLine());
            Console.Write("Please Enter Customer's Last Name: ");
            String lastName = Console.ReadLine();
            Console.Write("Please Enter Customer's First Name: ");
            String firstName = Console.ReadLine();
            Console.Write("Please Enter Customer's Address: ");
            String address = Console.ReadLine();
            Console.Write("Please Enter Customer's Phone Number: ");
            String phone = Console.ReadLine();
            Console.Write("Does Customer Have a Mailing List? (\"Y\" or \"N\"): ");
            String mlString = Console.ReadLine();
            bool mailingList = false;
            if (string.Equals(mlString, "Y", StringComparison.OrdinalIgnoreCase))
                mailingList = true;
            else if (string.Equals(mlString, "N", StringComparison.OrdinalIgnoreCase))
                mailingList = false;
            Console.Write("Please Enter Customer's Purchases Amount: ");
            decimal purchaseAmount = decimal.Parse(Console.ReadLine());

            Person p1 = new Person(lastName, firstName, address, phone);
            p1.DisplayRecord();
            Console.WriteLine();
            Customer c1 = new Customer(lastName, firstName, address, phone,customerNumber, mailingList);
            c1.DisplayRecord();
            Console.WriteLine();
            PreferredCustomer pc1 = new PreferredCustomer(lastName, firstName, address, phone, customerNumber, mailingList, purchaseAmount);
            pc1.DisplayRecord();
        }
    }
}
