package com.example.mobilecrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mobilecrud.entity.Mobile;
import com.example.mobilecrud.repo.MobileRepository;

@Service
public class MobileService {
	private final MobileRepository mobileRepository;

    public MobileService(MobileRepository mobileRepository) {
        this.mobileRepository = mobileRepository;
    }

    public Mobile saveMobile(Mobile mobile) {
        return mobileRepository.save(mobile);
    }

    public List<Mobile> getAllMobiles() {
        return mobileRepository.findAll();
    }

    public Optional<Mobile> getMobileById(Integer id) {
        return mobileRepository.findById(id);
    }

    public Mobile updateMobile(Integer id, Mobile newMobile) {
        return mobileRepository.findById(id)
                .map(m -> {
                    m.setMake(newMobile.getMake());
                    m.setModelNumber(newMobile.getModelNumber());
                    m.setPrice(newMobile.getPrice());
                    return mobileRepository.save(m);
                }).orElse(null);
    }

    public void deleteMobile(Integer id) {
        mobileRepository.deleteById(id);
    }
}
