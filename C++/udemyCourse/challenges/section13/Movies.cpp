#include "Movies.h"
#include "Movie.h"
#include <string>

Movies::Movies(){

};
Movies::~Movies(){
    
};

bool Movies::addMovie(string name, string ratings, int watched){
    for(const Movie &movie: movies) {
        if(movie.getName() == name){
            cout << "Movie already registered!" << endl;
            return false;
        }
        Movie temp {name, ratings, watched};
        movies.push_back(temp);
        return true;
    }
}

bool Movies::incrementWatchedCount(string name) {
    for(Movie &movie: movies) {
        if(movie.getName() == name){
            movie.incrementWatchedCount();
            return true;
        }
        cout << "Movie isn't registered!" << endl;
        return false;
    }
}

void Movies::displayMovies() const{
    if(movies.size() == 0) {
        cout << "No movies to display" << endl;
    } else {
        cout << "---------------------------" << endl;
        for(const auto &movie: movies) {
            movie.display();
        }
        cout << "---------------------------" << endl;
    }
}