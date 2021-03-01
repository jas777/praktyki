package com.labfive.jas777;

public class Remote {

    private final int MAX_CHANNEL = 20;
    private final int MAX_VOLUME  = 10;

    private final TV controlledTV;

    public Remote(TV controlledTV) {
        this.controlledTV = controlledTV;
    }

    public void channelUp() {

        if (controlledTV.isOn()) {

            if (controlledTV.getChannel() == MAX_CHANNEL)
                controlledTV.setChannel(1);
            else
                controlledTV.setChannel(controlledTV.getChannel() + 1);

        }

    }

    public void channelDown() {

        if (controlledTV.isOn()) {

            if (controlledTV.getChannel() == 1)
                controlledTV.setChannel(MAX_CHANNEL);
            else
                controlledTV.setChannel(controlledTV.getChannel() - 1);

        }

    }

    public void volumeUp() {

        if (controlledTV.isOn()) {

            if (controlledTV.getVolume() == MAX_VOLUME)
                controlledTV.setVolume(1);
            else
                controlledTV.setVolume(controlledTV.getVolume() + 1);

        }

    }

    public void volumeDown() {

        if (controlledTV.isOn()) {

            if (controlledTV.getVolume() == 1)
                controlledTV.setVolume(MAX_VOLUME);
            else
                controlledTV.setVolume(controlledTV.getVolume() - 1);

        }

    }

    public void toggleTV() {
        controlledTV.toggle();
    }

}
