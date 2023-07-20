package ls.surfspot.controller;

import ls.surfspot.service.BestSpotService;
import ls.surfspot.service.DateFormatValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/surfspots")
public class SurfSpotController {
private final DateFormatValidator dateFormatValidator;
private final BestSpotService bestSpotService;

    public SurfSpotController(DateFormatValidator dateFormatValidator, BestSpotService bestSpotService) {
        this.dateFormatValidator = dateFormatValidator;
        this.bestSpotService = bestSpotService;
    }

    @GetMapping("/best")
    public ResponseEntity<String> getBestSpot(@RequestParam String date) {
        LocalDate parsedDate = dateValidation(date);
        String responseBody = bestSpotService.bestCity(parsedDate);
        return ResponseEntity.accepted().body(responseBody);
    }

    private LocalDate dateValidation(String date) {
        if(date.equals("")) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Date parameter is empty");
        }
        if(!dateFormatValidator.isDateFormatValid(date)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Date format invalid. Please use yyyy-mm-dd format");
        }
        LocalDate parsedDate = dateFormatValidator.dateFormatter(date);
        if(!dateFormatValidator.isDateInRange(parsedDate)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Date is not within range of 16 day weather forecast");
        }
        return parsedDate;
    }
}
