function eliminar(idcustomer){
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
  			url:"/deletecustomer/"+idcustomer,
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

function validar(idcustomer) {
        var cad = idcustomer;
        var total = 0;
        var longitud = cad.length;
        var longcheck = longitud - 1;

        if (cad !== "" && longitud === 10){
          for(i = 0; i < longcheck; i++){
            if (i%2 === 0) {
              var aux = cad.charAt(i) * 2;
              if (aux > 9) aux -= 9;
              total += aux;
            } else {
              total += parseInt(cad.charAt(i)); // parseInt o concatenará en lugar de sumar
            }
          }

          total = total % 10 ? 10 - total % 10 : 0;

          if (cad.charAt(longitud-1) == total) {
            document.getElementById("cicustomer").innerHTML = ("Cedula Válida");
          }else{
            location.href="/newcustomer";
          }
        }
      }
