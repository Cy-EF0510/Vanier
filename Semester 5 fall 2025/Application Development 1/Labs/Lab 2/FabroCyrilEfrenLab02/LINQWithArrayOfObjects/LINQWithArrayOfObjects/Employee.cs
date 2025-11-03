using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQWithArrayOfObjects
{
    internal class Employee
    {
        public string FirstName { get;  }
        public string LastName { get; }
        public decimal monthlySalary;

        public Employee(string firstName, string lastName, decimal monthlySalary)
        {
            FirstName = firstName;
            LastName = lastName;
            MonthlySalary = monthlySalary;
        }

        public decimal MonthlySalary
        {
            get { return monthlySalary; }
            set 
            {
                if (value >= 0M) 
                { 
                    monthlySalary = value;
                } 
            }
        }
        // return a string containing the employee's information
        public override string ToString() => $"{FirstName,-10} {LastName,-10} {MonthlySalary,10:C}";
    }
}
