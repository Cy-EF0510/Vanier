function loadXML(){
    var url = "cd_catalog.xml";
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function(){
        if(this.readyState == 4 && this.status == 200){
            var catalog = this.responseXML.getElementsByTagName("CATALOG")[0];
            var cds = catalog.getElementsByTagName("CD");

            // console.log(cds);
            renderCDs(cds);
        }
    }

    xhttp.open("GET", url);
    xhttp.send();
}

function renderCDs(list){
    for(i = 0; i < list.length; i++){
        var cd = list[i];
        let row = document.createElement("tr");

        let title_td = document.createElement("td");
        let title = cd.getElementsByTagName("TITLE")[0].innerHTML;
        title_td.innerHTML = title; 
        row.appendChild(title_td);
        console.log(row)

        let aritst_td = document.createElement("td");
        let aritst = cd.getElementsByTagName("ARTIST")[0].innerHTML;
        aritst_td.innerHTML = aritst; 
        row.appendChild(aritst_td);

        
        document.getElementsByTagName("tbody")[0].appendChild(row);
    }
}