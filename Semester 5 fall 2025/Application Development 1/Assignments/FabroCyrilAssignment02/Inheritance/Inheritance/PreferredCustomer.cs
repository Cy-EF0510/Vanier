using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inheritance
{
    internal class PreferredCustomer : Customer
    {
        private decimal purchaseAmount;
        private int discountLevel;

        public PreferredCustomer(string lastName, string firstName, string address, string phone, int customerNumber, bool mailingList,
            decimal purchaseAmount)
            : base(lastName, firstName, address, phone, customerNumber, mailingList)
        {
            PurchaseAmount = purchaseAmount;
            DiscountLevel = discountLevel;
        }

        public decimal PurchaseAmount
        {
            get { return purchaseAmount; }
            set
            {
                if (value < 0)
                {
                    purchaseAmount = 0;
                    Console.WriteLine("Customer purchases amount should be a positive value");
                }
                purchaseAmount = value;
            }
        }
        public int DiscountLevel 
        { 
            get 
            { 
                return discountLevel; 
            }
            set
            {
                if (PurchaseAmount < 500m)
                    discountLevel = 0;
                else if (PurchaseAmount <= 999m)
                    discountLevel = 5;
                else if (PurchaseAmount <= 1499m)
                    discountLevel = 6;
                else if (PurchaseAmount <= 1999m)
                    discountLevel = 7;
                else if (PurchaseAmount >= 2000m)
                    discountLevel = 10;
 
            }
        }

        public override void DisplayRecord()
        {
            DrawLine();
            Console.WriteLine($"|{"PREFERRED CUSTOMER",48} {"|",30}");
            DrawLine();
            Console.WriteLine($"|{"Customer Number",-30} | {CustomerNumber,44} |");
            DrawLine();
            Console.WriteLine($"|{"Last Name",-30} | {LastName,-44} |");
            DrawLine();
            Console.WriteLine($"|{"First Name",-30} | {FirstName,-44} |");
            DrawLine();
            Console.WriteLine($"|{"Address",-30} | {Address,-44} |");
            DrawLine();
            Console.WriteLine($"|{"Phone Number",-30} | {Phone,-44} |");
            DrawLine();
            Console.WriteLine((MailingList) ? $"|{"Mailing List",-30} | {"Yes",-44} |" : $"|{"Mailing List",-30} | {"No",-44} |");
            DrawLine();
            //Console.WriteLine($"|{"Purchase Amount",-30} | {"$" + PurchaseAmount.ToString("#,##0.00"),44} |");
            Console.WriteLine($"|{"Purchase Amount",-30} | {PurchaseAmount, 44:C} |");
            DrawLine();
            Console.WriteLine($"|{"Discount Level",-30} | {DiscountLevel/100.0,44:P0} |");
            DrawLine();
        }
    }
}
