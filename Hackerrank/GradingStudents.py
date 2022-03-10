# Given the initial value of  for each of Sam's  students, write code to automate the rounding process.

def gradingStudents(grades):
    rounded = []
    for grade in grades:
        if grade >= 38 and grade % 5 >= 3:
            while grade % 5 != 0:
                grade += 1
        rounded.append(grade)
    
    return rounded