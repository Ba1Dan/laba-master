import mysql.connector
from tabulate import tabulate

mydb = mysql.connector.connect(
  host="mysql-service",
  user="root",
  password="root",
  database="university"
)

mycursor = mydb.cursor()
mycursor.execute('SELECT firstName, lastName, year FROM student LEFT JOIN exam ON student.id = exam.studentIdPK WHERE title =\"Системы ведения хранилищ данных\" ORDER BY grade DESC')

result = mycursor.fetchall()

print(tabulate(result, headers=["Фамилия", "Имя", "Год рождения"]))