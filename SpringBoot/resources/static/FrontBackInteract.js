function FrontBackInteract(){
    let jsonObj = {
        "front_data": "this is a front end data"
    };

    $.ajax({
        type: 'POST',
        url: "/url-name",
        dataType: "json",
        data: JSON.stringify(jsonObj),
        contentType : "application/json",
        success: function(data) {
            //正确传递从前段返回的json数据
            console.log(data);
        },
        error: function() {
            console.log("error...");
        }
});
}