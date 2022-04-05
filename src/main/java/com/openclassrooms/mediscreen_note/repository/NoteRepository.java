package com.openclassrooms.mediscreen_note.repository;

import com.openclassrooms.mediscreen_note.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends MongoRepository<Note, String> {

    List<Note> findNoteByPatientId(Long patientId);

}
