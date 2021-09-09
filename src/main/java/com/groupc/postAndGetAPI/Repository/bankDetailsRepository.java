package com.groupc.postAndGetAPI.Repository;

import com.groupc.postAndGetAPI.Models.bankDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bankDetailsRepository extends JpaRepository<bankDetails,Long> {  
}
