package com.el.ally.invoicify.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.servlet.ModelAndView;

import com.el.ally.invoicify.api.FlatFeeBillingRecordController;
import com.el.ally.invoicify.models.Company;
import com.el.ally.invoicify.models.FlatFeeBillingRecord;
import com.el.ally.invoicify.models.User;
import com.el.ally.invoicify.repositories.BillingRecordRepository;
import com.el.ally.invoicify.repositories.CompanyRepository;

public class FlatFeeBillingRecordControllerTests {

//	@Test
//	public void test_create_uses_the_principal_and_clienId_to_save_a_record() {
//		
//		BillingRecordRepository records = mock(BillingRecordRepository.class);
//		CompanyRepository companies = mock(CompanyRepository.class);
//		Authentication auth = mock(Authentication.class);
//		FlatFeeBillingRecord record = new FlatFeeBillingRecord();
//		User user = new User();
//		Company company = new Company();
//		when(auth.getPrincipal()).thenReturn(user);
//		when(companies.findOne((int)3l)).thenReturn(company);
//		FlatFeeBillingRecordController controller = new FlatFeeBillingRecordController(records, companies);
//		
//		FlatFeeBillingRecord actual = controller.create(record,  (int)3l, auth);
//		
//		verify(auth).getPrincipal();
//		verify(companies).findOne((int)3l);
//		assertThat(record.getCompany()).isSameAs(company);
//		assertThat(record.getCreatedBy()).isSameAs(user);
//		verify(records).save(record);
//	}

}
