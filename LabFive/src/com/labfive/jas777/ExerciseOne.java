package com.labfive.jas777;

public class ExerciseOne {

    public static void main(String[] args) {

        TV tv = new TV();

        Remote remote = new Remote(tv);

        System.out.println(tv);

        remote.toggleTV();

        System.out.println(tv);

        for (int i = 0; i < 7; i++)
            remote.channelUp();
            remote.volumeDown();

        System.out.println(tv);

        for (int i = 0; i < 13; i++)
            remote.channelDown();
            remote.volumeUp();

        System.out.println(tv);

        remote.toggleTV();

        System.out.println(tv);

    }

}
