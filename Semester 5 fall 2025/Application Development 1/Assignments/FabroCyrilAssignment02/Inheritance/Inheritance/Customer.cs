using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inheritance
{
    internal class Customer : Person
    {
        private int customerNumber;
        private bool mailingList;
        public Customer(string lastName, string firstName, string address, string phone, 
            int customerNumber, bool mailingList)
            : base(lastName, firstName, address, phone)
        {
            CustomerNumber = customerNumber;
            MailingList = mailingList;
        }

        public int CustomerNumber { get { return customerNumber; } 
            set 
            {
                if (value > 0)
                {
                    customerNumber = value;
                }
                else
                {
                    customerNumber = 9999;
                    Console.WriteLine("Invalid Customer Number");
                }
            } 
        }
        public bool MailingList 
        { 
            get { return mailingList; } 
            set { mailingList = value; } 
        }

        public override void DisplayRecord()
        {
            DrawLine();
            Console.WriteLine($"|{"CUSTOMER",43} {"|",35}");
            DrawLine();
            Console.WriteLine($"|{"Customer Number",-30} | {CustomerNumber,44} |");
            DrawLine();
            Console.WriteLine($"|{"Last Name",-30} | {LastName,-44} |");
            DrawLine();
            Console.WriteLine($"|{"First Name",-30} | {FirstName,-44} |");
            DrawLine();
            Console.WriteLine($"|{"Address",-30} | {Address,-44} |");
            DrawLine();
            Console.WriteLine($"|{"Phone Number",-30} | {Phone,44} |");
            DrawLine();
           // Console.WriteLine((MailingList) ? $"|{"Mailing List",-30} | {"Yes",-44} |" : $"|{"Mailing List",-30} | {"No",-44} |");
            String mailingListText = MailingList ? "Yes" : "No";
            Console.WriteLine($"|{"Mailing List",-30} | {mailingListText,-44} |");
            DrawLine();
        }
    }
}
