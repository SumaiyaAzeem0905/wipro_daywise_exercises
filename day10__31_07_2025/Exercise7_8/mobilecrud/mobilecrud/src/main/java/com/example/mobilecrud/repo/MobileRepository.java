package com.example.mobilecrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mobilecrud.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {
}
