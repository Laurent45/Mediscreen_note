package com.openclassrooms.mediscreen_note.controller;

import com.openclassrooms.mediscreen_note.model.Note;
import com.openclassrooms.mediscreen_note.service.INoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/notePatient")
@RequiredArgsConstructor
public class NoteController {

    private final INoteService noteService;

    @GetMapping("/allNotes")
    List<Note> getNotes() {
        return noteService.getAllNote();
    }

    @GetMapping("/{id}")
    Note getNoteById(@PathVariable("id") String id) {
        return noteService.getNoteById(id);
    }

    @GetMapping("/notes/{patientId}")
    List<Note> getNotesByPatientId(@PathVariable("patientId") Long patientId) {
        return noteService.getAllNoteOfPatientId(patientId);
    }

    @PostMapping("/create")
    Note create(@RequestBody Note note) {
        note.setCreated(LocalDateTime.now());
        noteService.createNote(note);
        return note;
    }

    @PutMapping("/update/{id}")
    Note updateReportById(@PathVariable("id") String id,
                          @RequestParam("report") String report) {
        return noteService.updateReport(id, report);
    }

    @DeleteMapping("/remove/{id}")
    void deleteNoteById(@PathVariable("id") String id) {
        noteService.removeNote(id);
    }
}
