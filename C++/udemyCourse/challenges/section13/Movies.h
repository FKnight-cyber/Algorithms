#ifndef __MOVIES_H__
#define __MOVIES_H__
#include <string>
#include <vector>
#include "Movie.h"
using namespace std;

class Movies {
    private:
       vector<Movie> movies;
    public:
        Movies();
        ~Movies();
        bool addMovie(string name, string ratings, int watched);
        bool incrementWatchedCount(string name);
        void displayMovies() const;
};

#endif