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
        String date = String.valueOf(startDate).substring(0,10);
        LocalDate currentDate = LocalDate.parse(date);
        if (endDate == null){
            return currentDate.getYear() +  " - present";
        }
        String dateEnd = String.valueOf(endDate).substring(0,10);
        LocalDate currentDateEnd = LocalDate.parse(dateEnd);
        return currentDate.getYear() + " - " + currentDateEnd.getYear() ;
    }


}
