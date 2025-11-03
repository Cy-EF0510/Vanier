var today = new Date();

function logTime(){
    var rightNow = new Date().getTime();
    console.log(rightNow - oldTime)
    oldTime = rightNow;
}