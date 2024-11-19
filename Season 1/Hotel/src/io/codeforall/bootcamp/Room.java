package io.codeforall.bootcamp;

public class Room {

    private boolean isAvailable;


    public void availableRoom() {
        this.isAvailable = true;
    }

    public void setAvailable(boolean available) {
        isAvailable = !available;
    }

    public boolean isAvailable(){
        return isAvailable;


    }


}
