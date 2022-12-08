public class K {

    public static final String LOCAL_PEOPLE = "http://localhost:3000/people";

    public static final String COCKTAIL_DB = "www.thecocktaildb.com/api/json/v1/1/search.php";

    public static final String WEATHER_BASE = "https://api.openweathermap.org/data/2.5/weather";
    public static final String WEATHER_APPID = "0da3228e856b68fe61664180654143ac";



    public static String findByID(int id){
        return LOCAL_PEOPLE + "?id=" + id;
    }

    public static String buildJSON(String name, String lastname){
        return "{\n\"name\":\"" + name + "\",\n\"lastname\":\"" + lastname + "\"\n}";
    }

}



