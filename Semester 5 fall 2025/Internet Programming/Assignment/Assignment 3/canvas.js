var canvas, ctx;

function draw(){
    canvas = document.getElementById("myCanvas");
    ctx = canvas.getContext("2d");

    let cloud = [];
    cloud.push(new Cloud());
    cloud.push(new Cloud(300, 130));
    cloud.push(new Cloud(265, 190));
    cloud.push(new Cloud(175, 125));
    cloud.push(new Cloud(200, 175));
    cloud.push(new Cloud(235, 110));
    cloud.push(new Cloud(325, 180));

    // for(let i = 0; i < cloud.length; i++){
    //     cloud[i].draw();
    // }

    setInterval(handleAnimation, 200, cloud);
}

function handleAnimation(arr){
    ctx.clearRect(0, 0, canvas.width, canvas.height);

    arr.forEach(element => {
        element.move(15, 0);
        element.draw();
    });
}

function Cloud(x = 250, y = 150){
    this.x = x;
    this.y = y;
    this.r = 40;
    this.directionY = 1;
    this.directionX = 1;

    this.draw = function(){
        ctx.beginPath();
        ctx.strokeStyle = "white";
        ctx.fillStyle = "white";
        ctx.arc(this.x,
                this.y,
                this.r,
                0,
                2*Math.PI);
        ctx.stroke();
        ctx.fill();
    }

    this.move = function(moveX = 15, moveY = 15){
        if((this.x + this.r >= canvas.width) || (this.x - this.r <= 0)){
            this.directionX *= -1;
        }
        if((this.y + this.r >= canvas.width) || (this.y - this.r <= 0)){
            this.directionX *= -1;
        }
        this.x += (moveX * this.directionX);
        this.y += (moveY * this.directionY);
    }
}