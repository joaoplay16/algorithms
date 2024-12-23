

sealed class WorkResult<out R> {
    data class Success<out T>(val data: T) : WorkResult<T>()
    data class Error(val exception: Exception) : WorkResult<Nothing>()
    object Loading : WorkResult<Nothing>()
}

interface IError

interface NoInternet: IError

sealed interface DataError: IError {
    enum class Remote: DataError {
        REQUEST_TIMEOUT,
        TOO_MANY_REQUESTS,
        NO_INTERNET,
        SERVER,
        SERIALIZATION,
        UNKNOWN
    }

    enum class Local: DataError {
        DISK_FULL,
        UNKNOWN
    }
}

sealed interface Result<out D, out E: IError> {
    data class Success<out D>(val data: D): Result<D, Nothing>
    data class Error<out E: IError>(val error: E):
        Result<Nothing, E>
}

//open class Animal
//class Dog : Animal()

fun main() {
    val result: WorkResult.Success<CharSequence> = WorkResult.Success("234")

    println(result.data)

    // With 'out' modifier
    val error: Result.Error<DataError.Local> = Result.Error(DataError.Local.DISK_FULL)
    val error2: Result.Error<DataError> = error

    // Without 'out' modifier
    // val dogSuccess: Result.Success<Dog> = Result.Success(Dog())
    // val animalSuccess: Result.Success<Animal> = dogSuccess // Compilation error: Type mismatch

}