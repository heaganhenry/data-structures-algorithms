// Given the initial value of  for each of Sam's  students, write code to automate the rounding process.

function gradingStudents(grades) {
    for (let i = 0; i < grades.length; i++) {
        if (grades[i] >= 38 && grades[i] % 5 > 2) {
            grades[i] = grades[i] + (5 - grades[i] % 5)
        }
    }
    return grades
}