$(document).on('click','#btn-filter',function(){
    var date = $("#datepicker").val();
    getDataGD(date);
    getDataTT(date);
    getDataGT(date);
    getDataTG(date);
    getDataXH(date);
    getDataVH(date);
    getDataDS(date);
    getDataPL(date);
    getDataKT(date);
    getDataND(date);
    getDataKH(date);
    getDataCN(date);
    getDataXC(date);
});

function getDataGD(date) {
    $.ajax({
        type : "get",
        url : "/get_event_gd",
        data:{date:date},
        contentType : "application/json",
        traditional : true,
        success : function(data){
            var data_gd = '';
            for(var i =0; i<data.length;i++){
                data_gd = data_gd + '<div class="border-parent">';
                data_gd = data_gd + '<p class="text-parent" data-toggle="collapse" data-target="#'+ data[i].event_id+'" >'+ data[i].event_name+'</p>';
                data_gd= data_gd + '<div id="'+data[i].event_id+'" class="collapse stories-content">'
                for(var j = 0; j< data[i].stories.length; j++){
                    data_gd = data_gd + '<p>'+ data[i].stories[j].title+'</p>';
                }
                data_gd = data_gd + '</div>';
                data_gd = data_gd + '</div>';
            }

            $("#1").html(data_gd);
        }
    });
};

function getDataTT(date) {
    $.ajax({
        type : "get",
        url : "/get_event_tt",
        data:{date:date},
        contentType : "application/json",
        traditional : true,
        success : function(data){
            var data_tt = '';
            for(var i =0; i<data.length;i++){
                data_tt = data_tt + '<div class="border-parent">';
                data_tt = data_tt + '<p class="text-parent" data-toggle="collapse" data-target="#'+ data[i].event_id+'" >'+ data[i].event_name+'</p>';
                data_tt= data_tt + '<div id="'+data[i].event_id+'" class="collapse stories-content">'
                for(var j = 0; j< data[i].stories.length; j++){
                    data_tt = data_tt + '<p>'+ data[i].stories[j].title+'</p>';
                }
                data_tt = data_tt + '</div>';
                data_tt = data_tt + '</div>';
            }
            $("#2").html(data_tt);
        }
    });
}

function getDataGT(date) {
    $.ajax({
        type : "get",
        url : "/get_event_gt",
        data:{date:date},
        contentType : "application/json",
        traditional : true,
        success : function(data){
            var data_gt = '';
            for(var i =0; i<data.length;i++){
                data_gt = data_gt + '<div class="border-parent">';
                data_gt = data_gt + '<p class="text-parent" data-toggle="collapse" data-target="#'+ data[i].event_id+'" >'+ data[i].event_name+'</p>';
                data_gt= data_gt + '<div id="'+data[i].event_id+'" class="collapse stories-content">'
                for(var j = 0; j< data[i].stories.length; j++){
                    data_gt = data_gt + '<p>'+ data[i].stories[j].title+'</p>';
                }
                data_gt = data_gt + '</div>';
                data_gt = data_gt + '</div>';
            }
            $("#3").html(data_gt);
        }
    });
}

function getDataTG(date) {
    $.ajax({
        type : "get",
        url : "/get_event_tg",
        data:{date:date},
        contentType : "application/json",
        traditional : true,
        success : function(data){
            var data_tg = '';
            for(var i =0; i<data.length;i++){
                data_tg = data_tg + '<div class="border-parent">';
                data_tg = data_tg + '<p class="text-parent" data-toggle="collapse" data-target="#'+ data[i].event_id+'" >'+ data[i].event_name+'</p>';
                data_tg= data_tg + '<div id="'+data[i].event_id+'" class="collapse stories-content">'
                for(var j = 0; j< data[i].stories.length; j++){
                    data_tg = data_tg + '<p>'+ data[i].stories[j].title+'</p>';
                }
                data_tg = data_tg + '</div>';
                data_tg = data_tg + '</div>';
            }
            $("#4").html(data_tg);
        }
    });
}

function getDataXH(date) {
    $.ajax({
        type : "get",
        url : "/get_event_xh",
        data:{date:date},
        contentType : "application/json",
        traditional : true,
        success : function(data){
            var data_xh = '';
            for(var i =0; i<data.length;i++){
                data_xh = data_xh + '<div class="border-parent">';
                data_xh = data_xh + '<p class="text-parent" data-toggle="collapse" data-target="#'+ data[i].event_id+'" >'+ data[i].event_name+'</p>';
                data_xh= data_xh + '<div id="'+data[i].event_id+'" class="collapse stories-content">'
                for(var j = 0; j< data[i].stories.length; j++){
                    data_xh = data_xh + '<p>'+ data[i].stories[j].title+'</p>';
                }
                data_xh = data_xh + '</div>';
                data_xh = data_xh + '</div>';
            }
            $("#5").html(data_xh);
        }
    });
}

function getDataVH(date) {
    $.ajax({
        type : "get",
        url : "/get_event_vh",
        data:{date:date},
        contentType : "application/json",
        traditional : true,
        success : function(data){
            var data_vh = '';
            for(var i =0; i<data.length;i++){
                data_vh = data_vh + '<div class="border-parent">';
                data_vh = data_vh + '<p class="text-parent" data-toggle="collapse" data-target="#'+ data[i].event_id+'" >'+ data[i].event_name+'</p>';
                data_vh= data_vh + '<div id="'+data[i].event_id+'" class="collapse stories-content">'
                for(var j = 0; j< data[i].stories.length; j++){
                    data_vh = data_vh + '<p>'+ data[i].stories[j].title+'</p>';
                }
                data_vh = data_vh + '</div>';
                data_vh = data_vh + '</div>';
            }
            $("#6").html(data_vh);
        }
    });
}

function getDataDS(date) {
    $.ajax({
        type : "get",
        url : "/get_event_ds",
        data:{date:date},
        contentType : "application/json",
        traditional : true,
        success : function(data){
            var data_ds = '';
            for(var i =0; i<data.length;i++){
                data_ds = data_ds + '<div class="border-parent">';
                data_ds = data_ds + '<p class="text-parent" data-toggle="collapse" data-target="#'+ data[i].event_id+'" >'+ data[i].event_name+'</p>';
                data_ds= data_ds + '<div id="'+data[i].event_id+'" class="collapse stories-content">'
                for(var j = 0; j< data[i].stories.length; j++){
                    data_ds = data_ds + '<p>'+ data[i].stories[j].title+'</p>';
                }
                data_ds = data_ds + '</div>';
                data_ds = data_ds + '</div>';
            }
            $("#7").html(data_ds);
        }
    });
}

function getDataPL(date) {
    $.ajax({
        type : "get",
        url : "/get_event_pl",
        data:{date:date},
        contentType : "application/json",
        traditional : true,
        success : function(data){
            var data_pl = '';
            for(var i =0; i<data.length;i++){
                data_pl = data_pl + '<div class="border-parent">';
                data_pl = data_pl + '<p class="text-parent" data-toggle="collapse" data-target="#'+ data[i].event_id+'" >'+ data[i].event_name+'</p>';
                data_pl= data_pl + '<div id="'+data[i].event_id+'" class="collapse stories-content">'
                for(var j = 0; j< data[i].stories.length; j++){
                    data_pl = data_pl + '<p>'+ data[i].stories[j].title+'</p>';
                }
                data_pl = data_pl + '</div>';
                data_pl = data_pl + '</div>';
            }
            $("#8").html(data_pl);
        }
    });
}

function getDataKT(date) {
    $.ajax({
        type : "get",
        url : "/get_event_kt",
        data:{date:date},
        contentType : "application/json",
        traditional : true,
        success : function(data){
            var data_kt = '';
            for(var i =0; i<data.length;i++){
                data_kt = data_kt + '<div class="border-parent">';
                data_kt = data_kt + '<p class="text-parent" data-toggle="collapse" data-target="#'+ data[i].event_id+'" >'+ data[i].event_name+'</p>';
                data_kt= data_kt + '<div id="'+data[i].event_id+'" class="collapse stories-content">'
                for(var j = 0; j< data[i].stories.length; j++){
                    data_kt = data_kt + '<p>'+ data[i].stories[j].title+'</p>';
                }
                data_kt = data_kt + '</div>';
                data_kt = data_kt + '</div>';
            }
            $("#9").html(data_kt);
        }
    });
}

function getDataND(date) {
    $.ajax({
        type : "get",
        url : "/get_event_nd",
        data:{date:date},
        contentType : "application/json",
        traditional : true,
        success : function(data){
            var data_nd = '';
            for(var i =0; i<data.length;i++){
                data_nd = data_nd + '<div class="border-parent">';
                data_nd = data_nd + '<p class="text-parent" data-toggle="collapse" data-target="#'+ data[i].event_id+'" >'+ data[i].event_name+'</p>';
                data_nd= data_nd + '<div id="'+data[i].event_id+'" class="collapse stories-content">'
                for(var j = 0; j< data[i].stories.length; j++){
                    data_nd = data_nd + '<p>'+ data[i].stories[j].title+'</p>';
                }
                data_nd = data_nd + '</div>';
                data_nd = data_nd + '</div>';
            }
            $("#10").html(data_nd);
        }
    });
}

function getDataKH(date) {
    $.ajax({
        type : "get",
        url : "/get_event_kh",
        data:{date:date},
        contentType : "application/json",
        traditional : true,
        success : function(data){
            var data_kh = '';
            for(var i =0; i<data.length;i++){
                data_kh = data_kh + '<div class="border-parent">';
                data_kh = data_kh + '<p class="text-parent" data-toggle="collapse" data-target="#'+ data[i].event_id+'" >'+ data[i].event_name+'</p>';
                data_kh= data_kh + '<div id="'+data[i].event_id+'" class="collapse stories-content">'
                for(var j = 0; j< data[i].stories.length; j++){
                    data_kh = data_kh + '<p>'+ data[i].stories[j].title+'</p>';
                }
                data_kh = data_kh + '</div>';
                data_kh = data_kh + '</div>';
            }
            $("#11").html(data_kh);
        }
    });
}

function getDataCN(date) {
    $.ajax({
        type : "get",
        url : "/get_event_cn",
        data:{date:date},
        contentType : "application/json",
        traditional : true,
        success : function(data){
            var data_cn = '';
            for(var i =0; i<data.length;i++){
                data_cn = data_cn + '<div class="border-parent">';
                data_cn = data_cn + '<p class="text-parent" data-toggle="collapse" data-target="#'+ data[i].event_id+'" >'+ data[i].event_name+'</p>';
                data_cn= data_cn + '<div id="'+data[i].event_id+'" class="collapse stories-content">'
                for(var j = 0; j< data[i].stories.length; j++){
                    data_cn = data_cn + '<p>'+ data[i].stories[j].title+'</p>';
                }
                data_cn = data_cn + '</div>';
                data_cn = data_cn + '</div>';
            }
            $("#12").html(data_cn);
        }
    });
}

function getDataXC(date) {
    $.ajax({
        type : "get",
        url : "/get_event_xc",
        data:{date:date},
        contentType : "application/json",
        traditional : true,
        success : function(data){
            var data_xc = '';
            for(var i =0; i<data.length;i++){
                data_xc = data_xc + '<div class="border-parent">';
                data_xc = data_xc + '<p class="text-parent" data-toggle="collapse" data-target="#'+ data[i].event_id+'" >'+ data[i].event_name+'</p>';
                data_xc= data_xc + '<div id="'+data[i].event_id+'" class="collapse stories-content">'
                for(var j = 0; j< data[i].stories.length; j++){
                    data_xc = data_xc + '<p>'+ data[i].stories[j].title+'</p>';
                }
                data_xc = data_xc + '</div>';
                data_xc = data_xc + '</div>';
            }

            $("#13").html(data_xc);
        }
    });
}

