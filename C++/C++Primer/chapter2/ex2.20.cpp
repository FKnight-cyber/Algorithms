/*
Exercise 2.20: What does the following program do?
int i = 42;
int *p1 = &i;
*p1 = *p1 * *p1;
*/

/*

The value 42 is stored in the variable i, then it creates a pointer p1 that
points to the reference address of i, then it makes p1 point to the multi-
plication of the values referenced by i;
At the end i is equal 42 * 42 = 1764; and p1 still points to i address.

*/