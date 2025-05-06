package az.edu.itbrains.personal.dtos.banner;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BannerCreateDto {
    private String title;
    private String subTitle;
    private String photoUrl;
}
