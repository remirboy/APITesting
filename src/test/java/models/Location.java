package models;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({"postCode", "country", "countryAbbreviation", "places"})
public class Location {

    private String postCode;
    private String country;
    private String countryAbbreviation;
    private List<Place> places;

    public Location() {
        this.postCode = "1050";
        this.country = "Latvia";
        this.countryAbbreviation = "LV";

        Place place = new Place();
        List<Place> places = new ArrayList<>();
        places.add(place);

        this.places = places;
    }

    @JsonProperty("post code")
    public String getPostCode() {
        return postCode;
    }

    @JsonProperty("post code")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("country abbreviation")
    public String getCountryAbbreviation() {
        return countryAbbreviation;
    }

    @JsonProperty("country abbreviation")
    public void setCountryAbbreviation(String countryAbbreviation) {
        this.countryAbbreviation = countryAbbreviation;
    }

    @JsonProperty("places")
    public List<Place> getPlaces() {
        return places;
    }

    @JsonProperty("places")
    public void setPlaces(List<Place> places) {
        this.places = places;
    }
}