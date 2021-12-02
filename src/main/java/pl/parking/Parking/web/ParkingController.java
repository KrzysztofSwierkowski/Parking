package pl.parking.Parking.web;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.parking.Parking.ParkingApplication;
import pl.parking.Parking.Place;
import pl.parking.Parking.Place.Type;


@Controller
@RequestMapping("/design")
public class ParkingController {



        @GetMapping
        public String showDesignForm(Model model) {
            List<Place> place = Arrays.asList(
                    new Place("1", 1, Type.FREE),
                    new Place("2", 2, Type.FREE),
                    new Place("3", 3, Type.FREE)

            );
            Type[] types = Place.Type.values();
            for (Type type : types) {
                model.addAttribute(type.toString().toLowerCase(),
                        filterByType(place, type));
            }
            model.addAttribute("design", new ParkingController());
            return "design";
        }
    private List<Place> filterByType(List<Place> place, Type type) {

        return place.stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());

    }

}

