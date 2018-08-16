package com.datagearbi.agp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.agp.repository.Routine_ParameterRepository;
import com.datagearbi.helper.Key_ValueHelper;
import com.datagearbi.model.AC_Routine_Parameter;

@RestController
@RequestMapping("aml/api/agp")
@CrossOrigin("*")
public class Routine_ParameterController {

	@Autowired
	private Routine_ParameterRepository routine_ParameterRepository;

	@RequestMapping(value = "addparam", method = RequestMethod.POST)
	public void addParam(@RequestBody AC_Routine_Parameter ac_Routine_Parameter) {
		this.routine_ParameterRepository.save(ac_Routine_Parameter);
	}

	@RequestMapping(value = "getparams", method = RequestMethod.GET)
	public List<AC_Routine_Parameter> getAllParam() {
		return this.routine_ParameterRepository.findAll();
	}

	@RequestMapping(value = "updateparam", method = RequestMethod.POST)
	public void updateParam(@RequestBody String str) {
		System.out.println("updateParam" + str);

		org.springframework.boot.json.JsonParser springParser = JsonParserFactory.getJsonParser();
		Map<String, Object> result = springParser.parseMap(str);
		System.out.println("aaaaaaaaaaasqqqqqqqqqqqqq" + result.get("m001_account_type"));

		for (String k : result.keySet()) {
			System.out.println("result.keySet:" + result.get(k));
			String value = result.get(k).toString();
			if (!value.isEmpty() && value.startsWith("[") && value.endsWith("]")) {
				value = value.substring(1, value.length() - 1);
				System.out.println("value:" + value);
			}

			this.routine_ParameterRepository.updateParameters(k, value);
		}

	}
}
