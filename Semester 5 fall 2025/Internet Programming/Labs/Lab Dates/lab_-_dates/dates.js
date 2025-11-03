// Dates lab
// year must be 4-digit format, from 1970 to today (use Date object to figure out today)
// month must be full text month year, from 'January' to 'December' (use Date object to figure out month names)
// days must be between 1 and 31

// Create a function called 'fillDates' that completes the various '<select>' elements with the years, months and days
function fillDates(){
    const yearSelect = document.getElementById("year");
    const monthSelect = document.getElementById("month");
    const daySelect = document.getElementById("day");
    const selectedMonth = monthSelect.value;
    const SelectedYear = yearSelect.value;

    //Create Years (1970-Present)
    const startYear = 1970;
    const endYear = new Date().getFullYear();
    for(i = startYear; i <= endYear; i++){
        opt = document.createElement("option");
        opt.value = i;
        opt.text = i;
        opt.textContent = i;
        yearSelect.appendChild(opt);
    }

    //Create Months
    for(i = 0; i < 12; i++){
        const opt = document.createElement("option");
        const m = new Date();
        m.setMonth(i);
        opt.value = i;
        opt.text = m.toLocaleString("default", {month: "long"});
        monthSelect.appendChild(opt);
    }

    //Create Days
    for(i = 1; i <= 31; i++){
        opt = document.createElement("option");
        opt.value = i;
        opt.text = i;
        daySelect.appendChild(opt);
    }  
}

// create a function called 'calculateAgeInDays' that calculates the age (in days) of someone with the birthday 
// selected from the dropdowns (described above)
function calculateAgeInDays(){
    const yearSelect = document.getElementById("year");
    const monthSelect = document.getElementById("month");
    const daySelect = document.getElementById("day");
    const result = document.getElementsByClassName("age");

    var yearValue = yearSelect.value;
    var monthValue = monthSelect.value;
    var dayValue = daySelect.value; 

    //get the input of the user
    const selectedDate = new Date(yearValue, monthValue, dayValue);
    //get the current date
    const currentDate = new Date();
    //get the diffrence between the current date and selected date (Used Math.trunc to remove the decimal numbers)
    var difference = Math.trunc((currentDate - selectedDate) / (1000 * 60 * 60 * 24));
    //prints text to all elements with the class name "age"
    for(let el of result){
        el.textContent = difference + "  Days";
    }
}


// create a function called 'calculateChristmas' that calculates the number of days between the current day 
// and Christmas (keep an mind that dec 26 2025 has 364 days until Christmas)
function calculateChristmas(){
    const result = document.getElementsByClassName("christmas");
    const currentDate = new Date();
    //const currentDate = new Date(2025, 11, 26); //This line proves that it will change the year depending on currentDate
    const currentYear = currentDate.getFullYear();
    var christmas;
    //Checks whether the current date is less or more than the christmas date
    if(currentDate > new Date(currentYear, 11, 25)){
        christmas = new Date(currentYear + 1, 11, 25);
    }
    else{
        christmas = new Date(currentYear, 11, 25);
    }
    //difference between christmas and current date
    var difference = Math.trunc((christmas - currentDate) / (1000 * 60 * 60 * 24));
    //prints result
    for(let e of result){
        e.textContent = difference + "  Days"
    }

}