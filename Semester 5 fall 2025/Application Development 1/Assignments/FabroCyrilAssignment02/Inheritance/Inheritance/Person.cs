using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inheritance
{
    internal class Person
    {
        private String lastName;
        private String firstName;
        private String address;
        private String phone;

        public Person(string lastName, string firstName, string address, string phone)
        {
            LastName = lastName;
            FirstName = firstName;
            Address = address;
            Phone = phone;
        }

        public String LastName { get { return lastName; } set { lastName = value; } }
        public String FirstName { get { return firstName; } set { firstName = value; } }
        public String Address { get { return address; } set { address = value; } }
        public String Phone { get { return phone; } set { phone = value; } }

        public static void DrawLine()
        {
            Console.Write("|");
            for (int i = 0; i < 78; i++)
                Console.Write("-");
            Console.WriteLine("|");
        }

        public virtual void DisplayRecord()
        {
            DrawLine();
            Console.WriteLine($"|{"PERSON",42} {"|",36}");
            DrawLine();
            Console.WriteLine($"|{"Last Name",-30} | {LastName,-44} |");
            DrawLine();
            Console.WriteLine($"|{"First Name",-30} | {FirstName,-44} |");
            DrawLine();
            Console.WriteLine($"|{"Address",-30} | {Address,-44} |");
            DrawLine();
            Console.WriteLine($"|{"Phone Number",-30} | {Phone,44} |");
            DrawLine();
        }
    }
}
