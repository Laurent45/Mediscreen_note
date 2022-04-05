package com.openclassrooms.mediscreen_note.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@Document
public class Note {

    @Id
    private String id;
    @Field("practitioner_name")
    private String practitionerName;
    @Field(value = "patient_id")
    private Long patientId;
    private String report;
    private LocalDateTime created;

    public Note(String practitionerName, Long patientId, String report,
                LocalDateTime created) {
        this.practitionerName = practitionerName;
        this.patientId = patientId;
        this.report = report;
        this.created = created;
    }
}
