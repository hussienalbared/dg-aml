package com.datagearbi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.datagearbi.controller.SuspectedController;
import com.datagearbi.model.AcSuspectedObj;
import com.datagearbi.repository.SuspectedObjectRepository;

public class SuspectedControllerTest {
	@InjectMocks
	SuspectedController sc;

	@Mock
	SuspectedObjectRepository suspectedObjectRepository;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testSuspectedGet() {

//		AcSuspectedObj obj = new AcSuspectedObj();
//		SuspectedObjectId id = new SuspectedObjectId(1, "A");
//		obj.setCustomerId(id);
//		obj.setObj_number("001");
//		when(suspectedObjectRepository.getOne(id)).thenReturn(obj);
//
//		SuspectedObject so = sc.get(1, "A");
//		assertEquals(so.getObj_number(), 001);

	}
}
