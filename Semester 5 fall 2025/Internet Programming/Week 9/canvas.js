//Bouncing Ball
//Ball as an Object
//make Ball move up and down
// make Ball change direction when edge of canvas
// make multiple balls that move
// random starting positions
// random ball colors
var canvas, ctx;

function draw(){
canvas = document.getElementById("myCanvas");
ctx = canvas.getContext("2d");

c = new Circle(176, 167, 60, "red");
// c.draw();
// c.move(167, 167);
// c.draw();

setInterval(generateMovement, 250, c);
}

function generateMovement(circ){
    ctx.clearRect(0, 0, canvas.width, canvas.height)
    circ.move(25, 0);
    circ.draw();

}

function Circle(x = 0, y = 0, r = 0, color = ""){//object
    this.x = x;
    this.y = y;
    this.r = r;
    this.color = color;

    this.directionX = 1;
    this.directionY = 1;

    this.draw = function(){//object method
        ctx.beginPath();
        ctx.strokeStyle = this.color;
        ctx.fillStyle = this.color;
        ctx.arc(this.x,
                this.y, 
                this.r,
                0,
                2 * Math.PI);
        ctx.stroke();
        // ctx.fill();
    }

    this.move = function(moveX = 0, moveY = 0){//object method
        if((this.x >=  canvas.width) || (this.x-this.r <= 0)){
            this.directionX *= - 1;
        }
        this.x += (moveX * this.directionX);
        this.y += (moveY * this.directionY);
    }
}

