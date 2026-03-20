import java.util.List;

public class GeoRespons {
    List<Result> results;
    String status;

    static class Result{
        List<AdressComponent> adress_Component;
        String formatted_address;
        Geometry geometry;
        String place_id;
        List<String> types;

        static class AdressComponent{
            String long_name;
            List<String> types;
        }

        static class Geometry{
            LatLng location;
            String location_type;

            static class LatLng{
                double lat, lng;
            }
        }
    }
}
