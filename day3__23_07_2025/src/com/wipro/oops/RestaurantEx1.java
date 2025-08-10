package com.wipro.oops;

public class RestaurantEx1 {

	private String name;
    private String location;
    private int rating;

    public RestaurantEx1(String name, String location, int rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Restaurant [name=" + name + ", location=" + location + ", rating=" + rating + "]";
    }
}
