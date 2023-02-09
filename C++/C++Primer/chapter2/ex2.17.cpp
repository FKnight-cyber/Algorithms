/*
Exercise 2.17: What does the following code print?
int i, &ri = i;
i = 5; ri = 10;
std::cout << i << " " << ri << std::endl;
*/

/*

The code will print "10 10", the variable ri is poiting to the memory address of
i, then when ri is signed to 10, i will also be changed to 10, because its memo-
ry address is now pointing to the value 10.

*/