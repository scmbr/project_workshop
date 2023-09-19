const express = require('express');
const { parse, format } = require('date-fns');
const { ru } = require('date-fns/locale');

const app = express();
const port = 3000;

app.get('/', (req, res) => {
  const { date } = req.query;

  const parsedDate = parse(date, 'dd.MM.yyyy', new Date());
  const weekday = format(parsedDate, 'EEEE', { locale: ru }); 

  res.send(`День недели для даты ${date} - ${weekday}`);
});

app.listen(port, () => {
  console.log(`Сервер запущен на порту ${port}`);
});