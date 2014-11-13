package com.smartbear.ready.jenkins.sample;

import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class SpotifyLookup {
    private String endpoint = "http://ws.spotify.com/lookup/1/";

    /**
     * Replace the API endpoint.
     *
     * @param endpoint the endpoint to be used
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Get the title of a track based on the Spotify id.
     *
     * @param id the id of the track
     * @return the title of the track
     * @throws IOException
     */
    public String getTitle(String id) throws IOException {
        InputStream in = new URL(endpoint + ".json?uri=spotify:track:" + id).openStream();
        final SongInfo songInfo = new Gson().fromJson(IOUtils.toString(in), SongInfo.class);
        return songInfo.getTrackName();
    }
}
