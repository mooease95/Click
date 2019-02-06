package com.example.matt.click;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


/**
 * Created by matt on 27/03/17.
 */

public class HomeCardData implements Serializable {
    private String primaryActivity;

    private int maxMembers;
    private int members;
    private int id;

    private Set<String> presetPrimaryActivities;


    public HomeCardData() {
        presetPrimaryActivities = new HashSet<>();

        presetPrimaryActivities.add("Jazz");
        presetPrimaryActivities.add("Football");
        presetPrimaryActivities.add("Cooking");
        presetPrimaryActivities.add("Open Mic");
        presetPrimaryActivities.add("Skateboarding");
        presetPrimaryActivities.add("Freestyle");
        presetPrimaryActivities.add("Basketball");
        presetPrimaryActivities.add("Baseball");
        presetPrimaryActivities.add("Rugby");
        presetPrimaryActivities.add("Cricket");
        presetPrimaryActivities.add("Guitar");
        presetPrimaryActivities.add("Band");
        presetPrimaryActivities.add("Cinema");

        //randomise();
        maxMembers = 10;
        members = 1;
        id = 1;
        primaryActivity = "Basketball";
    }

    public void randomise() {
        Random random = new Random();
        if (!presetPrimaryActivities.isEmpty()) {
            while (this.primaryActivity == null) {
                for (String s : presetPrimaryActivities) {
                    if (random.nextInt(20) == 0) {
                        this.primaryActivity = s;
                    }
                }
            }
        } else primaryActivity = "Ran out of presets";

        this.id = random.nextInt(1000);
        this.members = random.nextInt(7);
        this.maxMembers = this.members + random.nextInt(7);
    }

    public int getMaxMembers() {
        return maxMembers;
    }

    public int getMembers() {
        return members;
    }

    public int getId() {
        return id;
    }

    public String getPrimaryActivity() {
        return primaryActivity;
    }

}