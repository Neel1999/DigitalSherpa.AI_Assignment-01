package com.groupc.postAndGetAPI.Repository;

import com.groupc.postAndGetAPI.Models.basicDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface basicDetailsRepository extends JpaRepository<basicDetails,Long> {
}
