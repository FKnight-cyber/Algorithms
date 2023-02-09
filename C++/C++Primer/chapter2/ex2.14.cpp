/*
Exercise 2.14: Is the following program legal? If so, what values are printed?
int i = 100, sum = 0;
for (int i = 0; i != 10; ++i)
sum += i;
std::cout << i << " " << sum << std::endl;
*/

/*

It's legal.
Again, the sum will take the value of the local scope of the for loop, result
will be 45, i variable outside the for loop remains with 100 as value;

*/