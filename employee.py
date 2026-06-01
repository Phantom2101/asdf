import mysql.connector
from mysql.connector import Error

conn = mysql.connector.connect(
    host = "localhost",
    user = "root",
    password = "Mammo786@",
    database = "employeedb",
    auth_plugin="mysql_native_password"
)

cursor = conn.cursor()

emp_id = int(input("Enter employee id:"))
name = input("Enter your name:")
age = int(input("enter age:"))
salary = int(input("enter salary:"))
dept_id = int(input("Enter dept ID:"))
dept_name = input("enter department name:")
dept_manager = input("Enter your manager's name:")

#for employee table input

sql1 = """
insert into dept
(dept_id,dept_name,dept_manager)
values(%s, %s, %s)
"""
values1 = (dept_id, dept_name, dept_manager)
cursor.execute(sql1,values1)
conn.commit()

sql = """
insert into emp
(emp_id,name,age,salary)
values(%s, %s, %s, %s)
"""
values = (emp_id, name, age, salary)

cursor.execute(sql, values)
conn.commit()





print("Data pushed to dtabase successfully")

cursor.close()
conn.close()


