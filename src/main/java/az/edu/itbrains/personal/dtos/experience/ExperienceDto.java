package az.edu.itbrains.personal.dtos.experience;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExperienceDto {
    private Long id;
    private Date startDate;
    private Date endDate;
    private String position;
    private String city;
    private String company;
    private String description;
    private String year;


    public String getYear() {
        LocalDateTime myDateObj = LocalDateTime.now();
        String date = String.valueOf(myDateObj);

        LocalDate currentDate = LocalDate.parse(date);
        return currentDate.getYear() +" - present";
    }


}
