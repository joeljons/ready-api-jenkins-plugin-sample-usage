package com.smartbear.ready.jenkins.sample;

public class SongInfo {
    private TrackInfo track;

    public String getTrackName(){
        return track.name;
    }

    public static class TrackInfo {
        private String name;
    }
}
