package az.edu.itbrains.personal.repositories;

import az.edu.itbrains.personal.models.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BannerRepository extends JpaRepository<Banner, Long> {
}
