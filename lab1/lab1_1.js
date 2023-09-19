const express = require('express');
const numberToWords = require('number-to-words');
const app = express();

app.get('/:number', (req, res) => {
  const number = parseInt(req.params.number);

  if (!isNaN(number)) {
    const text = numberToWords.toWords(number);
    res.send(text);
  } else {
    res.status(400).send('Invalid number');
  }
});

app.listen(3000, () => {
  console.log('Server is running on port 3000');
});