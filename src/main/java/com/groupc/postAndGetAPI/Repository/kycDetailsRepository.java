package com.groupc.postAndGetAPI.Repository;

import com.groupc.postAndGetAPI.Models.kycDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface kycDetailsRepository extends JpaRepository<kycDetails,Long>{ 
}
