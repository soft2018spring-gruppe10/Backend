package DataObjects.Json;

import DataObjects.Book;
import DataObjects.City;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DataSerializerTest {

    City testdataobject = new City(1, "Copenhagen");

    @Test
    void serializeToJson() {
        String json = testdataobject.SerializeToJson();
        assertThat(json, is("{\"id\":1,\"cityName\":\"Copenhagen\"}"));
    }
}