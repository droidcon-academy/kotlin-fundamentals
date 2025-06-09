package section_8

sealed class UiState {
    data object Loading : UiState()
    data class Success(val data: String) : UiState()
    data class Error(val message: String) : UiState()
    data object Empty : UiState()
}

fun main() {
    val state: UiState = UiState.Success("Welcome back!")

    when (state) {
        is UiState.Loading -> println("Loading...")
        is UiState.Success -> println("Success: ${state.data}")
        is UiState.Error -> println("Error: ${state.message}")
        is UiState.Empty -> println("Nothing to show.")
    }
}