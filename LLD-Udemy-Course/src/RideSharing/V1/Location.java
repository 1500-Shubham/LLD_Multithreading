package RideSharing.V1;

public class Location {
    private double latitute;

    public Location(double latitute, double longitude) {
        this.latitute = latitute;
        this.longitude = longitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitute() {
        return latitute;
    }

    public void setLatitute(double latitute) {
        this.latitute = latitute;
    }

    private  double longitude;

}
