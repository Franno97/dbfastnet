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
  			url:"/deletebreakdown/"+id,
  			success: function(res) {
  				console.log(res);
  			}
  		});
    Swal.fire(
      'Eliminado!',
      'La averia ha sido eliminada.',
      'success'
    ).then((ok)=>{
    	if(ok){
    		location.href="/listbreakdown";
    	}
    });
  }
})
}