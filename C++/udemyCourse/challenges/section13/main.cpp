/*
For this challenge you are to develop the foundation for a program
for movie fanatics to keep track of what movies they have watched
and how many times they watched each movie.

The program must support the following 

class Movie - models a movie which includes:
 - movie name
 - movie ratings (G, PG, PG-13, R)
 - watched - the number of times the movie has been watched.

class Movies - models a collection of movie objects.

Obviously, Movies needs to know about Movie since it's a collection of Movie objects
However, our main driver should only interact with the Movies class.

For example, a simple main should be able to
 - Create a Movies object
 - ask the Movies object to add a movie by prodiving the movie name, rating and watched count
 - ask the Movies object to increment the watched count by 1 for a movie given its name
 - ask the Movies object to display all of its movies.

Additionally
 - If we try to add a movie whose name is already in the movies collection
   we should display this error to the user.
 - If we try to increment the watched count for a movie whose name is not in the
   movies collection we should display this error to the user.
*/

#include "Movies.h"

int main() {
  Movies movies;

  movies.displayMovies();
  movies.addMovie("Transformers", "G", 0);
  movies.addMovie("One piece: RED", "G", 0);
  movies.displayMovies();
  movies.incrementWatchedCount("One piece: RED");
  movies.incrementWatchedCount("One piece: RED");
  movies.incrementWatchedCount("One piece: RED");
  movies.displayMovies();
  movies.incrementWatchedCount("Jujutsu kaisen 0");
  movies.addMovie("One piece: RED", "G", 0);

  return 0;
}

