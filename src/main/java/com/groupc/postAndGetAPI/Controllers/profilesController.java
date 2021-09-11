package com.groupc.postAndGetAPI.Controllers;

import java.util.HashMap;
import java.util.Map;


import com.groupc.postAndGetAPI.Models.bankDetails;
import com.groupc.postAndGetAPI.Models.basicDetails;
import com.groupc.postAndGetAPI.Models.kycDetails;
import com.groupc.postAndGetAPI.Repository.bankDetailsRepository;
import com.groupc.postAndGetAPI.Repository.basicDetailsRepository;
import com.groupc.postAndGetAPI.Repository.kycDetailsRepository;
import com.groupc.postAndGetAPI.exception.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
@SuppressWarnings("all")
public class profilesController {

    @Autowired
    private basicDetailsRepository basicdetailsrepo;

    @Autowired
    private bankDetailsRepository bankdetailsrepo;

    @Autowired
    private kycDetailsRepository kycdetailsrepo;

    
  



    //RestAPI For Getting basic details by Id
    @GetMapping("/getbasicdetails/{id}")
    public ResponseEntity<basicDetails> getBasicDetailsById(@PathVariable(value = "id") Long userId) 
        throws ResourceNotFoundException{

        basicDetails obj = basicdetailsrepo
                                        .findById(userId)
                                        .orElseThrow(()-> new ResourceNotFoundException("User was not found ::" + userId));

        return ResponseEntity.ok().body(obj);
    }



    //RestAPI For Getting Bank details by Id
    @GetMapping("/getbankdetails/{id}")
    public ResponseEntity<bankDetails> getBankDetailsById(@PathVariable(value = "id") Long userId) 
        throws ResourceNotFoundException{

        bankDetails obj = bankdetailsrepo
                                        .findById(userId)
                                        .orElseThrow(()-> new ResourceNotFoundException("User was not found ::" + userId));

        return ResponseEntity.ok().body(obj);
    }



    //RestAPI For Getting KYC details by Id
    @GetMapping("/getkycdetails/{id}")
    public ResponseEntity<kycDetails> getKYCDetailsById(@PathVariable(value = "id") Long userId) 
        throws ResourceNotFoundException{

        kycDetails obj = kycdetailsrepo
                                        .findById(userId)
                                        .orElseThrow(()-> new ResourceNotFoundException("User was not found ::" + userId));

        return ResponseEntity.ok().body(obj);
    }

  
    //RestAPI For Posting basic Details 
    @PostMapping("/basicdetails")
    public Map postBasicDetails(@RequestBody basicDetails bDetails){
        basicdetailsrepo.save(bDetails);
        Map response = new HashMap<>();
        response.put("success",true);
        response.put("userId",bDetails.getUserId());
        response.put("message","Basic Details Saved Successfully");
        return response;
    }


    //RestAPI For Posting bank Details 
    @PostMapping("/bankdetails")
    public Map postBankDetails(@RequestBody bankDetails bDetails){
        bankdetailsrepo.save(bDetails);
        Map response = new HashMap<>();
        response.put("success",true);
        response.put("userId",bDetails.getUserId());
        response.put("message","Bank Details Saved Successfully");
        return response;
    }
    

    //RestAPI For Posting KYC Details 
    @PostMapping("/kycdetails")
    public Map postKYCDetails(@RequestBody kycDetails bDetails){
        kycdetailsrepo.save(bDetails);
        Map response = new HashMap<>();
        response.put("success",true);
        response.put("userId",bDetails.getUserId());
        response.put("message","KYC Details Saved Successfully");
        return response;
    }
}
