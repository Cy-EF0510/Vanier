// This is how to create an object in javascript (no need to create in the class)
function Person(first, last, age){
    this.first = first;
    this.last = last;
    this.age = age;
}

// this is how you create a method/function
pat.full = function(){
    console.log(this.first + " " + this.last + " " + this.age)
}

function myFct(x){
    if(x>10){
        return x;
    }else if(x>5){
        return "help";
    }else{
        console.log("What were you thinking?");
    }

}