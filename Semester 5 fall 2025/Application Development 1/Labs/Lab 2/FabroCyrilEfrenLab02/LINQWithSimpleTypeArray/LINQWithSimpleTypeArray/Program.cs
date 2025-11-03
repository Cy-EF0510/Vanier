using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQWithSimpleTypeArray
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // create an integer array
            var values = new[] {2, 9, 5, 0, 3, 7, 1, 4, 8, 5 };

            // display original values
            Console.Write ("Original array:");
            foreach (var element in values)
            {
                Console.Write ($" {element}");
            }

            // LINQ query that obtains values greater than 4 from the array
            var filtered =
                from value in values
                where value > 4
                select value;

            // display filtered values
            Console.Write("\nArray values greater than 4:");
            foreach (var element in filtered)
            {
                Console.Write($" {element}");
            }

            // use orderby clause to sort original values in ascending order
            var sorted =
                from value in values
                orderby value
                select value;

            // display sorted results
            Console.Write("\nOriginal array, sorted:");
            foreach (var element in sorted)
            {
                Console.Write($" {element}");
            }

            // sort the filtered results into descending order
            var sortFilteredResults = 
                from value in filtered
                orderby value descending
                select value;

            // display the sorted results
            Console.Write("\nValues greater than 4, descending order (two queries):");
            foreach (var element in sortFilteredResults)
            {
                Console.Write($" {element}");
            }

            // filter original array and sort results in descending order
            var sortAndFilter =
                from value in values
                where value > 4
                orderby value descending
                select value;

            // display the filtered and sorted results
            Console.Write("\nValues greater than 4, descending order (one query):");
            foreach (var element in sortAndFilter)
            {
                Console.Write($" {element}");
            }

            Console.WriteLine();

        }
    }
}
