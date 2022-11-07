package com.optimagrowth.licensingservice.service;

import com.optimagrowth.licensingservice.model.License;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LicenseServiceTest {
    private LicenseService licenseService;

    @BeforeEach
    void setUp() {
        licenseService = new LicenseService();
    }

   /* @Test
    void testGetLicense() {
        String licenseId = "123";
        String organizationId = "999";
        License license = licenseService.getLicense(licenseId, organizationId);

        assertNotNull(license);
        assertTrue(license.getId() <= 1000);
        assertEquals(licenseId, license.getLicenseId());
        assertEquals(organizationId, license.getOrganizationId());
        assertEquals("Software product", license.getDescription());
        assertEquals("Ostock", license.getProductName());
        assertEquals("full", license.getLicenseType());
    }

    @Test
    void testCreateLicenseWhenLicenseIsNullAndOrganizationIdIsNull() {
        String responceMessage = licenseService.createLicense(null, null);
        assertNull(responceMessage);
    }

    @Test
    void testCreateLicenseWhenLicenseIsNullAndOrganizationIdIsEmpty() {
        String responceMessage = licenseService.createLicense(null, "");
        assertNull(responceMessage);
    }

    @Test
    void testCreateLicenseWhenLicenseIsNullAndOrganizationIdIsNotEmpty() {
        String responceMessage = licenseService.createLicense(null, "999");
        assertNull(responceMessage);
    }

    @Test
    void testCreateLicenseWhenLicenseIsNotNullAndOrganizationIdIsNull() {
        License license = createLicense("123", "999");
        String responceMessage = licenseService.createLicense(license, null);
        assertNotNull(responceMessage);
        assertEquals(String.format("This is the post and the object is: License(id=%s, licenseId=123, " +
                "description=Software product, organizationId=null, productName=Ostock, " +
                "licenseType=full)", license.getId()), responceMessage);
    }

    @Test
    void testCreateLicenseWhenLicenseIsNotNullAndOrganizationIdIsEmpty() {
        License license = createLicense("123", "999");
        String responceMessage = licenseService.createLicense(license, "");
        assertNotNull(responceMessage);
        assertEquals(String.format("This is the post and the object is: License(id=%s, licenseId=123, " +
                "description=Software product, organizationId=, productName=Ostock, " +
                "licenseType=full)", license.getId()), responceMessage);
    }

    @Test
    void testCreateLicenseWhenLicenseIsNotNullAndOrganizationIdIsNotEmpty() {
        String organizationId = "999";
        License license = createLicense("123", organizationId);
        String responceMessage = licenseService.createLicense(license, organizationId);
        assertNotNull(responceMessage);
        assertEquals(String.format("This is the post and the object is: License(id=%s, licenseId=123, " +
                "description=Software product, organizationId=%s, productName=Ostock, " +
                "licenseType=full)", license.getId(), organizationId), responceMessage);
    }

    @Test
    void testUpdateLicense() {
    }

    @Test
    void testDeleteLicense() {
    }

    private License createLicense(String licenseId, String organizationId) {
        License license = new License();
        license.setId(new Random().nextInt(1000));
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setDescription("Software product");
        license.setProductName("Ostock");
        license.setLicenseType("full");

        return license;
    }*/
}