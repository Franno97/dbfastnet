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
  			url:"/deleteclaim/"+id,
  			success: function(res) {
  				console.log(res);
  			}
  		});
    Swal.fire(
      'Eliminado!',
      'El reclamo ha sido borrado',
      'success'
    ).then((ok)=>{
    	if(ok){
    		location.href="/listclaim";
    	}
    });
  }
})
}