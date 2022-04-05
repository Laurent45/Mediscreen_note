package com.openclassrooms.mediscreen_note.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundNoteException extends RuntimeException {
    public NotFoundNoteException(String s) {
        super(s);
    }
}
