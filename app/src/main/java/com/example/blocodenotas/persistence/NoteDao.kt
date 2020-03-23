package com.example.blocodenotas.persistence

import androidx.room.*

// aqui onde vai esta os metodos do banco de dados
@Dao
interface NoteDao {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    fun insert(note:Note){
    }
    @Update
    fun update(note:Note){
    }
    @Delete
    fun delete(note: Note)
    @Query(value = "select * from tbl_note")
    fun getallnotes (): List<Note>

}