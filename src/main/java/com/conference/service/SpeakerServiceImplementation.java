package com.conference.service;

import com.conference.model.Speaker;
import com.conference.repository.HibernateSpeakerRepositoryImplementation;
import com.conference.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImplementation implements SpeakerService {

    private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImplementation();

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }
}
