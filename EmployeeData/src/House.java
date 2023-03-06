public class House {
    private String hall;
    private String kitchen;
    private String godRoom;
    private String bedRoom;

    public House(String hall, String kitchen, String godRoom, String bedRoom) {
        this.hall = hall;
        this.kitchen = kitchen;
        this.godRoom = godRoom;
        this.bedRoom = bedRoom;
    }

    @Override
    public String toString() {
        return "House{" +
                "hall='" + hall + '\'' +
                ", kitchen='" + kitchen + '\'' +
                ", godRoom='" + godRoom + '\'' +
                ", bedRoom='" + bedRoom + '\'' +
                '}';
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getGodRoom() {
        return godRoom;
    }

    public void setGodRoom(String godRoom) {
        this.godRoom = godRoom;
    }

    public String getBedRoom() {
        return bedRoom;
    }

    public void setBedRoom(String bedRoom) {
        this.bedRoom = bedRoom;
    }
}
