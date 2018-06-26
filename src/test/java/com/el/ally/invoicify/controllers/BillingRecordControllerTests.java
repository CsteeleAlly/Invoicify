package com.el.ally.invoicify.controllers;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.springframework.web.servlet.ModelAndView;

import com.el.ally.invoicify.api.BillingRecordController;
import com.el.ally.invoicify.models.BillingRecord;
import com.el.ally.invoicify.repositories.BillingRecordRepository;
import com.el.ally.invoicify.repositories.CompanyRepository;

public class BillingRecordControllerTests {
	
	private BillingRecordController controller;
	private BillingRecordRepository recordRepository;
	private CompanyRepository companyRepository;
	
	@Before
	public void setup() {
		companyRepository = mock(CompanyRepository.class);
		recordRepository = mock(BillingRecordRepository.class);
		controller = new BillingRecordController(recordRepository, companyRepository);
	}

	@Test
	public void test_list() {
		List<BillingRecord> records = new ArrayList<BillingRecord>();
		when(recordRepository.findAll()).thenReturn(records);
		
		List<BillingRecord> actual = controller.list();
		
		verify(recordRepository).findAll();
		assertThat(actual).isSameAs(records);
	}
	
}
