using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQWithListCollection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //populate a List of strings
            var items = new List<string>();
            items.Add("aQua");
            items.Add("RusT"); // add "RusT" to the end of the List
            items.Add("yElLow"); // add "yElLow" to the end of the List
            items.Add("rEd");

            // display initial List
            Console.Write("items contains:");
            foreach (var item in items)
            {
                Console.Write($" {item}");
            }
            Console.WriteLine();

            // convert to uppercase, select those starting with "R" and sort
            var startWithR =
                from item in items
                let uppercaseString = item.ToUpper()
                where uppercaseString.StartsWith("R")
                orderby uppercaseString
                select uppercaseString;

            // display query results
            Console.Write("results of query startsWithR:");
            foreach (var item in startWithR)
            {
                Console.Write($" {item}");
            }
            Console.WriteLine();

            items.Add("rUbY"); // add "rUbY" to the end of the List
            items.Add("SaFfRon"); // add "SaFfRon" to the end of the List

            // display initial List
            Console.Write("items contains:");
            foreach (var item in items)
            {
                Console.Write($" {item}");
            }
            
             Console.WriteLine(); // output end of line

            // display updated query results
            Console.Write("results of query startsWithR:");
            foreach (var item in startWithR)
            {
                Console.Write($" {item}");
            }
            
            Console.WriteLine(); // output end of line
        }
    }
}
