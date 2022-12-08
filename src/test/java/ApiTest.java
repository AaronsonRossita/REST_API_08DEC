import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;


public class ApiTest {

    //given() - parameters
    //when() - request
    //then() - response


    @Test
    void testOne(){
        given().when().get(K.LOCAL_PEOPLE).then().log().all();
    }

    @Test
    void testTwo(){
        given().when().get(K.findByID(3)).then().log().all();
    }

    @Test
    void testThree(){
        given()
                .queryParam("appid",K.WEATHER_APPID)
                .queryParam("units","metric")
                .queryParam("q","rehovot")
        .when()
                .get(K.WEATHER_BASE)
        .then()
                .log().all();
    }

    @Test
    void testFour(){
        //given().when().delete(K.LOCAL_PEOPLE + "/3").then().statusCode(200);
        given().when().delete(K.LOCAL_PEOPLE + "/3").then().statusCode(404);
    }

    @Test
    void testFive(){
        given().contentType(ContentType.JSON).body("{\n" +
                "        \"name\": \"Intellij\",\n" +
                "        \"lastname\": \"bb\"\n" +
                "    }")
        .post(K.LOCAL_PEOPLE).then().statusCode(201);
    }

    @Test
    void testSix(){
        given()
                .contentType(ContentType.JSON)
                .body(K.buildJSON("TTTT","tttt"))
                .post(K.LOCAL_PEOPLE)
                .then().statusCode(201);
    }



}
