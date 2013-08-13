package net.surajchhetry.springhelper.service;

import net.surajchhetry.springhelper.Company;
import net.surajchhetry.springhelper.annotation.Log;
import net.surajchhetry.springhelper.annotation.ValidateBean;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

/**
 *
 * @author suraj
 */
@Service
class CompanyMnagerImpl implements CompanyManager {

    @Log
    private Logger logger;

    @ValidateBean(bean = Company.class)
    @Override
    public void addCompany(Company company) {
        this.logger.info("Adding compnay to db");
        company.setId(20);
    }
}
