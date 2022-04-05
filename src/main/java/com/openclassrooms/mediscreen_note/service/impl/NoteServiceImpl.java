package com.openclassrooms.mediscreen_note.service.impl;

import com.openclassrooms.mediscreen_note.exception.NotFoundNoteException;
import com.openclassrooms.mediscreen_note.model.Note;
import com.openclassrooms.mediscreen_note.repository.NoteRepository;
import com.openclassrooms.mediscreen_note.service.INoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements INoteService {

    private final NoteRepository noteRepository;

    @Override
    public List<Note> getAllNote() {
        return noteRepository.findAll();
    }

    @Override
    public Note getNoteById(String id) {
        return getNote(id);
    }

    @Override
    public List<Note> getAllNoteOfPatientId(Long patientId) {
        return noteRepository.findNoteByPatientId(patientId);
    }

    @Override
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Note updateReport(String id, String report) {
        Note note = getNote(id);
        if (report != null) {
            note.setReport(report);
        }
        noteRepository.save(note);
        return note;
    }

    @Override
    public void removeNote(String id) {
        Note note = getNote(id);
        noteRepository.delete(note);
    }

    private Note getNote(String id) {
        return noteRepository.findById(id)
                .orElseThrow(() -> new NotFoundNoteException("id document not" +
                        " found: " + id));
    }
}
