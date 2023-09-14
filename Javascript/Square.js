
function drawSquare()
  {
		var canvas = document.getElementById('Square');
		if (canvas.getContext) {
		  var context = canvas.getContext('2d');
	  
		  context.fillRect(100,100,100,100);
		  context.clearRect(50,50,50,50);
		  context.strokeRect(50,50,50,50);
		}
}
