function kangaroo(x1, v1, x2, v2) {
  // Write your code here
  let times = (x2 - x1)/(v1 - v2)
  
  if(Number.isInteger(times) && times > 0) {
      return "YES"
  }
  
  return "NO"
}