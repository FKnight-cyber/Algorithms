#ifndef __MOVIE_H__
#define __MOVIE_H__
#include <string>
#include <iostream>
#include "Movies.h"
using namespace std;

class Movie {
    private:
        string name;
        string ratings;
        int watched;
    public:
        Movie(string name, string ratings, int watched);
        ~Movie();
        string getName() const{
            return name;
        }
        void display() const{
            cout << name << ", " << ratings << ", " << watched;
        }
        void incrementWatchedCount() {
            watched++;
        }
};

#endif