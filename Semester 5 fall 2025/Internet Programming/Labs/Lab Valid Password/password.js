function fillOptions(){
    const charSelect = document.getElementById("characterNum");
    const upperSelect = document.getElementById("uppercaseNum");
    const numSelect = document.getElementById("numberNum");
    const specialSelect = document.getElementById("specialNum");

    //Characters
    const startChar = 8;
    const endChar = 24;
    for(i = startChar; i <= endChar; i++){
        opt = document.createElement("option");
        opt.value = i;
        opt.text = i;
        opt.textContent = i;
        charSelect.appendChild(opt);
    }
    //Uppercases
    const startUpper = 2;
    const endUpper = 6;
    for(i = startUpper; i <= endUpper; i++){
        opt = document.createElement("option");
        opt.value = i;
        opt.text = i;
        opt.textContent = i;
        upperSelect.appendChild(opt);
    }
    //Numbers
    const startNum = 2;
    const endNum = 6;
    for(i = startNum; i <= endNum; i++){
        opt = document.createElement("option");
        opt.value = i;
        opt.text = i;
        opt.textContent = i;
        numSelect.appendChild(opt);
    }
    //Spcials
    const startSpec = 2;
    const endSpec = 6;
    for(i = startSpec; i <= endSpec; i++){
        opt = document.createElement("option");
        opt.value = i;
        opt.text = i;
        opt.textContent = i;
        specialSelect.appendChild(opt);
    }

}

function generatePassword(){
    const RandExp = require("randexp");
    const generate = document.getElementById("pass")
    const charSelect = document.getElementById("characterNum");
    const upperSelect = document.getElementById("uppercaseNum");
    const numSelect = document.getElementById("numberNum");
    const specialSelect = document.getElementById("specialNum");

    var charValue = charSelect.value;
    var upperValue = upperSelect.value;
    var numValue = numSelect.value;
    var specialValue = specialSelect.value;

    let pattern = "[A-Z]{${upperValue}}[\d]{${numValue}}[!-_#%&]{${specialValue}}[a-z]{${charValue - upperValue - numValue - specialValue}}";
    let re = new RegExp(pattern)
    let result = new RandExp(re).get();

    generate.textContent = result;
}