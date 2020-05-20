package com.conference.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class SpeakerTest {
    @Test
    public void shouldHaveAFirstNameAndALastName() {
        Speaker speaker = new Speaker("Test", "Speaker");

        assertThat(speaker.getFirstName(), is(notNullValue()));
        assertThat(speaker.getLastName(), is(notNullValue()));
    }
}
