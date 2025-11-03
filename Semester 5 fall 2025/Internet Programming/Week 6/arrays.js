// var cars = ["Honda", "Toyota", "Kia", "Ford"];
// console.log(cars);
// console.log(cars[0]);
// cars[0] = 'Tesla';
// console.log(cars);
// cars[4] = 'ttt';
// console.log(cars);

// var fruits = [];
// fruits[0] = "Banana";
// fruits[1] = "apples";
// fruits[2] = 'oranges';
// fruits[3] = 'pineapple';
// console.log(fruits);

// // cant do this cuz the previous indexes are empty
// var babyNames = [];
// babynames[300] = 'Theodore';
// console.log(babyNames);
// for(i = 0; i < babyNames.length; i++){
//     console.log(babyNames[i]);
// }

// for(const name of babyNames){
//     console.log(i);
// }

// babyNames.forEach(logger);
// function logger(item){
//     console.log(item);
// }

// var toys = new Array("Lego", "Barbie", "Nintendo");
// console.log(toys);
// console.log(toys[1]);
// toy[1] = "GIJoe";
// toys[4] = "Barbie";
// toys.push("Elmo");
// console.log(toys);

// toys.push({id:5, name:"Transformer"})

var toys = new Array();
toys.push({id:1, name:"Transformer"});
toys.push({id:532, name:"Barbie"});
toys.push({id:54, name:"Nintendo"});
toys.push({id:55, name:"Lego"});
toys.push({id:57, name:"GIJoe"});

toys.sort(function(a, b){
    return a.id - b.id || a.name.localeCompare(b.name);
});

function sortByName(a, b){
    if(a.name < b.name) return -1;
    if(b.name < a.name) return 1;
    return 0;
}

toys.sort(sortByName);
console.log(toys);
toys.sort(sortByName);
console.log(toys)