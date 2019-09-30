package dk.nodes.template.repositories

import dk.nodes.template.models.Movie
import dk.nodes.template.models.Post

interface GetMovieRepository {
    suspend fun getMovies(cached: Boolean = true): List<Movie>



}