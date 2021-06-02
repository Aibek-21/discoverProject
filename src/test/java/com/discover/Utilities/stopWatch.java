package com.discover.Utilities;

public class stopWatch {

    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }

    //voting time in minutes
    public long getVotingTime() {
        long votingTime;
        if (running) {
            votingTime = ((System.currentTimeMillis() - startTime) / 60000);
        } else {
            votingTime = ((stopTime - startTime) / 60000);
        }
        return votingTime;
    }

}
