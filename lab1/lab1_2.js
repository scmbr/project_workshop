const express = require('express');
const app = express();


app.get('/solveEquation', (req, res) => {

  const { a, b, c } = req.query;


  if (!a || !b || !c) {
    res.status(400).send('Необходимо задать параметры a, b и c');
    return;
  }


  const discriminant = b ** 2 - 4 * a * c;


  if (discriminant > 0) {
    const x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
    const x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
    res.send(`Уравнение имеет два решения: x1 = ${x1}, x2 = ${x2}`);
  } else if (discriminant === 0) {
    const x = -b / (2 * a);
    res.send(`Уравнение имеет одно решение: x = ${x}`);
  } else {
    res.send('Уравнение не имеет решений');
  }
});

app.listen(3000, () => {
    console.log('Сервер запущен на порту 3000');
  });