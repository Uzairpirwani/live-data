package com.example.livedata

import androidx.lifecycle.LiveData

class NoteRepository(private val noteDao: NoteDao) {


    suspend fun insert(note: Note){
        noteDao.insert(note)
    }

    suspend fun delete(note: Note){
        noteDao.delete(note)
    }
}