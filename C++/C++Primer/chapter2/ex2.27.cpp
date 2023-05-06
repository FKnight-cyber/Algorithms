/*
Exercise 2.27: Which of the following initializations are legal? Explain why.
(a) int i = -1, &r = 0; (b) int *const p2 = &i2;
(c) const int i = -1, &r = 0; (d) const int *const p3 = &i2;
(e) const int *p1 = &i2; (f) const int &const r2;
(g) const int i2 = i, &r = i;
*/

/*
c) is Legal, i is a const negative int and r a const reference to 0
*/