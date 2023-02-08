/*
Exercise 1.6: Explain whether the following program fragment is legal.
std::cout << "The sum of " << v1;
<< " and " << v2;
<< " is " << v1 + v2 << std::endl;
If the program is legal, what does it do? If the program is not legal, why not? How
would you fix it?
*/

/*

The following code isn't legal, it tries to fragment a large expression but fails due to not declaring 
a primary-expression before the token ' << ', to fix it we could do the following:

std::cout << "The sum of " << v1;
std::cout << " and " << v2;
std::cout << " is " << v1 + v2 << std::endl;

*/