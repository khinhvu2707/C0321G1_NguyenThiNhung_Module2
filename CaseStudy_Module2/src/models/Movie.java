package models;

public class Movie {
    private String name;
    private String category;
    private String time;
    private String tickket;
    public Movie(){

    }
    public Movie(String name, String category, String time, String tickket) {
        this.name = name;
        this.category = category;
        this.time = time;
        this.tickket = tickket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTickket() {
        return tickket;
    }

    public void setTickket(String tickket) {
        tickket = tickket;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Name='" + name + '\'' +
                ", Category='" + category + '\'' +
                ", Time='" + time + '\'' +
                ", Tickket='" + tickket + '\'' +
                '}';
    }
}
