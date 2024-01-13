package modelos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import clases.Book

@Dao
interface BookDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBook(book: Book)

    @Query("SELECT * FROM Book")
    fun getAllBooks(): LiveData<List<Book>>

    @Query("SELECT cover FROM Book WHERE titleId = :id")
    fun getBookCover(id: Int): LiveData<Int>            //Imagenes se tratan como int
    @Query("SELECT cover FROM Book WHERE name = :name")
    fun getBookCover(name: String): LiveData<Int>       //Imagenes se tratan como int

    @Query("SELECT name FROM Book WHERE titleId = :id")
    fun getBookName(id: Int): LiveData<String>
    @Query("SELECT titleId FROM Book WHERE name= :name")
    fun getBookId(name: String): LiveData<Int>

    @Query("SELECT author FROM Book WHERE titleId = :id")
    fun getBookAuthor(id: Int): LiveData<String>
    @Query("SELECT author FROM Book WHERE name= :name")
    fun getBookAuthor(name: String): LiveData<String>

    @Query("SELECT pages FROM Book WHERE titleId = :id")
    fun getBookPages(id: Int): LiveData<Int>
    @Query("SELECT pages FROM Book WHERE name= :name")
    fun getBookPages(name: String): LiveData<Int>

    @Query("SELECT genre FROM Book WHERE titleId = :id")
    fun getBookGenre(id: Int): LiveData<String>
    @Query("SELECT genre FROM Book WHERE name= :name")
    fun getBookGenre(name: String): LiveData<String>
}
