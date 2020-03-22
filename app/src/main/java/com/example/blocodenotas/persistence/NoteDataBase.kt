package com.example.blocodenotas.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
// passa a classe om os dados para a databse
@Database (entities = [Note::class],version = 1)
abstract class NoteDataBase : RoomDatabase() {
    // retorna a interface
    abstract fun notedao():NoteDao
}