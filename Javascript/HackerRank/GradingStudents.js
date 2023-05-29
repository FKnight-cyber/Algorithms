function gradingStudents(grades) {
  for(let i = 0; i < grades.length; i++) {
      let rounded = Math.ceil(grades[i] / 5) * 5
      if(rounded < 40) continue
      if(rounded - grades[i] < 3) {
          grades[i] = rounded
      } 
  }
  return grades
}