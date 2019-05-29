package com.stackroute.MuzixApplication.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Track {
    @Id
    private  String trackid;
    private  String trackname;
    private  String trackcomments;
    private  String tracklisteners;

    public String getTrackid() {
        return trackid;
    }

    public void setTrackid(String trackid) {
        this.trackid = trackid;
    }

    public String getTrackname() {
        return trackname;
    }

    public void setTrackname(String trackname) {
        this.trackname = trackname;
    }

    public String getTrackcomments() {
        return trackcomments;
    }

    public void setTrackcomments(String trackcomments) {
        this.trackcomments = trackcomments;
    }

    public String getTracklisteners() {
        return tracklisteners;
    }

    public void setTracklisteners(String tracklisteners) {
        this.tracklisteners = tracklisteners;
    }

    public Track(String trackid, String trackname, String trackcomments, String tracklisteners) {
        this.trackid = trackid;
        this.trackname = trackname;
        this.trackcomments = trackcomments;
        this.tracklisteners = tracklisteners;
    }

    public Track() {
    }
}
