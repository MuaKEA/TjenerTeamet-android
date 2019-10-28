package dk.nodes.template.network

import dk.nodes.template.models.*
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {

    @GET("search/movie?api_key=4cb1eeab94f45affe2536f2c684a5c9e")
    fun getCurrentMovieData(@Query("query") movieName: String ): Call<JsonResultMovies>

    @GET("movie/{movieId}/videos?api_key=4cb1eeab94f45affe2536f2c684a5c9e")
    fun getMovieThriller(@Path("movieId") movieId: String) : Call<ThrillerResualt>


    @GET("movie/{movie_id}/recommendations?api_key=4cb1eeab94f45affe2536f2c684a5c9e")
    fun getRecommendations(@Path("movie_id") movie_id: String) : Call<JsonResultMovies>

    @GET("genre/movie/list?api_key=4cb1eeab94f45affe2536f2c684a5c9e")
    fun getGenres() : Call<GenresResualt>

    @GET("movie/{movie_id}/similar?api_key=4cb1eeab94f45affe2536f2c684a5c9e")
    fun getSimilarMovies(@Path("movie_id") movie_id: String) : Call<JsonResultMovies>


}

