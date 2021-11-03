package com.healthcare.billing.controller;

import com.healthcare.billing.controller.model.ProcedureRate;
import com.healthcare.billing.model.Procedure;
import com.healthcare.billing.service.BillingService;
import com.healthcare.billing.service.BillingServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BillingController {

    private BillingService billingService = new BillingServiceImpl();

    @RequestMapping("/procedures/{procedureId}/rates")
    public ProcedureRate getRate(@PathVariable String procedureId) {
        return billingService.getProcedureRate(procedureId);
    }

    @RequestMapping("/procedures")
    public List<Procedure> getProcedures() {
        return billingService.getAllProcedures();
    }

    @RequestMapping("/claims")
    public String getClaims() {
        return "{\"message\" : \"This API is under construction.\"}";
    }

    @RequestMapping("/claims/{claimId}")
    public String getClaim(@PathVariable String claimId) {
        return "{\"message\" : \"This API is under construction.\"}";
    }

    @RequestMapping(value = "/claims/{claimId}", method = RequestMethod.POST)
    public String createClaim(@PathVariable String claimId) {
        return "{\"message\" : \"This API is under construction.\"}";
    }

    @RequestMapping(value = "/claims/{claimId}", method = RequestMethod.PUT)
    public String updateClaim(@PathVariable String claimId) {
        return "{\"message\" : \"This API is under construction.\"}";
    }

    @RequestMapping(value = "/claims/{claimId}", method = RequestMethod.DELETE)
    public String deleteClaim(@PathVariable String claimId) {
        return "{\"message\" : \"This API is under construction.\"}";
    }


}
