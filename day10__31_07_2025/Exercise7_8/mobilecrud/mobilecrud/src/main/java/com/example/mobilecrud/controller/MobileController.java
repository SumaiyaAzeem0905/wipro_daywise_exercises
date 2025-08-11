package com.example.mobilecrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mobilecrud.entity.Mobile;
import com.example.mobilecrud.service.MobileService;

@RestController
@RequestMapping("/mobile")
public class MobileController {
	private final MobileService mobileService;

    public MobileController(MobileService mobileService) {
        this.mobileService = mobileService;
    }

    // POST - Create new Mobile
    @PostMapping
    public ResponseEntity<Mobile> createMobile(@RequestBody Mobile mobile) {
        Mobile savedMobile = mobileService.saveMobile(mobile);
        return ResponseEntity.ok(savedMobile);
    }

    // GET - All mobiles
    @GetMapping
    public List<Mobile> getAllMobiles() {
        return mobileService.getAllMobiles();
    }

    // GET - By ID
    @GetMapping("/{id}")
    public ResponseEntity<Mobile> getMobileById(@PathVariable Integer id) {
        Optional<Mobile> mobile = mobileService.getMobileById(id);
        return mobile.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // PUT - Update Mobile
    @PutMapping("/{id}")
    public ResponseEntity<Mobile> updateMobile(@PathVariable Integer id, @RequestBody Mobile mobile) {
        Mobile updatedMobile = mobileService.updateMobile(id, mobile);
        if (updatedMobile != null) {
            return ResponseEntity.ok(updatedMobile);
        }
        return ResponseEntity.notFound().build();
    }

    // DELETE - Delete Mobile
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMobile(@PathVariable Integer id) {
        mobileService.deleteMobile(id);
        return ResponseEntity.noContent().build();
    }
}
