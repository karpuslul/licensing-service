package com.optimagrowth.licensingservice.service;

import com.optimagrowth.licensingservice.model.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Random;

@Service
public class LicenseService {
    @Autowired
    private MessageSource messages;

    public License getLicense(String licenseId, String organizationId) {
        License license = new License();
        license.setId(new Random().nextInt(1000));
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setDescription("Software product");
        license.setProductName("Ostock");
        license.setLicenseType("full");

        return license;
    }

    public String createLicense(License license, String organizationId, Locale locale) {
        String responceMessage = null;
        if (license != null) {
            license.setOrganizationId(organizationId);
            responceMessage =
                    String.format(messages.getMessage("license.create.message", null, locale),
                    license.toString());
        }

        return responceMessage;
    }

    public String updateLicense(License license, String organizationId) {
        String responceMessage = null;
        if (license != null) {
            license.setOrganizationId(organizationId);
            responceMessage =
                    String.format(messages.getMessage("license.update.message", null, null),
                    license.toString());
        }

        return responceMessage;
    }

    public String deleteLicense(String licenseId, String organizationId) {
        String responceMessage = null;
        responceMessage = String.format("Deleting license with id %s for the organization %s",
                licenseId, organizationId);

        return responceMessage;
    }
}