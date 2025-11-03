var canvas, ctx;

function draw(){
    canvas = document.getElementById("myCanvas");
    ctx = canvas.getContext("2d");

    
    // // Creating a triangle
    // ctx.beginPath();
    // ctx.strokeStyle = "#FF0000"; //stoke == outline
    // ctx.fillStyle = "blue";
    // ctx.moveTo(50, 100);
    // ctx.lineTo(200, 200);
    // ctx.lineTo(400, 50);
    // ctx.lineTo(50, 100);
    // ctx.stroke();
    // ctx.fill();
    
    // // Creating a rectangle
    // ctx.beginPath();
    // ctx.strokeStyle = "#00FF00";
    // ctx.fillStyle = "cyan";
    // ctx.rect(350, 350, 250, 100); //x-position, y-position, x-length, y-length
    

    // //making a 3d rect
    // ctx.rect(300, 300, 250, 100);
    // ctx.moveTo(300, 300);
    // ctx.lineTo(350, 350);
    // ctx.moveTo(300, 400);
    // ctx.lineTo(350, 450);
    // ctx.moveTo(550, 300);
    // ctx.lineTo(600, 350);
    // ctx.moveTo(550, 400);
    // ctx.lineTo(600, 450);
    // ctx.fill();
    // ctx.stroke(); //you only to call this function once
    // ctx.fillRect(450, 150, 200, 100);
    
    var s = new Sun(100, 175);
    var h = new House(300, 200);
    s.draw();
    h.draw();
    for(i = 0; i < 24; i++){
        setInterval(handleAnimation, 24, s, h);
    }
}

function Sun(x = 150, y = 150, radius = 50){
    this.x = x;
    this.y = y;
    this.radius = radius;

    this.draw = function(){
        ctx.beginPath();
        ctx.arc(this.x, this.y, this.radius, 0, 2*Math.PI);
        ctx.stroke();
        ctx.fillStyle = "yellow";
        ctx.fill();
    }

    this.move = function(moveX = 15, moveY = 15){
        this.x += moveX;
        this.y += moveY;
    }
}

function House(height = 300, width = 200){
    this.width = width;
    this.height = height;
    x = (canvas.width - this.width) / 2;
    y = canvas.height - this.height;

    this.draw = function(){
        // ctx.beginPath();
        // ctx.strokeStyle = "#00FF00";
        // ctx.fillStyle = "cyan";

        var startX = this.x;
        var startY = this.y;
        ctx.rect(
            startX, 
            startY, 
            width, 
            height); //x-position, y-position, x-length, y-length
            
        ctx.stroke();
        // ctx.fill();
        ctx.moveTo(x, y);
        ctx.lineTo(canvas.width / 2, canvas.height - height - height / 2);
        ctx.lineTo(x + width, y);
    }
}

function handleAnimation(sun, house){
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    sun.move(0.001, 0);
    sun.draw();
    house.draw();
}

// function drawHouse(width = 300, height = 200){
//     // Creating a rectangle
//     ctx.beginPath();
//     // ctx.strokeStyle = "#00FF00";
//     // ctx.fillStyle = "cyan";

//     var startX = (canvas.width - width) / 2;
//     var startY = canvas.height - height;
//     ctx.rect(
//         startX, 
//         startY, 
//         width, 
//         height); //x-position, y-position, x-length, y-length
        
//     ctx.stroke();
//     // ctx.fill();
//     ctx.moveTo(startX, startY);
//     ctx.lineTo(canvas.width / 2, canvas.height - height - height / 2);
//     ctx.lineTo(startX + width, startY);
//     ctx.stroke();
// }