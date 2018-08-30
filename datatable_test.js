var table;
$(function(){
	$(document).ready(function(){
			table=$("#table").DataTable({
			/* "info": true,
			"paging": true,
            "processing":true,
            "searching": true,
            "serverSide": true, */
            
           language:{
            	url:'/at/js/wb.json'
            },
            ajax:{
            	type:'post',
            	url:'/at/aa.do',
            } ,
            columns:[{'data':'name'},
                     {'data':'age'},
                     {'data':'sex'},
                     ], 
                     
                     dom:'Bfrtip',
                     buttons:[{
                     	extend:'excelHtml5',
                     	text:'导出数据',
                     	customize:function(xlsx){
                     		var sheet=xlsx.xl.worksheets['sheet1.xml'];
                     		$('row c[r^="C"]', sheet).attr( 's', '2' );
                     	}
                     },{
                      	text:'弹框',
                      	action:function()
                      	{
                      		alert("1111");
                      	}
                     }],
           /* "aoColumns":[{"asSorting":["asc"]},{"asSorting":["asc"]},{"asSorting":["desc","asc"]}], */
		})
	});
	/*$('#table tbody').on('click','tr',function(){
		console.log("1111");
	})
	table.button().add(null,{action:function(xlsx){var sheet=xlsx.xl.worksheets['sheet1.xml'];
		$('row c[r^="C"]', sheet).attr( 's', '2' );},text:'导出数据'});*/
});

