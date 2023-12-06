package com.aklagoo.voiceview.controller;

import com.aklagoo.voiceview.repository.Text;
import com.aklagoo.voiceview.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


class CreateTextForm {
    public String title;
    public String contents;
}

@RestController
public class TextsController {

    @Autowired
    private TextRepository textRepository;

    @PostMapping("/texts")
    public Text createText(@RequestBody CreateTextForm createTextForm) {
        Text text = new Text();
        text.setTitle(createTextForm.title);
        text.setContents(createTextForm.contents);
        text.setCreatedAt(new Date());
        return textRepository.save(text);
    }
}
