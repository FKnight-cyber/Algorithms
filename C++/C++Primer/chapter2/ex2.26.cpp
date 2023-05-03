/*
Exercise 2.26: Which of the following are legal? For those that are illegal, explain why.
(a) const int buf; (b) int cnt = 0;
(c) const int sz = cnt; (d) ++cnt; ++sz;
*/

/*
b and c are legal statements.
a) is illegal because you can't initialize undeclared constant.
d) is illegal because you can't change the value of a constant variable.
*/