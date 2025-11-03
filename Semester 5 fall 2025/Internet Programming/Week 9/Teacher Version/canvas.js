var canvas, ctx;

function draw(){
	canvas = document.getElementById("myCanvas");
	ctx = canvas.getContext("2d");


	circles = [];
	for(i=0;i<10;i++){
		var c = new Circle();
		circles.push(c);
	}

	setInterval(generateMovement, 200, circles);
}

function generateMovement(arr){
	ctx.clearRect(0,0, canvas.width, canvas.height);

	arr.forEach((element)=>{
							element.move(15,25);
							element.draw();
							}
				);

}

function generateRandomHexColor() {
	// Generate random RGB values
	var r = Math.floor(Math.random() * 256);
	var g = Math.floor(Math.random() * 256);
	var b = Math.floor(Math.random() * 256);

	var hexr = r.toString(16).padStart(2, '0');
	var hexg = g.toString(16).padStart(2, '0');
	var hexb = b.toString(16).padStart(2, '0');

	return "#" + hexr + hexg + hexb;
}

function Circle(x=0, y=0, r=0, color=""){
	this.x = (x == 0)  ? Math.random()*canvas.width : x;
	this.y = (y == 0)  ? Math.random()*canvas.height : y;
	this.r = (r == 0)  ? Math.random()*75 : r;
	this.color = (color == "") ? generateRandomHexColor() : color;

	this.directionX = Math.round(Math.random()) == 0 ? -1 : 1;
	this.directionY = Math.round(Math.random()) == 0 ? -1 : 1;

	this.draw = function(){
		ctx.beginPath();
		ctx.strokeStyle = this.color;
		ctx.fillStyle = this.color;
		ctx.arc(this.x,
				this.y,
				this.r,
				0,
				2*Math.PI);
		ctx.stroke();
		ctx.fill();	
	}

	this.move = function(moveX=0, moveY=0){
		if( (this.x+this.r >= canvas.width) || (this.x-this.r <= 0) ){
			this.directionX*=-1;
		}
		if( (this.y+this.r >= canvas.height) || (this.y-this.r <= 0) ){
			this.directionY*=-1;
		}

		this.x+=(moveX*this.directionX);
		this.y+=(moveY*this.directionY);
	}
}