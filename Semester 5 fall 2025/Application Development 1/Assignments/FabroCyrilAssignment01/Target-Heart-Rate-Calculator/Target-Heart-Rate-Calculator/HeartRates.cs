using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.AccessControl;
using System.Text;
using System.Threading.Tasks;

namespace Target_Heart_Rate_Calculator
{
    internal class HeartRates
    {
        private String firstName;
        private String lastName;
        private int birthYear;
        private int currentYear;

        public HeartRates(String firstName, String lastName, int birthYear, int currentYear)
        {
            FirstName = firstName;
            LastName = lastName;
            BirthYear = birthYear;
            CurrentYear = currentYear;
        }

        private String FirstName
        {
            get { return firstName; }
            set { firstName = value; } 
        }
        private String LastName
        {
            get { return lastName; }
            set { lastName = value; }
        }
        private int BirthYear
        {
            get { return birthYear; }
            set 
            {
                if (value >= 1900 && value <= 2025)
                    birthYear = value;
                else
                {
                    Console.WriteLine("Birth year value is not valid");
                    birthYear = 2000;
                }
            }
        }
        private int CurrentYear
        {
            get { return currentYear; }
            set
            {
                if (value != DateTime.Now.Year)
                {
                    Console.WriteLine("Current year value is not valid. Value now set to 2025");
                    currentYear = 2025;
                }
                else
                    currentYear = value;
            }
        }

        //Extra Properties
        public int CurrentAge
        {
            get { return CurrentYear - BirthYear; }
        }
        public int CurrentMaximumHeartRate
        {
            get { return 220 - CurrentAge; }
        }
        public int TargetMinimumHeartRate
        {
            get { return (int)(CurrentMaximumHeartRate * 0.5); }
        }
        public int TargetMaximumHeartRate
        {
            get { return (int)(CurrentMaximumHeartRate * 0.85); }
        }

        public static void DrawLine()
        {
            Console.Write("|");
            for(int i = 0; i < 78; i++)
                Console.Write("-");
            Console.WriteLine("|");
        }

        //Display patient's data in tabular form
        public void DisplayPatientRecord()
        {
            DrawLine();
            Console.WriteLine($"|{"PATIENT HEART RATE RECORD",53} {"|",25}");
            DrawLine();
            Console.WriteLine($"|{"Patient Name", -30} | {LastName + ", " + FirstName, -44} |");
            DrawLine();
            Console.WriteLine($"|{"Patient Birth Year", -30} | {BirthYear, 44} |");
            DrawLine();
            Console.WriteLine($"|{"Patient Age", -30} | {CurrentAge, 44} |");
            DrawLine();
            Console.WriteLine($"|{"Maximum Heart Rate", -30} | {CurrentMaximumHeartRate, 44} |");
            DrawLine();
            Console.WriteLine($"|{"Target Heart Rate Range", -30} | {TargetMinimumHeartRate + " - " + TargetMaximumHeartRate, 44} |");
            DrawLine();
        }
    }
}
