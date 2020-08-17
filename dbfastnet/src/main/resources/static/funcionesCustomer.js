function eliminar(id){
Swal.fire({
  title: 'Esta seguro?',
  text: "No podra revertirlo!",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonColor: '#3085d6',
  cancelButtonColor: '#d33',
  confirmButtonText: 'Si, borralo!'
}).then((result) => {
  if (result.value) {
  		$.ajax({
  			url:"/deletecustomer/"+id,
  			success: function(res) {
  				console.log(res);
  			}
  		});
    Swal.fire(
      'Eliminado!',
      'El cliente ha sido borrado!',
      'success'
    ).then((ok)=>{
    	if(ok){
    		location.href="/listcustomer";
    	}
    });
  }
})
}