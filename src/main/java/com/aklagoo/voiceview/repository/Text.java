package com.aklagoo.voiceview.repository;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Entity
public class Text {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2")
    private Long id;

    private String title;

    private String contents;
    @DateTimeFormat
    private Date createdAt;
    public void setContents(String contents) {
        this.contents = contents;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public String getContents() {
        return contents;
    }
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
}
