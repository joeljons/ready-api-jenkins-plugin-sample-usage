package com.smartbear.ready.jenkins.sample;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SpotifyLookupTest {
    @Test
    public void testNyttGolv() throws IOException {
        SpotifyLookup spotifyLookup = new SpotifyLookup();

        // Use our Virt instead of the real API
        spotifyLookup.setEndpoint("http://localhost:8080/lookup/1/");

        String title = spotifyLookup.getTitle("7JIuSd9aMu0bDd57820sFV");
        assertThat(title, is("Nytt golv"));
    }
}
