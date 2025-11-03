using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CompareNames
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string name1 = "Ricardo";
            string name2 = "Ricardo";
            string name3 = "Julian";
            Console.WriteLine("compare {0} to {1} : {2}", name1, name2, name1 == name2);
            Console.WriteLine("compare {0} to {1} : {2}", name1, name3, name1 == name3);
            Console.WriteLine();
            Console.WriteLine("{0} and {1} : Equals() method gives {2}",
                name1, name2, name1.Equals(name2));
            Console.WriteLine("{0} and {1} : Equals() method gives {2}",
                name1, name3, name1.Equals(name3));
            Console.WriteLine();
            Console.WriteLine("{0} and {1} : CompareTo() method gives {2}",
                name1, name2, name1.CompareTo(name2));
            Console.WriteLine("{0} and {1} : CompareTo() method gives {2}",
                name1, name3, name1.CompareTo(name3));
            Console.WriteLine();
            Console.WriteLine("{0} and {1} : Compare() method gives {2}",
                name1, name2, String.Compare(name1, name2));
            Console.WriteLine("{0} and {1} : Compare() method gives {2}",
                name1, name3, String.Compare(name1, name3));
        }
    }
}
