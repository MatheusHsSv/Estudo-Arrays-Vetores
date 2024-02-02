package entities;

import exercises.HotelCheckIn;

public class HotelCheckInSystem {

    private String name;
    private String email;
    private int room;

    public HotelCheckInSystem(String name, String email, int room){
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public int getRoom() {
        return room;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
