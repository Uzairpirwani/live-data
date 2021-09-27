package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note:Note)

    @Delete
    suspend fun delete(note:Note)

    @Query("Select * from notes_table order by id ASC")
    suspend fun getALLNote(note: Note): LiveData<List<Note>>
}