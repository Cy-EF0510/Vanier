function selectColor() {
    var backgroundSelect = document.querySelector("#color");
    backgroundSelect = backgroundSelect.value;

    document.cookie = backgroundColor;
    document.body.setAttribute("style", "background-color:" + backgroundColor + ";")
}
