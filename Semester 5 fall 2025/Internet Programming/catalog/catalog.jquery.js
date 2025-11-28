$(document).ready(function(){
    var url = "cd_catalog.xml";

    $.post(url, {}, function(data, status){
        // console.log($(data).find("CATALOG"));
        renderCDs($(data).find("CD"));
    })
});

function renderCDs(list){
    list.each(function(index, element){
        var  row = $("<tr/>")
        // console.log($(element))
        let title = $(element).find("TITLE").html();
        row.append($("<td/>").html(title));

        let artist = $(element).find(("ARTIST").length == 0) ? $(element).attr("ARTIST") : $(element).find("ARTIST").html();
        row.append($("<td/>").html(artist));

        let country = $(element).find("COUNTRY").html();
        row.append($("<td/>").html(country));

        let company = $(element).find("COMPANY").html();
        row.append($("<td/>").html(company));

        let price = $(element).find("PRICE").html();
        row.append($("<td/>").html(price));

        let year = $(element).find("YEAR").html();
        row.append($("<td/>").html(year));

        // console.log(title);

        $("table > tbody").append(row);
        console.log(row)
    });
}