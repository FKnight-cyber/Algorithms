function countApplesAndOranges(s, t, a, b, apples, oranges) {
  // Write your code here
  for(let i = 0; i < apples.length; i++){
      apples[i] += a
  }
  for(let j = 0; j < oranges.length; j++){
      oranges[j] += b
  }
  
  let nOfApples = apples.filter(apple => apple >= s && apple <= t)
  let nOfOranges = oranges.filter(orange => orange >= s && orange <= t)
  
  console.log(nOfApples.length)
  console.log(nOfOranges.length)
} 