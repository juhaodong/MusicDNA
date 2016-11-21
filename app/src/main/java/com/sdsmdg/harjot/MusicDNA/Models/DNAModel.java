package com.sdsmdg.harjot.MusicDNA.Models;

import android.util.Pair;

import java.util.List;

/**
 * Created by Harjot on 02-Jun-16.
 */
public class DNAModel {
    private boolean type;
    private LocalTrack localTrack;
    private Track track;
    private byte[] byteArray;

    public DNAModel(boolean type, LocalTrack localTrack, Track track, byte[] byteArray) {
        this.type = type;
        this.localTrack = localTrack;
        this.track = track;
        this.byteArray = byteArray;
    }

    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public LocalTrack getLocalTrack() {
        return localTrack;
    }

    public void setLocalTrack(LocalTrack localTrack) {
        this.localTrack = localTrack;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public byte[] getByteArray() {
        return byteArray;
    }

    public void setByteArray(byte[] byteArray) {
        this.byteArray = byteArray;
    }
}
