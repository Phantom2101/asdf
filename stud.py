import mysql.connector

print("=== Program started ===")

# 1. Connect to MySQL
conn = mysql.connector.connect(
    host="localhost",
    user="root",
    password="Mammo786@",
    database="college_db",
    auth_plugin="mysql_native_password"
)

print("✅ Connected to MySQL")

# 2. Create cursor
cursor = conn.cursor()

# 3. Take input
roll_no = int(input("Enter roll number: "))
name = input("Enter name: ")
age = int(input("Enter age: "))

print("Enter marks for 5 subjects:")
s1 = int(input("Subject 1: "))
s2 = int(input("Subject 2: "))
s3 = int(input("Subject 3: "))
s4 = int(input("Subject 4: "))
s5 = int(input("Subject 5: "))

total_marks = s1+s2+s3+s4+s5
final_marks = total_marks/500
percentage = (total_marks/500)*100

# 4. Insert query
sql = """
INSERT INTO students
(roll_no, name, age, subject1, subject2, subject3, subject4, subject5,total_marks,final_marks,percentage)
VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)
"""

values = (roll_no, name, age, s1, s2, s3, s4, s5, total_marks, final_marks, percentage)

cursor.execute(sql, values)
conn.commit()

print("✅ Student data inserted successfully")

# 5. Close connection
cursor.close()
conn.close()
print("🔒 MySQL connection closed")
