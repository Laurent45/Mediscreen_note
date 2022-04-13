package com.openclassrooms.mediscreen_note.controller;

import com.openclassrooms.mediscreen_note.model.Note;
import com.openclassrooms.mediscreen_note.service.INoteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/notePatient")
@RequiredArgsConstructor
@Api(tags = "CRUD operations about recommendation's practitioner")
public class NoteController {

    private final INoteService noteService;

    @ApiOperation("Get all notes")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "All notes return")
    })
    @GetMapping("/allNotes")
    List<Note> getNotes() {
        return noteService.getAllNote();
    }

    @ApiOperation("Get note by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Return a note"),
            @ApiResponse(code = 400, message = "Note doesn't exist")
    })
    @GetMapping("/{id}")
    Note getNoteById(@PathVariable("id") String id) {
        return noteService.getNoteById(id);
    }

    @ApiOperation("Get all notes by a patient id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Return all note of patient")
    })
    @GetMapping("/notes/{patientId}")
    List<Note> getNotesByPatientId(@PathVariable("patientId") Long patientId) {
        return noteService.getAllNoteOfPatientId(patientId);
    }

    @ApiOperation("Create a new note")
    @ApiResponse(code = 201, message = "note is created")
    @PostMapping("/create")
    Note create(@RequestBody Note note) {
        note.setCreated(LocalDateTime.now());
        noteService.createNote(note);
        return note;
    }

    @ApiOperation("Update a note with a new recommendation")
    @ApiResponse(code = 200, message = "note is updated")
    @PutMapping("/update/{id}")
    Note updateReportById(@PathVariable("id") String id,
                          @RequestParam("report") String report) {
        return noteService.updateReport(id, report);
    }

    @ApiOperation("Delete a note")
    @DeleteMapping("/remove/{id}")
    void deleteNoteById(@PathVariable("id") String id) {
        noteService.removeNote(id);
    }
}
