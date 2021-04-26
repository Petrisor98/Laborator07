package ro.pub.cs.systems.eim.lab07.landmarklister.general;

public interface Constants {

    boolean DEBUG = true;

    String TAG = "[Landmark Lister]";

    String LANDMARK_LISTER_WEB_SERVICE_INTERNET_ADDRESS = "http://api.geonames.org/citiesJSON?";

    String MISSING_INFORMATION_ERROR_MESSAGE = "All fields need to be completed!";

    String NORTH = "north=";
    String SOUTH = "south=";
    String EAST = "east=";
    String WEST = "west=";
    int NORTH_INDEX = 0;
    int SOUTH_INDEX = 1;
    int EAST_INDEX = 2;
    int WEST_INDEX = 3;
    String CREDENTIALS = "username=eim2017";

    String GEONAMES = "geonames";
    String LATITUDE = "lat";
    String LONGITUDE = "lng";
    String TOPONYM_NAME = "toponymName";
    String POPULATION = "population";
    String CODE_NAME = "fcodeName";
    String NAME = "name";
    String WIKIPEDIA_WEB_PAGE_ADDRESS = "wikipedia";
    String COUNTRY_CODE = "countrycode";

}
