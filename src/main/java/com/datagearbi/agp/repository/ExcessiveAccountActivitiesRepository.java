package com.datagearbi.agp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.ExcessiveAccountActivities;

public interface ExcessiveAccountActivitiesRepository extends JpaRepository<ExcessiveAccountActivities, Integer> {
List<ExcessiveAccountActivities> findByCdiCodeInAndAccttypedescInAndPrimMedDescInAndDateDiffLessThan(List<String> cdi_code,List<String> accttypedesc,
		List<String> primMedDesc,int numdays);
}
