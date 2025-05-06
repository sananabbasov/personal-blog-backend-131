package az.edu.itbrains.personal.services.impls;

import az.edu.itbrains.personal.dtos.banner.BannerHomeDto;
import az.edu.itbrains.personal.models.Banner;
import az.edu.itbrains.personal.repositories.BannerRepository;
import az.edu.itbrains.personal.services.BannerService;
import org.springframework.stereotype.Service;


@Service
public class BannerServiceImpl implements BannerService {

    private final BannerRepository bannerRepository;

    public BannerServiceImpl(BannerRepository bannerRepository) {
        this.bannerRepository = bannerRepository;
    }

    @Override
    public BannerHomeDto getHomeBanner() {
        Banner findBanner = bannerRepository.findById(1L).orElseThrow();
        BannerHomeDto bannerHomeDto = new BannerHomeDto();
        bannerHomeDto.setId(findBanner.getId());
        bannerHomeDto.setTitle(findBanner.getTitle());
        bannerHomeDto.setPhotoUrl(findBanner.getPhotoUrl());
        bannerHomeDto.setSubTitle(findBanner.getSubTitle());
        return bannerHomeDto;
    }
}
