const express = require('express');
const app = express();


app.get('/fibonacci/:index', (req, res) => {
  const index = parseInt(req.params.index); 
  const result = fibonacci(index); 
  res.send(result.toString()); 
});


function fibonacci(index) {
  if (index === 0) return 0;
  if (index === 1) return 1;

  let a = 0;
  let b = 1;

  for (let i = 2; i <= index; i++) {
    const temp = a + b;
    a = b;
    b = temp;
  }

  return b;
}


app.listen(3000, () => {
  console.log('Server is running on port 3000');
});
