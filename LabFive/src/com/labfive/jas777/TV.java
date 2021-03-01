package com.labfive.jas777;

public class TV {

    private int channel;
    private int volume;

    private boolean on;

    public TV() {

        this.channel = 1;
        this.volume  = 1;

        this.on = false;

    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) throws IndexOutOfBoundsException {

        if (!this.on) return;

        if (channel > 20 || channel < 1) {
            throw new IndexOutOfBoundsException("Nieprawidłowy kanał!");
        }

        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {

        if (!this.on) return;

        if (volume > 10 || volume < 1) {
            throw new IndexOutOfBoundsException("Nieprawidłowa wartość!");
        }

        this.volume = volume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void toggle() {
        this.on = !on;
    }

    @Override
    public String toString() {

        return
                "\n\n---------- Stan telewizora ---------" +
                "\nKanał    : " + getChannel() +
                "\nGłośność : " + getVolume() +
                "\nON / OFF : " + (isOn() ? "ON" : "OFF");

    }

}
