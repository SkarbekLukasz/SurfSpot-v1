package ls.surfspot.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class CityListLoader {
    private BufferedReader br;
    public List<String[]> loadCities() {
        List<String> dataInput = readLines();
        return getInputForRequest(dataInput);
    }

    private List<String> readLines() {
        try{
            FileReader fr = new FileReader("src/main/resources/cities.txt");
            br = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            System.err.println("City data list file not found.");
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        String newLine;
        List<String> citiesList = new ArrayList<>();
        try {
            while((newLine = br.readLine()) != null) {
                citiesList.add(newLine);
            }
            br.close();
        }catch (IOException e) {
            System.err.println("File reading error");
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return citiesList;
    }

    private List<String[]> getInputForRequest(List<String> list) {
        return list.stream()
                .map(element -> element.split(","))
                .toList();
    }
}
