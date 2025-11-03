using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HealthRecords
{
    internal class HealthProfile
    {
        private String firstName;
        private String lastName;
        private int birthYear;
        private int height;
        private int weight;
        private int currentYear;

        public HealthProfile(string firstName, string lastName, int birthYear, int height, int weight, int currentYear)
        {
            FirstName = firstName;
            LastName = lastName;
            BirthYear = birthYear;
            Height = height;
            Weight = weight;
            CurrentYear = currentYear;
        }


        //Properties
        public String FirstName
        {
            get
            {
                return firstName;
            }
            set
            {
                firstName = value;
            }
        }
        public String LastName
        {
            get { return lastName; }
            set { lastName = value; }
        }
        public int BirthYear
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
        public int Height
        {
            get { return height; }
            set
            {
                if (value >= 0 && value <= 108)
                    height = value;
                else
                {
                    Console.WriteLine("Height value is not valid");
                    height = 2000;
                }
            }
        }
        public int Weight
        {
            get { return weight; }
            set
            {
                if (value >= 0 && value <= 1400)
                    weight = value;
                else
                {
                    Console.WriteLine("Weight value is not valid");
                    weight = 180;
                }
            }
        }
        public int CurrentYear
        {
            get { return currentYear; }
            set
            {
                if (value != 2025) {
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
            get
            {
                 return CurrentYear - BirthYear;
            }
        }

        private int CurrentMaximumHeartRate
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

        public double BMI()
        {
            return Math.Round((Weight * 703) / (Math.Pow(height, 2)), 2);
        }

        public String BMITextValue()
        {
            double bmi = BMI();
            if(bmi < 18.5)
            {
                return "Underweight";
            }
            else if(bmi >= 18.5 && bmi <= 24.9)
            {
                return "Normal";
            }
            else if (bmi >= 25 && bmi <= 29.9)
            {
                return "Overweight";
            }
            if (bmi >= 30)
            {
                return "Obese";
            }
            else
            {
                return "Error";
            }
        }

        public static void DrawLine()
        {
            Console.Write("|");
            for (int i = 0; i < 78; i++)
                Console.Write("-");
            Console.WriteLine("|");
        }

        public void DisplayHealthRecord()
        {
            DrawLine();
            Console.WriteLine($"|{"PATIENT HEALTH RECORD",53} {"|",25}");
            DrawLine();
            Console.WriteLine($"|{"Patient Name",-30} | {LastName + ", " + FirstName,-44} |");
            DrawLine();
            Console.WriteLine($"|{"Patient Birth Year",-30} | {BirthYear,44} |");
            DrawLine();
            Console.WriteLine($"|{"Patient Age",-30} | {CurrentAge,44} |");
            DrawLine();
            Console.WriteLine($"|{"Patient Height (inch)",-30} | {Height, 44} |");
            DrawLine();
            Console.WriteLine($"|{"Patient Weight (pound)",-30} | {Weight,44} |");
            DrawLine();
            Console.WriteLine($"|{"Maximum Heart Rate",-30} | {CurrentMaximumHeartRate,44} |");
            DrawLine();
            Console.WriteLine($"|{"Target Heart Rate Range",-30} | {TargetMinimumHeartRate + " - " + TargetMaximumHeartRate,44} |");
            DrawLine();
            Console.WriteLine($"|{"BMI Numeric Value",-30} | {BMI(), 44} |");
            DrawLine();
            Console.WriteLine($"|{"BMI Text Value",-30} | {BMITextValue(),-44} |");
            DrawLine();

        }
    }
}
