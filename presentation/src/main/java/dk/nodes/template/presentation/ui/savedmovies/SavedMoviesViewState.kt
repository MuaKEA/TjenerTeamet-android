package dk.nodes.template.presentation.ui.savedmovies

import dk.nodes.nstack.kotlin.models.AppUpdate
import dk.nodes.nstack.kotlin.models.Message
import dk.nodes.nstack.kotlin.models.RateReminder
import dk.nodes.template.models.Movie
import dk.nodes.template.presentation.util.SingleEvent
import dk.nodes.template.presentation.util.ViewError

data class SavedMoviesViewState(
        val errorMessage: SingleEvent<String>? = null,
        val isLoading: Boolean = false,
        val nstackMessage: Message? = null,
        val nstackRateReminder: RateReminder? = null,
        val nstackUpdate: AppUpdate? = null,
        val savedMoviesArrayList : ArrayList<Movie>? = null,
        val viewError: SingleEvent<ViewError>? = null
)